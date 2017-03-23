package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzu;

@zzig
public class zzes extends zzjv {
    final zzla zzBb;
    final zzeu zzCu;
    private final String zzCv;

    zzes(zzla com_google_android_gms_internal_zzla, zzeu com_google_android_gms_internal_zzeu, String str) {
        this.zzBb = com_google_android_gms_internal_zzla;
        this.zzCu = com_google_android_gms_internal_zzeu;
        this.zzCv = str;
        zzu.zzcD().zza(this);
    }

    public void onStop() {
        this.zzCu.abort();
    }

    public void zzbQ() {
        try {
            this.zzCu.zzY(this.zzCv);
        } finally {
            zzka.zzQu.post(new Runnable(this) {
                final /* synthetic */ zzes a;

                {
                    this.a = r1;
                }

                public void run() {
                    zzu.zzcD().zzb(this.a);
                }
            });
        }
    }
}
