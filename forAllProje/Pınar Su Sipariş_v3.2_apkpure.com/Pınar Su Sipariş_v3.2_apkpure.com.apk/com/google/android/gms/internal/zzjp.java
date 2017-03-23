package com.google.android.gms.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzig
public class zzjp {
    private final long zzPu;
    private final List<String> zzPv = new ArrayList();
    private final Map<String, b> zzPw = new HashMap();
    private String zzPx;
    private String zzPy;
    private boolean zzPz = false;

    class a {
        final /* synthetic */ zzjp a;
        private final List<String> b;
        private final Bundle c;

        public a(zzjp com_google_android_gms_internal_zzjp, List<String> list, Bundle bundle) {
            this.a = com_google_android_gms_internal_zzjp;
            this.b = list;
            this.c = bundle;
        }
    }

    class b {
        final List<a> a = new ArrayList();
        final /* synthetic */ zzjp b;

        b(zzjp com_google_android_gms_internal_zzjp) {
            this.b = com_google_android_gms_internal_zzjp;
        }

        public void a(a aVar) {
            this.a.add(aVar);
        }
    }

    public zzjp(String str, long j) {
        this.zzPy = str;
        this.zzPu = j;
        zzaK(str);
    }

    private void zzaK(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.optInt("status", -1) != 1) {
                    this.zzPz = false;
                    zzb.zzaW("App settings could not be fetched successfully.");
                    return;
                }
                this.zzPz = true;
                this.zzPx = jSONObject.optString("app_id");
                JSONArray optJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        zzh(optJSONArray.getJSONObject(i));
                    }
                }
            } catch (Throwable e) {
                zzb.zzd("Exception occurred while processing app setting json", e);
                zzu.zzcn().zzb(e, true);
            }
        }
    }

    private void zzh(JSONObject jSONObject) throws JSONException {
        String optString = jSONObject.optString("format");
        CharSequence optString2 = jSONObject.optString("ad_unit_id");
        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
            if ("interstitial".equalsIgnoreCase(optString)) {
                this.zzPv.add(optString2);
            } else if ("rewarded".equalsIgnoreCase(optString)) {
                JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                if (optJSONObject != null) {
                    JSONArray optJSONArray = optJSONObject.optJSONArray("ad_networks");
                    if (optJSONArray != null) {
                        int i = 0;
                        while (i < optJSONArray.length()) {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                            JSONArray optJSONArray2 = jSONObject2.optJSONArray("adapters");
                            if (optJSONArray2 != null) {
                                List arrayList = new ArrayList();
                                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                                    arrayList.add(optJSONArray2.getString(i2));
                                }
                                jSONObject2 = jSONObject2.optJSONObject("data");
                                if (jSONObject2 != null) {
                                    Bundle bundle = new Bundle();
                                    Iterator keys = jSONObject2.keys();
                                    while (keys.hasNext()) {
                                        optString = (String) keys.next();
                                        bundle.putString(optString, jSONObject2.getString(optString));
                                    }
                                    a aVar = new a(this, arrayList, bundle);
                                    b bVar = this.zzPw.containsKey(optString2) ? (b) this.zzPw.get(optString2) : new b(this);
                                    bVar.a(aVar);
                                    this.zzPw.put(optString2, bVar);
                                    i++;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    public boolean zziA() {
        return this.zzPz;
    }

    public String zziB() {
        return this.zzPy;
    }

    public String zziC() {
        return this.zzPx;
    }

    public long zziz() {
        return this.zzPu;
    }
}
