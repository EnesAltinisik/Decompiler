package com.google.android.gms.b;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class wr implements Creator<wq> {
    static void a(wq wqVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, wqVar.a);
        c.a(parcel, 2, wqVar.b, i, false);
        c.a(parcel, a);
    }

    public wq a(Parcel parcel) {
        int b = b.b(parcel);
        int i = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i = b.d(parcel, a);
                    break;
                case 2:
                    parcelFileDescriptor = (ParcelFileDescriptor) b.a(parcel, a, ParcelFileDescriptor.CREATOR);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new wq(i, parcelFileDescriptor);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public wq[] a(int i) {
        return new wq[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
