package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

@zzig
public abstract class zziq {
    public abstract void zza(Context context, zzik com_google_android_gms_internal_zzik, VersionInfoParcel versionInfoParcel);

    protected void zze(zzik com_google_android_gms_internal_zzik) {
        com_google_android_gms_internal_zzik.zzic();
        if (com_google_android_gms_internal_zzik.zzia() != null) {
            com_google_android_gms_internal_zzik.zzia().release();
        }
    }
}
