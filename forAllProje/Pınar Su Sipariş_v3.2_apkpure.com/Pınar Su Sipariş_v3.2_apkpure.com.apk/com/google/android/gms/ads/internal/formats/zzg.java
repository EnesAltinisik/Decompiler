package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzaq;
import com.google.android.gms.internal.zzge;
import com.google.android.gms.internal.zzgf;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzla;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

@zzig
public class zzg extends zzi {
    private zzge zzAR;
    private zzgf zzAS;
    private final zzq zzAT;
    private zzh zzAU;
    private boolean zzAV;
    private Object zzpp;

    private zzg(Context context, zzq com_google_android_gms_ads_internal_zzq, zzaq com_google_android_gms_internal_zzaq) {
        super(context, com_google_android_gms_ads_internal_zzq, null, com_google_android_gms_internal_zzaq, null, null, null, null);
        this.zzAV = false;
        this.zzpp = new Object();
        this.zzAT = com_google_android_gms_ads_internal_zzq;
    }

    public zzg(Context context, zzq com_google_android_gms_ads_internal_zzq, zzaq com_google_android_gms_internal_zzaq, zzge com_google_android_gms_internal_zzge) {
        this(context, com_google_android_gms_ads_internal_zzq, com_google_android_gms_internal_zzaq);
        this.zzAR = com_google_android_gms_internal_zzge;
    }

    public zzg(Context context, zzq com_google_android_gms_ads_internal_zzq, zzaq com_google_android_gms_internal_zzaq, zzgf com_google_android_gms_internal_zzgf) {
        this(context, com_google_android_gms_ads_internal_zzq, com_google_android_gms_internal_zzaq);
        this.zzAS = com_google_android_gms_internal_zzgf;
    }

    public void recordImpression() {
        zzaa.zzdc("recordImpression must be called on the main UI thread.");
        synchronized (this.zzpp) {
            zzp(true);
            if (this.zzAU != null) {
                this.zzAU.recordImpression();
                this.zzAT.recordImpression();
            } else {
                try {
                    if (this.zzAR != null && !this.zzAR.getOverrideImpressionRecording()) {
                        this.zzAR.recordImpression();
                        this.zzAT.recordImpression();
                    } else if (!(this.zzAS == null || this.zzAS.getOverrideImpressionRecording())) {
                        this.zzAS.recordImpression();
                        this.zzAT.recordImpression();
                    }
                } catch (Throwable e) {
                    zzb.zzd("Failed to call recordImpression", e);
                }
            }
        }
    }

    public a zza(OnClickListener onClickListener) {
        return null;
    }

    public void zza(View view, Map<String, WeakReference<View>> map, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        zzaa.zzdc("performClick must be called on the main UI thread.");
        synchronized (this.zzpp) {
            if (this.zzAU != null) {
                this.zzAU.zza(view, map, jSONObject, jSONObject2, jSONObject3);
                this.zzAT.onAdClicked();
            } else {
                try {
                    if (!(this.zzAR == null || this.zzAR.getOverrideClickHandling())) {
                        this.zzAR.zzk(zze.zzD(view));
                        this.zzAT.onAdClicked();
                    }
                    if (!(this.zzAS == null || this.zzAS.getOverrideClickHandling())) {
                        this.zzAS.zzk(zze.zzD(view));
                        this.zzAT.onAdClicked();
                    }
                } catch (Throwable e) {
                    zzb.zzd("Failed to call performClick", e);
                }
            }
        }
    }

    public void zzc(zzh com_google_android_gms_ads_internal_formats_zzh) {
        synchronized (this.zzpp) {
            this.zzAU = com_google_android_gms_ads_internal_formats_zzh;
        }
    }

    public boolean zzeS() {
        boolean z;
        synchronized (this.zzpp) {
            z = this.zzAV;
        }
        return z;
    }

    public zzh zzeT() {
        zzh com_google_android_gms_ads_internal_formats_zzh;
        synchronized (this.zzpp) {
            com_google_android_gms_ads_internal_formats_zzh = this.zzAU;
        }
        return com_google_android_gms_ads_internal_formats_zzh;
    }

    public zzla zzeU() {
        return null;
    }

    public void zzg(View view) {
        synchronized (this.zzpp) {
            this.zzAV = true;
            try {
                if (this.zzAR != null) {
                    this.zzAR.zzl(zze.zzD(view));
                } else if (this.zzAS != null) {
                    this.zzAS.zzl(zze.zzD(view));
                }
            } catch (Throwable e) {
                zzb.zzd("Failed to call prepareAd", e);
            }
            this.zzAV = false;
        }
    }
}
