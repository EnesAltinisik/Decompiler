package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.messages.Strategy;

public class zzs implements Creator<PublishRequest> {
    static void zza(PublishRequest publishRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, publishRequest.mVersionCode);
        zzb.zza(parcel, 2, publishRequest.zzbki, i, false);
        zzb.zza(parcel, 3, publishRequest.zzbkj, i, false);
        zzb.zza(parcel, 4, publishRequest.zzHy(), false);
        zzb.zza(parcel, 5, publishRequest.zzbiR, false);
        zzb.zza(parcel, 6, publishRequest.zzbjE, false);
        zzb.zza(parcel, 7, publishRequest.zzbkk);
        zzb.zza(parcel, 8, publishRequest.zzHY(), false);
        zzb.zza(parcel, 9, publishRequest.zzbiS);
        zzb.zza(parcel, 10, publishRequest.zzbjJ, i, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgL(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkg(i);
    }

    public PublishRequest zzgL(Parcel parcel) {
        boolean z = false;
        ClientAppContext clientAppContext = null;
        int zzaq = zza.zzaq(parcel);
        IBinder iBinder = null;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        IBinder iBinder2 = null;
        Strategy strategy = null;
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
                    strategy = (Strategy) zza.zza(parcel, zzap, Strategy.CREATOR);
                    break;
                case 4:
                    iBinder2 = zza.zzr(parcel, zzap);
                    break;
                case 5:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 6:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 7:
                    z2 = zza.zzc(parcel, zzap);
                    break;
                case 8:
                    iBinder = zza.zzr(parcel, zzap);
                    break;
                case 9:
                    z = zza.zzc(parcel, zzap);
                    break;
                case 10:
                    clientAppContext = (ClientAppContext) zza.zza(parcel, zzap, ClientAppContext.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new PublishRequest(i, messageWrapper, strategy, iBinder2, str2, str, z2, iBinder, z, clientAppContext);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public PublishRequest[] zzkg(int i) {
        return new PublishRequest[i];
    }
}
