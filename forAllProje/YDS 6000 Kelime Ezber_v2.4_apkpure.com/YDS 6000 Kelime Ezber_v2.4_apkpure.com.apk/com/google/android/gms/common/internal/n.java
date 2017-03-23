package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class n implements Creator<m> {
    static void a(m mVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, mVar.a);
        c.a(parcel, 2, mVar.b, false);
        c.a(parcel, 3, mVar.c, i, false);
        c.a(parcel, 4, mVar.d, false);
        c.a(parcel, 5, mVar.e, false);
        c.a(parcel, a);
    }

    public m a(Parcel parcel) {
        Integer num = null;
        int b = b.b(parcel);
        int i = 0;
        Integer num2 = null;
        Scope[] scopeArr = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i = b.d(parcel, a);
                    break;
                case 2:
                    iBinder = b.l(parcel, a);
                    break;
                case 3:
                    scopeArr = (Scope[]) b.b(parcel, a, Scope.CREATOR);
                    break;
                case 4:
                    num2 = b.e(parcel, a);
                    break;
                case 5:
                    num = b.e(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new m(i, iBinder, scopeArr, num2, num);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public m[] a(int i) {
        return new m[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
