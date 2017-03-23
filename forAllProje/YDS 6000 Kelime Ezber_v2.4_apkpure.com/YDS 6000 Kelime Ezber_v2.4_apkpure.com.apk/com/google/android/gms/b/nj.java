package com.google.android.gms.b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class nj implements Creator<ni> {
    static void a(ni niVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, niVar.a);
        c.a(parcel, 2, niVar.b, false);
        c.a(parcel, 3, niVar.c);
        c.a(parcel, 4, niVar.d, false);
        c.a(parcel, 5, niVar.e, false);
        c.a(parcel, 6, niVar.f, false);
        c.a(parcel, 7, niVar.g, false);
        c.a(parcel, 8, niVar.h);
        c.a(parcel, a);
    }

    public ni a(Parcel parcel) {
        boolean z = false;
        Bundle bundle = null;
        int b = b.b(parcel);
        long j = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i = b.d(parcel, a);
                    break;
                case 2:
                    str4 = b.k(parcel, a);
                    break;
                case 3:
                    j = b.f(parcel, a);
                    break;
                case 4:
                    str3 = b.k(parcel, a);
                    break;
                case 5:
                    str2 = b.k(parcel, a);
                    break;
                case 6:
                    str = b.k(parcel, a);
                    break;
                case 7:
                    bundle = b.m(parcel, a);
                    break;
                case 8:
                    z = b.c(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ni(i, str4, j, str3, str2, str, bundle, z);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public ni[] a(int i) {
        return new ni[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
