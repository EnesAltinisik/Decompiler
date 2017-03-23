package com.google.android.gms.internal;

import com.google.android.gms.cast.games.PlayerInfo;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.util.zzp;
import org.json.JSONObject;

public final class zznd implements PlayerInfo {
    private final int zzafQ;
    private final JSONObject zzahP;
    private final boolean zzahQ;
    private final String zzahz;

    public zznd(String str, int i, JSONObject jSONObject, boolean z) {
        this.zzahz = str;
        this.zzafQ = i;
        this.zzahP = jSONObject;
        this.zzahQ = z;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof PlayerInfo)) {
            return false;
        }
        PlayerInfo playerInfo = (PlayerInfo) obj;
        return this.zzahQ == playerInfo.isControllable() && this.zzafQ == playerInfo.getPlayerState() && zzf.zza(this.zzahz, playerInfo.getPlayerId()) && zzp.zzf(this.zzahP, playerInfo.getPlayerData());
    }

    public JSONObject getPlayerData() {
        return this.zzahP;
    }

    public String getPlayerId() {
        return this.zzahz;
    }

    public int getPlayerState() {
        return this.zzafQ;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzahz, Integer.valueOf(this.zzafQ), this.zzahP, Boolean.valueOf(this.zzahQ));
    }

    public boolean isConnected() {
        switch (this.zzafQ) {
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    public boolean isControllable() {
        return this.zzahQ;
    }
}
