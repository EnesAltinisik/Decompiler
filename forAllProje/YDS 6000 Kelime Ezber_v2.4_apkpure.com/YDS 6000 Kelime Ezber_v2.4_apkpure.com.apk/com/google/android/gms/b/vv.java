package com.google.android.gms.b;

import android.support.v4.i.k;
import com.google.android.gms.b.vr.a;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;

@vz
public class vv implements a<qm> {
    private final boolean a;

    public vv(boolean z) {
        this.a = z;
    }

    private <K, V> k<K, V> a(k<K, Future<V>> kVar) {
        k<K, V> kVar2 = new k();
        for (int i = 0; i < kVar.size(); i++) {
            kVar2.put(kVar.b(i), ((Future) kVar.c(i)).get());
        }
        return kVar2;
    }

    private void a(vr vrVar, JSONObject jSONObject, k<String, Future<qj>> kVar) {
        kVar.put(jSONObject.getString("name"), vrVar.a(jSONObject, "image_value", this.a));
    }

    private void a(JSONObject jSONObject, k<String, String> kVar) {
        kVar.put(jSONObject.getString("name"), jSONObject.getString("string_value"));
    }

    public /* synthetic */ qp.a a(vr vrVar, JSONObject jSONObject) {
        return b(vrVar, jSONObject);
    }

    public qm b(vr vrVar, JSONObject jSONObject) {
        k kVar = new k();
        k kVar2 = new k();
        Future b = vrVar.b(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("custom_assets");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("type");
            if ("string".equals(string)) {
                a(jSONObject2, kVar2);
            } else if ("image".equals(string)) {
                a(vrVar, jSONObject2, kVar);
            } else {
                String str = "Unknown custom asset type: ";
                String valueOf = String.valueOf(string);
                zy.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
        return new qm(jSONObject.getString("custom_template_id"), a(kVar), kVar2, (qh) b.get());
    }
}
