package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.g.c;
import android.support.v7.app.b.a;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

public abstract class g {
    private static int a = -1;
    private static boolean b = false;

    g() {
    }

    public static g a(Activity activity, f fVar) {
        return a(activity, activity.getWindow(), fVar);
    }

    public static g a(Dialog dialog, f fVar) {
        return a(dialog.getContext(), dialog.getWindow(), fVar);
    }

    private static g a(Context context, Window window, f fVar) {
        int i = VERSION.SDK_INT;
        return c.a() ? new i(context, window, fVar) : i >= 23 ? new l(context, window, fVar) : i >= 14 ? new k(context, window, fVar) : i >= 11 ? new j(context, window, fVar) : new m(context, window, fVar);
    }

    public static void a(boolean z) {
        b = z;
    }

    public static int k() {
        return a;
    }

    public static boolean l() {
        return b;
    }

    public abstract a a();

    public abstract View a(int i);

    public abstract void a(Configuration configuration);

    public abstract void a(Bundle bundle);

    public abstract void a(Toolbar toolbar);

    public abstract void a(View view);

    public abstract void a(View view, LayoutParams layoutParams);

    public abstract void a(CharSequence charSequence);

    public abstract MenuInflater b();

    public abstract void b(int i);

    public abstract void b(Bundle bundle);

    public abstract void b(View view, LayoutParams layoutParams);

    public abstract void c();

    public abstract void c(Bundle bundle);

    public abstract boolean c(int i);

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract a h();

    public abstract void i();

    public abstract boolean j();
}
