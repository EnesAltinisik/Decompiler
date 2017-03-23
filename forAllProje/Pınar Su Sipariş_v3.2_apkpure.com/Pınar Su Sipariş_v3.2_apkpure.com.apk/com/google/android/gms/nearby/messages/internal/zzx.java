package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.messages.Message;

public class zzx implements Creator<Update> {
    static void zza(Update update, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, update.mVersionCode);
        zzb.zzc(parcel, 2, update.zzbku);
        zzb.zza(parcel, 3, update.zzbjL, i, false);
        zzb.zza(parcel, 4, update.zzbkv, i, false);
        zzb.zza(parcel, 5, update.zzbkw, i, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgQ(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkm(i);
    }

    public Update zzgQ(Parcel parcel) {
        int i = 0;
        BleSignalImpl bleSignalImpl = null;
        int zzaq = zza.zzaq(parcel);
        DistanceImpl distanceImpl = null;
        Message message = null;
        int i2 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 3:
                    message = (Message) zza.zza(parcel, zzap, Message.CREATOR);
                    break;
                case 4:
                    distanceImpl = (DistanceImpl) zza.zza(parcel, zzap, DistanceImpl.CREATOR);
                    break;
                case 5:
                    bleSignalImpl = (BleSignalImpl) zza.zza(parcel, zzap, BleSignalImpl.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new Update(i2, i, message, distanceImpl, bleSignalImpl);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public Update[] zzkm(int i) {
        return new Update[i];
    }
}
