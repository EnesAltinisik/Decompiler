package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;

public class zzm implements Creator<MaskedWalletRequest> {
    static void zza(MaskedWalletRequest maskedWalletRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, maskedWalletRequest.getVersionCode());
        zzb.zza(parcel, 2, maskedWalletRequest.zzbyU, false);
        zzb.zza(parcel, 3, maskedWalletRequest.zzbzQ);
        zzb.zza(parcel, 4, maskedWalletRequest.zzbzR);
        zzb.zza(parcel, 5, maskedWalletRequest.zzbzS);
        zzb.zza(parcel, 6, maskedWalletRequest.zzbzT, false);
        zzb.zza(parcel, 7, maskedWalletRequest.zzbyN, false);
        zzb.zza(parcel, 8, maskedWalletRequest.zzbzU, false);
        zzb.zza(parcel, 9, maskedWalletRequest.zzbze, i, false);
        zzb.zza(parcel, 10, maskedWalletRequest.zzbzV);
        zzb.zza(parcel, 11, maskedWalletRequest.zzbzW);
        zzb.zza(parcel, 12, maskedWalletRequest.zzbzX, i, false);
        zzb.zza(parcel, 13, maskedWalletRequest.zzbzY);
        zzb.zza(parcel, 14, maskedWalletRequest.zzbzZ);
        zzb.zzc(parcel, 15, maskedWalletRequest.zzbAa, false);
        zzb.zza(parcel, 16, maskedWalletRequest.zzbAb, i, false);
        zzb.zza(parcel, 17, maskedWalletRequest.zzbAc, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhZ(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzlT(i);
    }

    public MaskedWalletRequest zzhZ(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Cart cart = null;
        boolean z4 = false;
        boolean z5 = false;
        CountrySpecification[] countrySpecificationArr = null;
        boolean z6 = true;
        boolean z7 = true;
        ArrayList arrayList = null;
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters = null;
        ArrayList arrayList2 = null;
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
                    z = zza.zzc(parcel, zzap);
                    break;
                case 4:
                    z2 = zza.zzc(parcel, zzap);
                    break;
                case 5:
                    z3 = zza.zzc(parcel, zzap);
                    break;
                case 6:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 7:
                    str3 = zza.zzq(parcel, zzap);
                    break;
                case 8:
                    str4 = zza.zzq(parcel, zzap);
                    break;
                case 9:
                    cart = (Cart) zza.zza(parcel, zzap, Cart.CREATOR);
                    break;
                case 10:
                    z4 = zza.zzc(parcel, zzap);
                    break;
                case 11:
                    z5 = zza.zzc(parcel, zzap);
                    break;
                case 12:
                    countrySpecificationArr = (CountrySpecification[]) zza.zzb(parcel, zzap, CountrySpecification.CREATOR);
                    break;
                case 13:
                    z6 = zza.zzc(parcel, zzap);
                    break;
                case 14:
                    z7 = zza.zzc(parcel, zzap);
                    break;
                case 15:
                    arrayList = zza.zzc(parcel, zzap, CountrySpecification.CREATOR);
                    break;
                case 16:
                    paymentMethodTokenizationParameters = (PaymentMethodTokenizationParameters) zza.zza(parcel, zzap, PaymentMethodTokenizationParameters.CREATOR);
                    break;
                case 17:
                    arrayList2 = zza.zzD(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new MaskedWalletRequest(i, str, z, z2, z3, str2, str3, str4, cart, z4, z5, countrySpecificationArr, z6, z7, arrayList, paymentMethodTokenizationParameters, arrayList2);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public MaskedWalletRequest[] zzlT(int i) {
        return new MaskedWalletRequest[i];
    }
}
