package me.zhanghai.android.materialprogressbar;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

abstract class BaseDrawable extends Drawable implements TintableDrawable {
    protected int mAlpha = 255;
    protected ColorFilter mColorFilter;
    private DummyConstantState mConstantState = new DummyConstantState();
    protected PorterDuffColorFilter mTintFilter;
    protected ColorStateList mTintList;
    protected Mode mTintMode = Mode.SRC_IN;

    private class DummyConstantState extends ConstantState {
        private DummyConstantState() {
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return BaseDrawable.this;
        }
    }

    BaseDrawable() {
    }

    private boolean updateTintFilter() {
        boolean z = true;
        if (this.mTintList == null || this.mTintMode == null) {
            if (this.mTintFilter == null) {
                z = false;
            }
            this.mTintFilter = null;
        } else {
            this.mTintFilter = new PorterDuffColorFilter(this.mTintList.getColorForState(getState(), 0), this.mTintMode);
        }
        return z;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.width() != 0 && bounds.height() != 0) {
            int save = canvas.save();
            canvas.translate((float) bounds.left, (float) bounds.top);
            onDraw(canvas, bounds.width(), bounds.height());
            canvas.restoreToCount(save);
        }
    }

    public int getAlpha() {
        return this.mAlpha;
    }

    public ColorFilter getColorFilter() {
        return this.mColorFilter;
    }

    protected ColorFilter getColorFilterForDrawing() {
        return this.mColorFilter != null ? this.mColorFilter : this.mTintFilter;
    }

    public ConstantState getConstantState() {
        return this.mConstantState;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isStateful() {
        return this.mTintList != null && this.mTintList.isStateful();
    }

    protected abstract void onDraw(Canvas canvas, int i, int i2);

    protected boolean onStateChange(int[] iArr) {
        return updateTintFilter();
    }

    public void setAlpha(int i) {
        if (this.mAlpha != i) {
            this.mAlpha = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mColorFilter = colorFilter;
        invalidateSelf();
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.mTintList = colorStateList;
        if (updateTintFilter()) {
            invalidateSelf();
        }
    }

    public void setTintMode(Mode mode) {
        this.mTintMode = mode;
        if (updateTintFilter()) {
            invalidateSelf();
        }
    }
}
