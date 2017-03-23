package butterknife.internal;

import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class ViewInjector {
    private final String className;
    private final String classPackage;
    private final Map<CollectionBinding, int[]> collectionBindings = new LinkedHashMap();
    private String parentInjector;
    private final String targetClass;
    private final Map<Integer, ViewInjection> viewIdMap = new LinkedHashMap();

    ViewInjector(String str, String str2, String str3) {
        this.classPackage = str;
        this.className = str2;
        this.targetClass = str3;
    }

    void addView(int i, ViewBinding viewBinding) {
        getOrCreateViewInjection(i).addViewBinding(viewBinding);
    }

    boolean addListener(int i, ListenerClass listenerClass, ListenerMethod listenerMethod, ListenerBinding listenerBinding) {
        ViewInjection orCreateViewInjection = getOrCreateViewInjection(i);
        if (orCreateViewInjection.hasListenerBinding(listenerClass, listenerMethod) && !"void".equals(listenerMethod.returnType())) {
            return false;
        }
        orCreateViewInjection.addListenerBinding(listenerClass, listenerMethod, listenerBinding);
        return true;
    }

    void addCollection(int[] iArr, CollectionBinding collectionBinding) {
        this.collectionBindings.put(collectionBinding, iArr);
    }

    void setParentInjector(String str) {
        this.parentInjector = str;
    }

    ViewInjection getViewInjection(int i) {
        return (ViewInjection) this.viewIdMap.get(Integer.valueOf(i));
    }

    private ViewInjection getOrCreateViewInjection(int i) {
        ViewInjection viewInjection = (ViewInjection) this.viewIdMap.get(Integer.valueOf(i));
        if (viewInjection != null) {
            return viewInjection;
        }
        viewInjection = new ViewInjection(i);
        this.viewIdMap.put(Integer.valueOf(i), viewInjection);
        return viewInjection;
    }

    String getFqcn() {
        return this.classPackage + "." + this.className;
    }

    String brewJava() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("// Generated code from Butter Knife. Do not modify!\n");
        stringBuilder.append("package ").append(this.classPackage).append(";\n\n");
        stringBuilder.append("import android.view.View;\n");
        stringBuilder.append("import butterknife.ButterKnife.Finder;\n");
        if (this.parentInjector == null) {
            stringBuilder.append("import butterknife.ButterKnife.Injector;\n");
        }
        stringBuilder.append('\n');
        stringBuilder.append("public class ").append(this.className);
        stringBuilder.append("<T extends ").append(this.targetClass).append(">");
        if (this.parentInjector != null) {
            stringBuilder.append(" extends ").append(this.parentInjector).append("<T>");
        } else {
            stringBuilder.append(" implements Injector<T>");
        }
        stringBuilder.append(" {\n");
        emitInject(stringBuilder);
        stringBuilder.append('\n');
        emitReset(stringBuilder);
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }

    private void emitInject(StringBuilder stringBuilder) {
        stringBuilder.append("  @Override ").append("public void inject(final Finder finder, final T target, Object source) {\n");
        if (this.parentInjector != null) {
            stringBuilder.append("    super.inject(finder, target, source);\n\n");
        }
        stringBuilder.append("    View view;\n");
        for (ViewInjection emitViewInjection : this.viewIdMap.values()) {
            emitViewInjection(stringBuilder, emitViewInjection);
        }
        for (Entry entry : this.collectionBindings.entrySet()) {
            emitCollectionBinding(stringBuilder, (CollectionBinding) entry.getKey(), (int[]) entry.getValue());
        }
        stringBuilder.append("  }\n");
    }

    private void emitCollectionBinding(StringBuilder stringBuilder, CollectionBinding collectionBinding, int[] iArr) {
        stringBuilder.append("    target.").append(collectionBinding.getName()).append(" = ");
        switch (collectionBinding.getKind()) {
            case ARRAY:
                stringBuilder.append("Finder.arrayOf(");
                break;
            case LIST:
                stringBuilder.append("Finder.listOf(");
                break;
            default:
                throw new IllegalStateException("Unknown kind: " + collectionBinding.getKind());
        }
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append("\n        finder.<").append(collectionBinding.getType()).append(">").append(collectionBinding.isRequired() ? "findRequiredView" : "findOptionalView").append("(source, ").append(iArr[i]).append(", \"");
            emitHumanDescription(stringBuilder, Collections.singleton(collectionBinding));
            stringBuilder.append("\")");
        }
        stringBuilder.append("\n    );\n");
    }

    private void emitViewInjection(StringBuilder stringBuilder, ViewInjection viewInjection) {
        stringBuilder.append("    view = ");
        Collection requiredBindings = viewInjection.getRequiredBindings();
        if (requiredBindings.isEmpty()) {
            stringBuilder.append("finder.findOptionalView(source, ").append(viewInjection.getId()).append(", null);\n");
        } else if (viewInjection.getId() == -1) {
            stringBuilder.append("target;\n");
        } else {
            stringBuilder.append("finder.findRequiredView(source, ").append(viewInjection.getId()).append(", \"");
            emitHumanDescription(stringBuilder, requiredBindings);
            stringBuilder.append("\");\n");
        }
        emitViewBindings(stringBuilder, viewInjection);
        emitListenerBindings(stringBuilder, viewInjection);
    }

    private void emitViewBindings(StringBuilder stringBuilder, ViewInjection viewInjection) {
        Collection<ViewBinding> viewBindings = viewInjection.getViewBindings();
        if (!viewBindings.isEmpty()) {
            for (ViewBinding viewBinding : viewBindings) {
                stringBuilder.append("    target.").append(viewBinding.getName()).append(" = ");
                if (viewBinding.requiresCast()) {
                    stringBuilder.append("finder.castView(view").append(", ").append(viewInjection.getId()).append(", \"");
                    emitHumanDescription(stringBuilder, viewBindings);
                    stringBuilder.append("\");\n");
                } else {
                    stringBuilder.append("view;\n");
                }
            }
        }
    }

    private void emitListenerBindings(StringBuilder stringBuilder, ViewInjection viewInjection) {
        Map listenerBindings = viewInjection.getListenerBindings();
        if (!listenerBindings.isEmpty()) {
            String str;
            String str2 = "";
            boolean isEmpty = viewInjection.getRequiredBindings().isEmpty();
            if (isEmpty) {
                stringBuilder.append("    if (view != null) {\n");
                str = "  ";
            } else {
                str = str2;
            }
            for (Entry entry : listenerBindings.entrySet()) {
                ListenerClass listenerClass = (ListenerClass) entry.getKey();
                Map map = (Map) entry.getValue();
                Object obj = !"android.view.View".equals(listenerClass.targetType()) ? 1 : null;
                stringBuilder.append(str).append("    ");
                if (obj != null) {
                    stringBuilder.append("((").append(listenerClass.targetType());
                    if (listenerClass.genericArguments() > 0) {
                        stringBuilder.append('<');
                        for (int i = 0; i < listenerClass.genericArguments(); i++) {
                            if (i > 0) {
                                stringBuilder.append(", ");
                            }
                            stringBuilder.append('?');
                        }
                        stringBuilder.append('>');
                    }
                    stringBuilder.append(") ");
                }
                stringBuilder.append(Promotion.ACTION_VIEW);
                if (obj != null) {
                    stringBuilder.append(')');
                }
                stringBuilder.append('.').append(listenerClass.setter()).append("(\n");
                stringBuilder.append(str).append("      new ").append(listenerClass.type()).append("() {\n");
                for (ListenerMethod listenerMethod : getListenerMethods(listenerClass)) {
                    stringBuilder.append(str).append("        @Override public ").append(listenerMethod.returnType()).append(' ').append(listenerMethod.name()).append("(\n");
                    String[] parameters = listenerMethod.parameters();
                    int length = parameters.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        stringBuilder.append(str).append("          ").append(parameters[i2]).append(" p").append(i2);
                        if (i2 < length - 1) {
                            stringBuilder.append(',');
                        }
                        stringBuilder.append('\n');
                    }
                    stringBuilder.append(str).append("        ) {\n");
                    stringBuilder.append(str).append("          ");
                    obj = !"void".equals(listenerMethod.returnType()) ? 1 : null;
                    if (obj != null) {
                        stringBuilder.append("return ");
                    }
                    if (map.containsKey(listenerMethod)) {
                        Iterator it = ((Set) map.get(listenerMethod)).iterator();
                        while (it.hasNext()) {
                            ListenerBinding listenerBinding = (ListenerBinding) it.next();
                            stringBuilder.append("target.").append(listenerBinding.getName()).append('(');
                            List parameters2 = listenerBinding.getParameters();
                            String[] parameters3 = listenerMethod.parameters();
                            int size = parameters2.size();
                            for (length = 0; length < size; length++) {
                                Parameter parameter = (Parameter) parameters2.get(length);
                                int listenerPosition = parameter.getListenerPosition();
                                if (parameter.requiresCast(parameters3[listenerPosition])) {
                                    stringBuilder.append("finder.<").append(parameter.getType()).append(">castParam(p").append(listenerPosition).append(", \"").append(listenerMethod.name()).append("\", ").append(listenerPosition).append(", \"").append(listenerBinding.getName()).append("\", ").append(length).append(")");
                                } else {
                                    stringBuilder.append('p').append(listenerPosition);
                                }
                                if (length < size - 1) {
                                    stringBuilder.append(", ");
                                }
                            }
                            stringBuilder.append(");");
                            if (it.hasNext()) {
                                stringBuilder.append("\n").append("          ");
                            }
                        }
                    } else if (obj != null) {
                        stringBuilder.append(listenerMethod.defaultReturn()).append(';');
                    }
                    stringBuilder.append('\n');
                    stringBuilder.append(str).append("        }\n");
                }
                stringBuilder.append(str).append("      });\n");
            }
            if (isEmpty) {
                stringBuilder.append("    }\n");
            }
        }
    }

    static List<ListenerMethod> getListenerMethods(ListenerClass listenerClass) {
        if (listenerClass.method().length == 1) {
            return Arrays.asList(listenerClass.method());
        }
        try {
            List<ListenerMethod> arrayList = new ArrayList();
            Class callbacks = listenerClass.callbacks();
            for (Enum name : (Enum[]) callbacks.getEnumConstants()) {
                ListenerMethod listenerMethod = (ListenerMethod) callbacks.getField(name.name()).getAnnotation(ListenerMethod.class);
                if (listenerMethod == null) {
                    throw new IllegalStateException(String.format("@%s's %s.%s missing @%s annotation.", new Object[]{callbacks.getEnclosingClass().getSimpleName(), callbacks.getSimpleName(), name.name(), ListenerMethod.class.getSimpleName()}));
                }
                arrayList.add(listenerMethod);
            }
            return arrayList;
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    private void emitReset(StringBuilder stringBuilder) {
        stringBuilder.append("  @Override public void reset(T target) {\n");
        if (this.parentInjector != null) {
            stringBuilder.append("    super.reset(target);\n\n");
        }
        for (ViewInjection viewBindings : this.viewIdMap.values()) {
            for (ViewBinding name : viewBindings.getViewBindings()) {
                stringBuilder.append("    target.").append(name.getName()).append(" = null;\n");
            }
        }
        for (CollectionBinding name2 : this.collectionBindings.keySet()) {
            stringBuilder.append("    target.").append(name2.getName()).append(" = null;\n");
        }
        stringBuilder.append("  }\n");
    }

    static void emitHumanDescription(StringBuilder stringBuilder, Collection<? extends Binding> collection) {
        Iterator it = collection.iterator();
        switch (collection.size()) {
            case 1:
                stringBuilder.append(((Binding) it.next()).getDescription());
                return;
            case 2:
                stringBuilder.append(((Binding) it.next()).getDescription()).append(" and ").append(((Binding) it.next()).getDescription());
                return;
            default:
                int size = collection.size();
                for (int i = 0; i < size; i++) {
                    if (i != 0) {
                        stringBuilder.append(", ");
                    }
                    if (i == size - 1) {
                        stringBuilder.append("and ");
                    }
                    stringBuilder.append(((Binding) it.next()).getDescription());
                }
                return;
        }
    }
}
