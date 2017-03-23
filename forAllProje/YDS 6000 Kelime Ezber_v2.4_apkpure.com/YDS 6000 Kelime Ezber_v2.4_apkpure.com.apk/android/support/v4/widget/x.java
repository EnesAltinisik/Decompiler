package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.TextView;

public final class x {
    static final f a;

    interface f {
        int a(TextView textView);

        void a(TextView textView, int i);

        void a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4);
    }

    static class b implements f {
        b() {
        }

        public int a(TextView textView) {
            return z.a(textView);
        }

        public void a(TextView textView, int i) {
            z.a(textView, i);
        }

        public void a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    static class e extends b {
        e() {
        }

        public int a(TextView textView) {
            return aa.a(textView);
        }
    }

    static class c extends e {
        c() {
        }

        public void a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            ab.a(textView, drawable, drawable2, drawable3, drawable4);
        }
    }

    static class d extends c {
        d() {
        }

        public void a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            ac.a(textView, drawable, drawable2, drawable3, drawable4);
        }
    }

    static class a extends d {
        a() {
        }

        public void a(TextView textView, int i) {
            y.a(textView, i);
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

    public static int a(TextView textView) {
        return a.a(textView);
    }

    public static void a(TextView textView, int i) {
        a.a(textView, i);
    }

    public static void a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        a.a(textView, drawable, drawable2, drawable3, drawable4);
    }
}
