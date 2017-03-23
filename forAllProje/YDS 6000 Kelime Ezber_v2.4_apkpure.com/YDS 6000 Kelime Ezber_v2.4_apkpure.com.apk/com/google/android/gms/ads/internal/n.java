package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class n implements Creator<m> {
    static void a(m mVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, mVar.a);
        c.a(parcel, 2, mVar.b);
        c.a(parcel, 3, mVar.c);
        c.a(parcel, 4, mVar.d, false);
        c.a(parcel, 5, mVar.e);
        c.a(parcel, 6, mVar.f);
        c.a(parcel, 7, mVar.g);
        c.a(parcel, a);
    }

    public m a(Parcel parcel) {
        int i = 0;
        int b = b.b(parcel);
        String str = null;
        float f = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i2 = b.d(parcel, a);
                    break;
                case 2:
                    z3 = b.c(parcel, a);
                    break;
                case 3:
                    z2 = b.c(parcel, a);
                    break;
                case 4:
                    str = b.k(parcel, a);
                    break;
                case 5:
                    z = b.c(parcel, a);
                    break;
                case 6:
                    f = b.h(parcel, a);
                    break;
                case 7:
                    i = b.d(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new m(i2, z3, z2, str, z, f, i);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public m[] a(int i) {
        return new m[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
