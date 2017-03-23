package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd implements Creator<HostInfoParcelable> {
    static void zza(HostInfoParcelable hostInfoParcelable, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, hostInfoParcelable.a);
        zzb.zza(parcel, 2, hostInfoParcelable.b, false);
        zzb.zza(parcel, 3, hostInfoParcelable.c, false);
        zzb.zza(parcel, 4, hostInfoParcelable.d);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzjw(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zznA(i);
    }

    public HostInfoParcelable zzjw(Parcel parcel) {
        String str = null;
        boolean z = false;
        int zzaq = zza.zzaq(parcel);
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 3:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 4:
                    z = zza.zzc(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new HostInfoParcelable(i, str2, str, z);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public HostInfoParcelable[] zznA(int i) {
        return new HostInfoParcelable[i];
    }
}
