package com.google.android.gms.b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class cg implements Creator<ce> {
    static void a(ce ceVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, ceVar.a);
        c.a(parcel, 2, ceVar.b(), false);
        c.a(parcel, a);
    }

    public ce a(Parcel parcel) {
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
            return new ce(i, bundle);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public ce[] a(int i) {
        return new ce[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
