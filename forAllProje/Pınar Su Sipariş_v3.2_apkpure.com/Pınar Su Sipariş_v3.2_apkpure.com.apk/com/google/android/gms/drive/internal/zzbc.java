package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzbc implements Creator<OnPinnedDownloadPreferencesResponse> {
    static void zza(OnPinnedDownloadPreferencesResponse onPinnedDownloadPreferencesResponse, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, onPinnedDownloadPreferencesResponse.mVersionCode);
        zzb.zza(parcel, 2, onPinnedDownloadPreferencesResponse.zzayP, i, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzbI(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzdT(i);
    }

    public OnPinnedDownloadPreferencesResponse zzbI(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        ParcelableTransferPreferences parcelableTransferPreferences = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    parcelableTransferPreferences = (ParcelableTransferPreferences) zza.zza(parcel, zzap, ParcelableTransferPreferences.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new OnPinnedDownloadPreferencesResponse(i, parcelableTransferPreferences);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public OnPinnedDownloadPreferencesResponse[] zzdT(int i) {
        return new OnPinnedDownloadPreferencesResponse[i];
    }
}
