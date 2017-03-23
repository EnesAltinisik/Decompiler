package com.google.android.gms.b;

import com.google.android.gms.ads.internal.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@vz
public final class td {
    public final String a;
    public final String b;
    public final List<String> c;
    public final String d;
    public final String e;
    public final List<String> f;
    public final List<String> g;
    public final List<String> h;
    public final String i;
    public final List<String> j;
    public final List<String> k;
    public final String l;
    public final String m;
    public final String n;
    public final List<String> o;
    public final String p;

    public td(String str, String str2, List<String> list, String str3, String str4, List<String> list2, List<String> list3, String str5, String str6, List<String> list4, List<String> list5, String str7, String str8, String str9, List<String> list6, String str10, List<String> list7) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = str4;
        this.f = list2;
        this.g = list3;
        this.i = str5;
        this.j = list4;
        this.k = list5;
        this.l = str7;
        this.m = str8;
        this.n = str9;
        this.o = list6;
        this.p = str10;
        this.h = list7;
    }

    public td(JSONObject jSONObject) {
        String str = null;
        this.b = jSONObject.getString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        List arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.c = Collections.unmodifiableList(arrayList);
        this.d = jSONObject.optString("allocation_id", null);
        this.f = v.x().a(jSONObject, "clickurl");
        this.g = v.x().a(jSONObject, "imp_urls");
        this.h = v.x().a(jSONObject, "fill_urls");
        this.j = v.x().a(jSONObject, "video_start_urls");
        this.k = v.x().a(jSONObject, "video_complete_urls");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        this.a = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.i = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.e = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.l = jSONObject.optString("html_template", null);
        this.m = jSONObject.optString("ad_base_url", null);
        optJSONObject = jSONObject.optJSONObject("assets");
        this.n = optJSONObject != null ? optJSONObject.toString() : null;
        this.o = v.x().a(jSONObject, "template_ids");
        optJSONObject = jSONObject.optJSONObject("ad_loader_options");
        if (optJSONObject != null) {
            str = optJSONObject.toString();
        }
        this.p = str;
    }
}
