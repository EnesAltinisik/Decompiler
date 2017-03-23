package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class d implements Creator<e> {
    static void a(e eVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, eVar.a);
        c.a(parcel, 2, eVar.b, false);
        c.a(parcel, 3, eVar.c, false);
        c.a(parcel, 4, eVar.d, false);
        c.a(parcel, 5, eVar.e, false);
        c.a(parcel, 6, eVar.f, false);
        c.a(parcel, 7, eVar.g, false);
        c.a(parcel, 8, eVar.h, false);
        c.a(parcel, 9, eVar.i, i, false);
        c.a(parcel, a);
    }

    public e a(Parcel parcel) {
        Intent intent = null;
        int b = b.b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i = b.d(parcel, a);
                    break;
                case 2:
                    str7 = b.k(parcel, a);
                    break;
                case 3:
                    str6 = b.k(parcel, a);
                    break;
                case 4:
                    str5 = b.k(parcel, a);
                    break;
                case 5:
                    str4 = b.k(parcel, a);
                    break;
                case 6:
                    str3 = b.k(parcel, a);
                    break;
                case 7:
                    str2 = b.k(parcel, a);
                    break;
                case 8:
                    str = b.k(parcel, a);
                    break;
                case 9:
                    intent = (Intent) b.a(parcel, a, Intent.CREATOR);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new e(i, str7, str6, str5, str4, str3, str2, str, intent);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public e[] a(int i) {
        return new e[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
