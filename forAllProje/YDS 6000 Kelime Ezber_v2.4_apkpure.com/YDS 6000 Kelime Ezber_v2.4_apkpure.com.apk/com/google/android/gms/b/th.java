package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.b.ti.a;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@vz
public class th implements a {
    private final String a;
    private final tn b;
    private final long c;
    private final te d;
    private final td e;
    private ns f;
    private final nx g;
    private final Context h;
    private final Object i = new Object();
    private final aab j;
    private final boolean k;
    private final qr l;
    private final List<String> m;
    private final boolean n;
    private to o;
    private int p = -2;
    private tq q;

    class AnonymousClass2 extends tq.a {
        final /* synthetic */ int a;

        AnonymousClass2(int i) {
            this.a = i;
        }

        public int a() {
            return this.a;
        }
    }

    public th(Context context, String str, tn tnVar, te teVar, td tdVar, ns nsVar, nx nxVar, aab com_google_android_gms_b_aab, boolean z, boolean z2, qr qrVar, List<String> list) {
        this.h = context;
        this.b = tnVar;
        this.e = tdVar;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            this.a = b();
        } else {
            this.a = str;
        }
        this.d = teVar;
        this.c = teVar.b != -1 ? teVar.b : 10000;
        this.f = nsVar;
        this.g = nxVar;
        this.j = com_google_android_gms_b_aab;
        this.k = z;
        this.n = z2;
        this.l = qrVar;
        this.m = list;
    }

    private long a(long j, long j2, long j3, long j4) {
        while (this.p == -2) {
            b(j, j2, j3, j4);
        }
        return v.k().b() - j;
    }

    private String a(String str) {
        if (!(str == null || !e() || b(2))) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.remove("cpm_floor_cents");
                str = jSONObject.toString();
            } catch (JSONException e) {
                zy.e("Could not remove field. Returning the original value");
            }
        }
        return str;
    }

    private void a(tg tgVar) {
        String a = a(this.e.i);
        try {
            if (this.j.d < 4100000) {
                if (this.g.e) {
                    this.o.a(b.a(this.h), this.f, a, tgVar);
                } else {
                    this.o.a(b.a(this.h), this.g, this.f, a, (tp) tgVar);
                }
            } else if (this.k) {
                this.o.a(b.a(this.h), this.f, a, this.e.a, tgVar, this.l, this.m);
            } else if (this.g.e) {
                this.o.a(b.a(this.h), this.f, a, this.e.a, (tp) tgVar);
            } else if (!this.n) {
                this.o.a(b.a(this.h), this.g, this.f, a, this.e.a, tgVar);
            } else if (this.e.l != null) {
                this.o.a(b.a(this.h), this.f, a, this.e.a, tgVar, new qr(b(this.e.p)), this.e.o);
            } else {
                this.o.a(b.a(this.h), this.g, this.f, a, this.e.a, tgVar);
            }
        } catch (Throwable e) {
            zy.c("Could not request ad from mediation adapter.", e);
            a(5);
        }
    }

    private static com.google.android.gms.ads.b.b b(String str) {
        com.google.android.gms.ads.b.b.a aVar = new com.google.android.gms.ads.b.b.a();
        if (str == null) {
            return aVar.a();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            aVar.b(jSONObject.optBoolean("multiple_images", false));
            aVar.a(jSONObject.optBoolean("only_urls", false));
            aVar.a(c(jSONObject.optString("native_image_orientation", "any")));
        } catch (Throwable e) {
            zy.c("Exception occurred when creating native ad options", e);
        }
        return aVar.a();
    }

    private String b() {
        try {
            if (!TextUtils.isEmpty(this.e.e)) {
                return this.b.b(this.e.e) ? "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter" : "com.google.ads.mediation.customevent.CustomEventAdapter";
            }
        } catch (RemoteException e) {
            zy.e("Fail to determine the custom event's version, assuming the old one.");
        }
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    private void b(long j, long j2, long j3, long j4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j5 = j2 - (elapsedRealtime - j);
        elapsedRealtime = j4 - (elapsedRealtime - j3);
        if (j5 <= 0 || elapsedRealtime <= 0) {
            zy.d("Timed out waiting for adapter.");
            this.p = 3;
            return;
        }
        try {
            this.i.wait(Math.min(j5, elapsedRealtime));
        } catch (InterruptedException e) {
            this.p = -1;
        }
    }

    private boolean b(int i) {
        try {
            Bundle l = this.k ? this.o.l() : this.g.e ? this.o.k() : this.o.j();
            if (l == null) {
                return false;
            }
            return (l.getInt("capabilities", 0) & i) == i;
        } catch (RemoteException e) {
            zy.e("Could not get adapter info. Returning false");
            return false;
        }
    }

    private static int c(String str) {
        return "landscape".equals(str) ? 2 : "portrait".equals(str) ? 1 : 0;
    }

    private tq c() {
        if (this.p != 0 || !e()) {
            return null;
        }
        try {
            if (!(!b(4) || this.q == null || this.q.a() == 0)) {
                return this.q;
            }
        } catch (RemoteException e) {
            zy.e("Could not get cpm value from MediationResponseMetadata");
        }
        return c(f());
    }

    private static tq c(int i) {
        return new AnonymousClass2(i);
    }

    private to d() {
        String str = "Instantiating mediation adapter: ";
        String valueOf = String.valueOf(this.a);
        zy.d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        if (!this.k) {
            if (((Boolean) pr.bl.c()).booleanValue() && "com.google.ads.mediation.admob.AdMobAdapter".equals(this.a)) {
                return a(new AdMobAdapter());
            }
            if (((Boolean) pr.bm.c()).booleanValue() && "com.google.ads.mediation.AdUrlAdapter".equals(this.a)) {
                return a(new AdUrlAdapter());
            }
            if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(this.a)) {
                return new tu(new ud());
            }
        }
        try {
            return this.b.a(this.a);
        } catch (Throwable e) {
            Throwable th = e;
            String str2 = "Could not instantiate mediation adapter: ";
            valueOf = String.valueOf(this.a);
            zy.a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
            return null;
        }
    }

    private boolean e() {
        return this.d.l != -1;
    }

    private int f() {
        if (this.e.i == null) {
            return 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.e.i);
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.a)) {
                return jSONObject.optInt("cpm_cents", 0);
            }
            int optInt = b(2) ? jSONObject.optInt("cpm_floor_cents", 0) : 0;
            return optInt == 0 ? jSONObject.optInt("penalized_average_cpm_cents", 0) : optInt;
        } catch (JSONException e) {
            zy.e("Could not convert to json. Returning 0");
            return 0;
        }
    }

    public ti a(long j, long j2) {
        ti tiVar;
        synchronized (this.i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            final tg tgVar = new tg();
            zi.a.post(new Runnable(this) {
                final /* synthetic */ th b;

                public void run() {
                    synchronized (this.b.i) {
                        if (this.b.p != -2) {
                            return;
                        }
                        this.b.o = this.b.d();
                        if (this.b.o == null) {
                            this.b.a(4);
                        } else if (!this.b.e() || this.b.b(1)) {
                            tgVar.a(this.b);
                            this.b.a(tgVar);
                        } else {
                            String f = this.b.a;
                            zy.e(new StringBuilder(String.valueOf(f).length() + 56).append("Ignoring adapter ").append(f).append(" as delayed impression is not supported").toString());
                            this.b.a(2);
                        }
                    }
                }
            });
            tg tgVar2 = tgVar;
            tiVar = new ti(this.e, this.o, this.a, tgVar2, this.p, c(), a(elapsedRealtime, this.c, j, j2));
        }
        return tiVar;
    }

    protected to a(com.google.android.gms.ads.mediation.b bVar) {
        return new tu(bVar);
    }

    public void a() {
        synchronized (this.i) {
            try {
                if (this.o != null) {
                    this.o.c();
                }
            } catch (Throwable e) {
                zy.c("Could not destroy mediation adapter.", e);
            }
            this.p = -1;
            this.i.notify();
        }
    }

    public void a(int i) {
        synchronized (this.i) {
            this.p = i;
            this.i.notify();
        }
    }

    public void a(int i, tq tqVar) {
        synchronized (this.i) {
            this.p = i;
            this.q = tqVar;
            this.i.notify();
        }
    }
}
