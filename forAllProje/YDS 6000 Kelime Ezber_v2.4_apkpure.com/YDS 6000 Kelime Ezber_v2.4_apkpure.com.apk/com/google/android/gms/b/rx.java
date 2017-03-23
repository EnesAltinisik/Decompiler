package com.google.android.gms.b;

import com.google.android.gms.ads.internal.e;
import com.google.android.gms.common.util.d;
import java.util.Map;

@vz
public class rx implements rq {
    static final Map<String, Integer> a = d.a("resize", Integer.valueOf(1), "playVideo", Integer.valueOf(2), "storePicture", Integer.valueOf(3), "createCalendarEvent", Integer.valueOf(4), "setOrientationProperties", Integer.valueOf(5), "closeResizedAd", Integer.valueOf(6));
    private final e b;
    private final uf c;

    public rx(e eVar, uf ufVar) {
        this.b = eVar;
        this.c = ufVar;
    }

    public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
        int intValue = ((Integer) a.get((String) map.get("a"))).intValue();
        if (intValue == 5 || this.b == null || this.b.b()) {
            switch (intValue) {
                case 1:
                    this.c.a((Map) map);
                    return;
                case 3:
                    new uh(com_google_android_gms_b_aaq, map).a();
                    return;
                case 4:
                    new ue(com_google_android_gms_b_aaq, map).a();
                    return;
                case 5:
                    new ug(com_google_android_gms_b_aaq, map).a();
                    return;
                case 6:
                    this.c.a(true);
                    return;
                default:
                    zy.d("Unknown MRAID command called.");
                    return;
            }
        }
        this.b.a(null);
    }
}
