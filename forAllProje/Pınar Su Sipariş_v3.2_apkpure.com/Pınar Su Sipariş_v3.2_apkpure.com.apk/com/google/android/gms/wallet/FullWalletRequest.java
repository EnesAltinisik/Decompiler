package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class FullWalletRequest extends AbstractSafeParcelable {
    public static final Creator<FullWalletRequest> CREATOR = new zzf();
    private final int mVersionCode;
    String zzbyT;
    String zzbyU;
    Cart zzbze;

    public final class Builder {
        final /* synthetic */ FullWalletRequest zzbzf;

        private Builder(FullWalletRequest fullWalletRequest) {
            this.zzbzf = fullWalletRequest;
        }

        public FullWalletRequest build() {
            return this.zzbzf;
        }

        public Builder setCart(Cart cart) {
            this.zzbzf.zzbze = cart;
            return this;
        }

        public Builder setGoogleTransactionId(String str) {
            this.zzbzf.zzbyT = str;
            return this;
        }

        public Builder setMerchantTransactionId(String str) {
            this.zzbzf.zzbyU = str;
            return this;
        }
    }

    FullWalletRequest() {
        this.mVersionCode = 1;
    }

    FullWalletRequest(int i, String str, String str2, Cart cart) {
        this.mVersionCode = i;
        this.zzbyT = str;
        this.zzbyU = str2;
        this.zzbze = cart;
    }

    public static Builder newBuilder() {
        FullWalletRequest fullWalletRequest = new FullWalletRequest();
        fullWalletRequest.getClass();
        return new Builder();
    }

    public Cart getCart() {
        return this.zzbze;
    }

    public String getGoogleTransactionId() {
        return this.zzbyT;
    }

    public String getMerchantTransactionId() {
        return this.zzbyU;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzf.zza(this, parcel, i);
    }
}
