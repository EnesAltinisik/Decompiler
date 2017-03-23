package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;

public class Feature extends AbstractSafeParcelable {
    public static final zze CREATOR = new zze();
    public final int id;
    final int mVersionCode;
    final Bundle zzZL;

    Feature(int i, int i2, Bundle bundle) {
        this.mVersionCode = i;
        this.id = i2;
        this.zzZL = bundle;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) obj;
        return zzz.equal(Integer.valueOf(feature.id), Integer.valueOf(this.id)) && zzz.equal(feature.zzZL, this.zzZL);
    }

    public int hashCode() {
        return zzz.hashCode(Integer.valueOf(this.id), this.zzZL);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zze com_google_android_gms_appdatasearch_zze = CREATOR;
        zze.zza(this, parcel, i);
    }
}
