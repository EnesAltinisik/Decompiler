package android.support.v7.app;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.appcompat.R;
import android.support.v7.view.g;
import android.support.v7.view.i;
import android.support.v7.widget.bl;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;
import java.lang.Thread.UncaughtExceptionHandler;

@TargetApi(9)
abstract class h extends g {
    private static boolean m = true;
    private static final boolean n = (VERSION.SDK_INT < 21);
    private static final int[] o = new int[]{16842836};
    final Context a;
    final Window b;
    final Callback c = this.b.getCallback();
    final Callback d;
    final f e;
    a f;
    MenuInflater g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    private CharSequence p;
    private boolean q;
    private boolean r;

    private class a implements android.support.v7.app.b.a {
        final /* synthetic */ h a;

        a(h hVar) {
            this.a = hVar;
        }

        public Drawable a() {
            bl a = bl.a(b(), null, new int[]{R.attr.homeAsUpIndicator});
            Drawable a2 = a.a(0);
            a.a();
            return a2;
        }

        public void a(int i) {
            a a = this.a.a();
            if (a != null) {
                a.a(i);
            }
        }

        public void a(Drawable drawable, int i) {
            a a = this.a.a();
            if (a != null) {
                a.a(drawable);
                a.a(i);
            }
        }

        public Context b() {
            return this.a.o();
        }

        public boolean c() {
            a a = this.a.a();
            return (a == null || (a.a() & 4) == 0) ? false : true;
        }
    }

    class b extends i {
        final /* synthetic */ h a;

        b(h hVar, Callback callback) {
            this.a = hVar;
            super(callback);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.a.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || this.a.a(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            return (i != 0 || (menu instanceof android.support.v7.view.menu.h)) ? super.onCreatePanelMenu(i, menu) : false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            this.a.b(i, menu);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            this.a.a(i, menu);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            android.support.v7.view.menu.h hVar = menu instanceof android.support.v7.view.menu.h ? (android.support.v7.view.menu.h) menu : null;
            if (i == 0 && hVar == null) {
                return false;
            }
            if (hVar != null) {
                hVar.c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (hVar == null) {
                return onPreparePanel;
            }
            hVar.c(false);
            return onPreparePanel;
        }
    }

    static {
        if (n && !m) {
            final UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
                private boolean a(Throwable th) {
                    if (!(th instanceof NotFoundException)) {
                        return false;
                    }
                    String message = th.getMessage();
                    return message != null ? message.contains("drawable") || message.contains("Drawable") : false;
                }

                public void uncaughtException(Thread thread, Throwable th) {
                    if (a(th)) {
                        Throwable notFoundException = new NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                        notFoundException.initCause(th.getCause());
                        notFoundException.setStackTrace(th.getStackTrace());
                        defaultUncaughtExceptionHandler.uncaughtException(thread, notFoundException);
                        return;
                    }
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }
            });
        }
    }

    h(Context context, Window window, f fVar) {
        this.a = context;
        this.b = window;
        this.e = fVar;
        if (this.c instanceof b) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.d = a(this.c);
        this.b.setCallback(this.d);
        bl a = bl.a(context, null, o);
        Drawable b = a.b(0);
        if (b != null) {
            this.b.setBackgroundDrawable(b);
        }
        a.a();
    }

    public a a() {
        m();
        return this.f;
    }

    abstract android.support.v7.view.b a(android.support.v7.view.b.a aVar);

    Callback a(Callback callback) {
        return new b(this, callback);
    }

    abstract void a(int i, Menu menu);

    public final void a(CharSequence charSequence) {
        this.p = charSequence;
        b(charSequence);
    }

    abstract boolean a(int i, KeyEvent keyEvent);

    abstract boolean a(KeyEvent keyEvent);

    public MenuInflater b() {
        if (this.g == null) {
            m();
            this.g = new g(this.f != null ? this.f.c() : this.a);
        }
        return this.g;
    }

    abstract void b(CharSequence charSequence);

    abstract boolean b(int i, Menu menu);

    public void c() {
        this.q = true;
    }

    public void c(Bundle bundle) {
    }

    public void d() {
        this.q = false;
    }

    public void g() {
        this.r = true;
    }

    public final android.support.v7.app.b.a h() {
        return new a(this);
    }

    public boolean j() {
        return false;
    }

    abstract void m();

    final a n() {
        return this.f;
    }

    final Context o() {
        Context context = null;
        a a = a();
        if (a != null) {
            context = a.c();
        }
        return context == null ? this.a : context;
    }

    public boolean p() {
        return false;
    }

    final boolean q() {
        return this.r;
    }

    final Callback r() {
        return this.b.getCallback();
    }

    final CharSequence s() {
        return this.c instanceof Activity ? ((Activity) this.c).getTitle() : this.p;
    }
}
