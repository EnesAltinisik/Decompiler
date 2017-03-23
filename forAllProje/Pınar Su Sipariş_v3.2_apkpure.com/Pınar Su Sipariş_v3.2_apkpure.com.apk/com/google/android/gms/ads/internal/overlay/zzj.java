package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.common.util.zzs;
import com.google.android.gms.internal.zzda;
import com.google.android.gms.internal.zzdc;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzla;

@zzig
public abstract class zzj {
    public abstract zzi zza(Context context, zzla com_google_android_gms_internal_zzla, int i, boolean z, zzdc com_google_android_gms_internal_zzdc, zzda com_google_android_gms_internal_zzda);

    protected boolean zzg(zzla com_google_android_gms_internal_zzla) {
        return com_google_android_gms_internal_zzla.zzbi().zzvt;
    }

    protected boolean zzq(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return zzs.zzva() && (applicationInfo == null || applicationInfo.targetSdkVersion >= 11);
    }
}
