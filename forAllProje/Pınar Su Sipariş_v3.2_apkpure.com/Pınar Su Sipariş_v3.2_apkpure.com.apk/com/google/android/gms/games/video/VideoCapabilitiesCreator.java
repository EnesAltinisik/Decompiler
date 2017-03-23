package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class VideoCapabilitiesCreator implements Creator<VideoCapabilities> {
    static void zza(VideoCapabilities videoCapabilities, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, videoCapabilities.isCameraSupported());
        zzb.zza(parcel, 2, videoCapabilities.isMicSupported());
        zzb.zza(parcel, 3, videoCapabilities.isWriteStorageSupported());
        zzb.zza(parcel, 4, videoCapabilities.zzBE(), false);
        zzb.zza(parcel, 5, videoCapabilities.zzBF(), false);
        zzb.zzc(parcel, 1000, videoCapabilities.getVersionCode());
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzeJ(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzhA(i);
    }

    public VideoCapabilities zzeJ(Parcel parcel) {
        boolean[] zArr = null;
        boolean z = false;
        int zzaq = zza.zzaq(parcel);
        boolean[] zArr2 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    z3 = zza.zzc(parcel, zzap);
                    break;
                case 2:
                    z2 = zza.zzc(parcel, zzap);
                    break;
                case 3:
                    z = zza.zzc(parcel, zzap);
                    break;
                case 4:
                    zArr2 = zza.zzv(parcel, zzap);
                    break;
                case 5:
                    zArr = zza.zzv(parcel, zzap);
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
            return new VideoCapabilities(i, z3, z2, z, zArr2, zArr);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public VideoCapabilities[] zzhA(int i) {
        return new VideoCapabilities[i];
    }
}
