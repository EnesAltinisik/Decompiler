package com.google.android.gms.b;

import android.content.Context;
import android.support.v4.i.a;
import com.google.android.gms.b.dn.b;
import com.google.android.gms.b.dn.c;
import com.google.android.gms.measurement.AppMeasurement;
import java.io.IOException;
import java.util.Map;

public class ct extends cy {
    private final Map<String, Map<String, String>> a = new a();
    private final Map<String, Map<String, Boolean>> b = new a();
    private final Map<String, Map<String, Boolean>> c = new a();
    private final Map<String, b> d = new a();
    private final Map<String, String> e = new a();

    ct(cv cvVar) {
        super(cvVar);
    }

    private b a(String str, byte[] bArr) {
        if (bArr == null) {
            return new b();
        }
        lf a = lf.a(bArr);
        b bVar = new b();
        try {
            bVar.b(a);
            u().D().a("Parsed config. version, gmp_app_id", bVar.a, bVar.b);
            return bVar;
        } catch (IOException e) {
            u().z().a("Unable to merge remote config. appId", co.a(str), e);
            return null;
        }
    }

    private Map<String, String> a(b bVar) {
        Map<String, String> aVar = new a();
        if (!(bVar == null || bVar.d == null)) {
            for (c cVar : bVar.d) {
                if (cVar != null) {
                    aVar.put(cVar.a, cVar.b);
                }
            }
        }
        return aVar;
    }

    private void a(String str, b bVar) {
        Map aVar = new a();
        Map aVar2 = new a();
        if (!(bVar == null || bVar.e == null)) {
            for (dn.a aVar3 : bVar.e) {
                if (aVar3 != null) {
                    String str2 = (String) AppMeasurement.a.a.get(aVar3.a);
                    if (str2 != null) {
                        aVar3.a = str2;
                    }
                    aVar.put(aVar3.a, aVar3.b);
                    aVar2.put(aVar3.a, aVar3.c);
                }
            }
        }
        this.b.put(str, aVar);
        this.c.put(str, aVar2);
    }

    private void d(String str) {
        Q();
        e();
        com.google.android.gms.common.internal.c.a(str);
        if (!this.d.containsKey(str)) {
            byte[] d = p().d(str);
            if (d == null) {
                this.a.put(str, null);
                this.b.put(str, null);
                this.c.put(str, null);
                this.d.put(str, null);
                this.e.put(str, null);
                return;
            }
            b a = a(str, d);
            this.a.put(str, a(a));
            a(str, a);
            this.d.put(str, a);
            this.e.put(str, null);
        }
    }

    protected b a(String str) {
        Q();
        e();
        com.google.android.gms.common.internal.c.a(str);
        d(str);
        return (b) this.d.get(str);
    }

    String a(String str, String str2) {
        e();
        d(str);
        Map map = (Map) this.a.get(str);
        return map != null ? (String) map.get(str2) : null;
    }

    protected void a() {
    }

    protected boolean a(String str, byte[] bArr, String str2) {
        Q();
        e();
        com.google.android.gms.common.internal.c.a(str);
        b a = a(str, bArr);
        if (a == null) {
            return false;
        }
        a(str, a);
        this.d.put(str, a);
        this.e.put(str, str2);
        this.a.put(str, a(a));
        g().a(str, a.f);
        try {
            a.f = null;
            byte[] bArr2 = new byte[a.f()];
            a.a(lg.a(bArr2));
            bArr = bArr2;
        } catch (IOException e) {
            u().z().a("Unable to serialize reduced-size config. Storing full config instead. appId", co.a(str), e);
        }
        p().a(str, bArr);
        return true;
    }

    protected String b(String str) {
        e();
        return (String) this.e.get(str);
    }

    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    boolean b(String str, String str2) {
        e();
        d(str);
        if (q().m(str) && dl.j(str2)) {
            return true;
        }
        if (q().n(str) && dl.a(str2)) {
            return true;
        }
        Map map = (Map) this.b.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        return bool == null ? false : bool.booleanValue();
    }

    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    protected void c(String str) {
        e();
        this.e.put(str, null);
    }

    boolean c(String str, String str2) {
        e();
        d(str);
        Map map = (Map) this.c.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        return bool == null ? false : bool.booleanValue();
    }

    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    public /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    public /* bridge */ /* synthetic */ bt f() {
        return super.f();
    }

    public /* bridge */ /* synthetic */ bx g() {
        return super.g();
    }

    public /* bridge */ /* synthetic */ da h() {
        return super.h();
    }

    public /* bridge */ /* synthetic */ cl i() {
        return super.i();
    }

    public /* bridge */ /* synthetic */ cb j() {
        return super.j();
    }

    public /* bridge */ /* synthetic */ dc k() {
        return super.k();
    }

    public /* bridge */ /* synthetic */ db l() {
        return super.l();
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.common.util.c m() {
        return super.m();
    }

    public /* bridge */ /* synthetic */ Context n() {
        return super.n();
    }

    public /* bridge */ /* synthetic */ cm o() {
        return super.o();
    }

    public /* bridge */ /* synthetic */ bz p() {
        return super.p();
    }

    public /* bridge */ /* synthetic */ dl q() {
        return super.q();
    }

    public /* bridge */ /* synthetic */ ct r() {
        return super.r();
    }

    public /* bridge */ /* synthetic */ de s() {
        return super.s();
    }

    public /* bridge */ /* synthetic */ cu t() {
        return super.t();
    }

    public /* bridge */ /* synthetic */ co u() {
        return super.u();
    }

    public /* bridge */ /* synthetic */ cr v() {
        return super.v();
    }

    public /* bridge */ /* synthetic */ by w() {
        return super.w();
    }
}
