package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.design.R;
import android.support.design.internal.c;
import android.support.design.internal.f;
import android.support.v4.g.d;
import android.support.v4.g.e;
import android.support.v4.view.ah;
import android.support.v4.view.bf;
import android.support.v7.view.g;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.j;
import android.support.v7.widget.bl;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

public class NavigationView extends f {
    private static final int[] d = new int[]{16842912};
    private static final int[] e = new int[]{-16842910};
    a c;
    private final android.support.design.internal.b f;
    private final c g;
    private int h;
    private MenuInflater i;

    public interface a {
        boolean a(MenuItem menuItem);
    }

    public static class b extends android.support.v4.view.a {
        public static final Creator<b> CREATOR = d.a(new e<b>() {
            public b a(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            public b[] a(int i) {
                return new b[i];
            }

            public /* synthetic */ Object b(Parcel parcel, ClassLoader classLoader) {
                return a(parcel, classLoader);
            }

            public /* synthetic */ Object[] b(int i) {
                return a(i);
            }
        });
        public Bundle a;

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readBundle(classLoader);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.a);
        }
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        int g;
        super(context, attributeSet, i);
        this.g = new c();
        r.a(context);
        this.f = new android.support.design.internal.b(context);
        bl a = bl.a(context, attributeSet, R.styleable.NavigationView, i, R.style.Widget_Design_NavigationView);
        ah.a((View) this, a.a(R.styleable.NavigationView_android_background));
        if (a.g(R.styleable.NavigationView_elevation)) {
            ah.f(this, (float) a.e(R.styleable.NavigationView_elevation, 0));
        }
        ah.a((View) this, a.a(R.styleable.NavigationView_android_fitsSystemWindows, false));
        this.h = a.e(R.styleable.NavigationView_android_maxWidth, 0);
        ColorStateList e = a.g(R.styleable.NavigationView_itemIconTint) ? a.e(R.styleable.NavigationView_itemIconTint) : c(16842808);
        if (a.g(R.styleable.NavigationView_itemTextAppearance)) {
            g = a.g(R.styleable.NavigationView_itemTextAppearance, 0);
            int i2 = 1;
        } else {
            g = 0;
            boolean z = false;
        }
        ColorStateList colorStateList = null;
        if (a.g(R.styleable.NavigationView_itemTextColor)) {
            colorStateList = a.e(R.styleable.NavigationView_itemTextColor);
        }
        if (i2 == 0 && r5 == null) {
            colorStateList = c(16842806);
        }
        Drawable a2 = a.a(R.styleable.NavigationView_itemBackground);
        this.f.a(new android.support.v7.view.menu.h.a(this) {
            final /* synthetic */ NavigationView a;

            {
                this.a = r1;
            }

            public void a(h hVar) {
            }

            public boolean a(h hVar, MenuItem menuItem) {
                return this.a.c != null && this.a.c.a(menuItem);
            }
        });
        this.g.a(1);
        this.g.a(context, this.f);
        this.g.a(e);
        if (i2 != 0) {
            this.g.c(g);
        }
        this.g.b(colorStateList);
        this.g.a(a2);
        this.f.a(this.g);
        addView((View) this.g.a((ViewGroup) this));
        if (a.g(R.styleable.NavigationView_menu)) {
            a(a.g(R.styleable.NavigationView_menu, 0));
        }
        if (a.g(R.styleable.NavigationView_headerLayout)) {
            b(a.g(R.styleable.NavigationView_headerLayout, 0));
        }
        a.a();
    }

    private ColorStateList c(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList a = android.support.v7.a.a.b.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = a.getDefaultColor();
        return new ColorStateList(new int[][]{e, d, EMPTY_STATE_SET}, new int[]{a.getColorForState(e, defaultColor), i2, defaultColor});
    }

    private MenuInflater getMenuInflater() {
        if (this.i == null) {
            this.i = new g(getContext());
        }
        return this.i;
    }

    public void a(int i) {
        this.g.b(true);
        getMenuInflater().inflate(i, this.f);
        this.g.b(false);
        this.g.a(false);
    }

    protected void a(bf bfVar) {
        this.g.a(bfVar);
    }

    public View b(int i) {
        return this.g.b(i);
    }

    public int getHeaderCount() {
        return this.g.d();
    }

    public Drawable getItemBackground() {
        return this.g.g();
    }

    public ColorStateList getItemIconTintList() {
        return this.g.e();
    }

    public ColorStateList getItemTextColor() {
        return this.g.f();
    }

    public Menu getMenu() {
        return this.f;
    }

    protected void onMeasure(int i, int i2) {
        switch (MeasureSpec.getMode(i)) {
            case Integer.MIN_VALUE:
                i = MeasureSpec.makeMeasureSpec(Math.min(MeasureSpec.getSize(i), this.h), 1073741824);
                break;
            case 0:
                i = MeasureSpec.makeMeasureSpec(this.h, 1073741824);
                break;
        }
        super.onMeasure(i, i2);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof b) {
            b bVar = (b) parcelable;
            super.onRestoreInstanceState(bVar.a());
            this.f.b(bVar.a);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable bVar = new b(super.onSaveInstanceState());
        bVar.a = new Bundle();
        this.f.a(bVar.a);
        return bVar;
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.f.findItem(i);
        if (findItem != null) {
            this.g.a((j) findItem);
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.g.a(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(android.support.v4.c.a.a(getContext(), i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.g.a(colorStateList);
    }

    public void setItemTextAppearance(int i) {
        this.g.c(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.g.b(colorStateList);
    }

    public void setNavigationItemSelectedListener(a aVar) {
        this.c = aVar;
    }
}
