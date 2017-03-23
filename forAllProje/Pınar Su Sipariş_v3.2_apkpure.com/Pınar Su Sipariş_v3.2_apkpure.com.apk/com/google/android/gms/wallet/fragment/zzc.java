package com.google.android.gms.wallet.fragment;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc implements Creator<WalletFragmentStyle> {
    static void zza(WalletFragmentStyle walletFragmentStyle, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, walletFragmentStyle.mVersionCode);
        zzb.zza(parcel, 2, walletFragmentStyle.zzbAZ, false);
        zzb.zzc(parcel, 3, walletFragmentStyle.zzbBa);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzim(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzmh(i);
    }

    public WalletFragmentStyle zzim(Parcel parcel) {
        int i = 0;
        int zzaq = zza.zzaq(parcel);
        Bundle bundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    bundle = zza.zzs(parcel, zzap);
                    break;
                case 3:
                    i = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new WalletFragmentStyle(i2, bundle, i);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public WalletFragmentStyle[] zzmh(int i) {
        return new WalletFragmentStyle[i];
    }
}
