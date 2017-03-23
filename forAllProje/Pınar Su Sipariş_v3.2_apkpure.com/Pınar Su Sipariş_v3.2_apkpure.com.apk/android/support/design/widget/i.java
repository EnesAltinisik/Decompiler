package android.support.design.widget;

import android.content.Context;
import android.support.v4.view.af;
import android.support.v4.view.ah;
import android.support.v4.view.t;
import android.support.v4.widget.w;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.zzamj;
import com.google.android.gms.nearby.messages.Strategy;

/* compiled from: HeaderBehavior */
abstract class i<V extends View> extends v<V> {
    private Runnable a;
    private w b;
    private boolean c;
    private int d = -1;
    private int e;
    private int f = -1;
    private VelocityTracker g;

    /* compiled from: HeaderBehavior */
    private class a implements Runnable {
        final /* synthetic */ i a;
        private final CoordinatorLayout b;
        private final V c;

        a(i iVar, CoordinatorLayout coordinatorLayout, V v) {
            this.a = iVar;
            this.b = coordinatorLayout;
            this.c = v;
        }

        public void run() {
            if (this.c != null && this.a.b != null) {
                if (this.a.b.g()) {
                    this.a.a_(this.b, this.c, this.a.b.c());
                    ah.a(this.c, (Runnable) this);
                    return;
                }
                this.a.a(this.b, this.c);
            }
        }
    }

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f < 0) {
            this.f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.c) {
            return true;
        }
        int y;
        switch (t.a(motionEvent)) {
            case 0:
                this.c = false;
                int x = (int) motionEvent.getX();
                y = (int) motionEvent.getY();
                if (c(v) && coordinatorLayout.a((View) v, x, y)) {
                    this.e = y;
                    this.d = t.b(motionEvent, 0);
                    c();
                    break;
                }
            case 1:
            case 3:
                this.c = false;
                this.d = -1;
                if (this.g != null) {
                    this.g.recycle();
                    this.g = null;
                    break;
                }
                break;
            case 2:
                y = this.d;
                if (y != -1) {
                    y = t.a(motionEvent, y);
                    if (y != -1) {
                        y = (int) t.d(motionEvent, y);
                        if (Math.abs(y - this.e) > this.f) {
                            this.c = true;
                            this.e = y;
                            break;
                        }
                    }
                }
                break;
        }
        if (this.g != null) {
            this.g.addMovement(motionEvent);
        }
        return this.c;
    }

    public boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f < 0) {
            this.f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        switch (t.a(motionEvent)) {
            case 0:
                int y = (int) motionEvent.getY();
                if (coordinatorLayout.a((View) v, (int) motionEvent.getX(), y) && c(v)) {
                    this.e = y;
                    this.d = t.b(motionEvent, 0);
                    c();
                    break;
                }
                return false;
                break;
            case 1:
                if (this.g != null) {
                    this.g.addMovement(motionEvent);
                    this.g.computeCurrentVelocity(1000);
                    a(coordinatorLayout, (View) v, -a((View) v), 0, af.b(this.g, this.d));
                    break;
                }
                break;
            case 2:
                int a = t.a(motionEvent, this.d);
                if (a != -1) {
                    a = (int) t.d(motionEvent, a);
                    int i = this.e - a;
                    if (!this.c && Math.abs(i) > this.f) {
                        this.c = true;
                        i = i > 0 ? i - this.f : i + this.f;
                    }
                    if (this.c) {
                        this.e = a;
                        b(coordinatorLayout, v, i, b(v), 0);
                        break;
                    }
                }
                return false;
                break;
            case 3:
                break;
        }
        this.c = false;
        this.d = -1;
        if (this.g != null) {
            this.g.recycle();
            this.g = null;
        }
        if (this.g != null) {
            this.g.addMovement(motionEvent);
        }
        return true;
    }

    int a_(CoordinatorLayout coordinatorLayout, V v, int i) {
        return a(coordinatorLayout, (View) v, i, (int) zzamj.UNSET_ENUM_VALUE, (int) Strategy.TTL_SECONDS_INFINITE);
    }

    int a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int b = b();
        if (i2 == 0 || b < i2 || b > i3) {
            return 0;
        }
        int a = k.a(i, i2, i3);
        if (b == a) {
            return 0;
        }
        a(a);
        return b - a;
    }

    int a() {
        return b();
    }

    final int b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return a(coordinatorLayout, (View) v, a() - i, i2, i3);
    }

    final boolean a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        if (this.a != null) {
            v.removeCallbacks(this.a);
            this.a = null;
        }
        if (this.b == null) {
            this.b = w.a(v.getContext());
        }
        this.b.a(0, b(), 0, Math.round(f), 0, 0, i, i2);
        if (this.b.g()) {
            this.a = new a(this, coordinatorLayout, v);
            ah.a((View) v, this.a);
            return true;
        }
        a(coordinatorLayout, v);
        return false;
    }

    void a(CoordinatorLayout coordinatorLayout, V v) {
    }

    boolean c(V v) {
        return false;
    }

    int b(V v) {
        return -v.getHeight();
    }

    int a(V v) {
        return v.getHeight();
    }

    private void c() {
        if (this.g == null) {
            this.g = VelocityTracker.obtain();
        }
    }
}
