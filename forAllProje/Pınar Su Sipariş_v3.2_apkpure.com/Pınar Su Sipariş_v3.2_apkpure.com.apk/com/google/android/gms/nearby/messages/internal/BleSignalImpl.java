package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.internal.zzamj;
import com.google.android.gms.nearby.messages.zza;

public class BleSignalImpl extends AbstractSafeParcelable implements zza {
    public static final Creator<BleSignalImpl> CREATOR = new zza();
    final int mVersionCode;
    public final int zzbjC;
    public final int zzbjD;

    BleSignalImpl(int i, int i2, int i3) {
        this.mVersionCode = i;
        this.zzbjC = i2;
        if (-128 >= i3 || i3 >= 128) {
            i3 = zzamj.UNSET_ENUM_VALUE;
        }
        this.zzbjD = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zza)) {
            return false;
        }
        zza com_google_android_gms_nearby_messages_zza = (zza) obj;
        return this.zzbjC == com_google_android_gms_nearby_messages_zza.getRssi() && this.zzbjD == com_google_android_gms_nearby_messages_zza.zzHJ();
    }

    public int getRssi() {
        return this.zzbjC;
    }

    public int hashCode() {
        return zzz.hashCode(Integer.valueOf(this.zzbjC), Integer.valueOf(this.zzbjD));
    }

    public String toString() {
        int i = this.zzbjC;
        return "BleSignal{rssi=" + i + ", txPower=" + this.zzbjD + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }

    public int zzHJ() {
        return this.zzbjD;
    }
}
