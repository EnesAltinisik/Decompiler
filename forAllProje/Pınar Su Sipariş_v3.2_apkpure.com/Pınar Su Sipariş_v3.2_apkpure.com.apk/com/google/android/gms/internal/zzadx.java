package com.google.android.gms.internal;

import java.util.Comparator;

public interface zzadx<K, V> {

    public enum zza {
        RED,
        BLACK
    }

    public static abstract class zzb<K, V> {
        public abstract void zzk(K k, V v);
    }

    K getKey();

    V getValue();

    boolean isEmpty();

    boolean zzPC();

    zzadx<K, V> zzPE();

    zzadx<K, V> zzPF();

    zzadx<K, V> zzPG();

    zzadx<K, V> zzPH();

    int zzPI();

    zzadx<K, V> zza(K k, V v, zza com_google_android_gms_internal_zzadx_zza, zzadx<K, V> com_google_android_gms_internal_zzadx_K__V, zzadx<K, V> com_google_android_gms_internal_zzadx_K__V2);

    zzadx<K, V> zza(K k, V v, Comparator<K> comparator);

    zzadx<K, V> zza(K k, Comparator<K> comparator);

    void zza(zzb<K, V> com_google_android_gms_internal_zzadx_zzb_K__V);
}
