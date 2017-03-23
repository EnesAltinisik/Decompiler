package com.google.android.gms.ads.internal.request;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.util.zzi;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzkc;
import com.google.android.gms.internal.zzkt;

@zzig
public final class zzc {

    public interface zza {
        void zzb(AdResponseParcel adResponseParcel);
    }

    interface a {
        boolean a(VersionInfoParcel versionInfoParcel);
    }

    class AnonymousClass1 implements a {
        final /* synthetic */ Context a;

        AnonymousClass1(Context context) {
            this.a = context;
        }

        public boolean a(VersionInfoParcel versionInfoParcel) {
            return versionInfoParcel.zzRE || (zzi.zzaC(this.a) && !((Boolean) zzcu.zzxA.get()).booleanValue());
        }
    }

    public static zzkc zza(Context context, VersionInfoParcel versionInfoParcel, zzkt<AdRequestInfoParcel> com_google_android_gms_internal_zzkt_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, zza com_google_android_gms_ads_internal_request_zzc_zza) {
        return zza(context, versionInfoParcel, com_google_android_gms_internal_zzkt_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, com_google_android_gms_ads_internal_request_zzc_zza, new AnonymousClass1(context));
    }

    static zzkc zza(Context context, VersionInfoParcel versionInfoParcel, zzkt<AdRequestInfoParcel> com_google_android_gms_internal_zzkt_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, zza com_google_android_gms_ads_internal_request_zzc_zza, a aVar) {
        return aVar.a(versionInfoParcel) ? zza(context, com_google_android_gms_internal_zzkt_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, com_google_android_gms_ads_internal_request_zzc_zza) : zzb(context, versionInfoParcel, com_google_android_gms_internal_zzkt_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, com_google_android_gms_ads_internal_request_zzc_zza);
    }

    private static zzkc zza(Context context, zzkt<AdRequestInfoParcel> com_google_android_gms_internal_zzkt_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, zza com_google_android_gms_ads_internal_request_zzc_zza) {
        zzb.zzaU("Fetching ad response from local ad request service.");
        zzkc com_google_android_gms_ads_internal_request_zzd_zza = new com.google.android.gms.ads.internal.request.zzd.zza(context, com_google_android_gms_internal_zzkt_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, com_google_android_gms_ads_internal_request_zzc_zza);
        Void voidR = (Void) com_google_android_gms_ads_internal_request_zzd_zza.zzhs();
        return com_google_android_gms_ads_internal_request_zzd_zza;
    }

    private static zzkc zzb(Context context, VersionInfoParcel versionInfoParcel, zzkt<AdRequestInfoParcel> com_google_android_gms_internal_zzkt_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, zza com_google_android_gms_ads_internal_request_zzc_zza) {
        zzb.zzaU("Fetching ad response from remote ad request service.");
        if (zzm.zzdQ().zzQ(context)) {
            return new zzd.zzb(context, versionInfoParcel, com_google_android_gms_internal_zzkt_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, com_google_android_gms_ads_internal_request_zzc_zza);
        }
        zzb.zzaW("Failed to connect to remote ad request service.");
        return null;
    }
}
