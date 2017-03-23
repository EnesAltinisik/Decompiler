package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.view.ah;
import android.support.v7.a.a.a;
import android.util.AttributeSet;
import android.widget.RatingBar;

/* compiled from: AppCompatRatingBar */
public class u extends RatingBar {
    private s a;
    private l b;

    public u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.ratingBarStyle);
    }

    public u(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = l.a();
        this.a = new s(this, this.b);
        this.a.a(attributeSet, i);
    }

    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap a = this.a.a();
        if (a != null) {
            setMeasuredDimension(ah.a(a.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
