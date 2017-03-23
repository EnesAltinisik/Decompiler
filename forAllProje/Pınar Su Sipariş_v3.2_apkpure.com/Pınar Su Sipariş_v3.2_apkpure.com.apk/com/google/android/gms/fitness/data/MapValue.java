package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.fitness.FitnessActivities;

public class MapValue extends AbstractSafeParcelable {
    public static final Creator<MapValue> CREATOR = new zzm();
    private final int mVersionCode;
    private final int zzaDN;
    private final float zzaDS;

    public MapValue(int i, float f) {
        this(1, i, f);
    }

    MapValue(int i, int i2, float f) {
        this.mVersionCode = i;
        this.zzaDN = i2;
        this.zzaDS = f;
    }

    private boolean zza(MapValue mapValue) {
        if (this.zzaDN != mapValue.zzaDN) {
            return false;
        }
        switch (this.zzaDN) {
            case 2:
                return asFloat() == mapValue.asFloat();
            default:
                return this.zzaDS == mapValue.zzaDS;
        }
    }

    public static MapValue zzc(float f) {
        return new MapValue(2, f);
    }

    public float asFloat() {
        zzaa.zza(this.zzaDN == 2, (Object) "Value is not in float format");
        return this.zzaDS;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof MapValue) && zza((MapValue) obj));
    }

    int getFormat() {
        return this.zzaDN;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return (int) this.zzaDS;
    }

    public String toString() {
        switch (this.zzaDN) {
            case 2:
                return Float.toString(asFloat());
            default:
                return FitnessActivities.UNKNOWN;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzm.zza(this, parcel, i);
    }

    float zzxF() {
        return this.zzaDS;
    }
}
