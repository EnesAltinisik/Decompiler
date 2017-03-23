package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class ds implements Creator<dr> {
    static void a(dr drVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, drVar.a);
        c.a(parcel, 2, drVar.b, false);
        c.a(parcel, 3, drVar.c);
        c.a(parcel, 4, drVar.d);
        c.a(parcel, 5, drVar.e, false);
        c.a(parcel, 6, drVar.f, false);
        c.a(parcel, 7, drVar.g);
        c.a(parcel, 8, drVar.h, false);
        c.a(parcel, 9, drVar.i);
        c.a(parcel, 10, drVar.j);
        c.a(parcel, a);
    }

    public dr a(Parcel parcel) {
        String str = null;
        int i = 0;
        int b = b.b(parcel);
        boolean z = true;
        boolean z2 = false;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        int i3 = 0;
        String str4 = null;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i4 = b.d(parcel, a);
                    break;
                case 2:
                    str4 = b.k(parcel, a);
                    break;
                case 3:
                    i3 = b.d(parcel, a);
                    break;
                case 4:
                    i2 = b.d(parcel, a);
                    break;
                case 5:
                    str3 = b.k(parcel, a);
                    break;
                case 6:
                    str2 = b.k(parcel, a);
                    break;
                case 7:
                    z = b.c(parcel, a);
                    break;
                case 8:
                    str = b.k(parcel, a);
                    break;
                case 9:
                    z2 = b.c(parcel, a);
                    break;
                case 10:
                    i = b.d(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new dr(i4, str4, i3, i2, str3, str2, z, str, z2, i);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public dr[] a(int i) {
        return new dr[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
