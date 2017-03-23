package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.internal.TransferProgressData;
import java.util.List;

public class zzp implements Creator<TransferStateEvent> {
    static void zza(TransferStateEvent transferStateEvent, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, transferStateEvent.mVersionCode);
        zzb.zza(parcel, 2, transferStateEvent.zzaaR, false);
        zzb.zzc(parcel, 3, transferStateEvent.zzawu, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzaW(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzdc(i);
    }

    public TransferStateEvent zzaW(Parcel parcel) {
        List list = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 3:
                    list = zza.zzc(parcel, zzap, TransferProgressData.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new TransferStateEvent(i, str, list);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public TransferStateEvent[] zzdc(int i) {
        return new TransferStateEvent[i];
    }
}
