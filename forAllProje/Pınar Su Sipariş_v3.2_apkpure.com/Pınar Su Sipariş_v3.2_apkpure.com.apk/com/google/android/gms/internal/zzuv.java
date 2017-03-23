package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.tagmanager.zzax;
import com.google.android.gms.tagmanager.zzba;

public class zzuv {
    private final Context mContext;
    private final String zzbnR;
    private final zzba zzbsk;
    private final zzax zzbsq;

    public zzuv(Context context, zzba com_google_android_gms_tagmanager_zzba, zzax com_google_android_gms_tagmanager_zzax, String str) {
        this.mContext = context.getApplicationContext();
        this.zzbsk = com_google_android_gms_tagmanager_zzba;
        this.zzbsq = com_google_android_gms_tagmanager_zzax;
        this.zzbnR = str;
    }

    public zzuu zza(zzabc com_google_android_gms_internal_zzabc, zzabf com_google_android_gms_internal_zzabf) {
        return new zzuu(this.mContext, this.zzbnR, com_google_android_gms_internal_zzabc, com_google_android_gms_internal_zzabf, this.zzbsk, this.zzbsq);
    }
}
