package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.List;

public class wl implements Creator<wk> {
    static void a(wk wkVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, wkVar.a);
        c.a(parcel, 2, wkVar.b);
        c.a(parcel, 3, wkVar.c, false);
        c.a(parcel, a);
    }

    public wk a(Parcel parcel) {
        boolean z = false;
        int b = b.b(parcel);
        List list = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i = b.d(parcel, a);
                    break;
                case 2:
                    z = b.c(parcel, a);
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
            return new wk(i, z, list);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public wk[] a(int i) {
        return new wk[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
