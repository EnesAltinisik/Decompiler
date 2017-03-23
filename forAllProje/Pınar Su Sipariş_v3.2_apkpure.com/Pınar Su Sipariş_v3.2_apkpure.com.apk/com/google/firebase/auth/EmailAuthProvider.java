package com.google.firebase.auth;

import com.google.android.gms.common.internal.zzaa;

public class EmailAuthProvider {
    public static final String PROVIDER_ID = "password";

    private EmailAuthProvider() {
    }

    public static AuthCredential getCredential(String str, String str2) {
        zzaa.zzdl(str);
        zzaa.zzdl(str2);
        return new EmailAuthCredential(str, str2);
    }
}
