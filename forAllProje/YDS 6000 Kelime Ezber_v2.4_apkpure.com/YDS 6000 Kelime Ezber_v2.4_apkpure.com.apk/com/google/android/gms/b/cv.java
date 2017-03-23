package com.google.android.gms.b;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.b.do.b;
import com.google.android.gms.b.do.d;
import com.google.android.gms.b.do.e;
import com.google.android.gms.b.do.g;
import com.google.android.gms.common.util.c;
import com.google.android.gms.measurement.AppMeasurement;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class cv {
    private static volatile cv a;
    private Boolean A;
    private long B;
    private FileLock C;
    private FileChannel D;
    private List<Long> E;
    private int F;
    private int G;
    private long H = -1;
    private final Context b;
    private final by c;
    private final cr d;
    private final co e;
    private final cu f;
    private final de g;
    private final ct h;
    private final AppMeasurement i;
    private final com.google.firebase.a.a j;
    private final dl k;
    private final bz l;
    private final cm m;
    private final cp n;
    private final c o;
    private final db p;
    private final dc q;
    private final cb r;
    private final da s;
    private final cl t;
    private final cq u;
    private final dh v;
    private final bx w;
    private final bt x;
    private final boolean y;
    private boolean z;

    private class a implements b {
        e a;
        List<Long> b;
        List<b> c;
        long d;
        final /* synthetic */ cv e;

        private a(cv cvVar) {
            this.e = cvVar;
        }

        private long a(b bVar) {
            return ((bVar.c.longValue() / 1000) / 60) / 60;
        }

        public void a(e eVar) {
            com.google.android.gms.common.internal.c.a((Object) eVar);
            this.a = eVar;
        }

        boolean a() {
            return this.c == null || this.c.isEmpty();
        }

        public boolean a(long j, b bVar) {
            com.google.android.gms.common.internal.c.a((Object) bVar);
            if (this.c == null) {
                this.c = new ArrayList();
            }
            if (this.b == null) {
                this.b = new ArrayList();
            }
            if (this.c.size() > 0 && a((b) this.c.get(0)) != a(bVar)) {
                return false;
            }
            long f = this.d + ((long) bVar.f());
            if (f >= ((long) this.e.d().ab())) {
                return false;
            }
            this.d = f;
            this.c.add(bVar);
            this.b.add(Long.valueOf(j));
            return this.c.size() < this.e.d().ac();
        }
    }

    cv(cz czVar) {
        com.google.android.gms.common.internal.c.a((Object) czVar);
        this.b = czVar.a;
        this.o = czVar.n(this);
        this.c = czVar.a(this);
        cr b = czVar.b(this);
        b.R();
        this.d = b;
        co c = czVar.c(this);
        c.R();
        this.e = c;
        f().B().a("App measurement is starting up, version", Long.valueOf(d().Q()));
        f().B().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        f().C().a("Debug-level message logging enabled");
        f().C().a("AppMeasurement singleton hash", Integer.valueOf(System.identityHashCode(this)));
        dl j = czVar.j(this);
        j.R();
        this.k = j;
        cb q = czVar.q(this);
        q.R();
        this.r = q;
        cl r = czVar.r(this);
        r.R();
        this.t = r;
        d().R();
        String x = r.x();
        if (o().k(x)) {
            f().B().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            com.google.android.gms.b.co.a B = f().B();
            String str = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ";
            x = String.valueOf(x);
            B.a(x.length() != 0 ? str.concat(x) : new String(str));
        }
        bz k = czVar.k(this);
        k.R();
        this.l = k;
        cm l = czVar.l(this);
        l.R();
        this.m = l;
        bx u = czVar.u(this);
        u.R();
        this.w = u;
        this.x = czVar.v(this);
        cp m = czVar.m(this);
        m.R();
        this.n = m;
        db o = czVar.o(this);
        o.R();
        this.p = o;
        dc p = czVar.p(this);
        p.R();
        this.q = p;
        da i = czVar.i(this);
        i.R();
        this.s = i;
        dh t = czVar.t(this);
        t.R();
        this.v = t;
        this.u = czVar.s(this);
        this.i = czVar.h(this);
        this.j = czVar.g(this);
        de e = czVar.e(this);
        e.R();
        this.g = e;
        ct f = czVar.f(this);
        f.R();
        this.h = f;
        cu d = czVar.d(this);
        d.R();
        this.f = d;
        if (this.F != this.G) {
            f().x().a("Not all components initialized", Integer.valueOf(this.F), Integer.valueOf(this.G));
        }
        this.y = true;
        this.c.R();
        if (!(this.b.getApplicationContext() instanceof Application)) {
            f().z().a("Application context is not an Application");
        } else if (VERSION.SDK_INT >= 14) {
            l().x();
        } else {
            f().C().a("Not tracking deep linking pre-ICS");
        }
        this.f.a(new Runnable(this) {
            final /* synthetic */ cv a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.c();
            }
        });
    }

    private boolean P() {
        C();
        a();
        return p().I() || !TextUtils.isEmpty(p().C());
    }

    private void Q() {
        C();
        a();
        if (!O()) {
            return;
        }
        if (b() && P()) {
            long R = R();
            if (R == 0) {
                y().b();
                z().x();
                return;
            } else if (r().x()) {
                long a = e().e.a();
                long ag = d().ag();
                if (!o().a(a, ag)) {
                    R = Math.max(R, a + ag);
                }
                y().b();
                R -= t().a();
                if (R <= 0) {
                    R = d().aj();
                    e().c.a(t().a());
                }
                f().D().a("Upload scheduled in approximately ms", Long.valueOf(R));
                z().a(R);
                return;
            } else {
                y().a();
                z().x();
                return;
            }
        }
        y().b();
        z().x();
    }

    private long R() {
        long a = t().a();
        long am = d().am();
        Object obj = (p().J() || p().D()) ? 1 : null;
        long ai = obj != null ? d().ai() : d().ah();
        long a2 = e().c.a();
        long a3 = e().d.a();
        long max = Math.max(p().G(), p().H());
        if (max == 0) {
            return 0;
        }
        max = a - Math.abs(max - a);
        a3 = a - Math.abs(a3 - a);
        a2 = Math.max(a - Math.abs(a2 - a), a3);
        a = max + am;
        if (obj != null && a2 > 0) {
            a = Math.min(max, a2) + ai;
        }
        if (!o().a(a2, ai)) {
            a = a2 + ai;
        }
        if (a3 == 0 || a3 < max) {
            return a;
        }
        for (int i = 0; i < d().ao(); i++) {
            a += ((long) (1 << i)) * d().an();
            if (a > a3) {
                return a;
            }
        }
        return 0;
    }

    public static cv a(Context context) {
        com.google.android.gms.common.internal.c.a((Object) context);
        com.google.android.gms.common.internal.c.a(context.getApplicationContext());
        if (a == null) {
            synchronized (cv.class) {
                if (a == null) {
                    a = new cz(context).a();
                }
            }
        }
        return a;
    }

    private void a(cx cxVar) {
        if (cxVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private boolean a(cc ccVar) {
        if (ccVar.f == null) {
            return false;
        }
        Iterator it = ccVar.f.iterator();
        while (it.hasNext()) {
            if ("_r".equals((String) it.next())) {
                return true;
            }
        }
        return j().c(ccVar.a, ccVar.b) && p().a(H(), ccVar.a, false, false, false, false, false).e < ((long) d().c(ccVar.a));
    }

    private boolean a(String str, long j) {
        p().x();
        try {
            cv cvVar = this;
            a aVar = new a();
            p().a(str, j, this.H, aVar);
            if (aVar.a()) {
                p().y();
                p().z();
                return false;
            }
            int i;
            boolean z = false;
            e eVar = aVar.a;
            eVar.b = new b[aVar.c.size()];
            int i2 = 0;
            int i3 = 0;
            while (i3 < aVar.c.size()) {
                boolean z2;
                Object obj;
                if (j().b(aVar.a.o, ((b) aVar.c.get(i3)).b)) {
                    f().z().a("Dropping blacklisted raw event. appId", co.a(str), ((b) aVar.c.get(i3)).b);
                    obj = (o().m(aVar.a.o) || o().n(aVar.a.o)) ? 1 : null;
                    if (obj != null || "_err".equals(((b) aVar.c.get(i3)).b)) {
                        i = i2;
                        z2 = z;
                    } else {
                        o().a(11, "_ev", ((b) aVar.c.get(i3)).b, 0);
                        i = i2;
                        z2 = z;
                    }
                } else {
                    boolean a;
                    int i4;
                    if (j().c(aVar.a.o, ((b) aVar.c.get(i3)).b)) {
                        do.c[] cVarArr;
                        do.c cVar;
                        b bVar;
                        Object obj2 = null;
                        Object obj3 = null;
                        if (((b) aVar.c.get(i3)).a == null) {
                            ((b) aVar.c.get(i3)).a = new do.c[0];
                        }
                        do.c[] cVarArr2 = ((b) aVar.c.get(i3)).a;
                        int length = cVarArr2.length;
                        int i5 = 0;
                        while (i5 < length) {
                            do.c cVar2 = cVarArr2[i5];
                            if ("_c".equals(cVar2.a)) {
                                cVar2.c = Long.valueOf(1);
                                obj2 = 1;
                                obj = obj3;
                            } else if ("_r".equals(cVar2.a)) {
                                cVar2.c = Long.valueOf(1);
                                obj = 1;
                            } else {
                                obj = obj3;
                            }
                            i5++;
                            obj3 = obj;
                        }
                        if (obj2 == null) {
                            f().D().a("Marking event as conversion", ((b) aVar.c.get(i3)).b);
                            cVarArr = (do.c[]) Arrays.copyOf(((b) aVar.c.get(i3)).a, ((b) aVar.c.get(i3)).a.length + 1);
                            cVar = new do.c();
                            cVar.a = "_c";
                            cVar.c = Long.valueOf(1);
                            cVarArr[cVarArr.length - 1] = cVar;
                            ((b) aVar.c.get(i3)).a = cVarArr;
                        }
                        if (obj3 == null) {
                            f().D().a("Marking event as real-time", ((b) aVar.c.get(i3)).b);
                            cVarArr = (do.c[]) Arrays.copyOf(((b) aVar.c.get(i3)).a, ((b) aVar.c.get(i3)).a.length + 1);
                            cVar = new do.c();
                            cVar.a = "_r";
                            cVar.c = Long.valueOf(1);
                            cVarArr[cVarArr.length - 1] = cVar;
                            ((b) aVar.c.get(i3)).a = cVarArr;
                        }
                        boolean z3 = true;
                        a = dl.a(((b) aVar.c.get(i3)).b);
                        if (p().a(H(), aVar.a.o, false, false, false, false, true).e > ((long) d().c(aVar.a.o))) {
                            bVar = (b) aVar.c.get(i3);
                            i4 = 0;
                            while (i4 < bVar.a.length) {
                                if ("_r".equals(bVar.a[i4].a)) {
                                    Object obj4 = new do.c[(bVar.a.length - 1)];
                                    if (i4 > 0) {
                                        System.arraycopy(bVar.a, 0, obj4, 0, i4);
                                    }
                                    if (i4 < obj4.length) {
                                        System.arraycopy(bVar.a, i4 + 1, obj4, i4, obj4.length - i4);
                                    }
                                    bVar.a = obj4;
                                    z3 = z;
                                } else {
                                    i4++;
                                }
                            }
                            z3 = z;
                        }
                        if (a && p().a(H(), aVar.a.o, false, false, true, false, false).c > ((long) d().b(aVar.a.o))) {
                            f().z().a("Too many conversions. Not logging as conversion. appId", co.a(str));
                            bVar = (b) aVar.c.get(i3);
                            Object obj5 = null;
                            do.c cVar3 = null;
                            do.c[] cVarArr3 = bVar.a;
                            int length2 = cVarArr3.length;
                            int i6 = 0;
                            while (i6 < length2) {
                                cVar = cVarArr3[i6];
                                if ("_c".equals(cVar.a)) {
                                    obj3 = obj5;
                                } else if ("_err".equals(cVar.a)) {
                                    do.c cVar4 = cVar3;
                                    int i7 = 1;
                                    cVar = cVar4;
                                } else {
                                    cVar = cVar3;
                                    obj3 = obj5;
                                }
                                i6++;
                                obj5 = obj3;
                                cVar3 = cVar;
                            }
                            if (obj5 != null && cVar3 != null) {
                                cVarArr3 = new do.c[(bVar.a.length - 1)];
                                int i8 = 0;
                                do.c[] cVarArr4 = bVar.a;
                                int length3 = cVarArr4.length;
                                i6 = 0;
                                while (i6 < length3) {
                                    do.c cVar5 = cVarArr4[i6];
                                    if (cVar5 != cVar3) {
                                        i4 = i8 + 1;
                                        cVarArr3[i8] = cVar5;
                                    } else {
                                        i4 = i8;
                                    }
                                    i6++;
                                    i8 = i4;
                                }
                                bVar.a = cVarArr3;
                                a = z3;
                            } else if (cVar3 != null) {
                                cVar3.a = "_err";
                                cVar3.c = Long.valueOf(10);
                                a = z3;
                            } else {
                                f().x().a("Did not find conversion parameter. appId", co.a(str));
                            }
                        }
                        a = z3;
                    } else {
                        a = z;
                    }
                    i4 = i2 + 1;
                    eVar.b[i2] = (b) aVar.c.get(i3);
                    i = i4;
                    z2 = a;
                }
                i3++;
                i2 = i;
                z = z2;
            }
            if (i2 < aVar.c.size()) {
                eVar.b = (b[]) Arrays.copyOf(eVar.b, i2);
            }
            eVar.A = a(aVar.a.o, aVar.a.c, eVar.b);
            eVar.e = Long.valueOf(Long.MAX_VALUE);
            eVar.f = Long.valueOf(Long.MIN_VALUE);
            for (b bVar2 : eVar.b) {
                if (bVar2.c.longValue() < eVar.e.longValue()) {
                    eVar.e = bVar2.c;
                }
                if (bVar2.c.longValue() > eVar.f.longValue()) {
                    eVar.f = bVar2.c;
                }
            }
            String str2 = aVar.a.o;
            bu b = p().b(str2);
            if (b == null) {
                f().x().a("Bundling raw events w/o app info. appId", co.a(str));
            } else if (eVar.b.length > 0) {
                long h = b.h();
                eVar.h = h != 0 ? Long.valueOf(h) : null;
                long g = b.g();
                if (g != 0) {
                    h = g;
                }
                eVar.g = h != 0 ? Long.valueOf(h) : null;
                b.r();
                eVar.w = Integer.valueOf((int) b.o());
                b.a(eVar.e.longValue());
                b.b(eVar.f.longValue());
                eVar.x = b.z();
                p().a(b);
            }
            if (eVar.b.length > 0) {
                d().R();
                dn.b a2 = j().a(aVar.a.o);
                if (a2 == null || a2.a == null) {
                    f().z().a("Did not find measurement config or missing version info. appId", co.a(str));
                } else {
                    eVar.G = a2.a;
                }
                p().a(eVar, z);
            }
            p().a(aVar.b);
            p().i(str2);
            p().y();
            boolean z4 = eVar.b.length > 0;
            p().z();
            return z4;
        } catch (Throwable th) {
            p().z();
        }
    }

    private com.google.android.gms.b.do.a[] a(String str, g[] gVarArr, b[] bVarArr) {
        com.google.android.gms.common.internal.c.a(str);
        return A().a(str, bVarArr, gVarArr);
    }

    private void b(cy cyVar) {
        if (cyVar == null) {
            throw new IllegalStateException("Component not created");
        } else if (!cyVar.P()) {
            throw new IllegalStateException("Component not initialized");
        }
    }

    private void c(bv bvVar) {
        C();
        a();
        com.google.android.gms.common.internal.c.a((Object) bvVar);
        com.google.android.gms.common.internal.c.a(bvVar.b);
        bu b = p().b(bvVar.b);
        String b2 = e().b(bvVar.b);
        Object obj = null;
        if (b == null) {
            bu buVar = new bu(this, bvVar.b);
            buVar.a(e().x());
            buVar.c(b2);
            b = buVar;
            obj = 1;
        } else if (!b2.equals(b.e())) {
            b.c(b2);
            b.a(e().x());
            int i = 1;
        }
        if (!(TextUtils.isEmpty(bvVar.c) || bvVar.c.equals(b.d()))) {
            b.b(bvVar.c);
            obj = 1;
        }
        if (!(TextUtils.isEmpty(bvVar.l) || bvVar.l.equals(b.f()))) {
            b.d(bvVar.l);
            obj = 1;
        }
        if (!(bvVar.f == 0 || bvVar.f == b.l())) {
            b.d(bvVar.f);
            obj = 1;
        }
        if (!(TextUtils.isEmpty(bvVar.d) || bvVar.d.equals(b.i()))) {
            b.e(bvVar.d);
            obj = 1;
        }
        if (bvVar.k != b.j()) {
            b.c(bvVar.k);
            obj = 1;
        }
        if (!(TextUtils.isEmpty(bvVar.e) || bvVar.e.equals(b.k()))) {
            b.f(bvVar.e);
            obj = 1;
        }
        if (bvVar.g != b.m()) {
            b.e(bvVar.g);
            obj = 1;
        }
        if (bvVar.i != b.n()) {
            b.a(bvVar.i);
            obj = 1;
        }
        if (!(TextUtils.isEmpty(bvVar.h) || bvVar.h.equals(b.y()))) {
            b.g(bvVar.h);
            obj = 1;
        }
        if (obj != null) {
            p().a(b);
        }
    }

    public bx A() {
        b(this.w);
        return this.w;
    }

    public bt B() {
        a(this.x);
        return this.x;
    }

    public void C() {
        h().e();
    }

    FileChannel D() {
        return this.D;
    }

    void E() {
        C();
        a();
        if (O() && F()) {
            a(a(D()), x().A());
        }
    }

    boolean F() {
        C();
        try {
            this.D = new RandomAccessFile(new File(s().getFilesDir(), this.l.B()), "rw").getChannel();
            this.C = this.D.tryLock();
            if (this.C != null) {
                f().D().a("Storage concurrent access okay");
                return true;
            }
            f().x().a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            f().x().a("Failed to acquire storage lock", e);
        } catch (IOException e2) {
            f().x().a("Failed to access storage lock file", e2);
        }
    }

    public boolean G() {
        boolean z = false;
        C();
        a();
        if (d().T()) {
            return false;
        }
        Boolean U = d().U();
        if (U != null) {
            z = U.booleanValue();
        } else if (!d().V()) {
            z = true;
        }
        return e().c(z);
    }

    long H() {
        return ((((t().a() + e().z()) / 1000) / 60) / 60) / 24;
    }

    void I() {
        d().R();
    }

    void J() {
        d().R();
        throw new IllegalStateException("Unexpected call on client side");
    }

    protected boolean K() {
        C();
        return this.E != null;
    }

    public void L() {
        int i = 0;
        C();
        a();
        d().R();
        Boolean B = e().B();
        if (B == null) {
            f().z().a("Upload data called on the client side before use of service was decided");
        } else if (B.booleanValue()) {
            f().x().a("Upload called in the client side when service should be used");
        } else if (K()) {
            f().z().a("Uploading requested multiple times");
        } else if (r().x()) {
            long a = t().a();
            a(a - d().af());
            long a2 = e().c.a();
            if (a2 != 0) {
                f().C().a("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(a - a2)));
            }
            String C = p().C();
            if (TextUtils.isEmpty(C)) {
                this.H = -1;
                String b = p().b(a - d().af());
                if (!TextUtils.isEmpty(b)) {
                    bu b2 = p().b(b);
                    if (b2 != null) {
                        a(b2);
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.H == -1) {
                this.H = p().K();
            }
            List<Pair> a3 = p().a(C, d().h(C), d().i(C));
            if (!a3.isEmpty()) {
                e eVar;
                Object obj;
                List subList;
                for (Pair pair : a3) {
                    eVar = (e) pair.first;
                    if (!TextUtils.isEmpty(eVar.s)) {
                        obj = eVar.s;
                        break;
                    }
                }
                obj = null;
                if (obj != null) {
                    for (int i2 = 0; i2 < a3.size(); i2++) {
                        eVar = (e) ((Pair) a3.get(i2)).first;
                        if (!TextUtils.isEmpty(eVar.s) && !eVar.s.equals(obj)) {
                            subList = a3.subList(0, i2);
                            break;
                        }
                    }
                }
                subList = a3;
                d dVar = new d();
                dVar.a = new e[subList.size()];
                List arrayList = new ArrayList(subList.size());
                while (i < dVar.a.length) {
                    dVar.a[i] = (e) ((Pair) subList.get(i)).first;
                    arrayList.add((Long) ((Pair) subList.get(i)).second);
                    dVar.a[i].r = Long.valueOf(d().Q());
                    dVar.a[i].d = Long.valueOf(a);
                    dVar.a[i].z = Boolean.valueOf(d().R());
                    i++;
                }
                Object b3 = f().a(2) ? dl.b(dVar) : null;
                byte[] a4 = o().a(dVar);
                String ae = d().ae();
                try {
                    URL url = new URL(ae);
                    a(arrayList);
                    e().d.a(a);
                    Object obj2 = "?";
                    if (dVar.a.length > 0) {
                        obj2 = dVar.a[0].o;
                    }
                    f().D().a("Uploading data. app, uncompressed size, data", obj2, Integer.valueOf(a4.length), b3);
                    r().a(C, url, a4, null, new a(this) {
                        final /* synthetic */ cv a;

                        {
                            this.a = r1;
                        }

                        public void a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
                            this.a.a(i, th, bArr);
                        }
                    });
                } catch (MalformedURLException e) {
                    f().x().a("Failed to parse upload URL. Not uploading. appId", co.a(C), ae);
                }
            }
        } else {
            f().z().a("Network not connected, ignoring upload request");
            Q();
        }
    }

    void M() {
        this.G++;
    }

    void N() {
        C();
        a();
        if (!this.z) {
            f().B().a("This instance being marked as an uploader");
            E();
        }
        this.z = true;
    }

    boolean O() {
        C();
        a();
        return this.z;
    }

    int a(FileChannel fileChannel) {
        int i = 0;
        C();
        if (fileChannel == null || !fileChannel.isOpen()) {
            f().x().a("Bad chanel to read from");
        } else {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0);
                int read = fileChannel.read(allocate);
                if (read == 4) {
                    allocate.flip();
                    i = allocate.getInt();
                } else if (read != -1) {
                    f().z().a("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
            } catch (IOException e) {
                f().x().a("Failed to read from channel", e);
            }
        }
        return i;
    }

    public String a(final String str) {
        Object e;
        try {
            return (String) h().a(new Callable<String>(this) {
                final /* synthetic */ cv b;

                public String a() {
                    bu b = this.b.p().b(str);
                    return b == null ? null : b.c();
                }

                public /* synthetic */ Object call() {
                    return a();
                }
            }).get(30000, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e2) {
            e = e2;
        } catch (InterruptedException e3) {
            e = e3;
        } catch (ExecutionException e4) {
            e = e4;
        }
        f().x().a("Failed to get app instance id. appId", co.a(str), e);
        return null;
    }

    void a() {
        if (!this.y) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    protected void a(int i, Throwable th, byte[] bArr) {
        int i2 = 0;
        C();
        a();
        if (bArr == null) {
            bArr = new byte[0];
        }
        List<Long> list = this.E;
        this.E = null;
        if ((i == 200 || i == 204) && th == null) {
            e().c.a(t().a());
            e().d.a(0);
            Q();
            f().D().a("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
            p().x();
            try {
                for (Long longValue : list) {
                    p().a(longValue.longValue());
                }
                p().y();
                if (r().x() && P()) {
                    L();
                    return;
                }
                this.H = -1;
                Q();
            } finally {
                p().z();
            }
        } else {
            f().D().a("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            e().d.a(t().a());
            if (i == 503 || i == 429) {
                i2 = 1;
            }
            if (i2 != 0) {
                e().e.a(t().a());
            }
            Q();
        }
    }

    void a(bu buVar) {
        String a = d().a(buVar.d(), buVar.c());
        try {
            URL url = new URL(a);
            f().D().a("Fetching remote configuration", buVar.b());
            dn.b a2 = j().a(buVar.b());
            Map map = null;
            CharSequence b = j().b(buVar.b());
            if (!(a2 == null || TextUtils.isEmpty(b))) {
                map = new android.support.v4.i.a();
                map.put("If-Modified-Since", b);
            }
            r().a(buVar.b(), url, map, new a(this) {
                final /* synthetic */ cv a;

                {
                    this.a = r1;
                }

                public void a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
                    this.a.a(str, i, th, bArr, map);
                }
            });
        } catch (MalformedURLException e) {
            f().x().a("Failed to parse config URL. Not fetching. appId", co.a(buVar.b()), a);
        }
    }

    void a(bv bvVar) {
        C();
        a();
        com.google.android.gms.common.internal.c.a(bvVar.b);
        c(bvVar);
    }

    void a(bv bvVar, long j) {
        bu b = p().b(bvVar.b);
        if (!(b == null || b.d() == null || b.d().equals(bvVar.c))) {
            f().z().a("New GMP App Id passed in. Removing cached database data. appId", co.a(b.b()));
            p().g(b.b());
            b = null;
        }
        if (b != null && b.i() != null && !b.i().equals(bvVar.d)) {
            Bundle bundle = new Bundle();
            bundle.putString("_pv", b.i());
            a(new ch("_au", new ce(bundle), "auto", j), bvVar);
        }
    }

    void a(cc ccVar, bv bvVar) {
        C();
        a();
        com.google.android.gms.common.internal.c.a((Object) ccVar);
        com.google.android.gms.common.internal.c.a((Object) bvVar);
        com.google.android.gms.common.internal.c.a(ccVar.a);
        com.google.android.gms.common.internal.c.b(ccVar.a.equals(bvVar.b));
        e eVar = new e();
        eVar.a = Integer.valueOf(1);
        eVar.i = "android";
        eVar.o = bvVar.b;
        eVar.n = bvVar.e;
        eVar.p = bvVar.d;
        eVar.C = Integer.valueOf((int) bvVar.k);
        eVar.q = Long.valueOf(bvVar.f);
        eVar.y = bvVar.c;
        eVar.v = bvVar.g == 0 ? null : Long.valueOf(bvVar.g);
        Pair a = e().a(bvVar.b);
        if (!TextUtils.isEmpty((CharSequence) a.first)) {
            eVar.s = (String) a.first;
            eVar.t = (Boolean) a.second;
        } else if (!w().a(this.b)) {
            String string = Secure.getString(this.b.getContentResolver(), "android_id");
            if (string == null) {
                f().z().a("null secure ID. appId", co.a(eVar.o));
                string = "null";
            } else if (string.isEmpty()) {
                f().z().a("empty secure ID. appId", co.a(eVar.o));
            }
            eVar.F = string;
        }
        eVar.k = w().x();
        eVar.j = w().y();
        eVar.m = Integer.valueOf((int) w().z());
        eVar.l = w().A();
        eVar.r = null;
        eVar.d = null;
        eVar.e = null;
        eVar.f = null;
        bu b = p().b(bvVar.b);
        if (b == null) {
            b = new bu(this, bvVar.b);
            b.a(e().x());
            b.d(bvVar.l);
            b.b(bvVar.c);
            b.c(e().b(bvVar.b));
            b.f(0);
            b.a(0);
            b.b(0);
            b.e(bvVar.d);
            b.c(bvVar.k);
            b.f(bvVar.e);
            b.d(bvVar.f);
            b.e(bvVar.g);
            b.a(bvVar.i);
            p().a(b);
        }
        eVar.u = b.c();
        eVar.B = b.f();
        List a2 = p().a(bvVar.b);
        eVar.c = new g[a2.size()];
        for (int i = 0; i < a2.size(); i++) {
            g gVar = new g();
            eVar.c[i] = gVar;
            gVar.b = ((dk) a2.get(i)).b;
            gVar.a = Long.valueOf(((dk) a2.get(i)).c);
            o().a(gVar, ((dk) a2.get(i)).d);
        }
        try {
            p().a(ccVar, p().a(eVar), a(ccVar));
        } catch (IOException e) {
            f().x().a("Data loss. Failed to insert raw event metadata. appId", co.a(eVar.o), e);
        }
    }

    void a(ch chVar, bv bvVar) {
        long nanoTime = System.nanoTime();
        C();
        a();
        String str = bvVar.b;
        com.google.android.gms.common.internal.c.a(str);
        if (!dl.a(chVar, bvVar)) {
            return;
        }
        if (!bvVar.i && !"_in".equals(chVar.b)) {
            c(bvVar);
        } else if (j().b(str, chVar.b)) {
            f().z().a("Dropping blacklisted event. appId", co.a(str), chVar.b);
            Object obj = (o().m(str) || o().n(str)) ? 1 : null;
            if (obj == null && !"_err".equals(chVar.b)) {
                o().a(11, "_ev", chVar.b, 0);
            }
            if (obj != null) {
                bu b = p().b(str);
                if (b != null) {
                    if (Math.abs(t().a() - Math.max(b.q(), b.p())) > d().Y()) {
                        f().C().a("Fetching config for blacklisted app");
                        a(b);
                    }
                }
            }
        } else {
            if (f().a(2)) {
                f().D().a("Logging event", chVar);
            }
            p().x();
            try {
                Bundle b2 = chVar.c.b();
                c(bvVar);
                if ("_iap".equals(chVar.b) || "ecommerce_purchase".equals(chVar.b)) {
                    long round;
                    Object string = b2.getString("currency");
                    if ("ecommerce_purchase".equals(chVar.b)) {
                        double d = b2.getDouble("value") * 1000000.0d;
                        if (d == 0.0d) {
                            d = ((double) b2.getLong("value")) * 1000000.0d;
                        }
                        if (d > 9.223372036854776E18d || d < -9.223372036854776E18d) {
                            f().z().a("Data lost. Currency value is too big. appId", co.a(str), Double.valueOf(d));
                            p().y();
                            p().z();
                            return;
                        }
                        round = Math.round(d);
                    } else {
                        round = b2.getLong("value");
                    }
                    if (!TextUtils.isEmpty(string)) {
                        String toUpperCase = string.toUpperCase(Locale.US);
                        if (toUpperCase.matches("[A-Z]{3}")) {
                            dk dkVar;
                            String valueOf = String.valueOf("_ltv_");
                            toUpperCase = String.valueOf(toUpperCase);
                            String concat = toUpperCase.length() != 0 ? valueOf.concat(toUpperCase) : new String(valueOf);
                            dk c = p().c(str, concat);
                            if (c == null || !(c.d instanceof Long)) {
                                p().a(str, d().e(str) - 1);
                                dkVar = new dk(str, concat, t().a(), Long.valueOf(round));
                            } else {
                                dkVar = new dk(str, concat, t().a(), Long.valueOf(round + ((Long) c.d).longValue()));
                            }
                            if (!p().a(dkVar)) {
                                f().x().a("Too many unique user properties are set. Ignoring user property. appId", co.a(str), dkVar.b, dkVar.d);
                                o().a(9, null, null, 0);
                            }
                        }
                    }
                }
                boolean a = dl.a(chVar.b);
                boolean equals = "_err".equals(chVar.b);
                com.google.android.gms.b.bz.a a2 = p().a(H(), str, true, a, false, equals, false);
                long G = a2.b - d().G();
                if (G > 0) {
                    if (G % 1000 == 1) {
                        f().x().a("Data loss. Too many events logged. appId, count", co.a(str), Long.valueOf(a2.b));
                    }
                    o().a(16, "_ev", chVar.b, 0);
                    p().y();
                    return;
                }
                cd cdVar;
                if (a) {
                    G = a2.a - d().H();
                    if (G > 0) {
                        if (G % 1000 == 1) {
                            f().x().a("Data loss. Too many public events logged. appId, count", co.a(str), Long.valueOf(a2.a));
                        }
                        o().a(16, "_ev", chVar.b, 0);
                        p().y();
                        p().z();
                        return;
                    }
                }
                if (equals) {
                    G = a2.d - ((long) d().a(bvVar.b));
                    if (G > 0) {
                        if (G == 1) {
                            f().x().a("Too many error events logged. appId, count", co.a(str), Long.valueOf(a2.d));
                        }
                        p().y();
                        p().z();
                        return;
                    }
                }
                o().a(b2, "_o", chVar.d);
                if (o().k(str)) {
                    o().a(b2, "_dbg", Long.valueOf(1));
                    o().a(b2, "_r", Long.valueOf(1));
                }
                long c2 = p().c(str);
                if (c2 > 0) {
                    f().z().a("Data lost. Too many events stored on disk, deleted. appId", co.a(str), Long.valueOf(c2));
                }
                cc ccVar = new cc(this, chVar.d, str, chVar.b, chVar.e, 0, b2);
                cd a3 = p().a(str, ccVar.b);
                if (a3 == null) {
                    c2 = p().j(str);
                    d().F();
                    if (c2 >= 500) {
                        f().x().a("Too many event names used, ignoring event. appId, name, supported count", co.a(str), ccVar.b, Integer.valueOf(d().F()));
                        o().a(8, null, null, 0);
                        p().z();
                        return;
                    }
                    cdVar = new cd(str, ccVar.b, 0, 0, ccVar.d);
                } else {
                    ccVar = ccVar.a(this, a3.e);
                    cdVar = a3.a(ccVar.d);
                }
                p().a(cdVar);
                a(ccVar, bvVar);
                p().y();
                if (f().a(2)) {
                    f().D().a("Event recorded", ccVar);
                }
                p().z();
                Q();
                f().D().a("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000));
            } finally {
                p().z();
            }
        }
    }

    void a(ch chVar, String str) {
        bu b = p().b(str);
        if (b == null || TextUtils.isEmpty(b.i())) {
            f().C().a("No app data available; dropping event", str);
            return;
        }
        try {
            String str2 = at.b(s()).b(str, 0).versionName;
            if (!(b.i() == null || b.i().equals(str2))) {
                f().z().a("App version does not match; dropping event. appId", co.a(str));
                return;
            }
        } catch (NameNotFoundException e) {
            if (!"_ui".equals(chVar.b)) {
                f().z().a("Could not find package. appId", co.a(str));
            }
        }
        ch chVar2 = chVar;
        a(chVar2, new bv(str, b.d(), b.i(), b.j(), b.k(), b.l(), b.m(), null, b.n(), false, b.f()));
    }

    void a(cy cyVar) {
        this.F++;
    }

    void a(di diVar, bv bvVar) {
        int i = 0;
        C();
        a();
        if (!TextUtils.isEmpty(bvVar.c)) {
            if (bvVar.i) {
                int c = o().c(diVar.b);
                String a;
                if (c != 0) {
                    a = o().a(diVar.b, d().z(), true);
                    if (diVar.b != null) {
                        i = diVar.b.length();
                    }
                    o().a(c, "_ev", a, i);
                    return;
                }
                c = o().c(diVar.b, diVar.a());
                if (c != 0) {
                    a = o().a(diVar.b, d().z(), true);
                    Object a2 = diVar.a();
                    if (a2 != null && ((a2 instanceof String) || (a2 instanceof CharSequence))) {
                        i = String.valueOf(a2).length();
                    }
                    o().a(c, "_ev", a, i);
                    return;
                }
                Object d = o().d(diVar.b, diVar.a());
                if (d != null) {
                    dk dkVar = new dk(bvVar.b, diVar.b, diVar.c, d);
                    f().C().a("Setting user property", dkVar.b, d);
                    p().x();
                    try {
                        c(bvVar);
                        boolean a3 = p().a(dkVar);
                        p().y();
                        if (a3) {
                            f().C().a("User property set", dkVar.b, dkVar.d);
                        } else {
                            f().x().a("Too many unique user properties are set. Ignoring user property", dkVar.b, dkVar.d);
                            o().a(9, null, null, 0);
                        }
                        p().z();
                        return;
                    } catch (Throwable th) {
                        p().z();
                    }
                } else {
                    return;
                }
            }
            c(bvVar);
        }
    }

    void a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        int i2 = 0;
        C();
        a();
        com.google.android.gms.common.internal.c.a(str);
        if (bArr == null) {
            bArr = new byte[0];
        }
        p().x();
        try {
            bu b = p().b(str);
            int i3 = ((i == 200 || i == 204 || i == 304) && th == null) ? 1 : 0;
            if (b == null) {
                f().z().a("App does not exist in onConfigFetched. appId", co.a(str));
            } else if (i3 != 0 || i == 404) {
                List list = map != null ? (List) map.get("Last-Modified") : null;
                String str2 = (list == null || list.size() <= 0) ? null : (String) list.get(0);
                if (i == 404 || i == 304) {
                    if (j().a(str) == null && !j().a(str, null, null)) {
                        p().z();
                        return;
                    }
                } else if (!j().a(str, bArr, str2)) {
                    p().z();
                    return;
                }
                b.g(t().a());
                p().a(b);
                if (i == 404) {
                    f().z().a("Config not found. Using empty config. appId", co.a(str));
                } else {
                    f().D().a("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                }
                if (r().x() && P()) {
                    L();
                } else {
                    Q();
                }
            } else {
                b.h(t().a());
                p().a(b);
                f().D().a("Fetching config failed. code, error", Integer.valueOf(i), th);
                j().c(str);
                e().d.a(t().a());
                if (i == 503 || i == 429) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    e().e.a(t().a());
                }
                Q();
            }
            p().y();
        } finally {
            p().z();
        }
    }

    protected void a(List<Long> list) {
        com.google.android.gms.common.internal.c.b(!list.isEmpty());
        if (this.E != null) {
            f().x().a("Set uploading progress before finishing the previous upload");
        } else {
            this.E = new ArrayList(list);
        }
    }

    public void a(boolean z) {
        Q();
    }

    boolean a(int i, int i2) {
        C();
        if (i > i2) {
            f().x().a("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
            return false;
        }
        if (i < i2) {
            if (a(i2, D())) {
                f().D().a("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                f().x().a("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
                return false;
            }
        }
        return true;
    }

    boolean a(int i, FileChannel fileChannel) {
        C();
        if (fileChannel == null || !fileChannel.isOpen()) {
            f().x().a("Bad chanel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() == 4) {
                return true;
            }
            f().x().a("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            return true;
        } catch (IOException e) {
            f().x().a("Failed to write to channel", e);
            return false;
        }
    }

    boolean a(long j) {
        return a(null, j);
    }

    public String b(final String str) {
        Object e;
        J();
        try {
            return (String) h().b(new Callable<String>(this) {
                final /* synthetic */ cv b;

                public String a() {
                    bu b = this.b.p().b(str);
                    return b == null ? null : b.d();
                }

                public /* synthetic */ Object call() {
                    return a();
                }
            }).get(30000, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e2) {
            e = e2;
        } catch (InterruptedException e3) {
            e = e3;
        } catch (ExecutionException e4) {
            e = e4;
        }
        f().x().a("Failed to get gmp app id. appId", co.a(str), e);
        return null;
    }

    public void b(bv bvVar) {
        C();
        a();
        com.google.android.gms.common.internal.c.a((Object) bvVar);
        com.google.android.gms.common.internal.c.a(bvVar.b);
        if (!TextUtils.isEmpty(bvVar.c)) {
            if (bvVar.i) {
                long a = t().a();
                p().x();
                try {
                    a(bvVar, a);
                    c(bvVar);
                    if (p().a(bvVar.b, "_f") == null) {
                        a(new di("_fot", a, Long.valueOf((1 + (a / 3600000)) * 3600000), "auto"), bvVar);
                        b(bvVar, a);
                        c(bvVar, a);
                    } else if (bvVar.j) {
                        d(bvVar, a);
                    }
                    p().y();
                } finally {
                    p().z();
                }
            } else {
                c(bvVar);
            }
        }
    }

    void b(bv bvVar, long j) {
        C();
        a();
        Bundle bundle = new Bundle();
        bundle.putLong("_c", 1);
        bundle.putLong("_r", 1);
        bundle.putLong("_uwa", 0);
        bundle.putLong("_pfo", 0);
        bundle.putLong("_sys", 0);
        bundle.putLong("_sysu", 0);
        if (s().getPackageManager() == null) {
            f().x().a("PackageManager is null, first open report might be inaccurate. appId", co.a(bvVar.b));
        } else {
            PackageInfo b;
            ApplicationInfo a;
            try {
                b = at.b(s()).b(bvVar.b, 0);
            } catch (NameNotFoundException e) {
                f().x().a("Package info is null, first open report might be inaccurate. appId", co.a(bvVar.b), e);
                b = null;
            }
            if (!(b == null || b.firstInstallTime == 0 || b.firstInstallTime == b.lastUpdateTime)) {
                bundle.putLong("_uwa", 1);
            }
            try {
                a = at.b(s()).a(bvVar.b, 0);
            } catch (NameNotFoundException e2) {
                f().x().a("Application info is null, first open report might be inaccurate. appId", co.a(bvVar.b), e2);
                a = null;
            }
            if (a != null) {
                if ((a.flags & 1) != 0) {
                    bundle.putLong("_sys", 1);
                }
                if ((a.flags & 128) != 0) {
                    bundle.putLong("_sysu", 1);
                }
            }
        }
        long h = p().h(bvVar.b);
        if (h >= 0) {
            bundle.putLong("_pfo", h);
        }
        a(new ch("_f", new ce(bundle), "auto", j), bvVar);
    }

    void b(di diVar, bv bvVar) {
        C();
        a();
        if (!TextUtils.isEmpty(bvVar.c)) {
            if (bvVar.i) {
                f().C().a("Removing user property", diVar.b);
                p().x();
                try {
                    c(bvVar);
                    p().b(bvVar.b, diVar.b);
                    p().y();
                    f().C().a("User property removed", diVar.b);
                } finally {
                    p().z();
                }
            } else {
                c(bvVar);
            }
        }
    }

    protected boolean b() {
        boolean z = false;
        a();
        C();
        if (this.A == null || this.B == 0 || !(this.A == null || this.A.booleanValue() || Math.abs(t().b() - this.B) <= 1000)) {
            this.B = t().b();
            d().R();
            if (o().i("android.permission.INTERNET") && o().i("android.permission.ACCESS_NETWORK_STATE")) {
                at.b(s());
                if (cs.a(s(), false) && dd.a(s(), false)) {
                    z = true;
                }
            }
            this.A = Boolean.valueOf(z);
            if (this.A.booleanValue()) {
                this.A = Boolean.valueOf(o().f(x().y()));
            }
        }
        return this.A.booleanValue();
    }

    public byte[] b(ch chVar, String str) {
        a();
        C();
        J();
        com.google.android.gms.common.internal.c.a((Object) chVar);
        com.google.android.gms.common.internal.c.a(str);
        d dVar = new d();
        p().x();
        try {
            bu b = p().b(str);
            byte[] bArr;
            if (b == null) {
                f().C().a("Log and bundle not available. package_name", str);
                bArr = new byte[0];
                return bArr;
            } else if (b.n()) {
                long j;
                e eVar = new e();
                dVar.a = new e[]{eVar};
                eVar.a = Integer.valueOf(1);
                eVar.i = "android";
                eVar.o = b.b();
                eVar.n = b.k();
                eVar.p = b.i();
                eVar.C = Integer.valueOf((int) b.j());
                eVar.q = Long.valueOf(b.l());
                eVar.y = b.d();
                eVar.v = Long.valueOf(b.m());
                Pair a = e().a(b.b());
                if (!TextUtils.isEmpty((CharSequence) a.first)) {
                    eVar.s = (String) a.first;
                    eVar.t = (Boolean) a.second;
                }
                eVar.k = w().x();
                eVar.j = w().y();
                eVar.m = Integer.valueOf((int) w().z());
                eVar.l = w().A();
                eVar.u = b.c();
                eVar.B = b.f();
                List a2 = p().a(b.b());
                eVar.c = new g[a2.size()];
                for (int i = 0; i < a2.size(); i++) {
                    g gVar = new g();
                    eVar.c[i] = gVar;
                    gVar.b = ((dk) a2.get(i)).b;
                    gVar.a = Long.valueOf(((dk) a2.get(i)).c);
                    o().a(gVar, ((dk) a2.get(i)).d);
                }
                Bundle b2 = chVar.c.b();
                if ("_iap".equals(chVar.b)) {
                    b2.putLong("_c", 1);
                    f().C().a("Marking in-app purchase as real-time");
                    b2.putLong("_r", 1);
                }
                b2.putString("_o", chVar.d);
                if (o().k(eVar.o)) {
                    o().a(b2, "_dbg", Long.valueOf(1));
                    o().a(b2, "_r", Long.valueOf(1));
                }
                cd a3 = p().a(str, chVar.b);
                if (a3 == null) {
                    p().a(new cd(str, chVar.b, 1, 0, chVar.e));
                    j = 0;
                } else {
                    j = a3.e;
                    p().a(a3.a(chVar.e).a());
                }
                cc ccVar = new cc(this, chVar.d, str, chVar.b, chVar.e, j, b2);
                b bVar = new b();
                eVar.b = new b[]{bVar};
                bVar.c = Long.valueOf(ccVar.d);
                bVar.b = ccVar.b;
                bVar.d = Long.valueOf(ccVar.e);
                bVar.a = new do.c[ccVar.f.a()];
                Iterator it = ccVar.f.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    do.c cVar = new do.c();
                    int i3 = i2 + 1;
                    bVar.a[i2] = cVar;
                    cVar.a = str2;
                    o().a(cVar, ccVar.f.a(str2));
                    i2 = i3;
                }
                eVar.A = a(b.b(), eVar.c, eVar.b);
                eVar.e = bVar.c;
                eVar.f = bVar.c;
                long h = b.h();
                eVar.h = h != 0 ? Long.valueOf(h) : null;
                long g = b.g();
                if (g != 0) {
                    h = g;
                }
                eVar.g = h != 0 ? Long.valueOf(h) : null;
                b.r();
                eVar.w = Integer.valueOf((int) b.o());
                eVar.r = Long.valueOf(d().Q());
                eVar.d = Long.valueOf(t().a());
                eVar.z = Boolean.TRUE;
                b.a(eVar.e.longValue());
                b.b(eVar.f.longValue());
                p().a(b);
                p().y();
                p().z();
                try {
                    bArr = new byte[dVar.f()];
                    lg a4 = lg.a(bArr);
                    dVar.a(a4);
                    a4.b();
                    return o().a(bArr);
                } catch (IOException e) {
                    f().x().a("Data loss. Failed to bundle and serialize. appId", co.a(str), e);
                    return null;
                }
            } else {
                f().C().a("Log and bundle disabled. package_name", str);
                bArr = new byte[0];
                p().z();
                return bArr;
            }
        } finally {
            p().z();
        }
    }

    protected void c() {
        C();
        p().E();
        if (e().c.a() == 0) {
            e().c.a(t().a());
        }
        if (b()) {
            d().R();
            if (!TextUtils.isEmpty(x().y())) {
                String A = e().A();
                if (A == null) {
                    e().c(x().y());
                } else if (!A.equals(x().y())) {
                    f().B().a("Rechecking which service to use due to a GMP App Id change");
                    e().C();
                    this.q.C();
                    this.q.A();
                    e().c(x().y());
                }
            }
            d().R();
            if (!TextUtils.isEmpty(x().y())) {
                l().y();
            }
        } else if (G()) {
            if (!o().i("android.permission.INTERNET")) {
                f().x().a("App is missing INTERNET permission");
            }
            if (!o().i("android.permission.ACCESS_NETWORK_STATE")) {
                f().x().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            d().R();
            at.b(s());
            if (!cs.a(s(), false)) {
                f().x().a("AppMeasurementReceiver not registered/enabled");
            }
            if (!dd.a(s(), false)) {
                f().x().a("AppMeasurementService not registered/enabled");
            }
            f().x().a("Uploading is not possible. App measurement disabled");
        }
        Q();
    }

    void c(bv bvVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("_et", 1);
        a(new ch("_e", new ce(bundle), "auto", j), bvVar);
    }

    public by d() {
        return this.c;
    }

    void d(bv bvVar, long j) {
        a(new ch("_cd", new ce(new Bundle()), "auto", j), bvVar);
    }

    public cr e() {
        a(this.d);
        return this.d;
    }

    public co f() {
        b(this.e);
        return this.e;
    }

    public co g() {
        return (this.e == null || !this.e.P()) ? null : this.e;
    }

    public cu h() {
        b(this.f);
        return this.f;
    }

    public de i() {
        b(this.g);
        return this.g;
    }

    public ct j() {
        b(this.h);
        return this.h;
    }

    cu k() {
        return this.f;
    }

    public da l() {
        b(this.s);
        return this.s;
    }

    public AppMeasurement m() {
        return this.i;
    }

    public com.google.firebase.a.a n() {
        return this.j;
    }

    public dl o() {
        a(this.k);
        return this.k;
    }

    public bz p() {
        b(this.l);
        return this.l;
    }

    public cm q() {
        b(this.m);
        return this.m;
    }

    public cp r() {
        b(this.n);
        return this.n;
    }

    public Context s() {
        return this.b;
    }

    public c t() {
        return this.o;
    }

    public db u() {
        b(this.p);
        return this.p;
    }

    public dc v() {
        b(this.q);
        return this.q;
    }

    public cb w() {
        b(this.r);
        return this.r;
    }

    public cl x() {
        b(this.t);
        return this.t;
    }

    public cq y() {
        if (this.u != null) {
            return this.u;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public dh z() {
        b(this.v);
        return this.v;
    }
}
