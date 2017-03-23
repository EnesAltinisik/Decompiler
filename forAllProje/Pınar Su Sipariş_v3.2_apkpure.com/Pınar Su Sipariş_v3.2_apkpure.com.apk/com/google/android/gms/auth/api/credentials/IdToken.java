package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.internal.zzb;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;

public final class IdToken extends AbstractSafeParcelable {
    public static final Creator<IdToken> CREATOR = new zze();
    final int mVersionCode;
    private final String zzabK;
    private final String zzaby;

    IdToken(int i, String str, String str2) {
        zzb.zzcl(str);
        zzaa.zzb(!TextUtils.isEmpty(str2), (Object) "id token string cannot be null or empty");
        this.mVersionCode = i;
        this.zzaby = str;
        this.zzabK = str2;
    }

    public IdToken(String str, String str2) {
        this(1, str, str2);
    }

    public String getAccountType() {
        return this.zzaby;
    }

    public String getIdToken() {
        return this.zzabK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zze.zza(this, parcel, i);
    }
}
