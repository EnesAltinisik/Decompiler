package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd implements Creator<LoyaltyPointsBalance> {
    static void zza(LoyaltyPointsBalance loyaltyPointsBalance, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, loyaltyPointsBalance.getVersionCode());
        zzb.zzc(parcel, 2, loyaltyPointsBalance.zzbBo);
        zzb.zza(parcel, 3, loyaltyPointsBalance.zzbBp, false);
        zzb.zza(parcel, 4, loyaltyPointsBalance.zzbBq);
        zzb.zza(parcel, 5, loyaltyPointsBalance.zzbzk, false);
        zzb.zza(parcel, 6, loyaltyPointsBalance.zzbBr);
        zzb.zzc(parcel, 7, loyaltyPointsBalance.zzbBs);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zziq(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzmn(i);
    }

    public LoyaltyPointsBalance zziq(Parcel parcel) {
        String str = null;
        int i = 0;
        int zzaq = zza.zzaq(parcel);
        double d = 0.0d;
        long j = 0;
        int i2 = -1;
        String str2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i3 = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 3:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 4:
                    d = zza.zzn(parcel, zzap);
                    break;
                case 5:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 6:
                    j = zza.zzi(parcel, zzap);
                    break;
                case 7:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new LoyaltyPointsBalance(i3, i, str2, d, str, j, i2);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public LoyaltyPointsBalance[] zzmn(int i) {
        return new LoyaltyPointsBalance[i];
    }
}
