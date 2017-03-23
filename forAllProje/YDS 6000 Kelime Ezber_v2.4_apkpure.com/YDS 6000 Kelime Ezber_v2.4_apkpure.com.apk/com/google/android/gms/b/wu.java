package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class wu implements Creator<wt> {
    static void a(wt wtVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, wtVar.a);
        c.a(parcel, 2, wtVar.b, false);
        c.a(parcel, a);
    }

    public wt a(Parcel parcel) {
        int b = b.b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i = b.d(parcel, a);
                    break;
                case 2:
                    str = b.k(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new wt(i, str);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public wt[] a(int i) {
        return new wt[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
