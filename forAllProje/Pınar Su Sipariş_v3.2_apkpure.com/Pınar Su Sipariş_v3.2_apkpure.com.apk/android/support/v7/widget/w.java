package android.support.v7.widget;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* compiled from: AppCompatSeekBarHelper */
class w extends s {
    private static final int[] b = new int[]{16843074};
    private final SeekBar c;

    w(SeekBar seekBar, l lVar) {
        super(seekBar, lVar);
        this.c = seekBar;
    }

    void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        az a = az.a(this.c.getContext(), attributeSet, b, i, 0);
        Drawable b = a.b(0);
        if (b != null) {
            this.c.setThumb(b);
        }
        a.a();
    }
}
