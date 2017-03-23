package com.google.android.gms.internal;

import android.support.v4.h.j;
import com.google.android.gms.ads.internal.formats.zzc;
import com.google.android.gms.ads.internal.formats.zzf;
import com.google.android.gms.ads.internal.formats.zzh;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzib.zza;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzig
public class zzie implements zza<zzf> {
    private final boolean zzKR;

    public zzie(boolean z) {
        this.zzKR = z;
    }

    private void zza(zzib com_google_android_gms_internal_zzib, JSONObject jSONObject, j<String, Future<zzc>> jVar) throws JSONException {
        jVar.put(jSONObject.getString("name"), com_google_android_gms_internal_zzib.zza(jSONObject, "image_value", this.zzKR));
    }

    private void zza(JSONObject jSONObject, j<String, String> jVar) throws JSONException {
        jVar.put(jSONObject.getString("name"), jSONObject.getString("string_value"));
    }

    private <K, V> j<K, V> zzc(j<K, Future<V>> jVar) throws InterruptedException, ExecutionException {
        j<K, V> jVar2 = new j();
        for (int i = 0; i < jVar.size(); i++) {
            jVar2.put(jVar.b(i), ((Future) jVar.c(i)).get());
        }
        return jVar2;
    }

    public /* synthetic */ zzh.zza zza(zzib com_google_android_gms_internal_zzib, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException {
        return zzd(com_google_android_gms_internal_zzib, jSONObject);
    }

    public zzf zzd(zzib com_google_android_gms_internal_zzib, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException {
        j jVar = new j();
        j jVar2 = new j();
        Future zzf = com_google_android_gms_internal_zzib.zzf(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("custom_assets");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("type");
            if ("string".equals(string)) {
                zza(jSONObject2, jVar2);
            } else if ("image".equals(string)) {
                zza(com_google_android_gms_internal_zzib, jSONObject2, jVar);
            } else {
                String str = "Unknown custom asset type: ";
                String valueOf = String.valueOf(string);
                zzb.zzaW(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
        return new zzf(jSONObject.getString("custom_template_id"), zzc(jVar), jVar2, (com.google.android.gms.ads.internal.formats.zza) zzf.get());
    }
}
