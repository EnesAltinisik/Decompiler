package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.security.NetworkSecurityPolicy;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.zzs;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.zzjy.zzb;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Future;

@zzig
public class zzjq implements zzb {
    private Context mContext;
    private String zzCy;
    private boolean zzNH = false;
    private boolean zzNx = true;
    private boolean zzNy = true;
    private final String zzPE;
    private final zzjr zzPF;
    private BigInteger zzPG = BigInteger.ONE;
    private final HashSet<zzjo> zzPH = new HashSet();
    private final HashMap<String, zzjt> zzPI = new HashMap();
    private boolean zzPJ = false;
    private int zzPK = 0;
    private zzcw zzPL = null;
    private zzcg zzPM = null;
    private String zzPN;
    private Boolean zzPO = null;
    private boolean zzPP = false;
    private boolean zzPQ = false;
    private boolean zzPR = false;
    private String zzPS = "";
    private long zzPT = 0;
    private zzby zzpX;
    private final Object zzpp = new Object();
    private VersionInfoParcel zzqP;
    private boolean zzru = false;
    private zzcf zzul = null;
    private zzce zzum = null;

    public zzjq(zzka com_google_android_gms_internal_zzka) {
        this.zzPE = com_google_android_gms_internal_zzka.zzja();
        this.zzPF = new zzjr(this.zzPE);
    }

    public Resources getResources() {
        if (this.zzqP.zzRE) {
            return this.mContext.getResources();
        }
        try {
            zzqi zza = zzqi.zza(this.mContext, zzqi.zzaCo, ModuleDescriptor.MODULE_ID);
            return zza != null ? zza.zzxi().getResources() : null;
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public String getSessionId() {
        return this.zzPE;
    }

    public void zzD(boolean z) {
        synchronized (this.zzpp) {
            if (this.zzNy != z) {
                zzjy.zze(this.mContext, z);
            }
            this.zzNy = z;
            zzcg zzz = zzz(this.mContext);
            if (!(zzz == null || zzz.isAlive())) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaV("start fetching content...");
                zzz.zzdt();
            }
        }
    }

    public void zzE(boolean z) {
        this.zzPR = z;
    }

    public void zzF(boolean z) {
        synchronized (this.zzpp) {
            this.zzPP = z;
        }
    }

    public Bundle zza(Context context, zzjs com_google_android_gms_internal_zzjs, String str) {
        Bundle bundle;
        synchronized (this.zzpp) {
            bundle = new Bundle();
            bundle.putBundle("app", this.zzPF.zze(context, str));
            Bundle bundle2 = new Bundle();
            for (String str2 : this.zzPI.keySet()) {
                bundle2.putBundle(str2, ((zzjt) this.zzPI.get(str2)).toBundle());
            }
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzPH.iterator();
            while (it.hasNext()) {
                arrayList.add(((zzjo) it.next()).toBundle());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            com_google_android_gms_internal_zzjs.zza(this.zzPH);
            this.zzPH.clear();
        }
        return bundle;
    }

    public void zza(zzjo com_google_android_gms_internal_zzjo) {
        synchronized (this.zzpp) {
            this.zzPH.add(com_google_android_gms_internal_zzjo);
        }
    }

    public void zza(String str, zzjt com_google_android_gms_internal_zzjt) {
        synchronized (this.zzpp) {
            this.zzPI.put(str, com_google_android_gms_internal_zzjt);
        }
    }

    public void zza(Thread thread) {
        zzif.zza(this.mContext, thread, this.zzqP);
    }

    public Future zzaL(String str) {
        Future zzf;
        synchronized (this.zzpp) {
            if (str != null) {
                if (!str.equals(this.zzPN)) {
                    this.zzPN = str;
                    zzf = zzjy.zzf(this.mContext, str);
                }
            }
            zzf = null;
        }
        return zzf;
    }

    @TargetApi(23)
    public void zzb(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (this.zzpp) {
            if (!this.zzru) {
                this.mContext = context.getApplicationContext();
                this.zzqP = versionInfoParcel;
                zzjy.zza(context, this);
                zzjy.zzb(context, this);
                zzjy.zzc(context, (zzb) this);
                zzjy.zzd(context, this);
                zzjy.zze(context, (zzb) this);
                zzjy.zzf(context, (zzb) this);
                zza(Thread.currentThread());
                this.zzCy = zzu.zzck().zzg(context, versionInfoParcel.afmaVersion);
                if (zzs.zzvh() && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                    this.zzPQ = true;
                }
                this.zzpX = new zzby(context.getApplicationContext(), this.zzqP, zzu.zzck().zzc(context, versionInfoParcel));
                zziR();
                zzu.zzcu().zzs(this.mContext);
                this.zzru = true;
            }
        }
    }

    public void zzb(Boolean bool) {
        synchronized (this.zzpp) {
            this.zzPO = bool;
        }
    }

    public void zzb(Throwable th, boolean z) {
        new zzif(this.mContext, this.zzqP, null, null).zza(th, z);
    }

    public void zzb(HashSet<zzjo> hashSet) {
        synchronized (this.zzpp) {
            this.zzPH.addAll(hashSet);
        }
    }

    public Future zzc(Context context, boolean z) {
        Future zzc;
        synchronized (this.zzpp) {
            if (z != this.zzNx) {
                this.zzNx = z;
                zzc = zzjy.zzc(context, z);
            } else {
                zzc = null;
            }
        }
        return zzc;
    }

    public Future zzd(Context context, String str) {
        Future zza;
        this.zzPT = zzu.zzco().currentTimeMillis();
        synchronized (this.zzpp) {
            if (str != null) {
                if (!str.equals(this.zzPS)) {
                    this.zzPS = str;
                    zza = zzjy.zza(context, str, this.zzPT);
                }
            }
            zza = null;
        }
        return zza;
    }

    public Future zzd(Context context, boolean z) {
        Future zzf;
        synchronized (this.zzpp) {
            if (z != this.zzNH) {
                this.zzNH = z;
                zzf = zzjy.zzf(context, z);
            } else {
                zzf = null;
            }
        }
        return zzf;
    }

    public void zzg(Bundle bundle) {
        synchronized (this.zzpp) {
            this.zzNx = bundle.containsKey("use_https") ? bundle.getBoolean("use_https") : this.zzNx;
            this.zzPK = bundle.containsKey("webview_cache_version") ? bundle.getInt("webview_cache_version") : this.zzPK;
            if (bundle.containsKey("content_url_opted_out")) {
                zzD(bundle.getBoolean("content_url_opted_out"));
            }
            if (bundle.containsKey("content_url_hashes")) {
                this.zzPN = bundle.getString("content_url_hashes");
            }
            this.zzNH = bundle.containsKey("auto_collect_location") ? bundle.getBoolean("auto_collect_location") : this.zzNH;
            this.zzPS = bundle.containsKey("app_settings_json") ? bundle.getString("app_settings_json") : this.zzPS;
            this.zzPT = bundle.containsKey("app_settings_last_update_ms") ? bundle.getLong("app_settings_last_update_ms") : 0;
        }
    }

    public boolean zziD() {
        boolean z;
        synchronized (this.zzpp) {
            z = this.zzNy;
        }
        return z;
    }

    public String zziE() {
        String bigInteger;
        synchronized (this.zzpp) {
            bigInteger = this.zzPG.toString();
            this.zzPG = this.zzPG.add(BigInteger.ONE);
        }
        return bigInteger;
    }

    public zzjr zziF() {
        zzjr com_google_android_gms_internal_zzjr;
        synchronized (this.zzpp) {
            com_google_android_gms_internal_zzjr = this.zzPF;
        }
        return com_google_android_gms_internal_zzjr;
    }

    public zzcw zziG() {
        zzcw com_google_android_gms_internal_zzcw;
        synchronized (this.zzpp) {
            com_google_android_gms_internal_zzcw = this.zzPL;
        }
        return com_google_android_gms_internal_zzcw;
    }

    public boolean zziH() {
        boolean z;
        synchronized (this.zzpp) {
            z = this.zzPJ;
            this.zzPJ = true;
        }
        return z;
    }

    public boolean zziI() {
        boolean z;
        synchronized (this.zzpp) {
            z = this.zzNx || this.zzPQ;
        }
        return z;
    }

    public String zziJ() {
        String str;
        synchronized (this.zzpp) {
            str = this.zzCy;
        }
        return str;
    }

    public String zziK() {
        String str;
        synchronized (this.zzpp) {
            str = this.zzPN;
        }
        return str;
    }

    public Boolean zziL() {
        Boolean bool;
        synchronized (this.zzpp) {
            bool = this.zzPO;
        }
        return bool;
    }

    public boolean zziM() {
        boolean z;
        synchronized (this.zzpp) {
            z = this.zzNH;
        }
        return z;
    }

    public boolean zziN() {
        return this.zzPR;
    }

    public zzjp zziO() {
        zzjp com_google_android_gms_internal_zzjp;
        synchronized (this.zzpp) {
            com_google_android_gms_internal_zzjp = new zzjp(this.zzPS, this.zzPT);
        }
        return com_google_android_gms_internal_zzjp;
    }

    public zzby zziP() {
        return this.zzpX;
    }

    public boolean zziQ() {
        boolean z;
        synchronized (this.zzpp) {
            z = this.zzPP;
        }
        return z;
    }

    void zziR() {
        try {
            this.zzPL = zzu.zzcp().zza(new zzcv(this.mContext, this.zzqP.afmaVersion));
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Cannot initialize CSI reporter.", e);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.zzcg zzz(android.content.Context r11) {
        /*
        r10 = this;
        r2 = 0;
        r1 = com.google.android.gms.internal.zzcu.zzxI;
        r1 = r1.get();
        r1 = (java.lang.Boolean) r1;
        r1 = r1.booleanValue();
        if (r1 == 0) goto L_0x001b;
    L_0x000f:
        r1 = com.google.android.gms.common.util.zzs.zzva();
        if (r1 == 0) goto L_0x001b;
    L_0x0015:
        r1 = r10.zziD();
        if (r1 == 0) goto L_0x001d;
    L_0x001b:
        r1 = r2;
    L_0x001c:
        return r1;
    L_0x001d:
        r3 = r10.zzpp;
        monitor-enter(r3);
        r1 = android.os.Looper.getMainLooper();	 Catch:{ all -> 0x0070 }
        if (r1 == 0) goto L_0x0028;
    L_0x0026:
        if (r11 != 0) goto L_0x002b;
    L_0x0028:
        monitor-exit(r3);	 Catch:{ all -> 0x0070 }
        r1 = r2;
        goto L_0x001c;
    L_0x002b:
        r1 = r10.zzul;	 Catch:{ all -> 0x0070 }
        if (r1 != 0) goto L_0x0042;
    L_0x002f:
        r1 = r11.getApplicationContext();	 Catch:{ all -> 0x0070 }
        r1 = (android.app.Application) r1;	 Catch:{ all -> 0x0070 }
        r2 = new com.google.android.gms.internal.zzcf;	 Catch:{ all -> 0x0070 }
        if (r1 != 0) goto L_0x003d;
    L_0x0039:
        r0 = r11;
        r0 = (android.app.Application) r0;	 Catch:{ all -> 0x0070 }
        r1 = r0;
    L_0x003d:
        r2.<init>(r1, r11);	 Catch:{ all -> 0x0070 }
        r10.zzul = r2;	 Catch:{ all -> 0x0070 }
    L_0x0042:
        r1 = r10.zzum;	 Catch:{ all -> 0x0070 }
        if (r1 != 0) goto L_0x004d;
    L_0x0046:
        r1 = new com.google.android.gms.internal.zzce;	 Catch:{ all -> 0x0070 }
        r1.<init>();	 Catch:{ all -> 0x0070 }
        r10.zzum = r1;	 Catch:{ all -> 0x0070 }
    L_0x004d:
        r1 = r10.zzPM;	 Catch:{ all -> 0x0070 }
        if (r1 != 0) goto L_0x0067;
    L_0x0051:
        r1 = new com.google.android.gms.internal.zzcg;	 Catch:{ all -> 0x0070 }
        r2 = r10.zzul;	 Catch:{ all -> 0x0070 }
        r4 = r10.zzum;	 Catch:{ all -> 0x0070 }
        r5 = new com.google.android.gms.internal.zzif;	 Catch:{ all -> 0x0070 }
        r6 = r10.mContext;	 Catch:{ all -> 0x0070 }
        r7 = r10.zzqP;	 Catch:{ all -> 0x0070 }
        r8 = 0;
        r9 = 0;
        r5.<init>(r6, r7, r8, r9);	 Catch:{ all -> 0x0070 }
        r1.<init>(r2, r4, r5);	 Catch:{ all -> 0x0070 }
        r10.zzPM = r1;	 Catch:{ all -> 0x0070 }
    L_0x0067:
        r1 = r10.zzPM;	 Catch:{ all -> 0x0070 }
        r1.zzdt();	 Catch:{ all -> 0x0070 }
        r1 = r10.zzPM;	 Catch:{ all -> 0x0070 }
        monitor-exit(r3);	 Catch:{ all -> 0x0070 }
        goto L_0x001c;
    L_0x0070:
        r1 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0070 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzjq.zzz(android.content.Context):com.google.android.gms.internal.zzcg");
    }
}
