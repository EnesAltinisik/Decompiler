package com.google.android.gms.b;

import java.util.Map;

@vz
public class ru implements rq {
    private final rv a;

    public ru(rv rvVar) {
        this.a = rvVar;
    }

    public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
        float parseFloat;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        try {
            if (map.get("blurRadius") != null) {
                parseFloat = Float.parseFloat((String) map.get("blurRadius"));
                this.a.b(equals);
                this.a.a(equals2, parseFloat);
            }
        } catch (Throwable e) {
            zy.b("Fail to parse float", e);
        }
        parseFloat = 0.0f;
        this.a.b(equals);
        this.a.a(equals2, parseFloat);
    }
}
