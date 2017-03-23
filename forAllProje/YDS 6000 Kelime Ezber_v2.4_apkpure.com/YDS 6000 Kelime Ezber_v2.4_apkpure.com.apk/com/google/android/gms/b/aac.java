package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class aac implements Creator<aab> {
    static void a(aab com_google_android_gms_b_aab, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, com_google_android_gms_b_aab.a);
        c.a(parcel, 2, com_google_android_gms_b_aab.b, false);
        c.a(parcel, 3, com_google_android_gms_b_aab.c);
        c.a(parcel, 4, com_google_android_gms_b_aab.d);
        c.a(parcel, 5, com_google_android_gms_b_aab.e);
        c.a(parcel, a);
    }

    public aab a(Parcel parcel) {
        boolean z = false;
        int b = b.b(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i3 = b.d(parcel, a);
                    break;
                case 2:
                    str = b.k(parcel, a);
                    break;
                case 3:
                    i2 = b.d(parcel, a);
                    break;
                case 4:
                    i = b.d(parcel, a);
                    break;
                case 5:
                    z = b.c(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new aab(i3, str, i2, i, z);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public aab[] a(int i) {
        return new aab[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
