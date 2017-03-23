package com.afollestad.materialdialogs.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.m;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.a.a;
import com.afollestad.materialdialogs.e;
import com.afollestad.materialdialogs.g;

public class MDRootLayout extends ViewGroup {
    private int a;
    private View b;
    private View c;
    private boolean d;
    private boolean e;
    private final MDButton[] f;
    private g g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private int n;
    private e o;
    private int p;
    private Paint q;
    private OnScrollChangedListener r;
    private OnScrollChangedListener s;
    private int t;

    public MDRootLayout(Context context) {
        super(context);
        this.d = false;
        this.e = false;
        this.f = new MDButton[3];
        this.g = g.ADAPTIVE;
        this.h = false;
        this.i = true;
        this.o = e.START;
        a(context, null, 0);
    }

    public MDRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = false;
        this.e = false;
        this.f = new MDButton[3];
        this.g = g.ADAPTIVE;
        this.h = false;
        this.i = true;
        this.o = e.START;
        a(context, attributeSet, 0);
    }

    @TargetApi(11)
    public MDRootLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = false;
        this.e = false;
        this.f = new MDButton[3];
        this.g = g.ADAPTIVE;
        this.h = false;
        this.i = true;
        this.o = e.START;
        a(context, attributeSet, i);
    }

    @TargetApi(21)
    public MDRootLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.d = false;
        this.e = false;
        this.f = new MDButton[3];
        this.g = g.ADAPTIVE;
        this.h = false;
        this.i = true;
        this.o = e.START;
        a(context, attributeSet, i);
    }

    private static View a(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.getBottom() == viewGroup.getMeasuredHeight()) {
                return childAt;
            }
        }
        return null;
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MDRootLayout, i, 0);
        this.j = obtainStyledAttributes.getBoolean(R.styleable.MDRootLayout_md_reduce_padding_no_title_no_buttons, true);
        obtainStyledAttributes.recycle();
        this.l = resources.getDimensionPixelSize(R.dimen.md_notitle_vertical_padding);
        this.m = resources.getDimensionPixelSize(R.dimen.md_button_frame_vertical_padding);
        this.p = resources.getDimensionPixelSize(R.dimen.md_button_padding_frame_side);
        this.n = resources.getDimensionPixelSize(R.dimen.md_button_height);
        this.q = new Paint();
        this.t = resources.getDimensionPixelSize(R.dimen.md_divider_height);
        this.q.setColor(a.a(context, R.attr.md_divider_color));
        setWillNotDraw(false);
    }

    private void a(final View view, final boolean z, final boolean z2) {
        if (view != null) {
            ViewGroup viewGroup;
            if (view instanceof ScrollView) {
                viewGroup = (ScrollView) view;
                if (a((ScrollView) viewGroup)) {
                    a(viewGroup, z, z2);
                    return;
                }
                if (z) {
                    this.d = false;
                }
                if (z2) {
                    this.e = false;
                }
            } else if (view instanceof AdapterView) {
                viewGroup = (AdapterView) view;
                if (a((AdapterView) viewGroup)) {
                    a(viewGroup, z, z2);
                    return;
                }
                if (z) {
                    this.d = false;
                }
                if (z2) {
                    this.e = false;
                }
            } else if (view instanceof WebView) {
                view.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener(this) {
                    final /* synthetic */ MDRootLayout d;

                    public boolean onPreDraw() {
                        if (view.getMeasuredHeight() != 0) {
                            if (MDRootLayout.b((WebView) view)) {
                                this.d.a((ViewGroup) view, z, z2);
                            } else {
                                if (z) {
                                    this.d.d = false;
                                }
                                if (z2) {
                                    this.d.e = false;
                                }
                            }
                            view.getViewTreeObserver().removeOnPreDrawListener(this);
                        }
                        return true;
                    }
                });
            } else if (view instanceof RecyclerView) {
                boolean a = a((RecyclerView) view);
                if (z) {
                    this.d = a;
                }
                if (z2) {
                    this.e = a;
                }
                if (a) {
                    a((ViewGroup) view, z, z2);
                }
            } else if (view instanceof ViewGroup) {
                View b = b((ViewGroup) view);
                a(b, z, z2);
                View a2 = a((ViewGroup) view);
                if (a2 != b) {
                    a(a2, false, true);
                }
            }
        }
    }

    private void a(final ViewGroup viewGroup, final boolean z, final boolean z2) {
        if ((!z2 && this.r == null) || (z2 && this.s == null)) {
            if (viewGroup instanceof RecyclerView) {
                m anonymousClass2 = new m(this) {
                    final /* synthetic */ MDRootLayout d;

                    public void a(RecyclerView recyclerView, int i, int i2) {
                        boolean z = false;
                        super.a(recyclerView, i, i2);
                        for (MDButton mDButton : this.d.f) {
                            if (mDButton != null && mDButton.getVisibility() != 8) {
                                z = true;
                                break;
                            }
                        }
                        this.d.a(viewGroup, z, z2, z);
                        this.d.invalidate();
                    }
                };
                ((RecyclerView) viewGroup).a(anonymousClass2);
                anonymousClass2.a((RecyclerView) viewGroup, 0, 0);
                return;
            }
            OnScrollChangedListener anonymousClass3 = new OnScrollChangedListener(this) {
                final /* synthetic */ MDRootLayout d;

                public void onScrollChanged() {
                    boolean z;
                    for (MDButton mDButton : this.d.f) {
                        if (mDButton != null && mDButton.getVisibility() != 8) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                    if (viewGroup instanceof WebView) {
                        this.d.a((WebView) viewGroup, z, z2, z);
                    } else {
                        this.d.a(viewGroup, z, z2, z);
                    }
                    this.d.invalidate();
                }
            };
            if (z2) {
                this.s = anonymousClass3;
                viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.s);
            } else {
                this.r = anonymousClass3;
                viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.r);
            }
            anonymousClass3.onScrollChanged();
        }
    }

    private void a(ViewGroup viewGroup, boolean z, boolean z2, boolean z3) {
        boolean z4 = true;
        if (z && viewGroup.getChildCount() > 0) {
            boolean z5 = (this.b == null || this.b.getVisibility() == 8 || viewGroup.getScrollY() + viewGroup.getPaddingTop() <= viewGroup.getChildAt(0).getTop()) ? false : true;
            this.d = z5;
        }
        if (z2 && viewGroup.getChildCount() > 0) {
            if (!z3 || (viewGroup.getScrollY() + viewGroup.getHeight()) - viewGroup.getPaddingBottom() >= viewGroup.getChildAt(viewGroup.getChildCount() - 1).getBottom()) {
                z4 = false;
            }
            this.e = z4;
        }
    }

    private void a(WebView webView, boolean z, boolean z2, boolean z3) {
        boolean z4 = true;
        if (z) {
            boolean z5 = (this.b == null || this.b.getVisibility() == 8 || webView.getScrollY() + webView.getPaddingTop() <= 0) ? false : true;
            this.d = z5;
        }
        if (z2) {
            if (!z3 || ((float) ((webView.getScrollY() + webView.getMeasuredHeight()) - webView.getPaddingBottom())) >= ((float) webView.getContentHeight()) * webView.getScale()) {
                z4 = false;
            }
            this.e = z4;
        }
    }

    public static boolean a(RecyclerView recyclerView) {
        return (recyclerView == null || recyclerView.getLayoutManager() == null || !recyclerView.getLayoutManager().e()) ? false : true;
    }

    private static boolean a(View view) {
        boolean z = (view == null || view.getVisibility() == 8) ? false : true;
        return (z && (view instanceof MDButton)) ? ((MDButton) view).getText().toString().trim().length() > 0 : z;
    }

    private static boolean a(AdapterView adapterView) {
        if (adapterView.getLastVisiblePosition() == -1) {
            return false;
        }
        return !(adapterView.getFirstVisiblePosition() == 0) || !(adapterView.getLastVisiblePosition() == adapterView.getCount() + -1) || adapterView.getChildCount() <= 0 || adapterView.getChildAt(0).getTop() < adapterView.getPaddingTop() || adapterView.getChildAt(adapterView.getChildCount() - 1).getBottom() > adapterView.getHeight() - adapterView.getPaddingBottom();
    }

    private static boolean a(ScrollView scrollView) {
        return scrollView.getChildCount() != 0 && (scrollView.getMeasuredHeight() - scrollView.getPaddingTop()) - scrollView.getPaddingBottom() < scrollView.getChildAt(0).getMeasuredHeight();
    }

    private static View b(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.getTop() == 0) {
                return childAt;
            }
        }
        return null;
    }

    private void b() {
        if (VERSION.SDK_INT >= 17 && getResources().getConfiguration().getLayoutDirection() == 1) {
            switch (this.o) {
                case START:
                    this.o = e.END;
                    return;
                case END:
                    this.o = e.START;
                    return;
                default:
                    return;
            }
        }
    }

    private static boolean b(WebView webView) {
        return ((float) webView.getMeasuredHeight()) < ((float) webView.getContentHeight()) * webView.getScale();
    }

    public void a() {
        this.k = true;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c != null) {
            int top;
            if (this.d) {
                top = this.c.getTop();
                canvas.drawRect(0.0f, (float) (top - this.t), (float) getMeasuredWidth(), (float) top, this.q);
            }
            if (this.e) {
                top = this.c.getBottom();
                canvas.drawRect(0.0f, (float) top, (float) getMeasuredWidth(), (float) (top + this.t), this.q);
            }
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() == R.id.md_titleFrame) {
                this.b = childAt;
            } else if (childAt.getId() == R.id.md_buttonDefaultNeutral) {
                this.f[0] = (MDButton) childAt;
            } else if (childAt.getId() == R.id.md_buttonDefaultNegative) {
                this.f[1] = (MDButton) childAt;
            } else if (childAt.getId() == R.id.md_buttonDefaultPositive) {
                this.f[2] = (MDButton) childAt;
            } else {
                this.c = childAt;
            }
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (a(this.b)) {
            int measuredHeight = this.b.getMeasuredHeight();
            this.b.layout(i, i2, i3, i2 + measuredHeight);
            i2 += measuredHeight;
        } else if (!this.k && this.i) {
            i2 += this.l;
        }
        if (a(this.c)) {
            this.c.layout(i, i2, i3, this.c.getMeasuredHeight() + i2);
        }
        int i5;
        if (this.h) {
            measuredHeight = i4 - this.m;
            for (View view : this.f) {
                if (a(view)) {
                    view.layout(i, measuredHeight - view.getMeasuredHeight(), i3, measuredHeight);
                    measuredHeight -= view.getMeasuredHeight();
                }
            }
        } else {
            int i6;
            if (this.i) {
                i4 -= this.m;
            }
            int i7 = i4 - this.n;
            int i8 = this.p;
            if (a(this.f[2])) {
                if (this.o == e.END) {
                    i5 = i + i8;
                    measuredHeight = this.f[2].getMeasuredWidth() + i5;
                    i6 = -1;
                } else {
                    measuredHeight = i3 - i8;
                    i5 = measuredHeight - this.f[2].getMeasuredWidth();
                    i6 = i5;
                }
                this.f[2].layout(i5, i7, measuredHeight, i4);
                measuredHeight = this.f[2].getMeasuredWidth() + i8;
            } else {
                i6 = -1;
                measuredHeight = i8;
            }
            if (a(this.f[1])) {
                if (this.o == e.END) {
                    i5 = i + measuredHeight;
                    measuredHeight = this.f[1].getMeasuredWidth() + i5;
                    i8 = -1;
                } else if (this.o == e.START) {
                    measuredHeight = i3 - measuredHeight;
                    i5 = measuredHeight - this.f[1].getMeasuredWidth();
                    i8 = -1;
                } else {
                    i5 = i + this.p;
                    measuredHeight = this.f[1].getMeasuredWidth() + i5;
                    i8 = measuredHeight;
                }
                this.f[1].layout(i5, i7, measuredHeight, i4);
            } else {
                i8 = -1;
            }
            if (a(this.f[0])) {
                if (this.o == e.END) {
                    i6 = i3 - this.p;
                    i8 = i6 - this.f[0].getMeasuredWidth();
                } else if (this.o == e.START) {
                    i8 = i + this.p;
                    i6 = i8 + this.f[0].getMeasuredWidth();
                } else if (i8 == -1 && i6 != -1) {
                    i8 = i6 - this.f[0].getMeasuredWidth();
                } else if (i6 == -1 && i8 != -1) {
                    i6 = i8 + this.f[0].getMeasuredWidth();
                } else if (i6 == -1) {
                    i8 = ((i3 - i) / 2) - (this.f[0].getMeasuredWidth() / 2);
                    i6 = i8 + this.f[0].getMeasuredWidth();
                }
                this.f[0].layout(i8, i7, i6, i4);
            }
        }
        a(this.c, true, true);
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (size2 > this.a) {
            size2 = this.a;
        }
        this.i = true;
        if (this.g == g.ALWAYS) {
            z = true;
            i3 = 0;
        } else if (this.g == g.NEVER) {
            z = false;
            i3 = 0;
        } else {
            i4 = 0;
            i3 = 0;
            for (View view : this.f) {
                if (view != null && a(view)) {
                    view.a(false, false);
                    measureChild(view, i, i2);
                    i4 += view.getMeasuredWidth();
                    i3 = true;
                }
            }
            z = i4 > size - (getContext().getResources().getDimensionPixelSize(R.dimen.md_neutral_button_margin) * 2);
        }
        this.h = z;
        if (z) {
            i4 = 0;
            for (View view2 : this.f) {
                if (view2 != null && a(view2)) {
                    view2.a(true, false);
                    measureChild(view2, i, i2);
                    i4 += view2.getMeasuredHeight();
                    i3 = true;
                }
            }
            i6 = i3;
        } else {
            i4 = 0;
            i6 = i3;
        }
        if (i6 == 0) {
            i3 = (this.m * 2) + 0;
            i5 = size2;
            i4 = 0;
        } else if (this.h) {
            i5 = size2 - i4;
            i3 = 0 + (this.m * 2);
            i4 = (this.m * 2) + 0;
        } else {
            i5 = size2 - this.n;
            i3 = (this.m * 2) + 0;
            i4 = 0;
        }
        if (a(this.b)) {
            this.b.measure(MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
            i5 -= this.b.getMeasuredHeight();
        } else if (!this.k) {
            i3 += this.l;
        }
        if (a(this.c)) {
            this.c.measure(MeasureSpec.makeMeasureSpec(size, 1073741824), MeasureSpec.makeMeasureSpec(i5 - i4, Integer.MIN_VALUE));
            if (this.c.getMeasuredHeight() > i5 - i3) {
                this.i = false;
            } else if (this.j && !a(this.b) && i6 == 0) {
                this.i = false;
                i7 = i5 - (i4 + this.c.getMeasuredHeight());
            } else {
                this.i = true;
                i7 = i5 - (this.c.getMeasuredHeight() + i3);
            }
        } else {
            i7 = i5;
        }
        setMeasuredDimension(size, size2 - i7);
    }

    public void setButtonGravity(e eVar) {
        this.o = eVar;
        b();
    }

    public void setButtonStackedGravity(e eVar) {
        for (MDButton mDButton : this.f) {
            if (mDButton != null) {
                mDButton.setStackedGravity(eVar);
            }
        }
    }

    public void setDividerColor(int i) {
        this.q.setColor(i);
        invalidate();
    }

    public void setMaxHeight(int i) {
        this.a = i;
    }

    public void setStackingBehavior(g gVar) {
        this.g = gVar;
        invalidate();
    }
}
