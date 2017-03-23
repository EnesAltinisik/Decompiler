package com.google.android.gms.b;

public interface av {

    public static final class a extends lh<a> {
        public String a;
        public Long b;
        public String c;
        public String d;
        public String e;
        public Long f;
        public Long g;
        public String h;
        public Long i;
        public String j;

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
            this.ah = -1;
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
                    case 16:
                        this.b = Long.valueOf(lfVar.f());
                        continue;
                    case 26:
                        this.c = lfVar.i();
                        continue;
                    case 34:
                        this.d = lfVar.i();
                        continue;
                    case 42:
                        this.e = lfVar.i();
                        continue;
                    case 48:
                        this.f = Long.valueOf(lfVar.f());
                        continue;
                    case 56:
                        this.g = Long.valueOf(lfVar.f());
                        continue;
                    case 66:
                        this.h = lfVar.i();
                        continue;
                    case 72:
                        this.i = Long.valueOf(lfVar.f());
                        continue;
                    case 82:
                        this.j = lfVar.i();
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
                lgVar.b(2, this.b.longValue());
            }
            if (this.c != null) {
                lgVar.a(3, this.c);
            }
            if (this.d != null) {
                lgVar.a(4, this.d);
            }
            if (this.e != null) {
                lgVar.a(5, this.e);
            }
            if (this.f != null) {
                lgVar.b(6, this.f.longValue());
            }
            if (this.g != null) {
                lgVar.b(7, this.g.longValue());
            }
            if (this.h != null) {
                lgVar.a(8, this.h);
            }
            if (this.i != null) {
                lgVar.b(9, this.i.longValue());
            }
            if (this.j != null) {
                lgVar.a(10, this.j);
            }
            super.a(lgVar);
        }

        protected int b() {
            int b = super.b();
            if (this.a != null) {
                b += lg.b(1, this.a);
            }
            if (this.b != null) {
                b += lg.e(2, this.b.longValue());
            }
            if (this.c != null) {
                b += lg.b(3, this.c);
            }
            if (this.d != null) {
                b += lg.b(4, this.d);
            }
            if (this.e != null) {
                b += lg.b(5, this.e);
            }
            if (this.f != null) {
                b += lg.e(6, this.f.longValue());
            }
            if (this.g != null) {
                b += lg.e(7, this.g.longValue());
            }
            if (this.h != null) {
                b += lg.b(8, this.h);
            }
            if (this.i != null) {
                b += lg.e(9, this.i.longValue());
            }
            return this.j != null ? b + lg.b(10, this.j) : b;
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }
    }
}
