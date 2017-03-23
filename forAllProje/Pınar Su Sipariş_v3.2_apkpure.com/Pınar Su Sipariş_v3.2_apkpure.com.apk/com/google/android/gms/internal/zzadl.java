package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzaa;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.api.model.GetTokenResponse;

public class zzadl {
    private Context mContext;
    private zzajz zzbFd;
    private String zzbGn;
    private zzakk zzbGo = new zzakk();
    private SharedPreferences zzwV;

    public zzadl(Context context, String str, zzajz com_google_android_gms_internal_zzajz) {
        zzaa.zzz(context);
        this.zzbGn = zzaa.zzdl(str);
        this.mContext = context.getApplicationContext();
        String format = String.format("com.google.firebase.auth.api.Store.%s", new Object[]{this.zzbGn});
        this.zzbFd = (zzajz) zzaa.zzz(com_google_android_gms_internal_zzajz);
        this.zzwV = this.mContext.getSharedPreferences(format, 0);
    }

    public void clear(String str) {
        this.zzwV.edit().remove(str).apply();
    }

    public String get(String str) {
        return this.zzwV.getString(str, null);
    }

    public FirebaseUser zzOT() {
        Object obj = get("com.google.firebase.auth.FIREBASE_USER");
        if (TextUtils.isEmpty(obj)) {
            return null;
        }
        try {
            zzakf zzVJ = this.zzbGo.zziR(obj).zzVJ();
            if (zzVJ.has("type")) {
                if ("com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(zzVJ.zziQ("type").zzVA())) {
                    return (FirebaseUser) this.zzbFd.zza(zzVJ, zzadh.class);
                }
            }
        } catch (zzako e) {
        }
        return null;
    }

    public void zzOU() {
        clear("com.google.firebase.auth.FIREBASE_USER");
    }

    public void zza(FirebaseUser firebaseUser, GetTokenResponse getTokenResponse) {
        zzaa.zzz(firebaseUser);
        zzaa.zzz(getTokenResponse);
        zzp(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{firebaseUser.getUid()}), getTokenResponse);
    }

    public <T> T zze(String str, Class<T> cls) {
        Object obj = get(str);
        return TextUtils.isEmpty(obj) ? null : this.zzbFd.zzf(obj, cls);
    }

    public void zze(FirebaseUser firebaseUser) {
        zzaa.zzz(firebaseUser);
        zzp("com.google.firebase.auth.FIREBASE_USER", firebaseUser);
    }

    public GetTokenResponse zzf(FirebaseUser firebaseUser) {
        zzaa.zzz(firebaseUser);
        return (GetTokenResponse) zze(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{firebaseUser.getUid()}), GetTokenResponse.class);
    }

    public void zzg(FirebaseUser firebaseUser) {
        zzaa.zzz(firebaseUser);
        clear(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{firebaseUser.getUid()}));
    }

    public void zzp(String str, Object obj) {
        this.zzwV.edit().putString(str, this.zzbFd.zzaH(obj)).apply();
    }
}
