package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.drive.DriveSpace;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class ChangesAvailableOptions extends AbstractSafeParcelable {
    public static final Creator<ChangesAvailableOptions> CREATOR = new zzd();
    final int mVersionCode;
    final int zzavZ;
    final boolean zzawa;
    final List<DriveSpace> zzawb;
    private final Set<DriveSpace> zzawc;

    ChangesAvailableOptions(int i, int i2, boolean z, List<DriveSpace> list) {
        this(i, i2, z, list, list == null ? null : new HashSet(list));
    }

    private ChangesAvailableOptions(int i, int i2, boolean z, List<DriveSpace> list, Set<DriveSpace> set) {
        this.mVersionCode = i;
        this.zzavZ = i2;
        this.zzawa = z;
        this.zzawb = list;
        this.zzawc = set;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ChangesAvailableOptions changesAvailableOptions = (ChangesAvailableOptions) obj;
        return zzz.equal(this.zzawc, changesAvailableOptions.zzawc) && this.zzavZ == changesAvailableOptions.zzavZ && this.zzawa == changesAvailableOptions.zzawa;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzawc, Integer.valueOf(this.zzavZ), Boolean.valueOf(this.zzawa));
    }

    public String toString() {
        return String.format(Locale.US, "ChangesAvailableOptions[ChangesSizeLimit=%d, Repeats=%s, Spaces=%s]", new Object[]{Integer.valueOf(this.zzavZ), Boolean.valueOf(this.zzawa), this.zzawb});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzd.zza(this, parcel, i);
    }
}
