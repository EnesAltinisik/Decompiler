package com.google.android.gms.location.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.location.internal.zzi.zza;

public class zzb extends zzk<zzi> {
    private final String zzaVI;
    protected final zzp<zzi> zzaVJ = new zzp<zzi>(this) {
        final /* synthetic */ zzb a;

        {
            this.a = r1;
        }

        public zzi a() throws DeadObjectException {
            return (zzi) this.a.zztm();
        }

        public void zztl() {
            this.a.zztl();
        }

        public /* synthetic */ IInterface zztm() throws DeadObjectException {
            return a();
        }
    };

    public zzb(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str, zzg com_google_android_gms_common_internal_zzg) {
        super(context, looper, 23, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
        this.zzaVI = str;
    }

    protected /* synthetic */ IInterface zzab(IBinder iBinder) {
        return zzco(iBinder);
    }

    protected zzi zzco(IBinder iBinder) {
        return zza.zzcr(iBinder);
    }

    protected String zzhT() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    protected String zzhU() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    protected Bundle zzoO() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.zzaVI);
        return bundle;
    }
}
