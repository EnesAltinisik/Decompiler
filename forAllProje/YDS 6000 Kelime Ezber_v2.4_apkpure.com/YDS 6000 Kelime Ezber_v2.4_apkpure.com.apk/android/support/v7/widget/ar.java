package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.support.v4.view.ah;
import android.support.v4.widget.q;
import android.support.v7.appcompat.R;
import android.support.v7.view.menu.s;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
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
import java.lang.reflect.Method;

public class ar implements s {
    private static Method a;
    private static Method b;
    private static Method h;
    private OnItemSelectedListener A;
    private final d B;
    private final c C;
    private final a D;
    private Runnable E;
    private final Rect F;
    private Rect G;
    private boolean H;
    ak c;
    int d;
    final e e;
    final Handler f;
    PopupWindow g;
    private Context i;
    private ListAdapter j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean s;
    private boolean t;
    private View u;
    private int v;
    private DataSetObserver w;
    private View x;
    private Drawable y;
    private OnItemClickListener z;

    private class a implements Runnable {
        final /* synthetic */ ar a;

        a(ar arVar) {
            this.a = arVar;
        }

        public void run() {
            this.a.m();
        }
    }

    private class b extends DataSetObserver {
        final /* synthetic */ ar a;

        b(ar arVar) {
            this.a = arVar;
        }

        public void onChanged() {
            if (this.a.f()) {
                this.a.d();
            }
        }

        public void onInvalidated() {
            this.a.e();
        }
    }

    private class c implements OnScrollListener {
        final /* synthetic */ ar a;

        c(ar arVar) {
            this.a = arVar;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !this.a.n() && this.a.g.getContentView() != null) {
                this.a.f.removeCallbacks(this.a.e);
                this.a.e.run();
            }
        }
    }

    private class d implements OnTouchListener {
        final /* synthetic */ ar a;

        d(ar arVar) {
            this.a = arVar;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && this.a.g != null && this.a.g.isShowing() && x >= 0 && x < this.a.g.getWidth() && y >= 0 && y < this.a.g.getHeight()) {
                this.a.f.postDelayed(this.a.e, 250);
            } else if (action == 1) {
                this.a.f.removeCallbacks(this.a.e);
            }
            return false;
        }
    }

    private class e implements Runnable {
        final /* synthetic */ ar a;

        e(ar arVar) {
            this.a = arVar;
        }

        public void run() {
            if (this.a.c != null && ah.G(this.a.c) && this.a.c.getCount() > this.a.c.getChildCount() && this.a.c.getChildCount() <= this.a.d) {
                this.a.g.setInputMethodMode(2);
                this.a.d();
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
            b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
        } catch (NoSuchMethodException e2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            h = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
        } catch (NoSuchMethodException e3) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public ar(Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }

    public ar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ar(Context context, AttributeSet attributeSet, int i, int i2) {
        this.k = -2;
        this.l = -2;
        this.o = 1002;
        this.q = true;
        this.r = 0;
        this.s = false;
        this.t = false;
        this.d = Integer.MAX_VALUE;
        this.v = 0;
        this.e = new e(this);
        this.B = new d(this);
        this.C = new c(this);
        this.D = new a(this);
        this.F = new Rect();
        this.i = context;
        this.f = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ListPopupWindow, i, i2);
        this.m = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.n = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.n != 0) {
            this.p = true;
        }
        obtainStyledAttributes.recycle();
        if (VERSION.SDK_INT >= 11) {
            this.g = new r(context, attributeSet, i, i2);
        } else {
            this.g = new r(context, attributeSet, i);
        }
        this.g.setInputMethodMode(1);
    }

    private int a(View view, int i, boolean z) {
        if (b != null) {
            try {
                return ((Integer) b.invoke(this.g, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception e) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.g.getMaxAvailableHeight(view, i);
    }

    private void a() {
        if (this.u != null) {
            ViewParent parent = this.u.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.u);
            }
        }
    }

    private int b() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z = true;
        LayoutParams layoutParams;
        View view;
        if (this.c == null) {
            Context context = this.i;
            this.E = new Runnable(this) {
                final /* synthetic */ ar a;

                {
                    this.a = r1;
                }

                public void run() {
                    View i = this.a.i();
                    if (i != null && i.getWindowToken() != null) {
                        this.a.d();
                    }
                }
            };
            this.c = a(context, !this.H);
            if (this.y != null) {
                this.c.setSelector(this.y);
            }
            this.c.setAdapter(this.j);
            this.c.setOnItemClickListener(this.z);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new OnItemSelectedListener(this) {
                final /* synthetic */ ar a;

                {
                    this.a = r1;
                }

                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    if (i != -1) {
                        ak akVar = this.a.c;
                        if (akVar != null) {
                            akVar.setListSelectionHidden(false);
                        }
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            });
            this.c.setOnScrollListener(this.C);
            if (this.A != null) {
                this.c.setOnItemSelectedListener(this.A);
            }
            View view2 = this.c;
            View view3 = this.u;
            if (view3 != null) {
                View linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-1, 0, 1.0f);
                switch (this.v) {
                    case 0:
                        linearLayout.addView(view3);
                        linearLayout.addView(view2, layoutParams2);
                        break;
                    case 1:
                        linearLayout.addView(view2, layoutParams2);
                        linearLayout.addView(view3);
                        break;
                    default:
                        Log.e("ListPopupWindow", "Invalid hint position " + this.v);
                        break;
                }
                if (this.l >= 0) {
                    i = this.l;
                    i2 = Integer.MIN_VALUE;
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
            this.g.setContentView(view);
            i3 = i2;
        } else {
            ViewGroup viewGroup = (ViewGroup) this.g.getContentView();
            view = this.u;
            if (view != null) {
                layoutParams = (LayoutParams) view.getLayoutParams();
                i3 = layoutParams.bottomMargin + (view.getMeasuredHeight() + layoutParams.topMargin);
            } else {
                i3 = 0;
            }
        }
        Drawable background = this.g.getBackground();
        if (background != null) {
            background.getPadding(this.F);
            i2 = this.F.top + this.F.bottom;
            if (this.p) {
                i4 = i2;
            } else {
                this.n = -this.F.top;
                i4 = i2;
            }
        } else {
            this.F.setEmpty();
            i4 = 0;
        }
        if (this.g.getInputMethodMode() != 2) {
            z = false;
        }
        i = a(i(), this.n, z);
        if (this.s || this.k == -1) {
            return i + i4;
        }
        int makeMeasureSpec;
        switch (this.l) {
            case -2:
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.i.getResources().getDisplayMetrics().widthPixels - (this.F.left + this.F.right), Integer.MIN_VALUE);
                break;
            case -1:
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.i.getResources().getDisplayMetrics().widthPixels - (this.F.left + this.F.right), 1073741824);
                break;
            default:
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.l, 1073741824);
                break;
        }
        i2 = this.c.a(makeMeasureSpec, 0, -1, i - i3, -1);
        if (i2 > 0) {
            i3 += (this.c.getPaddingTop() + this.c.getPaddingBottom()) + i4;
        }
        return i2 + i3;
    }

    private void b(boolean z) {
        if (a != null) {
            try {
                a.invoke(this.g, new Object[]{Boolean.valueOf(z)});
            } catch (Exception e) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    ak a(Context context, boolean z) {
        return new ak(context, z);
    }

    public void a(int i) {
        this.v = i;
    }

    public void a(Rect rect) {
        this.G = rect;
    }

    public void a(Drawable drawable) {
        this.g.setBackgroundDrawable(drawable);
    }

    public void a(OnItemClickListener onItemClickListener) {
        this.z = onItemClickListener;
    }

    public void a(ListAdapter listAdapter) {
        if (this.w == null) {
            this.w = new b(this);
        } else if (this.j != null) {
            this.j.unregisterDataSetObserver(this.w);
        }
        this.j = listAdapter;
        if (this.j != null) {
            listAdapter.registerDataSetObserver(this.w);
        }
        if (this.c != null) {
            this.c.setAdapter(this.j);
        }
    }

    public void a(OnDismissListener onDismissListener) {
        this.g.setOnDismissListener(onDismissListener);
    }

    public void a(boolean z) {
        this.H = z;
        this.g.setFocusable(z);
    }

    public void b(int i) {
        this.g.setAnimationStyle(i);
    }

    public void b(View view) {
        this.x = view;
    }

    public void c(int i) {
        this.m = i;
    }

    public boolean c() {
        return this.H;
    }

    public void d() {
        boolean z = true;
        boolean z2 = false;
        int i = -1;
        int b = b();
        boolean n = n();
        q.a(this.g, this.o);
        if (this.g.isShowing()) {
            int i2;
            int width = this.l == -1 ? -1 : this.l == -2 ? i().getWidth() : this.l;
            if (this.k == -1) {
                if (!n) {
                    b = -1;
                }
                if (n) {
                    this.g.setWidth(this.l == -1 ? -1 : 0);
                    this.g.setHeight(0);
                    i2 = b;
                } else {
                    this.g.setWidth(this.l == -1 ? -1 : 0);
                    this.g.setHeight(-1);
                    i2 = b;
                }
            } else {
                i2 = this.k == -2 ? b : this.k;
            }
            PopupWindow popupWindow = this.g;
            if (!(this.t || this.s)) {
                z2 = true;
            }
            popupWindow.setOutsideTouchable(z2);
            popupWindow = this.g;
            View i3 = i();
            b = this.m;
            int i4 = this.n;
            if (width < 0) {
                width = -1;
            }
            if (i2 >= 0) {
                i = i2;
            }
            popupWindow.update(i3, b, i4, width, i);
            return;
        }
        int width2 = this.l == -1 ? -1 : this.l == -2 ? i().getWidth() : this.l;
        if (this.k == -1) {
            b = -1;
        } else if (this.k != -2) {
            b = this.k;
        }
        this.g.setWidth(width2);
        this.g.setHeight(b);
        b(true);
        popupWindow = this.g;
        if (this.t || this.s) {
            z = false;
        }
        popupWindow.setOutsideTouchable(z);
        this.g.setTouchInterceptor(this.B);
        if (h != null) {
            try {
                h.invoke(this.g, new Object[]{this.G});
            } catch (Throwable e) {
                Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
            }
        }
        q.a(this.g, i(), this.m, this.n, this.r);
        this.c.setSelection(-1);
        if (!this.H || this.c.isInTouchMode()) {
            m();
        }
        if (!this.H) {
            this.f.post(this.D);
        }
    }

    public void d(int i) {
        this.n = i;
        this.p = true;
    }

    public void e() {
        this.g.dismiss();
        a();
        this.g.setContentView(null);
        this.c = null;
        this.f.removeCallbacks(this.e);
    }

    public void e(int i) {
        this.r = i;
    }

    public void f(int i) {
        this.l = i;
    }

    public boolean f() {
        return this.g.isShowing();
    }

    public ListView g() {
        return this.c;
    }

    public void g(int i) {
        Drawable background = this.g.getBackground();
        if (background != null) {
            background.getPadding(this.F);
            this.l = (this.F.left + this.F.right) + i;
            return;
        }
        f(i);
    }

    public Drawable h() {
        return this.g.getBackground();
    }

    public void h(int i) {
        this.g.setInputMethodMode(i);
    }

    public View i() {
        return this.x;
    }

    public void i(int i) {
        ak akVar = this.c;
        if (f() && akVar != null) {
            akVar.setListSelectionHidden(false);
            akVar.setSelection(i);
            if (VERSION.SDK_INT >= 11 && akVar.getChoiceMode() != 0) {
                akVar.setItemChecked(i, true);
            }
        }
    }

    public int j() {
        return this.m;
    }

    public int k() {
        return !this.p ? 0 : this.n;
    }

    public int l() {
        return this.l;
    }

    public void m() {
        ak akVar = this.c;
        if (akVar != null) {
            akVar.setListSelectionHidden(true);
            akVar.requestLayout();
        }
    }

    public boolean n() {
        return this.g.getInputMethodMode() == 2;
    }
}
