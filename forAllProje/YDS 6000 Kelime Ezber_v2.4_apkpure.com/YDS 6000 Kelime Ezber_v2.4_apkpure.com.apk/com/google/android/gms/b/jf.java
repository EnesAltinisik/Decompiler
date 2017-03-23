package com.google.android.gms.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class jf implements jr {
    public static Comparator<je> a = new Comparator<je>() {
        public int a(je jeVar, je jeVar2) {
            return jeVar.a(jeVar2);
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((je) obj, (je) obj2);
        }
    };
    static final /* synthetic */ boolean b = (!jf.class.desiredAssertionStatus());
    private final fo<je, jr> c;
    private final jr e;
    private String f;

    public static abstract class a extends com.google.android.gms.b.ft.b<je, jr> {
        public abstract void a(je jeVar, jr jrVar);

        public /* synthetic */ void a(Object obj, Object obj2) {
            b((je) obj, (jr) obj2);
        }

        public void b(je jeVar, jr jrVar) {
            a(jeVar, jrVar);
        }
    }

    private static class b implements Iterator<jq> {
        private final Iterator<Entry<je, jr>> a;

        public b(Iterator<Entry<je, jr>> it) {
            this.a = it;
        }

        public jq a() {
            Entry entry = (Entry) this.a.next();
            return new jq((je) entry.getKey(), (jr) entry.getValue());
        }

        public boolean hasNext() {
            return this.a.hasNext();
        }

        public /* synthetic */ Object next() {
            return a();
        }

        public void remove() {
            this.a.remove();
        }
    }

    protected jf() {
        this.f = null;
        this.c = com.google.android.gms.b.fo.a.a(a);
        this.e = jv.a();
    }

    protected jf(fo<je, jr> foVar, jr jrVar) {
        this.f = null;
        if (!foVar.b() || jrVar.b()) {
            this.e = jrVar;
            this.c = foVar;
            return;
        }
        throw new IllegalArgumentException("Can't create empty ChildrenNode with priority!");
    }

    private static void a(StringBuilder stringBuilder, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            stringBuilder.append(" ");
        }
    }

    private void b(StringBuilder stringBuilder, int i) {
        if (this.c.b() && this.e.b()) {
            stringBuilder.append("{ }");
            return;
        }
        stringBuilder.append("{\n");
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            a(stringBuilder, i + 2);
            stringBuilder.append(((je) entry.getKey()).d());
            stringBuilder.append("=");
            if (entry.getValue() instanceof jf) {
                ((jf) entry.getValue()).b(stringBuilder, i + 2);
            } else {
                stringBuilder.append(((jr) entry.getValue()).toString());
            }
            stringBuilder.append("\n");
        }
        if (!this.e.b()) {
            a(stringBuilder, i + 2);
            stringBuilder.append(".priority=");
            stringBuilder.append(this.e.toString());
            stringBuilder.append("\n");
        }
        a(stringBuilder, i);
        stringBuilder.append("}");
    }

    public int a(jr jrVar) {
        return b() ? jrVar.b() ? 0 : -1 : jrVar.d() ? 1 : jrVar.b() ? 1 : jrVar == jr.d ? -1 : 0;
    }

    public jr a(gx gxVar) {
        je d = gxVar.d();
        return d == null ? this : c(d).a(gxVar.e());
    }

    public jr a(gx gxVar, jr jrVar) {
        je d = gxVar.d();
        if (d == null) {
            return jrVar;
        }
        if (!d.e()) {
            return a(d, c(d).a(gxVar.e(), jrVar));
        }
        if (b || jv.a(jrVar)) {
            return b(jrVar);
        }
        throw new AssertionError();
    }

    public jr a(je jeVar, jr jrVar) {
        if (jeVar.e()) {
            return b(jrVar);
        }
        fo foVar = this.c;
        if (foVar.a((Object) jeVar)) {
            foVar = foVar.c(jeVar);
        }
        if (!jrVar.b()) {
            foVar = foVar.a(jeVar, jrVar);
        }
        return foVar.b() ? jj.f() : new jf(foVar, this.e);
    }

    public Object a() {
        return a(false);
    }

    public Object a(boolean z) {
        int i = 0;
        if (b()) {
            return null;
        }
        Map hashMap = new HashMap();
        Iterator it = this.c.iterator();
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            int i5;
            int i6;
            Entry entry = (Entry) it.next();
            String d = ((je) entry.getKey()).d();
            hashMap.put(d, ((jr) entry.getValue()).a(z));
            i4++;
            if (i2 != 0) {
                if (d.length() <= 1 || d.charAt(0) != '0') {
                    Integer d2 = kt.d(d);
                    if (d2 == null || d2.intValue() < 0) {
                        i5 = 0;
                        i6 = i3;
                        i2 = i5;
                        i3 = i6;
                    } else if (d2.intValue() > i3) {
                        i3 = d2.intValue();
                        i5 = i2;
                        i6 = i3;
                        i2 = i5;
                        i3 = i6;
                    }
                } else {
                    i5 = 0;
                    i6 = i3;
                    i2 = i5;
                    i3 = i6;
                }
            }
            i5 = i2;
            i6 = i3;
            i2 = i5;
            i3 = i6;
        }
        if (z || i2 == 0 || i3 >= i4 * 2) {
            if (z && !this.e.b()) {
                hashMap.put(".priority", this.e.a());
            }
            return hashMap;
        }
        List arrayList = new ArrayList(i3 + 1);
        while (i <= i3) {
            arrayList.add(hashMap.get(i));
            i++;
        }
        return arrayList;
    }

    public String a(com.google.android.gms.b.jr.a aVar) {
        if (aVar != com.google.android.gms.b.jr.a.V1) {
            throw new IllegalArgumentException("Hashes on children nodes only supported for V1");
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (!this.e.b()) {
            stringBuilder.append("priority:");
            stringBuilder.append(this.e.a(com.google.android.gms.b.jr.a.V1));
            stringBuilder.append(":");
        }
        List<jq> arrayList = new ArrayList();
        Iterator it = iterator();
        Object obj = null;
        while (it.hasNext()) {
            jq jqVar = (jq) it.next();
            arrayList.add(jqVar);
            Object obj2 = (obj == null && jqVar.b().e().b()) ? null : 1;
            obj = obj2;
        }
        if (obj != null) {
            Collections.sort(arrayList, ju.b());
        }
        for (jq jqVar2 : arrayList) {
            String c = jqVar2.b().c();
            if (!c.equals("")) {
                stringBuilder.append(":");
                stringBuilder.append(jqVar2.a().d());
                stringBuilder.append(":");
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    public void a(a aVar) {
        a(aVar, false);
    }

    public void a(final a aVar, boolean z) {
        if (!z || e().b()) {
            this.c.a((com.google.android.gms.b.ft.b) aVar);
        } else {
            this.c.a(new com.google.android.gms.b.ft.b<je, jr>(this) {
                boolean a = false;
                final /* synthetic */ jf c;

                public void a(je jeVar, jr jrVar) {
                    if (!this.a && jeVar.a(je.c()) > 0) {
                        this.a = true;
                        aVar.a(je.c(), this.c.e());
                    }
                    aVar.a(jeVar, jrVar);
                }

                public /* synthetic */ void a(Object obj, Object obj2) {
                    a((je) obj, (jr) obj2);
                }
            });
        }
    }

    public boolean a(je jeVar) {
        return !c(jeVar).b();
    }

    public je b(je jeVar) {
        return (je) this.c.d(jeVar);
    }

    public jr b(jr jrVar) {
        return this.c.b() ? jj.f() : new jf(this.c, jrVar);
    }

    public boolean b() {
        return this.c.b();
    }

    public jr c(je jeVar) {
        return (!jeVar.e() || this.e.b()) ? this.c.a((Object) jeVar) ? (jr) this.c.b(jeVar) : jj.f() : this.e;
    }

    public String c() {
        if (this.f == null) {
            String a = a(com.google.android.gms.b.jr.a.V1);
            this.f = a.isEmpty() ? "" : kt.b(a);
        }
        return this.f;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return a((jr) obj);
    }

    public boolean d() {
        return false;
    }

    public jr e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jf)) {
            return false;
        }
        jf jfVar = (jf) obj;
        if (!e().equals(jfVar.e())) {
            return false;
        }
        if (this.c.a() != jfVar.c.a()) {
            return false;
        }
        Iterator it = this.c.iterator();
        Iterator it2 = jfVar.c.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Entry entry = (Entry) it.next();
            Entry entry2 = (Entry) it2.next();
            if (((je) entry.getKey()).equals(entry2.getKey())) {
                if (!((jr) entry.getValue()).equals(entry2.getValue())) {
                }
            }
            return false;
        }
        if (!it.hasNext() && !it2.hasNext()) {
            return true;
        }
        throw new IllegalStateException("Something went wrong internally.");
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            jq jqVar = (jq) it.next();
            i = jqVar.b().hashCode() + (((i * 31) + jqVar.a().hashCode()) * 17);
        }
        return i;
    }

    public Iterator<jq> iterator() {
        return new b(this.c.iterator());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        b(stringBuilder, 0);
        return stringBuilder.toString();
    }
}
