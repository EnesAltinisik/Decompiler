package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class t implements Creator<s> {
    static void a(s sVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, sVar.a);
        c.a(parcel, 2, sVar.b);
        c.a(parcel, 3, sVar.c);
        c.a(parcel, 4, sVar.d, false);
        c.a(parcel, 5, sVar.e, false);
        c.a(parcel, 6, sVar.f, i, false);
        c.a(parcel, 7, sVar.g, false);
        c.a(parcel, 8, sVar.h, i, false);
        c.a(parcel, 9, sVar.i);
        c.a(parcel, a);
    }

    public s a(Parcel parcel) {
        int i = 0;
        Account account = null;
        int b = b.b(parcel);
        long j = 0;
        Bundle bundle = null;
        Scope[] scopeArr = null;
        IBinder iBinder = null;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i3 = b.d(parcel, a);
                    break;
                case 2:
                    i2 = b.d(parcel, a);
                    break;
                case 3:
                    i = b.d(parcel, a);
                    break;
                case 4:
                    str = b.k(parcel, a);
                    break;
                case 5:
                    iBinder = b.l(parcel, a);
                    break;
                case 6:
                    scopeArr = (Scope[]) b.b(parcel, a, Scope.CREATOR);
                    break;
                case 7:
                    bundle = b.m(parcel, a);
                    break;
                case 8:
                    account = (Account) b.a(parcel, a, Account.CREATOR);
                    break;
                case 9:
                    j = b.f(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new s(i3, i2, i, str, iBinder, scopeArr, bundle, account, j);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public s[] a(int i) {
        return new s[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
