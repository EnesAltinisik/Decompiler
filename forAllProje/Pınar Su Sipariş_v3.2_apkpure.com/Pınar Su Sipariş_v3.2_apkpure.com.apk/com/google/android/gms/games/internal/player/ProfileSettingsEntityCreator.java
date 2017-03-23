package com.google.android.gms.games.internal.player;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class ProfileSettingsEntityCreator implements Creator<ProfileSettingsEntity> {
    static void zza(ProfileSettingsEntity profileSettingsEntity, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, profileSettingsEntity.getStatus(), i, false);
        zzb.zza(parcel, 2, profileSettingsEntity.zzyQ(), false);
        zzb.zza(parcel, 3, profileSettingsEntity.zzza());
        zzb.zza(parcel, 4, profileSettingsEntity.zzyT());
        zzb.zza(parcel, 5, profileSettingsEntity.zzyY());
        zzb.zza(parcel, 6, profileSettingsEntity.zzyZ(), i, false);
        zzb.zza(parcel, 7, profileSettingsEntity.zzzb());
        zzb.zzc(parcel, 1000, profileSettingsEntity.getVersionCode());
        zzb.zza(parcel, 8, profileSettingsEntity.zzzc());
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzer(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzhc(i);
    }

    public ProfileSettingsEntity zzer(Parcel parcel) {
        StockProfileImageEntity stockProfileImageEntity = null;
        boolean z = false;
        int zzaq = zza.zzaq(parcel);
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        String str = null;
        Status status = null;
        int i = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    status = (Status) zza.zza(parcel, zzap, Status.CREATOR);
                    break;
                case 2:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 3:
                    z5 = zza.zzc(parcel, zzap);
                    break;
                case 4:
                    z4 = zza.zzc(parcel, zzap);
                    break;
                case 5:
                    z3 = zza.zzc(parcel, zzap);
                    break;
                case 6:
                    stockProfileImageEntity = (StockProfileImageEntity) zza.zza(parcel, zzap, StockProfileImageEntity.CREATOR);
                    break;
                case 7:
                    z2 = zza.zzc(parcel, zzap);
                    break;
                case 8:
                    z = zza.zzc(parcel, zzap);
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
            return new ProfileSettingsEntity(i, status, str, z5, z4, z3, stockProfileImageEntity, z2, z);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public ProfileSettingsEntity[] zzhc(int i) {
        return new ProfileSettingsEntity[i];
    }
}
