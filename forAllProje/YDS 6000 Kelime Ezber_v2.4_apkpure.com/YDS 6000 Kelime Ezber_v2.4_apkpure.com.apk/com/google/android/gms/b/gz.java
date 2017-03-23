package com.google.android.gms.b;

import com.google.android.gms.b.hh.c;
import com.google.firebase.database.d;
import com.google.firebase.database.f;
import com.google.firebase.database.l;
import com.google.firebase.database.m;
import com.google.firebase.database.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class gz implements com.google.android.gms.b.gf.a {
    static final /* synthetic */ boolean b = (!gz.class.desiredAssertionStatus());
    public long a = 0;
    private final ha c;
    private final kq d = new kq(new km(), 0);
    private final gf e;
    private he f;
    private hf g;
    private ii<List<a>> h;
    private boolean i = false;
    private final ir j;
    private final gq k;
    private final jb l;
    private final jb m;
    private final jb n;
    private long o = 1;
    private hh p;
    private hh q;
    private f r;
    private boolean s = false;
    private long t = 0;

    private static class a implements Comparable<a> {
        private gx a;
        private com.google.firebase.database.l.a b;
        private m c;
        private b d;
        private long e;
        private boolean f;
        private int g;
        private com.google.firebase.database.b h;
        private long i;
        private jr j;
        private jr k;
        private jr l;

        public int a(a aVar) {
            return this.e < aVar.e ? -1 : this.e == aVar.e ? 0 : 1;
        }

        public /* synthetic */ int compareTo(Object obj) {
            return a((a) obj);
        }
    }

    private enum b {
        INITIALIZING,
        RUN,
        SENT,
        COMPLETED,
        SENT_NEEDS_ABORT,
        NEEDS_ABORT
    }

    gz(ha haVar, gq gqVar, f fVar) {
        this.c = haVar;
        this.k = gqVar;
        this.r = fVar;
        this.l = this.k.a("RepoOperation");
        this.m = this.k.a("Transaction");
        this.n = this.k.a("DataOperation");
        this.j = new ir(this.k);
        this.e = gqVar.a(new gd(haVar.a, haVar.c, haVar.b), this);
        a(new Runnable(this) {
            final /* synthetic */ gz a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.e();
            }
        });
    }

    private gx a(gx gxVar) {
        ii b = b(gxVar);
        gx b2 = b.b();
        b(c(b), b2);
        return b2;
    }

    private gx a(gx gxVar, final int i) {
        gx b = b(gxVar).b();
        if (this.m.a()) {
            jb jbVar = this.l;
            String valueOf = String.valueOf(gxVar);
            String valueOf2 = String.valueOf(b);
            jbVar.a(new StringBuilder((String.valueOf(valueOf).length() + 44) + String.valueOf(valueOf2).length()).append("Aborting transactions for path: ").append(valueOf).append(". Affected: ").append(valueOf2).toString(), new Object[0]);
        }
        ii a = this.h.a(gxVar);
        a.a(new com.google.android.gms.b.ii.a<List<a>>(this) {
            final /* synthetic */ gz b;

            public boolean a(ii<List<a>> iiVar) {
                this.b.a((ii) iiVar, i);
                return false;
            }
        });
        a(a, i);
        a.a(new com.google.android.gms.b.ii.b<List<a>>(this) {
            final /* synthetic */ gz b;

            public void a(ii<List<a>> iiVar) {
                this.b.a((ii) iiVar, i);
            }
        });
        return b;
    }

    private jr a(gx gxVar, List<Long> list) {
        jr b = this.q.b(gxVar, (List) list);
        return b == null ? jj.f() : b;
    }

    private void a(long j, gx gxVar, com.google.firebase.database.b bVar) {
        if (bVar == null || bVar.a() != -25) {
            List a = this.q.a(j, !(bVar == null), true, this.d);
            if (a.size() > 0) {
                a(gxVar);
            }
            a(a);
        }
    }

    private void a(ib ibVar) {
        List<hl> a = ibVar.a();
        Map a2 = hd.a(this.d);
        long j = Long.MIN_VALUE;
        for (final hl hlVar : a) {
            gi anonymousClass11 = new gi(this) {
                final /* synthetic */ gz b;

                public void a(String str, String str2) {
                    com.google.firebase.database.b a = gz.b(str, str2);
                    this.b.a("Persisted write", hlVar.b(), a);
                    this.b.a(hlVar.a(), hlVar.b(), a);
                }
            };
            if (j >= hlVar.a()) {
                throw new IllegalStateException("Write ids were not in order.");
            }
            long a3 = hlVar.a();
            this.o = hlVar.a() + 1;
            if (hlVar.e()) {
                if (this.l.a()) {
                    this.l.a("Restoring overwrite with id " + hlVar.a(), new Object[0]);
                }
                this.e.a(hlVar.b().c(), hlVar.c().a(true), anonymousClass11);
                this.q.a(hlVar.b(), hlVar.c(), hd.a(hlVar.c(), a2), hlVar.a(), true, false);
            } else {
                if (this.l.a()) {
                    this.l.a("Restoring merge with id " + hlVar.a(), new Object[0]);
                }
                this.e.a(hlVar.b().c(), hlVar.d().a(true), anonymousClass11);
                this.q.a(hlVar.b(), hlVar.d(), hd.a(hlVar.d(), a2), hlVar.a(), false);
            }
            j = a3;
        }
    }

    private void a(ii<List<a>> iiVar) {
        if (((List) iiVar.a()) != null) {
            List<a> c = c((ii) iiVar);
            if (b || c.size() > 0) {
                Boolean valueOf;
                Boolean valueOf2 = Boolean.valueOf(true);
                for (a d : c) {
                    if (d.d != b.RUN) {
                        valueOf = Boolean.valueOf(false);
                        break;
                    }
                }
                valueOf = valueOf2;
                if (valueOf.booleanValue()) {
                    a((List) c, iiVar.b());
                    return;
                }
                return;
            }
            throw new AssertionError();
        } else if (iiVar.c()) {
            iiVar.b(new com.google.android.gms.b.ii.b<List<a>>(this) {
                final /* synthetic */ gz a;

                {
                    this.a = r1;
                }

                public void a(ii<List<a>> iiVar) {
                    this.a.a((ii) iiVar);
                }
            });
        }
    }

    private void a(ii<List<a>> iiVar, int i) {
        List list = (List) iiVar.a();
        List arrayList = new ArrayList();
        if (list != null) {
            com.google.firebase.database.b a;
            List<Runnable> arrayList2 = new ArrayList();
            if (i == -9) {
                a = com.google.firebase.database.b.a("overriddenBySet");
            } else {
                kt.a(i == -25, "Unknown transaction abort reason: " + i);
                a = com.google.firebase.database.b.a(-25);
            }
            int i2 = 0;
            int i3 = -1;
            while (i2 < list.size()) {
                int i4;
                final a aVar = (a) list.get(i2);
                if (aVar.d == b.SENT_NEEDS_ABORT) {
                    i4 = i3;
                } else if (aVar.d == b.SENT) {
                    if (b || i3 == i2 - 1) {
                        aVar.d = b.SENT_NEEDS_ABORT;
                        aVar.h = a;
                        i4 = i2;
                    } else {
                        throw new AssertionError();
                    }
                } else if (b || aVar.d == b.RUN) {
                    a(new hn(this, aVar.c, it.a(aVar.a)));
                    if (i == -9) {
                        arrayList.addAll(this.q.a(aVar.i, true, false, this.d));
                    } else {
                        kt.a(i == -25, "Unknown transaction abort reason: " + i);
                    }
                    arrayList2.add(new Runnable(this) {
                        public void run() {
                            aVar.b.a(a, false, null);
                        }
                    });
                    i4 = i3;
                } else {
                    throw new AssertionError();
                }
                i2++;
                i3 = i4;
            }
            if (i3 == -1) {
                iiVar.a(null);
            } else {
                iiVar.a(list.subList(0, i3 + 1));
            }
            a(arrayList);
            for (Runnable b : arrayList2) {
                b(b);
            }
        }
    }

    private void a(String str, gx gxVar, com.google.firebase.database.b bVar) {
        if (bVar != null && bVar.a() != -1 && bVar.a() != -25) {
            jb jbVar = this.l;
            String valueOf = String.valueOf(gxVar.toString());
            String valueOf2 = String.valueOf(bVar.toString());
            jbVar.a(new StringBuilder(((String.valueOf(str).length() + 13) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append(str).append(" at ").append(valueOf).append(" failed: ").append(valueOf2).toString());
        }
    }

    private void a(List<? extends ip> list) {
        if (!list.isEmpty()) {
            this.j.a((List) list);
        }
    }

    private void a(final List<a> list, final gx gxVar) {
        List arrayList = new ArrayList();
        for (a c : list) {
            arrayList.add(Long.valueOf(c.i));
        }
        jr a = a(gxVar, arrayList);
        String c2 = a.c();
        jr jrVar = a;
        for (a c3 : list) {
            if (b || c3.d == b.RUN) {
                c3.d = b.SENT;
                c3.g = c3.g + 1;
                jrVar = jrVar.a(gx.a(gxVar, c3.a), c3.k);
            } else {
                throw new AssertionError();
            }
        }
        Object a2 = jrVar.a(true);
        f();
        this.e.a(gxVar.c(), a2, c2, new gi(this) {
            final /* synthetic */ gz d;

            public void a(String str, String str2) {
                int i = 0;
                com.google.firebase.database.b a = gz.b(str, str2);
                this.d.a("Transaction", gxVar, a);
                List arrayList = new ArrayList();
                if (a == null) {
                    List arrayList2 = new ArrayList();
                    for (final a aVar : list) {
                        aVar.d = b.COMPLETED;
                        arrayList.addAll(this.d.q.a(aVar.i, false, false, this.d.d));
                        final com.google.firebase.database.a a2 = n.a(n.a(this, aVar.a), jl.a(aVar.l));
                        arrayList2.add(new Runnable(this) {
                            public void run() {
                                aVar.b.a(null, true, a2);
                            }
                        });
                        this.d.a(new hn(this.d, aVar.c, it.a(aVar.a)));
                    }
                    this.d.b(this.d.h.a(gxVar));
                    this.d.h();
                    this.a(arrayList);
                    while (i < arrayList2.size()) {
                        this.d.b((Runnable) arrayList2.get(i));
                        i++;
                    }
                    return;
                }
                if (a.a() == -1) {
                    for (a aVar2 : list) {
                        if (aVar2.d == b.SENT_NEEDS_ABORT) {
                            aVar2.d = b.NEEDS_ABORT;
                        } else {
                            aVar2.d = b.RUN;
                        }
                    }
                } else {
                    for (a aVar22 : list) {
                        aVar22.d = b.NEEDS_ABORT;
                        aVar22.h = a;
                    }
                }
                this.d.a(gxVar);
            }
        });
    }

    private void a(final List<a> list, ii<List<a>> iiVar) {
        List list2 = (List) iiVar.a();
        if (list2 != null) {
            list.addAll(list2);
        }
        iiVar.b(new com.google.android.gms.b.ii.b<List<a>>(this) {
            final /* synthetic */ gz b;

            public void a(ii<List<a>> iiVar) {
                this.b.a(list, (ii) iiVar);
            }
        });
    }

    private ii<List<a>> b(gx gxVar) {
        ii<List<a>> iiVar = this.h;
        while (!gxVar.h() && iiVar.a() == null) {
            iiVar = iiVar.a(new gx(gxVar.d()));
            gxVar = gxVar.e();
        }
        return iiVar;
    }

    private static com.google.firebase.database.b b(String str, String str2) {
        return str != null ? com.google.firebase.database.b.a(str, str2) : null;
    }

    private void b(ii<List<a>> iiVar) {
        Object obj = (List) iiVar.a();
        if (obj != null) {
            int i = 0;
            while (i < obj.size()) {
                int i2;
                if (((a) obj.get(i)).d == b.COMPLETED) {
                    obj.remove(i);
                    i2 = i;
                } else {
                    i2 = i + 1;
                }
                i = i2;
            }
            if (obj.size() > 0) {
                iiVar.a(obj);
            } else {
                iiVar.a(null);
            }
        }
        iiVar.b(new com.google.android.gms.b.ii.b<List<a>>(this) {
            final /* synthetic */ gz a;

            {
                this.a = r1;
            }

            public void a(ii<List<a>> iiVar) {
                this.a.b((ii) iiVar);
            }
        });
    }

    private void b(je jeVar, Object obj) {
        if (jeVar.equals(gp.b)) {
            this.d.a(((Long) obj).longValue());
        }
        gx gxVar = new gx(gp.a, jeVar);
        try {
            jr a = js.a(obj);
            this.f.a(gxVar, a);
            a(this.p.a(gxVar, a));
        } catch (Throwable e) {
            this.l.a("Failed to parse info update", e);
        }
    }

    private void b(List<a> list, gx gxVar) {
        if (!list.isEmpty()) {
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            for (a c : list) {
                arrayList2.add(Long.valueOf(c.i));
            }
            for (final a aVar : list) {
                gx a = gx.a(gxVar, aVar.a);
                ArrayList arrayList3 = new ArrayList();
                if (b || a != null) {
                    Object obj;
                    com.google.firebase.database.b k;
                    if (aVar.d == b.NEEDS_ABORT) {
                        obj = 1;
                        k = aVar.h;
                        if (k.a() != -25) {
                            arrayList3.addAll(this.q.a(aVar.i, true, false, this.d));
                        }
                    } else if (aVar.d != b.RUN) {
                        k = null;
                        obj = null;
                    } else if (aVar.g >= 25) {
                        obj = 1;
                        k = com.google.firebase.database.b.a("maxretries");
                        arrayList3.addAll(this.q.a(aVar.i, true, false, this.d));
                    } else {
                        com.google.firebase.database.l.b a2;
                        jr a3 = a(aVar.a, arrayList2);
                        aVar.j = a3;
                        try {
                            a2 = aVar.b.a(n.a(a3));
                            k = null;
                        } catch (Throwable th) {
                            com.google.firebase.database.b a4 = com.google.firebase.database.b.a(th);
                            a2 = l.a();
                            k = a4;
                        }
                        if (a2.a()) {
                            Long valueOf = Long.valueOf(aVar.i);
                            Map a5 = hd.a(this.d);
                            jr b = a2.b();
                            jr a6 = hd.a(b, a5);
                            aVar.k = b;
                            aVar.l = a6;
                            aVar.i = f();
                            arrayList2.remove(valueOf);
                            arrayList3.addAll(this.q.a(aVar.a, b, a6, aVar.i, aVar.f, false));
                            arrayList3.addAll(this.q.a(valueOf.longValue(), true, false, this.d));
                            k = null;
                            obj = null;
                        } else {
                            obj = 1;
                            arrayList3.addAll(this.q.a(aVar.i, true, false, this.d));
                        }
                    }
                    a((List) arrayList3);
                    if (obj != null) {
                        aVar.d = b.COMPLETED;
                        final com.google.firebase.database.a a7 = n.a(n.a(this, aVar.a), jl.a(aVar.j));
                        a(new Runnable(this) {
                            final /* synthetic */ gz b;

                            public void run() {
                                this.b.a(new hn(this.b, aVar.c, it.a(aVar.a)));
                            }
                        });
                        arrayList.add(new Runnable(this) {
                            public void run() {
                                aVar.b.a(k, false, a7);
                            }
                        });
                    }
                } else {
                    throw new AssertionError();
                }
            }
            b(this.h);
            for (int i = 0; i < arrayList.size(); i++) {
                b((Runnable) arrayList.get(i));
            }
            h();
        }
    }

    private List<a> c(ii<List<a>> iiVar) {
        List arrayList = new ArrayList();
        a(arrayList, (ii) iiVar);
        Collections.sort(arrayList);
        return arrayList;
    }

    private void e() {
        this.k.n().a(new com.google.android.gms.b.gm.b(this) {
            final /* synthetic */ gz a;

            {
                this.a = r1;
            }
        });
        this.e.a();
        ib b = this.k.b(this.c.a);
        this.f = new he();
        this.g = new hf();
        this.h = new ii();
        this.p = new hh(this.k, new ia(), new c(this) {
            final /* synthetic */ gz a;

            {
                this.a = r1;
            }

            public void a(it itVar, hi hiVar) {
            }

            public void a(final it itVar, hi hiVar, ge geVar, final com.google.android.gms.b.hh.a aVar) {
                this.a.a(new Runnable(this) {
                    final /* synthetic */ AnonymousClass9 c;

                    public void run() {
                        jr a = this.c.a.f.a(itVar.a());
                        if (!a.b()) {
                            this.c.a.a(this.c.a.p.a(itVar.a(), a));
                            aVar.a(null);
                        }
                    }
                });
            }
        });
        this.q = new hh(this.k, b, new c(this) {
            final /* synthetic */ gz a;

            {
                this.a = r1;
            }

            public void a(it itVar, hi hiVar) {
                this.a.e.a(itVar.a().c(), itVar.b().e());
            }

            public void a(it itVar, hi hiVar, ge geVar, final com.google.android.gms.b.hh.a aVar) {
                this.a.e.a(itVar.a().c(), itVar.b().e(), geVar, hiVar != null ? Long.valueOf(hiVar.a()) : null, new gi(this) {
                    final /* synthetic */ AnonymousClass10 b;

                    public void a(String str, String str2) {
                        this.b.a.a(aVar.a(gz.b(str, str2)));
                    }
                });
            }
        });
        a(b);
        b(gp.c, Boolean.valueOf(false));
        b(gp.d, Boolean.valueOf(false));
    }

    private long f() {
        long j = this.o;
        this.o = 1 + j;
        return j;
    }

    private void g() {
        hf a = hd.a(this.g, hd.a(this.d));
        final List arrayList = new ArrayList();
        a.a(gx.a(), new com.google.android.gms.b.hf.b(this) {
            final /* synthetic */ gz b;

            public void a(gx gxVar, jr jrVar) {
                arrayList.addAll(this.b.q.a(gxVar, jrVar));
                this.b.a(this.b.a(gxVar, -9));
            }
        });
        this.g = new hf();
        a(arrayList);
    }

    private void h() {
        ii iiVar = this.h;
        b(iiVar);
        a(iiVar);
    }

    public void a() {
        a(gp.d, Boolean.valueOf(true));
    }

    public void a(gs gsVar) {
        a(gp.a.equals(gsVar.a().a().d()) ? this.p.a(gsVar) : this.q.a(gsVar));
    }

    public void a(gx gxVar, jr jrVar, com.google.firebase.database.d.a aVar) {
        if (this.l.a()) {
            jb jbVar = this.l;
            String valueOf = String.valueOf(gxVar);
            jbVar.a(new StringBuilder(String.valueOf(valueOf).length() + 5).append("set: ").append(valueOf).toString(), new Object[0]);
        }
        if (this.n.a()) {
            jbVar = this.n;
            valueOf = String.valueOf(gxVar);
            String valueOf2 = String.valueOf(jrVar);
            jbVar.a(new StringBuilder((String.valueOf(valueOf).length() + 6) + String.valueOf(valueOf2).length()).append("set: ").append(valueOf).append(" ").append(valueOf2).toString(), new Object[0]);
        }
        jr a = hd.a(jrVar, hd.a(this.d));
        final long f = f();
        a(this.q.a(gxVar, jrVar, a, f, true, true));
        final gx gxVar2 = gxVar;
        final com.google.firebase.database.d.a aVar2 = aVar;
        this.e.a(gxVar.c(), jrVar.a(true), new gi(this) {
            final /* synthetic */ gz d;

            public void a(String str, String str2) {
                com.google.firebase.database.b a = gz.b(str, str2);
                this.d.a("setValue", gxVar2, a);
                this.d.a(f, gxVar2, a);
                this.d.a(aVar2, a, gxVar2);
            }
        });
        a(a(gxVar, -9));
    }

    public void a(je jeVar, Object obj) {
        b(jeVar, obj);
    }

    void a(final com.google.firebase.database.d.a aVar, final com.google.firebase.database.b bVar, gx gxVar) {
        if (aVar != null) {
            je g = gxVar.g();
            final d a = (g == null || !g.e()) ? n.a(this, gxVar) : n.a(this, gxVar.f());
            b(new Runnable(this) {
                public void run() {
                    aVar.a(bVar, a);
                }
            });
        }
    }

    public void a(Runnable runnable) {
        this.k.c();
        this.k.k().a(runnable);
    }

    public void a(List<String> list, Object obj, boolean z, Long l) {
        List a;
        gx gxVar = new gx((List) list);
        if (this.l.a()) {
            jb jbVar = this.l;
            String valueOf = String.valueOf(gxVar);
            jbVar.a(new StringBuilder(String.valueOf(valueOf).length() + 14).append("onDataUpdate: ").append(valueOf).toString(), new Object[0]);
        }
        if (this.n.a()) {
            jbVar = this.l;
            valueOf = String.valueOf(gxVar);
            String valueOf2 = String.valueOf(obj);
            jbVar.a(new StringBuilder((String.valueOf(valueOf).length() + 15) + String.valueOf(valueOf2).length()).append("onDataUpdate: ").append(valueOf).append(" ").append(valueOf2).toString(), new Object[0]);
        }
        this.a++;
        if (l != null) {
            try {
                hi hiVar = new hi(l.longValue());
                if (z) {
                    Map hashMap = new HashMap();
                    for (Entry entry : ((Map) obj).entrySet()) {
                        hashMap.put(new gx((String) entry.getKey()), js.a(entry.getValue()));
                    }
                    a = this.q.a(gxVar, hashMap, hiVar);
                } else {
                    a = this.q.a(gxVar, js.a(obj), hiVar);
                }
            } catch (Throwable e) {
                this.l.a("FIREBASE INTERNAL ERROR", e);
                return;
            }
        } else if (z) {
            Map hashMap2 = new HashMap();
            for (Entry entry2 : ((Map) obj).entrySet()) {
                hashMap2.put(new gx((String) entry2.getKey()), js.a(entry2.getValue()));
            }
            a = this.q.a(gxVar, hashMap2);
        } else {
            a = this.q.a(gxVar, js.a(obj));
        }
        if (a.size() > 0) {
            a(gxVar);
        }
        a(a);
    }

    public void a(List<String> list, List<gh> list2, Long l) {
        gx gxVar = new gx((List) list);
        if (this.l.a()) {
            jb jbVar = this.l;
            String valueOf = String.valueOf(gxVar);
            jbVar.a(new StringBuilder(String.valueOf(valueOf).length() + 20).append("onRangeMergeUpdate: ").append(valueOf).toString(), new Object[0]);
        }
        if (this.n.a()) {
            jbVar = this.l;
            valueOf = String.valueOf(gxVar);
            String valueOf2 = String.valueOf(list2);
            jbVar.a(new StringBuilder((String.valueOf(valueOf).length() + 21) + String.valueOf(valueOf2).length()).append("onRangeMergeUpdate: ").append(valueOf).append(" ").append(valueOf2).toString(), new Object[0]);
        }
        this.a++;
        List arrayList = new ArrayList(list2.size());
        for (gh jwVar : list2) {
            arrayList.add(new jw(jwVar));
        }
        List a = l != null ? this.q.a(gxVar, arrayList, new hi(l.longValue())) : this.q.a(gxVar, arrayList);
        if (a.size() > 0) {
            a(gxVar);
        }
        a(a);
    }

    public void a(Map<String, Object> map) {
        for (Entry entry : map.entrySet()) {
            b(je.a((String) entry.getKey()), entry.getValue());
        }
    }

    public void a(boolean z) {
        a(gp.c, Boolean.valueOf(z));
    }

    public void b() {
        a(gp.d, Boolean.valueOf(false));
        g();
    }

    public void b(Runnable runnable) {
        this.k.c();
        this.k.j().a(runnable);
    }

    void c() {
        this.e.d("repo_interrupt");
    }

    void d() {
        this.e.e("repo_interrupt");
    }

    public String toString() {
        return this.c.toString();
    }
}
