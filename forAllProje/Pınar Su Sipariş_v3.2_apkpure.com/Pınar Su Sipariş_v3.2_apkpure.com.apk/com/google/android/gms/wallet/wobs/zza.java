package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

public class zza implements Creator<CommonWalletObject> {
    static void zza(CommonWalletObject commonWalletObject, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, commonWalletObject.getVersionCode());
        zzb.zza(parcel, 2, commonWalletObject.id, false);
        zzb.zza(parcel, 3, commonWalletObject.zzbzB, false);
        zzb.zza(parcel, 4, commonWalletObject.name, false);
        zzb.zza(parcel, 5, commonWalletObject.zzbzv, false);
        zzb.zza(parcel, 6, commonWalletObject.zzbzx, false);
        zzb.zza(parcel, 7, commonWalletObject.zzbzy, false);
        zzb.zza(parcel, 8, commonWalletObject.zzbzz, false);
        zzb.zza(parcel, 9, commonWalletObject.zzbzA, false);
        zzb.zzc(parcel, 10, commonWalletObject.state);
        zzb.zzc(parcel, 11, commonWalletObject.zzbzC, false);
        zzb.zza(parcel, 12, commonWalletObject.zzbzD, i, false);
        zzb.zzc(parcel, 13, commonWalletObject.zzbzE, false);
        zzb.zza(parcel, 14, commonWalletObject.zzbzF, false);
        zzb.zza(parcel, 15, commonWalletObject.zzbzG, false);
        zzb.zzc(parcel, 16, commonWalletObject.zzbzH, false);
        zzb.zza(parcel, 17, commonWalletObject.zzbzI);
        zzb.zzc(parcel, 18, commonWalletObject.zzbzJ, false);
        zzb.zzc(parcel, 19, commonWalletObject.zzbzK, false);
        zzb.zzc(parcel, 20, commonWalletObject.zzbzL, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzin(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzmk(i);
    }

    public CommonWalletObject zzin(Parcel parcel) {
        int zzaq = com.google.android.gms.common.internal.safeparcel.zza.zzaq(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        int i2 = 0;
        ArrayList zzuT = com.google.android.gms.common.util.zzb.zzuT();
        TimeInterval timeInterval = null;
        ArrayList zzuT2 = com.google.android.gms.common.util.zzb.zzuT();
        String str9 = null;
        String str10 = null;
        ArrayList zzuT3 = com.google.android.gms.common.util.zzb.zzuT();
        boolean z = false;
        ArrayList zzuT4 = com.google.android.gms.common.util.zzb.zzuT();
        ArrayList zzuT5 = com.google.android.gms.common.util.zzb.zzuT();
        ArrayList zzuT6 = com.google.android.gms.common.util.zzb.zzuT();
        while (parcel.dataPosition() < zzaq) {
            int zzap = com.google.android.gms.common.internal.safeparcel.zza.zzap(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.zza.zzcj(zzap)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, zzap);
                    break;
                case 2:
                    str = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, zzap);
                    break;
                case 3:
                    str2 = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, zzap);
                    break;
                case 4:
                    str3 = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, zzap);
                    break;
                case 5:
                    str4 = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, zzap);
                    break;
                case 6:
                    str5 = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, zzap);
                    break;
                case 7:
                    str6 = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, zzap);
                    break;
                case 8:
                    str7 = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, zzap);
                    break;
                case 9:
                    str8 = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, zzap);
                    break;
                case 10:
                    i2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, zzap);
                    break;
                case 11:
                    zzuT = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, zzap, WalletObjectMessage.CREATOR);
                    break;
                case 12:
                    timeInterval = (TimeInterval) com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, zzap, TimeInterval.CREATOR);
                    break;
                case 13:
                    zzuT2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, zzap, LatLng.CREATOR);
                    break;
                case 14:
                    str9 = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, zzap);
                    break;
                case 15:
                    str10 = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, zzap);
                    break;
                case 16:
                    zzuT3 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, zzap, LabelValueRow.CREATOR);
                    break;
                case 17:
                    z = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, zzap);
                    break;
                case 18:
                    zzuT4 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, zzap, UriData.CREATOR);
                    break;
                case 19:
                    zzuT5 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, zzap, TextModuleData.CREATOR);
                    break;
                case 20:
                    zzuT6 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, zzap, UriData.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new CommonWalletObject(i, str, str2, str3, str4, str5, str6, str7, str8, i2, zzuT, timeInterval, zzuT2, str9, str10, zzuT3, z, zzuT4, zzuT5, zzuT6);
        }
        throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public CommonWalletObject[] zzmk(int i) {
        return new CommonWalletObject[i];
    }
}
