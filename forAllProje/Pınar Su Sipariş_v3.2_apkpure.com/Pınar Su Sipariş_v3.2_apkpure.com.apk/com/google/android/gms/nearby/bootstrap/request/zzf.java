package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.bootstrap.Device;

public class zzf implements Creator<SendDataRequest> {
    static void zza(SendDataRequest sendDataRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, sendDataRequest.zzHp(), i, false);
        zzb.zza(parcel, 2, sendDataRequest.getData(), false);
        zzb.zza(parcel, 3, sendDataRequest.getCallbackBinder(), false);
        zzb.zzc(parcel, 1000, sendDataRequest.versionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgb(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzjl(i);
    }

    public SendDataRequest zzgb(Parcel parcel) {
        IBinder iBinder = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        byte[] bArr = null;
        Device device = null;
        while (parcel.dataPosition() < zzaq) {
            int i2;
            Device device2;
            IBinder iBinder2;
            byte[] bArr2;
            int zzap = zza.zzap(parcel);
            IBinder iBinder3;
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = i;
                    byte[] bArr3 = bArr;
                    device2 = (Device) zza.zza(parcel, zzap, Device.CREATOR);
                    iBinder2 = iBinder;
                    bArr2 = bArr3;
                    break;
                case 2:
                    device2 = device;
                    i2 = i;
                    iBinder3 = iBinder;
                    bArr2 = zza.zzt(parcel, zzap);
                    iBinder2 = iBinder3;
                    break;
                case 3:
                    iBinder2 = zza.zzr(parcel, zzap);
                    bArr2 = bArr;
                    device2 = device;
                    i2 = i;
                    break;
                case 1000:
                    iBinder3 = iBinder;
                    bArr2 = bArr;
                    device2 = device;
                    i2 = zza.zzg(parcel, zzap);
                    iBinder2 = iBinder3;
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    iBinder2 = iBinder;
                    bArr2 = bArr;
                    device2 = device;
                    i2 = i;
                    break;
            }
            i = i2;
            device = device2;
            bArr = bArr2;
            iBinder = iBinder2;
        }
        if (parcel.dataPosition() == zzaq) {
            return new SendDataRequest(i, device, bArr, iBinder);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public SendDataRequest[] zzjl(int i) {
        return new SendDataRequest[i];
    }
}
