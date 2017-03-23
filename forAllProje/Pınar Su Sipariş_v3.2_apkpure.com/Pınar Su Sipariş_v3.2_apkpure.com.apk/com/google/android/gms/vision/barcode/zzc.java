package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.vision.barcode.Barcode.CalendarDateTime;

public class zzc implements Creator<CalendarDateTime> {
    static void zza(CalendarDateTime calendarDateTime, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, calendarDateTime.versionCode);
        zzb.zzc(parcel, 2, calendarDateTime.year);
        zzb.zzc(parcel, 3, calendarDateTime.month);
        zzb.zzc(parcel, 4, calendarDateTime.day);
        zzb.zzc(parcel, 5, calendarDateTime.hours);
        zzb.zzc(parcel, 6, calendarDateTime.minutes);
        zzb.zzc(parcel, 7, calendarDateTime.seconds);
        zzb.zza(parcel, 8, calendarDateTime.isUtc);
        zzb.zza(parcel, 9, calendarDateTime.rawValue, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhr(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzlj(i);
    }

    public CalendarDateTime zzhr(Parcel parcel) {
        boolean z = false;
        int zzaq = zza.zzaq(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i7 = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    i6 = zza.zzg(parcel, zzap);
                    break;
                case 3:
                    i5 = zza.zzg(parcel, zzap);
                    break;
                case 4:
                    i4 = zza.zzg(parcel, zzap);
                    break;
                case 5:
                    i3 = zza.zzg(parcel, zzap);
                    break;
                case 6:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 7:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 8:
                    z = zza.zzc(parcel, zzap);
                    break;
                case 9:
                    str = zza.zzq(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new CalendarDateTime(i7, i6, i5, i4, i3, i2, i, z, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public CalendarDateTime[] zzlj(int i) {
        return new CalendarDateTime[i];
    }
}
