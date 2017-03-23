package android.support.v7.widget;

import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.i;
import android.view.View;
import com.google.android.gms.internal.zzamj;

/* compiled from: OrientationHelper */
public abstract class am {
    protected final h a;
    private int b;

    public abstract int a(View view);

    public abstract void a(int i);

    public abstract int b(View view);

    public abstract int c();

    public abstract int c(View view);

    public abstract int d();

    public abstract int d(View view);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    private am(h hVar) {
        this.b = zzamj.UNSET_ENUM_VALUE;
        this.a = hVar;
    }

    public void a() {
        this.b = f();
    }

    public int b() {
        return zzamj.UNSET_ENUM_VALUE == this.b ? 0 : f() - this.b;
    }

    public static am a(h hVar, int i) {
        switch (i) {
            case 0:
                return a(hVar);
            case 1:
                return b(hVar);
            default:
                throw new IllegalArgumentException("invalid orientation");
        }
    }

    public static am a(h hVar) {
        return new am(hVar) {
            public int d() {
                return this.a.w() - this.a.A();
            }

            public int e() {
                return this.a.w();
            }

            public void a(int i) {
                this.a.i(i);
            }

            public int c() {
                return this.a.y();
            }

            public int c(View view) {
                i iVar = (i) view.getLayoutParams();
                return iVar.rightMargin + (this.a.f(view) + iVar.leftMargin);
            }

            public int d(View view) {
                i iVar = (i) view.getLayoutParams();
                return iVar.bottomMargin + (this.a.g(view) + iVar.topMargin);
            }

            public int b(View view) {
                i iVar = (i) view.getLayoutParams();
                return iVar.rightMargin + this.a.j(view);
            }

            public int a(View view) {
                return this.a.h(view) - ((i) view.getLayoutParams()).leftMargin;
            }

            public int f() {
                return (this.a.w() - this.a.y()) - this.a.A();
            }

            public int g() {
                return this.a.A();
            }

            public int h() {
                return this.a.u();
            }

            public int i() {
                return this.a.v();
            }
        };
    }

    public static am b(h hVar) {
        return new am(hVar) {
            public int d() {
                return this.a.x() - this.a.B();
            }

            public int e() {
                return this.a.x();
            }

            public void a(int i) {
                this.a.j(i);
            }

            public int c() {
                return this.a.z();
            }

            public int c(View view) {
                i iVar = (i) view.getLayoutParams();
                return iVar.bottomMargin + (this.a.g(view) + iVar.topMargin);
            }

            public int d(View view) {
                i iVar = (i) view.getLayoutParams();
                return iVar.rightMargin + (this.a.f(view) + iVar.leftMargin);
            }

            public int b(View view) {
                i iVar = (i) view.getLayoutParams();
                return iVar.bottomMargin + this.a.k(view);
            }

            public int a(View view) {
                return this.a.i(view) - ((i) view.getLayoutParams()).topMargin;
            }

            public int f() {
                return (this.a.x() - this.a.z()) - this.a.B();
            }

            public int g() {
                return this.a.B();
            }

            public int h() {
                return this.a.v();
            }

            public int i() {
                return this.a.u();
            }
        };
    }
}
