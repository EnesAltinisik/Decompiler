package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;

public final class DiscoveryOptions extends AbstractSafeParcelable {
    public static final Creator<DiscoveryOptions> CREATOR = new zzd();
    final int versionCode;
    private final Strategy zzbhT;

    DiscoveryOptions(int i, Strategy strategy) {
        this.versionCode = i;
        this.zzbhT = strategy;
    }

    public DiscoveryOptions(Strategy strategy) {
        this(1, strategy);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoveryOptions)) {
            return false;
        }
        DiscoveryOptions discoveryOptions = (DiscoveryOptions) obj;
        return this.versionCode == discoveryOptions.versionCode && zzz.equal(this.zzbhT, discoveryOptions.zzbhT);
    }

    public int hashCode() {
        return zzz.hashCode(Integer.valueOf(this.versionCode), this.zzbhT);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzd.zza(this, parcel, i);
    }

    public Strategy zzHw() {
        return this.zzbhT;
    }
}
