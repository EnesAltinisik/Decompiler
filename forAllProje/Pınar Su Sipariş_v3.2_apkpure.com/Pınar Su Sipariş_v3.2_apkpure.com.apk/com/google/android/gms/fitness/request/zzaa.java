package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.Session;

public class zzaa implements Creator<SessionStartRequest> {
    static void zza(SessionStartRequest sessionStartRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, sessionStartRequest.getSession(), i, false);
        zzb.zza(parcel, 2, sessionStartRequest.getCallbackBinder(), false);
        zzb.zzc(parcel, 1000, sessionStartRequest.getVersionCode());
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzdF(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzfW(i);
    }

    public SessionStartRequest zzdF(Parcel parcel) {
        IBinder iBinder = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        Session session = null;
        while (parcel.dataPosition() < zzaq) {
            int i2;
            IBinder iBinder2;
            Session session2;
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = i;
                    Session session3 = (Session) zza.zza(parcel, zzap, Session.CREATOR);
                    iBinder2 = iBinder;
                    session2 = session3;
                    break;
                case 2:
                    iBinder2 = zza.zzr(parcel, zzap);
                    session2 = session;
                    i2 = i;
                    break;
                case 1000:
                    IBinder iBinder3 = iBinder;
                    session2 = session;
                    i2 = zza.zzg(parcel, zzap);
                    iBinder2 = iBinder3;
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    iBinder2 = iBinder;
                    session2 = session;
                    i2 = i;
                    break;
            }
            i = i2;
            session = session2;
            iBinder = iBinder2;
        }
        if (parcel.dataPosition() == zzaq) {
            return new SessionStartRequest(i, session, iBinder);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public SessionStartRequest[] zzfW(int i) {
        return new SessionStartRequest[i];
    }
}
