package org.b.a;

import java.util.Vector;

/* compiled from: AttributeContainer */
public class a {
    protected Vector a = new Vector();

    public void a(int i, b bVar) {
        b bVar2 = (b) this.a.elementAt(i);
        bVar.h = bVar2.h;
        bVar.i = bVar2.i;
        bVar.j = bVar2.j;
        bVar.l = bVar2.l;
        bVar.n = bVar2.n;
        bVar.k = bVar2.d();
    }

    public Object a(int i) {
        return ((b) this.a.elementAt(i)).d();
    }

    public boolean a(String str) {
        if (c(str) != null) {
            return true;
        }
        return false;
    }

    public Object b(String str) {
        Integer c = c(str);
        if (c != null) {
            return a(c.intValue());
        }
        return null;
    }

    private Integer c(String str) {
        for (int i = 0; i < this.a.size(); i++) {
            if (str.equals(((b) this.a.elementAt(i)).b())) {
                return new Integer(i);
            }
        }
        return null;
    }

    public int a() {
        return this.a.size();
    }

    protected boolean a(a aVar) {
        int a = a();
        if (a != aVar.a()) {
            return false;
        }
        for (int i = 0; i < a; i++) {
            b bVar = (b) this.a.elementAt(i);
            Object d = bVar.d();
            if (!aVar.a(bVar.b())) {
                return false;
            }
            if (!d.equals(aVar.b(bVar.b()))) {
                return false;
            }
        }
        return true;
    }

    public void a(String str, Object obj) {
        b bVar = new b();
        bVar.h = str;
        bVar.l = obj == null ? g.a : obj.getClass();
        bVar.k = obj;
        a(bVar);
    }

    public void a(b bVar) {
        this.a.addElement(bVar);
    }
}
