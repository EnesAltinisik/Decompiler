package com.google.android.gms.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class dy implements Creator<dx> {
    static void a(dx dxVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, dxVar.a);
        c.a(parcel, 2, dxVar.b());
        c.a(parcel, 3, dxVar.c(), i, false);
        c.a(parcel, a);
    }

    public dx a(Parcel parcel) {
        int i = 0;
        int b = b.b(parcel);
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i2 = b.d(parcel, a);
                    break;
                case 2:
                    i = b.d(parcel, a);
                    break;
                case 3:
                    intent = (Intent) b.a(parcel, a, Intent.CREATOR);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new dx(i2, i, intent);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public dx[] a(int i) {
        return new dx[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
