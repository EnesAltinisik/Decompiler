package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class LeaderboardScoreRef extends zzc implements LeaderboardScore {
    private final PlayerRef zzaQt;

    LeaderboardScoreRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
        this.zzaQt = new PlayerRef(dataHolder, i);
    }

    public boolean equals(Object obj) {
        return LeaderboardScoreEntity.zza(this, obj);
    }

    public /* synthetic */ Object freeze() {
        return zzBo();
    }

    public String getDisplayRank() {
        return getString("display_rank");
    }

    public void getDisplayRank(CharArrayBuffer charArrayBuffer) {
        zza("display_rank", charArrayBuffer);
    }

    public String getDisplayScore() {
        return getString("display_score");
    }

    public void getDisplayScore(CharArrayBuffer charArrayBuffer) {
        zza("display_score", charArrayBuffer);
    }

    public long getRank() {
        return getLong("rank");
    }

    public long getRawScore() {
        return getLong("raw_score");
    }

    public Player getScoreHolder() {
        return zzda("external_player_id") ? null : this.zzaQt;
    }

    public String getScoreHolderDisplayName() {
        return zzda("external_player_id") ? getString("default_display_name") : this.zzaQt.getDisplayName();
    }

    public void getScoreHolderDisplayName(CharArrayBuffer charArrayBuffer) {
        if (zzda("external_player_id")) {
            zza("default_display_name", charArrayBuffer);
        } else {
            this.zzaQt.getDisplayName(charArrayBuffer);
        }
    }

    public Uri getScoreHolderHiResImageUri() {
        return zzda("external_player_id") ? null : this.zzaQt.getHiResImageUri();
    }

    public String getScoreHolderHiResImageUrl() {
        return zzda("external_player_id") ? null : this.zzaQt.getHiResImageUrl();
    }

    public Uri getScoreHolderIconImageUri() {
        return zzda("external_player_id") ? zzcZ("default_display_image_uri") : this.zzaQt.getIconImageUri();
    }

    public String getScoreHolderIconImageUrl() {
        return zzda("external_player_id") ? getString("default_display_image_url") : this.zzaQt.getIconImageUrl();
    }

    public String getScoreTag() {
        return getString("score_tag");
    }

    public long getTimestampMillis() {
        return getLong("achieved_timestamp");
    }

    public int hashCode() {
        return LeaderboardScoreEntity.zza(this);
    }

    public String toString() {
        return LeaderboardScoreEntity.zzb(this);
    }

    public LeaderboardScore zzBo() {
        return new LeaderboardScoreEntity(this);
    }
}
