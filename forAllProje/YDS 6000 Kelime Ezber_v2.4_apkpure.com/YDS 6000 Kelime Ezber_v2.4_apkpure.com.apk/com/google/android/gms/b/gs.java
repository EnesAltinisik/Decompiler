package com.google.android.gms.b;

import com.google.android.gms.b.ip.a;
import com.google.firebase.database.b;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class gs {
    static final /* synthetic */ boolean a = (!gs.class.desiredAssertionStatus());
    private AtomicBoolean b = new AtomicBoolean(false);
    private gt c;
    private boolean d = false;

    public abstract in a(im imVar, it itVar);

    public abstract it a();

    public abstract void a(in inVar);

    public abstract void a(b bVar);

    public abstract boolean a(gs gsVar);

    public abstract boolean a(a aVar);

    public void b() {
        if (this.b.compareAndSet(false, true) && this.c != null) {
            this.c.a(this);
            this.c = null;
        }
    }

    public boolean c() {
        return this.b.get();
    }
}
