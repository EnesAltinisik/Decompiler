package android.support.v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

@TargetApi(9)
class ac implements ad {
    final RectF a = new RectF();

    ac() {
    }

    private ba a(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new ba(context.getResources(), colorStateList, f, f2, f3);
    }

    private ba j(ab abVar) {
        return (ba) abVar.c();
    }

    public float a(ab abVar) {
        return j(abVar).c();
    }

    public void a() {
        ba.c = new a(this) {
            final /* synthetic */ ac a;

            {
                this.a = r1;
            }

            public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
                float f2 = 2.0f * f;
                float width = (rectF.width() - f2) - 1.0f;
                float height = (rectF.height() - f2) - 1.0f;
                if (f >= 1.0f) {
                    float f3 = f + 0.5f;
                    this.a.a.set(-f3, -f3, f3, f3);
                    int save = canvas.save();
                    canvas.translate(rectF.left + f3, rectF.top + f3);
                    canvas.drawArc(this.a.a, 180.0f, 90.0f, true, paint);
                    canvas.translate(width, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(this.a.a, 180.0f, 90.0f, true, paint);
                    canvas.translate(height, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(this.a.a, 180.0f, 90.0f, true, paint);
                    canvas.translate(width, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(this.a.a, 180.0f, 90.0f, true, paint);
                    canvas.restoreToCount(save);
                    canvas.drawRect((rectF.left + f3) - 1.0f, rectF.top, 1.0f + (rectF.right - f3), rectF.top + f3, paint);
                    canvas.drawRect((rectF.left + f3) - 1.0f, rectF.bottom - f3, 1.0f + (rectF.right - f3), rectF.bottom, paint);
                }
                canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
            }
        };
    }

    public void a(ab abVar, float f) {
        j(abVar).a(f);
        f(abVar);
    }

    public void a(ab abVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        Drawable a = a(context, colorStateList, f, f2, f3);
        a.a(abVar.b());
        abVar.a(a);
        f(abVar);
    }

    public void a(ab abVar, ColorStateList colorStateList) {
        j(abVar).a(colorStateList);
    }

    public float b(ab abVar) {
        return j(abVar).d();
    }

    public void b(ab abVar, float f) {
        j(abVar).c(f);
        f(abVar);
    }

    public float c(ab abVar) {
        return j(abVar).e();
    }

    public void c(ab abVar, float f) {
        j(abVar).b(f);
    }

    public float d(ab abVar) {
        return j(abVar).a();
    }

    public float e(ab abVar) {
        return j(abVar).b();
    }

    public void f(ab abVar) {
        Rect rect = new Rect();
        j(abVar).a(rect);
        abVar.a((int) Math.ceil((double) b(abVar)), (int) Math.ceil((double) c(abVar)));
        abVar.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void g(ab abVar) {
    }

    public void h(ab abVar) {
        j(abVar).a(abVar.b());
        f(abVar);
    }

    public ColorStateList i(ab abVar) {
        return j(abVar).f();
    }
}
