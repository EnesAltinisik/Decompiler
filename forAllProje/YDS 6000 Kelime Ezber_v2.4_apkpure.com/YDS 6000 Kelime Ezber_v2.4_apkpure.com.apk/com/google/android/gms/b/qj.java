package com.google.android.gms.b;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.a.b;
import com.google.android.gms.b.qu.a;

@vz
public class qj extends a {
    private final Drawable a;
    private final Uri b;
    private final double c;

    public qj(Drawable drawable, Uri uri, double d) {
        this.a = drawable;
        this.b = uri;
        this.c = d;
    }

    public com.google.android.gms.a.a a() {
        return b.a(this.a);
    }

    public Uri b() {
        return this.b;
    }

    public double c() {
        return this.c;
    }
}
