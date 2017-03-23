package com.google.android.gms.nearby.bootstrap;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;

public class Device extends AbstractSafeParcelable {
    public static final Creator<Device> CREATOR = new zzb();
    private final String description;
    private final String name;
    final int versionCode;
    private final String zzbhJ;
    private final byte zzbhK;

    Device(int i, String str, String str2, String str3, byte b) {
        this.versionCode = i;
        this.name = zzaa.zzdl(str);
        this.description = (String) zzaa.zzz(str2);
        this.zzbhJ = (String) zzaa.zzz(str3);
        zzaa.zzb(b <= (byte) 4, (Object) "Unknown device type");
        this.zzbhK = b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Device)) {
            return false;
        }
        Device device = (Device) obj;
        return this.name.equals(device.name) && this.description.equals(device.description) && this.zzbhK == device.zzbhK && this.zzbhJ.equals(device.zzbhJ);
    }

    public String getDescription() {
        return this.description;
    }

    public String getDeviceId() {
        return this.zzbhJ;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((this.zzbhK * 31) * 31) * 31) + ((this.zzbhJ.hashCode() * 31) * 31)) + (this.name.hashCode() * 31)) + this.description.hashCode();
    }

    public String toString() {
        String str = this.name;
        String str2 = this.description;
        return new StringBuilder((String.valueOf(str).length() + 8) + String.valueOf(str2).length()).append(str).append(": ").append(str2).append("[").append(this.zzbhK).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }

    public byte zzHn() {
        return this.zzbhK;
    }
}
