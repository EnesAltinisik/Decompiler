package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.internal.zzpr.zza;

public class zzpp extends zzk<zzpr> {
    public zzpp(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 39, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
    }

    protected /* synthetic */ IInterface zzab(IBinder iBinder) {
        return zzba(iBinder);
    }

    protected zzpr zzba(IBinder iBinder) {
        return zza.zzbc(iBinder);
    }

    public String zzhT() {
        return "com.google.android.gms.common.service.START";
    }

    protected String zzhU() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }
}
