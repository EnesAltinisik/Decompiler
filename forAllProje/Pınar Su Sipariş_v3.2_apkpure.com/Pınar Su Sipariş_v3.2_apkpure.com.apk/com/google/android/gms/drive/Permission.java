package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;

public class Permission extends AbstractSafeParcelable {
    public static final Creator<Permission> CREATOR = new zzj();
    final int mVersionCode;
    private String zzavK;
    private int zzavL;
    private String zzavM;
    private String zzavN;
    private int zzavO;
    private boolean zzavP;

    Permission(int i, String str, int i2, String str2, String str3, int i3, boolean z) {
        this.mVersionCode = i;
        this.zzavK = str;
        this.zzavL = i2;
        this.zzavM = str2;
        this.zzavN = str3;
        this.zzavO = i3;
        this.zzavP = z;
    }

    public static boolean zzcP(int i) {
        switch (i) {
            case 256:
            case FileUploadPreferences.BATTERY_USAGE_CHARGING_ONLY /*257*/:
            case 258:
                return true;
            default:
                return false;
        }
    }

    public static boolean zzcQ(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Permission permission = (Permission) obj;
        return zzz.equal(this.zzavK, permission.zzavK) && this.zzavL == permission.zzavL && this.zzavO == permission.zzavO && this.zzavP == permission.zzavP;
    }

    public int getRole() {
        return !zzcQ(this.zzavO) ? -1 : this.zzavO;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzavK, Integer.valueOf(this.zzavL), Integer.valueOf(this.zzavO), Boolean.valueOf(this.zzavP));
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzj.zza(this, parcel, i);
    }

    public String zzvX() {
        return !zzcP(this.zzavL) ? null : this.zzavK;
    }

    public int zzvY() {
        return !zzcP(this.zzavL) ? -1 : this.zzavL;
    }

    public String zzvZ() {
        return this.zzavM;
    }

    public String zzwa() {
        return this.zzavN;
    }

    public boolean zzwb() {
        return this.zzavP;
    }
}
