package com.google.android.gms.b;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.List;

public class nv implements Creator<ns> {
    static void a(ns nsVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, nsVar.a);
        c.a(parcel, 2, nsVar.b);
        c.a(parcel, 3, nsVar.c, false);
        c.a(parcel, 4, nsVar.d);
        c.a(parcel, 5, nsVar.e, false);
        c.a(parcel, 6, nsVar.f);
        c.a(parcel, 7, nsVar.g);
        c.a(parcel, 8, nsVar.h);
        c.a(parcel, 9, nsVar.i, false);
        c.a(parcel, 10, nsVar.j, i, false);
        c.a(parcel, 11, nsVar.k, i, false);
        c.a(parcel, 12, nsVar.l, false);
        c.a(parcel, 13, nsVar.m, false);
        c.a(parcel, 14, nsVar.n, false);
        c.a(parcel, 15, nsVar.o, false);
        c.a(parcel, 16, nsVar.p, false);
        c.a(parcel, 17, nsVar.q, false);
        c.a(parcel, 18, nsVar.r);
        c.a(parcel, a);
    }

    public ns a(Parcel parcel) {
        int b = b.b(parcel);
        int i = 0;
        long j = 0;
        Bundle bundle = null;
        int i2 = 0;
        List list = null;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        String str = null;
        pd pdVar = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        List list2 = null;
        String str3 = null;
        String str4 = null;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i = b.d(parcel, a);
                    break;
                case 2:
                    j = b.f(parcel, a);
                    break;
                case 3:
                    bundle = b.m(parcel, a);
                    break;
                case 4:
                    i2 = b.d(parcel, a);
                    break;
                case 5:
                    list = b.r(parcel, a);
                    break;
                case 6:
                    z = b.c(parcel, a);
                    break;
                case 7:
                    i3 = b.d(parcel, a);
                    break;
                case 8:
                    z2 = b.c(parcel, a);
                    break;
                case 9:
                    str = b.k(parcel, a);
                    break;
                case 10:
                    pdVar = (pd) b.a(parcel, a, pd.CREATOR);
                    break;
                case 11:
                    location = (Location) b.a(parcel, a, Location.CREATOR);
                    break;
                case 12:
                    str2 = b.k(parcel, a);
                    break;
                case 13:
                    bundle2 = b.m(parcel, a);
                    break;
                case 14:
                    bundle3 = b.m(parcel, a);
                    break;
                case 15:
                    list2 = b.r(parcel, a);
                    break;
                case 16:
                    str3 = b.k(parcel, a);
                    break;
                case 17:
                    str4 = b.k(parcel, a);
                    break;
                case 18:
                    z3 = b.c(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ns(i, j, bundle, i2, list, z, i3, z2, str, pdVar, location, str2, bundle2, bundle3, list2, str3, str4, z3);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public ns[] a(int i) {
        return new ns[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
