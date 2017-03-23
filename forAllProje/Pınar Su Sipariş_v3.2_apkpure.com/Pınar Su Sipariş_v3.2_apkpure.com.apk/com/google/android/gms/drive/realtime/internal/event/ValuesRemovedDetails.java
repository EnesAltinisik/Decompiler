package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ValuesRemovedDetails extends AbstractSafeParcelable {
    public static final Creator<ValuesRemovedDetails> CREATOR = new zzj();
    final int mIndex;
    final int mVersionCode;
    final String zzaBR;
    final int zzaBS;
    final int zzaBq;
    final int zzaBr;

    ValuesRemovedDetails(int i, int i2, int i3, int i4, String str, int i5) {
        this.mVersionCode = i;
        this.mIndex = i2;
        this.zzaBq = i3;
        this.zzaBr = i4;
        this.zzaBR = str;
        this.zzaBS = i5;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzj.zza(this, parcel, i);
    }
}
