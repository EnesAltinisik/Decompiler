package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;

public class zzk implements Creator<DataUpdateListenerRegistrationRequest> {
    static void zza(DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, dataUpdateListenerRegistrationRequest.getDataSource(), i, false);
        zzb.zza(parcel, 2, dataUpdateListenerRegistrationRequest.getDataType(), i, false);
        zzb.zza(parcel, 3, dataUpdateListenerRegistrationRequest.getIntent(), i, false);
        zzb.zza(parcel, 4, dataUpdateListenerRegistrationRequest.getCallbackBinder(), false);
        zzb.zzc(parcel, 1000, dataUpdateListenerRegistrationRequest.getVersionCode());
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzdq(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzfG(i);
    }

    public DataUpdateListenerRegistrationRequest zzdq(Parcel parcel) {
        IBinder iBinder = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        PendingIntent pendingIntent = null;
        DataType dataType = null;
        DataSource dataSource = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    dataSource = (DataSource) zza.zza(parcel, zzap, DataSource.CREATOR);
                    break;
                case 2:
                    dataType = (DataType) zza.zza(parcel, zzap, DataType.CREATOR);
                    break;
                case 3:
                    pendingIntent = (PendingIntent) zza.zza(parcel, zzap, PendingIntent.CREATOR);
                    break;
                case 4:
                    iBinder = zza.zzr(parcel, zzap);
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
            return new DataUpdateListenerRegistrationRequest(i, dataSource, dataType, pendingIntent, iBinder);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public DataUpdateListenerRegistrationRequest[] zzfG(int i) {
        return new DataUpdateListenerRegistrationRequest[i];
    }
}
