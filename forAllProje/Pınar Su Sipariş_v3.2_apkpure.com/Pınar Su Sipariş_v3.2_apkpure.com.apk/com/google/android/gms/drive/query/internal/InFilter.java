package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.metadata.zzb;
import java.util.Collection;
import java.util.Collections;

public class InFilter<T> extends AbstractFilter {
    public static final zzj CREATOR = new zzj();
    final int mVersionCode;
    final MetadataBundle zzaAI;
    private final zzb<T> zzaAV;

    InFilter(int i, MetadataBundle metadataBundle) {
        this.mVersionCode = i;
        this.zzaAI = metadataBundle;
        this.zzaAV = (zzb) a.a(metadataBundle);
    }

    public InFilter(SearchableCollectionMetadataField<T> searchableCollectionMetadataField, T t) {
        this(1, MetadataBundle.zzb(searchableCollectionMetadataField, Collections.singleton(t)));
    }

    public T getValue() {
        return ((Collection) this.zzaAI.zza(this.zzaAV)).iterator().next();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzj.zza(this, parcel, i);
    }

    public <F> F zza(zzf<F> com_google_android_gms_drive_query_internal_zzf_F) {
        return com_google_android_gms_drive_query_internal_zzf_F.zzb(this.zzaAV, getValue());
    }
}
