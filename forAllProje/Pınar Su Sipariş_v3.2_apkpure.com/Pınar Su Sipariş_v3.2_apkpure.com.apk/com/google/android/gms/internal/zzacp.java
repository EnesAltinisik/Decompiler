package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.internal.zzacv.zza;

public class zzacp extends zzk<zzacu> implements zzaco {
    private static zzps zzbFv = new zzps("FirebaseAuth", "FirebaseAuth:");
    private final Context mContext;
    private final zza zzbFw;

    public zzacp(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, zza com_google_android_gms_internal_zzacv_zza, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 112, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
        this.mContext = (Context) zzaa.zzz(context);
        this.zzbFw = com_google_android_gms_internal_zzacv_zza;
    }

    public /* synthetic */ zzacu zzOs() throws DeadObjectException {
        return (zzacu) super.zztm();
    }

    protected /* synthetic */ IInterface zzab(IBinder iBinder) {
        return zzeG(iBinder);
    }

    protected zzacu zzeG(IBinder iBinder) {
        return zzacu.zza.zzeI(iBinder);
    }

    protected String zzhT() {
        return "com.google.firebase.auth.api.gms.service.START";
    }

    protected String zzhU() {
        return "com.google.firebase.auth.api.internal.IFirebaseAuthService";
    }

    protected Bundle zzoO() {
        Bundle zzoO = super.zzoO();
        if (zzoO == null) {
            zzoO = new Bundle();
        }
        if (this.zzbFw != null) {
            zzoO.putString("com.google.firebase.auth.API_KEY", this.zzbFw.getApiKey());
        }
        return zzoO;
    }

    public boolean zzrg() {
        return zzqi.zzo(this.mContext, "com.google.firebase.auth") == 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.lang.String zztf() {
        /*
        r4 = this;
        r2 = -1;
        r1 = 0;
        r0 = "firebear.preference";
        r0 = com.google.android.gms.internal.zzadb.getProperty(r0);
        r3 = android.text.TextUtils.isEmpty(r0);
        if (r3 == 0) goto L_0x0010;
    L_0x000e:
        r0 = "default";
    L_0x0010:
        r3 = r0.hashCode();
        switch(r3) {
            case 103145323: goto L_0x004f;
            case 1544803905: goto L_0x0059;
            default: goto L_0x0017;
        };
    L_0x0017:
        r3 = r2;
    L_0x0018:
        switch(r3) {
            case 0: goto L_0x001d;
            case 1: goto L_0x001d;
            default: goto L_0x001b;
        };
    L_0x001b:
        r0 = "default";
    L_0x001d:
        r3 = r0.hashCode();
        switch(r3) {
            case 103145323: goto L_0x0063;
            default: goto L_0x0024;
        };
    L_0x0024:
        r0 = r2;
    L_0x0025:
        switch(r0) {
            case 0: goto L_0x006d;
            default: goto L_0x0028;
        };
    L_0x0028:
        r0 = zzbFv;
        r2 = "Loading module via default loading order.";
        r3 = new java.lang.Object[r1];
        r0.zza(r2, r3);
        r0 = r4.mContext;
        r2 = "com.google.firebase.auth";
        r0 = com.google.android.gms.internal.zzqi.zzo(r0, r2);
        r2 = r4.mContext;
        r3 = "com.google.android.gms.firebase_auth";
        r2 = com.google.android.gms.internal.zzqi.zzp(r2, r3);
        if (r2 < r0) goto L_0x007d;
    L_0x0043:
        r0 = zzbFv;
        r2 = "Loading remote module.";
        r1 = new java.lang.Object[r1];
        r0.zza(r2, r1);
        r0 = "com.google.android.gms";
    L_0x004e:
        return r0;
    L_0x004f:
        r3 = "local";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0017;
    L_0x0057:
        r3 = r1;
        goto L_0x0018;
    L_0x0059:
        r3 = "default";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0017;
    L_0x0061:
        r3 = 1;
        goto L_0x0018;
    L_0x0063:
        r3 = "local";
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x0024;
    L_0x006b:
        r0 = r1;
        goto L_0x0025;
    L_0x006d:
        r0 = zzbFv;
        r2 = "Loading fallback module override.";
        r1 = new java.lang.Object[r1];
        r0.zza(r2, r1);
        r0 = r4.mContext;
        r0 = r0.getPackageName();
        goto L_0x004e;
    L_0x007d:
        r0 = zzbFv;
        r2 = "Loading fallback module.";
        r1 = new java.lang.Object[r1];
        r0.zza(r2, r1);
        r0 = r4.mContext;
        r0 = r0.getPackageName();
        goto L_0x004e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzacp.zztf():java.lang.String");
    }
}
