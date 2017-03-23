package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzab implements Creator<SessionStopRequest> {
    static void zza(SessionStopRequest sessionStopRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, sessionStopRequest.getName(), false);
        zzb.zza(parcel, 2, sessionStopRequest.getIdentifier(), false);
        zzb.zza(parcel, 3, sessionStopRequest.getCallbackBinder(), false);
        zzb.zzc(parcel, 1000, sessionStopRequest.getVersionCode());
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzdG(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzfX(i);
    }

    public SessionStopRequest zzdG(Parcel parcel) {
        IBinder iBinder = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 2:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 3:
                    iBinder = zza.zzr(parcel, zzap);
                    break;
                case 1000:
                    i = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new SessionStopRequest(i, str2, str, iBinder);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public SessionStopRequest[] zzfX(int i) {
        return new SessionStopRequest[i];
    }
}
