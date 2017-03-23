package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class UserMetadata extends AbstractSafeParcelable {
    public static final Creator<UserMetadata> CREATOR = new zzl();
    final int mVersionCode;
    final String zzaco;
    final String zzavS;
    final String zzavT;
    final boolean zzavU;
    final String zzavV;

    UserMetadata(int i, String str, String str2, String str3, boolean z, String str4) {
        this.mVersionCode = i;
        this.zzavS = str;
        this.zzaco = str2;
        this.zzavT = str3;
        this.zzavU = z;
        this.zzavV = str4;
    }

    public UserMetadata(String str, String str2, String str3, boolean z, String str4) {
        this(1, str, str2, str3, z, str4);
    }

    public String toString() {
        return String.format("Permission ID: '%s', Display Name: '%s', Picture URL: '%s', Authenticated User: %b, Email: '%s'", new Object[]{this.zzavS, this.zzaco, this.zzavT, Boolean.valueOf(this.zzavU), this.zzavV});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzl.zza(this, parcel, i);
    }
}
