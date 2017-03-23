package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class GeneratePasswordRequest extends AbstractSafeParcelable {
    public static final Creator<GeneratePasswordRequest> CREATOR = new zzi();
    final int mVersionCode;
    private final PasswordSpecification zzabu;

    GeneratePasswordRequest(int i, PasswordSpecification passwordSpecification) {
        this.mVersionCode = i;
        this.zzabu = passwordSpecification;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzi.zza(this, parcel, i);
    }

    public PasswordSpecification zzoU() {
        return this.zzabu;
    }
}
