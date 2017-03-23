package com.google.firebase.auth;

import com.google.android.gms.common.internal.zzaa;
import com.google.firebase.FirebaseException;

public class FirebaseAuthException extends FirebaseException {
    private final String zzbFj;

    public FirebaseAuthException(String str, String str2) {
        super(str2);
        this.zzbFj = zzaa.zzdl(str);
    }

    public String getErrorCode() {
        return this.zzbFj;
    }
}
