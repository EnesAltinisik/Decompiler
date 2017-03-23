package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.games.internal.constants.LeaderboardCollection;
import com.google.android.gms.games.internal.constants.TimeSpan;

public final class LeaderboardVariantEntity implements LeaderboardVariant {
    private final String zzaQA;
    private final String zzaQB;
    private final long zzaQC;
    private final String zzaQD;
    private final String zzaQE;
    private final String zzaQF;
    private final int zzaQu;
    private final int zzaQv;
    private final boolean zzaQw;
    private final long zzaQx;
    private final String zzaQy;
    private final long zzaQz;

    public LeaderboardVariantEntity(LeaderboardVariant leaderboardVariant) {
        this.zzaQu = leaderboardVariant.getTimeSpan();
        this.zzaQv = leaderboardVariant.getCollection();
        this.zzaQw = leaderboardVariant.hasPlayerInfo();
        this.zzaQx = leaderboardVariant.getRawPlayerScore();
        this.zzaQy = leaderboardVariant.getDisplayPlayerScore();
        this.zzaQz = leaderboardVariant.getPlayerRank();
        this.zzaQA = leaderboardVariant.getDisplayPlayerRank();
        this.zzaQB = leaderboardVariant.getPlayerScoreTag();
        this.zzaQC = leaderboardVariant.getNumScores();
        this.zzaQD = leaderboardVariant.zzBp();
        this.zzaQE = leaderboardVariant.zzBq();
        this.zzaQF = leaderboardVariant.zzBr();
    }

    static int zza(LeaderboardVariant leaderboardVariant) {
        return zzz.hashCode(Integer.valueOf(leaderboardVariant.getTimeSpan()), Integer.valueOf(leaderboardVariant.getCollection()), Boolean.valueOf(leaderboardVariant.hasPlayerInfo()), Long.valueOf(leaderboardVariant.getRawPlayerScore()), leaderboardVariant.getDisplayPlayerScore(), Long.valueOf(leaderboardVariant.getPlayerRank()), leaderboardVariant.getDisplayPlayerRank(), Long.valueOf(leaderboardVariant.getNumScores()), leaderboardVariant.zzBp(), leaderboardVariant.zzBr(), leaderboardVariant.zzBq());
    }

    static boolean zza(LeaderboardVariant leaderboardVariant, Object obj) {
        if (!(obj instanceof LeaderboardVariant)) {
            return false;
        }
        if (leaderboardVariant == obj) {
            return true;
        }
        LeaderboardVariant leaderboardVariant2 = (LeaderboardVariant) obj;
        return zzz.equal(Integer.valueOf(leaderboardVariant2.getTimeSpan()), Integer.valueOf(leaderboardVariant.getTimeSpan())) && zzz.equal(Integer.valueOf(leaderboardVariant2.getCollection()), Integer.valueOf(leaderboardVariant.getCollection())) && zzz.equal(Boolean.valueOf(leaderboardVariant2.hasPlayerInfo()), Boolean.valueOf(leaderboardVariant.hasPlayerInfo())) && zzz.equal(Long.valueOf(leaderboardVariant2.getRawPlayerScore()), Long.valueOf(leaderboardVariant.getRawPlayerScore())) && zzz.equal(leaderboardVariant2.getDisplayPlayerScore(), leaderboardVariant.getDisplayPlayerScore()) && zzz.equal(Long.valueOf(leaderboardVariant2.getPlayerRank()), Long.valueOf(leaderboardVariant.getPlayerRank())) && zzz.equal(leaderboardVariant2.getDisplayPlayerRank(), leaderboardVariant.getDisplayPlayerRank()) && zzz.equal(Long.valueOf(leaderboardVariant2.getNumScores()), Long.valueOf(leaderboardVariant.getNumScores())) && zzz.equal(leaderboardVariant2.zzBp(), leaderboardVariant.zzBp()) && zzz.equal(leaderboardVariant2.zzBr(), leaderboardVariant.zzBr()) && zzz.equal(leaderboardVariant2.zzBq(), leaderboardVariant.zzBq());
    }

    static String zzb(LeaderboardVariant leaderboardVariant) {
        return zzz.zzy(leaderboardVariant).zzg("TimeSpan", TimeSpan.zzgS(leaderboardVariant.getTimeSpan())).zzg("Collection", LeaderboardCollection.zzgS(leaderboardVariant.getCollection())).zzg("RawPlayerScore", leaderboardVariant.hasPlayerInfo() ? Long.valueOf(leaderboardVariant.getRawPlayerScore()) : "none").zzg("DisplayPlayerScore", leaderboardVariant.hasPlayerInfo() ? leaderboardVariant.getDisplayPlayerScore() : "none").zzg("PlayerRank", leaderboardVariant.hasPlayerInfo() ? Long.valueOf(leaderboardVariant.getPlayerRank()) : "none").zzg("DisplayPlayerRank", leaderboardVariant.hasPlayerInfo() ? leaderboardVariant.getDisplayPlayerRank() : "none").zzg("NumScores", Long.valueOf(leaderboardVariant.getNumScores())).zzg("TopPageNextToken", leaderboardVariant.zzBp()).zzg("WindowPageNextToken", leaderboardVariant.zzBr()).zzg("WindowPagePrevToken", leaderboardVariant.zzBq()).toString();
    }

    public boolean equals(Object obj) {
        return zza(this, obj);
    }

    public /* synthetic */ Object freeze() {
        return zzBs();
    }

    public int getCollection() {
        return this.zzaQv;
    }

    public String getDisplayPlayerRank() {
        return this.zzaQA;
    }

    public String getDisplayPlayerScore() {
        return this.zzaQy;
    }

    public long getNumScores() {
        return this.zzaQC;
    }

    public long getPlayerRank() {
        return this.zzaQz;
    }

    public String getPlayerScoreTag() {
        return this.zzaQB;
    }

    public long getRawPlayerScore() {
        return this.zzaQx;
    }

    public int getTimeSpan() {
        return this.zzaQu;
    }

    public boolean hasPlayerInfo() {
        return this.zzaQw;
    }

    public int hashCode() {
        return zza(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return zzb(this);
    }

    public String zzBp() {
        return this.zzaQD;
    }

    public String zzBq() {
        return this.zzaQE;
    }

    public String zzBr() {
        return this.zzaQF;
    }

    public LeaderboardVariant zzBs() {
        return this;
    }
}
