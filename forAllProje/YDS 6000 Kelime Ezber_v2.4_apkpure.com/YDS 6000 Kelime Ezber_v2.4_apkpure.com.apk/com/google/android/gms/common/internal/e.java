package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;

public class e implements Creator<d> {
    static void a(d dVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, dVar.a);
        c.a(parcel, 2, dVar.a(), i, false);
        c.a(parcel, 3, dVar.b());
        c.a(parcel, 4, dVar.c(), i, false);
        c.a(parcel, a);
    }

    public d a(Parcel parcel) {
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int b = b.b(parcel);
        Account account = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int i3;
            Account account2;
            int d;
            GoogleSignInAccount googleSignInAccount2;
            int a = b.a(parcel);
            GoogleSignInAccount googleSignInAccount3;
            switch (b.a(a)) {
                case 1:
                    googleSignInAccount3 = googleSignInAccount;
                    i3 = i;
                    account2 = account;
                    d = b.d(parcel, a);
                    googleSignInAccount2 = googleSignInAccount3;
                    break;
                case 2:
                    d = i2;
                    int i4 = i;
                    account2 = (Account) b.a(parcel, a, Account.CREATOR);
                    googleSignInAccount2 = googleSignInAccount;
                    i3 = i4;
                    break;
                case 3:
                    account2 = account;
                    d = i2;
                    googleSignInAccount3 = googleSignInAccount;
                    i3 = b.d(parcel, a);
                    googleSignInAccount2 = googleSignInAccount3;
                    break;
                case 4:
                    googleSignInAccount2 = (GoogleSignInAccount) b.a(parcel, a, GoogleSignInAccount.CREATOR);
                    i3 = i;
                    account2 = account;
                    d = i2;
                    break;
                default:
                    b.b(parcel, a);
                    googleSignInAccount2 = googleSignInAccount;
                    i3 = i;
                    account2 = account;
                    d = i2;
                    break;
            }
            i2 = d;
            account = account2;
            i = i3;
            googleSignInAccount = googleSignInAccount2;
        }
        if (parcel.dataPosition() == b) {
            return new d(i2, account, i, googleSignInAccount);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public d[] a(int i) {
        return new d[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
