package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.internal.zztv;
import com.google.android.gms.internal.zztw;
import com.google.android.gms.signin.internal.zze.zza;

public class zzg extends zzk<zze> implements zztv {
    private final com.google.android.gms.common.internal.zzg zzamS;
    private Integer zzarr;
    private final boolean zzbnn;
    private final Bundle zzbno;

    public zzg(Context context, Looper looper, boolean z, com.google.android.gms.common.internal.zzg com_google_android_gms_common_internal_zzg, Bundle bundle, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
        this.zzbnn = z;
        this.zzamS = com_google_android_gms_common_internal_zzg;
        this.zzbno = bundle;
        this.zzarr = com_google_android_gms_common_internal_zzg.zztC();
    }

    public zzg(Context context, Looper looper, boolean z, com.google.android.gms.common.internal.zzg com_google_android_gms_common_internal_zzg, zztw com_google_android_gms_internal_zztw, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, z, com_google_android_gms_common_internal_zzg, zza(com_google_android_gms_common_internal_zzg), connectionCallbacks, onConnectionFailedListener);
    }

    private ResolveAccountRequest zzIW() {
        Account zztk = this.zzamS.zztk();
        GoogleSignInAccount googleSignInAccount = null;
        if ("<<default account>>".equals(zztk.name)) {
            googleSignInAccount = com.google.android.gms.auth.api.signin.internal.zzk.zzab(getContext()).zzpC();
        }
        return new ResolveAccountRequest(zztk, this.zzarr.intValue(), googleSignInAccount);
    }

    public static Bundle zza(com.google.android.gms.common.internal.zzg com_google_android_gms_common_internal_zzg) {
        zztw zztB = com_google_android_gms_common_internal_zzg.zztB();
        Integer zztC = com_google_android_gms_common_internal_zzg.zztC();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", com_google_android_gms_common_internal_zzg.getAccount());
        if (zztC != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", zztC.intValue());
        }
        if (zztB != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", zztB.zzIQ());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", zztB.zzpk());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", zztB.zzpn());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", zztB.zzpm());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", zztB.zzpo());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", zztB.zzIR());
        }
        return bundle;
    }

    public void connect() {
        zza(new zzi(this));
    }

    public void zzIP() {
        try {
            ((zze) zztm()).zzkJ(this.zzarr.intValue());
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    public void zza(zzq com_google_android_gms_common_internal_zzq, boolean z) {
        try {
            ((zze) zztm()).zza(com_google_android_gms_common_internal_zzq, this.zzarr.intValue(), z);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public void zza(zzd com_google_android_gms_signin_internal_zzd) {
        zzaa.zzb((Object) com_google_android_gms_signin_internal_zzd, (Object) "Expecting a valid ISignInCallbacks");
        try {
            ((zze) zztm()).zza(new SignInRequest(zzIW()), com_google_android_gms_signin_internal_zzd);
        } catch (Throwable e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                com_google_android_gms_signin_internal_zzd.zzb(new SignInResponse(8));
            } catch (RemoteException e2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    protected /* synthetic */ IInterface zzab(IBinder iBinder) {
        return zzef(iBinder);
    }

    protected zze zzef(IBinder iBinder) {
        return zza.zzee(iBinder);
    }

    protected String zzhT() {
        return "com.google.android.gms.signin.service.START";
    }

    protected String zzhU() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    protected Bundle zzoO() {
        if (!getContext().getPackageName().equals(this.zzamS.zzty())) {
            this.zzbno.putString("com.google.android.gms.signin.internal.realClientPackageName", this.zzamS.zzty());
        }
        return this.zzbno;
    }

    public boolean zzpd() {
        return this.zzbnn;
    }
}
