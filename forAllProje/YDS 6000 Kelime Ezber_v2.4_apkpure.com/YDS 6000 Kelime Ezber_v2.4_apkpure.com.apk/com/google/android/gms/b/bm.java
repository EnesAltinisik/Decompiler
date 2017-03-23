package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class bm implements Creator<bl> {
    static void a(bl blVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, blVar.a);
        c.a(parcel, 2, blVar.b, false);
        c.a(parcel, 3, blVar.c, false);
        c.a(parcel, a);
    }

    public bl a(Parcel parcel) {
        String str = null;
        int b = b.b(parcel);
        int i = 0;
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
                    str = b.k(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new bl(i, str2, str);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public bl[] a(int i) {
        return new bl[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
