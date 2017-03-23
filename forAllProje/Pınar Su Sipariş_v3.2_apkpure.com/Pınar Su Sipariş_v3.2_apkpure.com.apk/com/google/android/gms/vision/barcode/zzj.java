package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.vision.barcode.Barcode.Phone;

public class zzj implements Creator<Phone> {
    static void zza(Phone phone, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, phone.versionCode);
        zzb.zzc(parcel, 2, phone.type);
        zzb.zza(parcel, 3, phone.number, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhy(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzlq(i);
    }

    public Phone zzhy(Parcel parcel) {
        int i = 0;
        int zzaq = zza.zzaq(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 3:
                    str = zza.zzq(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new Phone(i2, i, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public Phone[] zzlq(int i) {
        return new Phone[i];
    }
}
