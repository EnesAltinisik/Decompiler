package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class ComparisonFilter<T> extends AbstractFilter {
    public static final zza CREATOR = new zza();
    final int mVersionCode;
    final Operator zzaAH;
    final MetadataBundle zzaAI;
    final MetadataField<T> zzaAJ;

    ComparisonFilter(int i, Operator operator, MetadataBundle metadataBundle) {
        this.mVersionCode = i;
        this.zzaAH = operator;
        this.zzaAI = metadataBundle;
        this.zzaAJ = a.a(metadataBundle);
    }

    public ComparisonFilter(Operator operator, SearchableMetadataField<T> searchableMetadataField, T t) {
        this(1, operator, MetadataBundle.zzb(searchableMetadataField, t));
    }

    public T getValue() {
        return this.zzaAI.zza(this.zzaAJ);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }

    public <F> F zza(zzf<F> com_google_android_gms_drive_query_internal_zzf_F) {
        return com_google_android_gms_drive_query_internal_zzf_F.zzb(this.zzaAH, this.zzaAJ, getValue());
    }
}
