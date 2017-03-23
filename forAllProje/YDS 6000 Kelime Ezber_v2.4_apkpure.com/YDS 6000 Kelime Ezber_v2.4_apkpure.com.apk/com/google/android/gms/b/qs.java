package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class qs implements Creator<qr> {
    static void a(qr qrVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, qrVar.a);
        c.a(parcel, 2, qrVar.b);
        c.a(parcel, 3, qrVar.c);
        c.a(parcel, 4, qrVar.d);
        c.a(parcel, 5, qrVar.e);
        c.a(parcel, 6, qrVar.f, i, false);
        c.a(parcel, a);
    }

    public qr a(Parcel parcel) {
        int i = 0;
        int b = b.b(parcel);
        ph phVar = null;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i3 = b.d(parcel, a);
                    break;
                case 2:
                    z2 = b.c(parcel, a);
                    break;
                case 3:
                    i2 = b.d(parcel, a);
                    break;
                case 4:
                    z = b.c(parcel, a);
                    break;
                case 5:
                    i = b.d(parcel, a);
                    break;
                case 6:
                    phVar = (ph) b.a(parcel, a, ph.CREATOR);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new qr(i3, z2, i2, z, i, phVar);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public qr[] a(int i) {
        return new qr[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
