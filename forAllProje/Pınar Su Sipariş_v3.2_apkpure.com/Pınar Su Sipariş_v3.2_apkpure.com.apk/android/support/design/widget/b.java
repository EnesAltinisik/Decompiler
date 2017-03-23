package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.v4.c.a;
import com.google.android.gms.cast.TextTrackStyle;

/* compiled from: CircularBorderDrawable */
class b extends Drawable {
    final Paint a;
    final Rect b;
    final RectF c;
    float d;
    private int e;
    private int f;
    private int g;
    private int h;
    private ColorStateList i;
    private int j;
    private boolean k;
    private float l;

    public void draw(Canvas canvas) {
        if (this.k) {
            this.a.setShader(a());
            this.k = false;
        }
        float strokeWidth = this.a.getStrokeWidth() / 2.0f;
        RectF rectF = this.c;
        copyBounds(this.b);
        rectF.set(this.b);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.l, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.a);
        canvas.restore();
    }

    public boolean getPadding(Rect rect) {
        int round = Math.round(this.d);
        rect.set(round, round, round, round);
        return true;
    }

    public void setAlpha(int i) {
        this.a.setAlpha(i);
        invalidateSelf();
    }

    void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.j = colorStateList.getColorForState(getState(), this.j);
        }
        this.i = colorStateList;
        this.k = true;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public int getOpacity() {
        return this.d > 0.0f ? -3 : -2;
    }

    final void a(float f) {
        if (f != this.l) {
            this.l = f;
            invalidateSelf();
        }
    }

    protected void onBoundsChange(Rect rect) {
        this.k = true;
    }

    public boolean isStateful() {
        return (this.i != null && this.i.isStateful()) || super.isStateful();
    }

    protected boolean onStateChange(int[] iArr) {
        if (this.i != null) {
            int colorForState = this.i.getColorForState(iArr, this.j);
            if (colorForState != this.j) {
                this.k = true;
                this.j = colorForState;
            }
        }
        if (this.k) {
            invalidateSelf();
        }
        return this.k;
    }

    private Shader a() {
        Rect rect = this.b;
        copyBounds(rect);
        float height = this.d / ((float) rect.height());
        return new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{a.a(this.e, this.j), a.a(this.f, this.j), a.a(a.b(this.f, 0), this.j), a.a(a.b(this.h, 0), this.j), a.a(this.h, this.j), a.a(this.g, this.j)}, new float[]{0.0f, height, 0.5f, 0.5f, TextTrackStyle.DEFAULT_FONT_SCALE - height, TextTrackStyle.DEFAULT_FONT_SCALE}, TileMode.CLAMP);
    }
}
