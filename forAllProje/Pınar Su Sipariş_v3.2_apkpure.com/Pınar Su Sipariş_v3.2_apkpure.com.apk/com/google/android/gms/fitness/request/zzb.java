package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.fitness.data.BleDevice;

public class zzb implements Creator<ClaimBleDeviceRequest> {
    static void zza(ClaimBleDeviceRequest claimBleDeviceRequest, Parcel parcel, int i) {
        int zzar = com.google.android.gms.common.internal.safeparcel.zzb.zzar(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 1, claimBleDeviceRequest.getDeviceAddress(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 2, claimBleDeviceRequest.zzxU(), i, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 3, claimBleDeviceRequest.getCallbackBinder(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 1000, claimBleDeviceRequest.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzdh(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzfx(i);
    }

    public ClaimBleDeviceRequest zzdh(Parcel parcel) {
        IBinder iBinder = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        BleDevice bleDevice = null;
        String str = null;
        while (parcel.dataPosition() < zzaq) {
            int i2;
            String zzq;
            IBinder iBinder2;
            BleDevice bleDevice2;
            int zzap = zza.zzap(parcel);
            IBinder iBinder3;
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = i;
                    BleDevice bleDevice3 = bleDevice;
                    zzq = zza.zzq(parcel, zzap);
                    iBinder2 = iBinder;
                    bleDevice2 = bleDevice3;
                    break;
                case 2:
                    zzq = str;
                    i2 = i;
                    iBinder3 = iBinder;
                    bleDevice2 = (BleDevice) zza.zza(parcel, zzap, BleDevice.CREATOR);
                    iBinder2 = iBinder3;
                    break;
                case 3:
                    iBinder2 = zza.zzr(parcel, zzap);
                    bleDevice2 = bleDevice;
                    zzq = str;
                    i2 = i;
                    break;
                case 1000:
                    iBinder3 = iBinder;
                    bleDevice2 = bleDevice;
                    zzq = str;
                    i2 = zza.zzg(parcel, zzap);
                    iBinder2 = iBinder3;
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    iBinder2 = iBinder;
                    bleDevice2 = bleDevice;
                    zzq = str;
                    i2 = i;
                    break;
            }
            i = i2;
            str = zzq;
            bleDevice = bleDevice2;
            iBinder = iBinder2;
        }
        if (parcel.dataPosition() == zzaq) {
            return new ClaimBleDeviceRequest(i, str, bleDevice, iBinder);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public ClaimBleDeviceRequest[] zzfx(int i) {
        return new ClaimBleDeviceRequest[i];
    }
}
