package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.dynamic.zzg.zza;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class SignInButton extends FrameLayout implements OnClickListener {
    public static final int COLOR_AUTO = 2;
    public static final int COLOR_DARK = 0;
    public static final int COLOR_LIGHT = 1;
    public static final int SIZE_ICON_ONLY = 2;
    public static final int SIZE_STANDARD = 0;
    public static final int SIZE_WIDE = 1;
    private int mColor;
    private int mSize;
    private Scope[] zzakD;
    private View zzakE;
    private OnClickListener zzakF;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ButtonSize {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ColorScheme {
    }

    public SignInButton(Context context) {
        this(context, null);
    }

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SignInButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzakF = null;
        zza(context, attributeSet);
        setStyle(this.mSize, this.mColor, this.zzakD);
    }

    private static Button zza(Context context, int i, int i2, Scope[] scopeArr) {
        Button com_google_android_gms_common_internal_zzaf = new zzaf(context);
        com_google_android_gms_common_internal_zzaf.zza(context.getResources(), i, i2, scopeArr);
        return com_google_android_gms_common_internal_zzaf;
    }

    private void zza(Context context, AttributeSet attributeSet) {
        int i = 0;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.SignInButton, 0, 0);
        try {
            this.mSize = obtainStyledAttributes.getInt(R.styleable.SignInButton_buttonSize, 0);
            this.mColor = obtainStyledAttributes.getInt(R.styleable.SignInButton_colorScheme, 2);
            String string = obtainStyledAttributes.getString(R.styleable.SignInButton_scopeUris);
            if (string == null) {
                this.zzakD = null;
            } else {
                String[] split = string.trim().split("\\s+");
                this.zzakD = new Scope[split.length];
                while (i < split.length) {
                    this.zzakD[i] = new Scope(split[i].toString());
                    i++;
                }
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    private void zzar(Context context) {
        if (this.zzakE != null) {
            removeView(this.zzakE);
        }
        try {
            this.zzakE = zzae.zzb(context, this.mSize, this.mColor, this.zzakD);
        } catch (zza e) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            this.zzakE = zza(context, this.mSize, this.mColor, this.zzakD);
        }
        addView(this.zzakE);
        this.zzakE.setEnabled(isEnabled());
        this.zzakE.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (this.zzakF != null && view == this.zzakE) {
            this.zzakF.onClick(this);
        }
    }

    public void setColorScheme(int i) {
        setStyle(this.mSize, i, this.zzakD);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.zzakE.setEnabled(z);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.zzakF = onClickListener;
        if (this.zzakE != null) {
            this.zzakE.setOnClickListener(this);
        }
    }

    public void setScopes(Scope[] scopeArr) {
        setStyle(this.mSize, this.mColor, scopeArr);
    }

    public void setSize(int i) {
        setStyle(i, this.mColor, this.zzakD);
    }

    public void setStyle(int i, int i2) {
        setStyle(i, i2, this.zzakD);
    }

    public void setStyle(int i, int i2, Scope[] scopeArr) {
        this.mSize = i;
        this.mColor = i2;
        this.zzakD = scopeArr;
        zzar(getContext());
    }
}
