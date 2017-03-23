package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

public final class LeaderboardBuffer extends zzf<Leaderboard> {
    public LeaderboardBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    protected /* synthetic */ Object zzm(int i, int i2) {
        return zzp(i, i2);
    }

    protected Leaderboard zzp(int i, int i2) {
        return new LeaderboardRef(this.zzamz, i, i2);
    }

    protected String zzsW() {
        return "external_leaderboard_id";
    }
}
