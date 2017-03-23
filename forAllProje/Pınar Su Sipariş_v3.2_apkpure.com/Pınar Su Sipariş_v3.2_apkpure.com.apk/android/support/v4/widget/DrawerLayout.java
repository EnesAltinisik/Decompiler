package android.support.v4.widget;

import android.content.Context;
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
import android.support.v4.view.ah;
import android.support.v4.view.av;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.internal.zzamj;
import com.google.android.gms.nearby.messages.Strategy;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout extends ViewGroup implements i {
    static final c a;
    private static final int[] b = new int[]{16842931};
    private static final boolean c = (VERSION.SDK_INT >= 19);
    private static final boolean d;
    private float A;
    private Drawable B;
    private Drawable C;
    private Drawable D;
    private CharSequence E;
    private CharSequence F;
    private Object G;
    private boolean H;
    private Drawable I;
    private Drawable J;
    private Drawable K;
    private Drawable L;
    private final ArrayList<View> M;
    private final b e;
    private float f;
    private int g;
    private int h;
    private float i;
    private Paint j;
    private final ad k;
    private final ad l;
    private final h m;
    private final h n;
    private int o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    @Deprecated
    private f x;
    private List<f> y;
    private float z;

    public interface f {
        void onDrawerClosed(View view);

        void onDrawerOpened(View view);

        void onDrawerSlide(View view, float f);

        void onDrawerStateChanged(int i);
    }

    protected static class SavedState extends BaseSavedState {
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
        int a = 0;
        int b;
        int c;
        int d;
        int e;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            this.e = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
        }
    }

    class a extends android.support.v4.view.a {
        final /* synthetic */ DrawerLayout b;
        private final Rect c = new Rect();

        a(DrawerLayout drawerLayout) {
            this.b = drawerLayout;
        }

        public void a(View view, android.support.v4.view.a.c cVar) {
            if (DrawerLayout.c) {
                super.a(view, cVar);
            } else {
                android.support.v4.view.a.c a = android.support.v4.view.a.c.a(cVar);
                super.a(view, a);
                cVar.a(view);
                ViewParent i = ah.i(view);
                if (i instanceof View) {
                    cVar.c((View) i);
                }
                a(cVar, a);
                a.s();
                a(cVar, (ViewGroup) view);
            }
            cVar.b(DrawerLayout.class.getName());
            cVar.a(false);
            cVar.b(false);
            cVar.a(android.support.v4.view.a.c.a.a);
            cVar.a(android.support.v4.view.a.c.a.b);
        }

        public void d(View view, AccessibilityEvent accessibilityEvent) {
            super.d(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        public boolean b(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.b(view, accessibilityEvent);
            }
            List text = accessibilityEvent.getText();
            View a = this.b.k();
            if (a != null) {
                CharSequence b = this.b.b(this.b.e(a));
                if (b != null) {
                    text.add(b);
                }
            }
            return true;
        }

        public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.c || DrawerLayout.n(view)) {
                return super.a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        private void a(android.support.v4.view.a.c cVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.n(childAt)) {
                    cVar.b(childAt);
                }
            }
        }

        private void a(android.support.v4.view.a.c cVar, android.support.v4.view.a.c cVar2) {
            Rect rect = this.c;
            cVar2.a(rect);
            cVar.b(rect);
            cVar2.c(rect);
            cVar.d(rect);
            cVar.c(cVar2.g());
            cVar.a(cVar2.o());
            cVar.b(cVar2.p());
            cVar.c(cVar2.r());
            cVar.h(cVar2.l());
            cVar.f(cVar2.j());
            cVar.a(cVar2.e());
            cVar.b(cVar2.f());
            cVar.d(cVar2.h());
            cVar.e(cVar2.i());
            cVar.g(cVar2.k());
            cVar.a(cVar2.b());
        }
    }

    final class b extends android.support.v4.view.a {
        final /* synthetic */ DrawerLayout b;

        b(DrawerLayout drawerLayout) {
            this.b = drawerLayout;
        }

        public void a(View view, android.support.v4.view.a.c cVar) {
            super.a(view, cVar);
            if (!DrawerLayout.n(view)) {
                cVar.c(null);
            }
        }
    }

    interface c {
        int a(Object obj);

        Drawable a(Context context);

        void a(View view);

        void a(View view, Object obj, int i);

        void a(MarginLayoutParams marginLayoutParams, Object obj, int i);
    }

    static class d implements c {
        d() {
        }

        public void a(View view) {
            h.a(view);
        }

        public void a(View view, Object obj, int i) {
            h.a(view, obj, i);
        }

        public void a(MarginLayoutParams marginLayoutParams, Object obj, int i) {
            h.a(marginLayoutParams, obj, i);
        }

        public int a(Object obj) {
            return h.a(obj);
        }

        public Drawable a(Context context) {
            return h.a(context);
        }
    }

    static class e implements c {
        e() {
        }

        public void a(View view) {
        }

        public void a(View view, Object obj, int i) {
        }

        public void a(MarginLayoutParams marginLayoutParams, Object obj, int i) {
        }

        public int a(Object obj) {
            return 0;
        }

        public Drawable a(Context context) {
            return null;
        }
    }

    public static class g extends MarginLayoutParams {
        public int a = 0;
        private float b;
        private boolean c;
        private int d;

        static /* synthetic */ int b(g gVar, int i) {
            int i2 = gVar.d | i;
            gVar.d = i2;
            return i2;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.b);
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public g(int i, int i2) {
            super(i, i2);
        }

        public g(g gVar) {
            super(gVar);
            this.a = gVar.a;
        }

        public g(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public g(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    private class h extends android.support.v4.widget.ad.a {
        final /* synthetic */ DrawerLayout a;
        private final int b;
        private ad c;
        private final Runnable d = new Runnable(this) {
            final /* synthetic */ h a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.c();
            }
        };

        public h(DrawerLayout drawerLayout, int i) {
            this.a = drawerLayout;
            this.b = i;
        }

        public void a(ad adVar) {
            this.c = adVar;
        }

        public void a() {
            this.a.removeCallbacks(this.d);
        }

        public boolean a(View view, int i) {
            return this.a.g(view) && this.a.a(view, this.b) && this.a.a(view) == 0;
        }

        public void a(int i) {
            this.a.a(this.b, i, this.c.c());
        }

        public void a(View view, int i, int i2, int i3, int i4) {
            float f;
            int width = view.getWidth();
            if (this.a.a(view, 3)) {
                f = ((float) (width + i)) / ((float) width);
            } else {
                f = ((float) (this.a.getWidth() - i)) / ((float) width);
            }
            this.a.b(view, f);
            view.setVisibility(f == 0.0f ? 4 : 0);
            this.a.invalidate();
        }

        public void b(View view, int i) {
            ((g) view.getLayoutParams()).c = false;
            b();
        }

        private void b() {
            int i = 3;
            if (this.b == 3) {
                i = 5;
            }
            View c = this.a.c(i);
            if (c != null) {
                this.a.i(c);
            }
        }

        public void a(View view, float f, float f2) {
            int i;
            float d = this.a.d(view);
            int width = view.getWidth();
            if (this.a.a(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && d > 0.5f)) ? 0 : -width;
            } else {
                i = this.a.getWidth();
                if (f < 0.0f || (f == 0.0f && d > 0.5f)) {
                    i -= width;
                }
            }
            this.c.a(i, view.getTop());
            this.a.invalidate();
        }

        public void a(int i, int i2) {
            this.a.postDelayed(this.d, 160);
        }

        private void c() {
            View view;
            int i;
            int i2 = 0;
            int b = this.c.b();
            boolean z = this.b == 3;
            if (z) {
                View c = this.a.c(3);
                if (c != null) {
                    i2 = -c.getWidth();
                }
                i2 += b;
                view = c;
                i = i2;
            } else {
                i2 = this.a.getWidth() - b;
                view = this.a.c(5);
                i = i2;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && this.a.a(view) == 0) {
                g gVar = (g) view.getLayoutParams();
                this.c.a(view, i, view.getTop());
                gVar.c = true;
                this.a.invalidate();
                b();
                this.a.c();
            }
        }

        public boolean b(int i) {
            return false;
        }

        public void b(int i, int i2) {
            View c;
            if ((i & 1) == 1) {
                c = this.a.c(3);
            } else {
                c = this.a.c(5);
            }
            if (c != null && this.a.a(c) == 0) {
                this.c.a(c, i2);
            }
        }

        public int b(View view) {
            return this.a.g(view) ? view.getWidth() : 0;
        }

        public int b(View view, int i, int i2) {
            if (this.a.a(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = this.a.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        public int a(View view, int i, int i2) {
            return view.getTop();
        }
    }

    static {
        boolean z = true;
        if (VERSION.SDK_INT < 21) {
            z = false;
        }
        d = z;
        if (VERSION.SDK_INT >= 21) {
            a = new d();
        } else {
            a = new e();
        }
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new b(this);
        this.h = -1728053248;
        this.j = new Paint();
        this.q = true;
        this.r = 3;
        this.s = 3;
        this.t = 3;
        this.u = 3;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.g = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.m = new h(this, 3);
        this.n = new h(this, 5);
        this.k = ad.a((ViewGroup) this, (float) TextTrackStyle.DEFAULT_FONT_SCALE, this.m);
        this.k.a(1);
        this.k.a(f2);
        this.m.a(this.k);
        this.l = ad.a((ViewGroup) this, (float) TextTrackStyle.DEFAULT_FONT_SCALE, this.n);
        this.l.a(2);
        this.l.a(f2);
        this.n.a(this.l);
        setFocusableInTouchMode(true);
        ah.c((View) this, 1);
        ah.a((View) this, new a(this));
        av.a(this, false);
        if (ah.v(this)) {
            a.a((View) this);
            this.B = a.a(context);
        }
        this.f = f * 10.0f;
        this.M = new ArrayList();
    }

    public void setDrawerElevation(float f) {
        this.f = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (g(childAt)) {
                ah.d(childAt, this.f);
            }
        }
    }

    public float getDrawerElevation() {
        if (d) {
            return this.f;
        }
        return 0.0f;
    }

    public void a(Object obj, boolean z) {
        this.G = obj;
        this.H = z;
        boolean z2 = !z && getBackground() == null;
        setWillNotDraw(z2);
        requestLayout();
    }

    public void setScrimColor(int i) {
        this.h = i;
        invalidate();
    }

    @Deprecated
    public void setDrawerListener(f fVar) {
        if (this.x != null) {
            b(this.x);
        }
        if (fVar != null) {
            a(fVar);
        }
        this.x = fVar;
    }

    public void a(f fVar) {
        if (fVar != null) {
            if (this.y == null) {
                this.y = new ArrayList();
            }
            this.y.add(fVar);
        }
    }

    public void b(f fVar) {
        if (fVar != null && this.y != null) {
            this.y.remove(fVar);
        }
    }

    public void setDrawerLockMode(int i) {
        a(i, 3);
        a(i, 5);
    }

    public void a(int i, int i2) {
        int a = android.support.v4.view.e.a(i2, ah.h(this));
        switch (i2) {
            case 3:
                this.r = i;
                break;
            case 5:
                this.s = i;
                break;
            case 8388611:
                this.t = i;
                break;
            case 8388613:
                this.u = i;
                break;
        }
        if (i != 0) {
            (a == 3 ? this.k : this.l).e();
        }
        View c;
        switch (i) {
            case 1:
                c = c(a);
                if (c != null) {
                    i(c);
                    return;
                }
                return;
            case 2:
                c = c(a);
                if (c != null) {
                    h(c);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public int a(int i) {
        int h = ah.h(this);
        switch (i) {
            case 3:
                if (this.r != 3) {
                    return this.r;
                }
                h = h == 0 ? this.t : this.u;
                if (h != 3) {
                    return h;
                }
                break;
            case 5:
                if (this.s != 3) {
                    return this.s;
                }
                h = h == 0 ? this.u : this.t;
                if (h != 3) {
                    return h;
                }
                break;
            case 8388611:
                if (this.t != 3) {
                    return this.t;
                }
                h = h == 0 ? this.r : this.s;
                if (h != 3) {
                    return h;
                }
                break;
            case 8388613:
                if (this.u != 3) {
                    return this.u;
                }
                h = h == 0 ? this.s : this.r;
                if (h != 3) {
                    return h;
                }
                break;
        }
        return 0;
    }

    public int a(View view) {
        if (g(view)) {
            return a(((g) view.getLayoutParams()).a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public CharSequence b(int i) {
        int a = android.support.v4.view.e.a(i, ah.h(this));
        if (a == 3) {
            return this.E;
        }
        if (a == 5) {
            return this.F;
        }
        return null;
    }

    void a(int i, int i2, View view) {
        int a = this.k.a();
        int a2 = this.l.a();
        if (a == 1 || a2 == 1) {
            a = 1;
        } else if (a == 2 || a2 == 2) {
            a = 2;
        } else {
            a = 0;
        }
        if (view != null && i2 == 0) {
            g gVar = (g) view.getLayoutParams();
            if (gVar.b == 0.0f) {
                b(view);
            } else if (gVar.b == TextTrackStyle.DEFAULT_FONT_SCALE) {
                c(view);
            }
        }
        if (a != this.o) {
            this.o = a;
            if (this.y != null) {
                for (int size = this.y.size() - 1; size >= 0; size--) {
                    ((f) this.y.get(size)).onDrawerStateChanged(a);
                }
            }
        }
    }

    void b(View view) {
        g gVar = (g) view.getLayoutParams();
        if ((gVar.d & 1) == 1) {
            gVar.d = 0;
            if (this.y != null) {
                for (int size = this.y.size() - 1; size >= 0; size--) {
                    ((f) this.y.get(size)).onDrawerClosed(view);
                }
            }
            a(view, false);
            if (hasWindowFocus()) {
                View rootView = getRootView();
                if (rootView != null) {
                    rootView.sendAccessibilityEvent(32);
                }
            }
        }
    }

    void c(View view) {
        g gVar = (g) view.getLayoutParams();
        if ((gVar.d & 1) == 0) {
            gVar.d = 1;
            if (this.y != null) {
                for (int size = this.y.size() - 1; size >= 0; size--) {
                    ((f) this.y.get(size)).onDrawerOpened(view);
                }
            }
            a(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
            view.requestFocus();
        }
    }

    private void a(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || g(childAt)) && !(z && childAt == view)) {
                ah.c(childAt, 4);
            } else {
                ah.c(childAt, 1);
            }
        }
    }

    void a(View view, float f) {
        if (this.y != null) {
            for (int size = this.y.size() - 1; size >= 0; size--) {
                ((f) this.y.get(size)).onDrawerSlide(view, f);
            }
        }
    }

    void b(View view, float f) {
        g gVar = (g) view.getLayoutParams();
        if (f != gVar.b) {
            gVar.b = f;
            a(view, f);
        }
    }

    float d(View view) {
        return ((g) view.getLayoutParams()).b;
    }

    int e(View view) {
        return android.support.v4.view.e.a(((g) view.getLayoutParams()).a, ah.h(this));
    }

    boolean a(View view, int i) {
        return (e(view) & i) == i;
    }

    View a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((g) childAt.getLayoutParams()).d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    View c(int i) {
        int a = android.support.v4.view.e.a(i, ah.h(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((e(childAt) & 7) == a) {
                return childAt;
            }
        }
        return null;
    }

    static String d(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        if ((i & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.q = true;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q = true;
    }

    protected void onMeasure(int i, int i2) {
        Object obj;
        int h;
        Object obj2;
        Object obj3;
        int childCount;
        int i3;
        View childAt;
        MarginLayoutParams marginLayoutParams;
        int a;
        int e;
        Object obj4;
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != zzamj.UNSET_ENUM_VALUE && mode == 0) {
                    size = Strategy.TTL_SECONDS_DEFAULT;
                }
                if (mode2 == zzamj.UNSET_ENUM_VALUE) {
                    mode = size;
                    size = size2;
                } else if (mode2 == 0) {
                    mode = size;
                    size = Strategy.TTL_SECONDS_DEFAULT;
                }
                setMeasuredDimension(mode, size);
                if (this.G == null && ah.v(this)) {
                    obj = 1;
                } else {
                    obj = null;
                }
                h = ah.h(this);
                obj2 = null;
                obj3 = null;
                childCount = getChildCount();
                for (i3 = 0; i3 < childCount; i3++) {
                    childAt = getChildAt(i3);
                    if (childAt.getVisibility() == 8) {
                        marginLayoutParams = (g) childAt.getLayoutParams();
                        if (obj != null) {
                            a = android.support.v4.view.e.a(marginLayoutParams.a, h);
                            if (ah.v(childAt)) {
                                a.a(marginLayoutParams, this.G, a);
                            } else {
                                a.a(childAt, this.G, a);
                            }
                        }
                        if (f(childAt)) {
                            childAt.measure(MeasureSpec.makeMeasureSpec((mode - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, 1073741824), MeasureSpec.makeMeasureSpec((size - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin, 1073741824));
                        } else if (g(childAt)) {
                            throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, " + "Gravity.RIGHT or Gravity.NO_GRAVITY");
                        } else {
                            if (d && ah.s(childAt) != this.f) {
                                ah.d(childAt, this.f);
                            }
                            e = e(childAt) & 7;
                            obj4 = e != 3 ? 1 : null;
                            if ((obj4 != null || r5 == null) && (obj4 != null || r4 == null)) {
                                if (obj4 == null) {
                                    obj2 = 1;
                                } else {
                                    obj3 = 1;
                                }
                                childAt.measure(getChildMeasureSpec(i, (this.g + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin, marginLayoutParams.width), getChildMeasureSpec(i2, marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
                            } else {
                                throw new IllegalStateException("Child drawer has absolute gravity " + d(e) + " but this " + "DrawerLayout" + " already has a " + "drawer view along that edge");
                            }
                        }
                    }
                }
            }
            throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        }
        mode = size;
        size = size2;
        setMeasuredDimension(mode, size);
        if (this.G == null) {
        }
        obj = null;
        h = ah.h(this);
        obj2 = null;
        obj3 = null;
        childCount = getChildCount();
        for (i3 = 0; i3 < childCount; i3++) {
            childAt = getChildAt(i3);
            if (childAt.getVisibility() == 8) {
                marginLayoutParams = (g) childAt.getLayoutParams();
                if (obj != null) {
                    a = android.support.v4.view.e.a(marginLayoutParams.a, h);
                    if (ah.v(childAt)) {
                        a.a(marginLayoutParams, this.G, a);
                    } else {
                        a.a(childAt, this.G, a);
                    }
                }
                if (f(childAt)) {
                    childAt.measure(MeasureSpec.makeMeasureSpec((mode - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, 1073741824), MeasureSpec.makeMeasureSpec((size - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin, 1073741824));
                } else if (g(childAt)) {
                    throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, " + "Gravity.RIGHT or Gravity.NO_GRAVITY");
                } else {
                    ah.d(childAt, this.f);
                    e = e(childAt) & 7;
                    if (e != 3) {
                    }
                    if (obj4 != null) {
                    }
                    if (obj4 == null) {
                        obj3 = 1;
                    } else {
                        obj2 = 1;
                    }
                    childAt.measure(getChildMeasureSpec(i, (this.g + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin, marginLayoutParams.width), getChildMeasureSpec(i2, marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
                }
            }
        }
    }

    private void f() {
        if (!d) {
            this.C = g();
            this.D = h();
        }
    }

    private Drawable g() {
        int h = ah.h(this);
        if (h == 0) {
            if (this.I != null) {
                a(this.I, h);
                return this.I;
            }
        } else if (this.J != null) {
            a(this.J, h);
            return this.J;
        }
        return this.K;
    }

    private Drawable h() {
        int h = ah.h(this);
        if (h == 0) {
            if (this.J != null) {
                a(this.J, h);
                return this.J;
            }
        } else if (this.I != null) {
            a(this.I, h);
            return this.I;
        }
        return this.L;
    }

    private boolean a(Drawable drawable, int i) {
        if (drawable == null || !android.support.v4.c.a.a.b(drawable)) {
            return false;
        }
        android.support.v4.c.a.a.b(drawable, i);
        return true;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.p = true;
        int i5 = i3 - i;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (f(childAt)) {
                    childAt.layout(gVar.leftMargin, gVar.topMargin, gVar.leftMargin + childAt.getMeasuredWidth(), gVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int a;
                    float f;
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        a = ((int) (((float) measuredWidth) * gVar.b)) + (-measuredWidth);
                        f = ((float) (measuredWidth + a)) / ((float) measuredWidth);
                    } else {
                        a = i5 - ((int) (((float) measuredWidth) * gVar.b));
                        f = ((float) (i5 - a)) / ((float) measuredWidth);
                    }
                    Object obj = f != gVar.b ? 1 : null;
                    int i7;
                    switch (gVar.a & 112) {
                        case 16:
                            int i8 = i4 - i2;
                            i7 = (i8 - measuredHeight) / 2;
                            if (i7 < gVar.topMargin) {
                                i7 = gVar.topMargin;
                            } else if (i7 + measuredHeight > i8 - gVar.bottomMargin) {
                                i7 = (i8 - gVar.bottomMargin) - measuredHeight;
                            }
                            childAt.layout(a, i7, measuredWidth + a, measuredHeight + i7);
                            break;
                        case 80:
                            i7 = i4 - i2;
                            childAt.layout(a, (i7 - gVar.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + a, i7 - gVar.bottomMargin);
                            break;
                        default:
                            childAt.layout(a, gVar.topMargin, measuredWidth + a, measuredHeight + gVar.topMargin);
                            break;
                    }
                    if (obj != null) {
                        b(childAt, f);
                    }
                    int i9 = gVar.b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i9) {
                        childAt.setVisibility(i9);
                    }
                }
            }
        }
        this.p = false;
        this.q = false;
    }

    public void requestLayout() {
        if (!this.p) {
            super.requestLayout();
        }
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((g) getChildAt(i).getLayoutParams()).b);
        }
        this.i = f;
        if ((this.k.a(true) | this.l.a(true)) != 0) {
            ah.d(this);
        }
    }

    private static boolean m(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.B = drawable;
        invalidate();
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.B;
    }

    public void setStatusBarBackground(int i) {
        this.B = i != 0 ? android.support.v4.b.b.getDrawable(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.B = new ColorDrawable(i);
        invalidate();
    }

    public void onRtlPropertiesChanged(int i) {
        f();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.H && this.B != null) {
            int a = a.a(this.G);
            if (a > 0) {
                this.B.setBounds(0, 0, getWidth(), a);
                this.B.draw(canvas);
            }
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        int height = getHeight();
        boolean f = f(view);
        int i2 = 0;
        int width = getWidth();
        int save = canvas.save();
        if (f) {
            int childCount = getChildCount();
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && m(childAt) && g(childAt)) {
                    if (childAt.getHeight() < height) {
                        i = width;
                    } else if (a(childAt, 3)) {
                        i = childAt.getRight();
                        if (i <= i2) {
                            i = i2;
                        }
                        i2 = i;
                        i = width;
                    } else {
                        i = childAt.getLeft();
                        if (i < width) {
                        }
                    }
                    i3++;
                    width = i;
                }
                i = width;
                i3++;
                width = i;
            }
            canvas.clipRect(i2, 0, width, getHeight());
        }
        i = width;
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        if (this.i > 0.0f && f) {
            this.j.setColor((((int) (((float) ((this.h & -16777216) >>> 24)) * this.i)) << 24) | (this.h & 16777215));
            canvas.drawRect((float) i2, 0.0f, (float) i, (float) getHeight(), this.j);
        } else if (this.C != null && a(view, 3)) {
            i = this.C.getIntrinsicWidth();
            i2 = view.getRight();
            r2 = Math.max(0.0f, Math.min(((float) i2) / ((float) this.k.b()), TextTrackStyle.DEFAULT_FONT_SCALE));
            this.C.setBounds(i2, view.getTop(), i + i2, view.getBottom());
            this.C.setAlpha((int) (255.0f * r2));
            this.C.draw(canvas);
        } else if (this.D != null && a(view, 5)) {
            i = this.D.getIntrinsicWidth();
            i2 = view.getLeft();
            r2 = Math.max(0.0f, Math.min(((float) (getWidth() - i2)) / ((float) this.l.b()), TextTrackStyle.DEFAULT_FONT_SCALE));
            this.D.setBounds(i2 - i, view.getTop(), i2, view.getBottom());
            this.D.setAlpha((int) (255.0f * r2));
            this.D.draw(canvas);
        }
        return drawChild;
    }

    boolean f(View view) {
        return ((g) view.getLayoutParams()).a == 0;
    }

    boolean g(View view) {
        int a = android.support.v4.view.e.a(((g) view.getLayoutParams()).a, ah.h(view));
        if ((a & 3) != 0) {
            return true;
        }
        if ((a & 5) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
        r7 = this;
        r1 = 1;
        r2 = 0;
        r0 = android.support.v4.view.t.a(r8);
        r3 = r7.k;
        r3 = r3.a(r8);
        r4 = r7.l;
        r4 = r4.a(r8);
        r3 = r3 | r4;
        switch(r0) {
            case 0: goto L_0x0027;
            case 1: goto L_0x0065;
            case 2: goto L_0x0050;
            case 3: goto L_0x0065;
            default: goto L_0x0016;
        };
    L_0x0016:
        r0 = r2;
    L_0x0017:
        if (r3 != 0) goto L_0x0025;
    L_0x0019:
        if (r0 != 0) goto L_0x0025;
    L_0x001b:
        r0 = r7.i();
        if (r0 != 0) goto L_0x0025;
    L_0x0021:
        r0 = r7.w;
        if (r0 == 0) goto L_0x0026;
    L_0x0025:
        r2 = r1;
    L_0x0026:
        return r2;
    L_0x0027:
        r0 = r8.getX();
        r4 = r8.getY();
        r7.z = r0;
        r7.A = r4;
        r5 = r7.i;
        r6 = 0;
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r5 <= 0) goto L_0x006d;
    L_0x003a:
        r5 = r7.k;
        r0 = (int) r0;
        r4 = (int) r4;
        r0 = r5.d(r0, r4);
        if (r0 == 0) goto L_0x006d;
    L_0x0044:
        r0 = r7.f(r0);
        if (r0 == 0) goto L_0x006d;
    L_0x004a:
        r0 = r1;
    L_0x004b:
        r7.v = r2;
        r7.w = r2;
        goto L_0x0017;
    L_0x0050:
        r0 = r7.k;
        r4 = 3;
        r0 = r0.d(r4);
        if (r0 == 0) goto L_0x0016;
    L_0x0059:
        r0 = r7.m;
        r0.a();
        r0 = r7.n;
        r0.a();
        r0 = r2;
        goto L_0x0017;
    L_0x0065:
        r7.a(r1);
        r7.v = r2;
        r7.w = r2;
        goto L_0x0016;
    L_0x006d:
        r0 = r2;
        goto L_0x004b;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.k.b(motionEvent);
        this.l.b(motionEvent);
        float x;
        float y;
        switch (motionEvent.getAction() & 255) {
            case 0:
                x = motionEvent.getX();
                y = motionEvent.getY();
                this.z = x;
                this.A = y;
                this.v = false;
                this.w = false;
                break;
            case 1:
                boolean z;
                x = motionEvent.getX();
                y = motionEvent.getY();
                View d = this.k.d((int) x, (int) y);
                if (d != null && f(d)) {
                    x -= this.z;
                    y -= this.A;
                    int d2 = this.k.d();
                    if ((x * x) + (y * y) < ((float) (d2 * d2))) {
                        View a = a();
                        if (a != null) {
                            z = a(a) == 2;
                            a(z);
                            this.v = false;
                            break;
                        }
                    }
                }
                z = true;
                a(z);
                this.v = false;
            case 3:
                a(true);
                this.v = false;
                this.w = false;
                break;
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.v = z;
        if (z) {
            a(true);
        }
    }

    public void b() {
        a(false);
    }

    void a(boolean z) {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            g gVar = (g) childAt.getLayoutParams();
            if (g(childAt) && (!z || gVar.c)) {
                int width = childAt.getWidth();
                if (a(childAt, 3)) {
                    i |= this.k.a(childAt, -width, childAt.getTop());
                } else {
                    i |= this.l.a(childAt, getWidth(), childAt.getTop());
                }
                gVar.c = false;
            }
        }
        this.m.a();
        this.n.a();
        if (i != 0) {
            invalidate();
        }
    }

    public void h(View view) {
        if (g(view)) {
            g gVar = (g) view.getLayoutParams();
            if (this.q) {
                gVar.b = TextTrackStyle.DEFAULT_FONT_SCALE;
                gVar.d = 1;
                a(view, true);
            } else {
                g.b(gVar, 2);
                if (a(view, 3)) {
                    this.k.a(view, 0, view.getTop());
                } else {
                    this.l.a(view, getWidth() - view.getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void e(int i) {
        View c = c(i);
        if (c == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + d(i));
        }
        h(c);
    }

    public void i(View view) {
        if (g(view)) {
            g gVar = (g) view.getLayoutParams();
            if (this.q) {
                gVar.b = 0.0f;
                gVar.d = 0;
            } else {
                g.b(gVar, 4);
                if (a(view, 3)) {
                    this.k.a(view, -view.getWidth(), view.getTop());
                } else {
                    this.l.a(view, getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void f(int i) {
        View c = c(i);
        if (c == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + d(i));
        }
        i(c);
    }

    public boolean j(View view) {
        if (g(view)) {
            return (((g) view.getLayoutParams()).d & 1) == 1;
        } else {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
    }

    public boolean g(int i) {
        View c = c(i);
        if (c != null) {
            return j(c);
        }
        return false;
    }

    public boolean k(View view) {
        if (g(view)) {
            return ((g) view.getLayoutParams()).b > 0.0f;
        } else {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
    }

    public boolean h(int i) {
        View c = c(i);
        if (c != null) {
            return k(c);
        }
        return false;
    }

    private boolean i() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((g) getChildAt(i).getLayoutParams()).c) {
                return true;
            }
        }
        return false;
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new g(-1, -1);
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        return layoutParams instanceof MarginLayoutParams ? new g((MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int i3 = 0;
        if (getDescendantFocusability() != 393216) {
            int i4;
            int childCount = getChildCount();
            int i5 = 0;
            for (i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (!g(childAt)) {
                    this.M.add(childAt);
                } else if (j(childAt)) {
                    i5 = 1;
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (i5 == 0) {
                i4 = this.M.size();
                while (i3 < i4) {
                    View view = (View) this.M.get(i3);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                    i3++;
                }
            }
            this.M.clear();
        }
    }

    private boolean j() {
        return k() != null;
    }

    private View k() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (g(childAt) && k(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    void c() {
        int i = 0;
        if (!this.w) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            while (i < childCount) {
                getChildAt(i).dispatchTouchEvent(obtain);
                i++;
            }
            obtain.recycle();
            this.w = true;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !j()) {
            return super.onKeyDown(i, keyEvent);
        }
        android.support.v4.view.g.b(keyEvent);
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View k = k();
        if (k != null && a(k) == 0) {
            b();
        }
        return k != null;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            if (savedState.a != 0) {
                View c = c(savedState.a);
                if (c != null) {
                    h(c);
                }
            }
            if (savedState.b != 3) {
                a(savedState.b, 3);
            }
            if (savedState.c != 3) {
                a(savedState.c, 5);
            }
            if (savedState.d != 3) {
                a(savedState.d, 8388611);
            }
            if (savedState.e != 3) {
                a(savedState.e, 8388613);
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            g gVar = (g) getChildAt(i).getLayoutParams();
            Object obj = gVar.d == 1 ? 1 : null;
            Object obj2;
            if (gVar.d == 2) {
                obj2 = 1;
            } else {
                obj2 = null;
            }
            if (obj != null || r4 != null) {
                savedState.a = gVar.a;
                break;
            }
        }
        savedState.b = this.r;
        savedState.c = this.s;
        savedState.d = this.t;
        savedState.e = this.u;
        return savedState;
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (a() != null || g(view)) {
            ah.c(view, 4);
        } else {
            ah.c(view, 1);
        }
        if (!c) {
            ah.a(view, this.e);
        }
    }

    private static boolean n(View view) {
        return (ah.e(view) == 4 || ah.e(view) == 2) ? false : true;
    }
}
