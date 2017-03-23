package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzig
public final class zzfr {
    public final List<zzfq> zzED;
    public final long zzEE;
    public final List<String> zzEF;
    public final List<String> zzEG;
    public final List<String> zzEH;
    public final List<String> zzEI;
    public final boolean zzEJ;
    public final String zzEK;
    public final long zzEL;
    public final String zzEM;
    public final int zzEN;
    public final int zzEO;
    public final long zzEP;
    public final boolean zzEQ;
    public int zzER;
    public int zzES;

    public zzfr(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (zzb.zzX(2)) {
            String str2 = "Mediation Response JSON: ";
            String valueOf = String.valueOf(jSONObject.toString(2));
            zzjw.v(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        List arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            zzfq com_google_android_gms_internal_zzfq = new zzfq(jSONArray.getJSONObject(i2));
            arrayList.add(com_google_android_gms_internal_zzfq);
            if (i < 0 && zza(com_google_android_gms_internal_zzfq)) {
                i = i2;
            }
        }
        this.zzER = i;
        this.zzES = jSONArray.length();
        this.zzED = Collections.unmodifiableList(arrayList);
        this.zzEK = jSONObject.getString("qdata");
        this.zzEO = jSONObject.optInt("fs_model_type", -1);
        this.zzEP = jSONObject.optLong("timeout_ms", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            this.zzEE = optJSONObject.optLong("ad_network_timeout_millis", -1);
            this.zzEF = zzu.zzcz().zza(optJSONObject, "click_urls");
            this.zzEG = zzu.zzcz().zza(optJSONObject, "imp_urls");
            this.zzEH = zzu.zzcz().zza(optJSONObject, "nofill_urls");
            this.zzEI = zzu.zzcz().zza(optJSONObject, "remote_ping_urls");
            this.zzEJ = optJSONObject.optBoolean("render_in_browser", false);
            long optLong = optJSONObject.optLong("refresh", -1);
            this.zzEL = optLong > 0 ? optLong * 1000 : -1;
            RewardItemParcel zza = RewardItemParcel.zza(optJSONObject.optJSONArray("rewards"));
            if (zza == null) {
                this.zzEM = null;
                this.zzEN = 0;
            } else {
                this.zzEM = zza.type;
                this.zzEN = zza.zzOV;
            }
            this.zzEQ = optJSONObject.optBoolean("use_displayed_impression", false);
            return;
        }
        this.zzEE = -1;
        this.zzEF = null;
        this.zzEG = null;
        this.zzEH = null;
        this.zzEI = null;
        this.zzEL = -1;
        this.zzEM = null;
        this.zzEN = 0;
        this.zzEQ = false;
        this.zzEJ = false;
    }

    public zzfr(List<zzfq> list, long j, List<String> list2, List<String> list3, List<String> list4, List<String> list5, boolean z, String str, long j2, int i, int i2, String str2, int i3, int i4, long j3, boolean z2) {
        this.zzED = list;
        this.zzEE = j;
        this.zzEF = list2;
        this.zzEG = list3;
        this.zzEH = list4;
        this.zzEI = list5;
        this.zzEJ = z;
        this.zzEK = str;
        this.zzEL = j2;
        this.zzER = i;
        this.zzES = i2;
        this.zzEM = str2;
        this.zzEN = i3;
        this.zzEO = i4;
        this.zzEP = j3;
        this.zzEQ = z2;
    }

    private boolean zza(zzfq com_google_android_gms_internal_zzfq) {
        for (String equals : com_google_android_gms_internal_zzfq.zzEp) {
            if (equals.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return true;
            }
        }
        return false;
    }
}
