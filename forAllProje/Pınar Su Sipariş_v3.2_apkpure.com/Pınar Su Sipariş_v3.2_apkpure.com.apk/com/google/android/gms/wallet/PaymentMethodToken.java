package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class PaymentMethodToken extends AbstractSafeParcelable {
    public static final Creator<PaymentMethodToken> CREATOR = new zzp();
    private final int mVersionCode;
    int zzbAh;
    String zzbhP;

    private PaymentMethodToken() {
        this.mVersionCode = 1;
    }

    PaymentMethodToken(int i, int i2, String str) {
        this.mVersionCode = i;
        this.zzbAh = i2;
        this.zzbhP = str;
    }

    public int getPaymentMethodTokenizationType() {
        return this.zzbAh;
    }

    public String getToken() {
        return this.zzbhP;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzp.zza(this, parcel, i);
    }
}
