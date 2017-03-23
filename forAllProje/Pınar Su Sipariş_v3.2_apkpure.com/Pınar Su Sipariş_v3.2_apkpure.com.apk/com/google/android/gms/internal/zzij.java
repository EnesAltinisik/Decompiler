package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug.MemoryInfo;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.SearchAdRequestParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.AutoClickProtectionConfigurationParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.zzis.zza;
import com.google.android.gms.plus.PlusShare;
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

@zzig
public final class zzij {
    private static final SimpleDateFormat zzNd = new SimpleDateFormat("yyyyMMdd", Locale.US);

    private static Integer zzA(boolean z) {
        return Integer.valueOf(z ? 1 : 0);
    }

    private static String zzS(int i) {
        return String.format(Locale.US, "#%06x", new Object[]{Integer.valueOf(16777215 & i)});
    }

    public static AdResponseParcel zza(Context context, AdRequestInfoParcel adRequestInfoParcel, String str) {
        String optString;
        try {
            String str2;
            JSONObject jSONObject = new JSONObject(str);
            String optString2 = jSONObject.optString("ad_base_url", null);
            Object optString3 = jSONObject.optString("ad_url", null);
            String optString4 = jSONObject.optString("ad_size", null);
            boolean z = (adRequestInfoParcel == null || adRequestInfoParcel.zzLo == 0) ? false : true;
            CharSequence optString5 = jSONObject.optString("ad_json", null);
            if (optString5 == null) {
                optString5 = jSONObject.optString("ad_html", null);
            }
            if (optString5 == null) {
                optString5 = jSONObject.optString("body", null);
            }
            long j = -1;
            String optString6 = jSONObject.optString("debug_dialog", null);
            long j2 = jSONObject.has("interstitial_timeout") ? (long) (jSONObject.getDouble("interstitial_timeout") * 1000.0d) : -1;
            optString = jSONObject.optString("orientation", null);
            int i = -1;
            if ("portrait".equals(optString)) {
                i = zzu.zzcm().zzjf();
            } else if ("landscape".equals(optString)) {
                i = zzu.zzcm().zzje();
            }
            AdResponseParcel adResponseParcel = null;
            if (!TextUtils.isEmpty(optString5) || TextUtils.isEmpty(optString3)) {
                CharSequence charSequence = optString5;
            } else {
                adResponseParcel = zzii.zza(adRequestInfoParcel, context, adRequestInfoParcel.zzsx.afmaVersion, optString3, null, null, null, null, null);
                optString2 = adResponseParcel.zzHH;
                str2 = adResponseParcel.body;
                j = adResponseParcel.zzLT;
            }
            if (str2 == null) {
                return new AdResponseParcel(0);
            }
            long j3;
            String optString7;
            String str3;
            boolean optBoolean;
            JSONArray optJSONArray = jSONObject.optJSONArray("click_urls");
            List list = adResponseParcel == null ? null : adResponseParcel.zzEF;
            if (optJSONArray != null) {
                list = zza(optJSONArray, list);
            }
            optJSONArray = jSONObject.optJSONArray("impression_urls");
            List list2 = adResponseParcel == null ? null : adResponseParcel.zzEG;
            if (optJSONArray != null) {
                list2 = zza(optJSONArray, list2);
            }
            optJSONArray = jSONObject.optJSONArray("manual_impression_urls");
            List list3 = adResponseParcel == null ? null : adResponseParcel.zzLR;
            if (optJSONArray != null) {
                list3 = zza(optJSONArray, list3);
            }
            if (adResponseParcel != null) {
                if (adResponseParcel.orientation != -1) {
                    i = adResponseParcel.orientation;
                }
                if (adResponseParcel.zzLO > 0) {
                    j3 = adResponseParcel.zzLO;
                    optString7 = jSONObject.optString("active_view");
                    str3 = null;
                    optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
                    if (optBoolean) {
                        str3 = jSONObject.optString("ad_passback_url", null);
                    }
                    return new AdResponseParcel(adRequestInfoParcel, optString2, str2, list, list2, j3, jSONObject.optBoolean("mediation", false), jSONObject.optLong("mediation_config_cache_time_milliseconds", -1), list3, jSONObject.optLong("refresh_interval_milliseconds", -1), i, optString4, j, optString6, optBoolean, str3, optString7, jSONObject.optBoolean("custom_render_allowed", false), z, adRequestInfoParcel.zzLq, jSONObject.optBoolean("content_url_opted_out", true), jSONObject.optBoolean("prefetch", false), jSONObject.optInt("oauth2_token_status", 0), jSONObject.optString("gws_query_id", ""), "height".equals(jSONObject.optString("fluid", "")), jSONObject.optBoolean("native_express", false), RewardItemParcel.zza(jSONObject.optJSONArray("rewards")), zza(jSONObject.optJSONArray("video_start_urls"), null), zza(jSONObject.optJSONArray("video_complete_urls"), null), jSONObject.optBoolean("use_displayed_impression", false), AutoClickProtectionConfigurationParcel.zzg(jSONObject.optJSONObject("auto_protection_configuration")), adRequestInfoParcel.zzLH, jSONObject.optString("set_cookie", ""), zza(jSONObject.optJSONArray("remote_ping_urls"), null), jSONObject.optString("safe_browsing"), jSONObject.optBoolean("render_in_browser", adRequestInfoParcel.zzEJ));
                }
            }
            j3 = j2;
            optString7 = jSONObject.optString("active_view");
            str3 = null;
            optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
            if (optBoolean) {
                str3 = jSONObject.optString("ad_passback_url", null);
            }
            return new AdResponseParcel(adRequestInfoParcel, optString2, str2, list, list2, j3, jSONObject.optBoolean("mediation", false), jSONObject.optLong("mediation_config_cache_time_milliseconds", -1), list3, jSONObject.optLong("refresh_interval_milliseconds", -1), i, optString4, j, optString6, optBoolean, str3, optString7, jSONObject.optBoolean("custom_render_allowed", false), z, adRequestInfoParcel.zzLq, jSONObject.optBoolean("content_url_opted_out", true), jSONObject.optBoolean("prefetch", false), jSONObject.optInt("oauth2_token_status", 0), jSONObject.optString("gws_query_id", ""), "height".equals(jSONObject.optString("fluid", "")), jSONObject.optBoolean("native_express", false), RewardItemParcel.zza(jSONObject.optJSONArray("rewards")), zza(jSONObject.optJSONArray("video_start_urls"), null), zza(jSONObject.optJSONArray("video_complete_urls"), null), jSONObject.optBoolean("use_displayed_impression", false), AutoClickProtectionConfigurationParcel.zzg(jSONObject.optJSONObject("auto_protection_configuration")), adRequestInfoParcel.zzLH, jSONObject.optString("set_cookie", ""), zza(jSONObject.optJSONArray("remote_ping_urls"), null), jSONObject.optString("safe_browsing"), jSONObject.optBoolean("render_in_browser", adRequestInfoParcel.zzEJ));
        } catch (JSONException e) {
            String str4 = "Could not parse the mediation config: ";
            optString = String.valueOf(e.getMessage());
            zzb.zzaW(optString.length() != 0 ? str4.concat(optString) : new String(str4));
            return new AdResponseParcel(0);
        }
    }

    private static List<String> zza(JSONArray jSONArray, List<String> list) throws JSONException {
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

    public static JSONObject zza(Context context, AdRequestInfoParcel adRequestInfoParcel, zzio com_google_android_gms_internal_zzio, zza com_google_android_gms_internal_zzis_zza, Location location, zzcn com_google_android_gms_internal_zzcn, String str, String str2, List<String> list, Bundle bundle, String str3) {
        String str4;
        String valueOf;
        try {
            HashMap hashMap = new HashMap();
            if (list.size() > 0) {
                hashMap.put("eid", TextUtils.join(",", list));
            }
            if (adRequestInfoParcel.zzLh != null) {
                hashMap.put("ad_pos", adRequestInfoParcel.zzLh);
            }
            zza(hashMap, adRequestInfoParcel.zzLi);
            hashMap.put("format", adRequestInfoParcel.zzsB.zzvs);
            if (adRequestInfoParcel.zzsB.width == -1) {
                hashMap.put("smart_w", "full");
            }
            if (adRequestInfoParcel.zzsB.height == -2) {
                hashMap.put("smart_h", "auto");
            }
            if (adRequestInfoParcel.zzsB.zzvw) {
                hashMap.put("fluid", "height");
            }
            if (adRequestInfoParcel.zzsB.zzvu != null) {
                StringBuilder stringBuilder = new StringBuilder();
                for (AdSizeParcel adSizeParcel : adRequestInfoParcel.zzsB.zzvu) {
                    if (stringBuilder.length() != 0) {
                        stringBuilder.append("|");
                    }
                    stringBuilder.append(adSizeParcel.width == -1 ? (int) (((float) adSizeParcel.widthPixels) / com_google_android_gms_internal_zzio.zzLu) : adSizeParcel.width);
                    stringBuilder.append("x");
                    stringBuilder.append(adSizeParcel.height == -2 ? (int) (((float) adSizeParcel.heightPixels) / com_google_android_gms_internal_zzio.zzLu) : adSizeParcel.height);
                }
                hashMap.put("sz", stringBuilder);
            }
            if (adRequestInfoParcel.zzLo != 0) {
                hashMap.put("native_version", Integer.valueOf(adRequestInfoParcel.zzLo));
                if (!adRequestInfoParcel.zzsB.zzvx) {
                    hashMap.put("native_templates", adRequestInfoParcel.zzsT);
                    hashMap.put("native_image_orientation", zzc(adRequestInfoParcel.zzsP));
                    if (!adRequestInfoParcel.zzLz.isEmpty()) {
                        hashMap.put("native_custom_templates", adRequestInfoParcel.zzLz);
                    }
                }
            }
            hashMap.put("slotname", adRequestInfoParcel.zzsv);
            hashMap.put("pn", adRequestInfoParcel.applicationInfo.packageName);
            if (adRequestInfoParcel.zzLj != null) {
                hashMap.put("vc", Integer.valueOf(adRequestInfoParcel.zzLj.versionCode));
            }
            hashMap.put("ms", str2);
            hashMap.put("seq_num", adRequestInfoParcel.zzLl);
            hashMap.put("session_id", adRequestInfoParcel.zzLm);
            hashMap.put("js", adRequestInfoParcel.zzsx.afmaVersion);
            zza(hashMap, com_google_android_gms_internal_zzio, com_google_android_gms_internal_zzis_zza, adRequestInfoParcel.zzLM);
            zza(hashMap, str3, str);
            hashMap.put("platform", Build.MANUFACTURER);
            hashMap.put("submodel", Build.MODEL);
            if (location != null) {
                zza(hashMap, location);
            } else if (adRequestInfoParcel.zzLi.versionCode >= 2 && adRequestInfoParcel.zzLi.zzuV != null) {
                zza(hashMap, adRequestInfoParcel.zzLi.zzuV);
            }
            if (adRequestInfoParcel.versionCode >= 2) {
                hashMap.put("quality_signals", adRequestInfoParcel.zzLn);
            }
            if (adRequestInfoParcel.versionCode >= 4 && adRequestInfoParcel.zzLq) {
                hashMap.put("forceHttps", Boolean.valueOf(adRequestInfoParcel.zzLq));
            }
            if (bundle != null) {
                hashMap.put("content_info", bundle);
            }
            if (adRequestInfoParcel.versionCode >= 5) {
                hashMap.put("u_sd", Float.valueOf(adRequestInfoParcel.zzLu));
                hashMap.put("sh", Integer.valueOf(adRequestInfoParcel.zzLt));
                hashMap.put("sw", Integer.valueOf(adRequestInfoParcel.zzLs));
            } else {
                hashMap.put("u_sd", Float.valueOf(com_google_android_gms_internal_zzio.zzLu));
                hashMap.put("sh", Integer.valueOf(com_google_android_gms_internal_zzio.zzLt));
                hashMap.put("sw", Integer.valueOf(com_google_android_gms_internal_zzio.zzLs));
            }
            if (adRequestInfoParcel.versionCode >= 6) {
                if (!TextUtils.isEmpty(adRequestInfoParcel.zzLv)) {
                    try {
                        hashMap.put("view_hierarchy", new JSONObject(adRequestInfoParcel.zzLv));
                    } catch (Throwable e) {
                        zzb.zzd("Problem serializing view hierarchy to JSON", e);
                    }
                }
                hashMap.put("correlation_id", Long.valueOf(adRequestInfoParcel.zzLw));
            }
            if (adRequestInfoParcel.versionCode >= 7) {
                hashMap.put("request_id", adRequestInfoParcel.zzLx);
            }
            if (adRequestInfoParcel.versionCode >= 11 && adRequestInfoParcel.zzLB != null) {
                hashMap.put("capability", adRequestInfoParcel.zzLB.toBundle());
            }
            if (adRequestInfoParcel.versionCode >= 12 && !TextUtils.isEmpty(adRequestInfoParcel.zzLC)) {
                hashMap.put("anchor", adRequestInfoParcel.zzLC);
            }
            if (adRequestInfoParcel.versionCode >= 13) {
                hashMap.put("android_app_volume", Float.valueOf(adRequestInfoParcel.zzLD));
            }
            if (adRequestInfoParcel.versionCode >= 18) {
                hashMap.put("android_app_muted", Boolean.valueOf(adRequestInfoParcel.zzLJ));
            }
            if (adRequestInfoParcel.versionCode >= 14 && adRequestInfoParcel.zzLE > 0) {
                hashMap.put("target_api", Integer.valueOf(adRequestInfoParcel.zzLE));
            }
            if (adRequestInfoParcel.versionCode >= 15) {
                hashMap.put("scroll_index", Integer.valueOf(adRequestInfoParcel.zzLF == -1 ? -1 : adRequestInfoParcel.zzLF));
            }
            if (adRequestInfoParcel.versionCode >= 16) {
                hashMap.put("_activity_context", Boolean.valueOf(adRequestInfoParcel.zzLG));
            }
            if (adRequestInfoParcel.versionCode >= 18) {
                if (!TextUtils.isEmpty(adRequestInfoParcel.zzLK)) {
                    try {
                        hashMap.put("app_settings", new JSONObject(adRequestInfoParcel.zzLK));
                    } catch (Throwable e2) {
                        zzb.zzd("Problem creating json from app settings", e2);
                    }
                }
                hashMap.put("render_in_browser", Boolean.valueOf(adRequestInfoParcel.zzEJ));
            }
            if (adRequestInfoParcel.versionCode >= 18) {
                hashMap.put("android_num_video_cache_tasks", Integer.valueOf(adRequestInfoParcel.zzLL));
            }
            if (zzb.zzX(2)) {
                str4 = "Ad Request JSON: ";
                valueOf = String.valueOf(zzu.zzck().zzM((Map) hashMap).toString(2));
                zzjw.v(valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
            }
            return zzu.zzck().zzM((Map) hashMap);
        } catch (JSONException e3) {
            str4 = "Problem serializing ad request to JSON: ";
            valueOf = String.valueOf(e3.getMessage());
            zzb.zzaW(valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
            return null;
        }
    }

    private static void zza(HashMap<String, Object> hashMap, Location location) {
        HashMap hashMap2 = new HashMap();
        Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
        Long valueOf2 = Long.valueOf(location.getTime() * 1000);
        Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
        Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
        hashMap2.put("radius", valueOf);
        hashMap2.put("lat", valueOf3);
        hashMap2.put(Constants.LONG, valueOf4);
        hashMap2.put("time", valueOf2);
        hashMap.put("uule", hashMap2);
    }

    private static void zza(HashMap<String, Object> hashMap, AdRequestParcel adRequestParcel) {
        String zziT = zzju.zziT();
        if (zziT != null) {
            hashMap.put("abf", zziT);
        }
        if (adRequestParcel.zzuN != -1) {
            hashMap.put("cust_age", zzNd.format(new Date(adRequestParcel.zzuN)));
        }
        if (adRequestParcel.extras != null) {
            hashMap.put("extras", adRequestParcel.extras);
        }
        if (adRequestParcel.zzuO != -1) {
            hashMap.put("cust_gender", Integer.valueOf(adRequestParcel.zzuO));
        }
        if (adRequestParcel.zzuP != null) {
            hashMap.put("kw", adRequestParcel.zzuP);
        }
        if (adRequestParcel.zzuR != -1) {
            hashMap.put("tag_for_child_directed_treatment", Integer.valueOf(adRequestParcel.zzuR));
        }
        if (adRequestParcel.zzuQ) {
            hashMap.put("adtest", "on");
        }
        if (adRequestParcel.versionCode >= 2) {
            if (adRequestParcel.zzuS) {
                hashMap.put("d_imp_hdr", Integer.valueOf(1));
            }
            if (!TextUtils.isEmpty(adRequestParcel.zzuT)) {
                hashMap.put("ppid", adRequestParcel.zzuT);
            }
            if (adRequestParcel.zzuU != null) {
                zza((HashMap) hashMap, adRequestParcel.zzuU);
            }
        }
        if (adRequestParcel.versionCode >= 3 && adRequestParcel.zzuW != null) {
            hashMap.put(PlusShare.KEY_CALL_TO_ACTION_URL, adRequestParcel.zzuW);
        }
        if (adRequestParcel.versionCode >= 5) {
            if (adRequestParcel.zzuY != null) {
                hashMap.put("custom_targeting", adRequestParcel.zzuY);
            }
            if (adRequestParcel.zzuZ != null) {
                hashMap.put("category_exclusions", adRequestParcel.zzuZ);
            }
            if (adRequestParcel.zzva != null) {
                hashMap.put("request_agent", adRequestParcel.zzva);
            }
        }
        if (adRequestParcel.versionCode >= 6 && adRequestParcel.zzvb != null) {
            hashMap.put("request_pkg", adRequestParcel.zzvb);
        }
        if (adRequestParcel.versionCode >= 7) {
            hashMap.put("is_designed_for_families", Boolean.valueOf(adRequestParcel.zzvc));
        }
    }

    private static void zza(HashMap<String, Object> hashMap, SearchAdRequestParcel searchAdRequestParcel) {
        Object obj;
        Object obj2 = null;
        if (Color.alpha(searchAdRequestParcel.zzwA) != 0) {
            hashMap.put("acolor", zzS(searchAdRequestParcel.zzwA));
        }
        if (Color.alpha(searchAdRequestParcel.backgroundColor) != 0) {
            hashMap.put("bgcolor", zzS(searchAdRequestParcel.backgroundColor));
        }
        if (!(Color.alpha(searchAdRequestParcel.zzwB) == 0 || Color.alpha(searchAdRequestParcel.zzwC) == 0)) {
            hashMap.put("gradientto", zzS(searchAdRequestParcel.zzwB));
            hashMap.put("gradientfrom", zzS(searchAdRequestParcel.zzwC));
        }
        if (Color.alpha(searchAdRequestParcel.zzwD) != 0) {
            hashMap.put("bcolor", zzS(searchAdRequestParcel.zzwD));
        }
        hashMap.put("bthick", Integer.toString(searchAdRequestParcel.zzwE));
        switch (searchAdRequestParcel.zzwF) {
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
        switch (searchAdRequestParcel.zzwG) {
            case 0:
                obj2 = "light";
                break;
            case 1:
                obj2 = Constants.MEDIUM;
                break;
            case 2:
                obj2 = "dark";
                break;
        }
        if (obj2 != null) {
            hashMap.put("callbuttoncolor", obj2);
        }
        if (searchAdRequestParcel.zzwH != null) {
            hashMap.put("channel", searchAdRequestParcel.zzwH);
        }
        if (Color.alpha(searchAdRequestParcel.zzwI) != 0) {
            hashMap.put("dcolor", zzS(searchAdRequestParcel.zzwI));
        }
        if (searchAdRequestParcel.zzwJ != null) {
            hashMap.put("font", searchAdRequestParcel.zzwJ);
        }
        if (Color.alpha(searchAdRequestParcel.zzwK) != 0) {
            hashMap.put("hcolor", zzS(searchAdRequestParcel.zzwK));
        }
        hashMap.put("headersize", Integer.toString(searchAdRequestParcel.zzwL));
        if (searchAdRequestParcel.zzwM != null) {
            hashMap.put("q", searchAdRequestParcel.zzwM);
        }
    }

    private static void zza(HashMap<String, Object> hashMap, zzio com_google_android_gms_internal_zzio, zza com_google_android_gms_internal_zzis_zza, Bundle bundle) {
        hashMap.put("am", Integer.valueOf(com_google_android_gms_internal_zzio.zzNV));
        hashMap.put("cog", zzA(com_google_android_gms_internal_zzio.zzNW));
        hashMap.put("coh", zzA(com_google_android_gms_internal_zzio.zzNX));
        if (!TextUtils.isEmpty(com_google_android_gms_internal_zzio.zzNY)) {
            hashMap.put("carrier", com_google_android_gms_internal_zzio.zzNY);
        }
        hashMap.put("gl", com_google_android_gms_internal_zzio.zzNZ);
        if (com_google_android_gms_internal_zzio.zzOa) {
            hashMap.put("simulator", Integer.valueOf(1));
        }
        if (com_google_android_gms_internal_zzio.zzOb) {
            hashMap.put("is_sidewinder", Integer.valueOf(1));
        }
        hashMap.put("ma", zzA(com_google_android_gms_internal_zzio.zzOc));
        hashMap.put("sp", zzA(com_google_android_gms_internal_zzio.zzOd));
        hashMap.put("hl", com_google_android_gms_internal_zzio.zzOe);
        if (!TextUtils.isEmpty(com_google_android_gms_internal_zzio.zzOf)) {
            hashMap.put("mv", com_google_android_gms_internal_zzio.zzOf);
        }
        hashMap.put("muv", Integer.valueOf(com_google_android_gms_internal_zzio.zzOg));
        if (com_google_android_gms_internal_zzio.zzOh != -2) {
            hashMap.put("cnt", Integer.valueOf(com_google_android_gms_internal_zzio.zzOh));
        }
        hashMap.put("gnt", Integer.valueOf(com_google_android_gms_internal_zzio.zzOi));
        hashMap.put("pt", Integer.valueOf(com_google_android_gms_internal_zzio.zzOj));
        hashMap.put("rm", Integer.valueOf(com_google_android_gms_internal_zzio.zzOk));
        hashMap.put("riv", Integer.valueOf(com_google_android_gms_internal_zzio.zzOl));
        Bundle bundle2 = new Bundle();
        bundle2.putString("build", com_google_android_gms_internal_zzio.zzOq);
        Bundle bundle3 = new Bundle();
        bundle3.putBoolean("is_charging", com_google_android_gms_internal_zzio.zzOn);
        bundle3.putDouble("battery_level", com_google_android_gms_internal_zzio.zzOm);
        bundle2.putBundle("battery", bundle3);
        bundle3 = new Bundle();
        bundle3.putInt("active_network_state", com_google_android_gms_internal_zzio.zzOp);
        bundle3.putBoolean("active_network_metered", com_google_android_gms_internal_zzio.zzOo);
        if (com_google_android_gms_internal_zzis_zza != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("predicted_latency_micros", 0);
            bundle4.putLong("predicted_down_throughput_bps", 0);
            bundle4.putLong("predicted_up_throughput_bps", 0);
            bundle3.putBundle("predictions", bundle4);
        }
        bundle2.putBundle("network", bundle3);
        bundle3 = new Bundle();
        bundle3.putBoolean("is_browser_custom_tabs_capable", com_google_android_gms_internal_zzio.zzOr);
        bundle2.putBundle("browser", bundle3);
        if (bundle != null) {
            bundle2.putBundle("android_mem_info", zzf(bundle));
        }
        hashMap.put("device", bundle2);
    }

    private static void zza(HashMap<String, Object> hashMap, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("doritos", str);
        bundle.putString("token", str2);
        hashMap.put("pii", bundle);
    }

    private static String zzc(NativeAdOptionsParcel nativeAdOptionsParcel) {
        switch (nativeAdOptionsParcel != null ? nativeAdOptionsParcel.zzBm : 0) {
            case 1:
                return "portrait";
            case 2:
                return "landscape";
            default:
                return "any";
        }
    }

    public static JSONObject zzc(AdResponseParcel adResponseParcel) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (adResponseParcel.zzHH != null) {
            jSONObject.put("ad_base_url", adResponseParcel.zzHH);
        }
        if (adResponseParcel.zzLS != null) {
            jSONObject.put("ad_size", adResponseParcel.zzLS);
        }
        jSONObject.put("native", adResponseParcel.zzvv);
        if (adResponseParcel.zzvv) {
            jSONObject.put("ad_json", adResponseParcel.body);
        } else {
            jSONObject.put("ad_html", adResponseParcel.body);
        }
        if (adResponseParcel.zzLU != null) {
            jSONObject.put("debug_dialog", adResponseParcel.zzLU);
        }
        if (adResponseParcel.zzLO != -1) {
            jSONObject.put("interstitial_timeout", ((double) adResponseParcel.zzLO) / 1000.0d);
        }
        if (adResponseParcel.orientation == zzu.zzcm().zzjf()) {
            jSONObject.put("orientation", "portrait");
        } else if (adResponseParcel.orientation == zzu.zzcm().zzje()) {
            jSONObject.put("orientation", "landscape");
        }
        if (adResponseParcel.zzEF != null) {
            jSONObject.put("click_urls", zzk(adResponseParcel.zzEF));
        }
        if (adResponseParcel.zzEG != null) {
            jSONObject.put("impression_urls", zzk(adResponseParcel.zzEG));
        }
        if (adResponseParcel.zzLR != null) {
            jSONObject.put("manual_impression_urls", zzk(adResponseParcel.zzLR));
        }
        if (adResponseParcel.zzLX != null) {
            jSONObject.put("active_view", adResponseParcel.zzLX);
        }
        jSONObject.put("ad_is_javascript", adResponseParcel.zzLV);
        if (adResponseParcel.zzLW != null) {
            jSONObject.put("ad_passback_url", adResponseParcel.zzLW);
        }
        jSONObject.put("mediation", adResponseParcel.zzLP);
        jSONObject.put("custom_render_allowed", adResponseParcel.zzLY);
        jSONObject.put("content_url_opted_out", adResponseParcel.zzLZ);
        jSONObject.put("prefetch", adResponseParcel.zzMa);
        jSONObject.put("oauth2_token_status", adResponseParcel.zzMb);
        if (adResponseParcel.zzEL != -1) {
            jSONObject.put("refresh_interval_milliseconds", adResponseParcel.zzEL);
        }
        if (adResponseParcel.zzLQ != -1) {
            jSONObject.put("mediation_config_cache_time_milliseconds", adResponseParcel.zzLQ);
        }
        if (!TextUtils.isEmpty(adResponseParcel.zzMe)) {
            jSONObject.put("gws_query_id", adResponseParcel.zzMe);
        }
        jSONObject.put("fluid", adResponseParcel.zzvw ? "height" : "");
        jSONObject.put("native_express", adResponseParcel.zzvx);
        if (adResponseParcel.zzMg != null) {
            jSONObject.put("video_start_urls", zzk(adResponseParcel.zzMg));
        }
        if (adResponseParcel.zzMh != null) {
            jSONObject.put("video_complete_urls", zzk(adResponseParcel.zzMh));
        }
        if (adResponseParcel.zzMf != null) {
            jSONObject.put("rewards", adResponseParcel.zzMf.zzir());
        }
        jSONObject.put("use_displayed_impression", adResponseParcel.zzMi);
        jSONObject.put("auto_protection_configuration", adResponseParcel.zzMj);
        jSONObject.put("render_in_browser", adResponseParcel.zzEJ);
        return jSONObject;
    }

    private static Bundle zzf(Bundle bundle) {
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

    static JSONArray zzk(List<String> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (String put : list) {
            jSONArray.put(put);
        }
        return jSONArray;
    }
}
