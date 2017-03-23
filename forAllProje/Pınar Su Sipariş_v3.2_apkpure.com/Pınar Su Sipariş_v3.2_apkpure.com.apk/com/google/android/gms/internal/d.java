package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzact.zza;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.api.model.CreateAuthUriResponse;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.GetTokenResponse;

abstract class d<SuccessT, CallbackT> {
    protected final int a;
    protected final a b = new a();
    protected FirebaseApp c;
    protected FirebaseUser d;
    protected zzacu e;
    protected CallbackT f;
    protected c<SuccessT> g;
    protected GetTokenResponse h;
    protected GetAccountInfoUser i;
    protected CreateAuthUriResponse j;
    boolean k;
    SuccessT l;
    Status m;
    private boolean n;

    private class a extends zza {
        final /* synthetic */ d a;

        private a(d dVar) {
            this.a = dVar;
        }

        public void onFailure(Status status) throws RemoteException {
            this.a.a(status);
        }

        public void zzOu() throws RemoteException {
            zzaa.zza(this.a.a == 4, "Unexpected response type " + this.a.a);
            this.a.d();
        }

        public void zzOv() throws RemoteException {
            zzaa.zza(this.a.a == 5, "Unexpected response type " + this.a.a);
            this.a.d();
        }

        public void zza(CreateAuthUriResponse createAuthUriResponse) throws RemoteException {
            zzaa.zza(this.a.a == 3, "Unexpected response type " + this.a.a);
            this.a.j = createAuthUriResponse;
            this.a.d();
        }

        public void zza(GetTokenResponse getTokenResponse) throws RemoteException {
            boolean z = true;
            if (this.a.a != 1) {
                z = false;
            }
            zzaa.zza(z, "Unexpected response type: " + this.a.a);
            this.a.h = getTokenResponse;
            this.a.d();
        }

        public void zza(GetTokenResponse getTokenResponse, GetAccountInfoUser getAccountInfoUser) throws RemoteException {
            zzaa.zza(this.a.a == 2, "Unexpected response type: " + this.a.a);
            this.a.h = getTokenResponse;
            this.a.i = getAccountInfoUser;
            this.a.d();
        }
    }

    public d(int i) {
        this.a = i;
    }

    private void d() {
        b();
        zzaa.zza(this.n, (Object) "no success or failure set on method implementation");
    }

    public d<SuccessT, CallbackT> a(c<SuccessT> cVar) {
        this.g = cVar;
        return this;
    }

    public d<SuccessT, CallbackT> a(FirebaseApp firebaseApp) {
        this.c = (FirebaseApp) zzaa.zzb((Object) firebaseApp, (Object) "firebaseApp cannot be null");
        return this;
    }

    public d<SuccessT, CallbackT> a(FirebaseUser firebaseUser) {
        this.d = (FirebaseUser) zzaa.zzb((Object) firebaseUser, (Object) "firebaseUser cannot be null");
        return this;
    }

    public d<SuccessT, CallbackT> a(CallbackT callbackT) {
        this.f = zzaa.zzb((Object) callbackT, (Object) "external callback cannot be null");
        return this;
    }

    protected abstract void a() throws RemoteException;

    public void a(Status status) {
        this.n = true;
        this.k = false;
        this.m = status;
        this.g.a(null, status);
    }

    public void a(zzacu com_google_android_gms_internal_zzacu) throws RemoteException {
        this.e = com_google_android_gms_internal_zzacu;
        a();
    }

    public abstract void b();

    public void b(SuccessT successT) {
        this.n = true;
        this.k = true;
        this.l = successT;
        this.g.a(successT, null);
    }

    public void c() {
        b(null);
    }
}
