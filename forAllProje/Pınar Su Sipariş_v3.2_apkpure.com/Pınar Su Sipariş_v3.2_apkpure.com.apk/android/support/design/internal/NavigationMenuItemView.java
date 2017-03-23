package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.StateListDrawable;
import android.support.design.a.b;
import android.support.design.a.c;
import android.support.design.a.d;
import android.support.design.a.e;
import android.support.v4.widget.z;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.m.a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;

public class NavigationMenuItemView extends a implements a {
    private static final int[] c = new int[]{16842912};
    private final int d;
    private final CheckedTextView e;
    private FrameLayout f;
    private h g;
    private ColorStateList h;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(0);
        LayoutInflater.from(context).inflate(e.design_navigation_menu_item, this, true);
        this.d = context.getResources().getDimensionPixelSize(c.design_navigation_icon_size);
        this.e = (CheckedTextView) findViewById(d.design_menu_item_text);
        this.e.setDuplicateParentStateEnabled(true);
    }

    public void a(h hVar, int i) {
        this.g = hVar;
        setVisibility(hVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            setBackgroundDrawable(b());
        }
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setTitle(hVar.getTitle());
        setIcon(hVar.getIcon());
        setActionView(hVar.getActionView());
    }

    private void setActionView(View view) {
        if (this.f == null) {
            this.f = (FrameLayout) ((ViewStub) findViewById(d.design_menu_item_action_area_stub)).inflate();
        }
        this.f.removeAllViews();
        if (view != null) {
            this.f.addView(view);
        }
    }

    private StateListDrawable b() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(b.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(c, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    public h getItemData() {
        return this.g;
    }

    public void setTitle(CharSequence charSequence) {
        this.e.setText(charSequence);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.e.setChecked(z);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = android.support.v4.c.a.a.f(drawable).mutate();
            drawable.setBounds(0, 0, this.d, this.d);
            android.support.v4.c.a.a.a(drawable, this.h);
        }
        z.a(this.e, drawable, null, null, null);
    }

    public boolean a() {
        return false;
    }

    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.g != null && this.g.isCheckable() && this.g.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, c);
        }
        return onCreateDrawableState;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.h = colorStateList;
        if (this.g != null) {
            setIcon(this.g.getIcon());
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.e.setTextColor(colorStateList);
    }
}
