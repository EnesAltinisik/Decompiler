package com.google.android.gms.ads.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzka;
import java.lang.ref.WeakReference;

@zzig
public class zzr {
    private final zza zzrC;
    private AdRequestParcel zzrD;
    private boolean zzrE;
    private boolean zzrF;
    private long zzrG;
    private final Runnable zzw;

    public static class zza {
        private final Handler mHandler;

        public zza(Handler handler) {
            this.mHandler = handler;
        }

        public boolean postDelayed(Runnable runnable, long j) {
            return this.mHandler.postDelayed(runnable, j);
        }

        public void removeCallbacks(Runnable runnable) {
            this.mHandler.removeCallbacks(runnable);
        }
    }

    public zzr(zza com_google_android_gms_ads_internal_zza) {
        this(com_google_android_gms_ads_internal_zza, new zza(zzka.zzQu));
    }

    zzr(zza com_google_android_gms_ads_internal_zza, zza com_google_android_gms_ads_internal_zzr_zza) {
        this.zzrE = false;
        this.zzrF = false;
        this.zzrG = 0;
        this.zzrC = com_google_android_gms_ads_internal_zzr_zza;
        final WeakReference weakReference = new WeakReference(com_google_android_gms_ads_internal_zza);
        this.zzw = new Runnable(this) {
            final /* synthetic */ zzr b;

            public void run() {
                this.b.zzrE = false;
                zza com_google_android_gms_ads_internal_zza = (zza) weakReference.get();
                if (com_google_android_gms_ads_internal_zza != null) {
                    com_google_android_gms_ads_internal_zza.zzd(this.b.zzrD);
                }
            }
        };
    }

    public void cancel() {
        this.zzrE = false;
        this.zzrC.removeCallbacks(this.zzw);
    }

    public void pause() {
        this.zzrF = true;
        if (this.zzrE) {
            this.zzrC.removeCallbacks(this.zzw);
        }
    }

    public void resume() {
        this.zzrF = false;
        if (this.zzrE) {
            this.zzrE = false;
            zza(this.zzrD, this.zzrG);
        }
    }

    public void zza(AdRequestParcel adRequestParcel, long j) {
        if (this.zzrE) {
            zzb.zzaW("An ad refresh is already scheduled.");
            return;
        }
        this.zzrD = adRequestParcel;
        this.zzrE = true;
        this.zzrG = j;
        if (!this.zzrF) {
            zzb.zzaV("Scheduling ad refresh " + j + " milliseconds from now.");
            this.zzrC.postDelayed(this.zzw, j);
        }
    }

    public boolean zzbW() {
        return this.zzrE;
    }

    public void zzg(AdRequestParcel adRequestParcel) {
        zza(adRequestParcel, 60000);
    }
}
