package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;

public class NearbyDeviceId extends AbstractSafeParcelable {
    public static final Creator<NearbyDeviceId> CREATOR = new zzh();
    public static final NearbyDeviceId zzbjz = new NearbyDeviceId();
    final int mVersionCode;
    private final int zzagd;
    private final zzb zzbjA;
    private final zzd zzbjB;
    final byte[] zzbjm;

    private NearbyDeviceId() {
        this(1, 1, null);
    }

    NearbyDeviceId(int i, int i2, byte[] bArr) {
        zzd com_google_android_gms_nearby_messages_devices_zzd = null;
        this.mVersionCode = i;
        this.zzagd = i2;
        this.zzbjm = bArr;
        this.zzbjA = i2 == 2 ? new zzb(bArr) : null;
        if (i2 == 3) {
            com_google_android_gms_nearby_messages_devices_zzd = new zzd(bArr);
        }
        this.zzbjB = com_google_android_gms_nearby_messages_devices_zzd;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyDeviceId)) {
            return false;
        }
        NearbyDeviceId nearbyDeviceId = (NearbyDeviceId) obj;
        return zzz.equal(Integer.valueOf(this.zzagd), Integer.valueOf(nearbyDeviceId.zzagd)) && zzz.equal(this.zzbjm, nearbyDeviceId.zzbjm);
    }

    public int getType() {
        return this.zzagd;
    }

    public int hashCode() {
        return zzz.hashCode(Integer.valueOf(this.zzagd), this.zzbjm);
    }

    public String toString() {
        StringBuilder append = new StringBuilder().append("NearbyDeviceId{");
        switch (this.zzagd) {
            case 1:
                append.append("UNKNOWN");
                break;
            case 2:
                append.append("eddystoneUid=").append(this.zzbjA);
                break;
            case 3:
                append.append("iBeaconId=").append(this.zzbjB);
                break;
        }
        append.append("}");
        return append.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzh.zza(this, parcel, i);
    }
}
