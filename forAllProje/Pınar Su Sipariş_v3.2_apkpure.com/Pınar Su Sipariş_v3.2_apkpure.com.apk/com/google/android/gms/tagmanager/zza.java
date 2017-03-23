package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.common.util.zze;
import com.google.android.gms.common.util.zzh;

public class zza {
    private static Object zzbnE = new Object();
    private static zza zzbnF;
    private volatile boolean mClosed;
    private final Context mContext;
    private final Thread zzQc;
    private volatile Info zzVT;
    private volatile long zzbnA;
    private volatile long zzbnB;
    private final Object zzbnC;
    private zza zzbnD;
    private volatile long zzbny;
    private volatile long zzbnz;
    private final zze zzsd;

    public interface zza {
        Info zzJe();
    }

    private zza(Context context) {
        this(context, null, zzh.zzuW());
    }

    public zza(Context context, zza com_google_android_gms_tagmanager_zza_zza, zze com_google_android_gms_common_util_zze) {
        this.zzbny = 900000;
        this.zzbnz = 30000;
        this.mClosed = false;
        this.zzbnC = new Object();
        this.zzbnD = new zza(this) {
            final /* synthetic */ zza a;

            {
                this.a = r1;
            }

            public Info zzJe() {
                Info info = null;
                try {
                    info = AdvertisingIdClient.getAdvertisingIdInfo(this.a.mContext);
                } catch (Throwable e) {
                    zzbn.zzd("IllegalStateException getting Advertising Id Info", e);
                } catch (Throwable e2) {
                    zzbn.zzd("GooglePlayServicesRepairableException getting Advertising Id Info", e2);
                } catch (Throwable e22) {
                    zzbn.zzd("IOException getting Ad Id Info", e22);
                } catch (Throwable e222) {
                    zzbn.zzd("GooglePlayServicesNotAvailableException getting Advertising Id Info", e222);
                } catch (Throwable e2222) {
                    zzbn.zzd("Unknown exception. Could not get the Advertising Id Info.", e2222);
                }
                return info;
            }
        };
        this.zzsd = com_google_android_gms_common_util_zze;
        if (context != null) {
            this.mContext = context.getApplicationContext();
        } else {
            this.mContext = context;
        }
        if (com_google_android_gms_tagmanager_zza_zza != null) {
            this.zzbnD = com_google_android_gms_tagmanager_zza_zza;
        }
        this.zzbnA = this.zzsd.currentTimeMillis();
        this.zzQc = new Thread(new Runnable(this) {
            final /* synthetic */ zza a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.zzJd();
            }
        });
    }

    private void zzJa() {
        synchronized (this) {
            try {
                zzJb();
                wait(500);
            } catch (InterruptedException e) {
            }
        }
    }

    private void zzJb() {
        if (this.zzsd.currentTimeMillis() - this.zzbnA > this.zzbnz) {
            synchronized (this.zzbnC) {
                this.zzbnC.notify();
            }
            this.zzbnA = this.zzsd.currentTimeMillis();
        }
    }

    private void zzJc() {
        if (this.zzsd.currentTimeMillis() - this.zzbnB > 3600000) {
            this.zzVT = null;
        }
    }

    private void zzJd() {
        Process.setThreadPriority(10);
        while (!this.mClosed) {
            Info zzJe = this.zzbnD.zzJe();
            if (zzJe != null) {
                this.zzVT = zzJe;
                this.zzbnB = this.zzsd.currentTimeMillis();
                zzbn.zzaV("Obtained fresh AdvertisingId info from GmsCore.");
            }
            synchronized (this) {
                notifyAll();
            }
            try {
                synchronized (this.zzbnC) {
                    this.zzbnC.wait(this.zzbny);
                }
            } catch (InterruptedException e) {
                zzbn.zzaV("sleep interrupted in AdvertiserDataPoller thread; continuing");
            }
        }
    }

    public static zza zzbg(Context context) {
        if (zzbnF == null) {
            synchronized (zzbnE) {
                if (zzbnF == null) {
                    zzbnF = new zza(context);
                    zzbnF.start();
                }
            }
        }
        return zzbnF;
    }

    public boolean isLimitAdTrackingEnabled() {
        if (this.zzVT == null) {
            zzJa();
        } else {
            zzJb();
        }
        zzJc();
        return this.zzVT == null ? true : this.zzVT.isLimitAdTrackingEnabled();
    }

    public void start() {
        this.zzQc.start();
    }

    public String zzIZ() {
        if (this.zzVT == null) {
            zzJa();
        } else {
            zzJb();
        }
        zzJc();
        return this.zzVT == null ? null : this.zzVT.getId();
    }
}
