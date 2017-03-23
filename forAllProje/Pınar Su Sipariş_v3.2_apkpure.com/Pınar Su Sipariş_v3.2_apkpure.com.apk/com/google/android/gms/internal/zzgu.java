package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import org.json.JSONObject;

@zzig
public class zzgu {
    private final boolean zzGq;
    private final boolean zzGr;
    private final boolean zzGs;
    private final boolean zzGt;
    private final boolean zzGu;

    public static final class zza {
        private boolean zzGq;
        private boolean zzGr;
        private boolean zzGs;
        private boolean zzGt;
        private boolean zzGu;

        public zzgu zzfS() {
            return new zzgu();
        }

        public zza zzs(boolean z) {
            this.zzGq = z;
            return this;
        }

        public zza zzt(boolean z) {
            this.zzGr = z;
            return this;
        }

        public zza zzu(boolean z) {
            this.zzGs = z;
            return this;
        }

        public zza zzv(boolean z) {
            this.zzGt = z;
            return this;
        }

        public zza zzw(boolean z) {
            this.zzGu = z;
            return this;
        }
    }

    private zzgu(zza com_google_android_gms_internal_zzgu_zza) {
        this.zzGq = com_google_android_gms_internal_zzgu_zza.zzGq;
        this.zzGr = com_google_android_gms_internal_zzgu_zza.zzGr;
        this.zzGs = com_google_android_gms_internal_zzgu_zza.zzGs;
        this.zzGt = com_google_android_gms_internal_zzgu_zza.zzGt;
        this.zzGu = com_google_android_gms_internal_zzgu_zza.zzGu;
    }

    public JSONObject toJson() {
        try {
            return new JSONObject().put("sms", this.zzGq).put("tel", this.zzGr).put("calendar", this.zzGs).put("storePicture", this.zzGt).put("inlineVideo", this.zzGu);
        } catch (Throwable e) {
            zzb.zzb("Error occured while obtaining the MRAID capabilities.", e);
            return null;
        }
    }
}
