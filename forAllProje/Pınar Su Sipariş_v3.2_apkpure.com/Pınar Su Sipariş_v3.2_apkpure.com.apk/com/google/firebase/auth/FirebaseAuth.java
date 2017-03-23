package com.google.firebase.auth;

import android.support.annotation.Keep;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzacn;
import com.google.android.gms.internal.zzacq;
import com.google.android.gms.internal.zzacs;
import com.google.android.gms.internal.zzacv;
import com.google.android.gms.internal.zzacv.zza.zza;
import com.google.android.gms.internal.zzadc;
import com.google.android.gms.internal.zzade;
import com.google.android.gms.internal.zzadg;
import com.google.android.gms.internal.zzadh;
import com.google.android.gms.internal.zzadk;
import com.google.android.gms.internal.zzadl;
import com.google.android.gms.internal.zzadm;
import com.google.android.gms.internal.zzaja;
import com.google.android.gms.internal.zzajz;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.api.model.GetTokenResponse;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class FirebaseAuth implements zzaja {
    private static Map<String, FirebaseAuth> zzaTZ = new android.support.v4.h.a();
    private static FirebaseAuth zzbFf;
    private List<AuthStateListener> mListeners;
    private FirebaseApp zzbEZ;
    private zzacn zzbFa;
    private FirebaseUser zzbFb;
    private zzadl zzbFc;
    private zzajz zzbFd;
    private zzadm zzbFe;

    public interface AuthStateListener {
        void onAuthStateChanged(FirebaseAuth firebaseAuth);
    }

    class a implements zzadc {
        final /* synthetic */ FirebaseAuth a;

        a(FirebaseAuth firebaseAuth) {
            this.a = firebaseAuth;
        }

        public void zza(GetTokenResponse getTokenResponse, FirebaseUser firebaseUser) {
            zzaa.zzz(getTokenResponse);
            zzaa.zzz(firebaseUser);
            firebaseUser.zzhG(this.a.zzbFd.zzaH(getTokenResponse));
            this.a.zza(firebaseUser, getTokenResponse, true);
            this.a.zza(firebaseUser, true, true);
        }
    }

    public FirebaseAuth(FirebaseApp firebaseApp) {
        this(firebaseApp, zza(firebaseApp), new zzadl(firebaseApp.getApplicationContext(), firebaseApp.zzNV(), zzacs.zzOt()));
    }

    FirebaseAuth(FirebaseApp firebaseApp, zzacn com_google_android_gms_internal_zzacn, zzadl com_google_android_gms_internal_zzadl) {
        this.zzbEZ = (FirebaseApp) zzaa.zzz(firebaseApp);
        this.zzbFa = (zzacn) zzaa.zzz(com_google_android_gms_internal_zzacn);
        this.zzbFc = (zzadl) zzaa.zzz(com_google_android_gms_internal_zzadl);
        this.mListeners = new CopyOnWriteArrayList();
        this.zzbFd = zzacs.zzOt();
        this.zzbFe = zzadm.zzOV();
        zzOj();
    }

    public static FirebaseAuth getInstance() {
        return zzb(FirebaseApp.getInstance());
    }

    @Keep
    public static FirebaseAuth getInstance(FirebaseApp firebaseApp) {
        return zzb(firebaseApp);
    }

    static zzacn zza(FirebaseApp firebaseApp) {
        return zzacv.zza(firebaseApp.getApplicationContext(), new zza(firebaseApp.getOptions().getApiKey()).zzOw());
    }

    private static FirebaseAuth zzb(FirebaseApp firebaseApp) {
        return zzc(firebaseApp);
    }

    private static synchronized FirebaseAuth zzc(FirebaseApp firebaseApp) {
        FirebaseAuth firebaseAuth;
        synchronized (FirebaseAuth.class) {
            firebaseAuth = (FirebaseAuth) zzaTZ.get(firebaseApp.zzNV());
            if (firebaseAuth == null) {
                firebaseAuth = new zzadg(firebaseApp);
                firebaseApp.zza((zzaja) firebaseAuth);
                if (zzbFf == null) {
                    zzbFf = firebaseAuth;
                }
                zzaTZ.put(firebaseApp.zzNV(), firebaseAuth);
            }
        }
        return firebaseAuth;
    }

    public void addAuthStateListener(final AuthStateListener authStateListener) {
        this.mListeners.add(authStateListener);
        this.zzbFe.execute(new Runnable(this) {
            final /* synthetic */ FirebaseAuth b;

            public void run() {
                authStateListener.onAuthStateChanged(this.b);
            }
        });
    }

    public Task<AuthResult> createUserWithEmailAndPassword(String str, String str2) {
        zzaa.zzdl(str);
        zzaa.zzdl(str2);
        return this.zzbFa.zza(this.zzbEZ, str, str2, new a(this));
    }

    public Task<ProviderQueryResult> fetchProvidersForEmail(String str) {
        zzaa.zzdl(str);
        return this.zzbFa.zza(this.zzbEZ, str);
    }

    public FirebaseUser getCurrentUser() {
        return this.zzbFb;
    }

    public void removeAuthStateListener(AuthStateListener authStateListener) {
        this.mListeners.remove(authStateListener);
    }

    public Task<Void> sendPasswordResetEmail(String str) {
        zzaa.zzdl(str);
        return this.zzbFa.zzb(this.zzbEZ, str);
    }

    public Task<AuthResult> signInAnonymously() {
        return (this.zzbFb == null || !this.zzbFb.isAnonymous()) ? this.zzbFa.zza(this.zzbEZ, new a(this)) : Tasks.forResult(new zzade((zzadh) this.zzbFb));
    }

    public Task<AuthResult> signInWithCredential(AuthCredential authCredential) {
        zzaa.zzz(authCredential);
        if (!EmailAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            return this.zzbFa.zza(this.zzbEZ, authCredential, new a(this));
        }
        EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredential;
        return this.zzbFa.zzb(this.zzbEZ, emailAuthCredential.getEmail(), emailAuthCredential.getPassword(), new a(this));
    }

    public Task<AuthResult> signInWithCustomToken(String str) {
        zzaa.zzdl(str);
        return this.zzbFa.zza(this.zzbEZ, str, new a(this));
    }

    public Task<AuthResult> signInWithEmailAndPassword(String str, String str2) {
        zzaa.zzdl(str);
        zzaa.zzdl(str2);
        return this.zzbFa.zzb(this.zzbEZ, str, str2, new a(this));
    }

    public void signOut() {
        zzOi();
    }

    public void zzOi() {
        if (this.zzbFb != null) {
            this.zzbFc.zzg(this.zzbFb);
            this.zzbFb = null;
        }
        this.zzbFc.zzOU();
        zza(null);
    }

    protected void zzOj() {
        this.zzbFb = this.zzbFc.zzOT();
        if (this.zzbFb != null) {
            zza(this.zzbFb, false, true);
            GetTokenResponse zzf = this.zzbFc.zzf(this.zzbFb);
            if (zzf != null) {
                zza(this.zzbFb, zzf, false);
            }
        }
    }

    public Task<Void> zza(FirebaseUser firebaseUser, AuthCredential authCredential) {
        zzaa.zzz(firebaseUser);
        zzaa.zzz(authCredential);
        if (!EmailAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            return this.zzbFa.zza(this.zzbEZ, firebaseUser, authCredential, new a(this));
        }
        EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredential;
        return this.zzbFa.zza(this.zzbEZ, firebaseUser, emailAuthCredential.getEmail(), emailAuthCredential.getPassword(), new a(this));
    }

    public Task<Void> zza(FirebaseUser firebaseUser, UserProfileChangeRequest userProfileChangeRequest) {
        zzaa.zzz(firebaseUser);
        zzaa.zzz(userProfileChangeRequest);
        return this.zzbFa.zza(this.zzbEZ, firebaseUser, userProfileChangeRequest, new a(this));
    }

    public Task<AuthResult> zza(FirebaseUser firebaseUser, String str) {
        zzaa.zzdl(str);
        zzaa.zzz(firebaseUser);
        return this.zzbFa.zzd(this.zzbEZ, firebaseUser, str, new a(this));
    }

    public Task<GetTokenResult> zza(FirebaseUser firebaseUser, boolean z) {
        if (firebaseUser == null) {
            return Tasks.forException(zzacq.zzbN(new Status(17495)));
        }
        GetTokenResponse getTokenResponse = (GetTokenResponse) this.zzbFd.zzf(this.zzbFb.zzOm(), GetTokenResponse.class);
        return (!getTokenResponse.isValid() || z) ? this.zzbFa.zza(this.zzbEZ, firebaseUser, getTokenResponse.zzOG(), new zzadc(this) {
            final /* synthetic */ FirebaseAuth a;

            {
                this.a = r1;
            }

            public void zza(GetTokenResponse getTokenResponse, FirebaseUser firebaseUser) {
                this.a.zza(firebaseUser, getTokenResponse, true);
            }
        }) : Tasks.forResult(new GetTokenResult(getTokenResponse.getAccessToken()));
    }

    public void zza(final FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            String valueOf = String.valueOf(firebaseUser.getUid());
            Log.d("FirebaseAuth", new StringBuilder(String.valueOf(valueOf).length() + 36).append("Notifying listeners about user ( ").append(valueOf).append(" ).").toString());
        } else {
            Log.d("FirebaseAuth", "Notifying listeners about a sign-out event.");
        }
        this.zzbFe.execute(new Runnable(this) {
            final /* synthetic */ FirebaseAuth b;

            public void run() {
                this.b.zzbEZ.zza(this.b, firebaseUser);
                for (AuthStateListener onAuthStateChanged : this.b.mListeners) {
                    onAuthStateChanged.onAuthStateChanged(this.b);
                }
            }
        });
    }

    public void zza(FirebaseUser firebaseUser, GetTokenResponse getTokenResponse, boolean z) {
        Object obj = 1;
        zzaa.zzz(firebaseUser);
        zzaa.zzz(getTokenResponse);
        if (this.zzbFb != null) {
            String accessToken = ((GetTokenResponse) this.zzbFd.zzf(this.zzbFb.zzOm(), GetTokenResponse.class)).getAccessToken();
            Object obj2 = (!this.zzbFb.getUid().equalsIgnoreCase(firebaseUser.getUid()) || accessToken == null || accessToken.equals(getTokenResponse.getAccessToken())) ? null : 1;
            obj = obj2;
        }
        if (obj != null) {
            if (this.zzbFb != null) {
                this.zzbFb.zzhG(this.zzbFd.zzaH(getTokenResponse));
            }
            zza(this.zzbFb);
        }
        if (z) {
            this.zzbFc.zza(firebaseUser, getTokenResponse);
        }
    }

    public void zza(FirebaseUser firebaseUser, boolean z, boolean z2) {
        zzaa.zzz(firebaseUser);
        if (this.zzbFb == null) {
            this.zzbFb = firebaseUser;
        } else {
            this.zzbFb.zzaK(firebaseUser.isAnonymous());
            this.zzbFb.zzN(firebaseUser.getProviderData());
        }
        if (z) {
            this.zzbFc.zze(this.zzbFb);
        }
        if (z2) {
            zza(this.zzbFb);
        }
    }

    public Task<Void> zzb(FirebaseUser firebaseUser) {
        zzaa.zzz(firebaseUser);
        return this.zzbFa.zzb(this.zzbEZ, firebaseUser, new a(this));
    }

    public Task<AuthResult> zzb(FirebaseUser firebaseUser, AuthCredential authCredential) {
        zzaa.zzz(authCredential);
        zzaa.zzz(firebaseUser);
        return this.zzbFa.zzb(this.zzbEZ, firebaseUser, authCredential, new a(this));
    }

    public Task<Void> zzb(FirebaseUser firebaseUser, String str) {
        zzaa.zzz(firebaseUser);
        zzaa.zzdl(str);
        return this.zzbFa.zzb(this.zzbEZ, firebaseUser, str, new a(this));
    }

    public Task<Void> zzc(final FirebaseUser firebaseUser) {
        zzaa.zzz(firebaseUser);
        return this.zzbFa.zza(firebaseUser, new zzadk(this) {
            final /* synthetic */ FirebaseAuth b;

            public void zzOk() {
                if (this.b.zzbFb.getUid().equalsIgnoreCase(firebaseUser.getUid())) {
                    this.b.zzOi();
                }
            }
        });
    }

    public Task<Void> zzc(FirebaseUser firebaseUser, String str) {
        zzaa.zzz(firebaseUser);
        zzaa.zzdl(str);
        return this.zzbFa.zzc(this.zzbEZ, firebaseUser, str, new a(this));
    }
}
