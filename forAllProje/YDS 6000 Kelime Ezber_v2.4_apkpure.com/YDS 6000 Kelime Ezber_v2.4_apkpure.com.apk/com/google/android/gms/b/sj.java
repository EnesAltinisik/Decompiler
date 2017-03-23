package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.l;

@vz
public class sj {
    private final Context a;
    private final tn b;
    private final aab c;
    private final d d;

    sj(Context context, tn tnVar, aab com_google_android_gms_b_aab, d dVar) {
        this.a = context;
        this.b = tnVar;
        this.c = com_google_android_gms_b_aab;
        this.d = dVar;
    }

    public Context a() {
        return this.a.getApplicationContext();
    }

    public l a(String str) {
        return new l(this.a, new nx(), str, this.b, this.c, this.d);
    }

    public l b(String str) {
        return new l(this.a.getApplicationContext(), new nx(), str, this.b, this.c, this.d);
    }

    public sj b() {
        return new sj(a(), this.b, this.c, this.d);
    }
}
