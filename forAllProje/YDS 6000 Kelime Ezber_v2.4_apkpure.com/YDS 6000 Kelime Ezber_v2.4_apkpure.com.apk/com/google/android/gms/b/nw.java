package com.google.android.gms.b;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.e.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@vz
public class nw {
    public static final nw a = new nw();

    protected nw() {
    }

    public static nw a() {
        return a;
    }

    public ns a(Context context, ot otVar) {
        Date a = otVar.a();
        long time = a != null ? a.getTime() : -1;
        String b = otVar.b();
        int c = otVar.c();
        Collection d = otVar.d();
        List unmodifiableList = !d.isEmpty() ? Collections.unmodifiableList(new ArrayList(d)) : null;
        boolean a2 = otVar.a(context);
        int l = otVar.l();
        Location e = otVar.e();
        Bundle a3 = otVar.a(AdMobAdapter.class);
        boolean f = otVar.f();
        String g = otVar.g();
        a i = otVar.i();
        pd pdVar = i != null ? new pd(i) : null;
        String str = null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            str = oc.a().a(Thread.currentThread().getStackTrace(), applicationContext.getPackageName());
        }
        return new ns(7, time, a3, c, unmodifiableList, a2, l, f, g, pdVar, e, b, otVar.k(), otVar.m(), Collections.unmodifiableList(new ArrayList(otVar.n())), otVar.h(), str, otVar.o());
    }
}
