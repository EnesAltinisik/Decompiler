package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.internal.zztr.zza;

public class zzts extends zzk<zztr> {
    public zzts(Context context, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, zzg com_google_android_gms_common_internal_zzg) {
        super(context, context.getMainLooper(), 73, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
    }

    protected /* synthetic */ IInterface zzab(IBinder iBinder) {
        return zzec(iBinder);
    }

    protected zztr zzec(IBinder iBinder) {
        return zza.zzeb(iBinder);
    }

    protected String zzhT() {
        return "com.google.android.gms.search.service.SEARCH_AUTH_START";
    }

    protected String zzhU() {
        return "com.google.android.gms.search.internal.ISearchAuthService";
    }
}
