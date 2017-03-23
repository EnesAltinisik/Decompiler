package com.google.android.gms.b;

import java.util.Map;

@vz
public final class rl implements rq {
    private final rm a;

    public rl(rm rmVar) {
        this.a = rmVar;
    }

    public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
        String str = (String) map.get("name");
        if (str == null) {
            zy.e("App event with no name parameter.");
        } else {
            this.a.a(str, (String) map.get("info"));
        }
    }
}
