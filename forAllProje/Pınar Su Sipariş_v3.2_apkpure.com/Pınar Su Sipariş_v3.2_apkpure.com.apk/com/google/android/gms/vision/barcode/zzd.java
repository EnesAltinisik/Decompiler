package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.vision.barcode.Barcode.CalendarDateTime;
import com.google.android.gms.vision.barcode.Barcode.CalendarEvent;

public class zzd implements Creator<CalendarEvent> {
    static void zza(CalendarEvent calendarEvent, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, calendarEvent.versionCode);
        zzb.zza(parcel, 2, calendarEvent.summary, false);
        zzb.zza(parcel, 3, calendarEvent.description, false);
        zzb.zza(parcel, 4, calendarEvent.location, false);
        zzb.zza(parcel, 5, calendarEvent.organizer, false);
        zzb.zza(parcel, 6, calendarEvent.status, false);
        zzb.zza(parcel, 7, calendarEvent.start, i, false);
        zzb.zza(parcel, 8, calendarEvent.end, i, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhs(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzlk(i);
    }

    public CalendarEvent zzhs(Parcel parcel) {
        CalendarDateTime calendarDateTime = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        CalendarDateTime calendarDateTime2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    str5 = zza.zzq(parcel, zzap);
                    break;
                case 3:
                    str4 = zza.zzq(parcel, zzap);
                    break;
                case 4:
                    str3 = zza.zzq(parcel, zzap);
                    break;
                case 5:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 6:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 7:
                    calendarDateTime2 = (CalendarDateTime) zza.zza(parcel, zzap, CalendarDateTime.CREATOR);
                    break;
                case 8:
                    calendarDateTime = (CalendarDateTime) zza.zza(parcel, zzap, CalendarDateTime.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new CalendarEvent(i, str5, str4, str3, str2, str, calendarDateTime2, calendarDateTime);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public CalendarEvent[] zzlk(int i) {
        return new CalendarEvent[i];
    }
}
