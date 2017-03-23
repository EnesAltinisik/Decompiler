package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zzi implements Creator<AutoClickProtectionConfigurationParcel> {
    static void zza(AutoClickProtectionConfigurationParcel autoClickProtectionConfigurationParcel, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, autoClickProtectionConfigurationParcel.versionCode);
        zzb.zza(parcel, 2, autoClickProtectionConfigurationParcel.zzMl);
        zzb.zzb(parcel, 3, autoClickProtectionConfigurationParcel.zzMm, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzl(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzO(i);
    }

    public AutoClickProtectionConfigurationParcel[] zzO(int i) {
        return new AutoClickProtectionConfigurationParcel[i];
    }

    public AutoClickProtectionConfigurationParcel zzl(Parcel parcel) {
        boolean z = false;
        int zzaq = zza.zzaq(parcel);
        List list = null;
        int i = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    z = zza.zzc(parcel, zzap);
                    break;
                case 3:
                    list = zza.zzE(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new AutoClickProtectionConfigurationParcel(i, z, list);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }
}
