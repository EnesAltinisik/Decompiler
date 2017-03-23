package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AttestationData extends AbstractSafeParcelable {
    public static final Creator<AttestationData> CREATOR = new zza();
    public final int mVersionCode;
    private String zzbmE;

    AttestationData(int i, String str) {
        this.mVersionCode = i;
        this.zzbmE = str;
    }

    public String getJwsResult() {
        return this.zzbmE;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }
}
