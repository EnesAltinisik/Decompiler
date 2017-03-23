package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.design.a.g;
import android.support.design.widget.CoordinatorLayout.c;
import android.support.v4.f.d;
import android.support.v4.f.e;
import android.support.v4.view.ah;
import android.support.v4.view.bg;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.List;

@c(a = Behavior.class)
public class AppBarLayout extends LinearLayout {
    boolean a;
    private int b;
    private int c;
    private int d;
    private float e;
    private int f;
    private bg g;
    private final List<b> h;

    public static class Behavior extends i<AppBarLayout> {
        private int a;
        private boolean b;
        private boolean c;
        private q d;
        private int e = -1;
        private boolean f;
        private float g;
        private WeakReference<View> h;
        private a i;

        protected static class SavedState extends BaseSavedState {
            public static final Creator<SavedState> CREATOR = d.a(new e<SavedState>() {
                public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return a(parcel, classLoader);
                }

                public /* synthetic */ Object[] newArray(int i) {
                    return a(i);
                }

                public SavedState a(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                public SavedState[] a(int i) {
                    return new SavedState[i];
                }
            });
            int a;
            float b;
            boolean c;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel);
                this.a = parcel.readInt();
                this.b = parcel.readFloat();
                this.c = parcel.readByte() != (byte) 0;
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.a);
                parcel.writeFloat(this.b);
                parcel.writeByte((byte) (this.c ? 1 : 0));
            }
        }

        public static abstract class a {
            public abstract boolean a(AppBarLayout appBarLayout);
        }

        /* synthetic */ int a(View view) {
            return c((AppBarLayout) view);
        }

        public /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        /* synthetic */ boolean c(View view) {
            return a((AppBarLayout) view);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i) {
            boolean z = (i & 2) != 0 && appBarLayout.d() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
            if (z && this.d != null) {
                this.d.e();
            }
            this.h = null;
            return z;
        }

        public void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr) {
            if (i2 != 0 && !this.b) {
                int i3;
                int b;
                if (i2 < 0) {
                    i3 = -appBarLayout.getTotalScrollRange();
                    b = i3 + appBarLayout.getDownNestedPreScrollRange();
                } else {
                    i3 = -appBarLayout.getUpNestedPreScrollRange();
                    b = 0;
                }
                iArr[1] = b(coordinatorLayout, appBarLayout, i2, i3, b);
            }
        }

        public void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4) {
            if (i4 < 0) {
                b(coordinatorLayout, appBarLayout, i4, -appBarLayout.getDownNestedScrollRange(), 0);
                this.b = true;
                return;
            }
            this.b = false;
        }

        public void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            if (!this.c) {
                c(coordinatorLayout, appBarLayout);
            }
            this.b = false;
            this.c = false;
            this.h = new WeakReference(view);
        }

        public boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, float f, float f2, boolean z) {
            boolean z2 = false;
            if (!z) {
                z2 = a(coordinatorLayout, (View) appBarLayout, -appBarLayout.getTotalScrollRange(), 0, -f2);
            } else if (f2 < 0.0f) {
                r1 = (-appBarLayout.getTotalScrollRange()) + appBarLayout.getDownNestedPreScrollRange();
                if (a() < r1) {
                    b(coordinatorLayout, appBarLayout, r1);
                    z2 = true;
                }
            } else {
                r1 = -appBarLayout.getUpNestedPreScrollRange();
                if (a() > r1) {
                    b(coordinatorLayout, appBarLayout, r1);
                    z2 = true;
                }
            }
            this.c = z2;
            return z2;
        }

        private void b(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, int i) {
            int a = a();
            if (a != i) {
                if (this.d == null) {
                    this.d = x.a();
                    this.d.a(a.e);
                    this.d.a(new a(this) {
                        final /* synthetic */ Behavior c;

                        public void a(q qVar) {
                            this.c.a_(coordinatorLayout, appBarLayout, qVar.c());
                        }
                    });
                } else {
                    this.d.e();
                }
                this.d.a(Math.round(((((float) Math.abs(a - i)) / coordinatorLayout.getResources().getDisplayMetrics().density) * 1000.0f) / BitmapDescriptorFactory.HUE_MAGENTA));
                this.d.a(a, i);
                this.d.a();
            } else if (this.d != null && this.d.b()) {
                this.d.e();
            }
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
                        i2 += ah.q(childAt);
                        a2 = i;
                    } else if (a(a3, 5)) {
                        a2 = ah.q(childAt) + i2;
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
                    b(coordinatorLayout, appBarLayout, k.a(i2, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        private static boolean a(int i, int i2) {
            return (i & i2) == i2;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            if (((CoordinatorLayout.e) appBarLayout.getLayoutParams()).height != -2) {
                return super.a(coordinatorLayout, (View) appBarLayout, i, i2, i3, i4);
            }
            coordinatorLayout.a(appBarLayout, i, i2, MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            boolean a = super.a(coordinatorLayout, appBarLayout, i);
            int f = appBarLayout.getPendingAction();
            int i2;
            if (f != 0) {
                i2 = (f & 4) != 0 ? 1 : 0;
                if ((f & 2) != 0) {
                    f = -appBarLayout.getUpNestedPreScrollRange();
                    if (i2 != 0) {
                        b(coordinatorLayout, appBarLayout, f);
                    } else {
                        a_(coordinatorLayout, appBarLayout, f);
                    }
                } else if ((f & 1) != 0) {
                    if (i2 != 0) {
                        b(coordinatorLayout, appBarLayout, 0);
                    } else {
                        a_(coordinatorLayout, appBarLayout, 0);
                    }
                }
            } else if (this.e >= 0) {
                View childAt = appBarLayout.getChildAt(this.e);
                f = -childAt.getBottom();
                if (this.f) {
                    i2 = ah.q(childAt) + f;
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.g) + f;
                }
                a(i2);
            }
            appBarLayout.e();
            this.e = -1;
            a(k.a(b(), -appBarLayout.getTotalScrollRange(), 0));
            d(appBarLayout);
            return a;
        }

        boolean a(AppBarLayout appBarLayout) {
            if (this.i != null) {
                return this.i.a(appBarLayout);
            }
            if (this.h == null) {
                return true;
            }
            View view = (View) this.h.get();
            return (view == null || !view.isShown() || ah.b(view, -1)) ? false : true;
        }

        void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            c(coordinatorLayout, appBarLayout);
        }

        int b(AppBarLayout appBarLayout) {
            return -appBarLayout.getDownNestedScrollRange();
        }

        int c(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        int a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3) {
            int a = a();
            if (i2 == 0 || a < i2 || a > i3) {
                this.a = 0;
                return 0;
            }
            int a2 = k.a(i, i2, i3);
            if (a == a2) {
                return 0;
            }
            int b = appBarLayout.c() ? b(appBarLayout, a2) : a2;
            boolean a3 = a(b);
            a -= a2;
            this.a = a2 - b;
            if (!a3 && appBarLayout.c()) {
                coordinatorLayout.c((View) appBarLayout);
            }
            d(appBarLayout);
            return a;
        }

        private void d(AppBarLayout appBarLayout) {
            List i = appBarLayout.h;
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = (b) i.get(i2);
                if (bVar != null) {
                    bVar.a(appBarLayout, b());
                }
            }
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
                            height -= ah.q(childAt);
                        }
                    } else {
                        height = 0;
                    }
                    if (ah.v(childAt)) {
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

        int a() {
            return b() + this.a;
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
                    SavedState savedState = new SavedState(b);
                    savedState.a = i;
                    if (bottom == ah.q(childAt)) {
                        z = true;
                    }
                    savedState.c = z;
                    savedState.b = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return b;
        }

        public void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.a(coordinatorLayout, (View) appBarLayout, savedState.getSuperState());
                this.e = savedState.a;
                this.g = savedState.b;
                this.f = savedState.c;
                return;
            }
            super.a(coordinatorLayout, (View) appBarLayout, parcelable);
            this.e = -1;
        }
    }

    public static class ScrollingViewBehavior extends j {
        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.a(coordinatorLayout, view, i);
        }

        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.a(coordinatorLayout, view, i, i2, i3, i4);
        }

        public /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.ScrollingViewBehavior_Params);
            b(obtainStyledAttributes.getDimensionPixelSize(g.ScrollingViewBehavior_Params_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public boolean c(CoordinatorLayout coordinatorLayout, View view, View view2) {
            e(coordinatorLayout, view, view2);
            return false;
        }

        private void e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            android.support.design.widget.CoordinatorLayout.b b = ((CoordinatorLayout.e) view2.getLayoutParams()).b();
            if (b instanceof Behavior) {
                Behavior behavior = (Behavior) b;
                behavior.a();
                ah.e(view, ((behavior.a + (view2.getBottom() - view.getTop())) + a()) - c(view2));
            }
        }

        float a(View view) {
            if (!(view instanceof AppBarLayout)) {
                return 0.0f;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int b = appBarLayout.getDownNestedPreScrollRange();
            int a = a(appBarLayout);
            if (b != 0 && totalScrollRange + a <= b) {
                return 0.0f;
            }
            totalScrollRange -= b;
            if (totalScrollRange != 0) {
                return TextTrackStyle.DEFAULT_FONT_SCALE + (((float) a) / ((float) totalScrollRange));
            }
            return 0.0f;
        }

        private static int a(AppBarLayout appBarLayout) {
            android.support.design.widget.CoordinatorLayout.b b = ((CoordinatorLayout.e) appBarLayout.getLayoutParams()).b();
            if (b instanceof Behavior) {
                return ((Behavior) b).a();
            }
            return 0;
        }

        View a(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return view;
                }
            }
            return null;
        }

        int b(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.b(view);
        }
    }

    public static class a extends LayoutParams {
        int a = 1;
        Interpolator b;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.AppBarLayout_LayoutParams);
            this.a = obtainStyledAttributes.getInt(g.AppBarLayout_LayoutParams_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(g.AppBarLayout_LayoutParams_layout_scrollInterpolator)) {
                this.b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(g.AppBarLayout_LayoutParams_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public a(int i, int i2) {
            super(i, i2);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public a(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public int a() {
            return this.a;
        }

        public Interpolator b() {
            return this.b;
        }
    }

    public interface b {
        void a(AppBarLayout appBarLayout, int i);
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

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        b();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        b();
        this.a = false;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            if (((a) getChildAt(i5).getLayoutParams()).b() != null) {
                this.a = true;
                return;
            }
        }
    }

    private void b() {
        this.b = -1;
        this.c = -1;
        this.d = -1;
    }

    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setExpanded(boolean z) {
        a(z, ah.C(this));
    }

    public void a(boolean z, boolean z2) {
        this.f = (z2 ? 4 : 0) | (z ? 1 : 2);
        requestLayout();
    }

    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    protected a a() {
        return new a(-1, -2);
    }

    public a a(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    protected a a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new a((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new a((MarginLayoutParams) layoutParams);
        }
        return new a(layoutParams);
    }

    private boolean c() {
        return this.a;
    }

    public final int getTotalScrollRange() {
        if (this.b != -1) {
            return this.b;
        }
        int q;
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
                q = i - ah.q(childAt);
                break;
            }
        }
        q = i;
        q = Math.max(0, q - getTopInset());
        this.b = q;
        return q;
    }

    private boolean d() {
        return getTotalScrollRange() != 0;
    }

    private int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    private int getDownNestedPreScrollRange() {
        if (this.c != -1) {
            return this.c;
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
                if ((i3 & 8) != 0) {
                    i += ah.q(childAt);
                } else if ((i3 & 2) != 0) {
                    i += measuredHeight - ah.q(childAt);
                } else {
                    i += measuredHeight;
                }
            } else if (i2 > 0) {
                break;
            } else {
                i = i2;
            }
            childCount--;
            i2 = i;
        }
        i = Math.max(0, i2 - getTopInset());
        this.c = i;
        return i;
    }

    private int getDownNestedScrollRange() {
        if (this.d != -1) {
            return this.d;
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
                i = i2 - (ah.q(childAt) + getTopInset());
                break;
            }
        }
        i = i2;
        i = Math.max(0, i);
        this.d = i;
        return i;
    }

    final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int q = ah.q(this);
        if (q != 0) {
            return topInset + (q * 2);
        }
        q = getChildCount();
        return q >= 1 ? topInset + (ah.q(getChildAt(q - 1)) * 2) : 0;
    }

    public void setTargetElevation(float f) {
        this.e = f;
    }

    public float getTargetElevation() {
        return this.e;
    }

    private int getPendingAction() {
        return this.f;
    }

    private void e() {
        this.f = 0;
    }

    private int getTopInset() {
        return this.g != null ? this.g.b() : 0;
    }
}
