package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.List;

public class yn implements Creator<ym> {
    static void a(ym ymVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, ymVar.a);
        c.a(parcel, 2, ymVar.b, false);
        c.a(parcel, 3, ymVar.c, false);
        c.a(parcel, 4, ymVar.d);
        c.a(parcel, 5, ymVar.e);
        c.a(parcel, 6, ymVar.f, false);
        c.a(parcel, a);
    }

    public ym a(Parcel parcel) {
        List list = null;
        boolean z = false;
        int b = b.b(parcel);
        boolean z2 = false;
        String str = null;
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
                    z2 = b.c(parcel, a);
                    break;
                case 5:
                    z = b.c(parcel, a);
                    break;
                case 6:
                    list = b.r(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ym(i, str2, str, z2, z, list);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public ym[] a(int i) {
        return new ym[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
