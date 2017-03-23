package com.google.android.gms.drive;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.internal.zzqd;
import com.google.android.gms.internal.zzqf;
import com.google.android.gms.internal.zzqh;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

public abstract class Metadata implements Freezable<Metadata> {
    public static final int CONTENT_AVAILABLE_LOCALLY = 1;
    public static final int CONTENT_NOT_AVAILABLE_LOCALLY = 0;

    public String getAlternateLink() {
        return (String) zza(zzqd.zzazw);
    }

    public int getContentAvailability() {
        Integer num = (Integer) zza(zzqh.zzaAu);
        return num == null ? 0 : num.intValue();
    }

    public Date getCreatedDate() {
        return (Date) zza(zzqf.zzaAn);
    }

    public Map<CustomPropertyKey, String> getCustomProperties() {
        AppVisibleCustomProperties appVisibleCustomProperties = (AppVisibleCustomProperties) zza(zzqd.zzazx);
        return appVisibleCustomProperties == null ? Collections.emptyMap() : appVisibleCustomProperties.zzwI();
    }

    public String getDescription() {
        return (String) zza(zzqd.zzazy);
    }

    public DriveId getDriveId() {
        return (DriveId) zza(zzqd.zzazv);
    }

    public String getEmbedLink() {
        return (String) zza(zzqd.zzazz);
    }

    public String getFileExtension() {
        return (String) zza(zzqd.zzazA);
    }

    public long getFileSize() {
        return ((Long) zza(zzqd.zzazB)).longValue();
    }

    public Date getLastViewedByMeDate() {
        return (Date) zza(zzqf.zzaAo);
    }

    public String getMimeType() {
        return (String) zza(zzqd.zzazS);
    }

    public Date getModifiedByMeDate() {
        return (Date) zza(zzqf.zzaAq);
    }

    public Date getModifiedDate() {
        return (Date) zza(zzqf.zzaAp);
    }

    public String getOriginalFilename() {
        return (String) zza(zzqd.zzazT);
    }

    public long getQuotaBytesUsed() {
        return ((Long) zza(zzqd.zzazY)).longValue();
    }

    public Date getSharedWithMeDate() {
        return (Date) zza(zzqf.zzaAr);
    }

    public String getTitle() {
        return (String) zza(zzqd.zzaAb);
    }

    public String getWebContentLink() {
        return (String) zza(zzqd.zzaAd);
    }

    public String getWebViewLink() {
        return (String) zza(zzqd.zzaAe);
    }

    public boolean isEditable() {
        Boolean bool = (Boolean) zza(zzqd.zzazH);
        return bool == null ? false : bool.booleanValue();
    }

    public boolean isExplicitlyTrashed() {
        Boolean bool = (Boolean) zza(zzqd.zzazI);
        return bool == null ? false : bool.booleanValue();
    }

    public boolean isFolder() {
        return DriveFolder.MIME_TYPE.equals(getMimeType());
    }

    public boolean isInAppFolder() {
        Boolean bool = (Boolean) zza(zzqd.zzazF);
        return bool == null ? false : bool.booleanValue();
    }

    public boolean isPinnable() {
        Boolean bool = (Boolean) zza(zzqh.zzaAv);
        return bool == null ? false : bool.booleanValue();
    }

    public boolean isPinned() {
        Boolean bool = (Boolean) zza(zzqd.zzazK);
        return bool == null ? false : bool.booleanValue();
    }

    public boolean isRestricted() {
        Boolean bool = (Boolean) zza(zzqd.zzazM);
        return bool == null ? false : bool.booleanValue();
    }

    public boolean isShared() {
        Boolean bool = (Boolean) zza(zzqd.zzazN);
        return bool == null ? false : bool.booleanValue();
    }

    public boolean isStarred() {
        Boolean bool = (Boolean) zza(zzqd.zzazZ);
        return bool == null ? false : bool.booleanValue();
    }

    public boolean isTrashable() {
        Boolean bool = (Boolean) zza(zzqd.zzazQ);
        return bool == null ? true : bool.booleanValue();
    }

    public boolean isTrashed() {
        Boolean bool = (Boolean) zza(zzqd.zzaAc);
        return bool == null ? false : bool.booleanValue();
    }

    public boolean isViewed() {
        Boolean bool = (Boolean) zza(zzqd.zzazR);
        return bool == null ? false : bool.booleanValue();
    }

    public abstract <T> T zza(MetadataField<T> metadataField);
}
