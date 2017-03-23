package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd implements Creator<HintRequest> {
    static void zza(HintRequest hintRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, hintRequest.getHintPickerConfig(), i, false);
        zzb.zza(parcel, 2, hintRequest.isEmailAddressIdentifierSupported());
        zzb.zza(parcel, 3, hintRequest.zzoX());
        zzb.zza(parcel, 4, hintRequest.getAccountTypes(), false);
        zzb.zzc(parcel, 1000, hintRequest.mVersionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzI(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzaP(i);
    }

    public HintRequest zzI(Parcel parcel) {
        String[] strArr = null;
        boolean z = false;
        int zzaq = zza.zzaq(parcel);
        boolean z2 = false;
        CredentialPickerConfig credentialPickerConfig = null;
        int i = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    credentialPickerConfig = (CredentialPickerConfig) zza.zza(parcel, zzap, CredentialPickerConfig.CREATOR);
                    break;
                case 2:
                    z2 = zza.zzc(parcel, zzap);
                    break;
                case 3:
                    z = zza.zzc(parcel, zzap);
                    break;
                case 4:
                    strArr = zza.zzC(parcel, zzap);
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
            return new HintRequest(i, credentialPickerConfig, z2, z, strArr);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public HintRequest[] zzaP(int i) {
        return new HintRequest[i];
    }
}
