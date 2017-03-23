package com.google.android.gms.internal;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.BooleanResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.Payments;
import com.google.android.gms.wallet.Wallet.zza;
import com.google.android.gms.wallet.Wallet.zzb;

@SuppressLint({"MissingRemoteException"})
public class zzace implements Payments {
    public void changeMaskedWallet(GoogleApiClient googleApiClient, String str, String str2, int i) {
        final String str3 = str;
        final String str4 = str2;
        final int i2 = i;
        googleApiClient.zzc(new zzb(this, googleApiClient) {
            final /* synthetic */ zzace d;

            protected void a(zzacf com_google_android_gms_internal_zzacf) {
                com_google_android_gms_internal_zzacf.zzf(str3, str4, i2);
                zzb(Status.zzalw);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzacf) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public void checkForPreAuthorization(GoogleApiClient googleApiClient, final int i) {
        googleApiClient.zzc(new zzb(this, googleApiClient) {
            final /* synthetic */ zzace b;

            protected void a(zzacf com_google_android_gms_internal_zzacf) {
                com_google_android_gms_internal_zzacf.zzmi(i);
                zzb(Status.zzalw);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzacf) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public void isNewUser(GoogleApiClient googleApiClient, final int i) {
        googleApiClient.zzc(new zzb(this, googleApiClient) {
            final /* synthetic */ zzace b;

            protected void a(zzacf com_google_android_gms_internal_zzacf) {
                com_google_android_gms_internal_zzacf.zzmj(i);
                zzb(Status.zzalw);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzacf) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<BooleanResult> isReadyToPay(GoogleApiClient googleApiClient) {
        return googleApiClient.zzc(new zza<BooleanResult>(this, googleApiClient) {
            final /* synthetic */ zzace a;

            protected BooleanResult a(Status status) {
                return new BooleanResult(status, false);
            }

            protected void a(zzacf com_google_android_gms_internal_zzacf) {
                com_google_android_gms_internal_zzacf.zza(IsReadyToPayRequest.zzNe().zzNf(), (zznt.zzb) this);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzacf) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public void loadFullWallet(GoogleApiClient googleApiClient, final FullWalletRequest fullWalletRequest, final int i) {
        googleApiClient.zzc(new zzb(this, googleApiClient) {
            final /* synthetic */ zzace c;

            protected void a(zzacf com_google_android_gms_internal_zzacf) {
                com_google_android_gms_internal_zzacf.zza(fullWalletRequest, i);
                zzb(Status.zzalw);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzacf) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public void loadMaskedWallet(GoogleApiClient googleApiClient, final MaskedWalletRequest maskedWalletRequest, final int i) {
        googleApiClient.zzc(new zzb(this, googleApiClient) {
            final /* synthetic */ zzace c;

            protected void a(zzacf com_google_android_gms_internal_zzacf) {
                com_google_android_gms_internal_zzacf.zza(maskedWalletRequest, i);
                zzb(Status.zzalw);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzacf) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public void notifyTransactionStatus(GoogleApiClient googleApiClient, final NotifyTransactionStatusRequest notifyTransactionStatusRequest) {
        googleApiClient.zzc(new zzb(this, googleApiClient) {
            final /* synthetic */ zzace b;

            protected void a(zzacf com_google_android_gms_internal_zzacf) {
                com_google_android_gms_internal_zzacf.zza(notifyTransactionStatusRequest);
                zzb(Status.zzalw);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzacf) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }
}
