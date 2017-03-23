package com.google.android.gms.b;

public interface aw {

    public static final class a extends lh<a> {
        public Long A;
        public String B;
        public Long C;
        public Long D;
        public Long E;
        public b F;
        public Long G;
        public Long H;
        public Long I;
        public Long J;
        public Long K;
        public Long L;
        public String M;
        public String N;
        public Integer O;
        public Integer P;
        public Long Q;
        public Long R;
        public Long S;
        public Long T;
        public Long U;
        public Integer V;
        public a W;
        public a[] X;
        public b Y;
        public Long Z;
        public String a;
        public String aa;
        public Integer ab;
        public Boolean ac;
        public String ad;
        public Long ae;
        public e af;
        public String b;
        public Long c;
        public Long d;
        public Long e;
        public Long f;
        public Long g;
        public Long h;
        public Long i;
        public Long j;
        public Long k;
        public Long l;
        public String m;
        public Long n;
        public Long o;
        public Long p;
        public Long q;
        public Long r;
        public Long s;
        public Long t;
        public Long u;
        public Long v;
        public String w;
        public String x;
        public Long y;
        public Long z;

        public static final class a extends lh<a> {
            private static volatile a[] m;
            public Long a;
            public Long b;
            public Long c;
            public Long d;
            public Long e;
            public Long f;
            public Integer g;
            public Long h;
            public Long i;
            public Long j;
            public Integer k;
            public Long l;

            public a() {
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = null;
                this.g = null;
                this.h = null;
                this.i = null;
                this.j = null;
                this.k = null;
                this.l = null;
                this.ah = -1;
            }

            public static a[] a() {
                if (m == null) {
                    synchronized (ll.c) {
                        if (m == null) {
                            m = new a[0];
                        }
                    }
                }
                return m;
            }

            public a a(lf lfVar) {
                while (true) {
                    int a = lfVar.a();
                    switch (a) {
                        case 0:
                            break;
                        case 8:
                            this.a = Long.valueOf(lfVar.f());
                            continue;
                        case 16:
                            this.b = Long.valueOf(lfVar.f());
                            continue;
                        case 24:
                            this.c = Long.valueOf(lfVar.f());
                            continue;
                        case 32:
                            this.d = Long.valueOf(lfVar.f());
                            continue;
                        case 40:
                            this.e = Long.valueOf(lfVar.f());
                            continue;
                        case 48:
                            this.f = Long.valueOf(lfVar.f());
                            continue;
                        case 56:
                            a = lfVar.g();
                            switch (a) {
                                case 0:
                                case 1:
                                case 2:
                                case 1000:
                                    this.g = Integer.valueOf(a);
                                    break;
                                default:
                                    continue;
                            }
                        case 64:
                            this.h = Long.valueOf(lfVar.f());
                            continue;
                        case 72:
                            this.i = Long.valueOf(lfVar.f());
                            continue;
                        case 80:
                            this.j = Long.valueOf(lfVar.f());
                            continue;
                        case 88:
                            a = lfVar.g();
                            switch (a) {
                                case 0:
                                case 1:
                                case 2:
                                case 1000:
                                    this.k = Integer.valueOf(a);
                                    break;
                                default:
                                    continue;
                            }
                        case 96:
                            this.l = Long.valueOf(lfVar.f());
                            continue;
                        default:
                            if (!super.a(lfVar, a)) {
                                break;
                            }
                            continue;
                    }
                    return this;
                }
            }

            public void a(lg lgVar) {
                if (this.a != null) {
                    lgVar.b(1, this.a.longValue());
                }
                if (this.b != null) {
                    lgVar.b(2, this.b.longValue());
                }
                if (this.c != null) {
                    lgVar.b(3, this.c.longValue());
                }
                if (this.d != null) {
                    lgVar.b(4, this.d.longValue());
                }
                if (this.e != null) {
                    lgVar.b(5, this.e.longValue());
                }
                if (this.f != null) {
                    lgVar.b(6, this.f.longValue());
                }
                if (this.g != null) {
                    lgVar.a(7, this.g.intValue());
                }
                if (this.h != null) {
                    lgVar.b(8, this.h.longValue());
                }
                if (this.i != null) {
                    lgVar.b(9, this.i.longValue());
                }
                if (this.j != null) {
                    lgVar.b(10, this.j.longValue());
                }
                if (this.k != null) {
                    lgVar.a(11, this.k.intValue());
                }
                if (this.l != null) {
                    lgVar.b(12, this.l.longValue());
                }
                super.a(lgVar);
            }

            protected int b() {
                int b = super.b();
                if (this.a != null) {
                    b += lg.e(1, this.a.longValue());
                }
                if (this.b != null) {
                    b += lg.e(2, this.b.longValue());
                }
                if (this.c != null) {
                    b += lg.e(3, this.c.longValue());
                }
                if (this.d != null) {
                    b += lg.e(4, this.d.longValue());
                }
                if (this.e != null) {
                    b += lg.e(5, this.e.longValue());
                }
                if (this.f != null) {
                    b += lg.e(6, this.f.longValue());
                }
                if (this.g != null) {
                    b += lg.b(7, this.g.intValue());
                }
                if (this.h != null) {
                    b += lg.e(8, this.h.longValue());
                }
                if (this.i != null) {
                    b += lg.e(9, this.i.longValue());
                }
                if (this.j != null) {
                    b += lg.e(10, this.j.longValue());
                }
                if (this.k != null) {
                    b += lg.b(11, this.k.intValue());
                }
                return this.l != null ? b + lg.e(12, this.l.longValue()) : b;
            }

            public /* synthetic */ ln b(lf lfVar) {
                return a(lfVar);
            }
        }

        public static final class b extends lh<b> {
            public Long a;
            public Long b;
            public Long c;

            public b() {
                this.a = null;
                this.b = null;
                this.c = null;
                this.ah = -1;
            }

            public b a(lf lfVar) {
                while (true) {
                    int a = lfVar.a();
                    switch (a) {
                        case 0:
                            break;
                        case 8:
                            this.a = Long.valueOf(lfVar.f());
                            continue;
                        case 16:
                            this.b = Long.valueOf(lfVar.f());
                            continue;
                        case 24:
                            this.c = Long.valueOf(lfVar.f());
                            continue;
                        default:
                            if (!super.a(lfVar, a)) {
                                break;
                            }
                            continue;
                    }
                    return this;
                }
            }

            public void a(lg lgVar) {
                if (this.a != null) {
                    lgVar.b(1, this.a.longValue());
                }
                if (this.b != null) {
                    lgVar.b(2, this.b.longValue());
                }
                if (this.c != null) {
                    lgVar.b(3, this.c.longValue());
                }
                super.a(lgVar);
            }

            protected int b() {
                int b = super.b();
                if (this.a != null) {
                    b += lg.e(1, this.a.longValue());
                }
                if (this.b != null) {
                    b += lg.e(2, this.b.longValue());
                }
                return this.c != null ? b + lg.e(3, this.c.longValue()) : b;
            }

            public /* synthetic */ ln b(lf lfVar) {
                return a(lfVar);
            }
        }

        public a() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
            this.o = null;
            this.p = null;
            this.q = null;
            this.r = null;
            this.s = null;
            this.t = null;
            this.u = null;
            this.v = null;
            this.w = null;
            this.x = null;
            this.y = null;
            this.z = null;
            this.A = null;
            this.B = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.G = null;
            this.H = null;
            this.I = null;
            this.J = null;
            this.K = null;
            this.L = null;
            this.M = null;
            this.N = null;
            this.O = null;
            this.P = null;
            this.Q = null;
            this.R = null;
            this.S = null;
            this.T = null;
            this.U = null;
            this.V = null;
            this.X = a.a();
            this.Z = null;
            this.aa = null;
            this.ab = null;
            this.ac = null;
            this.ad = null;
            this.ae = null;
            this.ah = -1;
        }

        public static a a(byte[] bArr) {
            return (a) ln.a(new a(), bArr);
        }

        public a a(lf lfVar) {
            while (true) {
                int a = lfVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        this.a = lfVar.i();
                        continue;
                    case 18:
                        this.b = lfVar.i();
                        continue;
                    case 24:
                        this.c = Long.valueOf(lfVar.f());
                        continue;
                    case 32:
                        this.d = Long.valueOf(lfVar.f());
                        continue;
                    case 40:
                        this.e = Long.valueOf(lfVar.f());
                        continue;
                    case 48:
                        this.f = Long.valueOf(lfVar.f());
                        continue;
                    case 56:
                        this.g = Long.valueOf(lfVar.f());
                        continue;
                    case 64:
                        this.h = Long.valueOf(lfVar.f());
                        continue;
                    case 72:
                        this.i = Long.valueOf(lfVar.f());
                        continue;
                    case 80:
                        this.j = Long.valueOf(lfVar.f());
                        continue;
                    case 88:
                        this.k = Long.valueOf(lfVar.f());
                        continue;
                    case 96:
                        this.l = Long.valueOf(lfVar.f());
                        continue;
                    case 106:
                        this.m = lfVar.i();
                        continue;
                    case 112:
                        this.n = Long.valueOf(lfVar.f());
                        continue;
                    case 120:
                        this.o = Long.valueOf(lfVar.f());
                        continue;
                    case 128:
                        this.p = Long.valueOf(lfVar.f());
                        continue;
                    case 136:
                        this.q = Long.valueOf(lfVar.f());
                        continue;
                    case 144:
                        this.r = Long.valueOf(lfVar.f());
                        continue;
                    case 152:
                        this.s = Long.valueOf(lfVar.f());
                        continue;
                    case 160:
                        this.t = Long.valueOf(lfVar.f());
                        continue;
                    case 168:
                        this.Z = Long.valueOf(lfVar.f());
                        continue;
                    case 176:
                        this.u = Long.valueOf(lfVar.f());
                        continue;
                    case 184:
                        this.v = Long.valueOf(lfVar.f());
                        continue;
                    case 194:
                        this.aa = lfVar.i();
                        continue;
                    case 200:
                        this.ae = Long.valueOf(lfVar.f());
                        continue;
                    case 208:
                        a = lfVar.g();
                        switch (a) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                this.ab = Integer.valueOf(a);
                                break;
                            default:
                                continue;
                        }
                    case 218:
                        this.w = lfVar.i();
                        continue;
                    case 224:
                        this.ac = Boolean.valueOf(lfVar.h());
                        continue;
                    case 234:
                        this.x = lfVar.i();
                        continue;
                    case 242:
                        this.ad = lfVar.i();
                        continue;
                    case 248:
                        this.y = Long.valueOf(lfVar.f());
                        continue;
                    case 256:
                        this.z = Long.valueOf(lfVar.f());
                        continue;
                    case 264:
                        this.A = Long.valueOf(lfVar.f());
                        continue;
                    case 274:
                        this.B = lfVar.i();
                        continue;
                    case 280:
                        this.C = Long.valueOf(lfVar.f());
                        continue;
                    case 288:
                        this.D = Long.valueOf(lfVar.f());
                        continue;
                    case 296:
                        this.E = Long.valueOf(lfVar.f());
                        continue;
                    case 306:
                        if (this.F == null) {
                            this.F = new b();
                        }
                        lfVar.a(this.F);
                        continue;
                    case 312:
                        this.G = Long.valueOf(lfVar.f());
                        continue;
                    case 320:
                        this.H = Long.valueOf(lfVar.f());
                        continue;
                    case 328:
                        this.I = Long.valueOf(lfVar.f());
                        continue;
                    case 336:
                        this.J = Long.valueOf(lfVar.f());
                        continue;
                    case 346:
                        int b = lq.b(lfVar, 346);
                        a = this.X == null ? 0 : this.X.length;
                        Object obj = new a[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.X, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new a();
                            lfVar.a(obj[a]);
                            lfVar.a();
                            a++;
                        }
                        obj[a] = new a();
                        lfVar.a(obj[a]);
                        this.X = obj;
                        continue;
                    case 352:
                        this.K = Long.valueOf(lfVar.f());
                        continue;
                    case 360:
                        this.L = Long.valueOf(lfVar.f());
                        continue;
                    case 370:
                        this.M = lfVar.i();
                        continue;
                    case 378:
                        this.N = lfVar.i();
                        continue;
                    case 384:
                        a = lfVar.g();
                        switch (a) {
                            case 0:
                            case 1:
                            case 2:
                            case 1000:
                                this.O = Integer.valueOf(a);
                                break;
                            default:
                                continue;
                        }
                    case 392:
                        a = lfVar.g();
                        switch (a) {
                            case 0:
                            case 1:
                            case 2:
                            case 1000:
                                this.P = Integer.valueOf(a);
                                break;
                            default:
                                continue;
                        }
                    case 402:
                        if (this.W == null) {
                            this.W = new a();
                        }
                        lfVar.a(this.W);
                        continue;
                    case 408:
                        this.Q = Long.valueOf(lfVar.f());
                        continue;
                    case 416:
                        this.R = Long.valueOf(lfVar.f());
                        continue;
                    case 424:
                        this.S = Long.valueOf(lfVar.f());
                        continue;
                    case 432:
                        this.T = Long.valueOf(lfVar.f());
                        continue;
                    case 440:
                        this.U = Long.valueOf(lfVar.f());
                        continue;
                    case 448:
                        a = lfVar.g();
                        switch (a) {
                            case 0:
                            case 1:
                            case 2:
                            case 1000:
                                this.V = Integer.valueOf(a);
                                break;
                            default:
                                continue;
                        }
                    case 458:
                        if (this.Y == null) {
                            this.Y = new b();
                        }
                        lfVar.a(this.Y);
                        continue;
                    case 1610:
                        if (this.af == null) {
                            this.af = new e();
                        }
                        lfVar.a(this.af);
                        continue;
                    default:
                        if (!super.a(lfVar, a)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        public void a(lg lgVar) {
            if (this.a != null) {
                lgVar.a(1, this.a);
            }
            if (this.b != null) {
                lgVar.a(2, this.b);
            }
            if (this.c != null) {
                lgVar.b(3, this.c.longValue());
            }
            if (this.d != null) {
                lgVar.b(4, this.d.longValue());
            }
            if (this.e != null) {
                lgVar.b(5, this.e.longValue());
            }
            if (this.f != null) {
                lgVar.b(6, this.f.longValue());
            }
            if (this.g != null) {
                lgVar.b(7, this.g.longValue());
            }
            if (this.h != null) {
                lgVar.b(8, this.h.longValue());
            }
            if (this.i != null) {
                lgVar.b(9, this.i.longValue());
            }
            if (this.j != null) {
                lgVar.b(10, this.j.longValue());
            }
            if (this.k != null) {
                lgVar.b(11, this.k.longValue());
            }
            if (this.l != null) {
                lgVar.b(12, this.l.longValue());
            }
            if (this.m != null) {
                lgVar.a(13, this.m);
            }
            if (this.n != null) {
                lgVar.b(14, this.n.longValue());
            }
            if (this.o != null) {
                lgVar.b(15, this.o.longValue());
            }
            if (this.p != null) {
                lgVar.b(16, this.p.longValue());
            }
            if (this.q != null) {
                lgVar.b(17, this.q.longValue());
            }
            if (this.r != null) {
                lgVar.b(18, this.r.longValue());
            }
            if (this.s != null) {
                lgVar.b(19, this.s.longValue());
            }
            if (this.t != null) {
                lgVar.b(20, this.t.longValue());
            }
            if (this.Z != null) {
                lgVar.b(21, this.Z.longValue());
            }
            if (this.u != null) {
                lgVar.b(22, this.u.longValue());
            }
            if (this.v != null) {
                lgVar.b(23, this.v.longValue());
            }
            if (this.aa != null) {
                lgVar.a(24, this.aa);
            }
            if (this.ae != null) {
                lgVar.b(25, this.ae.longValue());
            }
            if (this.ab != null) {
                lgVar.a(26, this.ab.intValue());
            }
            if (this.w != null) {
                lgVar.a(27, this.w);
            }
            if (this.ac != null) {
                lgVar.a(28, this.ac.booleanValue());
            }
            if (this.x != null) {
                lgVar.a(29, this.x);
            }
            if (this.ad != null) {
                lgVar.a(30, this.ad);
            }
            if (this.y != null) {
                lgVar.b(31, this.y.longValue());
            }
            if (this.z != null) {
                lgVar.b(32, this.z.longValue());
            }
            if (this.A != null) {
                lgVar.b(33, this.A.longValue());
            }
            if (this.B != null) {
                lgVar.a(34, this.B);
            }
            if (this.C != null) {
                lgVar.b(35, this.C.longValue());
            }
            if (this.D != null) {
                lgVar.b(36, this.D.longValue());
            }
            if (this.E != null) {
                lgVar.b(37, this.E.longValue());
            }
            if (this.F != null) {
                lgVar.a(38, this.F);
            }
            if (this.G != null) {
                lgVar.b(39, this.G.longValue());
            }
            if (this.H != null) {
                lgVar.b(40, this.H.longValue());
            }
            if (this.I != null) {
                lgVar.b(41, this.I.longValue());
            }
            if (this.J != null) {
                lgVar.b(42, this.J.longValue());
            }
            if (this.X != null && this.X.length > 0) {
                for (ln lnVar : this.X) {
                    if (lnVar != null) {
                        lgVar.a(43, lnVar);
                    }
                }
            }
            if (this.K != null) {
                lgVar.b(44, this.K.longValue());
            }
            if (this.L != null) {
                lgVar.b(45, this.L.longValue());
            }
            if (this.M != null) {
                lgVar.a(46, this.M);
            }
            if (this.N != null) {
                lgVar.a(47, this.N);
            }
            if (this.O != null) {
                lgVar.a(48, this.O.intValue());
            }
            if (this.P != null) {
                lgVar.a(49, this.P.intValue());
            }
            if (this.W != null) {
                lgVar.a(50, this.W);
            }
            if (this.Q != null) {
                lgVar.b(51, this.Q.longValue());
            }
            if (this.R != null) {
                lgVar.b(52, this.R.longValue());
            }
            if (this.S != null) {
                lgVar.b(53, this.S.longValue());
            }
            if (this.T != null) {
                lgVar.b(54, this.T.longValue());
            }
            if (this.U != null) {
                lgVar.b(55, this.U.longValue());
            }
            if (this.V != null) {
                lgVar.a(56, this.V.intValue());
            }
            if (this.Y != null) {
                lgVar.a(57, this.Y);
            }
            if (this.af != null) {
                lgVar.a(201, this.af);
            }
            super.a(lgVar);
        }

        protected int b() {
            int b = super.b();
            if (this.a != null) {
                b += lg.b(1, this.a);
            }
            if (this.b != null) {
                b += lg.b(2, this.b);
            }
            if (this.c != null) {
                b += lg.e(3, this.c.longValue());
            }
            if (this.d != null) {
                b += lg.e(4, this.d.longValue());
            }
            if (this.e != null) {
                b += lg.e(5, this.e.longValue());
            }
            if (this.f != null) {
                b += lg.e(6, this.f.longValue());
            }
            if (this.g != null) {
                b += lg.e(7, this.g.longValue());
            }
            if (this.h != null) {
                b += lg.e(8, this.h.longValue());
            }
            if (this.i != null) {
                b += lg.e(9, this.i.longValue());
            }
            if (this.j != null) {
                b += lg.e(10, this.j.longValue());
            }
            if (this.k != null) {
                b += lg.e(11, this.k.longValue());
            }
            if (this.l != null) {
                b += lg.e(12, this.l.longValue());
            }
            if (this.m != null) {
                b += lg.b(13, this.m);
            }
            if (this.n != null) {
                b += lg.e(14, this.n.longValue());
            }
            if (this.o != null) {
                b += lg.e(15, this.o.longValue());
            }
            if (this.p != null) {
                b += lg.e(16, this.p.longValue());
            }
            if (this.q != null) {
                b += lg.e(17, this.q.longValue());
            }
            if (this.r != null) {
                b += lg.e(18, this.r.longValue());
            }
            if (this.s != null) {
                b += lg.e(19, this.s.longValue());
            }
            if (this.t != null) {
                b += lg.e(20, this.t.longValue());
            }
            if (this.Z != null) {
                b += lg.e(21, this.Z.longValue());
            }
            if (this.u != null) {
                b += lg.e(22, this.u.longValue());
            }
            if (this.v != null) {
                b += lg.e(23, this.v.longValue());
            }
            if (this.aa != null) {
                b += lg.b(24, this.aa);
            }
            if (this.ae != null) {
                b += lg.e(25, this.ae.longValue());
            }
            if (this.ab != null) {
                b += lg.b(26, this.ab.intValue());
            }
            if (this.w != null) {
                b += lg.b(27, this.w);
            }
            if (this.ac != null) {
                b += lg.b(28, this.ac.booleanValue());
            }
            if (this.x != null) {
                b += lg.b(29, this.x);
            }
            if (this.ad != null) {
                b += lg.b(30, this.ad);
            }
            if (this.y != null) {
                b += lg.e(31, this.y.longValue());
            }
            if (this.z != null) {
                b += lg.e(32, this.z.longValue());
            }
            if (this.A != null) {
                b += lg.e(33, this.A.longValue());
            }
            if (this.B != null) {
                b += lg.b(34, this.B);
            }
            if (this.C != null) {
                b += lg.e(35, this.C.longValue());
            }
            if (this.D != null) {
                b += lg.e(36, this.D.longValue());
            }
            if (this.E != null) {
                b += lg.e(37, this.E.longValue());
            }
            if (this.F != null) {
                b += lg.c(38, this.F);
            }
            if (this.G != null) {
                b += lg.e(39, this.G.longValue());
            }
            if (this.H != null) {
                b += lg.e(40, this.H.longValue());
            }
            if (this.I != null) {
                b += lg.e(41, this.I.longValue());
            }
            if (this.J != null) {
                b += lg.e(42, this.J.longValue());
            }
            if (this.X != null && this.X.length > 0) {
                int i = b;
                for (ln lnVar : this.X) {
                    if (lnVar != null) {
                        i += lg.c(43, lnVar);
                    }
                }
                b = i;
            }
            if (this.K != null) {
                b += lg.e(44, this.K.longValue());
            }
            if (this.L != null) {
                b += lg.e(45, this.L.longValue());
            }
            if (this.M != null) {
                b += lg.b(46, this.M);
            }
            if (this.N != null) {
                b += lg.b(47, this.N);
            }
            if (this.O != null) {
                b += lg.b(48, this.O.intValue());
            }
            if (this.P != null) {
                b += lg.b(49, this.P.intValue());
            }
            if (this.W != null) {
                b += lg.c(50, this.W);
            }
            if (this.Q != null) {
                b += lg.e(51, this.Q.longValue());
            }
            if (this.R != null) {
                b += lg.e(52, this.R.longValue());
            }
            if (this.S != null) {
                b += lg.e(53, this.S.longValue());
            }
            if (this.T != null) {
                b += lg.e(54, this.T.longValue());
            }
            if (this.U != null) {
                b += lg.e(55, this.U.longValue());
            }
            if (this.V != null) {
                b += lg.b(56, this.V.intValue());
            }
            if (this.Y != null) {
                b += lg.c(57, this.Y);
            }
            return this.af != null ? b + lg.c(201, this.af) : b;
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }
    }

    public static final class b extends lh<b> {
        public Long a;
        public Integer b;
        public Boolean c;
        public int[] d;
        public Long e;

        public b() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = lq.a;
            this.e = null;
            this.ah = -1;
        }

        public b a(lf lfVar) {
            while (true) {
                int a = lfVar.a();
                int b;
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.a = Long.valueOf(lfVar.f());
                        continue;
                    case 16:
                        this.b = Integer.valueOf(lfVar.g());
                        continue;
                    case 24:
                        this.c = Boolean.valueOf(lfVar.h());
                        continue;
                    case 32:
                        b = lq.b(lfVar, 32);
                        a = this.d == null ? 0 : this.d.length;
                        Object obj = new int[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.d, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = lfVar.g();
                            lfVar.a();
                            a++;
                        }
                        obj[a] = lfVar.g();
                        this.d = obj;
                        continue;
                    case 34:
                        int c = lfVar.c(lfVar.l());
                        b = lfVar.r();
                        a = 0;
                        while (lfVar.p() > 0) {
                            lfVar.g();
                            a++;
                        }
                        lfVar.e(b);
                        b = this.d == null ? 0 : this.d.length;
                        Object obj2 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.d, 0, obj2, 0, b);
                        }
                        while (b < obj2.length) {
                            obj2[b] = lfVar.g();
                            b++;
                        }
                        this.d = obj2;
                        lfVar.d(c);
                        continue;
                    case 40:
                        this.e = Long.valueOf(lfVar.e());
                        continue;
                    default:
                        if (!super.a(lfVar, a)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        public void a(lg lgVar) {
            if (this.a != null) {
                lgVar.b(1, this.a.longValue());
            }
            if (this.b != null) {
                lgVar.a(2, this.b.intValue());
            }
            if (this.c != null) {
                lgVar.a(3, this.c.booleanValue());
            }
            if (this.d != null && this.d.length > 0) {
                for (int a : this.d) {
                    lgVar.a(4, a);
                }
            }
            if (this.e != null) {
                lgVar.a(5, this.e.longValue());
            }
            super.a(lgVar);
        }

        protected int b() {
            int i = 0;
            int b = super.b();
            if (this.a != null) {
                b += lg.e(1, this.a.longValue());
            }
            if (this.b != null) {
                b += lg.b(2, this.b.intValue());
            }
            if (this.c != null) {
                b += lg.b(3, this.c.booleanValue());
            }
            if (this.d != null && this.d.length > 0) {
                int i2 = 0;
                while (i < this.d.length) {
                    i2 += lg.b(this.d[i]);
                    i++;
                }
                b = (b + i2) + (this.d.length * 1);
            }
            return this.e != null ? b + lg.d(5, this.e.longValue()) : b;
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }
    }

    public static final class c extends lh<c> {
        public byte[] a;
        public byte[] b;

        public c() {
            this.a = null;
            this.b = null;
            this.ah = -1;
        }

        public c a(lf lfVar) {
            while (true) {
                int a = lfVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        this.a = lfVar.j();
                        continue;
                    case 18:
                        this.b = lfVar.j();
                        continue;
                    default:
                        if (!super.a(lfVar, a)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        public void a(lg lgVar) {
            if (this.a != null) {
                lgVar.a(1, this.a);
            }
            if (this.b != null) {
                lgVar.a(2, this.b);
            }
            super.a(lgVar);
        }

        protected int b() {
            int b = super.b();
            if (this.a != null) {
                b += lg.b(1, this.a);
            }
            return this.b != null ? b + lg.b(2, this.b) : b;
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }
    }

    public static final class d extends lh<d> {
        public byte[] a;
        public byte[] b;
        public byte[] c;
        public byte[] d;

        public d() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.ah = -1;
        }

        public static d a(byte[] bArr) {
            return (d) ln.a(new d(), bArr);
        }

        public d a(lf lfVar) {
            while (true) {
                int a = lfVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        this.a = lfVar.j();
                        continue;
                    case 18:
                        this.b = lfVar.j();
                        continue;
                    case 26:
                        this.c = lfVar.j();
                        continue;
                    case 34:
                        this.d = lfVar.j();
                        continue;
                    default:
                        if (!super.a(lfVar, a)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        public void a(lg lgVar) {
            if (this.a != null) {
                lgVar.a(1, this.a);
            }
            if (this.b != null) {
                lgVar.a(2, this.b);
            }
            if (this.c != null) {
                lgVar.a(3, this.c);
            }
            if (this.d != null) {
                lgVar.a(4, this.d);
            }
            super.a(lgVar);
        }

        protected int b() {
            int b = super.b();
            if (this.a != null) {
                b += lg.b(1, this.a);
            }
            if (this.b != null) {
                b += lg.b(2, this.b);
            }
            if (this.c != null) {
                b += lg.b(3, this.c);
            }
            return this.d != null ? b + lg.b(4, this.d) : b;
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }
    }

    public static final class e extends lh<e> {
        public Long a;
        public String b;
        public byte[] c;

        public e() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.ah = -1;
        }

        public e a(lf lfVar) {
            while (true) {
                int a = lfVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.a = Long.valueOf(lfVar.f());
                        continue;
                    case 26:
                        this.b = lfVar.i();
                        continue;
                    case 34:
                        this.c = lfVar.j();
                        continue;
                    default:
                        if (!super.a(lfVar, a)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        public void a(lg lgVar) {
            if (this.a != null) {
                lgVar.b(1, this.a.longValue());
            }
            if (this.b != null) {
                lgVar.a(3, this.b);
            }
            if (this.c != null) {
                lgVar.a(4, this.c);
            }
            super.a(lgVar);
        }

        protected int b() {
            int b = super.b();
            if (this.a != null) {
                b += lg.e(1, this.a.longValue());
            }
            if (this.b != null) {
                b += lg.b(3, this.b);
            }
            return this.c != null ? b + lg.b(4, this.c) : b;
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }
    }

    public static final class f extends lh<f> {
        public byte[][] a;
        public byte[] b;
        public Integer c;
        public Integer d;

        public f() {
            this.a = lq.g;
            this.b = null;
            this.c = null;
            this.d = null;
            this.ah = -1;
        }

        public f a(lf lfVar) {
            while (true) {
                int a = lfVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        int b = lq.b(lfVar, 10);
                        a = this.a == null ? 0 : this.a.length;
                        Object obj = new byte[(b + a)][];
                        if (a != 0) {
                            System.arraycopy(this.a, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = lfVar.j();
                            lfVar.a();
                            a++;
                        }
                        obj[a] = lfVar.j();
                        this.a = obj;
                        continue;
                    case 18:
                        this.b = lfVar.j();
                        continue;
                    case 24:
                        a = lfVar.g();
                        switch (a) {
                            case 0:
                            case 1:
                                this.c = Integer.valueOf(a);
                                break;
                            default:
                                continue;
                        }
                    case 32:
                        a = lfVar.g();
                        switch (a) {
                            case 0:
                            case 1:
                                this.d = Integer.valueOf(a);
                                break;
                            default:
                                continue;
                        }
                    default:
                        if (!super.a(lfVar, a)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        public void a(lg lgVar) {
            if (this.a != null && this.a.length > 0) {
                for (byte[] bArr : this.a) {
                    if (bArr != null) {
                        lgVar.a(1, bArr);
                    }
                }
            }
            if (this.b != null) {
                lgVar.a(2, this.b);
            }
            if (this.c != null) {
                lgVar.a(3, this.c.intValue());
            }
            if (this.d != null) {
                lgVar.a(4, this.d.intValue());
            }
            super.a(lgVar);
        }

        protected int b() {
            int i = 0;
            int b = super.b();
            if (this.a == null || this.a.length <= 0) {
                i = b;
            } else {
                int i2 = 0;
                int i3 = 0;
                while (i < this.a.length) {
                    byte[] bArr = this.a[i];
                    if (bArr != null) {
                        i3++;
                        i2 += lg.c(bArr);
                    }
                    i++;
                }
                i = (b + i2) + (i3 * 1);
            }
            if (this.b != null) {
                i += lg.b(2, this.b);
            }
            if (this.c != null) {
                i += lg.b(3, this.c.intValue());
            }
            return this.d != null ? i + lg.b(4, this.d.intValue()) : i;
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }
    }
}
