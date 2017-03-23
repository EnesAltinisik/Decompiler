package com.google.android.gms.b;

import android.os.Bundle;
import com.google.android.gms.ads.internal.v;

@vz
public class zb {
    private final Object a;
    private int b;
    private int c;
    private final yx d;
    private final String e;

    zb(yx yxVar, String str) {
        this.a = new Object();
        this.d = yxVar;
        this.e = str;
    }

    public zb(String str) {
        this(v.i(), str);
    }

    public Bundle a() {
        Bundle bundle;
        synchronized (this.a) {
            bundle = new Bundle();
            bundle.putInt("pmnli", this.b);
            bundle.putInt("pmnll", this.c);
        }
        return bundle;
    }

    public void a(int i, int i2) {
        synchronized (this.a) {
            this.b = i;
            this.c = i2;
            this.d.a(this.e, this);
        }
    }
}
