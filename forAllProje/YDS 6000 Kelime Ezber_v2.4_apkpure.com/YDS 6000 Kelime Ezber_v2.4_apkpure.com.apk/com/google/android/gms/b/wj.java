package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.List;

public class wj implements Creator<wi> {
    static void a(wi wiVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, wiVar.a);
        c.a(parcel, 2, wiVar.b, false);
        c.a(parcel, 3, wiVar.c, false);
        c.a(parcel, 4, wiVar.d, false);
        c.a(parcel, 5, wiVar.e);
        c.a(parcel, 6, wiVar.f, false);
        c.a(parcel, 7, wiVar.g);
        c.a(parcel, 8, wiVar.h);
        c.a(parcel, 9, wiVar.i);
        c.a(parcel, 10, wiVar.j, false);
        c.a(parcel, 11, wiVar.k);
        c.a(parcel, 12, wiVar.l);
        c.a(parcel, 13, wiVar.m, false);
        c.a(parcel, 14, wiVar.n);
        c.a(parcel, 15, wiVar.o, false);
        c.a(parcel, 18, wiVar.p);
        c.a(parcel, 19, wiVar.q, false);
        c.a(parcel, 21, wiVar.r, false);
        c.a(parcel, 22, wiVar.s);
        c.a(parcel, 23, wiVar.t);
        c.a(parcel, 24, wiVar.u);
        c.a(parcel, 25, wiVar.v);
        c.a(parcel, 26, wiVar.w);
        c.a(parcel, 28, wiVar.x, i, false);
        c.a(parcel, 29, wiVar.y, false);
        c.a(parcel, 30, wiVar.z, false);
        c.a(parcel, 31, wiVar.A);
        c.a(parcel, 32, wiVar.B);
        c.a(parcel, 33, wiVar.C, i, false);
        c.a(parcel, 34, wiVar.D, false);
        c.a(parcel, 35, wiVar.E, false);
        c.a(parcel, 36, wiVar.F);
        c.a(parcel, 37, wiVar.G, i, false);
        c.a(parcel, 38, wiVar.H);
        c.a(parcel, 39, wiVar.I, false);
        c.a(parcel, 40, wiVar.J, false);
        c.a(parcel, 42, wiVar.K);
        c.a(parcel, 43, wiVar.L, false);
        c.a(parcel, 44, wiVar.M, i, false);
        c.a(parcel, 45, wiVar.N, false);
        c.a(parcel, 46, wiVar.O);
        c.a(parcel, a);
    }

    public wi a(Parcel parcel) {
        int b = b.b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        int i2 = 0;
        List list2 = null;
        long j = 0;
        boolean z = false;
        long j2 = 0;
        List list3 = null;
        long j3 = 0;
        int i3 = 0;
        String str3 = null;
        long j4 = 0;
        String str4 = null;
        boolean z2 = false;
        String str5 = null;
        String str6 = null;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        wq wqVar = null;
        String str7 = null;
        String str8 = null;
        boolean z8 = false;
        boolean z9 = false;
        yj yjVar = null;
        List list4 = null;
        List list5 = null;
        boolean z10 = false;
        wk wkVar = null;
        boolean z11 = false;
        String str9 = null;
        List list6 = null;
        boolean z12 = false;
        String str10 = null;
        ym ymVar = null;
        String str11 = null;
        boolean z13 = false;
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
                    list = b.r(parcel, a);
                    break;
                case 5:
                    i2 = b.d(parcel, a);
                    break;
                case 6:
                    list2 = b.r(parcel, a);
                    break;
                case 7:
                    j = b.f(parcel, a);
                    break;
                case 8:
                    z = b.c(parcel, a);
                    break;
                case 9:
                    j2 = b.f(parcel, a);
                    break;
                case 10:
                    list3 = b.r(parcel, a);
                    break;
                case 11:
                    j3 = b.f(parcel, a);
                    break;
                case 12:
                    i3 = b.d(parcel, a);
                    break;
                case 13:
                    str3 = b.k(parcel, a);
                    break;
                case 14:
                    j4 = b.f(parcel, a);
                    break;
                case 15:
                    str4 = b.k(parcel, a);
                    break;
                case 18:
                    z2 = b.c(parcel, a);
                    break;
                case 19:
                    str5 = b.k(parcel, a);
                    break;
                case 21:
                    str6 = b.k(parcel, a);
                    break;
                case 22:
                    z3 = b.c(parcel, a);
                    break;
                case 23:
                    z4 = b.c(parcel, a);
                    break;
                case 24:
                    z5 = b.c(parcel, a);
                    break;
                case 25:
                    z6 = b.c(parcel, a);
                    break;
                case 26:
                    z7 = b.c(parcel, a);
                    break;
                case 28:
                    wqVar = (wq) b.a(parcel, a, wq.CREATOR);
                    break;
                case 29:
                    str7 = b.k(parcel, a);
                    break;
                case 30:
                    str8 = b.k(parcel, a);
                    break;
                case 31:
                    z8 = b.c(parcel, a);
                    break;
                case 32:
                    z9 = b.c(parcel, a);
                    break;
                case 33:
                    yjVar = (yj) b.a(parcel, a, yj.CREATOR);
                    break;
                case 34:
                    list4 = b.r(parcel, a);
                    break;
                case 35:
                    list5 = b.r(parcel, a);
                    break;
                case 36:
                    z10 = b.c(parcel, a);
                    break;
                case 37:
                    wkVar = (wk) b.a(parcel, a, wk.CREATOR);
                    break;
                case 38:
                    z11 = b.c(parcel, a);
                    break;
                case 39:
                    str9 = b.k(parcel, a);
                    break;
                case 40:
                    list6 = b.r(parcel, a);
                    break;
                case 42:
                    z12 = b.c(parcel, a);
                    break;
                case 43:
                    str10 = b.k(parcel, a);
                    break;
                case 44:
                    ymVar = (ym) b.a(parcel, a, ym.CREATOR);
                    break;
                case 45:
                    str11 = b.k(parcel, a);
                    break;
                case 46:
                    z13 = b.c(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new wi(i, str, str2, list, i2, list2, j, z, j2, list3, j3, i3, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, wqVar, str7, str8, z8, z9, yjVar, list4, list5, z10, wkVar, z11, str9, list6, z12, str10, ymVar, str11, z13);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public wi[] a(int i) {
        return new wi[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
