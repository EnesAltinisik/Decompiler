package com.google.android.gms.b;

import com.google.firebase.database.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class iu {
    static final /* synthetic */ boolean a = (!iu.class.desiredAssertionStatus());
    private final it b;
    private final iw c;
    private iv d;
    private final List<gs> e;
    private final iq f;

    public static class a {
        public final List<in> a;
        public final List<im> b;

        public a(List<in> list, List<im> list2) {
            this.a = list;
            this.b = list2;
        }
    }

    private List<in> a(List<im> list, jl jlVar, gs gsVar) {
        List list2;
        if (gsVar == null) {
            list2 = this.e;
        } else {
            list2 = Arrays.asList(new gs[]{gsVar});
        }
        return this.f.a((List) list, jlVar, list2);
    }

    public it a() {
        return this.b;
    }

    public a a(hu huVar, hq hqVar, jr jrVar) {
        if (huVar.e() == com.google.android.gms.b.hu.a.Merge && huVar.d().d() != null) {
            if (!a && this.d.d() == null) {
                throw new AssertionError("We should always have a full cache before handling merges");
            } else if (!a && this.d.b() == null) {
                throw new AssertionError("Missing event cache, even though we have a server cache");
            }
        }
        iv ivVar = this.d;
        com.google.android.gms.b.iw.a a = this.c.a(ivVar, huVar, hqVar, jrVar);
        if (a || a.a.c().a() || !ivVar.c().a()) {
            this.d = a.a;
            return new a(a(a.b, a.a.a().d(), null), a.b);
        }
        throw new AssertionError("Once a server snap is complete, it should never go back");
    }

    public jr a(gx gxVar) {
        jr d = this.d.d();
        return (d == null || (!this.b.d() && (gxVar.h() || d.c(gxVar.d()).b()))) ? null : d.a(gxVar);
    }

    public List<ip> a(gs gsVar, b bVar) {
        List<ip> list;
        if (bVar != null) {
            List<ip> arrayList = new ArrayList();
            if (a || gsVar == null) {
                gx a = this.b.a();
                for (gs ilVar : this.e) {
                    gs ilVar2;
                    arrayList.add(new il(ilVar2, bVar, a));
                }
                list = arrayList;
            } else {
                throw new AssertionError("A cancel should cancel all event registrations");
            }
        }
        list = Collections.emptyList();
        if (gsVar != null) {
            int i = 0;
            int i2 = -1;
            while (i < this.e.size()) {
                ilVar2 = (gs) this.e.get(i);
                if (ilVar2.a(gsVar)) {
                    if (ilVar2.c()) {
                        break;
                    }
                    i2 = i;
                }
                i++;
            }
            i = i2;
            if (i != -1) {
                ilVar2 = (gs) this.e.get(i);
                this.e.remove(i);
                ilVar2.b();
            }
        } else {
            for (gs ilVar22 : this.e) {
                ilVar22.b();
            }
            this.e.clear();
        }
        return list;
    }

    public jr b() {
        return this.d.c().c();
    }

    public boolean c() {
        return this.e.isEmpty();
    }
}
