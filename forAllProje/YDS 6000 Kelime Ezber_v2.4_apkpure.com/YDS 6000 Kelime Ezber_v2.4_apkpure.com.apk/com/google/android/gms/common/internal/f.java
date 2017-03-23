package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public class f extends a {
    public static final Creator<f> CREATOR = new g();
    final int a;
    IBinder b;
    private com.google.android.gms.common.a c;
    private boolean d;
    private boolean e;

    f(int i, IBinder iBinder, com.google.android.gms.common.a aVar, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = aVar;
        this.d = z;
        this.e = z2;
    }

    public z a() {
        return z.a.a(this.b);
    }

    public com.google.android.gms.common.a b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.c.equals(fVar.c) && a().equals(fVar.a());
    }

    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }
}
