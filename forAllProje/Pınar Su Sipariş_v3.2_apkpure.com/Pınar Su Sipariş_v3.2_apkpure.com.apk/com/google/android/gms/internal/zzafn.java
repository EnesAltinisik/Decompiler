package com.google.android.gms.internal;

public class zzafn {
    private final zzafa zzbHw;
    private final long zzbNR;
    private final zzahu zzbNS;
    private final zzaes zzbNT;
    private final boolean zzbNU;

    public zzafn(long j, zzafa com_google_android_gms_internal_zzafa, zzaes com_google_android_gms_internal_zzaes) {
        this.zzbNR = j;
        this.zzbHw = com_google_android_gms_internal_zzafa;
        this.zzbNS = null;
        this.zzbNT = com_google_android_gms_internal_zzaes;
        this.zzbNU = true;
    }

    public zzafn(long j, zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu, boolean z) {
        this.zzbNR = j;
        this.zzbHw = com_google_android_gms_internal_zzafa;
        this.zzbNS = com_google_android_gms_internal_zzahu;
        this.zzbNT = null;
        this.zzbNU = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzafn com_google_android_gms_internal_zzafn = (zzafn) obj;
        if (this.zzbNR != com_google_android_gms_internal_zzafn.zzbNR) {
            return false;
        }
        if (!this.zzbHw.equals(com_google_android_gms_internal_zzafn.zzbHw)) {
            return false;
        }
        if (this.zzbNU != com_google_android_gms_internal_zzafn.zzbNU) {
            return false;
        }
        if (!this.zzbNS == null ? this.zzbNS.equals(com_google_android_gms_internal_zzafn.zzbNS) : com_google_android_gms_internal_zzafn.zzbNS == null) {
            return false;
        }
        if (this.zzbNT != null) {
            if (this.zzbNT.equals(com_google_android_gms_internal_zzafn.zzbNT)) {
                return true;
            }
        } else if (com_google_android_gms_internal_zzafn.zzbNT == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.zzbNS != null ? this.zzbNS.hashCode() : 0) + (((((Long.valueOf(this.zzbNR).hashCode() * 31) + Boolean.valueOf(this.zzbNU).hashCode()) * 31) + this.zzbHw.hashCode()) * 31)) * 31;
        if (this.zzbNT != null) {
            i = this.zzbNT.hashCode();
        }
        return hashCode + i;
    }

    public boolean isVisible() {
        return this.zzbNU;
    }

    public String toString() {
        long j = this.zzbNR;
        String valueOf = String.valueOf(this.zzbHw);
        boolean z = this.zzbNU;
        String valueOf2 = String.valueOf(this.zzbNS);
        String valueOf3 = String.valueOf(this.zzbNT);
        return new StringBuilder(((String.valueOf(valueOf).length() + 78) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("UserWriteRecord{id=").append(j).append(" path=").append(valueOf).append(" visible=").append(z).append(" overwrite=").append(valueOf2).append(" merge=").append(valueOf3).append("}").toString();
    }

    public zzafa zzPn() {
        return this.zzbHw;
    }

    public long zzRN() {
        return this.zzbNR;
    }

    public zzahu zzRO() {
        if (this.zzbNS != null) {
            return this.zzbNS;
        }
        throw new IllegalArgumentException("Can't access overwrite when write is a merge!");
    }

    public zzaes zzRP() {
        if (this.zzbNT != null) {
            return this.zzbNT;
        }
        throw new IllegalArgumentException("Can't access merge when write is an overwrite!");
    }

    public boolean zzRQ() {
        return this.zzbNS != null;
    }
}
