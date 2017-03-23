package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.firebase.appindexing.internal.ActionImpl.MetadataImpl;

public class zzb implements Creator<MetadataImpl> {
    static void zza(MetadataImpl metadataImpl, Parcel parcel, int i) {
        int zzar = com.google.android.gms.common.internal.safeparcel.zzb.zzar(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 1, metadataImpl.zzOd());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 2, metadataImpl.zzOe());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 3, metadataImpl.zzOf(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 4, metadataImpl.getAccountName(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 5, metadataImpl.zzOg(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 6, metadataImpl.zzOh());
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 1000, metadataImpl.mVersionCode);
        com.google.android.gms.common.internal.safeparcel.zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzjj(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zznj(i);
    }

    public MetadataImpl zzjj(Parcel parcel) {
        byte[] bArr = null;
        boolean z = false;
        int zzaq = zza.zzaq(parcel);
        String str = null;
        String str2 = null;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    z2 = zza.zzc(parcel, zzap);
                    break;
                case 3:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 4:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 5:
                    bArr = zza.zzt(parcel, zzap);
                    break;
                case 6:
                    z = zza.zzc(parcel, zzap);
                    break;
                case 1000:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new MetadataImpl(i2, i, z2, str2, str, bArr, z);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public MetadataImpl[] zznj(int i) {
        return new MetadataImpl[i];
    }
}
