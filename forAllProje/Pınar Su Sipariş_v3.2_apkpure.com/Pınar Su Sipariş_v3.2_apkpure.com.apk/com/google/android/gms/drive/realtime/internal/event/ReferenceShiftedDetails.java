package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ReferenceShiftedDetails extends AbstractSafeParcelable {
    public static final Creator<ReferenceShiftedDetails> CREATOR = new zze();
    final int mVersionCode;
    final String zzaBK;
    final String zzaBL;
    final int zzaBM;
    final int zzaBN;

    ReferenceShiftedDetails(int i, String str, String str2, int i2, int i3) {
        this.mVersionCode = i;
        this.zzaBK = str;
        this.zzaBL = str2;
        this.zzaBM = i2;
        this.zzaBN = i3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zze.zza(this, parcel, i);
    }
}
