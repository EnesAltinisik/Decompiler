package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class StockProfileImageEntityCreator implements Creator<StockProfileImageEntity> {
    static void zza(StockProfileImageEntity stockProfileImageEntity, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, stockProfileImageEntity.getImageUrl(), false);
        zzb.zza(parcel, 2, stockProfileImageEntity.zzzo(), i, false);
        zzb.zzc(parcel, 1000, stockProfileImageEntity.getVersionCode());
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzes(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzhe(i);
    }

    public StockProfileImageEntity zzes(Parcel parcel) {
        Uri uri = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 2:
                    uri = (Uri) zza.zza(parcel, zzap, Uri.CREATOR);
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
            return new StockProfileImageEntity(i, str, uri);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public StockProfileImageEntity[] zzhe(int i) {
        return new StockProfileImageEntity[i];
    }
}
