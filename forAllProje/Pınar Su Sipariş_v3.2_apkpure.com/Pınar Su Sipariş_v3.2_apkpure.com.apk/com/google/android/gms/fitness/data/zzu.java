package com.google.android.gms.fitness.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzu implements Creator<Value> {
    static void zza(Value value, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, value.getFormat());
        zzb.zza(parcel, 2, value.isSet());
        zzb.zza(parcel, 3, value.zzxF());
        zzb.zza(parcel, 4, value.zzxK(), false);
        zzb.zza(parcel, 5, value.zzxL(), false);
        zzb.zza(parcel, 6, value.zzxM(), false);
        zzb.zza(parcel, 7, value.zzxN(), false);
        zzb.zzc(parcel, 1000, value.getVersionCode());
        zzb.zza(parcel, 8, value.zzxO(), false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzde(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzfu(i);
    }

    public Value zzde(Parcel parcel) {
        boolean z = false;
        byte[] bArr = null;
        int zzaq = zza.zzaq(parcel);
        float f = 0.0f;
        float[] fArr = null;
        int[] iArr = null;
        Bundle bundle = null;
        String str = null;
        int i = 0;
        int i2 = 0;
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
                    f = zza.zzl(parcel, zzap);
                    break;
                case 4:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 5:
                    bundle = zza.zzs(parcel, zzap);
                    break;
                case 6:
                    iArr = zza.zzw(parcel, zzap);
                    break;
                case 7:
                    fArr = zza.zzz(parcel, zzap);
                    break;
                case 8:
                    bArr = zza.zzt(parcel, zzap);
                    break;
                case 1000:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new Value(i2, i, z, f, str, bundle, iArr, fArr, bArr);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public Value[] zzfu(int i) {
        return new Value[i];
    }
}
