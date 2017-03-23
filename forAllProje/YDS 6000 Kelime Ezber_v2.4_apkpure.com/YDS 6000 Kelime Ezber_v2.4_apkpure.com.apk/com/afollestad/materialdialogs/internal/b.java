package com.afollestad.materialdialogs.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.widget.m;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.a.a;
import java.lang.reflect.Field;

public class b {
    private static ColorStateList a(Context context, int i) {
        r0 = new int[3][];
        r1 = new int[3];
        r0[0] = new int[]{-16842910};
        r1[0] = a.a(context, R.attr.colorControlNormal);
        r0[1] = new int[]{-16842919, -16842908};
        r1[1] = a.a(context, R.attr.colorControlNormal);
        r0[2] = new int[0];
        r1[2] = i;
        return new ColorStateList(r0, r1);
    }

    public static void a(CheckBox checkBox, int i) {
        int a = a.a(checkBox.getContext());
        a(checkBox, new ColorStateList(new int[][]{new int[]{16842910, -16842912}, new int[]{16842910, 16842912}, new int[]{-16842910, -16842912}, new int[]{-16842910, 16842912}}, new int[]{a.a(checkBox.getContext(), R.attr.colorControlNormal), i, a, a}));
    }

    public static void a(CheckBox checkBox, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            checkBox.setButtonTintList(colorStateList);
            return;
        }
        Drawable f = android.support.v4.d.a.a.f(android.support.v4.c.a.a(checkBox.getContext(), R.drawable.abc_btn_check_material));
        android.support.v4.d.a.a.a(f, colorStateList);
        checkBox.setButtonDrawable(f);
    }

    public static void a(EditText editText, int i) {
        ColorStateList a = a(editText.getContext(), i);
        if (editText instanceof m) {
            ((m) editText).setSupportBackgroundTintList(a);
        } else if (VERSION.SDK_INT >= 21) {
            editText.setBackgroundTintList(a);
        }
        b(editText, i);
    }

    public static void a(ProgressBar progressBar, int i) {
        a(progressBar, i, false);
    }

    public static void a(ProgressBar progressBar, int i, boolean z) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (VERSION.SDK_INT >= 21) {
            progressBar.setProgressTintList(valueOf);
            progressBar.setSecondaryProgressTintList(valueOf);
            if (!z) {
                progressBar.setIndeterminateTintList(valueOf);
                return;
            }
            return;
        }
        Mode mode = Mode.SRC_IN;
        if (VERSION.SDK_INT <= 10) {
            mode = Mode.MULTIPLY;
        }
        if (!(z || progressBar.getIndeterminateDrawable() == null)) {
            progressBar.getIndeterminateDrawable().setColorFilter(i, mode);
        }
        if (progressBar.getProgressDrawable() != null) {
            progressBar.getProgressDrawable().setColorFilter(i, mode);
        }
    }

    public static void a(RadioButton radioButton, int i) {
        int a = a.a(radioButton.getContext());
        a(radioButton, new ColorStateList(new int[][]{new int[]{16842910, -16842912}, new int[]{16842910, 16842912}, new int[]{-16842910, -16842912}, new int[]{-16842910, 16842912}}, new int[]{a.a(radioButton.getContext(), R.attr.colorControlNormal), i, a, a}));
    }

    public static void a(RadioButton radioButton, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            radioButton.setButtonTintList(colorStateList);
            return;
        }
        Drawable f = android.support.v4.d.a.a.f(android.support.v4.c.a.a(radioButton.getContext(), R.drawable.abc_btn_radio_material));
        android.support.v4.d.a.a.a(f, colorStateList);
        radioButton.setButtonDrawable(f);
    }

    private static void b(EditText editText, int i) {
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Object obj2 = new Drawable[]{android.support.v4.c.a.a(editText.getContext(), i2), android.support.v4.c.a.a(editText.getContext(), i2)};
            obj2[0].setColorFilter(i, Mode.SRC_IN);
            obj2[1].setColorFilter(i, Mode.SRC_IN);
            declaredField3.set(obj, obj2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
