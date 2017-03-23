package com.google.android.gms.internal;

import com.google.android.gms.internal.zzafw.zza;

public class zzafu extends zzafw {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzafu.class.desiredAssertionStatus());

    public zzafu(zzafx com_google_android_gms_internal_zzafx, zzafa com_google_android_gms_internal_zzafa) {
        super(zza.ListenComplete, com_google_android_gms_internal_zzafx, com_google_android_gms_internal_zzafa);
        if (!$assertionsDisabled && com_google_android_gms_internal_zzafx.zzSb()) {
            throw new AssertionError("Can't have a listen complete from a user source");
        }
    }

    public String toString() {
        return String.format("ListenComplete { path=%s, source=%s }", new Object[]{zzPn(), zzRZ()});
    }

    public zzafw zzc(zzahi com_google_android_gms_internal_zzahi) {
        return this.zzbHw.isEmpty() ? new zzafu(this.zzbOo, zzafa.zzRq()) : new zzafu(this.zzbOo, this.zzbHw.zzRu());
    }
}
