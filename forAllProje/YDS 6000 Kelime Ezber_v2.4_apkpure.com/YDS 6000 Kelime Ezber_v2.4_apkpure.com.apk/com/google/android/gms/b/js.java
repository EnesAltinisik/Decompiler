package com.google.android.gms.b;

import com.google.android.gms.b.fo.a;
import com.google.firebase.database.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class js {
    public static int a(je jeVar, jr jrVar, je jeVar2, jr jrVar2) {
        int compareTo = jrVar.compareTo(jrVar2);
        return compareTo != 0 ? compareTo : jeVar.a(jeVar2);
    }

    public static jr a(Object obj) {
        return a(obj, jv.a());
    }

    public static jr a(Object obj, jr jrVar) {
        try {
            Map map;
            Object obj2;
            List list;
            Map hashMap;
            int i;
            String str;
            jr a;
            Map hashMap2;
            if (obj instanceof Map) {
                map = (Map) obj;
                if (map.containsKey(".priority")) {
                    jrVar = jv.a(map.get(".priority"));
                }
                if (map.containsKey(".value")) {
                    obj2 = map.get(".value");
                    if (obj2 == null) {
                        return jj.f();
                    }
                    if (obj2 instanceof String) {
                        return new jx((String) obj2, jrVar);
                    }
                    if (obj2 instanceof Long) {
                        return new jp((Long) obj2, jrVar);
                    }
                    if (obj2 instanceof Integer) {
                        return new jp(Long.valueOf((long) ((Integer) obj2).intValue()), jrVar);
                    }
                    if (obj2 instanceof Double) {
                        return new ji((Double) obj2, jrVar);
                    }
                    if (obj2 instanceof Boolean) {
                        return new jd((Boolean) obj2, jrVar);
                    }
                    if (!(obj2 instanceof Map) || (obj2 instanceof List)) {
                        if (obj2 instanceof Map) {
                            list = (List) obj2;
                            hashMap = new HashMap(list.size());
                            for (i = 0; i < list.size(); i++) {
                                str = i;
                                a = a(list.get(i));
                                if (!a.b()) {
                                    hashMap.put(je.a(str), a);
                                }
                            }
                            map = hashMap;
                        } else {
                            map = (Map) obj2;
                            if (map.containsKey(".sv")) {
                                return new jh(map, jrVar);
                            }
                            hashMap2 = new HashMap(map.size());
                            for (String str2 : map.keySet()) {
                                if (!str2.startsWith(".")) {
                                    a = a(map.get(str2));
                                    if (!a.b()) {
                                        hashMap2.put(je.a(str2), a);
                                    }
                                }
                            }
                            map = hashMap2;
                        }
                        return map.isEmpty() ? jj.f() : new jf(a.a(map, jf.a), jrVar);
                    } else {
                        String str3 = "Failed to parse node with class ";
                        String valueOf = String.valueOf(obj2.getClass().toString());
                        throw new c(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                    }
                }
            }
            obj2 = obj;
            if (obj2 == null) {
                return jj.f();
            }
            if (obj2 instanceof String) {
                return new jx((String) obj2, jrVar);
            }
            if (obj2 instanceof Long) {
                return new jp((Long) obj2, jrVar);
            }
            if (obj2 instanceof Integer) {
                return new jp(Long.valueOf((long) ((Integer) obj2).intValue()), jrVar);
            }
            if (obj2 instanceof Double) {
                return new ji((Double) obj2, jrVar);
            }
            if (obj2 instanceof Boolean) {
                return new jd((Boolean) obj2, jrVar);
            }
            if (obj2 instanceof Map) {
            }
            if (obj2 instanceof Map) {
                list = (List) obj2;
                hashMap = new HashMap(list.size());
                for (i = 0; i < list.size(); i++) {
                    str = i;
                    a = a(list.get(i));
                    if (!a.b()) {
                        hashMap.put(je.a(str), a);
                    }
                }
                map = hashMap;
            } else {
                map = (Map) obj2;
                if (map.containsKey(".sv")) {
                    return new jh(map, jrVar);
                }
                hashMap2 = new HashMap(map.size());
                for (String str22 : map.keySet()) {
                    if (!str22.startsWith(".")) {
                        a = a(map.get(str22));
                        if (!a.b()) {
                            hashMap2.put(je.a(str22), a);
                        }
                    }
                }
                map = hashMap2;
            }
            if (map.isEmpty()) {
            }
        } catch (Throwable e) {
            throw new c("Failed to parse node", e);
        }
    }
}
