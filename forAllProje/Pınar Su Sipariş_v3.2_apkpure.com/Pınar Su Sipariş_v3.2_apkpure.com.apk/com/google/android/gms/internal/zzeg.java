package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzig
public final class zzeg {
    public static final zzeh zzBI = new zzeh() {
        public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
        }
    };
    public static final zzeh zzBJ = new zzeh() {
        public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                zzb.zzaW("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str.split(",");
            Map hashMap = new HashMap();
            PackageManager packageManager = com_google_android_gms_internal_zzla.getContext().getPackageManager();
            for (String str2 : split) {
                String[] split2 = str2.split(";", 2);
                hashMap.put(str2, Boolean.valueOf(packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) != null));
            }
            com_google_android_gms_internal_zzla.zza("openableURLs", hashMap);
        }
    };
    public static final zzeh zzBK = new zzeh() {
        public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
            PackageManager packageManager = com_google_android_gms_internal_zzla.getContext().getPackageManager();
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
                                zzb.zzb("Error constructing openable urls response.", e);
                            }
                        } catch (Throwable e2) {
                            zzb.zzb("Error parsing the intent data.", e2);
                        }
                    }
                    com_google_android_gms_internal_zzla.zzb("openableIntents", jSONObject);
                } catch (JSONException e3) {
                    com_google_android_gms_internal_zzla.zzb("openableIntents", new JSONObject());
                }
            } catch (JSONException e4) {
                com_google_android_gms_internal_zzla.zzb("openableIntents", new JSONObject());
            }
        }
    };
    public static final zzeh zzBL = new zzeh() {
        public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
            String str = (String) map.get("u");
            if (str == null) {
                zzb.zzaW("URL missing from click GMSG.");
                return;
            }
            Uri zzb;
            Future future;
            Uri parse = Uri.parse(str);
            try {
                zzaq zzjF = com_google_android_gms_internal_zzla.zzjF();
                if (zzjF != null && zzjF.zzc(parse)) {
                    zzb = zzjF.zzb(parse, com_google_android_gms_internal_zzla.getContext());
                    future = (Future) new zzkj(com_google_android_gms_internal_zzla.getContext(), com_google_android_gms_internal_zzla.zzjG().afmaVersion, zzb.toString()).zzhs();
                }
            } catch (zzar e) {
                String str2 = "Unable to append parameter to URL: ";
                str = String.valueOf(str);
                zzb.zzaW(str.length() != 0 ? str2.concat(str) : new String(str2));
            }
            zzb = parse;
            future = (Future) new zzkj(com_google_android_gms_internal_zzla.getContext(), com_google_android_gms_internal_zzla.zzjG().afmaVersion, zzb.toString()).zzhs();
        }
    };
    public static final zzeh zzBM = new zzeh() {
        public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
            zzd zzjB = com_google_android_gms_internal_zzla.zzjB();
            if (zzjB != null) {
                zzjB.close();
                return;
            }
            zzjB = com_google_android_gms_internal_zzla.zzjC();
            if (zzjB != null) {
                zzjB.close();
            } else {
                zzb.zzaW("A GMSG tried to close something that wasn't an overlay.");
            }
        }
    };
    public static final zzeh zzBN = new zzeh() {
        private void a(zzla com_google_android_gms_internal_zzla) {
            zzb.zzaV("Received support message, responding.");
            boolean z = false;
            com.google.android.gms.ads.internal.zzd zzjA = com_google_android_gms_internal_zzla.zzjA();
            if (zzjA != null) {
                zzm com_google_android_gms_ads_internal_overlay_zzm = zzjA.zzqo;
                if (com_google_android_gms_ads_internal_overlay_zzm != null) {
                    z = com_google_android_gms_ads_internal_overlay_zzm.zzgP();
                }
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("event", "checkSupport");
                jSONObject.put("supports", z);
                com_google_android_gms_internal_zzla.zzb("appStreaming", jSONObject);
            } catch (Throwable th) {
            }
        }

        public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
            if ("checkSupport".equals(map.get("action"))) {
                a(com_google_android_gms_internal_zzla);
                return;
            }
            zzd zzjB = com_google_android_gms_internal_zzla.zzjB();
            if (zzjB != null) {
                zzjB.zzf(com_google_android_gms_internal_zzla, map);
            }
        }
    };
    public static final zzeh zzBO = new zzeh() {
        public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
            com_google_android_gms_internal_zzla.zzH("1".equals(map.get("custom_close")));
        }
    };
    public static final zzeh zzBP = new zzeh() {
        public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
            String str = (String) map.get("u");
            if (str == null) {
                zzb.zzaW("URL missing from httpTrack GMSG.");
            } else {
                Future future = (Future) new zzkj(com_google_android_gms_internal_zzla.getContext(), com_google_android_gms_internal_zzla.zzjG().afmaVersion, str).zzhs();
            }
        }
    };
    public static final zzeh zzBQ = new zzeh() {
        public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
            String str = "Received log message: ";
            String valueOf = String.valueOf((String) map.get("string"));
            zzb.zzaV(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    };
    public static final zzeh zzBR = new zzeh() {
        public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
            String str = (String) map.get("ty");
            String str2 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt((String) map.get("tx"));
                int parseInt2 = Integer.parseInt(str);
                int parseInt3 = Integer.parseInt(str2);
                zzaq zzjF = com_google_android_gms_internal_zzla.zzjF();
                if (zzjF != null) {
                    zzjF.zzW().zza(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException e) {
                zzb.zzaW("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzeh zzBS = new zzeh() {
        public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
            if (((Boolean) zzcu.zzyB.get()).booleanValue()) {
                com_google_android_gms_internal_zzla.zzI(!Boolean.parseBoolean((String) map.get("disabled")));
            }
        }
    };
    public static final zzeh zzBT = new zzeh() {
        public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
            String str = (String) map.get("action");
            if ("pause".equals(str)) {
                com_google_android_gms_internal_zzla.zzbA();
            } else if ("resume".equals(str)) {
                com_google_android_gms_internal_zzla.zzbB();
            }
        }
    };
    public static final zzeh zzBU = new zzeq();
    public static final zzeh zzBV = new r();
    public static final zzeh zzBW = new zzev();
    public static final zzeh zzBX = new zzef();
}
