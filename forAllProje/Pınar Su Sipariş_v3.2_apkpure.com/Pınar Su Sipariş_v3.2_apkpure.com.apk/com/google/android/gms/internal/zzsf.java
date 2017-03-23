package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.zzsg.zza;

public class zzsf {
    private zzsg zzaIG = null;
    private boolean zzru = false;

    public void initialize(Context context) {
        Throwable e;
        synchronized (this) {
            if (this.zzru) {
                return;
            }
            try {
                this.zzaIG = zza.asInterface(zzqi.zza(context, zzqi.zzaCo, ModuleDescriptor.MODULE_ID).zzdM("com.google.android.gms.flags.impl.FlagProviderImpl"));
                this.zzaIG.init(zze.zzD(context));
                this.zzru = true;
            } catch (zzqi.zza e2) {
                e = e2;
                Log.w("FlagValueProvider", "Failed to initialize flags module.", e);
            } catch (RemoteException e3) {
                e = e3;
                Log.w("FlagValueProvider", "Failed to initialize flags module.", e);
            }
        }
    }

    public <T> T zzb(zzsd<T> com_google_android_gms_internal_zzsd_T) {
        synchronized (this) {
            if (this.zzru) {
                return com_google_android_gms_internal_zzsd_T.zza(this.zzaIG);
            }
            T zzeq = com_google_android_gms_internal_zzsd_T.zzeq();
            return zzeq;
        }
    }
}
