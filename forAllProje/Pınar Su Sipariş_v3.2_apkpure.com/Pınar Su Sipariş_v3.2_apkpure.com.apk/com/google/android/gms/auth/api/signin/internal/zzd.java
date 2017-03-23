package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder;
import com.google.android.gms.auth.api.signin.internal.zzh.zza;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzk;

public class zzd extends zzk<zzh> {
    private final GoogleSignInOptions zzacQ;

    public zzd(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, GoogleSignInOptions googleSignInOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 91, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
        if (googleSignInOptions == null) {
            googleSignInOptions = new Builder().build();
        }
        if (!com_google_android_gms_common_internal_zzg.zztw().isEmpty()) {
            Builder builder = new Builder(googleSignInOptions);
            for (Scope requestScopes : com_google_android_gms_common_internal_zzg.zztw()) {
                builder.requestScopes(requestScopes, new Scope[0]);
            }
            googleSignInOptions = builder.build();
        }
        this.zzacQ = googleSignInOptions;
    }

    protected zzh zzaF(IBinder iBinder) {
        return zza.zzaH(iBinder);
    }

    protected /* synthetic */ IInterface zzab(IBinder iBinder) {
        return zzaF(iBinder);
    }

    protected String zzhT() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    protected String zzhU() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public boolean zzps() {
        return true;
    }

    public Intent zzpt() {
        Parcelable signInConfiguration = new SignInConfiguration(getContext().getPackageName(), this.zzacQ);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setClass(getContext(), SignInHubActivity.class);
        intent.putExtra("config", signInConfiguration);
        return intent;
    }

    public GoogleSignInOptions zzpu() {
        return this.zzacQ;
    }
}
