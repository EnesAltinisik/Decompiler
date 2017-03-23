package com.google.android.gms.b;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.b.yu.a;
import com.google.android.gms.common.internal.c;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@vz
public class xo extends b implements yc {
    private static final tm l = new tm();
    private final Map<String, yg> m = new HashMap();
    private boolean n;

    public xo(Context context, d dVar, nx nxVar, tn tnVar, aab com_google_android_gms_b_aab) {
        super(context, nxVar, null, tnVar, com_google_android_gms_b_aab, dVar);
    }

    private a b(a aVar) {
        ze.a("Creating mediation ad response for non-mediated rewarded ad.");
        try {
            String jSONObject = wz.a(aVar.b).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.google.ads.mediation.a.AD_UNIT_ID_PARAMETER, aVar.a.e);
            td tdVar = new td(jSONObject, null, Arrays.asList(new String[]{"com.google.ads.mediation.admob.AdMobAdapter"}), null, null, Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), null, Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList());
            return new a(aVar.a, aVar.b, new te(Arrays.asList(new td[]{tdVar}), -1, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "", -1, 0, 1, null, 0, -1, -1, false), aVar.d, aVar.e, aVar.f, aVar.g, aVar.h);
        } catch (Throwable e) {
            zy.b("Unable to generate ad state for non-mediated rewarded video.", e);
            return c(aVar);
        }
    }

    private a c(a aVar) {
        return new a(aVar.a, aVar.b, null, aVar.d, 0, aVar.f, aVar.g, aVar.h);
    }

    public void J() {
        c.b("showAd must be called on the main UI thread.");
        if (K()) {
            this.n = true;
            yg c = c(this.f.j.q);
            if (c != null && c.a() != null) {
                try {
                    c.a().f();
                    return;
                } catch (Throwable e) {
                    zy.c("Could not call showVideo.", e);
                    return;
                }
            }
            return;
        }
        zy.e("The reward video has not loaded.");
    }

    public boolean K() {
        c.b("isLoaded must be called on the main UI thread.");
        return this.f.g == null && this.f.h == null && this.f.j != null && !this.n;
    }

    public void L() {
        a(this.f.j, false);
        u();
    }

    public void M() {
        if (!(this.f.j == null || this.f.j.o == null)) {
            v.x().a(this.f.c, this.f.e.b, this.f.j, this.f.b, false, this.f.j.o.j);
        }
        w();
    }

    public void N() {
        s();
    }

    public void O() {
        e();
    }

    public void P() {
        t();
    }

    public void a(Context context) {
        for (yg a : this.m.values()) {
            try {
                a.a().a(com.google.android.gms.a.b.a((Object) context));
            } catch (Throwable e) {
                zy.b("Unable to call Adapter.onContextChanged.", e);
            }
        }
    }

    public void a(xw xwVar) {
        c.b("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(xwVar.c)) {
            zy.e("Invalid ad unit id. Aborting.");
            zi.a.post(new Runnable(this) {
                final /* synthetic */ xo a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.a(1);
                }
            });
            return;
        }
        this.n = false;
        this.f.b = xwVar.c;
        super.a(xwVar.b);
    }

    public void a(final a aVar, qa qaVar) {
        if (aVar.e != -2) {
            zi.a.post(new Runnable(this) {
                final /* synthetic */ xo b;

                public void run() {
                    this.b.b(new yu(aVar, null, null, null, null, null, null, null));
                }
            });
            return;
        }
        this.f.k = aVar;
        if (aVar.c == null) {
            this.f.k = b(aVar);
        }
        this.f.E = 0;
        this.f.h = v.d().a(this.f.c, this.f.k, this);
    }

    protected boolean a(ns nsVar, yu yuVar, boolean z) {
        return false;
    }

    public boolean a(yu yuVar, yu yuVar2) {
        return true;
    }

    public void b(yj yjVar) {
        if (!(this.f.j == null || this.f.j.o == null)) {
            v.x().a(this.f.c, this.f.e.b, this.f.j, this.f.b, false, this.f.j.o.k);
        }
        if (!(this.f.j == null || this.f.j.r == null || TextUtils.isEmpty(this.f.j.r.j))) {
            yjVar = new yj(this.f.j.r.j, this.f.j.r.k);
        }
        a(yjVar);
    }

    public yg c(String str) {
        yg ygVar;
        Throwable th;
        String str2;
        String valueOf;
        yg ygVar2 = (yg) this.m.get(str);
        if (ygVar2 != null) {
            return ygVar2;
        }
        try {
            ygVar = new yg(("com.google.ads.mediation.admob.AdMobAdapter".equals(str) ? l : this.j).a(str), this);
            try {
                this.m.put(str, ygVar);
                return ygVar;
            } catch (Throwable e) {
                th = e;
                str2 = "Fail to instantiate adapter ";
                valueOf = String.valueOf(str);
                zy.c(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf), th);
                return ygVar;
            }
        } catch (Throwable e2) {
            th = e2;
            ygVar = ygVar2;
            str2 = "Fail to instantiate adapter ";
            valueOf = String.valueOf(str);
            if (valueOf.length() == 0) {
            }
            zy.c(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf), th);
            return ygVar;
        }
    }

    public void i() {
        c.b("destroy must be called on the main UI thread.");
        for (String str : this.m.keySet()) {
            String str2;
            try {
                yg ygVar = (yg) this.m.get(str2);
                if (!(ygVar == null || ygVar.a() == null)) {
                    ygVar.a().c();
                }
            } catch (RemoteException e) {
                String str3 = "Fail to destroy adapter: ";
                str2 = String.valueOf(str2);
                zy.e(str2.length() != 0 ? str3.concat(str2) : new String(str3));
            }
        }
    }

    public void n() {
        c.b("pause must be called on the main UI thread.");
        for (String str : this.m.keySet()) {
            String str2;
            try {
                yg ygVar = (yg) this.m.get(str2);
                if (!(ygVar == null || ygVar.a() == null)) {
                    ygVar.a().d();
                }
            } catch (RemoteException e) {
                String str3 = "Fail to pause adapter: ";
                str2 = String.valueOf(str2);
                zy.e(str2.length() != 0 ? str3.concat(str2) : new String(str3));
            }
        }
    }

    public void o() {
        String valueOf;
        c.b("resume must be called on the main UI thread.");
        for (String valueOf2 : this.m.keySet()) {
            try {
                yg ygVar = (yg) this.m.get(valueOf2);
                if (!(ygVar == null || ygVar.a() == null)) {
                    ygVar.a().e();
                }
            } catch (RemoteException e) {
                String str = "Fail to resume adapter: ";
                valueOf2 = String.valueOf(valueOf2);
                zy.e(valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str));
            }
        }
    }
}
