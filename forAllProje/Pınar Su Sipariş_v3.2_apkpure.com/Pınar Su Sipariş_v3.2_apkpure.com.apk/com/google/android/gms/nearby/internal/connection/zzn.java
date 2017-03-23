package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.connection.AppMetadata;
import com.google.android.gms.nearby.connection.Strategy;

public class zzn implements Creator<StartAdvertisingParams> {
    static void zza(StartAdvertisingParams startAdvertisingParams, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, startAdvertisingParams.zzHy(), false);
        zzb.zza(parcel, 2, startAdvertisingParams.getName(), false);
        zzb.zza(parcel, 3, startAdvertisingParams.zzHG(), i, false);
        zzb.zza(parcel, 4, startAdvertisingParams.zzuD());
        zzb.zza(parcel, 5, startAdvertisingParams.zzHw(), i, false);
        zzb.zza(parcel, 6, startAdvertisingParams.zzHA());
        zzb.zzc(parcel, 1000, startAdvertisingParams.versionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgr(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzjG(i);
    }

    public StartAdvertisingParams zzgr(Parcel parcel) {
        long j = 0;
        Strategy strategy = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        long j2 = 0;
        AppMetadata appMetadata = null;
        String str = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    iBinder = zza.zzr(parcel, zzap);
                    break;
                case 2:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 3:
                    appMetadata = (AppMetadata) zza.zza(parcel, zzap, AppMetadata.CREATOR);
                    break;
                case 4:
                    j2 = zza.zzi(parcel, zzap);
                    break;
                case 5:
                    strategy = (Strategy) zza.zza(parcel, zzap, Strategy.CREATOR);
                    break;
                case 6:
                    j = zza.zzi(parcel, zzap);
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
            return new StartAdvertisingParams(i, iBinder, str, appMetadata, j2, strategy, j);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public StartAdvertisingParams[] zzjG(int i) {
        return new StartAdvertisingParams[i];
    }
}
