package com.google.android.gms.drive.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzbf implements Creator<OnStartStreamSession> {
    static void zza(OnStartStreamSession onStartStreamSession, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, onStartStreamSession.mVersionCode);
        zzb.zza(parcel, 2, onStartStreamSession.zzayQ, i, false);
        zzb.zza(parcel, 3, onStartStreamSession.zzayR, false);
        zzb.zza(parcel, 4, onStartStreamSession.zzug, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzbL(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzdW(i);
    }

    public OnStartStreamSession zzbL(Parcel parcel) {
        String str = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        IBinder iBinder = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < zzaq) {
            IBinder iBinder2;
            ParcelFileDescriptor parcelFileDescriptor2;
            int zzg;
            String str2;
            int zzap = zza.zzap(parcel);
            String str3;
            switch (zza.zzcj(zzap)) {
                case 1:
                    str3 = str;
                    iBinder2 = iBinder;
                    parcelFileDescriptor2 = parcelFileDescriptor;
                    zzg = zza.zzg(parcel, zzap);
                    str2 = str3;
                    break;
                case 2:
                    zzg = i;
                    IBinder iBinder3 = iBinder;
                    parcelFileDescriptor2 = (ParcelFileDescriptor) zza.zza(parcel, zzap, ParcelFileDescriptor.CREATOR);
                    str2 = str;
                    iBinder2 = iBinder3;
                    break;
                case 3:
                    parcelFileDescriptor2 = parcelFileDescriptor;
                    zzg = i;
                    str3 = str;
                    iBinder2 = zza.zzr(parcel, zzap);
                    str2 = str3;
                    break;
                case 4:
                    str2 = zza.zzq(parcel, zzap);
                    iBinder2 = iBinder;
                    parcelFileDescriptor2 = parcelFileDescriptor;
                    zzg = i;
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    str2 = str;
                    iBinder2 = iBinder;
                    parcelFileDescriptor2 = parcelFileDescriptor;
                    zzg = i;
                    break;
            }
            i = zzg;
            parcelFileDescriptor = parcelFileDescriptor2;
            iBinder = iBinder2;
            str = str2;
        }
        if (parcel.dataPosition() == zzaq) {
            return new OnStartStreamSession(i, parcelFileDescriptor, iBinder, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public OnStartStreamSession[] zzdW(int i) {
        return new OnStartStreamSession[i];
    }
}
