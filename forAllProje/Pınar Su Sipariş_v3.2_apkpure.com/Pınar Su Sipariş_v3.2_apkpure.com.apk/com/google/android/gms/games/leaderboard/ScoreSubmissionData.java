package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.internal.zzz.zza;
import com.google.android.gms.games.internal.constants.TimeSpan;
import java.util.HashMap;

public final class ScoreSubmissionData {
    private static final String[] zzaQa = new String[]{"leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest", "scoreTag"};
    private HashMap<Integer, Result> zzaQG = new HashMap();
    private String zzaQc;
    private int zzahG;
    private String zzahz;

    public static final class Result {
        public final String formattedScore;
        public final boolean newBest;
        public final long rawScore;
        public final String scoreTag;

        public Result(long j, String str, String str2, boolean z) {
            this.rawScore = j;
            this.formattedScore = str;
            this.scoreTag = str2;
            this.newBest = z;
        }

        public String toString() {
            return zzz.zzy(this).zzg("RawScore", Long.valueOf(this.rawScore)).zzg("FormattedScore", this.formattedScore).zzg("ScoreTag", this.scoreTag).zzg("NewBest", Boolean.valueOf(this.newBest)).toString();
        }
    }

    public ScoreSubmissionData(DataHolder dataHolder) {
        this.zzahG = dataHolder.getStatusCode();
        int count = dataHolder.getCount();
        zzaa.zzaj(count == 3);
        for (int i = 0; i < count; i++) {
            int zzbP = dataHolder.zzbP(i);
            if (i == 0) {
                this.zzaQc = dataHolder.zzd("leaderboardId", i, zzbP);
                this.zzahz = dataHolder.zzd("playerId", i, zzbP);
            }
            if (dataHolder.zze("hasResult", i, zzbP)) {
                zza(new Result(dataHolder.zzb("rawScore", i, zzbP), dataHolder.zzd("formattedScore", i, zzbP), dataHolder.zzd("scoreTag", i, zzbP), dataHolder.zze("newBest", i, zzbP)), dataHolder.zzc("timeSpan", i, zzbP));
            }
        }
    }

    private void zza(Result result, int i) {
        this.zzaQG.put(Integer.valueOf(i), result);
    }

    public String getLeaderboardId() {
        return this.zzaQc;
    }

    public String getPlayerId() {
        return this.zzahz;
    }

    public Result getScoreResult(int i) {
        return (Result) this.zzaQG.get(Integer.valueOf(i));
    }

    public String toString() {
        zza zzg = zzz.zzy(this).zzg("PlayerId", this.zzahz).zzg("StatusCode", Integer.valueOf(this.zzahG));
        for (int i = 0; i < 3; i++) {
            Result result = (Result) this.zzaQG.get(Integer.valueOf(i));
            zzg.zzg("TimesSpan", TimeSpan.zzgS(i));
            zzg.zzg("Result", result == null ? "null" : result.toString());
        }
        return zzg.toString();
    }
}
