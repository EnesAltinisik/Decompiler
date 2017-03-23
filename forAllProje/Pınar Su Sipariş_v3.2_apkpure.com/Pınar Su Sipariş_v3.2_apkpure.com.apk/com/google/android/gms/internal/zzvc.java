package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzum.zza;
import com.google.android.gms.tagmanager.zzax;
import com.google.android.gms.tagmanager.zzba;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class zzvc extends zza {
    private final ExecutorService zzbsj;
    private final zzba zzbsk;
    private final Map<String, zzty> zzbtY;
    private final zztz zzbtZ;

    public zzvc(Context context, zzba com_google_android_gms_tagmanager_zzba, zzax com_google_android_gms_tagmanager_zzax) {
        this(com_google_android_gms_tagmanager_zzba, new zztz(context, com_google_android_gms_tagmanager_zzba, com_google_android_gms_tagmanager_zzax), aw.a());
    }

    zzvc(zzba com_google_android_gms_tagmanager_zzba, zztz com_google_android_gms_internal_zztz, ExecutorService executorService) {
        this.zzbtY = new HashMap(1);
        zzaa.zzz(com_google_android_gms_tagmanager_zzba);
        this.zzbsk = com_google_android_gms_tagmanager_zzba;
        this.zzbtZ = com_google_android_gms_internal_zztz;
        this.zzbsj = executorService;
    }

    public void dispatch() {
        this.zzbsj.execute(new Runnable(this) {
            final /* synthetic */ zzvc a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.zzbtY.isEmpty()) {
                    zzun.zzaW("TagManagerBackend dispatch called without loaded container.");
                    return;
                }
                for (zzty dispatch : this.a.zzbtY.values()) {
                    dispatch.dispatch();
                }
            }
        });
    }

    public void zzLb() throws RemoteException {
        this.zzbtY.clear();
    }

    public void zza(String str, Bundle bundle, String str2, long j, boolean z) throws RemoteException {
        final zzud com_google_android_gms_internal_zzud = new zzud(str, bundle, str2, new Date(j), z, this.zzbsk);
        this.zzbsj.execute(new Runnable(this) {
            final /* synthetic */ zzvc b;

            public void run() {
                if (this.b.zzbtY.isEmpty()) {
                    zzun.e("TagManagerBackend emit called without loaded container.");
                    return;
                }
                for (zzty zza : this.b.zzbtY.values()) {
                    zza.zza(com_google_android_gms_internal_zzud);
                }
            }
        });
    }

    public void zza(String str, String str2, String str3, zzul com_google_android_gms_internal_zzul) throws RemoteException {
        final String str4 = str;
        final String str5 = str2;
        final String str6 = str3;
        final zzul com_google_android_gms_internal_zzul2 = com_google_android_gms_internal_zzul;
        this.zzbsj.execute(new Runnable(this) {
            final /* synthetic */ zzvc e;

            public void run() {
                boolean z = true;
                try {
                    if (!this.e.zzbtY.containsKey(str4)) {
                        this.e.zzbtY.put(str4, this.e.zzbtZ.zzn(str4, str5, str6));
                    }
                } catch (Throwable th) {
                    z = false;
                }
                try {
                    if (com_google_android_gms_internal_zzul2 != null) {
                        com_google_android_gms_internal_zzul2.zza(z, str4);
                    }
                } catch (Throwable e) {
                    zzun.zzb("Error relaying callback", e);
                }
            }
        });
    }

    public void zzo(String str, String str2, String str3) throws RemoteException {
        zza(str, str2, str3, null);
    }
}
