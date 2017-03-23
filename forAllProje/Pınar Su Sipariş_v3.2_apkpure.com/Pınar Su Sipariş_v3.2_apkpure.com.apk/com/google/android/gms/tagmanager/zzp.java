package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.zze;
import com.google.android.gms.common.util.zzh;
import com.google.android.gms.internal.zzabr.zza;
import com.google.android.gms.internal.zzabs;
import com.google.android.gms.internal.zzabt.zzc;
import com.google.android.gms.internal.zzaf.zzf;
import com.google.android.gms.internal.zzaf.zzj;
import com.google.android.gms.internal.zznv;

public class zzp extends zznv<ContainerHolder> {
    private final Context mContext;
    private final Looper zzakW;
    private final String zzbnR;
    private long zzbnW;
    private final TagManager zzbod;
    private final d zzbog;
    private final ay zzboh;
    private final int zzboi;
    private f zzboj;
    private zzabs zzbok;
    private volatile zzo zzbol;
    private volatile boolean zzbom;
    private zzj zzbon;
    private String zzboo;
    private e zzbop;
    private a zzboq;
    private final zze zzsd;

    interface e extends Releasable {
        void a(long j, String str);

        void a(zzbm<zzj> com_google_android_gms_tagmanager_zzbm_com_google_android_gms_internal_zzaf_zzj);

        void a(String str);
    }

    interface f extends Releasable {
        zzc a(int i);

        void a();

        void a(zza com_google_android_gms_internal_zzabr_zza);

        void a(zzbm<zza> com_google_android_gms_tagmanager_zzbm_com_google_android_gms_internal_zzabr_zza);
    }

    class AnonymousClass1 {
    }

    interface a {
        boolean a(Container container);
    }

    private class b implements zzbm<zza> {
        final /* synthetic */ zzp a;

        private b(zzp com_google_android_gms_tagmanager_zzp) {
            this.a = com_google_android_gms_tagmanager_zzp;
        }

        public void a() {
        }

        public void a(zza com_google_android_gms_internal_zzabr_zza) {
            zzj com_google_android_gms_internal_zzaf_zzj;
            if (com_google_android_gms_internal_zzabr_zza.zzbwa != null) {
                com_google_android_gms_internal_zzaf_zzj = com_google_android_gms_internal_zzabr_zza.zzbwa;
            } else {
                zzf com_google_android_gms_internal_zzaf_zzf = com_google_android_gms_internal_zzabr_zza.zzjG;
                com_google_android_gms_internal_zzaf_zzj = new zzj();
                com_google_android_gms_internal_zzaf_zzj.zzjG = com_google_android_gms_internal_zzaf_zzf;
                com_google_android_gms_internal_zzaf_zzj.zzjF = null;
                com_google_android_gms_internal_zzaf_zzj.zzjH = com_google_android_gms_internal_zzaf_zzf.version;
            }
            this.a.zza(com_google_android_gms_internal_zzaf_zzj, com_google_android_gms_internal_zzabr_zza.zzbvZ, true);
        }

        public void a(zzbm.zza com_google_android_gms_tagmanager_zzbm_zza) {
            if (!this.a.zzbom) {
                this.a.zzap(0);
            }
        }

        public /* synthetic */ void a(Object obj) {
            a((zza) obj);
        }
    }

    private class c implements zzbm<zzj> {
        final /* synthetic */ zzp a;

        private c(zzp com_google_android_gms_tagmanager_zzp) {
            this.a = com_google_android_gms_tagmanager_zzp;
        }

        public void a() {
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(com.google.android.gms.internal.zzaf.zzj r6) {
            /*
            r5 = this;
            r1 = r5.a;
            monitor-enter(r1);
            r0 = r6.zzjG;	 Catch:{ all -> 0x0067 }
            if (r0 != 0) goto L_0x002a;
        L_0x0007:
            r0 = r5.a;	 Catch:{ all -> 0x0067 }
            r0 = r0.zzbon;	 Catch:{ all -> 0x0067 }
            r0 = r0.zzjG;	 Catch:{ all -> 0x0067 }
            if (r0 != 0) goto L_0x0020;
        L_0x0011:
            r0 = "Current resource is null; network resource is also null";
            com.google.android.gms.tagmanager.zzbn.e(r0);	 Catch:{ all -> 0x0067 }
            r0 = r5.a;	 Catch:{ all -> 0x0067 }
            r2 = 3600000; // 0x36ee80 float:5.044674E-39 double:1.7786363E-317;
            r0.zzap(r2);	 Catch:{ all -> 0x0067 }
            monitor-exit(r1);	 Catch:{ all -> 0x0067 }
        L_0x001f:
            return;
        L_0x0020:
            r0 = r5.a;	 Catch:{ all -> 0x0067 }
            r0 = r0.zzbon;	 Catch:{ all -> 0x0067 }
            r0 = r0.zzjG;	 Catch:{ all -> 0x0067 }
            r6.zzjG = r0;	 Catch:{ all -> 0x0067 }
        L_0x002a:
            r0 = r5.a;	 Catch:{ all -> 0x0067 }
            r2 = r5.a;	 Catch:{ all -> 0x0067 }
            r2 = r2.zzsd;	 Catch:{ all -> 0x0067 }
            r2 = r2.currentTimeMillis();	 Catch:{ all -> 0x0067 }
            r4 = 0;
            r0.zza(r6, r2, r4);	 Catch:{ all -> 0x0067 }
            r0 = r5.a;	 Catch:{ all -> 0x0067 }
            r2 = r0.zzbnW;	 Catch:{ all -> 0x0067 }
            r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0067 }
            r4 = 58;
            r0.<init>(r4);	 Catch:{ all -> 0x0067 }
            r4 = "setting refresh time to current time: ";
            r0 = r0.append(r4);	 Catch:{ all -> 0x0067 }
            r0 = r0.append(r2);	 Catch:{ all -> 0x0067 }
            r0 = r0.toString();	 Catch:{ all -> 0x0067 }
            com.google.android.gms.tagmanager.zzbn.v(r0);	 Catch:{ all -> 0x0067 }
            r0 = r5.a;	 Catch:{ all -> 0x0067 }
            r0 = r0.zzJs();	 Catch:{ all -> 0x0067 }
            if (r0 != 0) goto L_0x0065;
        L_0x0060:
            r0 = r5.a;	 Catch:{ all -> 0x0067 }
            r0.zza(r6);	 Catch:{ all -> 0x0067 }
        L_0x0065:
            monitor-exit(r1);	 Catch:{ all -> 0x0067 }
            goto L_0x001f;
        L_0x0067:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x0067 }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzp.c.a(com.google.android.gms.internal.zzaf$zzj):void");
        }

        public void a(zzbm.zza com_google_android_gms_tagmanager_zzbm_zza) {
            synchronized (this.a) {
                if (!this.a.isReady()) {
                    if (this.a.zzbol != null) {
                        this.a.zzb(this.a.zzbol);
                    } else {
                        this.a.zzb(this.a.zzbx(Status.zzalz));
                    }
                }
            }
            this.a.zzap(3600000);
        }

        public /* synthetic */ void a(Object obj) {
            a((zzj) obj);
        }
    }

    private class d implements zzo.zza {
        final /* synthetic */ zzp a;

        private d(zzp com_google_android_gms_tagmanager_zzp) {
            this.a = com_google_android_gms_tagmanager_zzp;
        }

        public String zzJm() {
            return this.a.zzJm();
        }

        public void zzJo() {
            if (this.a.zzboh.a()) {
                this.a.zzap(0);
            }
        }

        public void zzgn(String str) {
            this.a.zzgn(str);
        }
    }

    public zzp(Context context, TagManager tagManager, Looper looper, String str, int i, ci ciVar) {
        this(context, tagManager, looper, str, i, new bi(context, str), new bh(context, str, ciVar), new zzabs(context), zzh.zzuW(), new ac(30, 900000, 5000, "refreshing", zzh.zzuW()));
        this.zzbok.zzhn(ciVar.a());
    }

    zzp(Context context, TagManager tagManager, Looper looper, String str, int i, f fVar, e eVar, zzabs com_google_android_gms_internal_zzabs, zze com_google_android_gms_common_util_zze, ay ayVar) {
        super(looper == null ? Looper.getMainLooper() : looper);
        this.mContext = context;
        this.zzbod = tagManager;
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        this.zzakW = looper;
        this.zzbnR = str;
        this.zzboi = i;
        this.zzboj = fVar;
        this.zzbop = eVar;
        this.zzbok = com_google_android_gms_internal_zzabs;
        this.zzbog = new d();
        this.zzbon = new zzj();
        this.zzsd = com_google_android_gms_common_util_zze;
        this.zzboh = ayVar;
        if (zzJs()) {
            zzgn(aw.a().c());
        }
    }

    private boolean zzJs() {
        aw a = aw.a();
        return (a.b() == a.CONTAINER || a.b() == a.CONTAINER_DEBUG) && this.zzbnR.equals(a.d());
    }

    private synchronized void zza(zzj com_google_android_gms_internal_zzaf_zzj) {
        if (this.zzboj != null) {
            zza com_google_android_gms_internal_zzabr_zza = new zza();
            com_google_android_gms_internal_zzabr_zza.zzbvZ = this.zzbnW;
            com_google_android_gms_internal_zzabr_zza.zzjG = new zzf();
            com_google_android_gms_internal_zzabr_zza.zzbwa = com_google_android_gms_internal_zzaf_zzj;
            this.zzboj.a(com_google_android_gms_internal_zzabr_zza);
        }
    }

    private synchronized void zza(zzj com_google_android_gms_internal_zzaf_zzj, long j, boolean z) {
        Container container;
        if (z) {
            boolean z2 = this.zzbom;
        }
        if (!isReady() || this.zzbol == null) {
            this.zzbon = com_google_android_gms_internal_zzaf_zzj;
            this.zzbnW = j;
            zzap(Math.max(0, Math.min(43200000, (this.zzbnW + 43200000) - this.zzsd.currentTimeMillis())));
            container = new Container(this.mContext, this.zzbod.getDataLayer(), this.zzbnR, j, com_google_android_gms_internal_zzaf_zzj);
        } else {
            this.zzbon = com_google_android_gms_internal_zzaf_zzj;
            this.zzbnW = j;
            zzap(Math.max(0, Math.min(43200000, (this.zzbnW + 43200000) - this.zzsd.currentTimeMillis())));
            container = new Container(this.mContext, this.zzbod.getDataLayer(), this.zzbnR, j, com_google_android_gms_internal_zzaf_zzj);
        }
        if (this.zzbol == null) {
            this.zzbol = new zzo(this.zzbod, this.zzakW, container, this.zzbog);
        } else {
            this.zzbol.a(container);
        }
        if (!isReady() && this.zzboq.a(container)) {
            zzb(this.zzbol);
        }
    }

    private void zzaD(final boolean z) {
        this.zzboj.a(new b());
        this.zzbop.a(new c());
        zzc a = this.zzboj.a(this.zzboi);
        if (a != null) {
            this.zzbol = new zzo(this.zzbod, this.zzakW, new Container(this.mContext, this.zzbod.getDataLayer(), this.zzbnR, 0, a), this.zzbog);
        }
        this.zzboq = new a(this) {
            final /* synthetic */ zzp b;

            public boolean a(Container container) {
                return z ? container.getLastRefreshTime() + 43200000 >= this.b.zzsd.currentTimeMillis() : !container.isDefault();
            }
        };
        if (zzJs()) {
            this.zzbop.a(0, "");
        } else {
            this.zzboj.a();
        }
    }

    private synchronized void zzap(long j) {
        if (this.zzbop == null) {
            zzbn.zzaW("Refresh requested, but no network load scheduler.");
        } else {
            this.zzbop.a(j, this.zzbon.zzjH);
        }
    }

    synchronized String zzJm() {
        return this.zzboo;
    }

    public void zzJp() {
        zzc a = this.zzboj.a(this.zzboi);
        if (a != null) {
            zzb(new zzo(this.zzbod, this.zzakW, new Container(this.mContext, this.zzbod.getDataLayer(), this.zzbnR, 0, a), new zzo.zza(this) {
                final /* synthetic */ zzp a;

                {
                    this.a = r1;
                }

                public String zzJm() {
                    return this.a.zzJm();
                }

                public void zzJo() {
                    zzbn.zzaW("Refresh ignored: container loaded as default only.");
                }

                public void zzgn(String str) {
                    this.a.zzgn(str);
                }
            }));
        } else {
            String str = "Default was requested, but no default container was found";
            zzbn.e(str);
            zzb(zzbx(new Status(10, str, null)));
        }
        this.zzbop = null;
        this.zzboj = null;
    }

    public void zzJq() {
        zzaD(false);
    }

    public void zzJr() {
        zzaD(true);
    }

    protected ContainerHolder zzbx(Status status) {
        if (this.zzbol != null) {
            return this.zzbol;
        }
        if (status == Status.zzalz) {
            zzbn.e("timer expired: setting result to failure");
        }
        return new zzo(status);
    }

    protected /* synthetic */ Result zzc(Status status) {
        return zzbx(status);
    }

    synchronized void zzgn(String str) {
        this.zzboo = str;
        if (this.zzbop != null) {
            this.zzbop.a(str);
        }
    }
}
