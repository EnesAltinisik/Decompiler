package android.support.v7.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.view.as;
import android.support.v7.a.a.b;
import android.support.v7.a.a.d;
import android.support.v7.a.a.g;
import android.support.v7.a.a.k;
import android.view.ViewConfiguration;

/* compiled from: ActionBarPolicy */
public class a {
    private Context a;

    public static a a(Context context) {
        return new a(context);
    }

    private a(Context context) {
        this.a = context;
    }

    public int a() {
        return this.a.getResources().getInteger(g.abc_max_action_buttons);
    }

    public boolean b() {
        if (VERSION.SDK_INT < 19 && as.b(ViewConfiguration.get(this.a))) {
            return false;
        }
        return true;
    }

    public int c() {
        return this.a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public boolean d() {
        if (this.a.getApplicationInfo().targetSdkVersion >= 16) {
            return this.a.getResources().getBoolean(b.abc_action_bar_embed_tabs);
        }
        return this.a.getResources().getBoolean(b.abc_action_bar_embed_tabs_pre_jb);
    }

    public int e() {
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, k.ActionBar, android.support.v7.a.a.a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(k.ActionBar_height, 0);
        Resources resources = this.a.getResources();
        if (!d()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean f() {
        return this.a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int g() {
        return this.a.getResources().getDimensionPixelSize(d.abc_action_bar_stacked_tab_max_width);
    }
}
