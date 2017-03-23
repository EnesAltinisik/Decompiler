package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.nearby.messages.zzb;
import java.util.Locale;

public class DistanceImpl extends AbstractSafeParcelable implements zzb {
    public static final Creator<DistanceImpl> CREATOR = new zzc();
    public final int accuracy;
    final int mVersionCode;
    public final double zzbjH;

    public DistanceImpl(int i, double d) {
        this(1, i, d);
    }

    DistanceImpl(int i, int i2, double d) {
        this.mVersionCode = i;
        this.accuracy = i2;
        this.zzbjH = d;
    }

    private static String zzjZ(int i) {
        switch (i) {
            case 1:
                return "LOW";
            default:
                return "UNKNOWN";
        }
    }

    public /* synthetic */ int compareTo(Object obj) {
        return zza((zzb) obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistanceImpl)) {
            return false;
        }
        DistanceImpl distanceImpl = (DistanceImpl) obj;
        return getAccuracy() == distanceImpl.getAccuracy() && zza(distanceImpl) == 0;
    }

    public int getAccuracy() {
        return this.accuracy;
    }

    public int hashCode() {
        return zzz.hashCode(Integer.valueOf(getAccuracy()), Double.valueOf(zzHK()));
    }

    public String toString() {
        return String.format(Locale.US, "(%.1fm, %s)", new Object[]{Double.valueOf(this.zzbjH), zzjZ(this.accuracy)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzc.zza(this, parcel, i);
    }

    public double zzHK() {
        return this.zzbjH;
    }

    public int zza(zzb com_google_android_gms_nearby_messages_zzb) {
        return (Double.isNaN(zzHK()) && Double.isNaN(com_google_android_gms_nearby_messages_zzb.zzHK())) ? 0 : Double.compare(zzHK(), com_google_android_gms_nearby_messages_zzb.zzHK());
    }
}
