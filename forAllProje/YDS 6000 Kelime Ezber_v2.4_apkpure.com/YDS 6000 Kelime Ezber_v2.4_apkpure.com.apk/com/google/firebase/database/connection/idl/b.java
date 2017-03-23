package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.List;

public class b implements Creator<a> {
    static void a(a aVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, aVar.a);
        c.a(parcel, 2, aVar.b, false);
        c.a(parcel, 3, aVar.c, false);
        c.a(parcel, a);
    }

    public a a(Parcel parcel) {
        List list = null;
        int b = com.google.android.gms.common.internal.safeparcel.b.b(parcel);
        int i = 0;
        List list2 = null;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.b.a(a)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.b.d(parcel, a);
                    break;
                case 2:
                    list2 = com.google.android.gms.common.internal.safeparcel.b.r(parcel, a);
                    break;
                case 3:
                    list = com.google.android.gms.common.internal.safeparcel.b.r(parcel, a);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new a(i, list2, list);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public a[] a(int i) {
        return new a[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
