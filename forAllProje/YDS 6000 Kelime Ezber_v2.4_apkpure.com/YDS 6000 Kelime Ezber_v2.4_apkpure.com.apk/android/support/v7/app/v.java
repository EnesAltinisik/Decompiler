package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.support.v7.appcompat.R;
import android.support.v7.view.i;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.h;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ah;
import android.support.v7.widget.bm;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window.Callback;
import java.util.ArrayList;

class v extends a {
    ah a;
    boolean b;
    Callback c;
    private boolean d;
    private boolean e;
    private ArrayList<android.support.v7.app.a.b> f = new ArrayList();
    private f g;
    private final Runnable h = new Runnable(this) {
        final /* synthetic */ v a;

        {
            this.a = r1;
        }

        public void run() {
            this.a.j();
        }
    };
    private final android.support.v7.widget.Toolbar.c i = new android.support.v7.widget.Toolbar.c(this) {
        final /* synthetic */ v a;

        {
            this.a = r1;
        }

        public boolean a(MenuItem menuItem) {
            return this.a.c.onMenuItemSelected(0, menuItem);
        }
    };

    private final class a implements android.support.v7.view.menu.o.a {
        final /* synthetic */ v a;
        private boolean b;

        a(v vVar) {
            this.a = vVar;
        }

        public void a(h hVar, boolean z) {
            if (!this.b) {
                this.b = true;
                this.a.a.n();
                if (this.a.c != null) {
                    this.a.c.onPanelClosed(108, hVar);
                }
                this.b = false;
            }
        }

        public boolean a(h hVar) {
            if (this.a.c == null) {
                return false;
            }
            this.a.c.onMenuOpened(108, hVar);
            return true;
        }
    }

    private final class b implements android.support.v7.view.menu.h.a {
        final /* synthetic */ v a;

        b(v vVar) {
            this.a = vVar;
        }

        public void a(h hVar) {
            if (this.a.c == null) {
                return;
            }
            if (this.a.a.i()) {
                this.a.c.onPanelClosed(108, hVar);
            } else if (this.a.c.onPreparePanel(0, null, hVar)) {
                this.a.c.onMenuOpened(108, hVar);
            }
        }

        public boolean a(h hVar, MenuItem menuItem) {
            return false;
        }
    }

    private final class c implements android.support.v7.view.menu.o.a {
        final /* synthetic */ v a;

        c(v vVar) {
            this.a = vVar;
        }

        public void a(h hVar, boolean z) {
            if (this.a.c != null) {
                this.a.c.onPanelClosed(0, hVar);
            }
        }

        public boolean a(h hVar) {
            if (hVar == null && this.a.c != null) {
                this.a.c.onMenuOpened(0, hVar);
            }
            return true;
        }
    }

    private class d extends i {
        final /* synthetic */ v a;

        public d(v vVar, Callback callback) {
            this.a = vVar;
            super(callback);
        }

        public View onCreatePanelView(int i) {
            switch (i) {
                case 0:
                    Menu r = this.a.a.r();
                    if (onPreparePanel(i, null, r) && onMenuOpened(i, r)) {
                        return this.a.a(r);
                    }
            }
            return super.onCreatePanelView(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel && !this.a.b) {
                this.a.a.m();
                this.a.b = true;
            }
            return onPreparePanel;
        }
    }

    public v(Toolbar toolbar, CharSequence charSequence, Callback callback) {
        this.a = new bm(toolbar, false);
        this.c = new d(this, callback);
        this.a.a(this.c);
        toolbar.setOnMenuItemClickListener(this.i);
        this.a.a(charSequence);
    }

    private void b(Menu menu) {
        if (this.g == null && (menu instanceof h)) {
            h hVar = (h) menu;
            Context b = this.a.b();
            TypedValue typedValue = new TypedValue();
            Theme newTheme = b.getResources().newTheme();
            newTheme.setTo(b.getTheme());
            newTheme.resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(R.attr.panelMenuListTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            } else {
                newTheme.applyStyle(R.style.Theme_AppCompat_CompactMenu, true);
            }
            Context contextThemeWrapper = new ContextThemeWrapper(b, 0);
            contextThemeWrapper.getTheme().setTo(newTheme);
            this.g = new f(contextThemeWrapper, R.layout.abc_list_menu_item_layout);
            this.g.a(new c(this));
            hVar.a(this.g);
        }
    }

    private Menu k() {
        if (!this.d) {
            this.a.a(new a(this), new b(this));
            this.d = true;
        }
        return this.a.r();
    }

    public int a() {
        return this.a.o();
    }

    View a(Menu menu) {
        b(menu);
        return (menu == null || this.g == null || this.g.d().getCount() <= 0) ? null : (View) this.g.a(this.a.a());
    }

    public void a(float f) {
        android.support.v4.view.ah.f(this.a.a(), f);
    }

    public void a(int i) {
        this.a.d(i);
    }

    public void a(Configuration configuration) {
        super.a(configuration);
    }

    public void a(Drawable drawable) {
        this.a.b(drawable);
    }

    public void a(CharSequence charSequence) {
        this.a.a(charSequence);
    }

    public void a(boolean z) {
    }

    public boolean a(int i, KeyEvent keyEvent) {
        Menu k = k();
        if (k != null) {
            k.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            k.performShortcut(i, keyEvent, 0);
        }
        return true;
    }

    public boolean b() {
        return this.a.q() == 0;
    }

    public Context c() {
        return this.a.b();
    }

    public void c(boolean z) {
    }

    public void d(boolean z) {
    }

    public void e(boolean z) {
        if (z != this.e) {
            this.e = z;
            int size = this.f.size();
            for (int i = 0; i < size; i++) {
                ((android.support.v7.app.a.b) this.f.get(i)).a(z);
            }
        }
    }

    public boolean e() {
        this.a.a().removeCallbacks(this.h);
        android.support.v4.view.ah.a(this.a.a(), this.h);
        return true;
    }

    public boolean f() {
        if (!this.a.c()) {
            return false;
        }
        this.a.d();
        return true;
    }

    public boolean g() {
        ViewGroup a = this.a.a();
        if (a == null || a.hasFocus()) {
            return false;
        }
        a.requestFocus();
        return true;
    }

    void h() {
        this.a.a().removeCallbacks(this.h);
    }

    public Callback i() {
        return this.c;
    }

    void j() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0030 in list [B:12:0x002d]
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:43)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r5 = this;
        r0 = 0;
        r1 = r5.k();
        r2 = r1 instanceof android.support.v7.view.menu.h;
        if (r2 == 0) goto L_0x0031;
    L_0x0009:
        r0 = r1;
        r0 = (android.support.v7.view.menu.h) r0;
        r2 = r0;
    L_0x000d:
        if (r2 == 0) goto L_0x0012;
    L_0x000f:
        r2.g();
    L_0x0012:
        r1.clear();	 Catch:{ all -> 0x0033 }
        r0 = r5.c;	 Catch:{ all -> 0x0033 }
        r3 = 0;	 Catch:{ all -> 0x0033 }
        r0 = r0.onCreatePanelMenu(r3, r1);	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x0028;	 Catch:{ all -> 0x0033 }
    L_0x001e:
        r0 = r5.c;	 Catch:{ all -> 0x0033 }
        r3 = 0;	 Catch:{ all -> 0x0033 }
        r4 = 0;	 Catch:{ all -> 0x0033 }
        r0 = r0.onPreparePanel(r3, r4, r1);	 Catch:{ all -> 0x0033 }
        if (r0 != 0) goto L_0x002b;	 Catch:{ all -> 0x0033 }
    L_0x0028:
        r1.clear();	 Catch:{ all -> 0x0033 }
    L_0x002b:
        if (r2 == 0) goto L_0x0030;
    L_0x002d:
        r2.h();
    L_0x0030:
        return;
    L_0x0031:
        r2 = r0;
        goto L_0x000d;
    L_0x0033:
        r0 = move-exception;
        if (r2 == 0) goto L_0x0039;
    L_0x0036:
        r2.h();
    L_0x0039:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.v.j():void");
    }
}
