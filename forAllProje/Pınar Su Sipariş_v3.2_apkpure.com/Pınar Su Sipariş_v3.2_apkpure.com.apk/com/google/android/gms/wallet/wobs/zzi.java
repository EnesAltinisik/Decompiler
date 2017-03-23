package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi implements Creator<WalletObjectMessage> {
    static void zza(WalletObjectMessage walletObjectMessage, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, walletObjectMessage.getVersionCode());
        zzb.zza(parcel, 2, walletObjectMessage.zzbBt, false);
        zzb.zza(parcel, 3, walletObjectMessage.body, false);
        zzb.zza(parcel, 4, walletObjectMessage.zzbBx, i, false);
        zzb.zza(parcel, 5, walletObjectMessage.zzbBy, i, false);
        zzb.zza(parcel, 6, walletObjectMessage.zzbBz, i, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zziv(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzms(i);
    }

    public WalletObjectMessage zziv(Parcel parcel) {
        UriData uriData = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        UriData uriData2 = null;
        TimeInterval timeInterval = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 3:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 4:
                    timeInterval = (TimeInterval) zza.zza(parcel, zzap, TimeInterval.CREATOR);
                    break;
                case 5:
                    uriData2 = (UriData) zza.zza(parcel, zzap, UriData.CREATOR);
                    break;
                case 6:
                    uriData = (UriData) zza.zza(parcel, zzap, UriData.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new WalletObjectMessage(i, str2, str, timeInterval, uriData2, uriData);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public WalletObjectMessage[] zzms(int i) {
        return new WalletObjectMessage[i];
    }
}
