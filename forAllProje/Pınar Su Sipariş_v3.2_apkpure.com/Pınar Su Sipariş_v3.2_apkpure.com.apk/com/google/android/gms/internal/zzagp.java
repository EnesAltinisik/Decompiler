package com.google.android.gms.internal;

import com.google.android.gms.internal.zzagq.zza;
import com.google.firebase.database.DataSnapshot;

public class zzagp implements zzagq {
    private final zzaew zzbPr;
    private final zza zzbPt;
    private final DataSnapshot zzbPx;
    private final String zzbPy;

    public zzagp(zza com_google_android_gms_internal_zzagq_zza, zzaew com_google_android_gms_internal_zzaew, DataSnapshot dataSnapshot, String str) {
        this.zzbPt = com_google_android_gms_internal_zzagq_zza;
        this.zzbPr = com_google_android_gms_internal_zzaew;
        this.zzbPx = dataSnapshot;
        this.zzbPy = str;
    }

    public String toString() {
        if (this.zzbPt == zza.VALUE) {
            String valueOf = String.valueOf(zzPn());
            String valueOf2 = String.valueOf(this.zzbPt);
            String valueOf3 = String.valueOf(this.zzbPx.getValue(true));
            return new StringBuilder(((String.valueOf(valueOf).length() + 4) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(valueOf).append(": ").append(valueOf2).append(": ").append(valueOf3).toString();
        }
        valueOf = String.valueOf(zzPn());
        valueOf2 = String.valueOf(this.zzbPt);
        valueOf3 = String.valueOf(this.zzbPx.getKey());
        String valueOf4 = String.valueOf(this.zzbPx.getValue(true));
        return new StringBuilder((((String.valueOf(valueOf).length() + 10) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append(valueOf).append(": ").append(valueOf2).append(": { ").append(valueOf3).append(": ").append(valueOf4).append(" }").toString();
    }

    public zzafa zzPn() {
        zzafa zzPn = this.zzbPx.getRef().zzPn();
        return this.zzbPt == zza.VALUE ? zzPn : zzPn.zzRv();
    }

    public String zzSA() {
        return this.zzbPy;
    }

    public void zzSu() {
        this.zzbPr.zza(this);
    }

    public zza zzSw() {
        return this.zzbPt;
    }

    public DataSnapshot zzSz() {
        return this.zzbPx;
    }
}
