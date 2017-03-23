package com.nightonke.boommenu.b;

import android.content.Context;
import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.View;
import com.nightonke.boommenu.R;
import java.util.ArrayList;

public class k extends a {

    public static class a extends b {
        public int a() {
            int i = this.an * 2;
            return this.F != null ? Math.max(i, this.ad) : i;
        }

        public a a(int i) {
            this.a = i;
            return this;
        }

        public a a(g gVar) {
            this.b = gVar;
            return this;
        }

        public int b() {
            int i = this.an * 2;
            return this.F != null ? Math.max(i, (this.F.bottom - this.k) - this.l) : i;
        }

        public k b(Context context) {
            return new k(this, context);
        }
    }

    private k(a aVar, Context context) {
        super(context);
        this.a = context;
        a(aVar);
    }

    private void a(a aVar) {
        LayoutInflater.from(this.a).inflate(R.layout.bmb_text_outside_circle_button, this, true);
        b(aVar);
        a();
        a(this.h + this.t);
        d();
        a(this.aE);
        b();
        this.aI = new PointF((float) this.ar, (float) this.ar);
    }

    private void b(a aVar) {
        super.a((b) aVar);
    }

    public int A() {
        return this.ar * 2;
    }

    public int B() {
        return this.ar * 2;
    }

    public int C() {
        return this.h * 2;
    }

    public int D() {
        return this.h * 2;
    }

    public void E() {
        if (this.e && this.f) {
            g();
            i();
            this.e = false;
        }
    }

    public void F() {
        if (!this.e) {
            h();
            j();
            this.e = true;
        }
    }

    public void G() {
        this.aF.setPivotX((float) (this.h - this.D.left));
        this.aF.setPivotY((float) (this.h - this.D.top));
        this.aG.setPivotX((float) (this.ar - this.O.left));
        this.aG.setPivotY((float) (this.ar - this.O.top));
    }

    public void H() {
    }

    public ArrayList<View> y() {
        ArrayList<View> arrayList = new ArrayList();
        arrayList.add(this.aF);
        arrayList.add(this.aG);
        return arrayList;
    }

    public ArrayList<View> z() {
        ArrayList<View> arrayList = new ArrayList();
        if (this.l) {
            arrayList.add(this.aF);
        }
        if (this.m) {
            arrayList.add(this.aG);
        }
        return arrayList;
    }
}
