package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class wn implements Creator<wm> {
    static void a(wm wmVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, wmVar.a);
        c.a(parcel, 2, wmVar.b);
        c.a(parcel, 3, wmVar.c);
        c.a(parcel, 4, wmVar.d);
        c.a(parcel, a);
    }

    public wm a(Parcel parcel) {
        boolean z = false;
        int b = b.b(parcel);
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i = b.d(parcel, a);
                    break;
                case 2:
                    z3 = b.c(parcel, a);
                    break;
                case 3:
                    z2 = b.c(parcel, a);
                    break;
                case 4:
                    z = b.c(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new wm(i, z3, z2, z);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public wm[] a(int i) {
        return new wm[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
