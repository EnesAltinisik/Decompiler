package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.aa;
import android.support.v4.view.ah;
import android.support.v4.view.az;
import android.support.v4.view.bd;
import android.support.v4.view.be;
import android.support.v4.view.z;
import android.support.v4.widget.w;
import android.support.v7.a.a.f;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window.Callback;
import com.google.android.gms.internal.zzamj;
import com.google.android.gms.nearby.messages.Strategy;

public class ActionBarOverlayLayout extends ViewGroup implements z, ac {
    static final int[] a = new int[]{android.support.v7.a.a.a.actionBarSize, 16842841};
    private final Runnable A;
    private final aa B;
    private int b;
    private int c;
    private ContentFrameLayout d;
    private ActionBarContainer e;
    private ad f;
    private Drawable g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private final Rect o;
    private final Rect p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private a u;
    private final int v;
    private w w;
    private az x;
    private final bd y;
    private final Runnable z;

    public interface a {
        void enableContentAnimations(boolean z);

        void hideForSystem();

        void onContentScrollStarted();

        void onContentScrollStopped();

        void onWindowVisibilityChanged(int i);

        void showForSystem();
    }

    public static class b extends MarginLayoutParams {
        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(int i, int i2) {
            super(i, i2);
        }

        public b(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return b();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return a(attributeSet);
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        this.o = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.v = 600;
        this.y = new be(this) {
            final /* synthetic */ ActionBarOverlayLayout a;

            {
                this.a = r1;
            }

            public void onAnimationEnd(View view) {
                this.a.x = null;
                this.a.l = false;
            }

            public void onAnimationCancel(View view) {
                this.a.x = null;
                this.a.l = false;
            }
        };
        this.z = new Runnable(this) {
            final /* synthetic */ ActionBarOverlayLayout a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.l();
                this.a.x = ah.r(this.a.e).c(0.0f).a(this.a.y);
            }
        };
        this.A = new Runnable(this) {
            final /* synthetic */ ActionBarOverlayLayout a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.l();
                this.a.x = ah.r(this.a.e).c((float) (-this.a.e.getHeight())).a(this.a.y);
            }
        };
        a(context);
        this.B = new aa(this);
    }

    private void a(Context context) {
        boolean z = true;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(a);
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.g = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.g == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion >= 19) {
            z = false;
        }
        this.h = z;
        this.w = w.a(context);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    public void setActionBarVisibilityCallback(a aVar) {
        this.u = aVar;
        if (getWindowToken() != null) {
            this.u.onWindowVisibilityChanged(this.c);
            if (this.n != 0) {
                onWindowSystemUiVisibilityChanged(this.n);
                ah.u(this);
            }
        }
    }

    public void setOverlayMode(boolean z) {
        this.i = z;
        boolean z2 = z && getContext().getApplicationInfo().targetSdkVersion < 19;
        this.h = z2;
    }

    public boolean a() {
        return this.i;
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.j = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    protected void onConfigurationChanged(Configuration configuration) {
        if (VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        a(getContext());
        ah.u(this);
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        boolean z2 = true;
        if (VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        c();
        int i2 = this.n ^ i;
        this.n = i;
        boolean z3 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.u != null) {
            a aVar = this.u;
            if (z) {
                z2 = false;
            }
            aVar.enableContentAnimations(z2);
            if (z3 || !z) {
                this.u.showForSystem();
            } else {
                this.u.hideForSystem();
            }
        }
        if ((i2 & 256) != 0 && this.u != null) {
            ah.u(this);
        }
    }

    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.c = i;
        if (this.u != null) {
            this.u.onWindowVisibilityChanged(i);
        }
    }

    private boolean a(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        b bVar = (b) view.getLayoutParams();
        if (z && bVar.leftMargin != rect.left) {
            bVar.leftMargin = rect.left;
            z5 = true;
        }
        if (z2 && bVar.topMargin != rect.top) {
            bVar.topMargin = rect.top;
            z5 = true;
        }
        if (z4 && bVar.rightMargin != rect.right) {
            bVar.rightMargin = rect.right;
            z5 = true;
        }
        if (!z3 || bVar.bottomMargin == rect.bottom) {
            return z5;
        }
        bVar.bottomMargin = rect.bottom;
        return true;
    }

    protected boolean fitSystemWindows(Rect rect) {
        boolean a;
        c();
        if ((ah.t(this) & 256) != 0) {
            a = a(this.e, rect, true, true, false, true);
            this.r.set(rect);
            bd.a(this, this.r, this.o);
        } else {
            a = a(this.e, rect, true, true, false, true);
            this.r.set(rect);
            bd.a(this, this.r, this.o);
        }
        if (!this.p.equals(this.o)) {
            this.p.set(this.o);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    protected b b() {
        return new b(-1, -1);
    }

    public b a(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    protected void onMeasure(int i, int i2) {
        Object obj;
        int i3;
        c();
        measureChildWithMargins(this.e, i, 0, i2, 0);
        b bVar = (b) this.e.getLayoutParams();
        int max = Math.max(0, (this.e.getMeasuredWidth() + bVar.leftMargin) + bVar.rightMargin);
        int max2 = Math.max(0, bVar.bottomMargin + (this.e.getMeasuredHeight() + bVar.topMargin));
        int a = bd.a(0, ah.k(this.e));
        if ((ah.t(this) & 256) != 0) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            i3 = this.b;
            if (this.j && this.e.getTabContainer() != null) {
                i3 += this.b;
            }
        } else {
            i3 = this.e.getVisibility() != 8 ? this.e.getMeasuredHeight() : 0;
        }
        this.q.set(this.o);
        this.s.set(this.r);
        Rect rect;
        Rect rect2;
        if (this.i || obj != null) {
            rect = this.s;
            rect.top = i3 + rect.top;
            rect2 = this.s;
            rect2.bottom += 0;
        } else {
            rect = this.q;
            rect.top = i3 + rect.top;
            rect2 = this.q;
            rect2.bottom += 0;
        }
        a(this.d, this.q, true, true, true, true);
        if (!this.t.equals(this.s)) {
            this.t.set(this.s);
            this.d.dispatchFitSystemWindows(this.s);
        }
        measureChildWithMargins(this.d, i, 0, i2, 0);
        bVar = (b) this.d.getLayoutParams();
        int max3 = Math.max(max, (this.d.getMeasuredWidth() + bVar.leftMargin) + bVar.rightMargin);
        i3 = Math.max(max2, bVar.bottomMargin + (this.d.getMeasuredHeight() + bVar.topMargin));
        int a2 = bd.a(a, ah.k(this.d));
        setMeasuredDimension(ah.a(Math.max(max3 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, a2), ah.a(Math.max(i3 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i2, a2 << 16));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingTop = getPaddingTop();
        paddingRight = (i4 - i2) - getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                b bVar = (b) childAt.getLayoutParams();
                int i6 = bVar.leftMargin + paddingLeft;
                paddingRight = bVar.topMargin + paddingTop;
                childAt.layout(i6, paddingRight, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + paddingRight);
            }
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.g != null && !this.h) {
            int bottom = this.e.getVisibility() == 0 ? (int) ((((float) this.e.getBottom()) + ah.o(this.e)) + 0.5f) : 0;
            this.g.setBounds(0, bottom, getWidth(), this.g.getIntrinsicHeight() + bottom);
            this.g.draw(canvas);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.e.getVisibility() != 0) {
            return false;
        }
        return this.k;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.B.a(view, view2, i);
        this.m = getActionBarHideOffset();
        l();
        if (this.u != null) {
            this.u.onContentScrollStarted();
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.m += i2;
        setActionBarHideOffset(this.m);
    }

    public void onStopNestedScroll(View view) {
        if (this.k && !this.l) {
            if (this.m <= this.e.getHeight()) {
                m();
            } else {
                n();
            }
        }
        if (this.u != null) {
            this.u.onContentScrollStopped();
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.k || !z) {
            return false;
        }
        if (a(f, f2)) {
            p();
        } else {
            o();
        }
        this.l = true;
        return true;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public int getNestedScrollAxes() {
        return this.B.a();
    }

    void c() {
        if (this.d == null) {
            this.d = (ContentFrameLayout) findViewById(f.action_bar_activity_content);
            this.e = (ActionBarContainer) findViewById(f.action_bar_container);
            this.f = a(findViewById(f.action_bar));
        }
    }

    private ad a(View view) {
        if (view instanceof ad) {
            return (ad) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.k) {
            this.k = z;
            if (!z) {
                l();
                setActionBarHideOffset(0);
            }
        }
    }

    public boolean d() {
        return this.k;
    }

    public int getActionBarHideOffset() {
        return this.e != null ? -((int) ah.o(this.e)) : 0;
    }

    public void setActionBarHideOffset(int i) {
        l();
        ah.b(this.e, (float) (-Math.max(0, Math.min(i, this.e.getHeight()))));
    }

    private void l() {
        removeCallbacks(this.z);
        removeCallbacks(this.A);
        if (this.x != null) {
            this.x.b();
        }
    }

    private void m() {
        l();
        postDelayed(this.z, 600);
    }

    private void n() {
        l();
        postDelayed(this.A, 600);
    }

    private void o() {
        l();
        this.z.run();
    }

    private void p() {
        l();
        this.A.run();
    }

    private boolean a(float f, float f2) {
        this.w.a(0, 0, 0, (int) f2, 0, 0, zzamj.UNSET_ENUM_VALUE, Strategy.TTL_SECONDS_INFINITE);
        if (this.w.e() > this.e.getHeight()) {
            return true;
        }
        return false;
    }

    public void setWindowCallback(Callback callback) {
        c();
        this.f.a(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        c();
        this.f.a(charSequence);
    }

    public CharSequence getTitle() {
        c();
        return this.f.e();
    }

    public void a(int i) {
        c();
        switch (i) {
            case 2:
                this.f.g();
                return;
            case 5:
                this.f.h();
                return;
            case 109:
                setOverlayMode(true);
                return;
            default:
                return;
        }
    }

    public void setUiOptions(int i) {
    }

    public void setIcon(int i) {
        c();
        this.f.a(i);
    }

    public void setIcon(Drawable drawable) {
        c();
        this.f.a(drawable);
    }

    public void setLogo(int i) {
        c();
        this.f.b(i);
    }

    public boolean e() {
        c();
        return this.f.k();
    }

    public boolean f() {
        c();
        return this.f.l();
    }

    public boolean g() {
        c();
        return this.f.m();
    }

    public boolean h() {
        c();
        return this.f.n();
    }

    public boolean i() {
        c();
        return this.f.o();
    }

    public void j() {
        c();
        this.f.p();
    }

    public void a(Menu menu, android.support.v7.view.menu.l.a aVar) {
        c();
        this.f.a(menu, aVar);
    }

    public void k() {
        c();
        this.f.q();
    }
}
