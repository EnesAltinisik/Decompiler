package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class NearbyDeviceFilter extends AbstractSafeParcelable {
    public static final Creator<NearbyDeviceFilter> CREATOR = new zzg();
    final int mVersionCode;
    final int zzbjw;
    final byte[] zzbjx;
    final boolean zzbjy;

    NearbyDeviceFilter(int i, int i2, byte[] bArr, boolean z) {
        this.mVersionCode = i;
        this.zzbjw = i2;
        this.zzbjx = bArr;
        this.zzbjy = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzg.zza(this, parcel, i);
    }
}
