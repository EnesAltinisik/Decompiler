package com.google.android.gms.b;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.overlay.n;
import java.util.Map;
import org.json.JSONObject;

@vz
public final class sb implements rq {
    private boolean a;

    private static int a(Context context, Map<String, String> map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                i = oc.a().a(context, Integer.parseInt(str2));
            } catch (NumberFormatException e) {
                zy.e(new StringBuilder((String.valueOf(str).length() + 34) + String.valueOf(str2).length()).append("Could not parse ").append(str).append(" in a video GMSG: ").append(str2).toString());
            }
        }
        return i;
    }

    public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
        String str = (String) map.get("action");
        if (str == null) {
            zy.e("Action missing from video GMSG.");
            return;
        }
        if (zy.a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String valueOf = String.valueOf(jSONObject.toString());
            zy.b(new StringBuilder((String.valueOf(str).length() + 13) + String.valueOf(valueOf).length()).append("Video GMSG: ").append(str).append(" ").append(valueOf).toString());
        }
        if ("background".equals(str)) {
            valueOf = (String) map.get("color");
            if (TextUtils.isEmpty(valueOf)) {
                zy.e("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                com_google_android_gms_b_aaq.setBackgroundColor(Color.parseColor(valueOf));
                return;
            } catch (IllegalArgumentException e) {
                zy.e("Invalid color parameter in video GMSG.");
                return;
            }
        }
        aap w = com_google_android_gms_b_aaq.w();
        if (w == null) {
            zy.e("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = "new".equals(str);
        boolean equals2 = "position".equals(str);
        int a;
        int min;
        if (equals || equals2) {
            Context context = com_google_android_gms_b_aaq.getContext();
            int a2 = a(context, map, "x", 0);
            a = a(context, map, "y", 0);
            int a3 = a(context, map, "w", -1);
            int a4 = a(context, map, "h", -1);
            if (((Boolean) pr.cl.c()).booleanValue()) {
                min = Math.min(a3, com_google_android_gms_b_aaq.getMeasuredWidth() - a2);
                a4 = Math.min(a4, com_google_android_gms_b_aaq.getMeasuredHeight() - a);
            } else {
                min = a3;
            }
            try {
                a3 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException e2) {
                a3 = 0;
            }
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
            if (equals && w.a() == null) {
                w.a(a2, a, min, a4, a3, parseBoolean);
                return;
            } else {
                w.a(a2, a, min, a4);
                return;
            }
        }
        n a5 = w.a();
        if (a5 == null) {
            n.a(com_google_android_gms_b_aaq);
        } else if ("click".equals(str)) {
            r0 = com_google_android_gms_b_aaq.getContext();
            a = a(r0, map, "x", 0);
            min = a(r0, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) a, (float) min, 0);
            a5.a(obtain);
            obtain.recycle();
        } else if ("currentTime".equals(str)) {
            valueOf = (String) map.get("time");
            if (valueOf == null) {
                zy.e("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                a5.a((int) (Float.parseFloat(valueOf) * 1000.0f));
            } catch (NumberFormatException e3) {
                str = "Could not parse time parameter from currentTime video GMSG: ";
                valueOf = String.valueOf(valueOf);
                zy.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        } else if ("hide".equals(str)) {
            a5.setVisibility(4);
        } else if ("load".equals(str)) {
            a5.h();
        } else if ("muted".equals(str)) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                a5.k();
            } else {
                a5.l();
            }
        } else if ("pause".equals(str)) {
            a5.i();
        } else if ("play".equals(str)) {
            a5.j();
        } else if ("show".equals(str)) {
            a5.setVisibility(0);
        } else if ("src".equals(str)) {
            a5.a((String) map.get("src"));
        } else if ("touchMove".equals(str)) {
            r0 = com_google_android_gms_b_aaq.getContext();
            a5.a((float) a(r0, map, "dx", 0), (float) a(r0, map, "dy", 0));
            if (!this.a) {
                com_google_android_gms_b_aaq.i().r();
                this.a = true;
            }
        } else if ("volume".equals(str)) {
            valueOf = (String) map.get("volume");
            if (valueOf == null) {
                zy.e("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                a5.a(Float.parseFloat(valueOf));
            } catch (NumberFormatException e4) {
                str = "Could not parse volume parameter from volume video GMSG: ";
                valueOf = String.valueOf(valueOf);
                zy.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        } else if ("watermark".equals(str)) {
            a5.m();
        } else {
            String str2 = "Unknown video action: ";
            valueOf = String.valueOf(str);
            zy.e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }
}
