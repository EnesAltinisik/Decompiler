package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc implements Creator<SignInAccount> {
    static void zza(SignInAccount signInAccount, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, signInAccount.versionCode);
        zzb.zza(parcel, 4, signInAccount.zzacn, false);
        zzb.zza(parcel, 7, signInAccount.zzpp(), i, false);
        zzb.zza(parcel, 8, signInAccount.zzVA, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzT(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzba(i);
    }

    public SignInAccount zzT(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = "";
        while (parcel.dataPosition() < zzaq) {
            GoogleSignInAccount googleSignInAccount2;
            String str3;
            int zzg;
            String str4;
            int zzap = zza.zzap(parcel);
            String str5;
            switch (zza.zzcj(zzap)) {
                case 1:
                    str5 = str2;
                    googleSignInAccount2 = googleSignInAccount;
                    str3 = str;
                    zzg = zza.zzg(parcel, zzap);
                    str4 = str5;
                    break;
                case 4:
                    zzg = i;
                    GoogleSignInAccount googleSignInAccount3 = googleSignInAccount;
                    str3 = zza.zzq(parcel, zzap);
                    str4 = str2;
                    googleSignInAccount2 = googleSignInAccount3;
                    break;
                case 7:
                    str3 = str;
                    zzg = i;
                    str5 = str2;
                    googleSignInAccount2 = (GoogleSignInAccount) zza.zza(parcel, zzap, GoogleSignInAccount.CREATOR);
                    str4 = str5;
                    break;
                case 8:
                    str4 = zza.zzq(parcel, zzap);
                    googleSignInAccount2 = googleSignInAccount;
                    str3 = str;
                    zzg = i;
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    str4 = str2;
                    googleSignInAccount2 = googleSignInAccount;
                    str3 = str;
                    zzg = i;
                    break;
            }
            i = zzg;
            str = str3;
            googleSignInAccount = googleSignInAccount2;
            str2 = str4;
        }
        if (parcel.dataPosition() == zzaq) {
            return new SignInAccount(i, str, googleSignInAccount, str2);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public SignInAccount[] zzba(int i) {
        return new SignInAccount[i];
    }
}
