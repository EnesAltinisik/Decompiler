package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzs;
import com.google.android.gms.ads.internal.zzu;

@zzig
public class zzlc {
    public zzla zza(Context context, AdSizeParcel adSizeParcel, boolean z, boolean z2, zzaq com_google_android_gms_internal_zzaq, VersionInfoParcel versionInfoParcel) {
        return zza(context, adSizeParcel, z, z2, com_google_android_gms_internal_zzaq, versionInfoParcel, null, null, null);
    }

    public zzla zza(Context context, AdSizeParcel adSizeParcel, boolean z, boolean z2, zzaq com_google_android_gms_internal_zzaq, VersionInfoParcel versionInfoParcel, zzdc com_google_android_gms_internal_zzdc, zzs com_google_android_gms_ads_internal_zzs, zzd com_google_android_gms_ads_internal_zzd) {
        zzla acVar = new ac(zzle.a(context, adSizeParcel, z, z2, com_google_android_gms_internal_zzaq, versionInfoParcel, com_google_android_gms_internal_zzdc, com_google_android_gms_ads_internal_zzs, com_google_android_gms_ads_internal_zzd));
        acVar.setWebViewClient(zzu.zzcm().zzb(acVar, z2));
        acVar.setWebChromeClient(zzu.zzcm().zzk(acVar));
        return acVar;
    }
}
