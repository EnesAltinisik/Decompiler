package com.google.android.gms.config.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.config.internal.zzh.zza;

public class zzc extends zzk<zzh> {
    public zzc(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 64, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
    }

    protected /* synthetic */ IInterface zzab(IBinder iBinder) {
        return zzbd(iBinder);
    }

    protected zzh zzbd(IBinder iBinder) {
        return zza.zzbf(iBinder);
    }

    protected String zzhT() {
        return "com.google.android.gms.config.START";
    }

    protected String zzhU() {
        return "com.google.android.gms.config.internal.IConfigService";
    }
}
