package com.google.android.gms.tagmanager;

import android.os.Build.VERSION;

class zzm<K, V> {
    final zza<K, V> a = new zza<K, V>(this) {
        final /* synthetic */ zzm a;

        {
            this.a = r1;
        }

        public int sizeOf(K k, V v) {
            return 1;
        }
    };

    public interface zza<K, V> {
        int sizeOf(K k, V v);
    }

    int a() {
        return VERSION.SDK_INT;
    }

    public ce<K, V> a(int i, zza<K, V> com_google_android_gms_tagmanager_zzm_zza_K__V) {
        if (i > 0) {
            return a() < 12 ? new bq(i, com_google_android_gms_tagmanager_zzm_zza_K__V) : new z(i, com_google_android_gms_tagmanager_zzm_zza_K__V);
        } else {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }
}
