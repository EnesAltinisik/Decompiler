package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzw implements Creator<UnsubscribeRequest> {
    static void zza(UnsubscribeRequest unsubscribeRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, unsubscribeRequest.mVersionCode);
        zzb.zza(parcel, 2, unsubscribeRequest.zzIa(), false);
        zzb.zza(parcel, 3, unsubscribeRequest.zzHy(), false);
        zzb.zza(parcel, 4, unsubscribeRequest.zzbkq, i, false);
        zzb.zzc(parcel, 5, unsubscribeRequest.zzbkr);
        zzb.zza(parcel, 6, unsubscribeRequest.zzbiR, false);
        zzb.zza(parcel, 7, unsubscribeRequest.zzbjE, false);
        zzb.zza(parcel, 8, unsubscribeRequest.zzbiS);
        zzb.zza(parcel, 9, unsubscribeRequest.zzbjJ, i, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgP(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkk(i);
    }

    public UnsubscribeRequest zzgP(Parcel parcel) {
        boolean z = false;
        ClientAppContext clientAppContext = null;
        int zzaq = zza.zzaq(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        PendingIntent pendingIntent = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    iBinder2 = zza.zzr(parcel, zzap);
                    break;
                case 3:
                    iBinder = zza.zzr(parcel, zzap);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) zza.zza(parcel, zzap, PendingIntent.CREATOR);
                    break;
                case 5:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 6:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 7:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 8:
                    z = zza.zzc(parcel, zzap);
                    break;
                case 9:
                    clientAppContext = (ClientAppContext) zza.zza(parcel, zzap, ClientAppContext.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new UnsubscribeRequest(i2, iBinder2, iBinder, pendingIntent, i, str2, str, z, clientAppContext);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public UnsubscribeRequest[] zzkk(int i) {
        return new UnsubscribeRequest[i];
    }
}
