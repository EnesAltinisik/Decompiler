package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class CredentialPickerConfig extends AbstractSafeParcelable {
    public static final Creator<CredentialPickerConfig> CREATOR = new zzb();
    private final boolean mShowCancelButton;
    final int mVersionCode;
    private final boolean zzabB;
    private final boolean zzabC;

    public static class Builder {
        private boolean mShowCancelButton = true;
        private boolean zzabB = false;
        private boolean zzabC = false;

        public CredentialPickerConfig build() {
            return new CredentialPickerConfig();
        }

        public Builder setForNewAccount(boolean z) {
            this.zzabC = z;
            return this;
        }

        public Builder setShowAddAccountButton(boolean z) {
            this.zzabB = z;
            return this;
        }

        public Builder setShowCancelButton(boolean z) {
            this.mShowCancelButton = z;
            return this;
        }
    }

    CredentialPickerConfig(int i, boolean z, boolean z2, boolean z3) {
        this.mVersionCode = i;
        this.zzabB = z;
        this.mShowCancelButton = z2;
        this.zzabC = z3;
    }

    private CredentialPickerConfig(Builder builder) {
        this(1, builder.zzabB, builder.mShowCancelButton, builder.zzabC);
    }

    public boolean isForNewAccount() {
        return this.zzabC;
    }

    public boolean shouldShowAddAccountButton() {
        return this.zzabB;
    }

    public boolean shouldShowCancelButton() {
        return this.mShowCancelButton;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }
}
