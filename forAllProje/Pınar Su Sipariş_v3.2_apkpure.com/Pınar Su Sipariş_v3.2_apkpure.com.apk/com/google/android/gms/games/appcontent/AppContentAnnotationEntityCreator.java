package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class AppContentAnnotationEntityCreator implements Creator<AppContentAnnotationEntity> {
    static void zza(AppContentAnnotationEntity appContentAnnotationEntity, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, appContentAnnotationEntity.getDescription(), false);
        zzb.zza(parcel, 2, appContentAnnotationEntity.zzzo(), i, false);
        zzb.zza(parcel, 3, appContentAnnotationEntity.getTitle(), false);
        zzb.zza(parcel, 5, appContentAnnotationEntity.getId(), false);
        zzb.zza(parcel, 6, appContentAnnotationEntity.zzzr(), false);
        zzb.zza(parcel, 7, appContentAnnotationEntity.zzzm(), false);
        zzb.zzc(parcel, 1000, appContentAnnotationEntity.getVersionCode());
        zzb.zzc(parcel, 8, appContentAnnotationEntity.zzzn());
        zzb.zzc(parcel, 9, appContentAnnotationEntity.zzzq());
        zzb.zza(parcel, 10, appContentAnnotationEntity.zzzp(), false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzeg(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzgy(i);
    }

    public AppContentAnnotationEntity zzeg(Parcel parcel) {
        int i = 0;
        Bundle bundle = null;
        int zzaq = zza.zzaq(parcel);
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        int i3 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    str5 = zza.zzq(parcel, zzap);
                    break;
                case 2:
                    uri = (Uri) zza.zza(parcel, zzap, Uri.CREATOR);
                    break;
                case 3:
                    str4 = zza.zzq(parcel, zzap);
                    break;
                case 5:
                    str3 = zza.zzq(parcel, zzap);
                    break;
                case 6:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 7:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 8:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 9:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 10:
                    bundle = zza.zzs(parcel, zzap);
                    break;
                case 1000:
                    i3 = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new AppContentAnnotationEntity(i3, str5, uri, str4, str3, str2, str, i2, i, bundle);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public AppContentAnnotationEntity[] zzgy(int i) {
        return new AppContentAnnotationEntity[i];
    }
}
