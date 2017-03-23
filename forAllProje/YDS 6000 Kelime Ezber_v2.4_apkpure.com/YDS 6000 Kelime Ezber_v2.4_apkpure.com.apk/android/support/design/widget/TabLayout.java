package android.support.design.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.R;
import android.support.v4.view.ViewPager;
import android.support.v4.view.aa;
import android.support.v4.view.ab;
import android.support.v4.view.ah;
import android.support.v4.widget.x;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@android.support.v4.view.ViewPager.a
public class TabLayout extends HorizontalScrollView {
    private static final android.support.v4.i.j.a<e> n = new android.support.v4.i.j.c(16);
    private DataSetObserver A;
    private f B;
    private a C;
    private boolean D;
    private final android.support.v4.i.j.a<g> E;
    int a;
    int b;
    int c;
    int d;
    int e;
    ColorStateList f;
    float g;
    float h;
    final int i;
    int j;
    int k;
    int l;
    ViewPager m;
    private final ArrayList<e> o;
    private e p;
    private final d q;
    private final int r;
    private final int s;
    private final int t;
    private int u;
    private b v;
    private final ArrayList<b> w;
    private b x;
    private s y;
    private aa z;

    private class a implements android.support.v4.view.ViewPager.e {
        final /* synthetic */ TabLayout a;
        private boolean b;

        a(TabLayout tabLayout) {
            this.a = tabLayout;
        }

        public void a(ViewPager viewPager, aa aaVar, aa aaVar2) {
            if (this.a.m == viewPager) {
                this.a.a(aaVar2, this.b);
            }
        }

        void a(boolean z) {
            this.b = z;
        }
    }

    public interface b {
        void a(e eVar);

        void b(e eVar);

        void c(e eVar);
    }

    private class c extends DataSetObserver {
        final /* synthetic */ TabLayout a;

        c(TabLayout tabLayout) {
            this.a = tabLayout;
        }

        public void onChanged() {
            this.a.c();
        }

        public void onInvalidated() {
            this.a.c();
        }
    }

    private class d extends LinearLayout {
        int a = -1;
        float b;
        final /* synthetic */ TabLayout c;
        private int d;
        private final Paint e;
        private int f = -1;
        private int g = -1;
        private s h;

        d(TabLayout tabLayout, Context context) {
            this.c = tabLayout;
            super(context);
            setWillNotDraw(false);
            this.e = new Paint();
        }

        private void c() {
            int i;
            int i2;
            View childAt = getChildAt(this.a);
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
                i2 = -1;
            } else {
                i2 = childAt.getLeft();
                i = childAt.getRight();
                if (this.b > 0.0f && this.a < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.a + 1);
                    i2 = (int) ((((float) i2) * (1.0f - this.b)) + (this.b * ((float) childAt2.getLeft())));
                    i = (int) ((((float) i) * (1.0f - this.b)) + (((float) childAt2.getRight()) * this.b));
                }
            }
            a(i2, i);
        }

        void a(int i) {
            if (this.e.getColor() != i) {
                this.e.setColor(i);
                ah.d(this);
            }
        }

        void a(int i, float f) {
            if (this.h != null && this.h.b()) {
                this.h.d();
            }
            this.a = i;
            this.b = f;
            c();
        }

        void a(int i, int i2) {
            if (i != this.f || i2 != this.g) {
                this.f = i;
                this.g = i2;
                ah.d(this);
            }
        }

        boolean a() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        float b() {
            return ((float) this.a) + this.b;
        }

        void b(int i) {
            if (this.d != i) {
                this.d = i;
                ah.d(this);
            }
        }

        void b(final int i, int i2) {
            if (this.h != null && this.h.b()) {
                this.h.d();
            }
            Object obj = ah.h(this) == 1 ? 1 : null;
            View childAt = getChildAt(i);
            if (childAt == null) {
                c();
                return;
            }
            int i3;
            int i4;
            final int left = childAt.getLeft();
            final int right = childAt.getRight();
            if (Math.abs(i - this.a) <= 1) {
                i3 = this.f;
                i4 = this.g;
            } else {
                int b = this.c.b(24);
                if (i < this.a) {
                    if (obj != null) {
                        i4 = left - b;
                        i3 = i4;
                    } else {
                        i4 = right + b;
                        i3 = i4;
                    }
                } else if (obj != null) {
                    i4 = right + b;
                    i3 = i4;
                } else {
                    i4 = left - b;
                    i3 = i4;
                }
            }
            if (i3 != left || i4 != right) {
                s a = z.a();
                this.h = a;
                a.a(a.b);
                a.a((long) i2);
                a.a(0.0f, 1.0f);
                a.a(new c(this) {
                    final /* synthetic */ d e;

                    public void a(s sVar) {
                        float e = sVar.e();
                        this.e.a(a.a(i3, left, e), a.a(i4, right, e));
                    }
                });
                a.a(new b(this) {
                    final /* synthetic */ d b;

                    public void b(s sVar) {
                        this.b.a = i;
                        this.b.b = 0.0f;
                    }
                });
                a.a();
            }
        }

        public void draw(Canvas canvas) {
            super.draw(canvas);
            if (this.f >= 0 && this.g > this.f) {
                canvas.drawRect((float) this.f, (float) (getHeight() - this.d), (float) this.g, (float) getHeight(), this.e);
            }
        }

        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.h == null || !this.h.b()) {
                c();
                return;
            }
            this.h.d();
            b(this.a, Math.round(((float) this.h.g()) * (1.0f - this.h.e())));
        }

        protected void onMeasure(int i, int i2) {
            boolean z = false;
            super.onMeasure(i, i2);
            if (MeasureSpec.getMode(i) == 1073741824 && this.c.l == 1 && this.c.k == 1) {
                int childCount = getChildCount();
                int i3 = 0;
                int i4 = 0;
                while (i3 < childCount) {
                    View childAt = getChildAt(i3);
                    i3++;
                    i4 = childAt.getVisibility() == 0 ? Math.max(i4, childAt.getMeasuredWidth()) : i4;
                }
                if (i4 > 0) {
                    if (i4 * childCount <= getMeasuredWidth() - (this.c.b(16) * 2)) {
                        i3 = 0;
                        while (i3 < childCount) {
                            boolean z2;
                            LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                            if (layoutParams.width == i4 && layoutParams.weight == 0.0f) {
                                z2 = z;
                            } else {
                                layoutParams.width = i4;
                                layoutParams.weight = 0.0f;
                                z2 = true;
                            }
                            i3++;
                            z = z2;
                        }
                    } else {
                        this.c.k = 0;
                        this.c.a(false);
                        z = true;
                    }
                    if (z) {
                        super.onMeasure(i, i2);
                    }
                }
            }
        }
    }

    public static final class e {
        TabLayout a;
        g b;
        private Object c;
        private Drawable d;
        private CharSequence e;
        private CharSequence f;
        private int g = -1;
        private View h;

        e() {
        }

        public e a(int i) {
            return a(LayoutInflater.from(this.b.getContext()).inflate(i, this.b, false));
        }

        public e a(Drawable drawable) {
            this.d = drawable;
            h();
            return this;
        }

        public e a(View view) {
            this.h = view;
            h();
            return this;
        }

        public e a(CharSequence charSequence) {
            this.e = charSequence;
            h();
            return this;
        }

        public View a() {
            return this.h;
        }

        public Drawable b() {
            return this.d;
        }

        public e b(CharSequence charSequence) {
            this.f = charSequence;
            h();
            return this;
        }

        void b(int i) {
            this.g = i;
        }

        public int c() {
            return this.g;
        }

        public CharSequence d() {
            return this.e;
        }

        public void e() {
            if (this.a == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            this.a.b(this);
        }

        public boolean f() {
            if (this.a != null) {
                return this.a.getSelectedTabPosition() == this.g;
            } else {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
        }

        public CharSequence g() {
            return this.f;
        }

        void h() {
            if (this.b != null) {
                this.b.b();
            }
        }

        void i() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = -1;
            this.h = null;
        }
    }

    public static class f implements android.support.v4.view.ViewPager.f {
        private final WeakReference<TabLayout> a;
        private int b;
        private int c;

        public f(TabLayout tabLayout) {
            this.a = new WeakReference(tabLayout);
        }

        void a() {
            this.c = 0;
            this.b = 0;
        }

        public void a(int i) {
            this.b = this.c;
            this.c = i;
        }

        public void a(int i, float f, int i2) {
            boolean z = false;
            TabLayout tabLayout = (TabLayout) this.a.get();
            if (tabLayout != null) {
                boolean z2 = this.c != 2 || this.b == 1;
                if (!(this.c == 2 && this.b == 0)) {
                    z = true;
                }
                tabLayout.a(i, f, z2, z);
            }
        }

        public void b(int i) {
            TabLayout tabLayout = (TabLayout) this.a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                boolean z = this.c == 0 || (this.c == 2 && this.b == 0);
                tabLayout.b(tabLayout.a(i), z);
            }
        }
    }

    class g extends LinearLayout implements OnLongClickListener {
        final /* synthetic */ TabLayout a;
        private e b;
        private TextView c;
        private ImageView d;
        private View e;
        private TextView f;
        private ImageView g;
        private int h = 2;

        public g(TabLayout tabLayout, Context context) {
            this.a = tabLayout;
            super(context);
            if (tabLayout.i != 0) {
                ah.a((View) this, android.support.v7.a.a.b.b(context, tabLayout.i));
            }
            ah.a(this, tabLayout.a, tabLayout.b, tabLayout.c, tabLayout.d);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            ah.a((View) this, ab.a(getContext(), 1002));
        }

        private float a(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        private void a(TextView textView, ImageView imageView) {
            Drawable b = this.b != null ? this.b.b() : null;
            CharSequence d = this.b != null ? this.b.d() : null;
            CharSequence g = this.b != null ? this.b.g() : null;
            if (imageView != null) {
                if (b != null) {
                    imageView.setImageDrawable(b);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
                imageView.setContentDescription(g);
            }
            boolean z = !TextUtils.isEmpty(d);
            if (textView != null) {
                if (z) {
                    textView.setText(d);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText(null);
                }
                textView.setContentDescription(g);
            }
            if (imageView != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) imageView.getLayoutParams();
                int b2 = (z && imageView.getVisibility() == 0) ? this.a.b(8) : 0;
                if (b2 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = b2;
                    imageView.requestLayout();
                }
            }
            if (z || TextUtils.isEmpty(g)) {
                setOnLongClickListener(null);
                setLongClickable(false);
                return;
            }
            setOnLongClickListener(this);
        }

        void a() {
            a(null);
            setSelected(false);
        }

        void a(e eVar) {
            if (eVar != this.b) {
                this.b = eVar;
                b();
            }
        }

        final void b() {
            e eVar = this.b;
            View a = eVar != null ? eVar.a() : null;
            if (a != null) {
                g parent = a.getParent();
                if (parent != this) {
                    if (parent != null) {
                        parent.removeView(a);
                    }
                    addView(a);
                }
                this.e = a;
                if (this.c != null) {
                    this.c.setVisibility(8);
                }
                if (this.d != null) {
                    this.d.setVisibility(8);
                    this.d.setImageDrawable(null);
                }
                this.f = (TextView) a.findViewById(16908308);
                if (this.f != null) {
                    this.h = x.a(this.f);
                }
                this.g = (ImageView) a.findViewById(16908294);
            } else {
                if (this.e != null) {
                    removeView(this.e);
                    this.e = null;
                }
                this.f = null;
                this.g = null;
            }
            if (this.e == null) {
                if (this.d == null) {
                    ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, this, false);
                    addView(imageView, 0);
                    this.d = imageView;
                }
                if (this.c == null) {
                    TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, this, false);
                    addView(textView);
                    this.c = textView;
                    this.h = x.a(this.c);
                }
                x.a(this.c, this.a.e);
                if (this.a.f != null) {
                    this.c.setTextColor(this.a.f);
                }
                a(this.c, this.d);
            } else if (!(this.f == null && this.g == null)) {
                a(this.f, this.g);
            }
            boolean z = eVar != null && eVar.f();
            setSelected(z);
        }

        @TargetApi(14)
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(android.support.v7.app.a.c.class.getName());
        }

        @TargetApi(14)
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(android.support.v7.app.a.c.class.getName());
        }

        public boolean onLongClick(View view) {
            int[] iArr = new int[2];
            Rect rect = new Rect();
            getLocationOnScreen(iArr);
            getWindowVisibleDisplayFrame(rect);
            Context context = getContext();
            int width = getWidth();
            int height = getHeight();
            int i = iArr[1] + (height / 2);
            width = (width / 2) + iArr[0];
            if (ah.h(view) == 0) {
                width = context.getResources().getDisplayMetrics().widthPixels - width;
            }
            Toast makeText = Toast.makeText(context, this.b.g(), 0);
            if (i < rect.height()) {
                makeText.setGravity(8388661, width, (iArr[1] + height) - rect.top);
            } else {
                makeText.setGravity(81, 0, height);
            }
            makeText.show();
            return true;
        }

        public void onMeasure(int i, int i2) {
            int i3 = 1;
            int size = MeasureSpec.getSize(i);
            int mode = MeasureSpec.getMode(i);
            int tabMaxWidth = this.a.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = MeasureSpec.makeMeasureSpec(this.a.j, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.c != null) {
                getResources();
                float f = this.a.g;
                size = this.h;
                if (this.d != null && this.d.getVisibility() == 0) {
                    size = 1;
                } else if (this.c != null && this.c.getLineCount() > 1) {
                    f = this.a.h;
                }
                float textSize = this.c.getTextSize();
                int lineCount = this.c.getLineCount();
                int a = x.a(this.c);
                if (f != textSize || (a >= 0 && size != a)) {
                    if (this.a.l == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.c.getLayout();
                        if (layout == null || a(layout, 0, f) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) {
                            i3 = 0;
                        }
                    }
                    if (i3 != 0) {
                        this.c.setTextSize(0, f);
                        this.c.setMaxLines(size);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.b.e();
            return true;
        }

        public void setSelected(boolean z) {
            Object obj = isSelected() != z ? 1 : null;
            super.setSelected(z);
            if (obj != null && z && VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            if (this.c != null) {
                this.c.setSelected(z);
            }
            if (this.d != null) {
                this.d.setSelected(z);
            }
            if (this.e != null) {
                this.e.setSelected(z);
            }
        }
    }

    public static class h implements b {
        private final ViewPager a;

        public h(ViewPager viewPager) {
            this.a = viewPager;
        }

        public void a(e eVar) {
            this.a.setCurrentItem(eVar.c());
        }

        public void b(e eVar) {
        }

        public void c(e eVar) {
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = new ArrayList();
        this.j = Integer.MAX_VALUE;
        this.w = new ArrayList();
        this.E = new android.support.v4.i.j.b(12);
        r.a(context);
        setHorizontalScrollBarEnabled(false);
        this.q = new d(this, context);
        super.addView(this.q, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TabLayout, i, R.style.Widget_Design_TabLayout);
        this.q.b(obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabIndicatorHeight, 0));
        this.q.a(obtainStyledAttributes.getColor(R.styleable.TabLayout_tabIndicatorColor, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPadding, 0);
        this.d = dimensionPixelSize;
        this.c = dimensionPixelSize;
        this.b = dimensionPixelSize;
        this.a = dimensionPixelSize;
        this.a = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingStart, this.a);
        this.b = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingTop, this.b);
        this.c = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingEnd, this.c);
        this.d = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingBottom, this.d);
        this.e = obtainStyledAttributes.getResourceId(R.styleable.TabLayout_tabTextAppearance, R.style.TextAppearance_Design_Tab);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(this.e, android.support.v7.appcompat.R.styleable.TextAppearance);
        try {
            this.g = (float) obtainStyledAttributes2.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize, 0);
            this.f = obtainStyledAttributes2.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor);
            if (obtainStyledAttributes.hasValue(R.styleable.TabLayout_tabTextColor)) {
                this.f = obtainStyledAttributes.getColorStateList(R.styleable.TabLayout_tabTextColor);
            }
            if (obtainStyledAttributes.hasValue(R.styleable.TabLayout_tabSelectedTextColor)) {
                this.f = a(this.f.getDefaultColor(), obtainStyledAttributes.getColor(R.styleable.TabLayout_tabSelectedTextColor, 0));
            }
            this.r = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabMinWidth, -1);
            this.s = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabMaxWidth, -1);
            this.i = obtainStyledAttributes.getResourceId(R.styleable.TabLayout_tabBackground, 0);
            this.u = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabContentStart, 0);
            this.l = obtainStyledAttributes.getInt(R.styleable.TabLayout_tabMode, 1);
            this.k = obtainStyledAttributes.getInt(R.styleable.TabLayout_tabGravity, 0);
            obtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.h = (float) resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.t = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            f();
        } finally {
            obtainStyledAttributes2.recycle();
        }
    }

    private int a(int i, float f) {
        int i2 = 0;
        if (this.l != 0) {
            return 0;
        }
        View childAt = this.q.getChildAt(i);
        View childAt2 = i + 1 < this.q.getChildCount() ? this.q.getChildAt(i + 1) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i2 = childAt2.getWidth();
        }
        return ((((int) ((((float) (i2 + width)) * f) * 0.5f)) + childAt.getLeft()) + (childAt.getWidth() / 2)) - (getWidth() / 2);
    }

    private static ColorStateList a(int i, int i2) {
        r0 = new int[2][];
        int[] iArr = new int[]{SELECTED_STATE_SET, i2};
        r0[1] = EMPTY_STATE_SET;
        iArr[1] = i;
        return new ColorStateList(r0, iArr);
    }

    private void a(e eVar, int i) {
        eVar.b(i);
        this.o.add(i, eVar);
        int size = this.o.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            ((e) this.o.get(i2)).b(i2);
        }
    }

    private void a(q qVar) {
        e a = a();
        if (qVar.a != null) {
            a.a(qVar.a);
        }
        if (qVar.b != null) {
            a.a(qVar.b);
        }
        if (qVar.c != 0) {
            a.a(qVar.c);
        }
        if (!TextUtils.isEmpty(qVar.getContentDescription())) {
            a.b(qVar.getContentDescription());
        }
        a(a);
    }

    private void a(ViewPager viewPager, boolean z, boolean z2) {
        if (this.m != null) {
            if (this.B != null) {
                this.m.b(this.B);
            }
            if (this.C != null) {
                this.m.b(this.C);
            }
        }
        if (this.x != null) {
            b(this.x);
            this.x = null;
        }
        if (viewPager != null) {
            this.m = viewPager;
            if (this.B == null) {
                this.B = new f(this);
            }
            this.B.a();
            viewPager.a(this.B);
            this.x = new h(viewPager);
            a(this.x);
            aa adapter = viewPager.getAdapter();
            if (adapter != null) {
                a(adapter, z);
            }
            if (this.C == null) {
                this.C = new a(this);
            }
            this.C.a(z);
            viewPager.a(this.C);
            a(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.m = null;
            a(null, false);
        }
        this.D = z2;
    }

    private void a(View view) {
        if (view instanceof q) {
            a((q) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void a(LayoutParams layoutParams) {
        if (this.l == 1 && this.k == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    private g c(e eVar) {
        g gVar = this.E != null ? (g) this.E.a() : null;
        if (gVar == null) {
            gVar = new g(this, getContext());
        }
        gVar.a(eVar);
        gVar.setFocusable(true);
        gVar.setMinimumWidth(getTabMinWidth());
        return gVar;
    }

    private void c(int i) {
        g gVar = (g) this.q.getChildAt(i);
        this.q.removeViewAt(i);
        if (gVar != null) {
            gVar.a();
            this.E.a(gVar);
        }
        requestLayout();
    }

    private void d() {
        int size = this.o.size();
        for (int i = 0; i < size; i++) {
            ((e) this.o.get(i)).h();
        }
    }

    private void d(int i) {
        if (i != -1) {
            if (getWindowToken() == null || !ah.E(this) || this.q.a()) {
                a(i, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int a = a(i, 0.0f);
            if (scrollX != a) {
                if (this.y == null) {
                    this.y = z.a();
                    this.y.a(a.b);
                    this.y.a(300);
                    this.y.a(new c(this) {
                        final /* synthetic */ TabLayout a;

                        {
                            this.a = r1;
                        }

                        public void a(s sVar) {
                            this.a.scrollTo(sVar.c(), 0);
                        }
                    });
                }
                this.y.a(scrollX, a);
                this.y.a();
            }
            this.q.b(i, 300);
        }
    }

    private void d(e eVar) {
        this.q.addView(eVar.b, eVar.c(), e());
    }

    private LayoutParams e() {
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        a(layoutParams);
        return layoutParams;
    }

    private void e(e eVar) {
        for (int size = this.w.size() - 1; size >= 0; size--) {
            ((b) this.w.get(size)).a(eVar);
        }
    }

    private void f() {
        ah.a(this.q, this.l == 0 ? Math.max(0, this.u - this.a) : 0, 0, 0, 0);
        switch (this.l) {
            case 0:
                this.q.setGravity(8388611);
                break;
            case 1:
                this.q.setGravity(1);
                break;
        }
        a(true);
    }

    private void f(e eVar) {
        for (int size = this.w.size() - 1; size >= 0; size--) {
            ((b) this.w.get(size)).b(eVar);
        }
    }

    private void g(e eVar) {
        for (int size = this.w.size() - 1; size >= 0; size--) {
            ((b) this.w.get(size)).c(eVar);
        }
    }

    private int getDefaultHeight() {
        Object obj;
        int size = this.o.size();
        for (int i = 0; i < size; i++) {
            e eVar = (e) this.o.get(i);
            if (eVar != null && eVar.b() != null && !TextUtils.isEmpty(eVar.d())) {
                obj = 1;
                break;
            }
        }
        obj = null;
        return obj != null ? 72 : 48;
    }

    private float getScrollPosition() {
        return this.q.b();
    }

    private int getTabMinWidth() {
        return this.r != -1 ? this.r : this.l == 0 ? this.t : 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.q.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        int childCount = this.q.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                this.q.getChildAt(i2).setSelected(i2 == i);
                i2++;
            }
        }
    }

    public e a() {
        e eVar = (e) n.a();
        if (eVar == null) {
            eVar = new e();
        }
        eVar.a = this;
        eVar.b = c(eVar);
        return eVar;
    }

    public e a(int i) {
        return (i < 0 || i >= getTabCount()) ? null : (e) this.o.get(i);
    }

    public void a(int i, float f, boolean z) {
        a(i, f, z, true);
    }

    void a(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.q.getChildCount()) {
            if (z2) {
                this.q.a(i, f);
            }
            if (this.y != null && this.y.b()) {
                this.y.d();
            }
            scrollTo(a(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    public void a(b bVar) {
        if (!this.w.contains(bVar)) {
            this.w.add(bVar);
        }
    }

    public void a(e eVar) {
        a(eVar, this.o.isEmpty());
    }

    public void a(e eVar, int i, boolean z) {
        if (eVar.a != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        a(eVar, i);
        d(eVar);
        if (z) {
            eVar.e();
        }
    }

    public void a(e eVar, boolean z) {
        a(eVar, this.o.size(), z);
    }

    public void a(ViewPager viewPager, boolean z) {
        a(viewPager, z, false);
    }

    void a(aa aaVar, boolean z) {
        if (!(this.z == null || this.A == null)) {
            this.z.b(this.A);
        }
        this.z = aaVar;
        if (z && aaVar != null) {
            if (this.A == null) {
                this.A = new c(this);
            }
            aaVar.a(this.A);
        }
        c();
    }

    void a(boolean z) {
        for (int i = 0; i < this.q.getChildCount(); i++) {
            View childAt = this.q.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            a((LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public void addView(View view) {
        a(view);
    }

    public void addView(View view, int i) {
        a(view);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    int b(int i) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i));
    }

    public void b() {
        for (int childCount = this.q.getChildCount() - 1; childCount >= 0; childCount--) {
            c(childCount);
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            it.remove();
            eVar.i();
            n.a(eVar);
        }
        this.p = null;
    }

    public void b(b bVar) {
        this.w.remove(bVar);
    }

    void b(e eVar) {
        b(eVar, true);
    }

    void b(e eVar, boolean z) {
        e eVar2 = this.p;
        if (eVar2 != eVar) {
            int c = eVar != null ? eVar.c() : -1;
            if (z) {
                if ((eVar2 == null || eVar2.c() == -1) && c != -1) {
                    a(c, 0.0f, true);
                } else {
                    d(c);
                }
                if (c != -1) {
                    setSelectedTabView(c);
                }
            }
            if (eVar2 != null) {
                f(eVar2);
            }
            this.p = eVar;
            if (eVar != null) {
                e(eVar);
            }
        } else if (eVar2 != null) {
            g(eVar);
            d(eVar.c());
        }
    }

    void c() {
        b();
        if (this.z != null) {
            int i;
            int b = this.z.b();
            for (i = 0; i < b; i++) {
                a(a().a(this.z.c(i)), false);
            }
            if (this.m != null && b > 0) {
                i = this.m.getCurrentItem();
                if (i != getSelectedTabPosition() && i < getTabCount()) {
                    b(a(i));
                }
            }
        }
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        return this.p != null ? this.p.c() : -1;
    }

    public int getTabCount() {
        return this.o.size();
    }

    public int getTabGravity() {
        return this.k;
    }

    int getTabMaxWidth() {
        return this.j;
    }

    public int getTabMode() {
        return this.l;
    }

    public ColorStateList getTabTextColors() {
        return this.f;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.m == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                a((ViewPager) parent, true, true);
            }
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.D) {
            setupWithViewPager(null);
            this.D = false;
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3 = 1;
        int b = (b(getDefaultHeight()) + getPaddingTop()) + getPaddingBottom();
        switch (MeasureSpec.getMode(i2)) {
            case Integer.MIN_VALUE:
                i2 = MeasureSpec.makeMeasureSpec(Math.min(b, MeasureSpec.getSize(i2)), 1073741824);
                break;
            case 0:
                i2 = MeasureSpec.makeMeasureSpec(b, 1073741824);
                break;
        }
        b = MeasureSpec.getSize(i);
        if (MeasureSpec.getMode(i) != 0) {
            this.j = this.s > 0 ? this.s : b - b(56);
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            switch (this.l) {
                case 0:
                    if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                        b = 0;
                        break;
                    } else {
                        b = 1;
                        break;
                    }
                case 1:
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        i3 = 0;
                    }
                    b = i3;
                    break;
                default:
                    b = 0;
                    break;
            }
            if (b != 0) {
                childAt.measure(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(b bVar) {
        if (this.v != null) {
            b(this.v);
        }
        this.v = bVar;
        if (bVar != null) {
            a(bVar);
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.q.a(i);
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.q.b(i);
    }

    public void setTabGravity(int i) {
        if (this.k != i) {
            this.k = i;
            f();
        }
    }

    public void setTabMode(int i) {
        if (i != this.l) {
            this.l = i;
            f();
        }
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f != colorStateList) {
            this.f = colorStateList;
            d();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(aa aaVar) {
        a(aaVar, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        a(viewPager, true);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }
}
