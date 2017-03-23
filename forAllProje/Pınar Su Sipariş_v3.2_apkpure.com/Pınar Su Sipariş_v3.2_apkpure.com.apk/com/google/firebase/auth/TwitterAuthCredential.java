package com.google.firebase.auth;

import com.google.android.gms.common.internal.zzaa;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

public class TwitterAuthCredential extends AuthCredential {
    private String zzabf;
    private String zzbFk;

    TwitterAuthCredential(String str, String str2) {
        this.zzabf = zzaa.zzdl(str);
        this.zzbFk = zzaa.zzdl(str2);
    }

    public static VerifyAssertionRequest zza(TwitterAuthCredential twitterAuthCredential) {
        zzaa.zzz(twitterAuthCredential);
        return new VerifyAssertionRequest(null, twitterAuthCredential.getToken(), twitterAuthCredential.getProvider(), null, twitterAuthCredential.zzOn());
    }

    public String getProvider() {
        return TwitterAuthProvider.PROVIDER_ID;
    }

    public String getToken() {
        return this.zzabf;
    }

    public String zzOn() {
        return this.zzbFk;
    }
}
