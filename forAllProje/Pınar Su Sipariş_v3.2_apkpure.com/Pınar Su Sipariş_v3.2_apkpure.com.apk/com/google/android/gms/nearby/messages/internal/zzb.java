package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public class zzb implements Creator<ClientAppContext> {
    static void zza(ClientAppContext clientAppContext, Parcel parcel, int i) {
        int zzar = com.google.android.gms.common.internal.safeparcel.zzb.zzar(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 1, clientAppContext.versionCode);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 2, clientAppContext.zzbjE, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 3, clientAppContext.zzbjF, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 4, clientAppContext.zzbiS);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 5, clientAppContext.zzbjG);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 6, clientAppContext.zzbiU, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgF(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzjY(i);
    }

    public ClientAppContext zzgF(Parcel parcel) {
        String str = null;
        int i = 0;
        int zzaq = zza.zzaq(parcel);
        boolean z = false;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    str3 = zza.zzq(parcel, zzap);
                    break;
                case 3:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 4:
                    z = zza.zzc(parcel, zzap);
                    break;
                case 5:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 6:
                    str = zza.zzq(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new ClientAppContext(i2, str3, str2, z, i, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public ClientAppContext[] zzjY(int i) {
        return new ClientAppContext[i];
    }
}
