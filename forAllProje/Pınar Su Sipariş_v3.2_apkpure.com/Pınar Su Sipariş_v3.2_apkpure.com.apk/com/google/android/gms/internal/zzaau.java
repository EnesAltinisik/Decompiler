package com.google.android.gms.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public class zzaau implements Result {
    private final Status zzaaO;
    private final zza zzbuZ;
    private final zzabf zzbva;
    private final int zzwP;

    public static class zza {
        private final zzabc zzbtc;
        private final byte[] zzbvb;
        private final long zzbvc;
        private final zzaam zzbvd;

        public zza(zzaam com_google_android_gms_internal_zzaam, byte[] bArr, zzabc com_google_android_gms_internal_zzabc, long j) {
            this.zzbvd = com_google_android_gms_internal_zzaam;
            this.zzbvb = bArr;
            this.zzbtc = com_google_android_gms_internal_zzabc;
            this.zzbvc = j;
        }

        public zza(zzabc com_google_android_gms_internal_zzabc) {
            this(null, null, com_google_android_gms_internal_zzabc, 0);
        }

        public byte[] zzLR() {
            return this.zzbvb;
        }

        public zzaam zzLS() {
            return this.zzbvd;
        }

        public zzabc zzLT() {
            return this.zzbtc;
        }
    }

    public zzaau(Status status, int i) {
        this(status, i, null, null);
    }

    public zzaau(Status status, int i, zza com_google_android_gms_internal_zzaau_zza, zzabf com_google_android_gms_internal_zzabf) {
        this.zzaaO = status;
        this.zzwP = i;
        this.zzbuZ = com_google_android_gms_internal_zzaau_zza;
        this.zzbva = com_google_android_gms_internal_zzabf;
    }

    public int getSource() {
        return this.zzwP;
    }

    public Status getStatus() {
        return this.zzaaO;
    }

    public zza zzLO() {
        return this.zzbuZ;
    }

    public zzabf zzLP() {
        return this.zzbva;
    }

    public String zzLQ() {
        if (this.zzwP == 0) {
            return "Network";
        }
        if (this.zzwP == 1) {
            return "Saved file on disk";
        }
        if (this.zzwP == 2) {
            return "Default resource";
        }
        throw new IllegalStateException("Resource source is unknown.");
    }
}
