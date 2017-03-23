package com.google.android.gms.b;

import android.os.Bundle;
import com.google.android.gms.b.vr.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONObject;

@vz
public class vu implements a<ql> {
    private final boolean a;
    private final boolean b;

    public vu(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public /* synthetic */ qp.a a(vr vrVar, JSONObject jSONObject) {
        return b(vrVar, jSONObject);
    }

    public ql b(vr vrVar, JSONObject jSONObject) {
        List<aag> a = vrVar.a(jSONObject, "images", true, this.a, this.b);
        Future a2 = vrVar.a(jSONObject, "secondary_image", false, this.a);
        Future b = vrVar.b(jSONObject);
        List arrayList = new ArrayList();
        for (aag com_google_android_gms_b_aag : a) {
            arrayList.add((qj) com_google_android_gms_b_aag.get());
        }
        return new ql(jSONObject.getString("headline"), arrayList, jSONObject.getString("body"), (qu) a2.get(), jSONObject.getString("call_to_action"), jSONObject.getString("advertiser"), (qh) b.get(), new Bundle());
    }
}
