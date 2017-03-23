package com.google.android.gms.b;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug.MemoryInfo;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.b.xi.a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@vz
public final class wz {
    private static final SimpleDateFormat a = new SimpleDateFormat("yyyyMMdd", Locale.US);

    private static Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("runtime_free", Long.toString(bundle.getLong("runtime_free_memory", -1)));
        bundle2.putString("runtime_max", Long.toString(bundle.getLong("runtime_max_memory", -1)));
        bundle2.putString("runtime_total", Long.toString(bundle.getLong("runtime_total_memory", -1)));
        MemoryInfo memoryInfo = (MemoryInfo) bundle.getParcelable("debug_memory_info");
        if (memoryInfo != null) {
            bundle2.putString("debug_info_dalvik_private_dirty", Integer.toString(memoryInfo.dalvikPrivateDirty));
            bundle2.putString("debug_info_dalvik_pss", Integer.toString(memoryInfo.dalvikPss));
            bundle2.putString("debug_info_dalvik_shared_dirty", Integer.toString(memoryInfo.dalvikSharedDirty));
            bundle2.putString("debug_info_native_private_dirty", Integer.toString(memoryInfo.nativePrivateDirty));
            bundle2.putString("debug_info_native_pss", Integer.toString(memoryInfo.nativePss));
            bundle2.putString("debug_info_native_shared_dirty", Integer.toString(memoryInfo.nativeSharedDirty));
            bundle2.putString("debug_info_other_private_dirty", Integer.toString(memoryInfo.otherPrivateDirty));
            bundle2.putString("debug_info_other_pss", Integer.toString(memoryInfo.otherPss));
            bundle2.putString("debug_info_other_shared_dirty", Integer.toString(memoryInfo.otherSharedDirty));
        }
        return bundle2;
    }

    public static wi a(Context context, wf wfVar, String str) {
        String optString;
        try {
            String str2;
            JSONObject jSONObject = new JSONObject(str);
            String optString2 = jSONObject.optString("ad_base_url", null);
            Object optString3 = jSONObject.optString("ad_url", null);
            String optString4 = jSONObject.optString("ad_size", null);
            String optString5 = jSONObject.optString("ad_slot_size", optString4);
            boolean z = (wfVar == null || wfVar.m == 0) ? false : true;
            CharSequence optString6 = jSONObject.optString("ad_json", null);
            if (optString6 == null) {
                optString6 = jSONObject.optString("ad_html", null);
            }
            if (optString6 == null) {
                optString6 = jSONObject.optString("body", null);
            }
            long j = -1;
            String optString7 = jSONObject.optString("debug_dialog", null);
            String optString8 = jSONObject.optString("debug_signals", null);
            long j2 = jSONObject.has("interstitial_timeout") ? (long) (jSONObject.getDouble("interstitial_timeout") * 1000.0d) : -1;
            optString = jSONObject.optString("orientation", null);
            int i = -1;
            if ("portrait".equals(optString)) {
                i = v.g().b();
            } else if ("landscape".equals(optString)) {
                i = v.g().a();
            }
            wi wiVar = null;
            if (!TextUtils.isEmpty(optString6) || TextUtils.isEmpty(optString3)) {
                CharSequence charSequence = optString6;
            } else {
                wiVar = wx.a(wfVar, context, wfVar.k.b, optString3, null, null, null, null);
                optString2 = wiVar.b;
                str2 = wiVar.c;
                j = wiVar.n;
            }
            if (str2 == null) {
                return new wi(0);
            }
            long j3;
            String optString9;
            String str3;
            boolean optBoolean;
            JSONArray optJSONArray = jSONObject.optJSONArray("click_urls");
            List list = wiVar == null ? null : wiVar.d;
            if (optJSONArray != null) {
                list = a(optJSONArray, list);
            }
            optJSONArray = jSONObject.optJSONArray("impression_urls");
            List list2 = wiVar == null ? null : wiVar.f;
            if (optJSONArray != null) {
                list2 = a(optJSONArray, list2);
            }
            optJSONArray = jSONObject.optJSONArray("manual_impression_urls");
            List list3 = wiVar == null ? null : wiVar.j;
            if (optJSONArray != null) {
                list3 = a(optJSONArray, list3);
            }
            if (wiVar != null) {
                if (wiVar.l != -1) {
                    i = wiVar.l;
                }
                if (wiVar.g > 0) {
                    j3 = wiVar.g;
                    optString9 = jSONObject.optString("active_view");
                    str3 = null;
                    optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
                    if (optBoolean) {
                        str3 = jSONObject.optString("ad_passback_url", null);
                    }
                    return new wi(wfVar, optString2, str2, list, list2, j3, jSONObject.optBoolean("mediation", false), jSONObject.optLong("mediation_config_cache_time_milliseconds", -1), list3, jSONObject.optLong("refresh_interval_milliseconds", -1), i, optString4, j, optString7, optBoolean, str3, optString9, jSONObject.optBoolean("custom_render_allowed", false), z, wfVar.p, jSONObject.optBoolean("content_url_opted_out", true), jSONObject.optBoolean("prefetch", false), jSONObject.optString("gws_query_id", ""), "height".equals(jSONObject.optString("fluid", "")), jSONObject.optBoolean("native_express", false), yj.a(jSONObject.optJSONArray("rewards")), a(jSONObject.optJSONArray("video_start_urls"), null), a(jSONObject.optJSONArray("video_complete_urls"), null), jSONObject.optBoolean("use_displayed_impression", false), wk.a(jSONObject.optJSONObject("auto_protection_configuration")), wfVar.I, jSONObject.optString("set_cookie", ""), a(jSONObject.optJSONArray("remote_ping_urls"), null), jSONObject.optBoolean("render_in_browser", wfVar.M), optString5, ym.a(jSONObject.optJSONObject("safe_browsing")), optString8, jSONObject.optBoolean("content_vertical_opted_out", true));
                }
            }
            j3 = j2;
            optString9 = jSONObject.optString("active_view");
            str3 = null;
            optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
            if (optBoolean) {
                str3 = jSONObject.optString("ad_passback_url", null);
            }
            return new wi(wfVar, optString2, str2, list, list2, j3, jSONObject.optBoolean("mediation", false), jSONObject.optLong("mediation_config_cache_time_milliseconds", -1), list3, jSONObject.optLong("refresh_interval_milliseconds", -1), i, optString4, j, optString7, optBoolean, str3, optString9, jSONObject.optBoolean("custom_render_allowed", false), z, wfVar.p, jSONObject.optBoolean("content_url_opted_out", true), jSONObject.optBoolean("prefetch", false), jSONObject.optString("gws_query_id", ""), "height".equals(jSONObject.optString("fluid", "")), jSONObject.optBoolean("native_express", false), yj.a(jSONObject.optJSONArray("rewards")), a(jSONObject.optJSONArray("video_start_urls"), null), a(jSONObject.optJSONArray("video_complete_urls"), null), jSONObject.optBoolean("use_displayed_impression", false), wk.a(jSONObject.optJSONObject("auto_protection_configuration")), wfVar.I, jSONObject.optString("set_cookie", ""), a(jSONObject.optJSONArray("remote_ping_urls"), null), jSONObject.optBoolean("render_in_browser", wfVar.M), optString5, ym.a(jSONObject.optJSONObject("safe_browsing")), optString8, jSONObject.optBoolean("content_vertical_opted_out", true));
        } catch (JSONException e) {
            String str4 = "Could not parse the inline ad response: ";
            optString = String.valueOf(e.getMessage());
            zy.e(optString.length() != 0 ? str4.concat(optString) : new String(str4));
            return new wi(0);
        }
    }

    private static Integer a(boolean z) {
        return Integer.valueOf(z ? 1 : 0);
    }

    private static String a(int i) {
        return String.format(Locale.US, "#%06x", new Object[]{Integer.valueOf(16777215 & i)});
    }

    private static String a(qr qrVar) {
        switch (qrVar != null ? qrVar.c : 0) {
            case 1:
                return "portrait";
            case 2:
                return "landscape";
            default:
                return "any";
        }
    }

    private static List<String> a(JSONArray jSONArray, List<String> list) {
        if (jSONArray == null) {
            return null;
        }
        if (list == null) {
            list = new LinkedList();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            list.add(jSONArray.getString(i));
        }
        return list;
    }

    static JSONArray a(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        for (String put : list) {
            jSONArray.put(put);
        }
        return jSONArray;
    }

    public static JSONObject a(Context context, wv wvVar) {
        Object obj;
        String str;
        String valueOf;
        wf wfVar = wvVar.h;
        Location location = wvVar.d;
        xe xeVar = wvVar.i;
        Bundle bundle = wvVar.a;
        JSONObject jSONObject = wvVar.j;
        HashMap hashMap = new HashMap();
        hashMap.put("extra_caps", pr.bX.c());
        if (wvVar.c.size() > 0) {
            hashMap.put("eid", TextUtils.join(",", wvVar.c));
        }
        if (wfVar.b != null) {
            hashMap.put("ad_pos", wfVar.b);
        }
        a(hashMap, wfVar.c);
        if (wfVar.d.h != null) {
            obj = null;
            Object obj2 = null;
            for (nx nxVar : wfVar.d.h) {
                if (!nxVar.j && r3 == null) {
                    hashMap.put("format", nxVar.b);
                    obj2 = 1;
                }
                if (nxVar.j && r2 == null) {
                    hashMap.put("fluid", "height");
                    obj = 1;
                }
                if (obj2 != null && r2 != null) {
                    break;
                }
            }
        } else {
            hashMap.put("format", wfVar.d.b);
            if (wfVar.d.j) {
                hashMap.put("fluid", "height");
            }
        }
        if (wfVar.d.f == -1) {
            hashMap.put("smart_w", "full");
        }
        if (wfVar.d.c == -2) {
            hashMap.put("smart_h", "auto");
        }
        if (wfVar.d.h != null) {
            StringBuilder stringBuilder = new StringBuilder();
            obj = null;
            for (nx nxVar2 : wfVar.d.h) {
                if (nxVar2.j) {
                    obj = 1;
                } else {
                    int i;
                    if (stringBuilder.length() != 0) {
                        stringBuilder.append("|");
                    }
                    if (nxVar2.f == -1) {
                        i = (int) (((float) nxVar2.g) / xeVar.r);
                    } else {
                        try {
                            i = nxVar2.f;
                        } catch (JSONException e) {
                            str = "Problem serializing ad request to JSON: ";
                            valueOf = String.valueOf(e.getMessage());
                            zy.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                            return null;
                        }
                    }
                    stringBuilder.append(i);
                    stringBuilder.append("x");
                    stringBuilder.append(nxVar2.c == -2 ? (int) (((float) nxVar2.d) / xeVar.r) : nxVar2.c);
                }
            }
            if (obj != null) {
                if (stringBuilder.length() != 0) {
                    stringBuilder.insert(0, "|");
                }
                stringBuilder.insert(0, "320x50");
            }
            hashMap.put("sz", stringBuilder);
        }
        if (wfVar.m != 0) {
            hashMap.put("native_version", Integer.valueOf(wfVar.m));
            hashMap.put("native_templates", wfVar.n);
            hashMap.put("native_image_orientation", a(wfVar.z));
            if (!wfVar.A.isEmpty()) {
                hashMap.put("native_custom_templates", wfVar.A);
            }
        }
        if (wfVar.d.k) {
            hashMap.put("ene", Boolean.valueOf(true));
        }
        hashMap.put("slotname", wfVar.e);
        hashMap.put("pn", wfVar.f.packageName);
        if (wfVar.g != null) {
            hashMap.put("vc", Integer.valueOf(wfVar.g.versionCode));
        }
        hashMap.put("ms", wvVar.g);
        hashMap.put("seq_num", wfVar.i);
        hashMap.put("session_id", wfVar.j);
        hashMap.put("js", wfVar.k.b);
        a(hashMap, xeVar, wvVar.e, wfVar.O, wvVar.b);
        a(hashMap, wvVar.f);
        hashMap.put("platform", Build.MANUFACTURER);
        hashMap.put("submodel", Build.MODEL);
        if (location != null) {
            a(hashMap, location);
        } else if (wfVar.c.a >= 2 && wfVar.c.k != null) {
            a(hashMap, wfVar.c.k);
        }
        if (wfVar.a >= 2) {
            hashMap.put("quality_signals", wfVar.l);
        }
        if (wfVar.a >= 4 && wfVar.p) {
            hashMap.put("forceHttps", Boolean.valueOf(wfVar.p));
        }
        if (bundle != null) {
            hashMap.put("content_info", bundle);
        }
        if (wfVar.a >= 5) {
            hashMap.put("u_sd", Float.valueOf(wfVar.t));
            hashMap.put("sh", Integer.valueOf(wfVar.s));
            hashMap.put("sw", Integer.valueOf(wfVar.r));
        } else {
            hashMap.put("u_sd", Float.valueOf(xeVar.r));
            hashMap.put("sh", Integer.valueOf(xeVar.t));
            hashMap.put("sw", Integer.valueOf(xeVar.s));
        }
        if (wfVar.a >= 6) {
            if (!TextUtils.isEmpty(wfVar.u)) {
                try {
                    hashMap.put("view_hierarchy", new JSONObject(wfVar.u));
                } catch (Throwable e2) {
                    zy.c("Problem serializing view hierarchy to JSON", e2);
                }
            }
            hashMap.put("correlation_id", Long.valueOf(wfVar.v));
        }
        if (wfVar.a >= 7) {
            hashMap.put("request_id", wfVar.w);
        }
        if (wfVar.a >= 11 && wfVar.C != null) {
            hashMap.put("capability", wfVar.C.a());
        }
        if (wfVar.a >= 12 && !TextUtils.isEmpty(wfVar.D)) {
            hashMap.put("anchor", wfVar.D);
        }
        if (wfVar.a >= 13) {
            hashMap.put("android_app_volume", Float.valueOf(wfVar.E));
        }
        if (wfVar.a >= 18) {
            hashMap.put("android_app_muted", Boolean.valueOf(wfVar.K));
        }
        if (wfVar.a >= 14 && wfVar.F > 0) {
            hashMap.put("target_api", Integer.valueOf(wfVar.F));
        }
        if (wfVar.a >= 15) {
            hashMap.put("scroll_index", Integer.valueOf(wfVar.G == -1 ? -1 : wfVar.G));
        }
        if (wfVar.a >= 16) {
            hashMap.put("_activity_context", Boolean.valueOf(wfVar.H));
        }
        if (wfVar.a >= 18) {
            if (!TextUtils.isEmpty(wfVar.L)) {
                try {
                    hashMap.put("app_settings", new JSONObject(wfVar.L));
                } catch (Throwable e22) {
                    zy.c("Problem creating json from app settings", e22);
                }
            }
            hashMap.put("render_in_browser", Boolean.valueOf(wfVar.M));
        }
        if (wfVar.a >= 18) {
            hashMap.put("android_num_video_cache_tasks", Integer.valueOf(wfVar.N));
        }
        a(hashMap);
        hashMap.put("cache_state", jSONObject);
        if (wfVar.a >= 19) {
            hashMap.put("gct", wfVar.P);
        }
        if (zy.a(2)) {
            str = "Ad Request JSON: ";
            valueOf = String.valueOf(v.e().a((Map) hashMap).toString(2));
            ze.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        return v.e().a((Map) hashMap);
    }

    public static JSONObject a(wi wiVar) {
        JSONObject jSONObject = new JSONObject();
        if (wiVar.b != null) {
            jSONObject.put("ad_base_url", wiVar.b);
        }
        if (wiVar.m != null) {
            jSONObject.put("ad_size", wiVar.m);
        }
        jSONObject.put("native", wiVar.t);
        if (wiVar.t) {
            jSONObject.put("ad_json", wiVar.c);
        } else {
            jSONObject.put("ad_html", wiVar.c);
        }
        if (wiVar.o != null) {
            jSONObject.put("debug_dialog", wiVar.o);
        }
        if (wiVar.N != null) {
            jSONObject.put("debug_signals", wiVar.N);
        }
        if (wiVar.g != -1) {
            jSONObject.put("interstitial_timeout", ((double) wiVar.g) / 1000.0d);
        }
        if (wiVar.l == v.g().b()) {
            jSONObject.put("orientation", "portrait");
        } else if (wiVar.l == v.g().a()) {
            jSONObject.put("orientation", "landscape");
        }
        if (wiVar.d != null) {
            jSONObject.put("click_urls", a(wiVar.d));
        }
        if (wiVar.f != null) {
            jSONObject.put("impression_urls", a(wiVar.f));
        }
        if (wiVar.j != null) {
            jSONObject.put("manual_impression_urls", a(wiVar.j));
        }
        if (wiVar.r != null) {
            jSONObject.put("active_view", wiVar.r);
        }
        jSONObject.put("ad_is_javascript", wiVar.p);
        if (wiVar.q != null) {
            jSONObject.put("ad_passback_url", wiVar.q);
        }
        jSONObject.put("mediation", wiVar.h);
        jSONObject.put("custom_render_allowed", wiVar.s);
        jSONObject.put("content_url_opted_out", wiVar.v);
        jSONObject.put("content_vertical_opted_out", wiVar.O);
        jSONObject.put("prefetch", wiVar.w);
        if (wiVar.k != -1) {
            jSONObject.put("refresh_interval_milliseconds", wiVar.k);
        }
        if (wiVar.i != -1) {
            jSONObject.put("mediation_config_cache_time_milliseconds", wiVar.i);
        }
        if (!TextUtils.isEmpty(wiVar.z)) {
            jSONObject.put("gws_query_id", wiVar.z);
        }
        jSONObject.put("fluid", wiVar.A ? "height" : "");
        jSONObject.put("native_express", wiVar.B);
        if (wiVar.D != null) {
            jSONObject.put("video_start_urls", a(wiVar.D));
        }
        if (wiVar.E != null) {
            jSONObject.put("video_complete_urls", a(wiVar.E));
        }
        if (wiVar.C != null) {
            jSONObject.put("rewards", wiVar.C.a());
        }
        jSONObject.put("use_displayed_impression", wiVar.F);
        jSONObject.put("auto_protection_configuration", wiVar.G);
        jSONObject.put("render_in_browser", wiVar.K);
        return jSONObject;
    }

    private static void a(HashMap<String, Object> hashMap) {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putString("cl", "139965458");
        bundle2.putString("rapid_rc", "dev");
        bundle2.putString("rapid_rollup", "HEAD");
        bundle.putBundle("build_meta", bundle2);
        bundle.putString("mf", Boolean.toString(((Boolean) pr.bZ.c()).booleanValue()));
        hashMap.put("sdk_env", bundle);
    }

    private static void a(HashMap<String, Object> hashMap, Location location) {
        HashMap hashMap2 = new HashMap();
        Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
        Long valueOf2 = Long.valueOf(location.getTime() * 1000);
        Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
        Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
        hashMap2.put("radius", valueOf);
        hashMap2.put("lat", valueOf3);
        hashMap2.put("long", valueOf4);
        hashMap2.put("time", valueOf2);
        hashMap.put("uule", hashMap2);
    }

    private static void a(HashMap<String, Object> hashMap, ns nsVar) {
        String a = zc.a();
        if (a != null) {
            hashMap.put("abf", a);
        }
        if (nsVar.b != -1) {
            hashMap.put("cust_age", a.format(new Date(nsVar.b)));
        }
        if (nsVar.c != null) {
            hashMap.put("extras", nsVar.c);
        }
        if (nsVar.d != -1) {
            hashMap.put("cust_gender", Integer.valueOf(nsVar.d));
        }
        if (nsVar.e != null) {
            hashMap.put("kw", nsVar.e);
        }
        if (nsVar.g != -1) {
            hashMap.put("tag_for_child_directed_treatment", Integer.valueOf(nsVar.g));
        }
        if (nsVar.f) {
            hashMap.put("adtest", "on");
        }
        if (nsVar.a >= 2) {
            if (nsVar.h) {
                hashMap.put("d_imp_hdr", Integer.valueOf(1));
            }
            if (!TextUtils.isEmpty(nsVar.i)) {
                hashMap.put("ppid", nsVar.i);
            }
            if (nsVar.j != null) {
                a((HashMap) hashMap, nsVar.j);
            }
        }
        if (nsVar.a >= 3 && nsVar.l != null) {
            hashMap.put("url", nsVar.l);
        }
        if (nsVar.a >= 5) {
            if (nsVar.n != null) {
                hashMap.put("custom_targeting", nsVar.n);
            }
            if (nsVar.o != null) {
                hashMap.put("category_exclusions", nsVar.o);
            }
            if (nsVar.p != null) {
                hashMap.put("request_agent", nsVar.p);
            }
        }
        if (nsVar.a >= 6 && nsVar.q != null) {
            hashMap.put("request_pkg", nsVar.q);
        }
        if (nsVar.a >= 7) {
            hashMap.put("is_designed_for_families", Boolean.valueOf(nsVar.r));
        }
    }

    private static void a(HashMap<String, Object> hashMap, pd pdVar) {
        Object obj;
        Object obj2 = null;
        if (Color.alpha(pdVar.b) != 0) {
            hashMap.put("acolor", a(pdVar.b));
        }
        if (Color.alpha(pdVar.c) != 0) {
            hashMap.put("bgcolor", a(pdVar.c));
        }
        if (!(Color.alpha(pdVar.d) == 0 || Color.alpha(pdVar.e) == 0)) {
            hashMap.put("gradientto", a(pdVar.d));
            hashMap.put("gradientfrom", a(pdVar.e));
        }
        if (Color.alpha(pdVar.f) != 0) {
            hashMap.put("bcolor", a(pdVar.f));
        }
        hashMap.put("bthick", Integer.toString(pdVar.g));
        switch (pdVar.h) {
            case 0:
                obj = "none";
                break;
            case 1:
                obj = "dashed";
                break;
            case 2:
                obj = "dotted";
                break;
            case 3:
                obj = "solid";
                break;
            default:
                obj = null;
                break;
        }
        if (obj != null) {
            hashMap.put("btype", obj);
        }
        switch (pdVar.i) {
            case 0:
                obj2 = "light";
                break;
            case 1:
                obj2 = "medium";
                break;
            case 2:
                obj2 = "dark";
                break;
        }
        if (obj2 != null) {
            hashMap.put("callbuttoncolor", obj2);
        }
        if (pdVar.j != null) {
            hashMap.put("channel", pdVar.j);
        }
        if (Color.alpha(pdVar.k) != 0) {
            hashMap.put("dcolor", a(pdVar.k));
        }
        if (pdVar.l != null) {
            hashMap.put("font", pdVar.l);
        }
        if (Color.alpha(pdVar.m) != 0) {
            hashMap.put("hcolor", a(pdVar.m));
        }
        hashMap.put("headersize", Integer.toString(pdVar.n));
        if (pdVar.o != null) {
            hashMap.put("q", pdVar.o);
        }
    }

    private static void a(HashMap<String, Object> hashMap, xe xeVar, a aVar, Bundle bundle, Bundle bundle2) {
        hashMap.put("am", Integer.valueOf(xeVar.a));
        hashMap.put("cog", a(xeVar.b));
        hashMap.put("coh", a(xeVar.c));
        if (!TextUtils.isEmpty(xeVar.d)) {
            hashMap.put("carrier", xeVar.d);
        }
        hashMap.put("gl", xeVar.e);
        if (xeVar.f) {
            hashMap.put("simulator", Integer.valueOf(1));
        }
        if (xeVar.g) {
            hashMap.put("is_sidewinder", Integer.valueOf(1));
        }
        hashMap.put("ma", a(xeVar.h));
        hashMap.put("sp", a(xeVar.i));
        hashMap.put("hl", xeVar.j);
        if (!TextUtils.isEmpty(xeVar.k)) {
            hashMap.put("mv", xeVar.k);
        }
        hashMap.put("muv", Integer.valueOf(xeVar.l));
        if (xeVar.m != -2) {
            hashMap.put("cnt", Integer.valueOf(xeVar.m));
        }
        hashMap.put("gnt", Integer.valueOf(xeVar.n));
        hashMap.put("pt", Integer.valueOf(xeVar.o));
        hashMap.put("rm", Integer.valueOf(xeVar.p));
        hashMap.put("riv", Integer.valueOf(xeVar.q));
        Bundle bundle3 = new Bundle();
        bundle3.putString("build", xeVar.y);
        Bundle bundle4 = new Bundle();
        bundle4.putBoolean("is_charging", xeVar.v);
        bundle4.putDouble("battery_level", xeVar.u);
        bundle3.putBundle("battery", bundle4);
        bundle4 = new Bundle();
        bundle4.putInt("active_network_state", xeVar.x);
        bundle4.putBoolean("active_network_metered", xeVar.w);
        if (aVar != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putInt("predicted_latency_micros", aVar.a);
            bundle5.putLong("predicted_down_throughput_bps", aVar.b);
            bundle5.putLong("predicted_up_throughput_bps", aVar.c);
            bundle4.putBundle("predictions", bundle5);
        }
        bundle3.putBundle("network", bundle4);
        bundle4 = new Bundle();
        bundle4.putBoolean("is_browser_custom_tabs_capable", xeVar.z);
        bundle3.putBundle("browser", bundle4);
        if (bundle != null) {
            bundle3.putBundle("android_mem_info", a(bundle));
        }
        bundle4 = new Bundle();
        bundle4.putBundle("parental_controls", bundle2);
        bundle3.putBundle("play_store", bundle4);
        hashMap.put("device", bundle3);
    }

    private static void a(HashMap<String, Object> hashMap, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("doritos", str);
        hashMap.put("pii", bundle);
    }
}
