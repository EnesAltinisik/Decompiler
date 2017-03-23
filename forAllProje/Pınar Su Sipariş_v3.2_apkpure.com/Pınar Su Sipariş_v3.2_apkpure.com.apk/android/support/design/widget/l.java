package android.support.design.widget;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.support.v7.b.a.a;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* compiled from: ShadowDrawableWrapper */
class l extends a {
    static final double a = Math.cos(Math.toRadians(45.0d));
    final Paint b;
    final Paint c;
    final RectF d;
    float e;
    Path f;
    float g;
    float h;
    float i;
    float j;
    private boolean k;
    private final int l;
    private final int m;
    private final int n;
    private boolean o;
    private float p;
    private boolean q;

    private static int c(float f) {
        int round = Math.round(f);
        return round % 2 == 1 ? round - 1 : round;
    }

    public void setAlpha(int i) {
        super.setAlpha(i);
        this.b.setAlpha(i);
        this.c.setAlpha(i);
    }

    protected void onBoundsChange(Rect rect) {
        this.k = true;
    }

    void a(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float c = (float) c(f);
        float c2 = (float) c(f2);
        if (c > c2) {
            if (!this.q) {
                this.q = true;
            }
            c = c2;
        }
        if (this.j != c || this.h != c2) {
            this.j = c;
            this.h = c2;
            this.i = (float) Math.round(c * 1.5f);
            this.g = c2;
            this.k = true;
            invalidateSelf();
        }
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) a(this.h, this.e, this.o));
        int ceil2 = (int) Math.ceil((double) b(this.h, this.e, this.o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public static float a(float f, float f2, boolean z) {
        if (z) {
            return (float) (((double) (1.5f * f)) + ((1.0d - a) * ((double) f2)));
        }
        return 1.5f * f;
    }

    public static float b(float f, float f2, boolean z) {
        if (z) {
            return (float) (((double) f) + ((1.0d - a) * ((double) f2)));
        }
        return f;
    }

    public int getOpacity() {
        return -3;
    }

    public void draw(Canvas canvas) {
        if (this.k) {
            a(getBounds());
            this.k = false;
        }
        a(canvas);
        super.draw(canvas);
    }

    final void a(float f) {
        if (this.p != f) {
            this.p = f;
            invalidateSelf();
        }
    }

    private void a(Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(this.p, this.d.centerX(), this.d.centerY());
        float f = (-this.e) - this.i;
        float f2 = this.e;
        Object obj = this.d.width() - (2.0f * f2) > 0.0f ? 1 : null;
        Object obj2 = this.d.height() - (2.0f * f2) > 0.0f ? 1 : null;
        float f3 = f2 / ((this.j - (this.j * 0.5f)) + f2);
        float f4 = f2 / ((this.j - (this.j * 0.25f)) + f2);
        float f5 = f2 / (f2 + (this.j - (this.j * TextTrackStyle.DEFAULT_FONT_SCALE)));
        int save2 = canvas.save();
        canvas.translate(this.d.left + f2, this.d.top + f2);
        canvas.scale(f3, f4);
        canvas.drawPath(this.f, this.b);
        if (obj != null) {
            canvas.scale(TextTrackStyle.DEFAULT_FONT_SCALE / f3, TextTrackStyle.DEFAULT_FONT_SCALE);
            canvas.drawRect(0.0f, f, this.d.width() - (2.0f * f2), -this.e, this.c);
        }
        canvas.restoreToCount(save2);
        save2 = canvas.save();
        canvas.translate(this.d.right - f2, this.d.bottom - f2);
        canvas.scale(f3, f5);
        canvas.rotate(BitmapDescriptorFactory.HUE_CYAN);
        canvas.drawPath(this.f, this.b);
        if (obj != null) {
            canvas.scale(TextTrackStyle.DEFAULT_FONT_SCALE / f3, TextTrackStyle.DEFAULT_FONT_SCALE);
            canvas.drawRect(0.0f, f, this.d.width() - (2.0f * f2), this.i + (-this.e), this.c);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        canvas.translate(this.d.left + f2, this.d.bottom - f2);
        canvas.scale(f3, f5);
        canvas.rotate(BitmapDescriptorFactory.HUE_VIOLET);
        canvas.drawPath(this.f, this.b);
        if (obj2 != null) {
            canvas.scale(TextTrackStyle.DEFAULT_FONT_SCALE / f5, TextTrackStyle.DEFAULT_FONT_SCALE);
            canvas.drawRect(0.0f, f, this.d.height() - (2.0f * f2), -this.e, this.c);
        }
        canvas.restoreToCount(save3);
        save3 = canvas.save();
        canvas.translate(this.d.right - f2, this.d.top + f2);
        canvas.scale(f3, f4);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f, this.b);
        if (obj2 != null) {
            canvas.scale(TextTrackStyle.DEFAULT_FONT_SCALE / f4, TextTrackStyle.DEFAULT_FONT_SCALE);
            canvas.drawRect(0.0f, f, this.d.height() - (2.0f * f2), -this.e, this.c);
        }
        canvas.restoreToCount(save3);
        canvas.restoreToCount(save);
    }

    private void c() {
        RectF rectF = new RectF(-this.e, -this.e, this.e, this.e);
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(-this.i, -this.i);
        if (this.f == null) {
            this.f = new Path();
        } else {
            this.f.reset();
        }
        this.f.setFillType(FillType.EVEN_ODD);
        this.f.moveTo(-this.e, 0.0f);
        this.f.rLineTo(-this.i, 0.0f);
        this.f.arcTo(rectF2, BitmapDescriptorFactory.HUE_CYAN, 90.0f, false);
        this.f.arcTo(rectF, BitmapDescriptorFactory.HUE_VIOLET, -90.0f, false);
        this.f.close();
        float f = -rectF2.top;
        if (f > 0.0f) {
            float f2 = this.e / f;
            float f3 = f2 + ((TextTrackStyle.DEFAULT_FONT_SCALE - f2) / 2.0f);
            float[] fArr = new float[]{0.0f, f2, f3, TextTrackStyle.DEFAULT_FONT_SCALE};
            f2 = 0.0f;
            this.b.setShader(new RadialGradient(0.0f, f2, f, new int[]{0, this.l, this.m, this.n}, fArr, TileMode.CLAMP));
        }
        f = 0.0f;
        this.c.setShader(new LinearGradient(0.0f, rectF.top, f, rectF2.top, new int[]{this.l, this.m, this.n}, new float[]{0.0f, 0.5f, TextTrackStyle.DEFAULT_FONT_SCALE}, TileMode.CLAMP));
        this.c.setAntiAlias(false);
    }

    private void a(Rect rect) {
        float f = this.h * 1.5f;
        this.d.set(((float) rect.left) + this.h, ((float) rect.top) + f, ((float) rect.right) - this.h, ((float) rect.bottom) - f);
        b().setBounds((int) this.d.left, (int) this.d.top, (int) this.d.right, (int) this.d.bottom);
        c();
    }

    public void b(float f) {
        a(f, this.h);
    }

    public float a() {
        return this.j;
    }
}
