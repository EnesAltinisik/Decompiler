package com.google.android.gms.b;

import com.google.android.gms.b.ig.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class if {
    static final /* synthetic */ boolean a = (!if.class.desiredAssertionStatus());
    private static final ih<Map<is, ie>> b = new ih<Map<is, ie>>() {
        public /* synthetic */ boolean a(Object obj) {
            return a((Map) obj);
        }

        public boolean a(Map<is, ie> map) {
            ie ieVar = (ie) map.get(is.a);
            return ieVar != null && ieVar.d;
        }
    };
    private static final ih<Map<is, ie>> c = new ih<Map<is, ie>>() {
        public /* synthetic */ boolean a(Object obj) {
            return a((Map) obj);
        }

        public boolean a(Map<is, ie> map) {
            ie ieVar = (ie) map.get(is.a);
            return ieVar != null && ieVar.e;
        }
    };
    private static final ih<ie> d = new ih<ie>() {
        public boolean a(ie ieVar) {
            return !ieVar.e;
        }

        public /* synthetic */ boolean a(Object obj) {
            return a((ie) obj);
        }
    };
    private static final ih<ie> e = new ih<ie>() {
        public boolean a(ie ieVar) {
            return !if.d.a(ieVar);
        }

        public /* synthetic */ boolean a(Object obj) {
            return a((ie) obj);
        }
    };
    private ig<Map<is, ie>> f;
    private final ic g;
    private final jb h;
    private final kl i;
    private long j = 0;

    public if(ic icVar, jb jbVar, kl klVar) {
        this.g = icVar;
        this.h = jbVar;
        this.i = klVar;
        this.f = new ig(null);
        c();
        for (ie ieVar : this.g.c()) {
            this.j = Math.max(ieVar.a + 1, this.j);
            a(ieVar);
        }
    }

    private static long a(hx hxVar, long j) {
        return j - Math.min((long) Math.floor((double) ((1.0f - hxVar.a()) * ((float) j))), hxVar.b());
    }

    private List<ie> a(ih<ie> ihVar) {
        List<ie> arrayList = new ArrayList();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            for (ie ieVar : ((Map) ((Entry) it.next()).getValue()).values()) {
                if (ihVar.a(ieVar)) {
                    arrayList.add(ieVar);
                }
            }
        }
        return arrayList;
    }

    private void a(ie ieVar) {
        Map map;
        e(ieVar.b);
        Map map2 = (Map) this.f.e(ieVar.b.a());
        if (map2 == null) {
            map2 = new HashMap();
            this.f = this.f.a(ieVar.b.a(), (Object) map2);
            map = map2;
        } else {
            map = map2;
        }
        ie ieVar2 = (ie) map.get(ieVar.b.b());
        boolean z = ieVar2 == null || ieVar2.a == ieVar.a;
        kt.a(z);
        map.put(ieVar.b.b(), ieVar);
    }

    private void a(it itVar, boolean z) {
        it f = f(itVar);
        ie a = a(f);
        long a2 = this.i.a();
        if (a != null) {
            a = a.a(a2).a(z);
        } else if (a || z) {
            long j = this.j;
            this.j = 1 + j;
            a = new ie(j, f, a2, false, z);
        } else {
            throw new AssertionError("If we're setting the query to inactive, we should already be tracking it!");
        }
        b(a);
    }

    private void b(ie ieVar) {
        a(ieVar);
        this.g.a(ieVar);
    }

    private void c() {
        try {
            this.g.d();
            this.g.c(this.i.a());
            this.g.f();
        } finally {
            this.g.e();
        }
    }

    private boolean d(gx gxVar) {
        return this.f.a(gxVar, b) != null;
    }

    private static void e(it itVar) {
        boolean z = !itVar.d() || itVar.c();
        kt.a(z, "Can't have tracked non-default query that loads all data");
    }

    private static it f(it itVar) {
        return itVar.d() ? it.a(itVar.a()) : itVar;
    }

    public long a() {
        return (long) a(d).size();
    }

    public id a(hx hxVar) {
        List a = a(d);
        long a2 = a(hxVar, (long) a.size());
        id idVar = new id();
        if (this.h.a()) {
            this.h.a("Pruning old queries.  Prunable: " + a.size() + " Count to prune: " + a2, new Object[0]);
        }
        Collections.sort(a, new Comparator<ie>(this) {
            public int a(ie ieVar, ie ieVar2) {
                return kt.a(ieVar.c, ieVar2.c);
            }

            public /* synthetic */ int compare(Object obj, Object obj2) {
                return a((ie) obj, (ie) obj2);
            }
        });
        for (int i = 0; ((long) i) < a2; i++) {
            ie ieVar = (ie) a.get(i);
            idVar = idVar.c(ieVar.b.a());
            b(ieVar.b);
        }
        id idVar2 = idVar;
        for (int i2 = (int) a2; i2 < a.size(); i2++) {
            idVar2 = idVar2.d(((ie) a.get(i2)).b.a());
        }
        List<ie> a3 = a(e);
        if (this.h.a()) {
            this.h.a("Unprunable queries: " + a3.size(), new Object[0]);
        }
        for (ie ieVar2 : a3) {
            idVar2 = idVar2.d(ieVar2.b.a());
        }
        return idVar2;
    }

    public ie a(it itVar) {
        it f = f(itVar);
        Map map = (Map) this.f.e(f.a());
        return map != null ? (ie) map.get(f.b()) : null;
    }

    public void a(gx gxVar) {
        this.f.c(gxVar).a(new a<Map<is, ie>, Void>(this) {
            final /* synthetic */ if a;

            {
                this.a = r1;
            }

            public Void a(gx gxVar, Map<is, ie> map, Void voidR) {
                for (Entry value : map.entrySet()) {
                    ie ieVar = (ie) value.getValue();
                    if (!ieVar.d) {
                        this.a.b(ieVar.a());
                    }
                }
                return null;
            }
        });
    }

    public void b(gx gxVar) {
        if (!d(gxVar)) {
            it a = it.a(gxVar);
            ie a2 = a(a);
            if (a2 == null) {
                long j = this.j;
                this.j = 1 + j;
                a2 = new ie(j, a, this.i.a(), true, false);
            } else if (a || !a2.d) {
                a2 = a2.a();
            } else {
                throw new AssertionError("This should have been handled above!");
            }
            b(a2);
        }
    }

    public void b(it itVar) {
        it f = f(itVar);
        ie a = a(f);
        if (a || a != null) {
            this.g.b(a.a);
            Map map = (Map) this.f.e(f.a());
            map.remove(f.b());
            if (map.isEmpty()) {
                this.f = this.f.d(f.a());
                return;
            }
            return;
        }
        throw new AssertionError("Query must exist to be removed.");
    }

    public void c(it itVar) {
        a(itVar, false);
    }

    public boolean c(gx gxVar) {
        return this.f.b(gxVar, c) != null;
    }

    public void d(it itVar) {
        ie a = a(f(itVar));
        if (a != null && !a.d) {
            b(a.a());
        }
    }
}
