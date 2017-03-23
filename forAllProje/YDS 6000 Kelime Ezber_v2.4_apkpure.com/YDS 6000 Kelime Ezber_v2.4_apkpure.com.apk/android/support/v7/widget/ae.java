package android.support.v7.widget;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

@TargetApi(17)
class ae extends ac {
    ae() {
    }

    public void a() {
        ba.c = new a(this) {
            final /* synthetic */ ae a;

            {
                this.a = r1;
            }

            public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
                canvas.drawRoundRect(rectF, f, f, paint);
            }
        };
    }
}
