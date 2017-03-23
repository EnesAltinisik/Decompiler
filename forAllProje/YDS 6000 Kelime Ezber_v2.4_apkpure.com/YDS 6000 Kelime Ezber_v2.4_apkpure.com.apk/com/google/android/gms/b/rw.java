package com.google.android.gms.b;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONObject;

@vz
public class rw implements rq {
    final HashMap<String, aad<JSONObject>> a = new HashMap();

    public Future<JSONObject> a(String str) {
        Future com_google_android_gms_b_aad = new aad();
        this.a.put(str, com_google_android_gms_b_aad);
        return com_google_android_gms_b_aad;
    }

    public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
        a((String) map.get("request_id"), (String) map.get("fetched_ad"));
    }

    public void a(String str, String str2) {
        zy.b("Received ad from the cache.");
        aad com_google_android_gms_b_aad = (aad) this.a.get(str);
        if (com_google_android_gms_b_aad == null) {
            zy.c("Could not find the ad request for the corresponding ad response.");
            return;
        }
        try {
            com_google_android_gms_b_aad.b(new JSONObject(str2));
        } catch (Throwable e) {
            zy.b("Failed constructing JSON object from value passed from javascript", e);
            com_google_android_gms_b_aad.b(null);
        } finally {
            this.a.remove(str);
        }
    }

    public void b(String str) {
        aad com_google_android_gms_b_aad = (aad) this.a.get(str);
        if (com_google_android_gms_b_aad == null) {
            zy.c("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!com_google_android_gms_b_aad.isDone()) {
            com_google_android_gms_b_aad.cancel(true);
        }
        this.a.remove(str);
    }
}
