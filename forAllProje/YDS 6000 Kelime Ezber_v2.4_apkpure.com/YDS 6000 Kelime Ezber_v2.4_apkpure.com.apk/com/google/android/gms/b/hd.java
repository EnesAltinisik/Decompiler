package com.google.android.gms.b;

import com.google.android.gms.b.hf.b;
import com.google.android.gms.b.jf.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class hd {

    class AnonymousClass1 implements b {
        final /* synthetic */ hf a;
        final /* synthetic */ Map b;

        AnonymousClass1(hf hfVar, Map map) {
            this.a = hfVar;
            this.b = map;
        }

        public void a(gx gxVar, jr jrVar) {
            this.a.a(gxVar, hd.a(jrVar, this.b));
        }
    }

    class AnonymousClass2 extends a {
        final /* synthetic */ Map a;
        final /* synthetic */ he b;

        AnonymousClass2(Map map, he heVar) {
            this.a = map;
            this.b = heVar;
        }

        public void a(je jeVar, jr jrVar) {
            jr a = hd.a(jrVar, this.a);
            if (a != jrVar) {
                this.b.a(new gx(jeVar.d()), a);
            }
        }
    }

    public static go a(go goVar, Map<String, Object> map) {
        go a = go.a();
        Iterator it = goVar.iterator();
        go goVar2 = a;
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            goVar2 = goVar2.a((gx) entry.getKey(), a((jr) entry.getValue(), (Map) map));
        }
        return goVar2;
    }

    public static hf a(hf hfVar, Map<String, Object> map) {
        hf hfVar2 = new hf();
        hfVar.a(new gx(""), new AnonymousClass1(hfVar2, map));
        return hfVar2;
    }

    public static jr a(jr jrVar, Map<String, Object> map) {
        Object a = jrVar.e().a();
        if (a instanceof Map) {
            Map map2 = (Map) a;
            if (map2.containsKey(".sv")) {
                a = map.get((String) map2.get(".sv"));
            }
        }
        jr a2 = jv.a(a);
        if (jrVar.d()) {
            a = a(jrVar.a(), (Map) map);
            return (a.equals(jrVar.a()) && a2.equals(jrVar.e())) ? jrVar : js.a(a, a2);
        } else if (jrVar.b()) {
            return jrVar;
        } else {
            jf jfVar = (jf) jrVar;
            he heVar = new he(jfVar);
            jfVar.a(new AnonymousClass2(map, heVar));
            return !heVar.a().e().equals(a2) ? heVar.a().b(a2) : heVar.a();
        }
    }

    public static Object a(Object obj, Map<String, Object> map) {
        if (!(obj instanceof Map)) {
            return obj;
        }
        Map map2 = (Map) obj;
        if (!map2.containsKey(".sv")) {
            return obj;
        }
        String str = (String) map2.get(".sv");
        return map.containsKey(str) ? map.get(str) : obj;
    }

    public static Map<String, Object> a(kl klVar) {
        Map<String, Object> hashMap = new HashMap();
        hashMap.put("timestamp", Long.valueOf(klVar.a()));
        return hashMap;
    }
}
