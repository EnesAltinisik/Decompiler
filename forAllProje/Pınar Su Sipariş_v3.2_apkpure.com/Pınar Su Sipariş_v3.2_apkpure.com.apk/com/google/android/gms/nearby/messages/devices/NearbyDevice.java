package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;

public class NearbyDevice extends AbstractSafeParcelable {
    public static final Creator<NearbyDevice> CREATOR = new zzf();
    private static final NearbyDeviceId[] zzbjp = new NearbyDeviceId[0];
    private static final String[] zzbjq = new String[0];
    public static final NearbyDevice zzbjr = new NearbyDevice("", zzbjp, zzbjq);
    final int mVersionCode;
    @Deprecated
    final String zzE;
    @Deprecated
    final NearbyDeviceId zzbjs;
    private final String zzbjt;
    @Deprecated
    final NearbyDeviceId[] zzbju;
    @Deprecated
    final String[] zzbjv;

    NearbyDevice(int i, NearbyDeviceId nearbyDeviceId, String str, String str2, NearbyDeviceId[] nearbyDeviceIdArr, String[] strArr) {
        this.mVersionCode = ((Integer) zzaa.zzz(Integer.valueOf(i))).intValue();
        if (str2 == null) {
            str2 = "";
        }
        this.zzbjt = str2;
        if (nearbyDeviceIdArr == null) {
            nearbyDeviceIdArr = zzbjp;
        }
        this.zzbju = nearbyDeviceIdArr;
        if (strArr == null) {
            strArr = zzbjq;
        }
        this.zzbjv = strArr;
        this.zzbjs = this.zzbju.length == 0 ? NearbyDeviceId.zzbjz : this.zzbju[0];
        this.zzE = this.zzbjv.length == 0 ? null : this.zzbjv[0];
    }

    @Deprecated
    public NearbyDevice(String str, NearbyDeviceId[] nearbyDeviceIdArr, String[] strArr) {
        this(1, null, null, str, nearbyDeviceIdArr, strArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyDevice)) {
            return false;
        }
        return zzz.equal(this.zzbjt, ((NearbyDevice) obj).zzbjt);
    }

    public int hashCode() {
        return zzz.hashCode(this.zzbjt);
    }

    public String toString() {
        String str = this.zzbjt;
        return new StringBuilder(String.valueOf(str).length() + 21).append("NearbyDevice{handle=").append(str).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzf.zza(this, parcel, i);
    }

    public String zzHW() {
        return this.zzbjt;
    }
}
