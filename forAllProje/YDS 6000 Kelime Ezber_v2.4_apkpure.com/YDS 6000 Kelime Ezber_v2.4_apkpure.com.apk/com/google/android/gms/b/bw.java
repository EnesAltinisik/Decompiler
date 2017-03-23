package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class bw implements Creator<bv> {
    static void a(bv bvVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, bvVar.a);
        c.a(parcel, 2, bvVar.b, false);
        c.a(parcel, 3, bvVar.c, false);
        c.a(parcel, 4, bvVar.d, false);
        c.a(parcel, 5, bvVar.e, false);
        c.a(parcel, 6, bvVar.f);
        c.a(parcel, 7, bvVar.g);
        c.a(parcel, 8, bvVar.h, false);
        c.a(parcel, 9, bvVar.i);
        c.a(parcel, 10, bvVar.j);
        c.a(parcel, 11, bvVar.k);
        c.a(parcel, 12, bvVar.l, false);
        c.a(parcel, a);
    }

    public bv a(Parcel parcel) {
        int b = b.b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long j = 0;
        long j2 = 0;
        String str5 = null;
        boolean z = false;
        boolean z2 = false;
        long j3 = 0;
        String str6 = null;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i = b.d(parcel, a);
                    break;
                case 2:
                    str = b.k(parcel, a);
                    break;
                case 3:
                    str2 = b.k(parcel, a);
                    break;
                case 4:
                    str3 = b.k(parcel, a);
                    break;
                case 5:
                    str4 = b.k(parcel, a);
                    break;
                case 6:
                    j = b.f(parcel, a);
                    break;
                case 7:
                    j2 = b.f(parcel, a);
                    break;
                case 8:
                    str5 = b.k(parcel, a);
                    break;
                case 9:
                    z = b.c(parcel, a);
                    break;
                case 10:
                    z2 = b.c(parcel, a);
                    break;
                case 11:
                    j3 = b.f(parcel, a);
                    break;
                case 12:
                    str6 = b.k(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new bv(i, str, str2, str3, str4, j, j2, str5, z, z2, j3, str6);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public bv[] a(int i) {
        return new bv[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
