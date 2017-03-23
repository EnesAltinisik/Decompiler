package com.google.android.gms.auth.api.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zznt.zza;
import com.google.android.gms.internal.zzox;
import java.util.HashSet;

public class zzc implements GoogleSignInApi {

    private abstract class a<R extends Result> extends zza<R, zzd> {
        final /* synthetic */ zzc c;

        public a(zzc com_google_android_gms_auth_api_signin_internal_zzc, GoogleApiClient googleApiClient) {
            this.c = com_google_android_gms_auth_api_signin_internal_zzc;
            super(Auth.GOOGLE_SIGN_IN_API, googleApiClient);
        }
    }

    private OptionalPendingResult<GoogleSignInResult> zza(GoogleApiClient googleApiClient, final GoogleSignInOptions googleSignInOptions) {
        Log.d("GoogleSignInApiImpl", "trySilentSignIn");
        return new zzox(googleApiClient.zzc(new a<GoogleSignInResult>(this, googleApiClient) {
            final /* synthetic */ zzc b;

            protected GoogleSignInResult a(Status status) {
                return new GoogleSignInResult(null, status);
            }

            protected void a(zzd com_google_android_gms_auth_api_signin_internal_zzd) throws RemoteException {
                final zzk zzab = zzk.zzab(com_google_android_gms_auth_api_signin_internal_zzd.getContext());
                ((zzh) com_google_android_gms_auth_api_signin_internal_zzd.zztm()).zza(new zza(this) {
                    final /* synthetic */ AnonymousClass1 b;

                    public void zza(GoogleSignInAccount googleSignInAccount, Status status) throws RemoteException {
                        if (googleSignInAccount != null) {
                            zzab.zzb(googleSignInAccount, googleSignInOptions);
                        }
                        this.b.zzb(new GoogleSignInResult(googleSignInAccount, status));
                    }
                }, googleSignInOptions);
            }

            protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzd) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        }));
    }

    private boolean zza(Account account, Account account2) {
        return account == null ? account2 == null : account.equals(account2);
    }

    private GoogleSignInOptions zzb(GoogleApiClient googleApiClient) {
        return ((zzd) googleApiClient.zza(Auth.zzabn)).zzpu();
    }

    public Intent getSignInIntent(GoogleApiClient googleApiClient) {
        zzaa.zzz(googleApiClient);
        return ((zzd) googleApiClient.zza(Auth.zzabn)).zzpt();
    }

    public GoogleSignInResult getSignInResultFromIntent(Intent intent) {
        if (intent == null || (!intent.hasExtra("googleSignInStatus") && !intent.hasExtra("googleSignInAccount"))) {
            return null;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        if (googleSignInAccount != null) {
            status = Status.zzalw;
        }
        return new GoogleSignInResult(googleSignInAccount, status);
    }

    public PendingResult<Status> revokeAccess(GoogleApiClient googleApiClient) {
        zzk.zzab(googleApiClient.getContext()).zzpE();
        for (GoogleApiClient zzrr : GoogleApiClient.zzrq()) {
            zzrr.zzrr();
        }
        return googleApiClient.zzd(new a<Status>(this, googleApiClient) {
            final /* synthetic */ zzc a;

            protected Status a(Status status) {
                return status;
            }

            protected void a(zzd com_google_android_gms_auth_api_signin_internal_zzd) throws RemoteException {
                ((zzh) com_google_android_gms_auth_api_signin_internal_zzd.zztm()).zzc(new zza(this) {
                    final /* synthetic */ AnonymousClass3 a;

                    {
                        this.a = r1;
                    }

                    public void zzl(Status status) throws RemoteException {
                        this.a.zzb(status);
                    }
                }, com_google_android_gms_auth_api_signin_internal_zzd.zzpu());
            }

            protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzd) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<Status> signOut(GoogleApiClient googleApiClient) {
        zzk.zzab(googleApiClient.getContext()).zzpE();
        for (GoogleApiClient zzrr : GoogleApiClient.zzrq()) {
            zzrr.zzrr();
        }
        return googleApiClient.zzd(new a<Status>(this, googleApiClient) {
            final /* synthetic */ zzc a;

            protected Status a(Status status) {
                return status;
            }

            protected void a(zzd com_google_android_gms_auth_api_signin_internal_zzd) throws RemoteException {
                ((zzh) com_google_android_gms_auth_api_signin_internal_zzd.zztm()).zzb(new zza(this) {
                    final /* synthetic */ AnonymousClass2 a;

                    {
                        this.a = r1;
                    }

                    public void zzk(Status status) throws RemoteException {
                        this.a.zzb(status);
                    }
                }, com_google_android_gms_auth_api_signin_internal_zzd.zzpu());
            }

            protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzd) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public OptionalPendingResult<GoogleSignInResult> silentSignIn(GoogleApiClient googleApiClient) {
        GoogleSignInOptions zzb = zzb(googleApiClient);
        Result zza = zza(googleApiClient.getContext(), zzb);
        return zza != null ? PendingResults.zzb(zza, googleApiClient) : zza(googleApiClient, zzb);
    }

    public GoogleSignInResult zza(Context context, GoogleSignInOptions googleSignInOptions) {
        Log.d("GoogleSignInApiImpl", "getSavedSignInResultIfEligible");
        zzaa.zzz(googleSignInOptions);
        zzk zzab = zzk.zzab(context);
        GoogleSignInOptions zzpD = zzab.zzpD();
        if (zzpD == null || !zza(zzpD.getAccount(), googleSignInOptions.getAccount()) || googleSignInOptions.zzpl()) {
            return null;
        }
        if ((googleSignInOptions.zzpk() && (!zzpD.zzpk() || !googleSignInOptions.zzpn().equals(zzpD.zzpn()))) || !new HashSet(zzpD.zzpj()).containsAll(new HashSet(googleSignInOptions.zzpj()))) {
            return null;
        }
        GoogleSignInAccount zzpC = zzab.zzpC();
        return (zzpC == null || zzpC.zza()) ? null : new GoogleSignInResult(zzpC, Status.zzalw);
    }
}
