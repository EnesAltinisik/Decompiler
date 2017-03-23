package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.appinvite.AppInviteInvitationResult;
import com.google.android.gms.common.api.Status;

public class zzmi implements AppInviteInvitationResult {
    private final Status zzaaO;
    private final Intent zzaaP;

    public zzmi(Status status, Intent intent) {
        this.zzaaO = status;
        this.zzaaP = intent;
    }

    public Intent getInvitationIntent() {
        return this.zzaaP;
    }

    public Status getStatus() {
        return this.zzaaO;
    }
}
