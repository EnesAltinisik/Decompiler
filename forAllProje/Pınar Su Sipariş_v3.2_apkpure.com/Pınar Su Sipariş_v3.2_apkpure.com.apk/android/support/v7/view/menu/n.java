package android.support.v7.view.menu;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.e.a.a;
import android.support.v4.e.a.b;
import android.support.v4.e.a.c;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: MenuWrapperFactory */
public final class n {
    public static Menu a(Context context, a aVar) {
        if (VERSION.SDK_INT >= 14) {
            return new o(context, aVar);
        }
        throw new UnsupportedOperationException();
    }

    public static MenuItem a(Context context, b bVar) {
        if (VERSION.SDK_INT >= 16) {
            return new j(context, bVar);
        }
        if (VERSION.SDK_INT >= 14) {
            return new i(context, bVar);
        }
        throw new UnsupportedOperationException();
    }

    public static SubMenu a(Context context, c cVar) {
        if (VERSION.SDK_INT >= 14) {
            return new q(context, cVar);
        }
        throw new UnsupportedOperationException();
    }
}
