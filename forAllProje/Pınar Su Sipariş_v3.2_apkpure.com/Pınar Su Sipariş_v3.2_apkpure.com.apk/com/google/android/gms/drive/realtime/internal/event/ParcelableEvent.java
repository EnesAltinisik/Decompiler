package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class ParcelableEvent extends AbstractSafeParcelable {
    public static final Creator<ParcelableEvent> CREATOR = new zzc();
    final int mVersionCode;
    final String zzPE;
    final String zzVA;
    final ValuesRemovedDetails zzaBA;
    final ValuesSetDetails zzaBB;
    final ValueChangedDetails zzaBC;
    final ReferenceShiftedDetails zzaBD;
    final ObjectChangedDetails zzaBE;
    final FieldChangedDetails zzaBF;
    final String zzaBm;
    final List<String> zzaBs;
    final boolean zzaBt;
    final boolean zzaBu;
    final boolean zzaBv;
    final String zzaBw;
    final TextInsertedDetails zzaBx;
    final TextDeletedDetails zzaBy;
    final ValuesAddedDetails zzaBz;

    ParcelableEvent(int i, String str, String str2, List<String> list, boolean z, boolean z2, boolean z3, String str3, String str4, TextInsertedDetails textInsertedDetails, TextDeletedDetails textDeletedDetails, ValuesAddedDetails valuesAddedDetails, ValuesRemovedDetails valuesRemovedDetails, ValuesSetDetails valuesSetDetails, ValueChangedDetails valueChangedDetails, ReferenceShiftedDetails referenceShiftedDetails, ObjectChangedDetails objectChangedDetails, FieldChangedDetails fieldChangedDetails) {
        this.mVersionCode = i;
        this.zzPE = str;
        this.zzVA = str2;
        this.zzaBs = list;
        this.zzaBt = z;
        this.zzaBu = z2;
        this.zzaBv = z3;
        this.zzaBm = str3;
        this.zzaBw = str4;
        this.zzaBx = textInsertedDetails;
        this.zzaBy = textDeletedDetails;
        this.zzaBz = valuesAddedDetails;
        this.zzaBA = valuesRemovedDetails;
        this.zzaBB = valuesSetDetails;
        this.zzaBC = valueChangedDetails;
        this.zzaBD = referenceShiftedDetails;
        this.zzaBE = objectChangedDetails;
        this.zzaBF = fieldChangedDetails;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzc.zza(this, parcel, i);
    }
}
