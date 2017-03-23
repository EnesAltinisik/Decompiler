package com.google.android.gms.internal;

import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.games.Games;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class zzna {
    private static final zzl zzaeJ = new zzl("GameManagerMessage");
    protected final long zzahA;
    protected final JSONObject zzahB;
    protected final int zzahF;
    protected final int zzahG;
    protected final String zzahH;
    protected final int zzahI;
    protected final int zzahJ;
    protected final List<zzne> zzahK;
    protected final JSONObject zzahL;
    protected final String zzahM;
    protected final String zzahN;
    protected final zzmz zzahg;
    protected final String zzahz;

    public zzna(int i, int i2, String str, JSONObject jSONObject, int i3, int i4, List<zzne> list, JSONObject jSONObject2, String str2, String str3, long j, String str4, zzmz com_google_android_gms_internal_zzmz) {
        this.zzahF = i;
        this.zzahG = i2;
        this.zzahH = str;
        this.zzahB = jSONObject;
        this.zzahI = i3;
        this.zzahJ = i4;
        this.zzahK = list;
        this.zzahL = jSONObject2;
        this.zzahM = str2;
        this.zzahz = str3;
        this.zzahA = j;
        this.zzahN = str4;
        this.zzahg = com_google_android_gms_internal_zzmz;
    }

    private static List<zzne> zzb(JSONArray jSONArray) {
        List<zzne> arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                Object com_google_android_gms_internal_zzne;
                try {
                    com_google_android_gms_internal_zzne = new zzne(optJSONObject);
                } catch (Throwable e) {
                    zzaeJ.zzc(e, "Exception when attempting to parse PlayerInfoMessageComponent at index %d", Integer.valueOf(i));
                    com_google_android_gms_internal_zzne = null;
                }
                if (com_google_android_gms_internal_zzne != null) {
                    arrayList.add(com_google_android_gms_internal_zzne);
                }
            }
        }
        return arrayList;
    }

    protected static zzna zzk(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("type", -1);
        switch (optInt) {
            case 1:
                zzmz com_google_android_gms_internal_zzmz = null;
                JSONObject optJSONObject = jSONObject.optJSONObject("gameManagerConfig");
                if (optJSONObject != null) {
                    zzmz com_google_android_gms_internal_zzmz2 = new zzmz(optJSONObject);
                }
                return new zzna(optInt, jSONObject.optInt("statusCode"), jSONObject.optString("errorDescription"), jSONObject.optJSONObject("extraMessageData"), jSONObject.optInt("gameplayState"), jSONObject.optInt("lobbyState"), zzb(jSONObject.optJSONArray(Games.EXTRA_PLAYER_IDS)), jSONObject.optJSONObject("gameData"), jSONObject.optString("gameStatusText"), jSONObject.optString("playerId"), jSONObject.optLong("requestId"), jSONObject.optString("playerToken"), com_google_android_gms_internal_zzmz);
            case 2:
                return new zzna(optInt, jSONObject.optInt("statusCode"), jSONObject.optString("errorDescription"), jSONObject.optJSONObject("extraMessageData"), jSONObject.optInt("gameplayState"), jSONObject.optInt("lobbyState"), zzb(jSONObject.optJSONArray(Games.EXTRA_PLAYER_IDS)), jSONObject.optJSONObject("gameData"), jSONObject.optString("gameStatusText"), jSONObject.optString("playerId"), -1, null, null);
            default:
                try {
                    zzaeJ.zzf("Unrecognized Game Message type %d", Integer.valueOf(optInt));
                    break;
                } catch (Throwable e) {
                    zzaeJ.zzc(e, "Exception while parsing GameManagerMessage from json", new Object[0]);
                    break;
                }
        }
        return null;
    }

    public final JSONObject getExtraMessageData() {
        return this.zzahB;
    }

    public final JSONObject getGameData() {
        return this.zzahL;
    }

    public final int getGameplayState() {
        return this.zzahI;
    }

    public final int getLobbyState() {
        return this.zzahJ;
    }

    public final String getPlayerId() {
        return this.zzahz;
    }

    public final long getRequestId() {
        return this.zzahA;
    }

    public final int getStatusCode() {
        return this.zzahG;
    }

    public final int zzqh() {
        return this.zzahF;
    }

    public final String zzqi() {
        return this.zzahH;
    }

    public final List<zzne> zzqj() {
        return this.zzahK;
    }

    public final String zzqk() {
        return this.zzahM;
    }

    public final String zzql() {
        return this.zzahN;
    }

    public final zzmz zzqm() {
        return this.zzahg;
    }
}
