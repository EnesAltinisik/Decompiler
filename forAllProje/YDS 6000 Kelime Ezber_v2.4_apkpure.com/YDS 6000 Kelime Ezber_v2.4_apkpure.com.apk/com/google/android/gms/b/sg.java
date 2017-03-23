package com.google.android.gms.b;

import com.google.android.gms.ads.internal.v;
import com.google.android.gms.common.internal.l;
import java.util.Map;

@vz
public class sg implements rq {
    public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
        se B = v.B();
        if (!map.containsKey("abort")) {
            String str = (String) map.get("src");
            if (str == null) {
                zy.e("Precache video action is missing the src parameter.");
                return;
            }
            int parseInt;
            try {
                parseInt = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException e) {
                parseInt = 0;
            }
            String str2 = map.containsKey("mimetype") ? (String) map.get("mimetype") : "";
            if (B.b(com_google_android_gms_b_aaq)) {
                zy.e("Precache task already running.");
                return;
            }
            l.a(com_google_android_gms_b_aaq.h());
            new sd(com_google_android_gms_b_aaq, com_google_android_gms_b_aaq.h().a.a(com_google_android_gms_b_aaq, parseInt, str2), str).e();
        } else if (!B.a(com_google_android_gms_b_aaq)) {
            zy.e("Precache abort but no preload task running.");
        }
    }
}
