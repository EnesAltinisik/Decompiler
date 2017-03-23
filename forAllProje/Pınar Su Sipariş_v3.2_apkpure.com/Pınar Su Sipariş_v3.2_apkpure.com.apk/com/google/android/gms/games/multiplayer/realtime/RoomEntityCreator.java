package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

public class RoomEntityCreator implements Creator<RoomEntity> {
    static void zza(RoomEntity roomEntity, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, roomEntity.getRoomId(), false);
        zzb.zza(parcel, 2, roomEntity.getCreatorId(), false);
        zzb.zza(parcel, 3, roomEntity.getCreationTimestamp());
        zzb.zzc(parcel, 4, roomEntity.getStatus());
        zzb.zza(parcel, 5, roomEntity.getDescription(), false);
        zzb.zzc(parcel, 6, roomEntity.getVariant());
        zzb.zza(parcel, 7, roomEntity.getAutoMatchCriteria(), false);
        zzb.zzc(parcel, 1000, roomEntity.getVersionCode());
        zzb.zzc(parcel, 8, roomEntity.getParticipants(), false);
        zzb.zzc(parcel, 9, roomEntity.getAutoMatchWaitEstimateSeconds());
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzey(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzhl(i);
    }

    public RoomEntity zzey(Parcel parcel) {
        int i = 0;
        ArrayList arrayList = null;
        int zzaq = zza.zzaq(parcel);
        long j = 0;
        Bundle bundle = null;
        int i2 = 0;
        String str = null;
        int i3 = 0;
        String str2 = null;
        String str3 = null;
        int i4 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    str3 = zza.zzq(parcel, zzap);
                    break;
                case 2:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 3:
                    j = zza.zzi(parcel, zzap);
                    break;
                case 4:
                    i3 = zza.zzg(parcel, zzap);
                    break;
                case 5:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 6:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 7:
                    bundle = zza.zzs(parcel, zzap);
                    break;
                case 8:
                    arrayList = zza.zzc(parcel, zzap, ParticipantEntity.CREATOR);
                    break;
                case 9:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 1000:
                    i4 = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new RoomEntity(i4, str3, str2, j, i3, str, i2, bundle, arrayList, i);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public RoomEntity[] zzhl(int i) {
        return new RoomEntity[i];
    }
}
