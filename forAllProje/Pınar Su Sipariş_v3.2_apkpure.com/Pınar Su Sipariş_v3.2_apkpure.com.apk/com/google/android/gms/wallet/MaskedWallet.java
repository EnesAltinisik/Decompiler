package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.identity.intents.model.UserAddress;

public final class MaskedWallet extends AbstractSafeParcelable {
    public static final Creator<MaskedWallet> CREATOR = new zzl();
    private final int mVersionCode;
    String zzbyT;
    String zzbyU;
    String zzbyW;
    Address zzbyX;
    Address zzbyY;
    String[] zzbyZ;
    LoyaltyWalletObject[] zzbzN;
    OfferWalletObject[] zzbzO;
    UserAddress zzbza;
    UserAddress zzbzb;
    InstrumentInfo[] zzbzc;

    public final class Builder {
        final /* synthetic */ MaskedWallet zzbzP;

        private Builder(MaskedWallet maskedWallet) {
            this.zzbzP = maskedWallet;
        }

        public MaskedWallet build() {
            return this.zzbzP;
        }

        public Builder setBillingAddress(Address address) {
            this.zzbzP.zzbyX = address;
            return this;
        }

        public Builder setBuyerBillingAddress(UserAddress userAddress) {
            this.zzbzP.zzbza = userAddress;
            return this;
        }

        public Builder setBuyerShippingAddress(UserAddress userAddress) {
            this.zzbzP.zzbzb = userAddress;
            return this;
        }

        public Builder setEmail(String str) {
            this.zzbzP.zzbyW = str;
            return this;
        }

        public Builder setGoogleTransactionId(String str) {
            this.zzbzP.zzbyT = str;
            return this;
        }

        public Builder setInstrumentInfos(InstrumentInfo[] instrumentInfoArr) {
            this.zzbzP.zzbzc = instrumentInfoArr;
            return this;
        }

        public Builder setMerchantTransactionId(String str) {
            this.zzbzP.zzbyU = str;
            return this;
        }

        public Builder setPaymentDescriptions(String[] strArr) {
            this.zzbzP.zzbyZ = strArr;
            return this;
        }

        public Builder setShippingAddress(Address address) {
            this.zzbzP.zzbyY = address;
            return this;
        }

        @Deprecated
        public Builder zza(LoyaltyWalletObject[] loyaltyWalletObjectArr) {
            this.zzbzP.zzbzN = loyaltyWalletObjectArr;
            return this;
        }

        @Deprecated
        public Builder zza(OfferWalletObject[] offerWalletObjectArr) {
            this.zzbzP.zzbzO = offerWalletObjectArr;
            return this;
        }
    }

    private MaskedWallet() {
        this.mVersionCode = 2;
    }

    MaskedWallet(int i, String str, String str2, String[] strArr, String str3, Address address, Address address2, LoyaltyWalletObject[] loyaltyWalletObjectArr, OfferWalletObject[] offerWalletObjectArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr) {
        this.mVersionCode = i;
        this.zzbyT = str;
        this.zzbyU = str2;
        this.zzbyZ = strArr;
        this.zzbyW = str3;
        this.zzbyX = address;
        this.zzbyY = address2;
        this.zzbzN = loyaltyWalletObjectArr;
        this.zzbzO = offerWalletObjectArr;
        this.zzbza = userAddress;
        this.zzbzb = userAddress2;
        this.zzbzc = instrumentInfoArr;
    }

    public static Builder newBuilderFrom(MaskedWallet maskedWallet) {
        zzaa.zzz(maskedWallet);
        return zzNg().setGoogleTransactionId(maskedWallet.getGoogleTransactionId()).setMerchantTransactionId(maskedWallet.getMerchantTransactionId()).setPaymentDescriptions(maskedWallet.getPaymentDescriptions()).setInstrumentInfos(maskedWallet.getInstrumentInfos()).setEmail(maskedWallet.getEmail()).zza(maskedWallet.zzNh()).zza(maskedWallet.zzNi()).setBuyerBillingAddress(maskedWallet.getBuyerBillingAddress()).setBuyerShippingAddress(maskedWallet.getBuyerShippingAddress());
    }

    public static Builder zzNg() {
        MaskedWallet maskedWallet = new MaskedWallet();
        maskedWallet.getClass();
        return new Builder();
    }

    @Deprecated
    public Address getBillingAddress() {
        return this.zzbyX;
    }

    public UserAddress getBuyerBillingAddress() {
        return this.zzbza;
    }

    public UserAddress getBuyerShippingAddress() {
        return this.zzbzb;
    }

    public String getEmail() {
        return this.zzbyW;
    }

    public String getGoogleTransactionId() {
        return this.zzbyT;
    }

    public InstrumentInfo[] getInstrumentInfos() {
        return this.zzbzc;
    }

    public String getMerchantTransactionId() {
        return this.zzbyU;
    }

    public String[] getPaymentDescriptions() {
        return this.zzbyZ;
    }

    @Deprecated
    public Address getShippingAddress() {
        return this.zzbyY;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzl.zza(this, parcel, i);
    }

    @Deprecated
    public LoyaltyWalletObject[] zzNh() {
        return this.zzbzN;
    }

    @Deprecated
    public OfferWalletObject[] zzNi() {
        return this.zzbzO;
    }
}
