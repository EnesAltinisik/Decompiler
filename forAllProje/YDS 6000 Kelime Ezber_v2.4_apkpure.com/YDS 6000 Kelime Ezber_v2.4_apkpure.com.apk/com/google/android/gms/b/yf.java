package com.google.android.gms.b;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.b.yu.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONObject;

@vz
public class yf extends zd implements ye {
    private final a a;
    private final Context b;
    private final ArrayList<Future> c;
    private final ArrayList<String> d;
    private final HashMap<String, xz> e;
    private final List<ya> f;
    private final HashSet<String> g;
    private final Object h;
    private final xo i;
    private final long j;

    public yf(Context context, a aVar, xo xoVar) {
        this(context, aVar, xoVar, ((Long) pr.aC.c()).longValue());
    }

    yf(Context context, a aVar, xo xoVar, long j) {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new HashMap();
        this.f = new ArrayList();
        this.g = new HashSet();
        this.h = new Object();
        this.b = context;
        this.a = aVar;
        this.i = xoVar;
        this.j = j;
    }

    private static int a(int i) {
        switch (i) {
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
                return 4;
            case 6:
                return 0;
            case 7:
                return 3;
            default:
                return 6;
        }
    }

    private yu a(int i, String str, td tdVar) {
        return new yu(this.a.a.c, null, this.a.b.d, i, this.a.b.f, this.a.b.j, this.a.b.l, this.a.b.k, this.a.a.i, this.a.b.h, tdVar, null, str, this.a.c, null, this.a.b.i, this.a.d, this.a.b.g, this.a.f, this.a.b.n, this.a.b.o, this.a.h, null, this.a.b.C, this.a.b.D, this.a.b.E, this.a.b.F, this.a.b.G, f(), this.a.b.J, this.a.b.N);
    }

    private yu a(String str, td tdVar) {
        return a(-2, str, tdVar);
    }

    private static String a(ya yaVar) {
        String str = yaVar.b;
        int a = a(yaVar.c);
        return new StringBuilder(String.valueOf(str).length() + 33).append(str).append(".").append(a).append(".").append(yaVar.d).toString();
    }

    private void a(String str, String str2, td tdVar) {
        synchronized (this.h) {
            yg c = this.i.c(str);
            if (c == null || c.b() == null || c.a() == null) {
                this.f.add(new ya.a().b(tdVar.d).a(str).a(0).a(7).a());
                return;
            }
            zd a = a(str, str2, tdVar, c);
            this.c.add((Future) a.e());
            this.d.add(str);
            this.e.put(str, a);
        }
    }

    private yu c() {
        return a(3, null, null);
    }

    private String f() {
        StringBuilder stringBuilder = new StringBuilder("");
        if (this.f == null) {
            return stringBuilder.toString();
        }
        for (ya yaVar : this.f) {
            if (!(yaVar == null || TextUtils.isEmpty(yaVar.b))) {
                stringBuilder.append(String.valueOf(a(yaVar)).concat("_"));
            }
        }
        return stringBuilder.substring(0, Math.max(0, stringBuilder.length() - 1));
    }

    protected xz a(String str, String str2, td tdVar, yg ygVar) {
        return new xz(this.b, str, str2, tdVar, this.a, ygVar, this, this.j);
    }

    public void a() {
        String str;
        xz xzVar;
        final yu a;
        for (td tdVar : this.a.c.a) {
            String str2 = tdVar.i;
            for (String str3 : tdVar.c) {
                String str32;
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str32) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str32)) {
                    try {
                        str32 = new JSONObject(str2).getString("class_name");
                    } catch (Throwable e) {
                        zy.b("Unable to determine custom event class name, skipping...", e);
                    }
                }
                a(str32, str2, tdVar);
            }
        }
        int i = 0;
        while (i < this.c.size()) {
            try {
                ((Future) this.c.get(i)).get();
                synchronized (this.h) {
                    str = (String) this.d.get(i);
                    if (!TextUtils.isEmpty(str)) {
                        xzVar = (xz) this.e.get(str);
                        if (xzVar != null) {
                            this.f.add(xzVar.c());
                        }
                    }
                }
                synchronized (this.h) {
                    if (this.g.contains(this.d.get(i))) {
                        str = (String) this.d.get(i);
                        a = a(str, this.e.get(str) != null ? ((xz) this.e.get(str)).f() : null);
                        zx.a.post(new Runnable(this) {
                            final /* synthetic */ yf b;

                            public void run() {
                                this.b.i.b(a);
                            }
                        });
                        return;
                    }
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                synchronized (this.h) {
                    str = (String) this.d.get(i);
                    if (!TextUtils.isEmpty(str)) {
                        xzVar = (xz) this.e.get(str);
                        if (xzVar != null) {
                            this.f.add(xzVar.c());
                        }
                    }
                }
            } catch (Throwable e3) {
                zy.c("Unable to resolve rewarded adapter.", e3);
                synchronized (this.h) {
                    str = (String) this.d.get(i);
                    if (!TextUtils.isEmpty(str)) {
                        xzVar = (xz) this.e.get(str);
                        if (xzVar != null) {
                            this.f.add(xzVar.c());
                        }
                    }
                }
            } catch (Throwable e32) {
                Throwable th = e32;
                synchronized (this.h) {
                    str = (String) this.d.get(i);
                    if (!TextUtils.isEmpty(str)) {
                        xzVar = (xz) this.e.get(str);
                        if (xzVar != null) {
                            this.f.add(xzVar.c());
                        }
                    }
                }
            }
        }
        a = c();
        zx.a.post(new Runnable(this) {
            final /* synthetic */ yf b;

            public void run() {
                this.b.i.b(a);
            }
        });
        return;
        i++;
    }

    public void a(String str) {
        synchronized (this.h) {
            this.g.add(str);
        }
    }

    public void a(String str, int i) {
    }

    public void b() {
    }
}
