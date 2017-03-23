package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.internal.zzb;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import java.util.Collections;
import java.util.List;

public class Credential extends AbstractSafeParcelable {
    public static final Creator<Credential> CREATOR = new zza();
    public static final String EXTRA_KEY = "com.google.android.gms.credentials.Credential";
    private final String mName;
    final int mVersionCode;
    private final String zzBc;
    private final String zzabA;
    private final Uri zzabv;
    private final List<IdToken> zzabw;
    private final String zzabx;
    private final String zzaby;
    private final String zzabz;

    public static class Builder {
        private String mName;
        private final String zzBc;
        private String zzabA;
        private Uri zzabv;
        private List<IdToken> zzabw;
        private String zzabx;
        private String zzaby;
        private String zzabz;

        public Builder(Credential credential) {
            this.zzBc = credential.zzBc;
            this.mName = credential.mName;
            this.zzabv = credential.zzabv;
            this.zzabw = credential.zzabw;
            this.zzabx = credential.zzabx;
            this.zzaby = credential.zzaby;
            this.zzabz = credential.zzabz;
            this.zzabA = credential.zzabA;
        }

        public Builder(String str) {
            this.zzBc = str;
        }

        public Credential build() {
            return new Credential(3, this.zzBc, this.mName, this.zzabv, this.zzabw, this.zzabx, this.zzaby, this.zzabz, this.zzabA);
        }

        public Builder setAccountType(String str) {
            this.zzaby = str;
            return this;
        }

        public Builder setName(String str) {
            this.mName = str;
            return this;
        }

        public Builder setPassword(String str) {
            this.zzabx = str;
            return this;
        }

        public Builder setProfilePictureUri(Uri uri) {
            this.zzabv = uri;
            return this;
        }
    }

    Credential(int i, String str, String str2, Uri uri, List<IdToken> list, String str3, String str4, String str5, String str6) {
        this.mVersionCode = i;
        String trim = ((String) zzaa.zzb((Object) str, (Object) "credential identifier cannot be null")).trim();
        zzaa.zzh(trim, "credential identifier cannot be empty");
        this.zzBc = trim;
        if (str2 != null && TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.mName = str2;
        this.zzabv = uri;
        this.zzabw = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.zzabx = str3;
        if (str3 == null || !str3.isEmpty()) {
            if (!TextUtils.isEmpty(str4)) {
                zzb.zzcl(str4);
            }
            this.zzaby = str4;
            this.zzabz = str5;
            this.zzabA = str6;
            if (!TextUtils.isEmpty(this.zzabx) && !TextUtils.isEmpty(this.zzaby)) {
                throw new IllegalStateException("password and accountType cannot both be set");
            }
            return;
        }
        throw new IllegalArgumentException("password cannot be empty");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.zzBc, credential.zzBc) && TextUtils.equals(this.mName, credential.mName) && zzz.equal(this.zzabv, credential.zzabv) && TextUtils.equals(this.zzabx, credential.zzabx) && TextUtils.equals(this.zzaby, credential.zzaby) && TextUtils.equals(this.zzabz, credential.zzabz);
    }

    public String getAccountType() {
        return this.zzaby;
    }

    public String getGeneratedPassword() {
        return this.zzabz;
    }

    public String getId() {
        return this.zzBc;
    }

    public List<IdToken> getIdTokens() {
        return this.zzabw;
    }

    public String getName() {
        return this.mName;
    }

    public String getPassword() {
        return this.zzabx;
    }

    public Uri getProfilePictureUri() {
        return this.zzabv;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzBc, this.mName, this.zzabv, this.zzabx, this.zzaby, this.zzabz);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }

    public String zzoW() {
        return this.zzabA;
    }
}
