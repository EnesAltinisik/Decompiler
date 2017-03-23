package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.zzig;

@zzig
public class StringParcel extends AbstractSafeParcelable {
    public static final Creator<StringParcel> CREATOR = new zzo();
    final int mVersionCode;
    String zzAj;

    StringParcel(int i, String str) {
        this.mVersionCode = i;
        this.zzAj = str;
    }

    public StringParcel(String str) {
        this.mVersionCode = 1;
        this.zzAj = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzo.zza(this, parcel, i);
    }

    public String zzhY() {
        return this.zzAj;
    }
}
