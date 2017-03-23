package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class TextInsertedDetails extends AbstractSafeParcelable {
    public static final Creator<TextInsertedDetails> CREATOR = new zzg();
    final int mIndex;
    final int mVersionCode;
    final int zzaBO;

    TextInsertedDetails(int i, int i2, int i3) {
        this.mVersionCode = i;
        this.mIndex = i2;
        this.zzaBO = i3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzg.zza(this, parcel, i);
    }
}
