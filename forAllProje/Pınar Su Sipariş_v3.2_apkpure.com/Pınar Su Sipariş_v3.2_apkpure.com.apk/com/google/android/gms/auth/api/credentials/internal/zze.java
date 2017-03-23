package com.google.android.gms.auth.api.credentials.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.Auth.AuthCredentialsOptions;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.internal.zznt.zzb;

public final class zze implements CredentialsApi {

    private static class a extends zza {
        private zzb<Status> a;

        a(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status;
        }

        public void zzg(Status status) {
            this.a.setResult(status);
        }
    }

    private PasswordSpecification zza(GoogleApiClient googleApiClient) {
        AuthCredentialsOptions zzpc = ((zzg) googleApiClient.zza(Auth.zzabl)).zzpc();
        return (zzpc == null || zzpc.zzoU() == null) ? PasswordSpecification.zzabL : zzpc.zzoU();
    }

    public PendingResult<Status> delete(GoogleApiClient googleApiClient, final Credential credential) {
        return googleApiClient.zzd(new a<Status>(this, googleApiClient) {
            final /* synthetic */ zze b;

            protected Status a(Status status) {
                return status;
            }

            protected void a(Context context, zzk com_google_android_gms_auth_api_credentials_internal_zzk) throws RemoteException {
                com_google_android_gms_auth_api_credentials_internal_zzk.zza(new a(this), new DeleteRequest(credential));
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<Status> disableAutoSignIn(GoogleApiClient googleApiClient) {
        return googleApiClient.zzd(new a<Status>(this, googleApiClient) {
            final /* synthetic */ zze a;

            protected Status a(Status status) {
                return status;
            }

            protected void a(Context context, zzk com_google_android_gms_auth_api_credentials_internal_zzk) throws RemoteException {
                com_google_android_gms_auth_api_credentials_internal_zzk.zza(new a(this));
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingIntent getHintPickerIntent(GoogleApiClient googleApiClient, HintRequest hintRequest) {
        zzaa.zzb((Object) googleApiClient, (Object) "client must not be null");
        zzaa.zzb((Object) hintRequest, (Object) "request must not be null");
        zzaa.zzb(googleApiClient.zza(Auth.CREDENTIALS_API), (Object) "Auth.CREDENTIALS_API must be added to GoogleApiClient to use this API");
        return PendingIntent.getActivity(googleApiClient.getContext(), 2000, zzc.zza(googleApiClient.getContext(), hintRequest, zza(googleApiClient)), DriveFile.MODE_READ_ONLY);
    }

    public PendingResult<CredentialRequestResult> request(GoogleApiClient googleApiClient, final CredentialRequest credentialRequest) {
        return googleApiClient.zzc(new a<CredentialRequestResult>(this, googleApiClient) {
            final /* synthetic */ zze b;

            protected CredentialRequestResult a(Status status) {
                return zzd.zzh(status);
            }

            protected void a(Context context, zzk com_google_android_gms_auth_api_credentials_internal_zzk) throws RemoteException {
                com_google_android_gms_auth_api_credentials_internal_zzk.zza(new zza(this) {
                    final /* synthetic */ AnonymousClass1 a;

                    {
                        this.a = r1;
                    }

                    public void zza(Status status, Credential credential) {
                        this.a.zzb(new zzd(status, credential));
                    }

                    public void zzg(Status status) {
                        this.a.zzb(zzd.zzh(status));
                    }
                }, credentialRequest);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<Status> save(GoogleApiClient googleApiClient, final Credential credential) {
        return googleApiClient.zzd(new a<Status>(this, googleApiClient) {
            final /* synthetic */ zze b;

            protected Status a(Status status) {
                return status;
            }

            protected void a(Context context, zzk com_google_android_gms_auth_api_credentials_internal_zzk) throws RemoteException {
                com_google_android_gms_auth_api_credentials_internal_zzk.zza(new a(this), new SaveRequest(credential));
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }
}
