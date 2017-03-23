package com.google.android.gms.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class jg {
    private final List<gx> a;
    private final List<String> b;

    class AnonymousClass1 extends com.google.android.gms.b.jf.a {
        final /* synthetic */ a a;

        AnonymousClass1(a aVar) {
            this.a = aVar;
        }

        public void a(je jeVar, jr jrVar) {
            this.a.a(jeVar);
            jg.b(jrVar, this.a);
            this.a.e();
        }
    }

    static class a {
        private StringBuilder a = null;
        private Stack<je> b = new Stack();
        private int c = -1;
        private int d;
        private boolean e = true;
        private final List<gx> f = new ArrayList();
        private final List<String> g = new ArrayList();
        private final c h;

        public a(c cVar) {
            this.h = cVar;
        }

        private gx a(int i) {
            je[] jeVarArr = new je[i];
            for (int i2 = 0; i2 < i; i2++) {
                jeVarArr[i2] = (je) this.b.get(i2);
            }
            return new gx(jeVarArr);
        }

        private void a(je jeVar) {
            d();
            if (this.e) {
                this.a.append(",");
            }
            a(this.a, jeVar);
            this.a.append(":(");
            if (this.d == this.b.size()) {
                this.b.add(jeVar);
            } else {
                this.b.set(this.d, jeVar);
            }
            this.d++;
            this.e = false;
        }

        private void a(jo<?> joVar) {
            d();
            this.c = this.d;
            this.a.append(joVar.a(com.google.android.gms.b.jr.a.V2));
            this.e = true;
            if (this.h.a(this)) {
                g();
            }
        }

        private void a(StringBuilder stringBuilder, je jeVar) {
            stringBuilder.append(kt.c(jeVar.d()));
        }

        private void d() {
            if (!a()) {
                this.a = new StringBuilder();
                this.a.append("(");
                Iterator it = a(this.d).iterator();
                while (it.hasNext()) {
                    a(this.a, (je) it.next());
                    this.a.append(":(");
                }
                this.e = false;
            }
        }

        private void e() {
            this.d--;
            if (a()) {
                this.a.append(")");
            }
            this.e = true;
        }

        private void f() {
            kt.a(this.d == 0, "Can't finish hashing in the middle processing a child");
            if (a()) {
                g();
            }
            this.g.add("");
        }

        private void g() {
            kt.a(a(), "Can't end range without starting a range!");
            for (int i = 0; i < this.d; i++) {
                this.a.append(")");
            }
            this.a.append(")");
            gx a = a(this.c);
            this.g.add(kt.b(this.a.toString()));
            this.f.add(a);
            this.a = null;
        }

        public boolean a() {
            return this.a != null;
        }

        public int b() {
            return this.a.length();
        }

        public gx c() {
            return a(this.d);
        }
    }

    public interface c {
        boolean a(a aVar);
    }

    private static class b implements c {
        private final long a;

        public b(jr jrVar) {
            this.a = Math.max(512, (long) Math.sqrt((double) (kp.a(jrVar) * 100)));
        }

        public boolean a(a aVar) {
            return ((long) aVar.b()) > this.a && (aVar.c().h() || !aVar.c().g().equals(je.c()));
        }
    }

    private jg(List<gx> list, List<String> list2) {
        if (list.size() != list2.size() - 1) {
            throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
        }
        this.a = list;
        this.b = list2;
    }

    public static jg a(jr jrVar) {
        return a(jrVar, new b(jrVar));
    }

    public static jg a(jr jrVar, c cVar) {
        if (jrVar.b()) {
            return new jg(Collections.emptyList(), Collections.singletonList(""));
        }
        a aVar = new a(cVar);
        b(jrVar, aVar);
        aVar.f();
        return new jg(aVar.f, aVar.g);
    }

    private static void b(jr jrVar, a aVar) {
        if (jrVar.d()) {
            aVar.a((jo) jrVar);
        } else if (jrVar.b()) {
            throw new IllegalArgumentException("Can't calculate hash on empty node!");
        } else if (jrVar instanceof jf) {
            ((jf) jrVar).a(new AnonymousClass1(aVar), true);
        } else {
            String valueOf = String.valueOf(jrVar);
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 33).append("Expected children node, but got: ").append(valueOf).toString());
        }
    }

    public List<gx> a() {
        return Collections.unmodifiableList(this.a);
    }

    public List<String> b() {
        return Collections.unmodifiableList(this.b);
    }
}
