package android.support.v4.b;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.i.k;
import android.support.v4.view.j;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class l implements ComponentCallbacks, OnCreateContextMenuListener {
    private static final k<String, Class<?>> a = new k();
    static final Object j = new Object();
    p A;
    r B;
    s C;
    l D;
    int E;
    int F;
    String G;
    boolean H;
    boolean I;
    boolean J;
    boolean K;
    boolean L;
    boolean M = true;
    boolean N;
    ViewGroup O;
    View P;
    View Q;
    boolean R;
    boolean S = true;
    ab T;
    boolean U;
    boolean V;
    a W;
    boolean X;
    boolean Y;
    float Z;
    int k = 0;
    Bundle l;
    SparseArray<Parcelable> m;
    int n = -1;
    String o;
    Bundle p;
    l q;
    int r = -1;
    int s;
    boolean t;
    boolean u;
    boolean v;
    boolean w;
    boolean x;
    int y;
    r z;

    static class a {
        View a;
        int b;
        int c;
        int d;
        int e;
        av f = null;
        av g = null;
        boolean h;
        c i;
        boolean j;
        private Object k = null;
        private Object l = l.j;
        private Object m = null;
        private Object n = l.j;
        private Object o = null;
        private Object p = l.j;
        private Boolean q;
        private Boolean r;

        a() {
        }
    }

    public static class b extends RuntimeException {
        public b(String str, Exception exception) {
            super(str, exception);
        }
    }

    interface c {
        void a();

        void b();
    }

    public static class d implements Parcelable {
        public static final Creator<d> CREATOR = new Creator<d>() {
            public d a(Parcel parcel) {
                return new d(parcel, null);
            }

            public d[] a(int i) {
                return new d[i];
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return a(i);
            }
        };
        final Bundle a;

        d(Bundle bundle) {
            this.a = bundle;
        }

        d(Parcel parcel, ClassLoader classLoader) {
            this.a = parcel.readBundle();
            if (classLoader != null && this.a != null) {
                this.a.setClassLoader(classLoader);
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.a);
        }
    }

    private a X() {
        if (this.W == null) {
            this.W = new a();
        }
        return this.W;
    }

    public static l a(Context context, String str) {
        return a(context, str, null);
    }

    public static l a(Context context, String str, Bundle bundle) {
        try {
            Class cls = (Class) a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                a.put(str, cls);
            }
            l lVar = (l) cls.newInstance();
            if (bundle != null) {
                bundle.setClassLoader(lVar.getClass().getClassLoader());
                lVar.p = bundle;
            }
            return lVar;
        } catch (Exception e) {
            throw new b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e);
        } catch (Exception e2) {
            throw new b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e2);
        } catch (Exception e22) {
            throw new b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e22);
        }
    }

    private void a() {
        c cVar = null;
        if (this.W != null) {
            this.W.h = false;
            c cVar2 = this.W.i;
            this.W.i = null;
            cVar = cVar2;
        }
        if (cVar != null) {
            cVar.a();
        }
    }

    static boolean b(Context context, String str) {
        try {
            Class cls = (Class) a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                a.put(str, cls);
            }
            return l.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    public Object A() {
        return this.W == null ? null : this.W.p == j ? z() : this.W.p;
    }

    public boolean B() {
        return (this.W == null || this.W.r == null) ? true : this.W.r.booleanValue();
    }

    public boolean C() {
        return (this.W == null || this.W.q == null) ? true : this.W.q.booleanValue();
    }

    public void D() {
        if (this.z == null || this.z.n == null) {
            X().h = false;
        } else if (Looper.myLooper() != this.z.n.h().getLooper()) {
            this.z.n.h().postAtFrontOfQueue(new Runnable(this) {
                final /* synthetic */ l a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.a();
                }
            });
        } else {
            a();
        }
    }

    void E() {
        this.B = new r();
        this.B.a(this.A, new n(this) {
            final /* synthetic */ l a;

            {
                this.a = r1;
            }

            public View a(int i) {
                if (this.a.P != null) {
                    return this.a.P.findViewById(i);
                }
                throw new IllegalStateException("Fragment does not have a view");
            }

            public boolean a() {
                return this.a.P != null;
            }
        }, this);
    }

    void F() {
        if (this.B != null) {
            this.B.i();
            this.B.d();
        }
        this.k = 4;
        this.N = false;
        c();
        if (this.N) {
            if (this.B != null) {
                this.B.l();
            }
            if (this.T != null) {
                this.T.g();
                return;
            }
            return;
        }
        throw new aw("Fragment " + this + " did not call through to super.onStart()");
    }

    void G() {
        if (this.B != null) {
            this.B.i();
            this.B.d();
        }
        this.k = 5;
        this.N = false;
        q();
        if (!this.N) {
            throw new aw("Fragment " + this + " did not call through to super.onResume()");
        } else if (this.B != null) {
            this.B.m();
            this.B.d();
        }
    }

    void H() {
        onLowMemory();
        if (this.B != null) {
            this.B.s();
        }
    }

    void I() {
        if (this.B != null) {
            this.B.n();
        }
        this.k = 4;
        this.N = false;
        r();
        if (!this.N) {
            throw new aw("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    void J() {
        if (this.B != null) {
            this.B.o();
        }
        this.k = 3;
        this.N = false;
        d();
        if (!this.N) {
            throw new aw("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    void K() {
        if (this.B != null) {
            this.B.p();
        }
        this.k = 2;
        if (this.U) {
            this.U = false;
            if (!this.V) {
                this.V = true;
                this.T = this.A.a(this.o, this.U, false);
            }
            if (this.T == null) {
                return;
            }
            if (this.A.j()) {
                this.T.d();
            } else {
                this.T.c();
            }
        }
    }

    void L() {
        if (this.B != null) {
            this.B.q();
        }
        this.k = 1;
        this.N = false;
        e();
        if (!this.N) {
            throw new aw("Fragment " + this + " did not call through to super.onDestroyView()");
        } else if (this.T != null) {
            this.T.f();
        }
    }

    void M() {
        if (this.B != null) {
            this.B.r();
        }
        this.k = 0;
        this.N = false;
        s();
        if (this.N) {
            this.B = null;
            return;
        }
        throw new aw("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void N() {
        this.N = false;
        b();
        if (!this.N) {
            throw new aw("Fragment " + this + " did not call through to super.onDetach()");
        } else if (this.B == null) {
        } else {
            if (this.K) {
                this.B.r();
                this.B = null;
                return;
            }
            throw new IllegalStateException("Child FragmentManager of " + this + " was not " + " destroyed and this fragment is not retaining instance");
        }
    }

    int O() {
        return this.W == null ? 0 : this.W.c;
    }

    int P() {
        return this.W == null ? 0 : this.W.d;
    }

    int Q() {
        return this.W == null ? 0 : this.W.e;
    }

    av R() {
        return this.W == null ? null : this.W.f;
    }

    av S() {
        return this.W == null ? null : this.W.g;
    }

    View T() {
        return this.W == null ? null : this.W.a;
    }

    int U() {
        return this.W == null ? 0 : this.W.b;
    }

    boolean V() {
        return this.W == null ? false : this.W.h;
    }

    boolean W() {
        return this.W == null ? false : this.W.j;
    }

    l a(String str) {
        return str.equals(this.o) ? this : this.B != null ? this.B.b(str) : null;
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public Animation a(int i, boolean z, int i2) {
        return null;
    }

    public final String a(int i) {
        return j().getString(i);
    }

    void a(int i, int i2) {
        if (this.W != null || i != 0 || i2 != 0) {
            X();
            this.W.d = i;
            this.W.e = i2;
        }
    }

    public void a(int i, int i2, Intent intent) {
    }

    final void a(int i, l lVar) {
        this.n = i;
        if (lVar != null) {
            this.o = lVar.o + ":" + this.n;
        } else {
            this.o = "android:fragment:" + this.n;
        }
    }

    public void a(int i, String[] strArr, int[] iArr) {
    }

    @Deprecated
    public void a(Activity activity) {
        this.N = true;
    }

    @Deprecated
    public void a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.N = true;
    }

    public void a(Context context) {
        this.N = true;
        Activity f = this.A == null ? null : this.A.f();
        if (f != null) {
            this.N = false;
            a(f);
        }
    }

    public void a(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.N = true;
        Activity f = this.A == null ? null : this.A.f();
        if (f != null) {
            this.N = false;
            a(f, attributeSet, bundle);
        }
    }

    public void a(Intent intent, int i, Bundle bundle) {
        if (this.A == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.A.a(this, intent, i, bundle);
    }

    void a(Configuration configuration) {
        onConfigurationChanged(configuration);
        if (this.B != null) {
            this.B.a(configuration);
        }
    }

    public void a(Bundle bundle) {
        this.N = true;
        h(bundle);
        if (this.B != null && !this.B.a(1)) {
            this.B.j();
        }
    }

    void a(c cVar) {
        X();
        if (cVar != this.W.i) {
            if (cVar == null || this.W.i == null) {
                if (this.W.h) {
                    this.W.i = cVar;
                }
                if (cVar != null) {
                    cVar.b();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    public void a(d dVar) {
        if (this.n >= 0) {
            throw new IllegalStateException("Fragment already active");
        }
        Bundle bundle = (dVar == null || dVar.a == null) ? null : dVar.a;
        this.l = bundle;
    }

    public void a(l lVar) {
    }

    public void a(Menu menu) {
    }

    public void a(Menu menu, MenuInflater menuInflater) {
    }

    void a(View view) {
        X().a = view;
    }

    public void a(View view, Bundle bundle) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.E));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.F));
        printWriter.print(" mTag=");
        printWriter.println(this.G);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.k);
        printWriter.print(" mIndex=");
        printWriter.print(this.n);
        printWriter.print(" mWho=");
        printWriter.print(this.o);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.y);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.t);
        printWriter.print(" mRemoving=");
        printWriter.print(this.u);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.v);
        printWriter.print(" mInLayout=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.H);
        printWriter.print(" mDetached=");
        printWriter.print(this.I);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.M);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.L);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.J);
        printWriter.print(" mRetaining=");
        printWriter.print(this.K);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.S);
        if (this.z != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.z);
        }
        if (this.A != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.A);
        }
        if (this.D != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.D);
        }
        if (this.p != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.p);
        }
        if (this.l != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.l);
        }
        if (this.m != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.m);
        }
        if (this.q != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.q);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.s);
        }
        if (O() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(O());
        }
        if (this.O != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.O);
        }
        if (this.P != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.P);
        }
        if (this.Q != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.P);
        }
        if (T() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(T());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(U());
        }
        if (this.T != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            this.T.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        if (this.B != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.B + ":");
            this.B.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    public boolean a(MenuItem menuItem) {
        return false;
    }

    public LayoutInflater b(Bundle bundle) {
        LayoutInflater b = this.A.b();
        l();
        j.a(b, this.B.t());
        return b;
    }

    View b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.B != null) {
            this.B.i();
        }
        return a(layoutInflater, viewGroup, bundle);
    }

    public void b() {
        this.N = true;
    }

    void b(int i) {
        if (this.W != null || i != 0) {
            X().c = i;
        }
    }

    public void b(Menu menu) {
    }

    boolean b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.H) {
            return false;
        }
        if (this.L && this.M) {
            z = true;
            a(menu, menuInflater);
        }
        return this.B != null ? z | this.B.a(menu, menuInflater) : z;
    }

    public boolean b(MenuItem menuItem) {
        return false;
    }

    public void c() {
        this.N = true;
        if (!this.U) {
            this.U = true;
            if (!this.V) {
                this.V = true;
                this.T = this.A.a(this.o, this.U, false);
            }
            if (this.T != null) {
                this.T.b();
            }
        }
    }

    void c(int i) {
        X().b = i;
    }

    public void c(boolean z) {
    }

    boolean c(Menu menu) {
        boolean z = false;
        if (this.H) {
            return false;
        }
        if (this.L && this.M) {
            z = true;
            a(menu);
        }
        return this.B != null ? z | this.B.a(menu) : z;
    }

    boolean c(MenuItem menuItem) {
        if (!this.H) {
            if (this.L && this.M && a(menuItem)) {
                return true;
            }
            if (this.B != null && this.B.a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void d() {
        this.N = true;
    }

    public void d(Bundle bundle) {
        this.N = true;
    }

    void d(Menu menu) {
        if (!this.H) {
            if (this.L && this.M) {
                b(menu);
            }
            if (this.B != null) {
                this.B.b(menu);
            }
        }
    }

    public void d(boolean z) {
        this.J = z;
    }

    boolean d(MenuItem menuItem) {
        if (!this.H) {
            if (b(menuItem)) {
                return true;
            }
            if (this.B != null && this.B.b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void e() {
        this.N = true;
    }

    public void e(Bundle bundle) {
    }

    public void e(boolean z) {
        if (this.M != z) {
            this.M = z;
            if (this.L && m() && !o()) {
                this.A.c();
            }
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    final void f(Bundle bundle) {
        if (this.m != null) {
            this.Q.restoreHierarchyState(this.m);
            this.m = null;
        }
        this.N = false;
        i(bundle);
        if (!this.N) {
            throw new aw("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void f(boolean z) {
        if (!this.S && z && this.k < 4 && this.z != null && m()) {
            this.z.b(this);
        }
        this.S = z;
        boolean z2 = this.k < 4 && !z;
        this.R = z2;
    }

    final boolean f() {
        return this.y > 0;
    }

    public final Bundle g() {
        return this.p;
    }

    public void g(Bundle bundle) {
        if (this.n >= 0) {
            throw new IllegalStateException("Fragment already active");
        }
        this.p = bundle;
    }

    public void g(boolean z) {
    }

    public Context h() {
        return this.A == null ? null : this.A.g();
    }

    void h(Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                if (this.B == null) {
                    E();
                }
                this.B.a(parcelable, this.C);
                this.C = null;
                this.B.j();
            }
        }
    }

    public void h(boolean z) {
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final m i() {
        return this.A == null ? null : (m) this.A.f();
    }

    public void i(Bundle bundle) {
        this.N = true;
    }

    void i(boolean z) {
        g(z);
        if (this.B != null) {
            this.B.a(z);
        }
    }

    public final Resources j() {
        if (this.A != null) {
            return this.A.g().getResources();
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    void j(Bundle bundle) {
        if (this.B != null) {
            this.B.i();
        }
        this.k = 1;
        this.N = false;
        a(bundle);
        if (!this.N) {
            throw new aw("Fragment " + this + " did not call through to super.onCreate()");
        }
    }

    void j(boolean z) {
        h(z);
        if (this.B != null) {
            this.B.b(z);
        }
    }

    public final q k() {
        return this.z;
    }

    void k(Bundle bundle) {
        if (this.B != null) {
            this.B.i();
        }
        this.k = 2;
        this.N = false;
        d(bundle);
        if (!this.N) {
            throw new aw("Fragment " + this + " did not call through to super.onActivityCreated()");
        } else if (this.B != null) {
            this.B.k();
        }
    }

    void k(boolean z) {
        X().j = z;
    }

    public final q l() {
        if (this.B == null) {
            E();
            if (this.k >= 5) {
                this.B.m();
            } else if (this.k >= 4) {
                this.B.l();
            } else if (this.k >= 2) {
                this.B.k();
            } else if (this.k >= 1) {
                this.B.j();
            }
        }
        return this.B;
    }

    void l(Bundle bundle) {
        e(bundle);
        if (this.B != null) {
            Parcelable h = this.B.h();
            if (h != null) {
                bundle.putParcelable("android:support:fragments", h);
            }
        }
    }

    public final boolean m() {
        return this.A != null && this.t;
    }

    public final boolean n() {
        return this.u;
    }

    public final boolean o() {
        return this.H;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.N = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        i().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.N = true;
    }

    public View p() {
        return this.P;
    }

    public void q() {
        this.N = true;
    }

    public void r() {
        this.N = true;
    }

    public void s() {
        this.N = true;
        if (!this.V) {
            this.V = true;
            this.T = this.A.a(this.o, this.U, false);
        }
        if (this.T != null) {
            this.T.h();
        }
    }

    public void startActivityForResult(Intent intent, int i) {
        a(intent, i, null);
    }

    void t() {
        this.n = -1;
        this.o = null;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = 0;
        this.z = null;
        this.B = null;
        this.A = null;
        this.E = 0;
        this.F = 0;
        this.G = null;
        this.H = false;
        this.I = false;
        this.K = false;
        this.T = null;
        this.U = false;
        this.V = false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        android.support.v4.i.d.a(this, stringBuilder);
        if (this.n >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.n);
        }
        if (this.E != 0) {
            stringBuilder.append(" id=0x");
            stringBuilder.append(Integer.toHexString(this.E));
        }
        if (this.G != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.G);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void u() {
    }

    public Object v() {
        return this.W == null ? null : this.W.k;
    }

    public Object w() {
        return this.W == null ? null : this.W.l == j ? v() : this.W.l;
    }

    public Object x() {
        return this.W == null ? null : this.W.m;
    }

    public Object y() {
        return this.W == null ? null : this.W.n == j ? x() : this.W.n;
    }

    public Object z() {
        return this.W == null ? null : this.W.o;
    }
}
