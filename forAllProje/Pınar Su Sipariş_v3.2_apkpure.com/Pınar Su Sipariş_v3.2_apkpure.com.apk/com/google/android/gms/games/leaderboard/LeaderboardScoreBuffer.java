package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class LeaderboardScoreBuffer extends AbstractDataBuffer<LeaderboardScore> {
    private final LeaderboardScoreBufferHeader zzaQg;

    public LeaderboardScoreBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.zzaQg = new LeaderboardScoreBufferHeader(dataHolder.zzsO());
    }

    public LeaderboardScore get(int i) {
        return new LeaderboardScoreRef(this.zzamz, i);
    }

    public LeaderboardScoreBufferHeader zzBn() {
        return this.zzaQg;
    }
}
