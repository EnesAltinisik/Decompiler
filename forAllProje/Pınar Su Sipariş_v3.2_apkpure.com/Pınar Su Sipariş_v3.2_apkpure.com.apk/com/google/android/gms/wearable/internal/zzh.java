package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh implements Creator<AncsNotificationParcelable> {
    static void zza(AncsNotificationParcelable ancsNotificationParcelable, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, ancsNotificationParcelable.mVersionCode);
        zzb.zzc(parcel, 2, ancsNotificationParcelable.getId());
        zzb.zza(parcel, 3, ancsNotificationParcelable.zziC(), false);
        zzb.zza(parcel, 4, ancsNotificationParcelable.zzNw(), false);
        zzb.zza(parcel, 5, ancsNotificationParcelable.zzNx(), false);
        zzb.zza(parcel, 6, ancsNotificationParcelable.getTitle(), false);
        zzb.zza(parcel, 7, ancsNotificationParcelable.zzzv(), false);
        zzb.zza(parcel, 8, ancsNotificationParcelable.getDisplayName(), false);
        zzb.zza(parcel, 9, ancsNotificationParcelable.zzNy());
        zzb.zza(parcel, 10, ancsNotificationParcelable.zzNz());
        zzb.zza(parcel, 11, ancsNotificationParcelable.zzNA());
        zzb.zza(parcel, 12, ancsNotificationParcelable.zzNB());
        zzb.zza(parcel, 13, ancsNotificationParcelable.getPackageName(), false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zziC(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzmz(i);
    }

    public AncsNotificationParcelable zziC(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        byte b = (byte) 0;
        byte b2 = (byte) 0;
        byte b3 = (byte) 0;
        byte b4 = (byte) 0;
        String str7 = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 3:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 4:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 5:
                    str3 = zza.zzq(parcel, zzap);
                    break;
                case 6:
                    str4 = zza.zzq(parcel, zzap);
                    break;
                case 7:
                    str5 = zza.zzq(parcel, zzap);
                    break;
                case 8:
                    str6 = zza.zzq(parcel, zzap);
                    break;
                case 9:
                    b = zza.zze(parcel, zzap);
                    break;
                case 10:
                    b2 = zza.zze(parcel, zzap);
                    break;
                case 11:
                    b3 = zza.zze(parcel, zzap);
                    break;
                case 12:
                    b4 = zza.zze(parcel, zzap);
                    break;
                case 13:
                    str7 = zza.zzq(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new AncsNotificationParcelable(i, i2, str, str2, str3, str4, str5, str6, b, b2, b3, b4, str7);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public AncsNotificationParcelable[] zzmz(int i) {
        return new AncsNotificationParcelable[i];
    }
}
