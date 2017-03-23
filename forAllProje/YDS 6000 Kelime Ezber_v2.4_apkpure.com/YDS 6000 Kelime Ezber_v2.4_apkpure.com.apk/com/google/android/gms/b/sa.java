package com.google.android.gms.b;

import android.text.TextUtils;
import java.util.Map;

@vz
public class sa implements rq {
    private final a a;

    public interface a {
        void O();

        void b(yj yjVar);
    }

    public sa(a aVar) {
        this.a = aVar;
    }

    public static void a(aaq com_google_android_gms_b_aaq, a aVar) {
        com_google_android_gms_b_aaq.l().a("/reward", new sa(aVar));
    }

    private void a(Map<String, String> map) {
        yj yjVar;
        try {
            int parseInt = Integer.parseInt((String) map.get("amount"));
            String str = (String) map.get("type");
            if (!TextUtils.isEmpty(str)) {
                yjVar = new yj(str, parseInt);
                this.a.b(yjVar);
            }
        } catch (Throwable e) {
            zy.c("Unable to parse reward amount.", e);
        }
        yjVar = null;
        this.a.b(yjVar);
    }

    private void b(Map<String, String> map) {
        this.a.O();
    }

    public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            a(map);
        } else if ("video_start".equals(str)) {
            b(map);
        }
    }
}
