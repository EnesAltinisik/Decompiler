package com.fodlam.yds.f;

import com.fodlam.yds.utility.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class g implements Serializable {
    public int a;
    public ArrayList<h> b;
    boolean c = true;

    public g(int i) {
        this.a = i;
        this.b = new ArrayList();
    }

    public int a() {
        return this.b.size();
    }

    public void a(h hVar) {
        this.b.add(hVar);
    }

    public void a(boolean z) {
        this.c = z;
    }

    public int b() {
        Iterator it = this.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2;
            h hVar = (h) it.next();
            if (hVar.b) {
                i2 = i;
            } else {
                i2 = (hVar.l.b() ? 1 : 0) + i;
            }
            i = i2;
        }
        return i / 5;
    }

    public void b(h hVar) {
        for (int i = 0; i < this.b.size(); i++) {
            if (((h) this.b.get(i)).h.equals(hVar.h)) {
                this.b.remove(i);
                return;
            }
        }
    }

    public boolean c() {
        return this.c;
    }

    public boolean d() {
        return b() >= 1;
    }

    public h e() {
        return (h) this.b.get(c.c(this.b.size()));
    }

    public ArrayList<h> f() {
        Object arrayList = new ArrayList(this.b);
        Collections.shuffle(arrayList);
        return arrayList;
    }

    public ArrayList<h> g() {
        ArrayList<h> arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (hVar.l.b()) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    public int h() {
        return g().size();
    }

    public String toString() {
        return "Test " + this.a + " star " + b() + " isCompleted " + d();
    }
}
