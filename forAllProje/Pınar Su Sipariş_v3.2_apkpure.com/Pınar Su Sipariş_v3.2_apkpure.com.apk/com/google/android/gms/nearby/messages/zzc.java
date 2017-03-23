package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;

public class zzc implements Creator<Message> {
    static void zza(Message message, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, message.getContent(), false);
        zzb.zza(parcel, 2, message.getType(), false);
        zzb.zza(parcel, 3, message.getNamespace(), false);
        zzb.zza(parcel, 4, message.zzHL(), i, false);
        zzb.zzc(parcel, 1000, message.versionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgy(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzjN(i);
    }

    public Message zzgy(Parcel parcel) {
        NearbyDevice[] nearbyDeviceArr = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    bArr = zza.zzt(parcel, zzap);
                    break;
                case 2:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 3:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 4:
                    nearbyDeviceArr = (NearbyDevice[]) zza.zzb(parcel, zzap, NearbyDevice.CREATOR);
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
            return new Message(i, bArr, str2, str, nearbyDeviceArr);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public Message[] zzjN(int i) {
        return new Message[i];
    }
}
