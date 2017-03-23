package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh implements Creator<NearbyDeviceId> {
    static void zza(NearbyDeviceId nearbyDeviceId, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, nearbyDeviceId.getType());
        zzb.zza(parcel, 2, nearbyDeviceId.zzbjm, false);
        zzb.zzc(parcel, 1000, nearbyDeviceId.mVersionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgD(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzjW(i);
    }

    public NearbyDeviceId zzgD(Parcel parcel) {
        int i = 0;
        int zzaq = zza.zzaq(parcel);
        byte[] bArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    bArr = zza.zzt(parcel, zzap);
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
            return new NearbyDeviceId(i2, i, bArr);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public NearbyDeviceId[] zzjW(int i) {
        return new NearbyDeviceId[i];
    }
}
