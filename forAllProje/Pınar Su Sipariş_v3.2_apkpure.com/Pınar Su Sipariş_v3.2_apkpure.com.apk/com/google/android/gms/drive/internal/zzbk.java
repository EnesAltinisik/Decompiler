package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzbk implements Creator<ParcelableTransferPreferences> {
    static void zza(ParcelableTransferPreferences parcelableTransferPreferences, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, parcelableTransferPreferences.mVersionCode);
        zzb.zzc(parcel, 2, parcelableTransferPreferences.zzayh);
        zzb.zzc(parcel, 3, parcelableTransferPreferences.zzayi);
        zzb.zza(parcel, 4, parcelableTransferPreferences.zzayV);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzbP(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzea(i);
    }

    public ParcelableTransferPreferences zzbP(Parcel parcel) {
        boolean z = false;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i3 = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 3:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 4:
                    z = zza.zzc(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new ParcelableTransferPreferences(i3, i2, i, z);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public ParcelableTransferPreferences[] zzea(int i) {
        return new ParcelableTransferPreferences[i];
    }
}
