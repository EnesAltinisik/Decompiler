package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.ah;
import android.support.v4.view.o;
import android.support.v4.view.q;
import android.support.v4.view.t;
import android.support.v7.a.a.k;
import android.support.v7.app.ActionBar;
import android.support.v7.view.g;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.l;
import android.support.v7.view.menu.p;
import android.support.v7.widget.ActionMenuView.e;
import android.text.Layout;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.zzamj;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
    private boolean A;
    private final ArrayList<View> B;
    private final ArrayList<View> C;
    private final int[] D;
    private c E;
    private final e F;
    private ba G;
    private ActionMenuPresenter H;
    private a I;
    private android.support.v7.view.menu.l.a J;
    private android.support.v7.view.menu.f.a K;
    private boolean L;
    private final Runnable M;
    private final l N;
    View a;
    private ActionMenuView b;
    private TextView c;
    private TextView d;
    private ImageButton e;
    private ImageView f;
    private Drawable g;
    private CharSequence h;
    private ImageButton i;
    private Context j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private final ap t;
    private int u;
    private CharSequence v;
    private CharSequence w;
    private int x;
    private int y;
    private boolean z;

    public interface c {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class SavedState extends BaseSavedState {
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
        int a;
        boolean b;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
            this.b = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b ? 1 : 0);
        }
    }

    private class a implements l {
        f a;
        h b;
        final /* synthetic */ Toolbar c;

        private a(Toolbar toolbar) {
            this.c = toolbar;
        }

        public void a(Context context, f fVar) {
            if (!(this.a == null || this.b == null)) {
                this.a.d(this.b);
            }
            this.a = fVar;
        }

        public void b(boolean z) {
            Object obj = null;
            if (this.b != null) {
                if (this.a != null) {
                    int size = this.a.size();
                    for (int i = 0; i < size; i++) {
                        if (this.a.getItem(i) == this.b) {
                            obj = 1;
                            break;
                        }
                    }
                }
                if (obj == null) {
                    b(this.a, this.b);
                }
            }
        }

        public boolean a(p pVar) {
            return false;
        }

        public void a(f fVar, boolean z) {
        }

        public boolean b() {
            return false;
        }

        public boolean a(f fVar, h hVar) {
            this.c.q();
            if (this.c.i.getParent() != this.c) {
                this.c.addView(this.c.i);
            }
            this.c.a = hVar.getActionView();
            this.b = hVar;
            if (this.c.a.getParent() != this.c) {
                LayoutParams j = this.c.j();
                j.gravity = 8388611 | (this.c.n & 112);
                j.a = 2;
                this.c.a.setLayoutParams(j);
                this.c.addView(this.c.a);
            }
            this.c.k();
            this.c.requestLayout();
            hVar.e(true);
            if (this.c.a instanceof android.support.v7.view.c) {
                ((android.support.v7.view.c) this.c.a).a();
            }
            return true;
        }

        public boolean b(f fVar, h hVar) {
            if (this.c.a instanceof android.support.v7.view.c) {
                ((android.support.v7.view.c) this.c.a).b();
            }
            this.c.removeView(this.c.a);
            this.c.removeView(this.c.i);
            this.c.a = null;
            this.c.l();
            this.b = null;
            this.c.requestLayout();
            hVar.e(false);
            return true;
        }

        public int c() {
            return 0;
        }

        public Parcelable d() {
            return null;
        }

        public void a(Parcelable parcelable) {
        }
    }

    public static class b extends ActionBar.LayoutParams {
        int a;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
        }

        public b(int i, int i2) {
            super(i, i2);
            this.a = 0;
            this.gravity = 8388627;
        }

        public b(int i, int i2, int i3) {
            super(i, i2);
            this.a = 0;
            this.gravity = i3;
        }

        public b(b bVar) {
            super((ActionBar.LayoutParams) bVar);
            this.a = 0;
            this.a = bVar.a;
        }

        public b(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }

        public b(MarginLayoutParams marginLayoutParams) {
            super((LayoutParams) marginLayoutParams);
            this.a = 0;
            a(marginLayoutParams);
        }

        public b(LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }

        void a(MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return a(attributeSet);
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return a(layoutParams);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.support.v7.a.a.a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.t = new ap();
        this.u = 8388627;
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = new int[2];
        this.F = new e(this) {
            final /* synthetic */ Toolbar a;

            {
                this.a = r1;
            }

            public boolean a(MenuItem menuItem) {
                if (this.a.E != null) {
                    return this.a.E.onMenuItemClick(menuItem);
                }
                return false;
            }
        };
        this.M = new Runnable(this) {
            final /* synthetic */ Toolbar a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.d();
            }
        };
        az a = az.a(getContext(), attributeSet, k.Toolbar, i, 0);
        this.l = a.g(k.Toolbar_titleTextAppearance, 0);
        this.m = a.g(k.Toolbar_subtitleTextAppearance, 0);
        this.u = a.c(k.Toolbar_android_gravity, this.u);
        this.n = 48;
        int d = a.d(k.Toolbar_titleMargins, 0);
        this.s = d;
        this.r = d;
        this.q = d;
        this.p = d;
        d = a.d(k.Toolbar_titleMarginStart, -1);
        if (d >= 0) {
            this.p = d;
        }
        d = a.d(k.Toolbar_titleMarginEnd, -1);
        if (d >= 0) {
            this.q = d;
        }
        d = a.d(k.Toolbar_titleMarginTop, -1);
        if (d >= 0) {
            this.r = d;
        }
        d = a.d(k.Toolbar_titleMarginBottom, -1);
        if (d >= 0) {
            this.s = d;
        }
        this.o = a.e(k.Toolbar_maxButtonHeight, -1);
        d = a.d(k.Toolbar_contentInsetStart, zzamj.UNSET_ENUM_VALUE);
        int d2 = a.d(k.Toolbar_contentInsetEnd, zzamj.UNSET_ENUM_VALUE);
        this.t.b(a.e(k.Toolbar_contentInsetLeft, 0), a.e(k.Toolbar_contentInsetRight, 0));
        if (!(d == zzamj.UNSET_ENUM_VALUE && d2 == zzamj.UNSET_ENUM_VALUE)) {
            this.t.a(d, d2);
        }
        this.g = a.a(k.Toolbar_collapseIcon);
        this.h = a.c(k.Toolbar_collapseContentDescription);
        CharSequence c = a.c(k.Toolbar_title);
        if (!TextUtils.isEmpty(c)) {
            setTitle(c);
        }
        c = a.c(k.Toolbar_subtitle);
        if (!TextUtils.isEmpty(c)) {
            setSubtitle(c);
        }
        this.j = getContext();
        setPopupTheme(a.g(k.Toolbar_popupTheme, 0));
        Drawable a2 = a.a(k.Toolbar_navigationIcon);
        if (a2 != null) {
            setNavigationIcon(a2);
        }
        c = a.c(k.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(c)) {
            setNavigationContentDescription(c);
        }
        a2 = a.a(k.Toolbar_logo);
        if (a2 != null) {
            setLogo(a2);
        }
        c = a.c(k.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(c)) {
            setLogoDescription(c);
        }
        if (a.f(k.Toolbar_titleTextColor)) {
            setTitleTextColor(a.b(k.Toolbar_titleTextColor, -1));
        }
        if (a.f(k.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a.b(k.Toolbar_subtitleTextColor, -1));
        }
        a.a();
        this.N = l.a();
    }

    public void setPopupTheme(int i) {
        if (this.k != i) {
            this.k = i;
            if (i == 0) {
                this.j = getContext();
            } else {
                this.j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public int getPopupTheme() {
        return this.k;
    }

    public void onRtlPropertiesChanged(int i) {
        boolean z = true;
        if (VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        ap apVar = this.t;
        if (i != 1) {
            z = false;
        }
        apVar.a(z);
    }

    public void setLogo(int i) {
        setLogo(this.N.a(getContext(), i));
    }

    public boolean a() {
        return getVisibility() == 0 && this.b != null && this.b.a();
    }

    public boolean b() {
        return this.b != null && this.b.g();
    }

    public boolean c() {
        return this.b != null && this.b.h();
    }

    public boolean d() {
        return this.b != null && this.b.e();
    }

    public boolean e() {
        return this.b != null && this.b.f();
    }

    public void a(f fVar, ActionMenuPresenter actionMenuPresenter) {
        if (fVar != null || this.b != null) {
            o();
            f d = this.b.d();
            if (d != fVar) {
                if (d != null) {
                    d.b(this.H);
                    d.b(this.I);
                }
                if (this.I == null) {
                    this.I = new a();
                }
                actionMenuPresenter.d(true);
                if (fVar != null) {
                    fVar.a((l) actionMenuPresenter, this.j);
                    fVar.a(this.I, this.j);
                } else {
                    actionMenuPresenter.a(this.j, null);
                    this.I.a(this.j, null);
                    actionMenuPresenter.b(true);
                    this.I.b(true);
                }
                this.b.setPopupTheme(this.k);
                this.b.setPresenter(actionMenuPresenter);
                this.H = actionMenuPresenter;
            }
        }
    }

    public void f() {
        if (this.b != null) {
            this.b.i();
        }
    }

    public boolean g() {
        if (this.c == null) {
            return false;
        }
        Layout layout = this.c.getLayout();
        if (layout == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return true;
            }
        }
        return false;
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m();
            if (!d(this.f)) {
                a(this.f, true);
            }
        } else if (this.f != null && d(this.f)) {
            removeView(this.f);
            this.C.remove(this.f);
        }
        if (this.f != null) {
            this.f.setImageDrawable(drawable);
        }
    }

    public Drawable getLogo() {
        return this.f != null ? this.f.getDrawable() : null;
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m();
        }
        if (this.f != null) {
            this.f.setContentDescription(charSequence);
        }
    }

    public CharSequence getLogoDescription() {
        return this.f != null ? this.f.getContentDescription() : null;
    }

    private void m() {
        if (this.f == null) {
            this.f = new ImageView(getContext());
        }
    }

    public boolean h() {
        return (this.I == null || this.I.b == null) ? false : true;
    }

    public void i() {
        h hVar = this.I == null ? null : this.I.b;
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    public CharSequence getTitle() {
        return this.v;
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.c == null) {
                Context context = getContext();
                this.c = new TextView(context);
                this.c.setSingleLine();
                this.c.setEllipsize(TruncateAt.END);
                if (this.l != 0) {
                    this.c.setTextAppearance(context, this.l);
                }
                if (this.x != 0) {
                    this.c.setTextColor(this.x);
                }
            }
            if (!d(this.c)) {
                a(this.c, true);
            }
        } else if (this.c != null && d(this.c)) {
            removeView(this.c);
            this.C.remove(this.c);
        }
        if (this.c != null) {
            this.c.setText(charSequence);
        }
        this.v = charSequence;
    }

    public CharSequence getSubtitle() {
        return this.w;
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.d == null) {
                Context context = getContext();
                this.d = new TextView(context);
                this.d.setSingleLine();
                this.d.setEllipsize(TruncateAt.END);
                if (this.m != 0) {
                    this.d.setTextAppearance(context, this.m);
                }
                if (this.y != 0) {
                    this.d.setTextColor(this.y);
                }
            }
            if (!d(this.d)) {
                a(this.d, true);
            }
        } else if (this.d != null && d(this.d)) {
            removeView(this.d);
            this.C.remove(this.d);
        }
        if (this.d != null) {
            this.d.setText(charSequence);
        }
        this.w = charSequence;
    }

    public void a(Context context, int i) {
        this.l = i;
        if (this.c != null) {
            this.c.setTextAppearance(context, i);
        }
    }

    public void b(Context context, int i) {
        this.m = i;
        if (this.d != null) {
            this.d.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i) {
        this.x = i;
        if (this.c != null) {
            this.c.setTextColor(i);
        }
    }

    public void setSubtitleTextColor(int i) {
        this.y = i;
        if (this.d != null) {
            this.d.setTextColor(i);
        }
    }

    public CharSequence getNavigationContentDescription() {
        return this.e != null ? this.e.getContentDescription() : null;
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            p();
        }
        if (this.e != null) {
            this.e.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(this.N.a(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            p();
            if (!d(this.e)) {
                a(this.e, true);
            }
        } else if (this.e != null && d(this.e)) {
            removeView(this.e);
            this.C.remove(this.e);
        }
        if (this.e != null) {
            this.e.setImageDrawable(drawable);
        }
    }

    public Drawable getNavigationIcon() {
        return this.e != null ? this.e.getDrawable() : null;
    }

    public void setNavigationOnClickListener(OnClickListener onClickListener) {
        p();
        this.e.setOnClickListener(onClickListener);
    }

    public Menu getMenu() {
        n();
        return this.b.getMenu();
    }

    public void setOverflowIcon(Drawable drawable) {
        n();
        this.b.setOverflowIcon(drawable);
    }

    public Drawable getOverflowIcon() {
        n();
        return this.b.getOverflowIcon();
    }

    private void n() {
        o();
        if (this.b.d() == null) {
            f fVar = (f) this.b.getMenu();
            if (this.I == null) {
                this.I = new a();
            }
            this.b.setExpandedActionViewsExclusive(true);
            fVar.a(this.I, this.j);
        }
    }

    private void o() {
        if (this.b == null) {
            this.b = new ActionMenuView(getContext());
            this.b.setPopupTheme(this.k);
            this.b.setOnMenuItemClickListener(this.F);
            this.b.a(this.J, this.K);
            LayoutParams j = j();
            j.gravity = 8388613 | (this.n & 112);
            this.b.setLayoutParams(j);
            a(this.b, false);
        }
    }

    private MenuInflater getMenuInflater() {
        return new g(getContext());
    }

    public void setOnMenuItemClickListener(c cVar) {
        this.E = cVar;
    }

    public void a(int i, int i2) {
        this.t.a(i, i2);
    }

    public int getContentInsetStart() {
        return this.t.c();
    }

    public int getContentInsetEnd() {
        return this.t.d();
    }

    public int getContentInsetLeft() {
        return this.t.a();
    }

    public int getContentInsetRight() {
        return this.t.b();
    }

    private void p() {
        if (this.e == null) {
            this.e = new ImageButton(getContext(), null, android.support.v7.a.a.a.toolbarNavigationButtonStyle);
            LayoutParams j = j();
            j.gravity = 8388611 | (this.n & 112);
            this.e.setLayoutParams(j);
        }
    }

    private void q() {
        if (this.i == null) {
            this.i = new ImageButton(getContext(), null, android.support.v7.a.a.a.toolbarNavigationButtonStyle);
            this.i.setImageDrawable(this.g);
            this.i.setContentDescription(this.h);
            LayoutParams j = j();
            j.gravity = 8388611 | (this.n & 112);
            j.a = 2;
            this.i.setLayoutParams(j);
            this.i.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ Toolbar a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    this.a.i();
                }
            });
        }
    }

    private void a(View view, boolean z) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = j();
        } else if (checkLayoutParams(layoutParams)) {
            b bVar = (b) layoutParams;
        } else {
            layoutParams = a(layoutParams);
        }
        layoutParams.a = 1;
        if (!z || this.a == null) {
            addView(view, layoutParams);
            return;
        }
        view.setLayoutParams(layoutParams);
        this.C.add(view);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        if (!(this.I == null || this.I.b == null)) {
            savedState.a = this.I.b.getItemId();
        }
        savedState.b = b();
        return savedState;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            Menu d = this.b != null ? this.b.d() : null;
            if (!(savedState.a == 0 || this.I == null || d == null)) {
                MenuItem findItem = d.findItem(savedState.a);
                if (findItem != null) {
                    q.b(findItem);
                }
            }
            if (savedState.b) {
                r();
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    private void r() {
        removeCallbacks(this.M);
        post(this.M);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.M);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int a = t.a(motionEvent);
        if (a == 0) {
            this.z = false;
        }
        if (!this.z) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (a == 0 && !onTouchEvent) {
                this.z = true;
            }
        }
        if (a == 1 || a == 3) {
            this.z = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int a = t.a(motionEvent);
        if (a == 9) {
            this.A = false;
        }
        if (!this.A) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (a == 9 && !onHoverEvent) {
                this.A = true;
            }
        }
        if (a == 10 || a == 3) {
            this.A = false;
        }
        return true;
    }

    private void a(View view, int i, int i2, int i3, int i4, int i5) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, (((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i4, marginLayoutParams.height);
        int mode = MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private int a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + max) + i2, marginLayoutParams.width), getChildMeasureSpec(i3, (((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private boolean s() {
        if (!this.L) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (a(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int max;
        int i5 = 0;
        int i6 = 0;
        int[] iArr = this.D;
        if (bd.a(this)) {
            i3 = 0;
            i4 = 1;
        } else {
            i3 = 1;
            i4 = 0;
        }
        int i7 = 0;
        if (a(this.e)) {
            a(this.e, i, 0, i2, 0, this.o);
            i7 = this.e.getMeasuredWidth() + b(this.e);
            max = Math.max(0, this.e.getMeasuredHeight() + c(this.e));
            i6 = bd.a(0, ah.k(this.e));
            i5 = max;
        }
        if (a(this.i)) {
            a(this.i, i, 0, i2, 0, this.o);
            i7 = this.i.getMeasuredWidth() + b(this.i);
            i5 = Math.max(i5, this.i.getMeasuredHeight() + c(this.i));
            i6 = bd.a(i6, ah.k(this.i));
        }
        int contentInsetStart = getContentInsetStart();
        int max2 = 0 + Math.max(contentInsetStart, i7);
        iArr[i4] = Math.max(0, contentInsetStart - i7);
        i7 = 0;
        if (a(this.b)) {
            a(this.b, i, max2, i2, 0, this.o);
            i7 = this.b.getMeasuredWidth() + b(this.b);
            i5 = Math.max(i5, this.b.getMeasuredHeight() + c(this.b));
            i6 = bd.a(i6, ah.k(this.b));
        }
        contentInsetStart = getContentInsetEnd();
        max2 += Math.max(contentInsetStart, i7);
        iArr[i3] = Math.max(0, contentInsetStart - i7);
        if (a(this.a)) {
            max2 += a(this.a, i, max2, i2, 0, iArr);
            i5 = Math.max(i5, this.a.getMeasuredHeight() + c(this.a));
            i6 = bd.a(i6, ah.k(this.a));
        }
        if (a(this.f)) {
            max2 += a(this.f, i, max2, i2, 0, iArr);
            i5 = Math.max(i5, this.f.getMeasuredHeight() + c(this.f));
            i6 = bd.a(i6, ah.k(this.f));
        }
        i4 = getChildCount();
        i3 = 0;
        int i8 = i5;
        i5 = i6;
        while (i3 < i4) {
            View childAt = getChildAt(i3);
            if (((b) childAt.getLayoutParams()).a != 0) {
                i7 = i5;
                contentInsetStart = i8;
            } else if (a(childAt)) {
                max2 += a(childAt, i, max2, i2, 0, iArr);
                max = Math.max(i8, childAt.getMeasuredHeight() + c(childAt));
                i7 = bd.a(i5, ah.k(childAt));
                contentInsetStart = max;
            } else {
                i7 = i5;
                contentInsetStart = i8;
            }
            i3++;
            i5 = i7;
            i8 = contentInsetStart;
        }
        contentInsetStart = 0;
        i7 = 0;
        i6 = this.r + this.s;
        max = this.p + this.q;
        if (a(this.c)) {
            a(this.c, i, max2 + max, i2, i6, iArr);
            contentInsetStart = b(this.c) + this.c.getMeasuredWidth();
            i7 = this.c.getMeasuredHeight() + c(this.c);
            i5 = bd.a(i5, ah.k(this.c));
        }
        if (a(this.d)) {
            contentInsetStart = Math.max(contentInsetStart, a(this.d, i, max2 + max, i2, i6 + i7, iArr));
            i7 += this.d.getMeasuredHeight() + c(this.d);
            i5 = bd.a(i5, ah.k(this.d));
        }
        contentInsetStart += max2;
        i7 = Math.max(i8, i7) + (getPaddingTop() + getPaddingBottom());
        contentInsetStart = ah.a(Math.max(contentInsetStart + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, -16777216 & i5);
        i7 = ah.a(Math.max(i7, getSuggestedMinimumHeight()), i2, i5 << 16);
        if (s()) {
            i7 = 0;
        }
        setMeasuredDimension(contentInsetStart, i7);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object obj;
        int i5;
        int i6;
        int i7;
        int measuredHeight;
        int measuredWidth;
        if (ah.h(this) == 1) {
            obj = 1;
        } else {
            obj = null;
        }
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i8 = width - paddingRight;
        int[] iArr = this.D;
        iArr[1] = 0;
        iArr[0] = 0;
        int q = ah.q(this);
        if (!a(this.e)) {
            i5 = paddingLeft;
        } else if (obj != null) {
            i8 = b(this.e, i8, iArr, q);
            i5 = paddingLeft;
        } else {
            i5 = a(this.e, paddingLeft, iArr, q);
        }
        if (a(this.i)) {
            if (obj != null) {
                i8 = b(this.i, i8, iArr, q);
            } else {
                i5 = a(this.i, i5, iArr, q);
            }
        }
        if (a(this.b)) {
            if (obj != null) {
                i5 = a(this.b, i5, iArr, q);
            } else {
                i8 = b(this.b, i8, iArr, q);
            }
        }
        iArr[0] = Math.max(0, getContentInsetLeft() - i5);
        iArr[1] = Math.max(0, getContentInsetRight() - ((width - paddingRight) - i8));
        i5 = Math.max(i5, getContentInsetLeft());
        i8 = Math.min(i8, (width - paddingRight) - getContentInsetRight());
        if (a(this.a)) {
            if (obj != null) {
                i8 = b(this.a, i8, iArr, q);
            } else {
                i5 = a(this.a, i5, iArr, q);
            }
        }
        if (!a(this.f)) {
            i6 = i8;
            i7 = i5;
        } else if (obj != null) {
            i6 = b(this.f, i8, iArr, q);
            i7 = i5;
        } else {
            i6 = i8;
            i7 = a(this.f, i5, iArr, q);
        }
        boolean a = a(this.c);
        boolean a2 = a(this.d);
        i5 = 0;
        if (a) {
            b bVar = (b) this.c.getLayoutParams();
            i5 = 0 + (bVar.bottomMargin + (bVar.topMargin + this.c.getMeasuredHeight()));
        }
        if (a2) {
            bVar = (b) this.d.getLayoutParams();
            measuredHeight = (bVar.bottomMargin + (bVar.topMargin + this.d.getMeasuredHeight())) + i5;
        } else {
            measuredHeight = i5;
        }
        if (a || a2) {
            int paddingTop2;
            bVar = (b) (a ? this.c : this.d).getLayoutParams();
            b bVar2 = (b) (a2 ? this.d : this.c).getLayoutParams();
            Object obj2 = ((!a || this.c.getMeasuredWidth() <= 0) && (!a2 || this.d.getMeasuredWidth() <= 0)) ? null : 1;
            switch (this.u & 112) {
                case 48:
                    paddingTop2 = (bVar.topMargin + getPaddingTop()) + this.r;
                    break;
                case 80:
                    paddingTop2 = (((height - paddingBottom) - bVar2.bottomMargin) - this.s) - measuredHeight;
                    break;
                default:
                    paddingTop2 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                    if (paddingTop2 < bVar.topMargin + this.r) {
                        i8 = bVar.topMargin + this.r;
                    } else {
                        measuredHeight = (((height - paddingBottom) - measuredHeight) - paddingTop2) - paddingTop;
                        if (measuredHeight < bVar.bottomMargin + this.s) {
                            i8 = Math.max(0, paddingTop2 - ((bVar2.bottomMargin + this.s) - measuredHeight));
                        } else {
                            i8 = paddingTop2;
                        }
                    }
                    paddingTop2 = paddingTop + i8;
                    break;
            }
            if (obj != null) {
                i8 = (obj2 != null ? this.p : 0) - iArr[1];
                i5 = i6 - Math.max(0, i8);
                iArr[1] = Math.max(0, -i8);
                if (a) {
                    bVar = (b) this.c.getLayoutParams();
                    measuredWidth = i5 - this.c.getMeasuredWidth();
                    i6 = this.c.getMeasuredHeight() + paddingTop2;
                    this.c.layout(measuredWidth, paddingTop2, i5, i6);
                    paddingTop2 = i6 + bVar.bottomMargin;
                    i6 = measuredWidth - this.q;
                } else {
                    i6 = i5;
                }
                if (a2) {
                    bVar = (b) this.d.getLayoutParams();
                    measuredWidth = bVar.topMargin + paddingTop2;
                    measuredHeight = this.d.getMeasuredHeight() + measuredWidth;
                    this.d.layout(i5 - this.d.getMeasuredWidth(), measuredWidth, i5, measuredHeight);
                    i8 = bVar.bottomMargin + measuredHeight;
                    i8 = i5 - this.q;
                } else {
                    i8 = i5;
                }
                if (obj2 != null) {
                    i8 = Math.min(i6, i8);
                } else {
                    i8 = i5;
                }
                i6 = i8;
            } else {
                i8 = (obj2 != null ? this.p : 0) - iArr[0];
                i7 += Math.max(0, i8);
                iArr[0] = Math.max(0, -i8);
                if (a) {
                    bVar = (b) this.c.getLayoutParams();
                    i5 = this.c.getMeasuredWidth() + i7;
                    measuredWidth = this.c.getMeasuredHeight() + paddingTop2;
                    this.c.layout(i7, paddingTop2, i5, measuredWidth);
                    i8 = bVar.bottomMargin + measuredWidth;
                    measuredWidth = i5 + this.q;
                    i5 = i8;
                } else {
                    measuredWidth = i7;
                    i5 = paddingTop2;
                }
                if (a2) {
                    bVar = (b) this.d.getLayoutParams();
                    i5 += bVar.topMargin;
                    paddingTop2 = this.d.getMeasuredWidth() + i7;
                    measuredHeight = this.d.getMeasuredHeight() + i5;
                    this.d.layout(i7, i5, paddingTop2, measuredHeight);
                    i8 = bVar.bottomMargin + measuredHeight;
                    i8 = this.q + paddingTop2;
                } else {
                    i8 = i7;
                }
                if (obj2 != null) {
                    i7 = Math.max(measuredWidth, i8);
                }
            }
        }
        a(this.B, 3);
        int size = this.B.size();
        i5 = i7;
        for (measuredWidth = 0; measuredWidth < size; measuredWidth++) {
            i5 = a((View) this.B.get(measuredWidth), i5, iArr, q);
        }
        a(this.B, 5);
        i7 = this.B.size();
        for (measuredWidth = 0; measuredWidth < i7; measuredWidth++) {
            i6 = b((View) this.B.get(measuredWidth), i6, iArr, q);
        }
        a(this.B, 1);
        measuredWidth = a(this.B, iArr);
        i8 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        measuredWidth += i8;
        if (i8 < i5) {
            i8 = i5;
        } else if (measuredWidth > i6) {
            i8 -= measuredWidth - i6;
        }
        paddingLeft = this.B.size();
        measuredWidth = i8;
        for (i5 = 0; i5 < paddingLeft; i5++) {
            measuredWidth = a((View) this.B.get(i5), measuredWidth, iArr, q);
        }
        this.B.clear();
    }

    private int a(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        int i5 = i2;
        int i6 = i;
        while (i3 < size) {
            View view = (View) list.get(i3);
            b bVar = (b) view.getLayoutParams();
            i6 = bVar.leftMargin - i6;
            i = bVar.rightMargin - i5;
            int max = Math.max(0, i6);
            int max2 = Math.max(0, i);
            i6 = Math.max(0, -i6);
            i5 = Math.max(0, -i);
            i3++;
            i4 += (view.getMeasuredWidth() + max) + max2;
        }
        return i4;
    }

    private int a(View view, int i, int[] iArr, int i2) {
        b bVar = (b) view.getLayoutParams();
        int i3 = bVar.leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        i3 = a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, i3, max + measuredWidth, view.getMeasuredHeight() + i3);
        return (bVar.rightMargin + measuredWidth) + max;
    }

    private int b(View view, int i, int[] iArr, int i2) {
        b bVar = (b) view.getLayoutParams();
        int i3 = bVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        i3 = a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, i3, max, view.getMeasuredHeight() + i3);
        return max - (bVar.leftMargin + measuredWidth);
    }

    private int a(View view, int i) {
        b bVar = (b) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        switch (a(bVar.gravity)) {
            case 48:
                return getPaddingTop() - i2;
            case 80:
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - bVar.bottomMargin) - i2;
            default:
                int i3;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                i2 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                if (i2 < bVar.topMargin) {
                    i3 = bVar.topMargin;
                } else {
                    measuredHeight = (((height - paddingBottom) - measuredHeight) - i2) - paddingTop;
                    i3 = measuredHeight < bVar.bottomMargin ? Math.max(0, i2 - (bVar.bottomMargin - measuredHeight)) : i2;
                }
                return i3 + paddingTop;
        }
    }

    private int a(int i) {
        int i2 = i & 112;
        switch (i2) {
            case 16:
            case 48:
            case 80:
                return i2;
            default:
                return this.u & 112;
        }
    }

    private void a(List<View> list, int i) {
        int i2 = 1;
        int i3 = 0;
        if (ah.h(this) != 1) {
            i2 = 0;
        }
        int childCount = getChildCount();
        int a = android.support.v4.view.e.a(i, ah.h(this));
        list.clear();
        b bVar;
        if (i2 != 0) {
            for (i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                bVar = (b) childAt.getLayoutParams();
                if (bVar.a == 0 && a(childAt) && b(bVar.gravity) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        while (i3 < childCount) {
            View childAt2 = getChildAt(i3);
            bVar = (b) childAt2.getLayoutParams();
            if (bVar.a == 0 && a(childAt2) && b(bVar.gravity) == a) {
                list.add(childAt2);
            }
            i3++;
        }
    }

    private int b(int i) {
        int h = ah.h(this);
        int a = android.support.v4.view.e.a(i, h) & 7;
        switch (a) {
            case 1:
            case 3:
            case 5:
                return a;
            default:
                return h == 1 ? 5 : 3;
        }
    }

    private boolean a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private int b(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return o.b(marginLayoutParams) + o.a(marginLayoutParams);
    }

    private int c(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
    }

    public b a(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    protected b a(LayoutParams layoutParams) {
        if (layoutParams instanceof b) {
            return new b((b) layoutParams);
        }
        if (layoutParams instanceof ActionBar.LayoutParams) {
            return new b((ActionBar.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new b((MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    protected b j() {
        return new b(-2, -2);
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof b);
    }

    public ad getWrapper() {
        if (this.G == null) {
            this.G = new ba(this, true);
        }
        return this.G;
    }

    void k() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((b) childAt.getLayoutParams()).a == 2 || childAt == this.b)) {
                removeViewAt(childCount);
                this.C.add(childAt);
            }
        }
    }

    void l() {
        for (int size = this.C.size() - 1; size >= 0; size--) {
            addView((View) this.C.get(size));
        }
        this.C.clear();
    }

    private boolean d(View view) {
        return view.getParent() == this || this.C.contains(view);
    }

    public void setCollapsible(boolean z) {
        this.L = z;
        requestLayout();
    }

    public void a(android.support.v7.view.menu.l.a aVar, android.support.v7.view.menu.f.a aVar2) {
        this.J = aVar;
        this.K = aVar2;
        if (this.b != null) {
            this.b.a(aVar, aVar2);
        }
    }
}
