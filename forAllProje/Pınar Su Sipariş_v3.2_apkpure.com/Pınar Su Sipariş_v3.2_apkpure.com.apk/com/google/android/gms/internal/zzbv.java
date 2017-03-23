package com.google.android.gms.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.zzh;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzig
public abstract class zzbv implements OnGlobalLayoutListener, OnScrollChangedListener {
    protected final Object zzpp = new Object();
    private boolean zzrF = false;
    private final zzeh zztA = new zzeh(this) {
        final /* synthetic */ zzbv a;

        {
            this.a = r1;
        }

        public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
            if (this.a.zzb((Map) map) && map.containsKey("isVisible")) {
                boolean z = "1".equals(map.get("isVisible")) || "true".equals(map.get("isVisible"));
                this.a.zzi(Boolean.valueOf(z).booleanValue());
            }
        }
    };
    private zzkk zztc;
    private final WeakReference<zzjn> zzti;
    private WeakReference<ViewTreeObserver> zztj;
    private final zzcc zztk;
    protected final zzbx zztl;
    private final Context zztm;
    private final WindowManager zztn;
    private final PowerManager zzto;
    private final KeyguardManager zztp;
    private zzbz zztq;
    private boolean zztr;
    private boolean zzts = false;
    private boolean zztt;
    private boolean zztu;
    private boolean zztv;
    BroadcastReceiver zztw;
    private final HashSet<zzbw> zztx = new HashSet();
    private final zzeh zzty = new zzeh(this) {
        final /* synthetic */ zzbv a;

        {
            this.a = r1;
        }

        public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
            if (this.a.zzb((Map) map)) {
                this.a.zza(com_google_android_gms_internal_zzla.getView(), (Map) map);
            }
        }
    };
    private final zzeh zztz = new zzeh(this) {
        final /* synthetic */ zzbv a;

        {
            this.a = r1;
        }

        public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
            if (this.a.zzb((Map) map)) {
                String str = "Received request to untrack: ";
                String valueOf = String.valueOf(this.a.zztl.zzdh());
                com.google.android.gms.ads.internal.util.client.zzb.zzaU(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                this.a.destroy();
            }
        }
    };

    public static class zza implements zzcc {
        private WeakReference<zzh> zztC;

        public zza(zzh com_google_android_gms_ads_internal_formats_zzh) {
            this.zztC = new WeakReference(com_google_android_gms_ads_internal_formats_zzh);
        }

        public View zzdb() {
            zzh com_google_android_gms_ads_internal_formats_zzh = (zzh) this.zztC.get();
            return com_google_android_gms_ads_internal_formats_zzh != null ? com_google_android_gms_ads_internal_formats_zzh.zzeV() : null;
        }

        public boolean zzdc() {
            return this.zztC.get() == null;
        }

        public zzcc zzdd() {
            return new zzb((zzh) this.zztC.get());
        }
    }

    public static class zzb implements zzcc {
        private zzh zztD;

        public zzb(zzh com_google_android_gms_ads_internal_formats_zzh) {
            this.zztD = com_google_android_gms_ads_internal_formats_zzh;
        }

        public View zzdb() {
            return this.zztD.zzeV();
        }

        public boolean zzdc() {
            return this.zztD == null;
        }

        public zzcc zzdd() {
            return this;
        }
    }

    public static class zzc implements zzcc {
        private final View mView;
        private final zzjn zztE;

        public zzc(View view, zzjn com_google_android_gms_internal_zzjn) {
            this.mView = view;
            this.zztE = com_google_android_gms_internal_zzjn;
        }

        public View zzdb() {
            return this.mView;
        }

        public boolean zzdc() {
            return this.zztE == null || this.mView == null;
        }

        public zzcc zzdd() {
            return this;
        }
    }

    public static class zzd implements zzcc {
        private final WeakReference<View> zztF;
        private final WeakReference<zzjn> zztG;

        public zzd(View view, zzjn com_google_android_gms_internal_zzjn) {
            this.zztF = new WeakReference(view);
            this.zztG = new WeakReference(com_google_android_gms_internal_zzjn);
        }

        public View zzdb() {
            return (View) this.zztF.get();
        }

        public boolean zzdc() {
            return this.zztF.get() == null || this.zztG.get() == null;
        }

        public zzcc zzdd() {
            return new zzc((View) this.zztF.get(), (zzjn) this.zztG.get());
        }
    }

    public zzbv(Context context, AdSizeParcel adSizeParcel, zzjn com_google_android_gms_internal_zzjn, VersionInfoParcel versionInfoParcel, zzcc com_google_android_gms_internal_zzcc) {
        this.zzti = new WeakReference(com_google_android_gms_internal_zzjn);
        this.zztk = com_google_android_gms_internal_zzcc;
        this.zztj = new WeakReference(null);
        this.zztt = true;
        this.zztv = false;
        this.zztc = new zzkk(200);
        this.zztl = new zzbx(UUID.randomUUID().toString(), versionInfoParcel, adSizeParcel.zzvs, com_google_android_gms_internal_zzjn.zzOW, com_google_android_gms_internal_zzjn.zzdi(), adSizeParcel.zzvv);
        this.zztn = (WindowManager) context.getSystemService("window");
        this.zzto = (PowerManager) context.getApplicationContext().getSystemService("power");
        this.zztp = (KeyguardManager) context.getSystemService("keyguard");
        this.zztm = context;
    }

    protected void destroy() {
        synchronized (this.zzpp) {
            zzcW();
            zzcR();
            this.zztt = false;
            zzcT();
        }
    }

    boolean isScreenOn() {
        return this.zzto.isScreenOn();
    }

    public void onGlobalLayout() {
        zzi(2);
    }

    public void onScrollChanged() {
        zzi(1);
    }

    public void pause() {
        synchronized (this.zzpp) {
            this.zzrF = true;
            zzi(3);
        }
    }

    public void resume() {
        synchronized (this.zzpp) {
            this.zzrF = false;
            zzi(3);
        }
    }

    public void stop() {
        synchronized (this.zzpp) {
            this.zzts = true;
            zzi(3);
        }
    }

    protected int zza(int i, DisplayMetrics displayMetrics) {
        return (int) (((float) i) / displayMetrics.density);
    }

    protected void zza(View view, Map<String, String> map) {
        zzi(3);
    }

    public void zza(zzbw com_google_android_gms_internal_zzbw) {
        this.zztx.add(com_google_android_gms_internal_zzbw);
    }

    public void zza(zzbz com_google_android_gms_internal_zzbz) {
        synchronized (this.zzpp) {
            this.zztq = com_google_android_gms_internal_zzbz;
        }
    }

    protected void zza(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONArray.put(jSONObject);
            jSONObject2.put("units", jSONArray);
            zzb(jSONObject2);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Skipping active view message.", th);
        }
    }

    protected abstract void zzb(JSONObject jSONObject);

    protected boolean zzb(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        boolean z = !TextUtils.isEmpty(str) && str.equals(this.zztl.zzdh());
        return z;
    }

    protected void zzc(zzfk com_google_android_gms_internal_zzfk) {
        com_google_android_gms_internal_zzfk.zza("/updateActiveView", this.zzty);
        com_google_android_gms_internal_zzfk.zza("/untrackActiveViewUnit", this.zztz);
        com_google_android_gms_internal_zzfk.zza("/visibilityChanged", this.zztA);
    }

    protected void zzcQ() {
        synchronized (this.zzpp) {
            if (this.zztw != null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            this.zztw = new BroadcastReceiver(this) {
                final /* synthetic */ zzbv a;

                {
                    this.a = r1;
                }

                public void onReceive(Context context, Intent intent) {
                    this.a.zzi(3);
                }
            };
            this.zztm.registerReceiver(this.zztw, intentFilter);
        }
    }

    protected void zzcR() {
        synchronized (this.zzpp) {
            if (this.zztw != null) {
                try {
                    this.zztm.unregisterReceiver(this.zztw);
                } catch (Throwable e) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzb("Failed trying to unregister the receiver", e);
                } catch (Throwable e2) {
                    zzu.zzcn().zzb(e2, true);
                }
                this.zztw = null;
            }
        }
    }

    public void zzcS() {
        synchronized (this.zzpp) {
            if (this.zztt) {
                this.zztu = true;
                try {
                    zza(zzda());
                } catch (Throwable e) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzb("JSON failure while processing active view data.", e);
                } catch (Throwable e2) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzb("Failure while processing active view data.", e2);
                }
                String str = "Untracking ad unit: ";
                String valueOf = String.valueOf(this.zztl.zzdh());
                com.google.android.gms.ads.internal.util.client.zzb.zzaU(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
    }

    protected void zzcT() {
        if (this.zztq != null) {
            this.zztq.zza(this);
        }
    }

    public boolean zzcU() {
        boolean z;
        synchronized (this.zzpp) {
            z = this.zztt;
        }
        return z;
    }

    protected void zzcV() {
        View zzdb = this.zztk.zzdd().zzdb();
        if (zzdb != null) {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.zztj.get();
            ViewTreeObserver viewTreeObserver2 = zzdb.getViewTreeObserver();
            if (viewTreeObserver2 != viewTreeObserver) {
                zzcW();
                if (!this.zztr || (viewTreeObserver != null && viewTreeObserver.isAlive())) {
                    this.zztr = true;
                    viewTreeObserver2.addOnScrollChangedListener(this);
                    viewTreeObserver2.addOnGlobalLayoutListener(this);
                }
                this.zztj = new WeakReference(viewTreeObserver2);
            }
        }
    }

    protected void zzcW() {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.zztj.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.removeGlobalOnLayoutListener(this);
        }
    }

    protected JSONObject zzcX() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("afmaVersion", this.zztl.zzdf()).put("activeViewJSON", this.zztl.zzdg()).put("timestamp", zzu.zzco().elapsedRealtime()).put("adFormat", this.zztl.zzde()).put("hashCode", this.zztl.zzdh()).put("isMraid", this.zztl.zzdi()).put("isStopped", this.zzts).put("isPaused", this.zzrF).put("isScreenOn", isScreenOn()).put("isNative", this.zztl.zzdj());
        return jSONObject;
    }

    protected abstract boolean zzcY();

    protected JSONObject zzcZ() throws JSONException {
        return zzcX().put("isAttachedToWindow", false).put("isScreenOn", isScreenOn()).put("isVisible", false);
    }

    protected JSONObject zzd(View view) throws JSONException {
        if (view == null) {
            return zzcZ();
        }
        boolean isAttachedToWindow = zzu.zzcm().isAttachedToWindow(view);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        try {
            view.getLocationOnScreen(iArr);
            view.getLocationInWindow(iArr2);
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Failure getting view location.", e);
        }
        DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect2 = new Rect();
        rect2.right = this.zztn.getDefaultDisplay().getWidth();
        rect2.bottom = this.zztn.getDefaultDisplay().getHeight();
        Rect rect3 = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect3, null);
        Rect rect4 = new Rect();
        boolean localVisibleRect = view.getLocalVisibleRect(rect4);
        Rect rect5 = new Rect();
        view.getHitRect(rect5);
        JSONObject zzcX = zzcX();
        zzcX.put("windowVisibility", view.getWindowVisibility()).put("isAttachedToWindow", isAttachedToWindow).put("viewBox", new JSONObject().put("top", zza(rect2.top, displayMetrics)).put("bottom", zza(rect2.bottom, displayMetrics)).put("left", zza(rect2.left, displayMetrics)).put("right", zza(rect2.right, displayMetrics))).put("adBox", new JSONObject().put("top", zza(rect.top, displayMetrics)).put("bottom", zza(rect.bottom, displayMetrics)).put("left", zza(rect.left, displayMetrics)).put("right", zza(rect.right, displayMetrics))).put("globalVisibleBox", new JSONObject().put("top", zza(rect3.top, displayMetrics)).put("bottom", zza(rect3.bottom, displayMetrics)).put("left", zza(rect3.left, displayMetrics)).put("right", zza(rect3.right, displayMetrics))).put("globalVisibleBoxVisible", globalVisibleRect).put("localVisibleBox", new JSONObject().put("top", zza(rect4.top, displayMetrics)).put("bottom", zza(rect4.bottom, displayMetrics)).put("left", zza(rect4.left, displayMetrics)).put("right", zza(rect4.right, displayMetrics))).put("localVisibleBoxVisible", localVisibleRect).put("hitBox", new JSONObject().put("top", zza(rect5.top, displayMetrics)).put("bottom", zza(rect5.bottom, displayMetrics)).put("left", zza(rect5.left, displayMetrics)).put("right", zza(rect5.right, displayMetrics))).put("screenDensity", (double) displayMetrics.density).put("isVisible", zzu.zzck().zza(view, this.zzto, this.zztp));
        return zzcX;
    }

    protected void zzd(zzfk com_google_android_gms_internal_zzfk) {
        com_google_android_gms_internal_zzfk.zzb("/visibilityChanged", this.zztA);
        com_google_android_gms_internal_zzfk.zzb("/untrackActiveViewUnit", this.zztz);
        com_google_android_gms_internal_zzfk.zzb("/updateActiveView", this.zzty);
    }

    protected JSONObject zzda() throws JSONException {
        JSONObject zzcX = zzcX();
        zzcX.put("doneReasonCode", "u");
        return zzcX;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void zzi(int r8) {
        /*
        r7 = this;
        r0 = 0;
        r1 = 1;
        r3 = r7.zzpp;
        monitor-enter(r3);
        r2 = r7.zzcY();	 Catch:{ all -> 0x0043 }
        if (r2 == 0) goto L_0x000f;
    L_0x000b:
        r2 = r7.zztt;	 Catch:{ all -> 0x0043 }
        if (r2 != 0) goto L_0x0011;
    L_0x000f:
        monitor-exit(r3);	 Catch:{ all -> 0x0043 }
    L_0x0010:
        return;
    L_0x0011:
        r2 = r7.zztk;	 Catch:{ all -> 0x0043 }
        r4 = r2.zzdb();	 Catch:{ all -> 0x0043 }
        if (r4 == 0) goto L_0x0046;
    L_0x0019:
        r2 = com.google.android.gms.ads.internal.zzu.zzck();	 Catch:{ all -> 0x0043 }
        r5 = r7.zzto;	 Catch:{ all -> 0x0043 }
        r6 = r7.zztp;	 Catch:{ all -> 0x0043 }
        r2 = r2.zza(r4, r5, r6);	 Catch:{ all -> 0x0043 }
        if (r2 == 0) goto L_0x0046;
    L_0x0027:
        r2 = new android.graphics.Rect;	 Catch:{ all -> 0x0043 }
        r2.<init>();	 Catch:{ all -> 0x0043 }
        r5 = 0;
        r2 = r4.getGlobalVisibleRect(r2, r5);	 Catch:{ all -> 0x0043 }
        if (r2 == 0) goto L_0x0046;
    L_0x0033:
        r2 = r1;
    L_0x0034:
        r7.zztv = r2;	 Catch:{ all -> 0x0043 }
        r5 = r7.zztk;	 Catch:{ all -> 0x0043 }
        r5 = r5.zzdc();	 Catch:{ all -> 0x0043 }
        if (r5 == 0) goto L_0x0048;
    L_0x003e:
        r7.zzcS();	 Catch:{ all -> 0x0043 }
        monitor-exit(r3);	 Catch:{ all -> 0x0043 }
        goto L_0x0010;
    L_0x0043:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0043 }
        throw r0;
    L_0x0046:
        r2 = r0;
        goto L_0x0034;
    L_0x0048:
        if (r8 != r1) goto L_0x004b;
    L_0x004a:
        r0 = r1;
    L_0x004b:
        if (r0 == 0) goto L_0x005b;
    L_0x004d:
        r0 = r7.zztc;	 Catch:{ all -> 0x0043 }
        r0 = r0.tryAcquire();	 Catch:{ all -> 0x0043 }
        if (r0 != 0) goto L_0x005b;
    L_0x0055:
        r0 = r7.zztv;	 Catch:{ all -> 0x0043 }
        if (r2 != r0) goto L_0x005b;
    L_0x0059:
        monitor-exit(r3);	 Catch:{ all -> 0x0043 }
        goto L_0x0010;
    L_0x005b:
        if (r2 != 0) goto L_0x0065;
    L_0x005d:
        r0 = r7.zztv;	 Catch:{ all -> 0x0043 }
        if (r0 != 0) goto L_0x0065;
    L_0x0061:
        if (r8 != r1) goto L_0x0065;
    L_0x0063:
        monitor-exit(r3);	 Catch:{ all -> 0x0043 }
        goto L_0x0010;
    L_0x0065:
        r0 = r7.zzd(r4);	 Catch:{ JSONException -> 0x007b, RuntimeException -> 0x0074 }
        r7.zza(r0);	 Catch:{ JSONException -> 0x007b, RuntimeException -> 0x0074 }
    L_0x006c:
        r7.zzcV();	 Catch:{ all -> 0x0043 }
        r7.zzcT();	 Catch:{ all -> 0x0043 }
        monitor-exit(r3);	 Catch:{ all -> 0x0043 }
        goto L_0x0010;
    L_0x0074:
        r0 = move-exception;
    L_0x0075:
        r1 = "Active view update failed.";
        com.google.android.gms.ads.internal.util.client.zzb.zza(r1, r0);	 Catch:{ all -> 0x0043 }
        goto L_0x006c;
    L_0x007b:
        r0 = move-exception;
        goto L_0x0075;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzbv.zzi(int):void");
    }

    protected void zzi(boolean z) {
        Iterator it = this.zztx.iterator();
        while (it.hasNext()) {
            ((zzbw) it.next()).zza(this, z);
        }
    }
}
