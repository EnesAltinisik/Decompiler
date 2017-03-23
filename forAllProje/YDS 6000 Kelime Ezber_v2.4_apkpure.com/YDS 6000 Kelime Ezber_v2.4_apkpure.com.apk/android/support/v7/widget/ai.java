package android.support.v7.widget;

import android.support.v4.view.ah;
import android.support.v4.view.ay;
import android.support.v4.view.bc;
import android.support.v7.widget.RecyclerView.w;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ai extends be {
    ArrayList<ArrayList<w>> a = new ArrayList();
    ArrayList<ArrayList<b>> b = new ArrayList();
    ArrayList<ArrayList<a>> c = new ArrayList();
    ArrayList<w> d = new ArrayList();
    ArrayList<w> e = new ArrayList();
    ArrayList<w> f = new ArrayList();
    ArrayList<w> g = new ArrayList();
    private ArrayList<w> i = new ArrayList();
    private ArrayList<w> j = new ArrayList();
    private ArrayList<b> k = new ArrayList();
    private ArrayList<a> l = new ArrayList();

    private static class c implements bc {
        c() {
        }

        public void a(View view) {
        }

        public void b(View view) {
        }

        public void c(View view) {
        }
    }

    private static class a {
        public w a;
        public w b;
        public int c;
        public int d;
        public int e;
        public int f;

        private a(w wVar, w wVar2) {
            this.a = wVar;
            this.b = wVar2;
        }

        a(w wVar, w wVar2, int i, int i2, int i3, int i4) {
            this(wVar, wVar2);
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
        }
    }

    private static class b {
        public w a;
        public int b;
        public int c;
        public int d;
        public int e;

        b(w wVar, int i, int i2, int i3, int i4) {
            this.a = wVar;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    private void a(List<a> list, w wVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            a aVar = (a) list.get(size);
            if (a(aVar, wVar) && aVar.a == null && aVar.b == null) {
                list.remove(aVar);
            }
        }
    }

    private boolean a(a aVar, w wVar) {
        boolean z = false;
        if (aVar.b == wVar) {
            aVar.b = null;
        } else if (aVar.a != wVar) {
            return false;
        } else {
            aVar.a = null;
            z = true;
        }
        ah.c(wVar.a, 1.0f);
        ah.a(wVar.a, 0.0f);
        ah.b(wVar.a, 0.0f);
        a(wVar, z);
        return true;
    }

    private void b(a aVar) {
        if (aVar.a != null) {
            a(aVar, aVar.a);
        }
        if (aVar.b != null) {
            a(aVar, aVar.b);
        }
    }

    private void u(final w wVar) {
        final ay s = ah.s(wVar.a);
        this.f.add(wVar);
        s.a(g()).a(0.0f).a(new c(this) {
            final /* synthetic */ ai c;

            public void a(View view) {
                this.c.l(wVar);
            }

            public void b(View view) {
                s.a(null);
                ah.c(view, 1.0f);
                this.c.i(wVar);
                this.c.f.remove(wVar);
                this.c.c();
            }
        }).c();
    }

    private void v(w wVar) {
        android.support.v4.a.a.a(wVar.a);
        d(wVar);
    }

    public void a() {
        int i = !this.i.isEmpty() ? 1 : 0;
        int i2 = !this.k.isEmpty() ? 1 : 0;
        int i3 = !this.l.isEmpty() ? 1 : 0;
        int i4 = !this.j.isEmpty() ? 1 : 0;
        if (i != 0 || i2 != 0 || i4 != 0 || i3 != 0) {
            final ArrayList arrayList;
            Runnable anonymousClass1;
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                u((w) it.next());
            }
            this.i.clear();
            if (i2 != 0) {
                arrayList = new ArrayList();
                arrayList.addAll(this.k);
                this.b.add(arrayList);
                this.k.clear();
                anonymousClass1 = new Runnable(this) {
                    final /* synthetic */ ai b;

                    public void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            b bVar = (b) it.next();
                            this.b.b(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e);
                        }
                        arrayList.clear();
                        this.b.b.remove(arrayList);
                    }
                };
                if (i != 0) {
                    ah.a(((b) arrayList.get(0)).a.a, anonymousClass1, g());
                } else {
                    anonymousClass1.run();
                }
            }
            if (i3 != 0) {
                arrayList = new ArrayList();
                arrayList.addAll(this.l);
                this.c.add(arrayList);
                this.l.clear();
                anonymousClass1 = new Runnable(this) {
                    final /* synthetic */ ai b;

                    public void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            this.b.a((a) it.next());
                        }
                        arrayList.clear();
                        this.b.c.remove(arrayList);
                    }
                };
                if (i != 0) {
                    ah.a(((a) arrayList.get(0)).a.a, anonymousClass1, g());
                } else {
                    anonymousClass1.run();
                }
            }
            if (i4 != 0) {
                final ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.j);
                this.a.add(arrayList2);
                this.j.clear();
                Runnable anonymousClass3 = new Runnable(this) {
                    final /* synthetic */ ai b;

                    public void run() {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            this.b.c((w) it.next());
                        }
                        arrayList2.clear();
                        this.b.a.remove(arrayList2);
                    }
                };
                if (i == 0 && i2 == 0 && i3 == 0) {
                    anonymousClass3.run();
                } else {
                    ah.a(((w) arrayList2.get(0)).a, anonymousClass3, (i != 0 ? g() : 0) + Math.max(i2 != 0 ? e() : 0, i3 != 0 ? h() : 0));
                }
            }
        }
    }

    void a(final a aVar) {
        View view = null;
        w wVar = aVar.a;
        View view2 = wVar == null ? null : wVar.a;
        w wVar2 = aVar.b;
        if (wVar2 != null) {
            view = wVar2.a;
        }
        if (view2 != null) {
            final ay a = ah.s(view2).a(h());
            this.g.add(aVar.a);
            a.b((float) (aVar.e - aVar.c));
            a.c((float) (aVar.f - aVar.d));
            a.a(0.0f).a(new c(this) {
                final /* synthetic */ ai c;

                public void a(View view) {
                    this.c.b(aVar.a, true);
                }

                public void b(View view) {
                    a.a(null);
                    ah.c(view, 1.0f);
                    ah.a(view, 0.0f);
                    ah.b(view, 0.0f);
                    this.c.a(aVar.a, true);
                    this.c.g.remove(aVar.a);
                    this.c.c();
                }
            }).c();
        }
        if (view != null) {
            a = ah.s(view);
            this.g.add(aVar.b);
            a.b(0.0f).c(0.0f).a(h()).a(1.0f).a(new c(this) {
                final /* synthetic */ ai d;

                public void a(View view) {
                    this.d.b(aVar.b, false);
                }

                public void b(View view) {
                    a.a(null);
                    ah.c(view, 1.0f);
                    ah.a(view, 0.0f);
                    ah.b(view, 0.0f);
                    this.d.a(aVar.b, false);
                    this.d.g.remove(aVar.b);
                    this.d.c();
                }
            }).c();
        }
    }

    void a(List<w> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ah.s(((w) list.get(size)).a).b();
        }
    }

    public boolean a(w wVar) {
        v(wVar);
        this.i.add(wVar);
        return true;
    }

    public boolean a(w wVar, int i, int i2, int i3, int i4) {
        View view = wVar.a;
        int n = (int) (((float) i) + ah.n(wVar.a));
        int o = (int) (((float) i2) + ah.o(wVar.a));
        v(wVar);
        int i5 = i3 - n;
        int i6 = i4 - o;
        if (i5 == 0 && i6 == 0) {
            j(wVar);
            return false;
        }
        if (i5 != 0) {
            ah.a(view, (float) (-i5));
        }
        if (i6 != 0) {
            ah.b(view, (float) (-i6));
        }
        this.k.add(new b(wVar, n, o, i3, i4));
        return true;
    }

    public boolean a(w wVar, w wVar2, int i, int i2, int i3, int i4) {
        if (wVar == wVar2) {
            return a(wVar, i, i2, i3, i4);
        }
        float n = ah.n(wVar.a);
        float o = ah.o(wVar.a);
        float f = ah.f(wVar.a);
        v(wVar);
        int i5 = (int) (((float) (i3 - i)) - n);
        int i6 = (int) (((float) (i4 - i2)) - o);
        ah.a(wVar.a, n);
        ah.b(wVar.a, o);
        ah.c(wVar.a, f);
        if (wVar2 != null) {
            v(wVar2);
            ah.a(wVar2.a, (float) (-i5));
            ah.b(wVar2.a, (float) (-i6));
            ah.c(wVar2.a, 0.0f);
        }
        this.l.add(new a(wVar, wVar2, i, i2, i3, i4));
        return true;
    }

    public boolean a(w wVar, List<Object> list) {
        return !list.isEmpty() || super.a(wVar, (List) list);
    }

    void b(w wVar, int i, int i2, int i3, int i4) {
        View view = wVar.a;
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        if (i5 != 0) {
            ah.s(view).b(0.0f);
        }
        if (i6 != 0) {
            ah.s(view).c(0.0f);
        }
        final ay s = ah.s(view);
        this.e.add(wVar);
        final w wVar2 = wVar;
        s.a(e()).a(new c(this) {
            final /* synthetic */ ai e;

            public void a(View view) {
                this.e.m(wVar2);
            }

            public void b(View view) {
                s.a(null);
                this.e.j(wVar2);
                this.e.e.remove(wVar2);
                this.e.c();
            }

            public void c(View view) {
                if (i5 != 0) {
                    ah.a(view, 0.0f);
                }
                if (i6 != 0) {
                    ah.b(view, 0.0f);
                }
            }
        }).c();
    }

    public boolean b() {
        return (this.j.isEmpty() && this.l.isEmpty() && this.k.isEmpty() && this.i.isEmpty() && this.e.isEmpty() && this.f.isEmpty() && this.d.isEmpty() && this.g.isEmpty() && this.b.isEmpty() && this.a.isEmpty() && this.c.isEmpty()) ? false : true;
    }

    public boolean b(w wVar) {
        v(wVar);
        ah.c(wVar.a, 0.0f);
        this.j.add(wVar);
        return true;
    }

    void c() {
        if (!b()) {
            i();
        }
    }

    void c(final w wVar) {
        final ay s = ah.s(wVar.a);
        this.d.add(wVar);
        s.a(1.0f).a(f()).a(new c(this) {
            final /* synthetic */ ai c;

            public void a(View view) {
                this.c.n(wVar);
            }

            public void b(View view) {
                s.a(null);
                this.c.k(wVar);
                this.c.d.remove(wVar);
                this.c.c();
            }

            public void c(View view) {
                ah.c(view, 1.0f);
            }
        }).c();
    }

    public void d() {
        int size;
        for (size = this.k.size() - 1; size >= 0; size--) {
            b bVar = (b) this.k.get(size);
            View view = bVar.a.a;
            ah.b(view, 0.0f);
            ah.a(view, 0.0f);
            j(bVar.a);
            this.k.remove(size);
        }
        for (size = this.i.size() - 1; size >= 0; size--) {
            i((w) this.i.get(size));
            this.i.remove(size);
        }
        for (size = this.j.size() - 1; size >= 0; size--) {
            w wVar = (w) this.j.get(size);
            ah.c(wVar.a, 1.0f);
            k(wVar);
            this.j.remove(size);
        }
        for (size = this.l.size() - 1; size >= 0; size--) {
            b((a) this.l.get(size));
        }
        this.l.clear();
        if (b()) {
            int size2;
            ArrayList arrayList;
            int size3;
            for (size2 = this.b.size() - 1; size2 >= 0; size2--) {
                arrayList = (ArrayList) this.b.get(size2);
                for (size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    b bVar2 = (b) arrayList.get(size3);
                    View view2 = bVar2.a.a;
                    ah.b(view2, 0.0f);
                    ah.a(view2, 0.0f);
                    j(bVar2.a);
                    arrayList.remove(size3);
                    if (arrayList.isEmpty()) {
                        this.b.remove(arrayList);
                    }
                }
            }
            for (size2 = this.a.size() - 1; size2 >= 0; size2--) {
                arrayList = (ArrayList) this.a.get(size2);
                for (size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    w wVar2 = (w) arrayList.get(size3);
                    ah.c(wVar2.a, 1.0f);
                    k(wVar2);
                    arrayList.remove(size3);
                    if (arrayList.isEmpty()) {
                        this.a.remove(arrayList);
                    }
                }
            }
            for (size2 = this.c.size() - 1; size2 >= 0; size2--) {
                arrayList = (ArrayList) this.c.get(size2);
                for (size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    b((a) arrayList.get(size3));
                    if (arrayList.isEmpty()) {
                        this.c.remove(arrayList);
                    }
                }
            }
            a(this.f);
            a(this.e);
            a(this.d);
            a(this.g);
            i();
        }
    }

    public void d(w wVar) {
        int size;
        View view = wVar.a;
        ah.s(view).b();
        for (size = this.k.size() - 1; size >= 0; size--) {
            if (((b) this.k.get(size)).a == wVar) {
                ah.b(view, 0.0f);
                ah.a(view, 0.0f);
                j(wVar);
                this.k.remove(size);
            }
        }
        a(this.l, wVar);
        if (this.i.remove(wVar)) {
            ah.c(view, 1.0f);
            i(wVar);
        }
        if (this.j.remove(wVar)) {
            ah.c(view, 1.0f);
            k(wVar);
        }
        for (size = this.c.size() - 1; size >= 0; size--) {
            List list = (ArrayList) this.c.get(size);
            a(list, wVar);
            if (list.isEmpty()) {
                this.c.remove(size);
            }
        }
        for (int size2 = this.b.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.b.get(size2);
            int size3 = arrayList.size() - 1;
            while (size3 >= 0) {
                if (((b) arrayList.get(size3)).a == wVar) {
                    ah.b(view, 0.0f);
                    ah.a(view, 0.0f);
                    j(wVar);
                    arrayList.remove(size3);
                    if (arrayList.isEmpty()) {
                        this.b.remove(size2);
                    }
                } else {
                    size3--;
                }
            }
        }
        for (size = this.a.size() - 1; size >= 0; size--) {
            arrayList = (ArrayList) this.a.get(size);
            if (arrayList.remove(wVar)) {
                ah.c(view, 1.0f);
                k(wVar);
                if (arrayList.isEmpty()) {
                    this.a.remove(size);
                }
            }
        }
        if (this.f.remove(wVar)) {
        }
        if (this.d.remove(wVar)) {
        }
        if (this.g.remove(wVar)) {
        }
        if (this.e.remove(wVar)) {
            c();
        } else {
            c();
        }
    }
}
