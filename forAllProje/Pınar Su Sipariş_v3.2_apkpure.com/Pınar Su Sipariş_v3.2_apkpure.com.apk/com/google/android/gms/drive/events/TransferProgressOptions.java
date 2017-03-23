package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import java.util.Locale;

public final class TransferProgressOptions extends AbstractSafeParcelable {
    public static final Creator<TransferProgressOptions> CREATOR = new zzo();
    final int mVersionCode;
    final int zzawt;

    TransferProgressOptions(int i, int i2) {
        this.mVersionCode = i;
        this.zzawt = i2;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return zzz.equal(Integer.valueOf(this.zzawt), Integer.valueOf(((TransferProgressOptions) obj).zzawt));
    }

    public int hashCode() {
        return zzz.hashCode(Integer.valueOf(this.zzawt));
    }

    public String toString() {
        return String.format(Locale.US, "TransferProgressOptions[type=%d]", new Object[]{Integer.valueOf(this.zzawt)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzo.zza(this, parcel, i);
    }
}
