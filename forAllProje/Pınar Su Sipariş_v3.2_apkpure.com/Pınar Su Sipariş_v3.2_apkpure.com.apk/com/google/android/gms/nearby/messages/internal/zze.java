package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze implements Creator<HandleClientLifecycleEventRequest> {
    static void zza(HandleClientLifecycleEventRequest handleClientLifecycleEventRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, handleClientLifecycleEventRequest.versionCode);
        zzb.zza(parcel, 2, handleClientLifecycleEventRequest.zzbjJ, i, false);
        zzb.zzc(parcel, 3, handleClientLifecycleEventRequest.zzbjK);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgI(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkc(i);
    }

    public HandleClientLifecycleEventRequest zzgI(Parcel parcel) {
        int i = 0;
        int zzaq = zza.zzaq(parcel);
        ClientAppContext clientAppContext = null;
        int i2 = 0;
        while (parcel.dataPosition() < zzaq) {
            ClientAppContext clientAppContext2;
            int zzg;
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    int i3 = i;
                    clientAppContext2 = clientAppContext;
                    zzg = zza.zzg(parcel, zzap);
                    zzap = i3;
                    break;
                case 2:
                    zzg = i2;
                    ClientAppContext clientAppContext3 = (ClientAppContext) zza.zza(parcel, zzap, ClientAppContext.CREATOR);
                    zzap = i;
                    clientAppContext2 = clientAppContext3;
                    break;
                case 3:
                    zzap = zza.zzg(parcel, zzap);
                    clientAppContext2 = clientAppContext;
                    zzg = i2;
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    zzap = i;
                    clientAppContext2 = clientAppContext;
                    zzg = i2;
                    break;
            }
            i2 = zzg;
            clientAppContext = clientAppContext2;
            i = zzap;
        }
        if (parcel.dataPosition() == zzaq) {
            return new HandleClientLifecycleEventRequest(i2, clientAppContext, i);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public HandleClientLifecycleEventRequest[] zzkc(int i) {
        return new HandleClientLifecycleEventRequest[i];
    }
}
