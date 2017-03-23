package com.google.android.gms.drive;

import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.zzqd;
import com.google.android.gms.internal.zzqf;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

public final class MetadataChangeSet {
    public static final int CUSTOM_PROPERTY_SIZE_LIMIT_BYTES = 124;
    public static final int INDEXABLE_TEXT_SIZE_LIMIT_BYTES = 131072;
    public static final int MAX_PRIVATE_PROPERTIES_PER_RESOURCE_PER_APP = 30;
    public static final int MAX_PUBLIC_PROPERTIES_PER_RESOURCE = 30;
    public static final int MAX_TOTAL_PROPERTIES_PER_RESOURCE = 100;
    public static final MetadataChangeSet zzavD = new MetadataChangeSet(MetadataBundle.zzwN());
    private final MetadataBundle zzavE;

    public static class Builder {
        private final MetadataBundle zzavE = MetadataBundle.zzwN();
        private zza zzavF;

        private int zzdA(String str) {
            return str == null ? 0 : str.getBytes().length;
        }

        private String zzj(String str, int i, int i2) {
            return String.format("%s must be no more than %d bytes, but is %d bytes.", new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2)});
        }

        private void zzk(String str, int i, int i2) {
            zzaa.zzb(i2 <= i, zzj(str, i, i2));
        }

        private zza zzvW() {
            if (this.zzavF == null) {
                this.zzavF = new zza();
            }
            return this.zzavF;
        }

        public MetadataChangeSet build() {
            if (this.zzavF != null) {
                this.zzavE.zzc(zzqd.zzazx, this.zzavF.zzwJ());
            }
            return new MetadataChangeSet(this.zzavE);
        }

        public Builder deleteCustomProperty(CustomPropertyKey customPropertyKey) {
            zzaa.zzb((Object) customPropertyKey, (Object) "key");
            zzvW().zza(customPropertyKey, null);
            return this;
        }

        public Builder setCustomProperty(CustomPropertyKey customPropertyKey, String str) {
            zzaa.zzb((Object) customPropertyKey, (Object) "key");
            zzaa.zzb((Object) str, Param.VALUE);
            zzk("The total size of key string and value string of a custom property", MetadataChangeSet.CUSTOM_PROPERTY_SIZE_LIMIT_BYTES, zzdA(customPropertyKey.getKey()) + zzdA(str));
            zzvW().zza(customPropertyKey, str);
            return this;
        }

        public Builder setDescription(String str) {
            this.zzavE.zzc(zzqd.zzazy, str);
            return this;
        }

        public Builder setIndexableText(String str) {
            zzk("Indexable text size", MetadataChangeSet.INDEXABLE_TEXT_SIZE_LIMIT_BYTES, zzdA(str));
            this.zzavE.zzc(zzqd.zzazE, str);
            return this;
        }

        public Builder setLastViewedByMeDate(Date date) {
            this.zzavE.zzc(zzqf.zzaAo, date);
            return this;
        }

        public Builder setMimeType(String str) {
            this.zzavE.zzc(zzqd.zzazS, str);
            return this;
        }

        public Builder setPinned(boolean z) {
            this.zzavE.zzc(zzqd.zzazK, Boolean.valueOf(z));
            return this;
        }

        public Builder setStarred(boolean z) {
            this.zzavE.zzc(zzqd.zzazZ, Boolean.valueOf(z));
            return this;
        }

        public Builder setTitle(String str) {
            this.zzavE.zzc(zzqd.zzaAb, str);
            return this;
        }

        public Builder setViewed(boolean z) {
            this.zzavE.zzc(zzqd.zzazR, Boolean.valueOf(z));
            return this;
        }
    }

    public MetadataChangeSet(MetadataBundle metadataBundle) {
        this.zzavE = metadataBundle.zzwO();
    }

    public Map<CustomPropertyKey, String> getCustomPropertyChangeMap() {
        AppVisibleCustomProperties appVisibleCustomProperties = (AppVisibleCustomProperties) this.zzavE.zza(zzqd.zzazx);
        return appVisibleCustomProperties == null ? Collections.emptyMap() : appVisibleCustomProperties.zzwI();
    }

    public String getDescription() {
        return (String) this.zzavE.zza(zzqd.zzazy);
    }

    public String getIndexableText() {
        return (String) this.zzavE.zza(zzqd.zzazE);
    }

    public Date getLastViewedByMeDate() {
        return (Date) this.zzavE.zza(zzqf.zzaAo);
    }

    public String getMimeType() {
        return (String) this.zzavE.zza(zzqd.zzazS);
    }

    public String getTitle() {
        return (String) this.zzavE.zza(zzqd.zzaAb);
    }

    public Boolean isPinned() {
        return (Boolean) this.zzavE.zza(zzqd.zzazK);
    }

    public Boolean isStarred() {
        return (Boolean) this.zzavE.zza(zzqd.zzazZ);
    }

    public Boolean isViewed() {
        return (Boolean) this.zzavE.zza(zzqd.zzazR);
    }

    public <T> MetadataChangeSet zza(MetadataField<T> metadataField, T t) {
        MetadataChangeSet zzvV = zzvV();
        zzvV.zzvU().zzc(metadataField, t);
        return zzvV;
    }

    public MetadataBundle zzvU() {
        return this.zzavE;
    }

    public MetadataChangeSet zzvV() {
        return new MetadataChangeSet(zzvU());
    }
}
