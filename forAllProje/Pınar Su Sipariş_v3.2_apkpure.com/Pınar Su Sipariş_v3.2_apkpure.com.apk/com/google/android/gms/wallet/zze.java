package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.identity.intents.model.UserAddress;

public class zze implements Creator<FullWallet> {
    static void zza(FullWallet fullWallet, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, fullWallet.getVersionCode());
        zzb.zza(parcel, 2, fullWallet.zzbyT, false);
        zzb.zza(parcel, 3, fullWallet.zzbyU, false);
        zzb.zza(parcel, 4, fullWallet.zzbyV, i, false);
        zzb.zza(parcel, 5, fullWallet.zzbyW, false);
        zzb.zza(parcel, 6, fullWallet.zzbyX, i, false);
        zzb.zza(parcel, 7, fullWallet.zzbyY, i, false);
        zzb.zza(parcel, 8, fullWallet.zzbyZ, false);
        zzb.zza(parcel, 9, fullWallet.zzbza, i, false);
        zzb.zza(parcel, 10, fullWallet.zzbzb, i, false);
        zzb.zza(parcel, 11, fullWallet.zzbzc, i, false);
        zzb.zza(parcel, 12, fullWallet.zzbzd, i, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhR(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzlL(i);
    }

    public FullWallet zzhR(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        ProxyCard proxyCard = null;
        String str3 = null;
        Address address = null;
        Address address2 = null;
        String[] strArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        InstrumentInfo[] instrumentInfoArr = null;
        PaymentMethodToken paymentMethodToken = null;
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
                    proxyCard = (ProxyCard) zza.zza(parcel, zzap, ProxyCard.CREATOR);
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
                    strArr = zza.zzC(parcel, zzap);
                    break;
                case 9:
                    userAddress = (UserAddress) zza.zza(parcel, zzap, UserAddress.CREATOR);
                    break;
                case 10:
                    userAddress2 = (UserAddress) zza.zza(parcel, zzap, UserAddress.CREATOR);
                    break;
                case 11:
                    instrumentInfoArr = (InstrumentInfo[]) zza.zzb(parcel, zzap, InstrumentInfo.CREATOR);
                    break;
                case 12:
                    paymentMethodToken = (PaymentMethodToken) zza.zza(parcel, zzap, PaymentMethodToken.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new FullWallet(i, str, str2, proxyCard, str3, address, address2, strArr, userAddress, userAddress2, instrumentInfoArr, paymentMethodToken);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public FullWallet[] zzlL(int i) {
        return new FullWallet[i];
    }
}
