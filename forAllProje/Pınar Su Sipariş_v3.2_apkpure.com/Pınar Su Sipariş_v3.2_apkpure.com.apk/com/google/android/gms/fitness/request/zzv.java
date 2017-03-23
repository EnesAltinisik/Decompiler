package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

public class zzv implements Creator<SensorRegistrationRequest> {
    static void zza(SensorRegistrationRequest sensorRegistrationRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, sensorRegistrationRequest.getDataSource(), i, false);
        zzb.zza(parcel, 2, sensorRegistrationRequest.getDataType(), i, false);
        zzb.zza(parcel, 3, sensorRegistrationRequest.zzyl(), false);
        zzb.zzc(parcel, 4, sensorRegistrationRequest.zzaHV);
        zzb.zzc(parcel, 5, sensorRegistrationRequest.zzaHW);
        zzb.zza(parcel, 6, sensorRegistrationRequest.zzxH());
        zzb.zza(parcel, 7, sensorRegistrationRequest.zzyi());
        zzb.zzc(parcel, 1000, sensorRegistrationRequest.getVersionCode());
        zzb.zza(parcel, 8, sensorRegistrationRequest.getIntent(), i, false);
        zzb.zza(parcel, 9, sensorRegistrationRequest.zzyh());
        zzb.zzc(parcel, 10, sensorRegistrationRequest.getAccuracyMode());
        zzb.zzc(parcel, 11, sensorRegistrationRequest.zzyj(), false);
        zzb.zza(parcel, 12, sensorRegistrationRequest.zzyk());
        zzb.zza(parcel, 13, sensorRegistrationRequest.getCallbackBinder(), false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzdA(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzfQ(i);
    }

    public SensorRegistrationRequest zzdA(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        DataSource dataSource = null;
        DataType dataType = null;
        IBinder iBinder = null;
        int i2 = 0;
        int i3 = 0;
        long j = 0;
        long j2 = 0;
        PendingIntent pendingIntent = null;
        long j3 = 0;
        int i4 = 0;
        List list = null;
        long j4 = 0;
        IBinder iBinder2 = null;
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
                    iBinder = zza.zzr(parcel, zzap);
                    break;
                case 4:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 5:
                    i3 = zza.zzg(parcel, zzap);
                    break;
                case 6:
                    j = zza.zzi(parcel, zzap);
                    break;
                case 7:
                    j2 = zza.zzi(parcel, zzap);
                    break;
                case 8:
                    pendingIntent = (PendingIntent) zza.zza(parcel, zzap, PendingIntent.CREATOR);
                    break;
                case 9:
                    j3 = zza.zzi(parcel, zzap);
                    break;
                case 10:
                    i4 = zza.zzg(parcel, zzap);
                    break;
                case 11:
                    list = zza.zzc(parcel, zzap, LocationRequest.CREATOR);
                    break;
                case 12:
                    j4 = zza.zzi(parcel, zzap);
                    break;
                case 13:
                    iBinder2 = zza.zzr(parcel, zzap);
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
            return new SensorRegistrationRequest(i, dataSource, dataType, iBinder, i2, i3, j, j2, pendingIntent, j3, i4, list, j4, iBinder2);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public SensorRegistrationRequest[] zzfQ(int i) {
        return new SensorRegistrationRequest[i];
    }
}
