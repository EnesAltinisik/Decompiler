package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class FieldChangedDetails extends AbstractSafeParcelable {
    public static final Creator<FieldChangedDetails> CREATOR = new zza();
    final int mVersionCode;
    final int zzaBp;

    FieldChangedDetails(int i, int i2) {
        this.mVersionCode = i;
        this.zzaBp = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }
}
