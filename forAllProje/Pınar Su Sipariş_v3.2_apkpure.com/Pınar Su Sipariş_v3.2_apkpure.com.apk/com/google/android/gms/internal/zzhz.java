package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.internal.zzhv.zza;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@zzig
public class zzhz extends zzjv {
    private final zza zzJI;
    private final zzjn.zza zzJJ;
    private final AdResponseParcel zzJK;
    private final zzib zzKi;
    private Future<zzjn> zzKj;
    private final Object zzpp;

    public zzhz(Context context, zzq com_google_android_gms_ads_internal_zzq, zzjn.zza com_google_android_gms_internal_zzjn_zza, zzaq com_google_android_gms_internal_zzaq, zza com_google_android_gms_internal_zzhv_zza) {
        this(com_google_android_gms_internal_zzjn_zza, com_google_android_gms_internal_zzhv_zza, new zzib(context, com_google_android_gms_ads_internal_zzq, new zzkg(context), com_google_android_gms_internal_zzaq, com_google_android_gms_internal_zzjn_zza));
    }

    zzhz(zzjn.zza com_google_android_gms_internal_zzjn_zza, zza com_google_android_gms_internal_zzhv_zza, zzib com_google_android_gms_internal_zzib) {
        this.zzpp = new Object();
        this.zzJJ = com_google_android_gms_internal_zzjn_zza;
        this.zzJK = com_google_android_gms_internal_zzjn_zza.zzPi;
        this.zzJI = com_google_android_gms_internal_zzhv_zza;
        this.zzKi = com_google_android_gms_internal_zzib;
    }

    private zzjn zzK(int i) {
        return new zzjn(this.zzJJ.zzPh.zzLi, null, null, i, null, null, this.zzJK.orientation, this.zzJK.zzEL, this.zzJJ.zzPh.zzLl, false, null, null, null, null, null, this.zzJK.zzLQ, this.zzJJ.zzsB, this.zzJK.zzLO, this.zzJJ.zzPc, this.zzJK.zzLT, this.zzJK.zzLU, this.zzJJ.zzOW, null, null, null, null, this.zzJJ.zzPi.zzMi, this.zzJJ.zzPi.zzMj, null, null);
    }

    public void onStop() {
        synchronized (this.zzpp) {
            if (this.zzKj != null) {
                this.zzKj.cancel(true);
            }
        }
    }

    public void zzbQ() {
        zzjn com_google_android_gms_internal_zzjn;
        int i;
        try {
            synchronized (this.zzpp) {
                this.zzKj = zzjz.zza(this.zzKi);
            }
            com_google_android_gms_internal_zzjn = (zzjn) this.zzKj.get(60000, TimeUnit.MILLISECONDS);
            i = -2;
        } catch (TimeoutException e) {
            zzb.zzaW("Timed out waiting for native ad.");
            this.zzKj.cancel(true);
            i = 2;
            com_google_android_gms_internal_zzjn = null;
        } catch (ExecutionException e2) {
            com_google_android_gms_internal_zzjn = null;
            i = 0;
        } catch (InterruptedException e3) {
            com_google_android_gms_internal_zzjn = null;
            i = 0;
        } catch (CancellationException e4) {
            com_google_android_gms_internal_zzjn = null;
            i = 0;
        }
        if (com_google_android_gms_internal_zzjn == null) {
            com_google_android_gms_internal_zzjn = zzK(i);
        }
        zzka.zzQu.post(new Runnable(this) {
            final /* synthetic */ zzhz b;

            public void run() {
                this.b.zzJI.zzb(com_google_android_gms_internal_zzjn);
            }
        });
    }
}
