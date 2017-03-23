package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ObjectChangedDetails extends AbstractSafeParcelable {
    public static final Creator<ObjectChangedDetails> CREATOR = new zzb();
    final int mVersionCode;
    final int zzaBq;
    final int zzaBr;

    ObjectChangedDetails(int i, int i2, int i3) {
        this.mVersionCode = i;
        this.zzaBq = i2;
        this.zzaBr = i3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }
}
