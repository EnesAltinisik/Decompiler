package com.nightonke.boommenu.b;

import android.content.Context;
import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.View;
import com.nightonke.boommenu.R;
import java.util.ArrayList;

public class i extends a {

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

        public i b(Context context) {
            return new i(this, context);
        }
    }

    private i(a aVar, Context context) {
        super(context);
        this.a = context;
        a(aVar);
    }

    private void a(a aVar) {
        LayoutInflater.from(this.a).inflate(R.layout.bmb_simple_circle_button, this, true);
        b(aVar);
        a(this.h + this.t);
        d();
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
            this.e = false;
        }
    }

    public void F() {
        if (!this.e) {
            h();
            this.e = true;
        }
    }

    public void G() {
        this.aF.setPivotX((float) (this.h - this.D.left));
        this.aF.setPivotY((float) (this.h - this.D.top));
    }

    public void H() {
    }

    public ArrayList<View> y() {
        ArrayList<View> arrayList = new ArrayList();
        arrayList.add(this.aF);
        return arrayList;
    }

    public ArrayList<View> z() {
        ArrayList<View> arrayList = new ArrayList();
        if (this.l) {
            arrayList.add(this.aF);
        }
        return arrayList;
    }
}
