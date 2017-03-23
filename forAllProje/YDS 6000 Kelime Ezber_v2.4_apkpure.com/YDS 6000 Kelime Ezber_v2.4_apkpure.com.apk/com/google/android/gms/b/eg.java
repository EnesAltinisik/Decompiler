package com.google.android.gms.b;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.b.ed.a;
import com.google.android.gms.common.api.c.b;
import com.google.android.gms.common.api.c.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.z;

public class eg extends u<ed> implements dv {
    private final boolean e;
    private final p f;
    private final Bundle g;
    private Integer h;

    public eg(Context context, Looper looper, boolean z, p pVar, Bundle bundle, b bVar, c cVar) {
        super(context, looper, 44, pVar, bVar, cVar);
        this.e = z;
        this.f = pVar;
        this.g = bundle;
        this.h = pVar.i();
    }

    public eg(Context context, Looper looper, boolean z, p pVar, dw dwVar, b bVar, c cVar) {
        this(context, looper, z, pVar, a(pVar), bVar, cVar);
    }

    public static Bundle a(p pVar) {
        dw h = pVar.h();
        Integer i = pVar.i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", pVar.a());
        if (i != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", i.intValue());
        }
        if (h != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", h.a());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", h.b());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", h.c());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", h.d());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", h.e());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", h.f());
            if (h.g() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", h.g().longValue());
            }
            if (h.h() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", h.h().longValue());
            }
        }
        return bundle;
    }

    private d x() {
        Account b = this.f.b();
        GoogleSignInAccount googleSignInAccount = null;
        if ("<<default account>>".equals(b.name)) {
            googleSignInAccount = com.google.android.gms.auth.api.signin.a.b.a(o()).a();
        }
        return new d(b, this.h.intValue(), googleSignInAccount);
    }

    protected /* synthetic */ IInterface a(IBinder iBinder) {
        return b(iBinder);
    }

    public void a(ec ecVar) {
        com.google.android.gms.common.internal.c.a((Object) ecVar, (Object) "Expecting a valid ISignInCallbacks");
        try {
            ((ed) u()).a(new eh(x()), ecVar);
        } catch (Throwable e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                ecVar.a(new ek(8));
            } catch (RemoteException e2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    public void a(z zVar, boolean z) {
        try {
            ((ed) u()).a(zVar, this.h.intValue(), z);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    protected ed b(IBinder iBinder) {
        return a.a(iBinder);
    }

    public boolean d() {
        return this.e;
    }

    protected String i() {
        return "com.google.android.gms.signin.service.START";
    }

    protected String j() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public void k() {
        try {
            ((ed) u()).a(this.h.intValue());
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    public void l() {
        a(new i(this));
    }

    protected Bundle r() {
        if (!o().getPackageName().equals(this.f.f())) {
            this.g.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f.f());
        }
        return this.g;
    }
}
