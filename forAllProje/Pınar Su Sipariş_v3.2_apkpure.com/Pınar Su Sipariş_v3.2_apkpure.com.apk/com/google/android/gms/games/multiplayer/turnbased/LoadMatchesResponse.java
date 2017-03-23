package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.constants.TurnBasedMatchTurnStatus;
import com.google.android.gms.games.multiplayer.InvitationBuffer;

public final class LoadMatchesResponse {
    private final InvitationBuffer zzaRg;
    private final TurnBasedMatchBuffer zzaRh;
    private final TurnBasedMatchBuffer zzaRi;
    private final TurnBasedMatchBuffer zzaRj;

    public LoadMatchesResponse(Bundle bundle) {
        DataHolder zza = zza(bundle, 0);
        if (zza != null) {
            this.zzaRg = new InvitationBuffer(zza);
        } else {
            this.zzaRg = null;
        }
        zza = zza(bundle, 1);
        if (zza != null) {
            this.zzaRh = new TurnBasedMatchBuffer(zza);
        } else {
            this.zzaRh = null;
        }
        zza = zza(bundle, 2);
        if (zza != null) {
            this.zzaRi = new TurnBasedMatchBuffer(zza);
        } else {
            this.zzaRi = null;
        }
        zza = zza(bundle, 3);
        if (zza != null) {
            this.zzaRj = new TurnBasedMatchBuffer(zza);
        } else {
            this.zzaRj = null;
        }
    }

    private static DataHolder zza(Bundle bundle, int i) {
        String zzgS = TurnBasedMatchTurnStatus.zzgS(i);
        return !bundle.containsKey(zzgS) ? null : (DataHolder) bundle.getParcelable(zzgS);
    }

    @Deprecated
    public void close() {
        release();
    }

    public TurnBasedMatchBuffer getCompletedMatches() {
        return this.zzaRj;
    }

    public InvitationBuffer getInvitations() {
        return this.zzaRg;
    }

    public TurnBasedMatchBuffer getMyTurnMatches() {
        return this.zzaRh;
    }

    public TurnBasedMatchBuffer getTheirTurnMatches() {
        return this.zzaRi;
    }

    public boolean hasData() {
        return (this.zzaRg == null || this.zzaRg.getCount() <= 0) ? (this.zzaRh == null || this.zzaRh.getCount() <= 0) ? (this.zzaRi == null || this.zzaRi.getCount() <= 0) ? this.zzaRj != null && this.zzaRj.getCount() > 0 : true : true : true;
    }

    public void release() {
        if (this.zzaRg != null) {
            this.zzaRg.release();
        }
        if (this.zzaRh != null) {
            this.zzaRh.release();
        }
        if (this.zzaRi != null) {
            this.zzaRi.release();
        }
        if (this.zzaRj != null) {
            this.zzaRj.release();
        }
    }
}
