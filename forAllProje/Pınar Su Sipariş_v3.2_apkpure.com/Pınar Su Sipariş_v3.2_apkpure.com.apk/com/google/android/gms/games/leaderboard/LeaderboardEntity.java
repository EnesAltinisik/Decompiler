package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.util.zzg;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

public final class LeaderboardEntity implements Leaderboard {
    private final Uri zzaIU;
    private final String zzaJf;
    private final String zzaQc;
    private final int zzaQd;
    private final ArrayList<LeaderboardVariantEntity> zzaQe;
    private final Game zzaQf;
    private final String zzaco;

    public LeaderboardEntity(Leaderboard leaderboard) {
        this.zzaQc = leaderboard.getLeaderboardId();
        this.zzaco = leaderboard.getDisplayName();
        this.zzaIU = leaderboard.getIconImageUri();
        this.zzaJf = leaderboard.getIconImageUrl();
        this.zzaQd = leaderboard.getScoreOrder();
        Game game = leaderboard.getGame();
        this.zzaQf = game == null ? null : new GameEntity(game);
        ArrayList variants = leaderboard.getVariants();
        int size = variants.size();
        this.zzaQe = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            this.zzaQe.add((LeaderboardVariantEntity) ((LeaderboardVariant) variants.get(i)).freeze());
        }
    }

    static int zza(Leaderboard leaderboard) {
        return zzz.hashCode(leaderboard.getLeaderboardId(), leaderboard.getDisplayName(), leaderboard.getIconImageUri(), Integer.valueOf(leaderboard.getScoreOrder()), leaderboard.getVariants());
    }

    static boolean zza(Leaderboard leaderboard, Object obj) {
        if (!(obj instanceof Leaderboard)) {
            return false;
        }
        if (leaderboard == obj) {
            return true;
        }
        Leaderboard leaderboard2 = (Leaderboard) obj;
        return zzz.equal(leaderboard2.getLeaderboardId(), leaderboard.getLeaderboardId()) && zzz.equal(leaderboard2.getDisplayName(), leaderboard.getDisplayName()) && zzz.equal(leaderboard2.getIconImageUri(), leaderboard.getIconImageUri()) && zzz.equal(Integer.valueOf(leaderboard2.getScoreOrder()), Integer.valueOf(leaderboard.getScoreOrder())) && zzz.equal(leaderboard2.getVariants(), leaderboard.getVariants());
    }

    static String zzb(Leaderboard leaderboard) {
        return zzz.zzy(leaderboard).zzg("LeaderboardId", leaderboard.getLeaderboardId()).zzg("DisplayName", leaderboard.getDisplayName()).zzg("IconImageUri", leaderboard.getIconImageUri()).zzg("IconImageUrl", leaderboard.getIconImageUrl()).zzg("ScoreOrder", Integer.valueOf(leaderboard.getScoreOrder())).zzg("Variants", leaderboard.getVariants()).toString();
    }

    public boolean equals(Object obj) {
        return zza(this, obj);
    }

    public /* synthetic */ Object freeze() {
        return zzBm();
    }

    public String getDisplayName() {
        return this.zzaco;
    }

    public void getDisplayName(CharArrayBuffer charArrayBuffer) {
        zzg.zzb(this.zzaco, charArrayBuffer);
    }

    public Game getGame() {
        return this.zzaQf;
    }

    public Uri getIconImageUri() {
        return this.zzaIU;
    }

    public String getIconImageUrl() {
        return this.zzaJf;
    }

    public String getLeaderboardId() {
        return this.zzaQc;
    }

    public int getScoreOrder() {
        return this.zzaQd;
    }

    public ArrayList<LeaderboardVariant> getVariants() {
        return new ArrayList(this.zzaQe);
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

    public Leaderboard zzBm() {
        return this;
    }
}
