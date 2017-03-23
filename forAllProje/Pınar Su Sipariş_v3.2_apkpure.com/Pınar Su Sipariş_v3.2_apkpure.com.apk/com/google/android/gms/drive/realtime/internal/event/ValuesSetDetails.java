package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ValuesSetDetails extends AbstractSafeParcelable {
    public static final Creator<ValuesSetDetails> CREATOR = new zzk();
    final int mIndex;
    final int mVersionCode;
    final int zzaBq;
    final int zzaBr;

    ValuesSetDetails(int i, int i2, int i3, int i4) {
        this.mVersionCode = i;
        this.mIndex = i2;
        this.zzaBq = i3;
        this.zzaBr = i4;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzk.zza(this, parcel, i);
    }
}
