package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.internal.TransferProgressData;

public class zzn implements Creator<TransferProgressEvent> {
    static void zza(TransferProgressEvent transferProgressEvent, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, transferProgressEvent.mVersionCode);
        zzb.zza(parcel, 2, transferProgressEvent.zzaws, i, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzaU(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzda(i);
    }

    public TransferProgressEvent zzaU(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        TransferProgressData transferProgressData = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    transferProgressData = (TransferProgressData) zza.zza(parcel, zzap, TransferProgressData.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new TransferProgressEvent(i, transferProgressData);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public TransferProgressEvent[] zzda(int i) {
        return new TransferProgressEvent[i];
    }
}
