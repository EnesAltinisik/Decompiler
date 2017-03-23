package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

@zzig
public final class zzbx {
    private final String zztH;
    private final JSONObject zztI;
    private final String zztJ;
    private final String zztK;
    private final boolean zztL;
    private final boolean zztM;

    public zzbx(String str, VersionInfoParcel versionInfoParcel, String str2, JSONObject jSONObject, boolean z, boolean z2) {
        this.zztK = versionInfoParcel.afmaVersion;
        this.zztI = jSONObject;
        this.zztJ = str;
        this.zztH = str2;
        this.zztL = z;
        this.zztM = z2;
    }

    public String zzde() {
        return this.zztH;
    }

    public String zzdf() {
        return this.zztK;
    }

    public JSONObject zzdg() {
        return this.zztI;
    }

    public String zzdh() {
        return this.zztJ;
    }

    public boolean zzdi() {
        return this.zztL;
    }

    public boolean zzdj() {
        return this.zztM;
    }
}
