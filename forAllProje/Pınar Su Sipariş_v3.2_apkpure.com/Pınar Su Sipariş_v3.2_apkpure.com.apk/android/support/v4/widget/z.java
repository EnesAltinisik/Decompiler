package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.TextView;

/* compiled from: TextViewCompat */
public final class z {
    static final f a;

    /* compiled from: TextViewCompat */
    interface f {
        void a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4);
    }

    /* compiled from: TextViewCompat */
    static class b implements f {
        b() {
        }

        public void a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* compiled from: TextViewCompat */
    static class e extends b {
        e() {
        }
    }

    /* compiled from: TextViewCompat */
    static class c extends e {
        c() {
        }

        public void a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            aa.a(textView, drawable, drawable2, drawable3, drawable4);
        }
    }

    /* compiled from: TextViewCompat */
    static class d extends c {
        d() {
        }

        public void a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            ab.a(textView, drawable, drawable2, drawable3, drawable4);
        }
    }

    /* compiled from: TextViewCompat */
    static class a extends d {
        a() {
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            a = new a();
        } else if (i >= 18) {
            a = new d();
        } else if (i >= 17) {
            a = new c();
        } else if (i >= 16) {
            a = new e();
        } else {
            a = new b();
        }
    }

    public static void a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        a.a(textView, drawable, drawable2, drawable3, drawable4);
    }
}
