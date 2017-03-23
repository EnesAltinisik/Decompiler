package com.google.android.gms.tagmanager;

import com.google.android.gms.tagmanager.zzm.zza;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class bq<K, V> implements ce<K, V> {
    private final Map<K, V> a = new HashMap();
    private final int b;
    private final zza<K, V> c;
    private int d;

    bq(int i, zza<K, V> com_google_android_gms_tagmanager_zzm_zza_K__V) {
        this.b = i;
        this.c = com_google_android_gms_tagmanager_zzm_zza_K__V;
    }

    public synchronized V a(K k) {
        return this.a.get(k);
    }

    public synchronized void a(K k, V v) {
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        this.d += this.c.sizeOf(k, v);
        if (this.d > this.b) {
            Iterator it = this.a.entrySet().iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                this.d -= this.c.sizeOf(entry.getKey(), entry.getValue());
                it.remove();
                if (this.d <= this.b) {
                    break;
                }
            }
        }
        this.a.put(k, v);
    }
}
