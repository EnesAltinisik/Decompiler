package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzd.zzb;
import com.google.android.gms.common.internal.zzd.zzc;
import com.google.android.gms.common.internal.zzl.zza;
import java.util.Set;

public abstract class zzk<T extends IInterface> extends zzd<T> implements zze, zza {
    private final Account zzZB;
    private final Set<Scope> zzacF;
    private final zzg zzamS;

    class AnonymousClass1 implements zzb {
        final /* synthetic */ ConnectionCallbacks a;

        AnonymousClass1(ConnectionCallbacks connectionCallbacks) {
            this.a = connectionCallbacks;
        }

        public void onConnected(Bundle bundle) {
            this.a.onConnected(bundle);
        }

        public void onConnectionSuspended(int i) {
            this.a.onConnectionSuspended(i);
        }
    }

    class AnonymousClass2 implements zzc {
        final /* synthetic */ OnConnectionFailedListener a;

        AnonymousClass2(OnConnectionFailedListener onConnectionFailedListener) {
            this.a = onConnectionFailedListener;
        }

        public void onConnectionFailed(ConnectionResult connectionResult) {
            this.a.onConnectionFailed(connectionResult);
        }
    }

    protected zzk(Context context, Looper looper, int i, zzg com_google_android_gms_common_internal_zzg, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, zzm.zzav(context), GoogleApiAvailability.getInstance(), i, com_google_android_gms_common_internal_zzg, (ConnectionCallbacks) zzaa.zzz(connectionCallbacks), (OnConnectionFailedListener) zzaa.zzz(onConnectionFailedListener));
    }

    protected zzk(Context context, Looper looper, zzm com_google_android_gms_common_internal_zzm, GoogleApiAvailability googleApiAvailability, int i, zzg com_google_android_gms_common_internal_zzg, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, com_google_android_gms_common_internal_zzm, googleApiAvailability, i, zza(connectionCallbacks), zza(onConnectionFailedListener), com_google_android_gms_common_internal_zzg.zztz());
        this.zzamS = com_google_android_gms_common_internal_zzg;
        this.zzZB = com_google_android_gms_common_internal_zzg.getAccount();
        this.zzacF = zza(com_google_android_gms_common_internal_zzg.zztw());
    }

    private static zzb zza(ConnectionCallbacks connectionCallbacks) {
        return connectionCallbacks == null ? null : new AnonymousClass1(connectionCallbacks);
    }

    private static zzc zza(OnConnectionFailedListener onConnectionFailedListener) {
        return onConnectionFailedListener == null ? null : new AnonymousClass2(onConnectionFailedListener);
    }

    private Set<Scope> zza(Set<Scope> set) {
        Set<Scope> zzb = zzb(set);
        for (Scope contains : zzb) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return zzb;
    }

    public final Account getAccount() {
        return this.zzZB;
    }

    protected Set<Scope> zzb(Set<Scope> set) {
        return set;
    }

    protected final zzg zztH() {
        return this.zzamS;
    }

    protected final Set<Scope> zzto() {
        return this.zzacF;
    }
}
