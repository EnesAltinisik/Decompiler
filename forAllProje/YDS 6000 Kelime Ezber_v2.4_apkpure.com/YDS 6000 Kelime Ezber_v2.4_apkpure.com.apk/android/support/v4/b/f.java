package android.support.v4.b;

import android.os.Build.VERSION;
import android.support.v4.i.e;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

final class f extends x implements c {
    static final boolean a = (VERSION.SDK_INT >= 21);
    final r b;
    ArrayList<a> c = new ArrayList();
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    boolean j;
    boolean k = true;
    String l;
    boolean m;
    int n = -1;
    int o;
    CharSequence p;
    int q;
    CharSequence r;
    ArrayList<String> s;
    ArrayList<String> t;
    boolean u = false;

    static final class a {
        int a;
        l b;
        int c;
        int d;
        int e;
        int f;

        a() {
        }
    }

    public f(r rVar) {
        this.b = rVar;
    }

    private void a(int i, l lVar, String str, int i2) {
        Class cls = lVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from" + " instance state.");
        }
        lVar.z = this.b;
        if (str != null) {
            if (lVar.G == null || str.equals(lVar.G)) {
                lVar.G = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + lVar + ": was " + lVar.G + " now " + str);
            }
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + lVar + " with tag " + str + " to container view with no id");
            } else if (lVar.E == 0 || lVar.E == i) {
                lVar.E = i;
                lVar.F = i;
            } else {
                throw new IllegalStateException("Can't change container ID of fragment " + lVar + ": was " + lVar.E + " now " + i);
            }
        }
        a aVar = new a();
        aVar.a = i2;
        aVar.b = lVar;
        a(aVar);
    }

    private static boolean b(a aVar) {
        l lVar = aVar.b;
        return (!lVar.t || lVar.P == null || lVar.I || lVar.H || !lVar.V()) ? false : true;
    }

    int a(boolean z) {
        if (this.m) {
            throw new IllegalStateException("commit already called");
        }
        if (r.a) {
            Log.v("FragmentManager", "Commit: " + this);
            a("  ", null, new PrintWriter(new e("FragmentManager")), null);
        }
        this.m = true;
        if (this.j) {
            this.n = this.b.a(this);
        } else {
            this.n = -1;
        }
        this.b.a((c) this, z);
        return this.n;
    }

    public x a() {
        if (this.j) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.k = false;
        return this;
    }

    public x a(int i, l lVar) {
        a(i, lVar, null, 1);
        return this;
    }

    public x a(int i, l lVar, String str) {
        a(i, lVar, str, 1);
        return this;
    }

    public x a(l lVar) {
        a aVar = new a();
        aVar.a = 3;
        aVar.b = lVar;
        a(aVar);
        return this;
    }

    public x a(l lVar, String str) {
        a(0, lVar, str, 1);
        return this;
    }

    void a(int i) {
        if (this.j) {
            if (r.a) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = (a) this.c.get(i2);
                if (aVar.b != null) {
                    l lVar = aVar.b;
                    lVar.y += i;
                    if (r.a) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.b + " to " + aVar.b.y);
                    }
                }
            }
        }
    }

    void a(a aVar) {
        this.c.add(aVar);
        aVar.c = this.d;
        aVar.d = this.e;
        aVar.e = this.f;
        aVar.f = this.g;
    }

    void a(c cVar) {
        for (int i = 0; i < this.c.size(); i++) {
            a aVar = (a) this.c.get(i);
            if (b(aVar)) {
                aVar.b.a(cVar);
            }
        }
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        a(str, printWriter, true);
    }

    public void a(String str, PrintWriter printWriter, boolean z) {
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.l);
            printWriter.print(" mIndex=");
            printWriter.print(this.n);
            printWriter.print(" mCommitted=");
            printWriter.println(this.m);
            if (this.h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.h));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.i));
            }
            if (!(this.d == 0 && this.e == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (!(this.f == 0 && this.g == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (!(this.o == 0 && this.p == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.o));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.p);
            }
            if (!(this.q == 0 && this.r == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.q));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.r);
            }
        }
        if (!this.c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            str + "    ";
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                String str2;
                a aVar = (a) this.c.get(i);
                switch (aVar.a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    default:
                        str2 = "cmd=" + aVar.a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.b);
                if (z) {
                    if (!(aVar.c == 0 && aVar.d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.d));
                    }
                    if (aVar.e != 0 || aVar.f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f));
                    }
                }
            }
        }
    }

    void a(ArrayList<l> arrayList) {
        int i = 0;
        while (i < this.c.size()) {
            a aVar = (a) this.c.get(i);
            switch (aVar.a) {
                case 1:
                case 7:
                    arrayList.add(aVar.b);
                    break;
                case 2:
                    l lVar = aVar.b;
                    int i2 = lVar.F;
                    int size = arrayList.size() - 1;
                    int i3 = i;
                    int i4 = 0;
                    while (size >= 0) {
                        l lVar2 = (l) arrayList.get(size);
                        if (lVar2.F != i2) {
                            i = i4;
                            i4 = i3;
                        } else if (lVar2 == lVar) {
                            i = 1;
                            i4 = i3;
                        } else {
                            a aVar2 = new a();
                            aVar2.a = 3;
                            aVar2.b = lVar2;
                            aVar2.c = aVar.c;
                            aVar2.e = aVar.e;
                            aVar2.d = aVar.d;
                            aVar2.f = aVar.f;
                            this.c.add(i3, aVar2);
                            arrayList.remove(lVar2);
                            int i5 = i4;
                            i4 = i3 + 1;
                            i = i5;
                        }
                        size--;
                        i3 = i4;
                        i4 = i;
                    }
                    if (i4 == 0) {
                        aVar.a = 1;
                        arrayList.add(lVar);
                        i = i3;
                        break;
                    }
                    this.c.remove(i3);
                    i = i3 - 1;
                    break;
                case 3:
                case 6:
                    arrayList.remove(aVar.b);
                    break;
                default:
                    break;
            }
            i++;
        }
    }

    boolean a(ArrayList<f> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.c.size();
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            int i5;
            int i6 = ((a) this.c.get(i4)).b.F;
            if (i6 == 0 || i6 == i3) {
                i5 = i3;
            } else {
                for (int i7 = i; i7 < i2; i7++) {
                    f fVar = (f) arrayList.get(i7);
                    int size2 = fVar.c.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        if (((a) fVar.c.get(i8)).b.F == i6) {
                            return true;
                        }
                    }
                }
                i5 = i6;
            }
            i4++;
            i3 = i5;
        }
        return false;
    }

    public boolean a(ArrayList<f> arrayList, ArrayList<Boolean> arrayList2) {
        if (r.a) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.valueOf(false));
        if (this.j) {
            this.b.b(this);
        }
        return true;
    }

    public int b() {
        return a(false);
    }

    public x b(l lVar) {
        a aVar = new a();
        aVar.a = 6;
        aVar.b = lVar;
        a(aVar);
        return this;
    }

    void b(ArrayList<l> arrayList) {
        for (int i = 0; i < this.c.size(); i++) {
            a aVar = (a) this.c.get(i);
            switch (aVar.a) {
                case 1:
                case 7:
                    arrayList.remove(aVar.b);
                    break;
                case 3:
                case 6:
                    arrayList.add(aVar.b);
                    break;
                default:
                    break;
            }
        }
    }

    boolean b(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((a) this.c.get(i2)).b.F == i) {
                return true;
            }
        }
        return false;
    }

    public int c() {
        return a(true);
    }

    public x c(l lVar) {
        a aVar = new a();
        aVar.a = 7;
        aVar.b = lVar;
        a(aVar);
        return this;
    }

    public void d() {
        a();
        this.b.b((c) this, true);
    }

    void e() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) this.c.get(i);
            l lVar = aVar.b;
            lVar.a(this.h, this.i);
            switch (aVar.a) {
                case 1:
                    lVar.b(aVar.c);
                    this.b.a(lVar, false);
                    break;
                case 3:
                    lVar.b(aVar.d);
                    this.b.h(lVar);
                    break;
                case 4:
                    lVar.b(aVar.d);
                    this.b.i(lVar);
                    break;
                case 5:
                    lVar.b(aVar.c);
                    this.b.j(lVar);
                    break;
                case 6:
                    lVar.b(aVar.d);
                    this.b.k(lVar);
                    break;
                case 7:
                    lVar.b(aVar.c);
                    this.b.l(lVar);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
            }
            if (!(this.u || aVar.a == 1)) {
                this.b.e(lVar);
            }
        }
        if (!this.u) {
            this.b.a(this.b.m, true);
        }
    }

    void f() {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            a aVar = (a) this.c.get(size);
            l lVar = aVar.b;
            lVar.a(r.d(this.h), this.i);
            switch (aVar.a) {
                case 1:
                    lVar.b(aVar.f);
                    this.b.h(lVar);
                    break;
                case 3:
                    lVar.b(aVar.e);
                    this.b.a(lVar, false);
                    break;
                case 4:
                    lVar.b(aVar.e);
                    this.b.j(lVar);
                    break;
                case 5:
                    lVar.b(aVar.f);
                    this.b.i(lVar);
                    break;
                case 6:
                    lVar.b(aVar.e);
                    this.b.l(lVar);
                    break;
                case 7:
                    lVar.b(aVar.f);
                    this.b.k(lVar);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
            }
            if (!(this.u || aVar.a == 3)) {
                this.b.e(lVar);
            }
        }
        if (!this.u) {
            this.b.a(this.b.m, true);
        }
    }

    boolean g() {
        for (int i = 0; i < this.c.size(); i++) {
            if (b((a) this.c.get(i))) {
                return true;
            }
        }
        return false;
    }

    public String h() {
        return this.l;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("BackStackEntry{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.n >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.n);
        }
        if (this.l != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.l);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
