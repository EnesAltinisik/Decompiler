package com.google.firebase.auth;

import com.google.android.gms.common.internal.zzaa;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

public class GithubAuthCredential extends AuthCredential {
    private String zzabf;

    GithubAuthCredential(String str) {
        this.zzabf = zzaa.zzdl(str);
    }

    public static VerifyAssertionRequest zza(GithubAuthCredential githubAuthCredential) {
        zzaa.zzz(githubAuthCredential);
        return new VerifyAssertionRequest(null, githubAuthCredential.getToken(), githubAuthCredential.getProvider(), null, null);
    }

    public String getProvider() {
        return GithubAuthProvider.PROVIDER_ID;
    }

    public String getToken() {
        return this.zzabf;
    }
}
