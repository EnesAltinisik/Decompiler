package com.google.android.gms.b;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.v;
import org.json.JSONObject;

@vz
public class wb extends zd implements com.google.android.gms.b.wc.a {
    zk a;
    wi b;
    te c;
    private final com.google.android.gms.b.wa.a d;
    private final com.google.android.gms.b.wf.a e;
    private final Object f = new Object();
    private final Context g;
    private final dp h;
    private wf i;
    private Runnable j;

    @vz
    static final class a extends Exception {
        private final int a;

        public a(String str, int i) {
            super(str);
            this.a = i;
        }

        public int a() {
            return this.a;
        }
    }

    public wb(Context context, com.google.android.gms.b.wf.a aVar, dp dpVar, com.google.android.gms.b.wa.a aVar2) {
        this.d = aVar2;
        this.g = context;
        this.e = aVar;
        this.h = dpVar;
    }

    private void a(int i, String str) {
        if (i == 3 || i == -1) {
            zy.d(str);
        } else {
            zy.e(str);
        }
        if (this.b == null) {
            this.b = new wi(i);
        } else {
            this.b = new wi(i, this.b.k);
        }
        this.d.a(new com.google.android.gms.b.yu.a(this.i != null ? this.i : new wf(this.e, null, -1), this.b, this.c, null, i, -1, this.b.n, null));
    }

    protected nx a(wf wfVar) {
        int i;
        if (this.b.A) {
            for (nx nxVar : wfVar.d.h) {
                if (nxVar.j) {
                    return new nx(nxVar, wfVar.d.h);
                }
            }
        }
        if (this.b.m == null) {
            throw new a("The ad response must specify one of the supported ad sizes.", 0);
        }
        String[] split = this.b.m.split("x");
        if (split.length != 2) {
            String str = "Invalid ad size format from the ad response: ";
            String valueOf = String.valueOf(this.b.m);
            throw new a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), 0);
        }
        try {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            for (nx nxVar2 : wfVar.d.h) {
                float f = this.g.getResources().getDisplayMetrics().density;
                i = nxVar2.f == -1 ? (int) (((float) nxVar2.g) / f) : nxVar2.f;
                int i2 = nxVar2.c == -2 ? (int) (((float) nxVar2.d) / f) : nxVar2.c;
                if (parseInt == i && parseInt2 == i2 && !nxVar2.j) {
                    return new nx(nxVar2, wfVar.d.h);
                }
            }
            str = "The ad size from the ad response was not one of the requested sizes: ";
            valueOf = String.valueOf(this.b.m);
            throw new a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), 0);
        } catch (NumberFormatException e) {
            str = "Invalid ad size number from the ad response: ";
            valueOf = String.valueOf(this.b.m);
            throw new a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), 0);
        }
    }

    zk a(aab com_google_android_gms_b_aab, aaj<wf> com_google_android_gms_b_aaj_com_google_android_gms_b_wf) {
        return wc.a(this.g, com_google_android_gms_b_aab, com_google_android_gms_b_aaj_com_google_android_gms_b_wf, this);
    }

    public void a() {
        zy.b("AdLoaderBackgroundTask started.");
        this.j = new Runnable(this) {
            final /* synthetic */ wb a;

            {
                this.a = r1;
            }

            public void run() {
                synchronized (this.a.f) {
                    if (this.a.a == null) {
                        return;
                    }
                    this.a.b();
                    this.a.a(2, "Timed out waiting for ad response.");
                }
            }
        };
        zi.a.postDelayed(this.j, ((Long) pr.bn.c()).longValue());
        final aaj com_google_android_gms_b_aak = new aak();
        long b = v.k().b();
        zh.a(new Runnable(this) {
            final /* synthetic */ wb b;

            public void run() {
                synchronized (this.b.f) {
                    this.b.a = this.b.a(this.b.e.j, com_google_android_gms_b_aak);
                    if (this.b.a == null) {
                        this.b.a(0, "Could not start the ad request service.");
                        zi.a.removeCallbacks(this.b.j);
                    }
                }
            }
        });
        this.i = new wf(this.e, this.h.a().a(this.g), b);
        com_google_android_gms_b_aak.a(this.i);
    }

    public void a(wi wiVar) {
        zy.b("Received ad response.");
        this.b = wiVar;
        long b = v.k().b();
        synchronized (this.f) {
            this.a = null;
        }
        v.i().b(this.g, this.b.H);
        try {
            if (this.b.e == -2 || this.b.e == -3) {
                JSONObject jSONObject;
                c();
                nx a = this.i.d.h != null ? a(this.i) : null;
                v.i().b(this.b.v);
                v.i().c(this.b.O);
                if (!TextUtils.isEmpty(this.b.r)) {
                    try {
                        jSONObject = new JSONObject(this.b.r);
                    } catch (Throwable e) {
                        zy.b("Error parsing the JSON for Active View.", e);
                    }
                    this.d.a(new com.google.android.gms.b.yu.a(this.i, this.b, this.c, a, -2, b, this.b.n, jSONObject));
                    zi.a.removeCallbacks(this.j);
                    return;
                }
                jSONObject = null;
                this.d.a(new com.google.android.gms.b.yu.a(this.i, this.b, this.c, a, -2, b, this.b.n, jSONObject));
                zi.a.removeCallbacks(this.j);
                return;
            }
            throw new a("There was a problem getting an ad response. ErrorCode: " + this.b.e, this.b.e);
        } catch (a e2) {
            a(e2.a(), e2.getMessage());
            zi.a.removeCallbacks(this.j);
        }
    }

    public void b() {
        synchronized (this.f) {
            if (this.a != null) {
                this.a.d();
            }
        }
    }

    protected void c() {
        if (this.b.e != -3) {
            if (TextUtils.isEmpty(this.b.c)) {
                throw new a("No fill from ad server.", 3);
            }
            v.i().a(this.g, this.b.u);
            if (this.b.h) {
                try {
                    this.c = new te(this.b.c);
                    v.i().d(this.c.g);
                } catch (Throwable e) {
                    zy.b("Could not parse mediation config.", e);
                    String str = "Could not parse mediation config: ";
                    String valueOf = String.valueOf(this.b.c);
                    throw new a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), 0);
                }
            }
            v.i().d(this.b.K);
            if (!TextUtils.isEmpty(this.b.I) && ((Boolean) pr.cR.c()).booleanValue()) {
                zy.b("Received cookie from server. Setting webview cookie in CookieManager.");
                CookieManager b = v.g().b(this.g);
                if (b != null) {
                    b.setCookie("googleads.g.doubleclick.net", this.b.I);
                }
            }
        }
    }
}
