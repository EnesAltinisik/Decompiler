package com.google.android.gms.vision.text.internal.client;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf implements Creator<RecognitionOptions> {
    static void zza(RecognitionOptions recognitionOptions, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, recognitionOptions.versionCode);
        zzb.zza(parcel, 2, recognitionOptions.zzbyH, i, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhJ(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzlD(i);
    }

    public RecognitionOptions zzhJ(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        Rect rect = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    rect = (Rect) zza.zza(parcel, zzap, Rect.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new RecognitionOptions(i, rect);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public RecognitionOptions[] zzlD(int i) {
        return new RecognitionOptions[i];
    }
}
