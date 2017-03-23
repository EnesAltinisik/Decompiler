package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzig
public final class zzfq {
    public final String zzEA;
    public final List<String> zzEB;
    public final String zzEC;
    public final String zzEn;
    public final String zzEo;
    public final List<String> zzEp;
    public final String zzEq;
    public final String zzEr;
    public final List<String> zzEs;
    public final List<String> zzEt;
    public final List<String> zzEu;
    public final String zzEv;
    public final List<String> zzEw;
    public final List<String> zzEx;
    public final String zzEy;
    public final String zzEz;

    public zzfq(String str, String str2, List<String> list, String str3, String str4, List<String> list2, List<String> list3, String str5, String str6, List<String> list4, List<String> list5, String str7, String str8, String str9, List<String> list6, String str10, List<String> list7) {
        this.zzEn = str;
        this.zzEo = str2;
        this.zzEp = list;
        this.zzEq = str3;
        this.zzEr = str4;
        this.zzEs = list2;
        this.zzEt = list3;
        this.zzEv = str5;
        this.zzEw = list4;
        this.zzEx = list5;
        this.zzEy = str7;
        this.zzEz = str8;
        this.zzEA = str9;
        this.zzEB = list6;
        this.zzEC = str10;
        this.zzEu = list7;
    }

    public zzfq(JSONObject jSONObject) throws JSONException {
        String str = null;
        this.zzEo = jSONObject.getString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        List arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.zzEp = Collections.unmodifiableList(arrayList);
        this.zzEq = jSONObject.optString("allocation_id", null);
        this.zzEs = zzu.zzcz().zza(jSONObject, "clickurl");
        this.zzEt = zzu.zzcz().zza(jSONObject, "imp_urls");
        this.zzEu = zzu.zzcz().zza(jSONObject, "fill_urls");
        this.zzEw = zzu.zzcz().zza(jSONObject, "video_start_urls");
        this.zzEx = zzu.zzcz().zza(jSONObject, "video_complete_urls");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        this.zzEn = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.zzEv = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.zzEr = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.zzEy = jSONObject.optString("html_template", null);
        this.zzEz = jSONObject.optString("ad_base_url", null);
        optJSONObject = jSONObject.optJSONObject("assets");
        this.zzEA = optJSONObject != null ? optJSONObject.toString() : null;
        this.zzEB = zzu.zzcz().zza(jSONObject, "template_ids");
        optJSONObject = jSONObject.optJSONObject("ad_loader_options");
        if (optJSONObject != null) {
            str = optJSONObject.toString();
        }
        this.zzEC = str;
    }
}
