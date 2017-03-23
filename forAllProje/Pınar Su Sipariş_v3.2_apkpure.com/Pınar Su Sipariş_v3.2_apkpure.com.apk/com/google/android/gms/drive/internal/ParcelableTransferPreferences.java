package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ParcelableTransferPreferences extends AbstractSafeParcelable {
    public static final Creator<ParcelableTransferPreferences> CREATOR = new zzbk();
    final int mVersionCode;
    final boolean zzayV;
    final int zzayh;
    final int zzayi;

    ParcelableTransferPreferences(int i, int i2, int i3, boolean z) {
        this.mVersionCode = i;
        this.zzayh = i2;
        this.zzayi = i3;
        this.zzayV = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbk.zza(this, parcel, i);
    }
}
