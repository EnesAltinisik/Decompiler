package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Api.zzg;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

public class zzag<T extends IInterface> extends zzk<T> {
    private final zzg<T> zzasr;

    public zzag(Context context, Looper looper, int i, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, zzg com_google_android_gms_common_internal_zzg, zzg<T> com_google_android_gms_common_api_Api_zzg_T) {
        super(context, looper, i, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
        this.zzasr = com_google_android_gms_common_api_Api_zzg_T;
    }

    protected T zzab(IBinder iBinder) {
        return this.zzasr.zzab(iBinder);
    }

    protected void zzc(int i, T t) {
        this.zzasr.zza(i, t);
    }

    protected String zzhT() {
        return this.zzasr.zzhT();
    }

    protected String zzhU() {
        return this.zzasr.zzhU();
    }

    public zzg<T> zztX() {
        return this.zzasr;
    }
}
