package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import java.util.ArrayList;
import java.util.List;

public class Strategy extends AbstractSafeParcelable {
    public static final Strategy BLE_ONLY = new Builder().zzjS(2).setTtlSeconds(TTL_SECONDS_INFINITE).build();
    public static final Creator<Strategy> CREATOR = new zzf();
    public static final Strategy DEFAULT = new Builder().build();
    public static final int DISCOVERY_MODE_BROADCAST = 1;
    public static final int DISCOVERY_MODE_DEFAULT = 3;
    public static final int DISCOVERY_MODE_SCAN = 2;
    public static final int DISTANCE_TYPE_DEFAULT = 0;
    public static final int DISTANCE_TYPE_EARSHOT = 1;
    public static final int TTL_SECONDS_DEFAULT = 300;
    public static final int TTL_SECONDS_INFINITE = Integer.MAX_VALUE;
    public static final int TTL_SECONDS_MAX = 86400;
    @Deprecated
    public static final Strategy zzbiY = BLE_ONLY;
    final int mVersionCode;
    @Deprecated
    final int zzbiZ;
    final int zzbja;
    final int zzbjb;
    @Deprecated
    final boolean zzbjc;
    final int zzbjd;
    final int zzbje;

    public static class Builder {
        private int zzbhZ = 3;
        private int zzbjf = Strategy.TTL_SECONDS_DEFAULT;
        private int zzbjg = 0;
        private int zzbjh = -1;

        public Strategy build() {
            if (this.zzbjh == 2 && this.zzbjg == 1) {
                throw new IllegalStateException("Cannot set EARSHOT with BLE only mode.");
            }
            return new Strategy(2, 0, this.zzbjf, this.zzbjg, false, this.zzbjh, this.zzbhZ);
        }

        public Builder setDiscoveryMode(int i) {
            this.zzbhZ = i;
            return this;
        }

        public Builder setDistanceType(int i) {
            this.zzbjg = i;
            return this;
        }

        public Builder setTtlSeconds(int i) {
            boolean z = i == Strategy.TTL_SECONDS_INFINITE || (i > 0 && i <= Strategy.TTL_SECONDS_MAX);
            zzaa.zzb(z, "mTtlSeconds(%d) must either be TTL_SECONDS_INFINITE, or it must be between 1 and TTL_SECONDS_MAX(%d) inclusive", Integer.valueOf(i), Integer.valueOf(Strategy.TTL_SECONDS_MAX));
            this.zzbjf = i;
            return this;
        }

        public Builder zzjS(int i) {
            this.zzbjh = i;
            return this;
        }
    }

    Strategy(int i, int i2, int i3, int i4, boolean z, int i5, int i6) {
        this.mVersionCode = i;
        this.zzbiZ = i2;
        if (i2 != 0) {
            switch (i2) {
                case 2:
                    this.zzbje = 1;
                    break;
                case 3:
                    this.zzbje = 2;
                    break;
                default:
                    this.zzbje = 3;
                    break;
            }
        }
        this.zzbje = i6;
        this.zzbjb = i4;
        this.zzbjc = z;
        if (z) {
            this.zzbjd = 2;
            this.zzbja = TTL_SECONDS_INFINITE;
            return;
        }
        this.zzbja = i3;
        switch (i5) {
            case -1:
            case 0:
            case 1:
            case 6:
                this.zzbjd = -1;
                return;
            default:
                this.zzbjd = i5;
                return;
        }
    }

    private static String zzjP(int i) {
        switch (i) {
            case 0:
                return "DEFAULT";
            case 1:
                return "EARSHOT";
            default:
                return "UNKNOWN:" + i;
        }
    }

    private static String zzjQ(int i) {
        if (i == -1) {
            return "DEFAULT";
        }
        List arrayList = new ArrayList();
        if ((i & 4) > 0) {
            arrayList.add("ULTRASOUND");
        }
        if ((i & 2) > 0) {
            arrayList.add("BLE");
        }
        return arrayList.isEmpty() ? "UNKNOWN:" + i : arrayList.toString();
    }

    private static String zzjR(int i) {
        if (i == 3) {
            return "DEFAULT";
        }
        List arrayList = new ArrayList();
        if ((i & 1) > 0) {
            arrayList.add("BROADCAST");
        }
        if ((i & 2) > 0) {
            arrayList.add("SCAN");
        }
        return arrayList.isEmpty() ? "UNKNOWN:" + i : arrayList.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        Strategy strategy = (Strategy) obj;
        return this.mVersionCode == strategy.mVersionCode && this.zzbje == strategy.zzbje && this.zzbja == strategy.zzbja && this.zzbjb == strategy.zzbjb && this.zzbjd == strategy.zzbjd;
    }

    public int hashCode() {
        return (((((((this.mVersionCode * 31) + this.zzbje) * 31) + this.zzbja) * 31) + this.zzbjb) * 31) + this.zzbjd;
    }

    public String toString() {
        int i = this.zzbja;
        String valueOf = String.valueOf(zzjP(this.zzbjb));
        String valueOf2 = String.valueOf(zzjQ(this.zzbjd));
        String valueOf3 = String.valueOf(zzjR(this.zzbje));
        return new StringBuilder(((String.valueOf(valueOf).length() + 81) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("Strategy{ttlSeconds=").append(i).append(", distanceType=").append(valueOf).append(", discoveryMedium=").append(valueOf2).append(", discoveryMode=").append(valueOf3).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzf.zza(this, parcel, i);
    }

    public int zzHP() {
        return this.zzbjd;
    }

    public int zzHx() {
        return this.zzbje;
    }
}
