package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.internal.zztm.zza;
import java.util.List;

public class zzto extends zzk<zztm> {
    private final Context mContext;

    public zzto(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 45, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
        this.mContext = context;
    }

    private String getApiKey() {
        try {
            PackageManager packageManager = this.mContext.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.mContext.getPackageName(), 128);
            if (applicationInfo == null) {
                return null;
            }
            Bundle bundle = applicationInfo.metaData;
            return bundle == null ? null : (String) bundle.get("com.google.android.safetynet.API_KEY");
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    public void zza(zztl com_google_android_gms_internal_zztl, List<Integer> list, int i, String str, String str2) throws RemoteException {
        String apiKey = str2 == null ? getApiKey() : str2;
        int[] iArr = new int[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            iArr[i2] = ((Integer) list.get(i2)).intValue();
        }
        ((zztm) zztm()).zza(com_google_android_gms_internal_zztl, apiKey, iArr, i, str);
    }

    public void zza(zztl com_google_android_gms_internal_zztl, byte[] bArr) throws RemoteException {
        ((zztm) zztm()).zza(com_google_android_gms_internal_zztl, bArr);
    }

    protected /* synthetic */ IInterface zzab(IBinder iBinder) {
        return zzdZ(iBinder);
    }

    protected zztm zzdZ(IBinder iBinder) {
        return zza.zzdY(iBinder);
    }

    protected String zzhT() {
        return "com.google.android.gms.safetynet.service.START";
    }

    protected String zzhU() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }
}
