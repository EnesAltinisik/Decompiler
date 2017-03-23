package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;

public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Creator<CredentialRequest> CREATOR = new zzc();
    final int mVersionCode;
    private final boolean zzabD;
    private final String[] zzabE;
    private final CredentialPickerConfig zzabF;
    private final CredentialPickerConfig zzabG;

    public static final class Builder {
        private boolean zzabD;
        private String[] zzabE;
        private CredentialPickerConfig zzabF;
        private CredentialPickerConfig zzabG;

        public CredentialRequest build() {
            if (this.zzabE == null) {
                this.zzabE = new String[0];
            }
            if (this.zzabD || this.zzabE.length != 0) {
                return new CredentialRequest();
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }

        public Builder setAccountTypes(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            this.zzabE = strArr;
            return this;
        }

        public Builder setCredentialHintPickerConfig(CredentialPickerConfig credentialPickerConfig) {
            this.zzabG = credentialPickerConfig;
            return this;
        }

        public Builder setCredentialPickerConfig(CredentialPickerConfig credentialPickerConfig) {
            this.zzabF = credentialPickerConfig;
            return this;
        }

        public Builder setPasswordLoginSupported(boolean z) {
            this.zzabD = z;
            return this;
        }

        @Deprecated
        public Builder setSupportsPasswordLogin(boolean z) {
            return setPasswordLoginSupported(z);
        }
    }

    CredentialRequest(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2) {
        this.mVersionCode = i;
        this.zzabD = z;
        this.zzabE = (String[]) zzaa.zzz(strArr);
        if (credentialPickerConfig == null) {
            credentialPickerConfig = new com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder().build();
        }
        this.zzabF = credentialPickerConfig;
        if (credentialPickerConfig2 == null) {
            credentialPickerConfig2 = new com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder().build();
        }
        this.zzabG = credentialPickerConfig2;
    }

    private CredentialRequest(Builder builder) {
        this(2, builder.zzabD, builder.zzabE, builder.zzabF, builder.zzabG);
    }

    public String[] getAccountTypes() {
        return this.zzabE;
    }

    public CredentialPickerConfig getCredentialHintPickerConfig() {
        return this.zzabG;
    }

    public CredentialPickerConfig getCredentialPickerConfig() {
        return this.zzabF;
    }

    @Deprecated
    public boolean getSupportsPasswordLogin() {
        return isPasswordLoginSupported();
    }

    public boolean isPasswordLoginSupported() {
        return this.zzabD;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzc.zza(this, parcel, i);
    }
}
