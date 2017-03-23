package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.b.b;
import com.google.android.gms.common.internal.safeparcel.a;

@vz
public class qr extends a {
    public static final Creator<qr> CREATOR = new qs();
    public final int a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final int e;
    public final ph f;

    public qr(int i, boolean z, int i2, boolean z2, int i3, ph phVar) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = z2;
        this.e = i3;
        this.f = phVar;
    }

    public qr(b bVar) {
        this(3, bVar.a(), bVar.b(), bVar.c(), bVar.d(), bVar.e() != null ? new ph(bVar.e()) : null);
    }

    public void writeToParcel(Parcel parcel, int i) {
        qs.a(this, parcel, i);
    }
}
