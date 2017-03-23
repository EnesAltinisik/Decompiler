package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

public final class zzmz {
    private final String zzahC;
    private final int zzahD;
    private final String zzahE;

    public zzmz(String str, int i, String str2) {
        this.zzahC = str;
        this.zzahD = i;
        this.zzahE = str2;
    }

    public zzmz(JSONObject jSONObject) throws JSONException {
        this(jSONObject.optString("applicationName"), jSONObject.optInt("maxPlayers"), jSONObject.optString("version"));
    }

    public final int getMaxPlayers() {
        return this.zzahD;
    }

    public final String getVersion() {
        return this.zzahE;
    }

    public final String zzqg() {
        return this.zzahC;
    }
}
