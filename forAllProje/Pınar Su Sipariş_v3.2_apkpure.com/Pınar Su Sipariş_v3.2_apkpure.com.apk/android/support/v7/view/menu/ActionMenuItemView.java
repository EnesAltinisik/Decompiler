package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.ah;
import android.support.v7.a.a.k;
import android.support.v7.widget.aa;
import android.support.v7.widget.aj;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Toast;
import com.google.android.gms.internal.zzamj;

public class ActionMenuItemView extends aa implements android.support.v7.view.menu.m.a, android.support.v7.widget.ActionMenuView.a, OnClickListener, OnLongClickListener {
    private h a;
    private CharSequence b;
    private Drawable c;
    private android.support.v7.view.menu.f.b d;
    private android.support.v7.widget.aj.b e;
    private b f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private int k;

    private class a extends android.support.v7.widget.aj.b {
        final /* synthetic */ ActionMenuItemView a;

        public a(ActionMenuItemView actionMenuItemView) {
            this.a = actionMenuItemView;
            super(actionMenuItemView);
        }

        public aj a() {
            if (this.a.f != null) {
                return this.a.f.a();
            }
            return null;
        }

        protected boolean b() {
            if (this.a.d == null || !this.a.d.a(this.a.a)) {
                return false;
            }
            aj a = a();
            if (a == null || !a.k()) {
                return false;
            }
            return true;
        }
    }

    public static abstract class b {
        public abstract aj a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.g = resources.getBoolean(android.support.v7.a.a.b.abc_config_allowActionMenuItemTextWithIcon);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.ActionMenuItemView, i, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(k.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        setOnLongClickListener(this);
        this.j = -1;
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        this.g = getContext().getResources().getBoolean(android.support.v7.a.a.b.abc_config_allowActionMenuItemTextWithIcon);
        e();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.j = i;
        super.setPadding(i, i2, i3, i4);
    }

    public h getItemData() {
        return this.a;
    }

    public void a(h hVar, int i) {
        this.a = hVar;
        setIcon(hVar.getIcon());
        setTitle(hVar.a((android.support.v7.view.menu.m.a) this));
        setId(hVar.getItemId());
        setVisibility(hVar.isVisible() ? 0 : 8);
        setEnabled(hVar.isEnabled());
        if (hVar.hasSubMenu() && this.e == null) {
            this.e = new a(this);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a.hasSubMenu() && this.e != null && this.e.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void onClick(View view) {
        if (this.d != null) {
            this.d.a(this.a);
        }
    }

    public void setItemInvoker(android.support.v7.view.menu.f.b bVar) {
        this.d = bVar;
    }

    public void setPopupCallback(b bVar) {
        this.f = bVar;
    }

    public boolean a() {
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.h != z) {
            this.h = z;
            if (this.a != null) {
                this.a.h();
            }
        }
    }

    private void e() {
        int i = 0;
        int i2 = !TextUtils.isEmpty(this.b) ? 1 : 0;
        if (this.c == null || (this.a.m() && (this.g || this.h))) {
            i = 1;
        }
        setText((i2 & i) != 0 ? this.b : null);
    }

    public void setIcon(Drawable drawable) {
        this.c = drawable;
        if (drawable != null) {
            float f;
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > this.k) {
                f = ((float) this.k) / ((float) intrinsicWidth);
                intrinsicWidth = this.k;
                intrinsicHeight = (int) (((float) intrinsicHeight) * f);
            }
            if (intrinsicHeight > this.k) {
                f = ((float) this.k) / ((float) intrinsicHeight);
                intrinsicHeight = this.k;
                intrinsicWidth = (int) (((float) intrinsicWidth) * f);
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        e();
    }

    public boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    public void setTitle(CharSequence charSequence) {
        this.b = charSequence;
        setContentDescription(this.b);
        e();
    }

    public boolean c() {
        return b() && this.a.getIcon() == null;
    }

    public boolean d() {
        return b();
    }

    public boolean onLongClick(View view) {
        if (b()) {
            return false;
        }
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
        Toast makeText = Toast.makeText(context, this.a.getTitle(), 0);
        if (i < rect.height()) {
            makeText.setGravity(8388661, width, (iArr[1] + height) - rect.top);
        } else {
            makeText.setGravity(81, 0, height);
        }
        makeText.show();
        return true;
    }

    protected void onMeasure(int i, int i2) {
        boolean b = b();
        if (b && this.j >= 0) {
            super.setPadding(this.j, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        size = mode == zzamj.UNSET_ENUM_VALUE ? Math.min(size, this.i) : this.i;
        if (mode != 1073741824 && this.i > 0 && measuredWidth < size) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
        }
        if (!b && this.c != null) {
            super.setPadding((getMeasuredWidth() - this.c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }
}
