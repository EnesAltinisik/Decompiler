package com.google.android.gms.appdatasearch;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.adjust.sdk.Constants;
import com.google.android.gms.appindexing.AppIndexApi.AppIndexingLink;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.zzamj;
import com.google.android.gms.plus.PlusShare;
import java.util.List;
import java.util.zip.CRC32;

public class UsageInfo extends AbstractSafeParcelable {
    public static final zzj CREATOR = new zzj();
    final int mVersionCode;
    final DocumentId zzaak;
    final long zzaal;
    int zzaam;
    final DocumentContents zzaan;
    final boolean zzaao;
    int zzaap;
    int zzaaq;
    public final String zzwM;

    public static final class zza {
        private DocumentId zzaak;
        private long zzaal = -1;
        private int zzaam = -1;
        private DocumentContents zzaan;
        private boolean zzaao = false;
        private int zzaap = -1;
        private int zzaaq = 0;

        public zza zzW(boolean z) {
            this.zzaao = z;
            return this;
        }

        public zza zza(DocumentContents documentContents) {
            this.zzaan = documentContents;
            return this;
        }

        public zza zza(DocumentId documentId) {
            this.zzaak = documentId;
            return this;
        }

        public zza zzaF(int i) {
            this.zzaam = i;
            return this;
        }

        public zza zzaG(int i) {
            this.zzaaq = i;
            return this;
        }

        public UsageInfo zzoL() {
            return new UsageInfo(this.zzaak, this.zzaal, this.zzaam, null, this.zzaan, this.zzaao, this.zzaap, this.zzaaq);
        }

        public zza zzy(long j) {
            this.zzaal = j;
            return this;
        }
    }

    UsageInfo(int i, DocumentId documentId, long j, int i2, String str, DocumentContents documentContents, boolean z, int i3, int i4) {
        this.mVersionCode = i;
        this.zzaak = documentId;
        this.zzaal = j;
        this.zzaam = i2;
        this.zzwM = str;
        this.zzaan = documentContents;
        this.zzaao = z;
        this.zzaap = i3;
        this.zzaaq = i4;
    }

    private UsageInfo(DocumentId documentId, long j, int i, String str, DocumentContents documentContents, boolean z, int i2, int i3) {
        this(1, documentId, j, i, str, documentContents, z, i2, i3);
    }

    public UsageInfo(String str, Intent intent, String str2, Uri uri, String str3, List<AppIndexingLink> list, int i) {
        this(1, zza(str, intent), System.currentTimeMillis(), 0, null, zza(intent, str2, uri, str3, list).zzoH(), false, -1, i);
    }

    public static com.google.android.gms.appdatasearch.DocumentContents.zza zza(Intent intent, String str, Uri uri, String str2, List<AppIndexingLink> list) {
        com.google.android.gms.appdatasearch.DocumentContents.zza com_google_android_gms_appdatasearch_DocumentContents_zza = new com.google.android.gms.appdatasearch.DocumentContents.zza();
        com_google_android_gms_appdatasearch_DocumentContents_zza.zza(zzch(str));
        if (uri != null) {
            com_google_android_gms_appdatasearch_DocumentContents_zza.zza(zzj(uri));
        }
        if (list != null) {
            com_google_android_gms_appdatasearch_DocumentContents_zza.zza(zzu(list));
        }
        String action = intent.getAction();
        if (action != null) {
            com_google_android_gms_appdatasearch_DocumentContents_zza.zza(zzs("intent_action", action));
        }
        action = intent.getDataString();
        if (action != null) {
            com_google_android_gms_appdatasearch_DocumentContents_zza.zza(zzs("intent_data", action));
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            com_google_android_gms_appdatasearch_DocumentContents_zza.zza(zzs("intent_activity", component.getClassName()));
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            action = extras.getString("intent_extra_data_key");
            if (action != null) {
                com_google_android_gms_appdatasearch_DocumentContents_zza.zza(zzs("intent_extra_data", action));
            }
        }
        return com_google_android_gms_appdatasearch_DocumentContents_zza.zzcd(str2).zzT(true);
    }

    public static DocumentId zza(String str, Intent intent) {
        return zzr(str, zzg(intent));
    }

    private static DocumentSection zzch(String str) {
        return new DocumentSection(str, new com.google.android.gms.appdatasearch.RegisterSectionInfo.zza(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE).zzaD(1).zzV(true).zzcg("name").zzoK(), "text1");
    }

    private static String zzg(Intent intent) {
        String toUri = intent.toUri(1);
        CRC32 crc32 = new CRC32();
        try {
            crc32.update(toUri.getBytes(Constants.ENCODING));
            return Long.toHexString(crc32.getValue());
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    private static DocumentSection zzj(Uri uri) {
        return new DocumentSection(uri.toString(), new com.google.android.gms.appdatasearch.RegisterSectionInfo.zza("web_url").zzaD(4).zzU(true).zzcg(PlusShare.KEY_CALL_TO_ACTION_URL).zzoK());
    }

    private static DocumentId zzr(String str, String str2) {
        return new DocumentId(str, "", str2);
    }

    private static DocumentSection zzs(String str, String str2) {
        return new DocumentSection(str2, new com.google.android.gms.appdatasearch.RegisterSectionInfo.zza(str).zzU(true).zzoK(), str);
    }

    private static DocumentSection zzu(List<AppIndexingLink> list) {
        zzamj com_google_android_gms_internal_zzsj_zza = new com.google.android.gms.internal.zzsj.zza();
        com.google.android.gms.internal.zzsj.zza.zza[] com_google_android_gms_internal_zzsj_zza_zzaArr = new com.google.android.gms.internal.zzsj.zza.zza[list.size()];
        for (int i = 0; i < com_google_android_gms_internal_zzsj_zza_zzaArr.length; i++) {
            com_google_android_gms_internal_zzsj_zza_zzaArr[i] = new com.google.android.gms.internal.zzsj.zza.zza();
            AppIndexingLink appIndexingLink = (AppIndexingLink) list.get(i);
            com_google_android_gms_internal_zzsj_zza_zzaArr[i].zzaTA = appIndexingLink.appIndexingUrl.toString();
            com_google_android_gms_internal_zzsj_zza_zzaArr[i].viewId = appIndexingLink.viewId;
            if (appIndexingLink.webUrl != null) {
                com_google_android_gms_internal_zzsj_zza_zzaArr[i].zzaTB = appIndexingLink.webUrl.toString();
            }
        }
        com_google_android_gms_internal_zzsj_zza.zzaTy = com_google_android_gms_internal_zzsj_zza_zzaArr;
        return new DocumentSection(zzamj.toByteArray(com_google_android_gms_internal_zzsj_zza), new com.google.android.gms.appdatasearch.RegisterSectionInfo.zza("outlinks").zzU(true).zzcg(".private:outLinks").zzcf("blob").zzoK());
    }

    public String toString() {
        return String.format("UsageInfo[documentId=%s, timestamp=%d, usageType=%d, status=%d]", new Object[]{this.zzaak, Long.valueOf(this.zzaal), Integer.valueOf(this.zzaam), Integer.valueOf(this.zzaaq)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzj com_google_android_gms_appdatasearch_zzj = CREATOR;
        zzj.zza(this, parcel, i);
    }
}
