package android.support.v7.widget;

import android.graphics.drawable.Drawable;
import android.support.v4.b.b;
import android.support.v7.a.a.k;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: AppCompatImageHelper */
public class o {
    private final ImageView a;
    private final l b;

    public o(ImageView imageView, l lVar) {
        this.a = imageView;
        this.b = lVar;
    }

    public void a(AttributeSet attributeSet, int i) {
        az a = az.a(this.a.getContext(), attributeSet, k.AppCompatImageView, i, 0);
        try {
            Drawable b = a.b(k.AppCompatImageView_android_src);
            if (b != null) {
                this.a.setImageDrawable(b);
            }
            int g = a.g(k.AppCompatImageView_srcCompat, -1);
            if (g != -1) {
                b = this.b.a(this.a.getContext(), g);
                if (b != null) {
                    this.a.setImageDrawable(b);
                }
            }
            b = this.a.getDrawable();
            if (b != null) {
                af.a(b);
            }
            a.a();
        } catch (Throwable th) {
            a.a();
        }
    }

    public void a(int i) {
        if (i != 0) {
            Drawable a = this.b != null ? this.b.a(this.a.getContext(), i) : b.getDrawable(this.a.getContext(), i);
            if (a != null) {
                af.a(a);
            }
            this.a.setImageDrawable(a);
            return;
        }
        this.a.setImageDrawable(null);
    }
}
