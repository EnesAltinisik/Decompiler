package me.zhanghai.android.materialprogressbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v4.d.a;
import android.util.Log;
import me.zhanghai.android.materialprogressbar.internal.ThemeUtils;

public class HorizontalProgressDrawable extends LayerDrawable implements IntrinsicPaddingDrawable, ShowBackgroundDrawable, TintableDrawable {
    private static final String TAG = HorizontalProgressDrawable.class.getSimpleName();
    private float mBackgroundAlpha;
    private HorizontalProgressBackgroundDrawable mBackgroundDrawable = ((HorizontalProgressBackgroundDrawable) getDrawable(0));
    private boolean mHasSecondaryProgressTint;
    private boolean mHasSecondaryProgressTintColor;
    private SingleHorizontalProgressDrawable mProgressDrawable;
    private SingleHorizontalProgressDrawable mSecondaryProgressDrawable;
    private ColorStateList mSecondaryProgressTint;
    private int mSecondaryProgressTintColor;

    public HorizontalProgressDrawable(Context context) {
        super(new Drawable[]{new HorizontalProgressBackgroundDrawable(context), new SingleHorizontalProgressDrawable(context), new SingleHorizontalProgressDrawable(context)});
        this.mBackgroundAlpha = ThemeUtils.getFloatFromAttrRes(16842803, context);
        setId(0, 16908288);
        setId(1, 16908303);
        this.mSecondaryProgressDrawable = (SingleHorizontalProgressDrawable) getDrawable(1);
        setId(2, 16908301);
        this.mProgressDrawable = (SingleHorizontalProgressDrawable) getDrawable(2);
        setTint(ThemeUtils.getColorFromAttrRes(R.attr.colorControlActivated, context));
    }

    private float compositeAlpha(float f, float f2) {
        return ((1.0f - f) * f2) + f;
    }

    private void setSecondaryProgressTint(int i) {
        this.mHasSecondaryProgressTintColor = true;
        this.mSecondaryProgressTintColor = i;
        this.mHasSecondaryProgressTint = false;
        updateSecondaryProgressTint();
    }

    private void setSecondaryProgressTintList(ColorStateList colorStateList) {
        this.mHasSecondaryProgressTintColor = false;
        this.mHasSecondaryProgressTint = true;
        this.mSecondaryProgressTint = colorStateList;
        updateSecondaryProgressTint();
    }

    @SuppressLint({"NewApi"})
    private void updateSecondaryProgressTint() {
        if (this.mHasSecondaryProgressTintColor) {
            int i = this.mSecondaryProgressTintColor;
            if (!getShowBackground()) {
                float alpha = ((float) Color.alpha(i)) / 255.0f;
                i = a.b(i, Math.round(compositeAlpha(alpha, alpha) * 255.0f));
            }
            this.mSecondaryProgressDrawable.setTint(i);
        } else if (this.mHasSecondaryProgressTint) {
            ColorStateList colorStateList = this.mSecondaryProgressTint;
            if (!getShowBackground()) {
                colorStateList = colorStateList.withAlpha(Math.round(compositeAlpha(this.mBackgroundAlpha, this.mBackgroundAlpha) * 255.0f));
            }
            this.mSecondaryProgressDrawable.setTintList(colorStateList);
        }
    }

    public boolean getShowBackground() {
        return this.mBackgroundDrawable.getShowBackground();
    }

    public boolean getUseIntrinsicPadding() {
        return this.mBackgroundDrawable.getUseIntrinsicPadding();
    }

    public void setShowBackground(boolean z) {
        if (this.mBackgroundDrawable.getShowBackground() != z) {
            this.mBackgroundDrawable.setShowBackground(z);
            updateSecondaryProgressTint();
        }
    }

    @SuppressLint({"NewApi"})
    public void setTint(int i) {
        int b = a.b(i, Math.round(((float) Color.alpha(i)) * this.mBackgroundAlpha));
        this.mBackgroundDrawable.setTint(b);
        setSecondaryProgressTint(b);
        this.mProgressDrawable.setTint(i);
    }

    @SuppressLint({"NewApi"})
    public void setTintList(ColorStateList colorStateList) {
        ColorStateList withAlpha;
        if (colorStateList != null) {
            if (!colorStateList.isOpaque()) {
                Log.w(TAG, "setTintList() called with a non-opaque ColorStateList, its original alpha will be discarded");
            }
            withAlpha = colorStateList.withAlpha(Math.round(255.0f * this.mBackgroundAlpha));
        } else {
            withAlpha = null;
        }
        this.mBackgroundDrawable.setTintList(withAlpha);
        setSecondaryProgressTintList(withAlpha);
        this.mProgressDrawable.setTintList(colorStateList);
    }

    @SuppressLint({"NewApi"})
    public void setTintMode(Mode mode) {
        this.mBackgroundDrawable.setTintMode(mode);
        this.mSecondaryProgressDrawable.setTintMode(mode);
        this.mProgressDrawable.setTintMode(mode);
    }

    public void setUseIntrinsicPadding(boolean z) {
        this.mBackgroundDrawable.setUseIntrinsicPadding(z);
        this.mSecondaryProgressDrawable.setUseIntrinsicPadding(z);
        this.mProgressDrawable.setUseIntrinsicPadding(z);
    }
}
