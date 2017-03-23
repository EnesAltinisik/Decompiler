package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.view.ad;
import android.support.v4.view.af;
import android.support.v4.view.ah;
import android.support.v4.view.as;
import android.support.v4.view.x;
import android.support.v4.view.y;
import android.support.v4.widget.w;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.internal.zzamj;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.messages.Strategy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecyclerView extends ViewGroup implements ad, x {
    static final boolean a;
    private static final Interpolator aq = new Interpolator() {
        public float getInterpolation(float f) {
            float f2 = f - TextTrackStyle.DEFAULT_FONT_SCALE;
            return (f2 * (((f2 * f2) * f2) * f2)) + TextTrackStyle.DEFAULT_FONT_SCALE;
        }
    };
    private static final int[] k = new int[]{16843830};
    private static final boolean l;
    private static final Class<?>[] m = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
    private int A;
    private boolean B;
    private boolean C;
    private boolean D;
    private int E;
    private boolean F;
    private final boolean G;
    private final AccessibilityManager H;
    private List<j> I;
    private boolean J;
    private int K;
    private android.support.v4.widget.j L;
    private android.support.v4.widget.j M;
    private android.support.v4.widget.j N;
    private android.support.v4.widget.j O;
    private int P;
    private int Q;
    private VelocityTracker R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private final int aa;
    private final int ab;
    private float ac;
    private final t ad;
    private l ae;
    private List<l> af;
    private b ag;
    private boolean ah;
    private an ai;
    private d aj;
    private final int[] ak;
    private y al;
    private final int[] am;
    private final int[] an;
    private final int[] ao;
    private Runnable ap;
    private final b ar;
    final n b;
    e c;
    ab d;
    final bc e;
    h f;
    e g;
    final r h;
    boolean i;
    boolean j;
    private final p n;
    private SavedState o;
    private boolean p;
    private final Runnable q;
    private final Rect r;
    private a s;
    private o t;
    private final ArrayList<g> u;
    private final ArrayList<k> v;
    private k w;
    private boolean x;
    private boolean y;
    private boolean z;

    public static class i extends MarginLayoutParams {
        u a;
        final Rect b = new Rect();
        boolean c = true;
        boolean d = false;

        public i(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public i(int i, int i2) {
            super(i, i2);
        }

        public i(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public i(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public i(i iVar) {
            super(iVar);
        }

        public boolean c() {
            return this.a.q();
        }

        public boolean d() {
            return this.a.x();
        }

        public int e() {
            return this.a.d();
        }
    }

    public static abstract class h {
        private boolean a = false;
        private boolean b = false;
        private boolean c = true;
        private int d;
        private int e;
        private int f;
        private int g;
        ab p;
        RecyclerView q;
        q r;
        boolean s = false;

        public static class a {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public abstract i a();

        void b(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.q = null;
                this.p = null;
                this.f = 0;
                this.g = 0;
            } else {
                this.q = recyclerView;
                this.p = recyclerView.d;
                this.f = recyclerView.getWidth();
                this.g = recyclerView.getHeight();
            }
            this.d = 1073741824;
            this.e = 1073741824;
        }

        void a(int i, int i2) {
            this.f = MeasureSpec.getSize(i);
            this.d = MeasureSpec.getMode(i);
            if (this.d == 0 && !RecyclerView.a) {
                this.f = 0;
            }
            this.g = MeasureSpec.getSize(i2);
            this.e = MeasureSpec.getMode(i2);
            if (this.e == 0 && !RecyclerView.a) {
                this.g = 0;
            }
        }

        void b(int i, int i2) {
            int i3 = Strategy.TTL_SECONDS_INFINITE;
            int i4 = zzamj.UNSET_ENUM_VALUE;
            int t = t();
            if (t == 0) {
                this.q.d(i, i2);
                return;
            }
            int i5 = 0;
            int i6 = zzamj.UNSET_ENUM_VALUE;
            int i7 = Strategy.TTL_SECONDS_INFINITE;
            while (i5 < t) {
                View h = h(i5);
                i iVar = (i) h.getLayoutParams();
                int h2 = h(h) - iVar.leftMargin;
                int j = iVar.rightMargin + j(h);
                int i8 = i(h) - iVar.topMargin;
                int k = iVar.bottomMargin + k(h);
                if (h2 >= i7) {
                    h2 = i7;
                }
                if (j <= i6) {
                    j = i6;
                }
                if (i8 >= i3) {
                    i8 = i3;
                }
                if (k <= i4) {
                    k = i4;
                }
                i5++;
                i6 = j;
                i3 = i8;
                i7 = h2;
                i4 = k;
            }
            this.q.r.set(i7, i3, i6, i4);
            a(this.q.r, i, i2);
        }

        public void a(Rect rect, int i, int i2) {
            d(a(i, (rect.width() + y()) + A(), D()), a(i2, (rect.height() + z()) + B(), E()));
        }

        public void n() {
            if (this.q != null) {
                this.q.requestLayout();
            }
        }

        public static int a(int i, int i2, int i3) {
            int mode = MeasureSpec.getMode(i);
            int size = MeasureSpec.getSize(i);
            switch (mode) {
                case zzamj.UNSET_ENUM_VALUE /*-2147483648*/:
                    return Math.min(size, Math.max(i2, i3));
                case 1073741824:
                    return size;
                default:
                    return Math.max(i2, i3);
            }
        }

        public void a(String str) {
            if (this.q != null) {
                this.q.a(str);
            }
        }

        public void c(boolean z) {
            this.b = z;
        }

        public boolean b() {
            return false;
        }

        void c(RecyclerView recyclerView) {
            this.s = true;
            d(recyclerView);
        }

        void b(RecyclerView recyclerView, n nVar) {
            this.s = false;
            a(recyclerView, nVar);
        }

        public boolean o() {
            return this.s;
        }

        public boolean a(Runnable runnable) {
            if (this.q != null) {
                return this.q.removeCallbacks(runnable);
            }
            return false;
        }

        public void d(RecyclerView recyclerView) {
        }

        @Deprecated
        public void e(RecyclerView recyclerView) {
        }

        public void a(RecyclerView recyclerView, n nVar) {
            e(recyclerView);
        }

        public boolean p() {
            return this.q != null && this.q.p;
        }

        public void c(n nVar, r rVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public boolean a(i iVar) {
            return iVar != null;
        }

        public i a(LayoutParams layoutParams) {
            if (layoutParams instanceof i) {
                return new i((i) layoutParams);
            }
            if (layoutParams instanceof MarginLayoutParams) {
                return new i((MarginLayoutParams) layoutParams);
            }
            return new i(layoutParams);
        }

        public i a(Context context, AttributeSet attributeSet) {
            return new i(context, attributeSet);
        }

        public int a(int i, n nVar, r rVar) {
            return 0;
        }

        public int b(int i, n nVar, r rVar) {
            return 0;
        }

        public boolean d() {
            return false;
        }

        public boolean e() {
            return false;
        }

        public void d(int i) {
        }

        public boolean q() {
            return this.r != null && this.r.c();
        }

        public int r() {
            return ah.h(this.q);
        }

        public void a(View view) {
            a(view, -1);
        }

        public void a(View view, int i) {
            a(view, i, true);
        }

        public void b(View view) {
            b(view, -1);
        }

        public void b(View view, int i) {
            a(view, i, false);
        }

        private void a(View view, int i, boolean z) {
            u c = RecyclerView.c(view);
            if (z || c.q()) {
                this.q.e.e(c);
            } else {
                this.q.e.f(c);
            }
            i iVar = (i) view.getLayoutParams();
            if (c.k() || c.i()) {
                if (c.i()) {
                    c.j();
                } else {
                    c.l();
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
                    this.q.f.c(b, i);
                }
            } else {
                this.p.a(view, i, false);
                iVar.c = true;
                if (this.r != null && this.r.c()) {
                    this.r.b(view);
                }
            }
            if (iVar.d) {
                c.a.invalidate();
                iVar.d = false;
            }
        }

        public void c(View view) {
            this.p.a(view);
        }

        public void f(int i) {
            if (h(i) != null) {
                this.p.a(i);
            }
        }

        public int s() {
            return -1;
        }

        public int d(View view) {
            return ((i) view.getLayoutParams()).e();
        }

        public View e(View view) {
            if (this.q == null) {
                return null;
            }
            View b = this.q.b(view);
            if (b == null || this.p.c(b)) {
                return null;
            }
            return b;
        }

        public View c(int i) {
            int t = t();
            for (int i2 = 0; i2 < t; i2++) {
                View h = h(i2);
                u c = RecyclerView.c(h);
                if (c != null && c.d() == i && !c.c() && (this.q.h.a() || !c.q())) {
                    return h;
                }
            }
            return null;
        }

        public void g(int i) {
            a(i, h(i));
        }

        private void a(int i, View view) {
            this.p.d(i);
        }

        public void a(View view, int i, i iVar) {
            u c = RecyclerView.c(view);
            if (c.q()) {
                this.q.e.e(c);
            } else {
                this.q.e.f(c);
            }
            this.p.a(view, i, iVar, c.q());
        }

        public void c(View view, int i) {
            a(view, i, (i) view.getLayoutParams());
        }

        public void c(int i, int i2) {
            View h = h(i);
            if (h == null) {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i);
            }
            g(i);
            c(h, i2);
        }

        public void a(View view, n nVar) {
            c(view);
            nVar.a(view);
        }

        public void a(int i, n nVar) {
            View h = h(i);
            f(i);
            nVar.a(h);
        }

        public int t() {
            return this.p != null ? this.p.b() : 0;
        }

        public View h(int i) {
            return this.p != null ? this.p.b(i) : null;
        }

        public int u() {
            return this.d;
        }

        public int v() {
            return this.e;
        }

        public int w() {
            return this.f;
        }

        public int x() {
            return this.g;
        }

        public int y() {
            return this.q != null ? this.q.getPaddingLeft() : 0;
        }

        public int z() {
            return this.q != null ? this.q.getPaddingTop() : 0;
        }

        public int A() {
            return this.q != null ? this.q.getPaddingRight() : 0;
        }

        public int B() {
            return this.q != null ? this.q.getPaddingBottom() : 0;
        }

        public View C() {
            if (this.q == null) {
                return null;
            }
            View focusedChild = this.q.getFocusedChild();
            if (focusedChild == null || this.p.c(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void i(int i) {
            if (this.q != null) {
                this.q.b(i);
            }
        }

        public void j(int i) {
            if (this.q != null) {
                this.q.a(i);
            }
        }

        public void a(n nVar) {
            for (int t = t() - 1; t >= 0; t--) {
                a(nVar, t, h(t));
            }
        }

        private void a(n nVar, int i, View view) {
            u c = RecyclerView.c(view);
            if (!c.c()) {
                if (!c.n() || c.q() || this.q.s.b()) {
                    g(i);
                    nVar.c(view);
                    this.q.e.h(c);
                    return;
                }
                f(i);
                nVar.b(c);
            }
        }

        void b(n nVar) {
            int d = nVar.d();
            for (int i = d - 1; i >= 0; i--) {
                View e = nVar.e(i);
                u c = RecyclerView.c(e);
                if (!c.c()) {
                    c.a(false);
                    if (c.r()) {
                        this.q.removeDetachedView(e, false);
                    }
                    if (this.q.g != null) {
                        this.q.g.c(c);
                    }
                    c.a(true);
                    nVar.b(e);
                }
            }
            nVar.e();
            if (d > 0) {
                this.q.invalidate();
            }
        }

        boolean a(View view, int i, int i2, i iVar) {
            return (this.c && b(view.getMeasuredWidth(), i, iVar.width) && b(view.getMeasuredHeight(), i2, iVar.height)) ? false : true;
        }

        boolean b(View view, int i, int i2, i iVar) {
            return (!view.isLayoutRequested() && this.c && b(view.getWidth(), i, iVar.width) && b(view.getHeight(), i2, iVar.height)) ? false : true;
        }

        private static boolean b(int i, int i2, int i3) {
            int mode = MeasureSpec.getMode(i2);
            int size = MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            switch (mode) {
                case zzamj.UNSET_ENUM_VALUE /*-2147483648*/:
                    if (size < i) {
                        return false;
                    }
                    return true;
                case 0:
                    return true;
                case 1073741824:
                    if (size != i) {
                        return false;
                    }
                    return true;
                default:
                    return false;
            }
        }

        public void a(View view, int i, int i2) {
            i iVar = (i) view.getLayoutParams();
            Rect g = this.q.g(view);
            int i3 = (g.left + g.right) + i;
            int i4 = (g.bottom + g.top) + i2;
            i3 = a(w(), u(), i3 + (((y() + A()) + iVar.leftMargin) + iVar.rightMargin), iVar.width, d());
            i4 = a(x(), v(), i4 + (((z() + B()) + iVar.topMargin) + iVar.bottomMargin), iVar.height, e());
            if (b(view, i3, i4, iVar)) {
                view.measure(i3, i4);
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
                        case zzamj.UNSET_ENUM_VALUE /*-2147483648*/:
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
                    if (i2 == zzamj.UNSET_ENUM_VALUE || i2 == 1073741824) {
                        i5 = zzamj.UNSET_ENUM_VALUE;
                    }
                }
                max = 0;
            }
            return MeasureSpec.makeMeasureSpec(max, i5);
        }

        public int f(View view) {
            Rect rect = ((i) view.getLayoutParams()).b;
            return rect.right + (view.getMeasuredWidth() + rect.left);
        }

        public int g(View view) {
            Rect rect = ((i) view.getLayoutParams()).b;
            return rect.bottom + (view.getMeasuredHeight() + rect.top);
        }

        public void a(View view, int i, int i2, int i3, int i4) {
            Rect rect = ((i) view.getLayoutParams()).b;
            view.layout(rect.left + i, rect.top + i2, i3 - rect.right, i4 - rect.bottom);
        }

        public int h(View view) {
            return view.getLeft() - n(view);
        }

        public int i(View view) {
            return view.getTop() - l(view);
        }

        public int j(View view) {
            return view.getRight() + o(view);
        }

        public int k(View view) {
            return view.getBottom() + m(view);
        }

        public void a(View view, Rect rect) {
            if (this.q == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(this.q.g(view));
            }
        }

        public int l(View view) {
            return ((i) view.getLayoutParams()).b.top;
        }

        public int m(View view) {
            return ((i) view.getLayoutParams()).b.bottom;
        }

        public int n(View view) {
            return ((i) view.getLayoutParams()).b.left;
        }

        public int o(View view) {
            return ((i) view.getLayoutParams()).b.right;
        }

        public View a(View view, int i, n nVar, r rVar) {
            return null;
        }

        public View d(View view, int i) {
            return null;
        }

        public boolean a(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            int y = y();
            int z2 = z();
            int w = w() - A();
            int x = x() - B();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = left + rect.width();
            int height = top + rect.height();
            int min = Math.min(0, left - y);
            int min2 = Math.min(0, top - z2);
            int max = Math.max(0, width - w);
            x = Math.max(0, height - x);
            if (r() == 1) {
                if (max == 0) {
                    max = Math.max(min, width - w);
                }
                min = max;
            } else {
                min = min != 0 ? min : Math.min(left - y, max);
            }
            max = min2 != 0 ? min2 : Math.min(top - z2, x);
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
            return q() || recyclerView.j();
        }

        public boolean a(RecyclerView recyclerView, r rVar, View view, View view2) {
            return a(recyclerView, view, view2);
        }

        public void a(a aVar, a aVar2) {
        }

        public boolean a(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        public void a(RecyclerView recyclerView) {
        }

        public void a(RecyclerView recyclerView, int i, int i2) {
        }

        public void b(RecyclerView recyclerView, int i, int i2) {
        }

        public void c(RecyclerView recyclerView, int i, int i2) {
        }

        public void a(RecyclerView recyclerView, int i, int i2, Object obj) {
            c(recyclerView, i, i2);
        }

        public void a(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public int d(r rVar) {
            return 0;
        }

        public int b(r rVar) {
            return 0;
        }

        public int f(r rVar) {
            return 0;
        }

        public int e(r rVar) {
            return 0;
        }

        public int c(r rVar) {
            return 0;
        }

        public int g(r rVar) {
            return 0;
        }

        public void a(n nVar, r rVar, int i, int i2) {
            this.q.d(i, i2);
        }

        public void d(int i, int i2) {
            this.q.setMeasuredDimension(i, i2);
        }

        public int D() {
            return ah.p(this.q);
        }

        public int E() {
            return ah.q(this.q);
        }

        public Parcelable c() {
            return null;
        }

        public void a(Parcelable parcelable) {
        }

        void F() {
            if (this.r != null) {
                this.r.a();
            }
        }

        private void a(q qVar) {
            if (this.r == qVar) {
                this.r = null;
            }
        }

        public void k(int i) {
        }

        public void c(n nVar) {
            for (int t = t() - 1; t >= 0; t--) {
                if (!RecyclerView.c(h(t)).c()) {
                    a(t, nVar);
                }
            }
        }

        void a(android.support.v4.view.a.c cVar) {
            a(this.q.b, this.q.h, cVar);
        }

        public void a(n nVar, r rVar, android.support.v4.view.a.c cVar) {
            if (ah.b(this.q, -1) || ah.a(this.q, -1)) {
                cVar.a(8192);
                cVar.i(true);
            }
            if (ah.b(this.q, 1) || ah.a(this.q, 1)) {
                cVar.a(4096);
                cVar.i(true);
            }
            cVar.b(android.support.v4.view.a.c.k.a(a(nVar, rVar), b(nVar, rVar), e(nVar, rVar), d(nVar, rVar)));
        }

        public void a(AccessibilityEvent accessibilityEvent) {
            a(this.q.b, this.q.h, accessibilityEvent);
        }

        public void a(n nVar, r rVar, AccessibilityEvent accessibilityEvent) {
            boolean z = true;
            android.support.v4.view.a.l a = android.support.v4.view.a.a.a(accessibilityEvent);
            if (this.q != null && a != null) {
                if (!(ah.b(this.q, 1) || ah.b(this.q, -1) || ah.a(this.q, -1) || ah.a(this.q, 1))) {
                    z = false;
                }
                a.a(z);
                if (this.q.s != null) {
                    a.a(this.q.s.a());
                }
            }
        }

        void a(View view, android.support.v4.view.a.c cVar) {
            u c = RecyclerView.c(view);
            if (c != null && !c.q() && !this.p.c(c.a)) {
                a(this.q.b, this.q.h, view, cVar);
            }
        }

        public void a(n nVar, r rVar, View view, android.support.v4.view.a.c cVar) {
            int d;
            int d2 = e() ? d(view) : 0;
            if (d()) {
                d = d(view);
            } else {
                d = 0;
            }
            cVar.c(android.support.v4.view.a.c.l.a(d2, 1, d, 1, false, false));
        }

        public void G() {
            this.a = true;
        }

        public int d(n nVar, r rVar) {
            return 0;
        }

        public int a(n nVar, r rVar) {
            if (this.q == null || this.q.s == null || !e()) {
                return 1;
            }
            return this.q.s.a();
        }

        public int b(n nVar, r rVar) {
            if (this.q == null || this.q.s == null || !d()) {
                return 1;
            }
            return this.q.s.a();
        }

        public boolean e(n nVar, r rVar) {
            return false;
        }

        boolean a(int i, Bundle bundle) {
            return a(this.q.b, this.q.h, i, bundle);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(android.support.v7.widget.RecyclerView.n r7, android.support.v7.widget.RecyclerView.r r8, int r9, android.os.Bundle r10) {
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
            r0 = r6.x();
            r3 = r6.z();
            r0 = r0 - r3;
            r3 = r6.B();
            r0 = r0 - r3;
            r0 = -r0;
        L_0x002f:
            r3 = r6.q;
            r3 = android.support.v4.view.ah.a(r3, r4);
            if (r3 == 0) goto L_0x007a;
        L_0x0037:
            r3 = r6.w();
            r4 = r6.y();
            r3 = r3 - r4;
            r4 = r6.A();
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
            r0 = r6.x();
            r3 = r6.z();
            r0 = r0 - r3;
            r3 = r6.B();
            r0 = r0 - r3;
        L_0x0060:
            r3 = r6.q;
            r3 = android.support.v4.view.ah.a(r3, r2);
            if (r3 == 0) goto L_0x007a;
        L_0x0068:
            r3 = r6.w();
            r4 = r6.y();
            r3 = r3 - r4;
            r4 = r6.A();
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
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.h.a(android.support.v7.widget.RecyclerView$n, android.support.v7.widget.RecyclerView$r, int, android.os.Bundle):boolean");
        }

        boolean a(View view, int i, Bundle bundle) {
            return a(this.q.b, this.q.h, view, i, bundle);
        }

        public boolean a(n nVar, r rVar, View view, int i, Bundle bundle) {
            return false;
        }

        public static a a(Context context, AttributeSet attributeSet, int i, int i2) {
            a aVar = new a();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, android.support.v7.e.a.a.RecyclerView, i, i2);
            aVar.a = obtainStyledAttributes.getInt(android.support.v7.e.a.a.RecyclerView_android_orientation, 1);
            aVar.b = obtainStyledAttributes.getInt(android.support.v7.e.a.a.RecyclerView_spanCount, 1);
            aVar.c = obtainStyledAttributes.getBoolean(android.support.v7.e.a.a.RecyclerView_reverseLayout, false);
            aVar.d = obtainStyledAttributes.getBoolean(android.support.v7.e.a.a.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return aVar;
        }

        void f(RecyclerView recyclerView) {
            a(MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        boolean k() {
            return false;
        }

        boolean H() {
            int t = t();
            for (int i = 0; i < t; i++) {
                LayoutParams layoutParams = h(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return a(i);
            }

            public SavedState a(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] a(int i) {
                return new SavedState[i];
            }
        };
        Parcelable a;

        SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readParcelable(h.class.getClassLoader());
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.a, 0);
        }

        private void a(SavedState savedState) {
            this.a = savedState.a;
        }
    }

    public static abstract class a<VH extends u> {
        private final b a;
        private boolean b;

        public abstract int a();

        public abstract VH a(ViewGroup viewGroup, int i);

        public abstract void a(VH vh, int i);

        public void a(VH vh, int i, List<Object> list) {
            a((u) vh, i);
        }

        public final VH b(ViewGroup viewGroup, int i) {
            android.support.v4.f.h.a("RV CreateView");
            VH a = a(viewGroup, i);
            a.e = i;
            android.support.v4.f.h.a();
            return a;
        }

        public final void b(VH vh, int i) {
            vh.b = i;
            if (b()) {
                vh.d = b(i);
            }
            vh.a(1, 519);
            android.support.v4.f.h.a("RV OnBindView");
            a(vh, i, vh.u());
            vh.t();
            android.support.v4.f.h.a();
        }

        public int a(int i) {
            return 0;
        }

        public long b(int i) {
            return -1;
        }

        public final boolean b() {
            return this.b;
        }

        public void a(VH vh) {
        }

        public boolean b(VH vh) {
            return false;
        }

        public void c(VH vh) {
        }

        public void d(VH vh) {
        }

        public void a(c cVar) {
            this.a.registerObserver(cVar);
        }

        public void b(c cVar) {
            this.a.unregisterObserver(cVar);
        }

        public void a(RecyclerView recyclerView) {
        }

        public void b(RecyclerView recyclerView) {
        }
    }

    static class b extends Observable<c> {
    }

    public static abstract class c {
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
            void a(u uVar);
        }

        public static class c {
            public int a;
            public int b;
            public int c;
            public int d;

            public c a(u uVar) {
                return a(uVar, 0);
            }

            public c a(u uVar, int i) {
                View view = uVar.a;
                this.a = view.getLeft();
                this.b = view.getTop();
                this.c = view.getRight();
                this.d = view.getBottom();
                return this;
            }
        }

        public abstract void a();

        public abstract boolean a(u uVar, c cVar, c cVar2);

        public abstract boolean a(u uVar, u uVar2, c cVar, c cVar2);

        public abstract boolean b();

        public abstract boolean b(u uVar, c cVar, c cVar2);

        public abstract void c();

        public abstract void c(u uVar);

        public abstract boolean c(u uVar, c cVar, c cVar2);

        public long d() {
            return this.e;
        }

        public long e() {
            return this.c;
        }

        public long f() {
            return this.d;
        }

        public long g() {
            return this.f;
        }

        void a(b bVar) {
            this.a = bVar;
        }

        public c a(r rVar, u uVar, int i, List<Object> list) {
            return i().a(uVar);
        }

        public c a(r rVar, u uVar) {
            return i().a(uVar);
        }

        static int d(u uVar) {
            int f = uVar.l & 14;
            if (uVar.n()) {
                return 4;
            }
            if ((f & 4) != 0) {
                return f;
            }
            int f2 = uVar.f();
            int e = uVar.e();
            if (f2 == -1 || e == -1 || f2 == e) {
                return f;
            }
            return f | 2048;
        }

        public final void e(u uVar) {
            f(uVar);
            if (this.a != null) {
                this.a.a(uVar);
            }
        }

        public void f(u uVar) {
        }

        public boolean g(u uVar) {
            return true;
        }

        public boolean a(u uVar, List<Object> list) {
            return g(uVar);
        }

        public final void h() {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                ((a) this.b.get(i)).a();
            }
            this.b.clear();
        }

        public c i() {
            return new c();
        }
    }

    private class f implements b {
        final /* synthetic */ RecyclerView a;

        private f(RecyclerView recyclerView) {
            this.a = recyclerView;
        }

        public void a(u uVar) {
            uVar.a(true);
            if (uVar.g != null && uVar.h == null) {
                uVar.g = null;
            }
            uVar.h = null;
            if (!uVar.B() && !this.a.h(uVar.a) && uVar.r()) {
                this.a.removeDetachedView(uVar.a, false);
            }
        }
    }

    public static abstract class g {
        public void a(Canvas canvas, RecyclerView recyclerView, r rVar) {
            a(canvas, recyclerView);
        }

        @Deprecated
        public void a(Canvas canvas, RecyclerView recyclerView) {
        }

        public void b(Canvas canvas, RecyclerView recyclerView, r rVar) {
            b(canvas, recyclerView);
        }

        @Deprecated
        public void b(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        public void a(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void a(Rect rect, View view, RecyclerView recyclerView, r rVar) {
            a(rect, ((i) view.getLayoutParams()).e(), recyclerView);
        }
    }

    public interface j {
        void a(View view);

        void b(View view);
    }

    public interface k {
        void a(boolean z);

        boolean a(RecyclerView recyclerView, MotionEvent motionEvent);

        void b(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    public static abstract class l {
        public void a(RecyclerView recyclerView, int i) {
        }

        public void a(RecyclerView recyclerView, int i, int i2) {
        }
    }

    public static class m {
        private SparseArray<ArrayList<u>> a = new SparseArray();
        private SparseIntArray b = new SparseIntArray();
        private int c = 0;

        public void a() {
            this.a.clear();
        }

        public u a(int i) {
            ArrayList arrayList = (ArrayList) this.a.get(i);
            if (arrayList == null || arrayList.isEmpty()) {
                return null;
            }
            int size = arrayList.size() - 1;
            u uVar = (u) arrayList.get(size);
            arrayList.remove(size);
            return uVar;
        }

        public void a(u uVar) {
            int h = uVar.h();
            ArrayList b = b(h);
            if (this.b.get(h) > b.size()) {
                uVar.v();
                b.add(uVar);
            }
        }

        void a(a aVar) {
            this.c++;
        }

        void b() {
            this.c--;
        }

        void a(a aVar, a aVar2, boolean z) {
            if (aVar != null) {
                b();
            }
            if (!z && this.c == 0) {
                a();
            }
            if (aVar2 != null) {
                a(aVar2);
            }
        }

        private ArrayList<u> b(int i) {
            ArrayList<u> arrayList = (ArrayList) this.a.get(i);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(i, arrayList);
                if (this.b.indexOfKey(i) < 0) {
                    this.b.put(i, 5);
                }
            }
            return arrayList;
        }
    }

    public final class n {
        final ArrayList<u> a = new ArrayList();
        final ArrayList<u> b = new ArrayList();
        final /* synthetic */ RecyclerView c;
        private ArrayList<u> d = null;
        private final List<u> e = Collections.unmodifiableList(this.a);
        private int f = 2;
        private m g;
        private s h;

        public n(RecyclerView recyclerView) {
            this.c = recyclerView;
        }

        public void a() {
            this.a.clear();
            c();
        }

        public void a(int i) {
            this.f = i;
            for (int size = this.b.size() - 1; size >= 0 && this.b.size() > i; size--) {
                d(size);
            }
        }

        public List<u> b() {
            return this.e;
        }

        boolean a(u uVar) {
            if (uVar.q()) {
                return this.c.h.a();
            }
            if (uVar.b < 0 || uVar.b >= this.c.s.a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + uVar);
            } else if (!this.c.h.a() && this.c.s.a(uVar.b) != uVar.h()) {
                return false;
            } else {
                if (!this.c.s.b() || uVar.g() == this.c.s.b(uVar.b)) {
                    return true;
                }
                return false;
            }
        }

        public int b(int i) {
            if (i >= 0 && i < this.c.h.e()) {
                return !this.c.h.a() ? i : this.c.c.b(i);
            } else {
                throw new IndexOutOfBoundsException("invalid position " + i + ". State " + "item count is " + this.c.h.e());
            }
        }

        public View c(int i) {
            return a(i, false);
        }

        View a(int i, boolean z) {
            boolean z2 = true;
            if (i < 0 || i >= this.c.h.e()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + this.c.h.e());
            }
            u f;
            boolean z3;
            u uVar;
            boolean z4;
            int b;
            boolean z5;
            int b2;
            LayoutParams layoutParams;
            i iVar;
            if (this.c.h.a()) {
                f = f(i);
                u uVar2 = f;
                z3 = f != null;
                uVar = uVar2;
            } else {
                uVar = null;
                z3 = false;
            }
            if (uVar == null) {
                uVar = a(i, -1, z);
                if (uVar != null) {
                    if (a(uVar)) {
                        z4 = true;
                    } else {
                        if (!z) {
                            uVar.b(4);
                            if (uVar.i()) {
                                this.c.removeDetachedView(uVar.a, false);
                                uVar.j();
                            } else if (uVar.k()) {
                                uVar.l();
                            }
                            b(uVar);
                        }
                        uVar = null;
                        z4 = z3;
                    }
                    if (uVar == null) {
                        b = this.c.c.b(i);
                        if (b >= 0 || b >= this.c.s.a()) {
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + b + ")." + "state:" + this.c.h.e());
                        }
                        int a = this.c.s.a(b);
                        if (this.c.s.b()) {
                            uVar = a(this.c.s.b(b), a, z);
                            if (uVar != null) {
                                uVar.b = b;
                                z4 = true;
                            }
                        }
                        if (uVar == null && this.h != null) {
                            View a2 = this.h.a(this, i, a);
                            if (a2 != null) {
                                uVar = this.c.a(a2);
                                if (uVar == null) {
                                    throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder");
                                } else if (uVar.c()) {
                                    throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                                }
                            }
                        }
                        if (uVar == null) {
                            uVar = f().a(a);
                            if (uVar != null) {
                                uVar.v();
                                if (RecyclerView.l) {
                                    f(uVar);
                                }
                            }
                        }
                        if (uVar == null) {
                            f = this.c.s.b(this.c, a);
                            z5 = z4;
                            if (z5 && !this.c.h.a() && f.a(8192)) {
                                f.a(0, 8192);
                                if (this.c.h.i) {
                                    this.c.a(f, this.c.g.a(this.c.h, f, e.d(f) | 4096, f.u()));
                                }
                            }
                            int i2;
                            if (!this.c.h.a() && f.p()) {
                                f.f = i;
                                i2 = 0;
                            } else if (f.p() || f.o() || f.n()) {
                                b2 = this.c.c.b(i);
                                f.k = this.c;
                                this.c.s.b(f, b2);
                                d(f.a);
                                if (this.c.h.a()) {
                                    f.f = i;
                                }
                                z4 = true;
                            } else {
                                i2 = 0;
                            }
                            layoutParams = f.a.getLayoutParams();
                            if (layoutParams != null) {
                                iVar = (i) this.c.generateDefaultLayoutParams();
                                f.a.setLayoutParams(iVar);
                            } else if (this.c.checkLayoutParams(layoutParams)) {
                                iVar = (i) layoutParams;
                            } else {
                                iVar = (i) this.c.generateLayoutParams(layoutParams);
                                f.a.setLayoutParams(iVar);
                            }
                            iVar.a = f;
                            if (!z5 || r3 == 0) {
                                z2 = false;
                            }
                            iVar.d = z2;
                            return f.a;
                        }
                    }
                    f = uVar;
                    z5 = z4;
                    f.a(0, 8192);
                    if (this.c.h.i) {
                        this.c.a(f, this.c.g.a(this.c.h, f, e.d(f) | 4096, f.u()));
                    }
                    if (!this.c.h.a()) {
                    }
                    if (f.p()) {
                    }
                    b2 = this.c.c.b(i);
                    f.k = this.c;
                    this.c.s.b(f, b2);
                    d(f.a);
                    if (this.c.h.a()) {
                        f.f = i;
                    }
                    z4 = true;
                    layoutParams = f.a.getLayoutParams();
                    if (layoutParams != null) {
                        iVar = (i) this.c.generateDefaultLayoutParams();
                        f.a.setLayoutParams(iVar);
                    } else if (this.c.checkLayoutParams(layoutParams)) {
                        iVar = (i) layoutParams;
                    } else {
                        iVar = (i) this.c.generateLayoutParams(layoutParams);
                        f.a.setLayoutParams(iVar);
                    }
                    iVar.a = f;
                    z2 = false;
                    iVar.d = z2;
                    return f.a;
                }
            }
            z4 = z3;
            if (uVar == null) {
                b = this.c.c.b(i);
                if (b >= 0) {
                }
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + b + ")." + "state:" + this.c.h.e());
            }
            f = uVar;
            z5 = z4;
            f.a(0, 8192);
            if (this.c.h.i) {
                this.c.a(f, this.c.g.a(this.c.h, f, e.d(f) | 4096, f.u()));
            }
            if (!this.c.h.a()) {
            }
            if (f.p()) {
            }
            b2 = this.c.c.b(i);
            f.k = this.c;
            this.c.s.b(f, b2);
            d(f.a);
            if (this.c.h.a()) {
                f.f = i;
            }
            z4 = true;
            layoutParams = f.a.getLayoutParams();
            if (layoutParams != null) {
                iVar = (i) this.c.generateDefaultLayoutParams();
                f.a.setLayoutParams(iVar);
            } else if (this.c.checkLayoutParams(layoutParams)) {
                iVar = (i) this.c.generateLayoutParams(layoutParams);
                f.a.setLayoutParams(iVar);
            } else {
                iVar = (i) layoutParams;
            }
            iVar.a = f;
            z2 = false;
            iVar.d = z2;
            return f.a;
        }

        private void d(View view) {
            if (this.c.i()) {
                if (ah.e(view) == 0) {
                    ah.c(view, 1);
                }
                if (!ah.b(view)) {
                    ah.a(view, this.c.ai.b());
                }
            }
        }

        private void f(u uVar) {
            if (uVar.a instanceof ViewGroup) {
                a((ViewGroup) uVar.a, false);
            }
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

        public void a(View view) {
            u c = RecyclerView.c(view);
            if (c.r()) {
                this.c.removeDetachedView(view, false);
            }
            if (c.i()) {
                c.j();
            } else if (c.k()) {
                c.l();
            }
            b(c);
        }

        void c() {
            for (int size = this.b.size() - 1; size >= 0; size--) {
                d(size);
            }
            this.b.clear();
        }

        void d(int i) {
            c((u) this.b.get(i));
            this.b.remove(i);
        }

        void b(u uVar) {
            boolean z = true;
            int i = 0;
            if (uVar.i() || uVar.a.getParent() != null) {
                StringBuilder append = new StringBuilder().append("Scrapped or attached views may not be recycled. isScrap:").append(uVar.i()).append(" isAttached:");
                if (uVar.a.getParent() == null) {
                    z = false;
                }
                throw new IllegalArgumentException(append.append(z).toString());
            } else if (uVar.r()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + uVar);
            } else if (uVar.c()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
            } else {
                int i2;
                boolean c = uVar.C();
                boolean z2 = this.c.s != null && c && this.c.s.b(uVar);
                if (z2 || uVar.w()) {
                    if (!uVar.a(14)) {
                        int size = this.b.size();
                        if (size == this.f && size > 0) {
                            d(0);
                        }
                        if (size < this.f) {
                            this.b.add(uVar);
                            z2 = true;
                            if (z2) {
                                c(uVar);
                                i = 1;
                                i2 = z2;
                            } else {
                                z = z2;
                            }
                        }
                    }
                    z2 = false;
                    if (z2) {
                        z = z2;
                    } else {
                        c(uVar);
                        i = 1;
                        i2 = z2;
                    }
                } else {
                    i2 = 0;
                }
                this.c.e.g(uVar);
                if (i2 == 0 && r1 == 0 && c) {
                    uVar.k = null;
                }
            }
        }

        void c(u uVar) {
            ah.a(uVar.a, null);
            e(uVar);
            uVar.k = null;
            f().a(uVar);
        }

        void b(View view) {
            u c = RecyclerView.c(view);
            c.o = null;
            c.p = false;
            c.l();
            b(c);
        }

        void c(View view) {
            u c = RecyclerView.c(view);
            if (!c.a(12) && c.x() && !this.c.c(c)) {
                if (this.d == null) {
                    this.d = new ArrayList();
                }
                c.a(this, true);
                this.d.add(c);
            } else if (!c.n() || c.q() || this.c.s.b()) {
                c.a(this, false);
                this.a.add(c);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
            }
        }

        void d(u uVar) {
            if (uVar.p) {
                this.d.remove(uVar);
            } else {
                this.a.remove(uVar);
            }
            uVar.o = null;
            uVar.p = false;
            uVar.l();
        }

        int d() {
            return this.a.size();
        }

        View e(int i) {
            return ((u) this.a.get(i)).a;
        }

        void e() {
            this.a.clear();
            if (this.d != null) {
                this.d.clear();
            }
        }

        u f(int i) {
            int i2 = 0;
            if (this.d != null) {
                int size = this.d.size();
                if (size != 0) {
                    u uVar;
                    int i3 = 0;
                    while (i3 < size) {
                        uVar = (u) this.d.get(i3);
                        if (uVar.k() || uVar.d() != i) {
                            i3++;
                        } else {
                            uVar.b(32);
                            return uVar;
                        }
                    }
                    if (this.c.s.b()) {
                        int b = this.c.c.b(i);
                        if (b > 0 && b < this.c.s.a()) {
                            long b2 = this.c.s.b(b);
                            while (i2 < size) {
                                uVar = (u) this.d.get(i2);
                                if (uVar.k() || uVar.g() != b2) {
                                    i2++;
                                } else {
                                    uVar.b(32);
                                    return uVar;
                                }
                            }
                        }
                    }
                    return null;
                }
            }
            return null;
        }

        u a(int i, int i2, boolean z) {
            View a;
            int i3 = 0;
            int size = this.a.size();
            int i4 = 0;
            while (i4 < size) {
                u uVar = (u) this.a.get(i4);
                if (uVar.k() || uVar.d() != i || uVar.n() || (!this.c.h.h && uVar.q())) {
                    i4++;
                } else if (i2 == -1 || uVar.h() == i2) {
                    uVar.b(32);
                    return uVar;
                } else {
                    Log.e("RecyclerView", "Scrap view for position " + i + " isn't dirty but has" + " wrong view type! (found " + uVar.h() + " but expected " + i2 + ")");
                    if (!z) {
                        a = this.c.d.a(i, i2);
                        if (a != null) {
                            uVar = RecyclerView.c(a);
                            this.c.d.e(a);
                            i3 = this.c.d.b(a);
                            if (i3 != -1) {
                                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + uVar);
                            }
                            this.c.d.d(i3);
                            c(a);
                            uVar.b(8224);
                            return uVar;
                        }
                    }
                    i4 = this.b.size();
                    while (i3 < i4) {
                        uVar = (u) this.b.get(i3);
                        if (uVar.n() || uVar.d() != i) {
                            i3++;
                        } else if (z) {
                            return uVar;
                        } else {
                            this.b.remove(i3);
                            return uVar;
                        }
                    }
                    return null;
                }
            }
            if (z) {
                a = this.c.d.a(i, i2);
                if (a != null) {
                    uVar = RecyclerView.c(a);
                    this.c.d.e(a);
                    i3 = this.c.d.b(a);
                    if (i3 != -1) {
                        this.c.d.d(i3);
                        c(a);
                        uVar.b(8224);
                        return uVar;
                    }
                    throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + uVar);
                }
            }
            i4 = this.b.size();
            while (i3 < i4) {
                uVar = (u) this.b.get(i3);
                if (uVar.n()) {
                }
                i3++;
            }
            return null;
        }

        u a(long j, int i, boolean z) {
            int size;
            for (size = this.a.size() - 1; size >= 0; size--) {
                u uVar = (u) this.a.get(size);
                if (uVar.g() == j && !uVar.k()) {
                    if (i == uVar.h()) {
                        uVar.b(32);
                        if (!uVar.q() || this.c.h.a()) {
                            return uVar;
                        }
                        uVar.a(2, 14);
                        return uVar;
                    } else if (!z) {
                        this.a.remove(size);
                        this.c.removeDetachedView(uVar.a, false);
                        b(uVar.a);
                    }
                }
            }
            for (size = this.b.size() - 1; size >= 0; size--) {
                uVar = (u) this.b.get(size);
                if (uVar.g() == j) {
                    if (i == uVar.h()) {
                        if (z) {
                            return uVar;
                        }
                        this.b.remove(size);
                        return uVar;
                    } else if (!z) {
                        d(size);
                    }
                }
            }
            return null;
        }

        void e(u uVar) {
            if (this.c.t != null) {
                this.c.t.a(uVar);
            }
            if (this.c.s != null) {
                this.c.s.a(uVar);
            }
            if (this.c.h != null) {
                this.c.e.g(uVar);
            }
        }

        void a(a aVar, a aVar2, boolean z) {
            a();
            f().a(aVar, aVar2, z);
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
            int size = this.b.size();
            for (int i6 = 0; i6 < size; i6++) {
                u uVar = (u) this.b.get(i6);
                if (uVar != null && uVar.b >= r3 && uVar.b <= r2) {
                    if (uVar.b == i) {
                        uVar.a(i2 - i, false);
                    } else {
                        uVar.a(i3, false);
                    }
                }
            }
        }

        void b(int i, int i2) {
            int size = this.b.size();
            for (int i3 = 0; i3 < size; i3++) {
                u uVar = (u) this.b.get(i3);
                if (uVar != null && uVar.b >= i) {
                    uVar.a(i2, true);
                }
            }
        }

        void b(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.b.size() - 1; size >= 0; size--) {
                u uVar = (u) this.b.get(size);
                if (uVar != null) {
                    if (uVar.b >= i3) {
                        uVar.a(-i2, z);
                    } else if (uVar.b >= i) {
                        uVar.b(8);
                        d(size);
                    }
                }
            }
        }

        void a(s sVar) {
            this.h = sVar;
        }

        void a(m mVar) {
            if (this.g != null) {
                this.g.b();
            }
            this.g = mVar;
            if (mVar != null) {
                this.g.a(this.c.getAdapter());
            }
        }

        m f() {
            if (this.g == null) {
                this.g = new m();
            }
            return this.g;
        }

        void c(int i, int i2) {
            int i3 = i + i2;
            for (int size = this.b.size() - 1; size >= 0; size--) {
                u uVar = (u) this.b.get(size);
                if (uVar != null) {
                    int d = uVar.d();
                    if (d >= i && d < i3) {
                        uVar.b(2);
                        d(size);
                    }
                }
            }
        }

        void g() {
            if (this.c.s == null || !this.c.s.b()) {
                c();
                return;
            }
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                u uVar = (u) this.b.get(i);
                if (uVar != null) {
                    uVar.b(6);
                    uVar.a(null);
                }
            }
        }

        void h() {
            int i;
            int i2 = 0;
            int size = this.b.size();
            for (i = 0; i < size; i++) {
                ((u) this.b.get(i)).a();
            }
            size = this.a.size();
            for (i = 0; i < size; i++) {
                ((u) this.a.get(i)).a();
            }
            if (this.d != null) {
                i = this.d.size();
                while (i2 < i) {
                    ((u) this.d.get(i2)).a();
                    i2++;
                }
            }
        }

        void i() {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                i iVar = (i) ((u) this.b.get(i)).a.getLayoutParams();
                if (iVar != null) {
                    iVar.c = true;
                }
            }
        }
    }

    public interface o {
        void a(u uVar);
    }

    private class p extends c {
        final /* synthetic */ RecyclerView a;

        private p(RecyclerView recyclerView) {
            this.a = recyclerView;
        }
    }

    public static abstract class q {
        private int a;
        private RecyclerView b;
        private h c;
        private boolean d;
        private boolean e;
        private View f;
        private final a g;

        public static class a {
            private int a;
            private int b;
            private int c;
            private int d;
            private Interpolator e;
            private boolean f;
            private int g;

            boolean a() {
                return this.d >= 0;
            }

            private void a(RecyclerView recyclerView) {
                if (this.d >= 0) {
                    int i = this.d;
                    this.d = -1;
                    recyclerView.e(i);
                    this.f = false;
                } else if (this.f) {
                    b();
                    if (this.e != null) {
                        recyclerView.ad.a(this.a, this.b, this.c, this.e);
                    } else if (this.c == zzamj.UNSET_ENUM_VALUE) {
                        recyclerView.ad.b(this.a, this.b);
                    } else {
                        recyclerView.ad.a(this.a, this.b, this.c);
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

            private void b() {
                if (this.e != null && this.c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }
        }

        protected abstract void a(int i, int i2, r rVar, a aVar);

        protected abstract void a(View view, r rVar, a aVar);

        protected abstract void e();

        public void a(int i) {
            this.a = i;
        }

        protected final void a() {
            if (this.e) {
                e();
                this.b.h.b = -1;
                this.f = null;
                this.a = -1;
                this.d = false;
                this.e = false;
                this.c.a(this);
                this.c = null;
                this.b = null;
            }
        }

        public boolean b() {
            return this.d;
        }

        public boolean c() {
            return this.e;
        }

        public int d() {
            return this.a;
        }

        private void a(int i, int i2) {
            RecyclerView recyclerView = this.b;
            if (!this.e || this.a == -1 || recyclerView == null) {
                a();
            }
            this.d = false;
            if (this.f != null) {
                if (a(this.f) == this.a) {
                    a(this.f, recyclerView.h, this.g);
                    this.g.a(recyclerView);
                    a();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f = null;
                }
            }
            if (this.e) {
                a(i, i2, recyclerView.h, this.g);
                boolean a = this.g.a();
                this.g.a(recyclerView);
                if (!a) {
                    return;
                }
                if (this.e) {
                    this.d = true;
                    recyclerView.ad.a();
                    return;
                }
                a();
            }
        }

        public int a(View view) {
            return this.b.d(view);
        }

        protected void b(View view) {
            if (a(view) == d()) {
                this.f = view;
            }
        }
    }

    public static class r {
        int a = 0;
        private int b = -1;
        private int c = 1;
        private SparseArray<Object> d;
        private int e = 0;
        private int f = 0;
        private boolean g = false;
        private boolean h = false;
        private boolean i = false;
        private boolean j = false;
        private boolean k = false;
        private boolean l = false;

        static /* synthetic */ int a(r rVar, int i) {
            int i2 = rVar.f + i;
            rVar.f = i2;
            return i2;
        }

        void a(int i) {
            if ((this.c & i) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.c));
            }
        }

        public boolean a() {
            return this.h;
        }

        public boolean b() {
            return this.j;
        }

        public int c() {
            return this.b;
        }

        public boolean d() {
            return this.b != -1;
        }

        public int e() {
            return this.h ? this.e - this.f : this.a;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.b + ", mData=" + this.d + ", mItemCount=" + this.a + ", mPreviousLayoutItemCount=" + this.e + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f + ", mStructureChanged=" + this.g + ", mInPreLayout=" + this.h + ", mRunSimpleAnimations=" + this.i + ", mRunPredictiveAnimations=" + this.j + '}';
        }
    }

    public static abstract class s {
        public abstract View a(n nVar, int i, int i2);
    }

    private class t implements Runnable {
        final /* synthetic */ RecyclerView a;
        private int b;
        private int c;
        private w d;
        private Interpolator e = RecyclerView.aq;
        private boolean f = false;
        private boolean g = false;

        public t(RecyclerView recyclerView) {
            this.a = recyclerView;
            this.d = w.a(recyclerView.getContext(), RecyclerView.aq);
        }

        public void run() {
            if (this.a.f == null) {
                b();
                return;
            }
            c();
            this.a.t();
            w wVar = this.d;
            q qVar = this.a.f.r;
            if (wVar.g()) {
                int e;
                int i;
                int f;
                int i2;
                Object obj;
                Object obj2;
                int b = wVar.b();
                int c = wVar.c();
                int i3 = b - this.b;
                int i4 = c - this.c;
                int i5 = 0;
                int i6 = 0;
                this.b = b;
                this.c = c;
                int i7 = 0;
                int i8 = 0;
                if (this.a.s != null) {
                    this.a.b();
                    this.a.z();
                    android.support.v4.f.h.a("RV Scroll");
                    if (i3 != 0) {
                        i5 = this.a.f.a(i3, this.a.b, this.a.h);
                        i7 = i3 - i5;
                    }
                    if (i4 != 0) {
                        i6 = this.a.f.b(i4, this.a.b, this.a.h);
                        i8 = i4 - i6;
                    }
                    android.support.v4.f.h.a();
                    this.a.I();
                    this.a.A();
                    this.a.a(false);
                    if (!(qVar == null || qVar.b() || !qVar.c())) {
                        e = this.a.h.e();
                        if (e == 0) {
                            qVar.a();
                            i = i7;
                            i7 = i6;
                            i6 = i;
                        } else if (qVar.d() >= e) {
                            qVar.a(e - 1);
                            qVar.a(i3 - i7, i4 - i8);
                            i = i7;
                            i7 = i6;
                            i6 = i;
                        } else {
                            qVar.a(i3 - i7, i4 - i8);
                        }
                        if (!this.a.u.isEmpty()) {
                            this.a.invalidate();
                        }
                        if (ah.a(this.a) != 2) {
                            this.a.i(i3, i4);
                        }
                        if (!(i6 == 0 && i8 == 0)) {
                            f = (int) wVar.f();
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
                            if (ah.a(this.a) != 2) {
                                this.a.c(i2, f);
                            }
                            if ((i2 != 0 || i6 == b || wVar.d() == 0) && (f != 0 || i8 == c || wVar.e() == 0)) {
                                wVar.h();
                            }
                        }
                        if (!(i5 == 0 && i7 == 0)) {
                            this.a.h(i5, i7);
                        }
                        if (!this.a.awakenScrollBars()) {
                            this.a.invalidate();
                        }
                        obj = (i4 == 0 && this.a.f.e() && i7 == i4) ? 1 : null;
                        obj2 = (i3 == 0 && this.a.f.d() && i5 == i3) ? 1 : null;
                        obj2 = ((i3 == 0 || i4 != 0) && obj2 == null && obj == null) ? null : 1;
                        if (!wVar.a() || obj2 == null) {
                            this.a.setScrollState(0);
                        } else {
                            a();
                        }
                    }
                }
                i = i7;
                i7 = i6;
                i6 = i;
                if (this.a.u.isEmpty()) {
                    this.a.invalidate();
                }
                if (ah.a(this.a) != 2) {
                    this.a.i(i3, i4);
                }
                f = (int) wVar.f();
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
                if (ah.a(this.a) != 2) {
                    this.a.c(i2, f);
                }
                wVar.h();
                this.a.h(i5, i7);
                if (this.a.awakenScrollBars()) {
                    this.a.invalidate();
                }
                if (i4 == 0) {
                }
                if (i3 == 0) {
                }
                if (i3 == 0) {
                }
                if (wVar.a()) {
                }
                this.a.setScrollState(0);
            }
            if (qVar != null) {
                if (qVar.b()) {
                    qVar.a(0, 0);
                }
                if (!this.g) {
                    qVar.a();
                }
            }
            d();
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
            this.a.removeCallbacks(this);
            ah.a(this.a, (Runnable) this);
        }

        public void a(int i, int i2) {
            this.a.setScrollState(2);
            this.c = 0;
            this.b = 0;
            this.d.a(0, 0, i, i2, zzamj.UNSET_ENUM_VALUE, Strategy.TTL_SECONDS_INFINITE, zzamj.UNSET_ENUM_VALUE, Strategy.TTL_SECONDS_INFINITE);
            a();
        }

        public void b(int i, int i2) {
            a(i, i2, 0, 0);
        }

        public void a(int i, int i2, int i3, int i4) {
            a(i, i2, b(i, i2, i3, i4));
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
            int width = obj != null ? this.a.getWidth() : this.a.getHeight();
            int i5 = width / 2;
            float a = (a(Math.min(TextTrackStyle.DEFAULT_FONT_SCALE, (((float) sqrt2) * TextTrackStyle.DEFAULT_FONT_SCALE) / ((float) width))) * ((float) i5)) + ((float) i5);
            if (sqrt > 0) {
                round = Math.round(1000.0f * Math.abs(a / ((float) sqrt))) * 4;
            } else {
                if (obj != null) {
                    round = abs;
                } else {
                    round = abs2;
                }
                round = (int) (((((float) round) / ((float) width)) + TextTrackStyle.DEFAULT_FONT_SCALE) * BitmapDescriptorFactory.HUE_MAGENTA);
            }
            return Math.min(round, 2000);
        }

        public void a(int i, int i2, int i3) {
            a(i, i2, i3, RecyclerView.aq);
        }

        public void a(int i, int i2, int i3, Interpolator interpolator) {
            if (this.e != interpolator) {
                this.e = interpolator;
                this.d = w.a(this.a.getContext(), interpolator);
            }
            this.a.setScrollState(2);
            this.c = 0;
            this.b = 0;
            this.d.a(0, 0, i, i2, i3);
            a();
        }

        public void b() {
            this.a.removeCallbacks(this);
            this.d.h();
        }
    }

    public static abstract class u {
        private static final List<Object> m = Collections.EMPTY_LIST;
        public final View a;
        int b;
        int c;
        long d;
        int e;
        int f;
        u g;
        u h;
        List<Object> i;
        List<Object> j;
        RecyclerView k;
        private int l;
        private int n;
        private n o;
        private boolean p;
        private int q;

        void a(int i, int i2, boolean z) {
            b(8);
            a(i2, z);
            this.b = i;
        }

        void a(int i, boolean z) {
            if (this.c == -1) {
                this.c = this.b;
            }
            if (this.f == -1) {
                this.f = this.b;
            }
            if (z) {
                this.f += i;
            }
            this.b += i;
            if (this.a.getLayoutParams() != null) {
                ((i) this.a.getLayoutParams()).c = true;
            }
        }

        void a() {
            this.c = -1;
            this.f = -1;
        }

        void b() {
            if (this.c == -1) {
                this.c = this.b;
            }
        }

        boolean c() {
            return (this.l & 128) != 0;
        }

        public final int d() {
            return this.f == -1 ? this.b : this.f;
        }

        public final int e() {
            if (this.k == null) {
                return -1;
            }
            return this.k.d(this);
        }

        public final int f() {
            return this.c;
        }

        public final long g() {
            return this.d;
        }

        public final int h() {
            return this.e;
        }

        boolean i() {
            return this.o != null;
        }

        void j() {
            this.o.d(this);
        }

        boolean k() {
            return (this.l & 32) != 0;
        }

        void l() {
            this.l &= -33;
        }

        void m() {
            this.l &= -257;
        }

        void a(n nVar, boolean z) {
            this.o = nVar;
            this.p = z;
        }

        boolean n() {
            return (this.l & 4) != 0;
        }

        boolean o() {
            return (this.l & 2) != 0;
        }

        boolean p() {
            return (this.l & 1) != 0;
        }

        boolean q() {
            return (this.l & 8) != 0;
        }

        boolean a(int i) {
            return (this.l & i) != 0;
        }

        boolean r() {
            return (this.l & 256) != 0;
        }

        boolean s() {
            return (this.l & 512) != 0 || n();
        }

        void a(int i, int i2) {
            this.l = (this.l & (i2 ^ -1)) | (i & i2);
        }

        void b(int i) {
            this.l |= i;
        }

        void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((this.l & 1024) == 0) {
                y();
                this.i.add(obj);
            }
        }

        private void y() {
            if (this.i == null) {
                this.i = new ArrayList();
                this.j = Collections.unmodifiableList(this.i);
            }
        }

        void t() {
            if (this.i != null) {
                this.i.clear();
            }
            this.l &= -1025;
        }

        List<Object> u() {
            if ((this.l & 1024) != 0) {
                return m;
            }
            if (this.i == null || this.i.size() == 0) {
                return m;
            }
            return this.j;
        }

        void v() {
            this.l = 0;
            this.b = -1;
            this.c = -1;
            this.d = -1;
            this.f = -1;
            this.n = 0;
            this.g = null;
            this.h = null;
            t();
            this.q = 0;
        }

        private void z() {
            this.q = ah.e(this.a);
            ah.c(this.a, 4);
        }

        private void A() {
            ah.c(this.a, this.q);
            this.q = 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.b + " id=" + this.d + ", oldPos=" + this.c + ", pLpos:" + this.f);
            if (i()) {
                stringBuilder.append(" scrap ").append(this.p ? "[changeScrap]" : "[attachedScrap]");
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
                stringBuilder.append(" not recyclable(" + this.n + ")");
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

        public final void a(boolean z) {
            this.n = z ? this.n - 1 : this.n + 1;
            if (this.n < 0) {
                this.n = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && this.n == 1) {
                this.l |= 16;
            } else if (z && this.n == 0) {
                this.l &= -17;
            }
        }

        public final boolean w() {
            return (this.l & 16) == 0 && !ah.c(this.a);
        }

        private boolean B() {
            return (this.l & 16) != 0;
        }

        private boolean C() {
            return (this.l & 16) == 0 && ah.c(this.a);
        }

        boolean x() {
            return (this.l & 2) != 0;
        }
    }

    static {
        boolean z = VERSION.SDK_INT == 18 || VERSION.SDK_INT == 19 || VERSION.SDK_INT == 20;
        l = z;
        if (VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        a = z;
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2 = true;
        super(context, attributeSet, i);
        this.n = new p();
        this.b = new n(this);
        this.e = new bc();
        this.q = new Runnable(this) {
            final /* synthetic */ RecyclerView a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.z && !this.a.isLayoutRequested()) {
                    if (this.a.C) {
                        this.a.B = true;
                    } else {
                        this.a.t();
                    }
                }
            }
        };
        this.r = new Rect();
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.A = 0;
        this.J = false;
        this.K = 0;
        this.g = new ae();
        this.P = 0;
        this.Q = -1;
        this.ac = Float.MIN_VALUE;
        this.ad = new t(this);
        this.h = new r();
        this.i = false;
        this.j = false;
        this.ag = new f();
        this.ah = false;
        this.ak = new int[2];
        this.am = new int[2];
        this.an = new int[2];
        this.ao = new int[2];
        this.ap = new Runnable(this) {
            final /* synthetic */ RecyclerView a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.g != null) {
                    this.a.g.a();
                }
                this.a.ah = false;
            }
        };
        this.ar = new b(this) {
            final /* synthetic */ RecyclerView a;

            {
                this.a = r1;
            }

            public void a(u uVar, c cVar, c cVar2) {
                this.a.b.d(uVar);
                this.a.b(uVar, cVar, cVar2);
            }

            public void b(u uVar, c cVar, c cVar2) {
                this.a.a(uVar, cVar, cVar2);
            }

            public void c(u uVar, c cVar, c cVar2) {
                uVar.a(false);
                if (this.a.J) {
                    if (this.a.g.a(uVar, uVar, cVar, cVar2)) {
                        this.a.C();
                    }
                } else if (this.a.g.c(uVar, cVar, cVar2)) {
                    this.a.C();
                }
            }

            public void a(u uVar) {
                this.a.f.a(uVar.a, this.a.b);
            }
        };
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        this.G = VERSION.SDK_INT >= 16;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.W = viewConfiguration.getScaledTouchSlop();
        this.aa = viewConfiguration.getScaledMinimumFlingVelocity();
        this.ab = viewConfiguration.getScaledMaximumFlingVelocity();
        if (ah.a(this) == 2) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        this.g.a(this.ag);
        a();
        s();
        if (ah.e(this) == 0) {
            ah.c((View) this, 1);
        }
        this.H = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new an(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, android.support.v7.e.a.a.RecyclerView, i, 0);
            String string = obtainStyledAttributes.getString(android.support.v7.e.a.a.RecyclerView_layoutManager);
            obtainStyledAttributes.recycle();
            a(context, string, attributeSet, i, 0);
            if (VERSION.SDK_INT >= 21) {
                obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k, i, 0);
                z2 = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
            }
        }
        setNestedScrollingEnabled(z2);
    }

    public an getCompatAccessibilityDelegate() {
        return this.ai;
    }

    public void setAccessibilityDelegateCompat(an anVar) {
        this.ai = anVar;
        ah.a((View) this, this.ai);
    }

    private void a(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() != 0) {
                String a = a(context, trim);
                try {
                    ClassLoader classLoader;
                    Object[] objArr;
                    Constructor constructor;
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class asSubclass = classLoader.loadClass(a).asSubclass(h.class);
                    try {
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                        constructor = asSubclass.getConstructor(m);
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

    private String a(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        return !str.contains(".") ? RecyclerView.class.getPackage().getName() + '.' + str : str;
    }

    private void s() {
        this.d = new ab(new b(this) {
            final /* synthetic */ RecyclerView a;

            {
                this.a = r1;
            }

            public int a() {
                return this.a.getChildCount();
            }

            public void a(View view, int i) {
                this.a.addView(view, i);
                this.a.j(view);
            }

            public int a(View view) {
                return this.a.indexOfChild(view);
            }

            public void a(int i) {
                View childAt = this.a.getChildAt(i);
                if (childAt != null) {
                    this.a.i(childAt);
                }
                this.a.removeViewAt(i);
            }

            public View b(int i) {
                return this.a.getChildAt(i);
            }

            public void b() {
                int a = a();
                for (int i = 0; i < a; i++) {
                    this.a.i(b(i));
                }
                this.a.removeAllViews();
            }

            public u b(View view) {
                return RecyclerView.c(view);
            }

            public void a(View view, int i, LayoutParams layoutParams) {
                u c = RecyclerView.c(view);
                if (c != null) {
                    if (c.r() || c.c()) {
                        c.m();
                    } else {
                        throw new IllegalArgumentException("Called attach on a child which is not detached: " + c);
                    }
                }
                this.a.attachViewToParent(view, i, layoutParams);
            }

            public void c(int i) {
                View b = b(i);
                if (b != null) {
                    u c = RecyclerView.c(b);
                    if (c != null) {
                        if (!c.r() || c.c()) {
                            c.b(256);
                        } else {
                            throw new IllegalArgumentException("called detach on an already detached child " + c);
                        }
                    }
                }
                this.a.detachViewFromParent(i);
            }

            public void c(View view) {
                u c = RecyclerView.c(view);
                if (c != null) {
                    c.z();
                }
            }

            public void d(View view) {
                u c = RecyclerView.c(view);
                if (c != null) {
                    c.A();
                }
            }
        });
    }

    void a() {
        this.c = new e(new a(this) {
            final /* synthetic */ RecyclerView a;

            {
                this.a = r1;
            }

            public u a(int i) {
                u a = this.a.a(i, true);
                if (a == null || this.a.d.c(a.a)) {
                    return null;
                }
                return a;
            }

            public void a(int i, int i2) {
                this.a.a(i, i2, true);
                this.a.i = true;
                r.a(this.a.h, i2);
            }

            public void b(int i, int i2) {
                this.a.a(i, i2, false);
                this.a.i = true;
            }

            public void a(int i, int i2, Object obj) {
                this.a.a(i, i2, obj);
                this.a.j = true;
            }

            public void a(b bVar) {
                c(bVar);
            }

            void c(b bVar) {
                switch (bVar.a) {
                    case 1:
                        this.a.f.a(this.a, bVar.b, bVar.d);
                        return;
                    case 2:
                        this.a.f.b(this.a, bVar.b, bVar.d);
                        return;
                    case 4:
                        this.a.f.a(this.a, bVar.b, bVar.d, bVar.c);
                        return;
                    case 8:
                        this.a.f.a(this.a, bVar.b, bVar.d, 1);
                        return;
                    default:
                        return;
                }
            }

            public void b(b bVar) {
                c(bVar);
            }

            public void c(int i, int i2) {
                this.a.f(i, i2);
                this.a.i = true;
            }

            public void d(int i, int i2) {
                this.a.e(i, i2);
                this.a.i = true;
            }
        });
    }

    public void setHasFixedSize(boolean z) {
        this.y = z;
    }

    public void setClipToPadding(boolean z) {
        if (z != this.p) {
            h();
        }
        this.p = z;
        super.setClipToPadding(z);
        if (this.z) {
            requestLayout();
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        switch (i) {
            case 0:
                break;
            case 1:
                this.W = as.a(viewConfiguration);
                return;
            default:
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
                break;
        }
        this.W = viewConfiguration.getScaledTouchSlop();
    }

    public void setAdapter(a aVar) {
        setLayoutFrozen(false);
        a(aVar, false, true);
        requestLayout();
    }

    private void a(a aVar, boolean z, boolean z2) {
        if (this.s != null) {
            this.s.b(this.n);
            this.s.b(this);
        }
        if (!z || z2) {
            if (this.g != null) {
                this.g.c();
            }
            if (this.f != null) {
                this.f.c(this.b);
                this.f.b(this.b);
            }
            this.b.a();
        }
        this.c.a();
        a aVar2 = this.s;
        this.s = aVar;
        if (aVar != null) {
            aVar.a(this.n);
            aVar.a(this);
        }
        if (this.f != null) {
            this.f.a(aVar2, this.s);
        }
        this.b.a(aVar2, this.s, z);
        this.h.g = true;
        o();
    }

    public a getAdapter() {
        return this.s;
    }

    public void setRecyclerListener(o oVar) {
        this.t = oVar;
    }

    public int getBaseline() {
        if (this.f != null) {
            return this.f.s();
        }
        return super.getBaseline();
    }

    public void setLayoutManager(h hVar) {
        if (hVar != this.f) {
            c();
            if (this.f != null) {
                if (this.x) {
                    this.f.b(this, this.b);
                }
                this.f.b(null);
            }
            this.b.a();
            this.d.a();
            this.f = hVar;
            if (hVar != null) {
                if (hVar.q != null) {
                    throw new IllegalArgumentException("LayoutManager " + hVar + " is already attached to a RecyclerView: " + hVar.q);
                }
                this.f.b(this);
                if (this.x) {
                    this.f.c(this);
                }
            }
            requestLayout();
        }
    }

    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.o != null) {
            savedState.a(this.o);
        } else if (this.f != null) {
            savedState.a = this.f.c();
        } else {
            savedState.a = null;
        }
        return savedState;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.o = (SavedState) parcelable;
            super.onRestoreInstanceState(this.o.getSuperState());
            if (this.f != null && this.o.a != null) {
                this.f.a(this.o.a);
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    private void b(u uVar) {
        View view = uVar.a;
        boolean z = view.getParent() == this;
        this.b.d(a(view));
        if (uVar.r()) {
            this.d.a(view, -1, view.getLayoutParams(), true);
        } else if (z) {
            this.d.d(view);
        } else {
            this.d.a(view, true);
        }
    }

    private boolean h(View view) {
        b();
        boolean f = this.d.f(view);
        if (f) {
            u c = c(view);
            this.b.d(c);
            this.b.b(c);
        }
        a(!f);
        return f;
    }

    public h getLayoutManager() {
        return this.f;
    }

    public m getRecycledViewPool() {
        return this.b.f();
    }

    public void setRecycledViewPool(m mVar) {
        this.b.a(mVar);
    }

    public void setViewCacheExtension(s sVar) {
        this.b.a(sVar);
    }

    public void setItemViewCacheSize(int i) {
        this.b.a(i);
    }

    public int getScrollState() {
        return this.P;
    }

    private void setScrollState(int i) {
        if (i != this.P) {
            this.P = i;
            if (i != 2) {
                v();
            }
            d(i);
        }
    }

    public void setChildDrawingOrderCallback(d dVar) {
        if (dVar != this.aj) {
            this.aj = dVar;
            setChildrenDrawingOrderEnabled(this.aj != null);
        }
    }

    @Deprecated
    public void setOnScrollListener(l lVar) {
        this.ae = lVar;
    }

    private void e(int i) {
        if (this.f != null) {
            this.f.d(i);
            awakenScrollBars();
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollBy(int i, int i2) {
        if (this.f == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.C) {
            boolean d = this.f.d();
            boolean e = this.f.e();
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

    private void t() {
        if (!this.z) {
            return;
        }
        if (this.J) {
            android.support.v4.f.h.a("RV FullInvalidate");
            k();
            android.support.v4.f.h.a();
        } else if (!this.c.d()) {
        } else {
            if (this.c.a(4) && !this.c.a(11)) {
                android.support.v4.f.h.a("RV PartialInvalidate");
                b();
                this.c.b();
                if (!this.B) {
                    if (u()) {
                        k();
                    } else {
                        this.c.c();
                    }
                }
                a(true);
                android.support.v4.f.h.a();
            } else if (this.c.d()) {
                android.support.v4.f.h.a("RV FullInvalidate");
                k();
                android.support.v4.f.h.a();
            }
        }
    }

    private boolean u() {
        int b = this.d.b();
        for (int i = 0; i < b; i++) {
            u c = c(this.d.b(i));
            if (c != null && !c.c() && c.x()) {
                return true;
            }
        }
        return false;
    }

    boolean a(int i, int i2, MotionEvent motionEvent) {
        int a;
        int i3;
        int i4;
        int i5;
        t();
        if (this.s != null) {
            int b;
            b();
            z();
            android.support.v4.f.h.a("RV Scroll");
            if (i != 0) {
                a = this.f.a(i, this.b, this.h);
                i3 = i - a;
            } else {
                a = 0;
                i3 = 0;
            }
            if (i2 != 0) {
                b = this.f.b(i2, this.b, this.h);
                i4 = i2 - b;
            } else {
                b = 0;
                i4 = 0;
            }
            android.support.v4.f.h.a();
            I();
            A();
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
        if (!this.u.isEmpty()) {
            invalidate();
        }
        if (dispatchNestedScroll(i4, a, i3, i5, this.am)) {
            this.U -= this.am[0];
            this.V -= this.am[1];
            if (motionEvent != null) {
                motionEvent.offsetLocation((float) this.am[0], (float) this.am[1]);
            }
            int[] iArr = this.ao;
            iArr[0] = iArr[0] + this.am[0];
            iArr = this.ao;
            iArr[1] = iArr[1] + this.am[1];
        } else if (ah.a(this) != 2) {
            if (motionEvent != null) {
                a(motionEvent.getX(), (float) i3, motionEvent.getY(), (float) i5);
            }
            i(i, i2);
        }
        if (!(i4 == 0 && a == 0)) {
            h(i4, a);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (i4 == 0 && a == 0) {
            return false;
        }
        return true;
    }

    public int computeHorizontalScrollOffset() {
        if (this.f != null && this.f.d()) {
            return this.f.b(this.h);
        }
        return 0;
    }

    public int computeHorizontalScrollExtent() {
        if (this.f != null && this.f.d()) {
            return this.f.d(this.h);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        if (this.f != null && this.f.d()) {
            return this.f.f(this.h);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        if (this.f != null && this.f.e()) {
            return this.f.c(this.h);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        if (this.f != null && this.f.e()) {
            return this.f.e(this.h);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        if (this.f != null && this.f.e()) {
            return this.f.g(this.h);
        }
        return 0;
    }

    void b() {
        this.A++;
        if (this.A == 1 && !this.C) {
            this.B = false;
        }
    }

    void a(boolean z) {
        if (this.A < 1) {
            this.A = 1;
        }
        if (!z) {
            this.B = false;
        }
        if (this.A == 1) {
            if (!(!z || !this.B || this.C || this.f == null || this.s == null)) {
                k();
            }
            if (!this.C) {
                this.B = false;
            }
        }
        this.A--;
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.C) {
            a("Do not setLayoutFrozen in layout or scroll");
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.C = true;
                this.D = true;
                c();
                return;
            }
            this.C = false;
            if (!(!this.B || this.f == null || this.s == null)) {
                requestLayout();
            }
            this.B = false;
        }
    }

    public void a(int i, int i2) {
        int i3 = 0;
        if (this.f == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.C) {
            if (!this.f.d()) {
                i = 0;
            }
            if (this.f.e()) {
                i3 = i2;
            }
            if (i != 0 || i3 != 0) {
                this.ad.b(i, i3);
            }
        }
    }

    public boolean b(int i, int i2) {
        if (this.f == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.C) {
            return false;
        } else {
            boolean d = this.f.d();
            boolean e = this.f.e();
            if (!d || Math.abs(i) < this.aa) {
                i = 0;
            }
            if (!e || Math.abs(i2) < this.aa) {
                i2 = 0;
            }
            if ((i == 0 && i2 == 0) || dispatchNestedPreFling((float) i, (float) i2)) {
                return false;
            }
            d = d || e;
            dispatchNestedFling((float) i, (float) i2, d);
            if (!d) {
                return false;
            }
            this.ad.a(Math.max(-this.ab, Math.min(i, this.ab)), Math.max(-this.ab, Math.min(i2, this.ab)));
            return true;
        }
    }

    public void c() {
        setScrollState(0);
        v();
    }

    private void v() {
        this.ad.b();
        if (this.f != null) {
            this.f.F();
        }
    }

    public int getMinFlingVelocity() {
        return this.aa;
    }

    public int getMaxFlingVelocity() {
        return this.ab;
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
        r7.d();
        r2 = r7.L;
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
        r7.f();
        r2 = r7.M;
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
        r7.e();
        r2 = r7.N;
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
        r7.g();
        r2 = r7.O;
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

    private void w() {
        int i = 0;
        if (this.L != null) {
            i = this.L.c();
        }
        if (this.M != null) {
            i |= this.M.c();
        }
        if (this.N != null) {
            i |= this.N.c();
        }
        if (this.O != null) {
            i |= this.O.c();
        }
        if (i != 0) {
            ah.d(this);
        }
    }

    private void i(int i, int i2) {
        int i3 = 0;
        if (!(this.L == null || this.L.a() || i <= 0)) {
            i3 = this.L.c();
        }
        if (!(this.N == null || this.N.a() || i >= 0)) {
            i3 |= this.N.c();
        }
        if (!(this.M == null || this.M.a() || i2 <= 0)) {
            i3 |= this.M.c();
        }
        if (!(this.O == null || this.O.a() || i2 >= 0)) {
            i3 |= this.O.c();
        }
        if (i3 != 0) {
            ah.d(this);
        }
    }

    void c(int i, int i2) {
        if (i < 0) {
            d();
            this.L.a(-i);
        } else if (i > 0) {
            e();
            this.N.a(i);
        }
        if (i2 < 0) {
            f();
            this.M.a(-i2);
        } else if (i2 > 0) {
            g();
            this.O.a(i2);
        }
        if (i != 0 || i2 != 0) {
            ah.d(this);
        }
    }

    void d() {
        if (this.L == null) {
            this.L = new android.support.v4.widget.j(getContext());
            if (this.p) {
                this.L.a((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.L.a(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    void e() {
        if (this.N == null) {
            this.N = new android.support.v4.widget.j(getContext());
            if (this.p) {
                this.N.a((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.N.a(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    void f() {
        if (this.M == null) {
            this.M = new android.support.v4.widget.j(getContext());
            if (this.p) {
                this.M.a((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.M.a(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    void g() {
        if (this.O == null) {
            this.O = new android.support.v4.widget.j(getContext());
            if (this.p) {
                this.O.a((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.O.a(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    void h() {
        this.O = null;
        this.M = null;
        this.N = null;
        this.L = null;
    }

    public View focusSearch(View view, int i) {
        View d = this.f.d(view, i);
        if (d != null) {
            return d;
        }
        d = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (!(d != null || this.s == null || this.f == null || j() || this.C)) {
            b();
            d = this.f.a(view, i, this.b, this.h);
            a(false);
        }
        return d == null ? super.focusSearch(view, i) : d;
    }

    public void requestChildFocus(View view, View view2) {
        if (!(this.f.a(this, this.h, view, view2) || view2 == null)) {
            Rect rect;
            boolean z;
            this.r.set(0, 0, view2.getWidth(), view2.getHeight());
            LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof i) {
                i iVar = (i) layoutParams;
                if (!iVar.c) {
                    Rect rect2 = iVar.b;
                    rect = this.r;
                    rect.left -= rect2.left;
                    rect = this.r;
                    rect.right += rect2.right;
                    rect = this.r;
                    rect.top -= rect2.top;
                    rect = this.r;
                    rect.bottom = rect2.bottom + rect.bottom;
                }
            }
            offsetDescendantRectToMyCoords(view2, this.r);
            offsetRectIntoDescendantCoords(view, this.r);
            rect = this.r;
            if (this.z) {
                z = false;
            } else {
                z = true;
            }
            requestChildRectangleOnScreen(view, rect, z);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f.a(this, view, rect, z);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (this.f == null || !this.f.a(this, (ArrayList) arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = 0;
        this.x = true;
        this.z = false;
        if (this.f != null) {
            this.f.c(this);
        }
        this.ah = false;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.g != null) {
            this.g.c();
        }
        this.z = false;
        c();
        this.x = false;
        if (this.f != null) {
            this.f.b(this, this.b);
        }
        removeCallbacks(this.ap);
        this.e.b();
    }

    public boolean isAttachedToWindow() {
        return this.x;
    }

    void a(String str) {
        if (!j()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling");
        }
        throw new IllegalStateException(str);
    }

    private boolean a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.w = null;
        }
        int size = this.v.size();
        int i = 0;
        while (i < size) {
            k kVar = (k) this.v.get(i);
            if (!kVar.a(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.w = kVar;
                return true;
            }
        }
        return false;
    }

    private boolean b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.w != null) {
            if (action == 0) {
                this.w = null;
            } else {
                this.w.b(this, motionEvent);
                if (action == 3 || action == 1) {
                    this.w = null;
                }
                return true;
            }
        }
        if (action != 0) {
            int size = this.v.size();
            for (int i = 0; i < size; i++) {
                k kVar = (k) this.v.get(i);
                if (kVar.a(this, motionEvent)) {
                    this.w = kVar;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i = -1;
        boolean z = true;
        if (this.C) {
            return false;
        }
        if (a(motionEvent)) {
            y();
            return true;
        } else if (this.f == null) {
            return false;
        } else {
            boolean d = this.f.d();
            boolean e = this.f.e();
            if (this.R == null) {
                this.R = VelocityTracker.obtain();
            }
            this.R.addMovement(motionEvent);
            int a = android.support.v4.view.t.a(motionEvent);
            int b = android.support.v4.view.t.b(motionEvent);
            int i2;
            switch (a) {
                case 0:
                    if (this.D) {
                        this.D = false;
                    }
                    this.Q = android.support.v4.view.t.b(motionEvent, 0);
                    i = (int) (motionEvent.getX() + 0.5f);
                    this.U = i;
                    this.S = i;
                    i = (int) (motionEvent.getY() + 0.5f);
                    this.V = i;
                    this.T = i;
                    if (this.P == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                    }
                    int[] iArr = this.ao;
                    this.ao[1] = 0;
                    iArr[0] = 0;
                    if (d) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    if (e) {
                        i2 |= 2;
                    }
                    startNestedScroll(i2);
                    break;
                case 1:
                    this.R.clear();
                    stopNestedScroll();
                    break;
                case 2:
                    a = android.support.v4.view.t.a(motionEvent, this.Q);
                    if (a >= 0) {
                        b = (int) (android.support.v4.view.t.c(motionEvent, a) + 0.5f);
                        a = (int) (android.support.v4.view.t.d(motionEvent, a) + 0.5f);
                        if (this.P != 1) {
                            b -= this.S;
                            a -= this.T;
                            if (!d || Math.abs(b) <= this.W) {
                                d = false;
                            } else {
                                this.U = ((b < 0 ? -1 : 1) * this.W) + this.S;
                                d = true;
                            }
                            if (e && Math.abs(a) > this.W) {
                                i2 = this.T;
                                int i3 = this.W;
                                if (a >= 0) {
                                    i = 1;
                                }
                                this.V = i2 + (i * i3);
                                d = true;
                            }
                            if (d) {
                                setScrollState(1);
                                break;
                            }
                        }
                    }
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.Q + " not found. Did any MotionEvents get skipped?");
                    return false;
                    break;
                case 3:
                    y();
                    break;
                case 5:
                    this.Q = android.support.v4.view.t.b(motionEvent, b);
                    i2 = (int) (android.support.v4.view.t.c(motionEvent, b) + 0.5f);
                    this.U = i2;
                    this.S = i2;
                    i2 = (int) (android.support.v4.view.t.d(motionEvent, b) + 0.5f);
                    this.V = i2;
                    this.T = i2;
                    break;
                case 6:
                    c(motionEvent);
                    break;
            }
            if (this.P != 1) {
                z = false;
            }
            return z;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            ((k) this.v.get(i)).a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.C || this.D) {
            return false;
        }
        if (b(motionEvent)) {
            y();
            return true;
        } else if (this.f == null) {
            return false;
        } else {
            boolean d = this.f.d();
            boolean e = this.f.e();
            if (this.R == null) {
                this.R = VelocityTracker.obtain();
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            int a = android.support.v4.view.t.a(motionEvent);
            int b = android.support.v4.view.t.b(motionEvent);
            if (a == 0) {
                int[] iArr = this.ao;
                this.ao[1] = 0;
                iArr[0] = 0;
            }
            obtain.offsetLocation((float) this.ao[0], (float) this.ao[1]);
            switch (a) {
                case 0:
                    this.Q = android.support.v4.view.t.b(motionEvent, 0);
                    a = (int) (motionEvent.getX() + 0.5f);
                    this.U = a;
                    this.S = a;
                    a = (int) (motionEvent.getY() + 0.5f);
                    this.V = a;
                    this.T = a;
                    if (d) {
                        a = 1;
                    } else {
                        a = 0;
                    }
                    if (e) {
                        a |= 2;
                    }
                    startNestedScroll(a);
                    break;
                case 1:
                    this.R.addMovement(obtain);
                    this.R.computeCurrentVelocity(1000, (float) this.ab);
                    float f = d ? -af.a(this.R, this.Q) : 0.0f;
                    float f2;
                    if (e) {
                        f2 = -af.b(this.R, this.Q);
                    } else {
                        f2 = 0.0f;
                    }
                    if ((f == 0.0f && r0 == 0.0f) || !b((int) f, (int) r0)) {
                        setScrollState(0);
                    }
                    x();
                    z = true;
                    break;
                case 2:
                    a = android.support.v4.view.t.a(motionEvent, this.Q);
                    if (a >= 0) {
                        int c = (int) (android.support.v4.view.t.c(motionEvent, a) + 0.5f);
                        int d2 = (int) (android.support.v4.view.t.d(motionEvent, a) + 0.5f);
                        int i = this.U - c;
                        a = this.V - d2;
                        if (dispatchNestedPreScroll(i, a, this.an, this.am)) {
                            i -= this.an[0];
                            a -= this.an[1];
                            obtain.offsetLocation((float) this.am[0], (float) this.am[1]);
                            int[] iArr2 = this.ao;
                            iArr2[0] = iArr2[0] + this.am[0];
                            iArr2 = this.ao;
                            iArr2[1] = iArr2[1] + this.am[1];
                        }
                        if (this.P != 1) {
                            boolean z2;
                            if (!d || Math.abs(i) <= this.W) {
                                z2 = false;
                            } else {
                                if (i > 0) {
                                    i -= this.W;
                                } else {
                                    i += this.W;
                                }
                                z2 = true;
                            }
                            if (e && Math.abs(a) > this.W) {
                                if (a > 0) {
                                    a -= this.W;
                                } else {
                                    a += this.W;
                                }
                                z2 = true;
                            }
                            if (z2) {
                                setScrollState(1);
                            }
                        }
                        if (this.P == 1) {
                            this.U = c - this.am[0];
                            this.V = d2 - this.am[1];
                            if (!d) {
                                i = 0;
                            }
                            if (!e) {
                                a = 0;
                            }
                            if (a(i, a, obtain)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                                break;
                            }
                        }
                    }
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.Q + " not found. Did any MotionEvents get skipped?");
                    return false;
                    break;
                case 3:
                    y();
                    break;
                case 5:
                    this.Q = android.support.v4.view.t.b(motionEvent, b);
                    a = (int) (android.support.v4.view.t.c(motionEvent, b) + 0.5f);
                    this.U = a;
                    this.S = a;
                    a = (int) (android.support.v4.view.t.d(motionEvent, b) + 0.5f);
                    this.V = a;
                    this.T = a;
                    break;
                case 6:
                    c(motionEvent);
                    break;
            }
            if (!z) {
                this.R.addMovement(obtain);
            }
            obtain.recycle();
            return true;
        }
    }

    private void x() {
        if (this.R != null) {
            this.R.clear();
        }
        stopNestedScroll();
        w();
    }

    private void y() {
        x();
        setScrollState(0);
    }

    private void c(MotionEvent motionEvent) {
        int b = android.support.v4.view.t.b(motionEvent);
        if (android.support.v4.view.t.b(motionEvent, b) == this.Q) {
            b = b == 0 ? 1 : 0;
            this.Q = android.support.v4.view.t.b(motionEvent, b);
            int c = (int) (android.support.v4.view.t.c(motionEvent, b) + 0.5f);
            this.U = c;
            this.S = c;
            b = (int) (android.support.v4.view.t.d(motionEvent, b) + 0.5f);
            this.V = b;
            this.T = b;
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (!(this.f == null || this.C || (android.support.v4.view.t.d(motionEvent) & 2) == 0 || motionEvent.getAction() != 8)) {
            float f;
            float e;
            if (this.f.e()) {
                f = -android.support.v4.view.t.e(motionEvent, 9);
            } else {
                f = 0.0f;
            }
            if (this.f.d()) {
                e = android.support.v4.view.t.e(motionEvent, 10);
            } else {
                e = 0.0f;
            }
            if (!(f == 0.0f && e == 0.0f)) {
                float scrollFactor = getScrollFactor();
                a((int) (e * scrollFactor), (int) (f * scrollFactor), motionEvent);
            }
        }
        return false;
    }

    private float getScrollFactor() {
        if (this.ac == Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (!getContext().getTheme().resolveAttribute(16842829, typedValue, true)) {
                return 0.0f;
            }
            this.ac = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
        }
        return this.ac;
    }

    protected void onMeasure(int i, int i2) {
        boolean z = false;
        if (this.f == null) {
            d(i, i2);
        } else if (this.f.b) {
            int mode = MeasureSpec.getMode(i);
            int mode2 = MeasureSpec.getMode(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f.a(this.b, this.h, i, i2);
            if (!z && this.s != null) {
                if (this.h.c == 1) {
                    F();
                }
                this.f.a(i, i2);
                this.h.l = true;
                G();
                this.f.b(i, i2);
                if (this.f.k()) {
                    this.f.a(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.h.l = true;
                    G();
                    this.f.b(i, i2);
                }
            }
        } else if (this.y) {
            this.f.a(this.b, this.h, i, i2);
        } else {
            if (this.F) {
                b();
                E();
                if (this.h.j) {
                    this.h.h = true;
                } else {
                    this.c.e();
                    this.h.h = false;
                }
                this.F = false;
                a(false);
            }
            if (this.s != null) {
                this.h.a = this.s.a();
            } else {
                this.h.a = 0;
            }
            b();
            this.f.a(this.b, this.h, i, i2);
            a(false);
            this.h.h = false;
        }
    }

    void d(int i, int i2) {
        setMeasuredDimension(h.a(i, getPaddingLeft() + getPaddingRight(), ah.p(this)), h.a(i2, getPaddingTop() + getPaddingBottom(), ah.q(this)));
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            h();
        }
    }

    public void setItemAnimator(e eVar) {
        if (this.g != null) {
            this.g.c();
            this.g.a(null);
        }
        this.g = eVar;
        if (this.g != null) {
            this.g.a(this.ag);
        }
    }

    private void z() {
        this.K++;
    }

    private void A() {
        this.K--;
        if (this.K < 1) {
            this.K = 0;
            B();
        }
    }

    boolean i() {
        return this.H != null && this.H.isEnabled();
    }

    private void B() {
        int i = this.E;
        this.E = 0;
        if (i != 0 && i()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            android.support.v4.view.a.a.a(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    public boolean j() {
        return this.K > 0;
    }

    boolean a(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (!j()) {
            return false;
        }
        int b;
        if (accessibilityEvent != null) {
            b = android.support.v4.view.a.a.b(accessibilityEvent);
        } else {
            b = 0;
        }
        if (b != 0) {
            i = b;
        }
        this.E = i | this.E;
        return true;
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!a(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public e getItemAnimator() {
        return this.g;
    }

    private void C() {
        if (!this.ah && this.x) {
            ah.a((View) this, this.ap);
            this.ah = true;
        }
    }

    private boolean D() {
        return this.g != null && this.f.b();
    }

    private void E() {
        boolean z;
        boolean z2 = true;
        if (this.J) {
            this.c.a();
            o();
            this.f.a(this);
        }
        if (D()) {
            this.c.b();
        } else {
            this.c.e();
        }
        boolean z3;
        if (this.i || this.j) {
            z3 = true;
        } else {
            z3 = false;
        }
        r rVar = this.h;
        if (!this.z || this.g == null || (!(this.J || r0 || this.f.a) || (this.J && !this.s.b()))) {
            z = false;
        } else {
            z = true;
        }
        rVar.i = z;
        r rVar2 = this.h;
        if (!(this.h.i && r0 && !this.J && D())) {
            z2 = false;
        }
        rVar2.j = z2;
    }

    void k() {
        if (this.s == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.f == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            this.h.l = false;
            if (this.h.c == 1) {
                F();
                this.f.f(this);
                G();
            } else if (!this.c.f() && this.f.w() == getWidth() && this.f.x() == getHeight()) {
                this.f.f(this);
            } else {
                this.f.f(this);
                G();
            }
            H();
        }
    }

    private void F() {
        int b;
        int i;
        u c;
        boolean z = true;
        this.h.a(1);
        this.h.l = false;
        b();
        this.e.a();
        z();
        E();
        r rVar = this.h;
        if (!(this.h.i && this.j)) {
            z = false;
        }
        rVar.k = z;
        this.j = false;
        this.i = false;
        this.h.h = this.h.j;
        this.h.a = this.s.a();
        a(this.ak);
        if (this.h.i) {
            b = this.d.b();
            for (i = 0; i < b; i++) {
                c = c(this.d.b(i));
                if (!c.c() && (!c.n() || this.s.b())) {
                    this.e.a(c, this.g.a(this.h, c, e.d(c), c.u()));
                    if (!(!this.h.k || !c.x() || c.q() || c.c() || c.n())) {
                        this.e.a(a(c), c);
                    }
                }
            }
        }
        if (this.h.j) {
            m();
            z = this.h.g;
            this.h.g = false;
            this.f.c(this.b, this.h);
            this.h.g = z;
            for (i = 0; i < this.d.b(); i++) {
                c = c(this.d.b(i));
                if (!(c.c() || this.e.d(c))) {
                    b = e.d(c);
                    boolean a = c.a(8192);
                    if (!a) {
                        b |= 4096;
                    }
                    c a2 = this.g.a(this.h, c, b, c.u());
                    if (a) {
                        a(c, a2);
                    } else {
                        this.e.b(c, a2);
                    }
                }
            }
            n();
        } else {
            n();
        }
        A();
        a(false);
        this.h.c = 2;
    }

    private void G() {
        boolean z;
        b();
        z();
        this.h.a(6);
        this.c.e();
        this.h.a = this.s.a();
        this.h.f = 0;
        this.h.h = false;
        this.f.c(this.b, this.h);
        this.h.g = false;
        this.o = null;
        r rVar = this.h;
        if (!this.h.i || this.g == null) {
            z = false;
        } else {
            z = true;
        }
        rVar.i = z;
        this.h.c = 4;
        A();
        a(false);
    }

    private void H() {
        this.h.a(4);
        b();
        z();
        this.h.c = 1;
        if (this.h.i) {
            for (int b = this.d.b() - 1; b >= 0; b--) {
                u c = c(this.d.b(b));
                if (!c.c()) {
                    long a = a(c);
                    c a2 = this.g.a(this.h, c);
                    u a3 = this.e.a(a);
                    if (a3 == null || a3.c()) {
                        this.e.c(c, a2);
                    } else {
                        boolean a4 = this.e.a(a3);
                        boolean a5 = this.e.a(c);
                        if (a4 && a3 == c) {
                            this.e.c(c, a2);
                        } else {
                            c b2 = this.e.b(a3);
                            this.e.c(c, a2);
                            c c2 = this.e.c(c);
                            if (b2 == null) {
                                a(a, c, a3);
                            } else {
                                a(a3, c, b2, c2, a4, a5);
                            }
                        }
                    }
                }
            }
            this.e.a(this.ar);
        }
        this.f.b(this.b);
        this.h.e = this.h.a;
        this.J = false;
        this.h.i = false;
        this.h.j = false;
        this.f.a = false;
        if (this.b.d != null) {
            this.b.d.clear();
        }
        A();
        a(false);
        this.e.a();
        if (j(this.ak[0], this.ak[1])) {
            h(0, 0);
        }
    }

    private void a(long j, u uVar, u uVar2) {
        int b = this.d.b();
        int i = 0;
        while (i < b) {
            u c = c(this.d.b(i));
            if (c == uVar || a(c) != j) {
                i++;
            } else if (this.s == null || !this.s.b()) {
                throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + c + " \n View Holder 2:" + uVar);
            } else {
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + c + " \n View Holder 2:" + uVar);
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + uVar2 + " cannot be found but it is necessary for " + uVar);
    }

    private void a(u uVar, c cVar) {
        uVar.a(0, 8192);
        if (this.h.k && uVar.x() && !uVar.q() && !uVar.c()) {
            this.e.a(a(uVar), uVar);
        }
        this.e.a(uVar, cVar);
    }

    private void a(int[] iArr) {
        int b = this.d.b();
        if (b == 0) {
            iArr[0] = 0;
            iArr[1] = 0;
            return;
        }
        int i = Strategy.TTL_SECONDS_INFINITE;
        int i2 = zzamj.UNSET_ENUM_VALUE;
        int i3 = 0;
        while (i3 < b) {
            int i4;
            u c = c(this.d.b(i3));
            if (c.c()) {
                i4 = i;
            } else {
                i4 = c.d();
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

    private boolean j(int i, int i2) {
        if (this.d.b() != 0) {
            a(this.ak);
            if (this.ak[0] == i && this.ak[1] == i2) {
                return false;
            }
            return true;
        } else if (i == 0 && i2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    protected void removeDetachedView(View view, boolean z) {
        u c = c(view);
        if (c != null) {
            if (c.r()) {
                c.m();
            } else if (!c.c()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + c);
            }
        }
        i(view);
        super.removeDetachedView(view, z);
    }

    long a(u uVar) {
        return this.s.b() ? uVar.g() : (long) uVar.b;
    }

    private void a(u uVar, c cVar, c cVar2) {
        uVar.a(false);
        if (this.g.b(uVar, cVar, cVar2)) {
            C();
        }
    }

    private void b(u uVar, c cVar, c cVar2) {
        b(uVar);
        uVar.a(false);
        if (this.g.a(uVar, cVar, cVar2)) {
            C();
        }
    }

    private void a(u uVar, u uVar2, c cVar, c cVar2, boolean z, boolean z2) {
        uVar.a(false);
        if (z) {
            b(uVar);
        }
        if (uVar != uVar2) {
            if (z2) {
                b(uVar2);
            }
            uVar.g = uVar2;
            b(uVar);
            this.b.d(uVar);
            uVar2.a(false);
            uVar2.h = uVar;
        }
        if (this.g.a(uVar, uVar2, cVar, cVar2)) {
            C();
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        android.support.v4.f.h.a("RV OnLayout");
        k();
        android.support.v4.f.h.a();
        this.z = true;
    }

    public void requestLayout() {
        if (this.A != 0 || this.C) {
            this.B = true;
        } else {
            super.requestLayout();
        }
    }

    void l() {
        int c = this.d.c();
        for (int i = 0; i < c; i++) {
            ((i) this.d.c(i).getLayoutParams()).c = true;
        }
        this.b.i();
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = 1;
        int i4 = 0;
        super.draw(canvas);
        int size = this.u.size();
        for (i = 0; i < size; i++) {
            ((g) this.u.get(i)).b(canvas, this, this.h);
        }
        if (this.L == null || this.L.a()) {
            i2 = 0;
        } else {
            i = canvas.save();
            i2 = this.p ? getPaddingBottom() : 0;
            canvas.rotate(BitmapDescriptorFactory.HUE_VIOLET);
            canvas.translate((float) (i2 + (-getHeight())), 0.0f);
            if (this.L == null || !this.L.a(canvas)) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            canvas.restoreToCount(i);
        }
        if (!(this.M == null || this.M.a())) {
            size = canvas.save();
            if (this.p) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            if (this.M == null || !this.M.a(canvas)) {
                i = 0;
            } else {
                i = 1;
            }
            i2 |= i;
            canvas.restoreToCount(size);
        }
        if (!(this.N == null || this.N.a())) {
            size = canvas.save();
            int width = getWidth();
            if (this.p) {
                i = getPaddingTop();
            } else {
                i = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate((float) (-i), (float) (-width));
            if (this.N == null || !this.N.a(canvas)) {
                i = 0;
            } else {
                i = 1;
            }
            i2 |= i;
            canvas.restoreToCount(size);
        }
        if (!(this.O == null || this.O.a())) {
            i = canvas.save();
            canvas.rotate(BitmapDescriptorFactory.HUE_CYAN);
            if (this.p) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            if (this.O != null && this.O.a(canvas)) {
                i4 = 1;
            }
            i2 |= i4;
            canvas.restoreToCount(i);
        }
        if (i2 != 0 || this.g == null || this.u.size() <= 0 || !this.g.b()) {
            i3 = i2;
        }
        if (i3 != 0) {
            ah.d(this);
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            ((g) this.u.get(i)).a(canvas, this, this.h);
        }
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof i) && this.f.a((i) layoutParams);
    }

    protected LayoutParams generateDefaultLayoutParams() {
        if (this.f != null) {
            return this.f.a();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager");
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (this.f != null) {
            return this.f.a(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager");
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        if (this.f != null) {
            return this.f.a(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager");
    }

    void m() {
        int c = this.d.c();
        for (int i = 0; i < c; i++) {
            u c2 = c(this.d.c(i));
            if (!c2.c()) {
                c2.b();
            }
        }
    }

    void n() {
        int c = this.d.c();
        for (int i = 0; i < c; i++) {
            u c2 = c(this.d.c(i));
            if (!c2.c()) {
                c2.a();
            }
        }
        this.b.h();
    }

    void e(int i, int i2) {
        int i3;
        int c = this.d.c();
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
            u c2 = c(this.d.c(i6));
            if (c2 != null && c2.b >= r3 && c2.b <= r2) {
                if (c2.b == i) {
                    c2.a(i2 - i, false);
                } else {
                    c2.a(i3, false);
                }
                this.h.g = true;
            }
        }
        this.b.a(i, i2);
        requestLayout();
    }

    void f(int i, int i2) {
        int c = this.d.c();
        for (int i3 = 0; i3 < c; i3++) {
            u c2 = c(this.d.c(i3));
            if (!(c2 == null || c2.c() || c2.b < i)) {
                c2.a(i2, false);
                this.h.g = true;
            }
        }
        this.b.b(i, i2);
        requestLayout();
    }

    void a(int i, int i2, boolean z) {
        int i3 = i + i2;
        int c = this.d.c();
        for (int i4 = 0; i4 < c; i4++) {
            u c2 = c(this.d.c(i4));
            if (!(c2 == null || c2.c())) {
                if (c2.b >= i3) {
                    c2.a(-i2, z);
                    this.h.g = true;
                } else if (c2.b >= i) {
                    c2.a(i - 1, -i2, z);
                    this.h.g = true;
                }
            }
        }
        this.b.b(i, i2, z);
        requestLayout();
    }

    void a(int i, int i2, Object obj) {
        int c = this.d.c();
        int i3 = i + i2;
        for (int i4 = 0; i4 < c; i4++) {
            View c2 = this.d.c(i4);
            u c3 = c(c2);
            if (c3 != null && !c3.c() && c3.b >= i && c3.b < i3) {
                c3.b(2);
                c3.a(obj);
                ((i) c2.getLayoutParams()).c = true;
            }
        }
        this.b.c(i, i2);
    }

    private boolean c(u uVar) {
        return this.g == null || this.g.a(uVar, uVar.u());
    }

    void o() {
        int c = this.d.c();
        for (int i = 0; i < c; i++) {
            u c2 = c(this.d.c(i));
            if (!(c2 == null || c2.c())) {
                c2.b(6);
            }
        }
        l();
        this.b.g();
    }

    public u a(View view) {
        Object parent = view.getParent();
        if (parent == null || parent == this) {
            return c(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public View b(View view) {
        RecyclerView parent = view.getParent();
        View view2 = view;
        while (parent != null && parent != this && (parent instanceof View)) {
            View view3 = parent;
            view2 = view3;
            ViewParent parent2 = view3.getParent();
        }
        return parent == this ? view2 : null;
    }

    static u c(View view) {
        if (view == null) {
            return null;
        }
        return ((i) view.getLayoutParams()).a;
    }

    public int d(View view) {
        u c = c(view);
        return c != null ? c.d() : -1;
    }

    u a(int i, boolean z) {
        int c = this.d.c();
        for (int i2 = 0; i2 < c; i2++) {
            u c2 = c(this.d.c(i2));
            if (!(c2 == null || c2.q())) {
                if (z) {
                    if (c2.b == i) {
                        return c2;
                    }
                } else if (c2.d() == i) {
                    return c2;
                }
            }
        }
        return null;
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void a(int i) {
        int b = this.d.b();
        for (int i2 = 0; i2 < b; i2++) {
            this.d.b(i2).offsetTopAndBottom(i);
        }
    }

    public void e(View view) {
    }

    public void f(View view) {
    }

    public void b(int i) {
        int b = this.d.b();
        for (int i2 = 0; i2 < b; i2++) {
            this.d.b(i2).offsetLeftAndRight(i);
        }
    }

    Rect g(View view) {
        i iVar = (i) view.getLayoutParams();
        if (!iVar.c) {
            return iVar.b;
        }
        Rect rect = iVar.b;
        rect.set(0, 0, 0, 0);
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            this.r.set(0, 0, 0, 0);
            ((g) this.u.get(i)).a(this.r, view, this, this.h);
            rect.left += this.r.left;
            rect.top += this.r.top;
            rect.right += this.r.right;
            rect.bottom += this.r.bottom;
        }
        iVar.c = false;
        return rect;
    }

    public void g(int i, int i2) {
    }

    void h(int i, int i2) {
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        g(i, i2);
        if (this.ae != null) {
            this.ae.a(this, i, i2);
        }
        if (this.af != null) {
            for (scrollY = this.af.size() - 1; scrollY >= 0; scrollY--) {
                ((l) this.af.get(scrollY)).a(this, i, i2);
            }
        }
    }

    public void c(int i) {
    }

    void d(int i) {
        if (this.f != null) {
            this.f.k(i);
        }
        c(i);
        if (this.ae != null) {
            this.ae.a(this, i);
        }
        if (this.af != null) {
            for (int size = this.af.size() - 1; size >= 0; size--) {
                ((l) this.af.get(size)).a(this, i);
            }
        }
    }

    public boolean p() {
        return !this.z || this.J || this.c.d();
    }

    private void I() {
        int b = this.d.b();
        for (int i = 0; i < b; i++) {
            View b2 = this.d.b(i);
            u a = a(b2);
            if (!(a == null || a.h == null)) {
                View view = a.h.a;
                int left = b2.getLeft();
                int top = b2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    private void i(View view) {
        u c = c(view);
        f(view);
        if (!(this.s == null || c == null)) {
            this.s.d(c);
        }
        if (this.I != null) {
            for (int size = this.I.size() - 1; size >= 0; size--) {
                ((j) this.I.get(size)).b(view);
            }
        }
    }

    private void j(View view) {
        u c = c(view);
        e(view);
        if (!(this.s == null || c == null)) {
            this.s.c(c);
        }
        if (this.I != null) {
            for (int size = this.I.size() - 1; size >= 0; size--) {
                ((j) this.I.get(size)).a(view);
            }
        }
    }

    private int d(u uVar) {
        if (uVar.a(524) || !uVar.p()) {
            return -1;
        }
        return this.c.c(uVar.b);
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().a(z);
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().a();
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().a(i);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().c();
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().b();
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().a(i, i2, i3, i4, iArr);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().a(f, f2);
    }

    protected int getChildDrawingOrder(int i, int i2) {
        if (this.aj == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return this.aj.a(i, i2);
    }

    private y getScrollingChildHelper() {
        if (this.al == null) {
            this.al = new y(this);
        }
        return this.al;
    }
}
