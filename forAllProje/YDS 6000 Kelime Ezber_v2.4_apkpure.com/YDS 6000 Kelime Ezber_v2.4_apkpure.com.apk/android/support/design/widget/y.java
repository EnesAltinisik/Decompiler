package android.support.design.widget;

import android.support.v4.view.ah;
import android.view.View;

class y {
    private final View a;
    private int b;
    private int c;
    private int d;
    private int e;

    public y(View view) {
        this.a = view;
    }

    private void c() {
        ah.d(this.a, this.d - (this.a.getTop() - this.b));
        ah.e(this.a, this.e - (this.a.getLeft() - this.c));
    }

    public void a() {
        this.b = this.a.getTop();
        this.c = this.a.getLeft();
        c();
    }

    public boolean a(int i) {
        if (this.d == i) {
            return false;
        }
        this.d = i;
        c();
        return true;
    }

    public int b() {
        return this.d;
    }

    public boolean b(int i) {
        if (this.e == i) {
            return false;
        }
        this.e = i;
        c();
        return true;
    }
}
