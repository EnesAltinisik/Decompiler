package com.google.android.gms.b;

import com.google.android.gms.ads.internal.v;
import java.util.ArrayList;
import java.util.Iterator;

@vz
public class mr {
    private final int a;
    private final int b;
    private final int c;
    private final my d;
    private final nd e;
    private final Object f = new Object();
    private ArrayList<String> g = new ArrayList();
    private ArrayList<String> h = new ArrayList();
    private ArrayList<mw> i = new ArrayList();
    private int j = 0;
    private int k = 0;
    private int l = 0;
    private int m;
    private String n = "";
    private String o = "";
    private String p = "";

    public mr(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = new my(i4);
        this.e = new nd(i5, i6, i7);
    }

    private String a(ArrayList<String> arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer.append((String) it.next());
            stringBuffer.append(' ');
            if (stringBuffer.length() > i) {
                break;
            }
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        String stringBuffer2 = stringBuffer.toString();
        return stringBuffer2.length() >= i ? stringBuffer2.substring(0, i) : stringBuffer2;
    }

    private void c(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null && str.length() >= this.c) {
            synchronized (this.f) {
                this.g.add(str);
                this.j += str.length();
                if (z) {
                    this.h.add(str);
                    this.i.add(new mw(f, f2, f3, f4, this.h.size() - 1));
                }
            }
        }
    }

    int a(int i, int i2) {
        return (this.a * i) + (this.b * i2);
    }

    public void a(int i) {
        this.k = i;
    }

    public void a(String str, boolean z, float f, float f2, float f3, float f4) {
        c(str, z, f, f2, f3, f4);
        synchronized (this.f) {
            if (this.l < 0) {
                zy.b("ActivityContent: negative number of WebViews.");
            }
            h();
        }
    }

    public boolean a() {
        boolean z;
        synchronized (this.f) {
            z = this.l == 0;
        }
        return z;
    }

    public String b() {
        return this.n;
    }

    public void b(String str, boolean z, float f, float f2, float f3, float f4) {
        c(str, z, f, f2, f3, f4);
    }

    public String c() {
        return this.o;
    }

    public String d() {
        return this.p;
    }

    public void e() {
        synchronized (this.f) {
            this.m -= 100;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mr)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        mr mrVar = (mr) obj;
        return mrVar.b() != null && mrVar.b().equals(b());
    }

    public void f() {
        synchronized (this.f) {
            this.l--;
        }
    }

    public void g() {
        synchronized (this.f) {
            this.l++;
        }
    }

    public void h() {
        synchronized (this.f) {
            int a = a(this.j, this.k);
            if (a > this.m) {
                this.m = a;
                if (((Boolean) pr.ae.c()).booleanValue() && !v.i().b()) {
                    this.n = this.d.a(this.g);
                    this.o = this.d.a(this.h);
                }
                if (((Boolean) pr.ag.c()).booleanValue() && !v.i().c()) {
                    this.p = this.e.a(this.h, this.i);
                }
            }
        }
    }

    public int hashCode() {
        return b().hashCode();
    }

    public int i() {
        return this.m;
    }

    int j() {
        return this.j;
    }

    public String toString() {
        int i = this.k;
        int i2 = this.m;
        int i3 = this.j;
        String valueOf = String.valueOf(a(this.g, 100));
        String valueOf2 = String.valueOf(a(this.h, 100));
        String str = this.n;
        String str2 = this.o;
        String str3 = this.p;
        return new StringBuilder(((((String.valueOf(valueOf).length() + 165) + String.valueOf(valueOf2).length()) + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append("ActivityContent fetchId: ").append(i).append(" score:").append(i2).append(" total_length:").append(i3).append("\n text: ").append(valueOf).append("\n viewableText").append(valueOf2).append("\n signture: ").append(str).append("\n viewableSignture: ").append(str2).append("\n viewableSignatureForVertical: ").append(str3).toString();
    }
}
