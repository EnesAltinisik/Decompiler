package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.view.ah;
import android.support.v7.appcompat.R;
import android.support.v7.widget.am;
import android.support.v7.widget.z;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Toast;

public class ActionMenuItemView extends z implements android.support.v7.view.menu.p.a, android.support.v7.widget.ActionMenuView.a, OnClickListener, OnLongClickListener {
    j a;
    android.support.v7.view.menu.h.b b;
    b c;
    private CharSequence d;
    private Drawable e;
    private am f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private int k;

    private class a extends am {
        final /* synthetic */ ActionMenuItemView a;

        public a(ActionMenuItemView actionMenuItemView) {
            this.a = actionMenuItemView;
            super(actionMenuItemView);
        }

        public s a() {
            return this.a.c != null ? this.a.c.a() : null;
        }

        protected boolean b() {
            if (this.a.b == null || !this.a.b.a(this.a.a)) {
                return false;
            }
            s a = a();
            return a != null && a.f();
        }
    }

    public static abstract class b {
        public abstract s a();
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
        this.g = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActionMenuItemView, i, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        setOnLongClickListener(this);
        this.j = -1;
        setSaveEnabled(false);
    }

    private boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int b = android.support.v4.c.a.a.b(getResources());
        return b >= 480 || ((b >= 640 && android.support.v4.c.a.a.a(getResources()) >= 480) || configuration.orientation == 2);
    }

    private void f() {
        int i = 0;
        int i2 = !TextUtils.isEmpty(this.d) ? 1 : 0;
        if (this.e == null || (this.a.m() && (this.g || this.h))) {
            i = 1;
        }
        setText((i2 & i) != 0 ? this.d : null);
    }

    public void a(j jVar, int i) {
        this.a = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.a((android.support.v7.view.menu.p.a) this));
        setId(jVar.getItemId());
        setVisibility(jVar.isVisible() ? 0 : 8);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f == null) {
            this.f = new a(this);
        }
    }

    public boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    public boolean b() {
        return true;
    }

    public boolean c() {
        return a() && this.a.getIcon() == null;
    }

    public boolean d() {
        return a();
    }

    public j getItemData() {
        return this.a;
    }

    public void onClick(View view) {
        if (this.b != null) {
            this.b.a(this.a);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.g = e();
        f();
    }

    public boolean onLongClick(View view) {
        if (a()) {
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
        boolean a = a();
        if (a && this.j >= 0) {
            super.setPadding(this.j, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        size = mode == Integer.MIN_VALUE ? Math.min(size, this.i) : this.i;
        if (mode != 1073741824 && this.i > 0 && measuredWidth < size) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
        }
        if (!a && this.e != null) {
            super.setPadding((getMeasuredWidth() - this.e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (this.a.hasSubMenu() && this.f != null && this.f.onTouch(this, motionEvent)) ? true : super.onTouchEvent(motionEvent);
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

    public void setIcon(Drawable drawable) {
        this.e = drawable;
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
        f();
    }

    public void setItemInvoker(android.support.v7.view.menu.h.b bVar) {
        this.b = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.j = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(b bVar) {
        this.c = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.d = charSequence;
        setContentDescription(this.d);
        f();
    }
}
