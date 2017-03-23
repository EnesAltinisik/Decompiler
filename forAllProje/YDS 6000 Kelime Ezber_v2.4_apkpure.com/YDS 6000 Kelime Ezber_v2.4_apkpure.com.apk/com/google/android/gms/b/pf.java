package com.google.android.gms.b;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;

@vz
public class pf extends nx {
    public pf(nx nxVar) {
        super(nxVar.a, nxVar.b, nxVar.c, nxVar.d, nxVar.e, nxVar.f, nxVar.g, nxVar.h, nxVar.i, nxVar.j, nxVar.k);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, this.a);
        c.a(parcel, 2, this.b, false);
        c.a(parcel, 3, this.c);
        c.a(parcel, 6, this.f);
        c.a(parcel, a);
    }
}
