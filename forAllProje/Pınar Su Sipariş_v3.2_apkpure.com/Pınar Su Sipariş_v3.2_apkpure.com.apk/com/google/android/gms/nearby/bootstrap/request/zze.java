package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze implements Creator<EnableTargetRequest> {
    static void zza(EnableTargetRequest enableTargetRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, enableTargetRequest.getName(), false);
        zzb.zza(parcel, 2, enableTargetRequest.getDescription(), false);
        zzb.zza(parcel, 3, enableTargetRequest.zzHt(), false);
        zzb.zza(parcel, 4, enableTargetRequest.zzHu(), false);
        zzb.zza(parcel, 5, enableTargetRequest.getCallbackBinder(), false);
        zzb.zza(parcel, 6, enableTargetRequest.zzHn());
        zzb.zza(parcel, 7, enableTargetRequest.zzHs());
        zzb.zzc(parcel, 1000, enableTargetRequest.versionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzga(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzjk(i);
    }

    public EnableTargetRequest zzga(Parcel parcel) {
        byte b = (byte) 0;
        IBinder iBinder = null;
        int zzaq = zza.zzaq(parcel);
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        byte b2 = (byte) 0;
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 2:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 3:
                    iBinder3 = zza.zzr(parcel, zzap);
                    break;
                case 4:
                    iBinder2 = zza.zzr(parcel, zzap);
                    break;
                case 5:
                    iBinder = zza.zzr(parcel, zzap);
                    break;
                case 6:
                    b2 = zza.zze(parcel, zzap);
                    break;
                case 7:
                    b = zza.zze(parcel, zzap);
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
            return new EnableTargetRequest(i, str2, str, b2, b, iBinder3, iBinder2, iBinder);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public EnableTargetRequest[] zzjk(int i) {
        return new EnableTargetRequest[i];
    }
}
