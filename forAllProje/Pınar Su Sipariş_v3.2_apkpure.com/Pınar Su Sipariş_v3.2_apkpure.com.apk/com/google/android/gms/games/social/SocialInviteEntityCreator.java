package com.google.android.gms.games.social;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.PlayerEntity;

public class SocialInviteEntityCreator implements Creator<SocialInviteEntity> {
    static void zza(SocialInviteEntity socialInviteEntity, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, socialInviteEntity.zzBz(), false);
        zzb.zza(parcel, 2, socialInviteEntity.getPlayer(), i, false);
        zzb.zzc(parcel, 3, socialInviteEntity.getType());
        zzb.zzc(parcel, 4, socialInviteEntity.getDirection());
        zzb.zza(parcel, 5, socialInviteEntity.getLastModifiedTimestamp());
        zzb.zzc(parcel, 1000, socialInviteEntity.getVersionCode());
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzeH(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzhw(i);
    }

    public SocialInviteEntity zzeH(Parcel parcel) {
        PlayerEntity playerEntity = null;
        int i = 0;
        int zzaq = zza.zzaq(parcel);
        long j = 0;
        int i2 = 0;
        String str = null;
        int i3 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 2:
                    playerEntity = (PlayerEntity) zza.zza(parcel, zzap, PlayerEntity.CREATOR);
                    break;
                case 3:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 4:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 5:
                    j = zza.zzi(parcel, zzap);
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
            return new SocialInviteEntity(i3, str, playerEntity, i2, i, j);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public SocialInviteEntity[] zzhw(int i) {
        return new SocialInviteEntity[i];
    }
}
