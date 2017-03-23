package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzg implements Creator<NearbyDeviceFilter> {
    static void zza(NearbyDeviceFilter nearbyDeviceFilter, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, nearbyDeviceFilter.zzbjw);
        zzb.zza(parcel, 2, nearbyDeviceFilter.zzbjx, false);
        zzb.zza(parcel, 3, nearbyDeviceFilter.zzbjy);
        zzb.zzc(parcel, 1000, nearbyDeviceFilter.mVersionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgC(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzjV(i);
    }

    public NearbyDeviceFilter zzgC(Parcel parcel) {
        boolean z = false;
        int zzaq = zza.zzaq(parcel);
        byte[] bArr = null;
        int i = 0;
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
                case 3:
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
            return new NearbyDeviceFilter(i2, i, bArr, z);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public NearbyDeviceFilter[] zzjV(int i) {
        return new NearbyDeviceFilter[i];
    }
}
