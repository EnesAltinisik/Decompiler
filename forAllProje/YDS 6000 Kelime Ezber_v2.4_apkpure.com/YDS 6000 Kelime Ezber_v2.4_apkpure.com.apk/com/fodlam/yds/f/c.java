package com.fodlam.yds.f;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class c extends b {
    public c(String str, boolean z, int i) {
        super(str, z, i);
    }

    public void a(h hVar) {
        hVar.g = this.d / 15;
        g gVar = (g) this.e.get(Integer.valueOf(hVar.g));
        if (gVar == null) {
            gVar = new g(hVar.g);
            gVar.a(false);
            this.e.put(Integer.valueOf(hVar.g), gVar);
        }
        gVar.a(hVar);
        this.d++;
    }

    public String b() {
        return this.a;
    }

    public void b(h hVar) {
        try {
            g a = a(hVar.g);
            a.b(hVar);
            g i = i();
            if (i != null && i.b.size() > 0) {
                a.a((h) i.b.remove(0));
                if (i.a() == 0) {
                    this.e.remove(Integer.valueOf(i.a));
                }
            }
            this.d--;
        } catch (Exception e) {
        }
    }

    public void g() {
    }

    public g i() {
        Iterator it = this.e.values().iterator();
        g gVar = (g) it.next();
        while (it.hasNext()) {
            g gVar2 = (g) it.next();
            if (gVar2.a <= gVar.a) {
                gVar2 = gVar;
            }
            gVar = gVar2;
        }
        return gVar;
    }

    public void j() {
        ArrayList e = e();
        this.e.clear();
        this.d = 0;
        Collections.sort(e, new Comparator<h>(this) {
            final /* synthetic */ c a;

            {
                this.a = r1;
            }

            public int a(h hVar, h hVar2) {
                return hVar.c == hVar2.c ? 0 : hVar.c > hVar2.c ? 1 : -1;
            }

            public /* synthetic */ int compare(Object obj, Object obj2) {
                return a((h) obj, (h) obj2);
            }
        });
        for (int i = 0; i < e.size(); i++) {
            a((h) e.get(i));
        }
    }
}
