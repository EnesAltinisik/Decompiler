package com.google.android.gms.internal;

import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.zzj;
import com.google.android.gms.drive.metadata.internal.zzk;
import com.google.android.gms.drive.metadata.internal.zzm;
import com.google.android.gms.drive.metadata.internal.zzo;
import com.google.android.gms.drive.metadata.internal.zzp;
import com.google.android.gms.drive.metadata.internal.zzq;
import com.google.android.gms.plus.PlusShare;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class zzqd {
    public static final MetadataField<BitmapTeleporter> zzaAa = new AnonymousClass2("thumbnail", Collections.emptySet(), Collections.emptySet(), 4400000);
    public static final zzg zzaAb = new zzg(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE, 4100000);
    public static final zzh zzaAc = new zzh("trashed", 4100000);
    public static final MetadataField<String> zzaAd = new zzp("webContentLink", 4300000);
    public static final MetadataField<String> zzaAe = new zzp("webViewLink", 4300000);
    public static final MetadataField<String> zzaAf = new zzp("uniqueIdentifier", 5000000);
    public static final com.google.android.gms.drive.metadata.internal.zzb zzaAg = new com.google.android.gms.drive.metadata.internal.zzb("writersCanShare", 6000000);
    public static final MetadataField<String> zzaAh = new zzp("role", 6000000);
    public static final MetadataField<String> zzaAi = new zzp("md5Checksum", 7000000);
    public static final zze zzaAj = new zze(7000000);
    public static final MetadataField<String> zzaAk = new zzp("recencyReason", 8000000);
    public static final MetadataField<Boolean> zzaAl = new com.google.android.gms.drive.metadata.internal.zzb("subscribed", 8000000);
    public static final MetadataField<String> zzazA = new zzp("fileExtension", 4300000);
    public static final MetadataField<Long> zzazB = new com.google.android.gms.drive.metadata.internal.zzg("fileSize", 4300000);
    public static final MetadataField<String> zzazC = new zzp("folderColorRgb", 7500000);
    public static final MetadataField<Boolean> zzazD = new com.google.android.gms.drive.metadata.internal.zzb("hasThumbnail", 4300000);
    public static final MetadataField<String> zzazE = new zzp("indexableText", 4300000);
    public static final MetadataField<Boolean> zzazF = new com.google.android.gms.drive.metadata.internal.zzb("isAppData", 4300000);
    public static final MetadataField<Boolean> zzazG = new com.google.android.gms.drive.metadata.internal.zzb("isCopyable", 4300000);
    public static final MetadataField<Boolean> zzazH = new com.google.android.gms.drive.metadata.internal.zzb("isEditable", 4100000);
    public static final MetadataField<Boolean> zzazI = new AnonymousClass1("isExplicitlyTrashed", Collections.singleton("trashed"), Collections.emptySet(), 7000000);
    public static final MetadataField<Boolean> zzazJ = new com.google.android.gms.drive.metadata.internal.zzb("isLocalContentUpToDate", 7800000);
    public static final zzb zzazK = new zzb("isPinned", 4100000);
    public static final MetadataField<Boolean> zzazL = new com.google.android.gms.drive.metadata.internal.zzb("isOpenable", 7200000);
    public static final MetadataField<Boolean> zzazM = new com.google.android.gms.drive.metadata.internal.zzb("isRestricted", 4300000);
    public static final MetadataField<Boolean> zzazN = new com.google.android.gms.drive.metadata.internal.zzb("isShared", 4300000);
    public static final MetadataField<Boolean> zzazO = new com.google.android.gms.drive.metadata.internal.zzb("isGooglePhotosFolder", 7000000);
    public static final MetadataField<Boolean> zzazP = new com.google.android.gms.drive.metadata.internal.zzb("isGooglePhotosRootFolder", 7000000);
    public static final MetadataField<Boolean> zzazQ = new com.google.android.gms.drive.metadata.internal.zzb("isTrashable", 4400000);
    public static final MetadataField<Boolean> zzazR = new com.google.android.gms.drive.metadata.internal.zzb("isViewed", 4300000);
    public static final zzc zzazS = new zzc(4100000);
    public static final MetadataField<String> zzazT = new zzp("originalFilename", 4300000);
    public static final com.google.android.gms.drive.metadata.zzb<String> zzazU = new zzo("ownerNames", 4300000);
    public static final zzq zzazV = new zzq("lastModifyingUser", 6000000);
    public static final zzq zzazW = new zzq("sharingUser", 6000000);
    public static final zzm zzazX = new zzm(4100000);
    public static final zzd zzazY = new zzd("quotaBytesUsed", 4300000);
    public static final zzf zzazZ = new zzf("starred", 4100000);
    public static final MetadataField<DriveId> zzazv = zzqg.zzaAt;
    public static final MetadataField<String> zzazw = new zzp("alternateLink", 4300000);
    public static final zza zzazx = new zza(5000000);
    public static final MetadataField<String> zzazy = new zzp(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, 4300000);
    public static final MetadataField<String> zzazz = new zzp("embedLink", 4300000);

    class AnonymousClass1 extends com.google.android.gms.drive.metadata.internal.zzb {
        AnonymousClass1(String str, Collection collection, Collection collection2, int i) {
            super(str, collection, collection2, i);
        }

        protected /* synthetic */ Object zzc(DataHolder dataHolder, int i, int i2) {
            return zze(dataHolder, i, i2);
        }

        protected Boolean zze(DataHolder dataHolder, int i, int i2) {
            return Boolean.valueOf(dataHolder.zzc("trashed", i, i2) == 2);
        }
    }

    class AnonymousClass2 extends zzk<BitmapTeleporter> {
        AnonymousClass2(String str, Collection collection, Collection collection2, int i) {
            super(str, collection, collection2, i);
        }

        protected BitmapTeleporter a(DataHolder dataHolder, int i, int i2) {
            throw new IllegalStateException("Thumbnail field is write only");
        }

        protected /* synthetic */ Object zzc(DataHolder dataHolder, int i, int i2) {
            return a(dataHolder, i, i2);
        }
    }

    public static class zza extends zzqe implements SearchableMetadataField<AppVisibleCustomProperties> {
        public zza(int i) {
            super(i);
        }
    }

    public static class zzb extends com.google.android.gms.drive.metadata.internal.zzb implements SearchableMetadataField<Boolean> {
        public zzb(String str, int i) {
            super(str, i);
        }
    }

    public static class zzc extends zzp implements SearchableMetadataField<String> {
        public zzc(int i) {
            super("mimeType", i);
        }
    }

    public static class zzd extends com.google.android.gms.drive.metadata.internal.zzg implements SortableMetadataField<Long> {
        public zzd(String str, int i) {
            super(str, i);
        }
    }

    public static class zze extends zzj<DriveSpace> {
        public zze(int i) {
            super("spaces", Arrays.asList(new String[]{"inDriveSpace", "isAppData", "inGooglePhotosSpace"}), Collections.emptySet(), i);
        }

        protected /* synthetic */ Object zzc(DataHolder dataHolder, int i, int i2) {
            return zzd(dataHolder, i, i2);
        }

        protected Collection<DriveSpace> zzd(DataHolder dataHolder, int i, int i2) {
            Collection arrayList = new ArrayList();
            if (dataHolder.zze("inDriveSpace", i, i2)) {
                arrayList.add(DriveSpace.zzavp);
            }
            if (dataHolder.zze("isAppData", i, i2)) {
                arrayList.add(DriveSpace.zzavq);
            }
            if (dataHolder.zze("inGooglePhotosSpace", i, i2)) {
                arrayList.add(DriveSpace.zzavr);
            }
            return arrayList;
        }
    }

    public static class zzf extends com.google.android.gms.drive.metadata.internal.zzb implements SearchableMetadataField<Boolean> {
        public zzf(String str, int i) {
            super(str, i);
        }
    }

    public static class zzg extends zzp implements SearchableMetadataField<String>, SortableMetadataField<String> {
        public zzg(String str, int i) {
            super(str, i);
        }
    }

    public static class zzh extends com.google.android.gms.drive.metadata.internal.zzb implements SearchableMetadataField<Boolean> {
        public zzh(String str, int i) {
            super(str, i);
        }

        protected /* synthetic */ Object zzc(DataHolder dataHolder, int i, int i2) {
            return zze(dataHolder, i, i2);
        }

        protected Boolean zze(DataHolder dataHolder, int i, int i2) {
            return Boolean.valueOf(dataHolder.zzc(getName(), i, i2) != 0);
        }
    }
}
