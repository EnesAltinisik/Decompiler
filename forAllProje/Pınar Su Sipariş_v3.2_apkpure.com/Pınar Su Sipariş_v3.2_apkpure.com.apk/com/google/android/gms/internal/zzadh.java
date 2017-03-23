package com.google.android.gms.internal;

import android.net.Uri;
import android.support.v4.h.a;
import com.google.android.gms.common.internal.zzaa;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuthProvider;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class zzadh extends FirebaseUser {
    @zzaku("cachedTokenState")
    private String zzbGf;
    @zzaku("defaultUserInfo")
    private zzadf zzbGg;
    @zzaku("applicationName")
    private String zzbGh;
    @zzaku("type")
    private String zzbGi = "com.google.firebase.auth.internal.DefaultFirebaseUser";
    @zzaku("userInfos")
    private List<zzadf> zzbGj;
    @zzaku("providers")
    private List<String> zzbGk;
    @zzaku("providerInfo")
    private Map<String, zzadf> zzbGl;
    @zzaku("anonymous")
    private boolean zzbGm;

    public zzadh(FirebaseApp firebaseApp, List<? extends UserInfo> list) {
        zzaa.zzz(firebaseApp);
        this.zzbGh = firebaseApp.getName();
        zzN(list);
    }

    public String getDisplayName() {
        return this.zzbGg.getDisplayName();
    }

    public String getEmail() {
        return this.zzbGg.getEmail();
    }

    public Uri getPhotoUrl() {
        return this.zzbGg.getPhotoUrl();
    }

    public List<? extends UserInfo> getProviderData() {
        return this.zzbGj;
    }

    public String getProviderId() {
        return this.zzbGg.getProviderId();
    }

    public List<String> getProviders() {
        return this.zzbGk;
    }

    public String getUid() {
        return this.zzbGg.getUid();
    }

    public boolean isAnonymous() {
        return this.zzbGm;
    }

    public FirebaseUser zzN(List<? extends UserInfo> list) {
        zzaa.zzz(list);
        this.zzbGj = new ArrayList(list.size());
        this.zzbGk = new ArrayList(list.size());
        this.zzbGl = new a();
        for (int i = 0; i < list.size(); i++) {
            zzadf com_google_android_gms_internal_zzadf = new zzadf((UserInfo) list.get(i));
            if (com_google_android_gms_internal_zzadf.getProviderId().equals(FirebaseAuthProvider.PROVIDER_ID)) {
                this.zzbGg = com_google_android_gms_internal_zzadf;
            } else {
                this.zzbGk.add(com_google_android_gms_internal_zzadf.getProviderId());
            }
            this.zzbGj.add(com_google_android_gms_internal_zzadf);
            this.zzbGl.put(com_google_android_gms_internal_zzadf.getProviderId(), com_google_android_gms_internal_zzadf);
        }
        if (this.zzbGg == null) {
            this.zzbGg = (zzadf) this.zzbGj.get(0);
        }
        return this;
    }

    public FirebaseApp zzOl() {
        return FirebaseApp.getInstance(this.zzbGh);
    }

    public String zzOm() {
        return this.zzbGf;
    }

    public /* synthetic */ FirebaseUser zzaK(boolean z) {
        return zzaL(z);
    }

    public zzadh zzaL(boolean z) {
        this.zzbGm = z;
        return this;
    }

    public void zzhG(String str) {
        zzaa.zzdl(str);
        this.zzbGf = str;
    }

    public FirebaseUser zzhI(String str) {
        this.zzbGk.add(zzaa.zzdl(str));
        return this;
    }
}
