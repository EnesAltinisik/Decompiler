package android.support.v7.widget;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

@TargetApi(21)
class az extends Drawable {
    private float a;
    private final Paint b;
    private final RectF c;
    private final Rect d;
    private float e;
    private boolean f = false;
    private boolean g = true;
    private ColorStateList h;
    private PorterDuffColorFilter i;
    private ColorStateList j;
    private Mode k = Mode.SRC_IN;

    public az(ColorStateList colorStateList, float f) {
        this.a = f;
        this.b = new Paint(5);
        b(colorStateList);
        this.c = new RectF();
        this.d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, Mode mode) {
        return (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.d.set(rect);
        if (this.f) {
            float a = ba.a(this.e, this.a, this.g);
            this.d.inset((int) Math.ceil((double) ba.b(this.e, this.a, this.g)), (int) Math.ceil((double) a));
            this.c.set(this.d);
        }
    }

    private void b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.h = colorStateList;
        this.b.setColor(this.h.getColorForState(getState(), this.h.getDefaultColor()));
    }

    float a() {
        return this.e;
    }

    void a(float f) {
        if (f != this.a) {
            this.a = f;
            a(null);
            invalidateSelf();
        }
    }

    void a(float f, boolean z, boolean z2) {
        if (f != this.e || this.f != z || this.g != z2) {
            this.e = f;
            this.f = z;
            this.g = z2;
            a(null);
            invalidateSelf();
        }
    }

    public void a(ColorStateList colorStateList) {
        b(colorStateList);
        invalidateSelf();
    }

    public float b() {
        return this.a;
    }

    public ColorStateList c() {
        return this.h;
    }

    public void draw(Canvas canvas) {
        Object obj;
        Paint paint = this.b;
        if (this.i == null || paint.getColorFilter() != null) {
            obj = null;
        } else {
            paint.setColorFilter(this.i);
            obj = 1;
        }
        canvas.drawRoundRect(this.c, this.a, this.a, paint);
        if (obj != null) {
            paint.setColorFilter(null);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.d, this.a);
    }

    public boolean isStateful() {
        return (this.j != null && this.j.isStateful()) || ((this.h != null && this.h.isStateful()) || super.isStateful());
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a(rect);
    }

    protected boolean onStateChange(int[] iArr) {
        int colorForState = this.h.getColorForState(iArr, this.h.getDefaultColor());
        boolean z = colorForState != this.b.getColor();
        if (z) {
            this.b.setColor(colorForState);
        }
        if (this.j == null || this.k == null) {
            return z;
        }
        this.i = a(this.j, this.k);
        return true;
    }

    public void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.i = a(this.j, this.k);
        invalidateSelf();
    }

    public void setTintMode(Mode mode) {
        this.k = mode;
        this.i = a(this.j, this.k);
        invalidateSelf();
    }
}
