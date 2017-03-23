package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.GameEntity;

public class ExperienceEventEntityCreator implements Creator<ExperienceEventEntity> {
    static void zza(ExperienceEventEntity experienceEventEntity, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, experienceEventEntity.zzAG(), false);
        zzb.zza(parcel, 2, experienceEventEntity.getGame(), i, false);
        zzb.zza(parcel, 3, experienceEventEntity.zzAH(), false);
        zzb.zza(parcel, 4, experienceEventEntity.zzAI(), false);
        zzb.zza(parcel, 5, experienceEventEntity.getIconImageUrl(), false);
        zzb.zza(parcel, 6, experienceEventEntity.getIconImageUri(), i, false);
        zzb.zza(parcel, 7, experienceEventEntity.zzAJ());
        zzb.zzc(parcel, 1000, experienceEventEntity.getVersionCode());
        zzb.zza(parcel, 8, experienceEventEntity.zzAK());
        zzb.zza(parcel, 9, experienceEventEntity.zzAL());
        zzb.zzc(parcel, 10, experienceEventEntity.getType());
        zzb.zzc(parcel, 11, experienceEventEntity.zzAM());
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzen(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzgU(i);
    }

    public ExperienceEventEntity zzen(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        String str = null;
        GameEntity gameEntity = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 2:
                    gameEntity = (GameEntity) zza.zza(parcel, zzap, GameEntity.CREATOR);
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
                    uri = (Uri) zza.zza(parcel, zzap, Uri.CREATOR);
                    break;
                case 7:
                    j = zza.zzi(parcel, zzap);
                    break;
                case 8:
                    j2 = zza.zzi(parcel, zzap);
                    break;
                case 9:
                    j3 = zza.zzi(parcel, zzap);
                    break;
                case 10:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 11:
                    i3 = zza.zzg(parcel, zzap);
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
            return new ExperienceEventEntity(i, str, gameEntity, str2, str3, str4, uri, j, j2, j3, i2, i3);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public ExperienceEventEntity[] zzgU(int i) {
        return new ExperienceEventEntity[i];
    }
}
