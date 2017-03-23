package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzlb.zza;
import java.util.concurrent.atomic.AtomicBoolean;

@zzig
public abstract class zzhr implements zzkc<Void>, zza {
    protected final Context mContext;
    protected final zzla zzBb;
    protected final zzhv.zza zzJI;
    protected final zzjn.zza zzJJ;
    protected AdResponseParcel zzJK;
    private Runnable zzJL;
    protected final Object zzJM = new Object();
    private AtomicBoolean zzJN = new AtomicBoolean(true);

    protected zzhr(Context context, zzjn.zza com_google_android_gms_internal_zzjn_zza, zzla com_google_android_gms_internal_zzla, zzhv.zza com_google_android_gms_internal_zzhv_zza) {
        this.mContext = context;
        this.zzJJ = com_google_android_gms_internal_zzjn_zza;
        this.zzJK = this.zzJJ.zzPi;
        this.zzBb = com_google_android_gms_internal_zzla;
        this.zzJI = com_google_android_gms_internal_zzhv_zza;
    }

    private zzjn zzI(int i) {
        AdRequestInfoParcel adRequestInfoParcel = this.zzJJ.zzPh;
        return new zzjn(adRequestInfoParcel.zzLi, this.zzBb, this.zzJK.zzEF, i, this.zzJK.zzEG, this.zzJK.zzLR, this.zzJK.orientation, this.zzJK.zzEL, adRequestInfoParcel.zzLl, this.zzJK.zzLP, null, null, null, null, null, this.zzJK.zzLQ, this.zzJJ.zzsB, this.zzJK.zzLO, this.zzJJ.zzPc, this.zzJK.zzLT, this.zzJK.zzLU, this.zzJJ.zzOW, null, this.zzJK.zzMf, this.zzJK.zzMg, this.zzJK.zzMh, this.zzJK.zzMi, this.zzJK.zzMj, null, this.zzJK.zzEI);
    }

    public void cancel() {
        if (this.zzJN.getAndSet(false)) {
            this.zzBb.stopLoading();
            zzu.zzcm().zzi(this.zzBb);
            zzH(-1);
            zzka.zzQu.removeCallbacks(this.zzJL);
        }
    }

    protected void zzH(int i) {
        if (i != -2) {
            this.zzJK = new AdResponseParcel(i, this.zzJK.zzEL);
        }
        this.zzBb.zzjx();
        this.zzJI.zzb(zzI(i));
    }

    public void zza(zzla com_google_android_gms_internal_zzla, boolean z) {
        int i = 0;
        zzb.zzaU("WebView finished loading.");
        if (this.zzJN.getAndSet(false)) {
            if (z) {
                i = zzhr();
            }
            zzH(i);
            zzka.zzQu.removeCallbacks(this.zzJL);
        }
    }

    public final Void zzhp() {
        zzaa.zzdc("Webview render task needs to be called on UI thread.");
        this.zzJL = new Runnable(this) {
            final /* synthetic */ zzhr a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.zzJN.get()) {
                    zzb.e("Timed out waiting for WebView to finish loading.");
                    this.a.cancel();
                }
            }
        };
        zzka.zzQu.postDelayed(this.zzJL, ((Long) zzcu.zzyI.get()).longValue());
        zzhq();
        return null;
    }

    protected abstract void zzhq();

    protected int zzhr() {
        return -2;
    }

    public /* synthetic */ Object zzhs() {
        return zzhp();
    }
}
