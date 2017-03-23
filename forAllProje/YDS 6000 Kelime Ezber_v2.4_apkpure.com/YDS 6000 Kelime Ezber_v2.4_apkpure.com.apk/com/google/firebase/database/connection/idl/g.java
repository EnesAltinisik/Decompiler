package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class g implements Creator<f> {
    static void a(f fVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, fVar.a);
        c.a(parcel, 2, fVar.b, false);
        c.a(parcel, 3, fVar.c, false);
        c.a(parcel, 4, fVar.d);
        c.a(parcel, a);
    }

    public f a(Parcel parcel) {
        String str = null;
        boolean z = false;
        int b = b.b(parcel);
        String str2 = null;
        int i = 0;
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
                case 4:
                    z = b.c(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new f(i, str2, str, z);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public f[] a(int i) {
        return new f[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
