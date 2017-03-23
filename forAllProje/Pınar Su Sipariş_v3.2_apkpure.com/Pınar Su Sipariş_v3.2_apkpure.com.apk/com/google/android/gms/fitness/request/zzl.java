package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzl implements Creator<DataUpdateListenerUnregistrationRequest> {
    static void zza(DataUpdateListenerUnregistrationRequest dataUpdateListenerUnregistrationRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, dataUpdateListenerUnregistrationRequest.getIntent(), i, false);
        zzb.zza(parcel, 2, dataUpdateListenerUnregistrationRequest.getCallbackBinder(), false);
        zzb.zzc(parcel, 1000, dataUpdateListenerUnregistrationRequest.getVersionCode());
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzdr(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzfH(i);
    }

    public DataUpdateListenerUnregistrationRequest zzdr(Parcel parcel) {
        IBinder iBinder = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < zzaq) {
            int i2;
            IBinder iBinder2;
            PendingIntent pendingIntent2;
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = i;
                    PendingIntent pendingIntent3 = (PendingIntent) zza.zza(parcel, zzap, PendingIntent.CREATOR);
                    iBinder2 = iBinder;
                    pendingIntent2 = pendingIntent3;
                    break;
                case 2:
                    iBinder2 = zza.zzr(parcel, zzap);
                    pendingIntent2 = pendingIntent;
                    i2 = i;
                    break;
                case 1000:
                    IBinder iBinder3 = iBinder;
                    pendingIntent2 = pendingIntent;
                    i2 = zza.zzg(parcel, zzap);
                    iBinder2 = iBinder3;
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    iBinder2 = iBinder;
                    pendingIntent2 = pendingIntent;
                    i2 = i;
                    break;
            }
            i = i2;
            pendingIntent = pendingIntent2;
            iBinder = iBinder2;
        }
        if (parcel.dataPosition() == zzaq) {
            return new DataUpdateListenerUnregistrationRequest(i, pendingIntent, iBinder);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public DataUpdateListenerUnregistrationRequest[] zzfH(int i) {
        return new DataUpdateListenerUnregistrationRequest[i];
    }
}
