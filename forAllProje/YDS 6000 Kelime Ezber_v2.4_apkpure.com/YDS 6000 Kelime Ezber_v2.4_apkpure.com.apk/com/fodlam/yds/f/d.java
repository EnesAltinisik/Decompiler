package com.fodlam.yds.f;

import com.fodlam.yds.OxfordApplication;
import com.fodlam.yds.OxfordApplication.a;
import java.io.Serializable;

public class d implements Serializable {
    public h[] a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean[] e;

    public d() {
        this.c = false;
        this.d = false;
        this.e = new boolean[]{false, false, false, false};
        this.c = true;
    }

    public d(h[] hVarArr, int i) {
        this.c = false;
        this.d = false;
        this.e = new boolean[]{false, false, false, false};
        this.a = hVarArr;
        this.b = i;
    }

    public h a() {
        return this.a[this.b];
    }

    public h a(int i) {
        return this.a[i];
    }

    public boolean a(h hVar) {
        for (int i = 0; i < 4; i++) {
            if (hVar.h.equals(this.a[i].h)) {
                this.e[i] = true;
            }
        }
        return hVar.h.equals(this.a[this.b].h);
    }

    public String b() {
        return OxfordApplication.h == a.CHOOSEWORD ? this.a[this.b].h : OxfordApplication.h == a.FINDWORD ? this.a[this.b].k : (OxfordApplication.h == a.LISTENANDCHOOSE || OxfordApplication.h == a.LISTEN) ? "?" : "?";
    }

    public String b(int i) {
        return OxfordApplication.h == a.CHOOSEWORD ? this.a[i].k : OxfordApplication.h == a.FINDWORD ? this.a[i].h : OxfordApplication.h == a.LISTENANDCHOOSE ? this.a[i].k : OxfordApplication.h == a.LISTEN ? this.a[i].h : "";
    }

    public String toString() {
        return b() + " " + b(0) + " " + b(1) + " ";
    }
}
