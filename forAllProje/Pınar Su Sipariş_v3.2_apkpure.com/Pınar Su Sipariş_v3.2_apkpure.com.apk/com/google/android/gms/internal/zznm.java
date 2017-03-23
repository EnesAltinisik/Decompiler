package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.internal.zzno.zza;

public class zznm extends zzk<zzno> {
    public zznm(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 40, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
    }

    public void zza(zznn com_google_android_gms_internal_zznn, LogEventParcelable logEventParcelable) throws RemoteException {
        ((zzno) zztm()).zza(com_google_android_gms_internal_zznn, logEventParcelable);
    }

    protected zzno zzaO(IBinder iBinder) {
        return zza.zzaQ(iBinder);
    }

    protected /* synthetic */ IInterface zzab(IBinder iBinder) {
        return zzaO(iBinder);
    }

    protected String zzhT() {
        return "com.google.android.gms.clearcut.service.START";
    }

    protected String zzhU() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }
}
