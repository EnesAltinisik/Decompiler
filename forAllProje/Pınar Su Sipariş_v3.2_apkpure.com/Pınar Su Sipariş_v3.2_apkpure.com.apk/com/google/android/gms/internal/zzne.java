package com.google.android.gms.internal;

import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.util.zzp;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzne {
    private final int zzafQ;
    private final JSONObject zzahP;
    private final String zzahz;

    public zzne(String str, int i, JSONObject jSONObject) {
        this.zzahz = str;
        this.zzafQ = i;
        this.zzahP = jSONObject;
    }

    public zzne(JSONObject jSONObject) throws JSONException {
        this(jSONObject.optString("playerId"), jSONObject.optInt("playerState"), jSONObject.optJSONObject("playerData"));
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof zzne)) {
            return false;
        }
        zzne com_google_android_gms_internal_zzne = (zzne) obj;
        return this.zzafQ == com_google_android_gms_internal_zzne.getPlayerState() && zzf.zza(this.zzahz, com_google_android_gms_internal_zzne.getPlayerId()) && zzp.zzf(this.zzahP, com_google_android_gms_internal_zzne.getPlayerData());
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
}
