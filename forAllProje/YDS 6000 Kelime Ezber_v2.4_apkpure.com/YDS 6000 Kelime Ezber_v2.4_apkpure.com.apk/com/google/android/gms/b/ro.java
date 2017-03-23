package com.google.android.gms.b;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.v;
import java.util.Map;

@vz
public final class ro implements rq {
    private long a(long j) {
        return (j - v.k().a()) + v.k().b();
    }

    private void b(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
        String str = (String) map.get("label");
        String str2 = (String) map.get("start_label");
        String str3 = (String) map.get("timestamp");
        if (TextUtils.isEmpty(str)) {
            zy.e("No label given for CSI tick.");
        } else if (TextUtils.isEmpty(str3)) {
            zy.e("No timestamp given for CSI tick.");
        } else {
            try {
                long a = a(Long.parseLong(str3));
                if (TextUtils.isEmpty(str2)) {
                    str2 = "native:view_load";
                }
                com_google_android_gms_b_aaq.y().a(str, str2, a);
            } catch (Throwable e) {
                zy.c("Malformed timestamp for CSI tick.", e);
            }
        }
    }

    private void c(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
        String str = (String) map.get("value");
        if (TextUtils.isEmpty(str)) {
            zy.e("No value given for CSI experiment.");
            return;
        }
        qa a = com_google_android_gms_b_aaq.y().a();
        if (a == null) {
            zy.e("No ticker for WebView, dropping experiment ID.");
        } else {
            a.a("e", str);
        }
    }

    private void d(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
        String str = (String) map.get("name");
        String str2 = (String) map.get("value");
        if (TextUtils.isEmpty(str2)) {
            zy.e("No value given for CSI extra.");
        } else if (TextUtils.isEmpty(str)) {
            zy.e("No name given for CSI extra.");
        } else {
            qa a = com_google_android_gms_b_aaq.y().a();
            if (a == null) {
                zy.e("No ticker for WebView, dropping extra parameter.");
            } else {
                a.a(str, str2);
            }
        }
    }

    public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            b(com_google_android_gms_b_aaq, map);
        } else if ("experiment".equals(str)) {
            c(com_google_android_gms_b_aaq, map);
        } else if ("extra".equals(str)) {
            d(com_google_android_gms_b_aaq, map);
        }
    }
}
