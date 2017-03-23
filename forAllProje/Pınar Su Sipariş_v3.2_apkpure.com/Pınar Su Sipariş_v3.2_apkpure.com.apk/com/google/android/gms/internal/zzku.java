package com.google.android.gms.internal;

import com.google.android.gms.internal.zzkt.zza;
import com.google.android.gms.internal.zzkt.zzc;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@zzig
public class zzku<T> implements zzkt<T> {
    protected int zzDO = 0;
    protected final BlockingQueue<a> zzRT = new LinkedBlockingQueue();
    protected T zzRU;
    private final Object zzpp = new Object();

    class a {
        public final zzc<T> a;
        public final zza b;
        final /* synthetic */ zzku c;

        public a(zzku com_google_android_gms_internal_zzku, zzc<T> com_google_android_gms_internal_zzkt_zzc_T, zza com_google_android_gms_internal_zzkt_zza) {
            this.c = com_google_android_gms_internal_zzku;
            this.a = com_google_android_gms_internal_zzkt_zzc_T;
            this.b = com_google_android_gms_internal_zzkt_zza;
        }
    }

    public int getStatus() {
        return this.zzDO;
    }

    public void reject() {
        synchronized (this.zzpp) {
            if (this.zzDO != 0) {
                throw new UnsupportedOperationException();
            }
            this.zzDO = -1;
            for (a aVar : this.zzRT) {
                aVar.b.run();
            }
            this.zzRT.clear();
        }
    }

    public void zza(zzc<T> com_google_android_gms_internal_zzkt_zzc_T, zza com_google_android_gms_internal_zzkt_zza) {
        synchronized (this.zzpp) {
            if (this.zzDO == 1) {
                com_google_android_gms_internal_zzkt_zzc_T.zzc(this.zzRU);
            } else if (this.zzDO == -1) {
                com_google_android_gms_internal_zzkt_zza.run();
            } else if (this.zzDO == 0) {
                this.zzRT.add(new a(this, com_google_android_gms_internal_zzkt_zzc_T, com_google_android_gms_internal_zzkt_zza));
            }
        }
    }

    public void zzf(T t) {
        synchronized (this.zzpp) {
            if (this.zzDO != 0) {
                throw new UnsupportedOperationException();
            }
            this.zzRU = t;
            this.zzDO = 1;
            for (a aVar : this.zzRT) {
                aVar.a.zzc(t);
            }
            this.zzRT.clear();
        }
    }
}
