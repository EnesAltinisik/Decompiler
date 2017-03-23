package com.google.android.gms.b;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.b.a.a;

@vz
public class qw extends a {
    private final qu a;
    private final Drawable b;
    private final Uri c;
    private final double d;

    public qw(qu quVar) {
        Drawable drawable;
        double d;
        Uri uri = null;
        this.a = quVar;
        try {
            com.google.android.gms.a.a a = this.a.a();
            if (a != null) {
                drawable = (Drawable) b.a(a);
                this.b = drawable;
                uri = this.a.b();
                this.c = uri;
                d = 1.0d;
                d = this.a.c();
                this.d = d;
            }
        } catch (Throwable e) {
            zy.b("Failed to get drawable.", e);
        }
        Object obj = uri;
        this.b = drawable;
        try {
            uri = this.a.b();
        } catch (Throwable e2) {
            zy.b("Failed to get uri.", e2);
        }
        this.c = uri;
        d = 1.0d;
        try {
            d = this.a.c();
        } catch (Throwable e3) {
            zy.b("Failed to get scale.", e3);
        }
        this.d = d;
    }

    public Drawable a() {
        return this.b;
    }

    public Uri b() {
        return this.c;
    }

    public double c() {
        return this.d;
    }
}
