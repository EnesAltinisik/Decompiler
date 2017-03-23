package com.google.android.gms.b;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.b;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@vz
public final class ot {
    public static final String a = oc.a().a("emulator");
    private final Date b;
    private final String c;
    private final int d;
    private final Set<String> e;
    private final Location f;
    private final boolean g;
    private final Bundle h;
    private final Map<Class<? extends Object>, Object> i;
    private final String j;
    private final String k;
    private final com.google.android.gms.ads.e.a l;
    private final int m;
    private final Set<String> n;
    private final Bundle o;
    private final Set<String> p;
    private final boolean q;

    public static final class a {
        private final HashSet<String> a = new HashSet();
        private final Bundle b = new Bundle();
        private final HashMap<Class<? extends Object>, Object> c = new HashMap();
        private final HashSet<String> d = new HashSet();
        private final Bundle e = new Bundle();
        private final HashSet<String> f = new HashSet();
        private Date g;
        private String h;
        private int i = -1;
        private Location j;
        private boolean k = false;
        private String l;
        private String m;
        private int n = -1;
        private boolean o;

        public void a(int i) {
            this.i = i;
        }

        public void a(Location location) {
            this.j = location;
        }

        public void a(Class<? extends b> cls, Bundle bundle) {
            this.b.putBundle(cls.getName(), bundle);
        }

        public void a(String str) {
            this.a.add(str);
        }

        public void a(Date date) {
            this.g = date;
        }

        public void a(boolean z) {
            this.n = z ? 1 : 0;
        }

        public void b(String str) {
            this.d.add(str);
        }

        public void b(boolean z) {
            this.o = z;
        }

        public void c(String str) {
            this.d.remove(str);
        }
    }

    public ot(a aVar) {
        this(aVar, null);
    }

    public ot(a aVar, com.google.android.gms.ads.e.a aVar2) {
        this.b = aVar.g;
        this.c = aVar.h;
        this.d = aVar.i;
        this.e = Collections.unmodifiableSet(aVar.a);
        this.f = aVar.j;
        this.g = aVar.k;
        this.h = aVar.b;
        this.i = Collections.unmodifiableMap(aVar.c);
        this.j = aVar.l;
        this.k = aVar.m;
        this.l = aVar2;
        this.m = aVar.n;
        this.n = Collections.unmodifiableSet(aVar.d);
        this.o = aVar.e;
        this.p = Collections.unmodifiableSet(aVar.f);
        this.q = aVar.o;
    }

    public Bundle a(Class<? extends b> cls) {
        return this.h.getBundle(cls.getName());
    }

    public Date a() {
        return this.b;
    }

    public boolean a(Context context) {
        return this.n.contains(oc.a().a(context));
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public Set<String> d() {
        return this.e;
    }

    public Location e() {
        return this.f;
    }

    public boolean f() {
        return this.g;
    }

    public String g() {
        return this.j;
    }

    public String h() {
        return this.k;
    }

    public com.google.android.gms.ads.e.a i() {
        return this.l;
    }

    public Map<Class<? extends Object>, Object> j() {
        return this.i;
    }

    public Bundle k() {
        return this.h;
    }

    public int l() {
        return this.m;
    }

    public Bundle m() {
        return this.o;
    }

    public Set<String> n() {
        return this.p;
    }

    public boolean o() {
        return this.q;
    }
}
