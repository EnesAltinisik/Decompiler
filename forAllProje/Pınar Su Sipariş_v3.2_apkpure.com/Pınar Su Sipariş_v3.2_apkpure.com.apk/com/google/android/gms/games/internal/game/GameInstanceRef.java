package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.games.internal.constants.PlatformType;

public final class GameInstanceRef extends zzc implements GameInstance {
    GameInstanceRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public String getApplicationId() {
        return getString("external_game_id");
    }

    public String getDisplayName() {
        return getString("instance_display_name");
    }

    public String getPackageName() {
        return getString("package_name");
    }

    public String toString() {
        return zzz.zzy(this).zzg("ApplicationId", getApplicationId()).zzg("DisplayName", getDisplayName()).zzg("SupportsRealTime", Boolean.valueOf(zzAP())).zzg("SupportsTurnBased", Boolean.valueOf(zzAQ())).zzg("PlatformType", PlatformType.zzgS(zzxB())).zzg("PackageName", getPackageName()).zzg("PiracyCheckEnabled", Boolean.valueOf(zzAR())).zzg("Installed", Boolean.valueOf(zzAS())).toString();
    }

    public boolean zzAP() {
        return getInteger("real_time_support") > 0;
    }

    public boolean zzAQ() {
        return getInteger("turn_based_support") > 0;
    }

    public boolean zzAR() {
        return getInteger("piracy_check") > 0;
    }

    public boolean zzAS() {
        return getInteger("installed") > 0;
    }

    public int zzxB() {
        return getInteger("platform_type");
    }
}
