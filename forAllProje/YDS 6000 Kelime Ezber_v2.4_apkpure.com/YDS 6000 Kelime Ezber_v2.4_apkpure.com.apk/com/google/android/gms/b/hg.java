package com.google.android.gms.b;

import com.google.android.gms.b.iu.a;
import com.google.firebase.database.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hg {
    static final /* synthetic */ boolean a = (!hg.class.desiredAssertionStatus());
    private final Map<is, iu> b;
    private final ib c;

    private List<in> a(iu iuVar, hu huVar, hq hqVar, jr jrVar) {
        a a = iuVar.a(huVar, hqVar, jrVar);
        if (!iuVar.a().d()) {
            Set hashSet = new HashSet();
            Set hashSet2 = new HashSet();
            for (im imVar : a.b) {
                ip.a b = imVar.b();
                if (b == ip.a.CHILD_ADDED) {
                    hashSet2.add(imVar.a());
                } else if (b == ip.a.CHILD_REMOVED) {
                    hashSet.add(imVar.a());
                }
            }
            if (!(hashSet2.isEmpty() && hashSet.isEmpty())) {
                this.c.a(iuVar.a(), hashSet2, hashSet);
            }
        }
        return a.a;
    }

    public iu a(it itVar) {
        return itVar.d() ? d() : (iu) this.b.get(itVar.b());
    }

    public jr a(gx gxVar) {
        for (iu iuVar : this.b.values()) {
            if (iuVar.a(gxVar) != null) {
                return iuVar.a(gxVar);
            }
        }
        return null;
    }

    public kr<List<it>, List<ip>> a(it itVar, gs gsVar, b bVar) {
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        boolean c = c();
        iu iuVar;
        if (itVar.c()) {
            Iterator it = this.b.entrySet().iterator();
            while (it.hasNext()) {
                iuVar = (iu) ((Entry) it.next()).getValue();
                arrayList2.addAll(iuVar.a(gsVar, bVar));
                if (iuVar.c()) {
                    it.remove();
                    if (!iuVar.a().d()) {
                        arrayList.add(iuVar.a());
                    }
                }
            }
        } else {
            iuVar = (iu) this.b.get(itVar.b());
            if (iuVar != null) {
                arrayList2.addAll(iuVar.a(gsVar, bVar));
                if (iuVar.c()) {
                    this.b.remove(itVar.b());
                    if (!iuVar.a().d()) {
                        arrayList.add(iuVar.a());
                    }
                }
            }
        }
        if (c && !c()) {
            arrayList.add(it.a(itVar.a()));
        }
        return new kr(arrayList, arrayList2);
    }

    public List<in> a(hu huVar, hq hqVar, jr jrVar) {
        is d = huVar.d().d();
        if (d != null) {
            iu iuVar = (iu) this.b.get(d);
            if (a || iuVar != null) {
                return a(iuVar, huVar, hqVar, jrVar);
            }
            throw new AssertionError();
        }
        List<in> arrayList = new ArrayList();
        for (Entry value : this.b.entrySet()) {
            arrayList.addAll(a((iu) value.getValue(), huVar, hqVar, jrVar));
        }
        return arrayList;
    }

    public boolean a() {
        return this.b.isEmpty();
    }

    public List<iu> b() {
        List<iu> arrayList = new ArrayList();
        for (Entry value : this.b.entrySet()) {
            iu iuVar = (iu) value.getValue();
            if (!iuVar.a().d()) {
                arrayList.add(iuVar);
            }
        }
        return arrayList;
    }

    public boolean b(it itVar) {
        return a(itVar) != null;
    }

    public boolean c() {
        return d() != null;
    }

    public iu d() {
        for (Entry value : this.b.entrySet()) {
            iu iuVar = (iu) value.getValue();
            if (iuVar.a().d()) {
                return iuVar;
            }
        }
        return null;
    }
}
