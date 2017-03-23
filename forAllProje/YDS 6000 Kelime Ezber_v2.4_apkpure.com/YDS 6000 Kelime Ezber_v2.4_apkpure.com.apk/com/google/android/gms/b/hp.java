package com.google.android.gms.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class hp {
    static final /* synthetic */ boolean a = (!hp.class.desiredAssertionStatus());
    private static final ih<hl> e = new ih<hl>() {
        public boolean a(hl hlVar) {
            return hlVar.f();
        }

        public /* synthetic */ boolean a(Object obj) {
            return a((hl) obj);
        }
    };
    private go b = go.a();
    private List<hl> c = new ArrayList();
    private Long d = Long.valueOf(-1);

    private static go a(List<hl> list, ih<hl> ihVar, gx gxVar) {
        go a = go.a();
        go goVar = a;
        for (hl hlVar : list) {
            if (ihVar.a(hlVar)) {
                gx b = hlVar.b();
                if (hlVar.e()) {
                    if (gxVar.b(b)) {
                        a = goVar.a(gx.a(gxVar, b), hlVar.c());
                    } else if (b.b(gxVar)) {
                        a = goVar.a(gx.a(), hlVar.c().a(gx.a(b, gxVar)));
                    }
                    goVar = a;
                } else {
                    if (gxVar.b(b)) {
                        a = goVar.a(gx.a(gxVar, b), hlVar.d());
                    } else if (b.b(gxVar)) {
                        b = gx.a(b, gxVar);
                        if (b.h()) {
                            a = goVar.a(gx.a(), hlVar.d());
                        } else {
                            jr c = hlVar.d().c(b);
                            if (c != null) {
                                a = goVar.a(gx.a(), c);
                            }
                        }
                    }
                    goVar = a;
                }
            }
            a = goVar;
            goVar = a;
        }
        return goVar;
    }

    private void a() {
        this.b = a(this.c, e, gx.a());
        if (this.c.size() > 0) {
            this.d = Long.valueOf(((hl) this.c.get(this.c.size() - 1)).a());
        } else {
            this.d = Long.valueOf(-1);
        }
    }

    private boolean a(hl hlVar, gx gxVar) {
        if (hlVar.e()) {
            return hlVar.b().b(gxVar);
        }
        Iterator it = hlVar.d().iterator();
        while (it.hasNext()) {
            if (hlVar.b().a((gx) ((Entry) it.next()).getKey()).b(gxVar)) {
                return true;
            }
        }
        return false;
    }

    public hl a(long j) {
        for (hl hlVar : this.c) {
            if (hlVar.a() == j) {
                return hlVar;
            }
        }
        return null;
    }

    public hq a(gx gxVar) {
        return new hq(gxVar, this);
    }

    public jr a(gx gxVar, gx gxVar2, jr jrVar, jr jrVar2) {
        if (!a && jrVar == null && jrVar2 == null) {
            throw new AssertionError("Either existingEventSnap or existingServerSnap must exist");
        }
        gx a = gxVar.a(gxVar2);
        if (this.b.b(a)) {
            return null;
        }
        go d = this.b.d(a);
        return d.e() ? jrVar2.a(gxVar2) : d.a(jrVar2.a(gxVar2));
    }

    public jr a(gx gxVar, je jeVar, ik ikVar) {
        gx a = gxVar.a(jeVar);
        jr c = this.b.c(a);
        return c != null ? c : ikVar.a(jeVar) ? this.b.d(a).a(ikVar.c().c(jeVar)) : null;
    }

    public jr a(gx gxVar, jr jrVar) {
        jj f = jj.f();
        jr<jq> c = this.b.c(gxVar);
        jr jrVar2;
        if (c == null) {
            go d = this.b.d(gxVar);
            jrVar2 = f;
            for (jq jqVar : jrVar) {
                jrVar2 = jrVar2.a(jqVar.a(), d.d(new gx(jqVar.a())).a(jqVar.b()));
            }
            for (jq jqVar2 : d.c()) {
                jrVar2 = jrVar2.a(jqVar2.a(), jqVar2.b());
            }
            return jrVar2;
        } else if (c.d()) {
            return f;
        } else {
            jrVar2 = f;
            for (jq jqVar22 : c) {
                jrVar2 = jrVar2.a(jqVar22.a(), jqVar22.b());
            }
            return jrVar2;
        }
    }

    public jr a(final gx gxVar, jr jrVar, final List<Long> list, final boolean z) {
        go d;
        if (!list.isEmpty() || z) {
            d = this.b.d(gxVar);
            if (!z && d.e()) {
                return jrVar;
            }
            if (!z && jrVar == null && !d.b(gx.a())) {
                return null;
            }
            d = a(this.c, new ih<hl>(this) {
                public boolean a(hl hlVar) {
                    return (hlVar.f() || z) && !list.contains(Long.valueOf(hlVar.a())) && (hlVar.b().b(gxVar) || gxVar.b(hlVar.b()));
                }

                public /* synthetic */ boolean a(Object obj) {
                    return a((hl) obj);
                }
            }, gxVar);
            if (jrVar == null) {
                jrVar = jj.f();
            }
            return d.a(jrVar);
        }
        jr c = this.b.c(gxVar);
        if (c != null) {
            return c;
        }
        d = this.b.d(gxVar);
        if (d.e()) {
            return jrVar;
        }
        if (jrVar == null && !d.b(gx.a())) {
            return null;
        }
        if (jrVar == null) {
            jrVar = jj.f();
        }
        return d.a(jrVar);
    }

    public void a(gx gxVar, go goVar, Long l) {
        if (a || l.longValue() > this.d.longValue()) {
            this.c.add(new hl(l.longValue(), gxVar, goVar));
            this.b = this.b.a(gxVar, goVar);
            this.d = l;
            return;
        }
        throw new AssertionError();
    }

    public void a(gx gxVar, jr jrVar, Long l, boolean z) {
        if (a || l.longValue() > this.d.longValue()) {
            this.c.add(new hl(l.longValue(), gxVar, jrVar, z));
            if (z) {
                this.b = this.b.a(gxVar, jrVar);
            }
            this.d = l;
            return;
        }
        throw new AssertionError();
    }

    public jr b(gx gxVar) {
        return this.b.c(gxVar);
    }

    public boolean b(long j) {
        hl hlVar = null;
        int i = 0;
        for (hl hlVar2 : this.c) {
            hl hlVar22;
            if (hlVar22.a() == j) {
                hlVar = hlVar22;
                break;
            }
            i++;
        }
        if (a || hlVar != null) {
            this.c.remove(hlVar);
            boolean f = hlVar.f();
            int size = this.c.size() - 1;
            boolean z = false;
            while (f && size >= 0) {
                boolean z2;
                hlVar22 = (hl) this.c.get(size);
                if (hlVar22.f()) {
                    if (size >= i && a(hlVar22, hlVar.b())) {
                        z2 = z;
                        z = false;
                        size--;
                        f = z;
                        z = z2;
                    } else if (hlVar.b().b(hlVar22.b())) {
                        z2 = true;
                        z = f;
                        size--;
                        f = z;
                        z = z2;
                    }
                }
                z2 = z;
                z = f;
                size--;
                f = z;
                z = z2;
            }
            if (!f) {
                return false;
            }
            if (z) {
                a();
                return true;
            } else if (hlVar.e()) {
                this.b = this.b.a(hlVar.b());
                return true;
            } else {
                Iterator it = hlVar.d().iterator();
                while (it.hasNext()) {
                    this.b = this.b.a(hlVar.b().a((gx) ((Entry) it.next()).getKey()));
                }
                return true;
            }
        }
        throw new AssertionError("removeWrite called with nonexistent writeId");
    }
}
