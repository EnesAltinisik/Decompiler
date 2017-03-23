package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class bo implements Creator<bn> {
    static void a(bn bnVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, bnVar.a);
        c.a(parcel, 2, bnVar.a(), false);
        c.a(parcel, a);
    }

    public bn a(Parcel parcel) {
        int b = b.b(parcel);
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i = b.d(parcel, a);
                    break;
                case 2:
                    bArr = b.n(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new bn(i, bArr);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public bn[] a(int i) {
        return new bn[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
