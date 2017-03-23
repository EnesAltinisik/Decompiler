package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;

public class ApplicationStatus extends AbstractSafeParcelable {
    public static final Creator<ApplicationStatus> CREATOR = new zza();
    private final int mVersionCode;
    private String zzahR;

    public ApplicationStatus() {
        this(1, null);
    }

    ApplicationStatus(int i, String str) {
        this.mVersionCode = i;
        this.zzahR = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApplicationStatus)) {
            return false;
        }
        return zzf.zza(this.zzahR, ((ApplicationStatus) obj).zzahR);
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzahR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }

    public String zzqn() {
        return this.zzahR;
    }
}
