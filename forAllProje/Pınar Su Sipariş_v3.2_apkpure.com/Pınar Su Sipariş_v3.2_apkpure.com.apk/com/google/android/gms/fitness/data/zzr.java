package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzr implements Creator<SessionDataSet> {
    static void zza(SessionDataSet sessionDataSet, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, sessionDataSet.getSession(), i, false);
        zzb.zza(parcel, 2, sessionDataSet.getDataSet(), i, false);
        zzb.zzc(parcel, 1000, sessionDataSet.mVersionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzdc(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzfs(i);
    }

    public SessionDataSet zzdc(Parcel parcel) {
        DataSet dataSet = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        Session session = null;
        while (parcel.dataPosition() < zzaq) {
            int i2;
            DataSet dataSet2;
            Session session2;
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = i;
                    Session session3 = (Session) zza.zza(parcel, zzap, Session.CREATOR);
                    dataSet2 = dataSet;
                    session2 = session3;
                    break;
                case 2:
                    dataSet2 = (DataSet) zza.zza(parcel, zzap, DataSet.CREATOR);
                    session2 = session;
                    i2 = i;
                    break;
                case 1000:
                    DataSet dataSet3 = dataSet;
                    session2 = session;
                    i2 = zza.zzg(parcel, zzap);
                    dataSet2 = dataSet3;
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    dataSet2 = dataSet;
                    session2 = session;
                    i2 = i;
                    break;
            }
            i = i2;
            session = session2;
            dataSet = dataSet2;
        }
        if (parcel.dataPosition() == zzaq) {
            return new SessionDataSet(i, session, dataSet);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public SessionDataSet[] zzfs(int i) {
        return new SessionDataSet[i];
    }
}
