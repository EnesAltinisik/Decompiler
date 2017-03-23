package android.support.v4.view.b;

import android.view.animation.Interpolator;
import com.google.android.gms.cast.TextTrackStyle;

/* compiled from: LookupTableInterpolator */
abstract class d implements Interpolator {
    private final float[] a;
    private final float b = (TextTrackStyle.DEFAULT_FONT_SCALE / ((float) (this.a.length - 1)));

    public d(float[] fArr) {
        this.a = fArr;
    }

    public float getInterpolation(float f) {
        if (f >= TextTrackStyle.DEFAULT_FONT_SCALE) {
            return TextTrackStyle.DEFAULT_FONT_SCALE;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) (((float) (this.a.length - 1)) * f), this.a.length - 2);
        float f2 = (f - (((float) min) * this.b)) / this.b;
        return ((this.a[min + 1] - this.a[min]) * f2) + this.a[min];
    }
}
