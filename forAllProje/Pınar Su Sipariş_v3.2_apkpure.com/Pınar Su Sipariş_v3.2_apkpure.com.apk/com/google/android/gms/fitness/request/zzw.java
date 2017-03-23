package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzw implements Creator<SensorUnregistrationRequest> {
    static void zza(SensorUnregistrationRequest sensorUnregistrationRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, sensorUnregistrationRequest.zzyl(), false);
        zzb.zza(parcel, 2, sensorUnregistrationRequest.getIntent(), i, false);
        zzb.zza(parcel, 3, sensorUnregistrationRequest.getCallbackBinder(), false);
        zzb.zzc(parcel, 1000, sensorUnregistrationRequest.getVersionCode());
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzdB(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzfS(i);
    }

    public SensorUnregistrationRequest zzdB(Parcel parcel) {
        IBinder iBinder = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < zzaq) {
            int i2;
            IBinder zzr;
            IBinder iBinder3;
            PendingIntent pendingIntent2;
            int zzap = zza.zzap(parcel);
            IBinder iBinder4;
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = i;
                    PendingIntent pendingIntent3 = pendingIntent;
                    zzr = zza.zzr(parcel, zzap);
                    iBinder3 = iBinder;
                    pendingIntent2 = pendingIntent3;
                    break;
                case 2:
                    zzr = iBinder2;
                    i2 = i;
                    iBinder4 = iBinder;
                    pendingIntent2 = (PendingIntent) zza.zza(parcel, zzap, PendingIntent.CREATOR);
                    iBinder3 = iBinder4;
                    break;
                case 3:
                    iBinder3 = zza.zzr(parcel, zzap);
                    pendingIntent2 = pendingIntent;
                    zzr = iBinder2;
                    i2 = i;
                    break;
                case 1000:
                    iBinder4 = iBinder;
                    pendingIntent2 = pendingIntent;
                    zzr = iBinder2;
                    i2 = zza.zzg(parcel, zzap);
                    iBinder3 = iBinder4;
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    iBinder3 = iBinder;
                    pendingIntent2 = pendingIntent;
                    zzr = iBinder2;
                    i2 = i;
                    break;
            }
            i = i2;
            iBinder2 = zzr;
            pendingIntent = pendingIntent2;
            iBinder = iBinder3;
        }
        if (parcel.dataPosition() == zzaq) {
            return new SensorUnregistrationRequest(i, iBinder2, pendingIntent, iBinder);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public SensorUnregistrationRequest[] zzfS(int i) {
        return new SensorUnregistrationRequest[i];
    }
}
