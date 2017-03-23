package com.google.android.gms.b;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.v;
import java.util.Map;

@vz
class sc implements rq {
    sc() {
    }

    private int a(Map<String, String> map) {
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        return (parseInt < 0 || 3 < parseInt) ? 0 : parseInt;
    }

    public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
        Throwable e;
        if (((Boolean) pr.bi.c()).booleanValue()) {
            aav com_google_android_gms_b_aav;
            aav z = com_google_android_gms_b_aaq.z();
            if (z == null) {
                try {
                    z = new aav(com_google_android_gms_b_aaq, Float.parseFloat((String) map.get("duration")));
                    com_google_android_gms_b_aaq.a(z);
                    com_google_android_gms_b_aav = z;
                } catch (NullPointerException e2) {
                    e = e2;
                    zy.b("Unable to parse videoMeta message.", e);
                    v.i().a(e, "VideoMetaGmsgHandler.onGmsg");
                    return;
                } catch (NumberFormatException e3) {
                    e = e3;
                    zy.b("Unable to parse videoMeta message.", e);
                    v.i().a(e, "VideoMetaGmsgHandler.onGmsg");
                    return;
                }
            }
            com_google_android_gms_b_aav = z;
            boolean equals = "1".equals(map.get("muted"));
            float parseFloat = Float.parseFloat((String) map.get("currentTime"));
            int a = a(map);
            String str = (String) map.get("aspectRatio");
            float parseFloat2 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
            if (zy.a(3)) {
                zy.b(new StringBuilder(String.valueOf(str).length() + 79).append("Video Meta GMSG: isMuted : ").append(equals).append(" , playbackState : ").append(a).append(" , aspectRatio : ").append(str).toString());
            }
            com_google_android_gms_b_aav.a(parseFloat, a, equals, parseFloat2);
        }
    }
}
