package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.a.a.a;
import android.support.v7.a.a.k;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: AppCompatTextHelper */
class y {
    private static final int[] b = new int[]{16842804, 16843119, 16843117, 16843120, 16843118};
    private static final int[] c = new int[]{a.textAllCaps};
    final TextView a;
    private ax d;
    private ax e;
    private ax f;
    private ax g;

    static y a(TextView textView) {
        if (VERSION.SDK_INT >= 17) {
            return new z(textView);
        }
        return new y(textView);
    }

    y(TextView textView) {
        this.a = textView;
    }

    void a(AttributeSet attributeSet, int i) {
        int i2 = 1;
        Context context = this.a.getContext();
        l a = l.a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        if (obtainStyledAttributes.hasValue(1)) {
            this.d = a(context, a, obtainStyledAttributes.getResourceId(1, 0));
        }
        if (obtainStyledAttributes.hasValue(2)) {
            this.e = a(context, a, obtainStyledAttributes.getResourceId(2, 0));
        }
        if (obtainStyledAttributes.hasValue(3)) {
            this.f = a(context, a, obtainStyledAttributes.getResourceId(3, 0));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            this.g = a(context, a, obtainStyledAttributes.getResourceId(4, 0));
        }
        obtainStyledAttributes.recycle();
        if (!(this.a.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            boolean z;
            int i3;
            boolean z2;
            if (resourceId != -1) {
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, k.TextAppearance);
                if (obtainStyledAttributes2.hasValue(k.TextAppearance_textAllCaps)) {
                    z = obtainStyledAttributes2.getBoolean(k.TextAppearance_textAllCaps, false);
                    i3 = 1;
                } else {
                    z2 = false;
                    z = false;
                }
                obtainStyledAttributes2.recycle();
            } else {
                z2 = false;
                z = false;
            }
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, c, i, 0);
            if (obtainStyledAttributes3.hasValue(0)) {
                z = obtainStyledAttributes3.getBoolean(0, false);
            } else {
                i2 = i3;
            }
            obtainStyledAttributes3.recycle();
            if (i2 != 0) {
                a(z);
            }
        }
    }

    void a(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, c);
        if (obtainStyledAttributes.hasValue(0)) {
            a(obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
    }

    void a(boolean z) {
        this.a.setTransformationMethod(z ? new android.support.v7.f.a(this.a.getContext()) : null);
    }

    void a() {
        if (this.d != null || this.e != null || this.f != null || this.g != null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.d);
            a(compoundDrawables[1], this.e);
            a(compoundDrawables[2], this.f);
            a(compoundDrawables[3], this.g);
        }
    }

    final void a(Drawable drawable, ax axVar) {
        if (drawable != null && axVar != null) {
            l.a(drawable, axVar, this.a.getDrawableState());
        }
    }

    protected static ax a(Context context, l lVar, int i) {
        ColorStateList b = lVar.b(context, i);
        if (b == null) {
            return null;
        }
        ax axVar = new ax();
        axVar.d = true;
        axVar.a = b;
        return axVar;
    }
}
