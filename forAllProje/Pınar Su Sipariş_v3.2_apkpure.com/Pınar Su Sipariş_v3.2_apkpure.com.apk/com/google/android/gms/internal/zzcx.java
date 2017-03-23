package com.google.android.gms.internal;

import android.text.TextUtils;

@zzig
public class zzcx {
    public zzcw zza(zzcv com_google_android_gms_internal_zzcv) {
        if (com_google_android_gms_internal_zzcv == null) {
            throw new IllegalArgumentException("CSI configuration can't be null. ");
        } else if (!com_google_android_gms_internal_zzcv.zzet()) {
            zzjw.v("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
            return null;
        } else if (com_google_android_gms_internal_zzcv.getContext() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (!TextUtils.isEmpty(com_google_android_gms_internal_zzcv.zzdf())) {
            return new zzcw(com_google_android_gms_internal_zzcv.getContext(), com_google_android_gms_internal_zzcv.zzdf(), com_google_android_gms_internal_zzcv.zzeu(), com_google_android_gms_internal_zzcv.zzev());
        } else {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
    }
}
