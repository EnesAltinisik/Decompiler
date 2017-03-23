package com.google.firebase.auth.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.zzacw;
import com.google.android.gms.internal.zzaku;

public class ProviderUserInfo extends AbstractSafeParcelable {
    public static final Creator<ProviderUserInfo> CREATOR = new zze();
    @zzacw
    public final int mVersionCode;
    @zzaku("photoUrl")
    private String zzaBl;
    @zzaku("displayName")
    private String zzaco;
    @zzaku("providerId")
    private String zzbFO;
    @zzaku("federatedId")
    private String zzbFX;

    public ProviderUserInfo() {
        this.mVersionCode = 1;
    }

    ProviderUserInfo(int i, String str, String str2, String str3, String str4) {
        this.mVersionCode = i;
        this.zzbFX = str;
        this.zzaco = str2;
        this.zzaBl = str3;
        this.zzbFO = str4;
    }

    public String getDisplayName() {
        return this.zzaco;
    }

    public Uri getPhotoUri() {
        return !TextUtils.isEmpty(this.zzaBl) ? Uri.parse(this.zzaBl) : null;
    }

    public String getProviderId() {
        return this.zzbFO;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zze.zza(this, parcel, i);
    }

    public String zzOK() {
        return this.zzbFX;
    }

    public String zzOo() {
        return this.zzaBl;
    }
}
