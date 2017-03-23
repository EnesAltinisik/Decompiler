package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.ah;
import android.support.v4.view.ay;
import android.support.v4.view.bc;
import android.support.v4.view.bd;
import android.support.v4.view.x;
import android.support.v4.view.y;
import android.support.v4.widget.v;
import android.support.v7.appcompat.R;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window.Callback;

public class ActionBarOverlayLayout extends ViewGroup implements x, ag {
    static final int[] e = new int[]{R.attr.actionBarSize, 16842841};
    private final Runnable A;
    private final y B;
    ActionBarContainer a;
    boolean b;
    ay c;
    final bc d;
    private int f;
    private int g;
    private ContentFrameLayout h;
    private ah i;
    private Drawable j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private final Rect v;
    private a w;
    private final int x;
    private v y;
    private final Runnable z;

    public interface a {
        void b(int i);

        void g(boolean z);

        void l();

        void m();

        void n();

        void o();
    }

    public static class b extends MarginLayoutParams {
        public b(int i, int i2) {
            super(i, i2);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 0;
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.x = 600;
        this.d = new bd(this) {
            final /* synthetic */ ActionBarOverlayLayout a;

            {
                this.a = r1;
            }

            public void b(View view) {
                this.a.c = null;
                this.a.b = false;
            }

            public void c(View view) {
                this.a.c = null;
                this.a.b = false;
            }
        };
        this.z = new Runnable(this) {
            final /* synthetic */ ActionBarOverlayLayout a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.d();
                this.a.c = ah.s(this.a.a).c(0.0f).a(this.a.d);
            }
        };
        this.A = new Runnable(this) {
            final /* synthetic */ ActionBarOverlayLayout a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.d();
                this.a.c = ah.s(this.a.a).c((float) (-this.a.a.getHeight())).a(this.a.d);
            }
        };
        a(context);
        this.B = new y(this);
    }

    private ah a(View view) {
        if (view instanceof ah) {
            return (ah) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void a(Context context) {
        boolean z = true;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(e);
        this.f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.j = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.j == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion >= 19) {
            z = false;
        }
        this.k = z;
        this.y = v.a(context);
    }

    private boolean a(float f, float f2) {
        this.y.a(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.y.e() > this.a.getHeight();
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

    private void l() {
        d();
        postDelayed(this.z, 600);
    }

    private void m() {
        d();
        postDelayed(this.A, 600);
    }

    private void n() {
        d();
        this.z.run();
    }

    private void o() {
        d();
        this.A.run();
    }

    public b a(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public void a(int i) {
        c();
        switch (i) {
            case 2:
                this.i.f();
                return;
            case 5:
                this.i.g();
                return;
            case 109:
                setOverlayMode(true);
                return;
            default:
                return;
        }
    }

    public void a(Menu menu, android.support.v7.view.menu.o.a aVar) {
        c();
        this.i.a(menu, aVar);
    }

    public boolean a() {
        return this.l;
    }

    protected b b() {
        return new b(-1, -1);
    }

    void c() {
        if (this.h == null) {
            this.h = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.a = (ActionBarContainer) findViewById(R.id.action_bar_container);
            this.i = a(findViewById(R.id.action_bar));
        }
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    void d() {
        removeCallbacks(this.z);
        removeCallbacks(this.A);
        if (this.c != null) {
            this.c.b();
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.j != null && !this.k) {
            int bottom = this.a.getVisibility() == 0 ? (int) ((((float) this.a.getBottom()) + ah.o(this.a)) + 0.5f) : 0;
            this.j.setBounds(0, bottom, getWidth(), this.j.getIntrinsicHeight() + bottom);
            this.j.draw(canvas);
        }
    }

    public boolean e() {
        c();
        return this.i.h();
    }

    public boolean f() {
        c();
        return this.i.i();
    }

    protected boolean fitSystemWindows(Rect rect) {
        boolean a;
        c();
        if ((ah.v(this) & 256) != 0) {
            a = a(this.a, rect, true, true, false, true);
            this.t.set(rect);
            bp.a(this, this.t, this.q);
        } else {
            a = a(this.a, rect, true, true, false, true);
            this.t.set(rect);
            bp.a(this, this.t, this.q);
        }
        if (!this.r.equals(this.q)) {
            this.r.set(this.q);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    public boolean g() {
        c();
        return this.i.j();
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return b();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return a(attributeSet);
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public int getActionBarHideOffset() {
        return this.a != null ? -((int) ah.o(this.a)) : 0;
    }

    public int getNestedScrollAxes() {
        return this.B.a();
    }

    public CharSequence getTitle() {
        c();
        return this.i.e();
    }

    public boolean h() {
        c();
        return this.i.k();
    }

    public boolean i() {
        c();
        return this.i.l();
    }

    public void j() {
        c();
        this.i.m();
    }

    public void k() {
        c();
        this.i.n();
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(getContext());
        ah.w(this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
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

    protected void onMeasure(int i, int i2) {
        int i3;
        c();
        measureChildWithMargins(this.a, i, 0, i2, 0);
        b bVar = (b) this.a.getLayoutParams();
        int max = Math.max(0, (this.a.getMeasuredWidth() + bVar.leftMargin) + bVar.rightMargin);
        int max2 = Math.max(0, bVar.bottomMargin + (this.a.getMeasuredHeight() + bVar.topMargin));
        int a = bp.a(0, ah.k(this.a));
        Object obj = (ah.v(this) & 256) != 0 ? 1 : null;
        if (obj != null) {
            i3 = this.f;
            if (this.m && this.a.getTabContainer() != null) {
                i3 += this.f;
            }
        } else {
            i3 = this.a.getVisibility() != 8 ? this.a.getMeasuredHeight() : 0;
        }
        this.s.set(this.q);
        this.u.set(this.t);
        Rect rect;
        Rect rect2;
        if (this.l || obj != null) {
            rect = this.u;
            rect.top = i3 + rect.top;
            rect2 = this.u;
            rect2.bottom += 0;
        } else {
            rect = this.s;
            rect.top = i3 + rect.top;
            rect2 = this.s;
            rect2.bottom += 0;
        }
        a(this.h, this.s, true, true, true, true);
        if (!this.v.equals(this.u)) {
            this.v.set(this.u);
            this.h.a(this.u);
        }
        measureChildWithMargins(this.h, i, 0, i2, 0);
        bVar = (b) this.h.getLayoutParams();
        int max3 = Math.max(max, (this.h.getMeasuredWidth() + bVar.leftMargin) + bVar.rightMargin);
        i3 = Math.max(max2, bVar.bottomMargin + (this.h.getMeasuredHeight() + bVar.topMargin));
        int a2 = bp.a(a, ah.k(this.h));
        setMeasuredDimension(ah.a(Math.max(max3 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, a2), ah.a(Math.max(i3 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i2, a2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.n || !z) {
            return false;
        }
        if (a(f, f2)) {
            o();
        } else {
            n();
        }
        this.b = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.o += i2;
        setActionBarHideOffset(this.o);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.B.a(view, view2, i);
        this.o = getActionBarHideOffset();
        d();
        if (this.w != null) {
            this.w.n();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return ((i & 2) == 0 || this.a.getVisibility() != 0) ? false : this.n;
    }

    public void onStopNestedScroll(View view) {
        if (this.n && !this.b) {
            if (this.o <= this.a.getHeight()) {
                l();
            } else {
                m();
            }
        }
        if (this.w != null) {
            this.w.o();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        boolean z = true;
        if (VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        c();
        int i2 = this.p ^ i;
        this.p = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 256) != 0;
        if (this.w != null) {
            a aVar = this.w;
            if (z3) {
                z = false;
            }
            aVar.g(z);
            if (z2 || !z3) {
                this.w.l();
            } else {
                this.w.m();
            }
        }
        if ((i2 & 256) != 0 && this.w != null) {
            ah.w(this);
        }
    }

    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.g = i;
        if (this.w != null) {
            this.w.b(i);
        }
    }

    public void setActionBarHideOffset(int i) {
        d();
        ah.b(this.a, (float) (-Math.max(0, Math.min(i, this.a.getHeight()))));
    }

    public void setActionBarVisibilityCallback(a aVar) {
        this.w = aVar;
        if (getWindowToken() != null) {
            this.w.b(this.g);
            if (this.p != 0) {
                onWindowSystemUiVisibilityChanged(this.p);
                ah.w(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.m = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.n) {
            this.n = z;
            if (!z) {
                d();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        c();
        this.i.a(i);
    }

    public void setIcon(Drawable drawable) {
        c();
        this.i.a(drawable);
    }

    public void setLogo(int i) {
        c();
        this.i.b(i);
    }

    public void setOverlayMode(boolean z) {
        this.l = z;
        boolean z2 = z && getContext().getApplicationInfo().targetSdkVersion < 19;
        this.k = z2;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Callback callback) {
        c();
        this.i.a(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        c();
        this.i.a(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
