package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class DeleteRequest extends AbstractSafeParcelable {
    public static final Creator<DeleteRequest> CREATOR = new zzh();
    final int mVersionCode;
    private final Credential zzabU;

    DeleteRequest(int i, Credential credential) {
        this.mVersionCode = i;
        this.zzabU = credential;
    }

    public DeleteRequest(Credential credential) {
        this(1, credential);
    }

    public Credential getCredential() {
        return this.zzabU;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzh.zza(this, parcel, i);
    }
}
