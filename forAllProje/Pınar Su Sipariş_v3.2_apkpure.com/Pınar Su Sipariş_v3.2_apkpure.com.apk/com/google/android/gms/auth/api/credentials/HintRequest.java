package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;

public final class HintRequest extends AbstractSafeParcelable {
    public static final Creator<HintRequest> CREATOR = new zzd();
    final int mVersionCode;
    private final String[] zzabE;
    private final CredentialPickerConfig zzabH;
    private final boolean zzabI;
    private final boolean zzabJ;

    public static final class Builder {
        private String[] zzabE;
        private CredentialPickerConfig zzabH = new com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder().build();
        private boolean zzabI;

        public HintRequest build() {
            if (this.zzabE == null) {
                this.zzabE = new String[0];
            }
            if (this.zzabI || this.zzabE.length != 0) {
                return new HintRequest();
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

        public Builder setEmailAddressIdentifierSupported(boolean z) {
            this.zzabI = z;
            return this;
        }

        public Builder setHintPickerConfig(CredentialPickerConfig credentialPickerConfig) {
            this.zzabH = (CredentialPickerConfig) zzaa.zzz(credentialPickerConfig);
            return this;
        }
    }

    HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr) {
        this.mVersionCode = i;
        this.zzabH = (CredentialPickerConfig) zzaa.zzz(credentialPickerConfig);
        this.zzabI = z;
        this.zzabJ = z2;
        this.zzabE = (String[]) zzaa.zzz(strArr);
    }

    private HintRequest(Builder builder) {
        this(1, builder.zzabH, builder.zzabI, false, builder.zzabE);
    }

    public String[] getAccountTypes() {
        return this.zzabE;
    }

    public CredentialPickerConfig getHintPickerConfig() {
        return this.zzabH;
    }

    public boolean isEmailAddressIdentifierSupported() {
        return this.zzabI;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzd.zza(this, parcel, i);
    }

    public boolean zzoX() {
        return this.zzabJ;
    }
}
