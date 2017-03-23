package android.support.v7.b.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.d.a.a;
import android.support.v7.appcompat.R;

public class b extends Drawable {
    private static final float b = ((float) Math.toRadians(45.0d));
    private final Paint a = new Paint();
    private float c;
    private float d;
    private float e;
    private float f;
    private boolean g;
    private final Path h = new Path();
    private final int i;
    private boolean j = false;
    private float k;
    private float l;
    private int m = 2;

    public b(Context context) {
        this.a.setStyle(Style.STROKE);
        this.a.setStrokeJoin(Join.MITER);
        this.a.setStrokeCap(Cap.BUTT);
        this.a.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, R.styleable.DrawerArrowToggle, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        a(obtainStyledAttributes.getColor(R.styleable.DrawerArrowToggle_color, 0));
        a(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_thickness, 0.0f));
        a(obtainStyledAttributes.getBoolean(R.styleable.DrawerArrowToggle_spinBars, true));
        b((float) Math.round(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.i = obtainStyledAttributes.getDimensionPixelSize(R.styleable.DrawerArrowToggle_drawableSize, 0);
        this.d = (float) Math.round(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_barLength, 0.0f));
        this.c = (float) Math.round(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.e = obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private static float a(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    public void a(float f) {
        if (this.a.getStrokeWidth() != f) {
            this.a.setStrokeWidth(f);
            this.l = (float) (((double) (f / 2.0f)) * Math.cos((double) b));
            invalidateSelf();
        }
    }

    public void a(int i) {
        if (i != this.a.getColor()) {
            this.a.setColor(i);
            invalidateSelf();
        }
    }

    public void a(boolean z) {
        if (this.g != z) {
            this.g = z;
            invalidateSelf();
        }
    }

    public void b(float f) {
        if (f != this.f) {
            this.f = f;
            invalidateSelf();
        }
    }

    public void b(boolean z) {
        if (this.j != z) {
            this.j = z;
            invalidateSelf();
        }
    }

    public void c(float f) {
        if (this.k != f) {
            this.k = f;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        int i;
        Rect bounds = getBounds();
        switch (this.m) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 3:
                if (a.g(this) != 0) {
                    i = 0;
                    break;
                } else {
                    i = 1;
                    break;
                }
            default:
                if (a.g(this) != 1) {
                    i = 0;
                    break;
                } else {
                    i = 1;
                    break;
                }
        }
        float a = a(this.d, (float) Math.sqrt((double) ((this.c * this.c) * 2.0f)), this.k);
        float a2 = a(this.d, this.e, this.k);
        float round = (float) Math.round(a(0.0f, this.l, this.k));
        float a3 = a(0.0f, b, this.k);
        float a4 = a(i != 0 ? 0.0f : -180.0f, i != 0 ? 180.0f : 0.0f, this.k);
        float round2 = (float) Math.round(((double) a) * Math.cos((double) a3));
        a = (float) Math.round(((double) a) * Math.sin((double) a3));
        this.h.rewind();
        a3 = a(this.f + this.a.getStrokeWidth(), -this.l, this.k);
        float f = (-a2) / 2.0f;
        this.h.moveTo(f + round, 0.0f);
        this.h.rLineTo(a2 - (round * 2.0f), 0.0f);
        this.h.moveTo(f, a3);
        this.h.rLineTo(round2, a);
        this.h.moveTo(f, -a3);
        this.h.rLineTo(round2, -a);
        this.h.close();
        canvas.save();
        round2 = this.a.getStrokeWidth();
        canvas.translate((float) bounds.centerX(), (float) (((double) ((float) ((((int) ((((float) bounds.height()) - (3.0f * round2)) - (this.f * 2.0f))) / 4) * 2))) + ((((double) round2) * 1.5d) + ((double) this.f))));
        if (this.g) {
            canvas.rotate(((float) ((i ^ this.j) != 0 ? -1 : 1)) * a4);
        } else if (i != 0) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.h, this.a);
        canvas.restore();
    }

    public int getIntrinsicHeight() {
        return this.i;
    }

    public int getIntrinsicWidth() {
        return this.i;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        if (i != this.a.getAlpha()) {
            this.a.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
