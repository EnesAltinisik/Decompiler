package android.support.design.internal;

import android.content.Context;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.u;
import android.view.SubMenu;

public class b extends h {
    public b(Context context) {
        super(context);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        j jVar = (j) a(i, i2, i3, charSequence);
        u dVar = new d(e(), this, jVar);
        jVar.a(dVar);
        return dVar;
    }
}
