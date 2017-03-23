package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.b.aw.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class dg extends cf {
    private static final String s = dg.class.getSimpleName();

    protected dg(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static dg a(String str, Context context, boolean z) {
        cf.a(context, z);
        return new dg(context, str, z);
    }

    protected List<Callable<Void>> b(eq eqVar, a aVar, au.a aVar2) {
        if (eqVar.c() == null || !this.o) {
            return super.b(eqVar, aVar, aVar2);
        }
        int r = eqVar.r();
        List<Callable<Void>> arrayList = new ArrayList();
        arrayList.addAll(super.b(eqVar, aVar, aVar2));
        arrayList.add(new gn(eqVar, ei.n(), ei.o(), aVar, r, 24));
        return arrayList;
    }
}
