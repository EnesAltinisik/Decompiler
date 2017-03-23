package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ParcelableIndexReference extends AbstractSafeParcelable {
    public static final Creator<ParcelableIndexReference> CREATOR = new zzr();
    final int mIndex;
    final int mVersionCode;
    final String zzaBm;
    final boolean zzaBn;
    final int zzaBo;

    ParcelableIndexReference(int i, String str, int i2, boolean z, int i3) {
        this.mVersionCode = i;
        this.zzaBm = str;
        this.mIndex = i2;
        this.zzaBn = z;
        this.zzaBo = i3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzr.zza(this, parcel, i);
    }
}
