package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataType;

public class zzs implements Creator<ListSubscriptionsRequest> {
    static void zza(ListSubscriptionsRequest listSubscriptionsRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, listSubscriptionsRequest.getDataType(), i, false);
        zzb.zza(parcel, 2, listSubscriptionsRequest.getCallbackBinder(), false);
        zzb.zzc(parcel, 1000, listSubscriptionsRequest.getVersionCode());
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzdx(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzfN(i);
    }

    public ListSubscriptionsRequest zzdx(Parcel parcel) {
        IBinder iBinder = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        DataType dataType = null;
        while (parcel.dataPosition() < zzaq) {
            int i2;
            IBinder iBinder2;
            DataType dataType2;
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = i;
                    DataType dataType3 = (DataType) zza.zza(parcel, zzap, DataType.CREATOR);
                    iBinder2 = iBinder;
                    dataType2 = dataType3;
                    break;
                case 2:
                    iBinder2 = zza.zzr(parcel, zzap);
                    dataType2 = dataType;
                    i2 = i;
                    break;
                case 1000:
                    IBinder iBinder3 = iBinder;
                    dataType2 = dataType;
                    i2 = zza.zzg(parcel, zzap);
                    iBinder2 = iBinder3;
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    iBinder2 = iBinder;
                    dataType2 = dataType;
                    i2 = i;
                    break;
            }
            i = i2;
            dataType = dataType2;
            iBinder = iBinder2;
        }
        if (parcel.dataPosition() == zzaq) {
            return new ListSubscriptionsRequest(i, dataType, iBinder);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public ListSubscriptionsRequest[] zzfN(int i) {
        return new ListSubscriptionsRequest[i];
    }
}
