package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.view.ah;
import android.support.v7.appcompat.R;
import android.util.AttributeSet;
import android.widget.RatingBar;

public class t extends RatingBar {
    private s a;

    public t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ratingBarStyle);
    }

    public t(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new s(this);
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
