package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

public final class OfferWalletObject extends AbstractSafeParcelable {
    public static final Creator<OfferWalletObject> CREATOR = new zzo();
    String id;
    private final int mVersionCode;
    String zzbAg;
    CommonWalletObject zzbzg;

    OfferWalletObject() {
        this.mVersionCode = 3;
    }

    OfferWalletObject(int i, String str, String str2, CommonWalletObject commonWalletObject) {
        this.mVersionCode = i;
        this.zzbAg = str2;
        if (i < 3) {
            this.zzbzg = CommonWalletObject.zzNm().zzhC(str).zzNn();
        } else {
            this.zzbzg = commonWalletObject;
        }
    }

    public String getId() {
        return this.zzbzg.getId();
    }

    public String getRedemptionCode() {
        return this.zzbAg;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzo.zza(this, parcel, i);
    }
}
