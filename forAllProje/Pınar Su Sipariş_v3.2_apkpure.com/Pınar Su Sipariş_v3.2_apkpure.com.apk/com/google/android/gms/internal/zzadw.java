package com.google.android.gms.internal;

import com.google.android.gms.internal.zzadx.zza;
import com.google.android.gms.internal.zzadx.zzb;
import java.util.Comparator;

public class zzadw<K, V> implements zzadx<K, V> {
    private static final zzadw zzbIp = new zzadw();

    private zzadw() {
    }

    public static <K, V> zzadw<K, V> zzPD() {
        return zzbIp;
    }

    public K getKey() {
        return null;
    }

    public V getValue() {
        return null;
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean zzPC() {
        return false;
    }

    public zzadx<K, V> zzPE() {
        return this;
    }

    public zzadx<K, V> zzPF() {
        return this;
    }

    public zzadx<K, V> zzPG() {
        return this;
    }

    public zzadx<K, V> zzPH() {
        return this;
    }

    public int zzPI() {
        return 0;
    }

    public zzadx<K, V> zza(K k, V v, zza com_google_android_gms_internal_zzadx_zza, zzadx<K, V> com_google_android_gms_internal_zzadx_K__V, zzadx<K, V> com_google_android_gms_internal_zzadx_K__V2) {
        return this;
    }

    public zzadx<K, V> zza(K k, V v, Comparator<K> comparator) {
        return new zzady(k, v);
    }

    public zzadx<K, V> zza(K k, Comparator<K> comparator) {
        return this;
    }

    public void zza(zzb<K, V> com_google_android_gms_internal_zzadx_zzb_K__V) {
    }
}
