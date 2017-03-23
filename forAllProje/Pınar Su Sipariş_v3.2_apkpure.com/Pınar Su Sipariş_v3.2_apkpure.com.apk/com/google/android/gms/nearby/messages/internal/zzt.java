package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzt implements Creator<RegisterStatusCallbackRequest> {
    static void zza(RegisterStatusCallbackRequest registerStatusCallbackRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, registerStatusCallbackRequest.versionCode);
        zzb.zza(parcel, 2, registerStatusCallbackRequest.zzHy(), false);
        zzb.zza(parcel, 3, registerStatusCallbackRequest.zzHZ(), false);
        zzb.zza(parcel, 4, registerStatusCallbackRequest.zzbkn);
        zzb.zza(parcel, 5, registerStatusCallbackRequest.zzbiR, false);
        zzb.zza(parcel, 6, registerStatusCallbackRequest.zzbjJ, i, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgM(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkh(i);
    }

    public RegisterStatusCallbackRequest zzgM(Parcel parcel) {
        boolean z = false;
        ClientAppContext clientAppContext = null;
        int zzaq = zza.zzaq(parcel);
        String str = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    iBinder2 = zza.zzr(parcel, zzap);
                    break;
                case 3:
                    iBinder = zza.zzr(parcel, zzap);
                    break;
                case 4:
                    z = zza.zzc(parcel, zzap);
                    break;
                case 5:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 6:
                    clientAppContext = (ClientAppContext) zza.zza(parcel, zzap, ClientAppContext.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new RegisterStatusCallbackRequest(i, iBinder2, iBinder, z, str, clientAppContext);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public RegisterStatusCallbackRequest[] zzkh(int i) {
        return new RegisterStatusCallbackRequest[i];
    }
}
