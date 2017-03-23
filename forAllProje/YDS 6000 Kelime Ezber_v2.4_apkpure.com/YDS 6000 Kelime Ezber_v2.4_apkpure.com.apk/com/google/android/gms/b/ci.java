package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class ci implements Creator<ch> {
    static void a(ch chVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, chVar.a);
        c.a(parcel, 2, chVar.b, false);
        c.a(parcel, 3, chVar.c, i, false);
        c.a(parcel, 4, chVar.d, false);
        c.a(parcel, 5, chVar.e);
        c.a(parcel, a);
    }

    public ch a(Parcel parcel) {
        String str = null;
        int b = b.b(parcel);
        int i = 0;
        long j = 0;
        ce ceVar = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i = b.d(parcel, a);
                    break;
                case 2:
                    str2 = b.k(parcel, a);
                    break;
                case 3:
                    ceVar = (ce) b.a(parcel, a, ce.CREATOR);
                    break;
                case 4:
                    str = b.k(parcel, a);
                    break;
                case 5:
                    j = b.f(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ch(i, str2, ceVar, str, j);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public ch[] a(int i) {
        return new ch[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
