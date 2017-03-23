package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.List;

public class a implements Creator<GoogleSignInAccount> {
    static void a(GoogleSignInAccount googleSignInAccount, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, googleSignInAccount.b);
        c.a(parcel, 2, googleSignInAccount.a(), false);
        c.a(parcel, 3, googleSignInAccount.b(), false);
        c.a(parcel, 4, googleSignInAccount.c(), false);
        c.a(parcel, 5, googleSignInAccount.d(), false);
        c.a(parcel, 6, googleSignInAccount.g(), i, false);
        c.a(parcel, 7, googleSignInAccount.h(), false);
        c.a(parcel, 8, googleSignInAccount.i());
        c.a(parcel, 9, googleSignInAccount.j(), false);
        c.b(parcel, 10, googleSignInAccount.c, false);
        c.a(parcel, 11, googleSignInAccount.e(), false);
        c.a(parcel, 12, googleSignInAccount.f(), false);
        c.a(parcel, a);
    }

    public GoogleSignInAccount a(Parcel parcel) {
        int b = b.b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        long j = 0;
        String str6 = null;
        List list = null;
        String str7 = null;
        String str8 = null;
        while (parcel.dataPosition() < b) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i = b.d(parcel, a);
                    break;
                case 2:
                    str = b.k(parcel, a);
                    break;
                case 3:
                    str2 = b.k(parcel, a);
                    break;
                case 4:
                    str3 = b.k(parcel, a);
                    break;
                case 5:
                    str4 = b.k(parcel, a);
                    break;
                case 6:
                    uri = (Uri) b.a(parcel, a, Uri.CREATOR);
                    break;
                case 7:
                    str5 = b.k(parcel, a);
                    break;
                case 8:
                    j = b.f(parcel, a);
                    break;
                case 9:
                    str6 = b.k(parcel, a);
                    break;
                case 10:
                    list = b.c(parcel, a, Scope.CREATOR);
                    break;
                case 11:
                    str7 = b.k(parcel, a);
                    break;
                case 12:
                    str8 = b.k(parcel, a);
                    break;
                default:
                    b.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, list, str7, str8);
        }
        throw new com.google.android.gms.common.internal.safeparcel.b.a("Overread allowed size end=" + b, parcel);
    }

    public GoogleSignInAccount[] a(int i) {
        return new GoogleSignInAccount[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
