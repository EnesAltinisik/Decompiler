package org.b.a;

import java.util.Hashtable;
import java.util.Vector;

/* compiled from: SoapObject */
public class h extends a implements e {
    protected String b;
    protected String c;
    protected Vector d;

    public h() {
        this("", "");
    }

    public h(String str, String str2) {
        this.d = new Vector();
        this.b = str;
        this.c = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.c.equals(hVar.c) || !this.b.equals(hVar.b)) {
            return false;
        }
        int size = this.d.size();
        if (size != hVar.d.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!hVar.a(this.d.elementAt(i), i)) {
                return false;
            }
        }
        return a((a) hVar);
    }

    public boolean a(Object obj, int i) {
        if (i >= a_()) {
            return false;
        }
        Object elementAt = this.d.elementAt(i);
        if ((obj instanceof g) && (elementAt instanceof g)) {
            g gVar = (g) obj;
            g gVar2 = (g) elementAt;
            boolean z = gVar.b().equals(gVar2.b()) && gVar.d().equals(gVar2.d());
            return z;
        } else if ((obj instanceof h) && (elementAt instanceof h)) {
            return ((h) obj).equals((h) elementAt);
        } else {
            return false;
        }
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.b;
    }

    public Object a_(int i) {
        Object elementAt = this.d.elementAt(i);
        if (elementAt instanceof g) {
            return ((g) elementAt).d();
        }
        return (h) elementAt;
    }

    public int a_() {
        return this.d.size();
    }

    public void a(int i, Hashtable hashtable, g gVar) {
        a(i, gVar);
    }

    public void a(int i, g gVar) {
        Object elementAt = this.d.elementAt(i);
        if (elementAt instanceof g) {
            g gVar2 = (g) elementAt;
            gVar.h = gVar2.h;
            gVar.i = gVar2.i;
            gVar.j = gVar2.j;
            gVar.l = gVar2.l;
            gVar.n = gVar2.n;
            gVar.k = gVar2.k;
            gVar.m = gVar2.m;
            return;
        }
        gVar.h = null;
        gVar.i = null;
        gVar.j = 0;
        gVar.l = null;
        gVar.n = null;
        gVar.k = elementAt;
        gVar.m = false;
    }

    public h d() {
        int i = 0;
        h hVar = new h(this.b, this.c);
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            Object elementAt = this.d.elementAt(i2);
            if (elementAt instanceof g) {
                hVar.a((g) ((g) this.d.elementAt(i2)).clone());
            } else if (elementAt instanceof h) {
                hVar.a(((h) elementAt).d());
            }
        }
        while (i < a()) {
            b bVar = new b();
            a(i, bVar);
            hVar.a(bVar);
            i++;
        }
        return hVar;
    }

    public void a(int i, Object obj) {
        Object elementAt = this.d.elementAt(i);
        if (elementAt instanceof g) {
            ((g) elementAt).b(obj);
        }
    }

    public h b(String str, Object obj) {
        g gVar = new g();
        gVar.h = str;
        gVar.l = obj == null ? g.a : obj.getClass();
        gVar.k = obj;
        return a(gVar);
    }

    public h a(g gVar) {
        this.d.addElement(gVar);
        return this;
    }

    public h a(h hVar) {
        this.d.addElement(hVar);
        return this;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(new StringBuffer().append("").append(this.c).append("{").toString());
        for (int i = 0; i < a_(); i++) {
            Object elementAt = this.d.elementAt(i);
            if (elementAt instanceof g) {
                stringBuffer.append("").append(((g) elementAt).b()).append("=").append(a_(i)).append("; ");
            } else {
                stringBuffer.append(((h) elementAt).toString());
            }
        }
        stringBuffer.append("}");
        return stringBuffer.toString();
    }
}
