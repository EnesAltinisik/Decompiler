package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class CreateWalletObjectsRequest extends AbstractSafeParcelable {
    public static final Creator<CreateWalletObjectsRequest> CREATOR = new zzd();
    private final int mVersionCode;
    LoyaltyWalletObject zzbyQ;
    OfferWalletObject zzbyR;
    GiftCardWalletObject zzbyS;

    CreateWalletObjectsRequest() {
        this.mVersionCode = 3;
    }

    CreateWalletObjectsRequest(int i, LoyaltyWalletObject loyaltyWalletObject, OfferWalletObject offerWalletObject, GiftCardWalletObject giftCardWalletObject) {
        this.mVersionCode = i;
        this.zzbyQ = loyaltyWalletObject;
        this.zzbyR = offerWalletObject;
        this.zzbyS = giftCardWalletObject;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzd.zza(this, parcel, i);
    }
}
