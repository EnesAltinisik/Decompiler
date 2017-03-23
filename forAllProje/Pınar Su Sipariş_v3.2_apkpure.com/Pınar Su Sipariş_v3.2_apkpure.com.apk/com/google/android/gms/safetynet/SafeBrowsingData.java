package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SafeBrowsingData extends AbstractSafeParcelable {
    public static final Creator<SafeBrowsingData> CREATOR = new zzb();
    public final int mVersionCode;
    private String zzbmF;

    SafeBrowsingData(int i, String str) {
        this.mVersionCode = i;
        this.zzbmF = str;
    }

    public SafeBrowsingData(String str) {
        this(1, str);
    }

    public String getMetadata() {
        return this.zzbmF;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }
}
