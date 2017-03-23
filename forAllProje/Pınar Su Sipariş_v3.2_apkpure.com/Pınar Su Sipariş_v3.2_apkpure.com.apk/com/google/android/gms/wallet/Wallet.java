package com.google.android.gms.wallet;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.Api.zzf;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.internal.zzace;
import com.google.android.gms.internal.zzacf;
import com.google.android.gms.internal.zzach;
import com.google.android.gms.internal.zzaci;
import com.google.android.gms.wallet.wobs.zzj;
import java.util.Locale;

public final class Wallet {
    public static final Api<WalletOptions> API = new Api("Wallet.API", zzaaA, zzaaz);
    public static final Payments Payments = new zzace();
    private static final com.google.android.gms.common.api.Api.zza<zzacf, WalletOptions> zzaaA = new com.google.android.gms.common.api.Api.zza<zzacf, WalletOptions>() {
        public zzacf a(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, WalletOptions walletOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            if (walletOptions == null) {
                walletOptions = new WalletOptions();
            }
            return new zzacf(context, looper, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener, walletOptions.environment, walletOptions.theme, walletOptions.zzbAq);
        }

        public /* synthetic */ zze zza(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return a(context, looper, com_google_android_gms_common_internal_zzg, (WalletOptions) obj, connectionCallbacks, onConnectionFailedListener);
        }
    };
    private static final zzf<zzacf> zzaaz = new zzf();
    public static final zzj zzbAo = new zzaci();
    public static final com.google.android.gms.wallet.firstparty.zza zzbAp = new zzach();

    public static abstract class zza<R extends Result> extends com.google.android.gms.internal.zznt.zza<R, zzacf> {
        public zza(GoogleApiClient googleApiClient) {
            super(Wallet.zzaaz, googleApiClient);
        }
    }

    public static abstract class zzb extends zza<Status> {
        public zzb(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        protected Status zzb(Status status) {
            return status;
        }

        protected /* synthetic */ Result zzc(Status status) {
            return zzb(status);
        }
    }

    public static final class WalletOptions implements HasOptions {
        public final int environment;
        public final int theme;
        private final boolean zzbAq;

        public static final class Builder {
            private int mTheme = 0;
            private int zzbAr = 3;
            private boolean zzbAs = true;

            public WalletOptions build() {
                return new WalletOptions();
            }

            public Builder setEnvironment(int i) {
                if (i == 0 || i == 2 || i == 1 || i == 3) {
                    this.zzbAr = i;
                    return this;
                }
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", new Object[]{Integer.valueOf(i)}));
            }

            public Builder setTheme(int i) {
                if (i == 0 || i == 1) {
                    this.mTheme = i;
                    return this;
                }
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid theme value %d", new Object[]{Integer.valueOf(i)}));
            }

            @Deprecated
            public Builder useGoogleWallet() {
                this.zzbAs = false;
                return this;
            }
        }

        private WalletOptions() {
            this(new Builder());
        }

        private WalletOptions(Builder builder) {
            this.environment = builder.zzbAr;
            this.theme = builder.mTheme;
            this.zzbAq = builder.zzbAs;
        }
    }

    private Wallet() {
    }

    @Deprecated
    public static void changeMaskedWallet(GoogleApiClient googleApiClient, String str, String str2, int i) {
        Payments.changeMaskedWallet(googleApiClient, str, str2, i);
    }

    @Deprecated
    public static void checkForPreAuthorization(GoogleApiClient googleApiClient, int i) {
        Payments.checkForPreAuthorization(googleApiClient, i);
    }

    @Deprecated
    public static void loadFullWallet(GoogleApiClient googleApiClient, FullWalletRequest fullWalletRequest, int i) {
        Payments.loadFullWallet(googleApiClient, fullWalletRequest, i);
    }

    @Deprecated
    public static void loadMaskedWallet(GoogleApiClient googleApiClient, MaskedWalletRequest maskedWalletRequest, int i) {
        Payments.loadMaskedWallet(googleApiClient, maskedWalletRequest, i);
    }

    @Deprecated
    public static void notifyTransactionStatus(GoogleApiClient googleApiClient, NotifyTransactionStatusRequest notifyTransactionStatusRequest) {
        Payments.notifyTransactionStatus(googleApiClient, notifyTransactionStatusRequest);
    }
}
