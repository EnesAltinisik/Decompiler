package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzv implements Creator<UnpublishRequest> {
    static void zza(UnpublishRequest unpublishRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, unpublishRequest.mVersionCode);
        zzb.zza(parcel, 2, unpublishRequest.zzbki, i, false);
        zzb.zza(parcel, 3, unpublishRequest.zzHy(), false);
        zzb.zza(parcel, 4, unpublishRequest.zzbiR, false);
        zzb.zza(parcel, 5, unpublishRequest.zzbjE, false);
        zzb.zza(parcel, 6, unpublishRequest.zzbiS);
        zzb.zza(parcel, 7, unpublishRequest.zzbjJ, i, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgO(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkj(i);
    }

    public UnpublishRequest zzgO(Parcel parcel) {
        boolean z = false;
        ClientAppContext clientAppContext = null;
        int zzaq = zza.zzaq(parcel);
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        MessageWrapper messageWrapper = null;
        int i = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    messageWrapper = (MessageWrapper) zza.zza(parcel, zzap, MessageWrapper.CREATOR);
                    break;
                case 3:
                    iBinder = zza.zzr(parcel, zzap);
                    break;
                case 4:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 5:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 6:
                    z = zza.zzc(parcel, zzap);
                    break;
                case 7:
                    clientAppContext = (ClientAppContext) zza.zza(parcel, zzap, ClientAppContext.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new UnpublishRequest(i, messageWrapper, iBinder, str2, str, z, clientAppContext);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public UnpublishRequest[] zzkj(int i) {
        return new UnpublishRequest[i];
    }
}
