package com.google.android.gms.b;

public abstract class lh<M extends lh<M>> extends ln {
    protected lj ag;

    public void a(lg lgVar) {
        if (this.ag != null) {
            for (int i = 0; i < this.ag.a(); i++) {
                this.ag.b(i).a(lgVar);
            }
        }
    }

    protected final boolean a(lf lfVar, int i) {
        int r = lfVar.r();
        if (!lfVar.b(i)) {
            return false;
        }
        int b = lq.b(i);
        lp lpVar = new lp(i, lfVar.a(r, lfVar.r() - r));
        lk lkVar = null;
        if (this.ag == null) {
            this.ag = new lj();
        } else {
            lkVar = this.ag.a(b);
        }
        if (lkVar == null) {
            lkVar = new lk();
            this.ag.a(b, lkVar);
        }
        lkVar.a(lpVar);
        return true;
    }

    protected int b() {
        int i = 0;
        if (this.ag == null) {
            return 0;
        }
        int i2 = 0;
        while (i < this.ag.a()) {
            i2 += this.ag.b(i).a();
            i++;
        }
        return i2;
    }

    public M c() {
        lh lhVar = (lh) super.d();
        ll.a(this, lhVar);
        return lhVar;
    }

    public /* synthetic */ Object clone() {
        return c();
    }

    public /* synthetic */ ln d() {
        return (lh) clone();
    }
}
