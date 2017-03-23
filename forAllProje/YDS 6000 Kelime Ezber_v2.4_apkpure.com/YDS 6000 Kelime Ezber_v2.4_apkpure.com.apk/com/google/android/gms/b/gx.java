package com.google.android.gms.b;

import com.google.firebase.database.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class gx implements Comparable<gx>, Iterable<je> {
    static final /* synthetic */ boolean a = (!gx.class.desiredAssertionStatus());
    private static final gx e = new gx("");
    private final je[] b;
    private final int c;
    private final int d;

    public gx(String str) {
        String[] split = str.split("/");
        int i = 0;
        for (String length : split) {
            if (length.length() > 0) {
                i++;
            }
        }
        this.b = new je[i];
        int length2 = split.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length2) {
            String str2 = split[i2];
            if (str2.length() > 0) {
                i = i3 + 1;
                this.b[i3] = je.a(str2);
            } else {
                i = i3;
            }
            i2++;
            i3 = i;
        }
        this.c = 0;
        this.d = this.b.length;
    }

    public gx(List<String> list) {
        this.b = new je[list.size()];
        int i = 0;
        for (String a : list) {
            int i2 = i + 1;
            this.b[i] = je.a(a);
            i = i2;
        }
        this.c = 0;
        this.d = list.size();
    }

    public gx(je... jeVarArr) {
        this.b = (je[]) Arrays.copyOf(jeVarArr, jeVarArr.length);
        this.c = 0;
        this.d = jeVarArr.length;
        int length = jeVarArr.length;
        int i = 0;
        while (i < length) {
            je jeVar = jeVarArr[i];
            if (a || jeVar != null) {
                i++;
            } else {
                throw new AssertionError("Can't construct a path with a null value!");
            }
        }
    }

    private gx(je[] jeVarArr, int i, int i2) {
        this.b = jeVarArr;
        this.c = i;
        this.d = i2;
    }

    public static gx a() {
        return e;
    }

    public static gx a(gx gxVar, gx gxVar2) {
        je d = gxVar.d();
        je d2 = gxVar2.d();
        if (d == null) {
            return gxVar2;
        }
        if (d.equals(d2)) {
            return a(gxVar.e(), gxVar2.e());
        }
        String valueOf = String.valueOf(gxVar2);
        String valueOf2 = String.valueOf(gxVar);
        throw new c(new StringBuilder((String.valueOf(valueOf).length() + 37) + String.valueOf(valueOf2).length()).append("INTERNAL ERROR: ").append(valueOf).append(" is not contained in ").append(valueOf2).toString());
    }

    public gx a(gx gxVar) {
        int i = i() + gxVar.i();
        Object obj = new je[i];
        System.arraycopy(this.b, this.c, obj, 0, i());
        System.arraycopy(gxVar.b, gxVar.c, obj, i(), gxVar.i());
        return new gx(obj, 0, i);
    }

    public gx a(je jeVar) {
        int i = i();
        Object obj = new je[(i + 1)];
        System.arraycopy(this.b, this.c, obj, 0, i);
        obj[i] = jeVar;
        return new gx(obj, 0, i + 1);
    }

    public String b() {
        if (h()) {
            return "/";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = this.c; i < this.d; i++) {
            if (i > this.c) {
                stringBuilder.append("/");
            }
            stringBuilder.append(this.b[i].d());
        }
        return stringBuilder.toString();
    }

    public boolean b(gx gxVar) {
        if (i() > gxVar.i()) {
            return false;
        }
        int i = this.c;
        int i2 = gxVar.c;
        while (i < this.d) {
            if (!this.b[i].equals(gxVar.b[i2])) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public int c(gx gxVar) {
        int i = this.c;
        int i2 = gxVar.c;
        while (i < this.d && i2 < gxVar.d) {
            int a = this.b[i].a(gxVar.b[i2]);
            if (a != 0) {
                return a;
            }
            i++;
            i2++;
        }
        return (i == this.d && i2 == gxVar.d) ? 0 : i == this.d ? -1 : 1;
    }

    public List<String> c() {
        List<String> arrayList = new ArrayList(i());
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(((je) it.next()).d());
        }
        return arrayList;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return c((gx) obj);
    }

    public je d() {
        return h() ? null : this.b[this.c];
    }

    public gx e() {
        int i = this.c;
        if (!h()) {
            i++;
        }
        return new gx(this.b, i, this.d);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof gx)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        gx gxVar = (gx) obj;
        if (i() != gxVar.i()) {
            return false;
        }
        int i = this.c;
        int i2 = gxVar.c;
        while (i < this.d && i2 < gxVar.d) {
            if (!this.b[i].equals(gxVar.b[i2])) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public gx f() {
        return h() ? null : new gx(this.b, this.c, this.d - 1);
    }

    public je g() {
        return !h() ? this.b[this.d - 1] : null;
    }

    public boolean h() {
        return this.c >= this.d;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = this.c; i2 < this.d; i2++) {
            i = (i * 37) + this.b[i2].hashCode();
        }
        return i;
    }

    public int i() {
        return this.d - this.c;
    }

    public Iterator<je> iterator() {
        return new Iterator<je>(this) {
            int a = this.b.c;
            final /* synthetic */ gx b;

            {
                this.b = r2;
            }

            public je a() {
                if (hasNext()) {
                    je jeVar = this.b.b[this.a];
                    this.a++;
                    return jeVar;
                }
                throw new NoSuchElementException("No more elements.");
            }

            public boolean hasNext() {
                return this.a < this.b.d;
            }

            public /* synthetic */ Object next() {
                return a();
            }

            public void remove() {
                throw new UnsupportedOperationException("Can't remove component from immutable Path!");
            }
        };
    }

    public String toString() {
        if (h()) {
            return "/";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = this.c; i < this.d; i++) {
            stringBuilder.append("/");
            stringBuilder.append(this.b[i].d());
        }
        return stringBuilder.toString();
    }
}
