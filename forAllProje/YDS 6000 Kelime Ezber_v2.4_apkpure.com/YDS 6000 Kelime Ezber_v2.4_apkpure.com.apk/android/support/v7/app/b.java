package android.support.v7.app;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class b implements android.support.v4.widget.DrawerLayout.f {
    boolean a;
    OnClickListener b;
    private final a c;
    private final DrawerLayout d;
    private android.support.v7.b.a.b e;
    private Drawable f;
    private final int g;
    private final int h;
    private boolean i;

    public interface a {
        Drawable a();

        void a(int i);

        void a(Drawable drawable, int i);

        Context b();

        boolean c();
    }

    public interface b {
        a b();
    }

    static class c implements a {
        final Activity a;

        c(Activity activity) {
            this.a = activity;
        }

        public Drawable a() {
            return null;
        }

        public void a(int i) {
        }

        public void a(Drawable drawable, int i) {
        }

        public Context b() {
            return this.a;
        }

        public boolean c() {
            return true;
        }
    }

    @TargetApi(11)
    private static class d implements a {
        final Activity a;
        a b;

        d(Activity activity) {
            this.a = activity;
        }

        public Drawable a() {
            return c.a(this.a);
        }

        public void a(int i) {
            this.b = c.a(this.b, this.a, i);
        }

        public void a(Drawable drawable, int i) {
            ActionBar actionBar = this.a.getActionBar();
            if (actionBar != null) {
                actionBar.setDisplayShowHomeEnabled(true);
                this.b = c.a(this.b, this.a, drawable, i);
                actionBar.setDisplayShowHomeEnabled(false);
            }
        }

        public Context b() {
            return this.a;
        }

        public boolean c() {
            ActionBar actionBar = this.a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }
    }

    @TargetApi(14)
    private static class e extends d {
        e(Activity activity) {
            super(activity);
        }

        public Context b() {
            ActionBar actionBar = this.a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.a;
        }
    }

    @TargetApi(18)
    private static class f implements a {
        final Activity a;

        f(Activity activity) {
            this.a = activity;
        }

        public Drawable a() {
            TypedArray obtainStyledAttributes = b().obtainStyledAttributes(null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        public void a(int i) {
            ActionBar actionBar = this.a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i);
            }
        }

        public void a(Drawable drawable, int i) {
            ActionBar actionBar = this.a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i);
            }
        }

        public Context b() {
            ActionBar actionBar = this.a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.a;
        }

        public boolean c() {
            ActionBar actionBar = this.a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }
    }

    static class g implements a {
        final Toolbar a;
        final Drawable b;
        final CharSequence c;

        g(Toolbar toolbar) {
            this.a = toolbar;
            this.b = toolbar.getNavigationIcon();
            this.c = toolbar.getNavigationContentDescription();
        }

        public Drawable a() {
            return this.b;
        }

        public void a(int i) {
            if (i == 0) {
                this.a.setNavigationContentDescription(this.c);
            } else {
                this.a.setNavigationContentDescription(i);
            }
        }

        public void a(Drawable drawable, int i) {
            this.a.setNavigationIcon(drawable);
            a(i);
        }

        public Context b() {
            return this.a.getContext();
        }

        public boolean c() {
            return true;
        }
    }

    public b(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i, int i2) {
        this(activity, toolbar, drawerLayout, null, i, i2);
    }

    b(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, android.support.v7.b.a.b bVar, int i, int i2) {
        this.a = true;
        this.i = false;
        if (toolbar != null) {
            this.c = new g(toolbar);
            toolbar.setNavigationOnClickListener(new OnClickListener(this) {
                final /* synthetic */ b a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    if (this.a.a) {
                        this.a.b();
                    } else if (this.a.b != null) {
                        this.a.b.onClick(view);
                    }
                }
            });
        } else if (activity instanceof b) {
            this.c = ((b) activity).b();
        } else if (VERSION.SDK_INT >= 18) {
            this.c = new f(activity);
        } else if (VERSION.SDK_INT >= 14) {
            this.c = new e(activity);
        } else if (VERSION.SDK_INT >= 11) {
            this.c = new d(activity);
        } else {
            this.c = new c(activity);
        }
        this.d = drawerLayout;
        this.g = i;
        this.h = i2;
        if (bVar == null) {
            this.e = new android.support.v7.b.a.b(this.c.b());
        } else {
            this.e = bVar;
        }
        this.f = c();
    }

    private void a(float f) {
        if (f == 1.0f) {
            this.e.b(true);
        } else if (f == 0.0f) {
            this.e.b(false);
        }
        this.e.c(f);
    }

    public void a() {
        if (this.d.g(8388611)) {
            a(1.0f);
        } else {
            a(0.0f);
        }
        if (this.a) {
            a(this.e, this.d.g(8388611) ? this.h : this.g);
        }
    }

    public void a(int i) {
    }

    void a(Drawable drawable, int i) {
        if (!(this.i || this.c.c())) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.i = true;
        }
        this.c.a(drawable, i);
    }

    public void a(View view) {
        a(1.0f);
        if (this.a) {
            b(this.h);
        }
    }

    public void a(View view, float f) {
        a(Math.min(1.0f, Math.max(0.0f, f)));
    }

    void b() {
        int a = this.d.a(8388611);
        if (this.d.h(8388611) && a != 2) {
            this.d.f(8388611);
        } else if (a != 1) {
            this.d.e(8388611);
        }
    }

    void b(int i) {
        this.c.a(i);
    }

    public void b(View view) {
        a(0.0f);
        if (this.a) {
            b(this.g);
        }
    }

    Drawable c() {
        return this.c.a();
    }
}
