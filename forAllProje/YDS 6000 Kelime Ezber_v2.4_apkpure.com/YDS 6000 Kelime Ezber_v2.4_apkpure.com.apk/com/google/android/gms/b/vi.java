package com.google.android.gms.b;

import android.content.Context;
import android.util.DisplayMetrics;
import com.google.android.gms.b.yu.a;

@vz
public class vi extends vg {
    private vh g;

    vi(Context context, a aVar, aaq com_google_android_gms_b_aaq, vk.a aVar2) {
        super(context, aVar, com_google_android_gms_b_aaq, aVar2);
    }

    protected void b() {
        int i;
        int i2;
        nx k = this.c.k();
        if (k.e) {
            DisplayMetrics displayMetrics = this.b.getResources().getDisplayMetrics();
            i = displayMetrics.widthPixels;
            i2 = displayMetrics.heightPixels;
        } else {
            i = k.g;
            i2 = k.d;
        }
        this.g = new vh(this, this.c, i, i2);
        this.c.l().a((aar.a) this);
        this.g.a(this.e);
    }

    protected int c() {
        if (!this.g.c()) {
            return !this.g.d() ? 2 : -2;
        } else {
            zy.b("Ad-Network indicated no fill with passback URL.");
            return 3;
        }
    }
}
