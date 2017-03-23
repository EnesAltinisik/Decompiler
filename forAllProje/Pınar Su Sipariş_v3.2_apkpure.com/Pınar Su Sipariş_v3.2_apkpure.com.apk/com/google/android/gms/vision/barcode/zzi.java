package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.vision.barcode.Barcode.PersonName;

public class zzi implements Creator<PersonName> {
    static void zza(PersonName personName, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, personName.versionCode);
        zzb.zza(parcel, 2, personName.formattedName, false);
        zzb.zza(parcel, 3, personName.pronunciation, false);
        zzb.zza(parcel, 4, personName.prefix, false);
        zzb.zza(parcel, 5, personName.first, false);
        zzb.zza(parcel, 6, personName.middle, false);
        zzb.zza(parcel, 7, personName.last, false);
        zzb.zza(parcel, 8, personName.suffix, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhx(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzlp(i);
    }

    public PersonName zzhx(Parcel parcel) {
        String str = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    str7 = zza.zzq(parcel, zzap);
                    break;
                case 3:
                    str6 = zza.zzq(parcel, zzap);
                    break;
                case 4:
                    str5 = zza.zzq(parcel, zzap);
                    break;
                case 5:
                    str4 = zza.zzq(parcel, zzap);
                    break;
                case 6:
                    str3 = zza.zzq(parcel, zzap);
                    break;
                case 7:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 8:
                    str = zza.zzq(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new PersonName(i, str7, str6, str5, str4, str3, str2, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public PersonName[] zzlp(int i) {
        return new PersonName[i];
    }
}
