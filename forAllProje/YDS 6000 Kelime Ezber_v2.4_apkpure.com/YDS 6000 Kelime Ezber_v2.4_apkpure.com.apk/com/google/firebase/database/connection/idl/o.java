package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.List;

public class o implements Creator<n> {
    static void a(n nVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, nVar.a);
        c.a(parcel, 2, nVar.b, false);
        c.a(parcel, 3, nVar.c, false);
        c.a(parcel, a);
    }

    public n a(Parcel parcel) {
        List list = null;
        int b = b.b(parcel);
        int i = 0;
        List list2 = null;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i = b.d(parcel, a);
                    break;
                case 2:
                    list2 = b.r(parcel, a);
                    break;
                case 3:
                    list = b.r(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new n(i, list2, list);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public n[] a(int i) {
        return new n[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
