package com.mikepenz.iconics;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;

public class a extends Drawable {
    private ColorFilter A;
    private Context a;
    private int b = -1;
    private int c = -1;
    private boolean d = false;
    private int e;
    private Paint f;
    private int g;
    private Paint h;
    private int i;
    private Paint j;
    private int k = -1;
    private int l = -1;
    private Rect m;
    private RectF n;
    private Path o;
    private int p;
    private int q;
    private int r = 0;
    private int s = 0;
    private int t = 255;
    private boolean u;
    private com.mikepenz.iconics.a.a v;
    private String w;
    private ColorStateList x;
    private Mode y = Mode.SRC_IN;
    private ColorFilter z;

    public a(Context context) {
        this.a = context.getApplicationContext();
        c();
        a(Character.valueOf(' '));
    }

    public a(Context context, com.mikepenz.iconics.a.a aVar) {
        this.a = context.getApplicationContext();
        c();
        a(aVar);
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, Mode mode) {
        return (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void a(Rect rect) {
        if (this.p >= 0 && this.p * 2 <= rect.width() && this.p * 2 <= rect.height()) {
            this.m.set(rect.left + this.p, rect.top + this.p, rect.right - this.p, rect.bottom - this.p);
        }
    }

    private void b(Rect rect) {
        float height = ((float) rect.height()) * ((float) (this.d ? 1 : 2));
        this.f.setTextSize(height);
        String valueOf = this.v != null ? String.valueOf(this.v.a()) : String.valueOf(this.w);
        this.f.getTextPath(valueOf, 0, valueOf.length(), 0.0f, (float) rect.height(), this.o);
        this.o.computeBounds(this.n, true);
        if (!this.d) {
            float width = ((float) this.m.width()) / this.n.width();
            float height2 = ((float) this.m.height()) / this.n.height();
            if (width >= height2) {
                width = height2;
            }
            this.f.setTextSize(width * height);
            this.f.getTextPath(valueOf, 0, valueOf.length(), 0.0f, (float) rect.height(), this.o);
            this.o.computeBounds(this.n, true);
        }
    }

    private void c() {
        this.f = new TextPaint(1);
        this.f.setStyle(Style.FILL);
        this.f.setTextAlign(Align.CENTER);
        this.f.setUnderlineText(false);
        this.f.setAntiAlias(true);
        this.j = new Paint(1);
        this.h = new Paint(1);
        this.h.setStyle(Style.STROKE);
        this.o = new Path();
        this.n = new RectF();
        this.m = new Rect();
    }

    private void c(Rect rect) {
        this.o.offset(((((float) rect.centerX()) - (this.n.width() / 2.0f)) - this.n.left) + ((float) this.r), ((((float) rect.centerY()) - (this.n.height() / 2.0f)) - this.n.top) + ((float) this.s));
    }

    public a a() {
        f(24);
        d(1);
        return this;
    }

    public a a(int i) {
        this.f.setColor(Color.rgb(Color.red(i), Color.green(i), Color.blue(i)));
        this.e = i;
        setAlpha(Color.alpha(i));
        invalidateSelf();
        return this;
    }

    public a a(Typeface typeface) {
        this.f.setTypeface(typeface);
        return this;
    }

    public a a(com.mikepenz.iconics.a.a aVar) {
        this.v = aVar;
        this.w = null;
        this.f.setTypeface(aVar.b().getTypeface(this.a));
        invalidateSelf();
        return this;
    }

    public a a(Character ch) {
        return a(ch.toString());
    }

    public a a(String str) {
        this.w = str;
        this.v = null;
        this.f.setTypeface(Typeface.DEFAULT);
        invalidateSelf();
        return this;
    }

    public a a(boolean z) {
        if (this.u != z) {
            this.u = z;
            if (this.u) {
                this.p += this.q;
            } else {
                this.p -= this.q;
            }
            invalidateSelf();
        }
        return this;
    }

    public a b() {
        a a = new a(this.a).e(this.p).l(this.k).m(this.l).h(this.b).i(this.c).b(this.r).c(this.s).j(this.g).n(this.q).k(this.i).a(this.e).o(this.t).a(this.u).a(this.f.getTypeface());
        if (this.v != null) {
            a.a(this.v);
        } else if (this.w != null) {
            a.a(this.w);
        }
        return a;
    }

    public a b(int i) {
        this.r = i;
        return this;
    }

    public a c(int i) {
        this.s = i;
        return this;
    }

    public void clearColorFilter() {
        this.A = null;
        invalidateSelf();
    }

    public /* synthetic */ Object clone() {
        return b();
    }

    public a d(int i) {
        return e(com.mikepenz.iconics.b.a.a(this.a, (float) i));
    }

    public void draw(Canvas canvas) {
        if (this.v != null || this.w != null) {
            Rect bounds = getBounds();
            a(bounds);
            b(bounds);
            c(bounds);
            if (this.j != null && this.l > -1 && this.k > -1) {
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, (float) bounds.width(), (float) bounds.height()), (float) this.k, (float) this.l, this.j);
            }
            this.o.close();
            if (this.u) {
                canvas.drawPath(this.o, this.h);
            }
            this.f.setAlpha(this.t);
            this.f.setColorFilter(this.A == null ? this.z : this.A);
            canvas.drawPath(this.o, this.f);
        }
    }

    public a e(int i) {
        if (this.p != i) {
            this.p = i;
            if (this.u) {
                this.p += this.q;
            }
            invalidateSelf();
        }
        return this;
    }

    public a f(int i) {
        return g(com.mikepenz.iconics.b.a.a(this.a, (float) i));
    }

    public a g(int i) {
        this.b = i;
        this.c = i;
        setBounds(0, 0, i, i);
        invalidateSelf();
        return this;
    }

    public int getAlpha() {
        return this.t;
    }

    public int getIntrinsicHeight() {
        return this.c;
    }

    public int getIntrinsicWidth() {
        return this.b;
    }

    public int getOpacity() {
        return this.t;
    }

    public a h(int i) {
        this.b = i;
        setBounds(0, 0, this.b, this.c);
        invalidateSelf();
        return this;
    }

    public a i(int i) {
        this.c = i;
        setBounds(0, 0, this.b, this.c);
        invalidateSelf();
        return this;
    }

    public boolean isStateful() {
        return true;
    }

    public a j(int i) {
        this.h.setColor(Color.rgb(Color.red(i), Color.green(i), Color.blue(i)));
        this.h.setAlpha(Color.alpha(i));
        this.g = i;
        invalidateSelf();
        return this;
    }

    public a k(int i) {
        this.j.setColor(i);
        this.i = i;
        this.k = 0;
        this.l = 0;
        return this;
    }

    public a l(int i) {
        this.k = i;
        return this;
    }

    public a m(int i) {
        this.l = i;
        return this;
    }

    public a n(int i) {
        this.q = i;
        this.h.setStrokeWidth((float) this.q);
        a(true);
        invalidateSelf();
        return this;
    }

    public a o(int i) {
        setAlpha(i);
        return this;
    }

    protected void onBoundsChange(Rect rect) {
        c(rect);
        this.o.close();
        super.onBoundsChange(rect);
    }

    protected boolean onStateChange(int[] iArr) {
        if (this.x == null || this.y == null) {
            return false;
        }
        this.z = a(this.x, this.y);
        invalidateSelf();
        return true;
    }

    public void setAlpha(int i) {
        this.f.setAlpha(i);
        this.t = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A = colorFilter;
        invalidateSelf();
    }

    public boolean setState(int[] iArr) {
        setAlpha(this.t);
        return super.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.x = colorStateList;
        this.z = a(colorStateList, this.y);
        invalidateSelf();
    }

    public void setTintMode(Mode mode) {
        this.y = mode;
        this.z = a(this.x, mode);
        invalidateSelf();
    }
}
