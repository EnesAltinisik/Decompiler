package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.zzaa;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public class zzk {
    private static final Lock zzadb = new ReentrantLock();
    private static zzk zzadc;
    private final Lock zzadd = new ReentrantLock();
    private final SharedPreferences zzade;

    zzk(Context context) {
        this.zzade = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static zzk zzab(Context context) {
        zzaa.zzz(context);
        zzadb.lock();
        try {
            if (zzadc == null) {
                zzadc = new zzk(context.getApplicationContext());
            }
            zzk com_google_android_gms_auth_api_signin_internal_zzk = zzadc;
            return com_google_android_gms_auth_api_signin_internal_zzk;
        } finally {
            zzadb.unlock();
        }
    }

    private String zzw(String str, String str2) {
        String valueOf = String.valueOf(":");
        return new StringBuilder(((String.valueOf(str).length() + 0) + String.valueOf(valueOf).length()) + String.valueOf(str2).length()).append(str).append(valueOf).append(str2).toString();
    }

    void zza(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        zzaa.zzz(googleSignInAccount);
        zzaa.zzz(googleSignInOptions);
        String zzpf = googleSignInAccount.zzpf();
        zzv(zzw("googleSignInAccount", zzpf), googleSignInAccount.zzph());
        zzv(zzw("googleSignInOptions", zzpf), googleSignInOptions.zzpg());
    }

    public void zzb(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        zzaa.zzz(googleSignInAccount);
        zzaa.zzz(googleSignInOptions);
        zzv("defaultGoogleSignInAccount", googleSignInAccount.zzpf());
        zza(googleSignInAccount, googleSignInOptions);
    }

    GoogleSignInAccount zzcq(String str) {
        GoogleSignInAccount googleSignInAccount = null;
        if (!TextUtils.isEmpty(str)) {
            String zzcs = zzcs(zzw("googleSignInAccount", str));
            if (zzcs != null) {
                try {
                    googleSignInAccount = GoogleSignInAccount.zzcm(zzcs);
                } catch (JSONException e) {
                }
            }
        }
        return googleSignInAccount;
    }

    GoogleSignInOptions zzcr(String str) {
        GoogleSignInOptions googleSignInOptions = null;
        if (!TextUtils.isEmpty(str)) {
            String zzcs = zzcs(zzw("googleSignInOptions", str));
            if (zzcs != null) {
                try {
                    googleSignInOptions = GoogleSignInOptions.zzco(zzcs);
                } catch (JSONException e) {
                }
            }
        }
        return googleSignInOptions;
    }

    protected String zzcs(String str) {
        this.zzadd.lock();
        try {
            String string = this.zzade.getString(str, null);
            return string;
        } finally {
            this.zzadd.unlock();
        }
    }

    void zzct(String str) {
        if (!TextUtils.isEmpty(str)) {
            zzcu(zzw("googleSignInAccount", str));
            zzcu(zzw("googleSignInOptions", str));
        }
    }

    protected void zzcu(String str) {
        this.zzadd.lock();
        try {
            this.zzade.edit().remove(str).apply();
        } finally {
            this.zzadd.unlock();
        }
    }

    public GoogleSignInAccount zzpC() {
        return zzcq(zzcs("defaultGoogleSignInAccount"));
    }

    public GoogleSignInOptions zzpD() {
        return zzcr(zzcs("defaultGoogleSignInAccount"));
    }

    public void zzpE() {
        String zzcs = zzcs("defaultGoogleSignInAccount");
        zzcu("defaultGoogleSignInAccount");
        zzct(zzcs);
    }

    protected void zzv(String str, String str2) {
        this.zzadd.lock();
        try {
            this.zzade.edit().putString(str, str2).apply();
        } finally {
            this.zzadd.unlock();
        }
    }
}
