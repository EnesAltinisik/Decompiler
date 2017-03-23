package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.List;

public class eb implements Creator<ea> {
    static void a(ea eaVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, eaVar.a);
        c.a(parcel, 2, eaVar.b);
        c.b(parcel, 3, eaVar.c, false);
        c.a(parcel, a);
    }

    public ea a(Parcel parcel) {
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
                    list = b.c(parcel, a, Scope.CREATOR);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ea(i, z, list);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public ea[] a(int i) {
        return new ea[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
