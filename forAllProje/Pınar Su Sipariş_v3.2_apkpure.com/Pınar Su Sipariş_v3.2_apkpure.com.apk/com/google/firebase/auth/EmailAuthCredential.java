package com.google.firebase.auth;

import com.google.android.gms.common.internal.zzaa;

public class EmailAuthCredential extends AuthCredential {
    private String zzabx;
    private String zzacn;

    EmailAuthCredential(String str, String str2) {
        this.zzacn = zzaa.zzdl(str);
        this.zzabx = zzaa.zzdl(str2);
    }

    public String getEmail() {
        return this.zzacn;
    }

    public String getPassword() {
        return this.zzabx;
    }

    public String getProvider() {
        return EmailAuthProvider.PROVIDER_ID;
    }
}
