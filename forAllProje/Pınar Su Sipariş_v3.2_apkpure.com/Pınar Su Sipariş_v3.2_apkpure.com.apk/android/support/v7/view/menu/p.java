package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.b.b;
import android.support.v7.view.menu.f.a;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: SubMenuBuilder */
public class p extends f implements SubMenu {
    private f d;
    private h e;

    public p(Context context, f fVar, h hVar) {
        super(context);
        this.d = fVar;
        this.e = hVar;
    }

    public void setQwertyMode(boolean z) {
        this.d.setQwertyMode(z);
    }

    public boolean b() {
        return this.d.b();
    }

    public boolean c() {
        return this.d.c();
    }

    public Menu s() {
        return this.d;
    }

    public MenuItem getItem() {
        return this.e;
    }

    public void a(a aVar) {
        this.d.a(aVar);
    }

    public f p() {
        return this.d;
    }

    boolean a(f fVar, MenuItem menuItem) {
        return super.a(fVar, menuItem) || this.d.a(fVar, menuItem);
    }

    public SubMenu setIcon(Drawable drawable) {
        this.e.setIcon(drawable);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.e.setIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        super.a(drawable);
        return this;
    }

    public SubMenu setHeaderIcon(int i) {
        super.a(b.getDrawable(e(), i));
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        super.a(e().getResources().getString(i));
        return this;
    }

    public SubMenu setHeaderView(View view) {
        super.a(view);
        return this;
    }

    public boolean c(h hVar) {
        return this.d.c(hVar);
    }

    public boolean d(h hVar) {
        return this.d.d(hVar);
    }

    public String a() {
        int itemId = this.e != null ? this.e.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.a() + ":" + itemId;
    }
}
