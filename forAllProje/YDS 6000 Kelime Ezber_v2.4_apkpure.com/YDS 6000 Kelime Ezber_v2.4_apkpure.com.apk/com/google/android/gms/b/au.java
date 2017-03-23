package com.google.android.gms.b;

public interface au {

    public static final class a extends ln {
        public b a;
        public c b;

        public a() {
            a();
        }

        public static a a(byte[] bArr) {
            return (a) ln.a(new a(), bArr);
        }

        public a a() {
            this.a = null;
            this.b = null;
            this.ah = -1;
            return this;
        }

        public a a(lf lfVar) {
            while (true) {
                int a = lfVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        if (this.a == null) {
                            this.a = new b();
                        }
                        lfVar.a(this.a);
                        continue;
                    case 18:
                        if (this.b == null) {
                            this.b = new c();
                        }
                        lfVar.a(this.b);
                        continue;
                    default:
                        if (!lq.a(lfVar, a)) {
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
                b += lg.c(1, this.a);
            }
            return this.b != null ? b + lg.c(2, this.b) : b;
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }
    }

    public static final class b extends ln {
        public Integer a;

        public b() {
            a();
        }

        public b a() {
            this.ah = -1;
            return this;
        }

        public b a(lf lfVar) {
            while (true) {
                int a = lfVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 216:
                        a = lfVar.g();
                        switch (a) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                this.a = Integer.valueOf(a);
                                break;
                            default:
                                continue;
                        }
                    default:
                        if (!lq.a(lfVar, a)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        public void a(lg lgVar) {
            if (this.a != null) {
                lgVar.a(27, this.a.intValue());
            }
            super.a(lgVar);
        }

        protected int b() {
            int b = super.b();
            return this.a != null ? b + lg.b(27, this.a.intValue()) : b;
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }
    }

    public static final class c extends ln {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;

        public c() {
            a();
        }

        public c a() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.ah = -1;
            return this;
        }

        public c a(lf lfVar) {
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
                    case 26:
                        this.c = lfVar.i();
                        continue;
                    case 34:
                        this.d = lfVar.i();
                        continue;
                    case 42:
                        this.e = lfVar.i();
                        continue;
                    default:
                        if (!lq.a(lfVar, a)) {
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
            if (this.e != null) {
                lgVar.a(5, this.e);
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
            if (this.d != null) {
                b += lg.b(4, this.d);
            }
            return this.e != null ? b + lg.b(5, this.e) : b;
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }
    }
}
