package com.fodlam.yds.f;

import com.fodlam.yds.c.b;
import java.io.Serializable;

public class h implements Serializable, Comparable<h> {
    public static int a = 0;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public String h;
    public String i;
    public String j;
    public String k;
    public e l;
    private boolean m;

    public static class a implements Serializable {
        public String a;
        public String b;

        public a(String str, String str2) {
            this.a = str2;
            this.b = str;
        }

        public String toString() {
            StringBuilder append = new StringBuilder().append(this.b);
            String str = (this.a == null || this.a.length() == 0) ? "" : "\n" + this.a;
            return append.append(str).toString();
        }
    }

    public h() {
        this.b = false;
        this.g = -1;
        this.m = false;
        this.b = true;
    }

    public h(int i, int i2, int i3, String str, String str2, String str3, String str4, int i4) {
        this.b = false;
        this.g = -1;
        this.m = false;
        this.c = i;
        this.h = str;
        this.d = i2;
        this.i = str2;
        this.j = str3;
        this.k = str4;
        this.e = i3;
        this.f = i4;
    }

    public int a(h hVar) {
        return this.h.compareTo(hVar.h);
    }

    public void a(boolean z) {
        if (z) {
            a++;
        } else {
            a--;
        }
        this.m = z;
    }

    public boolean a() {
        return this.m;
    }

    public String b() {
        return "(" + this.i + ")\n";
    }

    public void b(boolean z) {
        if (z) {
            a++;
        }
        this.m = z;
    }

    public String c() {
        String d = b.a().d(this.c);
        return d.length() > 0 ? d : "(" + this.i + ")";
    }

    public /* synthetic */ int compareTo(Object obj) {
        return a((h) obj);
    }
}
