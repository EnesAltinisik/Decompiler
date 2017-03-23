package com.google.android.gms.b;

import com.google.android.gms.b.sv.c;
import java.util.Map;
import java.util.concurrent.Future;

@vz
public final class xa {
    c a;
    public final rq b = new rq(this) {
        final /* synthetic */ xa a;

        {
            this.a = r1;
        }

        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            synchronized (this.a.e) {
                if (this.a.h.isDone()) {
                } else if (this.a.f.equals(map.get("request_id"))) {
                    Object xdVar = new xd(1, map);
                    String valueOf = String.valueOf(xdVar.f());
                    String valueOf2 = String.valueOf(xdVar.b());
                    zy.e(new StringBuilder((String.valueOf(valueOf).length() + 24) + String.valueOf(valueOf2).length()).append("Invalid ").append(valueOf).append(" request error: ").append(valueOf2).toString());
                    this.a.h.b(xdVar);
                }
            }
        }
    };
    public final rq c = new rq(this) {
        final /* synthetic */ xa a;

        {
            this.a = r1;
        }

        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            synchronized (this.a.e) {
                if (this.a.h.isDone()) {
                    return;
                }
                Object xdVar = new xd(-2, map);
                if (this.a.f.equals(xdVar.h())) {
                    String e = xdVar.e();
                    if (e == null) {
                        zy.e("URL missing in loadAdUrl GMSG.");
                        return;
                    }
                    if (e.contains("%40mediation_adapters%40")) {
                        String replaceAll = e.replaceAll("%40mediation_adapters%40", zc.a(com_google_android_gms_b_aaq.getContext(), (String) map.get("check_adapters"), this.a.g));
                        xdVar.a(replaceAll);
                        e = "Ad request URL modified to ";
                        replaceAll = String.valueOf(replaceAll);
                        ze.a(replaceAll.length() != 0 ? e.concat(replaceAll) : new String(e));
                    }
                    this.a.h.b(xdVar);
                    return;
                }
            }
        }
    };
    public final rq d = new rq(this) {
        final /* synthetic */ xa a;

        {
            this.a = r1;
        }

        public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
            synchronized (this.a.e) {
                if (this.a.h.isDone()) {
                    return;
                }
                Object xdVar = new xd(-2, map);
                if (this.a.f.equals(xdVar.h())) {
                    this.a.h.b(xdVar);
                    return;
                }
            }
        }
    };
    private final Object e = new Object();
    private String f;
    private String g;
    private aad<xd> h = new aad();

    public xa(String str, String str2) {
        this.g = str2;
        this.f = str;
    }

    public c a() {
        return this.a;
    }

    public void a(c cVar) {
        this.a = cVar;
    }

    public Future<xd> b() {
        return this.h;
    }
}
