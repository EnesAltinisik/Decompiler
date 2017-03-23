package com.google.android.gms.b;

import com.google.android.gms.b.wp.a;
import java.lang.ref.WeakReference;

@vz
public final class wh extends a {
    private final WeakReference<wc.a> a;

    public wh(wc.a aVar) {
        this.a = new WeakReference(aVar);
    }

    public void a(wi wiVar) {
        wc.a aVar = (wc.a) this.a.get();
        if (aVar != null) {
            aVar.a(wiVar);
        }
    }
}
