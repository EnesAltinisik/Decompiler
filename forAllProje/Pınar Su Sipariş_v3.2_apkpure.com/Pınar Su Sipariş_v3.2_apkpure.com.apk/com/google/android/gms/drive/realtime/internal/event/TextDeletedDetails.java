package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class TextDeletedDetails extends AbstractSafeParcelable {
    public static final Creator<TextDeletedDetails> CREATOR = new zzf();
    final int mIndex;
    final int mVersionCode;
    final int zzaBO;

    TextDeletedDetails(int i, int i2, int i3) {
        this.mVersionCode = i;
        this.mIndex = i2;
        this.zzaBO = i3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzf.zza(this, parcel, i);
    }
}
