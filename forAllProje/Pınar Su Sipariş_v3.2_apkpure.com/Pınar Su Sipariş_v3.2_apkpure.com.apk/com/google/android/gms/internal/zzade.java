package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;

public class zzade implements AuthResult {
    private zzadh zzbGe;

    public zzade(zzadh com_google_android_gms_internal_zzadh) {
        this.zzbGe = (zzadh) zzaa.zzz(com_google_android_gms_internal_zzadh);
    }

    public FirebaseUser getUser() {
        return this.zzbGe;
    }
}
