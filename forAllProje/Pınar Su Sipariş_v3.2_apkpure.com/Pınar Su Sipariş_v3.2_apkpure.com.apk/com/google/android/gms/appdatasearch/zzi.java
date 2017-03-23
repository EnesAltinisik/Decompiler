package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi implements Creator<RegisterSectionInfo> {
    static void zza(RegisterSectionInfo registerSectionInfo, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, registerSectionInfo.name, false);
        zzb.zza(parcel, 2, registerSectionInfo.zzZW, false);
        zzb.zza(parcel, 3, registerSectionInfo.zzZX);
        zzb.zzc(parcel, 4, registerSectionInfo.weight);
        zzb.zza(parcel, 5, registerSectionInfo.zzZY);
        zzb.zza(parcel, 6, registerSectionInfo.zzZZ, false);
        zzb.zza(parcel, 7, registerSectionInfo.zzaaa, i, false);
        zzb.zzc(parcel, 1000, registerSectionInfo.mVersionCode);
        zzb.zza(parcel, 8, registerSectionInfo.zzaab, false);
        zzb.zza(parcel, 11, registerSectionInfo.zzaac, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzz(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzaE(i);
    }

    public RegisterSectionInfo[] zzaE(int i) {
        return new RegisterSectionInfo[i];
    }

    public RegisterSectionInfo zzz(Parcel parcel) {
        boolean z = false;
        String str = null;
        int zzaq = zza.zzaq(parcel);
        int i = 1;
        int[] iArr = null;
        Feature[] featureArr = null;
        String str2 = null;
        boolean z2 = false;
        String str3 = null;
        String str4 = null;
        int i2 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    str4 = zza.zzq(parcel, zzap);
                    break;
                case 2:
                    str3 = zza.zzq(parcel, zzap);
                    break;
                case 3:
                    z2 = zza.zzc(parcel, zzap);
                    break;
                case 4:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 5:
                    z = zza.zzc(parcel, zzap);
                    break;
                case 6:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 7:
                    featureArr = (Feature[]) zza.zzb(parcel, zzap, Feature.CREATOR);
                    break;
                case 8:
                    iArr = zza.zzw(parcel, zzap);
                    break;
                case 11:
                    str = zza.zzq(parcel, zzap);
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
            return new RegisterSectionInfo(i2, str4, str3, z2, i, z, str2, featureArr, iArr, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }
}
