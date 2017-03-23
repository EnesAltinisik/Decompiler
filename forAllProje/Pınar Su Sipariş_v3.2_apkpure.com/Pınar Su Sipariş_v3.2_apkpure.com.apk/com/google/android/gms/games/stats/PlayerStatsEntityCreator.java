package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class PlayerStatsEntityCreator implements Creator<PlayerStatsEntity> {
    static void zza(PlayerStatsEntity playerStatsEntity, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, playerStatsEntity.getAverageSessionLength());
        zzb.zza(parcel, 2, playerStatsEntity.getChurnProbability());
        zzb.zzc(parcel, 3, playerStatsEntity.getDaysSinceLastPlayed());
        zzb.zzc(parcel, 4, playerStatsEntity.getNumberOfPurchases());
        zzb.zzc(parcel, 5, playerStatsEntity.getNumberOfSessions());
        zzb.zza(parcel, 6, playerStatsEntity.getSessionPercentile());
        zzb.zza(parcel, 7, playerStatsEntity.getSpendPercentile());
        zzb.zzc(parcel, 1000, playerStatsEntity.getVersionCode());
        zzb.zza(parcel, 8, playerStatsEntity.zzBB(), false);
        zzb.zza(parcel, 9, playerStatsEntity.getSpendProbability());
        zzb.zza(parcel, 10, playerStatsEntity.getHighSpenderProbability());
        zzb.zza(parcel, 11, playerStatsEntity.getTotalSpendNext28Days());
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzeI(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzhy(i);
    }

    public PlayerStatsEntity zzeI(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        Bundle bundle = null;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    f = zza.zzl(parcel, zzap);
                    break;
                case 2:
                    f2 = zza.zzl(parcel, zzap);
                    break;
                case 3:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 4:
                    i3 = zza.zzg(parcel, zzap);
                    break;
                case 5:
                    i4 = zza.zzg(parcel, zzap);
                    break;
                case 6:
                    f3 = zza.zzl(parcel, zzap);
                    break;
                case 7:
                    f4 = zza.zzl(parcel, zzap);
                    break;
                case 8:
                    bundle = zza.zzs(parcel, zzap);
                    break;
                case 9:
                    f5 = zza.zzl(parcel, zzap);
                    break;
                case 10:
                    f6 = zza.zzl(parcel, zzap);
                    break;
                case 11:
                    f7 = zza.zzl(parcel, zzap);
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
            return new PlayerStatsEntity(i, f, f2, i2, i3, i4, f3, f4, bundle, f5, f6, f7);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public PlayerStatsEntity[] zzhy(int i) {
        return new PlayerStatsEntity[i];
    }
}
