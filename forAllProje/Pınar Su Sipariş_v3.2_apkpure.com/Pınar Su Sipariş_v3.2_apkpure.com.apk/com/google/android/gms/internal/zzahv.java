package com.google.android.gms.internal;

import com.google.android.gms.internal.zzads.zza;
import com.google.firebase.database.DatabaseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class zzahv {
    public static int zza(zzahi com_google_android_gms_internal_zzahi, zzahu com_google_android_gms_internal_zzahu, zzahi com_google_android_gms_internal_zzahi2, zzahu com_google_android_gms_internal_zzahu2) {
        int compareTo = com_google_android_gms_internal_zzahu.compareTo(com_google_android_gms_internal_zzahu2);
        return compareTo != 0 ? compareTo : com_google_android_gms_internal_zzahi.zzi(com_google_android_gms_internal_zzahi2);
    }

    public static zzahu zza(Object obj, zzahu com_google_android_gms_internal_zzahu) throws DatabaseException {
        try {
            Map map;
            Object obj2;
            List list;
            Map hashMap;
            int i;
            String str;
            zzahu zzaq;
            Map hashMap2;
            if (obj instanceof Map) {
                map = (Map) obj;
                if (map.containsKey(".priority")) {
                    com_google_android_gms_internal_zzahu = zzahy.zzar(map.get(".priority"));
                }
                if (map.containsKey(".value")) {
                    obj2 = map.get(".value");
                    if (obj2 == null) {
                        return zzahn.zzTA();
                    }
                    if (obj2 instanceof String) {
                        return new zzaia((String) obj2, com_google_android_gms_internal_zzahu);
                    }
                    if (obj2 instanceof Long) {
                        return new zzahs((Long) obj2, com_google_android_gms_internal_zzahu);
                    }
                    if (obj2 instanceof Integer) {
                        return new zzahs(Long.valueOf((long) ((Integer) obj2).intValue()), com_google_android_gms_internal_zzahu);
                    }
                    if (obj2 instanceof Double) {
                        return new zzahm((Double) obj2, com_google_android_gms_internal_zzahu);
                    }
                    if (obj2 instanceof Boolean) {
                        return new zzahh((Boolean) obj2, com_google_android_gms_internal_zzahu);
                    }
                    if (!(obj2 instanceof Map) || (obj2 instanceof List)) {
                        if (obj2 instanceof Map) {
                            list = (List) obj2;
                            hashMap = new HashMap(list.size());
                            for (i = 0; i < list.size(); i++) {
                                str = i;
                                zzaq = zzaq(list.get(i));
                                if (!zzaq.isEmpty()) {
                                    hashMap.put(zzahi.zzig(str), zzaq);
                                }
                            }
                            map = hashMap;
                        } else {
                            map = (Map) obj2;
                            if (map.containsKey(".sv")) {
                                return new zzahl(map, com_google_android_gms_internal_zzahu);
                            }
                            hashMap2 = new HashMap(map.size());
                            for (String str2 : map.keySet()) {
                                if (!str2.startsWith(".")) {
                                    zzaq = zzaq(map.get(str2));
                                    if (!zzaq.isEmpty()) {
                                        hashMap2.put(zzahi.zzig(str2), zzaq);
                                    }
                                }
                            }
                            map = hashMap2;
                        }
                        return map.isEmpty() ? zzahn.zzTA() : new zzahj(zza.zzb(map, zzahj.zzbQD), com_google_android_gms_internal_zzahu);
                    } else {
                        String str3 = "Failed to parse node with class ";
                        String valueOf = String.valueOf(obj2.getClass().toString());
                        throw new DatabaseException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                    }
                }
            }
            obj2 = obj;
            if (obj2 == null) {
                return zzahn.zzTA();
            }
            if (obj2 instanceof String) {
                return new zzaia((String) obj2, com_google_android_gms_internal_zzahu);
            }
            if (obj2 instanceof Long) {
                return new zzahs((Long) obj2, com_google_android_gms_internal_zzahu);
            }
            if (obj2 instanceof Integer) {
                return new zzahs(Long.valueOf((long) ((Integer) obj2).intValue()), com_google_android_gms_internal_zzahu);
            }
            if (obj2 instanceof Double) {
                return new zzahm((Double) obj2, com_google_android_gms_internal_zzahu);
            }
            if (obj2 instanceof Boolean) {
                return new zzahh((Boolean) obj2, com_google_android_gms_internal_zzahu);
            }
            if (obj2 instanceof Map) {
            }
            if (obj2 instanceof Map) {
                list = (List) obj2;
                hashMap = new HashMap(list.size());
                for (i = 0; i < list.size(); i++) {
                    str = i;
                    zzaq = zzaq(list.get(i));
                    if (!zzaq.isEmpty()) {
                        hashMap.put(zzahi.zzig(str), zzaq);
                    }
                }
                map = hashMap;
            } else {
                map = (Map) obj2;
                if (map.containsKey(".sv")) {
                    return new zzahl(map, com_google_android_gms_internal_zzahu);
                }
                hashMap2 = new HashMap(map.size());
                for (String str22 : map.keySet()) {
                    if (!str22.startsWith(".")) {
                        zzaq = zzaq(map.get(str22));
                        if (!zzaq.isEmpty()) {
                            hashMap2.put(zzahi.zzig(str22), zzaq);
                        }
                    }
                }
                map = hashMap2;
            }
            if (map.isEmpty()) {
            }
        } catch (Throwable e) {
            throw new DatabaseException("Failed to parse node", e);
        }
    }

    public static zzahu zzaq(Object obj) throws DatabaseException {
        return zza(obj, zzahy.zzTM());
    }
}
