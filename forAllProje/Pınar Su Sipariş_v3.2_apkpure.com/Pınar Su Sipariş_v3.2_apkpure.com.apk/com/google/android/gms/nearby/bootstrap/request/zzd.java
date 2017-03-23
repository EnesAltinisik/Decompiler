package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.bootstrap.Device;

public class zzd implements Creator<DisconnectRequest> {
    static void zza(DisconnectRequest disconnectRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, disconnectRequest.zzHp(), i, false);
        zzb.zza(parcel, 2, disconnectRequest.getCallbackBinder(), false);
        zzb.zzc(parcel, 1000, disconnectRequest.versionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzfZ(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzjj(i);
    }

    public DisconnectRequest zzfZ(Parcel parcel) {
        IBinder iBinder = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        Device device = null;
        while (parcel.dataPosition() < zzaq) {
            int i2;
            IBinder iBinder2;
            Device device2;
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = i;
                    Device device3 = (Device) zza.zza(parcel, zzap, Device.CREATOR);
                    iBinder2 = iBinder;
                    device2 = device3;
                    break;
                case 2:
                    iBinder2 = zza.zzr(parcel, zzap);
                    device2 = device;
                    i2 = i;
                    break;
                case 1000:
                    IBinder iBinder3 = iBinder;
                    device2 = device;
                    i2 = zza.zzg(parcel, zzap);
                    iBinder2 = iBinder3;
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    iBinder2 = iBinder;
                    device2 = device;
                    i2 = i;
                    break;
            }
            i = i2;
            device = device2;
            iBinder = iBinder2;
        }
        if (parcel.dataPosition() == zzaq) {
            return new DisconnectRequest(i, device, iBinder);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public DisconnectRequest[] zzjj(int i) {
        return new DisconnectRequest[i];
    }
}
