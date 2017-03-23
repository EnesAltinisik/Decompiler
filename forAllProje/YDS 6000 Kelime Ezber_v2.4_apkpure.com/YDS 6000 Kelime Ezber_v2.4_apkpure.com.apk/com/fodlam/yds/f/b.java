package com.fodlam.yds.f;

import com.fodlam.yds.OxfordApplication;
import java.util.ArrayList;
import java.util.HashMap;

public class b {
    public String a;
    public int b;
    public boolean c;
    protected int d = 0;
    HashMap<Integer, g> e;

    public b(String str, boolean z, int i) {
        this.a = str;
        this.c = z;
        this.b = i;
        this.e = new HashMap();
    }

    public int a() {
        return this.d;
    }

    public g a(int i) {
        return (g) this.e.get(Integer.valueOf(i));
    }

    public void a(h hVar) {
        g gVar = (g) this.e.get(Integer.valueOf(hVar.f));
        if (gVar == null) {
            g gVar2 = new g(hVar.f);
            gVar2.a(!OxfordApplication.b);
            this.e.put(Integer.valueOf(hVar.f), gVar2);
            gVar = gVar2;
        }
        gVar.a(hVar);
        this.d++;
    }

    public String b() {
        return "Seviye: " + this.a;
    }

    public String c() {
        return "Kelime Sayısı: " + a();
    }

    public int d() {
        return this.e.size();
    }

    public ArrayList<h> e() {
        ArrayList<h> arrayList = new ArrayList();
        for (g f : this.e.values()) {
            arrayList.addAll(f.f());
        }
        return arrayList;
    }

    public ArrayList<h> f() {
        ArrayList<h> arrayList = new ArrayList();
        for (g g : this.e.values()) {
            arrayList.addAll(g.g());
        }
        return arrayList;
    }

    public void g() {
        g gVar;
        if (OxfordApplication.b) {
            for (g gVar2 : this.e.values()) {
                gVar2.a(false);
            }
            return;
        }
        if (this.e.size() > 0) {
            ((g) this.e.get(Integer.valueOf(0))).a(false);
        }
        int i = 3;
        while (i < this.e.size()) {
            gVar2 = (g) this.e.get(Integer.valueOf(i - 1));
            if (!gVar2.c() && gVar2.d()) {
                ((g) this.e.get(Integer.valueOf(i))).a(false);
                i++;
            } else {
                return;
            }
        }
    }

    public int h() {
        int i = 0;
        for (g h : this.e.values()) {
            i = h.h() + i;
        }
        return i;
    }

    public g i() {
        g gVar = (g) this.e.get(Integer.valueOf(0));
        for (int i = 1; i < this.e.size(); i++) {
            g gVar2 = (g) this.e.get(Integer.valueOf(i));
            if (!gVar2.c()) {
                gVar = gVar2;
            }
        }
        return gVar;
    }
}
