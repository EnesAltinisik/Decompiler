package com.google.android.gms.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;

public class hh {
    static final /* synthetic */ boolean a = (!hh.class.desiredAssertionStatus());
    private ig<hg> b = ig.a();
    private final hp c = new hp();
    private final Map<hi, it> d = new HashMap();
    private final Map<it, hi> e = new HashMap();
    private final Set<it> f = new HashSet();
    private final c g;
    private final ib h;
    private final jb i;
    private long j = 1;

    public interface c {
        void a(it itVar, hi hiVar);

        void a(it itVar, hi hiVar, ge geVar, a aVar);
    }

    public interface a {
        List<? extends ip> a(com.google.firebase.database.b bVar);
    }

    private class b implements ge, a {
        final /* synthetic */ hh a;
        private final iu b;
        private final hi c;

        public b(hh hhVar, iu iuVar) {
            this.a = hhVar;
            this.b = iuVar;
            this.c = hhVar.b(iuVar.a());
        }

        public String a() {
            return this.b.b().c();
        }

        public List<? extends ip> a(com.google.firebase.database.b bVar) {
            if (bVar == null) {
                return this.c != null ? this.a.a(this.c) : this.a.a(this.b.a().a());
            } else {
                jb a = this.a.i;
                String valueOf = String.valueOf(this.b.a().a());
                String valueOf2 = String.valueOf(bVar.toString());
                a.a(new StringBuilder((String.valueOf(valueOf).length() + 19) + String.valueOf(valueOf2).length()).append("Listen at ").append(valueOf).append(" failed: ").append(valueOf2).toString());
                return this.a.a(this.b.a(), bVar);
            }
        }

        public boolean b() {
            return kp.a(this.b.b()) > 1024;
        }

        public fy c() {
            jg a = jg.a(this.b.b());
            List<gx> a2 = a.a();
            List arrayList = new ArrayList(a2.size());
            for (gx c : a2) {
                arrayList.add(c.c());
            }
            return new fy(arrayList, a.b());
        }
    }

    public hh(gq gqVar, ib ibVar, c cVar) {
        this.g = cVar;
        this.h = ibVar;
        this.i = gqVar.a("SyncTree");
    }

    private it a(it itVar) {
        return (!itVar.d() || itVar.c()) ? itVar : it.a(itVar.a());
    }

    private List<ip> a(hu huVar) {
        return a(huVar, this.b, null, this.c.a(gx.a()));
    }

    private List<ip> a(hu huVar, ig<hg> igVar, jr jrVar, hq hqVar) {
        if (huVar.c().h()) {
            return b(huVar, igVar, jrVar, hqVar);
        }
        hg hgVar = (hg) igVar.b();
        if (jrVar == null && hgVar != null) {
            jrVar = hgVar.a(gx.a());
        }
        List<ip> arrayList = new ArrayList();
        je d = huVar.c().d();
        hu a = huVar.a(d);
        ig igVar2 = (ig) igVar.c().b(d);
        if (!(igVar2 == null || a == null)) {
            arrayList.addAll(a(a, igVar2, jrVar != null ? jrVar.c(d) : null, hqVar.a(d)));
        }
        if (hgVar != null) {
            arrayList.addAll(hgVar.a(huVar, hqVar, jrVar));
        }
        return arrayList;
    }

    private List<iu> a(ig<hg> igVar) {
        List arrayList = new ArrayList();
        a((ig) igVar, arrayList);
        return arrayList;
    }

    private List<ip> a(final it itVar, final gs gsVar, final com.google.firebase.database.b bVar) {
        return (List) this.h.a(new Callable<List<ip>>(this) {
            static final /* synthetic */ boolean a = (!hh.class.desiredAssertionStatus());
            final /* synthetic */ hh e;

            public List<ip> a() {
                gx a = itVar.a();
                hg hgVar = (hg) this.e.b.e(a);
                List<ip> arrayList = new ArrayList();
                if (hgVar != null && (itVar.c() || hgVar.b(itVar))) {
                    Object obj;
                    kr a2 = hgVar.a(itVar, gsVar, bVar);
                    if (hgVar.a()) {
                        this.e.b = this.e.b.d(a);
                    }
                    List<it> list = (List) a2.a();
                    arrayList = (List) a2.b();
                    Object obj2 = null;
                    for (it itVar : list) {
                        this.e.h.a(itVar);
                        obj = (obj2 != null || itVar.d()) ? 1 : null;
                        obj2 = obj;
                    }
                    ig d = this.e.b;
                    obj = (d.b() == null || !((hg) d.b()).c()) ? null : 1;
                    Iterator it = a.iterator();
                    ig igVar = d;
                    Object obj3 = obj;
                    while (it.hasNext()) {
                        igVar = igVar.a((je) it.next());
                        obj = (obj3 != null || (igVar.b() != null && ((hg) igVar.b()).c())) ? 1 : null;
                        if (obj != null) {
                            obj3 = obj;
                            break;
                        } else if (igVar.d()) {
                            obj3 = obj;
                            break;
                        } else {
                            obj3 = obj;
                        }
                    }
                    if (obj2 != null && obj3 == null) {
                        ig c = this.e.b.c(a);
                        if (!c.d()) {
                            for (iu iuVar : this.e.a(c)) {
                                b bVar = new b(this.e, iuVar);
                                this.e.g.a(this.e.a(iuVar.a()), bVar.c, bVar, bVar);
                            }
                        }
                    }
                    if (obj3 == null && !list.isEmpty() && bVar == null) {
                        if (obj2 != null) {
                            this.e.g.a(this.e.a(itVar), null);
                        } else {
                            for (it itVar2 : list) {
                                hi a3 = this.e.b(itVar2);
                                if (a || a3 != null) {
                                    this.e.g.a(this.e.a(itVar2), a3);
                                } else {
                                    throw new AssertionError();
                                }
                            }
                        }
                    }
                    this.e.a((List) list);
                }
                return arrayList;
            }

            public /* synthetic */ Object call() {
                return a();
            }
        });
    }

    private List<? extends ip> a(it itVar, hu huVar) {
        gx a = itVar.a();
        hg hgVar = (hg) this.b.e(a);
        if (a || hgVar != null) {
            return hgVar.a(huVar, this.c.a(a), null);
        }
        throw new AssertionError("Missing sync point for query tag that we're tracking");
    }

    private void a(ig<hg> igVar, List<iu> list) {
        hg hgVar = (hg) igVar.b();
        if (hgVar == null || !hgVar.c()) {
            if (hgVar != null) {
                list.addAll(hgVar.b());
            }
            Iterator it = igVar.c().iterator();
            while (it.hasNext()) {
                a((ig) ((Entry) it.next()).getValue(), (List) list);
            }
            return;
        }
        list.add(hgVar.d());
    }

    private void a(List<it> list) {
        for (it itVar : list) {
            if (!itVar.d()) {
                hi b = b(itVar);
                if (a || b != null) {
                    this.e.remove(itVar);
                    this.d.remove(b);
                } else {
                    throw new AssertionError();
                }
            }
        }
    }

    private hi b(it itVar) {
        return (hi) this.e.get(itVar);
    }

    private it b(hi hiVar) {
        return (it) this.d.get(hiVar);
    }

    private List<ip> b(hu huVar, ig<hg> igVar, jr jrVar, hq hqVar) {
        hg hgVar = (hg) igVar.b();
        final jr a = (jrVar != null || hgVar == null) ? jrVar : hgVar.a(gx.a());
        final List<ip> arrayList = new ArrayList();
        final hq hqVar2 = hqVar;
        final hu huVar2 = huVar;
        igVar.c().a(new com.google.android.gms.b.ft.b<je, ig<hg>>(this) {
            final /* synthetic */ hh e;

            public void a(je jeVar, ig<hg> igVar) {
                jr jrVar = null;
                if (a != null) {
                    jrVar = a.c(jeVar);
                }
                hq a = hqVar2.a(jeVar);
                hu a2 = huVar2.a(jeVar);
                if (a2 != null) {
                    arrayList.addAll(this.e.b(a2, igVar, jrVar, a));
                }
            }

            public /* synthetic */ void a(Object obj, Object obj2) {
                a((je) obj, (ig) obj2);
            }
        });
        if (hgVar != null) {
            arrayList.addAll(hgVar.a(huVar, hqVar, a));
        }
        return arrayList;
    }

    public List<? extends ip> a(long j, boolean z, boolean z2, kl klVar) {
        final boolean z3 = z2;
        final long j2 = j;
        final boolean z4 = z;
        final kl klVar2 = klVar;
        return (List) this.h.a(new Callable<List<? extends ip>>(this) {
            final /* synthetic */ hh e;

            public List<? extends ip> a() {
                if (z3) {
                    this.e.h.a(j2);
                }
                hl a = this.e.c.a(j2);
                boolean b = this.e.c.b(j2);
                if (a.f() && !z4) {
                    Map a2 = hd.a(klVar2);
                    if (a.e()) {
                        this.e.h.a(a.b(), hd.a(a.c(), a2));
                    } else {
                        this.e.h.a(a.b(), hd.a(a.d(), a2));
                    }
                }
                if (!b) {
                    return Collections.emptyList();
                }
                ig a3;
                ig a4 = ig.a();
                if (a.e()) {
                    a3 = a4.a(gx.a(), Boolean.valueOf(true));
                } else {
                    Iterator it = a.d().iterator();
                    a3 = a4;
                    while (it.hasNext()) {
                        a3 = a3.a((gx) ((Entry) it.next()).getKey(), Boolean.valueOf(true));
                    }
                }
                return this.e.a(new hr(a.b(), a3, z4));
            }

            public /* synthetic */ Object call() {
                return a();
            }
        });
    }

    public List<ip> a(gs gsVar) {
        return a(gsVar.a(), gsVar, null);
    }

    public List<? extends ip> a(final gx gxVar) {
        return (List) this.h.a(new Callable<List<? extends ip>>(this) {
            final /* synthetic */ hh b;

            public List<? extends ip> a() {
                this.b.h.b(it.a(gxVar));
                return this.b.a(new hs(hv.b, gxVar));
            }

            public /* synthetic */ Object call() {
                return a();
            }
        });
    }

    public List<? extends ip> a(gx gxVar, go goVar, go goVar2, long j, boolean z) {
        final boolean z2 = z;
        final gx gxVar2 = gxVar;
        final go goVar3 = goVar;
        final long j2 = j;
        final go goVar4 = goVar2;
        return (List) this.h.a(new Callable<List<? extends ip>>(this) {
            final /* synthetic */ hh f;

            public List<? extends ip> a() {
                if (z2) {
                    this.f.h.a(gxVar2, goVar3, j2);
                }
                this.f.c.a(gxVar2, goVar4, Long.valueOf(j2));
                return this.f.a(new ht(hv.a, gxVar2, goVar4));
            }

            public /* synthetic */ Object call() {
                return a();
            }
        });
    }

    public List<? extends ip> a(final gx gxVar, final jr jrVar) {
        return (List) this.h.a(new Callable<List<? extends ip>>(this) {
            final /* synthetic */ hh c;

            public List<? extends ip> a() {
                this.c.h.a(it.a(gxVar), jrVar);
                return this.c.a(new hw(hv.b, gxVar, jrVar));
            }

            public /* synthetic */ Object call() {
                return a();
            }
        });
    }

    public List<? extends ip> a(final gx gxVar, final jr jrVar, final hi hiVar) {
        return (List) this.h.a(new Callable<List<? extends ip>>(this) {
            final /* synthetic */ hh d;

            public List<? extends ip> a() {
                it a = this.d.b(hiVar);
                if (a == null) {
                    return Collections.emptyList();
                }
                gx a2 = gx.a(a.a(), gxVar);
                this.d.h.a(a2.h() ? a : it.a(gxVar), jrVar);
                return this.d.a(a, new hw(hv.a(a.b()), a2, jrVar));
            }

            public /* synthetic */ Object call() {
                return a();
            }
        });
    }

    public List<? extends ip> a(gx gxVar, jr jrVar, jr jrVar2, long j, boolean z, boolean z2) {
        boolean z3 = z || !z2;
        kt.a(z3, "We shouldn't be persisting non-visible writes.");
        final boolean z4 = z2;
        final gx gxVar2 = gxVar;
        final jr jrVar3 = jrVar;
        final long j2 = j;
        final jr jrVar4 = jrVar2;
        final boolean z5 = z;
        return (List) this.h.a(new Callable<List<? extends ip>>(this) {
            final /* synthetic */ hh g;

            public List<? extends ip> a() {
                if (z4) {
                    this.g.h.a(gxVar2, jrVar3, j2);
                }
                this.g.c.a(gxVar2, jrVar4, Long.valueOf(j2), z5);
                return !z5 ? Collections.emptyList() : this.g.a(new hw(hv.a, gxVar2, jrVar4));
            }

            public /* synthetic */ Object call() {
                return a();
            }
        });
    }

    public List<? extends ip> a(gx gxVar, List<jw> list) {
        hg hgVar = (hg) this.b.e(gxVar);
        if (hgVar == null) {
            return Collections.emptyList();
        }
        iu d = hgVar.d();
        if (d == null) {
            return Collections.emptyList();
        }
        jr b = d.b();
        jr jrVar = b;
        for (jw a : list) {
            jrVar = a.a(jrVar);
        }
        return a(gxVar, jrVar);
    }

    public List<? extends ip> a(gx gxVar, List<jw> list, hi hiVar) {
        it b = b(hiVar);
        if (b == null) {
            return Collections.emptyList();
        }
        if (a || gxVar.equals(b.a())) {
            hg hgVar = (hg) this.b.e(b.a());
            if (a || hgVar != null) {
                iu a = hgVar.a(b);
                if (a || a != null) {
                    jr b2 = a.b();
                    jr jrVar = b2;
                    for (jw a2 : list) {
                        jrVar = a2.a(jrVar);
                    }
                    return a(gxVar, jrVar, hiVar);
                }
                throw new AssertionError("Missing view for query tag that we're tracking");
            }
            throw new AssertionError("Missing sync point for query tag that we're tracking");
        }
        throw new AssertionError();
    }

    public List<? extends ip> a(final gx gxVar, final Map<gx, jr> map) {
        return (List) this.h.a(new Callable<List<? extends ip>>(this) {
            final /* synthetic */ hh c;

            public List<? extends ip> a() {
                go b = go.b(map);
                this.c.h.b(gxVar, b);
                return this.c.a(new ht(hv.b, gxVar, b));
            }

            public /* synthetic */ Object call() {
                return a();
            }
        });
    }

    public List<? extends ip> a(final gx gxVar, final Map<gx, jr> map, final hi hiVar) {
        return (List) this.h.a(new Callable<List<? extends ip>>(this) {
            final /* synthetic */ hh d;

            public List<? extends ip> a() {
                it a = this.d.b(hiVar);
                if (a == null) {
                    return Collections.emptyList();
                }
                gx a2 = gx.a(a.a(), gxVar);
                go b = go.b(map);
                this.d.h.b(gxVar, b);
                return this.d.a(a, new ht(hv.a(a.b()), a2, b));
            }

            public /* synthetic */ Object call() {
                return a();
            }
        });
    }

    public List<? extends ip> a(final hi hiVar) {
        return (List) this.h.a(new Callable<List<? extends ip>>(this) {
            final /* synthetic */ hh b;

            public List<? extends ip> a() {
                it a = this.b.b(hiVar);
                if (a == null) {
                    return Collections.emptyList();
                }
                this.b.h.b(a);
                return this.b.a(a, new hs(hv.a(a.b()), gx.a()));
            }

            public /* synthetic */ Object call() {
                return a();
            }
        });
    }

    public List<ip> a(it itVar, com.google.firebase.database.b bVar) {
        return a(itVar, null, bVar);
    }

    public jr b(gx gxVar, List<Long> list) {
        jr a;
        ig igVar = this.b;
        igVar.b();
        jr jrVar = null;
        gx a2 = gx.a();
        ig igVar2 = igVar;
        gx gxVar2 = gxVar;
        while (true) {
            je d = gxVar2.d();
            gx e = gxVar2.e();
            gxVar2 = a2.a(d);
            gx a3 = gx.a(gxVar2, gxVar);
            igVar2 = d != null ? igVar2.a(d) : ig.a();
            hg hgVar = (hg) igVar2.b();
            a = hgVar != null ? hgVar.a(a3) : jrVar;
            if (!e.h() && a == null) {
                jrVar = a;
                a2 = gxVar2;
                gxVar2 = e;
            }
        }
        return this.c.a(gxVar, a, (List) list, true);
    }
}
