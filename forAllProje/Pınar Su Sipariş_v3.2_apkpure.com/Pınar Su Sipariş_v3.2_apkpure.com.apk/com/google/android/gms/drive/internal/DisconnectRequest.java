package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class DisconnectRequest extends AbstractSafeParcelable {
    public static final Creator<DisconnectRequest> CREATOR = new zzr();
    final int mVersionCode;

    public DisconnectRequest() {
        this(1);
    }

    DisconnectRequest(int i) {
        this.mVersionCode = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzr.zza(this, parcel, i);
    }
}
