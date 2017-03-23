package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf implements Creator<NearbyDevice> {
    static void zza(NearbyDevice nearbyDevice, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, nearbyDevice.zzbjs, i, false);
        zzb.zza(parcel, 2, nearbyDevice.zzE, false);
        zzb.zza(parcel, 3, nearbyDevice.zzHW(), false);
        zzb.zza(parcel, 4, nearbyDevice.zzbju, i, false);
        zzb.zza(parcel, 5, nearbyDevice.zzbjv, false);
        zzb.zzc(parcel, 1000, nearbyDevice.mVersionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgB(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzjU(i);
    }

    public NearbyDevice zzgB(Parcel parcel) {
        String[] strArr = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        NearbyDeviceId[] nearbyDeviceIdArr = null;
        String str = null;
        String str2 = null;
        NearbyDeviceId nearbyDeviceId = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    nearbyDeviceId = (NearbyDeviceId) zza.zza(parcel, zzap, NearbyDeviceId.CREATOR);
                    break;
                case 2:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 3:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 4:
                    nearbyDeviceIdArr = (NearbyDeviceId[]) zza.zzb(parcel, zzap, NearbyDeviceId.CREATOR);
                    break;
                case 5:
                    strArr = zza.zzC(parcel, zzap);
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
            return new NearbyDevice(i, nearbyDeviceId, str2, str, nearbyDeviceIdArr, strArr);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public NearbyDevice[] zzjU(int i) {
        return new NearbyDevice[i];
    }
}
