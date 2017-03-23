package com.google.android.gms.b;

import java.util.concurrent.ScheduledExecutorService;

public class gb {
    private final ScheduledExecutorService a;
    private final ga b;
    private final jc c;
    private final boolean d;
    private final String e;
    private final String f;

    public gb(jc jcVar, ga gaVar, ScheduledExecutorService scheduledExecutorService, boolean z, String str, String str2) {
        this.c = jcVar;
        this.b = gaVar;
        this.a = scheduledExecutorService;
        this.d = z;
        this.e = str;
        this.f = str2;
    }

    public jc a() {
        return this.c;
    }

    public ga b() {
        return this.b;
    }

    public ScheduledExecutorService c() {
        return this.a;
    }

    public boolean d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }

    public String f() {
        return this.f;
    }
}
