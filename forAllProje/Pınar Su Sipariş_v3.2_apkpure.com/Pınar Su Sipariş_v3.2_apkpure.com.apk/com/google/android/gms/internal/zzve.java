package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.stats.zzb;
import com.google.android.gms.internal.zzum.zza;
import com.google.android.gms.tagmanager.TagManagerService;

public class zzve implements ServiceConnection {
    private final Context mContext;
    private final zzb zzarS;
    private volatile boolean zzbuf;
    private volatile boolean zzbug;
    private zzum zzbuh;

    public zzve(Context context) {
        this(context, zzb.zzuH());
    }

    zzve(Context context, zzb com_google_android_gms_common_stats_zzb) {
        this.zzbuf = false;
        this.zzbug = false;
        this.mContext = context;
        this.zzarS = com_google_android_gms_common_stats_zzb;
    }

    private void zza(zzul com_google_android_gms_internal_zzul, String str) {
        if (com_google_android_gms_internal_zzul != null) {
            try {
                com_google_android_gms_internal_zzul.zza(false, str);
            } catch (Throwable e) {
                zzun.zzb("Error - local callback should not throw RemoteException", e);
            }
        }
    }

    public void dispatch() {
        if (zzLB()) {
            try {
                this.zzbuh.dispatch();
            } catch (Throwable e) {
                zzun.zzd("Error calling service to dispatch pending events", e);
            }
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.zzbuh = zza.zzel(iBinder);
            this.zzbuf = true;
            this.zzbug = false;
            notifyAll();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        synchronized (this) {
            this.zzbuh = null;
            this.zzbuf = false;
            this.zzbug = false;
        }
    }

    public boolean zzLB() {
        if (this.zzbuf) {
            return true;
        }
        synchronized (this) {
            if (this.zzbuf) {
                return true;
            }
            if (!this.zzbug) {
                if (this.zzarS.zza(this.mContext, new Intent(this.mContext, TagManagerService.class), (ServiceConnection) this, 1)) {
                    this.zzbug = true;
                } else {
                    return false;
                }
            }
            while (this.zzbug) {
                try {
                    wait();
                    this.zzbug = false;
                } catch (Throwable e) {
                    zzun.zzd("Error connecting to TagManagerService", e);
                    this.zzbug = false;
                }
            }
            boolean z = this.zzbuf;
            return z;
        }
    }

    public boolean zzLC() {
        if (zzLB()) {
            try {
                this.zzbuh.zzLb();
                return true;
            } catch (Throwable e) {
                zzun.zzd("Error in resetting service", e);
            }
        }
        return false;
    }

    public void zza(String str, Bundle bundle, String str2, long j, boolean z) {
        if (zzLB()) {
            try {
                this.zzbuh.zza(str, bundle, str2, j, z);
            } catch (Throwable e) {
                zzun.zzd("Error calling service to emit event", e);
            }
        }
    }

    public void zzb(String str, String str2, String str3, zzul com_google_android_gms_internal_zzul) {
        if (zzLB()) {
            try {
                this.zzbuh.zza(str, str2, str3, com_google_android_gms_internal_zzul);
                return;
            } catch (Throwable e) {
                zzun.zzd("Error calling service to load container", e);
                zza(com_google_android_gms_internal_zzul, str);
                return;
            }
        }
        zza(com_google_android_gms_internal_zzul, str);
    }
}
