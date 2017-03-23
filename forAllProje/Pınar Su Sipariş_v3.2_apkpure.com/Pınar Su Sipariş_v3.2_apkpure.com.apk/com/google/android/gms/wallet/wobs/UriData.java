package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class UriData extends AbstractSafeParcelable {
    public static final Creator<UriData> CREATOR = new zzh();
    String description;
    private final int mVersionCode;
    String zzbBw;

    UriData() {
        this.mVersionCode = 1;
    }

    UriData(int i, String str, String str2) {
        this.mVersionCode = i;
        this.zzbBw = str;
        this.description = str2;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzh.zza(this, parcel, i);
    }
}
