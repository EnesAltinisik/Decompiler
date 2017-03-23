package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.b.aar.a;

@vz
public class vl extends vg implements a {
    vl(Context context, yu.a aVar, aaq com_google_android_gms_b_aaq, vk.a aVar2) {
        super(context, aVar, com_google_android_gms_b_aaq, aVar2);
    }

    protected void b() {
        if (this.e.e == -2) {
            this.c.l().a((a) this);
            f();
            zy.b("Loading HTML in WebView.");
            this.c.loadDataWithBaseURL(this.e.b, this.e.c, "text/html", "UTF-8", null);
        }
    }

    protected void f() {
    }
}
