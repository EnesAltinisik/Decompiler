package com.google.android.gms.internal;

import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.fitness.zza;
import java.util.Set;

public abstract class zzqr<T extends IInterface> extends zzk<T> {
    protected zzqr(Context context, Looper looper, int i, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, zzg com_google_android_gms_common_internal_zzg) {
        super(context, looper, i, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
    }

    protected Set<Scope> zzb(Set<Scope> set) {
        return zza.zze(set);
    }

    public boolean zzpd() {
        return !zzqo.zzaL(getContext());
    }

    public boolean zztn() {
        return true;
    }
}
