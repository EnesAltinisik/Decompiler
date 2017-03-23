package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.identity.intents.model.UserAddress;

public class zzl implements Creator<MaskedWallet> {
    static void zza(MaskedWallet maskedWallet, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, maskedWallet.getVersionCode());
        zzb.zza(parcel, 2, maskedWallet.zzbyT, false);
        zzb.zza(parcel, 3, maskedWallet.zzbyU, false);
        zzb.zza(parcel, 4, maskedWallet.zzbyZ, false);
        zzb.zza(parcel, 5, maskedWallet.zzbyW, false);
        zzb.zza(parcel, 6, maskedWallet.zzbyX, i, false);
        zzb.zza(parcel, 7, maskedWallet.zzbyY, i, false);
        zzb.zza(parcel, 8, maskedWallet.zzbzN, i, false);
        zzb.zza(parcel, 9, maskedWallet.zzbzO, i, false);
        zzb.zza(parcel, 10, maskedWallet.zzbza, i, false);
        zzb.zza(parcel, 11, maskedWallet.zzbzb, i, false);
        zzb.zza(parcel, 12, maskedWallet.zzbzc, i, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhY(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzlS(i);
    }

    public MaskedWallet zzhY(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String[] strArr = null;
        String str3 = null;
        Address address = null;
        Address address2 = null;
        LoyaltyWalletObject[] loyaltyWalletObjectArr = null;
        OfferWalletObject[] offerWalletObjectArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        InstrumentInfo[] instrumentInfoArr = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 3:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 4:
                    strArr = zza.zzC(parcel, zzap);
                    break;
                case 5:
                    str3 = zza.zzq(parcel, zzap);
                    break;
                case 6:
                    address = (Address) zza.zza(parcel, zzap, Address.CREATOR);
                    break;
                case 7:
                    address2 = (Address) zza.zza(parcel, zzap, Address.CREATOR);
                    break;
                case 8:
                    loyaltyWalletObjectArr = (LoyaltyWalletObject[]) zza.zzb(parcel, zzap, LoyaltyWalletObject.CREATOR);
                    break;
                case 9:
                    offerWalletObjectArr = (OfferWalletObject[]) zza.zzb(parcel, zzap, OfferWalletObject.CREATOR);
                    break;
                case 10:
                    userAddress = (UserAddress) zza.zza(parcel, zzap, UserAddress.CREATOR);
                    break;
                case 11:
                    userAddress2 = (UserAddress) zza.zza(parcel, zzap, UserAddress.CREATOR);
                    break;
                case 12:
                    instrumentInfoArr = (InstrumentInfo[]) zza.zzb(parcel, zzap, InstrumentInfo.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new MaskedWallet(i, str, str2, strArr, str3, address, address2, loyaltyWalletObjectArr, offerWalletObjectArr, userAddress, userAddress2, instrumentInfoArr);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public MaskedWallet[] zzlS(int i) {
        return new MaskedWallet[i];
    }
}
