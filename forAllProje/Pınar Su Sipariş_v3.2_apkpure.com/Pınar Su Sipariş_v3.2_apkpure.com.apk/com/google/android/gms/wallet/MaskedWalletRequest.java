package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;

public final class MaskedWalletRequest extends AbstractSafeParcelable {
    public static final Creator<MaskedWalletRequest> CREATOR = new zzm();
    private final int mVersionCode;
    ArrayList<CountrySpecification> zzbAa;
    PaymentMethodTokenizationParameters zzbAb;
    ArrayList<Integer> zzbAc;
    String zzbyN;
    String zzbyU;
    boolean zzbzQ;
    boolean zzbzR;
    boolean zzbzS;
    String zzbzT;
    String zzbzU;
    boolean zzbzV;
    boolean zzbzW;
    CountrySpecification[] zzbzX;
    boolean zzbzY;
    boolean zzbzZ;
    Cart zzbze;

    public final class Builder {
        final /* synthetic */ MaskedWalletRequest zzbAd;

        private Builder(MaskedWalletRequest maskedWalletRequest) {
            this.zzbAd = maskedWalletRequest;
        }

        public Builder addAllowedCardNetwork(int i) {
            if (this.zzbAd.zzbAc == null) {
                this.zzbAd.zzbAc = new ArrayList();
            }
            this.zzbAd.zzbAc.add(Integer.valueOf(i));
            return this;
        }

        public Builder addAllowedCardNetworks(Collection<Integer> collection) {
            if (collection != null) {
                if (this.zzbAd.zzbAc == null) {
                    this.zzbAd.zzbAc = new ArrayList();
                }
                this.zzbAd.zzbAc.addAll(collection);
            }
            return this;
        }

        public Builder addAllowedCountrySpecificationForShipping(CountrySpecification countrySpecification) {
            if (this.zzbAd.zzbAa == null) {
                this.zzbAd.zzbAa = new ArrayList();
            }
            this.zzbAd.zzbAa.add(countrySpecification);
            return this;
        }

        public Builder addAllowedCountrySpecificationsForShipping(Collection<CountrySpecification> collection) {
            if (collection != null) {
                if (this.zzbAd.zzbAa == null) {
                    this.zzbAd.zzbAa = new ArrayList();
                }
                this.zzbAd.zzbAa.addAll(collection);
            }
            return this;
        }

        public MaskedWalletRequest build() {
            return this.zzbAd;
        }

        public Builder setAllowDebitCard(boolean z) {
            this.zzbAd.zzbzZ = z;
            return this;
        }

        public Builder setAllowPrepaidCard(boolean z) {
            this.zzbAd.zzbzY = z;
            return this;
        }

        public Builder setCart(Cart cart) {
            this.zzbAd.zzbze = cart;
            return this;
        }

        public Builder setCurrencyCode(String str) {
            this.zzbAd.zzbyN = str;
            return this;
        }

        public Builder setEstimatedTotalPrice(String str) {
            this.zzbAd.zzbzT = str;
            return this;
        }

        @Deprecated
        public Builder setIsBillingAgreement(boolean z) {
            this.zzbAd.zzbzW = z;
            return this;
        }

        public Builder setMerchantName(String str) {
            this.zzbAd.zzbzU = str;
            return this;
        }

        public Builder setMerchantTransactionId(String str) {
            this.zzbAd.zzbyU = str;
            return this;
        }

        public Builder setPaymentMethodTokenizationParameters(PaymentMethodTokenizationParameters paymentMethodTokenizationParameters) {
            this.zzbAd.zzbAb = paymentMethodTokenizationParameters;
            return this;
        }

        public Builder setPhoneNumberRequired(boolean z) {
            this.zzbAd.zzbzQ = z;
            return this;
        }

        public Builder setShippingAddressRequired(boolean z) {
            this.zzbAd.zzbzR = z;
            return this;
        }

        @Deprecated
        public Builder setUseMinimalBillingAddress(boolean z) {
            this.zzbAd.zzbzS = z;
            return this;
        }
    }

    MaskedWalletRequest() {
        this.mVersionCode = 3;
        this.zzbzY = true;
        this.zzbzZ = true;
    }

    MaskedWalletRequest(int i, String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, Cart cart, boolean z4, boolean z5, CountrySpecification[] countrySpecificationArr, boolean z6, boolean z7, ArrayList<CountrySpecification> arrayList, PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, ArrayList<Integer> arrayList2) {
        this.mVersionCode = i;
        this.zzbyU = str;
        this.zzbzQ = z;
        this.zzbzR = z2;
        this.zzbzS = z3;
        this.zzbzT = str2;
        this.zzbyN = str3;
        this.zzbzU = str4;
        this.zzbze = cart;
        this.zzbzV = z4;
        this.zzbzW = z5;
        this.zzbzX = countrySpecificationArr;
        this.zzbzY = z6;
        this.zzbzZ = z7;
        this.zzbAa = arrayList;
        this.zzbAb = paymentMethodTokenizationParameters;
        this.zzbAc = arrayList2;
    }

    public static Builder newBuilder() {
        MaskedWalletRequest maskedWalletRequest = new MaskedWalletRequest();
        maskedWalletRequest.getClass();
        return new Builder();
    }

    public boolean allowDebitCard() {
        return this.zzbzZ;
    }

    public boolean allowPrepaidCard() {
        return this.zzbzY;
    }

    public ArrayList<Integer> getAllowedCardNetworks() {
        return this.zzbAc;
    }

    public ArrayList<CountrySpecification> getAllowedCountrySpecificationsForShipping() {
        return this.zzbAa;
    }

    public CountrySpecification[] getAllowedShippingCountrySpecifications() {
        return this.zzbzX;
    }

    public Cart getCart() {
        return this.zzbze;
    }

    public String getCurrencyCode() {
        return this.zzbyN;
    }

    public String getEstimatedTotalPrice() {
        return this.zzbzT;
    }

    public String getMerchantName() {
        return this.zzbzU;
    }

    public String getMerchantTransactionId() {
        return this.zzbyU;
    }

    public PaymentMethodTokenizationParameters getPaymentMethodTokenizationParameters() {
        return this.zzbAb;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    @Deprecated
    public boolean isBillingAgreement() {
        return this.zzbzW;
    }

    public boolean isPhoneNumberRequired() {
        return this.zzbzQ;
    }

    public boolean isShippingAddressRequired() {
        return this.zzbzR;
    }

    @Deprecated
    public boolean useMinimalBillingAddress() {
        return this.zzbzS;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzm.zza(this, parcel, i);
    }
}
