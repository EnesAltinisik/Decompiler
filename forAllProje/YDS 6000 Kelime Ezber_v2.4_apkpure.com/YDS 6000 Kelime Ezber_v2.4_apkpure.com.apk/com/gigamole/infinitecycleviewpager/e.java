package com.gigamole.infinitecycleviewpager;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.view.aa;
import android.support.v4.view.af;
import android.support.v4.view.ah;
import android.support.v4.view.h;
import android.support.v4.view.t;
import android.support.v4.widget.j;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class e extends ViewGroup {
    private static final int[] a = new int[]{16842931};
    private static final g ai = new g();
    private static final Comparator<b> c = new Comparator<b>() {
        public int a(b bVar, b bVar2) {
            return bVar.b - bVar2.b;
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((b) obj, (b) obj2);
        }
    };
    private static final Interpolator d = new Interpolator() {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * (((f2 * f2) * f2) * f2)) + 1.0f;
        }
    };
    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private int E;
    private float F;
    private float G;
    private float H;
    private float I;
    private int J;
    private VelocityTracker K;
    private int L;
    private int M;
    private int N;
    private int O;
    private boolean P;
    private long Q;
    private j R;
    private j S;
    private boolean T;
    private boolean U;
    private boolean V;
    private int W;
    private List<android.support.v4.view.ViewPager.f> aa;
    private android.support.v4.view.ViewPager.f ab;
    private android.support.v4.view.ViewPager.f ac;
    private d ad;
    private android.support.v4.view.ViewPager.g ae;
    private Method af;
    private int ag;
    private ArrayList<View> ah;
    private final Runnable aj;
    private int ak;
    private int b;
    private final ArrayList<b> e;
    private final b f;
    private final Rect g;
    private aa h;
    private int i;
    private int j;
    private Parcelable k;
    private ClassLoader l;
    private Scroller m;
    private e n;
    private int o;
    private Drawable p;
    private int q;
    private int r;
    private float s;
    private float t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;

    interface a {
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
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.a);
            this.b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    interface d {
        void a(aa aaVar, aa aaVar2);
    }

    private class e extends DataSetObserver {
        final /* synthetic */ e a;

        private e(e eVar) {
            this.a = eVar;
        }

        public void onChanged() {
            this.a.a();
        }

        public void onInvalidated() {
            this.a.a();
        }
    }

    public static class f extends BaseSavedState {
        public static final Creator<f> CREATOR = android.support.v4.g.d.a(new android.support.v4.g.e<f>() {
            public f a(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            public f[] a(int i) {
                return new f[i];
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

        f(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.a = parcel.readInt();
            this.b = parcel.readParcelable(classLoader);
            this.c = classLoader;
        }

        public f(Parcelable parcelable) {
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

    static class g implements Comparator<View> {
        g() {
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

    private int a(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.N || Math.abs(i2) <= this.L) {
            i = (int) ((i >= this.i ? 0.4f : 0.6f) + (((float) i) + f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.e.size() <= 0) {
            return i;
        }
        return Math.max(((b) this.e.get(0)).b, Math.min(i, ((b) this.e.get(this.e.size() - 1)).b));
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
        e parent = view.getParent();
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
        if (i2 <= 0 || this.e.isEmpty()) {
            b b = b(this.i);
            int min = (int) ((b != null ? Math.min(b.e, this.t) : 0.0f) * ((float) ((i - getPaddingTop()) - getPaddingBottom())));
            if (min != getScrollY()) {
                a(false);
                scrollTo(getScrollX(), min);
                return;
            }
            return;
        }
        int paddingTop = (int) (((float) (((i - getPaddingTop()) - getPaddingBottom()) + i3)) * (((float) getScrollY()) / ((float) (((i2 - getPaddingTop()) - getPaddingBottom()) + i4))));
        scrollTo(getScrollX(), paddingTop);
        if (!this.m.isFinished()) {
            this.m.startScroll(0, paddingTop, 0, (int) (b(this.i).e * ((float) i)), this.m.getDuration() - this.m.timePassed());
        }
    }

    private void a(int i, boolean z, int i2, boolean z2) {
        int max;
        b b = b(i);
        if (b != null) {
            max = (int) (Math.max(this.s, Math.min(b.e, this.t)) * ((float) getClientHeight()));
        } else {
            max = 0;
        }
        if (z) {
            a(0, max, i2);
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
        scrollTo(0, max);
        d(max);
    }

    private void a(MotionEvent motionEvent) {
        int b = t.b(motionEvent);
        if (t.b(motionEvent, b) == this.J) {
            b = b == 0 ? 1 : 0;
            this.G = t.d(motionEvent, b);
            this.J = t.b(motionEvent, b);
            if (this.K != null) {
                this.K.clear();
            }
        }
    }

    private void a(b bVar, int i, b bVar2) {
        float f;
        int i2;
        b bVar3;
        int i3;
        int b = this.h.b();
        int clientHeight = getClientHeight();
        float f2 = clientHeight > 0 ? ((float) this.o) / ((float) clientHeight) : 0.0f;
        if (bVar2 != null) {
            clientHeight = bVar2.b;
            int i4;
            if (clientHeight < bVar.b) {
                f = (bVar2.e + bVar2.d) + f2;
                i4 = clientHeight + 1;
                i2 = 0;
                while (i4 <= bVar.b && i2 < this.e.size()) {
                    bVar3 = (b) this.e.get(i2);
                    while (i4 > bVar3.b && i2 < this.e.size() - 1) {
                        i2++;
                        bVar3 = (b) this.e.get(i2);
                    }
                    while (i4 < bVar3.b) {
                        f += this.h.d(i4) + f2;
                        i4++;
                    }
                    bVar3.e = f;
                    f += bVar3.d + f2;
                    i4++;
                }
            } else if (clientHeight > bVar.b) {
                i2 = this.e.size() - 1;
                f = bVar2.e;
                i4 = clientHeight - 1;
                while (i4 >= bVar.b && i2 >= 0) {
                    bVar3 = (b) this.e.get(i2);
                    while (i4 < bVar3.b && i2 > 0) {
                        i2--;
                        bVar3 = (b) this.e.get(i2);
                    }
                    while (i4 > bVar3.b) {
                        f -= this.h.d(i4) + f2;
                        i4--;
                    }
                    f -= bVar3.d + f2;
                    bVar3.e = f;
                    i4--;
                }
            }
        }
        int size = this.e.size();
        float f3 = bVar.e;
        i2 = bVar.b - 1;
        this.s = bVar.b == 0 ? bVar.e : -3.4028235E38f;
        this.t = bVar.b == b + -1 ? (bVar.e + bVar.d) - 1.0f : Float.MAX_VALUE;
        for (i3 = i - 1; i3 >= 0; i3--) {
            bVar3 = (b) this.e.get(i3);
            f = f3;
            while (i2 > bVar3.b) {
                f -= this.h.d(i2) + f2;
                i2--;
            }
            f3 = f - (bVar3.d + f2);
            bVar3.e = f3;
            if (bVar3.b == 0) {
                this.s = f3;
            }
            i2--;
        }
        f3 = (bVar.e + bVar.d) + f2;
        i2 = bVar.b + 1;
        for (i3 = i + 1; i3 < size; i3++) {
            bVar3 = (b) this.e.get(i3);
            f = f3;
            while (i2 < bVar3.b) {
                f = (this.h.d(i2) + f2) + f;
                i2++;
            }
            if (bVar3.b == b - 1) {
                this.t = (bVar3.d + f) - 1.0f;
            }
            bVar3.e = f;
            f3 = f + (bVar3.d + f2);
            i2++;
        }
        this.U = false;
    }

    private void a(boolean z) {
        int scrollX;
        boolean z2 = this.ak == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            this.m.abortAnimation();
            scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.m.getCurrX();
            int currY = this.m.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
            }
        }
        this.y = false;
        boolean z3 = z2;
        for (scrollX = 0; scrollX < this.e.size(); scrollX++) {
            b bVar = (b) this.e.get(scrollX);
            if (bVar.c) {
                bVar.c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z) {
            ah.a((View) this, this.aj);
        } else {
            this.aj.run();
        }
    }

    private boolean a(float f, float f2) {
        return (f < ((float) this.D) && f2 > 0.0f) || (f > ((float) (getHeight() - this.D)) && f2 < 0.0f);
    }

    private void b(int i, float f, int i2) {
        if (this.ab != null) {
            this.ab.a(i, f, i2);
        }
        if (this.aa != null) {
            int size = this.aa.size();
            for (int i3 = 0; i3 < size; i3++) {
                android.support.v4.view.ViewPager.f fVar = (android.support.v4.view.ViewPager.f) this.aa.get(i3);
                if (fVar != null) {
                    fVar.a(i, f, i2);
                }
            }
        }
        if (this.ac != null) {
            this.ac.a(i, f, i2);
        }
    }

    private void b(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ah.a(getChildAt(i), z ? 2 : 0, null);
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
        float scrollY = ((float) getScrollY()) + f3;
        int clientHeight = getClientHeight();
        float f4 = ((float) clientHeight) * this.s;
        float f5 = ((float) clientHeight) * this.t;
        b bVar = (b) this.e.get(0);
        b bVar2 = (b) this.e.get(this.e.size() - 1);
        if (bVar.b != 0) {
            f4 = bVar.e * ((float) clientHeight);
            z = false;
        } else {
            z = true;
        }
        if (bVar2.b != this.h.b() - 1) {
            f2 = bVar2.e * ((float) clientHeight);
            z2 = false;
        } else {
            f2 = f5;
        }
        if (scrollY < f4) {
            if (z) {
                z3 = this.R.a(Math.abs(f4 - scrollY) / ((float) clientHeight));
            }
        } else if (scrollY > f2) {
            if (z2) {
                z3 = this.S.a(Math.abs(scrollY - f2) / ((float) clientHeight));
            }
            f4 = f2;
        } else {
            f4 = scrollY;
        }
        this.F += f4 - ((float) ((int) f4));
        scrollTo(getScrollX(), (int) f4);
        d((int) f4);
        return z3;
    }

    private boolean d(int i) {
        if (this.e.size() == 0) {
            this.V = false;
            a(0, 0.0f, 0);
            if (this.V) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        b k = k();
        int clientHeight = getClientHeight();
        int i2 = this.o + clientHeight;
        float f = ((float) this.o) / ((float) clientHeight);
        int i3 = k.b;
        float f2 = ((((float) i) / ((float) clientHeight)) - k.e) / (k.d + f);
        clientHeight = (int) (((float) i2) * f2);
        this.V = false;
        a(i3, f2, clientHeight);
        if (this.V) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private void e(int i) {
        if (this.ab != null) {
            this.ab.b(i);
        }
        if (this.aa != null) {
            int size = this.aa.size();
            for (int i2 = 0; i2 < size; i2++) {
                android.support.v4.view.ViewPager.f fVar = (android.support.v4.view.ViewPager.f) this.aa.get(i2);
                if (fVar != null) {
                    fVar.b(i);
                }
            }
        }
        if (this.ac != null) {
            this.ac.b(i);
        }
    }

    private void f(int i) {
        if (this.ab != null) {
            this.ab.a(i);
        }
        if (this.aa != null) {
            int size = this.aa.size();
            for (int i2 = 0; i2 < size; i2++) {
                android.support.v4.view.ViewPager.f fVar = (android.support.v4.view.ViewPager.f) this.aa.get(i2);
                if (fVar != null) {
                    fVar.a(i);
                }
            }
        }
        if (this.ac != null) {
            this.ac.a(i);
        }
    }

    private int getClientHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
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
        if (this.ag != 0) {
            if (this.ah == null) {
                this.ah = new ArrayList();
            } else {
                this.ah.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.ah.add(getChildAt(i));
            }
            Collections.sort(this.ah, ai);
        }
    }

    private b k() {
        int clientHeight = getClientHeight();
        float scrollY = clientHeight > 0 ? ((float) getScrollY()) / ((float) clientHeight) : 0.0f;
        float f = clientHeight > 0 ? ((float) this.o) / ((float) clientHeight) : 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = -1;
        int i2 = 0;
        Object obj = 1;
        b bVar = null;
        while (i2 < this.e.size()) {
            int i3;
            b bVar2;
            b bVar3 = (b) this.e.get(i2);
            b bVar4;
            if (obj != null || bVar3.b == i + 1) {
                bVar4 = bVar3;
                i3 = i2;
                bVar2 = bVar4;
            } else {
                bVar3 = this.f;
                bVar3.e = (f2 + f3) + f;
                bVar3.b = i + 1;
                bVar3.d = this.h.d(bVar3.b);
                bVar4 = bVar3;
                i3 = i2 - 1;
                bVar2 = bVar4;
            }
            f2 = bVar2.e;
            f3 = (bVar2.d + f2) + f;
            if (obj == null && scrollY < f2) {
                return bVar;
            }
            if (scrollY < f3 || i3 == this.e.size() - 1) {
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

    private void l() {
        this.A = false;
        this.B = false;
        if (this.K != null) {
            this.K.recycle();
            this.K = null;
        }
    }

    private void setScrollState(int i) {
        if (this.ak != i) {
            this.ak = i;
            if (this.ae != null) {
                b(i != 0);
            }
            f(i);
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.x != z) {
            this.x = z;
        }
    }

    float a(float f) {
        return (float) Math.sin((double) ((float) (((double) (f - 0.5f)) * 0.4712389167638204d)));
    }

    b a(int i, int i2) {
        b bVar = new b();
        bVar.b = i;
        bVar.a = this.h.a((ViewGroup) this, i);
        bVar.d = this.h.d(i);
        if (i2 < 0 || i2 >= this.e.size()) {
            this.e.add(bVar);
        } else {
            this.e.add(i2, bVar);
        }
        return bVar;
    }

    b a(View view) {
        for (int i = 0; i < this.e.size(); i++) {
            b bVar = (b) this.e.get(i);
            if (this.h.a(view, bVar.a)) {
                return bVar;
            }
        }
        return null;
    }

    void a() {
        int b = this.h.b();
        this.b = b;
        boolean z = this.e.size() < (this.z * 2) + 1 && this.e.size() < b;
        boolean z2 = false;
        int i = this.i;
        boolean z3 = z;
        int i2 = 0;
        while (i2 < this.e.size()) {
            int i3;
            boolean z4;
            int i4;
            boolean z5;
            b bVar = (b) this.e.get(i2);
            int a = this.h.a(bVar.a);
            if (a == -1) {
                i3 = i2;
                z4 = z2;
                i4 = i;
                z5 = z3;
            } else if (a == -2) {
                this.e.remove(i2);
                i2--;
                if (!z2) {
                    this.h.a((ViewGroup) this);
                    z2 = true;
                }
                this.h.a((ViewGroup) this, bVar.b, bVar.a);
                if (this.i == bVar.b) {
                    i3 = i2;
                    z4 = z2;
                    i4 = Math.max(0, Math.min(this.i, b - 1));
                    z5 = true;
                } else {
                    i3 = i2;
                    z4 = z2;
                    i4 = i;
                    z5 = true;
                }
            } else if (bVar.b != a) {
                if (bVar.b == this.i) {
                    i = a;
                }
                bVar.b = a;
                i3 = i2;
                z4 = z2;
                i4 = i;
                z5 = true;
            } else {
                i3 = i2;
                z4 = z2;
                i4 = i;
                z5 = z3;
            }
            z3 = z5;
            i = i4;
            z2 = z4;
            i2 = i3 + 1;
        }
        if (z2) {
            this.h.b((ViewGroup) this);
        }
        Collections.sort(this.e, c);
        if (z3) {
            i4 = getChildCount();
            for (i2 = 0; i2 < i4; i2++) {
                c cVar = (c) getChildAt(i2).getLayoutParams();
                if (!cVar.a) {
                    cVar.c = 0.0f;
                }
            }
            a(i, false, true);
            requestLayout();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void a(int r19) {
        /*
        r18 = this;
        r3 = 0;
        r2 = 2;
        r0 = r18;
        r4 = r0.i;
        r0 = r19;
        if (r4 == r0) goto L_0x033f;
    L_0x000a:
        r0 = r18;
        r2 = r0.i;
        r0 = r19;
        if (r2 >= r0) goto L_0x0030;
    L_0x0012:
        r2 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
    L_0x0014:
        r0 = r18;
        r3 = r0.i;
        r0 = r18;
        r3 = r0.b(r3);
        r0 = r19;
        r1 = r18;
        r1.i = r0;
        r4 = r3;
        r3 = r2;
    L_0x0026:
        r0 = r18;
        r2 = r0.h;
        if (r2 != 0) goto L_0x0033;
    L_0x002c:
        r18.j();
    L_0x002f:
        return;
    L_0x0030:
        r2 = 33;
        goto L_0x0014;
    L_0x0033:
        r0 = r18;
        r2 = r0.y;
        if (r2 == 0) goto L_0x003d;
    L_0x0039:
        r18.j();
        goto L_0x002f;
    L_0x003d:
        r2 = r18.getWindowToken();
        if (r2 == 0) goto L_0x002f;
    L_0x0043:
        r0 = r18;
        r2 = r0.h;
        r0 = r18;
        r2.a(r0);
        r0 = r18;
        r2 = r0.z;
        r5 = 0;
        r0 = r18;
        r6 = r0.i;
        r6 = r6 - r2;
        r11 = java.lang.Math.max(r5, r6);
        r0 = r18;
        r5 = r0.h;
        r12 = r5.b();
        r5 = r12 + -1;
        r0 = r18;
        r6 = r0.i;
        r2 = r2 + r6;
        r13 = java.lang.Math.min(r5, r2);
        r0 = r18;
        r2 = r0.b;
        if (r12 == r2) goto L_0x00da;
    L_0x0073:
        r2 = r18.getResources();	 Catch:{ NotFoundException -> 0x00d0 }
        r3 = r18.getId();	 Catch:{ NotFoundException -> 0x00d0 }
        r2 = r2.getResourceName(r3);	 Catch:{ NotFoundException -> 0x00d0 }
    L_0x007f:
        r3 = new java.lang.IllegalStateException;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ";
        r4 = r4.append(r5);
        r0 = r18;
        r5 = r0.b;
        r4 = r4.append(r5);
        r5 = ", found: ";
        r4 = r4.append(r5);
        r4 = r4.append(r12);
        r5 = " Pager id: ";
        r4 = r4.append(r5);
        r2 = r4.append(r2);
        r4 = " Pager class: ";
        r2 = r2.append(r4);
        r4 = r18.getClass();
        r2 = r2.append(r4);
        r4 = " Problematic adapter: ";
        r2 = r2.append(r4);
        r0 = r18;
        r4 = r0.h;
        r4 = r4.getClass();
        r2 = r2.append(r4);
        r2 = r2.toString();
        r3.<init>(r2);
        throw r3;
    L_0x00d0:
        r2 = move-exception;
        r2 = r18.getId();
        r2 = java.lang.Integer.toHexString(r2);
        goto L_0x007f;
    L_0x00da:
        r6 = 0;
        r2 = 0;
        r5 = r2;
    L_0x00dd:
        r0 = r18;
        r2 = r0.e;
        r2 = r2.size();
        if (r5 >= r2) goto L_0x033c;
    L_0x00e7:
        r0 = r18;
        r2 = r0.e;
        r2 = r2.get(r5);
        r2 = (com.gigamole.infinitecycleviewpager.e.b) r2;
        r7 = r2.b;
        r0 = r18;
        r8 = r0.i;
        if (r7 < r8) goto L_0x01cf;
    L_0x00f9:
        r7 = r2.b;
        r0 = r18;
        r8 = r0.i;
        if (r7 != r8) goto L_0x033c;
    L_0x0101:
        if (r2 != 0) goto L_0x0339;
    L_0x0103:
        if (r12 <= 0) goto L_0x0339;
    L_0x0105:
        r0 = r18;
        r2 = r0.i;
        r0 = r18;
        r2 = r0.a(r2, r5);
        r10 = r2;
    L_0x0110:
        if (r10 == 0) goto L_0x0180;
    L_0x0112:
        r9 = 0;
        r8 = r5 + -1;
        if (r8 < 0) goto L_0x01d4;
    L_0x0117:
        r0 = r18;
        r2 = r0.e;
        r2 = r2.get(r8);
        r2 = (com.gigamole.infinitecycleviewpager.e.b) r2;
    L_0x0121:
        r14 = r18.getClientHeight();
        if (r14 > 0) goto L_0x01d7;
    L_0x0127:
        r6 = 0;
    L_0x0128:
        r0 = r18;
        r7 = r0.i;
        r7 = r7 + -1;
        r16 = r7;
        r7 = r9;
        r9 = r16;
        r17 = r8;
        r8 = r5;
        r5 = r17;
    L_0x0138:
        if (r9 < 0) goto L_0x0142;
    L_0x013a:
        r15 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1));
        if (r15 < 0) goto L_0x0216;
    L_0x013e:
        if (r9 >= r11) goto L_0x0216;
    L_0x0140:
        if (r2 != 0) goto L_0x01e6;
    L_0x0142:
        r6 = r10.d;
        r9 = r8 + 1;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x017b;
    L_0x014c:
        r0 = r18;
        r2 = r0.e;
        r2 = r2.size();
        if (r9 >= r2) goto L_0x024c;
    L_0x0156:
        r0 = r18;
        r2 = r0.e;
        r2 = r2.get(r9);
        r2 = (com.gigamole.infinitecycleviewpager.e.b) r2;
        r7 = r2;
    L_0x0161:
        if (r14 > 0) goto L_0x024f;
    L_0x0163:
        r2 = 0;
        r5 = r2;
    L_0x0165:
        r0 = r18;
        r2 = r0.i;
        r2 = r2 + 1;
        r16 = r2;
        r2 = r7;
        r7 = r9;
        r9 = r16;
    L_0x0171:
        if (r9 >= r12) goto L_0x017b;
    L_0x0173:
        r11 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1));
        if (r11 < 0) goto L_0x029a;
    L_0x0177:
        if (r9 <= r13) goto L_0x029a;
    L_0x0179:
        if (r2 != 0) goto L_0x025c;
    L_0x017b:
        r0 = r18;
        r0.a(r10, r8, r4);
    L_0x0180:
        r0 = r18;
        r4 = r0.h;
        r0 = r18;
        r5 = r0.i;
        if (r10 == 0) goto L_0x02e8;
    L_0x018a:
        r2 = r10.a;
    L_0x018c:
        r0 = r18;
        r4.b(r0, r5, r2);
        r0 = r18;
        r2 = r0.h;
        r0 = r18;
        r2.b(r0);
        r5 = r18.getChildCount();
        r2 = 0;
        r4 = r2;
    L_0x01a0:
        if (r4 >= r5) goto L_0x02eb;
    L_0x01a2:
        r0 = r18;
        r6 = r0.getChildAt(r4);
        r2 = r6.getLayoutParams();
        r2 = (com.gigamole.infinitecycleviewpager.e.c) r2;
        r2.f = r4;
        r7 = r2.a;
        if (r7 != 0) goto L_0x01cb;
    L_0x01b4:
        r7 = r2.c;
        r8 = 0;
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 != 0) goto L_0x01cb;
    L_0x01bb:
        r0 = r18;
        r6 = r0.a(r6);
        if (r6 == 0) goto L_0x01cb;
    L_0x01c3:
        r7 = r6.d;
        r2.c = r7;
        r6 = r6.b;
        r2.e = r6;
    L_0x01cb:
        r2 = r4 + 1;
        r4 = r2;
        goto L_0x01a0;
    L_0x01cf:
        r2 = r5 + 1;
        r5 = r2;
        goto L_0x00dd;
    L_0x01d4:
        r2 = 0;
        goto L_0x0121;
    L_0x01d7:
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r7 = r10.d;
        r6 = r6 - r7;
        r7 = r18.getPaddingLeft();
        r7 = (float) r7;
        r15 = (float) r14;
        r7 = r7 / r15;
        r6 = r6 + r7;
        goto L_0x0128;
    L_0x01e6:
        r15 = r2.b;
        if (r9 != r15) goto L_0x0210;
    L_0x01ea:
        r15 = r2.c;
        if (r15 != 0) goto L_0x0210;
    L_0x01ee:
        r0 = r18;
        r15 = r0.e;
        r15.remove(r5);
        r0 = r18;
        r15 = r0.h;
        r2 = r2.a;
        r0 = r18;
        r15.a(r0, r9, r2);
        r5 = r5 + -1;
        r8 = r8 + -1;
        if (r5 < 0) goto L_0x0214;
    L_0x0206:
        r0 = r18;
        r2 = r0.e;
        r2 = r2.get(r5);
        r2 = (com.gigamole.infinitecycleviewpager.e.b) r2;
    L_0x0210:
        r9 = r9 + -1;
        goto L_0x0138;
    L_0x0214:
        r2 = 0;
        goto L_0x0210;
    L_0x0216:
        if (r2 == 0) goto L_0x0230;
    L_0x0218:
        r15 = r2.b;
        if (r9 != r15) goto L_0x0230;
    L_0x021c:
        r2 = r2.d;
        r7 = r7 + r2;
        r5 = r5 + -1;
        if (r5 < 0) goto L_0x022e;
    L_0x0223:
        r0 = r18;
        r2 = r0.e;
        r2 = r2.get(r5);
        r2 = (com.gigamole.infinitecycleviewpager.e.b) r2;
        goto L_0x0210;
    L_0x022e:
        r2 = 0;
        goto L_0x0210;
    L_0x0230:
        r2 = r5 + 1;
        r0 = r18;
        r2 = r0.a(r9, r2);
        r2 = r2.d;
        r7 = r7 + r2;
        r8 = r8 + 1;
        if (r5 < 0) goto L_0x024a;
    L_0x023f:
        r0 = r18;
        r2 = r0.e;
        r2 = r2.get(r5);
        r2 = (com.gigamole.infinitecycleviewpager.e.b) r2;
        goto L_0x0210;
    L_0x024a:
        r2 = 0;
        goto L_0x0210;
    L_0x024c:
        r7 = 0;
        goto L_0x0161;
    L_0x024f:
        r2 = r18.getPaddingRight();
        r2 = (float) r2;
        r5 = (float) r14;
        r2 = r2 / r5;
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 + r5;
        r5 = r2;
        goto L_0x0165;
    L_0x025c:
        r11 = r2.b;
        if (r9 != r11) goto L_0x0332;
    L_0x0260:
        r11 = r2.c;
        if (r11 != 0) goto L_0x0332;
    L_0x0264:
        r0 = r18;
        r11 = r0.e;
        r11.remove(r7);
        r0 = r18;
        r11 = r0.h;
        r2 = r2.a;
        r0 = r18;
        r11.a(r0, r9, r2);
        r0 = r18;
        r2 = r0.e;
        r2 = r2.size();
        if (r7 >= r2) goto L_0x0298;
    L_0x0280:
        r0 = r18;
        r2 = r0.e;
        r2 = r2.get(r7);
        r2 = (com.gigamole.infinitecycleviewpager.e.b) r2;
    L_0x028a:
        r16 = r6;
        r6 = r2;
        r2 = r16;
    L_0x028f:
        r9 = r9 + 1;
        r16 = r2;
        r2 = r6;
        r6 = r16;
        goto L_0x0171;
    L_0x0298:
        r2 = 0;
        goto L_0x028a;
    L_0x029a:
        if (r2 == 0) goto L_0x02c1;
    L_0x029c:
        r11 = r2.b;
        if (r9 != r11) goto L_0x02c1;
    L_0x02a0:
        r2 = r2.d;
        r6 = r6 + r2;
        r7 = r7 + 1;
        r0 = r18;
        r2 = r0.e;
        r2 = r2.size();
        if (r7 >= r2) goto L_0x02bf;
    L_0x02af:
        r0 = r18;
        r2 = r0.e;
        r2 = r2.get(r7);
        r2 = (com.gigamole.infinitecycleviewpager.e.b) r2;
    L_0x02b9:
        r16 = r6;
        r6 = r2;
        r2 = r16;
        goto L_0x028f;
    L_0x02bf:
        r2 = 0;
        goto L_0x02b9;
    L_0x02c1:
        r0 = r18;
        r2 = r0.a(r9, r7);
        r7 = r7 + 1;
        r2 = r2.d;
        r6 = r6 + r2;
        r0 = r18;
        r2 = r0.e;
        r2 = r2.size();
        if (r7 >= r2) goto L_0x02e6;
    L_0x02d6:
        r0 = r18;
        r2 = r0.e;
        r2 = r2.get(r7);
        r2 = (com.gigamole.infinitecycleviewpager.e.b) r2;
    L_0x02e0:
        r16 = r6;
        r6 = r2;
        r2 = r16;
        goto L_0x028f;
    L_0x02e6:
        r2 = 0;
        goto L_0x02e0;
    L_0x02e8:
        r2 = 0;
        goto L_0x018c;
    L_0x02eb:
        r18.j();
        r2 = r18.hasFocus();
        if (r2 == 0) goto L_0x002f;
    L_0x02f4:
        r2 = r18.findFocus();
        if (r2 == 0) goto L_0x0330;
    L_0x02fa:
        r0 = r18;
        r2 = r0.b(r2);
    L_0x0300:
        if (r2 == 0) goto L_0x030a;
    L_0x0302:
        r2 = r2.b;
        r0 = r18;
        r4 = r0.i;
        if (r2 == r4) goto L_0x002f;
    L_0x030a:
        r2 = 0;
    L_0x030b:
        r4 = r18.getChildCount();
        if (r2 >= r4) goto L_0x002f;
    L_0x0311:
        r0 = r18;
        r4 = r0.getChildAt(r2);
        r0 = r18;
        r5 = r0.a(r4);
        if (r5 == 0) goto L_0x032d;
    L_0x031f:
        r5 = r5.b;
        r0 = r18;
        r6 = r0.i;
        if (r5 != r6) goto L_0x032d;
    L_0x0327:
        r4 = r4.requestFocus(r3);
        if (r4 != 0) goto L_0x002f;
    L_0x032d:
        r2 = r2 + 1;
        goto L_0x030b;
    L_0x0330:
        r2 = 0;
        goto L_0x0300;
    L_0x0332:
        r16 = r6;
        r6 = r2;
        r2 = r16;
        goto L_0x028f;
    L_0x0339:
        r10 = r2;
        goto L_0x0110;
    L_0x033c:
        r2 = r6;
        goto L_0x0101;
    L_0x033f:
        r4 = r3;
        r3 = r2;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gigamole.infinitecycleviewpager.e.a(int):void");
    }

    protected void a(int i, float f, int i2) {
        int paddingTop;
        int paddingBottom;
        int i3;
        if (this.W > 0) {
            int scrollY = getScrollY();
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
            int height = getHeight();
            int childCount = getChildCount();
            i3 = 0;
            while (i3 < childCount) {
                int i4;
                View childAt = getChildAt(i3);
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a) {
                    int max;
                    switch (cVar.b & 112) {
                        case 16:
                            max = Math.max((height - childAt.getMeasuredHeight()) / 2, paddingTop);
                            i4 = paddingBottom;
                            paddingBottom = paddingTop;
                            paddingTop = i4;
                            break;
                        case 48:
                            max = childAt.getHeight() + paddingTop;
                            i4 = paddingTop;
                            paddingTop = paddingBottom;
                            paddingBottom = max;
                            max = i4;
                            break;
                        case 80:
                            max = (height - paddingBottom) - childAt.getMeasuredHeight();
                            i4 = paddingBottom + childAt.getMeasuredHeight();
                            paddingBottom = paddingTop;
                            paddingTop = i4;
                            break;
                        default:
                            max = paddingTop;
                            i4 = paddingBottom;
                            paddingBottom = paddingTop;
                            paddingTop = i4;
                            break;
                    }
                    max = (max + scrollY) - childAt.getTop();
                    if (max != 0) {
                        childAt.offsetTopAndBottom(max);
                    }
                } else {
                    i4 = paddingBottom;
                    paddingBottom = paddingTop;
                    paddingTop = i4;
                }
                i3++;
                i4 = paddingTop;
                paddingTop = paddingBottom;
                paddingBottom = i4;
            }
        }
        b(i, f, i2);
        if (this.ae != null) {
            paddingBottom = getScrollY();
            i3 = getChildCount();
            for (paddingTop = 0; paddingTop < i3; paddingTop++) {
                View childAt2 = getChildAt(paddingTop);
                if (!((c) childAt2.getLayoutParams()).a) {
                    this.ae.a(childAt2, ((float) (childAt2.getTop() - paddingBottom)) / ((float) getClientHeight()));
                }
            }
        }
        this.V = true;
    }

    void a(int i, int i2, int i3) {
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i4 = i - scrollX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            a(false);
            b();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientHeight = getClientHeight();
        int i6 = clientHeight / 2;
        float a = (((float) i6) * a(Math.min(1.0f, (((float) Math.abs(i4)) * 1.0f) / ((float) clientHeight)))) + ((float) i6);
        int abs = Math.abs(i3);
        if (abs > 0) {
            clientHeight = Math.round(1000.0f * Math.abs(a / ((float) abs))) * 4;
        } else {
            clientHeight = (int) (((((float) Math.abs(i4)) / ((((float) clientHeight) * this.h.d(this.i)) + ((float) this.o))) + 1.0f) * 100.0f);
        }
        this.m.startScroll(scrollX, scrollY, i4, i5, Math.min(clientHeight, 600));
        ah.d(this);
    }

    public void a(int i, boolean z) {
        this.y = false;
        a(i, z, false);
    }

    void a(int i, boolean z, boolean z2) {
        a(i, z, z2, 0);
    }

    void a(int i, boolean z, boolean z2, int i2) {
        boolean z3 = false;
        if (this.h == null || this.h.b() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.i != i || this.e.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.h.b()) {
                i = this.h.b() - 1;
            }
            int i3 = this.z;
            if (i > this.i + i3 || i < this.i - i3) {
                for (int i4 = 0; i4 < this.e.size(); i4++) {
                    ((b) this.e.get(i4)).c = true;
                }
            }
            if (this.i != i) {
                z3 = true;
            }
            if (this.T) {
                this.i = i;
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

    public void a(android.support.v4.view.ViewPager.f fVar) {
        if (this.aa == null) {
            this.aa = new ArrayList();
        }
        this.aa.add(fVar);
    }

    public void a(boolean z, android.support.v4.view.ViewPager.g gVar) {
        int i = 1;
        if (VERSION.SDK_INT >= 11) {
            boolean z2 = gVar != null;
            int i2 = z2 != (this.ae != null) ? 1 : 0;
            this.ae = gVar;
            setChildrenDrawingOrderEnabledCompat(z2);
            if (z2) {
                if (z) {
                    i = 2;
                }
                this.ag = i;
            } else {
                this.ag = 0;
            }
            if (i2 != 0) {
                b();
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
                if (i3 + scrollY >= childAt.getTop() && i3 + scrollY < childAt.getBottom() && i2 + scrollX >= childAt.getLeft() && i2 + scrollX < childAt.getRight()) {
                    if (a(childAt, true, i, (i2 + scrollX) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && ah.b(view, -i);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    b a = a(childAt);
                    if (a != null && a.b == this.i) {
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
                if (a != null && a.b == this.i) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        LayoutParams generateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : layoutParams;
        c cVar = (c) generateLayoutParams;
        cVar.a |= view instanceof a;
        if (!this.w) {
            super.addView(view, i, generateLayoutParams);
        } else if (cVar == null || !cVar.a) {
            cVar.d = true;
            addViewInLayout(view, i, generateLayoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    b b(int i) {
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            b bVar = (b) this.e.get(i2);
            if (bVar.b == i) {
                return bVar;
            }
        }
        return null;
    }

    b b(View view) {
        while (true) {
            e parent = view.getParent();
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
        a(this.i);
    }

    public void b(float f) {
        if (this.P) {
            this.G += f;
            float scrollY = ((float) getScrollY()) - f;
            int clientHeight = getClientHeight();
            float f2 = ((float) clientHeight) * this.t;
            b bVar = (b) this.e.get(0);
            b bVar2 = (b) this.e.get(this.e.size() - 1);
            float f3 = bVar.b != 0 ? bVar.e * ((float) clientHeight) : ((float) clientHeight) * this.s;
            float f4 = bVar2.b != this.h.b() + -1 ? bVar2.e * ((float) clientHeight) : f2;
            if (scrollY >= f3) {
                f3 = scrollY > f4 ? f4 : scrollY;
            }
            this.G += f3 - ((float) ((int) f3));
            scrollTo(getScrollX(), (int) f3);
            d((int) f3);
            MotionEvent obtain = MotionEvent.obtain(this.Q, SystemClock.uptimeMillis(), 2, 0.0f, this.G, 0);
            this.K.addMovement(obtain);
            obtain.recycle();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public boolean c() {
        if (this.A) {
            return false;
        }
        this.P = true;
        setScrollState(1);
        this.G = 0.0f;
        this.I = 0.0f;
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        } else {
            this.K.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.K.addMovement(obtain);
        obtain.recycle();
        this.Q = uptimeMillis;
        return true;
    }

    public boolean c(int i) {
        View view;
        boolean f;
        View findFocus = findFocus();
        if (findFocus == this) {
            view = null;
        } else {
            if (findFocus != null) {
                Object obj;
                for (e parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
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
                    Log.e("VerticalViewPager", "arrowScroll tried to find focus based on non-child current focused view " + stringBuilder.toString());
                    view = null;
                }
            }
            view = findFocus;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (findNextFocus == null || findNextFocus == view) {
            if (i == 33 || i == 1) {
                f = f();
            } else {
                if (i == 130 || i == 2) {
                    f = g();
                }
                f = false;
            }
        } else if (i == 33) {
            f = (view == null || a(this.g, findNextFocus).top < a(this.g, view).top) ? findNextFocus.requestFocus() : f();
        } else {
            if (i == 130) {
                f = (view == null || a(this.g, findNextFocus).bottom > a(this.g, view).bottom) ? findNextFocus.requestFocus() : g();
            }
            f = false;
        }
        if (f) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return f;
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof c) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
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
            if (!d(currY)) {
                this.m.abortAnimation();
                scrollTo(currX, 0);
            }
        }
        ah.d(this);
    }

    public void d() {
        if (this.P) {
            VelocityTracker velocityTracker = this.K;
            velocityTracker.computeCurrentVelocity(1000, (float) this.M);
            int b = (int) af.b(velocityTracker, this.J);
            this.y = true;
            int clientHeight = getClientHeight();
            int scrollY = getScrollY();
            b k = k();
            a(a(k.b, ((((float) scrollY) / ((float) clientHeight)) - k.e) / k.d, b, (int) (this.G - this.I)), true, true, b);
            l();
            this.P = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
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
                if (a != null && a.b == this.i && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int i = 0;
        int a = ah.a(this);
        if (a == 0 || (a == 1 && this.h != null && this.h.b() > 1)) {
            int height;
            int width;
            if (!this.R.a()) {
                a = canvas.save();
                height = getHeight();
                width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate((float) getPaddingLeft(), this.s * ((float) height));
                this.R.a(width, height);
                i = 0 | this.R.a(canvas);
                canvas.restoreToCount(a);
            }
            if (!this.S.a()) {
                a = canvas.save();
                height = getHeight();
                width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.rotate(180.0f);
                canvas.translate((float) ((-width) - getPaddingLeft()), (-(this.t + 1.0f)) * ((float) height));
                this.S.a(width, height);
                i |= this.S.a(canvas);
                canvas.restoreToCount(a);
            }
        } else {
            this.R.b();
            this.S.b();
        }
        if (i != 0) {
            ah.d(this);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.p;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public boolean e() {
        return this.P;
    }

    boolean f() {
        if (this.i <= 0) {
            return false;
        }
        a(this.i - 1, true);
        return true;
    }

    boolean g() {
        if (this.h == null || this.i >= this.h.b() - 1) {
            return false;
        }
        a(this.i + 1, true);
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
        return this.h;
    }

    protected int getChildDrawingOrder(int i, int i2) {
        if (this.ag == 2) {
            i2 = (i - 1) - i2;
        }
        return ((c) ((View) this.ah.get(i2)).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.i;
    }

    public int getOffscreenPageLimit() {
        return this.z;
    }

    public int getPageMargin() {
        return this.o;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = true;
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.aj);
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.o > 0 && this.p != null && this.e.size() > 0 && this.h != null) {
            int scrollY = getScrollY();
            int height = getHeight();
            float f = ((float) this.o) / ((float) height);
            b bVar = (b) this.e.get(0);
            float f2 = bVar.e;
            int size = this.e.size();
            int i = bVar.b;
            int i2 = ((b) this.e.get(size - 1)).b;
            int i3 = 0;
            int i4 = i;
            while (i4 < i2) {
                float f3;
                while (i4 > bVar.b && i3 < size) {
                    i3++;
                    bVar = (b) this.e.get(i3);
                }
                if (i4 == bVar.b) {
                    f3 = (bVar.e + bVar.d) * ((float) height);
                    f2 = (bVar.e + bVar.d) + f;
                } else {
                    float d = this.h.d(i4);
                    f3 = (f2 + d) * ((float) height);
                    f2 += d + f;
                }
                if (((float) this.o) + f3 > ((float) scrollY)) {
                    this.p.setBounds(this.q, (int) f3, this.r, (int) ((((float) this.o) + f3) + 0.5f));
                    this.p.draw(canvas);
                }
                if (f3 <= ((float) (scrollY + height))) {
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
            this.A = false;
            this.B = false;
            this.J = -1;
            if (this.K == null) {
                return false;
            }
            this.K.recycle();
            this.K = null;
            return false;
        }
        if (action != 0) {
            if (this.A) {
                return true;
            }
            if (this.B) {
                return false;
            }
        }
        switch (action) {
            case 0:
                float x = motionEvent.getX();
                this.H = x;
                this.F = x;
                x = motionEvent.getY();
                this.I = x;
                this.G = x;
                this.J = t.b(motionEvent, 0);
                this.B = false;
                this.m.computeScrollOffset();
                if (this.ak == 2 && Math.abs(this.m.getFinalY() - this.m.getCurrY()) > this.O) {
                    this.m.abortAnimation();
                    this.y = false;
                    b();
                    this.A = true;
                    c(true);
                    setScrollState(1);
                    break;
                }
                a(false);
                this.A = false;
                break;
                break;
            case 2:
                action = this.J;
                if (action != -1) {
                    action = t.a(motionEvent, action);
                    float d = t.d(motionEvent, action);
                    float f = d - this.G;
                    float abs = Math.abs(f);
                    float c = t.c(motionEvent, action);
                    float abs2 = Math.abs(c - this.H);
                    if (f == 0.0f || a(this.G, f) || !a(this, false, (int) f, (int) c, (int) d)) {
                        if (abs > ((float) this.E) && 0.5f * abs > abs2) {
                            this.A = true;
                            c(true);
                            setScrollState(1);
                            this.G = f > 0.0f ? this.I + ((float) this.E) : this.I - ((float) this.E);
                            this.F = c;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > ((float) this.E)) {
                            this.B = true;
                        }
                        if (this.A && c(d)) {
                            ah.d(this);
                            break;
                        }
                    }
                    this.F = c;
                    this.G = d;
                    this.B = true;
                    return false;
                }
                break;
            case 6:
                a(motionEvent);
                break;
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        return this.A;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int max;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollY = getScrollY();
        int i7 = 0;
        int i8 = 0;
        while (i8 < childCount) {
            c cVar;
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
                    measuredWidth += scrollY;
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
        max = (i6 - paddingTop) - paddingBottom;
        for (paddingBottom = 0; paddingBottom < childCount; paddingBottom++) {
            View childAt2 = getChildAt(paddingBottom);
            if (childAt2.getVisibility() != 8) {
                cVar = (c) childAt2.getLayoutParams();
                if (!cVar.a) {
                    b a = a(childAt2);
                    if (a != null) {
                        i6 = ((int) (a.e * ((float) max))) + paddingTop;
                        if (cVar.d) {
                            cVar.d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((i5 - paddingLeft) - paddingRight, 1073741824), MeasureSpec.makeMeasureSpec((int) (cVar.c * ((float) max)), 1073741824));
                        }
                        childAt2.layout(paddingLeft, i6, childAt2.getMeasuredWidth() + paddingLeft, childAt2.getMeasuredHeight() + i6);
                    }
                }
            }
        }
        this.q = paddingLeft;
        this.r = i5 - paddingRight;
        this.W = i7;
        if (this.T) {
            a(this.i, false, 0, false);
        }
        this.T = false;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredHeight = getMeasuredHeight();
        this.D = Math.min(measuredHeight / 10, this.C);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (measuredHeight - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            c cVar;
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
                        i3 = cVar.width != -1 ? cVar.width : measuredWidth;
                    } else {
                        i7 = i3;
                        i3 = measuredWidth;
                    }
                    if (cVar.height != -2) {
                        i5 = 1073741824;
                        if (cVar.height != -1) {
                            measuredHeight = cVar.height;
                            childAt.measure(MeasureSpec.makeMeasureSpec(i3, i7), MeasureSpec.makeMeasureSpec(measuredHeight, i5));
                            if (obj != null) {
                                paddingTop -= childAt.getMeasuredHeight();
                            } else if (obj2 != null) {
                                measuredWidth -= childAt.getMeasuredWidth();
                            }
                        }
                    }
                    measuredHeight = paddingTop;
                    childAt.measure(MeasureSpec.makeMeasureSpec(i3, i7), MeasureSpec.makeMeasureSpec(measuredHeight, i5));
                    if (obj != null) {
                        paddingTop -= childAt.getMeasuredHeight();
                    } else if (obj2 != null) {
                        measuredWidth -= childAt.getMeasuredWidth();
                    }
                }
            }
        }
        this.u = MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        this.v = MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
        this.w = true;
        b();
        this.w = false;
        i3 = getChildCount();
        for (i5 = 0; i5 < i3; i5++) {
            View childAt2 = getChildAt(i5);
            if (childAt2.getVisibility() != 8) {
                cVar = (c) childAt2.getLayoutParams();
                if (cVar == null || !cVar.a) {
                    childAt2.measure(this.u, MeasureSpec.makeMeasureSpec((int) (cVar.c * ((float) paddingTop)), 1073741824));
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
                if (a != null && a.b == this.i && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i2 += i3;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof f) {
            f fVar = (f) parcelable;
            super.onRestoreInstanceState(fVar.getSuperState());
            if (this.h != null) {
                this.h.a(fVar.b, fVar.c);
                a(fVar.a, false, true);
                return;
            }
            this.j = fVar.a;
            this.k = fVar.b;
            this.l = fVar.c;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable fVar = new f(super.onSaveInstanceState());
        fVar.a = this.i;
        if (this.h != null) {
            fVar.b = this.h.a();
        }
        return fVar;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != i4) {
            a(i2, i4, this.o, this.o);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.P) {
            return true;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.h == null || this.h.b() == 0) {
            return false;
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        float x;
        int b;
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.m.abortAnimation();
                this.y = false;
                b();
                x = motionEvent.getX();
                this.H = x;
                this.F = x;
                x = motionEvent.getY();
                this.I = x;
                this.G = x;
                this.J = t.b(motionEvent, 0);
                break;
            case 1:
                if (this.A) {
                    VelocityTracker velocityTracker = this.K;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.M);
                    b = (int) af.b(velocityTracker, this.J);
                    this.y = true;
                    int clientHeight = getClientHeight();
                    int scrollY = getScrollY();
                    b k = k();
                    a(a(k.b, ((((float) scrollY) / ((float) clientHeight)) - k.e) / k.d, b, (int) (t.d(motionEvent, t.a(motionEvent, this.J)) - this.I)), true, true, b);
                    this.J = -1;
                    l();
                    z = this.S.c() | this.R.c();
                    break;
                }
                break;
            case 2:
                if (!this.A) {
                    b = t.a(motionEvent, this.J);
                    float d = t.d(motionEvent, b);
                    float abs = Math.abs(d - this.G);
                    float c = t.c(motionEvent, b);
                    x = Math.abs(c - this.F);
                    if (abs > ((float) this.E) && abs > x) {
                        this.A = true;
                        c(true);
                        this.G = d - this.I > 0.0f ? this.I + ((float) this.E) : this.I - ((float) this.E);
                        this.F = c;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.A) {
                    z = false | c(t.d(motionEvent, t.a(motionEvent, this.J)));
                    break;
                }
                break;
            case 3:
                if (this.A) {
                    a(this.i, true, 0, false);
                    this.J = -1;
                    l();
                    z = this.S.c() | this.R.c();
                    break;
                }
                break;
            case 5:
                b = t.b(motionEvent);
                this.G = t.d(motionEvent, b);
                this.J = t.b(motionEvent, b);
                break;
            case 6:
                a(motionEvent);
                this.G = t.d(motionEvent, t.a(motionEvent, this.J));
                break;
        }
        if (z) {
            ah.d(this);
        }
        return true;
    }

    public void removeView(View view) {
        if (this.w) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(aa aaVar) {
        if (this.h != null) {
            this.h.b(this.n);
            this.h.a((ViewGroup) this);
            for (int i = 0; i < this.e.size(); i++) {
                b bVar = (b) this.e.get(i);
                this.h.a((ViewGroup) this, bVar.b, bVar.a);
            }
            this.h.b((ViewGroup) this);
            this.e.clear();
            i();
            this.i = 0;
            scrollTo(0, 0);
        }
        aa aaVar2 = this.h;
        this.h = aaVar;
        this.b = 0;
        if (this.h != null) {
            if (this.n == null) {
                this.n = new e();
            }
            this.h.a(this.n);
            this.y = false;
            boolean z = this.T;
            this.T = true;
            this.b = this.h.b();
            if (this.j >= 0) {
                this.h.a(this.k, this.l);
                a(this.j, false, true);
                this.j = -1;
                this.k = null;
                this.l = null;
            } else if (z) {
                requestLayout();
            } else {
                b();
            }
        }
        if (this.ad != null && aaVar2 != aaVar) {
            this.ad.a(aaVar2, aaVar);
        }
    }

    void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (VERSION.SDK_INT >= 7) {
            if (this.af == null) {
                try {
                    this.af = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});
                } catch (Throwable e) {
                    Log.e("VerticalViewPager", "Can't find setChildrenDrawingOrderEnabled", e);
                }
            }
            try {
                this.af.invoke(this, new Object[]{Boolean.valueOf(z)});
            } catch (Throwable e2) {
                Log.e("VerticalViewPager", "Error changing children drawing order", e2);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.y = false;
        a(i, !this.T, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("VerticalViewPager", "Requested offscreen page limit " + i + " too small; defaulting to " + 1);
            i = 1;
        }
        if (i != this.z) {
            this.z = i;
            b();
        }
    }

    void setOnAdapterChangeListener(d dVar) {
        this.ad = dVar;
    }

    @Deprecated
    public void setOnPageChangeListener(android.support.v4.view.ViewPager.f fVar) {
        this.ab = fVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.o;
        this.o = i;
        int height = getHeight();
        a(height, height, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.p = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.p;
    }
}
