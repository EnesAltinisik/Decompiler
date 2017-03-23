package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;

public class b implements Creator<GoogleSignInOptions> {
    static void a(GoogleSignInOptions googleSignInOptions, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, googleSignInOptions.e);
        c.b(parcel, 2, googleSignInOptions.a(), false);
        c.a(parcel, 3, googleSignInOptions.b(), i, false);
        c.a(parcel, 4, googleSignInOptions.c());
        c.a(parcel, 5, googleSignInOptions.d());
        c.a(parcel, 6, googleSignInOptions.e());
        c.a(parcel, 7, googleSignInOptions.f(), false);
        c.a(parcel, 8, googleSignInOptions.g(), false);
        c.a(parcel, a);
    }

    public GoogleSignInOptions a(Parcel parcel) {
        String str = null;
        boolean z = false;
        int b = com.google.android.gms.common.internal.safeparcel.b.b(parcel);
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        Account account = null;
        ArrayList arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.b.a(a)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.b.d(parcel, a);
                    break;
                case 2:
                    arrayList = com.google.android.gms.common.internal.safeparcel.b.c(parcel, a, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) com.google.android.gms.common.internal.safeparcel.b.a(parcel, a, Account.CREATOR);
                    break;
                case 4:
                    z3 = com.google.android.gms.common.internal.safeparcel.b.c(parcel, a);
                    break;
                case 5:
                    z2 = com.google.android.gms.common.internal.safeparcel.b.c(parcel, a);
                    break;
                case 6:
                    z = com.google.android.gms.common.internal.safeparcel.b.c(parcel, a);
                    break;
                case 7:
                    str2 = com.google.android.gms.common.internal.safeparcel.b.k(parcel, a);
                    break;
                case 8:
                    str = com.google.android.gms.common.internal.safeparcel.b.k(parcel, a);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GoogleSignInOptions(i, arrayList, account, z3, z2, z, str2, str);
        }
        throw new a("Overread allowed size end=" + b, parcel);
    }

    public GoogleSignInOptions[] a(int i) {
        return new GoogleSignInOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
