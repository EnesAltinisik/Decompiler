package com.google.android.gms.b;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@vz
public class tj {
    public List<String> a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        List arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.getString(i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void a(Context context, String str, yu yuVar, String str2, boolean z, List<String> list) {
        if (list != null && !list.isEmpty()) {
            String str3 = z ? "1" : "0";
            for (String replaceAll : list) {
                String replaceAll2 = replaceAll2.replaceAll("@gw_adlocid@", str2).replaceAll("@gw_adnetrefresh@", str3).replaceAll("@gw_qdata@", yuVar.r.h).replaceAll("@gw_sdkver@", str).replaceAll("@gw_sessid@", v.i().a()).replaceAll("@gw_seqnum@", yuVar.i);
                if (!TextUtils.isEmpty(yuVar.u)) {
                    replaceAll2 = replaceAll2.replaceAll("@gw_adnetstatus@", yuVar.u);
                }
                if (yuVar.o != null) {
                    replaceAll2 = replaceAll2.replaceAll("@gw_adnetid@", yuVar.o.b).replaceAll("@gw_allocid@", yuVar.o.d);
                }
                new zs(context, str, replaceAll2).e();
            }
        }
    }
}
