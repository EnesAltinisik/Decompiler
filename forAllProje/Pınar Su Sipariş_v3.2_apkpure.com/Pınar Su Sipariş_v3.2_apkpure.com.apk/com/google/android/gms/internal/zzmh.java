package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.internal.zzmk.zza;

public class zzmh extends zzk<zzmk> {
    private final String zzaaN;

    public zzmh(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, zzg com_google_android_gms_common_internal_zzg) {
        super(context, looper, 77, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
        this.zzaaN = com_google_android_gms_common_internal_zzg.zzty();
    }

    private Bundle zzoP() {
        Bundle bundle = new Bundle();
        bundle.putString("authPackage", this.zzaaN);
        return bundle;
    }

    public void zza(zzmj com_google_android_gms_internal_zzmj) {
        try {
            ((zzmk) zztm()).zza(com_google_android_gms_internal_zzmj);
        } catch (RemoteException e) {
        }
    }

    public void zza(zzmj com_google_android_gms_internal_zzmj, String str) {
        try {
            ((zzmk) zztm()).zza(com_google_android_gms_internal_zzmj, str);
        } catch (RemoteException e) {
        }
    }

    protected /* synthetic */ IInterface zzab(IBinder iBinder) {
        return zzao(iBinder);
    }

    protected zzmk zzao(IBinder iBinder) {
        return zza.zzaq(iBinder);
    }

    public void zzb(zzmj com_google_android_gms_internal_zzmj, String str) {
        try {
            ((zzmk) zztm()).zzb(com_google_android_gms_internal_zzmj, str);
        } catch (RemoteException e) {
        }
    }

    protected String zzhT() {
        return "com.google.android.gms.appinvite.service.START";
    }

    protected String zzhU() {
        return "com.google.android.gms.appinvite.internal.IAppInviteService";
    }

    protected Bundle zzoO() {
        return zzoP();
    }
}
