package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzaa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class zzabq {
    private static List<Object> zzK(List<Object> list) {
        List<Object> arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof Bundle) {
                arrayList.add(zzM((Bundle) next));
            } else if (next instanceof List) {
                arrayList.add(zzK((List) next));
            } else {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static Map<String, Object> zzM(Bundle bundle) {
        Map<String, Object> hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                hashMap.put(str, zzM((Bundle) obj));
            } else if (obj instanceof List) {
                hashMap.put(str, zzK((List) obj));
            } else {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    public static zzabh<?> zzY(Object obj) {
        if (obj == null) {
            return zzabl.zzbvM;
        }
        if (obj instanceof zzabh) {
            return (zzabh) obj;
        }
        if (obj instanceof Boolean) {
            return new zzabi((Boolean) obj);
        }
        if (obj instanceof Short) {
            return new zzabj(Double.valueOf(((Short) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new zzabj(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Long) {
            return new zzabj(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Float) {
            return new zzabj(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return new zzabj((Double) obj);
        }
        if (obj instanceof Byte) {
            return new zzabp(obj.toString());
        }
        if (obj instanceof Character) {
            return new zzabp(obj.toString());
        }
        if (obj instanceof String) {
            return new zzabp((String) obj);
        }
        if (obj instanceof List) {
            List arrayList = new ArrayList();
            for (Object zzY : (List) obj) {
                arrayList.add(zzY(zzY));
            }
            return new zzabm(arrayList);
        } else if (obj instanceof Map) {
            r2 = new HashMap();
            for (Entry entry : ((Map) obj).entrySet()) {
                zzaa.zzaj(entry.getKey() instanceof String);
                r2.put((String) entry.getKey(), zzY(entry.getValue()));
            }
            return new zzabn(r2);
        } else if (obj instanceof Bundle) {
            r2 = new HashMap();
            for (String str : ((Bundle) obj).keySet()) {
                r2.put(str, zzY(((Bundle) obj).get(str)));
            }
            return new zzabn(r2);
        } else {
            String valueOf = String.valueOf(obj.getClass());
            throw new UnsupportedOperationException(new StringBuilder(String.valueOf(valueOf).length() + 20).append("Type not supported: ").append(valueOf).toString());
        }
    }

    public static zzabh zza(zzuw com_google_android_gms_internal_zzuw, zzabh com_google_android_gms_internal_zzabh) {
        zzaa.zzz(com_google_android_gms_internal_zzabh);
        if (!(zzn(com_google_android_gms_internal_zzabh) || (com_google_android_gms_internal_zzabh instanceof zzabk) || (com_google_android_gms_internal_zzabh instanceof zzabm) || (com_google_android_gms_internal_zzabh instanceof zzabn))) {
            if (com_google_android_gms_internal_zzabh instanceof zzabo) {
                com_google_android_gms_internal_zzabh = zza(com_google_android_gms_internal_zzuw, (zzabo) com_google_android_gms_internal_zzabh);
            } else {
                throw new UnsupportedOperationException("Attempting to evaluate unknown type");
            }
        }
        if (com_google_android_gms_internal_zzabh == null) {
            throw new IllegalArgumentException("AbstractType evaluated to Java null");
        } else if (!(com_google_android_gms_internal_zzabh instanceof zzabo)) {
            return com_google_android_gms_internal_zzabh;
        } else {
            throw new IllegalArgumentException("AbstractType evaluated to illegal type Statement.");
        }
    }

    public static zzabh zza(zzuw com_google_android_gms_internal_zzuw, zzabo com_google_android_gms_internal_zzabo) {
        String zzMw = com_google_android_gms_internal_zzabo.zzMw();
        List zzMx = com_google_android_gms_internal_zzabo.zzMx();
        zzabh zzhc = com_google_android_gms_internal_zzuw.zzhc(zzMw);
        if (zzhc == null) {
            throw new UnsupportedOperationException(new StringBuilder(String.valueOf(zzMw).length() + 28).append("Function '").append(zzMw).append("' is not supported").toString());
        } else if (zzhc instanceof zzabk) {
            return ((zzvh) ((zzabk) zzhc).zzMk()).zzb(com_google_android_gms_internal_zzuw, (zzabh[]) zzMx.toArray(new zzabh[zzMx.size()]));
        } else {
            throw new UnsupportedOperationException(new StringBuilder(String.valueOf(zzMw).length() + 29).append("Function '").append(zzMw).append("' is not a function").toString());
        }
    }

    public static zzabl zza(zzuw com_google_android_gms_internal_zzuw, List<zzabh<?>> list) {
        for (zzabh com_google_android_gms_internal_zzabh : list) {
            zzaa.zzaj(com_google_android_gms_internal_zzabh instanceof zzabo);
            zzabh com_google_android_gms_internal_zzabh2 = zza(com_google_android_gms_internal_zzuw, com_google_android_gms_internal_zzabh2);
            if (zzo(com_google_android_gms_internal_zzabh2)) {
                return (zzabl) com_google_android_gms_internal_zzabh2;
            }
        }
        return zzabl.zzbvN;
    }

    public static Bundle zzao(Map<String, zzabh<?>> map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle(map.size());
        for (Entry entry : map.entrySet()) {
            if (entry.getValue() instanceof zzabp) {
                bundle.putString((String) entry.getKey(), (String) ((zzabp) entry.getValue()).zzMk());
            } else if (entry.getValue() instanceof zzabi) {
                bundle.putBoolean((String) entry.getKey(), ((Boolean) ((zzabi) entry.getValue()).zzMk()).booleanValue());
            } else if (entry.getValue() instanceof zzabj) {
                bundle.putDouble((String) entry.getKey(), ((Double) ((zzabj) entry.getValue()).zzMk()).doubleValue());
            } else if (entry.getValue() instanceof zzabn) {
                bundle.putBundle((String) entry.getKey(), zzao((Map) ((zzabn) entry.getValue()).zzMk()));
            } else {
                throw new IllegalArgumentException(String.format("Invalid param type for key '%s'. Only boolean, double and string types and maps of thereof are supported.", new Object[]{entry.getKey()}));
            }
        }
        return bundle;
    }

    public static Object zzl(zzabh<?> com_google_android_gms_internal_zzabh_) {
        if (com_google_android_gms_internal_zzabh_ == null) {
            return null;
        }
        if (com_google_android_gms_internal_zzabh_ == zzabl.zzbvM) {
            return null;
        }
        if (com_google_android_gms_internal_zzabh_ instanceof zzabi) {
            return (Boolean) ((zzabi) com_google_android_gms_internal_zzabh_).zzMk();
        }
        if (com_google_android_gms_internal_zzabh_ instanceof zzabj) {
            double doubleValue = ((Double) ((zzabj) com_google_android_gms_internal_zzabh_).zzMk()).doubleValue();
            return (Double.isInfinite(doubleValue) || doubleValue - Math.floor(doubleValue) >= 1.0E-5d) ? ((Double) ((zzabj) com_google_android_gms_internal_zzabh_).zzMk()).toString() : Integer.valueOf((int) doubleValue);
        } else if (com_google_android_gms_internal_zzabh_ instanceof zzabp) {
            return (String) ((zzabp) com_google_android_gms_internal_zzabh_).zzMk();
        } else {
            if (com_google_android_gms_internal_zzabh_ instanceof zzabm) {
                List arrayList = new ArrayList();
                for (zzabh zzl : (List) ((zzabm) com_google_android_gms_internal_zzabh_).zzMk()) {
                    Object zzl2 = zzl(zzl);
                    if (zzl2 == null) {
                        zzun.e(String.format("Failure to convert a list element to object: %s (%s)", new Object[]{zzl, zzl.getClass().getCanonicalName()}));
                        return null;
                    }
                    arrayList.add(zzl2);
                }
                return arrayList;
            } else if (com_google_android_gms_internal_zzabh_ instanceof zzabn) {
                Map hashMap = new HashMap();
                for (Entry entry : ((Map) ((zzabn) com_google_android_gms_internal_zzabh_).zzMk()).entrySet()) {
                    Object zzl3 = zzl((zzabh) entry.getValue());
                    if (zzl3 == null) {
                        zzun.e(String.format("Failure to convert a map's value to object: %s (%s)", new Object[]{entry.getValue(), ((zzabh) entry.getValue()).getClass().getCanonicalName()}));
                        return null;
                    }
                    hashMap.put((String) entry.getKey(), zzl3);
                }
                return hashMap;
            } else {
                String valueOf = String.valueOf(com_google_android_gms_internal_zzabh_.getClass());
                zzun.e(new StringBuilder(String.valueOf(valueOf).length() + 49).append("Converting to Object from unknown abstract type: ").append(valueOf).toString());
                return null;
            }
        }
    }

    public static zzabh zzm(zzabh<?> com_google_android_gms_internal_zzabh_) {
        if (com_google_android_gms_internal_zzabh_ instanceof zzabn) {
            Set<String> hashSet = new HashSet();
            Map map = (Map) ((zzabn) com_google_android_gms_internal_zzabh_).zzMk();
            for (Entry entry : map.entrySet()) {
                if (entry.getValue() == zzabl.zzbvN) {
                    hashSet.add((String) entry.getKey());
                }
            }
            for (String remove : hashSet) {
                map.remove(remove);
            }
        }
        return com_google_android_gms_internal_zzabh_;
    }

    public static boolean zzn(zzabh com_google_android_gms_internal_zzabh) {
        return (com_google_android_gms_internal_zzabh instanceof zzabi) || (com_google_android_gms_internal_zzabh instanceof zzabj) || (com_google_android_gms_internal_zzabh instanceof zzabp) || com_google_android_gms_internal_zzabh == zzabl.zzbvM || com_google_android_gms_internal_zzabh == zzabl.zzbvN;
    }

    public static boolean zzo(zzabh com_google_android_gms_internal_zzabh) {
        return com_google_android_gms_internal_zzabh == zzabl.zzbvL || com_google_android_gms_internal_zzabh == zzabl.zzbvK || ((com_google_android_gms_internal_zzabh instanceof zzabl) && ((zzabl) com_google_android_gms_internal_zzabh).zzMr());
    }
}
