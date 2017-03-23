package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.util.zzg;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;

public final class LeaderboardScoreEntity implements LeaderboardScore {
    private final long zzaQh;
    private final String zzaQi;
    private final String zzaQj;
    private final long zzaQk;
    private final long zzaQl;
    private final String zzaQm;
    private final Uri zzaQn;
    private final Uri zzaQo;
    private final PlayerEntity zzaQp;
    private final String zzaQq;
    private final String zzaQr;
    private final String zzaQs;

    public LeaderboardScoreEntity(LeaderboardScore leaderboardScore) {
        this.zzaQh = leaderboardScore.getRank();
        this.zzaQi = (String) zzaa.zzz(leaderboardScore.getDisplayRank());
        this.zzaQj = (String) zzaa.zzz(leaderboardScore.getDisplayScore());
        this.zzaQk = leaderboardScore.getRawScore();
        this.zzaQl = leaderboardScore.getTimestampMillis();
        this.zzaQm = leaderboardScore.getScoreHolderDisplayName();
        this.zzaQn = leaderboardScore.getScoreHolderIconImageUri();
        this.zzaQo = leaderboardScore.getScoreHolderHiResImageUri();
        Player scoreHolder = leaderboardScore.getScoreHolder();
        this.zzaQp = scoreHolder == null ? null : (PlayerEntity) scoreHolder.freeze();
        this.zzaQq = leaderboardScore.getScoreTag();
        this.zzaQr = leaderboardScore.getScoreHolderIconImageUrl();
        this.zzaQs = leaderboardScore.getScoreHolderHiResImageUrl();
    }

    static int zza(LeaderboardScore leaderboardScore) {
        return zzz.hashCode(Long.valueOf(leaderboardScore.getRank()), leaderboardScore.getDisplayRank(), Long.valueOf(leaderboardScore.getRawScore()), leaderboardScore.getDisplayScore(), Long.valueOf(leaderboardScore.getTimestampMillis()), leaderboardScore.getScoreHolderDisplayName(), leaderboardScore.getScoreHolderIconImageUri(), leaderboardScore.getScoreHolderHiResImageUri(), leaderboardScore.getScoreHolder());
    }

    static boolean zza(LeaderboardScore leaderboardScore, Object obj) {
        if (!(obj instanceof LeaderboardScore)) {
            return false;
        }
        if (leaderboardScore == obj) {
            return true;
        }
        LeaderboardScore leaderboardScore2 = (LeaderboardScore) obj;
        return zzz.equal(Long.valueOf(leaderboardScore2.getRank()), Long.valueOf(leaderboardScore.getRank())) && zzz.equal(leaderboardScore2.getDisplayRank(), leaderboardScore.getDisplayRank()) && zzz.equal(Long.valueOf(leaderboardScore2.getRawScore()), Long.valueOf(leaderboardScore.getRawScore())) && zzz.equal(leaderboardScore2.getDisplayScore(), leaderboardScore.getDisplayScore()) && zzz.equal(Long.valueOf(leaderboardScore2.getTimestampMillis()), Long.valueOf(leaderboardScore.getTimestampMillis())) && zzz.equal(leaderboardScore2.getScoreHolderDisplayName(), leaderboardScore.getScoreHolderDisplayName()) && zzz.equal(leaderboardScore2.getScoreHolderIconImageUri(), leaderboardScore.getScoreHolderIconImageUri()) && zzz.equal(leaderboardScore2.getScoreHolderHiResImageUri(), leaderboardScore.getScoreHolderHiResImageUri()) && zzz.equal(leaderboardScore2.getScoreHolder(), leaderboardScore.getScoreHolder()) && zzz.equal(leaderboardScore2.getScoreTag(), leaderboardScore.getScoreTag());
    }

    static String zzb(LeaderboardScore leaderboardScore) {
        return zzz.zzy(leaderboardScore).zzg("Rank", Long.valueOf(leaderboardScore.getRank())).zzg("DisplayRank", leaderboardScore.getDisplayRank()).zzg("Score", Long.valueOf(leaderboardScore.getRawScore())).zzg("DisplayScore", leaderboardScore.getDisplayScore()).zzg("Timestamp", Long.valueOf(leaderboardScore.getTimestampMillis())).zzg("DisplayName", leaderboardScore.getScoreHolderDisplayName()).zzg("IconImageUri", leaderboardScore.getScoreHolderIconImageUri()).zzg("IconImageUrl", leaderboardScore.getScoreHolderIconImageUrl()).zzg("HiResImageUri", leaderboardScore.getScoreHolderHiResImageUri()).zzg("HiResImageUrl", leaderboardScore.getScoreHolderHiResImageUrl()).zzg("Player", leaderboardScore.getScoreHolder() == null ? null : leaderboardScore.getScoreHolder()).zzg("ScoreTag", leaderboardScore.getScoreTag()).toString();
    }

    public boolean equals(Object obj) {
        return zza(this, obj);
    }

    public /* synthetic */ Object freeze() {
        return zzBo();
    }

    public String getDisplayRank() {
        return this.zzaQi;
    }

    public void getDisplayRank(CharArrayBuffer charArrayBuffer) {
        zzg.zzb(this.zzaQi, charArrayBuffer);
    }

    public String getDisplayScore() {
        return this.zzaQj;
    }

    public void getDisplayScore(CharArrayBuffer charArrayBuffer) {
        zzg.zzb(this.zzaQj, charArrayBuffer);
    }

    public long getRank() {
        return this.zzaQh;
    }

    public long getRawScore() {
        return this.zzaQk;
    }

    public Player getScoreHolder() {
        return this.zzaQp;
    }

    public String getScoreHolderDisplayName() {
        return this.zzaQp == null ? this.zzaQm : this.zzaQp.getDisplayName();
    }

    public void getScoreHolderDisplayName(CharArrayBuffer charArrayBuffer) {
        if (this.zzaQp == null) {
            zzg.zzb(this.zzaQm, charArrayBuffer);
        } else {
            this.zzaQp.getDisplayName(charArrayBuffer);
        }
    }

    public Uri getScoreHolderHiResImageUri() {
        return this.zzaQp == null ? this.zzaQo : this.zzaQp.getHiResImageUri();
    }

    public String getScoreHolderHiResImageUrl() {
        return this.zzaQp == null ? this.zzaQs : this.zzaQp.getHiResImageUrl();
    }

    public Uri getScoreHolderIconImageUri() {
        return this.zzaQp == null ? this.zzaQn : this.zzaQp.getIconImageUri();
    }

    public String getScoreHolderIconImageUrl() {
        return this.zzaQp == null ? this.zzaQr : this.zzaQp.getIconImageUrl();
    }

    public String getScoreTag() {
        return this.zzaQq;
    }

    public long getTimestampMillis() {
        return this.zzaQl;
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

    public LeaderboardScore zzBo() {
        return this;
    }
}
