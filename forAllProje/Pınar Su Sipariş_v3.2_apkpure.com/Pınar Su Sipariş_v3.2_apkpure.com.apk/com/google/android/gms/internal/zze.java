package com.google.android.gms.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

public class zze implements zzn {
    private final Executor zzr;

    private class a implements Runnable {
        final /* synthetic */ zze a;
        private final zzk b;
        private final zzm c;
        private final Runnable d;

        public a(zze com_google_android_gms_internal_zze, zzk com_google_android_gms_internal_zzk, zzm com_google_android_gms_internal_zzm, Runnable runnable) {
            this.a = com_google_android_gms_internal_zze;
            this.b = com_google_android_gms_internal_zzk;
            this.c = com_google_android_gms_internal_zzm;
            this.d = runnable;
        }

        public void run() {
            if (this.b.isCanceled()) {
                this.b.zzd("canceled-at-delivery");
                return;
            }
            if (this.c.isSuccess()) {
                this.b.zza(this.c.result);
            } else {
                this.b.zzc(this.c.zzag);
            }
            if (this.c.zzah) {
                this.b.zzc("intermediate-response");
            } else {
                this.b.zzd("done");
            }
            if (this.d != null) {
                this.d.run();
            }
        }
    }

    public zze(final Handler handler) {
        this.zzr = new Executor(this) {
            final /* synthetic */ zze b;

            public void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    public void zza(zzk<?> com_google_android_gms_internal_zzk_, zzm<?> com_google_android_gms_internal_zzm_) {
        zza(com_google_android_gms_internal_zzk_, com_google_android_gms_internal_zzm_, null);
    }

    public void zza(zzk<?> com_google_android_gms_internal_zzk_, zzm<?> com_google_android_gms_internal_zzm_, Runnable runnable) {
        com_google_android_gms_internal_zzk_.zzu();
        com_google_android_gms_internal_zzk_.zzc("post-response");
        this.zzr.execute(new a(this, com_google_android_gms_internal_zzk_, com_google_android_gms_internal_zzm_, runnable));
    }

    public void zza(zzk<?> com_google_android_gms_internal_zzk_, zzr com_google_android_gms_internal_zzr) {
        com_google_android_gms_internal_zzk_.zzc("post-error");
        this.zzr.execute(new a(this, com_google_android_gms_internal_zzk_, zzm.zzd(com_google_android_gms_internal_zzr), null));
    }
}
