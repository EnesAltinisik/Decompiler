package com.google.android.gms.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class zzqq {
    private static final double zzaGr = (1000.0d / ((double) TimeUnit.SECONDS.toNanos(1)));
    private static final double zzaGs = (1000.0d / ((double) TimeUnit.SECONDS.toNanos(1)));
    private static final zzqq zzaGv = new zzqq();
    private final Map<String, Map<String, zza>> zzaGt;
    private final Map<String, zza> zzaGu;

    public static class zza {
        private final double zzaGw;
        private final double zzaGx;

        private zza(double d, double d2) {
            this.zzaGw = d;
            this.zzaGx = d2;
        }

        public boolean zzh(double d) {
            return d >= this.zzaGw && d <= this.zzaGx;
        }
    }

    private zzqq() {
        Map hashMap = new HashMap();
        hashMap.put(zzqm.zzaEs.name, new zza(-90.0d, 90.0d));
        hashMap.put(zzqm.zzaEt.name, new zza(-180.0d, 180.0d));
        hashMap.put(zzqm.zzaEu.name, new zza(0.0d, 10000.0d));
        hashMap.put(zzqm.zzaEr.name, new zza(0.0d, 1000.0d));
        hashMap.put(zzqm.zzaEv.name, new zza(-100000.0d, 100000.0d));
        hashMap.put(zzqm.zzaEC.name, new zza(0.0d, 100.0d));
        hashMap.put(zzqm.zzaEk.name, new zza(0.0d, 100.0d));
        hashMap.put(zzqm.zzaEn.name, new zza(0.0d, 9.223372036854776E18d));
        hashMap.put(zzqm.zzaEz.name, new zza(0.0d, 10.0d));
        hashMap.put(zzqm.zzaEA.name, new zza(0.0d, 1000.0d));
        hashMap.put(zzqm.zzaED.name, new zza(0.0d, 200000.0d));
        this.zzaGu = Collections.unmodifiableMap(hashMap);
        hashMap = new HashMap();
        hashMap.put("com.google.step_count.delta", zzg(zzqm.zzaEm.name, new zza(0.0d, zzaGr)));
        hashMap.put("com.google.calories.consumed", zzg(zzqm.zzaEG.name, new zza(0.0d, zzaGs)));
        hashMap.put("com.google.calories.expended", zzg(zzqm.zzaEG.name, new zza(0.0d, zzaGs)));
        this.zzaGt = Collections.unmodifiableMap(hashMap);
    }

    private static <K, V> Map<K, V> zzg(K k, V v) {
        Map<K, V> hashMap = new HashMap();
        hashMap.put(k, v);
        return hashMap;
    }

    public static zzqq zzxQ() {
        return zzaGv;
    }

    public zza zzI(String str, String str2) {
        Map map = (Map) this.zzaGt.get(str);
        return map != null ? (zza) map.get(str2) : null;
    }

    public zza zzef(String str) {
        return (zza) this.zzaGu.get(str);
    }
}
