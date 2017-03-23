package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class OnSyncMoreResponse extends AbstractSafeParcelable {
    public static final Creator<OnSyncMoreResponse> CREATOR = new zzbg();
    final int mVersionCode;
    final boolean zzaxj;

    OnSyncMoreResponse(int i, boolean z) {
        this.mVersionCode = i;
        this.zzaxj = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbg.zza(this, parcel, i);
    }
}
