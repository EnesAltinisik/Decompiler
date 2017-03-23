package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.ads.internal.v;

@vz
public final class zs extends zd {
    private final zz a;
    private final String b;

    public zs(Context context, String str, String str2) {
        this(str2, v.e().a(context, str));
    }

    public zs(String str, String str2) {
        this.a = new zz(str2);
        this.b = str;
    }

    public void a() {
        this.a.a(this.b);
    }

    public void b() {
    }
}
