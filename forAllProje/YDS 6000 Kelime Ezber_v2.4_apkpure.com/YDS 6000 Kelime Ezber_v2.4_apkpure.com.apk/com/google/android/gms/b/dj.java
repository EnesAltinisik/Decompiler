package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class dj implements Creator<di> {
    static void a(di diVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, diVar.a);
        c.a(parcel, 2, diVar.b, false);
        c.a(parcel, 3, diVar.c);
        c.a(parcel, 4, diVar.d, false);
        c.a(parcel, 5, diVar.e, false);
        c.a(parcel, 6, diVar.f, false);
        c.a(parcel, 7, diVar.g, false);
        c.a(parcel, 8, diVar.h, false);
        c.a(parcel, a);
    }

    public di a(Parcel parcel) {
        Double d = null;
        int b = b.b(parcel);
        int i = 0;
        long j = 0;
        String str = null;
        String str2 = null;
        Float f = null;
        Long l = null;
        String str3 = null;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i = b.d(parcel, a);
                    break;
                case 2:
                    str3 = b.k(parcel, a);
                    break;
                case 3:
                    j = b.f(parcel, a);
                    break;
                case 4:
                    l = b.g(parcel, a);
                    break;
                case 5:
                    f = b.i(parcel, a);
                    break;
                case 6:
                    str2 = b.k(parcel, a);
                    break;
                case 7:
                    str = b.k(parcel, a);
                    break;
                case 8:
                    d = b.j(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new di(i, str3, j, l, f, str2, str, d);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public di[] a(int i) {
        return new di[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
