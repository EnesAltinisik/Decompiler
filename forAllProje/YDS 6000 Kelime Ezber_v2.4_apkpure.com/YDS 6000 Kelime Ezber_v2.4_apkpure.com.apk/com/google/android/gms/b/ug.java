package com.google.android.gms.b;

import com.google.android.gms.ads.internal.v;
import java.util.Map;

@vz
public class ug {
    private final aaq a;
    private final boolean b;
    private final String c;

    public ug(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
        this.a = com_google_android_gms_b_aaq;
        this.c = (String) map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            this.b = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
        } else {
            this.b = true;
        }
    }

    public void a() {
        if (this.a == null) {
            zy.e("AdWebView is null");
            return;
        }
        int b = "portrait".equalsIgnoreCase(this.c) ? v.g().b() : "landscape".equalsIgnoreCase(this.c) ? v.g().a() : this.b ? -1 : v.g().c();
        this.a.b(b);
    }
}
