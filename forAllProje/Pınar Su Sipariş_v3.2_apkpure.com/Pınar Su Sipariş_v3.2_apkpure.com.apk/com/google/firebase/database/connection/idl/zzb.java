package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.List;

public class zzb implements Creator<ConnectionConfig> {
    static void zza(ConnectionConfig connectionConfig, Parcel parcel, int i) {
        int zzar = com.google.android.gms.common.internal.safeparcel.zzb.zzar(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 1, connectionConfig.versionCode);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 2, connectionConfig.zzbKo, i, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 3, connectionConfig.zzbKp);
        com.google.android.gms.common.internal.safeparcel.zzb.zzb(parcel, 4, connectionConfig.zzbKq, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 5, connectionConfig.zzbIX);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 6, connectionConfig.zzbKr, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 7, connectionConfig.zzbIZ, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzjv(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zznz(i);
    }

    public ConnectionConfig zzjv(Parcel parcel) {
        boolean z = false;
        String str = null;
        int zzaq = zza.zzaq(parcel);
        String str2 = null;
        List list = null;
        int i = 0;
        HostInfoParcelable hostInfoParcelable = null;
        int i2 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    hostInfoParcelable = (HostInfoParcelable) zza.zza(parcel, zzap, HostInfoParcelable.CREATOR);
                    break;
                case 3:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 4:
                    list = zza.zzE(parcel, zzap);
                    break;
                case 5:
                    z = zza.zzc(parcel, zzap);
                    break;
                case 6:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 7:
                    str = zza.zzq(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new ConnectionConfig(i2, hostInfoParcelable, i, list, z, str2, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public ConnectionConfig[] zznz(int i) {
        return new ConnectionConfig[i];
    }
}
