package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class AppContentCardEntityCreator implements Creator<AppContentCardEntity> {
    static void zza(AppContentCardEntity appContentCardEntity, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, appContentCardEntity.getActions(), false);
        zzb.zzc(parcel, 2, appContentCardEntity.zzzt(), false);
        zzb.zzc(parcel, 3, appContentCardEntity.zzzi(), false);
        zzb.zza(parcel, 4, appContentCardEntity.zzzj(), false);
        zzb.zzc(parcel, 5, appContentCardEntity.zzzu());
        zzb.zza(parcel, 6, appContentCardEntity.getDescription(), false);
        zzb.zza(parcel, 7, appContentCardEntity.getExtras(), false);
        zzb.zzc(parcel, 1000, appContentCardEntity.getVersionCode());
        zzb.zza(parcel, 10, appContentCardEntity.zzzv(), false);
        zzb.zza(parcel, 11, appContentCardEntity.getTitle(), false);
        zzb.zzc(parcel, 12, appContentCardEntity.zzzw());
        zzb.zza(parcel, 13, appContentCardEntity.getType(), false);
        zzb.zza(parcel, 14, appContentCardEntity.getId(), false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzeh(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzgz(i);
    }

    public AppContentCardEntity zzeh(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        String str = null;
        int i2 = 0;
        String str2 = null;
        Bundle bundle = null;
        String str3 = null;
        String str4 = null;
        int i3 = 0;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    arrayList = zza.zzc(parcel, zzap, AppContentActionEntity.CREATOR);
                    break;
                case 2:
                    arrayList2 = zza.zzc(parcel, zzap, AppContentAnnotationEntity.CREATOR);
                    break;
                case 3:
                    arrayList3 = zza.zzc(parcel, zzap, AppContentConditionEntity.CREATOR);
                    break;
                case 4:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 5:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 6:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 7:
                    bundle = zza.zzs(parcel, zzap);
                    break;
                case 10:
                    str3 = zza.zzq(parcel, zzap);
                    break;
                case 11:
                    str4 = zza.zzq(parcel, zzap);
                    break;
                case 12:
                    i3 = zza.zzg(parcel, zzap);
                    break;
                case 13:
                    str5 = zza.zzq(parcel, zzap);
                    break;
                case 14:
                    str6 = zza.zzq(parcel, zzap);
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
            return new AppContentCardEntity(i, arrayList, arrayList2, arrayList3, str, i2, str2, bundle, str3, str4, i3, str5, str6);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public AppContentCardEntity[] zzgz(int i) {
        return new AppContentCardEntity[i];
    }
}
