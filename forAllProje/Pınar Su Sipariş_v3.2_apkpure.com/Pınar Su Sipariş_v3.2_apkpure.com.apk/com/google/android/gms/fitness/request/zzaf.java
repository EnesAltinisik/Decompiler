package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.Subscription;

public class zzaf implements Creator<SubscribeRequest> {
    static void zza(SubscribeRequest subscribeRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, subscribeRequest.zzyr(), i, false);
        zzb.zza(parcel, 2, subscribeRequest.zzys());
        zzb.zza(parcel, 3, subscribeRequest.getCallbackBinder(), false);
        zzb.zzc(parcel, 1000, subscribeRequest.getVersionCode());
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzdK(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzgb(i);
    }

    public SubscribeRequest zzdK(Parcel parcel) {
        IBinder iBinder = null;
        boolean z = false;
        int zzaq = zza.zzaq(parcel);
        Subscription subscription = null;
        int i = 0;
        while (parcel.dataPosition() < zzaq) {
            int i2;
            Subscription subscription2;
            IBinder iBinder2;
            boolean z2;
            int zzap = zza.zzap(parcel);
            IBinder iBinder3;
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = i;
                    boolean z3 = z;
                    subscription2 = (Subscription) zza.zza(parcel, zzap, Subscription.CREATOR);
                    iBinder2 = iBinder;
                    z2 = z3;
                    break;
                case 2:
                    subscription2 = subscription;
                    i2 = i;
                    iBinder3 = iBinder;
                    z2 = zza.zzc(parcel, zzap);
                    iBinder2 = iBinder3;
                    break;
                case 3:
                    iBinder2 = zza.zzr(parcel, zzap);
                    z2 = z;
                    subscription2 = subscription;
                    i2 = i;
                    break;
                case 1000:
                    iBinder3 = iBinder;
                    z2 = z;
                    subscription2 = subscription;
                    i2 = zza.zzg(parcel, zzap);
                    iBinder2 = iBinder3;
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    iBinder2 = iBinder;
                    z2 = z;
                    subscription2 = subscription;
                    i2 = i;
                    break;
            }
            i = i2;
            subscription = subscription2;
            z = z2;
            iBinder = iBinder2;
        }
        if (parcel.dataPosition() == zzaq) {
            return new SubscribeRequest(i, subscription, z, iBinder);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public SubscribeRequest[] zzgb(int i) {
        return new SubscribeRequest[i];
    }
}
