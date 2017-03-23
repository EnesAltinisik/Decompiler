package com.google.android.gms.internal;

import com.google.android.gms.internal.zzadx.zza;

public class zzady<K, V> extends zzadz<K, V> {
    zzady(K k, V v) {
        super(k, v, zzadw.zzPD(), zzadw.zzPD());
    }

    zzady(K k, V v, zzadx<K, V> com_google_android_gms_internal_zzadx_K__V, zzadx<K, V> com_google_android_gms_internal_zzadx_K__V2) {
        super(k, v, com_google_android_gms_internal_zzadx_K__V, com_google_android_gms_internal_zzadx_K__V2);
    }

    protected zza zzPB() {
        return zza.RED;
    }

    public boolean zzPC() {
        return true;
    }

    protected zzadz<K, V> zza(K k, V v, zzadx<K, V> com_google_android_gms_internal_zzadx_K__V, zzadx<K, V> com_google_android_gms_internal_zzadx_K__V2) {
        Object key;
        Object value;
        zzadx zzPE;
        zzadx zzPF;
        if (k == null) {
            key = getKey();
        }
        if (v == null) {
            value = getValue();
        }
        if (com_google_android_gms_internal_zzadx_K__V == null) {
            zzPE = zzPE();
        }
        if (com_google_android_gms_internal_zzadx_K__V2 == null) {
            zzPF = zzPF();
        }
        return new zzady(key, value, zzPE, zzPF);
    }
}
