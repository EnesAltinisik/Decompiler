package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import com.google.android.gms.internal.zzda;
import com.google.android.gms.internal.zzdc;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzla;

@zzig
public class zzn extends zzj {
    public zzi zza(Context context, zzla com_google_android_gms_internal_zzla, int i, boolean z, zzdc com_google_android_gms_internal_zzdc, zzda com_google_android_gms_internal_zzda) {
        if (!zzq(context)) {
            return null;
        }
        return new zzc(context, z, zzg(com_google_android_gms_internal_zzla), new zzx(context, com_google_android_gms_internal_zzla.zzjG(), com_google_android_gms_internal_zzla.getRequestId(), com_google_android_gms_internal_zzdc, com_google_android_gms_internal_zzda));
    }
}
