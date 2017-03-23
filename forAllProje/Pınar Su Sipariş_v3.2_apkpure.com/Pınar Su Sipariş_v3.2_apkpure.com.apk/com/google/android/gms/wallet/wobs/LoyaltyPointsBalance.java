package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LoyaltyPointsBalance extends AbstractSafeParcelable {
    public static final Creator<LoyaltyPointsBalance> CREATOR = new zzd();
    private final int mVersionCode;
    int zzbBo;
    String zzbBp;
    double zzbBq;
    long zzbBr;
    int zzbBs;
    String zzbzk;

    LoyaltyPointsBalance() {
        this.mVersionCode = 1;
        this.zzbBs = -1;
        this.zzbBo = -1;
        this.zzbBq = -1.0d;
    }

    LoyaltyPointsBalance(int i, int i2, String str, double d, String str2, long j, int i3) {
        this.mVersionCode = i;
        this.zzbBo = i2;
        this.zzbBp = str;
        this.zzbBq = d;
        this.zzbzk = str2;
        this.zzbBr = j;
        this.zzbBs = i3;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzd.zza(this, parcel, i);
    }
}
