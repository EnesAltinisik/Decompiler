package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class AppContentSectionEntityCreator implements Creator<AppContentSectionEntity> {
    static void zza(AppContentSectionEntity appContentSectionEntity, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, appContentSectionEntity.getActions(), false);
        zzb.zzc(parcel, 3, appContentSectionEntity.zzzD(), false);
        zzb.zza(parcel, 4, appContentSectionEntity.zzzj(), false);
        zzb.zza(parcel, 5, appContentSectionEntity.getExtras(), false);
        zzb.zza(parcel, 6, appContentSectionEntity.zzzv(), false);
        zzb.zza(parcel, 7, appContentSectionEntity.getTitle(), false);
        zzb.zzc(parcel, 1000, appContentSectionEntity.getVersionCode());
        zzb.zza(parcel, 8, appContentSectionEntity.getType(), false);
        zzb.zza(parcel, 9, appContentSectionEntity.getId(), false);
        zzb.zza(parcel, 10, appContentSectionEntity.zzzE(), false);
        zzb.zzc(parcel, 14, appContentSectionEntity.zzzt(), false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzej(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzgB(i);
    }

    public AppContentSectionEntity zzej(Parcel parcel) {
        ArrayList arrayList = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Bundle bundle = null;
        String str6 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    arrayList3 = zza.zzc(parcel, zzap, AppContentActionEntity.CREATOR);
                    break;
                case 3:
                    arrayList2 = zza.zzc(parcel, zzap, AppContentCardEntity.CREATOR);
                    break;
                case 4:
                    str6 = zza.zzq(parcel, zzap);
                    break;
                case 5:
                    bundle = zza.zzs(parcel, zzap);
                    break;
                case 6:
                    str5 = zza.zzq(parcel, zzap);
                    break;
                case 7:
                    str4 = zza.zzq(parcel, zzap);
                    break;
                case 8:
                    str3 = zza.zzq(parcel, zzap);
                    break;
                case 9:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 10:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 14:
                    arrayList = zza.zzc(parcel, zzap, AppContentAnnotationEntity.CREATOR);
                    break;
                case 1000:
                    i = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new AppContentSectionEntity(i, arrayList3, arrayList2, str6, bundle, str5, str4, str3, str2, str, arrayList);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public AppContentSectionEntity[] zzgB(int i) {
        return new AppContentSectionEntity[i];
    }
}
