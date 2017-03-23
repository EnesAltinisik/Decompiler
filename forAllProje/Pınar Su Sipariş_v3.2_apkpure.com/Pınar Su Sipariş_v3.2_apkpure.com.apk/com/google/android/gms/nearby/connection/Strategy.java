package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzz;

public final class Strategy implements SafeParcelable {
    public static final Creator<Strategy> CREATOR = new zze();
    public static final Strategy zzbhW = new Strategy(3, 3);
    public static final Strategy zzbhX = new Strategy(1, 1);
    public static final Strategy zzbhY = new Strategy(1, 2);
    final int versionCode;
    private final int zzbhZ;
    private final int zzbia;

    private Strategy(int i, int i2) {
        this(1, i, i2);
    }

    Strategy(int i, int i2, int i3) {
        this.versionCode = i;
        this.zzbhZ = i2;
        this.zzbia = i3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        Strategy strategy = (Strategy) obj;
        return this.zzbhZ == strategy.zzbhZ && this.zzbia == strategy.zzbia;
    }

    int getConnectionType() {
        return this.zzbia;
    }

    public int hashCode() {
        return zzz.hashCode(Integer.valueOf(this.zzbhZ), Integer.valueOf(this.zzbia));
    }

    public String toString() {
        int i = this.zzbhZ;
        return "Strategy{discoveryMode=" + i + ", connectionType=" + this.zzbia + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        zze.zza(this, parcel, i);
    }

    int zzHx() {
        return this.zzbhZ;
    }
}
