package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.List;

public class d implements Creator<c> {
    static void a(c cVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, cVar.a);
        c.a(parcel, 2, cVar.b, i, false);
        c.a(parcel, 3, cVar.c);
        c.a(parcel, 4, cVar.d, false);
        c.a(parcel, 5, cVar.e);
        c.a(parcel, 6, cVar.f, false);
        c.a(parcel, 7, cVar.g, false);
        c.a(parcel, a);
    }

    public c a(Parcel parcel) {
        boolean z = false;
        String str = null;
        int b = b.b(parcel);
        String str2 = null;
        List list = null;
        int i = 0;
        f fVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i2 = b.d(parcel, a);
                    break;
                case 2:
                    fVar = (f) b.a(parcel, a, f.CREATOR);
                    break;
                case 3:
                    i = b.d(parcel, a);
                    break;
                case 4:
                    list = b.r(parcel, a);
                    break;
                case 5:
                    z = b.c(parcel, a);
                    break;
                case 6:
                    str2 = b.k(parcel, a);
                    break;
                case 7:
                    str = b.k(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new c(i2, fVar, i, list, z, str2, str);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public c[] a(int i) {
        return new c[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
