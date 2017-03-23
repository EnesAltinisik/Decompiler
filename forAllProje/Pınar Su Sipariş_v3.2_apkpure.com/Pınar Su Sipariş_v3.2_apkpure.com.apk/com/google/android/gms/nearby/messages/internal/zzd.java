package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd implements Creator<GetPermissionStatusRequest> {
    static void zza(GetPermissionStatusRequest getPermissionStatusRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, getPermissionStatusRequest.mVersionCode);
        zzb.zza(parcel, 2, getPermissionStatusRequest.zzHy(), false);
        zzb.zza(parcel, 3, getPermissionStatusRequest.zzbiR, false);
        zzb.zza(parcel, 4, getPermissionStatusRequest.zzbjJ, i, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgH(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkb(i);
    }

    public GetPermissionStatusRequest zzgH(Parcel parcel) {
        ClientAppContext clientAppContext = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        String str = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    iBinder = zza.zzr(parcel, zzap);
                    break;
                case 3:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 4:
                    clientAppContext = (ClientAppContext) zza.zza(parcel, zzap, ClientAppContext.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new GetPermissionStatusRequest(i, iBinder, str, clientAppContext);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public GetPermissionStatusRequest[] zzkb(int i) {
        return new GetPermissionStatusRequest[i];
    }
}
