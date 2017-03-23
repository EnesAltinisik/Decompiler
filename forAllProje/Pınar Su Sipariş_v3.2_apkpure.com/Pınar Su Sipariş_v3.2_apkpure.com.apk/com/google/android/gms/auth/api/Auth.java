package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.auth.api.credentials.internal.zze;
import com.google.android.gms.auth.api.credentials.internal.zzg;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zzc;
import com.google.android.gms.auth.api.signin.internal.zzd;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Api.zzf;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.zzml;
import com.google.android.gms.internal.zzmm;
import com.google.android.gms.internal.zzmn;
import com.google.android.gms.internal.zzmr;
import com.google.android.gms.internal.zzmv;
import java.util.Collections;
import java.util.List;

public final class Auth {
    public static final Api<AuthCredentialsOptions> CREDENTIALS_API = new Api("Auth.CREDENTIALS_API", zzabp, zzabl);
    public static final CredentialsApi CredentialsApi = new zze();
    public static final Api<GoogleSignInOptions> GOOGLE_SIGN_IN_API = new Api("Auth.GOOGLE_SIGN_IN_API", zzabr, zzabn);
    public static final GoogleSignInApi GoogleSignInApi = new zzc();
    public static final Api<zza> PROXY_API = new Api("Auth.PROXY_API", zzabo, zzabk);
    public static final ProxyApi ProxyApi = new zzmv();
    public static final zzf<zzmr> zzabk = new zzf();
    public static final zzf<zzg> zzabl = new zzf();
    public static final zzf<zzmn> zzabm = new zzf();
    public static final zzf<zzd> zzabn = new zzf();
    private static final com.google.android.gms.common.api.Api.zza<zzmr, zza> zzabo = new com.google.android.gms.common.api.Api.zza<zzmr, zza>() {
        public zzmr a(Context context, Looper looper, com.google.android.gms.common.internal.zzg com_google_android_gms_common_internal_zzg, zza com_google_android_gms_auth_api_Auth_zza, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zzmr(context, looper, com_google_android_gms_common_internal_zzg, com_google_android_gms_auth_api_Auth_zza, connectionCallbacks, onConnectionFailedListener);
        }

        public /* synthetic */ Api.zze zza(Context context, Looper looper, com.google.android.gms.common.internal.zzg com_google_android_gms_common_internal_zzg, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return a(context, looper, com_google_android_gms_common_internal_zzg, (zza) obj, connectionCallbacks, onConnectionFailedListener);
        }
    };
    private static final com.google.android.gms.common.api.Api.zza<zzg, AuthCredentialsOptions> zzabp = new com.google.android.gms.common.api.Api.zza<zzg, AuthCredentialsOptions>() {
        public zzg a(Context context, Looper looper, com.google.android.gms.common.internal.zzg com_google_android_gms_common_internal_zzg, AuthCredentialsOptions authCredentialsOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zzg(context, looper, com_google_android_gms_common_internal_zzg, authCredentialsOptions, connectionCallbacks, onConnectionFailedListener);
        }

        public /* synthetic */ Api.zze zza(Context context, Looper looper, com.google.android.gms.common.internal.zzg com_google_android_gms_common_internal_zzg, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return a(context, looper, com_google_android_gms_common_internal_zzg, (AuthCredentialsOptions) obj, connectionCallbacks, onConnectionFailedListener);
        }
    };
    private static final com.google.android.gms.common.api.Api.zza<zzmn, NoOptions> zzabq = new com.google.android.gms.common.api.Api.zza<zzmn, NoOptions>() {
        public zzmn a(Context context, Looper looper, com.google.android.gms.common.internal.zzg com_google_android_gms_common_internal_zzg, NoOptions noOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zzmn(context, looper, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
        }

        public /* synthetic */ Api.zze zza(Context context, Looper looper, com.google.android.gms.common.internal.zzg com_google_android_gms_common_internal_zzg, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return a(context, looper, com_google_android_gms_common_internal_zzg, (NoOptions) obj, connectionCallbacks, onConnectionFailedListener);
        }
    };
    private static final com.google.android.gms.common.api.Api.zza<zzd, GoogleSignInOptions> zzabr = new com.google.android.gms.common.api.Api.zza<zzd, GoogleSignInOptions>() {
        public zzd a(Context context, Looper looper, com.google.android.gms.common.internal.zzg com_google_android_gms_common_internal_zzg, GoogleSignInOptions googleSignInOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zzd(context, looper, com_google_android_gms_common_internal_zzg, googleSignInOptions, connectionCallbacks, onConnectionFailedListener);
        }

        public List<Scope> a(GoogleSignInOptions googleSignInOptions) {
            return googleSignInOptions == null ? Collections.emptyList() : googleSignInOptions.zzpj();
        }

        public /* synthetic */ Api.zze zza(Context context, Looper looper, com.google.android.gms.common.internal.zzg com_google_android_gms_common_internal_zzg, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return a(context, looper, com_google_android_gms_common_internal_zzg, (GoogleSignInOptions) obj, connectionCallbacks, onConnectionFailedListener);
        }

        public /* synthetic */ List zzp(Object obj) {
            return a((GoogleSignInOptions) obj);
        }
    };
    public static final Api<NoOptions> zzabs = new Api("Auth.ACCOUNT_STATUS_API", zzabq, zzabm);
    public static final zzml zzabt = new zzmm();

    public static final class AuthCredentialsOptions implements Optional {

        public static class Builder {
            private PasswordSpecification zzabu = PasswordSpecification.zzabL;
        }

        public Bundle zzoO() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", null);
            bundle.putParcelable("password_specification", null);
            return bundle;
        }

        public PasswordSpecification zzoU() {
            return null;
        }
    }

    public static final class zza implements Optional {
        public Bundle zzoV() {
            return new Bundle(null);
        }
    }

    private Auth() {
    }
}
