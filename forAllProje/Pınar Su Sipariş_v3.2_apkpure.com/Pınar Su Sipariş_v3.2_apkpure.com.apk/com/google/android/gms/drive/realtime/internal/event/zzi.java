package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi implements Creator<ValuesAddedDetails> {
    static void zza(ValuesAddedDetails valuesAddedDetails, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, valuesAddedDetails.mVersionCode);
        zzb.zzc(parcel, 2, valuesAddedDetails.mIndex);
        zzb.zzc(parcel, 3, valuesAddedDetails.zzaBq);
        zzb.zzc(parcel, 4, valuesAddedDetails.zzaBr);
        zzb.zza(parcel, 5, valuesAddedDetails.zzaBP, false);
        zzb.zzc(parcel, 6, valuesAddedDetails.zzaBQ);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzcK(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzeW(i);
    }

    public ValuesAddedDetails zzcK(Parcel parcel) {
        int i = 0;
        int zzaq = zza.zzaq(parcel);
        String str = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i5 = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    i4 = zza.zzg(parcel, zzap);
                    break;
                case 3:
                    i3 = zza.zzg(parcel, zzap);
                    break;
                case 4:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 5:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 6:
                    i = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new ValuesAddedDetails(i5, i4, i3, i2, str, i);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public ValuesAddedDetails[] zzeW(int i) {
        return new ValuesAddedDetails[i];
    }
}
