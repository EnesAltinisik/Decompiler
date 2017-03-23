package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh implements Creator<TextRecognizerOptions> {
    static void zza(TextRecognizerOptions textRecognizerOptions, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, textRecognizerOptions.versionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhL(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzlF(i);
    }

    public TextRecognizerOptions zzhL(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new TextRecognizerOptions(i);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public TextRecognizerOptions[] zzlF(int i) {
        return new TextRecognizerOptions[i];
    }
}
