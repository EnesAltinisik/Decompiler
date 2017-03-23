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

public final class TransferStateOptions extends AbstractSafeParcelable {
    public static final Creator<TransferStateOptions> CREATOR = new zzr();
    final int mVersionCode;
    final List<DriveSpace> zzawb;
    private final Set<DriveSpace> zzawc;

    TransferStateOptions(int i, List<DriveSpace> list) {
        this(i, list, list == null ? null : new HashSet(list));
    }

    private TransferStateOptions(int i, List<DriveSpace> list, Set<DriveSpace> set) {
        this.mVersionCode = i;
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
        return zzz.equal(this.zzawc, ((TransferStateOptions) obj).zzawc);
    }

    public int hashCode() {
        return zzz.hashCode(this.zzawc);
    }

    public String toString() {
        return String.format(Locale.US, "TransferStateOptions[Spaces=%s]", new Object[]{this.zzawb});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzr.zza(this, parcel, i);
    }
}
