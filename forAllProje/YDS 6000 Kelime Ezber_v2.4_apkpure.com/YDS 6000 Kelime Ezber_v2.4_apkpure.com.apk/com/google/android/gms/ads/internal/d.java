package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.m;
import com.google.android.gms.ads.internal.overlay.p;
import com.google.android.gms.ads.internal.overlay.q;
import com.google.android.gms.ads.internal.overlay.w;
import com.google.android.gms.b.rn;
import com.google.android.gms.b.sh;
import com.google.android.gms.b.vz;
import com.google.android.gms.b.yl;
import com.google.android.gms.b.yp;

@vz
public class d {
    public final sh a;
    public final m b;
    public final p c;
    public final yp d;

    public d(sh shVar, m mVar, p pVar, yp ypVar) {
        this.a = shVar;
        this.b = mVar;
        this.c = pVar;
        this.d = ypVar;
    }

    public static d a() {
        return new d(new rn(), new q(), new w(), new yl());
    }
}
