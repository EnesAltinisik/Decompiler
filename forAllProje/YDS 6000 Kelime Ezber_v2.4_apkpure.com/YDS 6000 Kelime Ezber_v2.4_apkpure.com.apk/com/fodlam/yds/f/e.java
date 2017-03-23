package com.fodlam.yds.f;

import com.fodlam.yds.OxfordApplication;
import com.fodlam.yds.c.a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class e implements Serializable {
    public int a;
    public int b;
    public int c;
    HashMap<String, Integer> d;

    public e(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = new HashMap(a.a.length);
    }

    public e(h hVar) {
        this(hVar.c, hVar.d, hVar.e);
        a(0);
    }

    public int a(String str) {
        return ((Integer) this.d.get(str)).intValue();
    }

    public Set<Entry<String, Integer>> a() {
        return this.d.entrySet();
    }

    public void a(int i) {
        for (int i2 = 3; i2 < a.a.length - 1; i2++) {
            a(a.a[i2], i);
        }
    }

    public void a(String str, int i) {
        this.d.put(str, Integer.valueOf(i));
    }

    public void b(String str, int i) {
        boolean b = b();
        this.d.put(str, Integer.valueOf(i));
        boolean b2 = b();
        if (b != b2) {
            f f = a.a(null).f();
            int i2 = f.c;
            int i3 = (b || !b2) ? -1 : 1;
            f.c = i3 + i2;
            a.a(null).b(f);
        }
    }

    public boolean b() {
        int i = 0;
        for (int i2 = 3; i2 < a.a.length - 1; i2++) {
            i += ((Integer) this.d.get(a.a[i2])).intValue();
        }
        return i >= OxfordApplication.a;
    }

    public boolean c() {
        if (this.d.get("issent") == null) {
            return false;
        }
        return ((Integer) this.d.get("issent")).intValue() == 1;
    }

    public void d() {
        b("issent", 1);
    }

    public String toString() {
        return this.a + " " + this.b + " " + this.c + " " + a().toString();
    }
}
