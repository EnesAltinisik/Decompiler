package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LoyaltyPoints extends AbstractSafeParcelable {
    public static final Creator<LoyaltyPoints> CREATOR = new zze();
    String label;
    private final int mVersionCode;
    String type;
    LoyaltyPointsBalance zzbBn;
    TimeInterval zzbzD;

    LoyaltyPoints() {
        this.mVersionCode = 1;
    }

    LoyaltyPoints(int i, String str, LoyaltyPointsBalance loyaltyPointsBalance, String str2, TimeInterval timeInterval) {
        this.mVersionCode = i;
        this.label = str;
        this.zzbBn = loyaltyPointsBalance;
        this.type = str2;
        this.zzbzD = timeInterval;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zze.zza(this, parcel, i);
    }
}
