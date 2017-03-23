package com.nightonke.boommenu.b;

import android.content.Context;
import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.View;
import com.nightonke.boommenu.R;
import java.util.ArrayList;

public class j extends a {

    public static class a extends b {
        public int a() {
            return this.an;
        }

        public a a(int i) {
            this.a = i;
            return this;
        }

        public a a(g gVar) {
            this.b = gVar;
            return this;
        }

        public j b(Context context) {
            return new j(this, context);
        }
    }

    private j(a aVar, Context context) {
        super(context);
        this.a = context;
        a(aVar);
    }

    private void a(a aVar) {
        LayoutInflater.from(this.a).inflate(R.layout.bmb_text_inside_circle_button, this, true);
        b(aVar);
        a(this.h + this.t);
        d();
        a(this.g);
        b();
        this.aI = new PointF((float) ((this.h + this.t) + this.r), (float) ((this.h + this.t) + this.s));
    }

    private void b(a aVar) {
        super.a((b) aVar);
    }

    public int A() {
        return ((this.h * 2) + (this.t * 2)) + (this.r * 2);
    }

    public int B() {
        return ((this.h * 2) + (this.t * 2)) + (this.s * 2);
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
        this.aG.setPivotX((float) (this.h - this.O.left));
        this.aG.setPivotY((float) (this.h - this.O.top));
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
