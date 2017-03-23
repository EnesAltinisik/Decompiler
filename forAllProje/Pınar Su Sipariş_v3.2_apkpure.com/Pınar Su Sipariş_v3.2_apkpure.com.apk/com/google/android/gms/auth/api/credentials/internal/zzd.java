package com.google.android.gms.auth.api.credentials.internal;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.Status;

public final class zzd implements CredentialRequestResult {
    private final Status zzaaO;
    private final Credential zzabU;

    public zzd(Status status, Credential credential) {
        this.zzaaO = status;
        this.zzabU = credential;
    }

    public static zzd zzh(Status status) {
        return new zzd(status, null);
    }

    public Credential getCredential() {
        return this.zzabU;
    }

    public Status getStatus() {
        return this.zzaaO;
    }
}
