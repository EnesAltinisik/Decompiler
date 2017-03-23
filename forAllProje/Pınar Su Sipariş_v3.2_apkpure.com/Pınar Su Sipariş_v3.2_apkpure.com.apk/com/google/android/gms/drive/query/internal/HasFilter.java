package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class HasFilter<T> extends AbstractFilter {
    public static final zzi CREATOR = new zzi();
    final int mVersionCode;
    final MetadataBundle zzaAI;
    final MetadataField<T> zzaAJ;

    HasFilter(int i, MetadataBundle metadataBundle) {
        this.mVersionCode = i;
        this.zzaAI = metadataBundle;
        this.zzaAJ = a.a(metadataBundle);
    }

    public HasFilter(SearchableMetadataField<T> searchableMetadataField, T t) {
        this(1, MetadataBundle.zzb(searchableMetadataField, t));
    }

    public T getValue() {
        return this.zzaAI.zza(this.zzaAJ);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzi.zza(this, parcel, i);
    }

    public <F> F zza(zzf<F> com_google_android_gms_drive_query_internal_zzf_F) {
        return com_google_android_gms_drive_query_internal_zzf_F.zze(this.zzaAJ, getValue());
    }
}
