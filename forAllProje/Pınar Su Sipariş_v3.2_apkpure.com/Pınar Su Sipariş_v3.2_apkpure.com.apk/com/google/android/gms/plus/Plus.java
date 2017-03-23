package com.google.android.gms.plus;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Api.zzf;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.util.zzv;
import com.google.android.gms.internal.zztf;
import com.google.android.gms.internal.zztg;
import com.google.android.gms.internal.zzth;
import com.google.android.gms.internal.zzti;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.internal.PlusSession;
import com.google.android.gms.plus.internal.zze;
import java.util.HashSet;
import java.util.Set;

public final class Plus {
    public static final Api<PlusOptions> API = new Api("Plus.API", zzaaA, zzaaz);
    @Deprecated
    public static final Account AccountApi = new zztf();
    public static final People PeopleApi = new zzti();
    public static final Scope SCOPE_PLUS_LOGIN = new Scope(Scopes.PLUS_LOGIN);
    public static final Scope SCOPE_PLUS_PROFILE = new Scope(Scopes.PLUS_ME);
    static final com.google.android.gms.common.api.Api.zza<zze, PlusOptions> zzaaA = new com.google.android.gms.common.api.Api.zza<zze, PlusOptions>() {
        public zze a(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, PlusOptions plusOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            if (plusOptions == null) {
                plusOptions = new PlusOptions();
            }
            return new zze(context, looper, com_google_android_gms_common_internal_zzg, new PlusSession(com_google_android_gms_common_internal_zzg.zztk().name, zzv.zzc(com_google_android_gms_common_internal_zzg.zztw()), (String[]) plusOptions.zzbln.toArray(new String[0]), new String[0], context.getPackageName(), context.getPackageName(), null, new PlusCommonExtras()), connectionCallbacks, onConnectionFailedListener);
        }

        public int getPriority() {
            return 2;
        }

        public /* synthetic */ Api.zze zza(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return a(context, looper, com_google_android_gms_common_internal_zzg, (PlusOptions) obj, connectionCallbacks, onConnectionFailedListener);
        }
    };
    public static final zzf<zze> zzaaz = new zzf();
    public static final zzb zzblk = new zzth();
    public static final zza zzbll = new zztg();

    public static abstract class zza<R extends Result> extends com.google.android.gms.internal.zznt.zza<R, zze> {
        public zza(GoogleApiClient googleApiClient) {
            super(Plus.zzaaz, googleApiClient);
        }
    }

    public static final class PlusOptions implements Optional {
        final String zzblm;
        final Set<String> zzbln;

        public static final class Builder {
            String zzblm;
            final Set<String> zzbln = new HashSet();

            public Builder addActivityTypes(String... strArr) {
                zzaa.zzb((Object) strArr, (Object) "activityTypes may not be null.");
                for (Object add : strArr) {
                    this.zzbln.add(add);
                }
                return this;
            }

            public PlusOptions build() {
                return new PlusOptions();
            }

            public Builder setServerClientId(String str) {
                this.zzblm = str;
                return this;
            }
        }

        private PlusOptions() {
            this.zzblm = null;
            this.zzbln = new HashSet();
        }

        private PlusOptions(Builder builder) {
            this.zzblm = builder.zzblm;
            this.zzbln = builder.zzbln;
        }

        public static Builder builder() {
            return new Builder();
        }
    }

    private Plus() {
    }

    public static zze zzf(GoogleApiClient googleApiClient, boolean z) {
        zzaa.zzb(googleApiClient != null, (Object) "GoogleApiClient parameter is required.");
        zzaa.zza(googleApiClient.isConnected(), (Object) "GoogleApiClient must be connected.");
        zzaa.zza(googleApiClient.zza(API), (Object) "GoogleApiClient is not configured to use the Plus.API Api. Pass this into GoogleApiClient.Builder#addApi() to use this feature.");
        boolean hasConnectedApi = googleApiClient.hasConnectedApi(API);
        if (!z || hasConnectedApi) {
            return hasConnectedApi ? (zze) googleApiClient.zza(zzaaz) : null;
        } else {
            throw new IllegalStateException("GoogleApiClient has an optional Plus.API and is not connected to Plus. Use GoogleApiClient.hasConnectedApi(Plus.API) to guard this call.");
        }
    }
}
