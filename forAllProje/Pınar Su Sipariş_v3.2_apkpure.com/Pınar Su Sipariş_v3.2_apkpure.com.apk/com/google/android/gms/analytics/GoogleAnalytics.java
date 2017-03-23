package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.analytics.internal.zzae;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzan;
import com.google.android.gms.analytics.internal.zzap;
import com.google.android.gms.analytics.internal.zzb;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzy;
import com.google.android.gms.common.internal.zzaa;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class GoogleAnalytics extends zza {
    private static List<Runnable> zzTX = new ArrayList();
    private Set<a> zzTY = new HashSet();
    private boolean zzTZ;
    private boolean zzUa;
    private volatile boolean zzUb;
    private boolean zzUc;
    private boolean zzru;

    interface a {
        void a(Activity activity);

        void b(Activity activity);
    }

    @TargetApi(14)
    class b implements ActivityLifecycleCallbacks {
        final /* synthetic */ GoogleAnalytics a;

        b(GoogleAnalytics googleAnalytics) {
            this.a = googleAnalytics;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            this.a.zzm(activity);
        }

        public void onActivityStopped(Activity activity) {
            this.a.zzn(activity);
        }
    }

    public GoogleAnalytics(zzf com_google_android_gms_analytics_internal_zzf) {
        super(com_google_android_gms_analytics_internal_zzf);
    }

    public static GoogleAnalytics getInstance(Context context) {
        return zzf.zzX(context).zzme();
    }

    public static void zzkt() {
        synchronized (GoogleAnalytics.class) {
            if (zzTX != null) {
                for (Runnable run : zzTX) {
                    run.run();
                }
                zzTX = null;
            }
        }
    }

    private zzb zzkw() {
        return zzkj().zzkw();
    }

    private zzap zzkx() {
        return zzkj().zzkx();
    }

    public void dispatchLocalHits() {
        zzkw().zzlJ();
    }

    @TargetApi(14)
    public void enableAutoActivityReports(Application application) {
        if (VERSION.SDK_INT >= 14 && !this.zzTZ) {
            application.registerActivityLifecycleCallbacks(new b(this));
            this.zzTZ = true;
        }
    }

    public boolean getAppOptOut() {
        return this.zzUb;
    }

    @Deprecated
    public Logger getLogger() {
        return zzae.getLogger();
    }

    public void initialize() {
        zzks();
        this.zzru = true;
    }

    public boolean isDryRunEnabled() {
        return this.zzUa;
    }

    public boolean isInitialized() {
        return this.zzru;
    }

    public Tracker newTracker(int i) {
        Tracker tracker;
        synchronized (this) {
            tracker = new Tracker(zzkj(), null, null);
            if (i > 0) {
                zzan com_google_android_gms_analytics_internal_zzan = (zzan) new zzam(zzkj()).zzav(i);
                if (com_google_android_gms_analytics_internal_zzan != null) {
                    tracker.zza(com_google_android_gms_analytics_internal_zzan);
                }
            }
            tracker.initialize();
        }
        return tracker;
    }

    public Tracker newTracker(String str) {
        Tracker tracker;
        synchronized (this) {
            tracker = new Tracker(zzkj(), str, null);
            tracker.initialize();
        }
        return tracker;
    }

    public void reportActivityStart(Activity activity) {
        if (!this.zzTZ) {
            zzm(activity);
        }
    }

    public void reportActivityStop(Activity activity) {
        if (!this.zzTZ) {
            zzn(activity);
        }
    }

    public void setAppOptOut(boolean z) {
        this.zzUb = z;
        if (this.zzUb) {
            zzkw().zzlI();
        }
    }

    public void setDryRun(boolean z) {
        this.zzUa = z;
    }

    public void setLocalDispatchPeriod(int i) {
        zzkw().setLocalDispatchPeriod(i);
    }

    @Deprecated
    public void setLogger(Logger logger) {
        zzae.setLogger(logger);
        if (!this.zzUc) {
            String str = (String) zzy.zzXF.get();
            Log.i((String) zzy.zzXF.get(), new StringBuilder(String.valueOf(str).length() + 112).append("GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.").append(str).append(" DEBUG").toString());
            this.zzUc = true;
        }
    }

    void zza(a aVar) {
        this.zzTY.add(aVar);
        Context context = zzkj().getContext();
        if (context instanceof Application) {
            enableAutoActivityReports((Application) context);
        }
    }

    void zzb(a aVar) {
        this.zzTY.remove(aVar);
    }

    void zzks() {
        zzap zzkx = zzkx();
        if (zzkx.zznL()) {
            getLogger().setLogLevel(zzkx.getLogLevel());
        }
        if (zzkx.zznP()) {
            setDryRun(zzkx.zznQ());
        }
        if (zzkx.zznL()) {
            Logger logger = zzae.getLogger();
            if (logger != null) {
                logger.setLogLevel(zzkx.getLogLevel());
            }
        }
    }

    public String zzku() {
        zzaa.zzdd("getClientId can not be called from the main thread");
        return zzkj().zzmh().zzmP();
    }

    void zzkv() {
        zzkw().zzlK();
    }

    void zzm(Activity activity) {
        for (a a : this.zzTY) {
            a.a(activity);
        }
    }

    void zzn(Activity activity) {
        for (a b : this.zzTY) {
            b.b(activity);
        }
    }
}
