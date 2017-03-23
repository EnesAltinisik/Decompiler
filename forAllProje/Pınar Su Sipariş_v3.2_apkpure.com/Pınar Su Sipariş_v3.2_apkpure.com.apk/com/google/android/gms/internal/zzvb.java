package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Service;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.tagmanager.TagManagerService;
import com.google.android.gms.tagmanager.zzax;
import com.google.android.gms.tagmanager.zzba;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzvb {
    private static zzc zzbtJ = new zzc() {
        public zzvb zzb(Context context, zzba com_google_android_gms_tagmanager_zzba, zzax com_google_android_gms_tagmanager_zzax) {
            return new zzvb(context, com_google_android_gms_tagmanager_zzba, com_google_android_gms_tagmanager_zzax, new zzve(context), aw.a(), aw.b(), zzus.zzLi(), new zza(context));
        }
    };
    private static final Pattern zzbty = Pattern.compile("(gtm-[a-z0-9]{1,10})\\.json", 2);
    private static volatile zzvb zzbtz;
    private final Context mContext;
    private String zzbnR;
    private final ExecutorService zzbsj;
    private final zzba zzbsk;
    private final zzax zzbsq;
    private final zzve zzbtA;
    private final ScheduledExecutorService zzbtB;
    private final zzus zzbtC;
    private final zza zzbtD;
    private final Object zzbtE = new Object();
    private String zzbtF;
    private int zzbtG = 1;
    private final Queue<Runnable> zzbtH = new LinkedList();
    private volatile boolean zzbtI = false;
    private volatile boolean zzru = false;

    public interface zzc {
        zzvb zzb(Context context, zzba com_google_android_gms_tagmanager_zzba, zzax com_google_android_gms_tagmanager_zzax);
    }

    private class a extends com.google.android.gms.internal.zzul.zza {
        final /* synthetic */ zzvb a;

        private a(zzvb com_google_android_gms_internal_zzvb) {
            this.a = com_google_android_gms_internal_zzvb;
        }

        public void zza(final boolean z, final String str) throws RemoteException {
            this.a.zzbsj.submit(new Runnable(this) {
                final /* synthetic */ a c;

                public void run() {
                    if (this.c.a.zzbtG == 2) {
                        String str;
                        if (z) {
                            this.c.a.zzbtG = 3;
                            str = str;
                            zzun.v(new StringBuilder(String.valueOf(str).length() + 18).append("Container ").append(str).append(" loaded.").toString());
                        } else {
                            this.c.a.zzbtG = 4;
                            String str2 = "Error loading container:";
                            str = String.valueOf(str);
                            zzun.e(str.length() != 0 ? str2.concat(str) : new String(str2));
                        }
                        while (!this.c.a.zzbtH.isEmpty()) {
                            this.c.a.zzbsj.submit((Runnable) this.c.a.zzbtH.remove());
                        }
                        return;
                    }
                    zzun.zzaW("Container load callback completed after timeout");
                }
            });
        }
    }

    protected static class zza {
        private final Context mContext;

        public zza(Context context) {
            this.mContext = context;
        }

        public String[] zzhd(String str) throws IOException {
            return this.mContext.getAssets().list(str);
        }
    }

    zzvb(Context context, zzba com_google_android_gms_tagmanager_zzba, zzax com_google_android_gms_tagmanager_zzax, zzve com_google_android_gms_internal_zzve, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, zzus com_google_android_gms_internal_zzus, zza com_google_android_gms_internal_zzvb_zza) {
        zzaa.zzz(context);
        zzaa.zzz(com_google_android_gms_tagmanager_zzba);
        this.mContext = context;
        this.zzbsk = com_google_android_gms_tagmanager_zzba;
        this.zzbsq = com_google_android_gms_tagmanager_zzax;
        this.zzbtA = com_google_android_gms_internal_zzve;
        this.zzbsj = executorService;
        this.zzbtB = scheduledExecutorService;
        this.zzbtC = com_google_android_gms_internal_zzus;
        this.zzbtD = com_google_android_gms_internal_zzvb_zza;
        if (!this.zzbtC.isPreview()) {
            zzun.zzLc();
        }
        zzKH();
    }

    @TargetApi(14)
    private void zzKH() {
        if (VERSION.SDK_INT >= 14) {
            this.mContext.registerComponentCallbacks(new ComponentCallbacks2(this) {
                final /* synthetic */ zzvb a;

                {
                    this.a = r1;
                }

                public void onConfigurationChanged(Configuration configuration) {
                }

                public void onLowMemory() {
                }

                public void onTrimMemory(int i) {
                    if (i == 20) {
                        zzun.v("App's UI deactivated. Dispatching hits.");
                        this.a.zzbtA.dispatch();
                    }
                }
            });
        }
    }

    private zza zzLv() {
        return this.zzbtD;
    }

    private void zzLw() {
        try {
            this.zzbsk.zza(new com.google.android.gms.tagmanager.zzaz.zza(this) {
                final /* synthetic */ zzvb a;

                {
                    this.a = r1;
                }

                public void zzb(String str, String str2, Bundle bundle, long j) throws RemoteException {
                    final String stringBuilder = new StringBuilder(String.valueOf(str).length() + 4).append(str).append("+").append("gtm").toString();
                    final String str3 = str2;
                    final Bundle bundle2 = bundle;
                    final long j2 = j;
                    final String str4 = str;
                    this.a.zzbsj.submit(new Runnable(this) {
                        final /* synthetic */ AnonymousClass2 f;
                        private boolean g = false;

                        public void run() {
                            if (this.f.a.zzbtG == 3) {
                                this.f.a.zzbtA.zza(str3, bundle2, stringBuilder, j2, true);
                            } else if (this.f.a.zzbtG == 4) {
                                zzun.v(String.format("Container failed to load: skipping  event interceptor by logging event back to Firebase directly: name = %s, origin = %s, params = %s.", new Object[]{str3, stringBuilder, bundle2}));
                                try {
                                    this.f.a.zzbsk.zza(stringBuilder, str3, bundle2, j2);
                                } catch (RemoteException e) {
                                    String str = "Error logging event on measurement proxy";
                                    String valueOf = String.valueOf(e.getMessage());
                                    zzun.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                                }
                            } else if (this.f.a.zzbtG != 1 && this.f.a.zzbtG != 2) {
                                zzun.zzaW("Unexpected state:" + this.f.a.zzbtG);
                            } else if (this.g) {
                                zzun.zzaW("Invalid state - not expecting to see a deferred eventduring container loading.");
                            } else {
                                zzun.v(String.format("Container not loaded yet: deferring event interceptor by enqueuing the event: name = %s, origin = %s, params = %s.", new Object[]{str3, str4, bundle2}));
                                this.g = true;
                                this.f.a.zzbtH.add(this);
                            }
                        }
                    });
                }
            });
        } catch (RemoteException e) {
            String str = "Error communicating with measurement proxy:";
            String valueOf = String.valueOf(e.getMessage());
            zzun.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        try {
            this.zzbsk.zza(new com.google.android.gms.tagmanager.zzay.zza(this) {
                final /* synthetic */ zzvb a;

                {
                    this.a = r1;
                }

                public void zzc(String str, String str2, Bundle bundle, long j) {
                    if (!str.endsWith("+gtm")) {
                        final String stringBuilder = new StringBuilder(String.valueOf(str).length() + 4).append(str).append("+").append("gtm").toString();
                        final String str3 = str2;
                        final Bundle bundle2 = bundle;
                        final long j2 = j;
                        final String str4 = str;
                        this.a.zzbsj.submit(new Runnable(this) {
                            final /* synthetic */ AnonymousClass3 f;
                            private boolean g = false;

                            public void run() {
                                if (this.f.a.zzbtG == 3) {
                                    this.f.a.zzbtA.zza(str3, bundle2, stringBuilder, j2, false);
                                } else if (this.f.a.zzbtG == 1 || this.f.a.zzbtG == 2) {
                                    if (this.g) {
                                        zzun.zzaW("Invalid state - not expecting to see a deferred event during container loading.");
                                        return;
                                    }
                                    zzun.v(String.format("Container not loaded yet: deferring event listener by enqueuing the event: name = %s, origin = %s, params = %s.", new Object[]{str3, str4, bundle2}));
                                    this.g = true;
                                    this.f.a.zzbtH.add(this);
                                } else if (this.f.a.zzbtG == 4) {
                                    zzun.v(String.format("Container failed to load: skipping event listener by ignoring the event: name = %s, origin = %s, params = %s.", new Object[]{str3, str4, bundle2}));
                                } else {
                                    zzun.zzaW("Unexpected state:" + this.f.a.zzbtG);
                                }
                            }
                        });
                    }
                }
            });
        } catch (RemoteException e2) {
            str = "Error communicating with measurement proxy:";
            valueOf = String.valueOf(e2.getMessage());
            zzun.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    public static zzvb zza(Context context, zzba com_google_android_gms_tagmanager_zzba, zzax com_google_android_gms_tagmanager_zzax) {
        zzaa.zzz(context);
        zzaa.zzz(context);
        zzvb com_google_android_gms_internal_zzvb = zzbtz;
        if (com_google_android_gms_internal_zzvb == null) {
            synchronized (zzvb.class) {
                com_google_android_gms_internal_zzvb = zzbtz;
                if (com_google_android_gms_internal_zzvb == null) {
                    com_google_android_gms_internal_zzvb = zzbtJ.zzb(context, com_google_android_gms_tagmanager_zzba, com_google_android_gms_tagmanager_zzax);
                    zzbtz = com_google_android_gms_internal_zzvb;
                }
            }
        }
        return com_google_android_gms_internal_zzvb;
    }

    private static boolean zzb(Context context, Class<? extends Service> cls) {
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, cls), 4);
            if (serviceInfo != null && serviceInfo.enabled) {
                return true;
            }
        } catch (NameNotFoundException e) {
        }
        return false;
    }

    private Pair<String, String> zzj(String[] strArr) {
        zzun.v("Looking up container asset.");
        if (this.zzbnR != null && this.zzbtF != null) {
            return Pair.create(this.zzbnR, this.zzbtF);
        }
        if (strArr == null) {
            try {
                strArr = zzLv().zzhd("containers");
            } catch (Throwable e) {
                zzun.zzb(String.format("Failed to enumerate assets in folder %s", new Object[]{"containers"}), e);
                return Pair.create(null, null);
            }
        }
        int i = 0;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            Matcher matcher = zzbty.matcher(strArr[i2]);
            if (!matcher.matches()) {
                zzun.zzaW(String.format("Ignoring container asset %s (does not match %s)", new Object[]{strArr[i2], zzbty.pattern()}));
            } else if (i == 0) {
                this.zzbnR = matcher.group(1);
                String valueOf = String.valueOf("containers");
                r3 = String.valueOf(File.separator);
                r5 = String.valueOf(strArr[i2]);
                this.zzbtF = new StringBuilder(((String.valueOf(valueOf).length() + 0) + String.valueOf(r3).length()) + String.valueOf(r5).length()).append(valueOf).append(r3).append(r5).toString();
                r3 = "Asset found for container ";
                valueOf = String.valueOf(this.zzbnR);
                zzun.v(valueOf.length() != 0 ? r3.concat(valueOf) : new String(r3));
                i = 1;
            } else {
                r5 = "Extra container asset found, will not be loaded:";
                r3 = String.valueOf(strArr[i2]);
                zzun.e(r3.length() != 0 ? r5.concat(r3) : new String(r5));
            }
        }
        return Pair.create(this.zzbnR, this.zzbtF);
    }

    public void initialize() {
        zzi(null);
    }

    public void zzaf(String str, String str2) {
        zzo(str, str2, null);
    }

    public void zzi(String[] strArr) {
        zzun.v("Initializing Tag Manager.");
        synchronized (this.zzbtE) {
            if (this.zzru) {
                return;
            }
            try {
                if (zzb(this.mContext, TagManagerService.class)) {
                    Pair zzj = zzj(strArr);
                    String str = (String) zzj.first;
                    String str2 = (String) zzj.second;
                    if (str == null || str2 == null) {
                        zzun.zzaW("Tag Manager's event handler WILL NOT be installed (no container loaded)");
                    } else {
                        String str3 = "Loading container ";
                        String valueOf = String.valueOf(str);
                        zzun.zzaV(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                        zzaf(str, str2);
                        if (!this.zzbtI) {
                            zzun.zzaV("Installing Tag Manager event handler.");
                            this.zzbtI = true;
                            zzLw();
                            zzun.zzaV("Tag Manager event handler installed.");
                        }
                    }
                    this.zzru = true;
                    return;
                }
                boolean z = "Tag Manager fails to initialize (TagManagerService not enabled in the manifest)";
                zzun.zzaW(z);
                this.zzru = z;
            } finally {
                this.zzru = true;
            }
        }
    }

    public void zzo(final String str, final String str2, final String str3) {
        this.zzbsj.submit(new Runnable(this) {
            final /* synthetic */ zzvb d;

            public void run() {
                String str = str;
                zzun.v(new StringBuilder(String.valueOf(str).length() + 28).append("Starting to load container ").append(str).append(".").toString());
                if (this.d.zzbtG != 1) {
                    zzun.zzaW("Unexpected state - container loading already initiated.");
                    return;
                }
                this.d.zzbtG = 2;
                this.d.zzbtA.zzb(str, str2, str3, new a());
            }
        });
        this.zzbtB.schedule(new Runnable(this) {
            final /* synthetic */ zzvb a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.zzbsj.submit(new Runnable(this) {
                    final /* synthetic */ AnonymousClass5 a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        if (this.a.a.zzbtG == 1 || this.a.a.zzbtG == 2) {
                            this.a.a.zzbtG = 4;
                            zzun.e("Container load timed out after 5000ms.");
                            while (!this.a.a.zzbtH.isEmpty()) {
                                this.a.a.zzbsj.submit((Runnable) this.a.a.zzbtH.remove());
                            }
                        }
                    }
                });
            }
        }, 5000, TimeUnit.MILLISECONDS);
    }

    void zzt(final Uri uri) {
        this.zzbsj.submit(new Runnable(this) {
            final /* synthetic */ zzvb b;

            public void run() {
                String valueOf = String.valueOf(uri);
                zzun.v(new StringBuilder(String.valueOf(valueOf).length() + 25).append("Preview requested to uri ").append(valueOf).toString());
                synchronized (this.b.zzbtE) {
                    if (this.b.zzbtG == 2) {
                        zzun.v("Still initializing. Defer preview container loading.");
                        this.b.zzbtH.add(this);
                        return;
                    }
                    valueOf = (String) this.b.zzj(null).first;
                    if (valueOf == null) {
                        zzun.zzaW("Preview failed (no container found)");
                    } else if (!this.b.zzbtC.zzc(valueOf, uri)) {
                        valueOf = String.valueOf(uri);
                        zzun.zzaW(new StringBuilder(String.valueOf(valueOf).length() + 73).append("Cannot preview the app with the uri: ").append(valueOf).append(". Launching current version instead.").toString());
                    } else if (this.b.zzru) {
                        valueOf = String.valueOf(uri);
                        zzun.zzaV(new StringBuilder(String.valueOf(valueOf).length() + 36).append("Starting to load preview container: ").append(valueOf).toString());
                        if (this.b.zzbtA.zzLC()) {
                            this.b.zzru = false;
                            this.b.zzbtG = 1;
                            this.b.initialize();
                            return;
                        }
                        zzun.zzaW("Failed to reset TagManager service for preview");
                    } else {
                        valueOf = String.valueOf(uri);
                        zzun.v(new StringBuilder(String.valueOf(valueOf).length() + 81).append("Deferring container loading for preview uri").append(valueOf).append("(Tag Manager has not been initialized.").toString());
                    }
                }
            }
        });
    }
}
