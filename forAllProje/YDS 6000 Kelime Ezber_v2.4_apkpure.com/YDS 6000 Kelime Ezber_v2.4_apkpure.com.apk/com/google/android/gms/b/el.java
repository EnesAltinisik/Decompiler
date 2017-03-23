package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.a;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public class el implements Creator<ek> {
    static void a(ek ekVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, ekVar.a);
        c.a(parcel, 2, ekVar.a(), i, false);
        c.a(parcel, 3, ekVar.b(), i, false);
        c.a(parcel, a);
    }

    public ek a(Parcel parcel) {
        f fVar = null;
        int b = b.b(parcel);
        int i = 0;
        a aVar = null;
        while (parcel.dataPosition() < b) {
            a aVar2;
            int d;
            f fVar2;
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    f fVar3 = fVar;
                    aVar2 = aVar;
                    d = b.d(parcel, a);
                    fVar2 = fVar3;
                    break;
                case 2:
                    d = i;
                    a aVar3 = (a) b.a(parcel, a, a.CREATOR);
                    fVar2 = fVar;
                    aVar2 = aVar3;
                    break;
                case 3:
                    fVar2 = (f) b.a(parcel, a, f.CREATOR);
                    aVar2 = aVar;
                    d = i;
                    break;
                default:
                    b.b(parcel, a);
                    fVar2 = fVar;
                    aVar2 = aVar;
                    d = i;
                    break;
            }
            i = d;
            aVar = aVar2;
            fVar = fVar2;
        }
        if (parcel.dataPosition() == b) {
            return new ek(i, aVar, fVar);
        }
        throw new b.a("Overread allowed size end=" + b, parcel);
    }

    public ek[] a(int i) {
        return new ek[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
