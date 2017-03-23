package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class BeginCompoundOperationRequest extends AbstractSafeParcelable {
    public static final Creator<BeginCompoundOperationRequest> CREATOR = new zza();
    final String mName;
    final int mVersionCode;
    final boolean zzaBh;
    final boolean zzaBi;

    BeginCompoundOperationRequest(int i, boolean z, String str, boolean z2) {
        this.mVersionCode = i;
        this.zzaBh = z;
        this.mName = str;
        this.zzaBi = z2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }
}
