package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi implements Creator<GeneratePasswordRequest> {
    static void zza(GeneratePasswordRequest generatePasswordRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, generatePasswordRequest.zzoU(), i, false);
        zzb.zzc(parcel, 1000, generatePasswordRequest.mVersionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzM(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzaT(i);
    }

    public GeneratePasswordRequest zzM(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        PasswordSpecification passwordSpecification = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    passwordSpecification = (PasswordSpecification) zza.zza(parcel, zzap, PasswordSpecification.CREATOR);
                    break;
                case 1000:
                    i = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new GeneratePasswordRequest(i, passwordSpecification);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public GeneratePasswordRequest[] zzaT(int i) {
        return new GeneratePasswordRequest[i];
    }
}
