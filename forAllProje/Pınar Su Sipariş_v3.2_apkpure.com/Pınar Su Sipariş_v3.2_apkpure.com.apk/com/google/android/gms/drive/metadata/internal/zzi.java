package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.drive.DriveFolder;

public class zzi {
    private String zzazs;

    private zzi(String str) {
        this.zzazs = str.toLowerCase();
    }

    public static zzi zzdD(String str) {
        boolean z = str == null || !str.isEmpty();
        zzaa.zzaj(z);
        return str == null ? null : new zzi(str);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        return this.zzazs.equals(((zzi) obj).zzazs);
    }

    public int hashCode() {
        return this.zzazs.hashCode();
    }

    public boolean isFolder() {
        return this.zzazs.equals(DriveFolder.MIME_TYPE);
    }

    public String toString() {
        return this.zzazs;
    }

    public boolean zzwQ() {
        return (zzwR() || isFolder()) ? false : true;
    }

    public boolean zzwR() {
        return this.zzazs.startsWith("application/vnd.google-apps");
    }
}
