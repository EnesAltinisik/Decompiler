package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class pi implements Creator<ph> {
    static void a(ph phVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, phVar.a);
        c.a(parcel, 2, phVar.b);
        c.a(parcel, a);
    }

    public ph a(Parcel parcel) {
        boolean z = false;
        int b = b.b(parcel);
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
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ph(i, z);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public ph[] a(int i) {
        return new ph[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
