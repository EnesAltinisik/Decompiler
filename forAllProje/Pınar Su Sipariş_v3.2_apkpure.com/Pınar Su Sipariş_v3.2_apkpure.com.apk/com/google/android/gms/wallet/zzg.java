package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

public class zzg implements Creator<GiftCardWalletObject> {
    static void zza(GiftCardWalletObject giftCardWalletObject, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, giftCardWalletObject.getVersionCode());
        zzb.zza(parcel, 2, giftCardWalletObject.zzbzg, i, false);
        zzb.zza(parcel, 3, giftCardWalletObject.zzbzh, false);
        zzb.zza(parcel, 4, giftCardWalletObject.pin, false);
        zzb.zza(parcel, 5, giftCardWalletObject.zzbzi, false);
        zzb.zza(parcel, 6, giftCardWalletObject.zzbzj);
        zzb.zza(parcel, 7, giftCardWalletObject.zzbzk, false);
        zzb.zza(parcel, 8, giftCardWalletObject.zzbzl);
        zzb.zza(parcel, 9, giftCardWalletObject.zzbzm, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhT(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzlN(i);
    }

    public GiftCardWalletObject zzhT(Parcel parcel) {
        long j = 0;
        String str = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        String str2 = null;
        long j2 = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        CommonWalletObject commonWalletObject = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    commonWalletObject = (CommonWalletObject) zza.zza(parcel, zzap, CommonWalletObject.CREATOR);
                    break;
                case 3:
                    str5 = zza.zzq(parcel, zzap);
                    break;
                case 4:
                    str4 = zza.zzq(parcel, zzap);
                    break;
                case 5:
                    str3 = zza.zzq(parcel, zzap);
                    break;
                case 6:
                    j2 = zza.zzi(parcel, zzap);
                    break;
                case 7:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 8:
                    j = zza.zzi(parcel, zzap);
                    break;
                case 9:
                    str = zza.zzq(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new GiftCardWalletObject(i, commonWalletObject, str5, str4, str3, j2, str2, j, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public GiftCardWalletObject[] zzlN(int i) {
        return new GiftCardWalletObject[i];
    }
}
