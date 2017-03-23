package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class pe implements Creator<pd> {
    static void a(pd pdVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, pdVar.a);
        c.a(parcel, 2, pdVar.b);
        c.a(parcel, 3, pdVar.c);
        c.a(parcel, 4, pdVar.d);
        c.a(parcel, 5, pdVar.e);
        c.a(parcel, 6, pdVar.f);
        c.a(parcel, 7, pdVar.g);
        c.a(parcel, 8, pdVar.h);
        c.a(parcel, 9, pdVar.i);
        c.a(parcel, 10, pdVar.j, false);
        c.a(parcel, 11, pdVar.k);
        c.a(parcel, 12, pdVar.l, false);
        c.a(parcel, 13, pdVar.m);
        c.a(parcel, 14, pdVar.n);
        c.a(parcel, 15, pdVar.o, false);
        c.a(parcel, a);
    }

    public pd a(Parcel parcel) {
        int b = b.b(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        String str = null;
        int i10 = 0;
        String str2 = null;
        int i11 = 0;
        int i12 = 0;
        String str3 = null;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i = b.d(parcel, a);
                    break;
                case 2:
                    i2 = b.d(parcel, a);
                    break;
                case 3:
                    i3 = b.d(parcel, a);
                    break;
                case 4:
                    i4 = b.d(parcel, a);
                    break;
                case 5:
                    i5 = b.d(parcel, a);
                    break;
                case 6:
                    i6 = b.d(parcel, a);
                    break;
                case 7:
                    i7 = b.d(parcel, a);
                    break;
                case 8:
                    i8 = b.d(parcel, a);
                    break;
                case 9:
                    i9 = b.d(parcel, a);
                    break;
                case 10:
                    str = b.k(parcel, a);
                    break;
                case 11:
                    i10 = b.d(parcel, a);
                    break;
                case 12:
                    str2 = b.k(parcel, a);
                    break;
                case 13:
                    i11 = b.d(parcel, a);
                    break;
                case 14:
                    i12 = b.d(parcel, a);
                    break;
                case 15:
                    str3 = b.k(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new pd(i, i2, i3, i4, i5, i6, i7, i8, i9, str, i10, str2, i11, i12, str3);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public pd[] a(int i) {
        return new pd[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
