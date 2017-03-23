package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class ny implements Creator<nx> {
    static void a(nx nxVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, nxVar.a);
        c.a(parcel, 2, nxVar.b, false);
        c.a(parcel, 3, nxVar.c);
        c.a(parcel, 4, nxVar.d);
        c.a(parcel, 5, nxVar.e);
        c.a(parcel, 6, nxVar.f);
        c.a(parcel, 7, nxVar.g);
        c.a(parcel, 8, nxVar.h, i, false);
        c.a(parcel, 9, nxVar.i);
        c.a(parcel, 10, nxVar.j);
        c.a(parcel, 11, nxVar.k);
        c.a(parcel, a);
    }

    public nx a(Parcel parcel) {
        nx[] nxVarArr = null;
        boolean z = false;
        int b = b.b(parcel);
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        boolean z4 = false;
        int i3 = 0;
        int i4 = 0;
        String str = null;
        int i5 = 0;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i5 = b.d(parcel, a);
                    break;
                case 2:
                    str = b.k(parcel, a);
                    break;
                case 3:
                    i4 = b.d(parcel, a);
                    break;
                case 4:
                    i3 = b.d(parcel, a);
                    break;
                case 5:
                    z4 = b.c(parcel, a);
                    break;
                case 6:
                    i2 = b.d(parcel, a);
                    break;
                case 7:
                    i = b.d(parcel, a);
                    break;
                case 8:
                    nxVarArr = (nx[]) b.b(parcel, a, nx.CREATOR);
                    break;
                case 9:
                    z3 = b.c(parcel, a);
                    break;
                case 10:
                    z2 = b.c(parcel, a);
                    break;
                case 11:
                    z = b.c(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new nx(i5, str, i4, i3, z4, i2, i, nxVarArr, z3, z2, z);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public nx[] a(int i) {
        return new nx[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
