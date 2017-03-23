package com.google.android.gms.games.multiplayer;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

public final class InvitationBuffer extends zzf<Invitation> {
    public InvitationBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    protected /* synthetic */ Object zzm(int i, int i2) {
        return zzq(i, i2);
    }

    protected Invitation zzq(int i, int i2) {
        return new InvitationRef(this.zzamz, i, i2);
    }

    protected String zzsW() {
        return "external_invitation_id";
    }
}
