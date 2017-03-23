package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.nearby.messages.Strategy;

public final class LocationRequest extends AbstractSafeParcelable {
    public static final LocationRequestCreator CREATOR = new LocationRequestCreator();
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;
    int mPriority;
    private final int mVersionCode;
    boolean zzaIe;
    long zzaUT;
    long zzaVo;
    long zzaVp;
    int zzaVq;
    float zzaVr;
    long zzaVs;

    public LocationRequest() {
        this.mVersionCode = 1;
        this.mPriority = 102;
        this.zzaVo = 3600000;
        this.zzaVp = 600000;
        this.zzaIe = false;
        this.zzaUT = Long.MAX_VALUE;
        this.zzaVq = Strategy.TTL_SECONDS_INFINITE;
        this.zzaVr = 0.0f;
        this.zzaVs = 0;
    }

    LocationRequest(int i, int i2, long j, long j2, boolean z, long j3, int i3, float f, long j4) {
        this.mVersionCode = i;
        this.mPriority = i2;
        this.zzaVo = j;
        this.zzaVp = j2;
        this.zzaIe = z;
        this.zzaUT = j3;
        this.zzaVq = i3;
        this.zzaVr = f;
        this.zzaVs = j4;
    }

    public static LocationRequest create() {
        return new LocationRequest();
    }

    private static void zzQ(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("invalid interval: " + j);
        }
    }

    private static void zzd(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("invalid displacement: " + f);
        }
    }

    private static void zzhV(int i) {
        switch (i) {
            case 100:
            case 102:
            case 104:
            case 105:
                return;
            default:
                throw new IllegalArgumentException("invalid quality: " + i);
        }
    }

    public static String zzhW(int i) {
        switch (i) {
            case 100:
                return "PRIORITY_HIGH_ACCURACY";
            case 102:
                return "PRIORITY_BALANCED_POWER_ACCURACY";
            case 104:
                return "PRIORITY_LOW_POWER";
            case 105:
                return "PRIORITY_NO_POWER";
            default:
                return "???";
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.mPriority == locationRequest.mPriority && this.zzaVo == locationRequest.zzaVo && this.zzaVp == locationRequest.zzaVp && this.zzaIe == locationRequest.zzaIe && this.zzaUT == locationRequest.zzaUT && this.zzaVq == locationRequest.zzaVq && this.zzaVr == locationRequest.zzaVr;
    }

    public long getExpirationTime() {
        return this.zzaUT;
    }

    public long getFastestInterval() {
        return this.zzaVp;
    }

    public long getInterval() {
        return this.zzaVo;
    }

    public long getMaxWaitTime() {
        long j = this.zzaVs;
        return j < this.zzaVo ? this.zzaVo : j;
    }

    public int getNumUpdates() {
        return this.zzaVq;
    }

    public int getPriority() {
        return this.mPriority;
    }

    public float getSmallestDisplacement() {
        return this.zzaVr;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(Integer.valueOf(this.mPriority), Long.valueOf(this.zzaVo), Long.valueOf(this.zzaVp), Boolean.valueOf(this.zzaIe), Long.valueOf(this.zzaUT), Integer.valueOf(this.zzaVq), Float.valueOf(this.zzaVr));
    }

    public LocationRequest setExpirationDuration(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j > Long.MAX_VALUE - elapsedRealtime) {
            this.zzaUT = Long.MAX_VALUE;
        } else {
            this.zzaUT = elapsedRealtime + j;
        }
        if (this.zzaUT < 0) {
            this.zzaUT = 0;
        }
        return this;
    }

    public LocationRequest setExpirationTime(long j) {
        this.zzaUT = j;
        if (this.zzaUT < 0) {
            this.zzaUT = 0;
        }
        return this;
    }

    public LocationRequest setFastestInterval(long j) {
        zzQ(j);
        this.zzaIe = true;
        this.zzaVp = j;
        return this;
    }

    public LocationRequest setInterval(long j) {
        zzQ(j);
        this.zzaVo = j;
        if (!this.zzaIe) {
            this.zzaVp = (long) (((double) this.zzaVo) / 6.0d);
        }
        return this;
    }

    public LocationRequest setMaxWaitTime(long j) {
        zzQ(j);
        this.zzaVs = j;
        return this;
    }

    public LocationRequest setNumUpdates(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("invalid numUpdates: " + i);
        }
        this.zzaVq = i;
        return this;
    }

    public LocationRequest setPriority(int i) {
        zzhV(i);
        this.mPriority = i;
        return this;
    }

    public LocationRequest setSmallestDisplacement(float f) {
        zzd(f);
        this.zzaVr = f;
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request[").append(zzhW(this.mPriority));
        if (this.mPriority != 105) {
            stringBuilder.append(" requested=");
            stringBuilder.append(this.zzaVo).append("ms");
        }
        stringBuilder.append(" fastest=");
        stringBuilder.append(this.zzaVp).append("ms");
        if (this.zzaVs > this.zzaVo) {
            stringBuilder.append(" maxWait=");
            stringBuilder.append(this.zzaVs).append("ms");
        }
        if (this.zzaUT != Long.MAX_VALUE) {
            long elapsedRealtime = this.zzaUT - SystemClock.elapsedRealtime();
            stringBuilder.append(" expireIn=");
            stringBuilder.append(elapsedRealtime).append("ms");
        }
        if (this.zzaVq != Strategy.TTL_SECONDS_INFINITE) {
            stringBuilder.append(" num=").append(this.zzaVq);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        LocationRequestCreator.zza(this, parcel, i);
    }
}
