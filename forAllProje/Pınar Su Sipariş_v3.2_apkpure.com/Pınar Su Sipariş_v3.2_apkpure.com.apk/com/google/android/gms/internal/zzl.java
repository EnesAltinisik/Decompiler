package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class zzl {
    private AtomicInteger zzX;
    private final Map<String, Queue<zzk<?>>> zzY;
    private final Set<zzk<?>> zzZ;
    private final PriorityBlockingQueue<zzk<?>> zzaa;
    private final PriorityBlockingQueue<zzk<?>> zzab;
    private zzg[] zzac;
    private zzc zzad;
    private List<zza> zzae;
    private final zzb zzi;
    private final zzn zzj;
    private final zzf zzy;

    public interface zza<T> {
        void zzg(zzk<T> com_google_android_gms_internal_zzk_T);
    }

    public zzl(zzb com_google_android_gms_internal_zzb, zzf com_google_android_gms_internal_zzf) {
        this(com_google_android_gms_internal_zzb, com_google_android_gms_internal_zzf, 4);
    }

    public zzl(zzb com_google_android_gms_internal_zzb, zzf com_google_android_gms_internal_zzf, int i) {
        this(com_google_android_gms_internal_zzb, com_google_android_gms_internal_zzf, i, new zze(new Handler(Looper.getMainLooper())));
    }

    public zzl(zzb com_google_android_gms_internal_zzb, zzf com_google_android_gms_internal_zzf, int i, zzn com_google_android_gms_internal_zzn) {
        this.zzX = new AtomicInteger();
        this.zzY = new HashMap();
        this.zzZ = new HashSet();
        this.zzaa = new PriorityBlockingQueue();
        this.zzab = new PriorityBlockingQueue();
        this.zzae = new ArrayList();
        this.zzi = com_google_android_gms_internal_zzb;
        this.zzy = com_google_android_gms_internal_zzf;
        this.zzac = new zzg[i];
        this.zzj = com_google_android_gms_internal_zzn;
    }

    public int getSequenceNumber() {
        return this.zzX.incrementAndGet();
    }

    public void start() {
        stop();
        this.zzad = new zzc(this.zzaa, this.zzab, this.zzi, this.zzj);
        this.zzad.start();
        for (int i = 0; i < this.zzac.length; i++) {
            zzg com_google_android_gms_internal_zzg = new zzg(this.zzab, this.zzy, this.zzi, this.zzj);
            this.zzac[i] = com_google_android_gms_internal_zzg;
            com_google_android_gms_internal_zzg.start();
        }
    }

    public void stop() {
        if (this.zzad != null) {
            this.zzad.quit();
        }
        for (int i = 0; i < this.zzac.length; i++) {
            if (this.zzac[i] != null) {
                this.zzac[i].quit();
            }
        }
    }

    public <T> zzk<T> zze(zzk<T> com_google_android_gms_internal_zzk_T) {
        com_google_android_gms_internal_zzk_T.zza(this);
        synchronized (this.zzZ) {
            this.zzZ.add(com_google_android_gms_internal_zzk_T);
        }
        com_google_android_gms_internal_zzk_T.zza(getSequenceNumber());
        com_google_android_gms_internal_zzk_T.zzc("add-to-queue");
        if (com_google_android_gms_internal_zzk_T.zzq()) {
            synchronized (this.zzY) {
                String zzg = com_google_android_gms_internal_zzk_T.zzg();
                if (this.zzY.containsKey(zzg)) {
                    Queue queue = (Queue) this.zzY.get(zzg);
                    if (queue == null) {
                        queue = new LinkedList();
                    }
                    queue.add(com_google_android_gms_internal_zzk_T);
                    this.zzY.put(zzg, queue);
                    if (zzs.DEBUG) {
                        zzs.zza("Request for cacheKey=%s is in flight, putting on hold.", zzg);
                    }
                } else {
                    this.zzY.put(zzg, null);
                    this.zzaa.add(com_google_android_gms_internal_zzk_T);
                }
            }
        } else {
            this.zzab.add(com_google_android_gms_internal_zzk_T);
        }
        return com_google_android_gms_internal_zzk_T;
    }

    <T> void zzf(zzk<T> com_google_android_gms_internal_zzk_T) {
        synchronized (this.zzZ) {
            this.zzZ.remove(com_google_android_gms_internal_zzk_T);
        }
        synchronized (this.zzae) {
            for (zza zzg : this.zzae) {
                zzg.zzg(com_google_android_gms_internal_zzk_T);
            }
        }
        if (com_google_android_gms_internal_zzk_T.zzq()) {
            synchronized (this.zzY) {
                Queue queue = (Queue) this.zzY.remove(com_google_android_gms_internal_zzk_T.zzg());
                if (queue != null) {
                    if (zzs.DEBUG) {
                        zzs.zza("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(queue.size()), r2);
                    }
                    this.zzaa.addAll(queue);
                }
            }
        }
    }
}
