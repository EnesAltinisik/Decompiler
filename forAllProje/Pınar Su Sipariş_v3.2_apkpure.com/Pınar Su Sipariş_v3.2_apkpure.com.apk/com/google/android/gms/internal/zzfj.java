package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzkt.zza;
import java.util.Map;

@zzig
public class zzfj {
    private final Context mContext;
    private final String zzDK;
    private zzke<zzfg> zzDL;
    private zzke<zzfg> zzDM;
    private zzd zzDN;
    private int zzDO;
    private final Object zzpp;
    private final VersionInfoParcel zzqP;

    static class a {
        static int a = 60000;
        static int b = 10000;
    }

    public static class zzb<T> implements zzke<T> {
        public void zzc(T t) {
        }
    }

    public static class zzc extends zzku<zzfk> {
        private final zzd zzEb;
        private boolean zzEc;
        private final Object zzpp = new Object();

        public zzc(zzd com_google_android_gms_internal_zzfj_zzd) {
            this.zzEb = com_google_android_gms_internal_zzfj_zzd;
        }

        public void release() {
            synchronized (this.zzpp) {
                if (this.zzEc) {
                    return;
                }
                this.zzEc = true;
                zza(new com.google.android.gms.internal.zzkt.zzc<zzfk>(this) {
                    final /* synthetic */ zzc a;

                    {
                        this.a = r1;
                    }

                    public void a(zzfk com_google_android_gms_internal_zzfk) {
                        zzjw.v("Ending javascript session.");
                        ((zzfl) com_google_android_gms_internal_zzfk).zzfz();
                    }

                    public /* synthetic */ void zzc(Object obj) {
                        a((zzfk) obj);
                    }
                }, new com.google.android.gms.internal.zzkt.zzb());
                zza(new com.google.android.gms.internal.zzkt.zzc<zzfk>(this) {
                    final /* synthetic */ zzc a;

                    {
                        this.a = r1;
                    }

                    public void a(zzfk com_google_android_gms_internal_zzfk) {
                        zzjw.v("Releasing engine reference.");
                        this.a.zzEb.zzfw();
                    }

                    public /* synthetic */ void zzc(Object obj) {
                        a((zzfk) obj);
                    }
                }, new zza(this) {
                    final /* synthetic */ zzc a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        this.a.zzEb.zzfw();
                    }
                });
            }
        }
    }

    public static class zzd extends zzku<zzfg> {
        private zzke<zzfg> zzDM;
        private boolean zzEe;
        private int zzEf;
        private final Object zzpp = new Object();

        public zzd(zzke<zzfg> com_google_android_gms_internal_zzke_com_google_android_gms_internal_zzfg) {
            this.zzDM = com_google_android_gms_internal_zzke_com_google_android_gms_internal_zzfg;
            this.zzEe = false;
            this.zzEf = 0;
        }

        public zzc zzfv() {
            final zzc com_google_android_gms_internal_zzfj_zzc = new zzc(this);
            synchronized (this.zzpp) {
                zza(new com.google.android.gms.internal.zzkt.zzc<zzfg>(this) {
                    final /* synthetic */ zzd b;

                    public void a(zzfg com_google_android_gms_internal_zzfg) {
                        zzjw.v("Getting a new session for JS Engine.");
                        com_google_android_gms_internal_zzfj_zzc.zzf(com_google_android_gms_internal_zzfg.zzfs());
                    }

                    public /* synthetic */ void zzc(Object obj) {
                        a((zzfg) obj);
                    }
                }, new zza(this) {
                    final /* synthetic */ zzd b;

                    public void run() {
                        zzjw.v("Rejecting reference for JS Engine.");
                        com_google_android_gms_internal_zzfj_zzc.reject();
                    }
                });
                zzaa.zzai(this.zzEf >= 0);
                this.zzEf++;
            }
            return com_google_android_gms_internal_zzfj_zzc;
        }

        protected void zzfw() {
            boolean z = true;
            synchronized (this.zzpp) {
                if (this.zzEf < 1) {
                    z = false;
                }
                zzaa.zzai(z);
                zzjw.v("Releasing 1 reference for JS Engine");
                this.zzEf--;
                zzfy();
            }
        }

        public void zzfx() {
            boolean z = true;
            synchronized (this.zzpp) {
                if (this.zzEf < 0) {
                    z = false;
                }
                zzaa.zzai(z);
                zzjw.v("Releasing root reference. JS Engine will be destroyed once other references are released.");
                this.zzEe = true;
                zzfy();
            }
        }

        protected void zzfy() {
            synchronized (this.zzpp) {
                zzaa.zzai(this.zzEf >= 0);
                if (this.zzEe && this.zzEf == 0) {
                    zzjw.v("No reference is left (including root). Cleaning up engine.");
                    zza(new com.google.android.gms.internal.zzkt.zzc<zzfg>(this) {
                        final /* synthetic */ zzd a;

                        {
                            this.a = r1;
                        }

                        public void a(final zzfg com_google_android_gms_internal_zzfg) {
                            zzu.zzck().runOnUiThread(new Runnable(this) {
                                final /* synthetic */ AnonymousClass3 b;

                                public void run() {
                                    this.b.a.zzDM.zzc(com_google_android_gms_internal_zzfg);
                                    com_google_android_gms_internal_zzfg.destroy();
                                }
                            });
                        }

                        public /* synthetic */ void zzc(Object obj) {
                            a((zzfg) obj);
                        }
                    }, new com.google.android.gms.internal.zzkt.zzb());
                } else {
                    zzjw.v("There are still references to the engine. Not destroying.");
                }
            }
        }
    }

    public static class zze extends zzku<zzfk> {
        private zzc zzEk;

        public zze(zzc com_google_android_gms_internal_zzfj_zzc) {
            this.zzEk = com_google_android_gms_internal_zzfj_zzc;
        }

        public void finalize() {
            this.zzEk.release();
            this.zzEk = null;
        }

        public int getStatus() {
            return this.zzEk.getStatus();
        }

        public void reject() {
            this.zzEk.reject();
        }

        public void zza(com.google.android.gms.internal.zzkt.zzc<zzfk> com_google_android_gms_internal_zzkt_zzc_com_google_android_gms_internal_zzfk, zza com_google_android_gms_internal_zzkt_zza) {
            this.zzEk.zza(com_google_android_gms_internal_zzkt_zzc_com_google_android_gms_internal_zzfk, com_google_android_gms_internal_zzkt_zza);
        }

        public void zzf(zzfk com_google_android_gms_internal_zzfk) {
            this.zzEk.zzf(com_google_android_gms_internal_zzfk);
        }
    }

    public zzfj(Context context, VersionInfoParcel versionInfoParcel, String str) {
        this.zzpp = new Object();
        this.zzDO = 1;
        this.zzDK = str;
        this.mContext = context.getApplicationContext();
        this.zzqP = versionInfoParcel;
        this.zzDL = new zzb();
        this.zzDM = new zzb();
    }

    public zzfj(Context context, VersionInfoParcel versionInfoParcel, String str, zzke<zzfg> com_google_android_gms_internal_zzke_com_google_android_gms_internal_zzfg, zzke<zzfg> com_google_android_gms_internal_zzke_com_google_android_gms_internal_zzfg2) {
        this(context, versionInfoParcel, str);
        this.zzDL = com_google_android_gms_internal_zzke_com_google_android_gms_internal_zzfg;
        this.zzDM = com_google_android_gms_internal_zzke_com_google_android_gms_internal_zzfg2;
    }

    private zzd zza(final zzaq com_google_android_gms_internal_zzaq) {
        final zzd com_google_android_gms_internal_zzfj_zzd = new zzd(this.zzDM);
        zzu.zzck().runOnUiThread(new Runnable(this) {
            final /* synthetic */ zzfj c;

            public void run() {
                final zzfg zza = this.c.zza(this.c.mContext, this.c.zzqP, com_google_android_gms_internal_zzaq);
                zza.zza(new zzfg.zza(this) {
                    final /* synthetic */ AnonymousClass1 b;

                    public void zzft() {
                        zzka.zzQu.postDelayed(new Runnable(this) {
                            final /* synthetic */ AnonymousClass1 a;

                            {
                                this.a = r1;
                            }

                            /* JADX WARNING: inconsistent code. */
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public void run() {
                                /*
                                r3 = this;
                                r0 = r3.a;
                                r0 = r0.b;
                                r0 = r0.c;
                                r1 = r0.zzpp;
                                monitor-enter(r1);
                                r0 = r3.a;	 Catch:{ all -> 0x0043 }
                                r0 = r0.b;	 Catch:{ all -> 0x0043 }
                                r0 = r0;	 Catch:{ all -> 0x0043 }
                                r0 = r0.getStatus();	 Catch:{ all -> 0x0043 }
                                r2 = -1;
                                if (r0 == r2) goto L_0x0025;
                            L_0x0018:
                                r0 = r3.a;	 Catch:{ all -> 0x0043 }
                                r0 = r0.b;	 Catch:{ all -> 0x0043 }
                                r0 = r0;	 Catch:{ all -> 0x0043 }
                                r0 = r0.getStatus();	 Catch:{ all -> 0x0043 }
                                r2 = 1;
                                if (r0 != r2) goto L_0x0027;
                            L_0x0025:
                                monitor-exit(r1);	 Catch:{ all -> 0x0043 }
                            L_0x0026:
                                return;
                            L_0x0027:
                                r0 = r3.a;	 Catch:{ all -> 0x0043 }
                                r0 = r0.b;	 Catch:{ all -> 0x0043 }
                                r0 = r0;	 Catch:{ all -> 0x0043 }
                                r0.reject();	 Catch:{ all -> 0x0043 }
                                r0 = com.google.android.gms.ads.internal.zzu.zzck();	 Catch:{ all -> 0x0043 }
                                r2 = new com.google.android.gms.internal.zzfj$1$1$1$1;	 Catch:{ all -> 0x0043 }
                                r2.<init>(r3);	 Catch:{ all -> 0x0043 }
                                r0.runOnUiThread(r2);	 Catch:{ all -> 0x0043 }
                                r0 = "Could not receive loaded message in a timely manner. Rejecting.";
                                com.google.android.gms.internal.zzjw.v(r0);	 Catch:{ all -> 0x0043 }
                                monitor-exit(r1);	 Catch:{ all -> 0x0043 }
                                goto L_0x0026;
                            L_0x0043:
                                r0 = move-exception;
                                monitor-exit(r1);	 Catch:{ all -> 0x0043 }
                                throw r0;
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfj.1.1.1.run():void");
                            }
                        }, (long) a.b);
                    }
                });
                zza.zza("/jsLoaded", new zzeh(this) {
                    final /* synthetic */ AnonymousClass1 b;

                    /* JADX WARNING: inconsistent code. */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void zza(com.google.android.gms.internal.zzla r4, java.util.Map<java.lang.String, java.lang.String> r5) {
                        /*
                        r3 = this;
                        r0 = r3.b;
                        r0 = r0.c;
                        r1 = r0.zzpp;
                        monitor-enter(r1);
                        r0 = r3.b;	 Catch:{ all -> 0x0051 }
                        r0 = r0;	 Catch:{ all -> 0x0051 }
                        r0 = r0.getStatus();	 Catch:{ all -> 0x0051 }
                        r2 = -1;
                        if (r0 == r2) goto L_0x001f;
                    L_0x0014:
                        r0 = r3.b;	 Catch:{ all -> 0x0051 }
                        r0 = r0;	 Catch:{ all -> 0x0051 }
                        r0 = r0.getStatus();	 Catch:{ all -> 0x0051 }
                        r2 = 1;
                        if (r0 != r2) goto L_0x0021;
                    L_0x001f:
                        monitor-exit(r1);	 Catch:{ all -> 0x0051 }
                    L_0x0020:
                        return;
                    L_0x0021:
                        r0 = r3.b;	 Catch:{ all -> 0x0051 }
                        r0 = r0.c;	 Catch:{ all -> 0x0051 }
                        r2 = 0;
                        r0.zzDO = r2;	 Catch:{ all -> 0x0051 }
                        r0 = r3.b;	 Catch:{ all -> 0x0051 }
                        r0 = r0.c;	 Catch:{ all -> 0x0051 }
                        r0 = r0.zzDL;	 Catch:{ all -> 0x0051 }
                        r2 = r0;	 Catch:{ all -> 0x0051 }
                        r0.zzc(r2);	 Catch:{ all -> 0x0051 }
                        r0 = r3.b;	 Catch:{ all -> 0x0051 }
                        r0 = r0;	 Catch:{ all -> 0x0051 }
                        r2 = r0;	 Catch:{ all -> 0x0051 }
                        r0.zzf(r2);	 Catch:{ all -> 0x0051 }
                        r0 = r3.b;	 Catch:{ all -> 0x0051 }
                        r0 = r0.c;	 Catch:{ all -> 0x0051 }
                        r2 = r3.b;	 Catch:{ all -> 0x0051 }
                        r2 = r0;	 Catch:{ all -> 0x0051 }
                        r0.zzDN = r2;	 Catch:{ all -> 0x0051 }
                        r0 = "Successfully loaded JS Engine.";
                        com.google.android.gms.internal.zzjw.v(r0);	 Catch:{ all -> 0x0051 }
                        monitor-exit(r1);	 Catch:{ all -> 0x0051 }
                        goto L_0x0020;
                    L_0x0051:
                        r0 = move-exception;
                        monitor-exit(r1);	 Catch:{ all -> 0x0051 }
                        throw r0;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfj.1.2.zza(com.google.android.gms.internal.zzla, java.util.Map):void");
                    }
                });
                final zzkl com_google_android_gms_internal_zzkl = new zzkl();
                zzeh anonymousClass3 = new zzeh(this) {
                    final /* synthetic */ AnonymousClass1 c;

                    public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
                        synchronized (this.c.c.zzpp) {
                            com.google.android.gms.ads.internal.util.client.zzb.zzaV("JS Engine is requesting an update");
                            if (this.c.c.zzDO == 0) {
                                com.google.android.gms.ads.internal.util.client.zzb.zzaV("Starting reload.");
                                this.c.c.zzDO = 2;
                                this.c.c.zzb(com_google_android_gms_internal_zzaq);
                            }
                            zza.zzb("/requestReload", (zzeh) com_google_android_gms_internal_zzkl.get());
                        }
                    }
                };
                com_google_android_gms_internal_zzkl.set(anonymousClass3);
                zza.zza("/requestReload", anonymousClass3);
                if (this.c.zzDK.endsWith(".js")) {
                    zza.zzaf(this.c.zzDK);
                } else if (this.c.zzDK.startsWith("<html>")) {
                    zza.zzah(this.c.zzDK);
                } else {
                    zza.zzag(this.c.zzDK);
                }
                zzka.zzQu.postDelayed(new Runnable(this) {
                    final /* synthetic */ AnonymousClass1 b;

                    /* JADX WARNING: inconsistent code. */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void run() {
                        /*
                        r3 = this;
                        r0 = r3.b;
                        r0 = r0.c;
                        r1 = r0.zzpp;
                        monitor-enter(r1);
                        r0 = r3.b;	 Catch:{ all -> 0x003b }
                        r0 = r0;	 Catch:{ all -> 0x003b }
                        r0 = r0.getStatus();	 Catch:{ all -> 0x003b }
                        r2 = -1;
                        if (r0 == r2) goto L_0x001f;
                    L_0x0014:
                        r0 = r3.b;	 Catch:{ all -> 0x003b }
                        r0 = r0;	 Catch:{ all -> 0x003b }
                        r0 = r0.getStatus();	 Catch:{ all -> 0x003b }
                        r2 = 1;
                        if (r0 != r2) goto L_0x0021;
                    L_0x001f:
                        monitor-exit(r1);	 Catch:{ all -> 0x003b }
                    L_0x0020:
                        return;
                    L_0x0021:
                        r0 = r3.b;	 Catch:{ all -> 0x003b }
                        r0 = r0;	 Catch:{ all -> 0x003b }
                        r0.reject();	 Catch:{ all -> 0x003b }
                        r0 = com.google.android.gms.ads.internal.zzu.zzck();	 Catch:{ all -> 0x003b }
                        r2 = new com.google.android.gms.internal.zzfj$1$4$1;	 Catch:{ all -> 0x003b }
                        r2.<init>(r3);	 Catch:{ all -> 0x003b }
                        r0.runOnUiThread(r2);	 Catch:{ all -> 0x003b }
                        r0 = "Could not receive loaded message in a timely manner. Rejecting.";
                        com.google.android.gms.internal.zzjw.v(r0);	 Catch:{ all -> 0x003b }
                        monitor-exit(r1);	 Catch:{ all -> 0x003b }
                        goto L_0x0020;
                    L_0x003b:
                        r0 = move-exception;
                        monitor-exit(r1);	 Catch:{ all -> 0x003b }
                        throw r0;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfj.1.4.run():void");
                    }
                }, (long) a.a);
            }
        });
        return com_google_android_gms_internal_zzfj_zzd;
    }

    protected zzfg zza(Context context, VersionInfoParcel versionInfoParcel, zzaq com_google_android_gms_internal_zzaq) {
        return new zzfi(context, versionInfoParcel, com_google_android_gms_internal_zzaq);
    }

    protected zzd zzb(zzaq com_google_android_gms_internal_zzaq) {
        final zzd zza = zza(com_google_android_gms_internal_zzaq);
        zza.zza(new com.google.android.gms.internal.zzkt.zzc<zzfg>(this) {
            final /* synthetic */ zzfj b;

            public void a(zzfg com_google_android_gms_internal_zzfg) {
                synchronized (this.b.zzpp) {
                    this.b.zzDO = 0;
                    if (!(this.b.zzDN == null || zza == this.b.zzDN)) {
                        zzjw.v("New JS engine is loaded, marking previous one as destroyable.");
                        this.b.zzDN.zzfx();
                    }
                    this.b.zzDN = zza;
                }
            }

            public /* synthetic */ void zzc(Object obj) {
                a((zzfg) obj);
            }
        }, new zza(this) {
            final /* synthetic */ zzfj b;

            public void run() {
                synchronized (this.b.zzpp) {
                    this.b.zzDO = 1;
                    zzjw.v("Failed loading new engine. Marking new engine destroyable.");
                    zza.zzfx();
                }
            }
        });
        return zza;
    }

    public zzc zzc(zzaq com_google_android_gms_internal_zzaq) {
        zzc zzfv;
        synchronized (this.zzpp) {
            if (this.zzDN == null || this.zzDN.getStatus() == -1) {
                this.zzDO = 2;
                this.zzDN = zzb(com_google_android_gms_internal_zzaq);
                zzfv = this.zzDN.zzfv();
            } else if (this.zzDO == 0) {
                zzfv = this.zzDN.zzfv();
            } else if (this.zzDO == 1) {
                this.zzDO = 2;
                zzb(com_google_android_gms_internal_zzaq);
                zzfv = this.zzDN.zzfv();
            } else if (this.zzDO == 2) {
                zzfv = this.zzDN.zzfv();
            } else {
                zzfv = this.zzDN.zzfv();
            }
        }
        return zzfv;
    }

    public zzc zzfu() {
        return zzc(null);
    }
}
