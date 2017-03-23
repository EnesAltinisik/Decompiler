package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;

public final class AdvertisingOptions extends AbstractSafeParcelable {
    public static final Creator<AdvertisingOptions> CREATOR = new zza();
    final int versionCode;
    private final Strategy zzbhT;

    AdvertisingOptions(int i, Strategy strategy) {
        this.versionCode = i;
        this.zzbhT = strategy;
    }

    public AdvertisingOptions(Strategy strategy) {
        this(1, strategy);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertisingOptions)) {
            return false;
        }
        AdvertisingOptions advertisingOptions = (AdvertisingOptions) obj;
        return this.versionCode == advertisingOptions.versionCode && zzz.equal(this.zzbhT, advertisingOptions.zzbhT);
    }

    public int hashCode() {
        return zzz.hashCode(Integer.valueOf(this.versionCode), this.zzbhT);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }

    public Strategy zzHw() {
        return this.zzbhT;
    }
}
