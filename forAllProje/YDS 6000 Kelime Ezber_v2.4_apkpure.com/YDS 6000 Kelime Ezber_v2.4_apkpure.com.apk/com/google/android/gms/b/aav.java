package com.google.android.gms.b;

import com.google.android.gms.ads.internal.v;
import com.google.android.gms.b.or.a;
import com.google.android.gms.common.util.d;
import java.util.HashMap;
import java.util.Map;

@vz
public class aav extends a {
    private final aaq a;
    private final Object b = new Object();
    private final float c;
    private int d;
    private os e;
    private boolean f;
    private boolean g;
    private float h;
    private boolean i = true;
    private float j;

    public aav(aaq com_google_android_gms_b_aaq, float f) {
        this.a = com_google_android_gms_b_aaq;
        this.c = f;
    }

    private void a(final int i, final int i2) {
        v.e().a(new Runnable(this) {
            final /* synthetic */ aav c;

            public void run() {
                boolean z = false;
                synchronized (this.c.b) {
                    boolean z2 = i != i2;
                    boolean z3 = !this.c.f && i2 == 1;
                    boolean z4 = z2 && i2 == 1;
                    boolean z5 = z2 && i2 == 2;
                    z2 = z2 && i2 == 3;
                    aav com_google_android_gms_b_aav = this.c;
                    if (this.c.f || z3) {
                        z = true;
                    }
                    com_google_android_gms_b_aav.f = z;
                    if (this.c.e == null) {
                        return;
                    }
                    if (z3) {
                        try {
                            this.c.e.a();
                        } catch (Throwable e) {
                            zy.c("Unable to call onVideoStart()", e);
                        }
                    }
                    if (z4) {
                        try {
                            this.c.e.b();
                        } catch (Throwable e2) {
                            zy.c("Unable to call onVideoPlay()", e2);
                        }
                    }
                    if (z5) {
                        try {
                            this.c.e.c();
                        } catch (Throwable e22) {
                            zy.c("Unable to call onVideoPause()", e22);
                        }
                    }
                    if (z2) {
                        try {
                            this.c.e.d();
                        } catch (Throwable e222) {
                            zy.c("Unable to call onVideoEnd()", e222);
                        }
                    }
                }
            }
        });
    }

    private void a(String str) {
        a(str, null);
    }

    private void a(String str, Map<String, String> map) {
        final Map hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        v.e().a(new Runnable(this) {
            final /* synthetic */ aav b;

            public void run() {
                this.b.a.a("pubVideoCmd", hashMap);
            }
        });
    }

    public void a() {
        a("play");
    }

    public void a(float f, int i, boolean z, float f2) {
        int i2;
        synchronized (this.b) {
            this.h = f;
            this.g = z;
            i2 = this.d;
            this.d = i;
            this.j = f2;
        }
        a(i2, i);
    }

    public void a(os osVar) {
        synchronized (this.b) {
            this.e = osVar;
        }
    }

    public void a(boolean z) {
        a(z ? "mute" : "unmute");
    }

    public void b() {
        a("pause");
    }

    public void b(boolean z) {
        synchronized (this.b) {
            this.i = z;
        }
        a("initialState", d.b((Object) "muteStart", z ? "1" : "0"));
    }

    public boolean c() {
        boolean z;
        synchronized (this.b) {
            z = this.g;
        }
        return z;
    }

    public int d() {
        int i;
        synchronized (this.b) {
            i = this.d;
        }
        return i;
    }

    public float e() {
        return this.c;
    }

    public float f() {
        float f;
        synchronized (this.b) {
            f = this.h;
        }
        return f;
    }

    public float g() {
        float f;
        synchronized (this.b) {
            f = this.j;
        }
        return f;
    }
}
