package com.google.android.gms.tagmanager;

import android.annotation.TargetApi;
import android.util.LruCache;
import com.google.android.gms.tagmanager.zzm.zza;

@TargetApi(12)
class z<K, V> implements ce<K, V> {
    private LruCache<K, V> a;

    z(int i, final zza<K, V> com_google_android_gms_tagmanager_zzm_zza_K__V) {
        this.a = new LruCache<K, V>(this, i) {
            final /* synthetic */ z b;

            protected int sizeOf(K k, V v) {
                return com_google_android_gms_tagmanager_zzm_zza_K__V.sizeOf(k, v);
            }
        };
    }

    public V a(K k) {
        return this.a.get(k);
    }

    public void a(K k, V v) {
        this.a.put(k, v);
    }
}
