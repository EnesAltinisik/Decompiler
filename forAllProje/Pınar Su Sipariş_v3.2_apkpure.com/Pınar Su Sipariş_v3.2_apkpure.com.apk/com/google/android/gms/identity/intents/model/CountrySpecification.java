package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class CountrySpecification extends AbstractSafeParcelable {
    public static final Creator<CountrySpecification> CREATOR = new zza();
    private final int mVersionCode;
    String zzNZ;

    CountrySpecification(int i, String str) {
        this.mVersionCode = i;
        this.zzNZ = str;
    }

    public CountrySpecification(String str) {
        this.mVersionCode = 1;
        this.zzNZ = str;
    }

    public String getCountryCode() {
        return this.zzNZ;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }
}
