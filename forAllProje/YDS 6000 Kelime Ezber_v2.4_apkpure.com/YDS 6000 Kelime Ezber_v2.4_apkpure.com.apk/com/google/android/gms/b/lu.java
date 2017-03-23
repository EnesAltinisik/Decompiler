package com.google.android.gms.b;

import android.support.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

public class lu extends CustomTabsServiceConnection {
    private WeakReference<lv> a;

    public lu(lv lvVar) {
        this.a = new WeakReference(lvVar);
    }
}
