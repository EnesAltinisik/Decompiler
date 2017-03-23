package com.google.android.gms.internal;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzabe.zza;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzaao {
    public static zzvg zzW(Object obj) throws JSONException {
        String string;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        int i = 1;
        int i2 = 0;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            string = jSONObject.getString("name");
            jSONArray = jSONObject.getJSONArray("params");
            jSONArray2 = jSONObject.getJSONArray("instructions");
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray4 = (JSONArray) obj;
            zzaa.zzaj(jSONArray4.length() >= 3);
            String string2 = jSONArray4.getString(1);
            jSONArray2 = jSONArray4.getJSONArray(2);
            jSONArray3 = new JSONArray();
            while (i < jSONArray2.length()) {
                zzaa.zzaj(jSONArray2.get(i) instanceof String);
                jSONArray3.put(jSONArray2.get(i));
                i++;
            }
            jSONArray = new JSONArray();
            for (int i3 = 3; i3 < jSONArray4.length(); i3++) {
                jSONArray.put(jSONArray4.get(i3));
            }
            jSONArray2 = jSONArray;
            string = string2;
            jSONArray = jSONArray3;
        } else {
            throw new IllegalArgumentException("invalid JSON in runtime section");
        }
        List arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            arrayList.add(jSONArray.getString(i4));
        }
        List arrayList2 = new ArrayList();
        while (i2 < jSONArray2.length()) {
            jSONArray3 = jSONArray2.getJSONArray(i2);
            if (jSONArray3.length() != 0) {
                arrayList2.add(zzd(jSONArray3));
            }
            i2++;
        }
        return new zzvg(null, string, arrayList, arrayList2);
    }

    static zzabe zza(JSONArray jSONArray, List<zzabd> list, List<zzabd> list2) throws zzaan, JSONException {
        zza com_google_android_gms_internal_zzabe_zza = new zza();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            int i2;
            if (jSONArray2.getString(0).equals("if")) {
                for (i2 = 1; i2 < jSONArray2.length(); i2++) {
                    com_google_android_gms_internal_zzabe_zza.zzd((zzabd) list2.get(jSONArray2.getInt(i2)));
                }
            } else if (jSONArray2.getString(0).equals("unless")) {
                for (i2 = 1; i2 < jSONArray2.length(); i2++) {
                    com_google_android_gms_internal_zzabe_zza.zze((zzabd) list2.get(jSONArray2.getInt(i2)));
                }
            } else if (jSONArray2.getString(0).equals(ProductAction.ACTION_ADD)) {
                for (i2 = 1; i2 < jSONArray2.length(); i2++) {
                    com_google_android_gms_internal_zzabe_zza.zzf((zzabd) list.get(jSONArray2.getInt(i2)));
                }
            } else if (jSONArray2.getString(0).equals("block")) {
                for (i2 = 1; i2 < jSONArray2.length(); i2++) {
                    com_google_android_gms_internal_zzabe_zza.zzg((zzabd) list.get(jSONArray2.getInt(i2)));
                }
            } else {
                String str = "Unknown Rule property: ";
                String valueOf = String.valueOf(jSONArray2.getString(0));
                zzhi(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
        return com_google_android_gms_internal_zzabe_zza.zzMe();
    }

    static zzabd zzb(JSONObject jSONObject, List<String> list) throws zzaan, JSONException {
        zzabd.zza com_google_android_gms_internal_zzabd_zza = new zzabd.zza();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            zzabg zzMi = zzb(jSONObject.get(str), (List) list).zzMi();
            if ("push_after_evaluate".equals(str)) {
                com_google_android_gms_internal_zzabd_zza.zzb(zzMi);
            } else {
                com_google_android_gms_internal_zzabd_zza.zza(str, zzMi);
            }
        }
        return com_google_android_gms_internal_zzabd_zza.zzLZ();
    }

    static zzabg.zza zzb(Object obj, List<String> list) throws zzaan, JSONException {
        int i = 2;
        String valueOf;
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            String string = jSONArray.getString(0);
            if (string.equals("escape")) {
                zzabg.zza zzb = zzb(jSONArray.get(1), (List) list);
                while (i < jSONArray.length()) {
                    zzb.zzkY(jSONArray.getInt(i));
                    i++;
                }
                return zzb;
            } else if (string.equals("list")) {
                List arrayList = new ArrayList();
                for (int i2 = 1; i2 < jSONArray.length(); i2++) {
                    arrayList.add(zzb(jSONArray.get(i2), (List) list).zzMi());
                }
                r0 = new zzabg.zza(2, arrayList);
                r0.zzaH(true);
                return r0;
            } else if (string.equals("map")) {
                Map hashMap = new HashMap();
                for (i = 1; i < jSONArray.length(); i += 2) {
                    hashMap.put(zzb(jSONArray.get(i), (List) list).zzMi(), zzb(jSONArray.get(i + 1), (List) list).zzMi());
                }
                r0 = new zzabg.zza(3, hashMap);
                r0.zzaH(true);
                return r0;
            } else if (string.equals("macro")) {
                zzabg.zza com_google_android_gms_internal_zzabg_zza = new zzabg.zza(4, list.get(jSONArray.getInt(1)));
                com_google_android_gms_internal_zzabg_zza.zzaH(true);
                return com_google_android_gms_internal_zzabg_zza;
            } else if (string.equals("template")) {
                List arrayList2 = new ArrayList();
                for (i = 1; i < jSONArray.length(); i++) {
                    arrayList2.add(zzb(jSONArray.get(i), (List) list).zzMi());
                }
                r0 = new zzabg.zza(7, arrayList2);
                r0.zzaH(true);
                return r0;
            } else {
                valueOf = String.valueOf(obj);
                zzhi(new StringBuilder(String.valueOf(valueOf).length() + 20).append("Invalid value type: ").append(valueOf).toString());
                return null;
            }
        } else if (obj instanceof Boolean) {
            return new zzabg.zza(8, obj);
        } else {
            if (obj instanceof Integer) {
                return new zzabg.zza(6, obj);
            }
            if (obj instanceof String) {
                return new zzabg.zza(1, obj);
            }
            valueOf = String.valueOf(obj);
            zzhi(new StringBuilder(String.valueOf(valueOf).length() + 20).append("Invalid value type: ").append(valueOf).toString());
            return null;
        }
    }

    static List<zzabd> zzb(JSONArray jSONArray, List<String> list) throws JSONException, zzaan {
        List<zzabd> arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(zzb(jSONArray.getJSONObject(i), (List) list));
        }
        return arrayList;
    }

    static List<String> zzc(JSONArray jSONArray) throws JSONException {
        List<String> arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getJSONObject(i).getString("instance_name"));
        }
        return arrayList;
    }

    private static zzabo zzd(JSONArray jSONArray) throws JSONException {
        int i = 1;
        zzaa.zzaj(jSONArray.length() > 0);
        String string = jSONArray.getString(0);
        List arrayList = new ArrayList();
        while (i < jSONArray.length()) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj;
                if (jSONArray2.length() != 0) {
                    arrayList.add(zzd(jSONArray2));
                }
            } else if (obj == JSONObject.NULL) {
                arrayList.add(zzabl.zzbvM);
            } else {
                arrayList.add(zzabq.zzY(obj));
            }
            i++;
        }
        return new zzabo(string, arrayList);
    }

    static zzabc zzhg(String str) throws JSONException, zzaan {
        Object obj = new JSONObject(str).get("resource");
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            zzabc.zza com_google_android_gms_internal_zzabc_zza = new zzabc.zza();
            com_google_android_gms_internal_zzabc_zza.zzhr(jSONObject.optString("version"));
            List zzc = zzc(jSONObject.getJSONArray("macros"));
            List zzb = zzb(jSONObject.getJSONArray("tags"), zzc);
            List zzb2 = zzb(jSONObject.getJSONArray("predicates"), zzc);
            for (zzabd zzc2 : zzb(jSONObject.getJSONArray("macros"), zzc)) {
                com_google_android_gms_internal_zzabc_zza.zzc(zzc2);
            }
            JSONArray jSONArray = jSONObject.getJSONArray("rules");
            for (int i = 0; i < jSONArray.length(); i++) {
                com_google_android_gms_internal_zzabc_zza.zza(zza(jSONArray.getJSONArray(i), zzb, zzb2));
            }
            return com_google_android_gms_internal_zzabc_zza.zzLX();
        }
        throw new zzaan("Resource map not found");
    }

    static zzabf zzhh(String str) throws JSONException, zzaan {
        JSONObject jSONObject = new JSONObject(str);
        JSONArray optJSONArray = jSONObject.optJSONArray("runtime");
        if (optJSONArray == null) {
            return null;
        }
        zzabf.zza com_google_android_gms_internal_zzabf_zza = new zzabf.zza();
        Object obj = jSONObject.get("resource");
        if (obj instanceof JSONObject) {
            com_google_android_gms_internal_zzabf_zza.zzhs(((JSONObject) obj).optString("version"));
            for (int i = 0; i < optJSONArray.length(); i++) {
                Object obj2 = optJSONArray.get(i);
                if (!(obj2 instanceof JSONArray) || ((JSONArray) obj2).length() != 0) {
                    com_google_android_gms_internal_zzabf_zza.zza(zzW(obj2));
                }
            }
            return com_google_android_gms_internal_zzabf_zza.zzMg();
        }
        throw new zzaan("Resource map not found");
    }

    private static void zzhi(String str) throws zzaan {
        zzun.e(str);
        throw new zzaan(str);
    }
}
