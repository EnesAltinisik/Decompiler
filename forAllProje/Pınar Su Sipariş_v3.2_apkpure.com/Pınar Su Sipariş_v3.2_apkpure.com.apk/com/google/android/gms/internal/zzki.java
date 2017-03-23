package com.google.android.gms.internal;

import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@zzig
public class zzki {
    Map<Integer, Bitmap> zzRh = new ConcurrentHashMap();
    private AtomicInteger zzRi = new AtomicInteger(0);

    public Bitmap zza(Integer num) {
        return (Bitmap) this.zzRh.get(num);
    }

    public int zzb(Bitmap bitmap) {
        if (bitmap == null) {
            zzb.zzaU("Bitmap is null. Skipping putting into the Memory Map.");
            return -1;
        }
        this.zzRh.put(Integer.valueOf(this.zzRi.get()), bitmap);
        return this.zzRi.getAndIncrement();
    }

    public void zzb(Integer num) {
        this.zzRh.remove(num);
    }
}
