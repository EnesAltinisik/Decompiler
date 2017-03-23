package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.util.zze;
import com.google.android.gms.common.util.zzf;
import com.google.android.gms.measurement.AppMeasurement.zzb;
import com.google.android.gms.measurement.AppMeasurement.zzc;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class zzac extends b {
    private a zzbfh;
    private zzb zzbfi;
    private final Set<zzc> zzbfj = new HashSet();
    private boolean zzbfk;

    @TargetApi(14)
    private class a implements ActivityLifecycleCallbacks {
        final /* synthetic */ zzac a;

        private a(zzac com_google_android_gms_measurement_internal_zzac) {
            this.a = com_google_android_gms_measurement_internal_zzac;
        }

        private boolean a(Uri uri) {
            Object queryParameter = uri.getQueryParameter("utm_campaign");
            Object queryParameter2 = uri.getQueryParameter("utm_source");
            Object queryParameter3 = uri.getQueryParameter("utm_medium");
            Object queryParameter4 = uri.getQueryParameter("gclid");
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4)) {
                return false;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString(Constants.MEDIUM, queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            queryParameter = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("content", queryParameter);
            }
            queryParameter = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("aclid", queryParameter);
            }
            queryParameter = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("cp1", queryParameter);
            }
            queryParameter = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("anid", queryParameter);
            }
            this.a.zze("auto", "_cmp", bundle);
            return true;
        }

        private boolean a(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            this.a.zzc("auto", "_ldl", str);
            return true;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            try {
                this.a.zzFm().zzFL().log("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data != null && data.isHierarchical()) {
                        if (bundle == null) {
                            a(data);
                        }
                        String queryParameter = data.getQueryParameter(Constants.REFERRER);
                        if (!TextUtils.isEmpty(queryParameter)) {
                            if (queryParameter.contains("gclid")) {
                                this.a.zzFm().zzFK().zzj("Activity created with referrer", queryParameter);
                                a(queryParameter);
                                return;
                            }
                            this.a.zzFm().zzFK().log("Activity created with data 'referrer' param without gclid");
                        }
                    }
                }
            } catch (Throwable th) {
                this.a.zzFm().zzFE().zzj("Throwable caught in onActivityCreated", th);
            }
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
            this.a.zzFk().zzGI();
        }

        public void onActivityResumed(Activity activity) {
            this.a.zzFk().zzGG();
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    protected zzac(zzx com_google_android_gms_measurement_internal_zzx) {
        super(com_google_android_gms_measurement_internal_zzx);
    }

    private void zzGy() {
        try {
            zzg(Class.forName(zzGz()));
        } catch (ClassNotFoundException e) {
            zzFm().zzFJ().log("Tag Manager is not found and thus will not be used");
        }
    }

    private String zzGz() {
        return "com.google.android.gms.tagmanager.TagManagerService";
    }

    private void zza(String str, String str2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        zza(str, str2, zzlQ().currentTimeMillis(), bundle, z, z2, z3, str3);
    }

    private void zza(String str, String str2, Object obj, long j) {
        zzaa.zzdl(str);
        zzaa.zzdl(str2);
        zzkN();
        zzlP();
        zzma();
        if (!this.zzbbl.isEnabled()) {
            zzFm().zzFK().log("User property not set since app measurement is disabled");
        } else if (this.zzbbl.zzFX()) {
            zzFm().zzFK().zze("Setting user property (FE)", str2, obj);
            zzFg().zza(new UserAttributeParcel(str2, j, obj, str));
        }
    }

    private void zzay(boolean z) {
        zzkN();
        zzlP();
        zzma();
        zzFm().zzFK().zzj("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        zzFn().b(z);
        zzFg().zzGA();
    }

    private void zzb(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        zzaa.zzdl(str);
        zzaa.zzdl(str2);
        zzaa.zzz(bundle);
        zzkN();
        zzma();
        if (this.zzbbl.isEnabled()) {
            if (!this.zzbfk) {
                this.zzbfk = true;
                zzGy();
            }
            boolean zzfQ = zzal.zzfQ(str2);
            if (z && this.zzbfi != null && !zzfQ) {
                zzFm().zzFK().zze("Passing event to registered event handler (FE)", str2, bundle);
                this.zzbfi.zzb(str, str2, bundle, j);
                return;
            } else if (this.zzbbl.zzFX()) {
                int zzfI = zzFi().zzfI(str2);
                if (zzfI != 0) {
                    this.zzbbl.zzFi().zze(zzfI, "_ev", zzFi().zza(str2, zzFo().zzEw(), true));
                    return;
                }
                bundle.putString("_o", str);
                Bundle zza = zzFi().zza(str2, bundle, zzf.zzA("_o"), z3);
                Bundle zzJ = z2 ? zzJ(zza) : zza;
                zzFm().zzFK().zze("Logging event (FE)", str2, zzJ);
                zzFg().zzc(new EventParcel(str2, new EventParams(zzJ), str, j), str3);
                for (zzc zzc : this.zzbfj) {
                    zzc.zzc(str, str2, zzJ, j);
                }
                return;
            } else {
                return;
            }
        }
        zzFm().zzFK().log("Event not sent since app measurement is disabled");
    }

    public /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public void setMeasurementEnabled(final boolean z) {
        zzma();
        zzlP();
        zzFl().zzg(new Runnable(this) {
            final /* synthetic */ zzac b;

            public void run() {
                this.b.zzay(z);
            }
        });
    }

    public void setMinimumSessionDuration(final long j) {
        zzlP();
        zzFl().zzg(new Runnable(this) {
            final /* synthetic */ zzac b;

            public void run() {
                this.b.zzFn().h.set(j);
                this.b.zzFm().zzFK().zzj("Minimum session duration set", Long.valueOf(j));
            }
        });
    }

    public void setSessionTimeoutDuration(final long j) {
        zzlP();
        zzFl().zzg(new Runnable(this) {
            final /* synthetic */ zzac b;

            public void run() {
                this.b.zzFn().i.set(j);
                this.b.zzFm().zzFK().zzj("Session timeout duration set", Long.valueOf(j));
            }
        });
    }

    public /* bridge */ /* synthetic */ void zzFb() {
        super.zzFb();
    }

    public /* bridge */ /* synthetic */ f zzFc() {
        return super.zzFc();
    }

    public /* bridge */ /* synthetic */ zzac zzFd() {
        return super.zzFd();
    }

    public /* bridge */ /* synthetic */ zzn zzFe() {
        return super.zzFe();
    }

    public /* bridge */ /* synthetic */ zzg zzFf() {
        return super.zzFf();
    }

    public /* bridge */ /* synthetic */ zzad zzFg() {
        return super.zzFg();
    }

    public /* bridge */ /* synthetic */ zze zzFh() {
        return super.zzFh();
    }

    public /* bridge */ /* synthetic */ zzal zzFi() {
        return super.zzFi();
    }

    public /* bridge */ /* synthetic */ zzv zzFj() {
        return super.zzFj();
    }

    public /* bridge */ /* synthetic */ zzaf zzFk() {
        return super.zzFk();
    }

    public /* bridge */ /* synthetic */ zzw zzFl() {
        return super.zzFl();
    }

    public /* bridge */ /* synthetic */ zzp zzFm() {
        return super.zzFm();
    }

    public /* bridge */ /* synthetic */ zzt zzFn() {
        return super.zzFn();
    }

    public /* bridge */ /* synthetic */ zzd zzFo() {
        return super.zzFo();
    }

    @TargetApi(14)
    public void zzGw() {
        if (getContext().getApplicationContext() instanceof Application) {
            Application application = (Application) getContext().getApplicationContext();
            if (this.zzbfh == null) {
                this.zzbfh = new a();
            }
            application.unregisterActivityLifecycleCallbacks(this.zzbfh);
            application.registerActivityLifecycleCallbacks(this.zzbfh);
            zzFm().zzFL().log("Registered activity lifecycle callback");
        }
    }

    public void zzGx() {
        zzkN();
        zzlP();
        zzma();
        if (this.zzbbl.zzFX()) {
            zzFg().zzGx();
            String g = zzFn().g();
            if (!TextUtils.isEmpty(g) && !g.equals(zzFf().zzFx())) {
                Bundle bundle = new Bundle();
                bundle.putString("_po", g);
                zze("auto", "_ou", bundle);
            }
        }
    }

    Bundle zzJ(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object zzl = zzFi().zzl(str, bundle.get(str));
                if (zzl == null) {
                    zzFm().zzFG().zzj("Param value can't be null", str);
                } else if ((!(zzl instanceof String) && !(zzl instanceof Character) && !(zzl instanceof CharSequence)) || !TextUtils.isEmpty(String.valueOf(zzl))) {
                    zzFi().zza(bundle2, str, zzl);
                }
            }
        }
        return bundle2;
    }

    public void zza(zzb com_google_android_gms_measurement_AppMeasurement_zzb) {
        zzkN();
        zzlP();
        zzma();
        if (!(com_google_android_gms_measurement_AppMeasurement_zzb == null || com_google_android_gms_measurement_AppMeasurement_zzb == this.zzbfi)) {
            zzaa.zza(this.zzbfi == null, (Object) "EventInterceptor already set.");
        }
        this.zzbfi = com_google_android_gms_measurement_AppMeasurement_zzb;
    }

    public void zza(zzc com_google_android_gms_measurement_AppMeasurement_zzc) {
        zzkN();
        zzlP();
        zzma();
        zzaa.zzz(com_google_android_gms_measurement_AppMeasurement_zzc);
        if (this.zzbfj.contains(com_google_android_gms_measurement_AppMeasurement_zzc)) {
            throw new IllegalStateException("OnEventListener already registered.");
        }
        this.zzbfj.add(com_google_android_gms_measurement_AppMeasurement_zzc);
    }

    protected void zza(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        final Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        final String str4 = str;
        final String str5 = str2;
        final long j2 = j;
        final boolean z4 = z;
        final boolean z5 = z2;
        final boolean z6 = z3;
        final String str6 = str3;
        zzFl().zzg(new Runnable(this) {
            final /* synthetic */ zzac i;

            public void run() {
                this.i.zzb(str4, str5, j2, bundle2, z4, z5, z6, str6);
            }
        });
    }

    void zza(String str, String str2, long j, Object obj) {
        final String str3 = str;
        final String str4 = str2;
        final Object obj2 = obj;
        final long j2 = j;
        zzFl().zzg(new Runnable(this) {
            final /* synthetic */ zzac e;

            public void run() {
                this.e.zza(str3, str4, obj2, j2);
            }
        });
    }

    public void zza(String str, String str2, Bundle bundle, boolean z) {
        zzlP();
        boolean z2 = this.zzbfi == null || zzal.zzfQ(str2);
        zza(str, str2, bundle, true, z2, z, null);
    }

    public List<UserAttributeParcel> zzaz(final boolean z) {
        zzlP();
        zzma();
        zzFm().zzFK().log("Fetching user attributes (FE)");
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzFm().zzFG().log("getUserProperties called from main thread.");
            return null;
        }
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (atomicReference) {
            this.zzbbl.zzFl().zzg(new Runnable(this) {
                final /* synthetic */ zzac c;

                public void run() {
                    this.c.zzFg().zza(atomicReference, z);
                }
            });
            try {
                atomicReference.wait(5000);
            } catch (InterruptedException e) {
                zzFm().zzFG().zzj("Interrupted waiting for get user properties", e);
            }
        }
        List<UserAttributeParcel> list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        zzFm().zzFG().log("Timed out waiting for get user properties");
        return null;
    }

    public void zzc(String str, String str2, Object obj) {
        zzaa.zzdl(str);
        long currentTimeMillis = zzlQ().currentTimeMillis();
        int zzfK = zzFi().zzfK(str2);
        if (zzfK != 0) {
            this.zzbbl.zzFi().zze(zzfK, "_ev", zzFi().zza(str2, zzFo().zzEx(), true));
        } else if (obj != null) {
            zzfK = zzFi().zzm(str2, obj);
            if (zzfK != 0) {
                this.zzbbl.zzFi().zze(zzfK, "_ev", zzFi().zza(str2, zzFo().zzEx(), true));
                return;
            }
            Object zzn = zzFi().zzn(str2, obj);
            if (zzn != null) {
                zza(str, str2, currentTimeMillis, zzn);
            }
        } else {
            zza(str, str2, currentTimeMillis, null);
        }
    }

    public void zzd(String str, String str2, Bundle bundle, long j) {
        zzlP();
        zza(str, str2, j, bundle, false, true, true, null);
    }

    public void zze(String str, String str2, Bundle bundle) {
        zzlP();
        boolean z = this.zzbfi == null || zzal.zzfQ(str2);
        zza(str, str2, bundle, true, z, false, null);
    }

    public void zzg(Class<?> cls) {
        try {
            cls.getDeclaredMethod("initialize", new Class[]{Context.class}).invoke(null, new Object[]{getContext()});
        } catch (Exception e) {
            zzFm().zzFG().zzj("Failed to invoke Tag Manager's initialize() method", e);
        }
    }

    public /* bridge */ /* synthetic */ void zzkN() {
        super.zzkN();
    }

    protected void zzkO() {
    }

    public /* bridge */ /* synthetic */ void zzlP() {
        super.zzlP();
    }

    public /* bridge */ /* synthetic */ zze zzlQ() {
        return super.zzlQ();
    }
}
