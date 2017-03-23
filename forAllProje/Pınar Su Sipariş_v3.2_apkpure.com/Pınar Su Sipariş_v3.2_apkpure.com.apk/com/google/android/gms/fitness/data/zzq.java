package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzq implements Creator<Session> {
    static void zza(Session session, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, session.zzoq());
        zzb.zza(parcel, 2, session.zzxn());
        zzb.zza(parcel, 3, session.getName(), false);
        zzb.zza(parcel, 4, session.getIdentifier(), false);
        zzb.zza(parcel, 5, session.getDescription(), false);
        zzb.zzc(parcel, 7, session.zzxl());
        zzb.zzc(parcel, 1000, session.getVersionCode());
        zzb.zza(parcel, 8, session.zzxw(), i, false);
        zzb.zza(parcel, 9, session.zzxG(), false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzdb(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzfr(i);
    }

    public Session zzdb(Parcel parcel) {
        long j = 0;
        int i = 0;
        Long l = null;
        int zzaq = zza.zzaq(parcel);
        Application application = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j2 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    j2 = zza.zzi(parcel, zzap);
                    break;
                case 2:
                    j = zza.zzi(parcel, zzap);
                    break;
                case 3:
                    str3 = zza.zzq(parcel, zzap);
                    break;
                case 4:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 5:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 7:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 8:
                    application = (Application) zza.zza(parcel, zzap, Application.CREATOR);
                    break;
                case 9:
                    l = zza.zzj(parcel, zzap);
                    break;
                case 1000:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new Session(i2, j2, j, str3, str2, str, i, application, l);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public Session[] zzfr(int i) {
        return new Session[i];
    }
}
