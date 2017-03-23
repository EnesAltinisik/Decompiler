package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.drive.events.internal.TransferProgressData;

public final class TransferProgressEvent extends AbstractSafeParcelable implements DriveEvent {
    public static final Creator<TransferProgressEvent> CREATOR = new zzn();
    final int mVersionCode;
    final TransferProgressData zzaws;

    TransferProgressEvent(int i, TransferProgressData transferProgressData) {
        this.mVersionCode = i;
        this.zzaws = transferProgressData;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return zzz.equal(this.zzaws, ((TransferProgressEvent) obj).zzaws);
    }

    public int getType() {
        return 8;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaws);
    }

    public String toString() {
        return String.format("TransferProgressEvent[%s]", new Object[]{this.zzaws.toString()});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzn.zza(this, parcel, i);
    }

    public TransferProgressData zzwj() {
        return this.zzaws;
    }
}
