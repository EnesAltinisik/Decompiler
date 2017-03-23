package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzah;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.util.zzw;

public final class FirebaseOptions {
    private final String zzaeg;
    private final String zzaoh;
    private final String zzaok;
    private final String zzaol;
    private final String zzbEN;
    private final String zzbEO;

    public static final class Builder {
        private String zzaeg;
        private String zzaoh;
        private String zzaok;
        private String zzaol;
        private String zzbEN;
        private String zzbEO;

        public Builder(FirebaseOptions firebaseOptions) {
            this.zzaeg = firebaseOptions.zzaeg;
            this.zzaoh = firebaseOptions.zzaoh;
            this.zzbEN = firebaseOptions.zzbEN;
            this.zzbEO = firebaseOptions.zzbEO;
            this.zzaok = firebaseOptions.zzaok;
            this.zzaol = firebaseOptions.zzaol;
        }

        public FirebaseOptions build() {
            return new FirebaseOptions(this.zzaeg, this.zzaoh, this.zzbEN, this.zzbEO, this.zzaok, this.zzaol);
        }

        public Builder setApiKey(String str) {
            this.zzaoh = zzaa.zzh(str, "ApiKey must be set.");
            return this;
        }

        public Builder setApplicationId(String str) {
            this.zzaeg = zzaa.zzh(str, "ApplicationId must be set.");
            return this;
        }

        public Builder setDatabaseUrl(String str) {
            this.zzbEN = str;
            return this;
        }

        public Builder setGcmSenderId(String str) {
            this.zzaok = str;
            return this;
        }

        public Builder setStorageBucket(String str) {
            this.zzaol = str;
            return this;
        }
    }

    private FirebaseOptions(String str, String str2, String str3, String str4, String str5, String str6) {
        zzaa.zza(!zzw.zzdv(str), (Object) "ApplicationId must be set.");
        this.zzaeg = str;
        this.zzaoh = str2;
        this.zzbEN = str3;
        this.zzbEO = str4;
        this.zzaok = str5;
        this.zzaol = str6;
    }

    public static FirebaseOptions fromResource(Context context) {
        zzah com_google_android_gms_common_internal_zzah = new zzah(context);
        Object string = com_google_android_gms_common_internal_zzah.getString("google_app_id");
        return TextUtils.isEmpty(string) ? null : new FirebaseOptions(string, com_google_android_gms_common_internal_zzah.getString("google_api_key"), com_google_android_gms_common_internal_zzah.getString("firebase_database_url"), com_google_android_gms_common_internal_zzah.getString("ga_trackingId"), com_google_android_gms_common_internal_zzah.getString("gcm_defaultSenderId"), com_google_android_gms_common_internal_zzah.getString("google_storage_bucket"));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseOptions)) {
            return false;
        }
        FirebaseOptions firebaseOptions = (FirebaseOptions) obj;
        return zzz.equal(this.zzaeg, firebaseOptions.zzaeg) && zzz.equal(this.zzaoh, firebaseOptions.zzaoh) && zzz.equal(this.zzbEN, firebaseOptions.zzbEN) && zzz.equal(this.zzbEO, firebaseOptions.zzbEO) && zzz.equal(this.zzaok, firebaseOptions.zzaok) && zzz.equal(this.zzaol, firebaseOptions.zzaol);
    }

    public String getApiKey() {
        return this.zzaoh;
    }

    public String getApplicationId() {
        return this.zzaeg;
    }

    public String getDatabaseUrl() {
        return this.zzbEN;
    }

    public String getGcmSenderId() {
        return this.zzaok;
    }

    public String getStorageBucket() {
        return this.zzaol;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaeg, this.zzaoh, this.zzbEN, this.zzbEO, this.zzaok, this.zzaol);
    }

    public String toString() {
        return zzz.zzy(this).zzg("applicationId", this.zzaeg).zzg("apiKey", this.zzaoh).zzg("databaseUrl", this.zzbEN).zzg("gcmSenderId", this.zzaok).zzg("storageBucket", this.zzaol).toString();
    }
}
