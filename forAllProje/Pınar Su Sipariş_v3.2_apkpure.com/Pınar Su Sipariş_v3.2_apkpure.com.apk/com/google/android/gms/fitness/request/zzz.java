package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzz implements Creator<SessionRegistrationRequest> {
    static void zza(SessionRegistrationRequest sessionRegistrationRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, sessionRegistrationRequest.getIntent(), i, false);
        zzb.zza(parcel, 2, sessionRegistrationRequest.getCallbackBinder(), false);
        zzb.zzc(parcel, 4, sessionRegistrationRequest.zzyp());
        zzb.zzc(parcel, 1000, sessionRegistrationRequest.getVersionCode());
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzdE(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzfV(i);
    }

    public SessionRegistrationRequest zzdE(Parcel parcel) {
        IBinder iBinder = null;
        int i = 0;
        int zzaq = zza.zzaq(parcel);
        PendingIntent pendingIntent = null;
        int i2 = 0;
        while (parcel.dataPosition() < zzaq) {
            int i3;
            PendingIntent pendingIntent2;
            IBinder iBinder2;
            int zzap = zza.zzap(parcel);
            int i4;
            switch (zza.zzcj(zzap)) {
                case 1:
                    i3 = i2;
                    IBinder iBinder3 = iBinder;
                    pendingIntent2 = (PendingIntent) zza.zza(parcel, zzap, PendingIntent.CREATOR);
                    zzap = i;
                    iBinder2 = iBinder3;
                    break;
                case 2:
                    pendingIntent2 = pendingIntent;
                    i3 = i2;
                    i4 = i;
                    iBinder2 = zza.zzr(parcel, zzap);
                    zzap = i4;
                    break;
                case 4:
                    zzap = zza.zzg(parcel, zzap);
                    iBinder2 = iBinder;
                    pendingIntent2 = pendingIntent;
                    i3 = i2;
                    break;
                case 1000:
                    i4 = i;
                    iBinder2 = iBinder;
                    pendingIntent2 = pendingIntent;
                    i3 = zza.zzg(parcel, zzap);
                    zzap = i4;
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    zzap = i;
                    iBinder2 = iBinder;
                    pendingIntent2 = pendingIntent;
                    i3 = i2;
                    break;
            }
            i2 = i3;
            pendingIntent = pendingIntent2;
            iBinder = iBinder2;
            i = zzap;
        }
        if (parcel.dataPosition() == zzaq) {
            return new SessionRegistrationRequest(i2, pendingIntent, iBinder, i);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public SessionRegistrationRequest[] zzfV(int i) {
        return new SessionRegistrationRequest[i];
    }
}
