package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.formats.zzc;
import com.google.android.gms.ads.internal.formats.zzd;
import com.google.android.gms.ads.internal.formats.zzh;
import com.google.android.gms.internal.zzib.zza;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

@zzig
public class zzic implements zza<zzd> {
    private final boolean zzKR;
    private final boolean zzKS;

    public zzic(boolean z, boolean z2) {
        this.zzKR = z;
        this.zzKS = z2;
    }

    public /* synthetic */ zzh.zza zza(zzib com_google_android_gms_internal_zzib, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException {
        return zzb(com_google_android_gms_internal_zzib, jSONObject);
    }

    public zzd zzb(zzib com_google_android_gms_internal_zzib, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException {
        List<zzkr> zza = com_google_android_gms_internal_zzib.zza(jSONObject, "images", true, this.zzKR, this.zzKS);
        Future zza2 = com_google_android_gms_internal_zzib.zza(jSONObject, "app_icon", true, this.zzKR);
        Future zzf = com_google_android_gms_internal_zzib.zzf(jSONObject);
        List arrayList = new ArrayList();
        for (zzkr com_google_android_gms_internal_zzkr : zza) {
            arrayList.add((zzc) com_google_android_gms_internal_zzkr.get());
        }
        return new zzd(jSONObject.getString("headline"), arrayList, jSONObject.getString("body"), (zzdj) zza2.get(), jSONObject.getString("call_to_action"), jSONObject.optDouble("rating", -1.0d), jSONObject.optString("store"), jSONObject.optString(Param.PRICE), (com.google.android.gms.ads.internal.formats.zza) zzf.get(), new Bundle());
    }
}
