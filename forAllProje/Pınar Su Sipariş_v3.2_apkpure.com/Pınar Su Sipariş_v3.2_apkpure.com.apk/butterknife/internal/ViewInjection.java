package butterknife.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class ViewInjection {
    private final int id;
    private final LinkedHashMap<ListenerClass, Map<ListenerMethod, Set<ListenerBinding>>> listenerBindings = new LinkedHashMap();
    private final Set<ViewBinding> viewBindings = new LinkedHashSet();

    ViewInjection(int i) {
        this.id = i;
    }

    public int getId() {
        return this.id;
    }

    public Collection<ViewBinding> getViewBindings() {
        return this.viewBindings;
    }

    public Map<ListenerClass, Map<ListenerMethod, Set<ListenerBinding>>> getListenerBindings() {
        return this.listenerBindings;
    }

    public boolean hasListenerBinding(ListenerClass listenerClass, ListenerMethod listenerMethod) {
        Map map = (Map) this.listenerBindings.get(listenerClass);
        return map != null && map.containsKey(listenerMethod);
    }

    public void addListenerBinding(ListenerClass listenerClass, ListenerMethod listenerMethod, ListenerBinding listenerBinding) {
        Map map;
        Set set;
        Map map2 = (Map) this.listenerBindings.get(listenerClass);
        if (map2 == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.listenerBindings.put(listenerClass, linkedHashMap);
            map = linkedHashMap;
            set = null;
        } else {
            map = map2;
            set = (Set) map2.get(listenerMethod);
        }
        if (set == null) {
            set = new LinkedHashSet();
            map.put(listenerMethod, set);
        }
        set.add(listenerBinding);
    }

    public void addViewBinding(ViewBinding viewBinding) {
        this.viewBindings.add(viewBinding);
    }

    public List<Binding> getRequiredBindings() {
        List<Binding> arrayList = new ArrayList();
        for (ViewBinding viewBinding : this.viewBindings) {
            if (viewBinding.isRequired()) {
                arrayList.add(viewBinding);
            }
        }
        for (Map values : this.listenerBindings.values()) {
            for (Set<ListenerBinding> it : values.values()) {
                for (ListenerBinding listenerBinding : it) {
                    if (listenerBinding.isRequired()) {
                        arrayList.add(listenerBinding);
                    }
                }
            }
        }
        return arrayList;
    }
}
