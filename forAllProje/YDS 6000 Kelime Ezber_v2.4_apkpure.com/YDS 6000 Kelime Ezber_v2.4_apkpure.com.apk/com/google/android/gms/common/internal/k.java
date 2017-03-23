package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class k implements Creator<j> {
    static void a(j jVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, jVar.a);
        c.a(parcel, a);
    }

    public j a(Parcel parcel) {
        int b = b.b(parcel);
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i = b.d(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new j(i);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public j[] a(int i) {
        return new j[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
