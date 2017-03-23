package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zzh implements Creator<AdResponseParcel> {
    static void zza(AdResponseParcel adResponseParcel, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, adResponseParcel.versionCode);
        zzb.zza(parcel, 2, adResponseParcel.zzHH, false);
        zzb.zza(parcel, 3, adResponseParcel.body, false);
        zzb.zzb(parcel, 4, adResponseParcel.zzEF, false);
        zzb.zzc(parcel, 5, adResponseParcel.errorCode);
        zzb.zzb(parcel, 6, adResponseParcel.zzEG, false);
        zzb.zza(parcel, 7, adResponseParcel.zzLO);
        zzb.zza(parcel, 8, adResponseParcel.zzLP);
        zzb.zza(parcel, 9, adResponseParcel.zzLQ);
        zzb.zzb(parcel, 10, adResponseParcel.zzLR, false);
        zzb.zza(parcel, 11, adResponseParcel.zzEL);
        zzb.zzc(parcel, 12, adResponseParcel.orientation);
        zzb.zza(parcel, 13, adResponseParcel.zzLS, false);
        zzb.zza(parcel, 14, adResponseParcel.zzLT);
        zzb.zza(parcel, 15, adResponseParcel.zzLU, false);
        zzb.zza(parcel, 18, adResponseParcel.zzLV);
        zzb.zza(parcel, 19, adResponseParcel.zzLW, false);
        zzb.zza(parcel, 21, adResponseParcel.zzLX, false);
        zzb.zza(parcel, 22, adResponseParcel.zzLY);
        zzb.zza(parcel, 23, adResponseParcel.zzvv);
        zzb.zza(parcel, 24, adResponseParcel.zzLq);
        zzb.zza(parcel, 25, adResponseParcel.zzLZ);
        zzb.zza(parcel, 26, adResponseParcel.zzMa);
        zzb.zzc(parcel, 27, adResponseParcel.zzMb);
        zzb.zza(parcel, 28, adResponseParcel.zzMc, i, false);
        zzb.zza(parcel, 29, adResponseParcel.zzMd, false);
        zzb.zza(parcel, 30, adResponseParcel.zzMe, false);
        zzb.zza(parcel, 31, adResponseParcel.zzvw);
        zzb.zza(parcel, 32, adResponseParcel.zzvx);
        zzb.zza(parcel, 33, adResponseParcel.zzMf, i, false);
        zzb.zzb(parcel, 34, adResponseParcel.zzMg, false);
        zzb.zzb(parcel, 35, adResponseParcel.zzMh, false);
        zzb.zza(parcel, 36, adResponseParcel.zzMi);
        zzb.zza(parcel, 37, adResponseParcel.zzMj, i, false);
        zzb.zza(parcel, 38, adResponseParcel.zzLH);
        zzb.zza(parcel, 39, adResponseParcel.zzLI, false);
        zzb.zzb(parcel, 40, adResponseParcel.zzEI, false);
        zzb.zza(parcel, 41, adResponseParcel.zzMk, false);
        zzb.zza(parcel, 42, adResponseParcel.zzEJ);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzk(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzN(i);
    }

    public AdResponseParcel[] zzN(int i) {
        return new AdResponseParcel[i];
    }

    public AdResponseParcel zzk(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        int i2 = 0;
        List list2 = null;
        long j = 0;
        boolean z = false;
        long j2 = 0;
        List list3 = null;
        long j3 = 0;
        int i3 = 0;
        String str3 = null;
        long j4 = 0;
        String str4 = null;
        boolean z2 = false;
        String str5 = null;
        String str6 = null;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i4 = 0;
        LargeParcelTeleporter largeParcelTeleporter = null;
        String str7 = null;
        String str8 = null;
        boolean z8 = false;
        boolean z9 = false;
        RewardItemParcel rewardItemParcel = null;
        List list4 = null;
        List list5 = null;
        boolean z10 = false;
        AutoClickProtectionConfigurationParcel autoClickProtectionConfigurationParcel = null;
        boolean z11 = false;
        String str9 = null;
        List list6 = null;
        String str10 = null;
        boolean z12 = false;
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
                    list = zza.zzE(parcel, zzap);
                    break;
                case 5:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 6:
                    list2 = zza.zzE(parcel, zzap);
                    break;
                case 7:
                    j = zza.zzi(parcel, zzap);
                    break;
                case 8:
                    z = zza.zzc(parcel, zzap);
                    break;
                case 9:
                    j2 = zza.zzi(parcel, zzap);
                    break;
                case 10:
                    list3 = zza.zzE(parcel, zzap);
                    break;
                case 11:
                    j3 = zza.zzi(parcel, zzap);
                    break;
                case 12:
                    i3 = zza.zzg(parcel, zzap);
                    break;
                case 13:
                    str3 = zza.zzq(parcel, zzap);
                    break;
                case 14:
                    j4 = zza.zzi(parcel, zzap);
                    break;
                case 15:
                    str4 = zza.zzq(parcel, zzap);
                    break;
                case 18:
                    z2 = zza.zzc(parcel, zzap);
                    break;
                case 19:
                    str5 = zza.zzq(parcel, zzap);
                    break;
                case 21:
                    str6 = zza.zzq(parcel, zzap);
                    break;
                case 22:
                    z3 = zza.zzc(parcel, zzap);
                    break;
                case 23:
                    z4 = zza.zzc(parcel, zzap);
                    break;
                case 24:
                    z5 = zza.zzc(parcel, zzap);
                    break;
                case 25:
                    z6 = zza.zzc(parcel, zzap);
                    break;
                case 26:
                    z7 = zza.zzc(parcel, zzap);
                    break;
                case 27:
                    i4 = zza.zzg(parcel, zzap);
                    break;
                case 28:
                    largeParcelTeleporter = (LargeParcelTeleporter) zza.zza(parcel, zzap, LargeParcelTeleporter.CREATOR);
                    break;
                case 29:
                    str7 = zza.zzq(parcel, zzap);
                    break;
                case 30:
                    str8 = zza.zzq(parcel, zzap);
                    break;
                case 31:
                    z8 = zza.zzc(parcel, zzap);
                    break;
                case 32:
                    z9 = zza.zzc(parcel, zzap);
                    break;
                case 33:
                    rewardItemParcel = (RewardItemParcel) zza.zza(parcel, zzap, (Creator) RewardItemParcel.CREATOR);
                    break;
                case 34:
                    list4 = zza.zzE(parcel, zzap);
                    break;
                case 35:
                    list5 = zza.zzE(parcel, zzap);
                    break;
                case 36:
                    z10 = zza.zzc(parcel, zzap);
                    break;
                case 37:
                    autoClickProtectionConfigurationParcel = (AutoClickProtectionConfigurationParcel) zza.zza(parcel, zzap, (Creator) AutoClickProtectionConfigurationParcel.CREATOR);
                    break;
                case 38:
                    z11 = zza.zzc(parcel, zzap);
                    break;
                case 39:
                    str9 = zza.zzq(parcel, zzap);
                    break;
                case 40:
                    list6 = zza.zzE(parcel, zzap);
                    break;
                case 41:
                    str10 = zza.zzq(parcel, zzap);
                    break;
                case 42:
                    z12 = zza.zzc(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new AdResponseParcel(i, str, str2, list, i2, list2, j, z, j2, list3, j3, i3, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, i4, largeParcelTeleporter, str7, str8, z8, z9, rewardItemParcel, list4, list5, z10, autoClickProtectionConfigurationParcel, z11, str9, list6, str10, z12);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }
}
