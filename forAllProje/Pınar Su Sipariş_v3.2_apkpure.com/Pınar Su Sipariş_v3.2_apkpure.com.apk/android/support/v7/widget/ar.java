package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.az;
import android.support.v4.view.bd;
import android.support.v7.app.ActionBar.Tab;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.internal.zzamj;

/* compiled from: ScrollingTabContainerView */
public class ar extends HorizontalScrollView implements OnItemSelectedListener {
    private static final Interpolator l = new DecelerateInterpolator();
    Runnable a;
    int b;
    int c;
    protected az d;
    protected final d e = new d(this);
    private b f;
    private ai g;
    private Spinner h;
    private boolean i;
    private int j;
    private int k;

    /* compiled from: ScrollingTabContainerView */
    private class a extends BaseAdapter {
        final /* synthetic */ ar a;

        private a(ar arVar) {
            this.a = arVar;
        }

        public int getCount() {
            return this.a.g.getChildCount();
        }

        public Object getItem(int i) {
            return ((c) this.a.g.getChildAt(i)).b();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return this.a.b((Tab) getItem(i), true);
            }
            ((c) view).a((Tab) getItem(i));
            return view;
        }
    }

    /* compiled from: ScrollingTabContainerView */
    private class b implements OnClickListener {
        final /* synthetic */ ar a;

        private b(ar arVar) {
            this.a = arVar;
        }

        public void onClick(View view) {
            ((c) view).b().select();
            int childCount = this.a.g.getChildCount();
            for (int i = 0; i < childCount; i++) {
                boolean z;
                View childAt = this.a.g.getChildAt(i);
                if (childAt == view) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
            }
        }
    }

    /* compiled from: ScrollingTabContainerView */
    private class c extends ai implements OnLongClickListener {
        final /* synthetic */ ar a;
        private final int[] b = new int[]{16842964};
        private Tab c;
        private TextView d;
        private ImageView e;
        private View f;

        public c(ar arVar, Context context, Tab tab, boolean z) {
            this.a = arVar;
            super(context, null, android.support.v7.a.a.a.actionBarTabStyle);
            this.c = tab;
            az a = az.a(context, null, this.b, android.support.v7.a.a.a.actionBarTabStyle, 0);
            if (a.f(0)) {
                setBackgroundDrawable(a.a(0));
            }
            a.a();
            if (z) {
                setGravity(8388627);
            }
            a();
        }

        public void a(Tab tab) {
            this.c = tab;
            a();
        }

        public void setSelected(boolean z) {
            Object obj = isSelected() != z ? 1 : null;
            super.setSelected(z);
            if (obj != null && z) {
                sendAccessibilityEvent(4);
            }
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(Tab.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (VERSION.SDK_INT >= 14) {
                accessibilityNodeInfo.setClassName(Tab.class.getName());
            }
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.a.b > 0 && getMeasuredWidth() > this.a.b) {
                super.onMeasure(MeasureSpec.makeMeasureSpec(this.a.b, 1073741824), i2);
            }
        }

        public void a() {
            Tab tab = this.c;
            View customView = tab.getCustomView();
            if (customView != null) {
                c parent = customView.getParent();
                if (parent != this) {
                    if (parent != null) {
                        parent.removeView(customView);
                    }
                    addView(customView);
                }
                this.f = customView;
                if (this.d != null) {
                    this.d.setVisibility(8);
                }
                if (this.e != null) {
                    this.e.setVisibility(8);
                    this.e.setImageDrawable(null);
                    return;
                }
                return;
            }
            boolean z;
            if (this.f != null) {
                removeView(this.f);
                this.f = null;
            }
            Drawable icon = tab.getIcon();
            CharSequence text = tab.getText();
            if (icon != null) {
                if (this.e == null) {
                    View imageView = new ImageView(getContext());
                    LayoutParams aVar = new android.support.v7.widget.ai.a(-2, -2);
                    aVar.h = 16;
                    imageView.setLayoutParams(aVar);
                    addView(imageView, 0);
                    this.e = imageView;
                }
                this.e.setImageDrawable(icon);
                this.e.setVisibility(0);
            } else if (this.e != null) {
                this.e.setVisibility(8);
                this.e.setImageDrawable(null);
            }
            if (TextUtils.isEmpty(text)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (this.d == null) {
                    imageView = new aa(getContext(), null, android.support.v7.a.a.a.actionBarTabTextStyle);
                    imageView.setEllipsize(TruncateAt.END);
                    aVar = new android.support.v7.widget.ai.a(-2, -2);
                    aVar.h = 16;
                    imageView.setLayoutParams(aVar);
                    addView(imageView);
                    this.d = imageView;
                }
                this.d.setText(text);
                this.d.setVisibility(0);
            } else if (this.d != null) {
                this.d.setVisibility(8);
                this.d.setText(null);
            }
            if (this.e != null) {
                this.e.setContentDescription(tab.getContentDescription());
            }
            if (z || TextUtils.isEmpty(tab.getContentDescription())) {
                setOnLongClickListener(null);
                setLongClickable(false);
                return;
            }
            setOnLongClickListener(this);
        }

        public boolean onLongClick(View view) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            Context context = getContext();
            int width = getWidth();
            int height = getHeight();
            int i = context.getResources().getDisplayMetrics().widthPixels;
            Toast makeText = Toast.makeText(context, this.c.getContentDescription(), 0);
            makeText.setGravity(49, (iArr[0] + (width / 2)) - (i / 2), height);
            makeText.show();
            return true;
        }

        public Tab b() {
            return this.c;
        }
    }

    /* compiled from: ScrollingTabContainerView */
    protected class d implements bd {
        final /* synthetic */ ar a;
        private boolean b = false;
        private int c;

        protected d(ar arVar) {
            this.a = arVar;
        }

        public void onAnimationStart(View view) {
            this.a.setVisibility(0);
            this.b = false;
        }

        public void onAnimationEnd(View view) {
            if (!this.b) {
                this.a.d = null;
                this.a.setVisibility(this.c);
            }
        }

        public void onAnimationCancel(View view) {
            this.b = true;
        }
    }

    public ar(Context context) {
        super(context);
        setHorizontalScrollBarEnabled(false);
        android.support.v7.view.a a = android.support.v7.view.a.a(context);
        setContentHeight(a.e());
        this.c = a.g();
        this.g = e();
        addView(this.g, new LayoutParams(-2, -1));
    }

    public void onMeasure(int i, int i2) {
        int i3 = 1;
        int mode = MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.g.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == zzamj.UNSET_ENUM_VALUE)) {
            this.b = -1;
        } else {
            if (childCount > 2) {
                this.b = (int) (((float) MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.b = MeasureSpec.getSize(i) / 2;
            }
            this.b = Math.min(this.b, this.c);
        }
        mode = MeasureSpec.makeMeasureSpec(this.j, 1073741824);
        if (z || !this.i) {
            i3 = 0;
        }
        if (i3 != 0) {
            this.g.measure(0, mode);
            if (this.g.getMeasuredWidth() > MeasureSpec.getSize(i)) {
                c();
            } else {
                d();
            }
        } else {
            d();
        }
        i3 = getMeasuredWidth();
        super.onMeasure(i, mode);
        int measuredWidth = getMeasuredWidth();
        if (z && i3 != measuredWidth) {
            setTabSelected(this.k);
        }
    }

    private boolean b() {
        return this.h != null && this.h.getParent() == this;
    }

    public void setAllowCollapse(boolean z) {
        this.i = z;
    }

    private void c() {
        if (!b()) {
            if (this.h == null) {
                this.h = f();
            }
            removeView(this.g);
            addView(this.h, new LayoutParams(-2, -1));
            if (this.h.getAdapter() == null) {
                this.h.setAdapter(new a());
            }
            if (this.a != null) {
                removeCallbacks(this.a);
                this.a = null;
            }
            this.h.setSelection(this.k);
        }
    }

    private boolean d() {
        if (b()) {
            removeView(this.h);
            addView(this.g, new LayoutParams(-2, -1));
            setTabSelected(this.h.getSelectedItemPosition());
        }
        return false;
    }

    public void setTabSelected(int i) {
        this.k = i;
        int childCount = this.g.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            boolean z;
            View childAt = this.g.getChildAt(i2);
            if (i2 == i) {
                z = true;
            } else {
                z = false;
            }
            childAt.setSelected(z);
            if (z) {
                a(i);
            }
        }
        if (this.h != null && i >= 0) {
            this.h.setSelection(i);
        }
    }

    public void setContentHeight(int i) {
        this.j = i;
        requestLayout();
    }

    private ai e() {
        ai aiVar = new ai(getContext(), null, android.support.v7.a.a.a.actionBarTabBarStyle);
        aiVar.setMeasureWithLargestChildEnabled(true);
        aiVar.setGravity(17);
        aiVar.setLayoutParams(new android.support.v7.widget.ai.a(-2, -1));
        return aiVar;
    }

    private Spinner f() {
        Spinner xVar = new x(getContext(), null, android.support.v7.a.a.a.actionDropDownStyle);
        xVar.setLayoutParams(new android.support.v7.widget.ai.a(-2, -1));
        xVar.setOnItemSelectedListener(this);
        return xVar;
    }

    protected void onConfigurationChanged(Configuration configuration) {
        if (VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        android.support.v7.view.a a = android.support.v7.view.a.a(getContext());
        setContentHeight(a.e());
        this.c = a.g();
    }

    public void a(int i) {
        final View childAt = this.g.getChildAt(i);
        if (this.a != null) {
            removeCallbacks(this.a);
        }
        this.a = new Runnable(this) {
            final /* synthetic */ ar b;

            public void run() {
                this.b.smoothScrollTo(childAt.getLeft() - ((this.b.getWidth() - childAt.getWidth()) / 2), 0);
                this.b.a = null;
            }
        };
        post(this.a);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a != null) {
            post(this.a);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a != null) {
            removeCallbacks(this.a);
        }
    }

    private c b(Tab tab, boolean z) {
        c cVar = new c(this, getContext(), tab, z);
        if (z) {
            cVar.setBackgroundDrawable(null);
            cVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.j));
        } else {
            cVar.setFocusable(true);
            if (this.f == null) {
                this.f = new b();
            }
            cVar.setOnClickListener(this.f);
        }
        return cVar;
    }

    public void a(Tab tab, boolean z) {
        View b = b(tab, false);
        this.g.addView(b, new android.support.v7.widget.ai.a(0, -1, TextTrackStyle.DEFAULT_FONT_SCALE));
        if (this.h != null) {
            ((a) this.h.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            b.setSelected(true);
        }
        if (this.i) {
            requestLayout();
        }
    }

    public void a(Tab tab, int i, boolean z) {
        View b = b(tab, false);
        this.g.addView(b, i, new android.support.v7.widget.ai.a(0, -1, TextTrackStyle.DEFAULT_FONT_SCALE));
        if (this.h != null) {
            ((a) this.h.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            b.setSelected(true);
        }
        if (this.i) {
            requestLayout();
        }
    }

    public void b(int i) {
        ((c) this.g.getChildAt(i)).a();
        if (this.h != null) {
            ((a) this.h.getAdapter()).notifyDataSetChanged();
        }
        if (this.i) {
            requestLayout();
        }
    }

    public void c(int i) {
        this.g.removeViewAt(i);
        if (this.h != null) {
            ((a) this.h.getAdapter()).notifyDataSetChanged();
        }
        if (this.i) {
            requestLayout();
        }
    }

    public void a() {
        this.g.removeAllViews();
        if (this.h != null) {
            ((a) this.h.getAdapter()).notifyDataSetChanged();
        }
        if (this.i) {
            requestLayout();
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((c) view).b().select();
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
