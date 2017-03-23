package com.google.android.gms.b;

import com.google.android.gms.b.aw.a;
import java.util.concurrent.Callable;

public class ho implements Callable {
    private final eq a;
    private final a b;

    public ho(eq eqVar, a aVar) {
        this.a = eqVar;
        this.b = aVar;
    }

    public Void a() {
        if (this.a.m() != null) {
            this.a.m().get();
        }
        ln l = this.a.l();
        if (l != null) {
            try {
                synchronized (this.b) {
                    ln.a(this.b, ln.a(l));
                }
            } catch (lm e) {
            }
        }
        return null;
    }

    public /* synthetic */ Object call() {
        return a();
    }
}
