package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.view.a.n;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    static final int[] a = new int[]{16842931};
    private static final k ak = new k();
    private static final Comparator<b> e = new Comparator<b>() {
        public int a(b bVar, b bVar2) {
            return bVar.b - bVar2.b;
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((b) obj, (b) obj2);
        }
    };
    private static final Interpolator f = new Interpolator() {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * (((f2 * f2) * f2) * f2)) + 1.0f;
        }
    };
    private int A = 1;
    private boolean B;
    private boolean C;
    private int D;
    private int E;
    private int F;
    private float G;
    private float H;
    private float I;
    private float J;
    private int K = -1;
    private VelocityTracker L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private long R;
    private android.support.v4.widget.j S;
    private android.support.v4.widget.j T;
    private boolean U = true;
    private boolean V = false;
    private boolean W;
    private int aa;
    private List<f> ab;
    private f ac;
    private f ad;
    private List<e> ae;
    private g af;
    private int ag;
    private Method ah;
    private int ai;
    private ArrayList<View> aj;
    private final Runnable al = new Runnable(this) {
        final /* synthetic */ ViewPager a;

        {
            this.a = r1;
        }

        public void run() {
            this.a.setScrollState(0);
            this.a.c();
        }
    };
    private int am = 0;
    aa b;
    int c;
    private int d;
    private final ArrayList<b> g = new ArrayList();
    private final b h = new b();
    private final Rect i = new Rect();
    private int j = -1;
    private Parcelable k = null;
    private ClassLoader l = null;
    private Scroller m;
    private boolean n;
    private h o;
    private int p;
    private Drawable q;
    private int r;
    private int s;
    private float t = -3.4028235E38f;
    private float u = Float.MAX_VALUE;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private boolean z;

    public interface e {
        void a(ViewPager viewPager, aa aaVar, aa aaVar2);
    }

    public interface f {
        void a(int i);

        void a(int i, float f, int i2);

        void b(int i);
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
    }

    static class b {
        Object a;
        int b;
        boolean c;
        float d;
        float e;

        b() {
        }
    }

    public static class c extends LayoutParams {
        public boolean a;
        public int b;
        float c = 0.0f;
        boolean d;
        int e;
        int f;

        public c() {
            super(-1, -1);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.a);
            this.b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    class d extends b {
        final /* synthetic */ ViewPager a;

        d(ViewPager viewPager) {
            this.a = viewPager;
        }

        private boolean b() {
            return this.a.b != null && this.a.b.b() > 1;
        }

        public void a(View view, android.support.v4.view.a.c cVar) {
            super.a(view, cVar);
            cVar.b(ViewPager.class.getName());
            cVar.k(b());
            if (this.a.canScrollHorizontally(1)) {
                cVar.a(4096);
            }
            if (this.a.canScrollHorizontally(-1)) {
                cVar.a(8192);
            }
        }

        public void a(View view, AccessibilityEvent accessibilityEvent) {
            super.a(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            n a = android.support.v4.view.a.a.a(accessibilityEvent);
            a.a(b());
            if (accessibilityEvent.getEventType() == 4096 && this.a.b != null) {
                a.a(this.a.b.b());
                a.b(this.a.c);
                a.c(this.a.c);
            }
        }

        public boolean a(View view, int i, Bundle bundle) {
            if (super.a(view, i, bundle)) {
                return true;
            }
            switch (i) {
                case 4096:
                    if (!this.a.canScrollHorizontally(1)) {
                        return false;
                    }
                    this.a.setCurrentItem(this.a.c + 1);
                    return true;
                case 8192:
                    if (!this.a.canScrollHorizontally(-1)) {
                        return false;
                    }
                    this.a.setCurrentItem(this.a.c - 1);
                    return true;
                default:
                    return false;
            }
        }
    }

    public interface g {
        void a(View view, float f);
    }

    private class h extends DataSetObserver {
        final /* synthetic */ ViewPager a;

        h(ViewPager viewPager) {
            this.a = viewPager;
        }

        public void onChanged() {
            this.a.b();
        }

        public void onInvalidated() {
            this.a.b();
        }
    }

    public static class i extends a {
        public static final Creator<i> CREATOR = android.support.v4.g.d.a(new android.support.v4.g.e<i>() {
            public i a(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            public i[] a(int i) {
                return new i[i];
            }

            public /* synthetic */ Object b(Parcel parcel, ClassLoader classLoader) {
                return a(parcel, classLoader);
            }

            public /* synthetic */ Object[] b(int i) {
                return a(i);
            }
        });
        int a;
        Parcelable b;
        ClassLoader c;

        i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.a = parcel.readInt();
            this.b = parcel.readParcelable(classLoader);
            this.c = classLoader;
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeParcelable(this.b, i);
        }
    }

    public static class j implements f {
        public void a(int i) {
        }

        public void a(int i, float f, int i2) {
        }

        public void b(int i) {
        }
    }

    static class k implements Comparator<View> {
        k() {
        }

        public int a(View view, View view2) {
            c cVar = (c) view.getLayoutParams();
            c cVar2 = (c) view2.getLayoutParams();
            return cVar.a != cVar2.a ? cVar.a ? 1 : -1 : cVar.e - cVar2.e;
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((View) obj, (View) obj2);
        }
    }

    public ViewPager(Context context) {
        super(context);
        a();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    private int a(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.O || Math.abs(i2) <= this.M) {
            i += (int) ((i >= this.c ? 0.4f : 0.6f) + f);
        } else if (i2 <= 0) {
            i++;
        }
        if (this.g.size() <= 0) {
            return i;
        }
        return Math.max(((b) this.g.get(0)).b, Math.min(i, ((b) this.g.get(this.g.size() - 1)).b));
    }

    private Rect a(Rect rect, View view) {
        Rect rect2 = rect == null ? new Rect() : rect;
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewPager parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = parent;
            rect2.left += viewGroup.getLeft();
            rect2.right += viewGroup.getRight();
            rect2.top += viewGroup.getTop();
            rect2.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect2;
    }

    private void a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.g.isEmpty()) {
            b b = b(this.c);
            int min = (int) ((b != null ? Math.min(b.e, this.u) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                a(false);
                scrollTo(min, getScrollY());
            }
        } else if (this.m.isFinished()) {
            scrollTo((int) (((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3)) * (((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)))), getScrollY());
        } else {
            this.m.setFinalX(getCurrentItem() * getClientWidth());
        }
    }

    private void a(int i, boolean z, int i2, boolean z2) {
        int max;
        b b = b(i);
        if (b != null) {
            max = (int) (Math.max(this.t, Math.min(b.e, this.u)) * ((float) getClientWidth()));
        } else {
            max = 0;
        }
        if (z) {
            a(max, 0, i2);
            if (z2) {
                e(i);
                return;
            }
            return;
        }
        if (z2) {
            e(i);
        }
        a(false);
        scrollTo(max, 0);
        d(max);
    }

    private void a(b bVar, int i, b bVar2) {
        float f;
        int i2;
        b bVar3;
        int i3;
        int b = this.b.b();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? ((float) this.p) / ((float) clientWidth) : 0.0f;
        if (bVar2 != null) {
            clientWidth = bVar2.b;
            int i4;
            if (clientWidth < bVar.b) {
                f = (bVar2.e + bVar2.d) + f2;
                i4 = clientWidth + 1;
                i2 = 0;
                while (i4 <= bVar.b && i2 < this.g.size()) {
                    bVar3 = (b) this.g.get(i2);
                    while (i4 > bVar3.b && i2 < this.g.size() - 1) {
                        i2++;
                        bVar3 = (b) this.g.get(i2);
                    }
                    while (i4 < bVar3.b) {
                        f += this.b.d(i4) + f2;
                        i4++;
                    }
                    bVar3.e = f;
                    f += bVar3.d + f2;
                    i4++;
                }
            } else if (clientWidth > bVar.b) {
                i2 = this.g.size() - 1;
                f = bVar2.e;
                i4 = clientWidth - 1;
                while (i4 >= bVar.b && i2 >= 0) {
                    bVar3 = (b) this.g.get(i2);
                    while (i4 < bVar3.b && i2 > 0) {
                        i2--;
                        bVar3 = (b) this.g.get(i2);
                    }
                    while (i4 > bVar3.b) {
                        f -= this.b.d(i4) + f2;
                        i4--;
                    }
                    f -= bVar3.d + f2;
                    bVar3.e = f;
                    i4--;
                }
            }
        }
        int size = this.g.size();
        float f3 = bVar.e;
        i2 = bVar.b - 1;
        this.t = bVar.b == 0 ? bVar.e : -3.4028235E38f;
        this.u = bVar.b == b + -1 ? (bVar.e + bVar.d) - 1.0f : Float.MAX_VALUE;
        for (i3 = i - 1; i3 >= 0; i3--) {
            bVar3 = (b) this.g.get(i3);
            f = f3;
            while (i2 > bVar3.b) {
                f -= this.b.d(i2) + f2;
                i2--;
            }
            f3 = f - (bVar3.d + f2);
            bVar3.e = f3;
            if (bVar3.b == 0) {
                this.t = f3;
            }
            i2--;
        }
        f3 = (bVar.e + bVar.d) + f2;
        i2 = bVar.b + 1;
        for (i3 = i + 1; i3 < size; i3++) {
            bVar3 = (b) this.g.get(i3);
            f = f3;
            while (i2 < bVar3.b) {
                f = (this.b.d(i2) + f2) + f;
                i2++;
            }
            if (bVar3.b == b - 1) {
                this.u = (bVar3.d + f) - 1.0f;
            }
            bVar3.e = f;
            f3 = f + (bVar3.d + f2);
            i2++;
        }
        this.V = false;
    }

    private void a(MotionEvent motionEvent) {
        int b = t.b(motionEvent);
        if (motionEvent.getPointerId(b) == this.K) {
            b = b == 0 ? 1 : 0;
            this.G = motionEvent.getX(b);
            this.K = motionEvent.getPointerId(b);
            if (this.L != null) {
                this.L.clear();
            }
        }
    }

    private void a(boolean z) {
        int scrollX;
        boolean z2 = this.am == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.m.isFinished()) {
                this.m.abortAnimation();
                scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.m.getCurrX();
                int currY = this.m.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        d(currX);
                    }
                }
            }
        }
        this.z = false;
        boolean z3 = z2;
        for (scrollX = 0; scrollX < this.g.size(); scrollX++) {
            b bVar = (b) this.g.get(scrollX);
            if (bVar.c) {
                bVar.c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z) {
            ah.a((View) this, this.al);
        } else {
            this.al.run();
        }
    }

    private boolean a(float f, float f2) {
        return (f < ((float) this.E) && f2 > 0.0f) || (f > ((float) (getWidth() - this.E)) && f2 < 0.0f);
    }

    private void b(int i, float f, int i2) {
        if (this.ac != null) {
            this.ac.a(i, f, i2);
        }
        if (this.ab != null) {
            int size = this.ab.size();
            for (int i3 = 0; i3 < size; i3++) {
                f fVar = (f) this.ab.get(i3);
                if (fVar != null) {
                    fVar.a(i, f, i2);
                }
            }
        }
        if (this.ad != null) {
            this.ad.a(i, f, i2);
        }
    }

    private void b(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ah.a(getChildAt(i), z ? this.ag : 0, null);
        }
    }

    private void c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean c(float f) {
        boolean z;
        float f2;
        boolean z2 = true;
        boolean z3 = false;
        float f3 = this.G - f;
        this.G = f;
        float scrollX = ((float) getScrollX()) + f3;
        int clientWidth = getClientWidth();
        float f4 = ((float) clientWidth) * this.t;
        float f5 = ((float) clientWidth) * this.u;
        b bVar = (b) this.g.get(0);
        b bVar2 = (b) this.g.get(this.g.size() - 1);
        if (bVar.b != 0) {
            f4 = bVar.e * ((float) clientWidth);
            z = false;
        } else {
            z = true;
        }
        if (bVar2.b != this.b.b() - 1) {
            f2 = bVar2.e * ((float) clientWidth);
            z2 = false;
        } else {
            f2 = f5;
        }
        if (scrollX < f4) {
            if (z) {
                z3 = this.S.a(Math.abs(f4 - scrollX) / ((float) clientWidth));
            }
        } else if (scrollX > f2) {
            if (z2) {
                z3 = this.T.a(Math.abs(scrollX - f2) / ((float) clientWidth));
            }
            f4 = f2;
        } else {
            f4 = scrollX;
        }
        this.G += f4 - ((float) ((int) f4));
        scrollTo((int) f4, getScrollY());
        d((int) f4);
        return z3;
    }

    private static boolean c(View view) {
        return view.getClass().getAnnotation(a.class) != null;
    }

    private boolean d(int i) {
        if (this.g.size() != 0) {
            b l = l();
            int clientWidth = getClientWidth();
            int i2 = this.p + clientWidth;
            float f = ((float) this.p) / ((float) clientWidth);
            int i3 = l.b;
            float f2 = ((((float) i) / ((float) clientWidth)) - l.e) / (l.d + f);
            clientWidth = (int) (((float) i2) * f2);
            this.W = false;
            a(i3, f2, clientWidth);
            if (this.W) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.U) {
            return false;
        } else {
            this.W = false;
            a(0, 0.0f, 0);
            if (this.W) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    private void e(int i) {
        if (this.ac != null) {
            this.ac.b(i);
        }
        if (this.ab != null) {
            int size = this.ab.size();
            for (int i2 = 0; i2 < size; i2++) {
                f fVar = (f) this.ab.get(i2);
                if (fVar != null) {
                    fVar.b(i);
                }
            }
        }
        if (this.ad != null) {
            this.ad.b(i);
        }
    }

    private void f(int i) {
        if (this.ac != null) {
            this.ac.a(i);
        }
        if (this.ab != null) {
            int size = this.ab.size();
            for (int i2 = 0; i2 < size; i2++) {
                f fVar = (f) this.ab.get(i2);
                if (fVar != null) {
                    fVar.a(i);
                }
            }
        }
        if (this.ad != null) {
            this.ad.a(i);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void i() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((c) getChildAt(i).getLayoutParams()).a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    private void j() {
        if (this.ai != 0) {
            if (this.aj == null) {
                this.aj = new ArrayList();
            } else {
                this.aj.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.aj.add(getChildAt(i));
            }
            Collections.sort(this.aj, ak);
        }
    }

    private boolean k() {
        this.K = -1;
        m();
        return this.S.c() | this.T.c();
    }

    private b l() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f = clientWidth > 0 ? ((float) this.p) / ((float) clientWidth) : 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = -1;
        int i2 = 0;
        Object obj = 1;
        b bVar = null;
        while (i2 < this.g.size()) {
            int i3;
            b bVar2;
            b bVar3 = (b) this.g.get(i2);
            b bVar4;
            if (obj != null || bVar3.b == i + 1) {
                bVar4 = bVar3;
                i3 = i2;
                bVar2 = bVar4;
            } else {
                bVar3 = this.h;
                bVar3.e = (f2 + f3) + f;
                bVar3.b = i + 1;
                bVar3.d = this.b.d(bVar3.b);
                bVar4 = bVar3;
                i3 = i2 - 1;
                bVar2 = bVar4;
            }
            f2 = bVar2.e;
            f3 = (bVar2.d + f2) + f;
            if (obj == null && scrollX < f2) {
                return bVar;
            }
            if (scrollX < f3 || i3 == this.g.size() - 1) {
                return bVar2;
            }
            f3 = f2;
            i = bVar2.b;
            obj = null;
            f2 = bVar2.d;
            bVar = bVar2;
            i2 = i3 + 1;
        }
        return bVar;
    }

    private void m() {
        this.B = false;
        this.C = false;
        if (this.L != null) {
            this.L.recycle();
            this.L = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.y != z) {
            this.y = z;
        }
    }

    float a(float f) {
        return (float) Math.sin((double) ((float) (((double) (f - 0.5f)) * 0.4712389167638204d)));
    }

    b a(int i, int i2) {
        b bVar = new b();
        bVar.b = i;
        bVar.a = this.b.a((ViewGroup) this, i);
        bVar.d = this.b.d(i);
        if (i2 < 0 || i2 >= this.g.size()) {
            this.g.add(bVar);
        } else {
            this.g.add(i2, bVar);
        }
        return bVar;
    }

    b a(View view) {
        for (int i = 0; i < this.g.size(); i++) {
            b bVar = (b) this.g.get(i);
            if (this.b.a(view, bVar.a)) {
                return bVar;
            }
        }
        return null;
    }

    void a() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.m = new Scroller(context, f);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.F = viewConfiguration.getScaledPagingTouchSlop();
        this.M = (int) (400.0f * f);
        this.N = viewConfiguration.getScaledMaximumFlingVelocity();
        this.S = new android.support.v4.widget.j(context);
        this.T = new android.support.v4.widget.j(context);
        this.O = (int) (25.0f * f);
        this.P = (int) (2.0f * f);
        this.D = (int) (16.0f * f);
        ah.a((View) this, new d(this));
        if (ah.e(this) == 0) {
            ah.c((View) this, 1);
        }
        ah.a((View) this, new z(this) {
            final /* synthetic */ ViewPager a;
            private final Rect b = new Rect();

            {
                this.a = r2;
            }

            public bf a(View view, bf bfVar) {
                bf a = ah.a(view, bfVar);
                if (a.f()) {
                    return a;
                }
                Rect rect = this.b;
                rect.left = a.a();
                rect.top = a.b();
                rect.right = a.c();
                rect.bottom = a.d();
                int childCount = this.a.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    bf b = ah.b(this.a.getChildAt(i), a);
                    rect.left = Math.min(b.a(), rect.left);
                    rect.top = Math.min(b.b(), rect.top);
                    rect.right = Math.min(b.c(), rect.right);
                    rect.bottom = Math.min(b.d(), rect.bottom);
                }
                return a.a(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void a(int r18) {
        /*
        r17 = this;
        r2 = 0;
        r0 = r17;
        r3 = r0.c;
        r0 = r18;
        if (r3 == r0) goto L_0x0323;
    L_0x0009:
        r0 = r17;
        r2 = r0.c;
        r0 = r17;
        r2 = r0.b(r2);
        r0 = r18;
        r1 = r17;
        r1.c = r0;
        r3 = r2;
    L_0x001a:
        r0 = r17;
        r2 = r0.b;
        if (r2 != 0) goto L_0x0024;
    L_0x0020:
        r17.j();
    L_0x0023:
        return;
    L_0x0024:
        r0 = r17;
        r2 = r0.z;
        if (r2 == 0) goto L_0x002e;
    L_0x002a:
        r17.j();
        goto L_0x0023;
    L_0x002e:
        r2 = r17.getWindowToken();
        if (r2 == 0) goto L_0x0023;
    L_0x0034:
        r0 = r17;
        r2 = r0.b;
        r0 = r17;
        r2.a(r0);
        r0 = r17;
        r2 = r0.A;
        r4 = 0;
        r0 = r17;
        r5 = r0.c;
        r5 = r5 - r2;
        r10 = java.lang.Math.max(r4, r5);
        r0 = r17;
        r4 = r0.b;
        r11 = r4.b();
        r4 = r11 + -1;
        r0 = r17;
        r5 = r0.c;
        r2 = r2 + r5;
        r12 = java.lang.Math.min(r4, r2);
        r0 = r17;
        r2 = r0.d;
        if (r11 == r2) goto L_0x00cb;
    L_0x0064:
        r2 = r17.getResources();	 Catch:{ NotFoundException -> 0x00c1 }
        r3 = r17.getId();	 Catch:{ NotFoundException -> 0x00c1 }
        r2 = r2.getResourceName(r3);	 Catch:{ NotFoundException -> 0x00c1 }
    L_0x0070:
        r3 = new java.lang.IllegalStateException;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ";
        r4 = r4.append(r5);
        r0 = r17;
        r5 = r0.d;
        r4 = r4.append(r5);
        r5 = ", found: ";
        r4 = r4.append(r5);
        r4 = r4.append(r11);
        r5 = " Pager id: ";
        r4 = r4.append(r5);
        r2 = r4.append(r2);
        r4 = " Pager class: ";
        r2 = r2.append(r4);
        r4 = r17.getClass();
        r2 = r2.append(r4);
        r4 = " Problematic adapter: ";
        r2 = r2.append(r4);
        r0 = r17;
        r4 = r0.b;
        r4 = r4.getClass();
        r2 = r2.append(r4);
        r2 = r2.toString();
        r3.<init>(r2);
        throw r3;
    L_0x00c1:
        r2 = move-exception;
        r2 = r17.getId();
        r2 = java.lang.Integer.toHexString(r2);
        goto L_0x0070;
    L_0x00cb:
        r5 = 0;
        r2 = 0;
        r4 = r2;
    L_0x00ce:
        r0 = r17;
        r2 = r0.g;
        r2 = r2.size();
        if (r4 >= r2) goto L_0x0320;
    L_0x00d8:
        r0 = r17;
        r2 = r0.g;
        r2 = r2.get(r4);
        r2 = (android.support.v4.view.ViewPager.b) r2;
        r6 = r2.b;
        r0 = r17;
        r7 = r0.c;
        if (r6 < r7) goto L_0x01bc;
    L_0x00ea:
        r6 = r2.b;
        r0 = r17;
        r7 = r0.c;
        if (r6 != r7) goto L_0x0320;
    L_0x00f2:
        if (r2 != 0) goto L_0x031d;
    L_0x00f4:
        if (r11 <= 0) goto L_0x031d;
    L_0x00f6:
        r0 = r17;
        r2 = r0.c;
        r0 = r17;
        r2 = r0.a(r2, r4);
        r9 = r2;
    L_0x0101:
        if (r9 == 0) goto L_0x016d;
    L_0x0103:
        r8 = 0;
        r7 = r4 + -1;
        if (r7 < 0) goto L_0x01c1;
    L_0x0108:
        r0 = r17;
        r2 = r0.g;
        r2 = r2.get(r7);
        r2 = (android.support.v4.view.ViewPager.b) r2;
    L_0x0112:
        r13 = r17.getClientWidth();
        if (r13 > 0) goto L_0x01c4;
    L_0x0118:
        r5 = 0;
    L_0x0119:
        r0 = r17;
        r6 = r0.c;
        r6 = r6 + -1;
        r15 = r6;
        r6 = r8;
        r8 = r15;
        r16 = r7;
        r7 = r4;
        r4 = r16;
    L_0x0127:
        if (r8 < 0) goto L_0x0131;
    L_0x0129:
        r14 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1));
        if (r14 < 0) goto L_0x0203;
    L_0x012d:
        if (r8 >= r10) goto L_0x0203;
    L_0x012f:
        if (r2 != 0) goto L_0x01d3;
    L_0x0131:
        r5 = r9.d;
        r8 = r7 + 1;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x0168;
    L_0x013b:
        r0 = r17;
        r2 = r0.g;
        r2 = r2.size();
        if (r8 >= r2) goto L_0x0239;
    L_0x0145:
        r0 = r17;
        r2 = r0.g;
        r2 = r2.get(r8);
        r2 = (android.support.v4.view.ViewPager.b) r2;
        r6 = r2;
    L_0x0150:
        if (r13 > 0) goto L_0x023c;
    L_0x0152:
        r2 = 0;
        r4 = r2;
    L_0x0154:
        r0 = r17;
        r2 = r0.c;
        r2 = r2 + 1;
        r15 = r2;
        r2 = r6;
        r6 = r8;
        r8 = r15;
    L_0x015e:
        if (r8 >= r11) goto L_0x0168;
    L_0x0160:
        r10 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1));
        if (r10 < 0) goto L_0x0283;
    L_0x0164:
        if (r8 <= r12) goto L_0x0283;
    L_0x0166:
        if (r2 != 0) goto L_0x0249;
    L_0x0168:
        r0 = r17;
        r0.a(r9, r7, r3);
    L_0x016d:
        r0 = r17;
        r3 = r0.b;
        r0 = r17;
        r4 = r0.c;
        if (r9 == 0) goto L_0x02cd;
    L_0x0177:
        r2 = r9.a;
    L_0x0179:
        r0 = r17;
        r3.b(r0, r4, r2);
        r0 = r17;
        r2 = r0.b;
        r0 = r17;
        r2.b(r0);
        r4 = r17.getChildCount();
        r2 = 0;
        r3 = r2;
    L_0x018d:
        if (r3 >= r4) goto L_0x02d0;
    L_0x018f:
        r0 = r17;
        r5 = r0.getChildAt(r3);
        r2 = r5.getLayoutParams();
        r2 = (android.support.v4.view.ViewPager.c) r2;
        r2.f = r3;
        r6 = r2.a;
        if (r6 != 0) goto L_0x01b8;
    L_0x01a1:
        r6 = r2.c;
        r7 = 0;
        r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r6 != 0) goto L_0x01b8;
    L_0x01a8:
        r0 = r17;
        r5 = r0.a(r5);
        if (r5 == 0) goto L_0x01b8;
    L_0x01b0:
        r6 = r5.d;
        r2.c = r6;
        r5 = r5.b;
        r2.e = r5;
    L_0x01b8:
        r2 = r3 + 1;
        r3 = r2;
        goto L_0x018d;
    L_0x01bc:
        r2 = r4 + 1;
        r4 = r2;
        goto L_0x00ce;
    L_0x01c1:
        r2 = 0;
        goto L_0x0112;
    L_0x01c4:
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r6 = r9.d;
        r5 = r5 - r6;
        r6 = r17.getPaddingLeft();
        r6 = (float) r6;
        r14 = (float) r13;
        r6 = r6 / r14;
        r5 = r5 + r6;
        goto L_0x0119;
    L_0x01d3:
        r14 = r2.b;
        if (r8 != r14) goto L_0x01fd;
    L_0x01d7:
        r14 = r2.c;
        if (r14 != 0) goto L_0x01fd;
    L_0x01db:
        r0 = r17;
        r14 = r0.g;
        r14.remove(r4);
        r0 = r17;
        r14 = r0.b;
        r2 = r2.a;
        r0 = r17;
        r14.a(r0, r8, r2);
        r4 = r4 + -1;
        r7 = r7 + -1;
        if (r4 < 0) goto L_0x0201;
    L_0x01f3:
        r0 = r17;
        r2 = r0.g;
        r2 = r2.get(r4);
        r2 = (android.support.v4.view.ViewPager.b) r2;
    L_0x01fd:
        r8 = r8 + -1;
        goto L_0x0127;
    L_0x0201:
        r2 = 0;
        goto L_0x01fd;
    L_0x0203:
        if (r2 == 0) goto L_0x021d;
    L_0x0205:
        r14 = r2.b;
        if (r8 != r14) goto L_0x021d;
    L_0x0209:
        r2 = r2.d;
        r6 = r6 + r2;
        r4 = r4 + -1;
        if (r4 < 0) goto L_0x021b;
    L_0x0210:
        r0 = r17;
        r2 = r0.g;
        r2 = r2.get(r4);
        r2 = (android.support.v4.view.ViewPager.b) r2;
        goto L_0x01fd;
    L_0x021b:
        r2 = 0;
        goto L_0x01fd;
    L_0x021d:
        r2 = r4 + 1;
        r0 = r17;
        r2 = r0.a(r8, r2);
        r2 = r2.d;
        r6 = r6 + r2;
        r7 = r7 + 1;
        if (r4 < 0) goto L_0x0237;
    L_0x022c:
        r0 = r17;
        r2 = r0.g;
        r2 = r2.get(r4);
        r2 = (android.support.v4.view.ViewPager.b) r2;
        goto L_0x01fd;
    L_0x0237:
        r2 = 0;
        goto L_0x01fd;
    L_0x0239:
        r6 = 0;
        goto L_0x0150;
    L_0x023c:
        r2 = r17.getPaddingRight();
        r2 = (float) r2;
        r4 = (float) r13;
        r2 = r2 / r4;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 + r4;
        r4 = r2;
        goto L_0x0154;
    L_0x0249:
        r10 = r2.b;
        if (r8 != r10) goto L_0x0318;
    L_0x024d:
        r10 = r2.c;
        if (r10 != 0) goto L_0x0318;
    L_0x0251:
        r0 = r17;
        r10 = r0.g;
        r10.remove(r6);
        r0 = r17;
        r10 = r0.b;
        r2 = r2.a;
        r0 = r17;
        r10.a(r0, r8, r2);
        r0 = r17;
        r2 = r0.g;
        r2 = r2.size();
        if (r6 >= r2) goto L_0x0281;
    L_0x026d:
        r0 = r17;
        r2 = r0.g;
        r2 = r2.get(r6);
        r2 = (android.support.v4.view.ViewPager.b) r2;
    L_0x0277:
        r15 = r5;
        r5 = r2;
        r2 = r15;
    L_0x027a:
        r8 = r8 + 1;
        r15 = r2;
        r2 = r5;
        r5 = r15;
        goto L_0x015e;
    L_0x0281:
        r2 = 0;
        goto L_0x0277;
    L_0x0283:
        if (r2 == 0) goto L_0x02a8;
    L_0x0285:
        r10 = r2.b;
        if (r8 != r10) goto L_0x02a8;
    L_0x0289:
        r2 = r2.d;
        r5 = r5 + r2;
        r6 = r6 + 1;
        r0 = r17;
        r2 = r0.g;
        r2 = r2.size();
        if (r6 >= r2) goto L_0x02a6;
    L_0x0298:
        r0 = r17;
        r2 = r0.g;
        r2 = r2.get(r6);
        r2 = (android.support.v4.view.ViewPager.b) r2;
    L_0x02a2:
        r15 = r5;
        r5 = r2;
        r2 = r15;
        goto L_0x027a;
    L_0x02a6:
        r2 = 0;
        goto L_0x02a2;
    L_0x02a8:
        r0 = r17;
        r2 = r0.a(r8, r6);
        r6 = r6 + 1;
        r2 = r2.d;
        r5 = r5 + r2;
        r0 = r17;
        r2 = r0.g;
        r2 = r2.size();
        if (r6 >= r2) goto L_0x02cb;
    L_0x02bd:
        r0 = r17;
        r2 = r0.g;
        r2 = r2.get(r6);
        r2 = (android.support.v4.view.ViewPager.b) r2;
    L_0x02c7:
        r15 = r5;
        r5 = r2;
        r2 = r15;
        goto L_0x027a;
    L_0x02cb:
        r2 = 0;
        goto L_0x02c7;
    L_0x02cd:
        r2 = 0;
        goto L_0x0179;
    L_0x02d0:
        r17.j();
        r2 = r17.hasFocus();
        if (r2 == 0) goto L_0x0023;
    L_0x02d9:
        r2 = r17.findFocus();
        if (r2 == 0) goto L_0x0316;
    L_0x02df:
        r0 = r17;
        r2 = r0.b(r2);
    L_0x02e5:
        if (r2 == 0) goto L_0x02ef;
    L_0x02e7:
        r2 = r2.b;
        r0 = r17;
        r3 = r0.c;
        if (r2 == r3) goto L_0x0023;
    L_0x02ef:
        r2 = 0;
    L_0x02f0:
        r3 = r17.getChildCount();
        if (r2 >= r3) goto L_0x0023;
    L_0x02f6:
        r0 = r17;
        r3 = r0.getChildAt(r2);
        r0 = r17;
        r4 = r0.a(r3);
        if (r4 == 0) goto L_0x0313;
    L_0x0304:
        r4 = r4.b;
        r0 = r17;
        r5 = r0.c;
        if (r4 != r5) goto L_0x0313;
    L_0x030c:
        r4 = 2;
        r3 = r3.requestFocus(r4);
        if (r3 != 0) goto L_0x0023;
    L_0x0313:
        r2 = r2 + 1;
        goto L_0x02f0;
    L_0x0316:
        r2 = 0;
        goto L_0x02e5;
    L_0x0318:
        r15 = r5;
        r5 = r2;
        r2 = r15;
        goto L_0x027a;
    L_0x031d:
        r9 = r2;
        goto L_0x0101;
    L_0x0320:
        r2 = r5;
        goto L_0x00f2;
    L_0x0323:
        r3 = r2;
        goto L_0x001a;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.a(int):void");
    }

    protected void a(int i, float f, int i2) {
        int paddingLeft;
        int paddingRight;
        int i3;
        if (this.aa > 0) {
            int scrollX = getScrollX();
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            i3 = 0;
            while (i3 < childCount) {
                int i4;
                View childAt = getChildAt(i3);
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a) {
                    int max;
                    switch (cVar.b & 7) {
                        case 1:
                            max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            i4 = paddingRight;
                            paddingRight = paddingLeft;
                            paddingLeft = i4;
                            break;
                        case 3:
                            max = childAt.getWidth() + paddingLeft;
                            i4 = paddingLeft;
                            paddingLeft = paddingRight;
                            paddingRight = max;
                            max = i4;
                            break;
                        case 5:
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            i4 = paddingRight + childAt.getMeasuredWidth();
                            paddingRight = paddingLeft;
                            paddingLeft = i4;
                            break;
                        default:
                            max = paddingLeft;
                            i4 = paddingRight;
                            paddingRight = paddingLeft;
                            paddingLeft = i4;
                            break;
                    }
                    max = (max + scrollX) - childAt.getLeft();
                    if (max != 0) {
                        childAt.offsetLeftAndRight(max);
                    }
                } else {
                    i4 = paddingRight;
                    paddingRight = paddingLeft;
                    paddingLeft = i4;
                }
                i3++;
                i4 = paddingLeft;
                paddingLeft = paddingRight;
                paddingRight = i4;
            }
        }
        b(i, f, i2);
        if (this.af != null) {
            paddingRight = getScrollX();
            i3 = getChildCount();
            for (paddingLeft = 0; paddingLeft < i3; paddingLeft++) {
                View childAt2 = getChildAt(paddingLeft);
                if (!((c) childAt2.getLayoutParams()).a) {
                    this.af.a(childAt2, ((float) (childAt2.getLeft() - paddingRight)) / ((float) getClientWidth()));
                }
            }
        }
        this.W = true;
    }

    void a(int i, int i2, int i3) {
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int i4;
        boolean z = (this.m == null || this.m.isFinished()) ? false : true;
        if (z) {
            int currX = this.n ? this.m.getCurrX() : this.m.getStartX();
            this.m.abortAnimation();
            setScrollingCacheEnabled(false);
            i4 = currX;
        } else {
            i4 = getScrollX();
        }
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            a(false);
            c();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        currX = getClientWidth();
        int i7 = currX / 2;
        float a = (((float) i7) * a(Math.min(1.0f, (((float) Math.abs(i5)) * 1.0f) / ((float) currX)))) + ((float) i7);
        int abs = Math.abs(i3);
        i7 = Math.min(abs > 0 ? Math.round(1000.0f * Math.abs(a / ((float) abs))) * 4 : (int) (((((float) Math.abs(i5)) / ((((float) currX) * this.b.d(this.c)) + ((float) this.p))) + 1.0f) * 100.0f), 600);
        this.n = false;
        this.m.startScroll(i4, scrollY, i5, i6, i7);
        ah.d(this);
    }

    public void a(int i, boolean z) {
        this.z = false;
        a(i, z, false);
    }

    void a(int i, boolean z, boolean z2) {
        a(i, z, z2, 0);
    }

    void a(int i, boolean z, boolean z2, int i2) {
        boolean z3 = false;
        if (this.b == null || this.b.b() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.c != i || this.g.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.b.b()) {
                i = this.b.b() - 1;
            }
            int i3 = this.A;
            if (i > this.c + i3 || i < this.c - i3) {
                for (int i4 = 0; i4 < this.g.size(); i4++) {
                    ((b) this.g.get(i4)).c = true;
                }
            }
            if (this.c != i) {
                z3 = true;
            }
            if (this.U) {
                this.c = i;
                if (z3) {
                    e(i);
                }
                requestLayout();
                return;
            }
            a(i);
            a(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public void a(e eVar) {
        if (this.ae == null) {
            this.ae = new ArrayList();
        }
        this.ae.add(eVar);
    }

    public void a(f fVar) {
        if (this.ab == null) {
            this.ab = new ArrayList();
        }
        this.ab.add(fVar);
    }

    public void a(boolean z, g gVar) {
        a(z, gVar, 2);
    }

    public void a(boolean z, g gVar, int i) {
        int i2 = 1;
        if (VERSION.SDK_INT >= 11) {
            boolean z2 = gVar != null;
            int i3 = z2 != (this.af != null) ? 1 : 0;
            this.af = gVar;
            setChildrenDrawingOrderEnabledCompat(z2);
            if (z2) {
                if (z) {
                    i2 = 2;
                }
                this.ai = i2;
                this.ag = i;
            } else {
                this.ai = 0;
            }
            if (i3 != 0) {
                c();
            }
        }
    }

    public boolean a(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (keyEvent.getKeyCode()) {
            case 21:
                return c(17);
            case 22:
                return c(66);
            case 61:
                return VERSION.SDK_INT >= 11 ? h.a(keyEvent) ? c(2) : h.a(keyEvent, 1) ? c(1) : false : false;
            default:
                return false;
        }
    }

    protected boolean a(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + scrollX >= childAt.getLeft() && i2 + scrollX < childAt.getRight() && i3 + scrollY >= childAt.getTop() && i3 + scrollY < childAt.getBottom()) {
                    if (a(childAt, true, i, (i2 + scrollX) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && ah.a(view, -i);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    b a = a(childAt);
                    if (a != null && a.b == this.c) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                b a = a(childAt);
                if (a != null && a.b == this.c) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        LayoutParams generateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : layoutParams;
        c cVar = (c) generateLayoutParams;
        cVar.a |= c(view);
        if (!this.x) {
            super.addView(view, i, generateLayoutParams);
        } else if (cVar == null || !cVar.a) {
            cVar.d = true;
            addViewInLayout(view, i, generateLayoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    b b(int i) {
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            b bVar = (b) this.g.get(i2);
            if (bVar.b == i) {
                return bVar;
            }
        }
        return null;
    }

    b b(View view) {
        while (true) {
            ViewPager parent = view.getParent();
            if (parent == this) {
                return a(view);
            }
            if (parent != null && (parent instanceof View)) {
                view = parent;
            }
        }
        return null;
    }

    void b() {
        int i;
        int b = this.b.b();
        this.d = b;
        boolean z = this.g.size() < (this.A * 2) + 1 && this.g.size() < b;
        boolean z2 = false;
        int i2 = this.c;
        boolean z3 = z;
        int i3 = 0;
        while (i3 < this.g.size()) {
            int i4;
            boolean z4;
            boolean z5;
            b bVar = (b) this.g.get(i3);
            int a = this.b.a(bVar.a);
            if (a == -1) {
                i4 = i3;
                z4 = z2;
                i = i2;
                z5 = z3;
            } else if (a == -2) {
                this.g.remove(i3);
                i3--;
                if (!z2) {
                    this.b.a((ViewGroup) this);
                    z2 = true;
                }
                this.b.a((ViewGroup) this, bVar.b, bVar.a);
                if (this.c == bVar.b) {
                    i4 = i3;
                    z4 = z2;
                    i = Math.max(0, Math.min(this.c, b - 1));
                    z5 = true;
                } else {
                    i4 = i3;
                    z4 = z2;
                    i = i2;
                    z5 = true;
                }
            } else if (bVar.b != a) {
                if (bVar.b == this.c) {
                    i2 = a;
                }
                bVar.b = a;
                i4 = i3;
                z4 = z2;
                i = i2;
                z5 = true;
            } else {
                i4 = i3;
                z4 = z2;
                i = i2;
                z5 = z3;
            }
            z3 = z5;
            i2 = i;
            z2 = z4;
            i3 = i4 + 1;
        }
        if (z2) {
            this.b.b((ViewGroup) this);
        }
        Collections.sort(this.g, e);
        if (z3) {
            i = getChildCount();
            for (i3 = 0; i3 < i; i3++) {
                c cVar = (c) getChildAt(i3).getLayoutParams();
                if (!cVar.a) {
                    cVar.c = 0.0f;
                }
            }
            a(i2, false, true);
            requestLayout();
        }
    }

    public void b(float f) {
        if (!this.Q) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else if (this.b != null) {
            this.G += f;
            float scrollX = ((float) getScrollX()) - f;
            int clientWidth = getClientWidth();
            float f2 = ((float) clientWidth) * this.u;
            b bVar = (b) this.g.get(0);
            b bVar2 = (b) this.g.get(this.g.size() - 1);
            float f3 = bVar.b != 0 ? bVar.e * ((float) clientWidth) : ((float) clientWidth) * this.t;
            float f4 = bVar2.b != this.b.b() + -1 ? bVar2.e * ((float) clientWidth) : f2;
            if (scrollX >= f3) {
                f3 = scrollX > f4 ? f4 : scrollX;
            }
            this.G += f3 - ((float) ((int) f3));
            scrollTo((int) f3, getScrollY());
            d((int) f3);
            MotionEvent obtain = MotionEvent.obtain(this.R, SystemClock.uptimeMillis(), 2, this.G, 0.0f, 0);
            this.L.addMovement(obtain);
            obtain.recycle();
        }
    }

    public void b(e eVar) {
        if (this.ae != null) {
            this.ae.remove(eVar);
        }
    }

    public void b(f fVar) {
        if (this.ab != null) {
            this.ab.remove(fVar);
        }
    }

    void c() {
        a(this.c);
    }

    public boolean c(int i) {
        View view;
        boolean g;
        View findFocus = findFocus();
        if (findFocus == this) {
            view = null;
        } else {
            if (findFocus != null) {
                Object obj;
                for (ViewPager parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        obj = 1;
                        break;
                    }
                }
                obj = null;
                if (obj == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        stringBuilder.append(" => ").append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + stringBuilder.toString());
                    view = null;
                }
            }
            view = findFocus;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (findNextFocus == null || findNextFocus == view) {
            if (i == 17 || i == 1) {
                g = g();
            } else {
                if (i == 66 || i == 2) {
                    g = h();
                }
                g = false;
            }
        } else if (i == 17) {
            g = (view == null || a(this.i, findNextFocus).left < a(this.i, view).left) ? findNextFocus.requestFocus() : g();
        } else {
            if (i == 66) {
                g = (view == null || a(this.i, findNextFocus).left > a(this.i, view).left) ? findNextFocus.requestFocus() : h();
            }
            g = false;
        }
        if (g) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return g;
    }

    public boolean canScrollHorizontally(int i) {
        boolean z = true;
        if (this.b == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX <= ((int) (((float) clientWidth) * this.t))) {
                z = false;
            }
            return z;
        } else if (i <= 0) {
            return false;
        } else {
            if (scrollX >= ((int) (((float) clientWidth) * this.u))) {
                z = false;
            }
            return z;
        }
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof c) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.n = true;
        if (this.m.isFinished() || !this.m.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.m.getCurrX();
        int currY = this.m.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!d(currX)) {
                this.m.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ah.d(this);
    }

    public boolean d() {
        if (this.B) {
            return false;
        }
        this.Q = true;
        setScrollState(1);
        this.G = 0.0f;
        this.I = 0.0f;
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        } else {
            this.L.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.L.addMovement(obtain);
        obtain.recycle();
        this.R = uptimeMillis;
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || a(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                b a = a(childAt);
                if (a != null && a.b == this.c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int i = 0;
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0 || (overScrollMode == 1 && this.b != null && this.b.b() > 1)) {
            int height;
            int width;
            if (!this.S.a()) {
                overScrollMode = canvas.save();
                height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.t * ((float) width));
                this.S.a(height, width);
                i = 0 | this.S.a(canvas);
                canvas.restoreToCount(overScrollMode);
            }
            if (!this.T.a()) {
                overScrollMode = canvas.save();
                height = getWidth();
                width = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.u + 1.0f)) * ((float) height));
                this.T.a(width, height);
                i |= this.T.a(canvas);
                canvas.restoreToCount(overScrollMode);
            }
        } else {
            this.S.b();
            this.T.b();
        }
        if (i != 0) {
            ah.d(this);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.q;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public void e() {
        if (this.Q) {
            if (this.b != null) {
                VelocityTracker velocityTracker = this.L;
                velocityTracker.computeCurrentVelocity(1000, (float) this.N);
                int a = (int) af.a(velocityTracker, this.K);
                this.z = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                b l = l();
                a(a(l.b, ((((float) scrollX) / ((float) clientWidth)) - l.e) / l.d, a, (int) (this.G - this.I)), true, true, a);
            }
            m();
            this.Q = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public boolean f() {
        return this.Q;
    }

    boolean g() {
        if (this.c <= 0) {
            return false;
        }
        a(this.c - 1, true);
        return true;
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public aa getAdapter() {
        return this.b;
    }

    protected int getChildDrawingOrder(int i, int i2) {
        if (this.ai == 2) {
            i2 = (i - 1) - i2;
        }
        return ((c) ((View) this.aj.get(i2)).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.c;
    }

    public int getOffscreenPageLimit() {
        return this.A;
    }

    public int getPageMargin() {
        return this.p;
    }

    boolean h() {
        if (this.b == null || this.c >= this.b.b() - 1) {
            return false;
        }
        a(this.c + 1, true);
        return true;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U = true;
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.al);
        if (!(this.m == null || this.m.isFinished())) {
            this.m.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.p > 0 && this.q != null && this.g.size() > 0 && this.b != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f = ((float) this.p) / ((float) width);
            b bVar = (b) this.g.get(0);
            float f2 = bVar.e;
            int size = this.g.size();
            int i = bVar.b;
            int i2 = ((b) this.g.get(size - 1)).b;
            int i3 = 0;
            int i4 = i;
            while (i4 < i2) {
                float f3;
                while (i4 > bVar.b && i3 < size) {
                    i3++;
                    bVar = (b) this.g.get(i3);
                }
                if (i4 == bVar.b) {
                    f3 = (bVar.e + bVar.d) * ((float) width);
                    f2 = (bVar.e + bVar.d) + f;
                } else {
                    float d = this.b.d(i4);
                    f3 = (f2 + d) * ((float) width);
                    f2 += d + f;
                }
                if (((float) this.p) + f3 > ((float) scrollX)) {
                    this.q.setBounds(Math.round(f3), this.r, Math.round(((float) this.p) + f3), this.s);
                    this.q.draw(canvas);
                }
                if (f3 <= ((float) (scrollX + width))) {
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            k();
            return false;
        }
        if (action != 0) {
            if (this.B) {
                return true;
            }
            if (this.C) {
                return false;
            }
        }
        switch (action) {
            case 0:
                float x = motionEvent.getX();
                this.I = x;
                this.G = x;
                x = motionEvent.getY();
                this.J = x;
                this.H = x;
                this.K = motionEvent.getPointerId(0);
                this.C = false;
                this.n = true;
                this.m.computeScrollOffset();
                if (this.am == 2 && Math.abs(this.m.getFinalX() - this.m.getCurrX()) > this.P) {
                    this.m.abortAnimation();
                    this.z = false;
                    c();
                    this.B = true;
                    c(true);
                    setScrollState(1);
                    break;
                }
                a(false);
                this.B = false;
                break;
            case 2:
                action = this.K;
                if (action != -1) {
                    action = motionEvent.findPointerIndex(action);
                    float x2 = motionEvent.getX(action);
                    float f = x2 - this.G;
                    float abs = Math.abs(f);
                    float y = motionEvent.getY(action);
                    float abs2 = Math.abs(y - this.J);
                    if (f == 0.0f || a(this.G, f) || !a(this, false, (int) f, (int) x2, (int) y)) {
                        if (abs > ((float) this.F) && 0.5f * abs > abs2) {
                            this.B = true;
                            c(true);
                            setScrollState(1);
                            this.G = f > 0.0f ? this.I + ((float) this.F) : this.I - ((float) this.F);
                            this.H = y;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > ((float) this.F)) {
                            this.C = true;
                        }
                        if (this.B && c(x2)) {
                            ah.d(this);
                            break;
                        }
                    }
                    this.G = x2;
                    this.H = y;
                    this.C = true;
                    return false;
                }
                break;
            case 6:
                a(motionEvent);
                break;
        }
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        }
        this.L.addMovement(motionEvent);
        return this.B;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        c cVar;
        int max;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        int i8 = 0;
        while (i8 < childCount) {
            int measuredWidth;
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                cVar = (c) childAt.getLayoutParams();
                if (cVar.a) {
                    int i9 = cVar.b & 112;
                    switch (cVar.b & 7) {
                        case 1:
                            max = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        case 3:
                            max = paddingLeft;
                            paddingLeft = childAt.getMeasuredWidth() + paddingLeft;
                            break;
                        case 5:
                            measuredWidth = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                            max = measuredWidth;
                            break;
                        default:
                            max = paddingLeft;
                            break;
                    }
                    int i10;
                    switch (i9) {
                        case 16:
                            measuredWidth = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                            i10 = paddingBottom;
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                        case 48:
                            measuredWidth = childAt.getMeasuredHeight() + paddingTop;
                            i10 = paddingTop;
                            paddingTop = paddingBottom;
                            paddingBottom = measuredWidth;
                            measuredWidth = i10;
                            break;
                        case 80:
                            measuredWidth = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                            i10 = paddingBottom + childAt.getMeasuredHeight();
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                        default:
                            measuredWidth = paddingTop;
                            i10 = paddingBottom;
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                    }
                    max += scrollX;
                    childAt.layout(max, measuredWidth, childAt.getMeasuredWidth() + max, childAt.getMeasuredHeight() + measuredWidth);
                    measuredWidth = i7 + 1;
                    i7 = paddingBottom;
                    paddingBottom = paddingTop;
                    paddingTop = paddingRight;
                    paddingRight = paddingLeft;
                    i8++;
                    paddingLeft = paddingRight;
                    paddingRight = paddingTop;
                    paddingTop = i7;
                    i7 = measuredWidth;
                }
            }
            measuredWidth = i7;
            i7 = paddingTop;
            paddingTop = paddingRight;
            paddingRight = paddingLeft;
            i8++;
            paddingLeft = paddingRight;
            paddingRight = paddingTop;
            paddingTop = i7;
            i7 = measuredWidth;
        }
        max = (i5 - paddingLeft) - paddingRight;
        for (paddingRight = 0; paddingRight < childCount; paddingRight++) {
            View childAt2 = getChildAt(paddingRight);
            if (childAt2.getVisibility() != 8) {
                cVar = (c) childAt2.getLayoutParams();
                if (!cVar.a) {
                    b a = a(childAt2);
                    if (a != null) {
                        i5 = ((int) (a.e * ((float) max))) + paddingLeft;
                        if (cVar.d) {
                            cVar.d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (cVar.c * ((float) max)), 1073741824), MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                        }
                        childAt2.layout(i5, paddingTop, childAt2.getMeasuredWidth() + i5, childAt2.getMeasuredHeight() + paddingTop);
                    }
                }
            }
        }
        this.r = paddingTop;
        this.s = i6 - paddingBottom;
        this.aa = i7;
        if (this.U) {
            a(this.c, false, 0, false);
        }
        this.U = false;
    }

    protected void onMeasure(int i, int i2) {
        c cVar;
        int i3;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.E = Math.min(measuredWidth / 10, this.D);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            int i5;
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                cVar = (c) childAt.getLayoutParams();
                if (cVar != null && cVar.a) {
                    int i6 = cVar.b & 7;
                    int i7 = cVar.b & 112;
                    i3 = Integer.MIN_VALUE;
                    i5 = Integer.MIN_VALUE;
                    Object obj = (i7 == 48 || i7 == 80) ? 1 : null;
                    Object obj2 = (i6 == 3 || i6 == 5) ? 1 : null;
                    if (obj != null) {
                        i3 = 1073741824;
                    } else if (obj2 != null) {
                        i5 = 1073741824;
                    }
                    if (cVar.width != -2) {
                        i7 = 1073741824;
                        i3 = cVar.width != -1 ? cVar.width : paddingLeft;
                    } else {
                        i7 = i3;
                        i3 = paddingLeft;
                    }
                    if (cVar.height != -2) {
                        i5 = 1073741824;
                        if (cVar.height != -1) {
                            measuredWidth = cVar.height;
                            childAt.measure(MeasureSpec.makeMeasureSpec(i3, i7), MeasureSpec.makeMeasureSpec(measuredWidth, i5));
                            if (obj != null) {
                                measuredHeight -= childAt.getMeasuredHeight();
                            } else if (obj2 != null) {
                                paddingLeft -= childAt.getMeasuredWidth();
                            }
                        }
                    }
                    measuredWidth = measuredHeight;
                    childAt.measure(MeasureSpec.makeMeasureSpec(i3, i7), MeasureSpec.makeMeasureSpec(measuredWidth, i5));
                    if (obj != null) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (obj2 != null) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
            }
        }
        this.v = MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.w = MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.x = true;
        c();
        this.x = false;
        i3 = getChildCount();
        for (i5 = 0; i5 < i3; i5++) {
            View childAt2 = getChildAt(i5);
            if (childAt2.getVisibility() != 8) {
                cVar = (c) childAt2.getLayoutParams();
                if (cVar == null || !cVar.a) {
                    childAt2.measure(MeasureSpec.makeMeasureSpec((int) (cVar.c * ((float) paddingLeft)), 1073741824), this.w);
                }
            }
        }
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3 = -1;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = 1;
            i2 = 0;
        } else {
            i2 = childCount - 1;
            childCount = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                b a = a(childAt);
                if (a != null && a.b == this.c && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i2 += i3;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof i) {
            i iVar = (i) parcelable;
            super.onRestoreInstanceState(iVar.a());
            if (this.b != null) {
                this.b.a(iVar.b, iVar.c);
                a(iVar.a, false, true);
                return;
            }
            this.j = iVar.a;
            this.k = iVar.b;
            this.l = iVar.c;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable iVar = new i(super.onSaveInstanceState());
        iVar.a = this.c;
        if (this.b != null) {
            iVar.b = this.b.a();
        }
        return iVar;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            a(i, i3, this.p, this.p);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.Q) {
            return true;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.b == null || this.b.b() == 0) {
            return false;
        }
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        }
        this.L.addMovement(motionEvent);
        float x;
        int a;
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.m.abortAnimation();
                this.z = false;
                c();
                x = motionEvent.getX();
                this.I = x;
                this.G = x;
                x = motionEvent.getY();
                this.J = x;
                this.H = x;
                this.K = motionEvent.getPointerId(0);
                break;
            case 1:
                if (this.B) {
                    VelocityTracker velocityTracker = this.L;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.N);
                    a = (int) af.a(velocityTracker, this.K);
                    this.z = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    b l = l();
                    a(a(l.b, ((((float) scrollX) / ((float) clientWidth)) - l.e) / (l.d + (((float) this.p) / ((float) clientWidth))), a, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.K)) - this.I)), true, true, a);
                    z = k();
                    break;
                }
                break;
            case 2:
                if (!this.B) {
                    a = motionEvent.findPointerIndex(this.K);
                    if (a == -1) {
                        z = k();
                        break;
                    }
                    float x2 = motionEvent.getX(a);
                    float abs = Math.abs(x2 - this.G);
                    float y = motionEvent.getY(a);
                    x = Math.abs(y - this.H);
                    if (abs > ((float) this.F) && abs > x) {
                        this.B = true;
                        c(true);
                        this.G = x2 - this.I > 0.0f ? this.I + ((float) this.F) : this.I - ((float) this.F);
                        this.H = y;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.B) {
                    z = false | c(motionEvent.getX(motionEvent.findPointerIndex(this.K)));
                    break;
                }
                break;
            case 3:
                if (this.B) {
                    a(this.c, true, 0, false);
                    z = k();
                    break;
                }
                break;
            case 5:
                a = t.b(motionEvent);
                this.G = motionEvent.getX(a);
                this.K = motionEvent.getPointerId(a);
                break;
            case 6:
                a(motionEvent);
                this.G = motionEvent.getX(motionEvent.findPointerIndex(this.K));
                break;
        }
        if (z) {
            ah.d(this);
        }
        return true;
    }

    public void removeView(View view) {
        if (this.x) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(aa aaVar) {
        int i = false;
        if (this.b != null) {
            this.b.c(null);
            this.b.a((ViewGroup) this);
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                b bVar = (b) this.g.get(i2);
                this.b.a((ViewGroup) this, bVar.b, bVar.a);
            }
            this.b.b((ViewGroup) this);
            this.g.clear();
            i();
            this.c = 0;
            scrollTo(0, 0);
        }
        aa aaVar2 = this.b;
        this.b = aaVar;
        this.d = 0;
        if (this.b != null) {
            if (this.o == null) {
                this.o = new h(this);
            }
            this.b.c(this.o);
            this.z = false;
            boolean z = this.U;
            this.U = true;
            this.d = this.b.b();
            if (this.j >= 0) {
                this.b.a(this.k, this.l);
                a(this.j, false, true);
                this.j = -1;
                this.k = null;
                this.l = null;
            } else if (z) {
                requestLayout();
            } else {
                c();
            }
        }
        if (this.ae != null && !this.ae.isEmpty()) {
            int size = this.ae.size();
            while (i < size) {
                ((e) this.ae.get(i)).a(this, aaVar2, aaVar);
                i++;
            }
        }
    }

    void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (VERSION.SDK_INT >= 7) {
            if (this.ah == null) {
                try {
                    this.ah = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});
                } catch (Throwable e) {
                    Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", e);
                }
            }
            try {
                this.ah.invoke(this, new Object[]{Boolean.valueOf(z)});
            } catch (Throwable e2) {
                Log.e("ViewPager", "Error changing children drawing order", e2);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.z = false;
        a(i, !this.U, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to " + 1);
            i = 1;
        }
        if (i != this.A) {
            this.A = i;
            c();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(f fVar) {
        this.ac = fVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.p;
        this.p = i;
        int width = getWidth();
        a(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(android.support.v4.c.a.a(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.q = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i) {
        if (this.am != i) {
            this.am = i;
            if (this.af != null) {
                b(i != 0);
            }
            f(i);
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q;
    }
}
