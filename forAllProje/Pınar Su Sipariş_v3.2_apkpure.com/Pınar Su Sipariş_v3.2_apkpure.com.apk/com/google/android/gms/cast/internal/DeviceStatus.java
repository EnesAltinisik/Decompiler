package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;

public class DeviceStatus extends AbstractSafeParcelable {
    public static final Creator<DeviceStatus> CREATOR = new zzg();
    private final int mVersionCode;
    private double zzafU;
    private boolean zzafV;
    private int zzaii;
    private int zzaij;
    private ApplicationMetadata zzaiu;

    public DeviceStatus() {
        this(3, Double.NaN, false, -1, null, -1);
    }

    DeviceStatus(int i, double d, boolean z, int i2, ApplicationMetadata applicationMetadata, int i3) {
        this.mVersionCode = i;
        this.zzafU = d;
        this.zzafV = z;
        this.zzaii = i2;
        this.zzaiu = applicationMetadata;
        this.zzaij = i3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeviceStatus)) {
            return false;
        }
        DeviceStatus deviceStatus = (DeviceStatus) obj;
        return this.zzafU == deviceStatus.zzafU && this.zzafV == deviceStatus.zzafV && this.zzaii == deviceStatus.zzaii && zzf.zza(this.zzaiu, deviceStatus.zzaiu) && this.zzaij == deviceStatus.zzaij;
    }

    public ApplicationMetadata getApplicationMetadata() {
        return this.zzaiu;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(Double.valueOf(this.zzafU), Boolean.valueOf(this.zzafV), Integer.valueOf(this.zzaii), this.zzaiu, Integer.valueOf(this.zzaij));
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzg.zza(this, parcel, i);
    }

    public boolean zzqD() {
        return this.zzafV;
    }

    public double zzqu() {
        return this.zzafU;
    }

    public int zzqv() {
        return this.zzaii;
    }

    public int zzqw() {
        return this.zzaij;
    }
}
