package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig.Builder;

public final class TurnBasedMatchConfigImpl extends TurnBasedMatchConfig {
    private final int zzaQL;
    private final Bundle zzaRb;
    private final String[] zzaRc;
    private final int zzaRk;

    TurnBasedMatchConfigImpl(Builder builder) {
        this.zzaQL = builder.zzaQL;
        this.zzaRk = builder.zzaRk;
        this.zzaRb = builder.zzaRb;
        this.zzaRc = (String[]) builder.zzaRa.toArray(new String[builder.zzaRa.size()]);
    }

    public Bundle getAutoMatchCriteria() {
        return this.zzaRb;
    }

    public String[] getInvitedPlayerIds() {
        return this.zzaRc;
    }

    public int getVariant() {
        return this.zzaQL;
    }

    public int zzBt() {
        return this.zzaRk;
    }
}
