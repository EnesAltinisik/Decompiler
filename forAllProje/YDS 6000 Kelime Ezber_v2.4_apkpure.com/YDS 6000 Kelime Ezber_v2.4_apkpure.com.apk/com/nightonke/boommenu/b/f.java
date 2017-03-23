package com.nightonke.boommenu.b;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import com.nightonke.boommenu.R;
import com.nightonke.boommenu.e;
import java.util.ArrayList;

public class f extends a {

    public static class a extends b {
        public a() {
            this.u = new Rect(0, 0, e.a(60.0f), e.a(60.0f));
            this.F = new Rect(e.a(70.0f), e.a(10.0f), e.a(280.0f), e.a(40.0f));
            this.J = 8388627;
            this.L = 15;
        }

        public int a() {
            return this.ao;
        }

        public a a(int i) {
            this.a = i;
            return this;
        }

        public a a(Typeface typeface) {
            this.H = typeface;
            return this;
        }

        public a a(Drawable drawable) {
            this.r = drawable;
            return this;
        }

        public a a(g gVar) {
            this.b = gVar;
            return this;
        }

        public a a(String str) {
            this.z = str;
            return this;
        }

        public a a(boolean z) {
            this.af = z;
            return this;
        }

        public int b() {
            return this.ap;
        }

        public a b(int i) {
            this.L = i;
            return this;
        }

        public f b(Context context) {
            return new f(this, context);
        }

        public a c(int i) {
            this.ah = Integer.valueOf(i);
            return this;
        }

        public a d(int i) {
            this.h = Integer.valueOf(i);
            return this;
        }
    }

    private f(a aVar, Context context) {
        super(context);
        this.a = context;
        a(aVar);
    }

    private void a(a aVar) {
        LayoutInflater.from(this.a).inflate(R.layout.bmb_ham_button, this, true);
        b(aVar);
        a(aVar.n);
        f();
        a(this.g);
        b(this.g);
        b();
        this.aI = new PointF(((((float) this.i) / 2.0f) + ((float) this.t)) + ((float) this.r), ((((float) this.j) / 2.0f) + ((float) this.t)) + ((float) this.s));
    }

    private void b(a aVar) {
        super.a((b) aVar);
    }

    public int A() {
        return (this.i + (this.t * 2)) + (this.r * 2);
    }

    public int B() {
        return (this.j + (this.t * 2)) + (this.s * 2);
    }

    public int C() {
        return this.i;
    }

    public int D() {
        return this.j;
    }

    public void E() {
        if (this.e && this.f) {
            g();
            i();
            k();
            this.e = false;
        }
    }

    public void F() {
        if (!this.e) {
            h();
            j();
            l();
            this.e = true;
        }
    }

    public void G() {
    }

    public void H() {
    }

    public ArrayList<View> y() {
        ArrayList<View> arrayList = new ArrayList();
        arrayList.add(this.aF);
        arrayList.add(this.aG);
        if (this.aH != null) {
            arrayList.add(this.aH);
        }
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
