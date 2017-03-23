package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONObject;

@zzig
public class zzem implements zzeh {
    final HashMap<String, zzko<JSONObject>> zzCm = new HashMap();

    public Future<JSONObject> zzW(String str) {
        Future com_google_android_gms_internal_zzko = new zzko();
        this.zzCm.put(str, com_google_android_gms_internal_zzko);
        return com_google_android_gms_internal_zzko;
    }

    public void zzX(String str) {
        zzko com_google_android_gms_internal_zzko = (zzko) this.zzCm.get(str);
        if (com_google_android_gms_internal_zzko == null) {
            zzb.e("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!com_google_android_gms_internal_zzko.isDone()) {
            com_google_android_gms_internal_zzko.cancel(true);
        }
        this.zzCm.remove(str);
    }

    public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
        zzg((String) map.get("request_id"), (String) map.get("fetched_ad"));
    }

    public void zzg(String str, String str2) {
        zzb.zzaU("Received ad from the cache.");
        zzko com_google_android_gms_internal_zzko = (zzko) this.zzCm.get(str);
        if (com_google_android_gms_internal_zzko == null) {
            zzb.e("Could not find the ad request for the corresponding ad response.");
            return;
        }
        try {
            com_google_android_gms_internal_zzko.zzh(new JSONObject(str2));
        } catch (Throwable e) {
            zzb.zzb("Failed constructing JSON object from value passed from javascript", e);
            com_google_android_gms_internal_zzko.zzh(null);
        } finally {
            this.zzCm.remove(str);
        }
    }
}
