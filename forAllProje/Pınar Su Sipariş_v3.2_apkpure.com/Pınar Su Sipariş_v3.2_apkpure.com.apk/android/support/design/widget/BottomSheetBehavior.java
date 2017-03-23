package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.design.a.g;
import android.support.v4.view.af;
import android.support.v4.view.ah;
import android.support.v4.view.t;
import android.support.v4.view.x;
import android.support.v4.widget.ad;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public class BottomSheetBehavior<V extends View> extends android.support.design.widget.CoordinatorLayout.b<V> {
    private float a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private int f = 4;
    private ad g;
    private boolean h;
    private int i;
    private boolean j;
    private int k;
    private WeakReference<V> l;
    private WeakReference<View> m;
    private a n;
    private VelocityTracker o;
    private int p;
    private int q;
    private boolean r;
    private final android.support.v4.widget.ad.a s = new android.support.v4.widget.ad.a(this) {
        final /* synthetic */ BottomSheetBehavior a;

        {
            this.a = r1;
        }

        public boolean a(View view, int i) {
            if (this.a.f == 1 || this.a.r) {
                return false;
            }
            if (this.a.f == 3 && this.a.p == i) {
                View view2 = (View) this.a.m.get();
                if (view2 != null && ah.b(view2, -1)) {
                    return false;
                }
            }
            boolean z = this.a.l != null && this.a.l.get() == view;
            return z;
        }

        public void a(View view, int i, int i2, int i3, int i4) {
            this.a.c(i2);
        }

        public void a(int i) {
            if (i == 1) {
                this.a.b(1);
            }
        }

        public void a(View view, float f, float f2) {
            int f3;
            int i = 3;
            if (f2 < 0.0f) {
                f3 = this.a.c;
            } else if (this.a.e && this.a.a(view, f2)) {
                f3 = this.a.k;
                i = 5;
            } else if (f2 == 0.0f) {
                int top = view.getTop();
                if (Math.abs(top - this.a.c) < Math.abs(top - this.a.d)) {
                    f3 = this.a.c;
                } else {
                    f3 = this.a.d;
                    i = 4;
                }
            } else {
                f3 = this.a.d;
                i = 4;
            }
            if (this.a.g.a(view.getLeft(), f3)) {
                this.a.b(2);
                ah.a(view, new b(this.a, view, i));
                return;
            }
            this.a.b(i);
        }

        public int a(View view, int i, int i2) {
            return k.a(i, this.a.c, this.a.e ? this.a.k : this.a.d);
        }

        public int b(View view, int i, int i2) {
            return view.getLeft();
        }

        public int a(View view) {
            if (this.a.e) {
                return this.a.k - this.a.c;
            }
            return this.a.d - this.a.c;
        }
    };

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
        final int a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.a = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }
    }

    public static abstract class a {
        public abstract void a(View view, float f);

        public abstract void a(View view, int i);
    }

    private class b implements Runnable {
        final /* synthetic */ BottomSheetBehavior a;
        private final View b;
        private final int c;

        b(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
            this.a = bottomSheetBehavior;
            this.b = view;
            this.c = i;
        }

        public void run() {
            if (this.a.g == null || !this.a.g.a(true)) {
                this.a.b(this.c);
            } else {
                ah.a(this.b, (Runnable) this);
            }
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.BottomSheetBehavior_Params);
        a(obtainStyledAttributes.getDimensionPixelSize(g.BottomSheetBehavior_Params_behavior_peekHeight, 0));
        a(obtainStyledAttributes.getBoolean(g.BottomSheetBehavior_Params_behavior_hideable, false));
        obtainStyledAttributes.recycle();
        this.a = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public Parcelable b(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.b(coordinatorLayout, v), this.f);
    }

    public void a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.a(coordinatorLayout, (View) v, savedState.getSuperState());
        if (savedState.a == 1 || savedState.a == 2) {
            this.f = 4;
        } else {
            this.f = savedState.a;
        }
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (!(this.f == 1 || this.f == 2)) {
            if (ah.v(coordinatorLayout) && !ah.v(v)) {
                ah.a((View) v, true);
            }
            coordinatorLayout.a((View) v, i);
        }
        this.k = coordinatorLayout.getHeight();
        this.c = Math.max(0, this.k - v.getHeight());
        this.d = Math.max(this.k - this.b, this.c);
        if (this.f == 3) {
            ah.e(v, this.c);
        } else if (this.e && this.f == 5) {
            ah.e(v, this.k);
        } else if (this.f == 4) {
            ah.e(v, this.d);
        }
        if (this.g == null) {
            this.g = ad.a((ViewGroup) coordinatorLayout, this.s);
        }
        this.l = new WeakReference(v);
        this.m = new WeakReference(a((View) v));
        return true;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = true;
        if (!v.isShown()) {
            return false;
        }
        int a = t.a(motionEvent);
        if (a == 0) {
            a();
        }
        if (this.o == null) {
            this.o = VelocityTracker.obtain();
        }
        this.o.addMovement(motionEvent);
        switch (a) {
            case 0:
                int x = (int) motionEvent.getX();
                this.q = (int) motionEvent.getY();
                View view = (View) this.m.get();
                if (view != null && coordinatorLayout.a(view, x, this.q)) {
                    this.p = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.r = true;
                }
                boolean z2 = this.p == -1 && !coordinatorLayout.a((View) v, x, this.q);
                this.h = z2;
                break;
            case 1:
            case 3:
                this.r = false;
                this.p = -1;
                if (this.h) {
                    this.h = false;
                    return false;
                }
                break;
        }
        if (!this.h && this.g.a(motionEvent)) {
            return true;
        }
        view = (View) this.m.get();
        if (a != 2 || view == null || this.h || this.f == 1 || coordinatorLayout.a(view, (int) motionEvent.getX(), (int) motionEvent.getY()) || Math.abs(((float) this.q) - motionEvent.getY()) <= ((float) this.g.d())) {
            z = false;
        }
        return z;
    }

    public boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int a = t.a(motionEvent);
        if (this.f == 1 && a == 0) {
            return true;
        }
        this.g.b(motionEvent);
        if (a == 0) {
            a();
        }
        if (this.o == null) {
            this.o = VelocityTracker.obtain();
        }
        this.o.addMovement(motionEvent);
        if (a == 2 && !this.h && Math.abs(((float) this.q) - motionEvent.getY()) > ((float) this.g.d())) {
            this.g.a((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        if (this.h) {
            return false;
        }
        return true;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.i = 0;
        this.j = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view == ((View) this.m.get())) {
            int top = v.getTop();
            int i3 = top - i2;
            if (i2 > 0) {
                if (i3 < this.c) {
                    iArr[1] = top - this.c;
                    ah.e(v, -iArr[1]);
                    b(3);
                } else {
                    iArr[1] = i2;
                    ah.e(v, -i2);
                    b(1);
                }
            } else if (i2 < 0 && !ah.b(view, -1)) {
                if (i3 <= this.d || this.e) {
                    iArr[1] = i2;
                    ah.e(v, -i2);
                    b(1);
                } else {
                    iArr[1] = top - this.d;
                    ah.e(v, -iArr[1]);
                    b(4);
                }
            }
            c(v.getTop());
            this.i = i2;
            this.j = true;
        }
    }

    public void a(CoordinatorLayout coordinatorLayout, V v, View view) {
        int i = 3;
        if (v.getTop() == this.c) {
            b(3);
        } else if (view == this.m.get() && this.j) {
            int i2;
            if (this.i > 0) {
                i2 = this.c;
            } else if (this.e && a((View) v, b())) {
                i2 = this.k;
                i = 5;
            } else if (this.i == 0) {
                int top = v.getTop();
                if (Math.abs(top - this.c) < Math.abs(top - this.d)) {
                    i2 = this.c;
                } else {
                    i2 = this.d;
                    i = 4;
                }
            } else {
                i2 = this.d;
                i = 4;
            }
            if (this.g.a((View) v, v.getLeft(), i2)) {
                b(2);
                ah.a((View) v, new b(this, v, i));
            } else {
                b(i);
            }
            this.j = false;
        }
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.m.get() && (this.f != 3 || super.a(coordinatorLayout, (View) v, view, f, f2));
    }

    public final void a(int i) {
        this.b = Math.max(0, i);
        this.d = this.k - i;
    }

    public void a(boolean z) {
        this.e = z;
    }

    private void b(int i) {
        if (this.f != i) {
            this.f = i;
            View view = (View) this.l.get();
            if (view != null && this.n != null) {
                this.n.a(view, i);
            }
        }
    }

    private void a() {
        this.p = -1;
        if (this.o != null) {
            this.o.recycle();
            this.o = null;
        }
    }

    private boolean a(View view, float f) {
        if (view.getTop() >= this.d && Math.abs((((float) view.getTop()) + (0.1f * f)) - ((float) this.d)) / ((float) this.b) > 0.5f) {
            return true;
        }
        return false;
    }

    private View a(View view) {
        if (view instanceof x) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View a = a(viewGroup.getChildAt(i));
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }

    private float b() {
        this.o.computeCurrentVelocity(1000, this.a);
        return af.b(this.o, this.p);
    }

    private void c(int i) {
        View view = (View) this.l.get();
        if (view != null && this.n != null) {
            if (i > this.d) {
                this.n.a(view, ((float) (this.d - i)) / ((float) this.b));
            } else {
                this.n.a(view, ((float) (this.d - i)) / ((float) (this.d - this.c)));
            }
        }
    }
}
