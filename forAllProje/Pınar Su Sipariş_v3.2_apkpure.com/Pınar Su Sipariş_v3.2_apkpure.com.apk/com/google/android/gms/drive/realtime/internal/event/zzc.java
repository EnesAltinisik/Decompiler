package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zzc implements Creator<ParcelableEvent> {
    static void zza(ParcelableEvent parcelableEvent, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, parcelableEvent.mVersionCode);
        zzb.zza(parcel, 2, parcelableEvent.zzPE, false);
        zzb.zza(parcel, 3, parcelableEvent.zzVA, false);
        zzb.zzb(parcel, 4, parcelableEvent.zzaBs, false);
        zzb.zza(parcel, 5, parcelableEvent.zzaBt);
        zzb.zza(parcel, 6, parcelableEvent.zzaBm, false);
        zzb.zza(parcel, 7, parcelableEvent.zzaBw, false);
        zzb.zza(parcel, 8, parcelableEvent.zzaBx, i, false);
        zzb.zza(parcel, 9, parcelableEvent.zzaBy, i, false);
        zzb.zza(parcel, 10, parcelableEvent.zzaBz, i, false);
        zzb.zza(parcel, 11, parcelableEvent.zzaBA, i, false);
        zzb.zza(parcel, 12, parcelableEvent.zzaBB, i, false);
        zzb.zza(parcel, 13, parcelableEvent.zzaBC, i, false);
        zzb.zza(parcel, 14, parcelableEvent.zzaBD, i, false);
        zzb.zza(parcel, 15, parcelableEvent.zzaBE, i, false);
        zzb.zza(parcel, 16, parcelableEvent.zzaBu);
        zzb.zza(parcel, 17, parcelableEvent.zzaBv);
        zzb.zza(parcel, 18, parcelableEvent.zzaBF, i, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzcE(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzeQ(i);
    }

    public ParcelableEvent zzcE(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String str3 = null;
        String str4 = null;
        TextInsertedDetails textInsertedDetails = null;
        TextDeletedDetails textDeletedDetails = null;
        ValuesAddedDetails valuesAddedDetails = null;
        ValuesRemovedDetails valuesRemovedDetails = null;
        ValuesSetDetails valuesSetDetails = null;
        ValueChangedDetails valueChangedDetails = null;
        ReferenceShiftedDetails referenceShiftedDetails = null;
        ObjectChangedDetails objectChangedDetails = null;
        FieldChangedDetails fieldChangedDetails = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 3:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 4:
                    list = zza.zzE(parcel, zzap);
                    break;
                case 5:
                    z = zza.zzc(parcel, zzap);
                    break;
                case 6:
                    str3 = zza.zzq(parcel, zzap);
                    break;
                case 7:
                    str4 = zza.zzq(parcel, zzap);
                    break;
                case 8:
                    textInsertedDetails = (TextInsertedDetails) zza.zza(parcel, zzap, TextInsertedDetails.CREATOR);
                    break;
                case 9:
                    textDeletedDetails = (TextDeletedDetails) zza.zza(parcel, zzap, TextDeletedDetails.CREATOR);
                    break;
                case 10:
                    valuesAddedDetails = (ValuesAddedDetails) zza.zza(parcel, zzap, ValuesAddedDetails.CREATOR);
                    break;
                case 11:
                    valuesRemovedDetails = (ValuesRemovedDetails) zza.zza(parcel, zzap, ValuesRemovedDetails.CREATOR);
                    break;
                case 12:
                    valuesSetDetails = (ValuesSetDetails) zza.zza(parcel, zzap, ValuesSetDetails.CREATOR);
                    break;
                case 13:
                    valueChangedDetails = (ValueChangedDetails) zza.zza(parcel, zzap, ValueChangedDetails.CREATOR);
                    break;
                case 14:
                    referenceShiftedDetails = (ReferenceShiftedDetails) zza.zza(parcel, zzap, ReferenceShiftedDetails.CREATOR);
                    break;
                case 15:
                    objectChangedDetails = (ObjectChangedDetails) zza.zza(parcel, zzap, ObjectChangedDetails.CREATOR);
                    break;
                case 16:
                    z2 = zza.zzc(parcel, zzap);
                    break;
                case 17:
                    z3 = zza.zzc(parcel, zzap);
                    break;
                case 18:
                    fieldChangedDetails = (FieldChangedDetails) zza.zza(parcel, zzap, FieldChangedDetails.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new ParcelableEvent(i, str, str2, list, z, z2, z3, str3, str4, textInsertedDetails, textDeletedDetails, valuesAddedDetails, valuesRemovedDetails, valuesSetDetails, valueChangedDetails, referenceShiftedDetails, objectChangedDetails, fieldChangedDetails);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public ParcelableEvent[] zzeQ(int i) {
        return new ParcelableEvent[i];
    }
}
