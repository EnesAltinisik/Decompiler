package com.google.android.gms.internal;

import com.google.firebase.database.DatabaseError;

public class zzagn implements zzagq {
    private final zzafa zzbHw;
    private final zzaew zzbPr;
    private final DatabaseError zzbPs;

    public zzagn(zzaew com_google_android_gms_internal_zzaew, DatabaseError databaseError, zzafa com_google_android_gms_internal_zzafa) {
        this.zzbPr = com_google_android_gms_internal_zzaew;
        this.zzbHw = com_google_android_gms_internal_zzafa;
        this.zzbPs = databaseError;
    }

    public String toString() {
        String valueOf = String.valueOf(zzPn());
        return new StringBuilder(String.valueOf(valueOf).length() + 7).append(valueOf).append(":CANCEL").toString();
    }

    public zzafa zzPn() {
        return this.zzbHw;
    }

    public void zzSu() {
        this.zzbPr.zza(this.zzbPs);
    }
}
