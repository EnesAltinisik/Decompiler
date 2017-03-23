package com.google.android.gms.internal;

import android.content.Context;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.overlay.zzg;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zze;
import com.google.android.gms.ads.internal.zzu;
import org.json.JSONObject;

@zzig
public class zzfi implements zzfg {
    private final zzla zzBb;

    public zzfi(Context context, VersionInfoParcel versionInfoParcel, zzaq com_google_android_gms_internal_zzaq) {
        this.zzBb = zzu.zzcl().zza(context, new AdSizeParcel(), false, false, com_google_android_gms_internal_zzaq, versionInfoParcel);
        this.zzBb.getWebView().setWillNotDraw(true);
    }

    private void runOnUiThread(Runnable runnable) {
        if (zzm.zzdQ().zzjs()) {
            runnable.run();
        } else {
            zzka.zzQu.post(runnable);
        }
    }

    public void destroy() {
        this.zzBb.destroy();
    }

    public void zza(zza com_google_android_gms_ads_internal_client_zza, zzg com_google_android_gms_ads_internal_overlay_zzg, zzed com_google_android_gms_internal_zzed, zzp com_google_android_gms_ads_internal_overlay_zzp, boolean z, zzej com_google_android_gms_internal_zzej, zzel com_google_android_gms_internal_zzel, zze com_google_android_gms_ads_internal_zze, zzgx com_google_android_gms_internal_zzgx) {
        this.zzBb.zzjD().zza(com_google_android_gms_ads_internal_client_zza, com_google_android_gms_ads_internal_overlay_zzg, com_google_android_gms_internal_zzed, com_google_android_gms_ads_internal_overlay_zzp, z, com_google_android_gms_internal_zzej, com_google_android_gms_internal_zzel, new zze(this.zzBb.getContext(), false), com_google_android_gms_internal_zzgx, null);
    }

    public void zza(final zzfg.zza com_google_android_gms_internal_zzfg_zza) {
        this.zzBb.zzjD().zza(new zzlb.zza(this) {
            final /* synthetic */ zzfi b;

            public void zza(zzla com_google_android_gms_internal_zzla, boolean z) {
                com_google_android_gms_internal_zzfg_zza.zzft();
            }
        });
    }

    public void zza(String str, zzeh com_google_android_gms_internal_zzeh) {
        this.zzBb.zzjD().zza(str, com_google_android_gms_internal_zzeh);
    }

    public void zza(final String str, final JSONObject jSONObject) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ zzfi c;

            public void run() {
                this.c.zzBb.zza(str, jSONObject);
            }
        });
    }

    public void zzaf(String str) {
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str});
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ zzfi b;

            public void run() {
                this.b.zzBb.loadData(format, "text/html", Constants.ENCODING);
            }
        });
    }

    public void zzag(final String str) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ zzfi b;

            public void run() {
                this.b.zzBb.loadUrl(str);
            }
        });
    }

    public void zzah(final String str) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ zzfi b;

            public void run() {
                this.b.zzBb.loadData(str, "text/html", Constants.ENCODING);
            }
        });
    }

    public void zzb(String str, zzeh com_google_android_gms_internal_zzeh) {
        this.zzBb.zzjD().zzb(str, com_google_android_gms_internal_zzeh);
    }

    public void zzb(String str, JSONObject jSONObject) {
        this.zzBb.zzb(str, jSONObject);
    }

    public zzfl zzfs() {
        return new zzfm(this);
    }

    public void zzh(final String str, final String str2) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ zzfi c;

            public void run() {
                this.c.zzBb.zzh(str, str2);
            }
        });
    }
}
