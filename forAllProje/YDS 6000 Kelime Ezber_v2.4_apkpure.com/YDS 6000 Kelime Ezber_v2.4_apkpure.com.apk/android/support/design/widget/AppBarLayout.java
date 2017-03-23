package android.support.design.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.design.R;
import android.support.v4.g.d;
import android.support.v4.g.e;
import android.support.v4.view.ah;
import android.support.v4.view.bf;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import java.lang.ref.WeakReference;
import java.util.List;

@android.support.design.widget.CoordinatorLayout.b(a = Behavior.class)
public class AppBarLayout extends LinearLayout {
    private int a;
    private int b;
    private int c;
    private boolean d;
    private int e;
    private bf f;
    private List<b> g;
    private boolean h;
    private boolean i;
    private final int[] j;

    public static class Behavior extends j<AppBarLayout> {
        private int b;
        private boolean c;
        private boolean d;
        private s e;
        private int f = -1;
        private boolean g;
        private float h;
        private WeakReference<View> i;
        private a j;

        public static abstract class a {
            public abstract boolean a(AppBarLayout appBarLayout);
        }

        protected static class b extends android.support.v4.view.a {
            public static final Creator<b> CREATOR = d.a(new e<b>() {
                public b a(Parcel parcel, ClassLoader classLoader) {
                    return new b(parcel, classLoader);
                }

                public b[] a(int i) {
                    return new b[i];
                }

                public /* synthetic */ Object b(Parcel parcel, ClassLoader classLoader) {
                    return a(parcel, classLoader);
                }

                public /* synthetic */ Object[] b(int i) {
                    return a(i);
                }
            });
            int a;
            float b;
            boolean c;

            public b(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.a = parcel.readInt();
                this.b = parcel.readFloat();
                this.c = parcel.readByte() != (byte) 0;
            }

            public b(Parcelable parcelable) {
                super(parcelable);
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.a);
                parcel.writeFloat(this.b);
                parcel.writeByte((byte) (this.c ? 1 : 0));
            }
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private int a(AppBarLayout appBarLayout, int i) {
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (childAt.getTop() <= (-i) && childAt.getBottom() >= (-i)) {
                    return i2;
                }
            }
            return -1;
        }

        private void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, float f) {
            int abs = Math.abs(a() - i);
            float abs2 = Math.abs(f);
            a(coordinatorLayout, appBarLayout, i, abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f));
        }

        private void a(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, int i, int i2) {
            int a = a();
            if (a != i) {
                if (this.e == null) {
                    this.e = z.a();
                    this.e.a(a.e);
                    this.e.a(new c(this) {
                        final /* synthetic */ Behavior c;

                        public void a(s sVar) {
                            this.c.a_(coordinatorLayout, appBarLayout, sVar.c());
                        }
                    });
                } else {
                    this.e.d();
                }
                this.e.a((long) Math.min(i2, 600));
                this.e.a(a, i);
                this.e.a();
            } else if (this.e != null && this.e.b()) {
                this.e.d();
            }
        }

        private static boolean a(int i, int i2) {
            return (i & i2) == i2;
        }

        private int b(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = appBarLayout.getChildAt(i2);
                a aVar = (a) childAt.getLayoutParams();
                Interpolator b = aVar.b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i2++;
                } else if (b == null) {
                    return i;
                } else {
                    int height;
                    i2 = aVar.a();
                    if ((i2 & 1) != 0) {
                        height = (aVar.bottomMargin + (childAt.getHeight() + aVar.topMargin)) + 0;
                        if ((i2 & 2) != 0) {
                            height -= ah.r(childAt);
                        }
                    } else {
                        height = 0;
                    }
                    if (ah.x(childAt)) {
                        height -= appBarLayout.getTopInset();
                    }
                    if (height <= 0) {
                        return i;
                    }
                    return Integer.signum(i) * (Math.round(b.getInterpolation(((float) (abs - childAt.getTop())) / ((float) height)) * ((float) height)) + childAt.getTop());
                }
            }
            return i;
        }

        private void b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2) {
            boolean z = true;
            boolean z2 = false;
            View c = c(appBarLayout, i);
            if (c != null) {
                int a = ((a) c.getLayoutParams()).a();
                if ((a & 1) != 0) {
                    int r = ah.r(c);
                    if (i2 > 0 && (a & 12) != 0) {
                        z2 = (-i) >= (c.getBottom() - r) - appBarLayout.getTopInset();
                    } else if ((a & 2) != 0) {
                        if ((-i) < (c.getBottom() - r) - appBarLayout.getTopInset()) {
                            z = false;
                        }
                        z2 = z;
                    }
                }
                if (appBarLayout.a(z2) && VERSION.SDK_INT >= 11 && d(coordinatorLayout, appBarLayout)) {
                    appBarLayout.jumpDrawablesToCurrentState();
                }
            }
        }

        private static View c(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private void c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int a = a();
            int a2 = a(appBarLayout, a);
            if (a2 >= 0) {
                View childAt = appBarLayout.getChildAt(a2);
                int a3 = ((a) childAt.getLayoutParams()).a();
                if ((a3 & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (a2 == appBarLayout.getChildCount() - 1) {
                        i2 += appBarLayout.getTopInset();
                    }
                    if (a(a3, 2)) {
                        i2 += ah.r(childAt);
                        a2 = i;
                    } else if (a(a3, 5)) {
                        a2 = ah.r(childAt) + i2;
                        if (a >= a2) {
                            i2 = a2;
                            a2 = i;
                        }
                    } else {
                        a2 = i;
                    }
                    if (a >= (i2 + a2) / 2) {
                        i2 = a2;
                    }
                    a(coordinatorLayout, appBarLayout, l.a(i2, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private boolean d(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List d = coordinatorLayout.d((View) appBarLayout);
            int size = d.size();
            int i = 0;
            while (i < size) {
                android.support.design.widget.CoordinatorLayout.a b = ((CoordinatorLayout.d) ((View) d.get(i)).getLayoutParams()).b();
                if (b instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) b).d() != 0;
                } else {
                    i++;
                }
            }
            return false;
        }

        int a() {
            return b() + this.b;
        }

        int a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3) {
            int a = a();
            if (i2 == 0 || a < i2 || a > i3) {
                this.b = 0;
                return 0;
            }
            int a2 = l.a(i, i2, i3);
            if (a == a2) {
                return 0;
            }
            int b = appBarLayout.b() ? b(appBarLayout, a2) : a2;
            boolean a3 = a(b);
            int i4 = a - a2;
            this.b = a2 - b;
            if (!a3 && appBarLayout.b()) {
                coordinatorLayout.b((View) appBarLayout);
            }
            appBarLayout.a(b());
            b(coordinatorLayout, appBarLayout, a2, a2 < a ? -1 : 1);
            return i4;
        }

        /* synthetic */ int a(View view) {
            return c((AppBarLayout) view);
        }

        void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            c(coordinatorLayout, appBarLayout);
        }

        public void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof b) {
                b bVar = (b) parcelable;
                super.a(coordinatorLayout, (View) appBarLayout, bVar.a());
                this.f = bVar.a;
                this.h = bVar.b;
                this.g = bVar.c;
                return;
            }
            super.a(coordinatorLayout, (View) appBarLayout, parcelable);
            this.f = -1;
        }

        public void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            if (!this.d) {
                c(coordinatorLayout, appBarLayout);
            }
            this.c = false;
            this.d = false;
            this.i = new WeakReference(view);
        }

        public void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4) {
            if (i4 < 0) {
                b(coordinatorLayout, appBarLayout, i4, -appBarLayout.getDownNestedScrollRange(), 0);
                this.c = true;
                return;
            }
            this.c = false;
        }

        public void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr) {
            if (i2 != 0 && !this.c) {
                int i3;
                int downNestedPreScrollRange;
                if (i2 < 0) {
                    i3 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = i3 + appBarLayout.getDownNestedPreScrollRange();
                } else {
                    i3 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                iArr[1] = b(coordinatorLayout, appBarLayout, i2, i3, downNestedPreScrollRange);
            }
        }

        boolean a(AppBarLayout appBarLayout) {
            if (this.j != null) {
                return this.j.a(appBarLayout);
            }
            if (this.i == null) {
                return true;
            }
            View view = (View) this.i.get();
            return (view == null || !view.isShown() || ah.b(view, -1)) ? false : true;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            boolean a = super.a(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            if (pendingAction != 0) {
                int i2 = (pendingAction & 4) != 0 ? 1 : 0;
                if ((pendingAction & 2) != 0) {
                    pendingAction = -appBarLayout.getUpNestedPreScrollRange();
                    if (i2 != 0) {
                        a(coordinatorLayout, appBarLayout, pendingAction, 0.0f);
                    } else {
                        a_(coordinatorLayout, appBarLayout, pendingAction);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (i2 != 0) {
                        a(coordinatorLayout, appBarLayout, 0, 0.0f);
                    } else {
                        a_(coordinatorLayout, appBarLayout, 0);
                    }
                }
            } else if (this.f >= 0) {
                View childAt = appBarLayout.getChildAt(this.f);
                pendingAction = -childAt.getBottom();
                a(this.g ? ah.r(childAt) + pendingAction : Math.round(((float) childAt.getHeight()) * this.h) + pendingAction);
            }
            appBarLayout.d();
            this.f = -1;
            a(l.a(b(), -appBarLayout.getTotalScrollRange(), 0));
            appBarLayout.a(b());
            return a;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            if (((CoordinatorLayout.d) appBarLayout.getLayoutParams()).height != -2) {
                return super.a(coordinatorLayout, (View) appBarLayout, i, i2, i3, i4);
            }
            coordinatorLayout.a(appBarLayout, i, i2, MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, float f, float f2, boolean z) {
            boolean z2 = false;
            if (!z) {
                z2 = a(coordinatorLayout, (View) appBarLayout, -appBarLayout.getTotalScrollRange(), 0, -f2);
            } else if (f2 < 0.0f) {
                r1 = (-appBarLayout.getTotalScrollRange()) + appBarLayout.getDownNestedPreScrollRange();
                if (a() < r1) {
                    a(coordinatorLayout, appBarLayout, r1, f2);
                    z2 = true;
                }
            } else {
                r1 = -appBarLayout.getUpNestedPreScrollRange();
                if (a() > r1) {
                    a(coordinatorLayout, appBarLayout, r1, f2);
                    z2 = true;
                }
            }
            this.d = z2;
            return z2;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i) {
            boolean z = (i & 2) != 0 && appBarLayout.c() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
            if (z && this.e != null) {
                this.e.d();
            }
            this.i = null;
            return z;
        }

        public /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        int b(AppBarLayout appBarLayout) {
            return -appBarLayout.getDownNestedScrollRange();
        }

        public Parcelable b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            boolean z = false;
            Parcelable b = super.b(coordinatorLayout, appBarLayout);
            int b2 = b();
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + b2;
                if (childAt.getTop() + b2 > 0 || bottom < 0) {
                    i++;
                } else {
                    b bVar = new b(b);
                    bVar.a = i;
                    if (bottom == ah.r(childAt) + appBarLayout.getTopInset()) {
                        z = true;
                    }
                    bVar.c = z;
                    bVar.b = ((float) bottom) / ((float) childAt.getHeight());
                    return bVar;
                }
            }
            return b;
        }

        int c(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        /* synthetic */ boolean c(View view) {
            return a((AppBarLayout) view);
        }
    }

    public static class ScrollingViewBehavior extends k {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ScrollingViewBehavior_Layout);
            b(obtainStyledAttributes.getDimensionPixelSize(R.styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        private static int a(AppBarLayout appBarLayout) {
            android.support.design.widget.CoordinatorLayout.a b = ((CoordinatorLayout.d) appBarLayout.getLayoutParams()).b();
            return b instanceof Behavior ? ((Behavior) b).a() : 0;
        }

        private void e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            android.support.design.widget.CoordinatorLayout.a b = ((CoordinatorLayout.d) view2.getLayoutParams()).b();
            if (b instanceof Behavior) {
                int bottom = view2.getBottom() - view.getTop();
                ah.d(view, ((((Behavior) b).b + bottom) + a()) - c(view2));
            }
        }

        float a(View view) {
            if (!(view instanceof AppBarLayout)) {
                return 0.0f;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            int a = a(appBarLayout);
            if (downNestedPreScrollRange != 0 && totalScrollRange + a <= downNestedPreScrollRange) {
                return 0.0f;
            }
            totalScrollRange -= downNestedPreScrollRange;
            return totalScrollRange != 0 ? 1.0f + (((float) a) / ((float) totalScrollRange)) : 0.0f;
        }

        AppBarLayout a(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.a(coordinatorLayout, view, i);
        }

        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.a(coordinatorLayout, view, i, i2, i3, i4);
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout a = a(coordinatorLayout.c(view));
            if (a != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    a.a(false, !z);
                    return true;
                }
            }
            return false;
        }

        public /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        int b(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.b(view);
        }

        /* synthetic */ View b(List list) {
            return a(list);
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public boolean c(CoordinatorLayout coordinatorLayout, View view, View view2) {
            e(coordinatorLayout, view, view2);
            return false;
        }
    }

    public static class a extends LayoutParams {
        int a = 1;
        Interpolator b;

        public a(int i, int i2) {
            super(i, i2);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AppBarLayout_Layout);
            this.a = obtainStyledAttributes.getInt(R.styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(R.styleable.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(R.styleable.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        @TargetApi(19)
        public a(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public int a() {
            return this.a;
        }

        public Interpolator b() {
            return this.b;
        }

        boolean c() {
            return (this.a & 1) == 1 && (this.a & 10) != 0;
        }
    }

    public interface b {
        void a(AppBarLayout appBarLayout, int i);
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
        this.b = -1;
        this.c = -1;
        this.e = 0;
        this.j = new int[2];
        setOrientation(1);
        r.a(context);
        if (VERSION.SDK_INT >= 21) {
            aa.a(this);
            aa.a(this, attributeSet, 0, R.style.Widget_Design_AppBarLayout);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AppBarLayout, 0, R.style.Widget_Design_AppBarLayout);
        ah.a((View) this, obtainStyledAttributes.getDrawable(R.styleable.AppBarLayout_android_background));
        if (obtainStyledAttributes.hasValue(R.styleable.AppBarLayout_expanded)) {
            setExpanded(obtainStyledAttributes.getBoolean(R.styleable.AppBarLayout_expanded, false));
        }
        if (VERSION.SDK_INT >= 21 && obtainStyledAttributes.hasValue(R.styleable.AppBarLayout_elevation)) {
            aa.a(this, (float) obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppBarLayout_elevation, 0));
        }
        obtainStyledAttributes.recycle();
        ah.a((View) this, new z(this) {
            final /* synthetic */ AppBarLayout a;

            {
                this.a = r1;
            }

            public bf a(View view, bf bfVar) {
                return this.a.a(bfVar);
            }
        });
    }

    private boolean b(boolean z) {
        if (this.h == z) {
            return false;
        }
        this.h = z;
        refreshDrawableState();
        return true;
    }

    private void e() {
        boolean z;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((a) getChildAt(i).getLayoutParams()).c()) {
                z = true;
                break;
            }
        }
        z = false;
        b(z);
    }

    private void f() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
    }

    protected a a() {
        return new a(-1, -2);
    }

    public a a(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    protected a a(ViewGroup.LayoutParams layoutParams) {
        return (VERSION.SDK_INT < 19 || !(layoutParams instanceof LayoutParams)) ? layoutParams instanceof MarginLayoutParams ? new a((MarginLayoutParams) layoutParams) : new a(layoutParams) : new a((LayoutParams) layoutParams);
    }

    bf a(bf bfVar) {
        Object obj = null;
        if (ah.x(this)) {
            obj = bfVar;
        }
        if (!z.a(this.f, obj)) {
            this.f = obj;
            f();
        }
        return bfVar;
    }

    void a(int i) {
        if (this.g != null) {
            int size = this.g.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = (b) this.g.get(i2);
                if (bVar != null) {
                    bVar.a(this, i);
                }
            }
        }
    }

    public void a(boolean z, boolean z2) {
        this.e = (z2 ? 4 : 0) | (z ? 1 : 2);
        requestLayout();
    }

    boolean a(boolean z) {
        if (this.i == z) {
            return false;
        }
        this.i = z;
        refreshDrawableState();
        return true;
    }

    boolean b() {
        return this.d;
    }

    boolean c() {
        return getTotalScrollRange() != 0;
    }

    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void d() {
        this.e = 0;
    }

    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    protected /* synthetic */ LayoutParams m0generateDefaultLayoutParams() {
        return a();
    }

    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return a(attributeSet);
    }

    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    public /* synthetic */ LayoutParams m1generateLayoutParams(AttributeSet attributeSet) {
        return a(attributeSet);
    }

    protected /* synthetic */ LayoutParams m2generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    int getDownNestedPreScrollRange() {
        if (this.b != -1) {
            return this.b;
        }
        int i;
        int childCount = getChildCount() - 1;
        int i2 = 0;
        while (childCount >= 0) {
            View childAt = getChildAt(childCount);
            a aVar = (a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = aVar.a;
            if ((i3 & 5) == 5) {
                i = (aVar.bottomMargin + aVar.topMargin) + i2;
                i = (i3 & 8) != 0 ? i + ah.r(childAt) : (i3 & 2) != 0 ? i + (measuredHeight - ah.r(childAt)) : i + measuredHeight;
            } else if (i2 > 0) {
                break;
            } else {
                i = i2;
            }
            childCount--;
            i2 = i;
        }
        i = Math.max(0, i2);
        this.b = i;
        return i;
    }

    int getDownNestedScrollRange() {
        if (this.c != -1) {
            return this.c;
        }
        int i;
        int childCount = getChildCount();
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            a aVar = (a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + (aVar.topMargin + aVar.bottomMargin);
            i = aVar.a;
            if ((i & 1) == 0) {
                break;
            }
            i2 += measuredHeight;
            if ((i & 2) != 0) {
                i = i2 - (ah.r(childAt) + getTopInset());
                break;
            }
        }
        i = i2;
        i = Math.max(0, i);
        this.c = i;
        return i;
    }

    final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int r = ah.r(this);
        if (r != 0) {
            return (r * 2) + topInset;
        }
        r = getChildCount();
        r = r >= 1 ? ah.r(getChildAt(r - 1)) : 0;
        return r != 0 ? (r * 2) + topInset : getHeight() / 3;
    }

    int getPendingAction() {
        return this.e;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        return this.f != null ? this.f.b() : 0;
    }

    public final int getTotalScrollRange() {
        if (this.a != -1) {
            return this.a;
        }
        int r;
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            a aVar = (a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = aVar.a;
            if ((i3 & 1) == 0) {
                break;
            }
            i += aVar.bottomMargin + (measuredHeight + aVar.topMargin);
            if ((i3 & 2) != 0) {
                r = i - ah.r(childAt);
                break;
            }
        }
        r = i;
        r = Math.max(0, r - getTopInset());
        this.a = r;
        return r;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    protected int[] onCreateDrawableState(int i) {
        int[] iArr = this.j;
        int[] onCreateDrawableState = super.onCreateDrawableState(iArr.length + i);
        iArr[0] = this.h ? R.attr.state_collapsible : -R.attr.state_collapsible;
        int i2 = (this.h && this.i) ? R.attr.state_collapsed : -R.attr.state_collapsed;
        iArr[1] = i2;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        f();
        this.d = false;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            if (((a) getChildAt(i5).getLayoutParams()).b() != null) {
                this.d = true;
                break;
            }
        }
        e();
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        f();
    }

    public void setExpanded(boolean z) {
        a(z, ah.E(this));
    }

    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (VERSION.SDK_INT >= 21) {
            aa.a(this, f);
        }
    }
}
