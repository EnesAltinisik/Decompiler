package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.view.ad;
import android.support.v4.view.af;
import android.support.v4.view.ah;
import android.support.v7.recyclerview.R;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecyclerView extends ViewGroup implements ad, android.support.v4.view.v {
    static final Interpolator G = new Interpolator() {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * (((f2 * f2) * f2) * f2)) + 1.0f;
        }
    };
    private static final int[] H = new int[]{16843830};
    private static final int[] I = new int[]{16842987};
    private static final boolean J = (VERSION.SDK_INT >= 21);
    private static final boolean K = (VERSION.SDK_INT <= 15);
    private static final boolean L = (VERSION.SDK_INT <= 15);
    private static final Class<?>[] M = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
    static final boolean a;
    static final boolean b = (VERSION.SDK_INT >= 23);
    static final boolean c = (VERSION.SDK_INT >= 16);
    final t A;
    boolean B;
    boolean C;
    boolean D;
    ax E;
    final List<w> F;
    private final q N;
    private r O;
    private final Rect P;
    private final ArrayList<l> Q;
    private l R;
    private int S;
    private boolean T;
    private int U;
    private final AccessibilityManager V;
    private List<j> W;
    private final int[] aA;
    private final int[] aB;
    private Runnable aC;
    private final b aD;
    private int aa;
    private int ab;
    private android.support.v4.widget.j ac;
    private android.support.v4.widget.j ad;
    private android.support.v4.widget.j ae;
    private android.support.v4.widget.j af;
    private int ag;
    private int ah;
    private VelocityTracker ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private k ao;
    private final int ap;
    private final int aq;
    private float ar;
    private boolean as;
    private m at;
    private List<m> au;
    private b av;
    private d aw;
    private final int[] ax;
    private android.support.v4.view.w ay;
    private final int[] az;
    final o d;
    f e;
    af f;
    final bo g;
    boolean h;
    final Runnable i;
    final Rect j;
    final RectF k;
    a l;
    h m;
    p n;
    final ArrayList<g> o;
    boolean p;
    boolean q;
    boolean r;
    boolean s;
    boolean t;
    boolean u;
    boolean v;
    e w;
    final v x;
    an y;
    a z;

    public static abstract class w {
        private static final List<Object> o = Collections.EMPTY_LIST;
        public final View a;
        WeakReference<RecyclerView> b;
        int c = -1;
        int d = -1;
        long e = -1;
        int f = -1;
        int g = -1;
        w h = null;
        w i = null;
        List<Object> j = null;
        List<Object> k = null;
        int l = -1;
        RecyclerView m;
        private int n;
        private int p = 0;
        private o q = null;
        private boolean r = false;
        private int s = 0;

        public w(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.a = view;
        }

        private boolean A() {
            return (this.n & 16) == 0 && ah.c(this.a);
        }

        private void a(RecyclerView recyclerView) {
            this.s = ah.e(this.a);
            recyclerView.a(this, 4);
        }

        private void b(RecyclerView recyclerView) {
            recyclerView.a(this, this.s);
            this.s = 0;
        }

        private void y() {
            if (this.j == null) {
                this.j = new ArrayList();
                this.k = Collections.unmodifiableList(this.j);
            }
        }

        private boolean z() {
            return (this.n & 16) != 0;
        }

        void a() {
            this.d = -1;
            this.g = -1;
        }

        void a(int i, int i2) {
            this.n = (this.n & (i2 ^ -1)) | (i & i2);
        }

        void a(int i, int i2, boolean z) {
            b(8);
            a(i2, z);
            this.c = i;
        }

        void a(int i, boolean z) {
            if (this.d == -1) {
                this.d = this.c;
            }
            if (this.g == -1) {
                this.g = this.c;
            }
            if (z) {
                this.g += i;
            }
            this.c += i;
            if (this.a.getLayoutParams() != null) {
                ((i) this.a.getLayoutParams()).e = true;
            }
        }

        void a(o oVar, boolean z) {
            this.q = oVar;
            this.r = z;
        }

        void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((this.n & 1024) == 0) {
                y();
                this.j.add(obj);
            }
        }

        public final void a(boolean z) {
            this.p = z ? this.p - 1 : this.p + 1;
            if (this.p < 0) {
                this.p = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && this.p == 1) {
                this.n |= 16;
            } else if (z && this.p == 0) {
                this.n &= -17;
            }
        }

        boolean a(int i) {
            return (this.n & i) != 0;
        }

        void b() {
            if (this.d == -1) {
                this.d = this.c;
            }
        }

        void b(int i) {
            this.n |= i;
        }

        boolean c() {
            return (this.n & 128) != 0;
        }

        public final int d() {
            return this.g == -1 ? this.c : this.g;
        }

        public final int e() {
            return this.m == null ? -1 : this.m.d(this);
        }

        public final int f() {
            return this.d;
        }

        public final long g() {
            return this.e;
        }

        public final int h() {
            return this.f;
        }

        boolean i() {
            return this.q != null;
        }

        void j() {
            this.q.c(this);
        }

        boolean k() {
            return (this.n & 32) != 0;
        }

        void l() {
            this.n &= -33;
        }

        void m() {
            this.n &= -257;
        }

        boolean n() {
            return (this.n & 4) != 0;
        }

        boolean o() {
            return (this.n & 2) != 0;
        }

        boolean p() {
            return (this.n & 1) != 0;
        }

        boolean q() {
            return (this.n & 8) != 0;
        }

        boolean r() {
            return (this.n & 256) != 0;
        }

        boolean s() {
            return (this.n & 512) != 0 || n();
        }

        void t() {
            if (this.j != null) {
                this.j.clear();
            }
            this.n &= -1025;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
            if (i()) {
                stringBuilder.append(" scrap ").append(this.r ? "[changeScrap]" : "[attachedScrap]");
            }
            if (n()) {
                stringBuilder.append(" invalid");
            }
            if (!p()) {
                stringBuilder.append(" unbound");
            }
            if (o()) {
                stringBuilder.append(" update");
            }
            if (q()) {
                stringBuilder.append(" removed");
            }
            if (c()) {
                stringBuilder.append(" ignored");
            }
            if (r()) {
                stringBuilder.append(" tmpDetached");
            }
            if (!w()) {
                stringBuilder.append(" not recyclable(" + this.p + ")");
            }
            if (s()) {
                stringBuilder.append(" undefined adapter position");
            }
            if (this.a.getParent() == null) {
                stringBuilder.append(" no parent");
            }
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        List<Object> u() {
            return (this.n & 1024) == 0 ? (this.j == null || this.j.size() == 0) ? o : this.k : o;
        }

        void v() {
            this.n = 0;
            this.c = -1;
            this.d = -1;
            this.e = -1;
            this.g = -1;
            this.p = 0;
            this.h = null;
            this.i = null;
            t();
            this.s = 0;
            this.l = -1;
            RecyclerView.c(this);
        }

        public final boolean w() {
            return (this.n & 16) == 0 && !ah.c(this.a);
        }

        boolean x() {
            return (this.n & 2) != 0;
        }
    }

    public static abstract class a<VH extends w> {
        private final b a = new b();
        private boolean b = false;

        public abstract int a();

        public long a(int i) {
            return -1;
        }

        public void a(c cVar) {
            this.a.registerObserver(cVar);
        }

        public void a(VH vh) {
        }

        public abstract void a(VH vh, int i);

        public void a(VH vh, int i, List<Object> list) {
            a(vh, i);
        }

        public void a(RecyclerView recyclerView) {
        }

        public int b(int i) {
            return 0;
        }

        public abstract VH b(ViewGroup viewGroup, int i);

        public void b(c cVar) {
            this.a.unregisterObserver(cVar);
        }

        public final void b(VH vh, int i) {
            vh.c = i;
            if (d()) {
                vh.e = a(i);
            }
            vh.a(1, 519);
            android.support.v4.g.h.a("RV OnBindView");
            a(vh, i, vh.u());
            vh.t();
            LayoutParams layoutParams = vh.a.getLayoutParams();
            if (layoutParams instanceof i) {
                ((i) layoutParams).e = true;
            }
            android.support.v4.g.h.a();
        }

        public void b(RecyclerView recyclerView) {
        }

        public boolean b(VH vh) {
            return false;
        }

        public final VH c(ViewGroup viewGroup, int i) {
            android.support.v4.g.h.a("RV CreateView");
            VH b = b(viewGroup, i);
            b.f = i;
            android.support.v4.g.h.a();
            return b;
        }

        public final void c(int i) {
            this.a.a(i, 1);
        }

        public void c(VH vh) {
        }

        public void d(VH vh) {
        }

        public final boolean d() {
            return this.b;
        }

        public final void e() {
            this.a.a();
        }
    }

    public static class i extends MarginLayoutParams {
        w c;
        final Rect d = new Rect();
        boolean e = true;
        boolean f = false;

        public i(int i, int i2) {
            super(i, i2);
        }

        public i(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public i(i iVar) {
            super(iVar);
        }

        public i(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public i(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public boolean c() {
            return this.c.n();
        }

        public boolean d() {
            return this.c.q();
        }

        public boolean e() {
            return this.c.x();
        }

        public int f() {
            return this.c.d();
        }
    }

    public static abstract class h {
        private boolean a = true;
        private boolean b = true;
        private int c;
        private int d;
        private int e;
        private int f;
        af p;
        RecyclerView q;
        s r;
        boolean s = false;
        boolean t = false;
        boolean u = false;
        int v;
        boolean w;

        public interface a {
            void b(int i, int i2);
        }

        public static class b {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public static int a(int i, int i2, int i3) {
            int mode = MeasureSpec.getMode(i);
            int size = MeasureSpec.getSize(i);
            switch (mode) {
                case Integer.MIN_VALUE:
                    return Math.min(size, Math.max(i2, i3));
                case 1073741824:
                    return size;
                default:
                    return Math.max(i2, i3);
            }
        }

        public static int a(int i, int i2, int i3, int i4, boolean z) {
            int i5 = 0;
            int max = Math.max(0, i - i3);
            if (z) {
                if (i4 >= 0) {
                    i5 = 1073741824;
                    max = i4;
                } else if (i4 == -1) {
                    switch (i2) {
                        case Integer.MIN_VALUE:
                        case 1073741824:
                            i5 = max;
                            break;
                        case 0:
                            i2 = 0;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                    max = i5;
                    i5 = i2;
                } else {
                    if (i4 == -2) {
                        max = 0;
                    }
                    max = 0;
                }
            } else if (i4 >= 0) {
                i5 = 1073741824;
                max = i4;
            } else if (i4 == -1) {
                i5 = i2;
            } else {
                if (i4 == -2) {
                    if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                        i5 = Integer.MIN_VALUE;
                    }
                }
                max = 0;
            }
            return MeasureSpec.makeMeasureSpec(max, i5);
        }

        public static b a(Context context, AttributeSet attributeSet, int i, int i2) {
            b bVar = new b();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RecyclerView, i, i2);
            bVar.a = obtainStyledAttributes.getInt(R.styleable.RecyclerView_android_orientation, 1);
            bVar.b = obtainStyledAttributes.getInt(R.styleable.RecyclerView_spanCount, 1);
            bVar.c = obtainStyledAttributes.getBoolean(R.styleable.RecyclerView_reverseLayout, false);
            bVar.d = obtainStyledAttributes.getBoolean(R.styleable.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return bVar;
        }

        private void a(int i, View view) {
            this.p.e(i);
        }

        private void a(o oVar, int i, View view) {
            w e = RecyclerView.e(view);
            if (!e.c()) {
                if (!e.n() || e.q() || this.q.l.d()) {
                    h(i);
                    oVar.c(view);
                    this.q.g.h(e);
                    return;
                }
                g(i);
                oVar.b(e);
            }
        }

        private void a(View view, int i, boolean z) {
            w e = RecyclerView.e(view);
            if (z || e.q()) {
                this.q.g.e(e);
            } else {
                this.q.g.f(e);
            }
            i iVar = (i) view.getLayoutParams();
            if (e.k() || e.i()) {
                if (e.i()) {
                    e.j();
                } else {
                    e.l();
                }
                this.p.a(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.q) {
                int b = this.p.b(view);
                if (i == -1) {
                    i = this.p.b();
                }
                if (b == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.q.indexOfChild(view));
                } else if (b != i) {
                    this.q.m.e(b, i);
                }
            } else {
                this.p.a(view, i, false);
                iVar.e = true;
                if (this.r != null && this.r.h()) {
                    this.r.b(view);
                }
            }
            if (iVar.f) {
                e.a.invalidate();
                iVar.f = false;
            }
        }

        private void b(s sVar) {
            if (this.r == sVar) {
                this.r = null;
            }
        }

        private static boolean b(int i, int i2, int i3) {
            int mode = MeasureSpec.getMode(i2);
            int size = MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            switch (mode) {
                case Integer.MIN_VALUE:
                    return size >= i;
                case 0:
                    return true;
                case 1073741824:
                    return size == i;
                default:
                    return false;
            }
        }

        public int A() {
            return this.q != null ? this.q.getPaddingTop() : 0;
        }

        public int B() {
            return this.q != null ? this.q.getPaddingRight() : 0;
        }

        public int C() {
            return this.q != null ? this.q.getPaddingBottom() : 0;
        }

        public View D() {
            if (this.q == null) {
                return null;
            }
            View focusedChild = this.q.getFocusedChild();
            return (focusedChild == null || this.p.c(focusedChild)) ? null : focusedChild;
        }

        public int E() {
            return ah.q(this.q);
        }

        public int F() {
            return ah.r(this.q);
        }

        void G() {
            if (this.r != null) {
                this.r.f();
            }
        }

        public void H() {
            this.s = true;
        }

        boolean I() {
            int u = u();
            for (int i = 0; i < u; i++) {
                LayoutParams layoutParams = i(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public int a(int i, o oVar, t tVar) {
            return 0;
        }

        public int a(o oVar, t tVar) {
            return (this.q == null || this.q.l == null || !e()) ? 1 : this.q.l.a();
        }

        public abstract i a();

        public i a(Context context, AttributeSet attributeSet) {
            return new i(context, attributeSet);
        }

        public i a(LayoutParams layoutParams) {
            return layoutParams instanceof i ? new i((i) layoutParams) : layoutParams instanceof MarginLayoutParams ? new i((MarginLayoutParams) layoutParams) : new i(layoutParams);
        }

        public View a(View view, int i, o oVar, t tVar) {
            return null;
        }

        public void a(int i, int i2, t tVar, a aVar) {
        }

        public void a(int i, a aVar) {
        }

        public void a(int i, o oVar) {
            View i2 = i(i);
            g(i);
            oVar.a(i2);
        }

        public void a(Rect rect, int i, int i2) {
            f(a(i, (rect.width() + z()) + B(), E()), a(i2, (rect.height() + A()) + C(), F()));
        }

        public void a(Parcelable parcelable) {
        }

        void a(android.support.v4.view.a.c cVar) {
            a(this.q.d, this.q.A, cVar);
        }

        public void a(a aVar, a aVar2) {
        }

        public void a(o oVar) {
            for (int u = u() - 1; u >= 0; u--) {
                a(oVar, u, i(u));
            }
        }

        public void a(o oVar, t tVar, int i, int i2) {
            this.q.e(i, i2);
        }

        public void a(o oVar, t tVar, android.support.v4.view.a.c cVar) {
            if (ah.b(this.q, -1) || ah.a(this.q, -1)) {
                cVar.a(8192);
                cVar.k(true);
            }
            if (ah.b(this.q, 1) || ah.a(this.q, 1)) {
                cVar.a(4096);
                cVar.k(true);
            }
            cVar.b(android.support.v4.view.a.c.m.a(a(oVar, tVar), b(oVar, tVar), e(oVar, tVar), d(oVar, tVar)));
        }

        public void a(o oVar, t tVar, View view, android.support.v4.view.a.c cVar) {
            cVar.c(android.support.v4.view.a.c.n.a(e() ? d(view) : 0, 1, d() ? d(view) : 0, 1, false, false));
        }

        public void a(o oVar, t tVar, AccessibilityEvent accessibilityEvent) {
            boolean z = true;
            android.support.v4.view.a.n a = android.support.v4.view.a.a.a(accessibilityEvent);
            if (this.q != null && a != null) {
                if (!(ah.b(this.q, 1) || ah.b(this.q, -1) || ah.a(this.q, -1) || ah.a(this.q, 1))) {
                    z = false;
                }
                a.a(z);
                if (this.q.l != null) {
                    a.a(this.q.l.a());
                }
            }
        }

        public void a(s sVar) {
            if (!(this.r == null || sVar == this.r || !this.r.h())) {
                this.r.f();
            }
            this.r = sVar;
            this.r.a(this.q, this);
        }

        public void a(t tVar) {
        }

        public void a(RecyclerView recyclerView) {
        }

        public void a(RecyclerView recyclerView, int i, int i2) {
        }

        public void a(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public void a(RecyclerView recyclerView, int i, int i2, Object obj) {
            c(recyclerView, i, i2);
        }

        public void a(RecyclerView recyclerView, o oVar) {
            e(recyclerView);
        }

        public void a(RecyclerView recyclerView, t tVar, int i) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void a(View view) {
            a(view, -1);
        }

        public void a(View view, int i) {
            a(view, i, true);
        }

        public void a(View view, int i, int i2) {
            i iVar = (i) view.getLayoutParams();
            Rect i3 = this.q.i(view);
            int i4 = (i3.left + i3.right) + i;
            int i5 = (i3.bottom + i3.top) + i2;
            i4 = a(x(), v(), i4 + (((z() + B()) + iVar.leftMargin) + iVar.rightMargin), iVar.width, d());
            i5 = a(y(), w(), i5 + (((A() + C()) + iVar.topMargin) + iVar.bottomMargin), iVar.height, e());
            if (b(view, i4, i5, iVar)) {
                view.measure(i4, i5);
            }
        }

        public void a(View view, int i, int i2, int i3, int i4) {
            i iVar = (i) view.getLayoutParams();
            Rect rect = iVar.d;
            view.layout((rect.left + i) + iVar.leftMargin, (rect.top + i2) + iVar.topMargin, (i3 - rect.right) - iVar.rightMargin, (i4 - rect.bottom) - iVar.bottomMargin);
        }

        public void a(View view, int i, i iVar) {
            w e = RecyclerView.e(view);
            if (e.q()) {
                this.q.g.e(e);
            } else {
                this.q.g.f(e);
            }
            this.p.a(view, i, iVar, e.q());
        }

        public void a(View view, Rect rect) {
            RecyclerView.a(view, rect);
        }

        void a(View view, android.support.v4.view.a.c cVar) {
            w e = RecyclerView.e(view);
            if (e != null && !e.q() && !this.p.c(e.a)) {
                a(this.q.d, this.q.A, view, cVar);
            }
        }

        public void a(View view, o oVar) {
            c(view);
            oVar.a(view);
        }

        public void a(View view, boolean z, Rect rect) {
            if (z) {
                Rect rect2 = ((i) view.getLayoutParams()).d;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, rect2.bottom + view.getHeight());
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.q != null) {
                Matrix p = ah.p(view);
                if (!(p == null || p.isIdentity())) {
                    RectF rectF = this.q.k;
                    rectF.set(rect);
                    p.mapRect(rectF);
                    rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
                }
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void a(AccessibilityEvent accessibilityEvent) {
            a(this.q.d, this.q.A, accessibilityEvent);
        }

        public void a(String str) {
            if (this.q != null) {
                this.q.a(str);
            }
        }

        boolean a(int i, Bundle bundle) {
            return a(this.q.d, this.q.A, i, bundle);
        }

        public boolean a(i iVar) {
            return iVar != null;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(android.support.v7.widget.RecyclerView.o r7, android.support.v7.widget.RecyclerView.t r8, int r9, android.os.Bundle r10) {
            /*
            r6 = this;
            r4 = -1;
            r2 = 1;
            r1 = 0;
            r0 = r6.q;
            if (r0 != 0) goto L_0x0008;
        L_0x0007:
            return r1;
        L_0x0008:
            switch(r9) {
                case 4096: goto L_0x004a;
                case 8192: goto L_0x0018;
                default: goto L_0x000b;
            };
        L_0x000b:
            r0 = r1;
            r3 = r1;
        L_0x000d:
            if (r3 != 0) goto L_0x0011;
        L_0x000f:
            if (r0 == 0) goto L_0x0007;
        L_0x0011:
            r1 = r6.q;
            r1.scrollBy(r0, r3);
            r1 = r2;
            goto L_0x0007;
        L_0x0018:
            r0 = r6.q;
            r0 = android.support.v4.view.ah.b(r0, r4);
            if (r0 == 0) goto L_0x007f;
        L_0x0020:
            r0 = r6.y();
            r3 = r6.A();
            r0 = r0 - r3;
            r3 = r6.C();
            r0 = r0 - r3;
            r0 = -r0;
        L_0x002f:
            r3 = r6.q;
            r3 = android.support.v4.view.ah.a(r3, r4);
            if (r3 == 0) goto L_0x007a;
        L_0x0037:
            r3 = r6.x();
            r4 = r6.z();
            r3 = r3 - r4;
            r4 = r6.B();
            r3 = r3 - r4;
            r3 = -r3;
            r5 = r3;
            r3 = r0;
            r0 = r5;
            goto L_0x000d;
        L_0x004a:
            r0 = r6.q;
            r0 = android.support.v4.view.ah.b(r0, r2);
            if (r0 == 0) goto L_0x007d;
        L_0x0052:
            r0 = r6.y();
            r3 = r6.A();
            r0 = r0 - r3;
            r3 = r6.C();
            r0 = r0 - r3;
        L_0x0060:
            r3 = r6.q;
            r3 = android.support.v4.view.ah.a(r3, r2);
            if (r3 == 0) goto L_0x007a;
        L_0x0068:
            r3 = r6.x();
            r4 = r6.z();
            r3 = r3 - r4;
            r4 = r6.B();
            r3 = r3 - r4;
            r5 = r3;
            r3 = r0;
            r0 = r5;
            goto L_0x000d;
        L_0x007a:
            r3 = r0;
            r0 = r1;
            goto L_0x000d;
        L_0x007d:
            r0 = r1;
            goto L_0x0060;
        L_0x007f:
            r0 = r1;
            goto L_0x002f;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.h.a(android.support.v7.widget.RecyclerView$o, android.support.v7.widget.RecyclerView$t, int, android.os.Bundle):boolean");
        }

        public boolean a(o oVar, t tVar, View view, int i, Bundle bundle) {
            return false;
        }

        public boolean a(RecyclerView recyclerView, t tVar, View view, View view2) {
            return a(recyclerView, view, view2);
        }

        public boolean a(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            int z2 = z();
            int A = A();
            int x = x() - B();
            int y = y() - C();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = left + rect.width();
            int height = top + rect.height();
            int min = Math.min(0, left - z2);
            int min2 = Math.min(0, top - A);
            int max = Math.max(0, width - x);
            y = Math.max(0, height - y);
            if (s() == 1) {
                if (max == 0) {
                    max = Math.max(min, width - x);
                }
                min = max;
            } else {
                min = min != 0 ? min : Math.min(left - z2, max);
            }
            max = min2 != 0 ? min2 : Math.min(top - A, y);
            if (min == 0 && max == 0) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(min, max);
            } else {
                recyclerView.a(min, max);
            }
            return true;
        }

        @Deprecated
        public boolean a(RecyclerView recyclerView, View view, View view2) {
            return r() || recyclerView.n();
        }

        public boolean a(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        boolean a(View view, int i, int i2, i iVar) {
            return (this.a && b(view.getMeasuredWidth(), i, iVar.width) && b(view.getMeasuredHeight(), i2, iVar.height)) ? false : true;
        }

        boolean a(View view, int i, Bundle bundle) {
            return a(this.q.d, this.q.A, view, i, bundle);
        }

        public boolean a(Runnable runnable) {
            return this.q != null ? this.q.removeCallbacks(runnable) : false;
        }

        public int b(int i, o oVar, t tVar) {
            return 0;
        }

        public int b(o oVar, t tVar) {
            return (this.q == null || this.q.l == null || !d()) ? 1 : this.q.l.a();
        }

        void b(o oVar) {
            int e = oVar.e();
            for (int i = e - 1; i >= 0; i--) {
                View e2 = oVar.e(i);
                w e3 = RecyclerView.e(e2);
                if (!e3.c()) {
                    e3.a(false);
                    if (e3.r()) {
                        this.q.removeDetachedView(e2, false);
                    }
                    if (this.q.w != null) {
                        this.q.w.d(e3);
                    }
                    e3.a(true);
                    oVar.b(e2);
                }
            }
            oVar.f();
            if (e > 0) {
                this.q.invalidate();
            }
        }

        void b(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.q = null;
                this.p = null;
                this.e = 0;
                this.f = 0;
            } else {
                this.q = recyclerView;
                this.p = recyclerView.f;
                this.e = recyclerView.getWidth();
                this.f = recyclerView.getHeight();
            }
            this.c = 1073741824;
            this.d = 1073741824;
        }

        public void b(RecyclerView recyclerView, int i, int i2) {
        }

        void b(RecyclerView recyclerView, o oVar) {
            this.t = false;
            a(recyclerView, oVar);
        }

        public void b(View view) {
            b(view, -1);
        }

        public void b(View view, int i) {
            a(view, i, false);
        }

        public void b(View view, Rect rect) {
            if (this.q == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(this.q.i(view));
            }
        }

        public boolean b() {
            return false;
        }

        boolean b(View view, int i, int i2, i iVar) {
            return (!view.isLayoutRequested() && this.a && b(view.getWidth(), i, iVar.width) && b(view.getHeight(), i2, iVar.height)) ? false : true;
        }

        public int c(t tVar) {
            return 0;
        }

        public Parcelable c() {
            return null;
        }

        public View c(int i) {
            int u = u();
            for (int i2 = 0; i2 < u; i2++) {
                View i3 = i(i2);
                w e = RecyclerView.e(i3);
                if (e != null && e.d() == i && !e.c() && (this.q.A.a() || !e.q())) {
                    return i3;
                }
            }
            return null;
        }

        void c(int i, int i2) {
            this.e = MeasureSpec.getSize(i);
            this.c = MeasureSpec.getMode(i);
            if (this.c == 0 && !RecyclerView.b) {
                this.e = 0;
            }
            this.f = MeasureSpec.getSize(i2);
            this.d = MeasureSpec.getMode(i2);
            if (this.d == 0 && !RecyclerView.b) {
                this.f = 0;
            }
        }

        public void c(o oVar) {
            for (int u = u() - 1; u >= 0; u--) {
                if (!RecyclerView.e(i(u)).c()) {
                    a(u, oVar);
                }
            }
        }

        public void c(o oVar, t tVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        void c(RecyclerView recyclerView) {
            this.t = true;
            d(recyclerView);
        }

        public void c(RecyclerView recyclerView, int i, int i2) {
        }

        public void c(View view) {
            this.p.a(view);
        }

        public void c(View view, int i) {
            a(view, i, (i) view.getLayoutParams());
        }

        public void c(boolean z) {
            this.u = z;
        }

        public int d(o oVar, t tVar) {
            return 0;
        }

        public int d(t tVar) {
            return 0;
        }

        public int d(View view) {
            return ((i) view.getLayoutParams()).f();
        }

        public View d(View view, int i) {
            return null;
        }

        void d(int i, int i2) {
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            int u = u();
            if (u == 0) {
                this.q.e(i, i2);
                return;
            }
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < u; i7++) {
                View i8 = i(i7);
                Rect rect = this.q.j;
                a(i8, rect);
                if (rect.left < i6) {
                    i6 = rect.left;
                }
                if (rect.right > i5) {
                    i5 = rect.right;
                }
                if (rect.top < i3) {
                    i3 = rect.top;
                }
                if (rect.bottom > i4) {
                    i4 = rect.bottom;
                }
            }
            this.q.j.set(i6, i3, i5, i4);
            a(this.q.j, i, i2);
        }

        public void d(RecyclerView recyclerView) {
        }

        public boolean d() {
            return false;
        }

        public int e(t tVar) {
            return 0;
        }

        public View e(View view) {
            if (this.q == null) {
                return null;
            }
            View c = this.q.c(view);
            return (c == null || this.p.c(c)) ? null : c;
        }

        public void e(int i) {
        }

        public void e(int i, int i2) {
            View i3 = i(i);
            if (i3 == null) {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i);
            }
            h(i);
            c(i3, i2);
        }

        @Deprecated
        public void e(RecyclerView recyclerView) {
        }

        public boolean e() {
            return false;
        }

        public boolean e(o oVar, t tVar) {
            return false;
        }

        public int f(t tVar) {
            return 0;
        }

        public int f(View view) {
            Rect rect = ((i) view.getLayoutParams()).d;
            return rect.right + (view.getMeasuredWidth() + rect.left);
        }

        public void f(int i, int i2) {
            this.q.setMeasuredDimension(i, i2);
        }

        void f(RecyclerView recyclerView) {
            c(MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public int g(t tVar) {
            return 0;
        }

        public int g(View view) {
            Rect rect = ((i) view.getLayoutParams()).d;
            return rect.bottom + (view.getMeasuredHeight() + rect.top);
        }

        public void g(int i) {
            if (i(i) != null) {
                this.p.a(i);
            }
        }

        public int h(t tVar) {
            return 0;
        }

        public int h(View view) {
            return view.getLeft() - n(view);
        }

        public void h(int i) {
            a(i, i(i));
        }

        public int i(View view) {
            return view.getTop() - l(view);
        }

        public View i(int i) {
            return this.p != null ? this.p.b(i) : null;
        }

        public int j(View view) {
            return view.getRight() + o(view);
        }

        public void j(int i) {
            if (this.q != null) {
                this.q.e(i);
            }
        }

        public int k(View view) {
            return view.getBottom() + m(view);
        }

        public void k(int i) {
            if (this.q != null) {
                this.q.d(i);
            }
        }

        boolean k() {
            return false;
        }

        public int l(View view) {
            return ((i) view.getLayoutParams()).d.top;
        }

        public void l(int i) {
        }

        public int m(View view) {
            return ((i) view.getLayoutParams()).d.bottom;
        }

        public int n(View view) {
            return ((i) view.getLayoutParams()).d.left;
        }

        public void n() {
            if (this.q != null) {
                this.q.requestLayout();
            }
        }

        public int o(View view) {
            return ((i) view.getLayoutParams()).d.right;
        }

        public final boolean o() {
            return this.b;
        }

        public boolean p() {
            return this.t;
        }

        public boolean q() {
            return this.q != null && this.q.h;
        }

        public boolean r() {
            return this.r != null && this.r.h();
        }

        public int s() {
            return ah.h(this.q);
        }

        public int t() {
            return -1;
        }

        public int u() {
            return this.p != null ? this.p.b() : 0;
        }

        public int v() {
            return this.c;
        }

        public int w() {
            return this.d;
        }

        public int x() {
            return this.e;
        }

        public int y() {
            return this.f;
        }

        public int z() {
            return this.q != null ? this.q.getPaddingLeft() : 0;
        }
    }

    static class b extends Observable<c> {
        b() {
        }

        public void a() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).a();
            }
        }

        public void a(int i, int i2) {
            a(i, i2, null);
        }

        public void a(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).a(i, i2, obj);
            }
        }
    }

    public static abstract class c {
        public void a() {
        }

        public void a(int i, int i2) {
        }

        public void a(int i, int i2, Object obj) {
            a(i, i2);
        }
    }

    public interface d {
        int a(int i, int i2);
    }

    public static abstract class e {
        private b a = null;
        private ArrayList<a> b = new ArrayList();
        private long c = 120;
        private long d = 120;
        private long e = 250;
        private long f = 250;

        public interface a {
            void a();
        }

        interface b {
            void a(w wVar);
        }

        public static class c {
            public int a;
            public int b;
            public int c;
            public int d;

            public c a(w wVar) {
                return a(wVar, 0);
            }

            public c a(w wVar, int i) {
                View view = wVar.a;
                this.a = view.getLeft();
                this.b = view.getTop();
                this.c = view.getRight();
                this.d = view.getBottom();
                return this;
            }
        }

        static int e(w wVar) {
            int d = wVar.n & 14;
            if (wVar.n()) {
                return 4;
            }
            if ((d & 4) != 0) {
                return d;
            }
            int f = wVar.f();
            int e = wVar.e();
            return (f == -1 || e == -1 || f == e) ? d : d | 2048;
        }

        public c a(t tVar, w wVar) {
            return j().a(wVar);
        }

        public c a(t tVar, w wVar, int i, List<Object> list) {
            return j().a(wVar);
        }

        public abstract void a();

        void a(b bVar) {
            this.a = bVar;
        }

        public abstract boolean a(w wVar, c cVar, c cVar2);

        public abstract boolean a(w wVar, w wVar2, c cVar, c cVar2);

        public boolean a(w wVar, List<Object> list) {
            return h(wVar);
        }

        public abstract boolean b();

        public abstract boolean b(w wVar, c cVar, c cVar2);

        public abstract boolean c(w wVar, c cVar, c cVar2);

        public abstract void d();

        public abstract void d(w wVar);

        public long e() {
            return this.e;
        }

        public long f() {
            return this.c;
        }

        public final void f(w wVar) {
            g(wVar);
            if (this.a != null) {
                this.a.a(wVar);
            }
        }

        public long g() {
            return this.d;
        }

        public void g(w wVar) {
        }

        public long h() {
            return this.f;
        }

        public boolean h(w wVar) {
            return true;
        }

        public final void i() {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                ((a) this.b.get(i)).a();
            }
            this.b.clear();
        }

        public c j() {
            return new c();
        }
    }

    private class f implements b {
        final /* synthetic */ RecyclerView a;

        f(RecyclerView recyclerView) {
            this.a = recyclerView;
        }

        public void a(w wVar) {
            wVar.a(true);
            if (wVar.h != null && wVar.i == null) {
                wVar.h = null;
            }
            wVar.i = null;
            if (!wVar.z() && !this.a.a(wVar.a) && wVar.r()) {
                this.a.removeDetachedView(wVar.a, false);
            }
        }
    }

    public static abstract class g {
        @Deprecated
        public void a(Canvas canvas, RecyclerView recyclerView) {
        }

        public void a(Canvas canvas, RecyclerView recyclerView, t tVar) {
            a(canvas, recyclerView);
        }

        @Deprecated
        public void a(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void a(Rect rect, View view, RecyclerView recyclerView, t tVar) {
            a(rect, ((i) view.getLayoutParams()).f(), recyclerView);
        }

        @Deprecated
        public void b(Canvas canvas, RecyclerView recyclerView) {
        }

        public void b(Canvas canvas, RecyclerView recyclerView, t tVar) {
            b(canvas, recyclerView);
        }
    }

    public interface j {
        void a(View view);

        void b(View view);
    }

    public static abstract class k {
        public abstract boolean a(int i, int i2);
    }

    public interface l {
        void a(boolean z);

        boolean a(RecyclerView recyclerView, MotionEvent motionEvent);

        void b(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    public static abstract class m {
        public void a(RecyclerView recyclerView, int i) {
        }

        public void a(RecyclerView recyclerView, int i, int i2) {
        }
    }

    public static class n {
        SparseArray<a> a = new SparseArray();
        private int b = 0;

        static class a {
            ArrayList<w> a = new ArrayList();
            int b = 5;
            long c = 0;
            long d = 0;

            a() {
            }
        }

        private a b(int i) {
            a aVar = (a) this.a.get(i);
            if (aVar != null) {
                return aVar;
            }
            aVar = new a();
            this.a.put(i, aVar);
            return aVar;
        }

        long a(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        public w a(int i) {
            a aVar = (a) this.a.get(i);
            if (aVar == null || aVar.a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.a;
            return (w) arrayList.remove(arrayList.size() - 1);
        }

        public void a() {
            for (int i = 0; i < this.a.size(); i++) {
                ((a) this.a.valueAt(i)).a.clear();
            }
        }

        void a(int i, long j) {
            a b = b(i);
            b.c = a(b.c, j);
        }

        void a(a aVar) {
            this.b++;
        }

        void a(a aVar, a aVar2, boolean z) {
            if (aVar != null) {
                b();
            }
            if (!z && this.b == 0) {
                a();
            }
            if (aVar2 != null) {
                a(aVar2);
            }
        }

        public void a(w wVar) {
            int h = wVar.h();
            ArrayList arrayList = b(h).a;
            if (((a) this.a.get(h)).b > arrayList.size()) {
                wVar.v();
                arrayList.add(wVar);
            }
        }

        boolean a(int i, long j, long j2) {
            long j3 = b(i).c;
            return j3 == 0 || j3 + j < j2;
        }

        void b() {
            this.b--;
        }

        void b(int i, long j) {
            a b = b(i);
            b.d = a(b.d, j);
        }

        boolean b(int i, long j, long j2) {
            long j3 = b(i).d;
            return j3 == 0 || j3 + j < j2;
        }
    }

    public final class o {
        final ArrayList<w> a = new ArrayList();
        ArrayList<w> b = null;
        final ArrayList<w> c = new ArrayList();
        int d = 2;
        n e;
        final /* synthetic */ RecyclerView f;
        private final List<w> g = Collections.unmodifiableList(this.a);
        private int h = 2;
        private u i;

        public o(RecyclerView recyclerView) {
            this.f = recyclerView;
        }

        private void a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    a((ViewGroup) childAt, true);
                }
            }
            if (!z) {
                return;
            }
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
                return;
            }
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }

        private boolean a(w wVar, int i, int i2, long j) {
            wVar.m = this.f;
            int h = wVar.h();
            long nanoTime = this.f.getNanoTime();
            if (j != Long.MAX_VALUE && !this.e.b(h, nanoTime, j)) {
                return false;
            }
            this.f.l.b(wVar, i);
            this.e.b(wVar.h(), this.f.getNanoTime() - nanoTime);
            d(wVar.a);
            if (this.f.A.a()) {
                wVar.g = i2;
            }
            return true;
        }

        private void d(View view) {
            if (this.f.m()) {
                if (ah.e(view) == 0) {
                    ah.c(view, 1);
                }
                if (!ah.b(view)) {
                    ah.a(view, this.f.E.c());
                }
            }
        }

        private void e(w wVar) {
            if (wVar.a instanceof ViewGroup) {
                a((ViewGroup) wVar.a, false);
            }
        }

        w a(int i, boolean z, long j) {
            boolean z2 = true;
            if (i < 0 || i >= this.f.A.e()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + this.f.A.e());
            }
            w f;
            boolean z3;
            w wVar;
            boolean z4;
            i iVar;
            if (this.f.A.a()) {
                f = f(i);
                z3 = f != null;
                wVar = f;
            } else {
                wVar = null;
                z3 = false;
            }
            if (wVar == null) {
                wVar = b(i, z);
                if (wVar != null) {
                    if (a(wVar)) {
                        z3 = true;
                    } else {
                        if (!z) {
                            wVar.b(4);
                            if (wVar.i()) {
                                this.f.removeDetachedView(wVar.a, false);
                                wVar.j();
                            } else if (wVar.k()) {
                                wVar.l();
                            }
                            b(wVar);
                        }
                        wVar = null;
                    }
                }
            }
            if (wVar == null) {
                int b = this.f.e.b(i);
                if (b < 0 || b >= this.f.l.a()) {
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + b + ")." + "state:" + this.f.A.e());
                }
                boolean z5;
                View a;
                long nanoTime;
                RecyclerView j2;
                int b2 = this.f.l.b(b);
                if (this.f.l.d()) {
                    wVar = a(this.f.l.a(b), b2, z);
                    if (wVar != null) {
                        wVar.c = b;
                        z5 = true;
                        if (wVar == null && this.i != null) {
                            a = this.i.a(this, i, b2);
                            if (a != null) {
                                wVar = this.f.b(a);
                                if (wVar == null) {
                                    throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder");
                                } else if (wVar.c()) {
                                    throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                                }
                            }
                        }
                        if (wVar == null) {
                            wVar = g().a(b2);
                            if (wVar != null) {
                                wVar.v();
                                if (RecyclerView.a) {
                                    e(wVar);
                                }
                            }
                        }
                        if (wVar == null) {
                            nanoTime = this.f.getNanoTime();
                            if (j == Long.MAX_VALUE && !this.e.a(b2, nanoTime, j)) {
                                return null;
                            }
                            wVar = this.f.l.c(this.f, b2);
                            if (RecyclerView.J) {
                                j2 = RecyclerView.j(wVar.a);
                                if (j2 != null) {
                                    wVar.b = new WeakReference(j2);
                                }
                            }
                            this.e.a(b2, this.f.getNanoTime() - nanoTime);
                        }
                        f = wVar;
                        z4 = z5;
                    }
                }
                z5 = z3;
                a = this.i.a(this, i, b2);
                if (a != null) {
                    wVar = this.f.b(a);
                    if (wVar == null) {
                        throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder");
                    } else if (wVar.c()) {
                        throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                    }
                }
                if (wVar == null) {
                    wVar = g().a(b2);
                    if (wVar != null) {
                        wVar.v();
                        if (RecyclerView.a) {
                            e(wVar);
                        }
                    }
                }
                if (wVar == null) {
                    nanoTime = this.f.getNanoTime();
                    if (j == Long.MAX_VALUE) {
                    }
                    wVar = this.f.l.c(this.f, b2);
                    if (RecyclerView.J) {
                        j2 = RecyclerView.j(wVar.a);
                        if (j2 != null) {
                            wVar.b = new WeakReference(j2);
                        }
                    }
                    this.e.a(b2, this.f.getNanoTime() - nanoTime);
                }
                f = wVar;
                z4 = z5;
            } else {
                f = wVar;
                z4 = z3;
            }
            if (z4 && !this.f.A.a() && f.a(8192)) {
                f.a(0, 8192);
                if (this.f.A.i) {
                    this.f.a(f, this.f.w.a(this.f.A, f, e.e(f) | 4096, f.u()));
                }
            }
            int i2;
            if (this.f.A.a() && f.p()) {
                f.g = i;
                i2 = 0;
            } else if (!f.p() || f.o() || f.n()) {
                z3 = a(f, this.f.e.b(i), i, j);
            } else {
                i2 = 0;
            }
            LayoutParams layoutParams = f.a.getLayoutParams();
            if (layoutParams == null) {
                iVar = (i) this.f.generateDefaultLayoutParams();
                f.a.setLayoutParams(iVar);
            } else if (this.f.checkLayoutParams(layoutParams)) {
                iVar = (i) layoutParams;
            } else {
                iVar = (i) this.f.generateLayoutParams(layoutParams);
                f.a.setLayoutParams(iVar);
            }
            iVar.c = f;
            if (!z4 || r2 == 0) {
                z2 = false;
            }
            iVar.f = z2;
            return f;
        }

        w a(long j, int i, boolean z) {
            int size;
            for (size = this.a.size() - 1; size >= 0; size--) {
                w wVar = (w) this.a.get(size);
                if (wVar.g() == j && !wVar.k()) {
                    if (i == wVar.h()) {
                        wVar.b(32);
                        if (!wVar.q() || this.f.A.a()) {
                            return wVar;
                        }
                        wVar.a(2, 14);
                        return wVar;
                    } else if (!z) {
                        this.a.remove(size);
                        this.f.removeDetachedView(wVar.a, false);
                        b(wVar.a);
                    }
                }
            }
            for (size = this.c.size() - 1; size >= 0; size--) {
                wVar = (w) this.c.get(size);
                if (wVar.g() == j) {
                    if (i == wVar.h()) {
                        if (z) {
                            return wVar;
                        }
                        this.c.remove(size);
                        return wVar;
                    } else if (!z) {
                        d(size);
                        return null;
                    }
                }
            }
            return null;
        }

        View a(int i, boolean z) {
            return a(i, z, Long.MAX_VALUE).a;
        }

        public void a() {
            this.a.clear();
            d();
        }

        public void a(int i) {
            this.h = i;
            b();
        }

        void a(int i, int i2) {
            int i3;
            int i4;
            int i5;
            if (i < i2) {
                i3 = -1;
                i4 = i2;
                i5 = i;
            } else {
                i3 = 1;
                i4 = i;
                i5 = i2;
            }
            int size = this.c.size();
            for (int i6 = 0; i6 < size; i6++) {
                w wVar = (w) this.c.get(i6);
                if (wVar != null && wVar.c >= r3 && wVar.c <= r2) {
                    if (wVar.c == i) {
                        wVar.a(i2 - i, false);
                    } else {
                        wVar.a(i3, false);
                    }
                }
            }
        }

        void a(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                w wVar = (w) this.c.get(size);
                if (wVar != null) {
                    if (wVar.c >= i3) {
                        wVar.a(-i2, z);
                    } else if (wVar.c >= i) {
                        wVar.b(8);
                        d(size);
                    }
                }
            }
        }

        void a(a aVar, a aVar2, boolean z) {
            a();
            g().a(aVar, aVar2, z);
        }

        void a(n nVar) {
            if (this.e != null) {
                this.e.b();
            }
            this.e = nVar;
            if (nVar != null) {
                this.e.a(this.f.getAdapter());
            }
        }

        void a(u uVar) {
            this.i = uVar;
        }

        void a(w wVar, boolean z) {
            RecyclerView.c(wVar);
            ah.a(wVar.a, null);
            if (z) {
                d(wVar);
            }
            wVar.m = null;
            g().a(wVar);
        }

        public void a(View view) {
            w e = RecyclerView.e(view);
            if (e.r()) {
                this.f.removeDetachedView(view, false);
            }
            if (e.i()) {
                e.j();
            } else if (e.k()) {
                e.l();
            }
            b(e);
        }

        boolean a(w wVar) {
            if (wVar.q()) {
                return this.f.A.a();
            }
            if (wVar.c >= 0 && wVar.c < this.f.l.a()) {
                return (this.f.A.a() || this.f.l.b(wVar.c) == wVar.h()) ? !this.f.l.d() || wVar.g() == this.f.l.a(wVar.c) : false;
            } else {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + wVar);
            }
        }

        public int b(int i) {
            if (i >= 0 && i < this.f.A.e()) {
                return !this.f.A.a() ? i : this.f.e.b(i);
            } else {
                throw new IndexOutOfBoundsException("invalid position " + i + ". State " + "item count is " + this.f.A.e());
            }
        }

        w b(int i, boolean z) {
            int i2 = 0;
            int size = this.a.size();
            int i3 = 0;
            while (i3 < size) {
                w wVar = (w) this.a.get(i3);
                if (wVar.k() || wVar.d() != i || wVar.n() || (!this.f.A.f && wVar.q())) {
                    i3++;
                } else {
                    wVar.b(32);
                    return wVar;
                }
            }
            if (!z) {
                View c = this.f.f.c(i);
                if (c != null) {
                    wVar = RecyclerView.e(c);
                    this.f.f.e(c);
                    i2 = this.f.f.b(c);
                    if (i2 == -1) {
                        throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + wVar);
                    }
                    this.f.f.e(i2);
                    c(c);
                    wVar.b(8224);
                    return wVar;
                }
            }
            i3 = this.c.size();
            while (i2 < i3) {
                wVar = (w) this.c.get(i2);
                if (wVar.n() || wVar.d() != i) {
                    i2++;
                } else if (z) {
                    return wVar;
                } else {
                    this.c.remove(i2);
                    return wVar;
                }
            }
            return null;
        }

        void b() {
            this.d = (this.f.m != null ? this.f.m.v : 0) + this.h;
            for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.d; size--) {
                d(size);
            }
        }

        void b(int i, int i2) {
            int size = this.c.size();
            for (int i3 = 0; i3 < size; i3++) {
                w wVar = (w) this.c.get(i3);
                if (wVar != null && wVar.c >= i) {
                    wVar.a(i2, true);
                }
            }
        }

        void b(w wVar) {
            int i = 0;
            if (wVar.i() || wVar.a.getParent() != null) {
                throw new IllegalArgumentException("Scrapped or attached views may not be recycled. isScrap:" + wVar.i() + " isAttached:" + (wVar.a.getParent() != null));
            } else if (wVar.r()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + wVar);
            } else if (wVar.c()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
            } else {
                int size;
                boolean a = wVar.A();
                boolean z = this.f.l != null && a && this.f.l.b(wVar);
                if (z || wVar.w()) {
                    if (this.d <= 0 || wVar.a(526)) {
                        z = false;
                    } else {
                        size = this.c.size();
                        if (size >= this.d && size > 0) {
                            d(0);
                            size--;
                        }
                        if (RecyclerView.J && size > 0 && !this.f.z.a(wVar.c)) {
                            int i2 = size - 1;
                            while (i2 >= 0) {
                                if (!this.f.z.a(((w) this.c.get(i2)).c)) {
                                    break;
                                }
                                i2--;
                            }
                            size = i2 + 1;
                        }
                        this.c.add(size, wVar);
                        size = true;
                    }
                    if (!size != false) {
                        a(wVar, true);
                        i = 1;
                    }
                } else {
                    size = 0;
                }
                this.f.g.g(wVar);
                if (size == 0 && r2 == 0 && a) {
                    wVar.m = null;
                }
            }
        }

        void b(View view) {
            w e = RecyclerView.e(view);
            e.q = null;
            e.r = false;
            e.l();
            b(e);
        }

        public View c(int i) {
            return a(i, false);
        }

        public List<w> c() {
            return this.g;
        }

        void c(int i, int i2) {
            int i3 = i + i2;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                w wVar = (w) this.c.get(size);
                if (wVar != null) {
                    int d = wVar.d();
                    if (d >= i && d < i3) {
                        wVar.b(2);
                        d(size);
                    }
                }
            }
        }

        void c(w wVar) {
            if (wVar.r) {
                this.b.remove(wVar);
            } else {
                this.a.remove(wVar);
            }
            wVar.q = null;
            wVar.r = false;
            wVar.l();
        }

        void c(View view) {
            w e = RecyclerView.e(view);
            if (!e.a(12) && e.x() && !this.f.b(e)) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                e.a(this, true);
                this.b.add(e);
            } else if (!e.n() || e.q() || this.f.l.d()) {
                e.a(this, false);
                this.a.add(e);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
            }
        }

        void d() {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                d(size);
            }
            this.c.clear();
            if (RecyclerView.J) {
                this.f.z.a();
            }
        }

        void d(int i) {
            a((w) this.c.get(i), true);
            this.c.remove(i);
        }

        void d(w wVar) {
            if (this.f.n != null) {
                this.f.n.a(wVar);
            }
            if (this.f.l != null) {
                this.f.l.a(wVar);
            }
            if (this.f.A != null) {
                this.f.g.g(wVar);
            }
        }

        int e() {
            return this.a.size();
        }

        View e(int i) {
            return ((w) this.a.get(i)).a;
        }

        w f(int i) {
            int i2 = 0;
            if (this.b != null) {
                int size = this.b.size();
                if (size != 0) {
                    w wVar;
                    int i3 = 0;
                    while (i3 < size) {
                        wVar = (w) this.b.get(i3);
                        if (wVar.k() || wVar.d() != i) {
                            i3++;
                        } else {
                            wVar.b(32);
                            return wVar;
                        }
                    }
                    if (this.f.l.d()) {
                        int b = this.f.e.b(i);
                        if (b > 0 && b < this.f.l.a()) {
                            long a = this.f.l.a(b);
                            while (i2 < size) {
                                wVar = (w) this.b.get(i2);
                                if (wVar.k() || wVar.g() != a) {
                                    i2++;
                                } else {
                                    wVar.b(32);
                                    return wVar;
                                }
                            }
                        }
                    }
                    return null;
                }
            }
            return null;
        }

        void f() {
            this.a.clear();
            if (this.b != null) {
                this.b.clear();
            }
        }

        n g() {
            if (this.e == null) {
                this.e = new n();
            }
            return this.e;
        }

        void h() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                w wVar = (w) this.c.get(i);
                if (wVar != null) {
                    wVar.b(512);
                }
            }
        }

        void i() {
            if (this.f.l == null || !this.f.l.d()) {
                d();
                return;
            }
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                w wVar = (w) this.c.get(i);
                if (wVar != null) {
                    wVar.b(6);
                    wVar.a(null);
                }
            }
        }

        void j() {
            int i;
            int i2 = 0;
            int size = this.c.size();
            for (i = 0; i < size; i++) {
                ((w) this.c.get(i)).a();
            }
            size = this.a.size();
            for (i = 0; i < size; i++) {
                ((w) this.a.get(i)).a();
            }
            if (this.b != null) {
                i = this.b.size();
                while (i2 < i) {
                    ((w) this.b.get(i2)).a();
                    i2++;
                }
            }
        }

        void k() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                i iVar = (i) ((w) this.c.get(i)).a.getLayoutParams();
                if (iVar != null) {
                    iVar.e = true;
                }
            }
        }
    }

    public interface p {
        void a(w wVar);
    }

    private class q extends c {
        final /* synthetic */ RecyclerView a;

        q(RecyclerView recyclerView) {
            this.a = recyclerView;
        }

        public void a() {
            this.a.a(null);
            this.a.A.e = true;
            this.a.t();
            if (!this.a.e.d()) {
                this.a.requestLayout();
            }
        }

        public void a(int i, int i2, Object obj) {
            this.a.a(null);
            if (this.a.e.a(i, i2, obj)) {
                b();
            }
        }

        void b() {
            if (RecyclerView.c && this.a.q && this.a.p) {
                ah.a(this.a, this.a.i);
                return;
            }
            this.a.u = true;
            this.a.requestLayout();
        }
    }

    public static class r extends android.support.v4.view.a {
        public static final Creator<r> CREATOR = android.support.v4.g.d.a(new android.support.v4.g.e<r>() {
            public r a(Parcel parcel, ClassLoader classLoader) {
                return new r(parcel, classLoader);
            }

            public r[] a(int i) {
                return new r[i];
            }

            public /* synthetic */ Object b(Parcel parcel, ClassLoader classLoader) {
                return a(parcel, classLoader);
            }

            public /* synthetic */ Object[] b(int i) {
                return a(i);
            }
        });
        Parcelable a;

        r(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = h.class.getClassLoader();
            }
            this.a = parcel.readParcelable(classLoader);
        }

        r(Parcelable parcelable) {
            super(parcelable);
        }

        void a(r rVar) {
            this.a = rVar.a;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.a, 0);
        }
    }

    public static abstract class s {
        private int a = -1;
        private RecyclerView b;
        private h c;
        private boolean d;
        private boolean e;
        private View f;
        private final a g = new a(0, 0);

        public interface b {
            PointF d(int i);
        }

        public static class a {
            private int a;
            private int b;
            private int c;
            private int d;
            private Interpolator e;
            private boolean f;
            private int g;

            public a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            public a(int i, int i2, int i3, Interpolator interpolator) {
                this.d = -1;
                this.f = false;
                this.g = 0;
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = interpolator;
            }

            private void b() {
                if (this.e != null && this.c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public void a(int i) {
                this.d = i;
            }

            public void a(int i, int i2, int i3, Interpolator interpolator) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = interpolator;
                this.f = true;
            }

            void a(RecyclerView recyclerView) {
                if (this.d >= 0) {
                    int i = this.d;
                    this.d = -1;
                    recyclerView.a(i);
                    this.f = false;
                } else if (this.f) {
                    b();
                    if (this.e != null) {
                        recyclerView.x.a(this.a, this.b, this.c, this.e);
                    } else if (this.c == Integer.MIN_VALUE) {
                        recyclerView.x.b(this.a, this.b);
                    } else {
                        recyclerView.x.a(this.a, this.b, this.c);
                    }
                    this.g++;
                    if (this.g > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f = false;
                } else {
                    this.g = 0;
                }
            }

            boolean a() {
                return this.d >= 0;
            }
        }

        private void a(int i, int i2) {
            RecyclerView recyclerView = this.b;
            if (!this.e || this.a == -1 || recyclerView == null) {
                f();
            }
            this.d = false;
            if (this.f != null) {
                if (a(this.f) == this.a) {
                    a(this.f, recyclerView.A, this.g);
                    this.g.a(recyclerView);
                    f();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f = null;
                }
            }
            if (this.e) {
                a(i, i2, recyclerView.A, this.g);
                boolean a = this.g.a();
                this.g.a(recyclerView);
                if (!a) {
                    return;
                }
                if (this.e) {
                    this.d = true;
                    recyclerView.x.a();
                    return;
                }
                f();
            }
        }

        public int a(View view) {
            return this.b.f(view);
        }

        protected abstract void a();

        protected abstract void a(int i, int i2, t tVar, a aVar);

        protected void a(PointF pointF) {
            double sqrt = Math.sqrt((double) ((pointF.x * pointF.x) + (pointF.y * pointF.y)));
            pointF.x = (float) (((double) pointF.x) / sqrt);
            pointF.y = (float) (((double) pointF.y) / sqrt);
        }

        void a(RecyclerView recyclerView, h hVar) {
            this.b = recyclerView;
            this.c = hVar;
            if (this.a == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            this.b.A.n = this.a;
            this.e = true;
            this.d = true;
            this.f = e(i());
            a();
            this.b.x.a();
        }

        protected abstract void a(View view, t tVar, a aVar);

        protected abstract void b();

        protected void b(View view) {
            if (a(view) == i()) {
                this.f = view;
            }
        }

        public void d(int i) {
            this.a = i;
        }

        public h e() {
            return this.c;
        }

        public View e(int i) {
            return this.b.m.c(i);
        }

        protected final void f() {
            if (this.e) {
                b();
                this.b.A.n = -1;
                this.f = null;
                this.a = -1;
                this.d = false;
                this.e = false;
                this.c.b(this);
                this.c = null;
                this.b = null;
            }
        }

        public boolean g() {
            return this.d;
        }

        public boolean h() {
            return this.e;
        }

        public int i() {
            return this.a;
        }

        public int j() {
            return this.b.m.u();
        }
    }

    public static class t {
        int a = 0;
        int b = 0;
        int c = 1;
        int d = 0;
        boolean e = false;
        boolean f = false;
        boolean g = false;
        boolean h = false;
        boolean i = false;
        boolean j = false;
        int k;
        long l;
        int m;
        private int n = -1;
        private SparseArray<Object> o;

        void a(int i) {
            if ((this.c & i) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.c));
            }
        }

        void a(a aVar) {
            this.c = 1;
            this.d = aVar.a();
            this.e = false;
            this.f = false;
            this.g = false;
            this.h = false;
        }

        public boolean a() {
            return this.f;
        }

        public boolean b() {
            return this.j;
        }

        public int c() {
            return this.n;
        }

        public boolean d() {
            return this.n != -1;
        }

        public int e() {
            return this.f ? this.a - this.b : this.d;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.n + ", mData=" + this.o + ", mItemCount=" + this.d + ", mPreviousLayoutItemCount=" + this.a + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.b + ", mStructureChanged=" + this.e + ", mInPreLayout=" + this.f + ", mRunSimpleAnimations=" + this.i + ", mRunPredictiveAnimations=" + this.j + '}';
        }
    }

    public static abstract class u {
        public abstract View a(o oVar, int i, int i2);
    }

    class v implements Runnable {
        Interpolator a = RecyclerView.G;
        final /* synthetic */ RecyclerView b;
        private int c;
        private int d;
        private android.support.v4.widget.v e;
        private boolean f = false;
        private boolean g = false;

        public v(RecyclerView recyclerView) {
            this.b = recyclerView;
            this.e = android.support.v4.widget.v.a(recyclerView.getContext(), RecyclerView.G);
        }

        private float a(float f) {
            return (float) Math.sin((double) ((float) (((double) (f - 0.5f)) * 0.4712389167638204d)));
        }

        private int b(int i, int i2, int i3, int i4) {
            int round;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            Object obj = abs > abs2 ? 1 : null;
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            int width = obj != null ? this.b.getWidth() : this.b.getHeight();
            int i5 = width / 2;
            float a = (a(Math.min(1.0f, (((float) sqrt2) * 1.0f) / ((float) width))) * ((float) i5)) + ((float) i5);
            if (sqrt > 0) {
                round = Math.round(1000.0f * Math.abs(a / ((float) sqrt))) * 4;
            } else {
                round = (int) (((((float) (obj != null ? abs : abs2)) / ((float) width)) + 1.0f) * 300.0f);
            }
            return Math.min(round, 2000);
        }

        private void c() {
            this.g = false;
            this.f = true;
        }

        private void d() {
            this.f = false;
            if (this.g) {
                a();
            }
        }

        void a() {
            if (this.f) {
                this.g = true;
                return;
            }
            this.b.removeCallbacks(this);
            ah.a(this.b, (Runnable) this);
        }

        public void a(int i, int i2) {
            this.b.setScrollState(2);
            this.d = 0;
            this.c = 0;
            this.e.a(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            a();
        }

        public void a(int i, int i2, int i3) {
            a(i, i2, i3, RecyclerView.G);
        }

        public void a(int i, int i2, int i3, int i4) {
            a(i, i2, b(i, i2, i3, i4));
        }

        public void a(int i, int i2, int i3, Interpolator interpolator) {
            if (this.a != interpolator) {
                this.a = interpolator;
                this.e = android.support.v4.widget.v.a(this.b.getContext(), interpolator);
            }
            this.b.setScrollState(2);
            this.d = 0;
            this.c = 0;
            this.e.a(0, 0, i, i2, i3);
            a();
        }

        public void a(int i, int i2, Interpolator interpolator) {
            int b = b(i, i2, 0, 0);
            if (interpolator == null) {
                interpolator = RecyclerView.G;
            }
            a(i, i2, b, interpolator);
        }

        public void b() {
            this.b.removeCallbacks(this);
            this.e.h();
        }

        public void b(int i, int i2) {
            a(i, i2, 0, 0);
        }

        public void run() {
            if (this.b.m == null) {
                b();
                return;
            }
            c();
            this.b.c();
            android.support.v4.widget.v vVar = this.e;
            s sVar = this.b.m.r;
            if (vVar.g()) {
                int e;
                int i;
                int f;
                int i2;
                Object obj;
                Object obj2;
                int b = vVar.b();
                int c = vVar.c();
                int i3 = b - this.c;
                int i4 = c - this.d;
                int i5 = 0;
                int i6 = 0;
                this.c = b;
                this.d = c;
                int i7 = 0;
                int i8 = 0;
                if (this.b.l != null) {
                    this.b.d();
                    this.b.k();
                    android.support.v4.g.h.a("RV Scroll");
                    if (i3 != 0) {
                        i5 = this.b.m.a(i3, this.b.d, this.b.A);
                        i7 = i3 - i5;
                    }
                    if (i4 != 0) {
                        i6 = this.b.m.b(i4, this.b.d, this.b.A);
                        i8 = i4 - i6;
                    }
                    android.support.v4.g.h.a();
                    this.b.w();
                    this.b.l();
                    this.b.a(false);
                    if (!(sVar == null || sVar.g() || !sVar.h())) {
                        e = this.b.A.e();
                        if (e == 0) {
                            sVar.f();
                            i = i7;
                            i7 = i6;
                            i6 = i;
                        } else if (sVar.i() >= e) {
                            sVar.d(e - 1);
                            sVar.a(i3 - i7, i4 - i8);
                            i = i7;
                            i7 = i6;
                            i6 = i;
                        } else {
                            sVar.a(i3 - i7, i4 - i8);
                        }
                        if (!this.b.o.isEmpty()) {
                            this.b.invalidate();
                        }
                        if (this.b.getOverScrollMode() != 2) {
                            this.b.c(i3, i4);
                        }
                        if (!(i6 == 0 && i8 == 0)) {
                            f = (int) vVar.f();
                            if (i6 == b) {
                                e = i6 >= 0 ? -f : i6 <= 0 ? f : 0;
                                i2 = e;
                            } else {
                                i2 = 0;
                            }
                            if (i8 != c) {
                                f = 0;
                            } else if (i8 < 0) {
                                f = -f;
                            } else if (i8 <= 0) {
                                f = 0;
                            }
                            if (this.b.getOverScrollMode() != 2) {
                                this.b.d(i2, f);
                            }
                            if ((i2 != 0 || i6 == b || vVar.d() == 0) && (f != 0 || i8 == c || vVar.e() == 0)) {
                                vVar.h();
                            }
                        }
                        if (!(i5 == 0 && i7 == 0)) {
                            this.b.i(i5, i7);
                        }
                        if (!this.b.awakenScrollBars()) {
                            this.b.invalidate();
                        }
                        obj = (i4 == 0 && this.b.m.e() && i7 == i4) ? 1 : null;
                        obj2 = (i3 == 0 && this.b.m.d() && i5 == i3) ? 1 : null;
                        obj2 = ((i3 == 0 || i4 != 0) && obj2 == null && obj == null) ? null : 1;
                        if (!vVar.a() || obj2 == null) {
                            this.b.setScrollState(0);
                            if (RecyclerView.J) {
                                this.b.z.a();
                            }
                        } else {
                            a();
                            if (this.b.y != null) {
                                this.b.y.a(this.b, i3, i4);
                            }
                        }
                    }
                }
                i = i7;
                i7 = i6;
                i6 = i;
                if (this.b.o.isEmpty()) {
                    this.b.invalidate();
                }
                if (this.b.getOverScrollMode() != 2) {
                    this.b.c(i3, i4);
                }
                f = (int) vVar.f();
                if (i6 == b) {
                    i2 = 0;
                } else {
                    if (i6 >= 0) {
                        if (i6 <= 0) {
                        }
                    }
                    i2 = e;
                }
                if (i8 != c) {
                    f = 0;
                } else if (i8 < 0) {
                    f = -f;
                } else if (i8 <= 0) {
                    f = 0;
                }
                if (this.b.getOverScrollMode() != 2) {
                    this.b.d(i2, f);
                }
                vVar.h();
                this.b.i(i5, i7);
                if (this.b.awakenScrollBars()) {
                    this.b.invalidate();
                }
                if (i4 == 0) {
                }
                if (i3 == 0) {
                }
                if (i3 == 0) {
                }
                if (vVar.a()) {
                }
                this.b.setScrollState(0);
                if (RecyclerView.J) {
                    this.b.z.a();
                }
            }
            if (sVar != null) {
                if (sVar.g()) {
                    sVar.a(0, 0);
                }
                if (!this.g) {
                    sVar.f();
                }
            }
            d();
        }
    }

    static {
        boolean z = VERSION.SDK_INT == 18 || VERSION.SDK_INT == 19 || VERSION.SDK_INT == 20;
        a = z;
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        boolean z = true;
        super(context, attributeSet, i);
        this.N = new q(this);
        this.d = new o(this);
        this.g = new bo();
        this.i = new Runnable(this) {
            final /* synthetic */ RecyclerView a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.r && !this.a.isLayoutRequested()) {
                    if (!this.a.p) {
                        this.a.requestLayout();
                    } else if (this.a.t) {
                        this.a.s = true;
                    } else {
                        this.a.c();
                    }
                }
            }
        };
        this.j = new Rect();
        this.P = new Rect();
        this.k = new RectF();
        this.o = new ArrayList();
        this.Q = new ArrayList();
        this.S = 0;
        this.v = false;
        this.aa = 0;
        this.ab = 0;
        this.w = new ai();
        this.ag = 0;
        this.ah = -1;
        this.ar = Float.MIN_VALUE;
        this.as = true;
        this.x = new v(this);
        this.z = J ? new a() : null;
        this.A = new t();
        this.B = false;
        this.C = false;
        this.av = new f(this);
        this.D = false;
        this.ax = new int[2];
        this.az = new int[2];
        this.aA = new int[2];
        this.aB = new int[2];
        this.F = new ArrayList();
        this.aC = new Runnable(this) {
            final /* synthetic */ RecyclerView a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.w != null) {
                    this.a.w.a();
                }
                this.a.D = false;
            }
        };
        this.aD = new b(this) {
            final /* synthetic */ RecyclerView a;

            {
                this.a = r1;
            }

            public void a(w wVar) {
                this.a.m.a(wVar.a, this.a.d);
            }

            public void a(w wVar, c cVar, c cVar2) {
                this.a.d.c(wVar);
                this.a.b(wVar, cVar, cVar2);
            }

            public void b(w wVar, c cVar, c cVar2) {
                this.a.a(wVar, cVar, cVar2);
            }

            public void c(w wVar, c cVar, c cVar2) {
                wVar.a(false);
                if (this.a.v) {
                    if (this.a.w.a(wVar, wVar, cVar, cVar2)) {
                        this.a.o();
                    }
                } else if (this.a.w.c(wVar, cVar, cVar2)) {
                    this.a.o();
                }
            }
        };
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I, i, 0);
            this.h = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.h = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.an = viewConfiguration.getScaledTouchSlop();
        this.ap = viewConfiguration.getScaledMinimumFlingVelocity();
        this.aq = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.w.a(this.av);
        a();
        z();
        if (ah.e(this) == 0) {
            ah.c((View) this, 1);
        }
        this.V = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new ax(this));
        if (attributeSet != null) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RecyclerView, i, 0);
            String string = obtainStyledAttributes.getString(R.styleable.RecyclerView_layoutManager);
            if (obtainStyledAttributes.getInt(R.styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
                setDescendantFocusability(262144);
            }
            obtainStyledAttributes.recycle();
            a(context, string, attributeSet, i, 0);
            if (VERSION.SDK_INT >= 21) {
                obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H, i, 0);
                z = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
            }
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z);
    }

    private boolean A() {
        int b = this.f.b();
        for (int i = 0; i < b; i++) {
            w e = e(this.f.b(i));
            if (e != null && !e.c() && e.x()) {
                return true;
            }
        }
        return false;
    }

    private void B() {
        this.x.b();
        if (this.m != null) {
            this.m.G();
        }
    }

    private void C() {
        int i = 0;
        if (this.ac != null) {
            i = this.ac.c();
        }
        if (this.ad != null) {
            i |= this.ad.c();
        }
        if (this.ae != null) {
            i |= this.ae.c();
        }
        if (this.af != null) {
            i |= this.af.c();
        }
        if (i != 0) {
            ah.d(this);
        }
    }

    private void D() {
        if (this.ai != null) {
            this.ai.clear();
        }
        stopNestedScroll();
        C();
    }

    private void E() {
        D();
        setScrollState(0);
    }

    private void F() {
        int i = this.U;
        this.U = 0;
        if (i != 0 && m()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            android.support.v4.view.a.a.a(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private boolean G() {
        return this.w != null && this.m.b();
    }

    private void H() {
        boolean z = true;
        if (this.v) {
            this.e.a();
            this.m.a(this);
        }
        if (G()) {
            this.e.b();
        } else {
            this.e.e();
        }
        boolean z2 = this.B || this.C;
        t tVar = this.A;
        boolean z3 = this.r && this.w != null && ((this.v || z2 || this.m.s) && (!this.v || this.l.d()));
        tVar.i = z3;
        t tVar2 = this.A;
        if (!(this.A.i && z2 && !this.v && G())) {
            z = false;
        }
        tVar2.j = z;
    }

    private void I() {
        View focusedChild = (this.as && hasFocus() && this.l != null) ? getFocusedChild() : null;
        w d = focusedChild == null ? null : d(focusedChild);
        if (d == null) {
            J();
            return;
        }
        this.A.l = this.l.d() ? d.g() : -1;
        t tVar = this.A;
        int e = this.v ? -1 : d.q() ? d.d : d.e();
        tVar.k = e;
        this.A.m = m(d.a);
    }

    private void J() {
        this.A.l = -1;
        this.A.k = -1;
        this.A.m = -1;
    }

    private View K() {
        int i = this.A.k != -1 ? this.A.k : 0;
        int e = this.A.e();
        int i2 = i;
        while (i2 < e) {
            w c = c(i2);
            if (c == null) {
                break;
            } else if (c.a.hasFocusable()) {
                return c.a;
            } else {
                i2++;
            }
        }
        for (i = Math.min(e, i) - 1; i >= 0; i--) {
            w c2 = c(i);
            if (c2 == null) {
                return null;
            }
            if (c2.a.hasFocusable()) {
                return c2.a;
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void L() {
        /*
        r6 = this;
        r4 = -1;
        r1 = 0;
        r0 = r6.as;
        if (r0 == 0) goto L_0x0027;
    L_0x0007:
        r0 = r6.l;
        if (r0 == 0) goto L_0x0027;
    L_0x000b:
        r0 = r6.hasFocus();
        if (r0 == 0) goto L_0x0027;
    L_0x0011:
        r0 = r6.getDescendantFocusability();
        r2 = 393216; // 0x60000 float:5.51013E-40 double:1.942745E-318;
        if (r0 == r2) goto L_0x0027;
    L_0x0019:
        r0 = r6.getDescendantFocusability();
        r2 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        if (r0 != r2) goto L_0x0028;
    L_0x0021:
        r0 = r6.isFocused();
        if (r0 == 0) goto L_0x0028;
    L_0x0027:
        return;
    L_0x0028:
        r0 = r6.isFocused();
        if (r0 != 0) goto L_0x0056;
    L_0x002e:
        r0 = r6.getFocusedChild();
        r2 = L;
        if (r2 == 0) goto L_0x004e;
    L_0x0036:
        r2 = r0.getParent();
        if (r2 == 0) goto L_0x0042;
    L_0x003c:
        r2 = r0.hasFocus();
        if (r2 != 0) goto L_0x004e;
    L_0x0042:
        r0 = r6.f;
        r0 = r0.b();
        if (r0 != 0) goto L_0x0056;
    L_0x004a:
        r6.requestFocus();
        goto L_0x0027;
    L_0x004e:
        r2 = r6.f;
        r0 = r2.c(r0);
        if (r0 == 0) goto L_0x0027;
    L_0x0056:
        r0 = r6.A;
        r2 = r0.l;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 == 0) goto L_0x00b3;
    L_0x005e:
        r0 = r6.l;
        r0 = r0.d();
        if (r0 == 0) goto L_0x00b3;
    L_0x0066:
        r0 = r6.A;
        r2 = r0.l;
        r0 = r6.a(r2);
    L_0x006e:
        if (r0 == 0) goto L_0x0082;
    L_0x0070:
        r2 = r6.f;
        r3 = r0.a;
        r2 = r2.c(r3);
        if (r2 != 0) goto L_0x0082;
    L_0x007a:
        r2 = r0.a;
        r2 = r2.hasFocusable();
        if (r2 != 0) goto L_0x00ae;
    L_0x0082:
        r0 = r6.f;
        r0 = r0.b();
        if (r0 <= 0) goto L_0x008e;
    L_0x008a:
        r1 = r6.K();
    L_0x008e:
        if (r1 == 0) goto L_0x0027;
    L_0x0090:
        r0 = r6.A;
        r0 = r0.m;
        r2 = (long) r0;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 == 0) goto L_0x00b1;
    L_0x0099:
        r0 = r6.A;
        r0 = r0.m;
        r0 = r1.findViewById(r0);
        if (r0 == 0) goto L_0x00b1;
    L_0x00a3:
        r2 = r0.isFocusable();
        if (r2 == 0) goto L_0x00b1;
    L_0x00a9:
        r0.requestFocus();
        goto L_0x0027;
    L_0x00ae:
        r1 = r0.a;
        goto L_0x008e;
    L_0x00b1:
        r0 = r1;
        goto L_0x00a9;
    L_0x00b3:
        r0 = r1;
        goto L_0x006e;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.L():void");
    }

    private void M() {
        int b;
        int i;
        w e;
        boolean z = true;
        this.A.a(1);
        this.A.h = false;
        d();
        this.g.a();
        k();
        H();
        I();
        t tVar = this.A;
        if (!(this.A.i && this.C)) {
            z = false;
        }
        tVar.g = z;
        this.C = false;
        this.B = false;
        this.A.f = this.A.j;
        this.A.d = this.l.a();
        a(this.ax);
        if (this.A.i) {
            b = this.f.b();
            for (i = 0; i < b; i++) {
                e = e(this.f.b(i));
                if (!e.c() && (!e.n() || this.l.d())) {
                    this.g.a(e, this.w.a(this.A, e, e.e(e), e.u()));
                    if (!(!this.A.g || !e.x() || e.q() || e.c() || e.n())) {
                        this.g.a(a(e), e);
                    }
                }
            }
        }
        if (this.A.j) {
            r();
            z = this.A.e;
            this.A.e = false;
            this.m.c(this.d, this.A);
            this.A.e = z;
            for (i = 0; i < this.f.b(); i++) {
                e = e(this.f.b(i));
                if (!(e.c() || this.g.d(e))) {
                    b = e.e(e);
                    boolean a = e.a(8192);
                    if (!a) {
                        b |= 4096;
                    }
                    c a2 = this.w.a(this.A, e, b, e.u());
                    if (a) {
                        a(e, a2);
                    } else {
                        this.g.b(e, a2);
                    }
                }
            }
            s();
        } else {
            s();
        }
        l();
        a(false);
        this.A.c = 2;
    }

    private void N() {
        d();
        k();
        this.A.a(6);
        this.e.e();
        this.A.d = this.l.a();
        this.A.b = 0;
        this.A.f = false;
        this.m.c(this.d, this.A);
        this.A.e = false;
        this.O = null;
        t tVar = this.A;
        boolean z = this.A.i && this.w != null;
        tVar.i = z;
        this.A.c = 4;
        l();
        a(false);
    }

    private void O() {
        this.A.a(4);
        d();
        k();
        this.A.c = 1;
        if (this.A.i) {
            for (int b = this.f.b() - 1; b >= 0; b--) {
                w e = e(this.f.b(b));
                if (!e.c()) {
                    long a = a(e);
                    c a2 = this.w.a(this.A, e);
                    w a3 = this.g.a(a);
                    if (a3 == null || a3.c()) {
                        this.g.c(e, a2);
                    } else {
                        boolean a4 = this.g.a(a3);
                        boolean a5 = this.g.a(e);
                        if (a4 && a3 == e) {
                            this.g.c(e, a2);
                        } else {
                            c b2 = this.g.b(a3);
                            this.g.c(e, a2);
                            c c = this.g.c(e);
                            if (b2 == null) {
                                a(a, e, a3);
                            } else {
                                a(a3, e, b2, c, a4, a5);
                            }
                        }
                    }
                }
            }
            this.g.a(this.aD);
        }
        this.m.b(this.d);
        this.A.a = this.A.d;
        this.v = false;
        this.A.i = false;
        this.A.j = false;
        this.m.s = false;
        if (this.d.b != null) {
            this.d.b.clear();
        }
        if (this.m.w) {
            this.m.v = 0;
            this.m.w = false;
            this.d.b();
        }
        this.m.a(this.A);
        l();
        a(false);
        this.g.a();
        if (j(this.ax[0], this.ax[1])) {
            i(0, 0);
        }
        L();
        J();
    }

    private String a(Context context, String str) {
        return str.charAt(0) == '.' ? context.getPackageName() + str : !str.contains(".") ? RecyclerView.class.getPackage().getName() + '.' + str : str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(float r8, float r9, float r10, float r11) {
        /*
        r7 = this;
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = 1;
        r5 = 0;
        r1 = 0;
        r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1));
        if (r2 >= 0) goto L_0x0050;
    L_0x0009:
        r7.f();
        r2 = r7.ac;
        r3 = -r9;
        r4 = r7.getWidth();
        r4 = (float) r4;
        r3 = r3 / r4;
        r4 = r7.getHeight();
        r4 = (float) r4;
        r4 = r10 / r4;
        r4 = r6 - r4;
        r2 = r2.a(r3, r4);
        if (r2 == 0) goto L_0x0025;
    L_0x0024:
        r1 = r0;
    L_0x0025:
        r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1));
        if (r2 >= 0) goto L_0x006f;
    L_0x0029:
        r7.h();
        r2 = r7.ad;
        r3 = -r11;
        r4 = r7.getHeight();
        r4 = (float) r4;
        r3 = r3 / r4;
        r4 = r7.getWidth();
        r4 = (float) r4;
        r4 = r8 / r4;
        r2 = r2.a(r3, r4);
        if (r2 == 0) goto L_0x008e;
    L_0x0042:
        if (r0 != 0) goto L_0x004c;
    L_0x0044:
        r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1));
        if (r0 != 0) goto L_0x004c;
    L_0x0048:
        r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1));
        if (r0 == 0) goto L_0x004f;
    L_0x004c:
        android.support.v4.view.ah.d(r7);
    L_0x004f:
        return;
    L_0x0050:
        r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1));
        if (r2 <= 0) goto L_0x0025;
    L_0x0054:
        r7.g();
        r2 = r7.ae;
        r3 = r7.getWidth();
        r3 = (float) r3;
        r3 = r9 / r3;
        r4 = r7.getHeight();
        r4 = (float) r4;
        r4 = r10 / r4;
        r2 = r2.a(r3, r4);
        if (r2 == 0) goto L_0x0025;
    L_0x006d:
        r1 = r0;
        goto L_0x0025;
    L_0x006f:
        r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1));
        if (r2 <= 0) goto L_0x008e;
    L_0x0073:
        r7.i();
        r2 = r7.af;
        r3 = r7.getHeight();
        r3 = (float) r3;
        r3 = r11 / r3;
        r4 = r7.getWidth();
        r4 = (float) r4;
        r4 = r8 / r4;
        r4 = r6 - r4;
        r2 = r2.a(r3, r4);
        if (r2 != 0) goto L_0x0042;
    L_0x008e:
        r0 = r1;
        goto L_0x0042;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.a(float, float, float, float):void");
    }

    private void a(long j, w wVar, w wVar2) {
        int b = this.f.b();
        int i = 0;
        while (i < b) {
            w e = e(this.f.b(i));
            if (e == wVar || a(e) != j) {
                i++;
            } else if (this.l == null || !this.l.d()) {
                throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + e + " \n View Holder 2:" + wVar);
            } else {
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + e + " \n View Holder 2:" + wVar);
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + wVar2 + " cannot be found but it is necessary for " + wVar);
    }

    private void a(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() != 0) {
                String a = a(context, trim);
                try {
                    Object[] objArr;
                    Constructor constructor;
                    Class asSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(a).asSubclass(h.class);
                    try {
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                        constructor = asSubclass.getConstructor(M);
                    } catch (Throwable e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((h) constructor.newInstance(objArr));
                } catch (Throwable e2) {
                    e2.initCause(e);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + a, e2);
                } catch (Throwable e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + a, e3);
                } catch (Throwable e32) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + a, e32);
                } catch (Throwable e322) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + a, e322);
                } catch (Throwable e3222) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + a, e3222);
                } catch (Throwable e32222) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + a, e32222);
                }
            }
        }
    }

    private void a(a aVar, boolean z, boolean z2) {
        if (this.l != null) {
            this.l.b(this.N);
            this.l.b(this);
        }
        if (!z || z2) {
            b();
        }
        this.e.a();
        a aVar2 = this.l;
        this.l = aVar;
        if (aVar != null) {
            aVar.a(this.N);
            aVar.a(this);
        }
        if (this.m != null) {
            this.m.a(aVar2, this.l);
        }
        this.d.a(aVar2, this.l, z);
        this.A.e = true;
        u();
    }

    private void a(w wVar, w wVar2, c cVar, c cVar2, boolean z, boolean z2) {
        wVar.a(false);
        if (z) {
            e(wVar);
        }
        if (wVar != wVar2) {
            if (z2) {
                e(wVar2);
            }
            wVar.h = wVar2;
            e(wVar);
            this.d.c(wVar);
            wVar2.a(false);
            wVar2.i = wVar;
        }
        if (this.w.a(wVar, wVar2, cVar, cVar2)) {
            o();
        }
    }

    static void a(View view, Rect rect) {
        i iVar = (i) view.getLayoutParams();
        Rect rect2 = iVar.d;
        rect.set((view.getLeft() - rect2.left) - iVar.leftMargin, (view.getTop() - rect2.top) - iVar.topMargin, (view.getRight() + rect2.right) + iVar.rightMargin, iVar.bottomMargin + (rect2.bottom + view.getBottom()));
    }

    private void a(int[] iArr) {
        int b = this.f.b();
        if (b == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = 0;
        while (i3 < b) {
            int i4;
            w e = e(this.f.b(i3));
            if (e.c()) {
                i4 = i;
            } else {
                i4 = e.d();
                if (i4 < i) {
                    i = i4;
                }
                if (i4 > i2) {
                    i2 = i4;
                    i4 = i;
                } else {
                    i4 = i;
                }
            }
            i3++;
            i = i4;
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    private boolean a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.R = null;
        }
        int size = this.Q.size();
        int i = 0;
        while (i < size) {
            l lVar = (l) this.Q.get(i);
            if (!lVar.a(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.R = lVar;
                return true;
            }
        }
        return false;
    }

    private boolean a(View view, View view2, int i) {
        int i2 = 0;
        if (view2 == null || view2 == this) {
            return false;
        }
        if (view == null) {
            return true;
        }
        if (i != 2 && i != 1) {
            return b(view, view2, i);
        }
        int i3 = this.m.s() == 1 ? 1 : 0;
        if (i == 2) {
            i2 = 1;
        }
        return b(view, view2, (i2 ^ i3) != 0 ? 66 : 17) ? true : i == 2 ? b(view, view2, 130) : b(view, view2, 33);
    }

    private boolean b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.R != null) {
            if (action == 0) {
                this.R = null;
            } else {
                this.R.b(this, motionEvent);
                if (action == 3 || action == 1) {
                    this.R = null;
                }
                return true;
            }
        }
        if (action != 0) {
            int size = this.Q.size();
            for (int i = 0; i < size; i++) {
                l lVar = (l) this.Q.get(i);
                if (lVar.a(this, motionEvent)) {
                    this.R = lVar;
                    return true;
                }
            }
        }
        return false;
    }

    private boolean b(View view, View view2, int i) {
        this.j.set(0, 0, view.getWidth(), view.getHeight());
        this.P.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.j);
        offsetDescendantRectToMyCoords(view2, this.P);
        switch (i) {
            case 17:
                return (this.j.right > this.P.right || this.j.left >= this.P.right) && this.j.left > this.P.left;
            case 33:
                return (this.j.bottom > this.P.bottom || this.j.top >= this.P.bottom) && this.j.top > this.P.top;
            case 66:
                return (this.j.left < this.P.left || this.j.right <= this.P.left) && this.j.right < this.P.right;
            case 130:
                return (this.j.top < this.P.top || this.j.bottom <= this.P.top) && this.j.bottom < this.P.bottom;
            default:
                throw new IllegalArgumentException("direction must be absolute. received:" + i);
        }
    }

    static void c(w wVar) {
        if (wVar.b != null) {
            View view = (View) wVar.b.get();
            while (view != null) {
                if (view != wVar.a) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            wVar.b = null;
        }
    }

    private void c(MotionEvent motionEvent) {
        int b = android.support.v4.view.t.b(motionEvent);
        if (motionEvent.getPointerId(b) == this.ah) {
            b = b == 0 ? 1 : 0;
            this.ah = motionEvent.getPointerId(b);
            int x = (int) (motionEvent.getX(b) + 0.5f);
            this.al = x;
            this.aj = x;
            b = (int) (motionEvent.getY(b) + 0.5f);
            this.am = b;
            this.ak = b;
        }
    }

    static w e(View view) {
        return view == null ? null : ((i) view.getLayoutParams()).c;
    }

    private void e(w wVar) {
        View view = wVar.a;
        boolean z = view.getParent() == this;
        this.d.c(b(view));
        if (wVar.r()) {
            this.f.a(view, -1, view.getLayoutParams(), true);
        } else if (z) {
            this.f.d(view);
        } else {
            this.f.a(view, true);
        }
    }

    private float getScrollFactor() {
        if (this.ar == Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (!getContext().getTheme().resolveAttribute(16842829, typedValue, true)) {
                return 0.0f;
            }
            this.ar = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
        }
        return this.ar;
    }

    private android.support.v4.view.w getScrollingChildHelper() {
        if (this.ay == null) {
            this.ay = new android.support.v4.view.w(this);
        }
        return this.ay;
    }

    static RecyclerView j(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView j = j(viewGroup.getChildAt(i));
            if (j != null) {
                return j;
            }
        }
        return null;
    }

    private boolean j(int i, int i2) {
        a(this.ax);
        return (this.ax[0] == i && this.ax[1] == i2) ? false : true;
    }

    private int m(View view) {
        int id = view.getId();
        View view2 = view;
        while (!view2.isFocused() && (view2 instanceof ViewGroup) && view2.hasFocus()) {
            view = ((ViewGroup) view2).getFocusedChild();
            id = view.getId() != -1 ? view.getId() : id;
            view2 = view;
        }
        return id;
    }

    private void z() {
        this.f = new af(new b(this) {
            final /* synthetic */ RecyclerView a;

            {
                this.a = r1;
            }

            public int a() {
                return this.a.getChildCount();
            }

            public int a(View view) {
                return this.a.indexOfChild(view);
            }

            public void a(int i) {
                View childAt = this.a.getChildAt(i);
                if (childAt != null) {
                    this.a.k(childAt);
                }
                this.a.removeViewAt(i);
            }

            public void a(View view, int i) {
                this.a.addView(view, i);
                this.a.l(view);
            }

            public void a(View view, int i, LayoutParams layoutParams) {
                w e = RecyclerView.e(view);
                if (e != null) {
                    if (e.r() || e.c()) {
                        e.m();
                    } else {
                        throw new IllegalArgumentException("Called attach on a child which is not detached: " + e);
                    }
                }
                this.a.attachViewToParent(view, i, layoutParams);
            }

            public w b(View view) {
                return RecyclerView.e(view);
            }

            public View b(int i) {
                return this.a.getChildAt(i);
            }

            public void b() {
                int a = a();
                for (int i = 0; i < a; i++) {
                    this.a.k(b(i));
                }
                this.a.removeAllViews();
            }

            public void c(int i) {
                View b = b(i);
                if (b != null) {
                    w e = RecyclerView.e(b);
                    if (e != null) {
                        if (!e.r() || e.c()) {
                            e.b(256);
                        } else {
                            throw new IllegalArgumentException("called detach on an already detached child " + e);
                        }
                    }
                }
                this.a.detachViewFromParent(i);
            }

            public void c(View view) {
                w e = RecyclerView.e(view);
                if (e != null) {
                    e.a(this.a);
                }
            }

            public void d(View view) {
                w e = RecyclerView.e(view);
                if (e != null) {
                    e.b(this.a);
                }
            }
        });
    }

    long a(w wVar) {
        return this.l.d() ? wVar.g() : (long) wVar.c;
    }

    w a(int i, boolean z) {
        int c = this.f.c();
        w wVar = null;
        for (int i2 = 0; i2 < c; i2++) {
            w e = e(this.f.d(i2));
            if (!(e == null || e.q())) {
                if (z) {
                    if (e.c != i) {
                        continue;
                    }
                } else if (e.d() != i) {
                    continue;
                }
                if (!this.f.c(e.a)) {
                    return e;
                }
                wVar = e;
            }
        }
        return wVar;
    }

    public w a(long j) {
        if (this.l == null || !this.l.d()) {
            return null;
        }
        int c = this.f.c();
        int i = 0;
        w wVar = null;
        while (i < c) {
            w e = e(this.f.d(i));
            if (e == null || e.q() || e.g() != j) {
                e = wVar;
            } else if (!this.f.c(e.a)) {
                return e;
            }
            i++;
            wVar = e;
        }
        return wVar;
    }

    void a() {
        this.e = new f(new a(this) {
            final /* synthetic */ RecyclerView a;

            {
                this.a = r1;
            }

            public w a(int i) {
                w a = this.a.a(i, true);
                return (a == null || this.a.f.c(a.a)) ? null : a;
            }

            public void a(int i, int i2) {
                this.a.a(i, i2, true);
                this.a.B = true;
                t tVar = this.a.A;
                tVar.b += i2;
            }

            public void a(int i, int i2, Object obj) {
                this.a.a(i, i2, obj);
                this.a.C = true;
            }

            public void a(b bVar) {
                c(bVar);
            }

            public void b(int i, int i2) {
                this.a.a(i, i2, false);
                this.a.B = true;
            }

            public void b(b bVar) {
                c(bVar);
            }

            public void c(int i, int i2) {
                this.a.g(i, i2);
                this.a.B = true;
            }

            void c(b bVar) {
                switch (bVar.a) {
                    case 1:
                        this.a.m.a(this.a, bVar.b, bVar.d);
                        return;
                    case 2:
                        this.a.m.b(this.a, bVar.b, bVar.d);
                        return;
                    case 4:
                        this.a.m.a(this.a, bVar.b, bVar.d, bVar.c);
                        return;
                    case 8:
                        this.a.m.a(this.a, bVar.b, bVar.d, 1);
                        return;
                    default:
                        return;
                }
            }

            public void d(int i, int i2) {
                this.a.f(i, i2);
                this.a.B = true;
            }
        });
    }

    void a(int i) {
        if (this.m != null) {
            this.m.e(i);
            awakenScrollBars();
        }
    }

    public void a(int i, int i2) {
        a(i, i2, null);
    }

    public void a(int i, int i2, Interpolator interpolator) {
        int i3 = 0;
        if (this.m == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.t) {
            if (!this.m.d()) {
                i = 0;
            }
            if (this.m.e()) {
                i3 = i2;
            }
            if (i != 0 || i3 != 0) {
                this.x.a(i, i3, interpolator);
            }
        }
    }

    void a(int i, int i2, Object obj) {
        int c = this.f.c();
        int i3 = i + i2;
        for (int i4 = 0; i4 < c; i4++) {
            View d = this.f.d(i4);
            w e = e(d);
            if (e != null && !e.c() && e.c >= i && e.c < i3) {
                e.b(2);
                e.a(obj);
                ((i) d.getLayoutParams()).e = true;
            }
        }
        this.d.c(i, i2);
    }

    void a(int i, int i2, boolean z) {
        int i3 = i + i2;
        int c = this.f.c();
        for (int i4 = 0; i4 < c; i4++) {
            w e = e(this.f.d(i4));
            if (!(e == null || e.c())) {
                if (e.c >= i3) {
                    e.a(-i2, z);
                    this.A.e = true;
                } else if (e.c >= i) {
                    e.a(i - 1, -i2, z);
                    this.A.e = true;
                }
            }
        }
        this.d.a(i, i2, z);
        requestLayout();
    }

    public void a(l lVar) {
        this.Q.add(lVar);
    }

    public void a(m mVar) {
        if (this.au == null) {
            this.au = new ArrayList();
        }
        this.au.add(mVar);
    }

    void a(w wVar, c cVar) {
        wVar.a(0, 8192);
        if (this.A.g && wVar.x() && !wVar.q() && !wVar.c()) {
            this.g.a(a(wVar), wVar);
        }
        this.g.a(wVar, cVar);
    }

    void a(w wVar, c cVar, c cVar2) {
        wVar.a(false);
        if (this.w.b(wVar, cVar, cVar2)) {
            o();
        }
    }

    void a(String str) {
        if (n()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling");
            }
            throw new IllegalStateException(str);
        } else if (this.ab > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks might be run during a measure & layout pass where you cannot change the RecyclerView data. Any method call that might change the structure of the RecyclerView or the adapter contents should be postponed to the next frame.", new IllegalStateException(""));
        }
    }

    void a(boolean z) {
        if (this.S < 1) {
            this.S = 1;
        }
        if (!z) {
            this.s = false;
        }
        if (this.S == 1) {
            if (!(!z || !this.s || this.t || this.m == null || this.l == null)) {
                p();
            }
            if (!this.t) {
                this.s = false;
            }
        }
        this.S--;
    }

    boolean a(int i, int i2, MotionEvent motionEvent) {
        int a;
        int i3;
        int i4;
        int i5;
        c();
        if (this.l != null) {
            int b;
            d();
            k();
            android.support.v4.g.h.a("RV Scroll");
            if (i != 0) {
                a = this.m.a(i, this.d, this.A);
                i3 = i - a;
            } else {
                a = 0;
                i3 = 0;
            }
            if (i2 != 0) {
                b = this.m.b(i2, this.d, this.A);
                i4 = i2 - b;
            } else {
                b = 0;
                i4 = 0;
            }
            android.support.v4.g.h.a();
            w();
            l();
            a(false);
            i5 = i4;
            i4 = a;
            a = b;
        } else {
            a = 0;
            i4 = 0;
            i5 = 0;
            i3 = 0;
        }
        if (!this.o.isEmpty()) {
            invalidate();
        }
        if (dispatchNestedScroll(i4, a, i3, i5, this.az)) {
            this.al -= this.az[0];
            this.am -= this.az[1];
            if (motionEvent != null) {
                motionEvent.offsetLocation((float) this.az[0], (float) this.az[1]);
            }
            int[] iArr = this.aB;
            iArr[0] = iArr[0] + this.az[0];
            iArr = this.aB;
            iArr[1] = iArr[1] + this.az[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null) {
                a(motionEvent.getX(), (float) i3, motionEvent.getY(), (float) i5);
            }
            c(i, i2);
        }
        if (!(i4 == 0 && a == 0)) {
            i(i4, a);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i4 == 0 && a == 0) ? false : true;
    }

    boolean a(w wVar, int i) {
        if (n()) {
            wVar.l = i;
            this.F.add(wVar);
            return false;
        }
        ah.c(wVar.a, i);
        return true;
    }

    boolean a(View view) {
        d();
        boolean f = this.f.f(view);
        if (f) {
            w e = e(view);
            this.d.c(e);
            this.d.b(e);
        }
        a(!f);
        return f;
    }

    boolean a(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (!n()) {
            return false;
        }
        int b = accessibilityEvent != null ? android.support.v4.view.a.a.b(accessibilityEvent) : 0;
        if (b != 0) {
            i = b;
        }
        this.U = i | this.U;
        return true;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (this.m == null || !this.m.a(this, (ArrayList) arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public w b(View view) {
        Object parent = view.getParent();
        if (parent == null || parent == this) {
            return e(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    void b() {
        if (this.w != null) {
            this.w.d();
        }
        if (this.m != null) {
            this.m.c(this.d);
            this.m.b(this.d);
        }
        this.d.a();
    }

    public void b(int i) {
        if (!this.t) {
            if (this.m == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                this.m.a(this, this.A, i);
            }
        }
    }

    void b(w wVar, c cVar, c cVar2) {
        e(wVar);
        wVar.a(false);
        if (this.w.a(wVar, cVar, cVar2)) {
            o();
        }
    }

    public boolean b(int i, int i2) {
        if (this.m == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.t) {
            return false;
        } else {
            boolean d = this.m.d();
            boolean e = this.m.e();
            if (!d || Math.abs(i) < this.ap) {
                i = 0;
            }
            if (!e || Math.abs(i2) < this.ap) {
                i2 = 0;
            }
            if ((i == 0 && i2 == 0) || dispatchNestedPreFling((float) i, (float) i2)) {
                return false;
            }
            d = d || e;
            dispatchNestedFling((float) i, (float) i2, d);
            if (this.ao != null && this.ao.a(i, i2)) {
                return true;
            }
            if (!d) {
                return false;
            }
            this.x.a(Math.max(-this.aq, Math.min(i, this.aq)), Math.max(-this.aq, Math.min(i2, this.aq)));
            return true;
        }
    }

    boolean b(w wVar) {
        return this.w == null || this.w.a(wVar, wVar.u());
    }

    public w c(int i) {
        if (this.v) {
            return null;
        }
        int c = this.f.c();
        int i2 = 0;
        w wVar = null;
        while (i2 < c) {
            w e = e(this.f.d(i2));
            if (e == null || e.q() || d(e) != i) {
                e = wVar;
            } else if (!this.f.c(e.a)) {
                return e;
            }
            i2++;
            wVar = e;
        }
        return wVar;
    }

    public View c(View view) {
        RecyclerView parent = view.getParent();
        View view2 = view;
        while (parent != null && parent != this && (parent instanceof View)) {
            View view3 = parent;
            view2 = view3;
            ViewParent parent2 = view3.getParent();
        }
        return parent == this ? view2 : null;
    }

    void c() {
        if (!this.r || this.v) {
            android.support.v4.g.h.a("RV FullInvalidate");
            p();
            android.support.v4.g.h.a();
        } else if (!this.e.d()) {
        } else {
            if (this.e.a(4) && !this.e.a(11)) {
                android.support.v4.g.h.a("RV PartialInvalidate");
                d();
                k();
                this.e.b();
                if (!this.s) {
                    if (A()) {
                        p();
                    } else {
                        this.e.c();
                    }
                }
                a(true);
                l();
                android.support.v4.g.h.a();
            } else if (this.e.d()) {
                android.support.v4.g.h.a("RV FullInvalidate");
                p();
                android.support.v4.g.h.a();
            }
        }
    }

    void c(int i, int i2) {
        int i3 = 0;
        if (!(this.ac == null || this.ac.a() || i <= 0)) {
            i3 = this.ac.c();
        }
        if (!(this.ae == null || this.ae.a() || i >= 0)) {
            i3 |= this.ae.c();
        }
        if (!(this.ad == null || this.ad.a() || i2 <= 0)) {
            i3 |= this.ad.c();
        }
        if (!(this.af == null || this.af.a() || i2 >= 0)) {
            i3 |= this.af.c();
        }
        if (i3 != 0) {
            ah.d(this);
        }
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof i) && this.m.a((i) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        return (this.m != null && this.m.d()) ? this.m.e(this.A) : 0;
    }

    public int computeHorizontalScrollOffset() {
        return (this.m != null && this.m.d()) ? this.m.c(this.A) : 0;
    }

    public int computeHorizontalScrollRange() {
        return (this.m != null && this.m.d()) ? this.m.g(this.A) : 0;
    }

    public int computeVerticalScrollExtent() {
        return (this.m != null && this.m.e()) ? this.m.f(this.A) : 0;
    }

    public int computeVerticalScrollOffset() {
        return (this.m != null && this.m.e()) ? this.m.d(this.A) : 0;
    }

    public int computeVerticalScrollRange() {
        return (this.m != null && this.m.e()) ? this.m.h(this.A) : 0;
    }

    int d(w wVar) {
        return (wVar.a(524) || !wVar.p()) ? -1 : this.e.c(wVar.c);
    }

    public w d(View view) {
        View c = c(view);
        return c == null ? null : b(c);
    }

    void d() {
        this.S++;
        if (this.S == 1 && !this.t) {
            this.s = false;
        }
    }

    public void d(int i) {
        int b = this.f.b();
        for (int i2 = 0; i2 < b; i2++) {
            this.f.b(i2).offsetTopAndBottom(i);
        }
    }

    void d(int i, int i2) {
        if (i < 0) {
            f();
            this.ac.a(-i);
        } else if (i > 0) {
            g();
            this.ae.a(i);
        }
        if (i2 < 0) {
            h();
            this.ad.a(-i2);
        } else if (i2 > 0) {
            i();
            this.af.a(i2);
        }
        if (i != 0 || i2 != 0) {
            ah.d(this);
        }
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().a(i, i2, i3, i4, iArr);
    }

    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = 1;
        int i4 = 0;
        super.draw(canvas);
        int size = this.o.size();
        for (i = 0; i < size; i++) {
            ((g) this.o.get(i)).b(canvas, this, this.A);
        }
        if (this.ac == null || this.ac.a()) {
            i2 = 0;
        } else {
            i = canvas.save();
            i2 = this.h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) (i2 + (-getHeight())), 0.0f);
            i2 = (this.ac == null || !this.ac.a(canvas)) ? 0 : 1;
            canvas.restoreToCount(i);
        }
        if (!(this.ad == null || this.ad.a())) {
            size = canvas.save();
            if (this.h) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            i = (this.ad == null || !this.ad.a(canvas)) ? 0 : 1;
            i2 |= i;
            canvas.restoreToCount(size);
        }
        if (!(this.ae == null || this.ae.a())) {
            size = canvas.save();
            int width = getWidth();
            i = this.h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-i), (float) (-width));
            i = (this.ae == null || !this.ae.a(canvas)) ? 0 : 1;
            i2 |= i;
            canvas.restoreToCount(size);
        }
        if (!(this.af == null || this.af.a())) {
            i = canvas.save();
            canvas.rotate(180.0f);
            if (this.h) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            if (this.af != null && this.af.a(canvas)) {
                i4 = 1;
            }
            i2 |= i4;
            canvas.restoreToCount(i);
        }
        if (i2 != 0 || this.w == null || this.o.size() <= 0 || !this.w.b()) {
            i3 = i2;
        }
        if (i3 != 0) {
            ah.d(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void e() {
        setScrollState(0);
        B();
    }

    public void e(int i) {
        int b = this.f.b();
        for (int i2 = 0; i2 < b; i2++) {
            this.f.b(i2).offsetLeftAndRight(i);
        }
    }

    void e(int i, int i2) {
        setMeasuredDimension(h.a(i, getPaddingLeft() + getPaddingRight(), ah.q(this)), h.a(i2, getPaddingTop() + getPaddingBottom(), ah.r(this)));
    }

    public int f(View view) {
        w e = e(view);
        return e != null ? e.d() : -1;
    }

    void f() {
        if (this.ac == null) {
            this.ac = new android.support.v4.widget.j(getContext());
            if (this.h) {
                this.ac.a((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.ac.a(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void f(int i) {
    }

    void f(int i, int i2) {
        int i3;
        int c = this.f.c();
        int i4;
        int i5;
        if (i < i2) {
            i3 = -1;
            i4 = i2;
            i5 = i;
        } else {
            i3 = 1;
            i4 = i;
            i5 = i2;
        }
        for (int i6 = 0; i6 < c; i6++) {
            w e = e(this.f.d(i6));
            if (e != null && e.c >= r3 && e.c <= r2) {
                if (e.c == i) {
                    e.a(i2 - i, false);
                } else {
                    e.a(i3, false);
                }
                this.A.e = true;
            }
        }
        this.d.a(i, i2);
        requestLayout();
    }

    public View focusSearch(View view, int i) {
        boolean z = true;
        View d = this.m.d(view, i);
        if (d != null) {
            return d;
        }
        boolean z2 = (this.l == null || this.m == null || n() || this.t) ? false : true;
        FocusFinder instance = FocusFinder.getInstance();
        if (z2 && (i == 2 || i == 1)) {
            int i2;
            if (this.m.e()) {
                i2 = i == 2 ? 130 : 33;
                boolean z3 = instance.findNextFocus(this, view, i2) == null;
                if (K) {
                    i = i2;
                    z2 = z3;
                } else {
                    z2 = z3;
                }
            } else {
                z2 = false;
            }
            if (z2 || !this.m.d()) {
                z = z2;
            } else {
                i2 = ((i == 2 ? 1 : 0) ^ (this.m.s() == 1 ? 1 : 0)) != 0 ? 66 : 17;
                if (instance.findNextFocus(this, view, i2) != null) {
                    z = false;
                }
                if (K) {
                    i = i2;
                }
            }
            if (z) {
                c();
                if (c(view) == null) {
                    return null;
                }
                d();
                this.m.a(view, i, this.d, this.A);
                a(false);
            }
            d = instance.findNextFocus(this, view, i);
        } else {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus == null && z2) {
                c();
                if (c(view) == null) {
                    return null;
                }
                d();
                d = this.m.a(view, i, this.d, this.A);
                a(false);
            } else {
                d = findNextFocus;
            }
        }
        return !a(view, d, i) ? super.focusSearch(view, i) : d;
    }

    void g() {
        if (this.ae == null) {
            this.ae = new android.support.v4.widget.j(getContext());
            if (this.h) {
                this.ae.a((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.ae.a(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    void g(int i) {
        if (this.m != null) {
            this.m.l(i);
        }
        f(i);
        if (this.at != null) {
            this.at.a(this, i);
        }
        if (this.au != null) {
            for (int size = this.au.size() - 1; size >= 0; size--) {
                ((m) this.au.get(size)).a(this, i);
            }
        }
    }

    void g(int i, int i2) {
        int c = this.f.c();
        for (int i3 = 0; i3 < c; i3++) {
            w e = e(this.f.d(i3));
            if (!(e == null || e.c() || e.c < i)) {
                e.a(i2, false);
                this.A.e = true;
            }
        }
        this.d.b(i, i2);
        requestLayout();
    }

    public void g(View view) {
    }

    protected LayoutParams generateDefaultLayoutParams() {
        if (this.m != null) {
            return this.m.a();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager");
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (this.m != null) {
            return this.m.a(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager");
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        if (this.m != null) {
            return this.m.a(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager");
    }

    public a getAdapter() {
        return this.l;
    }

    public int getBaseline() {
        return this.m != null ? this.m.t() : super.getBaseline();
    }

    protected int getChildDrawingOrder(int i, int i2) {
        return this.aw == null ? super.getChildDrawingOrder(i, i2) : this.aw.a(i, i2);
    }

    public boolean getClipToPadding() {
        return this.h;
    }

    public ax getCompatAccessibilityDelegate() {
        return this.E;
    }

    public e getItemAnimator() {
        return this.w;
    }

    public h getLayoutManager() {
        return this.m;
    }

    public int getMaxFlingVelocity() {
        return this.aq;
    }

    public int getMinFlingVelocity() {
        return this.ap;
    }

    long getNanoTime() {
        return J ? System.nanoTime() : 0;
    }

    public k getOnFlingListener() {
        return this.ao;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.as;
    }

    public n getRecycledViewPool() {
        return this.d.g();
    }

    public int getScrollState() {
        return this.ag;
    }

    void h() {
        if (this.ad == null) {
            this.ad = new android.support.v4.widget.j(getContext());
            if (this.h) {
                this.ad.a((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.ad.a(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void h(int i, int i2) {
    }

    public void h(View view) {
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().b();
    }

    Rect i(View view) {
        i iVar = (i) view.getLayoutParams();
        if (!iVar.e) {
            return iVar.d;
        }
        if (this.A.a() && (iVar.e() || iVar.c())) {
            return iVar.d;
        }
        Rect rect = iVar.d;
        rect.set(0, 0, 0, 0);
        int size = this.o.size();
        for (int i = 0; i < size; i++) {
            this.j.set(0, 0, 0, 0);
            ((g) this.o.get(i)).a(this.j, view, this, this.A);
            rect.left += this.j.left;
            rect.top += this.j.top;
            rect.right += this.j.right;
            rect.bottom += this.j.bottom;
        }
        iVar.e = false;
        return rect;
    }

    void i() {
        if (this.af == null) {
            this.af = new android.support.v4.widget.j(getContext());
            if (this.h) {
                this.af.a((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.af.a(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    void i(int i, int i2) {
        this.ab++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        h(i, i2);
        if (this.at != null) {
            this.at.a(this, i, i2);
        }
        if (this.au != null) {
            for (scrollY = this.au.size() - 1; scrollY >= 0; scrollY--) {
                ((m) this.au.get(scrollY)).a(this, i, i2);
            }
        }
        this.ab--;
    }

    public boolean isAttachedToWindow() {
        return this.p;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().a();
    }

    void j() {
        this.af = null;
        this.ad = null;
        this.ae = null;
        this.ac = null;
    }

    void k() {
        this.aa++;
    }

    void k(View view) {
        w e = e(view);
        h(view);
        if (!(this.l == null || e == null)) {
            this.l.d(e);
        }
        if (this.W != null) {
            for (int size = this.W.size() - 1; size >= 0; size--) {
                ((j) this.W.get(size)).b(view);
            }
        }
    }

    void l() {
        this.aa--;
        if (this.aa < 1) {
            this.aa = 0;
            F();
            x();
        }
    }

    void l(View view) {
        w e = e(view);
        g(view);
        if (!(this.l == null || e == null)) {
            this.l.c(e);
        }
        if (this.W != null) {
            for (int size = this.W.size() - 1; size >= 0; size--) {
                ((j) this.W.get(size)).a(view);
            }
        }
    }

    boolean m() {
        return this.V != null && this.V.isEnabled();
    }

    public boolean n() {
        return this.aa > 0;
    }

    void o() {
        if (!this.D && this.p) {
            ah.a((View) this, this.aC);
            this.D = true;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onAttachedToWindow() {
        /*
        r4 = this;
        r0 = 1;
        r1 = 0;
        super.onAttachedToWindow();
        r4.aa = r1;
        r4.p = r0;
        r2 = r4.r;
        if (r2 == 0) goto L_0x0068;
    L_0x000d:
        r2 = r4.isLayoutRequested();
        if (r2 != 0) goto L_0x0068;
    L_0x0013:
        r4.r = r0;
        r0 = r4.m;
        if (r0 == 0) goto L_0x001e;
    L_0x0019:
        r0 = r4.m;
        r0.c(r4);
    L_0x001e:
        r4.D = r1;
        r0 = J;
        if (r0 == 0) goto L_0x0067;
    L_0x0024:
        r0 = android.support.v7.widget.an.a;
        r0 = r0.get();
        r0 = (android.support.v7.widget.an) r0;
        r4.y = r0;
        r0 = r4.y;
        if (r0 != 0) goto L_0x0062;
    L_0x0032:
        r0 = new android.support.v7.widget.an;
        r0.<init>();
        r4.y = r0;
        r0 = android.support.v4.view.ah.I(r4);
        r1 = 1114636288; // 0x42700000 float:60.0 double:5.507034975E-315;
        r2 = r4.isInEditMode();
        if (r2 != 0) goto L_0x006a;
    L_0x0045:
        if (r0 == 0) goto L_0x006a;
    L_0x0047:
        r0 = r0.getRefreshRate();
        r2 = 1106247680; // 0x41f00000 float:30.0 double:5.465589745E-315;
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 < 0) goto L_0x006a;
    L_0x0051:
        r1 = r4.y;
        r2 = 1315859240; // 0x4e6e6b28 float:1.0E9 double:6.50120845E-315;
        r0 = r2 / r0;
        r2 = (long) r0;
        r1.d = r2;
        r0 = android.support.v7.widget.an.a;
        r1 = r4.y;
        r0.set(r1);
    L_0x0062:
        r0 = r4.y;
        r0.a(r4);
    L_0x0067:
        return;
    L_0x0068:
        r0 = r1;
        goto L_0x0013;
    L_0x006a:
        r0 = r1;
        goto L_0x0051;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onAttachedToWindow():void");
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.w != null) {
            this.w.d();
        }
        e();
        this.p = false;
        if (this.m != null) {
            this.m.b(this, this.d);
        }
        this.F.clear();
        removeCallbacks(this.aC);
        this.g.b();
        if (J) {
            this.y.b(this);
            this.y = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.o.size();
        for (int i = 0; i < size; i++) {
            ((g) this.o.get(i)).a(canvas, this, this.A);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (!(this.m == null || this.t || (motionEvent.getSource() & 2) == 0 || motionEvent.getAction() != 8)) {
            float f = this.m.e() ? -android.support.v4.view.t.e(motionEvent, 9) : 0.0f;
            float e = this.m.d() ? android.support.v4.view.t.e(motionEvent, 10) : 0.0f;
            if (!(f == 0.0f && e == 0.0f)) {
                float scrollFactor = getScrollFactor();
                a((int) (e * scrollFactor), (int) (f * scrollFactor), motionEvent);
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i = -1;
        boolean z = true;
        if (this.t) {
            return false;
        }
        if (a(motionEvent)) {
            E();
            return true;
        } else if (this.m == null) {
            return false;
        } else {
            boolean d = this.m.d();
            boolean e = this.m.e();
            if (this.ai == null) {
                this.ai = VelocityTracker.obtain();
            }
            this.ai.addMovement(motionEvent);
            int a = android.support.v4.view.t.a(motionEvent);
            int b = android.support.v4.view.t.b(motionEvent);
            int i2;
            switch (a) {
                case 0:
                    if (this.T) {
                        this.T = false;
                    }
                    this.ah = motionEvent.getPointerId(0);
                    i = (int) (motionEvent.getX() + 0.5f);
                    this.al = i;
                    this.aj = i;
                    i = (int) (motionEvent.getY() + 0.5f);
                    this.am = i;
                    this.ak = i;
                    if (this.ag == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                    }
                    int[] iArr = this.aB;
                    this.aB[1] = 0;
                    iArr[0] = 0;
                    i2 = d ? 1 : 0;
                    if (e) {
                        i2 |= 2;
                    }
                    startNestedScroll(i2);
                    break;
                case 1:
                    this.ai.clear();
                    stopNestedScroll();
                    break;
                case 2:
                    a = motionEvent.findPointerIndex(this.ah);
                    if (a >= 0) {
                        b = (int) (motionEvent.getX(a) + 0.5f);
                        a = (int) (motionEvent.getY(a) + 0.5f);
                        if (this.ag != 1) {
                            b -= this.aj;
                            a -= this.ak;
                            if (!d || Math.abs(b) <= this.an) {
                                d = false;
                            } else {
                                this.al = ((b < 0 ? -1 : 1) * this.an) + this.aj;
                                d = true;
                            }
                            if (e && Math.abs(a) > this.an) {
                                i2 = this.ak;
                                int i3 = this.an;
                                if (a >= 0) {
                                    i = 1;
                                }
                                this.am = i2 + (i * i3);
                                d = true;
                            }
                            if (d) {
                                setScrollState(1);
                                break;
                            }
                        }
                    }
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.ah + " not found. Did any MotionEvents get skipped?");
                    return false;
                    break;
                case 3:
                    E();
                    break;
                case 5:
                    this.ah = motionEvent.getPointerId(b);
                    i2 = (int) (motionEvent.getX(b) + 0.5f);
                    this.al = i2;
                    this.aj = i2;
                    i2 = (int) (motionEvent.getY(b) + 0.5f);
                    this.am = i2;
                    this.ak = i2;
                    break;
                case 6:
                    c(motionEvent);
                    break;
            }
            if (this.ag != 1) {
                z = false;
            }
            return z;
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        android.support.v4.g.h.a("RV OnLayout");
        p();
        android.support.v4.g.h.a();
        this.r = true;
    }

    protected void onMeasure(int i, int i2) {
        boolean z = false;
        if (this.m == null) {
            e(i, i2);
        } else if (this.m.u) {
            int mode = MeasureSpec.getMode(i);
            int mode2 = MeasureSpec.getMode(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.m.a(this.d, this.A, i, i2);
            if (!z && this.l != null) {
                if (this.A.c == 1) {
                    M();
                }
                this.m.c(i, i2);
                this.A.h = true;
                N();
                this.m.d(i, i2);
                if (this.m.k()) {
                    this.m.c(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.A.h = true;
                    N();
                    this.m.d(i, i2);
                }
            }
        } else if (this.q) {
            this.m.a(this.d, this.A, i, i2);
        } else {
            if (this.u) {
                d();
                k();
                H();
                l();
                if (this.A.j) {
                    this.A.f = true;
                } else {
                    this.e.e();
                    this.A.f = false;
                }
                this.u = false;
                a(false);
            }
            if (this.l != null) {
                this.A.d = this.l.a();
            } else {
                this.A.d = 0;
            }
            d();
            this.m.a(this.d, this.A, i, i2);
            a(false);
            this.A.f = false;
        }
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        return n() ? false : super.onRequestFocusInDescendants(i, rect);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof r) {
            this.O = (r) parcelable;
            super.onRestoreInstanceState(this.O.a());
            if (this.m != null && this.O.a != null) {
                this.m.a(this.O.a);
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        r rVar = new r(super.onSaveInstanceState());
        if (this.O != null) {
            rVar.a(this.O);
        } else if (this.m != null) {
            rVar.a = this.m.c();
        } else {
            rVar.a = null;
        }
        return rVar;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            j();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.t || this.T) {
            return false;
        }
        if (b(motionEvent)) {
            E();
            return true;
        } else if (this.m == null) {
            return false;
        } else {
            boolean d = this.m.d();
            boolean e = this.m.e();
            if (this.ai == null) {
                this.ai = VelocityTracker.obtain();
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            int a = android.support.v4.view.t.a(motionEvent);
            int b = android.support.v4.view.t.b(motionEvent);
            if (a == 0) {
                int[] iArr = this.aB;
                this.aB[1] = 0;
                iArr[0] = 0;
            }
            obtain.offsetLocation((float) this.aB[0], (float) this.aB[1]);
            switch (a) {
                case 0:
                    this.ah = motionEvent.getPointerId(0);
                    a = (int) (motionEvent.getX() + 0.5f);
                    this.al = a;
                    this.aj = a;
                    a = (int) (motionEvent.getY() + 0.5f);
                    this.am = a;
                    this.ak = a;
                    a = d ? 1 : 0;
                    if (e) {
                        a |= 2;
                    }
                    startNestedScroll(a);
                    break;
                case 1:
                    this.ai.addMovement(obtain);
                    this.ai.computeCurrentVelocity(1000, (float) this.aq);
                    float f = d ? -af.a(this.ai, this.ah) : 0.0f;
                    float f2 = e ? -af.b(this.ai, this.ah) : 0.0f;
                    if ((f == 0.0f && f2 == 0.0f) || !b((int) f, (int) f2)) {
                        setScrollState(0);
                    }
                    D();
                    z = true;
                    break;
                case 2:
                    a = motionEvent.findPointerIndex(this.ah);
                    if (a >= 0) {
                        int x = (int) (motionEvent.getX(a) + 0.5f);
                        int y = (int) (motionEvent.getY(a) + 0.5f);
                        int i = this.al - x;
                        a = this.am - y;
                        if (dispatchNestedPreScroll(i, a, this.aA, this.az)) {
                            i -= this.aA[0];
                            a -= this.aA[1];
                            obtain.offsetLocation((float) this.az[0], (float) this.az[1]);
                            int[] iArr2 = this.aB;
                            iArr2[0] = iArr2[0] + this.az[0];
                            iArr2 = this.aB;
                            iArr2[1] = iArr2[1] + this.az[1];
                        }
                        if (this.ag != 1) {
                            boolean z2;
                            if (!d || Math.abs(i) <= this.an) {
                                z2 = false;
                            } else {
                                i = i > 0 ? i - this.an : i + this.an;
                                z2 = true;
                            }
                            if (e && Math.abs(a) > this.an) {
                                a = a > 0 ? a - this.an : a + this.an;
                                z2 = true;
                            }
                            if (z2) {
                                setScrollState(1);
                            }
                        }
                        if (this.ag == 1) {
                            this.al = x - this.az[0];
                            this.am = y - this.az[1];
                            if (a(d ? i : 0, e ? a : 0, obtain)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            if (!(this.y == null || (i == 0 && a == 0))) {
                                this.y.a(this, i, a);
                                break;
                            }
                        }
                    }
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.ah + " not found. Did any MotionEvents get skipped?");
                    return false;
                    break;
                case 3:
                    E();
                    break;
                case 5:
                    this.ah = motionEvent.getPointerId(b);
                    a = (int) (motionEvent.getX(b) + 0.5f);
                    this.al = a;
                    this.aj = a;
                    a = (int) (motionEvent.getY(b) + 0.5f);
                    this.am = a;
                    this.ak = a;
                    break;
                case 6:
                    c(motionEvent);
                    break;
            }
            if (!z) {
                this.ai.addMovement(obtain);
            }
            obtain.recycle();
            return true;
        }
    }

    void p() {
        if (this.l == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.m == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            this.A.h = false;
            if (this.A.c == 1) {
                M();
                this.m.f(this);
                N();
            } else if (!this.e.f() && this.m.x() == getWidth() && this.m.y() == getHeight()) {
                this.m.f(this);
            } else {
                this.m.f(this);
                N();
            }
            O();
        }
    }

    void q() {
        int c = this.f.c();
        for (int i = 0; i < c; i++) {
            ((i) this.f.d(i).getLayoutParams()).e = true;
        }
        this.d.k();
    }

    void r() {
        int c = this.f.c();
        for (int i = 0; i < c; i++) {
            w e = e(this.f.d(i));
            if (!e.c()) {
                e.b();
            }
        }
    }

    protected void removeDetachedView(View view, boolean z) {
        w e = e(view);
        if (e != null) {
            if (e.r()) {
                e.m();
            } else if (!e.c()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + e);
            }
        }
        k(view);
        super.removeDetachedView(view, z);
    }

    public void requestChildFocus(View view, View view2) {
        if (!(this.m.a(this, this.A, view, view2) || view2 == null)) {
            this.j.set(0, 0, view2.getWidth(), view2.getHeight());
            LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof i) {
                i iVar = (i) layoutParams;
                if (!iVar.e) {
                    Rect rect = iVar.d;
                    Rect rect2 = this.j;
                    rect2.left -= rect.left;
                    rect2 = this.j;
                    rect2.right += rect.right;
                    rect2 = this.j;
                    rect2.top -= rect.top;
                    rect2 = this.j;
                    rect2.bottom = rect.bottom + rect2.bottom;
                }
            }
            offsetDescendantRectToMyCoords(view2, this.j);
            offsetRectIntoDescendantCoords(view, this.j);
            requestChildRectangleOnScreen(view, this.j, !this.r);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.m.a(this, view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.Q.size();
        for (int i = 0; i < size; i++) {
            ((l) this.Q.get(i)).a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.S != 0 || this.t) {
            this.s = true;
        } else {
            super.requestLayout();
        }
    }

    void s() {
        int c = this.f.c();
        for (int i = 0; i < c; i++) {
            w e = e(this.f.d(i));
            if (!e.c()) {
                e.a();
            }
        }
        this.d.j();
    }

    public void scrollBy(int i, int i2) {
        if (this.m == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.t) {
            boolean d = this.m.d();
            boolean e = this.m.e();
            if (d || e) {
                if (!d) {
                    i = 0;
                }
                if (!e) {
                    i2 = 0;
                }
                a(i, i2, null);
            }
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!a(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(ax axVar) {
        this.E = axVar;
        ah.a((View) this, this.E);
    }

    public void setAdapter(a aVar) {
        setLayoutFrozen(false);
        a(aVar, false, true);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(d dVar) {
        if (dVar != this.aw) {
            this.aw = dVar;
            setChildrenDrawingOrderEnabled(this.aw != null);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.h) {
            j();
        }
        this.h = z;
        super.setClipToPadding(z);
        if (this.r) {
            requestLayout();
        }
    }

    public void setHasFixedSize(boolean z) {
        this.q = z;
    }

    public void setItemAnimator(e eVar) {
        if (this.w != null) {
            this.w.d();
            this.w.a(null);
        }
        this.w = eVar;
        if (this.w != null) {
            this.w.a(this.av);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.d.a(i);
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.t) {
            a("Do not setLayoutFrozen in layout or scroll");
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.t = true;
                this.T = true;
                e();
                return;
            }
            this.t = false;
            if (!(!this.s || this.m == null || this.l == null)) {
                requestLayout();
            }
            this.s = false;
        }
    }

    public void setLayoutManager(h hVar) {
        if (hVar != this.m) {
            e();
            if (this.m != null) {
                if (this.w != null) {
                    this.w.d();
                }
                this.m.c(this.d);
                this.m.b(this.d);
                this.d.a();
                if (this.p) {
                    this.m.b(this, this.d);
                }
                this.m.b(null);
                this.m = null;
            } else {
                this.d.a();
            }
            this.f.a();
            this.m = hVar;
            if (hVar != null) {
                if (hVar.q != null) {
                    throw new IllegalArgumentException("LayoutManager " + hVar + " is already attached to a RecyclerView: " + hVar.q);
                }
                this.m.b(this);
                if (this.p) {
                    this.m.c(this);
                }
            }
            this.d.b();
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().a(z);
    }

    public void setOnFlingListener(k kVar) {
        this.ao = kVar;
    }

    @Deprecated
    public void setOnScrollListener(m mVar) {
        this.at = mVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.as = z;
    }

    public void setRecycledViewPool(n nVar) {
        this.d.a(nVar);
    }

    public void setRecyclerListener(p pVar) {
        this.n = pVar;
    }

    void setScrollState(int i) {
        if (i != this.ag) {
            this.ag = i;
            if (i != 2) {
                B();
            }
            g(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        switch (i) {
            case 0:
                break;
            case 1:
                this.an = viewConfiguration.getScaledPagingTouchSlop();
                return;
            default:
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
                break;
        }
        this.an = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(u uVar) {
        this.d.a(uVar);
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().a(i);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().c();
    }

    void t() {
        if (!this.v) {
            this.v = true;
            int c = this.f.c();
            for (int i = 0; i < c; i++) {
                w e = e(this.f.d(i));
                if (!(e == null || e.c())) {
                    e.b(512);
                }
            }
            this.d.h();
            u();
        }
    }

    void u() {
        int c = this.f.c();
        for (int i = 0; i < c; i++) {
            w e = e(this.f.d(i));
            if (!(e == null || e.c())) {
                e.b(6);
            }
        }
        q();
        this.d.i();
    }

    public boolean v() {
        return !this.r || this.v || this.e.d();
    }

    void w() {
        int b = this.f.b();
        for (int i = 0; i < b; i++) {
            View b2 = this.f.b(i);
            w b3 = b(b2);
            if (!(b3 == null || b3.i == null)) {
                View view = b3.i.a;
                int left = b2.getLeft();
                int top = b2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    void x() {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            w wVar = (w) this.F.get(size);
            if (wVar.a.getParent() == this && !wVar.c()) {
                int i = wVar.l;
                if (i != -1) {
                    ah.c(wVar.a, i);
                    wVar.l = -1;
                }
            }
        }
        this.F.clear();
    }
}
