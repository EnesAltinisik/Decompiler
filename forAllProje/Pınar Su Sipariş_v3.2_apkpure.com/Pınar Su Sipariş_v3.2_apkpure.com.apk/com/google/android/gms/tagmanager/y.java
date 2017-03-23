package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzabt;
import com.google.android.gms.internal.zzabt.zzc;
import com.google.android.gms.internal.zzabt.zzd;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class y {
    public static zzc a(String str) throws JSONException {
        zza b = b(new JSONObject(str));
        zzd zzMB = zzc.zzMB();
        for (int i = 0; i < b.zzjL.length; i++) {
            zzMB.zzc(zzabt.zza.zzMz().zzb(zzae.INSTANCE_NAME.toString(), b.zzjL[i]).zzb(zzae.FUNCTION.toString(), zzdl.zzgN(cf.a())).zzb(cf.b(), b.zzjM[i]).zzMA());
        }
        return zzMB.zzMD();
    }

    static Object a(Object obj) throws JSONException {
        if (obj instanceof JSONArray) {
            throw new RuntimeException("JSONArrays are not supported");
        } else if (JSONObject.NULL.equals(obj)) {
            throw new RuntimeException("JSON nulls are not supported");
        } else if (!(obj instanceof JSONObject)) {
            return obj;
        } else {
            JSONObject jSONObject = (JSONObject) obj;
            Map hashMap = new HashMap();
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                hashMap.put(str, a(jSONObject.get(str)));
            }
            return hashMap;
        }
    }

    private static zza b(Object obj) throws JSONException {
        return zzdl.zzQ(a(obj));
    }
}
