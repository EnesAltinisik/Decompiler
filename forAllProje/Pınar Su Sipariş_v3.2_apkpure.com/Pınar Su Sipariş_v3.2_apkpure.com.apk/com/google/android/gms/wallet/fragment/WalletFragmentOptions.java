package com.google.android.gms.wallet.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import com.google.android.gms.R;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class WalletFragmentOptions extends AbstractSafeParcelable {
    public static final Creator<WalletFragmentOptions> CREATOR = new zzb();
    private int mTheme;
    final int mVersionCode;
    private int zzauY;
    private WalletFragmentStyle zzbAX;
    private int zzbAr;

    public final class Builder {
        final /* synthetic */ WalletFragmentOptions zzbAY;

        private Builder(WalletFragmentOptions walletFragmentOptions) {
            this.zzbAY = walletFragmentOptions;
        }

        public WalletFragmentOptions build() {
            return this.zzbAY;
        }

        public Builder setEnvironment(int i) {
            this.zzbAY.zzbAr = i;
            return this;
        }

        public Builder setFragmentStyle(int i) {
            this.zzbAY.zzbAX = new WalletFragmentStyle().setStyleResourceId(i);
            return this;
        }

        public Builder setFragmentStyle(WalletFragmentStyle walletFragmentStyle) {
            this.zzbAY.zzbAX = walletFragmentStyle;
            return this;
        }

        public Builder setMode(int i) {
            this.zzbAY.zzauY = i;
            return this;
        }

        public Builder setTheme(int i) {
            this.zzbAY.mTheme = i;
            return this;
        }
    }

    private WalletFragmentOptions() {
        this.mVersionCode = 1;
        this.zzbAr = 3;
        this.zzbAX = new WalletFragmentStyle();
    }

    WalletFragmentOptions(int i, int i2, int i3, WalletFragmentStyle walletFragmentStyle, int i4) {
        this.mVersionCode = i;
        this.zzbAr = i2;
        this.mTheme = i3;
        this.zzbAX = walletFragmentStyle;
        this.zzauY = i4;
    }

    public static Builder newBuilder() {
        WalletFragmentOptions walletFragmentOptions = new WalletFragmentOptions();
        walletFragmentOptions.getClass();
        return new Builder();
    }

    public static WalletFragmentOptions zzb(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.WalletFragmentOptions);
        int i = obtainStyledAttributes.getInt(R.styleable.WalletFragmentOptions_appTheme, 0);
        int i2 = obtainStyledAttributes.getInt(R.styleable.WalletFragmentOptions_environment, 1);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.WalletFragmentOptions_fragmentStyle, 0);
        int i3 = obtainStyledAttributes.getInt(R.styleable.WalletFragmentOptions_fragmentMode, 1);
        obtainStyledAttributes.recycle();
        WalletFragmentOptions walletFragmentOptions = new WalletFragmentOptions();
        walletFragmentOptions.mTheme = i;
        walletFragmentOptions.zzbAr = i2;
        walletFragmentOptions.zzbAX = new WalletFragmentStyle().setStyleResourceId(resourceId);
        walletFragmentOptions.zzbAX.zzbt(context);
        walletFragmentOptions.zzauY = i3;
        return walletFragmentOptions;
    }

    public int getEnvironment() {
        return this.zzbAr;
    }

    public WalletFragmentStyle getFragmentStyle() {
        return this.zzbAX;
    }

    public int getMode() {
        return this.zzauY;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }

    public void zzbt(Context context) {
        if (this.zzbAX != null) {
            this.zzbAX.zzbt(context);
        }
    }
}
