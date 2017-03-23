package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;

public class zzu implements Creator<SubscribeRequest> {
    static void zza(SubscribeRequest subscribeRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, subscribeRequest.mVersionCode);
        zzb.zza(parcel, 2, subscribeRequest.zzIa(), false);
        zzb.zza(parcel, 3, subscribeRequest.zzbkj, i, false);
        zzb.zza(parcel, 4, subscribeRequest.zzHy(), false);
        zzb.zza(parcel, 5, subscribeRequest.zzbkp, i, false);
        zzb.zza(parcel, 6, subscribeRequest.zzbkq, i, false);
        zzb.zzc(parcel, 7, subscribeRequest.zzbkr);
        zzb.zza(parcel, 8, subscribeRequest.zzbiR, false);
        zzb.zza(parcel, 9, subscribeRequest.zzbjE, false);
        zzb.zza(parcel, 10, subscribeRequest.zzbks, false);
        zzb.zza(parcel, 11, subscribeRequest.zzbkk);
        zzb.zza(parcel, 12, subscribeRequest.zzIb(), false);
        zzb.zza(parcel, 13, subscribeRequest.zzbiS);
        zzb.zza(parcel, 14, subscribeRequest.zzbjJ, i, false);
        zzb.zza(parcel, 15, subscribeRequest.zzbjk);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgN(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzki(i);
    }

    public SubscribeRequest zzgN(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        IBinder iBinder = null;
        Strategy strategy = null;
        IBinder iBinder2 = null;
        MessageFilter messageFilter = null;
        PendingIntent pendingIntent = null;
        int i2 = 0;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        boolean z = false;
        IBinder iBinder3 = null;
        boolean z2 = false;
        ClientAppContext clientAppContext = null;
        boolean z3 = false;
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
                    strategy = (Strategy) zza.zza(parcel, zzap, Strategy.CREATOR);
                    break;
                case 4:
                    iBinder2 = zza.zzr(parcel, zzap);
                    break;
                case 5:
                    messageFilter = (MessageFilter) zza.zza(parcel, zzap, MessageFilter.CREATOR);
                    break;
                case 6:
                    pendingIntent = (PendingIntent) zza.zza(parcel, zzap, PendingIntent.CREATOR);
                    break;
                case 7:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 8:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 9:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 10:
                    bArr = zza.zzt(parcel, zzap);
                    break;
                case 11:
                    z = zza.zzc(parcel, zzap);
                    break;
                case 12:
                    iBinder3 = zza.zzr(parcel, zzap);
                    break;
                case 13:
                    z2 = zza.zzc(parcel, zzap);
                    break;
                case 14:
                    clientAppContext = (ClientAppContext) zza.zza(parcel, zzap, ClientAppContext.CREATOR);
                    break;
                case 15:
                    z3 = zza.zzc(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new SubscribeRequest(i, iBinder, strategy, iBinder2, messageFilter, pendingIntent, i2, str, str2, bArr, z, iBinder3, z2, clientAppContext, z3);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public SubscribeRequest[] zzki(int i) {
        return new SubscribeRequest[i];
    }
}
