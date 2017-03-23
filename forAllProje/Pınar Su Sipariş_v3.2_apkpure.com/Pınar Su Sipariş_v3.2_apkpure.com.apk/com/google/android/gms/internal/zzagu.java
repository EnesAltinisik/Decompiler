package com.google.android.gms.internal;

import java.util.Map;

public class zzagu {
    private final zzafa zzbHw;
    private final zzagt zzbHz;

    public zzagu(zzafa com_google_android_gms_internal_zzafa, zzagt com_google_android_gms_internal_zzagt) {
        this.zzbHw = com_google_android_gms_internal_zzafa;
        this.zzbHz = com_google_android_gms_internal_zzagt;
    }

    public static zzagu zzN(zzafa com_google_android_gms_internal_zzafa) {
        return new zzagu(com_google_android_gms_internal_zzafa, zzagt.zzbPK);
    }

    public static zzagu zzb(zzafa com_google_android_gms_internal_zzafa, Map<String, Object> map) {
        return new zzagu(com_google_android_gms_internal_zzafa, zzagt.zzaA(map));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzagu com_google_android_gms_internal_zzagu = (zzagu) obj;
        return !this.zzbHw.equals(com_google_android_gms_internal_zzagu.zzbHw) ? false : this.zzbHz.equals(com_google_android_gms_internal_zzagu.zzbHz);
    }

    public int hashCode() {
        return (this.zzbHw.hashCode() * 31) + this.zzbHz.hashCode();
    }

    public boolean isDefault() {
        return this.zzbHz.isDefault();
    }

    public String toString() {
        String valueOf = String.valueOf(this.zzbHw);
        String valueOf2 = String.valueOf(this.zzbHz);
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append(":").append(valueOf2).toString();
    }

    public zzafa zzPn() {
        return this.zzbHw;
    }

    public zzaho zzSK() {
        return this.zzbHz.zzSK();
    }

    public boolean zzSO() {
        return this.zzbHz.zzSO();
    }

    public zzagt zzSR() {
        return this.zzbHz;
    }
}
