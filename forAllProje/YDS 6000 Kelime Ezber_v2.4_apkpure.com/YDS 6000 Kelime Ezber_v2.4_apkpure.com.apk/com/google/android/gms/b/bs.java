package com.google.android.gms.b;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.c.a.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class bs extends cf {
    private static final String s = bs.class.getSimpleName();
    private a t;

    protected bs(Context context) {
        super(context, "");
    }

    public static bs b(Context context) {
        cf.a(context, true);
        return new bs(context);
    }

    protected aw.a a(Context context, View view) {
        return null;
    }

    public String a(String str, String str2) {
        return ba.a(str, str2, true);
    }

    public void a(a aVar) {
        this.t = aVar;
    }

    protected void a(eq eqVar, aw.a aVar, au.a aVar2) {
        if (!eqVar.h()) {
            a(b(eqVar, aVar, aVar2));
        } else if (this.t != null) {
            String a = this.t.a();
            if (!TextUtils.isEmpty(a)) {
                aVar.aa = es.a(a);
                aVar.ab = Integer.valueOf(5);
                aVar.ac = Boolean.valueOf(this.t.b());
            }
            this.t = null;
        }
    }

    protected List<Callable<Void>> b(eq eqVar, aw.a aVar, au.a aVar2) {
        List<Callable<Void>> arrayList = new ArrayList();
        if (eqVar.c() == null) {
            return arrayList;
        }
        eq eqVar2 = eqVar;
        arrayList.add(new gn(eqVar2, ei.n(), ei.o(), aVar, eqVar.r(), 24));
        return arrayList;
    }
}
