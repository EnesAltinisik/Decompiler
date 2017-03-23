package com.google.android.gms.b;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.overlay.g;
import com.google.android.gms.ads.internal.v;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@vz
public final class rp {
    public static final rq a = new rq() {
        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
        }
    };
    public static final rq b = new rq() {
        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                zy.e("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str.split(",");
            Map hashMap = new HashMap();
            PackageManager packageManager = com_google_android_gms_b_aaq.getContext().getPackageManager();
            for (String str2 : split) {
                String[] split2 = str2.split(";", 2);
                hashMap.put(str2, Boolean.valueOf(packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) != null));
            }
            com_google_android_gms_b_aaq.a("openableURLs", hashMap);
        }
    };
    public static final rq c = new rq() {
        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            PackageManager packageManager = com_google_android_gms_b_aaq.getContext().getPackageManager();
            try {
                try {
                    JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                    JSONObject jSONObject = new JSONObject();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String optString = jSONObject2.optString("id");
                            Object optString2 = jSONObject2.optString("u");
                            Object optString3 = jSONObject2.optString("i");
                            Object optString4 = jSONObject2.optString("m");
                            Object optString5 = jSONObject2.optString("p");
                            Object optString6 = jSONObject2.optString("c");
                            jSONObject2.optString("f");
                            jSONObject2.optString("e");
                            Intent intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                            try {
                                jSONObject.put(optString, packageManager.resolveActivity(intent, 65536) != null);
                            } catch (Throwable e) {
                                zy.b("Error constructing openable urls response.", e);
                            }
                        } catch (Throwable e2) {
                            zy.b("Error parsing the intent data.", e2);
                        }
                    }
                    com_google_android_gms_b_aaq.b("openableIntents", jSONObject);
                } catch (JSONException e3) {
                    com_google_android_gms_b_aaq.b("openableIntents", new JSONObject());
                }
            } catch (JSONException e4) {
                com_google_android_gms_b_aaq.b("openableIntents", new JSONObject());
            }
        }
    };
    public static final rq d = new rq() {
        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            String str = (String) map.get("u");
            if (str == null) {
                zy.e("URL missing from click GMSG.");
                return;
            }
            Uri a;
            Uri parse = Uri.parse(str);
            try {
                dp n = com_google_android_gms_b_aaq.n();
                if (n != null && n.c(parse)) {
                    a = n.a(parse, com_google_android_gms_b_aaq.getContext(), com_google_android_gms_b_aaq.b());
                    new zs(com_google_android_gms_b_aaq.getContext(), com_google_android_gms_b_aaq.o().b, a.toString()).e();
                }
            } catch (dq e) {
                String str2 = "Unable to append parameter to URL: ";
                str = String.valueOf(str);
                zy.e(str.length() != 0 ? str2.concat(str) : new String(str2));
            }
            a = parse;
            new zs(com_google_android_gms_b_aaq.getContext(), com_google_android_gms_b_aaq.o().b, a.toString()).e();
        }
    };
    public static final rq e = new rq() {
        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            g i = com_google_android_gms_b_aaq.i();
            if (i != null) {
                i.a();
                return;
            }
            i = com_google_android_gms_b_aaq.j();
            if (i != null) {
                i.a();
            } else {
                zy.e("A GMSG tried to close something that wasn't an overlay.");
            }
        }
    };
    public static final rq f = new rq() {
        private void a(aaq com_google_android_gms_b_aaq) {
            zy.d("Received support message, responding.");
            d h = com_google_android_gms_b_aaq.h();
            if (!(h == null || h.c == null)) {
                com_google_android_gms_b_aaq.getContext();
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("event", "checkSupport");
                jSONObject.put("supports", false);
                com_google_android_gms_b_aaq.b("appStreaming", jSONObject);
            } catch (Throwable th) {
            }
        }

        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            if ("checkSupport".equals(map.get("action"))) {
                a(com_google_android_gms_b_aaq);
                return;
            }
            g i = com_google_android_gms_b_aaq.i();
            if (i != null) {
                i.a(com_google_android_gms_b_aaq, (Map) map);
            }
        }
    };
    public static final rq g = new rq() {
        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            com_google_android_gms_b_aaq.b("1".equals(map.get("custom_close")));
        }
    };
    public static final rq h = new rq() {
        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            String str = (String) map.get("u");
            if (str == null) {
                zy.e("URL missing from httpTrack GMSG.");
            } else {
                new zs(com_google_android_gms_b_aaq.getContext(), com_google_android_gms_b_aaq.o().b, str).e();
            }
        }
    };
    public static final rq i = new rq() {
        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            String str = "Received log message: ";
            String valueOf = String.valueOf((String) map.get("string"));
            zy.d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    };
    public static final rq j = new rq() {
        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            qn E = com_google_android_gms_b_aaq.E();
            if (E != null) {
                E.a();
            }
        }
    };
    public static final rq k = new rq() {
        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            String str = (String) map.get("ty");
            String str2 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt((String) map.get("tx"));
                int parseInt2 = Integer.parseInt(str);
                int parseInt3 = Integer.parseInt(str2);
                dp n = com_google_android_gms_b_aaq.n();
                if (n != null) {
                    n.a().a(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException e) {
                zy.e("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final rq l = new rq() {
        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            if (((Boolean) pr.bh.c()).booleanValue()) {
                com_google_android_gms_b_aaq.c(!Boolean.parseBoolean((String) map.get("disabled")));
            }
        }
    };
    public static final rq m = new rq() {
        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            String str = (String) map.get("action");
            if ("pause".equals(str)) {
                com_google_android_gms_b_aaq.H();
            } else if ("resume".equals(str)) {
                com_google_android_gms_b_aaq.I();
            }
        }
    };
    public static final rq n = new sb();
    public static final rq o = new sc();
    public static final rq p = new sg();
    public static final rq q = new ro();
    public static final rz r = new rz();
    public static final rq s = new rq() {
        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            if (map.keySet().contains("start")) {
                com_google_android_gms_b_aaq.l().i();
            } else if (map.keySet().contains("stop")) {
                com_google_android_gms_b_aaq.l().j();
            } else if (map.keySet().contains("cancel")) {
                com_google_android_gms_b_aaq.l().k();
            }
        }
    };
    public static final rq t = new rq() {
        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            if (map.keySet().contains("start")) {
                com_google_android_gms_b_aaq.d(true);
            }
            if (map.keySet().contains("stop")) {
                com_google_android_gms_b_aaq.d(false);
            }
        }
    };
    public static final rq u = new rq() {
        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            com_google_android_gms_b_aaq.a("locationReady", v.e().a((View) com_google_android_gms_b_aaq, (WindowManager) com_google_android_gms_b_aaq.getContext().getSystemService("window")));
            zy.e("GET LOCATION COMPILED");
        }
    };
}
