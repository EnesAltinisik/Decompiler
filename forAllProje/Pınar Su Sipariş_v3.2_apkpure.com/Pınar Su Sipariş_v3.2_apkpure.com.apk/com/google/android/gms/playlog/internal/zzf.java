package com.google.android.gms.playlog.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.playlog.internal.zzb.zza;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class zzf extends zzd<zza> {
    private final String zzZC;
    private final zzd zzblh;
    private final zzb zzbli = new zzb();
    private boolean zzblj = true;
    private final Object zzpp = new Object();

    public zzf(Context context, Looper looper, zzd com_google_android_gms_playlog_internal_zzd, String str) {
        super(context, looper, 24, com_google_android_gms_playlog_internal_zzd, com_google_android_gms_playlog_internal_zzd, str);
        this.zzZC = context.getPackageName();
        this.zzblh = (zzd) zzaa.zzz(com_google_android_gms_playlog_internal_zzd);
        this.zzblh.zza(this);
    }

    private void zzIi() {
        zzb.zzai(!this.zzblj);
        if (!this.zzbli.isEmpty()) {
            PlayLoggerContext playLoggerContext = null;
            try {
                List arrayList = new ArrayList();
                Iterator it = this.zzbli.zzIg().iterator();
                while (it.hasNext()) {
                    PlayLoggerContext playLoggerContext2;
                    zza com_google_android_gms_playlog_internal_zzb_zza = (zza) it.next();
                    if (com_google_android_gms_playlog_internal_zzb_zza.zzbkU.equals(playLoggerContext)) {
                        arrayList.add(com_google_android_gms_playlog_internal_zzb_zza.zzbkV);
                        playLoggerContext2 = playLoggerContext;
                    } else {
                        if (!arrayList.isEmpty()) {
                            ((zza) zztm()).zza(this.zzZC, playLoggerContext, arrayList);
                            arrayList.clear();
                        }
                        PlayLoggerContext playLoggerContext3 = com_google_android_gms_playlog_internal_zzb_zza.zzbkU;
                        arrayList.add(com_google_android_gms_playlog_internal_zzb_zza.zzbkV);
                        playLoggerContext2 = playLoggerContext3;
                    }
                    playLoggerContext = playLoggerContext2;
                }
                if (!arrayList.isEmpty()) {
                    ((zza) zztm()).zza(this.zzZC, playLoggerContext, arrayList);
                }
                this.zzbli.clear();
            } catch (RemoteException e) {
                Log.e("PlayLoggerImpl", "Couldn't send cached log events to AndroidLog service.  Retaining in memory cache.");
            }
        }
    }

    private void zzc(PlayLoggerContext playLoggerContext, LogEvent logEvent) {
        this.zzbli.zza(playLoggerContext, logEvent);
    }

    private void zzd(PlayLoggerContext playLoggerContext, LogEvent logEvent) {
        try {
            zzIi();
            ((zza) zztm()).zza(this.zzZC, playLoggerContext, logEvent);
        } catch (RemoteException e) {
            Log.e("PlayLoggerImpl", "Couldn't send log event.  Will try caching.");
            zzc(playLoggerContext, logEvent);
        } catch (IllegalStateException e2) {
            Log.e("PlayLoggerImpl", "Service was disconnected.  Will try caching.");
            zzc(playLoggerContext, logEvent);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void start() {
        /*
        r3 = this;
        r1 = r3.zzpp;
        monitor-enter(r1);
        r0 = r3.isConnecting();	 Catch:{ all -> 0x001c }
        if (r0 != 0) goto L_0x000f;
    L_0x0009:
        r0 = r3.isConnected();	 Catch:{ all -> 0x001c }
        if (r0 == 0) goto L_0x0011;
    L_0x000f:
        monitor-exit(r1);	 Catch:{ all -> 0x001c }
    L_0x0010:
        return;
    L_0x0011:
        r0 = r3.zzblh;	 Catch:{ all -> 0x001c }
        r2 = 1;
        r0.zzaA(r2);	 Catch:{ all -> 0x001c }
        r3.zztj();	 Catch:{ all -> 0x001c }
        monitor-exit(r1);	 Catch:{ all -> 0x001c }
        goto L_0x0010;
    L_0x001c:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001c }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.playlog.internal.zzf.start():void");
    }

    public void stop() {
        synchronized (this.zzpp) {
            this.zzblh.zzaA(false);
            disconnect();
        }
    }

    void zzaB(boolean z) {
        synchronized (this.zzpp) {
            boolean z2 = this.zzblj;
            this.zzblj = z;
            if (z2 && !this.zzblj) {
                zzIi();
            }
        }
    }

    protected /* synthetic */ IInterface zzab(IBinder iBinder) {
        return zzdR(iBinder);
    }

    public void zzb(PlayLoggerContext playLoggerContext, LogEvent logEvent) {
        synchronized (this.zzpp) {
            if (this.zzblj) {
                zzc(playLoggerContext, logEvent);
            } else {
                zzd(playLoggerContext, logEvent);
            }
        }
    }

    protected zza zzdR(IBinder iBinder) {
        return zza.zza.zzdQ(iBinder);
    }

    protected String zzhT() {
        return "com.google.android.gms.playlog.service.START";
    }

    protected String zzhU() {
        return "com.google.android.gms.playlog.internal.IPlayLogService";
    }
}
