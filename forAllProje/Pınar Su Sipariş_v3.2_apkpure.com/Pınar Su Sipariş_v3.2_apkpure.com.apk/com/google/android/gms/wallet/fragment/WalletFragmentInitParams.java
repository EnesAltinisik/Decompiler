package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public final class WalletFragmentInitParams extends AbstractSafeParcelable {
    public static final Creator<WalletFragmentInitParams> CREATOR = new zza();
    final int mVersionCode;
    private String zzaaR;
    private MaskedWalletRequest zzbAH;
    private MaskedWallet zzbAI;
    private int zzbAV;

    public final class Builder {
        final /* synthetic */ WalletFragmentInitParams zzbAW;

        private Builder(WalletFragmentInitParams walletFragmentInitParams) {
            this.zzbAW = walletFragmentInitParams;
        }

        public WalletFragmentInitParams build() {
            boolean z = true;
            boolean z2 = (this.zzbAW.zzbAI != null && this.zzbAW.zzbAH == null) || (this.zzbAW.zzbAI == null && this.zzbAW.zzbAH != null);
            zzaa.zza(z2, (Object) "Exactly one of MaskedWallet or MaskedWalletRequest is required");
            if (this.zzbAW.zzbAV < 0) {
                z = false;
            }
            zzaa.zza(z, (Object) "masked wallet request code is required and must be non-negative");
            return this.zzbAW;
        }

        public Builder setAccountName(String str) {
            this.zzbAW.zzaaR = str;
            return this;
        }

        public Builder setMaskedWallet(MaskedWallet maskedWallet) {
            this.zzbAW.zzbAI = maskedWallet;
            return this;
        }

        public Builder setMaskedWalletRequest(MaskedWalletRequest maskedWalletRequest) {
            this.zzbAW.zzbAH = maskedWalletRequest;
            return this;
        }

        public Builder setMaskedWalletRequestCode(int i) {
            this.zzbAW.zzbAV = i;
            return this;
        }
    }

    private WalletFragmentInitParams() {
        this.mVersionCode = 1;
        this.zzbAV = -1;
    }

    WalletFragmentInitParams(int i, String str, MaskedWalletRequest maskedWalletRequest, int i2, MaskedWallet maskedWallet) {
        this.mVersionCode = i;
        this.zzaaR = str;
        this.zzbAH = maskedWalletRequest;
        this.zzbAV = i2;
        this.zzbAI = maskedWallet;
    }

    public static Builder newBuilder() {
        WalletFragmentInitParams walletFragmentInitParams = new WalletFragmentInitParams();
        walletFragmentInitParams.getClass();
        return new Builder();
    }

    public String getAccountName() {
        return this.zzaaR;
    }

    public MaskedWallet getMaskedWallet() {
        return this.zzbAI;
    }

    public MaskedWalletRequest getMaskedWalletRequest() {
        return this.zzbAH;
    }

    public int getMaskedWalletRequestCode() {
        return this.zzbAV;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }
}
