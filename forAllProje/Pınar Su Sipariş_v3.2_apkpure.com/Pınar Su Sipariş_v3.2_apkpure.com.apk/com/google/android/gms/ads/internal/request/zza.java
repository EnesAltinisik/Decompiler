package com.google.android.gms.ads.internal.request;

import android.content.Context;
import com.google.android.gms.internal.zzaq;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzjv;
import java.util.concurrent.Future;

@zzig
public class zza {

    public interface zza {
        void zza(com.google.android.gms.internal.zzjn.zza com_google_android_gms_internal_zzjn_zza);
    }

    public zzjv zza(Context context, com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza, zzaq com_google_android_gms_internal_zzaq, zza com_google_android_gms_ads_internal_request_zza_zza) {
        zzjv com_google_android_gms_ads_internal_request_zzn = com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLi.extras.getBundle("sdk_less_server_data") != null ? new zzn(context, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza, com_google_android_gms_ads_internal_request_zza_zza) : new zzb(context, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza, com_google_android_gms_internal_zzaq, com_google_android_gms_ads_internal_request_zza_zza);
        Future future = (Future) com_google_android_gms_ads_internal_request_zzn.zzhs();
        return com_google_android_gms_ads_internal_request_zzn;
    }
}
