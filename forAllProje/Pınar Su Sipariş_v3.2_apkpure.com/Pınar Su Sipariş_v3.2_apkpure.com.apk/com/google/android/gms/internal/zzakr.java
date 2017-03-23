package com.google.android.gms.internal;

import java.io.IOException;

public abstract class zzakr<T> {
    public abstract void zza(zzaly com_google_android_gms_internal_zzaly, T t) throws IOException;

    public final zzakf zzaJ(T t) {
        try {
            zzaly com_google_android_gms_internal_zzaln = new zzaln();
            zza(com_google_android_gms_internal_zzaln, t);
            return com_google_android_gms_internal_zzaln.zzWe();
        } catch (Throwable e) {
            throw new zzakg(e);
        }
    }

    public abstract T zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException;
}
