package com.google.android.gms.b;

import com.google.android.gms.b.ip.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class iq {
    private final it a;
    private final jk b;

    private in a(im imVar, gs gsVar, jl jlVar) {
        if (!(imVar.b().equals(a.VALUE) || imVar.b().equals(a.CHILD_REMOVED))) {
            imVar = imVar.a(jlVar.a(imVar.a(), imVar.c().a(), this.b));
        }
        return gsVar.a(imVar, this.a);
    }

    private Comparator<im> a() {
        return new Comparator<im>(this) {
            static final /* synthetic */ boolean a = (!iq.class.desiredAssertionStatus());
            final /* synthetic */ iq b;

            {
                this.b = r1;
            }

            public int a(im imVar, im imVar2) {
                if (a || !(imVar.a() == null || imVar2.a() == null)) {
                    return this.b.b.compare(new jq(imVar.a(), imVar.c().a()), new jq(imVar2.a(), imVar2.c().a()));
                }
                throw new AssertionError();
            }

            public /* synthetic */ int compare(Object obj, Object obj2) {
                return a((im) obj, (im) obj2);
            }
        };
    }

    private void a(List<in> list, a aVar, List<im> list2, List<gs> list3, jl jlVar) {
        List<im> arrayList = new ArrayList();
        for (im imVar : list2) {
            if (imVar.b().equals(aVar)) {
                arrayList.add(imVar);
            }
        }
        Collections.sort(arrayList, a());
        for (im imVar2 : arrayList) {
            for (gs gsVar : list3) {
                if (gsVar.a(aVar)) {
                    list.add(a(imVar2, gsVar, jlVar));
                }
            }
        }
    }

    public List<in> a(List<im> list, jl jlVar, List<gs> list2) {
        List<in> arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        for (im imVar : list) {
            if (imVar.b().equals(a.CHILD_CHANGED) && this.b.a(imVar.d().a(), imVar.c().a())) {
                arrayList2.add(im.a(imVar.a(), imVar.c()));
            }
        }
        a(arrayList, a.CHILD_REMOVED, list, list2, jlVar);
        a(arrayList, a.CHILD_ADDED, list, list2, jlVar);
        a(arrayList, a.CHILD_MOVED, arrayList2, list2, jlVar);
        a(arrayList, a.CHILD_CHANGED, list, list2, jlVar);
        a(arrayList, a.VALUE, list, list2, jlVar);
        return arrayList;
    }
}
