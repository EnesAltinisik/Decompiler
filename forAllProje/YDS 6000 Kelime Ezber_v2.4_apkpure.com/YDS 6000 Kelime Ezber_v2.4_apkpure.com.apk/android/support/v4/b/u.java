package android.support.v4.b;

import android.os.Parcelable;
import android.support.v4.view.aa;
import android.view.View;
import android.view.ViewGroup;

public abstract class u extends aa {
    private final q a;
    private x b = null;
    private l c = null;

    public u(q qVar) {
        this.a = qVar;
    }

    private static String a(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    public Parcelable a() {
        return null;
    }

    public abstract l a(int i);

    public Object a(ViewGroup viewGroup, int i) {
        if (this.b == null) {
            this.b = this.a.a();
        }
        long b = b(i);
        l a = this.a.a(a(viewGroup.getId(), b));
        if (a != null) {
            this.b.c(a);
        } else {
            a = a(i);
            this.b.a(viewGroup.getId(), a, a(viewGroup.getId(), b));
        }
        if (a != this.c) {
            a.e(false);
            a.f(false);
        }
        return a;
    }

    public void a(Parcelable parcelable, ClassLoader classLoader) {
    }

    public void a(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    public void a(ViewGroup viewGroup, int i, Object obj) {
        if (this.b == null) {
            this.b = this.a.a();
        }
        this.b.b((l) obj);
    }

    public boolean a(View view, Object obj) {
        return ((l) obj).p() == view;
    }

    public long b(int i) {
        return (long) i;
    }

    public void b(ViewGroup viewGroup) {
        if (this.b != null) {
            this.b.d();
            this.b = null;
        }
    }

    public void b(ViewGroup viewGroup, int i, Object obj) {
        l lVar = (l) obj;
        if (lVar != this.c) {
            if (this.c != null) {
                this.c.e(false);
                this.c.f(false);
            }
            if (lVar != null) {
                lVar.e(true);
                lVar.f(true);
            }
            this.c = lVar;
        }
    }
}
