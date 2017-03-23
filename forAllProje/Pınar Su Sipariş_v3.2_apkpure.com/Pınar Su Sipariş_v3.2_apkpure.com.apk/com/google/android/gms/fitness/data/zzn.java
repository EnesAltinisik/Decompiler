package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zzn implements Creator<RawBucket> {
    static void zza(RawBucket rawBucket, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, rawBucket.zzXy);
        zzb.zza(parcel, 2, rawBucket.zzaCJ);
        zzb.zza(parcel, 3, rawBucket.zzaCL, i, false);
        zzb.zzc(parcel, 4, rawBucket.zzaDT);
        zzb.zzc(parcel, 5, rawBucket.zzaCU, false);
        zzb.zzc(parcel, 6, rawBucket.zzaCV);
        zzb.zza(parcel, 7, rawBucket.zzaCW);
        zzb.zzc(parcel, 1000, rawBucket.mVersionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzcY(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzfn(i);
    }

    public RawBucket zzcY(Parcel parcel) {
        long j = 0;
        List list = null;
        boolean z = false;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        int i2 = 0;
        Session session = null;
        long j2 = 0;
        int i3 = 0;
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
                    session = (Session) zza.zza(parcel, zzap, Session.CREATOR);
                    break;
                case 4:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 5:
                    list = zza.zzc(parcel, zzap, RawDataSet.CREATOR);
                    break;
                case 6:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 7:
                    z = zza.zzc(parcel, zzap);
                    break;
                case 1000:
                    i3 = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new RawBucket(i3, j2, j, session, i2, list, i, z);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public RawBucket[] zzfn(int i) {
        return new RawBucket[i];
    }
}
