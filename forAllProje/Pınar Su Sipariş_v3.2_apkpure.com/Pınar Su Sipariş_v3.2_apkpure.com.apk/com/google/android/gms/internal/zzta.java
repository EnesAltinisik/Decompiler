package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.internal.zzsy.zza;

public class zzta extends zzk<zzsy> {
    public zzta(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 3, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
    }

    public /* synthetic */ IInterface zzab(IBinder iBinder) {
        return zzdP(iBinder);
    }

    public zzsy zzdP(IBinder iBinder) {
        return zza.zzdO(iBinder);
    }

    protected String zzhT() {
        return "com.google.android.gms.panorama.service.START";
    }

    protected String zzhU() {
        return "com.google.android.gms.panorama.internal.IPanoramaService";
    }
}
