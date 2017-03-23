package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.mediation.d;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;
import com.google.ads.mediation.g;
import com.google.android.gms.b.zy;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class CustomEventAdapter implements d<com.google.android.gms.ads.mediation.customevent.d, f>, f<com.google.android.gms.ads.mediation.customevent.d, f> {
    b a;
    d b;
    private View c;

    static final class a implements c {
        private final CustomEventAdapter a;
        private final e b;

        public a(CustomEventAdapter customEventAdapter, e eVar) {
            this.a = customEventAdapter;
            this.b = eVar;
        }
    }

    class b implements e {
        final /* synthetic */ CustomEventAdapter a;
        private final CustomEventAdapter b;
        private final g c;

        public b(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, g gVar) {
            this.a = customEventAdapter;
            this.b = customEventAdapter2;
            this.c = gVar;
        }
    }

    private static <T> T a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            String valueOf = String.valueOf(th.getMessage());
            zy.e(new StringBuilder((String.valueOf(str).length() + 46) + String.valueOf(valueOf).length()).append("Could not instantiate custom event adapter: ").append(str).append(". ").append(valueOf).toString());
            return null;
        }
    }

    b a(g gVar) {
        return new b(this, this, gVar);
    }

    public void a() {
        if (this.a != null) {
            this.a.a();
        }
        if (this.b != null) {
            this.b.a();
        }
    }

    public void a(e eVar, Activity activity, f fVar, com.google.ads.b bVar, com.google.ads.mediation.b bVar2, com.google.android.gms.ads.mediation.customevent.d dVar) {
        this.a = (b) a(fVar.b);
        if (this.a == null) {
            eVar.a(this, com.google.ads.a.a.INTERNAL_ERROR);
        } else {
            this.a.a(new a(this, eVar), activity, fVar.a, fVar.c, bVar, bVar2, dVar == null ? null : dVar.a(fVar.a));
        }
    }

    public void a(g gVar, Activity activity, f fVar, com.google.ads.mediation.b bVar, com.google.android.gms.ads.mediation.customevent.d dVar) {
        this.b = (d) a(fVar.b);
        if (this.b == null) {
            gVar.a(this, com.google.ads.a.a.INTERNAL_ERROR);
        } else {
            this.b.a(a(gVar), activity, fVar.a, fVar.c, bVar, dVar == null ? null : dVar.a(fVar.a));
        }
    }

    public Class<com.google.android.gms.ads.mediation.customevent.d> b() {
        return com.google.android.gms.ads.mediation.customevent.d.class;
    }

    public Class<f> c() {
        return f.class;
    }

    public View d() {
        return this.c;
    }

    public void e() {
        this.b.b();
    }
}
