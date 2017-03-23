package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class OnLoadRealtimeResponse extends AbstractSafeParcelable {
    public static final Creator<OnLoadRealtimeResponse> CREATOR = new zzbd();
    final int mVersionCode;
    final boolean zzru;

    OnLoadRealtimeResponse(int i, boolean z) {
        this.mVersionCode = i;
        this.zzru = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbd.zza(this, parcel, i);
    }
}
