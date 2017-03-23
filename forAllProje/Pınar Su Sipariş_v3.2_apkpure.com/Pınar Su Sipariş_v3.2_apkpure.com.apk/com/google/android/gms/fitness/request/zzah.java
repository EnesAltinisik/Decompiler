package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;

public class zzah implements Creator<UnsubscribeRequest> {
    static void zza(UnsubscribeRequest unsubscribeRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, unsubscribeRequest.getDataType(), i, false);
        zzb.zza(parcel, 2, unsubscribeRequest.getDataSource(), i, false);
        zzb.zza(parcel, 3, unsubscribeRequest.getCallbackBinder(), false);
        zzb.zzc(parcel, 1000, unsubscribeRequest.getVersionCode());
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzdM(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzgd(i);
    }

    public UnsubscribeRequest zzdM(Parcel parcel) {
        IBinder iBinder = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        DataSource dataSource = null;
        DataType dataType = null;
        while (parcel.dataPosition() < zzaq) {
            int i2;
            DataType dataType2;
            IBinder iBinder2;
            DataSource dataSource2;
            int zzap = zza.zzap(parcel);
            IBinder iBinder3;
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = i;
                    DataSource dataSource3 = dataSource;
                    dataType2 = (DataType) zza.zza(parcel, zzap, DataType.CREATOR);
                    iBinder2 = iBinder;
                    dataSource2 = dataSource3;
                    break;
                case 2:
                    dataType2 = dataType;
                    i2 = i;
                    iBinder3 = iBinder;
                    dataSource2 = (DataSource) zza.zza(parcel, zzap, DataSource.CREATOR);
                    iBinder2 = iBinder3;
                    break;
                case 3:
                    iBinder2 = zza.zzr(parcel, zzap);
                    dataSource2 = dataSource;
                    dataType2 = dataType;
                    i2 = i;
                    break;
                case 1000:
                    iBinder3 = iBinder;
                    dataSource2 = dataSource;
                    dataType2 = dataType;
                    i2 = zza.zzg(parcel, zzap);
                    iBinder2 = iBinder3;
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    iBinder2 = iBinder;
                    dataSource2 = dataSource;
                    dataType2 = dataType;
                    i2 = i;
                    break;
            }
            i = i2;
            dataType = dataType2;
            dataSource = dataSource2;
            iBinder = iBinder2;
        }
        if (parcel.dataPosition() == zzaq) {
            return new UnsubscribeRequest(i, dataType, dataSource, iBinder);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public UnsubscribeRequest[] zzgd(int i) {
        return new UnsubscribeRequest[i];
    }
}
