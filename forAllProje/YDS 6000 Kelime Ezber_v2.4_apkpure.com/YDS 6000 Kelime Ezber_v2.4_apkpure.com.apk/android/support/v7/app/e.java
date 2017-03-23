package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.b.ac;
import android.support.v4.b.ay;
import android.support.v4.b.ay.a;
import android.support.v4.b.m;
import android.support.v4.view.h;
import android.support.v7.app.b.b;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.bn;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class e extends m implements a, b, f {
    private g m;
    private int n = 0;
    private boolean o;
    private Resources p;

    public Intent a() {
        return ac.a(this);
    }

    public android.support.v7.view.b a(android.support.v7.view.b.a aVar) {
        return null;
    }

    public void a(ay ayVar) {
        ayVar.a((Activity) this);
    }

    public void a(android.support.v7.view.b bVar) {
    }

    public void a(Toolbar toolbar) {
        i().a(toolbar);
    }

    public boolean a(Intent intent) {
        return ac.a((Activity) this, intent);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        i().b(view, layoutParams);
    }

    public b.a b() {
        return i().h();
    }

    public void b(Intent intent) {
        ac.b((Activity) this, intent);
    }

    public void b(ay ayVar) {
    }

    public void b(android.support.v7.view.b bVar) {
    }

    public void c() {
        i().f();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (h.b(keyEvent) && keyEvent.getUnicodeChar(keyEvent.getMetaState() & -28673) == 60) {
            int action = keyEvent.getAction();
            if (action == 0) {
                a f = f();
                if (f != null && f.b() && f.g()) {
                    this.o = true;
                    return true;
                }
            } else if (action == 1 && this.o) {
                this.o = false;
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public a f() {
        return i().a();
    }

    public View findViewById(int i) {
        return i().a(i);
    }

    public boolean g() {
        Intent a = a();
        if (a == null) {
            return false;
        }
        if (a(a)) {
            ay a2 = ay.a((Context) this);
            a(a2);
            b(a2);
            a2.a();
            try {
                android.support.v4.b.a.a(this);
            } catch (IllegalStateException e) {
                finish();
            }
        } else {
            b(a);
        }
        return true;
    }

    public MenuInflater getMenuInflater() {
        return i().b();
    }

    public Resources getResources() {
        if (this.p == null && bn.a()) {
            this.p = new bn(this, super.getResources());
        }
        return this.p == null ? super.getResources() : this.p;
    }

    @Deprecated
    public void h() {
    }

    public g i() {
        if (this.m == null) {
            this.m = g.a((Activity) this, (f) this);
        }
        return this.m;
    }

    public void invalidateOptionsMenu() {
        i().f();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i().a(configuration);
        if (this.p != null) {
            this.p.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        h();
    }

    protected void onCreate(Bundle bundle) {
        g i = i();
        i.i();
        i.a(bundle);
        if (i.j() && this.n != 0) {
            if (VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.n, false);
            } else {
                setTheme(this.n);
            }
        }
        super.onCreate(bundle);
    }

    protected void onDestroy() {
        super.onDestroy();
        i().g();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        a f = f();
        return (menuItem.getItemId() != 16908332 || f == null || (f.a() & 4) == 0) ? false : g();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        i().b(bundle);
    }

    protected void onPostResume() {
        super.onPostResume();
        i().e();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        i().c(bundle);
    }

    protected void onStart() {
        super.onStart();
        i().c();
    }

    protected void onStop() {
        super.onStop();
        i().d();
    }

    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        i().a(charSequence);
    }

    public void setContentView(int i) {
        i().b(i);
    }

    public void setContentView(View view) {
        i().a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        i().a(view, layoutParams);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.n = i;
    }
}
