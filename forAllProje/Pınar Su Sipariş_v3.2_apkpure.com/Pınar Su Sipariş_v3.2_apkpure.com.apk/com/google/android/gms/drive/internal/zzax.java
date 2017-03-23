package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.TransferStateEvent;

public class zzax implements Creator<OnEventResponse> {
    static void zza(OnEventResponse onEventResponse, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, onEventResponse.mVersionCode);
        zzb.zzc(parcel, 2, onEventResponse.zzatd);
        zzb.zza(parcel, 3, onEventResponse.zzayG, i, false);
        zzb.zza(parcel, 5, onEventResponse.zzayH, i, false);
        zzb.zza(parcel, 6, onEventResponse.zzayI, i, false);
        zzb.zza(parcel, 7, onEventResponse.zzayJ, i, false);
        zzb.zza(parcel, 9, onEventResponse.zzayK, i, false);
        zzb.zza(parcel, 10, onEventResponse.zzayL, i, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzbD(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzdO(i);
    }

    public OnEventResponse zzbD(Parcel parcel) {
        int i = 0;
        TransferProgressEvent transferProgressEvent = null;
        int zzaq = zza.zzaq(parcel);
        TransferStateEvent transferStateEvent = null;
        ChangesAvailableEvent changesAvailableEvent = null;
        QueryResultEventParcelable queryResultEventParcelable = null;
        CompletionEvent completionEvent = null;
        ChangeEvent changeEvent = null;
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
                    changeEvent = (ChangeEvent) zza.zza(parcel, zzap, ChangeEvent.CREATOR);
                    break;
                case 5:
                    completionEvent = (CompletionEvent) zza.zza(parcel, zzap, CompletionEvent.CREATOR);
                    break;
                case 6:
                    queryResultEventParcelable = (QueryResultEventParcelable) zza.zza(parcel, zzap, QueryResultEventParcelable.CREATOR);
                    break;
                case 7:
                    changesAvailableEvent = (ChangesAvailableEvent) zza.zza(parcel, zzap, ChangesAvailableEvent.CREATOR);
                    break;
                case 9:
                    transferStateEvent = (TransferStateEvent) zza.zza(parcel, zzap, TransferStateEvent.CREATOR);
                    break;
                case 10:
                    transferProgressEvent = (TransferProgressEvent) zza.zza(parcel, zzap, TransferProgressEvent.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new OnEventResponse(i2, i, changeEvent, completionEvent, queryResultEventParcelable, changesAvailableEvent, transferStateEvent, transferProgressEvent);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public OnEventResponse[] zzdO(int i) {
        return new OnEventResponse[i];
    }
}
