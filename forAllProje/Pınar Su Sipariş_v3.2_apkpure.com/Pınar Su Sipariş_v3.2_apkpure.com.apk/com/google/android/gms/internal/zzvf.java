package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class zzvf {
    private static final Map<String, a> zzbui;

    private static final class a {
        public static final String[] a = new String[]{zzae.ARG0.toString(), zzae.ARG1.toString()};
        private final String b;
        private final String[] c;

        public a(String str) {
            this.b = str;
            this.c = a;
        }

        public a(String str, String[] strArr) {
            this.b = str;
            this.c = strArr;
        }

        public String a() {
            return this.b;
        }

        public String[] b() {
            return this.c;
        }
    }

    static {
        Map hashMap = new HashMap();
        hashMap.put(zzad.CONTAINS.toString(), new a("contains"));
        hashMap.put(zzad.ENDS_WITH.toString(), new a("endsWith"));
        hashMap.put(zzad.EQUALS.toString(), new a("equals"));
        hashMap.put(zzad.GREATER_EQUALS.toString(), new a("greaterEquals"));
        hashMap.put(zzad.GREATER_THAN.toString(), new a("greaterThan"));
        hashMap.put(zzad.LESS_EQUALS.toString(), new a("lessEquals"));
        hashMap.put(zzad.LESS_THAN.toString(), new a("lessThan"));
        hashMap.put(zzad.REGEX.toString(), new a("regex", new String[]{zzae.ARG0.toString(), zzae.ARG1.toString(), zzae.IGNORE_CASE.toString()}));
        hashMap.put(zzad.STARTS_WITH.toString(), new a("startsWith"));
        zzbui = hashMap;
    }

    public static zzabo zza(String str, Map<String, zzabh<?>> map, zzuw com_google_android_gms_internal_zzuw) {
        if (zzbui.containsKey(str)) {
            a aVar = (a) zzbui.get(str);
            List zza = zza(aVar.b(), map);
            List arrayList = new ArrayList();
            arrayList.add(new zzabp("gtmUtils"));
            zzabo com_google_android_gms_internal_zzabo = new zzabo("15", arrayList);
            arrayList = new ArrayList();
            arrayList.add(com_google_android_gms_internal_zzabo);
            arrayList.add(new zzabp("mobile"));
            com_google_android_gms_internal_zzabo = new zzabo("17", arrayList);
            arrayList = new ArrayList();
            arrayList.add(com_google_android_gms_internal_zzabo);
            arrayList.add(new zzabp(aVar.a()));
            arrayList.add(new zzabm(zza));
            return new zzabo("2", arrayList);
        }
        throw new RuntimeException(new StringBuilder(String.valueOf(str).length() + 47).append("Fail to convert ").append(str).append(" to the internal representation").toString());
    }

    public static String zza(zzad com_google_android_gms_internal_zzad) {
        return zzhe(com_google_android_gms_internal_zzad.toString());
    }

    private static List<zzabh<?>> zza(String[] strArr, Map<String, zzabh<?>> map) {
        List<zzabh<?>> arrayList = new ArrayList();
        for (int i = 0; i < strArr.length; i++) {
            if (map.containsKey(strArr[i])) {
                arrayList.add((zzabh) map.get(strArr[i]));
            } else {
                arrayList.add(zzabl.zzbvN);
            }
        }
        return arrayList;
    }

    public static String zzhe(String str) {
        return zzbui.containsKey(str) ? ((a) zzbui.get(str)).a() : null;
    }
}
