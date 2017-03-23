package com.google.firebase.auth;

import com.google.android.gms.common.internal.zzaa;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

public class FacebookAuthCredential extends AuthCredential {
    private final String zzbmS;

    FacebookAuthCredential(String str) {
        this.zzbmS = zzaa.zzdl(str);
    }

    public static VerifyAssertionRequest zza(FacebookAuthCredential facebookAuthCredential) {
        zzaa.zzz(facebookAuthCredential);
        return new VerifyAssertionRequest(null, facebookAuthCredential.getAccessToken(), facebookAuthCredential.getProvider(), null, null);
    }

    public String getAccessToken() {
        return this.zzbmS;
    }

    public String getProvider() {
        return FacebookAuthProvider.PROVIDER_ID;
    }
}
