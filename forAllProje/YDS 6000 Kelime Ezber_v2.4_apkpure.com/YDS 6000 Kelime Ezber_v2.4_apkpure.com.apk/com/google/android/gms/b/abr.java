package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class abr implements Creator<abq> {
    static void a(abq com_google_android_gms_b_abq, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, com_google_android_gms_b_abq.a);
        c.a(parcel, 2, com_google_android_gms_b_abq.b, i, false);
        c.a(parcel, 3, com_google_android_gms_b_abq.c, false);
        c.a(parcel, 4, com_google_android_gms_b_abq.d, false);
        c.a(parcel, 5, com_google_android_gms_b_abq.e, false);
        c.a(parcel, 6, com_google_android_gms_b_abq.f, false);
        c.a(parcel, 7, com_google_android_gms_b_abq.g, false);
        c.a(parcel, 8, com_google_android_gms_b_abq.h);
        c.a(parcel, a);
    }

    public abq a(Parcel parcel) {
        byte[][] bArr = null;
        int b = b.b(parcel);
        int i = 0;
        boolean z = true;
        int[] iArr = null;
        String[] strArr = null;
        int[] iArr2 = null;
        byte[] bArr2 = null;
        dr drVar = null;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i = b.d(parcel, a);
                    break;
                case 2:
                    drVar = (dr) b.a(parcel, a, dr.CREATOR);
                    break;
                case 3:
                    bArr2 = b.n(parcel, a);
                    break;
                case 4:
                    iArr2 = b.p(parcel, a);
                    break;
                case 5:
                    strArr = b.q(parcel, a);
                    break;
                case 6:
                    iArr = b.p(parcel, a);
                    break;
                case 7:
                    bArr = b.o(parcel, a);
                    break;
                case 8:
                    z = b.c(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new abq(i, drVar, bArr2, iArr2, strArr, iArr, bArr, z);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public abq[] a(int i) {
        return new abq[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
