package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class f implements Creator<b> {
    static void a(b bVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, bVar.a);
        c.a(parcel, 2, bVar.b, false);
        c.a(parcel, a);
    }

    public b a(Parcel parcel) {
        int b = b.b(parcel);
        int i = 0;
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i = b.d(parcel, a);
                    break;
                case 2:
                    bundle = b.m(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new b(i, bundle);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public b[] a(int i) {
        return new b[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
