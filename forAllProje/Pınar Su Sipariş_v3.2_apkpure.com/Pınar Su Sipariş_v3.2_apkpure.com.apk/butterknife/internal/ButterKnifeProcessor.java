package butterknife.internal;

import butterknife.InjectView;
import butterknife.InjectViews;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import butterknife.OnEditorAction;
import butterknife.OnFocusChange;
import butterknife.OnItemClick;
import butterknife.OnItemLongClick;
import butterknife.OnItemSelected;
import butterknife.OnLongClick;
import butterknife.OnPageChange;
import butterknife.OnTextChanged;
import butterknife.OnTouch;
import butterknife.Optional;
import butterknife.internal.ListenerClass.NONE;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.TypeVariable;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.tools.Diagnostic.Kind;

public final class ButterKnifeProcessor extends AbstractProcessor {
    static final /* synthetic */ boolean $assertionsDisabled = (!ButterKnifeProcessor.class.desiredAssertionStatus());
    public static final String ANDROID_PREFIX = "android.";
    public static final String JAVA_PREFIX = "java.";
    private static final List<Class<? extends Annotation>> LISTENERS = Arrays.asList(new Class[]{OnCheckedChanged.class, OnClick.class, OnEditorAction.class, OnFocusChange.class, OnItemClick.class, OnItemLongClick.class, OnItemSelected.class, OnLongClick.class, OnPageChange.class, OnTextChanged.class, OnTouch.class});
    private static final String LIST_TYPE = List.class.getCanonicalName();
    public static final String SUFFIX = "$$ViewInjector";
    static final String VIEW_TYPE = "android.view.View";
    private Elements elementUtils;
    private Filer filer;
    private Types typeUtils;

    public synchronized void init(ProcessingEnvironment processingEnvironment) {
        super.init(processingEnvironment);
        this.elementUtils = processingEnvironment.getElementUtils();
        this.typeUtils = processingEnvironment.getTypeUtils();
        this.filer = processingEnvironment.getFiler();
    }

    public Set<String> getSupportedAnnotationTypes() {
        Set<String> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(InjectView.class.getCanonicalName());
        linkedHashSet.add(InjectViews.class.getCanonicalName());
        for (Class canonicalName : LISTENERS) {
            linkedHashSet.add(canonicalName.getCanonicalName());
        }
        return linkedHashSet;
    }

    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        for (Entry entry : findAndParseTargets(roundEnvironment).entrySet()) {
            TypeElement typeElement = (TypeElement) entry.getKey();
            ViewInjector viewInjector = (ViewInjector) entry.getValue();
            try {
                Writer openWriter = this.filer.createSourceFile(viewInjector.getFqcn(), new Element[]{typeElement}).openWriter();
                openWriter.write(viewInjector.brewJava());
                openWriter.flush();
                openWriter.close();
            } catch (IOException e) {
                error(typeElement, "Unable to write injector for type %s: %s", typeElement, e.getMessage());
            }
        }
        return true;
    }

    private Map<TypeElement, ViewInjector> findAndParseTargets(RoundEnvironment roundEnvironment) {
        Map<TypeElement, ViewInjector> linkedHashMap = new LinkedHashMap();
        Set linkedHashSet = new LinkedHashSet();
        for (Element element : roundEnvironment.getElementsAnnotatedWith(InjectView.class)) {
            try {
                parseInjectView(element, linkedHashMap, linkedHashSet);
            } catch (Exception e) {
                e.printStackTrace(new PrintWriter(new StringWriter()));
                error(element, "Unable to generate view injector for @InjectView.\n\n%s", r5);
            }
        }
        for (Element element2 : roundEnvironment.getElementsAnnotatedWith(InjectViews.class)) {
            try {
                parseInjectViews(element2, linkedHashMap, linkedHashSet);
            } catch (Exception e2) {
                e2.printStackTrace(new PrintWriter(new StringWriter()));
                error(element2, "Unable to generate view injector for @InjectViews.\n\n%s", r5);
            }
        }
        for (Class findAndParseListener : LISTENERS) {
            findAndParseListener(roundEnvironment, findAndParseListener, linkedHashMap, linkedHashSet);
        }
        for (Entry entry : linkedHashMap.entrySet()) {
            String findParentFqcn = findParentFqcn((TypeElement) entry.getKey(), linkedHashSet);
            if (findParentFqcn != null) {
                ((ViewInjector) entry.getValue()).setParentInjector(findParentFqcn + SUFFIX);
            }
        }
        return linkedHashMap;
    }

    private boolean isInaccessibleViaGeneratedCode(Class<? extends Annotation> cls, String str, Element element) {
        boolean z;
        TypeElement typeElement = (TypeElement) element.getEnclosingElement();
        Set modifiers = element.getModifiers();
        if (modifiers.contains(Modifier.PRIVATE) || modifiers.contains(Modifier.STATIC)) {
            error(element, "@%s %s must not be private or static. (%s.%s)", cls.getSimpleName(), str, typeElement.getQualifiedName(), element.getSimpleName());
            z = true;
        } else {
            z = false;
        }
        if (typeElement.getKind() != ElementKind.CLASS) {
            error(typeElement, "@%s %s may only be contained in classes. (%s.%s)", cls.getSimpleName(), str, typeElement.getQualifiedName(), element.getSimpleName());
            z = true;
        }
        if (!typeElement.getModifiers().contains(Modifier.PRIVATE)) {
            return z;
        }
        error(typeElement, "@%s %s may not be contained in private classes. (%s.%s)", cls.getSimpleName(), str, typeElement.getQualifiedName(), element.getSimpleName());
        return true;
    }

    private boolean isBindingInWrongPackage(Class<? extends Annotation> cls, Element element) {
        String obj = ((TypeElement) element.getEnclosingElement()).getQualifiedName().toString();
        if (obj.startsWith(ANDROID_PREFIX)) {
            error(element, "@%s-annotated class incorrectly in Android framework package. (%s)", cls.getSimpleName(), obj);
            return true;
        } else if (!obj.startsWith(JAVA_PREFIX)) {
            return false;
        } else {
            error(element, "@%s-annotated class incorrectly in Java framework package. (%s)", cls.getSimpleName(), obj);
            return true;
        }
    }

    private void parseInjectView(Element element, Map<TypeElement, ViewInjector> map, Set<String> set) {
        TypeMirror upperBound;
        int i;
        boolean z = true;
        TypeElement typeElement = (TypeElement) element.getEnclosingElement();
        TypeMirror asType = element.asType();
        if (asType instanceof TypeVariable) {
            upperBound = ((TypeVariable) asType).getUpperBound();
        } else {
            upperBound = asType;
        }
        if (isSubtypeOfType(upperBound, VIEW_TYPE) || isInterface(upperBound)) {
            i = 0;
        } else {
            error(element, "@InjectView fields must extend from View or be an interface. (%s.%s)", typeElement.getQualifiedName(), element.getSimpleName());
            i = 1;
        }
        i = (i | isInaccessibleViaGeneratedCode(InjectView.class, "fields", element)) | isBindingInWrongPackage(InjectView.class, element);
        if (element.getAnnotation(InjectViews.class) != null) {
            error(element, "Only one of @InjectView and @InjectViews is allowed. (%s.%s)", typeElement.getQualifiedName(), element.getSimpleName());
            i = 1;
        }
        if (i == 0) {
            int value = ((InjectView) element.getAnnotation(InjectView.class)).value();
            ViewInjector viewInjector = (ViewInjector) map.get(typeElement);
            if (viewInjector != null) {
                ViewInjection viewInjection = viewInjector.getViewInjection(value);
                if (viewInjection != null) {
                    Iterator it = viewInjection.getViewBindings().iterator();
                    if (it.hasNext()) {
                        ViewBinding viewBinding = (ViewBinding) it.next();
                        error(element, "Attempt to use @InjectView for an already injected ID %d on '%s'. (%s.%s)", Integer.valueOf(value), viewBinding.getName(), typeElement.getQualifiedName(), element.getSimpleName());
                        return;
                    }
                }
            }
            String obj = element.getSimpleName().toString();
            String typeMirror = upperBound.toString();
            if (element.getAnnotation(Optional.class) != null) {
                z = false;
            }
            getOrCreateTargetClass(map, typeElement).addView(value, new ViewBinding(obj, typeMirror, z));
            set.add(typeElement.toString());
        }
    }

    private void parseInjectViews(Element element, Map<TypeElement, ViewInjector> map, Set<String> set) {
        int i;
        TypeMirror upperBound;
        Kind kind = null;
        boolean z = true;
        TypeElement typeElement = (TypeElement) element.getEnclosingElement();
        TypeMirror asType = element.asType();
        String doubleErasure = doubleErasure(asType);
        if (asType.getKind() == TypeKind.ARRAY) {
            asType = ((ArrayType) asType).getComponentType();
            kind = Kind.ARRAY;
            i = 0;
        } else if (LIST_TYPE.equals(doubleErasure)) {
            boolean z2;
            List typeArguments = ((DeclaredType) asType).getTypeArguments();
            if (typeArguments.size() != 1) {
                error(element, "@InjectViews List must have a generic component. (%s.%s)", typeElement.getQualifiedName(), element.getSimpleName());
                asType = null;
                z2 = true;
            } else {
                asType = (TypeMirror) typeArguments.get(0);
                z2 = false;
            }
            boolean z3 = z2;
            kind = Kind.LIST;
        } else {
            error(element, "@InjectViews must be a List or array. (%s.%s)", typeElement.getQualifiedName(), element.getSimpleName());
            asType = null;
            i = 1;
        }
        if (asType instanceof TypeVariable) {
            upperBound = ((TypeVariable) asType).getUpperBound();
        } else {
            upperBound = asType;
        }
        if (!(upperBound == null || isSubtypeOfType(upperBound, VIEW_TYPE) || isInterface(upperBound))) {
            error(element, "@InjectViews type must extend from View or be an interface. (%s.%s)", typeElement.getQualifiedName(), element.getSimpleName());
            i = 1;
        }
        if (((isInaccessibleViaGeneratedCode(InjectViews.class, "fields", element) | i) | isBindingInWrongPackage(InjectViews.class, element)) == 0) {
            doubleErasure = element.getSimpleName().toString();
            int[] value = ((InjectViews) element.getAnnotation(InjectViews.class)).value();
            if (value.length == 0) {
                error(element, "@InjectViews must specify at least one ID. (%s.%s)", typeElement.getQualifiedName(), element.getSimpleName());
                return;
            }
            if (findDuplicate(value) != null) {
                error(element, "@InjectViews annotation contains duplicate ID %d. (%s.%s)", findDuplicate(value), typeElement.getQualifiedName(), element.getSimpleName());
            }
            if ($assertionsDisabled || upperBound != null) {
                String typeMirror = upperBound.toString();
                if (element.getAnnotation(Optional.class) != null) {
                    z = false;
                }
                getOrCreateTargetClass(map, typeElement).addCollection(value, new CollectionBinding(doubleErasure, typeMirror, kind, z));
                set.add(typeElement.toString());
                return;
            }
            throw new AssertionError();
        }
    }

    private static Integer findDuplicate(int[] iArr) {
        Set linkedHashSet = new LinkedHashSet();
        for (int i : iArr) {
            if (!linkedHashSet.add(Integer.valueOf(i))) {
                return Integer.valueOf(i);
            }
        }
        return null;
    }

    private String doubleErasure(TypeMirror typeMirror) {
        String typeMirror2 = this.typeUtils.erasure(typeMirror).toString();
        int indexOf = typeMirror2.indexOf(60);
        if (indexOf != -1) {
            return typeMirror2.substring(0, indexOf);
        }
        return typeMirror2;
    }

    private void findAndParseListener(RoundEnvironment roundEnvironment, Class<? extends Annotation> cls, Map<TypeElement, ViewInjector> map, Set<String> set) {
        for (Element element : roundEnvironment.getElementsAnnotatedWith(cls)) {
            try {
                parseListenerAnnotation(cls, element, map, set);
            } catch (Exception e) {
                e.printStackTrace(new PrintWriter(new StringWriter()));
                error(element, "Unable to generate view injector for @%s.\n\n%s", cls.getSimpleName(), r3.toString());
            }
        }
    }

    private void parseListenerAnnotation(Class<? extends Annotation> cls, Element element, Map<TypeElement, ViewInjector> map, Set<String> set) throws Exception {
        if ((element instanceof ExecutableElement) && element.getKind() == ElementKind.METHOD) {
            ExecutableElement executableElement = (ExecutableElement) element;
            TypeElement typeElement = (TypeElement) element.getEnclosingElement();
            Annotation annotation = element.getAnnotation(cls);
            Method declaredMethod = cls.getDeclaredMethod(Param.VALUE, new Class[0]);
            if (declaredMethod.getReturnType() != int[].class) {
                throw new IllegalStateException(String.format("@%s annotation value() type not int[].", new Object[]{cls}));
            }
            boolean z;
            int i;
            int[] iArr = (int[]) declaredMethod.invoke(annotation, new Object[0]);
            String obj = executableElement.getSimpleName().toString();
            if (element.getAnnotation(Optional.class) == null) {
                z = true;
            } else {
                z = false;
            }
            int isInaccessibleViaGeneratedCode = isInaccessibleViaGeneratedCode(cls, "methods", element) | isBindingInWrongPackage(cls, element);
            if (findDuplicate(iArr) != null) {
                error(element, "@%s annotation for method contains duplicate ID %d. (%s.%s)", cls.getSimpleName(), findDuplicate(iArr), typeElement.getQualifiedName(), element.getSimpleName());
                i = 1;
            } else {
                i = isInaccessibleViaGeneratedCode;
            }
            ListenerClass listenerClass = (ListenerClass) cls.getAnnotation(ListenerClass.class);
            if (listenerClass == null) {
                throw new IllegalStateException(String.format("No @%s defined on @%s.", new Object[]{ListenerClass.class.getSimpleName(), cls.getSimpleName()}));
            }
            int length = iArr.length;
            int i2 = 0;
            int i3 = i;
            while (i2 < length) {
                if (iArr[i2] != -1) {
                    i = i3;
                } else if (iArr.length == 1) {
                    if (z) {
                        i = i3;
                    } else {
                        error(element, "ID free injection must not be annotated with @Optional. (%s.%s)", typeElement.getQualifiedName(), element.getSimpleName());
                        i = 1;
                    }
                    if (!(isSubtypeOfType(typeElement.asType(), listenerClass.targetType()) || isInterface(typeElement.asType()))) {
                        error(element, "@%s annotation without an ID may only be used with an object of type \"%s\" or an interface. (%s.%s)", cls.getSimpleName(), r10, typeElement.getQualifiedName(), element.getSimpleName());
                        i = 1;
                    }
                } else {
                    error(element, "@%s annotation contains invalid ID %d. (%s.%s)", cls.getSimpleName(), Integer.valueOf(i), typeElement.getQualifiedName(), element.getSimpleName());
                    i = 1;
                }
                i2++;
                i3 = i;
            }
            ListenerMethod[] method = listenerClass.method();
            if (method.length > 1) {
                throw new IllegalStateException(String.format("Multiple listener methods specified on @%s.", new Object[]{cls.getSimpleName()}));
            }
            ListenerMethod listenerMethod;
            if (method.length != 1) {
                Enum enumR = (Enum) cls.getDeclaredMethod("callback", new Class[0]).invoke(annotation, new Object[0]);
                listenerMethod = (ListenerMethod) enumR.getDeclaringClass().getField(enumR.name()).getAnnotation(ListenerMethod.class);
                if (listenerMethod == null) {
                    throw new IllegalStateException(String.format("No @%s defined on @%s's %s.%s.", new Object[]{ListenerMethod.class.getSimpleName(), cls.getSimpleName(), enumR.getDeclaringClass().getSimpleName(), enumR.name()}));
                }
            } else if (listenerClass.callbacks() != NONE.class) {
                throw new IllegalStateException(String.format("Both method() and callback() defined on @%s.", new Object[]{cls.getSimpleName()}));
            } else {
                listenerMethod = method[0];
            }
            List parameters = executableElement.getParameters();
            if (parameters.size() > listenerMethod.parameters().length) {
                error(element, "@%s methods can have at most %s parameter(s). (%s.%s)", cls.getSimpleName(), Integer.valueOf(listenerMethod.parameters().length), typeElement.getQualifiedName(), element.getSimpleName());
                i3 = 1;
            }
            TypeMirror returnType = executableElement.getReturnType();
            if (returnType instanceof TypeVariable) {
                returnType = ((TypeVariable) returnType).getUpperBound();
            }
            if (!returnType.toString().equals(listenerMethod.returnType())) {
                error(element, "@%s methods must have a '%s' return type. (%s.%s)", cls.getSimpleName(), listenerMethod.returnType(), typeElement.getQualifiedName(), element.getSimpleName());
                i3 = 1;
            }
            if (i3 == 0) {
                Object[] objArr;
                Parameter[] parameterArr = Parameter.NONE;
                if (parameters.isEmpty()) {
                    Parameter[] parameterArr2 = parameterArr;
                } else {
                    Parameter[] parameterArr3 = new Parameter[parameters.size()];
                    BitSet bitSet = new BitSet(parameters.size());
                    String[] parameters2 = listenerMethod.parameters();
                    for (i3 = 0; i3 < parameters.size(); i3++) {
                        returnType = ((VariableElement) parameters.get(i3)).asType();
                        if (returnType instanceof TypeVariable) {
                            returnType = ((TypeVariable) returnType).getUpperBound();
                        }
                        int i4 = 0;
                        while (i4 < parameters2.length) {
                            if (!bitSet.get(i4) && (isSubtypeOfType(returnType, parameters2[i4]) || isInterface(returnType))) {
                                parameterArr3[i3] = new Parameter(i4, returnType.toString());
                                bitSet.set(i4);
                                break;
                            }
                            i4++;
                        }
                        if (parameterArr3[i3] == null) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Unable to match @").append(cls.getSimpleName()).append(" method arguments. (").append(typeElement.getQualifiedName()).append('.').append(element.getSimpleName()).append(')');
                            for (int i5 = 0; i5 < parameterArr3.length; i5++) {
                                Parameter parameter = parameterArr3[i5];
                                stringBuilder.append("\n\n  Parameter #").append(i5 + 1).append(": ").append(((VariableElement) parameters.get(i5)).asType().toString()).append("\n    ");
                                if (parameter == null) {
                                    stringBuilder.append("did not match any listener parameters");
                                } else {
                                    stringBuilder.append("matched listener parameter #").append(parameter.getListenerPosition() + 1).append(": ").append(parameter.getType());
                                }
                            }
                            stringBuilder.append("\n\nMethods may have up to ").append(listenerMethod.parameters().length).append(" parameter(s):\n");
                            for (String append : listenerMethod.parameters()) {
                                stringBuilder.append("\n  ").append(append);
                            }
                            stringBuilder.append("\n\nThese may be listed in any order but will be searched for from top to bottom.");
                            error(executableElement, stringBuilder.toString(), new Object[0]);
                            return;
                        }
                    }
                    objArr = parameterArr3;
                }
                ListenerBinding listenerBinding = new ListenerBinding(obj, Arrays.asList(objArr), z);
                ViewInjector orCreateTargetClass = getOrCreateTargetClass(map, typeElement);
                i3 = iArr.length;
                int i6 = 0;
                while (i6 < i3) {
                    if (orCreateTargetClass.addListener(iArr[i6], listenerClass, listenerMethod, listenerBinding)) {
                        i6++;
                    } else {
                        error(element, "Multiple listener methods with return value specified for ID %d. (%s.%s)", Integer.valueOf(iArr[i6]), typeElement.getQualifiedName(), element.getSimpleName());
                        return;
                    }
                }
                set.add(typeElement.toString());
                return;
            }
            return;
        }
        throw new IllegalStateException(String.format("@%s annotation must be on a method.", new Object[]{cls.getSimpleName()}));
    }

    private boolean isInterface(TypeMirror typeMirror) {
        if ((typeMirror instanceof DeclaredType) && ((DeclaredType) typeMirror).asElement().getKind() == ElementKind.INTERFACE) {
            return true;
        }
        return false;
    }

    private boolean isSubtypeOfType(TypeMirror typeMirror, String str) {
        if (str.equals(typeMirror.toString())) {
            return true;
        }
        if (!(typeMirror instanceof DeclaredType)) {
            return false;
        }
        DeclaredType declaredType = (DeclaredType) typeMirror;
        List typeArguments = declaredType.getTypeArguments();
        if (typeArguments.size() > 0) {
            StringBuilder stringBuilder = new StringBuilder(declaredType.asElement().toString());
            stringBuilder.append('<');
            for (int i = 0; i < typeArguments.size(); i++) {
                if (i > 0) {
                    stringBuilder.append(',');
                }
                stringBuilder.append('?');
            }
            stringBuilder.append('>');
            if (stringBuilder.toString().equals(str)) {
                return true;
            }
        }
        Element asElement = declaredType.asElement();
        if (!(asElement instanceof TypeElement)) {
            return false;
        }
        TypeElement typeElement = (TypeElement) asElement;
        if (isSubtypeOfType(typeElement.getSuperclass(), str)) {
            return true;
        }
        for (TypeMirror isSubtypeOfType : typeElement.getInterfaces()) {
            if (isSubtypeOfType(isSubtypeOfType, str)) {
                return true;
            }
        }
        return false;
    }

    private ViewInjector getOrCreateTargetClass(Map<TypeElement, ViewInjector> map, TypeElement typeElement) {
        ViewInjector viewInjector = (ViewInjector) map.get(typeElement);
        if (viewInjector != null) {
            return viewInjector;
        }
        String obj = typeElement.getQualifiedName().toString();
        String packageName = getPackageName(typeElement);
        viewInjector = new ViewInjector(packageName, getClassName(typeElement, packageName) + SUFFIX, obj);
        map.put(typeElement, viewInjector);
        return viewInjector;
    }

    private static String getClassName(TypeElement typeElement, String str) {
        return typeElement.getQualifiedName().toString().substring(str.length() + 1).replace('.', '$');
    }

    private String findParentFqcn(TypeElement typeElement, Set<String> set) {
        while (true) {
            TypeMirror superclass = typeElement.getSuperclass();
            if (superclass.getKind() == TypeKind.NONE) {
                return null;
            }
            TypeElement typeElement2 = (TypeElement) ((DeclaredType) superclass).asElement();
            if (set.contains(typeElement2.toString())) {
                String packageName = getPackageName(typeElement2);
                return packageName + "." + getClassName(typeElement2, packageName);
            }
            typeElement = typeElement2;
        }
    }

    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }

    private void error(Element element, String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        this.processingEnv.getMessager().printMessage(Kind.ERROR, str, element);
    }

    private String getPackageName(TypeElement typeElement) {
        return this.elementUtils.getPackageOf(typeElement).getQualifiedName().toString();
    }
}
