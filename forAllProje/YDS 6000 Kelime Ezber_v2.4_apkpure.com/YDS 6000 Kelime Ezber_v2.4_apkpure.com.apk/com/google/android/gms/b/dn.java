package com.google.android.gms.b;

public interface dn {

    public static final class a extends ln {
        private static volatile a[] d;
        public String a;
        public Boolean b;
        public Boolean c;

        public a() {
            c();
        }

        public static a[] a() {
            if (d == null) {
                synchronized (ll.c) {
                    if (d == null) {
                        d = new a[0];
                    }
                }
            }
            return d;
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
                        this.b = Boolean.valueOf(lfVar.h());
                        continue;
                    case 24:
                        this.c = Boolean.valueOf(lfVar.h());
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
                lgVar.a(2, this.b.booleanValue());
            }
            if (this.c != null) {
                lgVar.a(3, this.c.booleanValue());
            }
            super.a(lgVar);
        }

        protected int b() {
            int b = super.b();
            if (this.a != null) {
                b += lg.b(1, this.a);
            }
            if (this.b != null) {
                b += lg.b(2, this.b.booleanValue());
            }
            return this.c != null ? b + lg.b(3, this.c.booleanValue()) : b;
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }

        public a c() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == null) {
                if (aVar.a != null) {
                    return false;
                }
            } else if (!this.a.equals(aVar.a)) {
                return false;
            }
            if (this.b == null) {
                if (aVar.b != null) {
                    return false;
                }
            } else if (!this.b.equals(aVar.b)) {
                return false;
            }
            return this.c == null ? aVar.c == null : this.c.equals(aVar.c);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
            if (this.c != null) {
                i = this.c.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class b extends ln {
        public Long a;
        public String b;
        public Integer c;
        public c[] d;
        public a[] e;
        public com.google.android.gms.b.dm.a[] f;

        public b() {
            a();
        }

        public b a() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = c.a();
            this.e = a.a();
            this.f = com.google.android.gms.b.dm.a.a();
            this.ah = -1;
            return this;
        }

        public b a(lf lfVar) {
            while (true) {
                int a = lfVar.a();
                int b;
                Object obj;
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.a = Long.valueOf(lfVar.f());
                        continue;
                    case 18:
                        this.b = lfVar.i();
                        continue;
                    case 24:
                        this.c = Integer.valueOf(lfVar.g());
                        continue;
                    case 34:
                        b = lq.b(lfVar, 34);
                        a = this.d == null ? 0 : this.d.length;
                        obj = new c[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.d, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new c();
                            lfVar.a(obj[a]);
                            lfVar.a();
                            a++;
                        }
                        obj[a] = new c();
                        lfVar.a(obj[a]);
                        this.d = obj;
                        continue;
                    case 42:
                        b = lq.b(lfVar, 42);
                        a = this.e == null ? 0 : this.e.length;
                        obj = new a[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.e, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new a();
                            lfVar.a(obj[a]);
                            lfVar.a();
                            a++;
                        }
                        obj[a] = new a();
                        lfVar.a(obj[a]);
                        this.e = obj;
                        continue;
                    case 50:
                        b = lq.b(lfVar, 50);
                        a = this.f == null ? 0 : this.f.length;
                        obj = new com.google.android.gms.b.dm.a[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.f, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new com.google.android.gms.b.dm.a();
                            lfVar.a(obj[a]);
                            lfVar.a();
                            a++;
                        }
                        obj[a] = new com.google.android.gms.b.dm.a();
                        lfVar.a(obj[a]);
                        this.f = obj;
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
            int i = 0;
            if (this.a != null) {
                lgVar.b(1, this.a.longValue());
            }
            if (this.b != null) {
                lgVar.a(2, this.b);
            }
            if (this.c != null) {
                lgVar.a(3, this.c.intValue());
            }
            if (this.d != null && this.d.length > 0) {
                for (ln lnVar : this.d) {
                    if (lnVar != null) {
                        lgVar.a(4, lnVar);
                    }
                }
            }
            if (this.e != null && this.e.length > 0) {
                for (ln lnVar2 : this.e) {
                    if (lnVar2 != null) {
                        lgVar.a(5, lnVar2);
                    }
                }
            }
            if (this.f != null && this.f.length > 0) {
                while (i < this.f.length) {
                    ln lnVar3 = this.f[i];
                    if (lnVar3 != null) {
                        lgVar.a(6, lnVar3);
                    }
                    i++;
                }
            }
            super.a(lgVar);
        }

        protected int b() {
            int i;
            int i2 = 0;
            int b = super.b();
            if (this.a != null) {
                b += lg.e(1, this.a.longValue());
            }
            if (this.b != null) {
                b += lg.b(2, this.b);
            }
            if (this.c != null) {
                b += lg.b(3, this.c.intValue());
            }
            if (this.d != null && this.d.length > 0) {
                i = b;
                for (ln lnVar : this.d) {
                    if (lnVar != null) {
                        i += lg.c(4, lnVar);
                    }
                }
                b = i;
            }
            if (this.e != null && this.e.length > 0) {
                i = b;
                for (ln lnVar2 : this.e) {
                    if (lnVar2 != null) {
                        i += lg.c(5, lnVar2);
                    }
                }
                b = i;
            }
            if (this.f != null && this.f.length > 0) {
                while (i2 < this.f.length) {
                    ln lnVar3 = this.f[i2];
                    if (lnVar3 != null) {
                        b += lg.c(6, lnVar3);
                    }
                    i2++;
                }
            }
            return b;
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a == null) {
                if (bVar.a != null) {
                    return false;
                }
            } else if (!this.a.equals(bVar.a)) {
                return false;
            }
            if (this.b == null) {
                if (bVar.b != null) {
                    return false;
                }
            } else if (!this.b.equals(bVar.b)) {
                return false;
            }
            if (this.c == null) {
                if (bVar.c != null) {
                    return false;
                }
            } else if (!this.c.equals(bVar.c)) {
                return false;
            }
            return !ll.a(this.d, bVar.d) ? false : !ll.a(this.e, bVar.e) ? false : ll.a(this.f, bVar.f);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
            if (this.c != null) {
                i = this.c.hashCode();
            }
            return ((((((hashCode + i) * 31) + ll.a(this.d)) * 31) + ll.a(this.e)) * 31) + ll.a(this.f);
        }
    }

    public static final class c extends ln {
        private static volatile c[] c;
        public String a;
        public String b;

        public c() {
            c();
        }

        public static c[] a() {
            if (c == null) {
                synchronized (ll.c) {
                    if (c == null) {
                        c = new c[0];
                    }
                }
            }
            return c;
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
                b += lg.b(1, this.a);
            }
            return this.b != null ? b + lg.b(2, this.b) : b;
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }

        public c c() {
            this.a = null;
            this.b = null;
            this.ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.a == null) {
                if (cVar.a != null) {
                    return false;
                }
            } else if (!this.a.equals(cVar.a)) {
                return false;
            }
            return this.b == null ? cVar.b == null : this.b.equals(cVar.b);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31;
            if (this.b != null) {
                i = this.b.hashCode();
            }
            return hashCode + i;
        }
    }
}
