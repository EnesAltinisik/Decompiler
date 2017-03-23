package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.messages.Message;

public class zzn implements Creator<MessageWrapper> {
    static void zza(MessageWrapper messageWrapper, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, messageWrapper.zzbjL, i, false);
        zzb.zzc(parcel, 1000, messageWrapper.mVersionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgK(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzke(i);
    }

    public MessageWrapper zzgK(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        Message message = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    message = (Message) zza.zza(parcel, zzap, Message.CREATOR);
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
            return new MessageWrapper(i, message);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public MessageWrapper[] zzke(int i) {
        return new MessageWrapper[i];
    }
}
