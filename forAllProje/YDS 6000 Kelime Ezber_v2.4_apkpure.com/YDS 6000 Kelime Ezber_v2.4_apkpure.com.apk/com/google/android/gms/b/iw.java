package com.google.android.gms.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class iw {
    static final /* synthetic */ boolean a = (!iw.class.desiredAssertionStatus());
    private static com.google.android.gms.b.iy.a c = new com.google.android.gms.b.iy.a() {
        public jr a(je jeVar) {
            return null;
        }
    };
    private final iy b;

    public static class a {
        public final iv a;
        public final List<im> b;

        public a(iv ivVar, List<im> list) {
            this.a = ivVar;
            this.b = list;
        }
    }

    private static class b implements com.google.android.gms.b.iy.a {
        private final hq a;
        private final iv b;
        private final jr c;

        public b(hq hqVar, iv ivVar, jr jrVar) {
            this.a = hqVar;
            this.b = ivVar;
            this.c = jrVar;
        }

        public jr a(je jeVar) {
            ik a = this.b.a();
            if (a.a(jeVar)) {
                return a.c().c(jeVar);
            }
            return this.a.a(jeVar, this.c != null ? new ik(jl.a(this.c, jn.b()), true, false) : this.b.c());
        }
    }

    private iv a(iv ivVar, gx gxVar, go goVar, hq hqVar, jr jrVar, ix ixVar) {
        if (a || goVar.b() == null) {
            Entry entry;
            gx a;
            Iterator it = goVar.iterator();
            iv ivVar2 = ivVar;
            while (it.hasNext()) {
                entry = (Entry) it.next();
                a = gxVar.a((gx) entry.getKey());
                if (a(ivVar, a.d())) {
                    ivVar2 = a(ivVar2, a, (jr) entry.getValue(), hqVar, jrVar, ixVar);
                }
            }
            it = goVar.iterator();
            while (it.hasNext()) {
                entry = (Entry) it.next();
                a = gxVar.a((gx) entry.getKey());
                if (!a(ivVar, a.d())) {
                    ivVar2 = a(ivVar2, a, (jr) entry.getValue(), hqVar, jrVar, ixVar);
                }
            }
            return ivVar2;
        }
        throw new AssertionError("Can't have a merge that is an overwrite");
    }

    private iv a(iv ivVar, gx gxVar, go goVar, hq hqVar, jr jrVar, boolean z, ix ixVar) {
        if (ivVar.c().c().b() && !ivVar.c().a()) {
            return ivVar;
        }
        if (a || goVar.b() == null) {
            je jeVar;
            if (!gxVar.h()) {
                goVar = go.a().a(gxVar, goVar);
            }
            jr c = ivVar.c().c();
            Map d = goVar.d();
            iv ivVar2 = ivVar;
            for (Entry entry : d.entrySet()) {
                jeVar = (je) entry.getKey();
                if (c.a(jeVar)) {
                    ivVar2 = a(ivVar2, new gx(jeVar), ((go) entry.getValue()).a(c.c(jeVar)), hqVar, jrVar, z, ixVar);
                }
            }
            for (Entry entry2 : d.entrySet()) {
                jeVar = (je) entry2.getKey();
                Object obj = (ivVar.c().a(jeVar) || ((go) entry2.getValue()).b() != null) ? null : 1;
                if (!c.a(jeVar) && obj == null) {
                    ivVar2 = a(ivVar2, new gx(jeVar), ((go) entry2.getValue()).a(c.c(jeVar)), hqVar, jrVar, z, ixVar);
                }
            }
            return ivVar2;
        }
        throw new AssertionError("Can't have a merge that is an overwrite");
    }

    private iv a(iv ivVar, gx gxVar, hq hqVar, com.google.android.gms.b.iy.a aVar, ix ixVar) {
        ik a = ivVar.a();
        if (hqVar.a(gxVar) != null) {
            return ivVar;
        }
        jl a2;
        jr a3;
        if (!gxVar.h()) {
            je d = gxVar.d();
            if (!d.e()) {
                jr a4;
                gx e = gxVar.e();
                if (a.a(d)) {
                    a3 = hqVar.a(gxVar, a.c(), ivVar.c().c());
                    a4 = a3 != null ? a.c().c(d).a(e, a3) : a.c().c(d);
                } else {
                    a4 = hqVar.a(d, ivVar.c());
                }
                a2 = a4 != null ? this.b.a(a.d(), d, a4, e, aVar, ixVar) : a.d();
            } else if (a || gxVar.i() == 1) {
                a3 = hqVar.a(gxVar, a.c(), ivVar.c().c());
                a2 = a3 != null ? this.b.a(a.d(), a3) : a.d();
            } else {
                throw new AssertionError("Can't have a priority with additional path components");
            }
        } else if (a || ivVar.c().a()) {
            if (ivVar.c().b()) {
                a3 = ivVar.d();
                if (!(a3 instanceof jf)) {
                    a3 = jj.f();
                }
                a3 = hqVar.b(a3);
            } else {
                a3 = hqVar.a(ivVar.d());
            }
            a2 = this.b.a(ivVar.a().d(), jl.a(a3, this.b.c()), ixVar);
        } else {
            throw new AssertionError("If change path is empty, we must have complete server data");
        }
        boolean z = a.a() || gxVar.h();
        return ivVar.a(a2, z, this.b.a());
    }

    private iv a(iv ivVar, gx gxVar, ig<Boolean> igVar, hq hqVar, jr jrVar, ix ixVar) {
        if (hqVar.a(gxVar) != null) {
            return ivVar;
        }
        boolean b = ivVar.c().b();
        ik c = ivVar.c();
        go a;
        if (igVar.b() == null) {
            a = go.a();
            Iterator it = igVar.iterator();
            while (it.hasNext()) {
                gx gxVar2 = (gx) ((Entry) it.next()).getKey();
                gx a2 = gxVar.a(gxVar2);
                if (c.a(a2)) {
                    a = a.a(gxVar2, c.c().a(a2));
                }
            }
            return a(ivVar, gxVar, a, hqVar, jrVar, b, ixVar);
        } else if ((gxVar.h() && c.a()) || c.a(gxVar)) {
            return a(ivVar, gxVar, c.c().a(gxVar), hqVar, jrVar, b, ixVar);
        } else if (!gxVar.h()) {
            return ivVar;
        } else {
            a = go.a();
            for (jq jqVar : c.c()) {
                a = a.a(jqVar.a(), jqVar.b());
            }
            return a(ivVar, gxVar, a, hqVar, jrVar, b, ixVar);
        }
    }

    private iv a(iv ivVar, gx gxVar, jr jrVar, hq hqVar, jr jrVar2, ix ixVar) {
        ik a = ivVar.a();
        com.google.android.gms.b.iy.a bVar = new b(hqVar, ivVar, jrVar2);
        if (gxVar.h()) {
            return ivVar.a(this.b.a(ivVar.a().d(), jl.a(jrVar, this.b.c()), ixVar), true, this.b.a());
        }
        je d = gxVar.d();
        if (d.e()) {
            return ivVar.a(this.b.a(ivVar.a().d(), jrVar), a.a(), a.b());
        }
        jr jrVar3;
        gx e = gxVar.e();
        jr c = a.c().c(d);
        if (e.h()) {
            jrVar3 = jrVar;
        } else {
            jrVar3 = bVar.a(d);
            if (jrVar3 == null) {
                jrVar3 = jj.f();
            } else if (!(e.g().e() && jrVar3.a(e.f()).b())) {
                jrVar3 = jrVar3.a(e, jrVar);
            }
        }
        return !c.equals(jrVar3) ? ivVar.a(this.b.a(a.d(), d, jrVar3, e, bVar, ixVar), a.a(), this.b.a()) : ivVar;
    }

    private iv a(iv ivVar, gx gxVar, jr jrVar, hq hqVar, jr jrVar2, boolean z, ix ixVar) {
        jl a;
        ik c = ivVar.c();
        iy b = z ? this.b : this.b.b();
        if (gxVar.h()) {
            a = b.a(c.d(), jl.a(jrVar, b.c()), null);
        } else if (!b.a() || c.b()) {
            je d = gxVar.d();
            if (!c.a(gxVar) && gxVar.i() > 1) {
                return ivVar;
            }
            gx e = gxVar.e();
            jr a2 = c.c().c(d).a(e, jrVar);
            a = d.e() ? b.a(c.d(), a2) : b.a(c.d(), d, a2, e, c, null);
        } else if (a || !gxVar.h()) {
            je d2 = gxVar.d();
            a = b.a(c.d(), c.d().a(d2, c.c().c(d2).a(gxVar.e(), jrVar)), null);
        } else {
            throw new AssertionError("An empty path should have been caught in the other branch");
        }
        boolean z2 = c.a() || gxVar.h();
        iv b2 = ivVar.b(a, z2, b.a());
        return a(b2, gxVar, hqVar, new b(hqVar, b2, jrVar2), ixVar);
    }

    private void a(iv ivVar, iv ivVar2, List<im> list) {
        ik a = ivVar2.a();
        if (a.a()) {
            Object obj = (a.c().d() || a.c().b()) ? 1 : null;
            if (!list.isEmpty() || !ivVar.a().a() || ((obj != null && !a.c().equals(ivVar.b())) || !a.c().e().equals(ivVar.b().e()))) {
                list.add(im.a(a.d()));
            }
        }
    }

    private static boolean a(iv ivVar, je jeVar) {
        return ivVar.a().a(jeVar);
    }

    private iv b(iv ivVar, gx gxVar, hq hqVar, jr jrVar, ix ixVar) {
        ik c = ivVar.c();
        jl d = c.d();
        boolean z = c.a() || gxVar.h();
        return a(ivVar.b(d, z, c.b()), gxVar, hqVar, c, ixVar);
    }

    public iv a(iv ivVar, gx gxVar, hq hqVar, jr jrVar, ix ixVar) {
        if (hqVar.a(gxVar) != null) {
            return ivVar;
        }
        com.google.android.gms.b.iy.a bVar = new b(hqVar, ivVar, jrVar);
        jl d = ivVar.a().d();
        if (gxVar.h() || gxVar.d().e()) {
            d = this.b.a(d, jl.a(ivVar.c().a() ? hqVar.a(ivVar.d()) : hqVar.b(ivVar.c().c()), this.b.c()), ixVar);
        } else {
            je d2 = gxVar.d();
            jr a = hqVar.a(d2, ivVar.c());
            if (a == null && ivVar.c().a(d2)) {
                a = d.a().c(d2);
            }
            if (a != null) {
                d = this.b.a(d, d2, a, gxVar.e(), bVar, ixVar);
            } else if (a == null && ivVar.a().c().a(d2)) {
                d = this.b.a(d, d2, jj.f(), gxVar.e(), bVar, ixVar);
            }
            if (d.a().b() && ivVar.c().a()) {
                jr a2 = hqVar.a(ivVar.d());
                if (a2.d()) {
                    d = this.b.a(d, jl.a(a2, this.b.c()), ixVar);
                }
            }
        }
        boolean z = ivVar.c().a() || hqVar.a(gx.a()) != null;
        return ivVar.a(d, z, this.b.a());
    }

    public a a(iv ivVar, hu huVar, hq hqVar, jr jrVar) {
        iv a;
        ix ixVar = new ix();
        boolean z;
        switch (huVar.e()) {
            case Overwrite:
                hw hwVar = (hw) huVar;
                if (hwVar.d().a()) {
                    a = a(ivVar, hwVar.c(), hwVar.a(), hqVar, jrVar, ixVar);
                    break;
                } else if (a || hwVar.d().b()) {
                    z = hwVar.d().c() || (ivVar.c().b() && !hwVar.c().h());
                    a = a(ivVar, hwVar.c(), hwVar.a(), hqVar, jrVar, z, ixVar);
                    break;
                } else {
                    throw new AssertionError();
                }
                break;
            case Merge:
                ht htVar = (ht) huVar;
                if (htVar.d().a()) {
                    a = a(ivVar, htVar.c(), htVar.a(), hqVar, jrVar, ixVar);
                    break;
                } else if (a || htVar.d().b()) {
                    z = htVar.d().c() || ivVar.c().b();
                    a = a(ivVar, htVar.c(), htVar.a(), hqVar, jrVar, z, ixVar);
                    break;
                } else {
                    throw new AssertionError();
                }
                break;
            case AckUserWrite:
                hr hrVar = (hr) huVar;
                if (!hrVar.b()) {
                    a = a(ivVar, hrVar.c(), hrVar.a(), hqVar, jrVar, ixVar);
                    break;
                }
                a = a(ivVar, hrVar.c(), hqVar, jrVar, ixVar);
                break;
            case ListenComplete:
                a = b(ivVar, huVar.c(), hqVar, jrVar, ixVar);
                break;
            default:
                String valueOf = String.valueOf(huVar.e());
                throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 19).append("Unknown operation: ").append(valueOf).toString());
        }
        List arrayList = new ArrayList(ixVar.a());
        a(ivVar, a, arrayList);
        return new a(a, arrayList);
    }
}
