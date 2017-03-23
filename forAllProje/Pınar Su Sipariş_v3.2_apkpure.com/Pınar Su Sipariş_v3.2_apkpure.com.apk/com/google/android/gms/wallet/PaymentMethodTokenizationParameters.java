package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;

public final class PaymentMethodTokenizationParameters extends AbstractSafeParcelable {
    public static final Creator<PaymentMethodTokenizationParameters> CREATOR = new zzq();
    private final int mVersionCode;
    int zzbAh;
    Bundle zzbAi;

    public final class Builder {
        final /* synthetic */ PaymentMethodTokenizationParameters zzbAj;

        private Builder(PaymentMethodTokenizationParameters paymentMethodTokenizationParameters) {
            this.zzbAj = paymentMethodTokenizationParameters;
        }

        public Builder addParameter(String str, String str2) {
            zzaa.zzh(str, "Tokenization parameter name must not be empty");
            zzaa.zzh(str2, "Tokenization parameter value must not be empty");
            this.zzbAj.zzbAi.putString(str, str2);
            return this;
        }

        public PaymentMethodTokenizationParameters build() {
            return this.zzbAj;
        }

        public Builder setPaymentMethodTokenizationType(int i) {
            this.zzbAj.zzbAh = i;
            return this;
        }
    }

    private PaymentMethodTokenizationParameters() {
        this.zzbAi = new Bundle();
        this.mVersionCode = 1;
    }

    PaymentMethodTokenizationParameters(int i, int i2, Bundle bundle) {
        this.zzbAi = new Bundle();
        this.mVersionCode = i;
        this.zzbAh = i2;
        this.zzbAi = bundle;
    }

    public static Builder newBuilder() {
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters = new PaymentMethodTokenizationParameters();
        paymentMethodTokenizationParameters.getClass();
        return new Builder();
    }

    public Bundle getParameters() {
        return new Bundle(this.zzbAi);
    }

    public int getPaymentMethodTokenizationType() {
        return this.zzbAh;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzq.zza(this, parcel, i);
    }
}
