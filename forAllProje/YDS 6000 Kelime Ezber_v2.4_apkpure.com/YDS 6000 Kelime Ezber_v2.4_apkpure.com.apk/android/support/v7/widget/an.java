package android.support.v7.widget;

import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.o;
import android.support.v7.widget.RecyclerView.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

final class an implements Runnable {
    static final ThreadLocal<an> a = new ThreadLocal();
    static Comparator<b> e = new Comparator<b>() {
        public int a(b bVar, b bVar2) {
            int i = -1;
            if ((bVar.d == null ? 1 : 0) != (bVar2.d == null ? 1 : 0)) {
                return bVar.d == null ? 1 : -1;
            } else {
                if (bVar.a != bVar2.a) {
                    if (!bVar.a) {
                        i = 1;
                    }
                    return i;
                }
                int i2 = bVar2.b - bVar.b;
                if (i2 != 0) {
                    return i2;
                }
                i2 = bVar.c - bVar2.c;
                return i2 == 0 ? 0 : i2;
            }
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((b) obj, (b) obj2);
        }
    };
    ArrayList<RecyclerView> b = new ArrayList();
    long c;
    long d;
    private ArrayList<b> f = new ArrayList();

    static class a implements android.support.v7.widget.RecyclerView.h.a {
        int a;
        int b;
        int[] c;
        int d;

        a() {
        }

        void a() {
            if (this.c != null) {
                Arrays.fill(this.c, -1);
            }
        }

        void a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        void a(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            if (this.c != null) {
                Arrays.fill(this.c, -1);
            }
            h hVar = recyclerView.m;
            if (recyclerView.l != null && hVar != null && hVar.o()) {
                if (z) {
                    if (!recyclerView.e.d()) {
                        hVar.a(recyclerView.l.a(), (android.support.v7.widget.RecyclerView.h.a) this);
                    }
                } else if (!recyclerView.v()) {
                    hVar.a(this.a, this.b, recyclerView.A, (android.support.v7.widget.RecyclerView.h.a) this);
                }
                if (this.d > hVar.v) {
                    hVar.v = this.d;
                    hVar.w = z;
                    recyclerView.d.b();
                }
            }
        }

        boolean a(int i) {
            if (this.c == null) {
                return false;
            }
            int i2 = this.d * 2;
            for (int i3 = 0; i3 < i2; i3 += 2) {
                if (this.c[i3] == i) {
                    return true;
                }
            }
            return false;
        }

        public void b(int i, int i2) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.d * 2;
            if (this.c == null) {
                this.c = new int[4];
                Arrays.fill(this.c, -1);
            } else if (i3 >= this.c.length) {
                Object obj = this.c;
                this.c = new int[(i3 * 2)];
                System.arraycopy(obj, 0, this.c, 0, obj.length);
            }
            this.c[i3] = i;
            this.c[i3 + 1] = i2;
            this.d++;
        }
    }

    static class b {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;

        b() {
        }

        public void a() {
            this.a = false;
            this.b = 0;
            this.c = 0;
            this.d = null;
            this.e = 0;
        }
    }

    an() {
    }

    private w a(RecyclerView recyclerView, int i, long j) {
        if (a(recyclerView, i)) {
            return null;
        }
        o oVar = recyclerView.d;
        w a = oVar.a(i, false, j);
        if (a == null) {
            return a;
        }
        if (a.p()) {
            oVar.a(a.a);
            return a;
        }
        oVar.a(a, false);
        return a;
    }

    private void a() {
        int size = this.b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = (RecyclerView) this.b.get(i2);
            recyclerView.z.a(recyclerView, false);
            i += recyclerView.z.d;
        }
        this.f.ensureCapacity(i);
        int i3 = 0;
        boolean z = false;
        while (i3 < size) {
            recyclerView = (RecyclerView) this.b.get(i3);
            a aVar = recyclerView.z;
            int abs = Math.abs(aVar.a) + Math.abs(aVar.b);
            boolean z2 = z;
            for (i = 0; i < aVar.d * 2; i += 2) {
                b bVar;
                if (z2 >= this.f.size()) {
                    bVar = new b();
                    this.f.add(bVar);
                } else {
                    bVar = (b) this.f.get(z2);
                }
                int i4 = aVar.c[i + 1];
                bVar.a = i4 <= abs;
                bVar.b = abs;
                bVar.c = i4;
                bVar.d = recyclerView;
                bVar.e = aVar.c[i];
                z2++;
            }
            i3++;
            z = z2;
        }
        Collections.sort(this.f, e);
    }

    private void a(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.v && recyclerView.f.c() != 0) {
                recyclerView.b();
            }
            a aVar = recyclerView.z;
            aVar.a(recyclerView, true);
            if (aVar.d != 0) {
                try {
                    android.support.v4.g.h.a("RV Nested Prefetch");
                    recyclerView.A.a(recyclerView.l);
                    for (int i = 0; i < aVar.d * 2; i += 2) {
                        a(recyclerView, aVar.c[i], j);
                    }
                } finally {
                    android.support.v4.g.h.a();
                }
            }
        }
    }

    private void a(b bVar, long j) {
        w a = a(bVar.d, bVar.e, bVar.a ? Long.MAX_VALUE : j);
        if (a != null && a.b != null) {
            a((RecyclerView) a.b.get(), j);
        }
    }

    static boolean a(RecyclerView recyclerView, int i) {
        int c = recyclerView.f.c();
        for (int i2 = 0; i2 < c; i2++) {
            w e = RecyclerView.e(recyclerView.f.d(i2));
            if (e.c == i && !e.n()) {
                return true;
            }
        }
        return false;
    }

    private void b(long j) {
        int i = 0;
        while (i < this.f.size()) {
            b bVar = (b) this.f.get(i);
            if (bVar.d != null) {
                a(bVar, j);
                bVar.a();
                i++;
            } else {
                return;
            }
        }
    }

    void a(long j) {
        a();
        b(j);
    }

    public void a(RecyclerView recyclerView) {
        this.b.add(recyclerView);
    }

    void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.c == 0) {
            this.c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.z.a(i, i2);
    }

    public void b(RecyclerView recyclerView) {
        this.b.remove(recyclerView);
    }

    public void run() {
        try {
            android.support.v4.g.h.a("RV Prefetch");
            if (!this.b.isEmpty()) {
                long toNanos = TimeUnit.MILLISECONDS.toNanos(((RecyclerView) this.b.get(0)).getDrawingTime());
                if (toNanos == 0) {
                    this.c = 0;
                    android.support.v4.g.h.a();
                    return;
                }
                a(toNanos + this.d);
                this.c = 0;
                android.support.v4.g.h.a();
            }
        } finally {
            this.c = 0;
            android.support.v4.g.h.a();
        }
    }
}
