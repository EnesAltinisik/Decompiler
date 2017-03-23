package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.view.aa;
import android.support.v4.view.ab;
import android.support.v4.view.ah;
import android.support.v4.view.bg;
import android.support.v4.view.t;
import android.support.v4.view.z;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements z {
    static final String a;
    static final Class<?>[] b = new Class[]{Context.class, AttributeSet.class};
    static final ThreadLocal<Map<String, Constructor<b>>> c = new ThreadLocal();
    static final Comparator<View> e;
    static final c f;
    private final aa A;
    final Comparator<View> d;
    private final List<View> g;
    private final List<View> h;
    private final List<View> i;
    private final Rect j;
    private final Rect k;
    private final Rect l;
    private final int[] m;
    private Paint n;
    private boolean o;
    private boolean p;
    private int[] q;
    private View r;
    private View s;
    private View t;
    private f u;
    private boolean v;
    private bg w;
    private boolean x;
    private Drawable y;
    private OnHierarchyChangeListener z;

    public static abstract class b<V extends View> {
        public b(Context context, AttributeSet attributeSet) {
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, V v) {
            return d(coordinatorLayout, v) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public boolean c(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void d(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        public void b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        public bg a(CoordinatorLayout coordinatorLayout, V v, bg bgVar) {
            return bgVar;
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public Parcelable b(CoordinatorLayout coordinatorLayout, V v) {
            return BaseSavedState.EMPTY_STATE;
        }
    }

    protected static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = android.support.v4.f.d.a(new android.support.v4.f.e<SavedState>() {
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
        SparseArray<Parcelable> a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.a = new SparseArray(readInt);
            for (int i = 0; i < readInt; i++) {
                this.a.append(iArr[i], readParcelableArray[i]);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            int i2 = 0;
            super.writeToParcel(parcel, i);
            int size = this.a != null ? this.a.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            while (i2 < size) {
                iArr[i2] = this.a.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.a.valueAt(i2);
                i2++;
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    private class a implements ab {
        final /* synthetic */ CoordinatorLayout a;

        private a(CoordinatorLayout coordinatorLayout) {
            this.a = coordinatorLayout;
        }

        public bg onApplyWindowInsets(View view, bg bgVar) {
            return this.a.a(bgVar);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface c {
        Class<? extends b> a();
    }

    private class d implements OnHierarchyChangeListener {
        final /* synthetic */ CoordinatorLayout a;

        private d(CoordinatorLayout coordinatorLayout) {
            this.a = coordinatorLayout;
        }

        public void onChildViewAdded(View view, View view2) {
            if (this.a.z != null) {
                this.a.z.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            this.a.b(view2);
            if (this.a.z != null) {
                this.a.z.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class e extends MarginLayoutParams {
        b a;
        boolean b = false;
        public int c = 0;
        public int d = 0;
        public int e = -1;
        int f = -1;
        View g;
        View h;
        final Rect i = new Rect();
        Object j;
        private boolean k;
        private boolean l;
        private boolean m;

        public e(int i, int i2) {
            super(i, i2);
        }

        e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, android.support.design.a.g.CoordinatorLayout_LayoutParams);
            this.c = obtainStyledAttributes.getInteger(android.support.design.a.g.CoordinatorLayout_LayoutParams_android_layout_gravity, 0);
            this.f = obtainStyledAttributes.getResourceId(android.support.design.a.g.CoordinatorLayout_LayoutParams_layout_anchor, -1);
            this.d = obtainStyledAttributes.getInteger(android.support.design.a.g.CoordinatorLayout_LayoutParams_layout_anchorGravity, 0);
            this.e = obtainStyledAttributes.getInteger(android.support.design.a.g.CoordinatorLayout_LayoutParams_layout_keyline, -1);
            this.b = obtainStyledAttributes.hasValue(android.support.design.a.g.CoordinatorLayout_LayoutParams_layout_behavior);
            if (this.b) {
                this.a = CoordinatorLayout.a(context, attributeSet, obtainStyledAttributes.getString(android.support.design.a.g.CoordinatorLayout_LayoutParams_layout_behavior));
            }
            obtainStyledAttributes.recycle();
        }

        public e(e eVar) {
            super(eVar);
        }

        public e(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public e(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public int a() {
            return this.f;
        }

        public b b() {
            return this.a;
        }

        public void a(b bVar) {
            if (this.a != bVar) {
                this.a = bVar;
                this.j = null;
                this.b = true;
            }
        }

        void a(Rect rect) {
            this.i.set(rect);
        }

        Rect c() {
            return this.i;
        }

        boolean d() {
            return this.g == null && this.f != -1;
        }

        boolean e() {
            if (this.a == null) {
                this.k = false;
            }
            return this.k;
        }

        boolean a(CoordinatorLayout coordinatorLayout, View view) {
            if (this.k) {
                return true;
            }
            boolean e = (this.a != null ? this.a.e(coordinatorLayout, view) : 0) | this.k;
            this.k = e;
            return e;
        }

        void f() {
            this.k = false;
        }

        void g() {
            this.l = false;
        }

        void a(boolean z) {
            this.l = z;
        }

        boolean h() {
            return this.l;
        }

        boolean i() {
            return this.m;
        }

        void b(boolean z) {
            this.m = z;
        }

        void j() {
            this.m = false;
        }

        boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 == this.h || (this.a != null && this.a.b(coordinatorLayout, view, view2));
        }

        View b(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f == -1) {
                this.h = null;
                this.g = null;
                return null;
            }
            if (this.g == null || !b(view, coordinatorLayout)) {
                a(view, coordinatorLayout);
            }
            return this.g;
        }

        private void a(View view, CoordinatorLayout coordinatorLayout) {
            this.g = coordinatorLayout.findViewById(this.f);
            if (this.g != null) {
                if (this.g != coordinatorLayout) {
                    View view2 = this.g;
                    View parent = this.g.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.h = null;
                            this.g = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.h = view2;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.h = null;
                    this.g = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.h = null;
                this.g = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f) + " to anchor view " + view);
            }
        }

        private boolean b(View view, CoordinatorLayout coordinatorLayout) {
            if (this.g.getId() != this.f) {
                return false;
            }
            View view2 = this.g;
            View parent = this.g.getParent();
            while (parent != coordinatorLayout) {
                if (parent == null || parent == view) {
                    this.h = null;
                    this.g = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
                parent = parent.getParent();
            }
            this.h = view2;
            return true;
        }
    }

    class f implements OnPreDrawListener {
        final /* synthetic */ CoordinatorLayout a;

        f(CoordinatorLayout coordinatorLayout) {
            this.a = coordinatorLayout;
        }

        public boolean onPreDraw() {
            this.a.a(false);
            return true;
        }
    }

    static class g implements Comparator<View> {
        g() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((View) obj, (View) obj2);
        }

        public int a(View view, View view2) {
            float D = ah.D(view);
            float D2 = ah.D(view2);
            if (D > D2) {
                return -1;
            }
            if (D < D2) {
                return 1;
            }
            return 0;
        }
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return d();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return a(attributeSet);
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return a(layoutParams);
    }

    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        a = packageR != null ? packageR.getName() : null;
        if (VERSION.SDK_INT >= 21) {
            e = new g();
            f = new d();
        } else {
            e = null;
            f = null;
        }
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        int i2 = 0;
        super(context, attributeSet, i);
        this.d = new Comparator<View>(this) {
            final /* synthetic */ CoordinatorLayout a;

            {
                this.a = r1;
            }

            public /* synthetic */ int compare(Object obj, Object obj2) {
                return a((View) obj, (View) obj2);
            }

            public int a(View view, View view2) {
                if (view == view2) {
                    return 0;
                }
                if (((e) view.getLayoutParams()).a(this.a, view, view2)) {
                    return 1;
                }
                return ((e) view2.getLayoutParams()).a(this.a, view2, view) ? -1 : 0;
            }
        };
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new Rect();
        this.k = new Rect();
        this.l = new Rect();
        this.m = new int[2];
        this.A = new aa(this);
        p.a(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, android.support.design.a.g.CoordinatorLayout, i, android.support.design.a.f.Widget_Design_CoordinatorLayout);
        int resourceId = obtainStyledAttributes.getResourceId(android.support.design.a.g.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.q = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.q.length;
            while (i2 < length) {
                int[] iArr = this.q;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
                i2++;
            }
        }
        this.y = obtainStyledAttributes.getDrawable(android.support.design.a.g.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        if (f != null) {
            f.a(this, new a());
        }
        super.setOnHierarchyChangeListener(new d());
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.z = onHierarchyChangeListener;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        e();
        if (this.v) {
            if (this.u == null) {
                this.u = new f(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.u);
        }
        if (this.w == null && ah.v(this)) {
            ah.u(this);
        }
        this.p = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
        if (this.v && this.u != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.u);
        }
        if (this.t != null) {
            onStopNestedScroll(this.t);
        }
        this.p = false;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = null;
        if (this.y != drawable) {
            if (this.y != null) {
                this.y.setCallback(null);
            }
            if (drawable != null) {
                drawable2 = drawable.mutate();
            }
            this.y = drawable2;
            if (this.y != null) {
                if (this.y.isStateful()) {
                    this.y.setState(getDrawableState());
                }
                android.support.v4.c.a.a.b(this.y, ah.h(this));
                this.y.setVisible(getVisibility() == 0, false);
                this.y.setCallback(this);
            }
            ah.d(this);
        }
    }

    public Drawable getStatusBarBackground() {
        return this.y;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        int i = 0;
        Drawable drawable = this.y;
        if (drawable != null && drawable.isStateful()) {
            i = 0 | drawable.setState(drawableState);
        }
        if (i != 0) {
            invalidate();
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.y;
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.y != null && this.y.isVisible() != z) {
            this.y.setVisible(z, false);
        }
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? android.support.v4.b.b.getDrawable(getContext(), i) : null);
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    private bg a(bg bgVar) {
        boolean z = true;
        if (this.w == bgVar) {
            return bgVar;
        }
        this.w = bgVar;
        boolean z2 = bgVar != null && bgVar.b() > 0;
        this.x = z2;
        if (this.x || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        bgVar = b(bgVar);
        requestLayout();
        return bgVar;
    }

    private void e() {
        if (this.r != null) {
            b b = ((e) this.r.getLayoutParams()).b();
            if (b != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                b.b(this, this.r, obtain);
                obtain.recycle();
            }
            this.r = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((e) getChildAt(i).getLayoutParams()).f();
        }
        this.o = false;
    }

    private void a(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            int childDrawingOrder;
            if (isChildrenDrawingOrderEnabled) {
                childDrawingOrder = getChildDrawingOrder(childCount, i);
            } else {
                childDrawingOrder = i;
            }
            list.add(getChildAt(childDrawingOrder));
        }
        if (e != null) {
            Collections.sort(list, e);
        }
    }

    private boolean a(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2 = false;
        Object obj = null;
        MotionEvent motionEvent2 = null;
        int a = t.a(motionEvent);
        List list = this.h;
        a(list);
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2;
            MotionEvent motionEvent3;
            View view = (View) list.get(i2);
            e eVar = (e) view.getLayoutParams();
            b b = eVar.b();
            if ((!z2 && obj == null) || a == 0) {
                if (!(z2 || b == null)) {
                    switch (i) {
                        case 0:
                            z2 = b.a(this, view, motionEvent);
                            break;
                        case 1:
                            z2 = b.b(this, view, motionEvent);
                            break;
                    }
                    if (z2) {
                        this.r = view;
                    }
                }
                z = z2;
                boolean e = eVar.e();
                boolean a2 = eVar.a(this, view);
                Object obj3 = (!a2 || e) ? null : 1;
                if (a2 && obj3 == null) {
                    list.clear();
                    return z;
                }
                MotionEvent motionEvent4 = motionEvent2;
                obj2 = obj3;
                motionEvent3 = motionEvent4;
            } else if (b != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                } else {
                    motionEvent3 = motionEvent2;
                }
                switch (i) {
                    case 0:
                        b.a(this, view, motionEvent3);
                        break;
                    case 1:
                        b.b(this, view, motionEvent3);
                        break;
                }
                obj2 = obj;
                z = z2;
            } else {
                motionEvent3 = motionEvent2;
                z = z2;
                obj2 = obj;
            }
            i2++;
            obj = obj2;
            z2 = z;
            motionEvent2 = motionEvent3;
        }
        z = z2;
        list.clear();
        return z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = null;
        int a = t.a(motionEvent);
        if (a == 0) {
            e();
        }
        boolean a2 = a(motionEvent, 0);
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        if (a == 1 || a == 3) {
            e();
        }
        return a2;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        MotionEvent obtain;
        MotionEvent motionEvent2 = null;
        int a = t.a(motionEvent);
        boolean z2;
        if (this.r == null) {
            boolean a2 = a(motionEvent, 1);
            if (a2) {
                z2 = a2;
            } else {
                z2 = a2;
                z = false;
                if (this.r == null) {
                    z |= super.onTouchEvent(motionEvent);
                } else if (z2) {
                    if (null != null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    } else {
                        obtain = null;
                    }
                    super.onTouchEvent(obtain);
                    motionEvent2 = obtain;
                }
                if (!z || a == 0) {
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    if (a == 1 || a == 3) {
                        e();
                    }
                    return z;
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                e();
                return z;
            }
        }
        z2 = false;
        b b = ((e) this.r.getLayoutParams()).b();
        z = b != null ? b.b(this, this.r, motionEvent) : false;
        if (this.r == null) {
            z |= super.onTouchEvent(motionEvent);
        } else if (z2) {
            if (null != null) {
                obtain = null;
            } else {
                long uptimeMillis2 = SystemClock.uptimeMillis();
                obtain = MotionEvent.obtain(uptimeMillis2, uptimeMillis2, 3, 0.0f, 0.0f, 0);
            }
            super.onTouchEvent(obtain);
            motionEvent2 = obtain;
        }
        if (z) {
        }
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        e();
        return z;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.o) {
            e();
            this.o = true;
        }
    }

    private int a(int i) {
        if (this.q == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        } else if (i >= 0 && i < this.q.length) {
            return this.q[i];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
    }

    static b a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(a)) {
            str = a + '.' + str;
        }
        try {
            Map map;
            Map map2 = (Map) c.get();
            if (map2 == null) {
                HashMap hashMap = new HashMap();
                c.set(hashMap);
                map = hashMap;
            } else {
                map = map2;
            }
            Constructor constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, true, context.getClassLoader()).getConstructor(b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (b) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Throwable e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    e a(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.b) {
            c cVar = null;
            for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                cVar = (c) cls.getAnnotation(c.class);
                if (cVar != null) {
                    break;
                }
            }
            c cVar2 = cVar;
            if (cVar2 != null) {
                try {
                    eVar.a((b) cVar2.a().newInstance());
                } catch (Throwable e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + cVar2.a().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            eVar.b = true;
        }
        return eVar;
    }

    private void f() {
        this.g.clear();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            a(childAt).b(this, childAt);
            this.g.add(childAt);
        }
        a(this.g, this.d);
    }

    void a(View view, Rect rect) {
        t.b(this, view, rect);
    }

    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public void a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    protected void onMeasure(int i, int i2) {
        Object obj;
        f();
        a();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int h = ah.h(this);
        Object obj2;
        if (h == 1) {
            obj2 = 1;
        } else {
            obj2 = null;
        }
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        int i3 = paddingLeft + paddingRight;
        int i4 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        paddingBottom = getSuggestedMinimumHeight();
        if (this.w == null || !ah.v(this)) {
            obj = null;
        } else {
            obj = 1;
        }
        int size3 = this.g.size();
        int i5 = 0;
        int i6 = 0;
        int i7 = paddingBottom;
        int i8 = suggestedMinimumWidth;
        while (i5 < size3) {
            int i9;
            View view = (View) this.g.get(i5);
            e eVar = (e) view.getLayoutParams();
            int i10 = 0;
            if (eVar.e >= 0 && mode != 0) {
                int a = a(eVar.e);
                paddingTop = android.support.v4.view.e.a(c(eVar.c), h) & 7;
                if ((paddingTop == 3 && r9 == null) || (paddingTop == 5 && r9 != null)) {
                    i10 = Math.max(0, (size - paddingRight) - a);
                } else if ((paddingTop == 5 && r9 == null) || (paddingTop == 3 && r9 != null)) {
                    i10 = Math.max(0, a - paddingLeft);
                }
            }
            if (obj == null || ah.v(view)) {
                i9 = i2;
                suggestedMinimumWidth = i;
            } else {
                paddingTop = this.w.b() + this.w.d();
                suggestedMinimumWidth = MeasureSpec.makeMeasureSpec(size - (this.w.a() + this.w.c()), mode);
                i9 = MeasureSpec.makeMeasureSpec(size2 - paddingTop, mode2);
            }
            b b = eVar.b();
            if (b == null || !b.a(this, view, suggestedMinimumWidth, i10, i9, 0)) {
                a(view, suggestedMinimumWidth, i10, i9, 0);
            }
            i10 = Math.max(i8, ((view.getMeasuredWidth() + i3) + eVar.leftMargin) + eVar.rightMargin);
            suggestedMinimumWidth = Math.max(i7, ((view.getMeasuredHeight() + i4) + eVar.topMargin) + eVar.bottomMargin);
            i5++;
            i6 = ah.a(i6, ah.k(view));
            i7 = suggestedMinimumWidth;
            i8 = i10;
        }
        setMeasuredDimension(ah.a(i8, i, -16777216 & i6), ah.a(i7, i2, i6 << 16));
    }

    private bg b(bg bgVar) {
        if (bgVar.e()) {
            return bgVar;
        }
        bg a;
        int childCount = getChildCount();
        int i = 0;
        bg bgVar2 = bgVar;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (ah.v(childAt)) {
                b b = ((e) childAt.getLayoutParams()).b();
                if (b != null) {
                    a = b.a(this, childAt, bgVar2);
                    if (a.e()) {
                        break;
                    }
                    i++;
                    bgVar2 = a;
                }
            }
            a = bgVar2;
            i++;
            bgVar2 = a;
        }
        a = bgVar2;
        return a;
    }

    public void a(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        if (eVar.d()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (eVar.g != null) {
            a(view, eVar.g, i);
        } else if (eVar.e >= 0) {
            b(view, eVar.e, i);
        } else {
            c(view, i);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int h = ah.h(this);
        int size = this.g.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.g.get(i5);
            b b = ((e) view.getLayoutParams()).b();
            if (b == null || !b.a(this, view, h)) {
                a(view, h);
            }
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.x && this.y != null) {
            int b = this.w != null ? this.w.b() : 0;
            if (b > 0) {
                this.y.setBounds(0, 0, getWidth(), b);
                this.y.draw(canvas);
            }
        }
    }

    void b(View view, Rect rect) {
        ((e) view.getLayoutParams()).a(rect);
    }

    void c(View view, Rect rect) {
        rect.set(((e) view.getLayoutParams()).c());
    }

    void a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.set(0, 0, 0, 0);
        } else if (z) {
            a(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    void a(View view, int i, Rect rect, Rect rect2) {
        e eVar = (e) view.getLayoutParams();
        int a = android.support.v4.view.e.a(d(eVar.c), i);
        int a2 = android.support.v4.view.e.a(b(eVar.d), i);
        int i2 = a & 7;
        int i3 = a & 112;
        a = a2 & 7;
        int i4 = a2 & 112;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        switch (a) {
            case 1:
                a2 = (rect.width() / 2) + rect.left;
                break;
            case 5:
                a2 = rect.right;
                break;
            default:
                a2 = rect.left;
                break;
        }
        switch (i4) {
            case 16:
                a = rect.top + (rect.height() / 2);
                break;
            case 80:
                a = rect.bottom;
                break;
            default:
                a = rect.top;
                break;
        }
        switch (i2) {
            case 1:
                a2 -= measuredWidth / 2;
                break;
            case 5:
                break;
            default:
                a2 -= measuredWidth;
                break;
        }
        switch (i3) {
            case 16:
                a -= measuredHeight / 2;
                break;
            case 80:
                break;
            default:
                a -= measuredHeight;
                break;
        }
        i2 = getWidth();
        i3 = getHeight();
        a2 = Math.max(getPaddingLeft() + eVar.leftMargin, Math.min(a2, ((i2 - getPaddingRight()) - measuredWidth) - eVar.rightMargin));
        int max = Math.max(getPaddingTop() + eVar.topMargin, Math.min(a, ((i3 - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin));
        rect2.set(a2, max, a2 + measuredWidth, max + measuredHeight);
    }

    private void a(View view, View view2, int i) {
        e eVar = (e) view.getLayoutParams();
        Rect rect = this.j;
        Rect rect2 = this.k;
        a(view2, rect);
        a(view, i, rect, rect2);
        view.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
    }

    private void b(View view, int i, int i2) {
        e eVar = (e) view.getLayoutParams();
        int a = android.support.v4.view.e.a(c(eVar.c), i2);
        int i3 = a & 7;
        int i4 = a & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int a2 = a(i) - measuredWidth;
        a = 0;
        switch (i3) {
            case 1:
                a2 += measuredWidth / 2;
                break;
            case 5:
                a2 += measuredWidth;
                break;
        }
        switch (i4) {
            case 16:
                a = 0 + (measuredHeight / 2);
                break;
            case 80:
                a = 0 + measuredHeight;
                break;
        }
        a2 = Math.max(getPaddingLeft() + eVar.leftMargin, Math.min(a2, ((width - getPaddingRight()) - measuredWidth) - eVar.rightMargin));
        int max = Math.max(getPaddingTop() + eVar.topMargin, Math.min(a, ((height - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin));
        view.layout(a2, max, a2 + measuredWidth, max + measuredHeight);
    }

    private void c(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        Rect rect = this.j;
        rect.set(getPaddingLeft() + eVar.leftMargin, getPaddingTop() + eVar.topMargin, (getWidth() - getPaddingRight()) - eVar.rightMargin, (getHeight() - getPaddingBottom()) - eVar.bottomMargin);
        if (!(this.w == null || !ah.v(this) || ah.v(view))) {
            rect.left += this.w.a();
            rect.top += this.w.b();
            rect.right -= this.w.c();
            rect.bottom -= this.w.d();
        }
        Rect rect2 = this.k;
        android.support.v4.view.e.a(b(eVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        view.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
    }

    private static int b(int i) {
        return i == 0 ? 8388659 : i;
    }

    private static int c(int i) {
        return i == 0 ? 8388661 : i;
    }

    private static int d(int i) {
        return i == 0 ? 17 : i;
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        e eVar = (e) view.getLayoutParams();
        if (eVar.a != null && eVar.a.d(this, view) > 0.0f) {
            if (this.n == null) {
                this.n = new Paint();
            }
            this.n.setColor(eVar.a.c(this, view));
            canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.n);
        }
        return super.drawChild(canvas, view, j);
    }

    void a(boolean z) {
        int h = ah.h(this);
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            int i2;
            View view = (View) this.g.get(i);
            e eVar = (e) view.getLayoutParams();
            for (i2 = 0; i2 < i; i2++) {
                if (eVar.h == ((View) this.g.get(i2))) {
                    b(view, h);
                }
            }
            Rect rect = this.j;
            Rect rect2 = this.k;
            c(view, rect);
            a(view, true, rect2);
            if (!rect.equals(rect2)) {
                b(view, rect2);
                for (i2 = i + 1; i2 < size; i2++) {
                    View view2 = (View) this.g.get(i2);
                    e eVar2 = (e) view2.getLayoutParams();
                    b b = eVar2.b();
                    if (b != null && b.b(this, view2, view)) {
                        if (z || !eVar2.i()) {
                            boolean c = b.c(this, view2, view);
                            if (z) {
                                eVar2.b(c);
                            }
                        } else {
                            eVar2.j();
                        }
                    }
                }
            }
        }
    }

    void b(View view) {
        int size = this.g.size();
        int i = 0;
        Object obj = null;
        while (i < size) {
            Object obj2;
            View view2 = (View) this.g.get(i);
            if (view2 == view) {
                obj2 = 1;
            } else {
                if (obj != null) {
                    e eVar = (e) view2.getLayoutParams();
                    b b = eVar.b();
                    if (b != null && eVar.a(this, view2, view)) {
                        b.d(this, view2, view);
                    }
                }
                obj2 = obj;
            }
            i++;
            obj = obj2;
        }
    }

    public void c(View view) {
        int size = this.g.size();
        int i = 0;
        Object obj = null;
        while (i < size) {
            Object obj2;
            View view2 = (View) this.g.get(i);
            if (view2 == view) {
                obj2 = 1;
            } else {
                if (obj != null) {
                    e eVar = (e) view2.getLayoutParams();
                    b b = eVar.b();
                    if (b != null && eVar.a(this, view2, view)) {
                        b.c(this, view2, view);
                    }
                }
                obj2 = obj;
            }
            i++;
            obj = obj2;
        }
    }

    public List<View> d(View view) {
        e eVar = (e) view.getLayoutParams();
        List<View> list = this.i;
        list.clear();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != view && eVar.a(this, view, childAt)) {
                list.add(childAt);
            }
        }
        return list;
    }

    void a() {
        boolean z = false;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (e(getChildAt(i))) {
                z = true;
                break;
            }
        }
        if (z == this.v) {
            return;
        }
        if (z) {
            b();
        } else {
            c();
        }
    }

    boolean e(View view) {
        e eVar = (e) view.getLayoutParams();
        if (eVar.g != null) {
            return true;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != view && eVar.a(this, view, childAt)) {
                return true;
            }
        }
        return false;
    }

    void b() {
        if (this.p) {
            if (this.u == null) {
                this.u = new f(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.u);
        }
        this.v = true;
    }

    void c() {
        if (this.p && this.u != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.u);
        }
        this.v = false;
    }

    void b(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        if (eVar.g != null) {
            Rect rect = this.j;
            Rect rect2 = this.k;
            Rect rect3 = this.l;
            a(eVar.g, rect);
            a(view, false, rect2);
            a(view, i, rect, rect3);
            int i2 = rect3.left - rect2.left;
            int i3 = rect3.top - rect2.top;
            if (i2 != 0) {
                view.offsetLeftAndRight(i2);
            }
            if (i3 != 0) {
                view.offsetTopAndBottom(i3);
            }
            if (i2 != 0 || i3 != 0) {
                b b = eVar.b();
                if (b != null) {
                    b.c(this, view, eVar.g);
                }
            }
        }
    }

    public boolean a(View view, int i, int i2) {
        Rect rect = this.j;
        a(view, rect);
        return rect.contains(i, i2);
    }

    public boolean a(View view, View view2) {
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        boolean z;
        Rect rect = this.j;
        a(view, view.getParent() != this, rect);
        Rect rect2 = this.k;
        if (view2.getParent() != this) {
            z = true;
        } else {
            z = false;
        }
        a(view2, z, rect2);
        if (rect.left > rect2.right || rect.top > rect2.bottom || rect.right < rect2.left || rect.bottom < rect2.top) {
            return false;
        }
        return true;
    }

    public e a(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    protected e a(LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new e((MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    protected e d() {
        return new e(-2, -2);
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        int childCount = getChildCount();
        int i2 = 0;
        boolean z = false;
        while (i2 < childCount) {
            boolean z2;
            View childAt = getChildAt(i2);
            e eVar = (e) childAt.getLayoutParams();
            b b = eVar.b();
            if (b != null) {
                boolean a = b.a(this, childAt, view, view2, i);
                z2 = z | a;
                eVar.a(a);
            } else {
                eVar.a(false);
                z2 = z;
            }
            i2++;
            z = z2;
        }
        return z;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.A.a(view, view2, i);
        this.s = view;
        this.t = view2;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.h()) {
                b b = eVar.b();
                if (b != null) {
                    b.b(this, childAt, view, view2, i);
                }
            }
        }
    }

    public void onStopNestedScroll(View view) {
        this.A.a(view);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.h()) {
                b b = eVar.b();
                if (b != null) {
                    b.a(this, childAt, view);
                }
                eVar.g();
                eVar.j();
            }
        }
        this.s = null;
        this.t = null;
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        Object obj = null;
        int i5 = 0;
        while (i5 < childCount) {
            Object obj2;
            View childAt = getChildAt(i5);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.h()) {
                b b = eVar.b();
                if (b != null) {
                    b.a(this, childAt, view, i, i2, i3, i4);
                    obj2 = 1;
                } else {
                    obj2 = obj;
                }
            } else {
                obj2 = obj;
            }
            i5++;
            obj = obj2;
        }
        if (obj != null) {
            a(true);
        }
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        int i3 = 0;
        int i4 = 0;
        Object obj = null;
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            int max;
            int max2;
            Object obj2;
            View childAt = getChildAt(i5);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.h()) {
                b b = eVar.b();
                if (b != null) {
                    int[] iArr2 = this.m;
                    this.m[1] = 0;
                    iArr2[0] = 0;
                    b.a(this, childAt, view, i, i2, this.m);
                    max = i > 0 ? Math.max(i3, this.m[0]) : Math.min(i3, this.m[0]);
                    max2 = i2 > 0 ? Math.max(i4, this.m[1]) : Math.min(i4, this.m[1]);
                    int i6 = 1;
                } else {
                    obj2 = obj;
                    max = i3;
                    max2 = i4;
                }
            } else {
                obj2 = obj;
                max = i3;
                max2 = i4;
            }
            i5++;
            i4 = max2;
            i3 = max;
            obj = obj2;
        }
        iArr[0] = i3;
        iArr[1] = i4;
        if (obj != null) {
            a(true);
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        int i = 0;
        boolean z2 = false;
        while (i < childCount) {
            boolean a;
            View childAt = getChildAt(i);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.h()) {
                b b = eVar.b();
                if (b != null) {
                    a = b.a(this, childAt, view, f, f2, z) | z2;
                } else {
                    a = z2;
                }
            } else {
                a = z2;
            }
            i++;
            z2 = a;
        }
        if (z2) {
            a(true);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        int childCount = getChildCount();
        int i = 0;
        boolean z = false;
        while (i < childCount) {
            boolean a;
            View childAt = getChildAt(i);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.h()) {
                b b = eVar.b();
                if (b != null) {
                    a = b.a(this, childAt, view, f, f2) | z;
                } else {
                    a = z;
                }
            } else {
                a = z;
            }
            i++;
            z = a;
        }
        return z;
    }

    public int getNestedScrollAxes() {
        return this.A.a();
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            SparseArray sparseArray = savedState.a;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                int id = childAt.getId();
                b b = a(childAt).b();
                if (!(id == -1 || b == null)) {
                    Parcelable parcelable2 = (Parcelable) sparseArray.get(id);
                    if (parcelable2 != null) {
                        b.a(this, childAt, parcelable2);
                    }
                }
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            b b = ((e) childAt.getLayoutParams()).b();
            if (!(id == -1 || b == null)) {
                Parcelable b2 = b.b(this, childAt);
                if (b2 != null) {
                    sparseArray.append(id, b2);
                }
            }
        }
        savedState.a = sparseArray;
        return savedState;
    }

    private static void a(List<View> list, Comparator<View> comparator) {
        if (list != null && list.size() >= 2) {
            int i;
            View[] viewArr = new View[list.size()];
            list.toArray(viewArr);
            for (int i2 = 0; i2 < r5; i2++) {
                i = i2;
                for (int i3 = i2 + 1; i3 < r5; i3++) {
                    if (comparator.compare(viewArr[i3], viewArr[i]) < 0) {
                        i = i3;
                    }
                }
                if (i2 != i) {
                    View view = viewArr[i];
                    viewArr[i] = viewArr[i2];
                    viewArr[i2] = view;
                }
            }
            list.clear();
            for (Object add : viewArr) {
                list.add(add);
            }
        }
    }
}
