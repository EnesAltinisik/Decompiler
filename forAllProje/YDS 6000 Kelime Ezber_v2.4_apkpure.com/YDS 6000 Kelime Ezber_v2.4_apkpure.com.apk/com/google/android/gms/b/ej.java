package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class ej implements Creator<eh> {
    static void a(eh ehVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, ehVar.a);
        c.a(parcel, 2, ehVar.a(), i, false);
        c.a(parcel, a);
    }

    public eh a(Parcel parcel) {
        int b = b.b(parcel);
        int i = 0;
        d dVar = null;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i = b.d(parcel, a);
                    break;
                case 2:
                    dVar = (d) b.a(parcel, a, d.CREATOR);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new eh(i, dVar);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public eh[] a(int i) {
        return new eh[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
