package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.messages.devices.NearbyDeviceFilter;
import com.google.android.gms.nearby.messages.internal.MessageType;
import java.util.List;

public class zzd implements Creator<MessageFilter> {
    static void zza(MessageFilter messageFilter, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, messageFilter.zzHM(), false);
        zzb.zzc(parcel, 2, messageFilter.zzHO(), false);
        zzb.zza(parcel, 3, messageFilter.zzHN());
        zzb.zzc(parcel, 1000, messageFilter.mVersionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgz(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzjO(i);
    }

    public MessageFilter zzgz(Parcel parcel) {
        List list = null;
        boolean z = false;
        int zzaq = zza.zzaq(parcel);
        List list2 = null;
        int i = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    list2 = zza.zzc(parcel, zzap, MessageType.CREATOR);
                    break;
                case 2:
                    list = zza.zzc(parcel, zzap, NearbyDeviceFilter.CREATOR);
                    break;
                case 3:
                    z = zza.zzc(parcel, zzap);
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
            return new MessageFilter(i, list2, list, z);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public MessageFilter[] zzjO(int i) {
        return new MessageFilter[i];
    }
}
