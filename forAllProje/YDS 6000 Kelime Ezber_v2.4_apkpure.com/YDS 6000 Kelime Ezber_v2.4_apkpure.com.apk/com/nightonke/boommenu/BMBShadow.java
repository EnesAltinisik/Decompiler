package com.nightonke.boommenu;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class BMBShadow extends FrameLayout {
    private boolean a = true;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public BMBShadow(Context context) {
        super(context);
    }

    public BMBShadow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BMBShadow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private void b() {
        int abs = this.d + Math.abs(this.b);
        int abs2 = this.d + Math.abs(this.c);
        setPadding(abs, abs2, abs, abs2);
    }

    private void c() {
        if (this.a) {
            Drawable bitmapDrawable = new BitmapDrawable(getResources(), d());
            if (VERSION.SDK_INT <= 16) {
                setBackgroundDrawable(bitmapDrawable);
                return;
            } else {
                setBackground(bitmapDrawable);
                return;
            }
        }
        a();
    }

    private Bitmap d() {
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Config.ALPHA_8);
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF((float) (this.d + Math.abs(this.b)), (float) (this.d + Math.abs(this.c)), (float) ((getWidth() - this.d) - Math.abs(this.b)), (float) ((getHeight() - this.d) - Math.abs(this.c)));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        paint.setStyle(Style.FILL);
        if (!isInEditMode()) {
            paint.setShadowLayer((float) this.d, (float) this.b, (float) this.c, this.f);
        }
        canvas.drawRoundRect(rectF, (float) this.e, (float) this.e, paint);
        return createBitmap;
    }

    public void a() {
        e.a((View) this, null);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c();
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            c();
        }
    }

    public void setShadowColor(int i) {
        this.f = i;
    }

    public void setShadowCornerRadius(int i) {
        this.e = i;
        b();
    }

    public void setShadowEffect(boolean z) {
        this.a = z;
    }

    public void setShadowOffsetX(int i) {
        this.b = i;
        b();
    }

    public void setShadowOffsetY(int i) {
        this.c = i;
        b();
    }

    public void setShadowRadius(int i) {
        this.d = i;
        b();
    }
}
