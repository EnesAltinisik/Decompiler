package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class WalletObjectMessage extends AbstractSafeParcelable {
    public static final Creator<WalletObjectMessage> CREATOR = new zzi();
    String body;
    private final int mVersionCode;
    String zzbBt;
    TimeInterval zzbBx;
    UriData zzbBy;
    UriData zzbBz;

    WalletObjectMessage() {
        this.mVersionCode = 1;
    }

    WalletObjectMessage(int i, String str, String str2, TimeInterval timeInterval, UriData uriData, UriData uriData2) {
        this.mVersionCode = i;
        this.zzbBt = str;
        this.body = str2;
        this.zzbBx = timeInterval;
        this.zzbBy = uriData;
        this.zzbBz = uriData2;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzi.zza(this, parcel, i);
    }
}
