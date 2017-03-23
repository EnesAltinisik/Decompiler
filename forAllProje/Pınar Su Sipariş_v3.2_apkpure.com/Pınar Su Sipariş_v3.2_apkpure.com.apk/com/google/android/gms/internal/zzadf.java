package com.google.android.gms.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzaa;
import com.google.firebase.auth.UserInfo;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.ProviderUserInfo;

public class zzadf implements UserInfo {
    @zzaku("userId")
    private String zzVA;
    @zzaku("photoUrl")
    private String zzaBl;
    @zzaku("email")
    private String zzacn;
    @zzaku("displayName")
    private String zzaco;
    @zzaku("providerId")
    private String zzbFO;
    @zzacw
    private Uri zzbFn;

    public zzadf(UserInfo userInfo) {
        zzaa.zzz(userInfo);
        this.zzVA = zzaa.zzdl(userInfo.getUid());
        this.zzbFO = zzaa.zzdl(userInfo.getProviderId());
        this.zzaco = userInfo.getDisplayName();
        if (userInfo.getPhotoUrl() != null) {
            this.zzbFn = userInfo.getPhotoUrl();
            this.zzaBl = userInfo.getPhotoUrl().toString();
        }
        this.zzacn = userInfo.getEmail();
    }

    public zzadf(GetAccountInfoUser getAccountInfoUser, String str) {
        zzaa.zzz(getAccountInfoUser);
        zzaa.zzdl(str);
        this.zzVA = zzaa.zzdl(getAccountInfoUser.getLocalId());
        this.zzbFO = str;
        this.zzacn = getAccountInfoUser.getEmail();
        this.zzaco = getAccountInfoUser.getDisplayName();
        Uri photoUri = getAccountInfoUser.getPhotoUri();
        if (photoUri != null) {
            this.zzaBl = photoUri.toString();
            this.zzbFn = photoUri;
        }
    }

    public zzadf(ProviderUserInfo providerUserInfo) {
        zzaa.zzz(providerUserInfo);
        this.zzVA = zzaa.zzdl(providerUserInfo.zzOK());
        this.zzbFO = zzaa.zzdl(providerUserInfo.getProviderId());
        this.zzaco = providerUserInfo.getDisplayName();
        Uri photoUri = providerUserInfo.getPhotoUri();
        if (photoUri != null) {
            this.zzaBl = photoUri.toString();
            this.zzbFn = photoUri;
        }
        this.zzacn = null;
    }

    public String getDisplayName() {
        return this.zzaco;
    }

    public String getEmail() {
        return this.zzacn;
    }

    public Uri getPhotoUrl() {
        if (!TextUtils.isEmpty(this.zzaBl) && this.zzbFn == null) {
            this.zzbFn = Uri.parse(this.zzaBl);
        }
        return this.zzbFn;
    }

    public String getProviderId() {
        return this.zzbFO;
    }

    public String getUid() {
        return this.zzVA;
    }
}
