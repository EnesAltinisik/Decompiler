package com.google.android.gms.b;

public class mt implements xy {
    private int a;
    private int b;
    private final int c;
    private final float d;

    public mt() {
        this(2500, 1, 1.0f);
    }

    public mt(int i, int i2, float f) {
        this.a = i;
        this.c = i2;
        this.d = f;
    }

    public int a() {
        return this.a;
    }

    public void a(abb com_google_android_gms_b_abb) {
        this.b++;
        this.a = (int) (((float) this.a) + (((float) this.a) * this.d));
        if (!c()) {
            throw com_google_android_gms_b_abb;
        }
    }

    public int b() {
        return this.b;
    }

    protected boolean c() {
        return this.b <= this.c;
    }
}
