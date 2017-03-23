package com.google.android.gms.b;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.v;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@vz
public final class xb {
    private wk A;
    private boolean B = false;
    private String C;
    private List<String> D;
    private boolean E;
    private String F;
    private ym G;
    private final wf H;
    private String a;
    private String b;
    private String c;
    private List<String> d;
    private String e;
    private String f;
    private String g;
    private List<String> h;
    private long i = -1;
    private boolean j = false;
    private final long k = -1;
    private List<String> l;
    private long m = -1;
    private int n = -1;
    private boolean o = false;
    private boolean p = false;
    private boolean q = false;
    private boolean r = true;
    private boolean s = true;
    private String t = "";
    private boolean u = false;
    private boolean v = false;
    private yj w;
    private List<String> x;
    private List<String> y;
    private boolean z = false;

    public xb(wf wfVar, String str) {
        this.b = str;
        this.H = wfVar;
    }

    private void A(Map<String, List<String>> map) {
        this.B |= d(map, "X-Afma-Auto-Collect-Location");
    }

    private void B(Map<String, List<String>> map) {
        List c = c(map, "X-Afma-Remote-Ping-Urls");
        if (c != null) {
            this.D = c;
        }
    }

    private void C(Map<String, List<String>> map) {
        Object a = a(map, "X-Afma-Auto-Protection-Configuration");
        if (a == null || TextUtils.isEmpty(a)) {
            Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
            buildUpon.appendQueryParameter("id", "gmob-apps-blocked-navigation");
            if (!TextUtils.isEmpty(this.f)) {
                buildUpon.appendQueryParameter("debugDialog", this.f);
            }
            boolean booleanValue = ((Boolean) pr.j.c()).booleanValue();
            String[] strArr = new String[1];
            String valueOf = String.valueOf(buildUpon.toString());
            String valueOf2 = String.valueOf("navigationURL");
            strArr[0] = new StringBuilder((String.valueOf(valueOf).length() + 18) + String.valueOf(valueOf2).length()).append(valueOf).append("&").append(valueOf2).append("={NAVIGATION_URL}").toString();
            this.A = new wk(booleanValue, Arrays.asList(strArr));
            return;
        }
        try {
            this.A = wk.a(new JSONObject(a));
        } catch (Throwable e) {
            zy.c("Error parsing configuration JSON", e);
            this.A = new wk();
        }
    }

    private void D(Map<String, List<String>> map) {
        this.C = a(map, "Set-Cookie");
    }

    private void E(Map<String, List<String>> map) {
        Object a = a(map, "X-Afma-Safe-Browsing");
        if (!TextUtils.isEmpty(a)) {
            try {
                this.G = ym.a(new JSONObject(a));
            } catch (Throwable e) {
                zy.c("Error parsing safe browsing header", e);
            }
        }
    }

    static String a(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        return (list == null || list.isEmpty()) ? null : (String) list.get(0);
    }

    static long b(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (!(list == null || list.isEmpty())) {
            String str2 = (String) list.get(0);
            try {
                return (long) (Float.parseFloat(str2) * 1000.0f);
            } catch (NumberFormatException e) {
                zy.e(new StringBuilder((String.valueOf(str).length() + 36) + String.valueOf(str2).length()).append("Could not parse float from ").append(str).append(" header: ").append(str2).toString());
            }
        }
        return -1;
    }

    private void b(Map<String, List<String>> map) {
        this.a = a(map, "X-Afma-Ad-Size");
    }

    static List<String> c(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (!(list == null || list.isEmpty())) {
            String str2 = (String) list.get(0);
            if (str2 != null) {
                return Arrays.asList(str2.trim().split("\\s+"));
            }
        }
        return null;
    }

    private void c(Map<String, List<String>> map) {
        this.F = a(map, "X-Afma-Ad-Slot-Size");
    }

    private void d(Map<String, List<String>> map) {
        List c = c(map, "X-Afma-Click-Tracking-Urls");
        if (c != null) {
            this.d = c;
        }
    }

    private boolean d(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        return (list == null || list.isEmpty() || !Boolean.valueOf((String) list.get(0)).booleanValue()) ? false : true;
    }

    private void e(Map<String, List<String>> map) {
        this.e = a(map, "X-Afma-Debug-Signals");
    }

    private void f(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Debug-Dialog");
        if (list != null && !list.isEmpty()) {
            this.f = (String) list.get(0);
        }
    }

    private void g(Map<String, List<String>> map) {
        List c = c(map, "X-Afma-Tracking-Urls");
        if (c != null) {
            this.h = c;
        }
    }

    private void h(Map<String, List<String>> map) {
        long b = b(map, "X-Afma-Interstitial-Timeout");
        if (b != -1) {
            this.i = b;
        }
    }

    private void i(Map<String, List<String>> map) {
        this.g = a(map, "X-Afma-ActiveView");
    }

    private void j(Map<String, List<String>> map) {
        this.p = "native".equals(a(map, "X-Afma-Ad-Format"));
    }

    private void k(Map<String, List<String>> map) {
        this.o |= d(map, "X-Afma-Custom-Rendering-Allowed");
    }

    private void l(Map<String, List<String>> map) {
        this.j |= d(map, "X-Afma-Mediation");
    }

    private void m(Map<String, List<String>> map) {
        this.E |= d(map, "X-Afma-Render-In-Browser");
    }

    private void n(Map<String, List<String>> map) {
        List c = c(map, "X-Afma-Manual-Tracking-Urls");
        if (c != null) {
            this.l = c;
        }
    }

    private void o(Map<String, List<String>> map) {
        long b = b(map, "X-Afma-Refresh-Rate");
        if (b != -1) {
            this.m = b;
        }
    }

    private void p(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Orientation");
        if (list != null && !list.isEmpty()) {
            String str = (String) list.get(0);
            if ("portrait".equalsIgnoreCase(str)) {
                this.n = v.g().b();
            } else if ("landscape".equalsIgnoreCase(str)) {
                this.n = v.g().a();
            }
        }
    }

    private void q(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Use-HTTPS");
        if (list != null && !list.isEmpty()) {
            this.q = Boolean.valueOf((String) list.get(0)).booleanValue();
        }
    }

    private void r(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Content-Url-Opted-Out");
        if (list != null && !list.isEmpty()) {
            this.r = Boolean.valueOf((String) list.get(0)).booleanValue();
        }
    }

    private void s(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Content-Vertical-Opted-Out");
        if (list != null && !list.isEmpty()) {
            this.s = Boolean.valueOf((String) list.get(0)).booleanValue();
        }
    }

    private void t(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Gws-Query-Id");
        if (list != null && !list.isEmpty()) {
            this.t = (String) list.get(0);
        }
    }

    private void u(Map<String, List<String>> map) {
        String a = a(map, "X-Afma-Fluid");
        if (a != null && a.equals("height")) {
            this.u = true;
        }
    }

    private void v(Map<String, List<String>> map) {
        this.v = "native_express".equals(a(map, "X-Afma-Ad-Format"));
    }

    private void w(Map<String, List<String>> map) {
        this.w = yj.a(a(map, "X-Afma-Rewards"));
    }

    private void x(Map<String, List<String>> map) {
        if (this.x == null) {
            this.x = c(map, "X-Afma-Reward-Video-Start-Urls");
        }
    }

    private void y(Map<String, List<String>> map) {
        if (this.y == null) {
            this.y = c(map, "X-Afma-Reward-Video-Complete-Urls");
        }
    }

    private void z(Map<String, List<String>> map) {
        this.z |= d(map, "X-Afma-Use-Displayed-Impression");
    }

    public wi a(long j) {
        return new wi(this.H, this.b, this.c, this.d, this.h, this.i, this.j, -1, this.l, this.m, this.n, this.a, j, this.f, this.g, this.o, this.p, this.q, this.r, false, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.e, this.s);
    }

    public void a(String str, Map<String, List<String>> map, String str2) {
        this.c = str2;
        a((Map) map);
    }

    public void a(Map<String, List<String>> map) {
        b(map);
        c(map);
        d(map);
        e(map);
        f(map);
        g(map);
        h(map);
        l(map);
        n(map);
        o(map);
        p(map);
        i(map);
        q(map);
        k(map);
        j(map);
        r(map);
        s(map);
        t(map);
        u(map);
        v(map);
        w(map);
        x(map);
        y(map);
        z(map);
        A(map);
        D(map);
        C(map);
        B(map);
        E(map);
        m(map);
    }
}
