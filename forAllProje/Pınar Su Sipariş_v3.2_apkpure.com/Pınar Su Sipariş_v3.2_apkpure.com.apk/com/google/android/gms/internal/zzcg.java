package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.util.zzs;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(14)
@zzig
public class zzcg extends Thread {
    private boolean mStarted = false;
    private boolean zzal = false;
    private final Object zzpp;
    private final int zztW;
    private final int zztY;
    private boolean zzuk = false;
    private final zzcf zzul;
    private final zzce zzum;
    private final zzif zzun;
    private final int zzuo;
    private final int zzup;
    private final int zzuq;

    @zzig
    class a {
        final int a;
        final int b;
        final /* synthetic */ zzcg c;

        a(zzcg com_google_android_gms_internal_zzcg, int i, int i2) {
            this.c = com_google_android_gms_internal_zzcg;
            this.a = i;
            this.b = i2;
        }
    }

    public zzcg(zzcf com_google_android_gms_internal_zzcf, zzce com_google_android_gms_internal_zzce, zzif com_google_android_gms_internal_zzif) {
        this.zzul = com_google_android_gms_internal_zzcf;
        this.zzum = com_google_android_gms_internal_zzce;
        this.zzun = com_google_android_gms_internal_zzif;
        this.zzpp = new Object();
        this.zztW = ((Integer) zzcu.zzxJ.get()).intValue();
        this.zzup = ((Integer) zzcu.zzxK.get()).intValue();
        this.zztY = ((Integer) zzcu.zzxL.get()).intValue();
        this.zzuq = ((Integer) zzcu.zzxM.get()).intValue();
        this.zzuo = ((Integer) zzcu.zzxN.get()).intValue();
        setName("ContentFetchTask");
    }

    public void run() {
        while (true) {
            try {
                if (zzdu()) {
                    Activity activity = this.zzul.getActivity();
                    if (activity == null) {
                        zzb.zzaU("ContentFetchThread: no activity. Sleeping.");
                        zzdw();
                    } else {
                        zza(activity);
                    }
                } else {
                    zzb.zzaU("ContentFetchTask: sleeping");
                    zzdw();
                }
                Thread.sleep((long) (this.zzuo * 1000));
            } catch (Throwable th) {
                zzb.zzb("Error in ContentFetchTask", th);
                this.zzun.zza(th, true);
            }
            synchronized (this.zzpp) {
                while (this.zzuk) {
                    try {
                        zzb.zzaU("ContentFetchTask: waiting");
                        this.zzpp.wait();
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }

    public void wakeup() {
        synchronized (this.zzpp) {
            this.zzuk = false;
            this.zzpp.notifyAll();
            zzb.zzaU("ContentFetchThread: wakeup");
        }
    }

    a zza(View view, zzcd com_google_android_gms_internal_zzcd) {
        int i = 0;
        if (view == null) {
            return new a(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new a(this, 0, 0);
            }
            com_google_android_gms_internal_zzcd.zze(text.toString(), globalVisibleRect);
            return new a(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof zzla)) {
            com_google_android_gms_internal_zzcd.zzdp();
            return zza((WebView) view, com_google_android_gms_internal_zzcd, globalVisibleRect) ? new a(this, 0, 1) : new a(this, 0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new a(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i2 = 0;
            int i3 = 0;
            while (i < viewGroup.getChildCount()) {
                a zza = zza(viewGroup.getChildAt(i), com_google_android_gms_internal_zzcd);
                i3 += zza.a;
                i2 += zza.b;
                i++;
            }
            return new a(this, i3, i2);
        }
    }

    void zza(Activity activity) {
        if (activity != null) {
            View view = null;
            if (!(activity.getWindow() == null || activity.getWindow().getDecorView() == null)) {
                view = activity.getWindow().getDecorView().findViewById(16908290);
            }
            if (view != null) {
                zze(view);
            }
        }
    }

    void zza(zzcd com_google_android_gms_internal_zzcd, WebView webView, String str, boolean z) {
        com_google_android_gms_internal_zzcd.zzdo();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (TextUtils.isEmpty(webView.getTitle())) {
                    com_google_android_gms_internal_zzcd.zzd(optString, z);
                } else {
                    String valueOf = String.valueOf(webView.getTitle());
                    com_google_android_gms_internal_zzcd.zzd(new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(optString).length()).append(valueOf).append("\n").append(optString).toString(), z);
                }
            }
            if (com_google_android_gms_internal_zzcd.zzdk()) {
                this.zzum.zzb(com_google_android_gms_internal_zzcd);
            }
        } catch (JSONException e) {
            zzb.zzaU("Json string may be malformed.");
        } catch (Throwable th) {
            zzb.zza("Failed to get webview content.", th);
            this.zzun.zza(th, true);
        }
    }

    boolean zza(RunningAppProcessInfo runningAppProcessInfo) {
        return runningAppProcessInfo.importance == 100;
    }

    @TargetApi(19)
    boolean zza(final WebView webView, final zzcd com_google_android_gms_internal_zzcd, final boolean z) {
        if (!zzs.zzve()) {
            return false;
        }
        com_google_android_gms_internal_zzcd.zzdp();
        webView.post(new Runnable(this) {
            ValueCallback<String> a = new ValueCallback<String>(this) {
                final /* synthetic */ AnonymousClass2 a;

                {
                    this.a = r1;
                }

                public void a(String str) {
                    this.a.e.zza(com_google_android_gms_internal_zzcd, webView, str, z);
                }

                public /* synthetic */ void onReceiveValue(Object obj) {
                    a((String) obj);
                }
            };
            final /* synthetic */ zzcg e;

            public void run() {
                if (webView.getSettings().getJavaScriptEnabled()) {
                    try {
                        webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.a);
                    } catch (Throwable th) {
                        this.a.onReceiveValue("");
                    }
                }
            }
        });
        return true;
    }

    public void zzdt() {
        synchronized (this.zzpp) {
            if (this.mStarted) {
                zzb.zzaU("Content hash thread already started, quiting...");
                return;
            }
            this.mStarted = true;
            start();
        }
    }

    boolean zzdu() {
        try {
            Context context = this.zzul.getContext();
            if (context == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null) {
                return false;
            }
            List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (zza(runningAppProcessInfo) && !keyguardManager.inKeyguardRestrictedInputMode() && zzj(context)) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    public zzcd zzdv() {
        return this.zzum.zzds();
    }

    public void zzdw() {
        synchronized (this.zzpp) {
            this.zzuk = true;
            zzb.zzaU("ContentFetchThread: paused, mPause = " + this.zzuk);
        }
    }

    public boolean zzdx() {
        return this.zzuk;
    }

    boolean zze(final View view) {
        if (view == null) {
            return false;
        }
        view.post(new Runnable(this) {
            final /* synthetic */ zzcg b;

            public void run() {
                this.b.zzf(view);
            }
        });
        return true;
    }

    void zzf(View view) {
        try {
            zzcd com_google_android_gms_internal_zzcd = new zzcd(this.zztW, this.zzup, this.zztY, this.zzuq);
            a zza = zza(view, com_google_android_gms_internal_zzcd);
            com_google_android_gms_internal_zzcd.zzdq();
            if (zza.a != 0 || zza.b != 0) {
                if (zza.b != 0 || com_google_android_gms_internal_zzcd.zzdr() != 0) {
                    if (zza.b != 0 || !this.zzum.zza(com_google_android_gms_internal_zzcd)) {
                        this.zzum.zzc(com_google_android_gms_internal_zzcd);
                    }
                }
            }
        } catch (Throwable e) {
            zzb.zzb("Exception in fetchContentOnUIThread", e);
            this.zzun.zza(e, true);
        }
    }

    boolean zzj(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return powerManager == null ? false : powerManager.isScreenOn();
    }
}
