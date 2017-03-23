package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ValueChangedDetails extends AbstractSafeParcelable {
    public static final Creator<ValueChangedDetails> CREATOR = new zzh();
    final int mVersionCode;
    final int zzaBp;

    ValueChangedDetails(int i, int i2) {
        this.mVersionCode = i;
        this.zzaBp = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzh.zza(this, parcel, i);
    }
}
