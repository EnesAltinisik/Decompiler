package com.google.android.gms.games.internal;

import com.google.android.gms.common.internal.zzp;
import com.google.android.gms.internal.zzpg;

public final class GamesLog {
    private static final zzp zzaMD = new zzp("Games");
    private static final zzpg<Boolean> zzaME = zzpg.zzl("games.play_games_dogfood", false);

    private GamesLog() {
    }

    public static void zzD(String str, String str2) {
        zzaMD.zzD(str, str2);
    }

    public static void zzE(String str, String str2) {
        zzaMD.zzE(str, str2);
    }

    public static void zza(String str, String str2, Throwable th) {
        zzaMD.zza(str, str2, th);
    }

    public static void zzb(String str, String str2, Throwable th) {
        zzaMD.zzb(str, str2, th);
    }
}
