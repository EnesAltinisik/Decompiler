package com.google.android.gms.drive.query;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.SearchableOrderedMetadataField;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.internal.zzqd;
import com.google.android.gms.internal.zzqf;
import java.util.Date;

public class SearchableField {
    public static final SearchableMetadataField<Boolean> IS_PINNED = zzqd.zzazK;
    public static final SearchableOrderedMetadataField<Date> LAST_VIEWED_BY_ME = zzqf.zzaAo;
    public static final SearchableMetadataField<String> MIME_TYPE = zzqd.zzazS;
    public static final SearchableOrderedMetadataField<Date> MODIFIED_DATE = zzqf.zzaAp;
    public static final SearchableCollectionMetadataField<DriveId> PARENTS = zzqd.zzazX;
    public static final SearchableMetadataField<Boolean> STARRED = zzqd.zzazZ;
    public static final SearchableMetadataField<String> TITLE = zzqd.zzaAb;
    public static final SearchableMetadataField<Boolean> TRASHED = zzqd.zzaAc;
    public static final SearchableOrderedMetadataField<Date> zzaAC = zzqf.zzaAr;
    public static final SearchableMetadataField<AppVisibleCustomProperties> zzaAD = zzqd.zzazx;
}
