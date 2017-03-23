package com.google.firebase.crash.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc implements Creator<FirebaseCrashOptions> {
    static void zza(FirebaseCrashOptions firebaseCrashOptions, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, firebaseCrashOptions.mVersionCode);
        zzb.zza(parcel, 2, firebaseCrashOptions.zzPb(), false);
        zzb.zza(parcel, 3, firebaseCrashOptions.getApiKey(), false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzjt(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zznv(i);
    }

    public FirebaseCrashOptions zzjt(Parcel parcel) {
        String str = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 3:
                    str = zza.zzq(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new FirebaseCrashOptions(i, str2, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public FirebaseCrashOptions[] zznv(int i) {
        return new FirebaseCrashOptions[i];
    }
}
