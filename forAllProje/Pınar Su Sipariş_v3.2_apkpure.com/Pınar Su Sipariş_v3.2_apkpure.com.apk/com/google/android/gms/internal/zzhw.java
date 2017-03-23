package com.google.android.gms.internal;

import android.content.Context;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.zzlb.zza;

@zzig
public class zzhw extends zzhr implements zza {
    zzhw(Context context, zzjn.zza com_google_android_gms_internal_zzjn_zza, zzla com_google_android_gms_internal_zzla, zzhv.zza com_google_android_gms_internal_zzhv_zza) {
        super(context, com_google_android_gms_internal_zzjn_zza, com_google_android_gms_internal_zzla, com_google_android_gms_internal_zzhv_zza);
    }

    protected void zzhq() {
        if (this.zzJK.errorCode == -2) {
            this.zzBb.zzjD().zza((zza) this);
            zzhx();
            zzb.zzaU("Loading HTML in WebView.");
            this.zzBb.loadDataWithBaseURL(zzu.zzck().zzaN(this.zzJK.zzHH), this.zzJK.body, "text/html", Constants.ENCODING, null);
        }
    }

    protected void zzhx() {
    }
}
