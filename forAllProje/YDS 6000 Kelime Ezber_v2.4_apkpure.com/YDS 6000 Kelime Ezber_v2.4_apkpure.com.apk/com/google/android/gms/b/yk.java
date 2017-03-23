package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class yk implements Creator<yj> {
    static void a(yj yjVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, yjVar.a);
        c.a(parcel, 2, yjVar.b, false);
        c.a(parcel, 3, yjVar.c);
        c.a(parcel, a);
    }

    public yj a(Parcel parcel) {
        int i = 0;
        int b = b.b(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i2 = b.d(parcel, a);
                    break;
                case 2:
                    str = b.k(parcel, a);
                    break;
                case 3:
                    i = b.d(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new yj(i2, str, i);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public yj[] a(int i) {
        return new yj[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
