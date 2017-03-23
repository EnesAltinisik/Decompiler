package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.zzs;

@zzig
public class zzhv {

    public interface zza {
        void zzb(zzjn com_google_android_gms_internal_zzjn);
    }

    public zzkc zza(Context context, com.google.android.gms.ads.internal.zza com_google_android_gms_ads_internal_zza, com.google.android.gms.internal.zzjn.zza com_google_android_gms_internal_zzjn_zza, zzaq com_google_android_gms_internal_zzaq, zzla com_google_android_gms_internal_zzla, zzga com_google_android_gms_internal_zzga, zza com_google_android_gms_internal_zzhv_zza, zzdc com_google_android_gms_internal_zzdc) {
        zzkc com_google_android_gms_internal_zzhy;
        AdResponseParcel adResponseParcel = com_google_android_gms_internal_zzjn_zza.zzPi;
        if (adResponseParcel.zzLP) {
            com_google_android_gms_internal_zzhy = new zzhy(context, com_google_android_gms_internal_zzjn_zza, com_google_android_gms_internal_zzga, com_google_android_gms_internal_zzhv_zza, com_google_android_gms_internal_zzdc, com_google_android_gms_internal_zzla);
        } else if (!adResponseParcel.zzvv) {
            com_google_android_gms_internal_zzhy = adResponseParcel.zzLV ? new zzht(context, com_google_android_gms_internal_zzjn_zza, com_google_android_gms_internal_zzla, com_google_android_gms_internal_zzhv_zza) : (((Boolean) zzcu.zzxT.get()).booleanValue() && zzs.zzve() && !zzs.isAtLeastL() && com_google_android_gms_internal_zzla != null && com_google_android_gms_internal_zzla.zzbi().zzvt) ? new zzhx(context, com_google_android_gms_internal_zzjn_zza, com_google_android_gms_internal_zzla, com_google_android_gms_internal_zzhv_zza) : new zzhw(context, com_google_android_gms_internal_zzjn_zza, com_google_android_gms_internal_zzla, com_google_android_gms_internal_zzhv_zza);
        } else if (com_google_android_gms_ads_internal_zza instanceof zzq) {
            com_google_android_gms_internal_zzhy = new zzhz(context, (zzq) com_google_android_gms_ads_internal_zza, com_google_android_gms_internal_zzjn_zza, com_google_android_gms_internal_zzaq, com_google_android_gms_internal_zzhv_zza);
        } else {
            String valueOf = String.valueOf(com_google_android_gms_ads_internal_zza != null ? com_google_android_gms_ads_internal_zza.getClass().getName() : "null");
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 65).append("Invalid NativeAdManager type. Found: ").append(valueOf).append("; Required: NativeAdManager.").toString());
        }
        String str = "AdRenderer: ";
        String valueOf2 = String.valueOf(com_google_android_gms_internal_zzhy.getClass().getName());
        zzb.zzaU(valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str));
        com_google_android_gms_internal_zzhy.zzhs();
        return com_google_android_gms_internal_zzhy;
    }

    public zzkc zza(Context context, com.google.android.gms.internal.zzjn.zza com_google_android_gms_internal_zzjn_zza, zziy com_google_android_gms_internal_zziy) {
        zzkc com_google_android_gms_internal_zzje = new zzje(context, com_google_android_gms_internal_zzjn_zza, com_google_android_gms_internal_zziy);
        String str = "AdRenderer: ";
        String valueOf = String.valueOf(com_google_android_gms_internal_zzje.getClass().getName());
        zzb.zzaU(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        com_google_android_gms_internal_zzje.zzhs();
        return com_google_android_gms_internal_zzje;
    }
}
