package com.google.firebase.auth;

import android.net.Uri;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import java.util.List;

public abstract class FirebaseUser implements UserInfo {
    public Task<Void> delete() {
        return zzOl().zzNS().zzc(this);
    }

    public abstract String getDisplayName();

    public abstract String getEmail();

    public abstract Uri getPhotoUrl();

    public abstract List<? extends UserInfo> getProviderData();

    public abstract String getProviderId();

    public abstract List<String> getProviders();

    public Task<GetTokenResult> getToken(boolean z) {
        return zzOl().zzNS().zza(this, z);
    }

    public abstract String getUid();

    public abstract boolean isAnonymous();

    public Task<AuthResult> linkWithCredential(AuthCredential authCredential) {
        zzaa.zzz(authCredential);
        return zzOl().zzNS().zzb(this, authCredential);
    }

    public Task<Void> reauthenticate(AuthCredential authCredential) {
        zzaa.zzz(authCredential);
        return zzOl().zzNS().zza(this, authCredential);
    }

    public Task<Void> reload() {
        return zzOl().zzNS().zzb(this);
    }

    public Task<AuthResult> unlink(String str) {
        zzaa.zzdl(str);
        return zzOl().zzNS().zza(this, str);
    }

    public Task<Void> updateEmail(String str) {
        zzaa.zzdl(str);
        return zzOl().zzNS().zzb(this, str);
    }

    public Task<Void> updatePassword(String str) {
        zzaa.zzdl(str);
        return zzOl().zzNS().zzc(this, str);
    }

    public Task<Void> updateProfile(UserProfileChangeRequest userProfileChangeRequest) {
        zzaa.zzz(userProfileChangeRequest);
        return zzOl().zzNS().zza(this, userProfileChangeRequest);
    }

    public abstract FirebaseUser zzN(List<? extends UserInfo> list);

    public abstract FirebaseApp zzOl();

    public abstract String zzOm();

    public abstract FirebaseUser zzaK(boolean z);

    public abstract void zzhG(String str);
}
