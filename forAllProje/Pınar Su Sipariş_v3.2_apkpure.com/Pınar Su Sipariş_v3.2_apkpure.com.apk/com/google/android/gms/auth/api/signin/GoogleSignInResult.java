package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public class GoogleSignInResult implements Result {
    private Status zzaaO;
    private GoogleSignInAccount zzacG;

    public GoogleSignInResult(GoogleSignInAccount googleSignInAccount, Status status) {
        this.zzacG = googleSignInAccount;
        this.zzaaO = status;
    }

    public GoogleSignInAccount getSignInAccount() {
        return this.zzacG;
    }

    public Status getStatus() {
        return this.zzaaO;
    }

    public boolean isSuccess() {
        return this.zzaaO.isSuccess();
    }
}
