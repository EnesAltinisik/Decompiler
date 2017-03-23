package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class AppContentActionEntityCreator implements Creator<AppContentActionEntity> {
    static void zza(AppContentActionEntity appContentActionEntity, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, appContentActionEntity.zzzi(), false);
        zzb.zza(parcel, 2, appContentActionEntity.zzzj(), false);
        zzb.zza(parcel, 3, appContentActionEntity.getExtras(), false);
        zzb.zza(parcel, 6, appContentActionEntity.getType(), false);
        zzb.zza(parcel, 7, appContentActionEntity.getId(), false);
        zzb.zzc(parcel, 1000, appContentActionEntity.getVersionCode());
        zzb.zza(parcel, 8, appContentActionEntity.zzzh(), i, false);
        zzb.zza(parcel, 9, appContentActionEntity.zzzk(), false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzef(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzgx(i);
    }

    public AppContentActionEntity zzef(Parcel parcel) {
        String str = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        AppContentAnnotationEntity appContentAnnotationEntity = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    arrayList = zza.zzc(parcel, zzap, AppContentConditionEntity.CREATOR);
                    break;
                case 2:
                    str4 = zza.zzq(parcel, zzap);
                    break;
                case 3:
                    bundle = zza.zzs(parcel, zzap);
                    break;
                case 6:
                    str3 = zza.zzq(parcel, zzap);
                    break;
                case 7:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 8:
                    appContentAnnotationEntity = (AppContentAnnotationEntity) zza.zza(parcel, zzap, AppContentAnnotationEntity.CREATOR);
                    break;
                case 9:
                    str = zza.zzq(parcel, zzap);
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
            return new AppContentActionEntity(i, arrayList, str4, bundle, str3, str2, appContentAnnotationEntity, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public AppContentActionEntity[] zzgx(int i) {
        return new AppContentActionEntity[i];
    }
}
