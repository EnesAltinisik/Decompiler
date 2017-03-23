package android.support.v7.app;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ActionMode;
import android.view.Window;
import android.view.Window.Callback;

@TargetApi(14)
class k extends j {
    private int t = -100;
    private boolean u;
    private boolean v = true;
    private b w;

    class a extends b {
        final /* synthetic */ k c;

        a(k kVar, Callback callback) {
            this.c = kVar;
            super(kVar, callback);
        }

        final ActionMode a(ActionMode.Callback callback) {
            Object aVar = new android.support.v7.view.f.a(this.c.a, callback);
            android.support.v7.view.b b = this.c.b((android.support.v7.view.b.a) aVar);
            return b != null ? aVar.b(b) : null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return this.c.p() ? a(callback) : super.onWindowStartingActionMode(callback);
        }
    }

    final class b {
        final /* synthetic */ k a;
        private x b;
        private boolean c;
        private BroadcastReceiver d;
        private IntentFilter e;

        b(k kVar, x xVar) {
            this.a = kVar;
            this.b = xVar;
            this.c = xVar.a();
        }

        final int a() {
            this.c = this.b.a();
            return this.c ? 2 : 1;
        }

        final void b() {
            boolean a = this.b.a();
            if (a != this.c) {
                this.c = a;
                this.a.j();
            }
        }

        final void c() {
            d();
            if (this.d == null) {
                this.d = new BroadcastReceiver(this) {
                    final /* synthetic */ b a;

                    {
                        this.a = r1;
                    }

                    public void onReceive(Context context, Intent intent) {
                        this.a.b();
                    }
                };
            }
            if (this.e == null) {
                this.e = new IntentFilter();
                this.e.addAction("android.intent.action.TIME_SET");
                this.e.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.e.addAction("android.intent.action.TIME_TICK");
            }
            this.a.a.registerReceiver(this.d, this.e);
        }

        final void d() {
            if (this.d != null) {
                this.a.a.unregisterReceiver(this.d);
                this.d = null;
            }
        }
    }

    k(Context context, Window window, f fVar) {
        super(context, window, fVar);
    }

    private boolean h(int i) {
        Resources resources = this.a.getResources();
        Configuration configuration = resources.getConfiguration();
        int i2 = configuration.uiMode & 48;
        int i3 = i == 2 ? 32 : 16;
        if (i2 == i3) {
            return false;
        }
        if (z()) {
            ((Activity) this.a).recreate();
        } else {
            Configuration configuration2 = new Configuration(configuration);
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            configuration2.uiMode = i3 | (configuration2.uiMode & -49);
            resources.updateConfiguration(configuration2, displayMetrics);
            u.a(resources);
        }
        return true;
    }

    private int x() {
        return this.t != -100 ? this.t : g.k();
    }

    private void y() {
        if (this.w == null) {
            this.w = new b(this, x.a(this.a));
        }
    }

    private boolean z() {
        if (!this.u || !(this.a instanceof Activity)) {
            return false;
        }
        try {
            return (this.a.getPackageManager().getActivityInfo(new ComponentName(this.a, this.a.getClass()), 0).configChanges & 512) == 0;
        } catch (Throwable e) {
            Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
            return true;
        }
    }

    Callback a(Callback callback) {
        return new a(this, callback);
    }

    public void a(Bundle bundle) {
        super.a(bundle);
        if (bundle != null && this.t == -100) {
            this.t = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    public void c() {
        super.c();
        j();
    }

    public void c(Bundle bundle) {
        super.c(bundle);
        if (this.t != -100) {
            bundle.putInt("appcompat:local_night_mode", this.t);
        }
    }

    int d(int i) {
        switch (i) {
            case -100:
                return -1;
            case 0:
                y();
                return this.w.a();
            default:
                return i;
        }
    }

    public void d() {
        super.d();
        if (this.w != null) {
            this.w.d();
        }
    }

    public void g() {
        super.g();
        if (this.w != null) {
            this.w.d();
        }
    }

    public boolean j() {
        boolean z = false;
        int x = x();
        int d = d(x);
        if (d != -1) {
            z = h(d);
        }
        if (x == 0) {
            y();
            this.w.c();
        }
        this.u = true;
        return z;
    }

    public boolean p() {
        return this.v;
    }
}
