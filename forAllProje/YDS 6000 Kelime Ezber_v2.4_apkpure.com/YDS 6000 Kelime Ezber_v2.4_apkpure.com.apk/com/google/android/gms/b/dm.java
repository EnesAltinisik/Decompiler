package com.google.android.gms.b;

public interface dm {

    public static final class a extends ln {
        private static volatile a[] d;
        public Integer a;
        public e[] b;
        public b[] c;

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
                int b;
                Object obj;
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.a = Integer.valueOf(lfVar.g());
                        continue;
                    case 18:
                        b = lq.b(lfVar, 18);
                        a = this.b == null ? 0 : this.b.length;
                        obj = new e[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.b, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new e();
                            lfVar.a(obj[a]);
                            lfVar.a();
                            a++;
                        }
                        obj[a] = new e();
                        lfVar.a(obj[a]);
                        this.b = obj;
                        continue;
                    case 26:
                        b = lq.b(lfVar, 26);
                        a = this.c == null ? 0 : this.c.length;
                        obj = new b[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.c, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new b();
                            lfVar.a(obj[a]);
                            lfVar.a();
                            a++;
                        }
                        obj[a] = new b();
                        lfVar.a(obj[a]);
                        this.c = obj;
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
                lgVar.a(1, this.a.intValue());
            }
            if (this.b != null && this.b.length > 0) {
                for (ln lnVar : this.b) {
                    if (lnVar != null) {
                        lgVar.a(2, lnVar);
                    }
                }
            }
            if (this.c != null && this.c.length > 0) {
                while (i < this.c.length) {
                    ln lnVar2 = this.c[i];
                    if (lnVar2 != null) {
                        lgVar.a(3, lnVar2);
                    }
                    i++;
                }
            }
            super.a(lgVar);
        }

        protected int b() {
            int i = 0;
            int b = super.b();
            if (this.a != null) {
                b += lg.b(1, this.a.intValue());
            }
            if (this.b != null && this.b.length > 0) {
                int i2 = b;
                for (ln lnVar : this.b) {
                    if (lnVar != null) {
                        i2 += lg.c(2, lnVar);
                    }
                }
                b = i2;
            }
            if (this.c != null && this.c.length > 0) {
                while (i < this.c.length) {
                    ln lnVar2 = this.c[i];
                    if (lnVar2 != null) {
                        b += lg.c(3, lnVar2);
                    }
                    i++;
                }
            }
            return b;
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }

        public a c() {
            this.a = null;
            this.b = e.a();
            this.c = b.a();
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
            return !ll.a(this.b, aVar.b) ? false : ll.a(this.c, aVar.c);
        }

        public int hashCode() {
            return (((((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + ll.a(this.b)) * 31) + ll.a(this.c);
        }
    }

    public static final class b extends ln {
        private static volatile b[] f;
        public Integer a;
        public String b;
        public c[] c;
        public Boolean d;
        public d e;

        public b() {
            c();
        }

        public static b[] a() {
            if (f == null) {
                synchronized (ll.c) {
                    if (f == null) {
                        f = new b[0];
                    }
                }
            }
            return f;
        }

        public b a(lf lfVar) {
            while (true) {
                int a = lfVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.a = Integer.valueOf(lfVar.g());
                        continue;
                    case 18:
                        this.b = lfVar.i();
                        continue;
                    case 26:
                        int b = lq.b(lfVar, 26);
                        a = this.c == null ? 0 : this.c.length;
                        Object obj = new c[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.c, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new c();
                            lfVar.a(obj[a]);
                            lfVar.a();
                            a++;
                        }
                        obj[a] = new c();
                        lfVar.a(obj[a]);
                        this.c = obj;
                        continue;
                    case 32:
                        this.d = Boolean.valueOf(lfVar.h());
                        continue;
                    case 42:
                        if (this.e == null) {
                            this.e = new d();
                        }
                        lfVar.a(this.e);
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
                lgVar.a(1, this.a.intValue());
            }
            if (this.b != null) {
                lgVar.a(2, this.b);
            }
            if (this.c != null && this.c.length > 0) {
                for (ln lnVar : this.c) {
                    if (lnVar != null) {
                        lgVar.a(3, lnVar);
                    }
                }
            }
            if (this.d != null) {
                lgVar.a(4, this.d.booleanValue());
            }
            if (this.e != null) {
                lgVar.a(5, this.e);
            }
            super.a(lgVar);
        }

        protected int b() {
            int b = super.b();
            if (this.a != null) {
                b += lg.b(1, this.a.intValue());
            }
            if (this.b != null) {
                b += lg.b(2, this.b);
            }
            if (this.c != null && this.c.length > 0) {
                int i = b;
                for (ln lnVar : this.c) {
                    if (lnVar != null) {
                        i += lg.c(3, lnVar);
                    }
                }
                b = i;
            }
            if (this.d != null) {
                b += lg.b(4, this.d.booleanValue());
            }
            return this.e != null ? b + lg.c(5, this.e) : b;
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }

        public b c() {
            this.a = null;
            this.b = null;
            this.c = c.a();
            this.d = null;
            this.e = null;
            this.ah = -1;
            return this;
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
            if (!ll.a(this.c, bVar.c)) {
                return false;
            }
            if (this.d == null) {
                if (bVar.d != null) {
                    return false;
                }
            } else if (!this.d.equals(bVar.d)) {
                return false;
            }
            return this.e == null ? bVar.e == null : this.e.equals(bVar.e);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.d == null ? 0 : this.d.hashCode()) + (((((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31) + ll.a(this.c)) * 31)) * 31;
            if (this.e != null) {
                i = this.e.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class c extends ln {
        private static volatile c[] e;
        public f a;
        public d b;
        public Boolean c;
        public String d;

        public c() {
            c();
        }

        public static c[] a() {
            if (e == null) {
                synchronized (ll.c) {
                    if (e == null) {
                        e = new c[0];
                    }
                }
            }
            return e;
        }

        public c a(lf lfVar) {
            while (true) {
                int a = lfVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        if (this.a == null) {
                            this.a = new f();
                        }
                        lfVar.a(this.a);
                        continue;
                    case 18:
                        if (this.b == null) {
                            this.b = new d();
                        }
                        lfVar.a(this.b);
                        continue;
                    case 24:
                        this.c = Boolean.valueOf(lfVar.h());
                        continue;
                    case 34:
                        this.d = lfVar.i();
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
                lgVar.a(3, this.c.booleanValue());
            }
            if (this.d != null) {
                lgVar.a(4, this.d);
            }
            super.a(lgVar);
        }

        protected int b() {
            int b = super.b();
            if (this.a != null) {
                b += lg.c(1, this.a);
            }
            if (this.b != null) {
                b += lg.c(2, this.b);
            }
            if (this.c != null) {
                b += lg.b(3, this.c.booleanValue());
            }
            return this.d != null ? b + lg.b(4, this.d) : b;
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }

        public c c() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
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
            if (this.b == null) {
                if (cVar.b != null) {
                    return false;
                }
            } else if (!this.b.equals(cVar.b)) {
                return false;
            }
            if (this.c == null) {
                if (cVar.c != null) {
                    return false;
                }
            } else if (!this.c.equals(cVar.c)) {
                return false;
            }
            return this.d == null ? cVar.d == null : this.d.equals(cVar.d);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.c == null ? 0 : this.c.hashCode()) + (((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31;
            if (this.d != null) {
                i = this.d.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class d extends ln {
        public Integer a;
        public Boolean b;
        public String c;
        public String d;
        public String e;

        public d() {
            a();
        }

        public d a() {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.ah = -1;
            return this;
        }

        public d a(lf lfVar) {
            while (true) {
                int a = lfVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 8:
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
                    case 16:
                        this.b = Boolean.valueOf(lfVar.h());
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
                lgVar.a(1, this.a.intValue());
            }
            if (this.b != null) {
                lgVar.a(2, this.b.booleanValue());
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
                b += lg.b(1, this.a.intValue());
            }
            if (this.b != null) {
                b += lg.b(2, this.b.booleanValue());
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

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.a == null) {
                if (dVar.a != null) {
                    return false;
                }
            } else if (!this.a.equals(dVar.a)) {
                return false;
            }
            if (this.b == null) {
                if (dVar.b != null) {
                    return false;
                }
            } else if (!this.b.equals(dVar.b)) {
                return false;
            }
            if (this.c == null) {
                if (dVar.c != null) {
                    return false;
                }
            } else if (!this.c.equals(dVar.c)) {
                return false;
            }
            if (this.d == null) {
                if (dVar.d != null) {
                    return false;
                }
            } else if (!this.d.equals(dVar.d)) {
                return false;
            }
            return this.e == null ? dVar.e == null : this.e.equals(dVar.e);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.d == null ? 0 : this.d.hashCode()) + (((this.c == null ? 0 : this.c.hashCode()) + (((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.intValue()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31;
            if (this.e != null) {
                i = this.e.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class e extends ln {
        private static volatile e[] d;
        public Integer a;
        public String b;
        public c c;

        public e() {
            c();
        }

        public static e[] a() {
            if (d == null) {
                synchronized (ll.c) {
                    if (d == null) {
                        d = new e[0];
                    }
                }
            }
            return d;
        }

        public e a(lf lfVar) {
            while (true) {
                int a = lfVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.a = Integer.valueOf(lfVar.g());
                        continue;
                    case 18:
                        this.b = lfVar.i();
                        continue;
                    case 26:
                        if (this.c == null) {
                            this.c = new c();
                        }
                        lfVar.a(this.c);
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
                lgVar.a(1, this.a.intValue());
            }
            if (this.b != null) {
                lgVar.a(2, this.b);
            }
            if (this.c != null) {
                lgVar.a(3, this.c);
            }
            super.a(lgVar);
        }

        protected int b() {
            int b = super.b();
            if (this.a != null) {
                b += lg.b(1, this.a.intValue());
            }
            if (this.b != null) {
                b += lg.b(2, this.b);
            }
            return this.c != null ? b + lg.c(3, this.c) : b;
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }

        public e c() {
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
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.a == null) {
                if (eVar.a != null) {
                    return false;
                }
            } else if (!this.a.equals(eVar.a)) {
                return false;
            }
            if (this.b == null) {
                if (eVar.b != null) {
                    return false;
                }
            } else if (!this.b.equals(eVar.b)) {
                return false;
            }
            return this.c == null ? eVar.c == null : this.c.equals(eVar.c);
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

    public static final class f extends ln {
        public Integer a;
        public String b;
        public Boolean c;
        public String[] d;

        public f() {
            a();
        }

        public f a() {
            this.b = null;
            this.c = null;
            this.d = lq.f;
            this.ah = -1;
            return this;
        }

        public f a(lf lfVar) {
            while (true) {
                int a = lfVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        a = lfVar.g();
                        switch (a) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                this.a = Integer.valueOf(a);
                                break;
                            default:
                                continue;
                        }
                    case 18:
                        this.b = lfVar.i();
                        continue;
                    case 24:
                        this.c = Boolean.valueOf(lfVar.h());
                        continue;
                    case 34:
                        int b = lq.b(lfVar, 34);
                        a = this.d == null ? 0 : this.d.length;
                        Object obj = new String[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.d, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = lfVar.i();
                            lfVar.a();
                            a++;
                        }
                        obj[a] = lfVar.i();
                        this.d = obj;
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
                lgVar.a(1, this.a.intValue());
            }
            if (this.b != null) {
                lgVar.a(2, this.b);
            }
            if (this.c != null) {
                lgVar.a(3, this.c.booleanValue());
            }
            if (this.d != null && this.d.length > 0) {
                for (String str : this.d) {
                    if (str != null) {
                        lgVar.a(4, str);
                    }
                }
            }
            super.a(lgVar);
        }

        protected int b() {
            int i = 0;
            int b = super.b();
            if (this.a != null) {
                b += lg.b(1, this.a.intValue());
            }
            if (this.b != null) {
                b += lg.b(2, this.b);
            }
            if (this.c != null) {
                b += lg.b(3, this.c.booleanValue());
            }
            if (this.d == null || this.d.length <= 0) {
                return b;
            }
            int i2 = 0;
            int i3 = 0;
            while (i < this.d.length) {
                String str = this.d[i];
                if (str != null) {
                    i3++;
                    i2 += lg.b(str);
                }
                i++;
            }
            return (b + i2) + (i3 * 1);
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (this.a == null) {
                if (fVar.a != null) {
                    return false;
                }
            } else if (!this.a.equals(fVar.a)) {
                return false;
            }
            if (this.b == null) {
                if (fVar.b != null) {
                    return false;
                }
            } else if (!this.b.equals(fVar.b)) {
                return false;
            }
            if (this.c == null) {
                if (fVar.c != null) {
                    return false;
                }
            } else if (!this.c.equals(fVar.c)) {
                return false;
            }
            return ll.a(this.d, fVar.d);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.intValue()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
            if (this.c != null) {
                i = this.c.hashCode();
            }
            return ((hashCode + i) * 31) + ll.a(this.d);
        }
    }
}
