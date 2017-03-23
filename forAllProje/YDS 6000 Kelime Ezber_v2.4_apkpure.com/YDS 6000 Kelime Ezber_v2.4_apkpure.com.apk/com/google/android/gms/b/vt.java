package com.google.android.gms.b;

import android.os.Bundle;
import com.google.android.gms.b.vr.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

@vz
public class vt implements a<qk> {
    private final boolean a;
    private final boolean b;

    public vt(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    private aaq a(aag<aaq> com_google_android_gms_b_aag_com_google_android_gms_b_aaq) {
        Throwable e;
        try {
            return (aaq) com_google_android_gms_b_aag_com_google_android_gms_b_aaq.get((long) ((Integer) pr.ci.c()).intValue(), TimeUnit.SECONDS);
        } catch (Throwable e2) {
            zy.c("InterruptedException occurred while waiting for video to load", e2);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e3) {
            e2 = e3;
            zy.c("Exception occurred while waiting for video to load", e2);
        } catch (TimeoutException e4) {
            e2 = e4;
            zy.c("Exception occurred while waiting for video to load", e2);
        } catch (CancellationException e5) {
            e2 = e5;
            zy.c("Exception occurred while waiting for video to load", e2);
        }
        return null;
    }

    public /* synthetic */ qp.a a(vr vrVar, JSONObject jSONObject) {
        return b(vrVar, jSONObject);
    }

    public qk b(vr vrVar, JSONObject jSONObject) {
        List<aag> a = vrVar.a(jSONObject, "images", true, this.a, this.b);
        Future a2 = vrVar.a(jSONObject, "app_icon", true, this.a);
        aag a3 = vrVar.a(jSONObject, "video");
        Future b = vrVar.b(jSONObject);
        List arrayList = new ArrayList();
        for (aag com_google_android_gms_b_aag : a) {
            arrayList.add((qj) com_google_android_gms_b_aag.get());
        }
        aaq a4 = a(a3);
        return new qk(jSONObject.getString("headline"), arrayList, jSONObject.getString("body"), (qu) a2.get(), jSONObject.getString("call_to_action"), jSONObject.optDouble("rating", -1.0d), jSONObject.optString("store"), jSONObject.optString("price"), (qh) b.get(), new Bundle(), a4 != null ? a4.z() : null, a4 != null ? a4.b() : null);
    }
}
