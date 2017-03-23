package android.support.v7.widget;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.support.v4.view.ah;
import android.support.v4.view.t;
import android.support.v7.view.menu.s;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

public abstract class am implements OnTouchListener {
    private final float a;
    private final int b;
    final View c;
    private final int d;
    private Runnable e;
    private Runnable f;
    private boolean g;
    private int h;
    private final int[] i = new int[2];

    private class a implements Runnable {
        final /* synthetic */ am a;

        a(am amVar) {
            this.a = amVar;
        }

        public void run() {
            ViewParent parent = this.a.c.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        final /* synthetic */ am a;

        b(am amVar) {
            this.a = amVar;
        }

        public void run() {
            this.a.d();
        }
    }

    public am(View view) {
        this.c = view;
        view.setLongClickable(true);
        if (VERSION.SDK_INT >= 12) {
            a(view);
        } else {
            b(view);
        }
        this.a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.b = ViewConfiguration.getTapTimeout();
        this.d = (this.b + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    @TargetApi(12)
    private void a(View view) {
        view.addOnAttachStateChangeListener(new OnAttachStateChangeListener(this) {
            final /* synthetic */ am a;

            {
                this.a = r1;
            }

            public void onViewAttachedToWindow(View view) {
            }

            public void onViewDetachedFromWindow(View view) {
                this.a.e();
            }
        });
    }

    private boolean a(MotionEvent motionEvent) {
        View view = this.c;
        if (!view.isEnabled()) {
            return false;
        }
        switch (t.a(motionEvent)) {
            case 0:
                this.h = motionEvent.getPointerId(0);
                if (this.e == null) {
                    this.e = new a(this);
                }
                view.postDelayed(this.e, (long) this.b);
                if (this.f == null) {
                    this.f = new b(this);
                }
                view.postDelayed(this.f, (long) this.d);
                return false;
            case 1:
            case 3:
                f();
                return false;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.h);
                if (findPointerIndex < 0 || a(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.a)) {
                    return false;
                }
                f();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            default:
                return false;
        }
    }

    private static boolean a(View view, float f, float f2, float f3) {
        return f >= (-f3) && f2 >= (-f3) && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    private boolean a(View view, MotionEvent motionEvent) {
        int[] iArr = this.i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    private void b(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener(this) {
            boolean a = ah.G(this.b.c);
            final /* synthetic */ am b;

            {
                this.b = r2;
            }

            public void onGlobalLayout() {
                boolean z = this.a;
                this.a = ah.G(this.b.c);
                if (z && !this.a) {
                    this.b.e();
                }
            }
        });
    }

    private boolean b(MotionEvent motionEvent) {
        View view = this.c;
        s a = a();
        if (a == null || !a.f()) {
            return false;
        }
        ak akVar = (ak) a.g();
        if (akVar == null || !akVar.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        b(view, obtainNoHistory);
        a(akVar, obtainNoHistory);
        boolean a2 = akVar.a(obtainNoHistory, this.h);
        obtainNoHistory.recycle();
        int a3 = t.a(motionEvent);
        boolean z = (a3 == 1 || a3 == 3) ? false : true;
        z = a2 && z;
        return z;
    }

    private boolean b(View view, MotionEvent motionEvent) {
        int[] iArr = this.i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    private void e() {
        this.g = false;
        this.h = -1;
        if (this.e != null) {
            this.c.removeCallbacks(this.e);
        }
    }

    private void f() {
        if (this.f != null) {
            this.c.removeCallbacks(this.f);
        }
        if (this.e != null) {
            this.c.removeCallbacks(this.e);
        }
    }

    public abstract s a();

    protected boolean b() {
        s a = a();
        if (!(a == null || a.f())) {
            a.d();
        }
        return true;
    }

    protected boolean c() {
        s a = a();
        if (a != null && a.f()) {
            a.e();
        }
        return true;
    }

    void d() {
        f();
        View view = this.c;
        if (view.isEnabled() && !view.isLongClickable() && b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.g = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.g;
        if (z2) {
            z = b(motionEvent) || !c();
        } else {
            boolean z3 = a(motionEvent) && b();
            if (z3) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.c.onTouchEvent(obtain);
                obtain.recycle();
            }
            z = z3;
        }
        this.g = z;
        return z || z2;
    }
}
