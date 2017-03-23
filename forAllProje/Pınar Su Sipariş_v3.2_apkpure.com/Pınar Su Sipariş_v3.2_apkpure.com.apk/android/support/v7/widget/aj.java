package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.view.ah;
import android.support.v4.view.az;
import android.support.v4.view.t;
import android.support.v4.widget.m;
import android.support.v4.widget.q;
import android.support.v7.a.a.k;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.internal.zzamj;
import com.google.android.gms.nearby.messages.Strategy;
import java.lang.reflect.Method;

/* compiled from: ListPopupWindow */
public class aj {
    private static Method a;
    private static Method c;
    private final c A;
    private Runnable B;
    private final Handler C;
    private Rect D;
    private boolean E;
    private int F;
    int b;
    private Context d;
    private PopupWindow e;
    private ListAdapter f;
    private a g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private int n;
    private boolean o;
    private boolean p;
    private View q;
    private int r;
    private DataSetObserver s;
    private View t;
    private Drawable u;
    private OnItemClickListener v;
    private OnItemSelectedListener w;
    private final g x;
    private final f y;
    private final e z;

    /* compiled from: ListPopupWindow */
    public static abstract class b implements OnTouchListener {
        private final float a;
        private final int b;
        private final int c;
        private final View d;
        private Runnable e;
        private Runnable f;
        private boolean g;
        private boolean h;
        private int i;
        private final int[] j = new int[2];

        /* compiled from: ListPopupWindow */
        private class a implements Runnable {
            final /* synthetic */ b a;

            private a(b bVar) {
                this.a = bVar;
            }

            public void run() {
                this.a.d.getParent().requestDisallowInterceptTouchEvent(true);
            }
        }

        /* compiled from: ListPopupWindow */
        private class b implements Runnable {
            final /* synthetic */ b a;

            private b(b bVar) {
                this.a = bVar;
            }

            public void run() {
                this.a.e();
            }
        }

        public abstract aj a();

        public b(View view) {
            this.d = view;
            this.a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.b = ViewConfiguration.getTapTimeout();
            this.c = (this.b + ViewConfiguration.getLongPressTimeout()) / 2;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean b;
            boolean z = this.g;
            if (z) {
                b = this.h ? b(motionEvent) : b(motionEvent) || !c();
            } else {
                boolean z2 = a(motionEvent) && b();
                if (z2) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    this.d.onTouchEvent(obtain);
                    obtain.recycle();
                }
                b = z2;
            }
            this.g = b;
            if (b || z) {
                return true;
            }
            return false;
        }

        protected boolean b() {
            aj a = a();
            if (!(a == null || a.k())) {
                a.c();
            }
            return true;
        }

        protected boolean c() {
            aj a = a();
            if (a != null && a.k()) {
                a.i();
            }
            return true;
        }

        private boolean a(MotionEvent motionEvent) {
            View view = this.d;
            if (!view.isEnabled()) {
                return false;
            }
            switch (t.a(motionEvent)) {
                case 0:
                    this.i = motionEvent.getPointerId(0);
                    this.h = false;
                    if (this.e == null) {
                        this.e = new a();
                    }
                    view.postDelayed(this.e, (long) this.b);
                    if (this.f == null) {
                        this.f = new b();
                    }
                    view.postDelayed(this.f, (long) this.c);
                    return false;
                case 1:
                case 3:
                    d();
                    return false;
                case 2:
                    int findPointerIndex = motionEvent.findPointerIndex(this.i);
                    if (findPointerIndex < 0 || a(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.a)) {
                        return false;
                    }
                    d();
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                default:
                    return false;
            }
        }

        private void d() {
            if (this.f != null) {
                this.d.removeCallbacks(this.f);
            }
            if (this.e != null) {
                this.d.removeCallbacks(this.e);
            }
        }

        private void e() {
            d();
            View view = this.d;
            if (view.isEnabled() && !view.isLongClickable() && b()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                this.g = true;
                this.h = true;
            }
        }

        private boolean b(MotionEvent motionEvent) {
            boolean z = true;
            View view = this.d;
            aj a = a();
            if (a == null || !a.k()) {
                return false;
            }
            View a2 = a.g;
            if (a2 == null || !a2.isShown()) {
                return false;
            }
            MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            b(view, obtainNoHistory);
            a(a2, obtainNoHistory);
            boolean a3 = a2.a(obtainNoHistory, this.i);
            obtainNoHistory.recycle();
            int a4 = t.a(motionEvent);
            boolean z2;
            if (a4 == 1 || a4 == 3) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!(a3 && r2)) {
                z = false;
            }
            return z;
        }

        private static boolean a(View view, float f, float f2, float f3) {
            return f >= (-f3) && f2 >= (-f3) && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
        }

        private boolean a(View view, MotionEvent motionEvent) {
            int[] iArr = this.j;
            view.getLocationOnScreen(iArr);
            motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
            return true;
        }

        private boolean b(View view, MotionEvent motionEvent) {
            int[] iArr = this.j;
            view.getLocationOnScreen(iArr);
            motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
            return true;
        }
    }

    /* compiled from: ListPopupWindow */
    class AnonymousClass1 extends b {
        final /* synthetic */ aj a;

        public aj a() {
            return this.a;
        }
    }

    /* compiled from: ListPopupWindow */
    private static class a extends ak {
        private boolean g;
        private boolean h;
        private boolean i;
        private az j;
        private m k;

        public a(Context context, boolean z) {
            super(context, null, android.support.v7.a.a.a.dropDownListViewStyle);
            this.h = z;
            setCacheColorHint(0);
        }

        public boolean a(MotionEvent motionEvent, int i) {
            boolean z;
            boolean z2;
            int a = t.a(motionEvent);
            switch (a) {
                case 1:
                    z = false;
                    break;
                case 2:
                    z = true;
                    break;
                case 3:
                    z = false;
                    z2 = false;
                    break;
                default:
                    z = false;
                    z2 = true;
                    break;
            }
            int findPointerIndex = motionEvent.findPointerIndex(i);
            if (findPointerIndex < 0) {
                z = false;
                z2 = false;
            } else {
                int x = (int) motionEvent.getX(findPointerIndex);
                findPointerIndex = (int) motionEvent.getY(findPointerIndex);
                int pointToPosition = pointToPosition(x, findPointerIndex);
                if (pointToPosition == -1) {
                    z2 = z;
                    z = true;
                } else {
                    View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                    a(childAt, pointToPosition, (float) x, (float) findPointerIndex);
                    if (a == 1) {
                        a(childAt, pointToPosition);
                    }
                    z = false;
                    z2 = true;
                }
            }
            if (!z2 || r0) {
                d();
            }
            if (z2) {
                if (this.k == null) {
                    this.k = new m(this);
                }
                this.k.a(true);
                this.k.onTouch(this, motionEvent);
            } else if (this.k != null) {
                this.k.a(false);
            }
            return z2;
        }

        private void a(View view, int i) {
            performItemClick(view, i, getItemIdAtPosition(i));
        }

        private void d() {
            this.i = false;
            setPressed(false);
            drawableStateChanged();
            View childAt = getChildAt(this.f - getFirstVisiblePosition());
            if (childAt != null) {
                childAt.setPressed(false);
            }
            if (this.j != null) {
                this.j.b();
                this.j = null;
            }
        }

        private void a(View view, int i, float f, float f2) {
            this.i = true;
            if (VERSION.SDK_INT >= 21) {
                drawableHotspotChanged(f, f2);
            }
            if (!isPressed()) {
                setPressed(true);
            }
            layoutChildren();
            if (this.f != -1) {
                View childAt = getChildAt(this.f - getFirstVisiblePosition());
                if (!(childAt == null || childAt == view || !childAt.isPressed())) {
                    childAt.setPressed(false);
                }
            }
            this.f = i;
            float left = f - ((float) view.getLeft());
            float top = f2 - ((float) view.getTop());
            if (VERSION.SDK_INT >= 21) {
                view.drawableHotspotChanged(left, top);
            }
            if (!view.isPressed()) {
                view.setPressed(true);
            }
            a(i, view, f, f2);
            setSelectorEnabled(false);
            refreshDrawableState();
        }

        protected boolean a() {
            return this.i || super.a();
        }

        public boolean isInTouchMode() {
            return (this.h && this.g) || super.isInTouchMode();
        }

        public boolean hasWindowFocus() {
            return this.h || super.hasWindowFocus();
        }

        public boolean isFocused() {
            return this.h || super.isFocused();
        }

        public boolean hasFocus() {
            return this.h || super.hasFocus();
        }
    }

    /* compiled from: ListPopupWindow */
    private class c implements Runnable {
        final /* synthetic */ aj a;

        private c(aj ajVar) {
            this.a = ajVar;
        }

        public void run() {
            this.a.j();
        }
    }

    /* compiled from: ListPopupWindow */
    private class d extends DataSetObserver {
        final /* synthetic */ aj a;

        private d(aj ajVar) {
            this.a = ajVar;
        }

        public void onChanged() {
            if (this.a.k()) {
                this.a.c();
            }
        }

        public void onInvalidated() {
            this.a.i();
        }
    }

    /* compiled from: ListPopupWindow */
    private class e implements OnScrollListener {
        final /* synthetic */ aj a;

        private e(aj ajVar) {
            this.a = ajVar;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !this.a.l() && this.a.e.getContentView() != null) {
                this.a.C.removeCallbacks(this.a.x);
                this.a.x.run();
            }
        }
    }

    /* compiled from: ListPopupWindow */
    private class f implements OnTouchListener {
        final /* synthetic */ aj a;

        private f(aj ajVar) {
            this.a = ajVar;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && this.a.e != null && this.a.e.isShowing() && x >= 0 && x < this.a.e.getWidth() && y >= 0 && y < this.a.e.getHeight()) {
                this.a.C.postDelayed(this.a.x, 250);
            } else if (action == 1) {
                this.a.C.removeCallbacks(this.a.x);
            }
            return false;
        }
    }

    /* compiled from: ListPopupWindow */
    private class g implements Runnable {
        final /* synthetic */ aj a;

        private g(aj ajVar) {
            this.a = ajVar;
        }

        public void run() {
            if (this.a.g != null && ah.E(this.a.g) && this.a.g.getCount() > this.a.g.getChildCount() && this.a.g.getChildCount() <= this.a.b) {
                this.a.e.setInputMethodMode(2);
                this.a.c();
            }
        }
    }

    static {
        try {
            a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException e) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            c = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
        } catch (NoSuchMethodException e2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
    }

    public aj(Context context) {
        this(context, null, android.support.v7.a.a.a.listPopupWindowStyle);
    }

    public aj(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public aj(Context context, AttributeSet attributeSet, int i, int i2) {
        this.h = -2;
        this.i = -2;
        this.l = 1002;
        this.n = 0;
        this.o = false;
        this.p = false;
        this.b = Strategy.TTL_SECONDS_INFINITE;
        this.r = 0;
        this.x = new g();
        this.y = new f();
        this.z = new e();
        this.A = new c();
        this.D = new Rect();
        this.d = context;
        this.C = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.ListPopupWindow, i, i2);
        this.j = obtainStyledAttributes.getDimensionPixelOffset(k.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.k = obtainStyledAttributes.getDimensionPixelOffset(k.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.k != 0) {
            this.m = true;
        }
        obtainStyledAttributes.recycle();
        this.e = new r(context, attributeSet, i);
        this.e.setInputMethodMode(1);
        this.F = android.support.v4.g.d.a(this.d.getResources().getConfiguration().locale);
    }

    public void a(ListAdapter listAdapter) {
        if (this.s == null) {
            this.s = new d();
        } else if (this.f != null) {
            this.f.unregisterDataSetObserver(this.s);
        }
        this.f = listAdapter;
        if (this.f != null) {
            listAdapter.registerDataSetObserver(this.s);
        }
        if (this.g != null) {
            this.g.setAdapter(this.f);
        }
    }

    public void a(int i) {
        this.r = i;
    }

    public void a(boolean z) {
        this.E = z;
        this.e.setFocusable(z);
    }

    public Drawable d() {
        return this.e.getBackground();
    }

    public void a(Drawable drawable) {
        this.e.setBackgroundDrawable(drawable);
    }

    public View e() {
        return this.t;
    }

    public void a(View view) {
        this.t = view;
    }

    public int f() {
        return this.j;
    }

    public void b(int i) {
        this.j = i;
    }

    public int g() {
        if (this.m) {
            return this.k;
        }
        return 0;
    }

    public void c(int i) {
        this.k = i;
        this.m = true;
    }

    public void d(int i) {
        this.n = i;
    }

    public int h() {
        return this.i;
    }

    public void e(int i) {
        this.i = i;
    }

    public void f(int i) {
        Drawable background = this.e.getBackground();
        if (background != null) {
            background.getPadding(this.D);
            this.i = (this.D.left + this.D.right) + i;
            return;
        }
        e(i);
    }

    public void a(OnItemClickListener onItemClickListener) {
        this.v = onItemClickListener;
    }

    public void c() {
        boolean z = true;
        boolean z2 = false;
        int i = -1;
        int b = b();
        boolean l = l();
        q.a(this.e, this.l);
        int i2;
        if (this.e.isShowing()) {
            int i3;
            int i4;
            if (this.i == -1) {
                i3 = -1;
            } else if (this.i == -2) {
                i3 = e().getWidth();
            } else {
                i3 = this.i;
            }
            if (this.h == -1) {
                if (!l) {
                    b = -1;
                }
                PopupWindow popupWindow;
                if (l) {
                    popupWindow = this.e;
                    if (this.i == -1) {
                        i2 = -1;
                    } else {
                        i2 = 0;
                    }
                    popupWindow.setWidth(i2);
                    this.e.setHeight(0);
                    i4 = b;
                } else {
                    popupWindow = this.e;
                    if (this.i == -1) {
                        i2 = -1;
                    } else {
                        i2 = 0;
                    }
                    popupWindow.setWidth(i2);
                    this.e.setHeight(-1);
                    i4 = b;
                }
            } else if (this.h == -2) {
                i4 = b;
            } else {
                i4 = this.h;
            }
            PopupWindow popupWindow2 = this.e;
            if (!(this.p || this.o)) {
                z2 = true;
            }
            popupWindow2.setOutsideTouchable(z2);
            popupWindow2 = this.e;
            View e = e();
            b = this.j;
            int i5 = this.k;
            if (i3 < 0) {
                i3 = -1;
            }
            if (i4 >= 0) {
                i = i4;
            }
            popupWindow2.update(e, b, i5, i3, i);
            return;
        }
        if (this.i == -1) {
            i2 = -1;
        } else if (this.i == -2) {
            i2 = e().getWidth();
        } else {
            i2 = this.i;
        }
        if (this.h == -1) {
            b = -1;
        } else if (this.h != -2) {
            b = this.h;
        }
        this.e.setWidth(i2);
        this.e.setHeight(b);
        b(true);
        popupWindow2 = this.e;
        if (this.p || this.o) {
            z = false;
        }
        popupWindow2.setOutsideTouchable(z);
        this.e.setTouchInterceptor(this.y);
        q.a(this.e, e(), this.j, this.k, this.n);
        this.g.setSelection(-1);
        if (!this.E || this.g.isInTouchMode()) {
            j();
        }
        if (!this.E) {
            this.C.post(this.A);
        }
    }

    public void i() {
        this.e.dismiss();
        a();
        this.e.setContentView(null);
        this.g = null;
        this.C.removeCallbacks(this.x);
    }

    public void a(OnDismissListener onDismissListener) {
        this.e.setOnDismissListener(onDismissListener);
    }

    private void a() {
        if (this.q != null) {
            ViewParent parent = this.q.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.q);
            }
        }
    }

    public void g(int i) {
        this.e.setInputMethodMode(i);
    }

    public void h(int i) {
        a aVar = this.g;
        if (k() && aVar != null) {
            aVar.g = false;
            aVar.setSelection(i);
            if (VERSION.SDK_INT >= 11 && aVar.getChoiceMode() != 0) {
                aVar.setItemChecked(i, true);
            }
        }
    }

    public void j() {
        a aVar = this.g;
        if (aVar != null) {
            aVar.g = true;
            aVar.requestLayout();
        }
    }

    public boolean k() {
        return this.e.isShowing();
    }

    public boolean l() {
        return this.e.getInputMethodMode() == 2;
    }

    public ListView m() {
        return this.g;
    }

    private int b() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z = true;
        LayoutParams layoutParams;
        View view;
        if (this.g == null) {
            Context context = this.d;
            this.B = new Runnable(this) {
                final /* synthetic */ aj a;

                {
                    this.a = r1;
                }

                public void run() {
                    View e = this.a.e();
                    if (e != null && e.getWindowToken() != null) {
                        this.a.c();
                    }
                }
            };
            this.g = new a(context, !this.E);
            if (this.u != null) {
                this.g.setSelector(this.u);
            }
            this.g.setAdapter(this.f);
            this.g.setOnItemClickListener(this.v);
            this.g.setFocusable(true);
            this.g.setFocusableInTouchMode(true);
            this.g.setOnItemSelectedListener(new OnItemSelectedListener(this) {
                final /* synthetic */ aj a;

                {
                    this.a = r1;
                }

                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    if (i != -1) {
                        a a = this.a.g;
                        if (a != null) {
                            a.g = false;
                        }
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            });
            this.g.setOnScrollListener(this.z);
            if (this.w != null) {
                this.g.setOnItemSelectedListener(this.w);
            }
            View view2 = this.g;
            View view3 = this.q;
            if (view3 != null) {
                View linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-1, 0, TextTrackStyle.DEFAULT_FONT_SCALE);
                switch (this.r) {
                    case 0:
                        linearLayout.addView(view3);
                        linearLayout.addView(view2, layoutParams2);
                        break;
                    case 1:
                        linearLayout.addView(view2, layoutParams2);
                        linearLayout.addView(view3);
                        break;
                    default:
                        Log.e("ListPopupWindow", "Invalid hint position " + this.r);
                        break;
                }
                if (this.i >= 0) {
                    i = this.i;
                    i2 = zzamj.UNSET_ENUM_VALUE;
                } else {
                    i2 = 0;
                    i = 0;
                }
                view3.measure(MeasureSpec.makeMeasureSpec(i, i2), 0);
                layoutParams = (LayoutParams) view3.getLayoutParams();
                i2 = layoutParams.bottomMargin + (view3.getMeasuredHeight() + layoutParams.topMargin);
                view = linearLayout;
            } else {
                view = view2;
                i2 = 0;
            }
            this.e.setContentView(view);
            i3 = i2;
        } else {
            ViewGroup viewGroup = (ViewGroup) this.e.getContentView();
            view = this.q;
            if (view != null) {
                layoutParams = (LayoutParams) view.getLayoutParams();
                i3 = layoutParams.bottomMargin + (view.getMeasuredHeight() + layoutParams.topMargin);
            } else {
                i3 = 0;
            }
        }
        Drawable background = this.e.getBackground();
        if (background != null) {
            background.getPadding(this.D);
            i2 = this.D.top + this.D.bottom;
            if (this.m) {
                i4 = i2;
            } else {
                this.k = -this.D.top;
                i4 = i2;
            }
        } else {
            this.D.setEmpty();
            i4 = 0;
        }
        if (this.e.getInputMethodMode() != 2) {
            z = false;
        }
        i = a(e(), this.k, z);
        if (this.o || this.h == -1) {
            return i + i4;
        }
        int makeMeasureSpec;
        switch (this.i) {
            case -2:
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.d.getResources().getDisplayMetrics().widthPixels - (this.D.left + this.D.right), zzamj.UNSET_ENUM_VALUE);
                break;
            case -1:
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.d.getResources().getDisplayMetrics().widthPixels - (this.D.left + this.D.right), 1073741824);
                break;
            default:
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.i, 1073741824);
                break;
        }
        i2 = this.g.a(makeMeasureSpec, 0, -1, i - i3, -1);
        if (i2 > 0) {
            i3 += i4;
        }
        return i2 + i3;
    }

    private void b(boolean z) {
        if (a != null) {
            try {
                a.invoke(this.e, new Object[]{Boolean.valueOf(z)});
            } catch (Exception e) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    private int a(View view, int i, boolean z) {
        if (c != null) {
            try {
                return ((Integer) c.invoke(this.e, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception e) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.e.getMaxAvailableHeight(view, i);
    }
}
