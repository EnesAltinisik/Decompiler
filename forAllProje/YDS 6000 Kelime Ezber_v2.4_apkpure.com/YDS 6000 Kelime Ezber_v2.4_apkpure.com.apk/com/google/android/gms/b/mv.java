package com.google.android.gms.b;

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
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.common.util.k;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(14)
@vz
public class mv extends Thread {
    private boolean a = false;
    private boolean b = false;
    private boolean c = false;
    private final Object d;
    private final ms e;
    private final vy f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final String o;

    @vz
    class a {
        final int a;
        final int b;

        a(mv mvVar, int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public mv(ms msVar, vy vyVar) {
        this.e = msVar;
        this.f = vyVar;
        this.d = new Object();
        this.h = ((Integer) pr.Z.c()).intValue();
        this.i = ((Integer) pr.aa.c()).intValue();
        this.j = ((Integer) pr.ab.c()).intValue();
        this.k = ((Integer) pr.ac.c()).intValue();
        this.l = ((Integer) pr.af.c()).intValue();
        this.m = ((Integer) pr.ah.c()).intValue();
        this.n = ((Integer) pr.ai.c()).intValue();
        this.g = ((Integer) pr.ad.c()).intValue();
        this.o = (String) pr.ak.c();
        setName("ContentFetchTask");
    }

    a a(View view, mr mrVar) {
        int i = 0;
        if (view == null) {
            return new a(this, 0, 0);
        }
        Context b = v.h().b();
        if (b != null) {
            String str = (String) view.getTag(b.getResources().getIdentifier((String) pr.aj.c(), "id", b.getPackageName()));
            if (!(TextUtils.isEmpty(this.o) || str == null || !str.equals(this.o))) {
                return new a(this, 0, 0);
            }
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new a(this, 0, 0);
            }
            mrVar.b(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new a(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof aaq)) {
            mrVar.g();
            return a((WebView) view, mrVar, globalVisibleRect) ? new a(this, 0, 1) : new a(this, 0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new a(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                a a = a(viewGroup.getChildAt(i3), mrVar);
                i2 += a.a;
                i += a.b;
            }
            return new a(this, i2, i);
        }
    }

    public void a() {
        synchronized (this.d) {
            if (this.a) {
                zy.b("Content hash thread already started, quiting...");
                return;
            }
            this.a = true;
            start();
        }
    }

    void a(Activity activity) {
        if (activity != null) {
            View view = null;
            try {
                if (!(activity.getWindow() == null || activity.getWindow().getDecorView() == null)) {
                    view = activity.getWindow().getDecorView().findViewById(16908290);
                }
            } catch (Throwable th) {
                zy.b("Failed getting root view of activity. Content not extracted.");
            }
            if (view != null) {
                a(view);
            }
        }
    }

    void a(mr mrVar, WebView webView, String str, boolean z) {
        mrVar.f();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (TextUtils.isEmpty(webView.getTitle())) {
                    mrVar.a(optString, z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                } else {
                    String valueOf = String.valueOf(webView.getTitle());
                    mrVar.a(new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(optString).length()).append(valueOf).append("\n").append(optString).toString(), z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                }
            }
            if (mrVar.a()) {
                this.e.b(mrVar);
            }
        } catch (JSONException e) {
            zy.b("Json string may be malformed.");
        } catch (Throwable th) {
            zy.a("Failed to get webview content.", th);
            this.f.a(th, "ContentFetchTask.processWebViewContent");
        }
    }

    boolean a(RunningAppProcessInfo runningAppProcessInfo) {
        return runningAppProcessInfo.importance == 100;
    }

    boolean a(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return powerManager == null ? false : powerManager.isScreenOn();
    }

    boolean a(final View view) {
        if (view == null) {
            return false;
        }
        view.post(new Runnable(this) {
            final /* synthetic */ mv b;

            public void run() {
                this.b.b(view);
            }
        });
        return true;
    }

    @TargetApi(19)
    boolean a(final WebView webView, final mr mrVar, final boolean z) {
        if (!k.g()) {
            return false;
        }
        mrVar.g();
        webView.post(new Runnable(this) {
            ValueCallback<String> a = new ValueCallback<String>(this) {
                final /* synthetic */ AnonymousClass2 a;

                {
                    this.a = r1;
                }

                public void a(String str) {
                    this.a.e.a(mrVar, webView, str, z);
                }

                public /* synthetic */ void onReceiveValue(Object obj) {
                    a((String) obj);
                }
            };
            final /* synthetic */ mv e;

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

    void b(View view) {
        try {
            mr mrVar = new mr(this.h, this.i, this.j, this.k, this.l, this.m, this.n);
            a a = a(view, mrVar);
            mrVar.h();
            if (a.a != 0 || a.b != 0) {
                if (a.b != 0 || mrVar.j() != 0) {
                    if (a.b != 0 || !this.e.a(mrVar)) {
                        this.e.c(mrVar);
                    }
                }
            }
        } catch (Throwable e) {
            zy.b("Exception in fetchContentOnUIThread", e);
            this.f.a(e, "ContentFetchTask.fetchContent");
        }
    }

    boolean b() {
        try {
            Context b = v.h().b();
            if (b == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) b.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) b.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null) {
                return false;
            }
            List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (a(runningAppProcessInfo) && !keyguardManager.inKeyguardRestrictedInputMode() && a(b)) {
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

    public mr c() {
        return this.e.a();
    }

    public void d() {
        synchronized (this.d) {
            this.b = false;
            this.d.notifyAll();
            zy.b("ContentFetchThread: wakeup");
        }
    }

    public void e() {
        synchronized (this.d) {
            this.b = true;
            zy.b("ContentFetchThread: paused, mPause = " + this.b);
        }
    }

    public boolean f() {
        return this.b;
    }

    public void run() {
        while (true) {
            try {
                if (b()) {
                    Activity a = v.h().a();
                    if (a == null) {
                        zy.b("ContentFetchThread: no activity. Sleeping.");
                        e();
                    } else {
                        a(a);
                    }
                } else {
                    zy.b("ContentFetchTask: sleeping");
                    e();
                }
                Thread.sleep((long) (this.g * 1000));
            } catch (Throwable e) {
                zy.b("Error in ContentFetchTask", e);
            } catch (Throwable e2) {
                zy.b("Error in ContentFetchTask", e2);
                this.f.a(e2, "ContentFetchTask.run");
            }
            synchronized (this.d) {
                while (this.b) {
                    try {
                        zy.b("ContentFetchTask: waiting");
                        this.d.wait();
                    } catch (InterruptedException e3) {
                    }
                }
            }
        }
    }
}
