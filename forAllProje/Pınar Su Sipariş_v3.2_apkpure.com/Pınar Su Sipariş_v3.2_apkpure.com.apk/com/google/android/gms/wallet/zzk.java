package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;

public class zzk implements Creator<LoyaltyWalletObject> {
    static void zza(LoyaltyWalletObject loyaltyWalletObject, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, loyaltyWalletObject.getVersionCode());
        zzb.zza(parcel, 2, loyaltyWalletObject.id, false);
        zzb.zza(parcel, 3, loyaltyWalletObject.zzbzu, false);
        zzb.zza(parcel, 4, loyaltyWalletObject.zzbzv, false);
        zzb.zza(parcel, 5, loyaltyWalletObject.zzbzw, false);
        zzb.zza(parcel, 6, loyaltyWalletObject.zzaYp, false);
        zzb.zza(parcel, 7, loyaltyWalletObject.zzbzx, false);
        zzb.zza(parcel, 8, loyaltyWalletObject.zzbzy, false);
        zzb.zza(parcel, 9, loyaltyWalletObject.zzbzz, false);
        zzb.zza(parcel, 10, loyaltyWalletObject.zzbzA, false);
        zzb.zza(parcel, 11, loyaltyWalletObject.zzbzB, false);
        zzb.zzc(parcel, 12, loyaltyWalletObject.state);
        zzb.zzc(parcel, 13, loyaltyWalletObject.zzbzC, false);
        zzb.zza(parcel, 14, loyaltyWalletObject.zzbzD, i, false);
        zzb.zzc(parcel, 15, loyaltyWalletObject.zzbzE, false);
        zzb.zza(parcel, 16, loyaltyWalletObject.zzbzF, false);
        zzb.zza(parcel, 17, loyaltyWalletObject.zzbzG, false);
        zzb.zzc(parcel, 18, loyaltyWalletObject.zzbzH, false);
        zzb.zza(parcel, 19, loyaltyWalletObject.zzbzI);
        zzb.zzc(parcel, 20, loyaltyWalletObject.zzbzJ, false);
        zzb.zzc(parcel, 21, loyaltyWalletObject.zzbzK, false);
        zzb.zzc(parcel, 22, loyaltyWalletObject.zzbzL, false);
        zzb.zza(parcel, 23, loyaltyWalletObject.zzbzM, i, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhX(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzlR(i);
    }

    public LoyaltyWalletObject zzhX(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        int i2 = 0;
        ArrayList zzuT = com.google.android.gms.common.util.zzb.zzuT();
        TimeInterval timeInterval = null;
        ArrayList zzuT2 = com.google.android.gms.common.util.zzb.zzuT();
        String str11 = null;
        String str12 = null;
        ArrayList zzuT3 = com.google.android.gms.common.util.zzb.zzuT();
        boolean z = false;
        ArrayList zzuT4 = com.google.android.gms.common.util.zzb.zzuT();
        ArrayList zzuT5 = com.google.android.gms.common.util.zzb.zzuT();
        ArrayList zzuT6 = com.google.android.gms.common.util.zzb.zzuT();
        LoyaltyPoints loyaltyPoints = null;
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
                    str3 = zza.zzq(parcel, zzap);
                    break;
                case 5:
                    str4 = zza.zzq(parcel, zzap);
                    break;
                case 6:
                    str5 = zza.zzq(parcel, zzap);
                    break;
                case 7:
                    str6 = zza.zzq(parcel, zzap);
                    break;
                case 8:
                    str7 = zza.zzq(parcel, zzap);
                    break;
                case 9:
                    str8 = zza.zzq(parcel, zzap);
                    break;
                case 10:
                    str9 = zza.zzq(parcel, zzap);
                    break;
                case 11:
                    str10 = zza.zzq(parcel, zzap);
                    break;
                case 12:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 13:
                    zzuT = zza.zzc(parcel, zzap, WalletObjectMessage.CREATOR);
                    break;
                case 14:
                    timeInterval = (TimeInterval) zza.zza(parcel, zzap, TimeInterval.CREATOR);
                    break;
                case 15:
                    zzuT2 = zza.zzc(parcel, zzap, LatLng.CREATOR);
                    break;
                case 16:
                    str11 = zza.zzq(parcel, zzap);
                    break;
                case 17:
                    str12 = zza.zzq(parcel, zzap);
                    break;
                case 18:
                    zzuT3 = zza.zzc(parcel, zzap, LabelValueRow.CREATOR);
                    break;
                case 19:
                    z = zza.zzc(parcel, zzap);
                    break;
                case 20:
                    zzuT4 = zza.zzc(parcel, zzap, UriData.CREATOR);
                    break;
                case 21:
                    zzuT5 = zza.zzc(parcel, zzap, TextModuleData.CREATOR);
                    break;
                case 22:
                    zzuT6 = zza.zzc(parcel, zzap, UriData.CREATOR);
                    break;
                case 23:
                    loyaltyPoints = (LoyaltyPoints) zza.zza(parcel, zzap, LoyaltyPoints.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new LoyaltyWalletObject(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, i2, zzuT, timeInterval, zzuT2, str11, str12, zzuT3, z, zzuT4, zzuT5, zzuT6, loyaltyPoints);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public LoyaltyWalletObject[] zzlR(int i) {
        return new LoyaltyWalletObject[i];
    }
}
