package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class xx implements Creator<xw> {
    static void a(xw xwVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, xwVar.a);
        c.a(parcel, 2, xwVar.b, i, false);
        c.a(parcel, 3, xwVar.c, false);
        c.a(parcel, a);
    }

    public xw a(Parcel parcel) {
        String str = null;
        int b = b.b(parcel);
        int i = 0;
        ns nsVar = null;
        while (parcel.dataPosition() < b) {
            ns nsVar2;
            int d;
            String str2;
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    String str3 = str;
                    nsVar2 = nsVar;
                    d = b.d(parcel, a);
                    str2 = str3;
                    break;
                case 2:
                    d = i;
                    ns nsVar3 = (ns) b.a(parcel, a, ns.CREATOR);
                    str2 = str;
                    nsVar2 = nsVar3;
                    break;
                case 3:
                    str2 = b.k(parcel, a);
                    nsVar2 = nsVar;
                    d = i;
                    break;
                default:
                    b.b(parcel, a);
                    str2 = str;
                    nsVar2 = nsVar;
                    d = i;
                    break;
            }
            i = d;
            nsVar = nsVar2;
            str = str2;
        }
        if (parcel.dataPosition() == b) {
            return new xw(i, nsVar, str);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public xw[] a(int i) {
        return new xw[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
