package com.google.android.gms.b;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class ef implements Creator<ee> {
    static void a(ee eeVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, eeVar.a);
        c.a(parcel, 2, eeVar.a(), i, false);
        c.a(parcel, 3, eeVar.b(), i, false);
        c.a(parcel, 4, eeVar.c(), false);
        c.a(parcel, a);
    }

    public ee a(Parcel parcel) {
        String str = null;
        int b = b.b(parcel);
        int i = 0;
        Scope[] scopeArr = null;
        Account account = null;
        while (parcel.dataPosition() < b) {
            Scope[] scopeArr2;
            Account account2;
            int d;
            String str2;
            int a = b.a(parcel);
            String str3;
            switch (b.a(a)) {
                case 1:
                    str3 = str;
                    scopeArr2 = scopeArr;
                    account2 = account;
                    d = b.d(parcel, a);
                    str2 = str3;
                    break;
                case 2:
                    d = i;
                    Scope[] scopeArr3 = scopeArr;
                    account2 = (Account) b.a(parcel, a, Account.CREATOR);
                    str2 = str;
                    scopeArr2 = scopeArr3;
                    break;
                case 3:
                    account2 = account;
                    d = i;
                    str3 = str;
                    scopeArr2 = (Scope[]) b.b(parcel, a, Scope.CREATOR);
                    str2 = str3;
                    break;
                case 4:
                    str2 = b.k(parcel, a);
                    scopeArr2 = scopeArr;
                    account2 = account;
                    d = i;
                    break;
                default:
                    b.b(parcel, a);
                    str2 = str;
                    scopeArr2 = scopeArr;
                    account2 = account;
                    d = i;
                    break;
            }
            i = d;
            account = account2;
            scopeArr = scopeArr2;
            str = str2;
        }
        if (parcel.dataPosition() == b) {
            return new ee(i, account, scopeArr, str);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public ee[] a(int i) {
        return new ee[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
