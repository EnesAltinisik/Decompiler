package com.google.android.gms.ads.internal;

import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.overlay.a;
import com.google.android.gms.ads.internal.overlay.h;
import com.google.android.gms.ads.internal.overlay.t;
import com.google.android.gms.ads.internal.overlay.u;
import com.google.android.gms.ads.internal.purchase.i;
import com.google.android.gms.b.aai;
import com.google.android.gms.b.aal;
import com.google.android.gms.b.aas;
import com.google.android.gms.b.mu;
import com.google.android.gms.b.ne;
import com.google.android.gms.b.po;
import com.google.android.gms.b.pp;
import com.google.android.gms.b.pq;
import com.google.android.gms.b.pv;
import com.google.android.gms.b.se;
import com.google.android.gms.b.sm;
import com.google.android.gms.b.sz;
import com.google.android.gms.b.tj;
import com.google.android.gms.b.vk;
import com.google.android.gms.b.vz;
import com.google.android.gms.b.wa;
import com.google.android.gms.b.xf;
import com.google.android.gms.b.yx;
import com.google.android.gms.b.zi;
import com.google.android.gms.b.zj;
import com.google.android.gms.b.zm;
import com.google.android.gms.b.zq;
import com.google.android.gms.b.zr;
import com.google.android.gms.common.util.c;
import com.google.android.gms.common.util.e;

@vz
public class v {
    private static final Object a = new Object();
    private static v b;
    private final u A = new u();
    private final tj B = new tj();
    private final zr C = new zr();
    private final q D = new q();
    private final se E = new se();
    private final aal F = new aal();
    private final a c = new a();
    private final wa d = new wa();
    private final h e = new h();
    private final vk f = new vk();
    private final zi g = new zi();
    private final aas h = new aas();
    private final zj i = zj.a(VERSION.SDK_INT);
    private final mu j = new mu();
    private final yx k = new yx(this.g);
    private final ne l = new ne();
    private final c m = e.d();
    private final g n = new g();
    private final pv o = new pv();
    private final zm p = new zm();
    private final xf q = new xf();
    private final po r = new po();
    private final pp s = new pp();
    private final pq t = new pq();
    private final aai u = new aai();
    private final i v = new i();
    private final sm w = new sm();
    private final sz x = new sz();
    private final zq y = new zq();
    private final t z = new t();

    static {
        a(new v());
    }

    protected v() {
    }

    public static g A() {
        return D().n;
    }

    public static se B() {
        return D().E;
    }

    public static aal C() {
        return D().F;
    }

    private static v D() {
        v vVar;
        synchronized (a) {
            vVar = b;
        }
        return vVar;
    }

    public static wa a() {
        return D().d;
    }

    protected static void a(v vVar) {
        synchronized (a) {
            b = vVar;
        }
    }

    public static a b() {
        return D().c;
    }

    public static h c() {
        return D().e;
    }

    public static vk d() {
        return D().f;
    }

    public static zi e() {
        return D().g;
    }

    public static aas f() {
        return D().h;
    }

    public static zj g() {
        return D().i;
    }

    public static mu h() {
        return D().j;
    }

    public static yx i() {
        return D().k;
    }

    public static ne j() {
        return D().l;
    }

    public static c k() {
        return D().m;
    }

    public static pv l() {
        return D().o;
    }

    public static zm m() {
        return D().p;
    }

    public static xf n() {
        return D().q;
    }

    public static pp o() {
        return D().s;
    }

    public static po p() {
        return D().r;
    }

    public static pq q() {
        return D().t;
    }

    public static aai r() {
        return D().u;
    }

    public static i s() {
        return D().v;
    }

    public static sm t() {
        return D().w;
    }

    public static zq u() {
        return D().y;
    }

    public static t v() {
        return D().z;
    }

    public static u w() {
        return D().A;
    }

    public static tj x() {
        return D().B;
    }

    public static q y() {
        return D().D;
    }

    public static zr z() {
        return D().C;
    }
}
