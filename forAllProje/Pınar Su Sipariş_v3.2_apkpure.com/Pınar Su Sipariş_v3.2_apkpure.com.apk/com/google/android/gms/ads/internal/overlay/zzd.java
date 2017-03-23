package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzgz.zza;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzjv;
import com.google.android.gms.internal.zzka;
import com.google.android.gms.internal.zzkd;
import com.google.android.gms.internal.zzla;
import com.google.android.gms.internal.zzlb;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Future;

@zzig
public class zzd extends zza implements zzu {
    static final int zzHg = Color.argb(0, 0, 0, 0);
    private final Activity mActivity;
    zzla zzBb;
    AdOverlayInfoParcel zzHh;
    zzc zzHi;
    zzo zzHj;
    boolean zzHk = false;
    FrameLayout zzHl;
    CustomViewCallback zzHm;
    boolean zzHn = false;
    boolean zzHo = false;
    b zzHp;
    boolean zzHq = false;
    int zzHr = 0;
    zzl zzHs;
    private boolean zzHt;
    private boolean zzHu = false;
    private boolean zzHv = true;

    @zzig
    private static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    @zzig
    static class b extends RelativeLayout {
        zzkd a;
        boolean b;

        public b(Context context, String str) {
            super(context);
            this.a = new zzkd(context, str);
        }

        void a() {
            this.b = true;
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!this.b) {
                this.a.zze(motionEvent);
            }
            return false;
        }
    }

    @zzig
    private class c extends zzjv {
        final /* synthetic */ zzd a;

        private c(zzd com_google_android_gms_ads_internal_overlay_zzd) {
            this.a = com_google_android_gms_ads_internal_overlay_zzd;
        }

        public void onStop() {
        }

        public void zzbQ() {
            Bitmap zza = zzu.zzcB().zza(Integer.valueOf(this.a.zzHh.zzHO.zzrk));
            if (zza != null) {
                final Drawable zza2 = zzu.zzcm().zza(this.a.mActivity, zza, this.a.zzHh.zzHO.zzri, this.a.zzHh.zzHO.zzrj);
                zzka.zzQu.post(new Runnable(this) {
                    final /* synthetic */ c b;

                    public void run() {
                        this.b.a.mActivity.getWindow().setBackgroundDrawable(zza2);
                    }
                });
            }
        }
    }

    @zzig
    public static class zzc {
        public final int index;
        public final LayoutParams zzHy;
        public final ViewGroup zzHz;
        public final Context zzov;

        public zzc(zzla com_google_android_gms_internal_zzla) throws a {
            this.zzHy = com_google_android_gms_internal_zzla.getLayoutParams();
            ViewParent parent = com_google_android_gms_internal_zzla.getParent();
            this.zzov = com_google_android_gms_internal_zzla.zzjz();
            if (parent == null || !(parent instanceof ViewGroup)) {
                throw new a("Could not get the parent of the WebView for an overlay.");
            }
            this.zzHz = (ViewGroup) parent;
            this.index = this.zzHz.indexOfChild(com_google_android_gms_internal_zzla.getView());
            this.zzHz.removeView(com_google_android_gms_internal_zzla.getView());
            com_google_android_gms_internal_zzla.zzG(true);
        }
    }

    public zzd(Activity activity) {
        this.mActivity = activity;
        this.zzHs = new zzs();
    }

    public void close() {
        this.zzHr = 2;
        this.mActivity.finish();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onBackPressed() {
        this.zzHr = 0;
    }

    public void onCreate(Bundle bundle) {
        boolean z = false;
        this.mActivity.requestWindowFeature(1);
        if (bundle != null) {
            z = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        this.zzHn = z;
        try {
            this.zzHh = AdOverlayInfoParcel.zzb(this.mActivity.getIntent());
            if (this.zzHh == null) {
                throw new a("Could not get info for ad overlay.");
            }
            if (this.zzHh.zzsx.zzRD > 7500000) {
                this.zzHr = 3;
            }
            if (this.mActivity.getIntent() != null) {
                this.zzHv = this.mActivity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            if (this.zzHh.zzHO != null) {
                this.zzHo = this.zzHh.zzHO.zzrf;
            } else {
                this.zzHo = false;
            }
            if (((Boolean) zzcu.zzyZ.get()).booleanValue() && this.zzHo && this.zzHh.zzHO.zzrk != -1) {
                Future future = (Future) new c().zzhs();
            }
            if (bundle == null) {
                if (this.zzHh.zzHE != null && this.zzHv) {
                    this.zzHh.zzHE.zzbt();
                }
                if (!(this.zzHh.zzHL == 1 || this.zzHh.zzHD == null)) {
                    this.zzHh.zzHD.onAdClicked();
                }
            }
            this.zzHp = new b(this.mActivity, this.zzHh.zzHN);
            this.zzHp.setId(1000);
            switch (this.zzHh.zzHL) {
                case 1:
                    zzz(false);
                    return;
                case 2:
                    this.zzHi = new zzc(this.zzHh.zzHF);
                    zzz(false);
                    return;
                case 3:
                    zzz(true);
                    return;
                case 4:
                    if (this.zzHn) {
                        this.zzHr = 3;
                        this.mActivity.finish();
                        return;
                    } else if (!zzu.zzch().zza(this.mActivity, this.zzHh.zzHC, this.zzHh.zzHK)) {
                        this.zzHr = 3;
                        this.mActivity.finish();
                        return;
                    } else {
                        return;
                    }
                default:
                    throw new a("Could not determine ad overlay type.");
            }
        } catch (a e) {
            zzb.zzaW(e.getMessage());
            this.zzHr = 3;
            this.mActivity.finish();
        }
    }

    public void onDestroy() {
        if (this.zzBb != null) {
            this.zzHp.removeView(this.zzBb.getView());
        }
        zzgs();
    }

    public void onPause() {
        this.zzHs.pause();
        zzgo();
        if (this.zzHh.zzHE != null) {
            this.zzHh.zzHE.onPause();
        }
        if (this.zzBb != null && (!this.mActivity.isFinishing() || this.zzHi == null)) {
            zzu.zzcm().zzi(this.zzBb);
        }
        zzgs();
    }

    public void onRestart() {
    }

    public void onResume() {
        if (this.zzHh != null && this.zzHh.zzHL == 4) {
            if (this.zzHn) {
                this.zzHr = 3;
                this.mActivity.finish();
            } else {
                this.zzHn = true;
            }
        }
        if (this.zzHh.zzHE != null) {
            this.zzHh.zzHE.onResume();
        }
        if (this.zzBb == null || this.zzBb.isDestroyed()) {
            zzb.zzaW("The webview does not exit. Ignoring action.");
        } else {
            zzu.zzcm().zzj(this.zzBb);
        }
        this.zzHs.resume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzHn);
    }

    public void onStart() {
    }

    public void onStop() {
        zzgs();
    }

    public void setRequestedOrientation(int i) {
        this.mActivity.setRequestedOrientation(i);
    }

    protected void zzD(int i) {
        this.zzBb.zzD(i);
    }

    public void zza(View view, CustomViewCallback customViewCallback) {
        this.zzHl = new FrameLayout(this.mActivity);
        this.zzHl.setBackgroundColor(-16777216);
        this.zzHl.addView(view, -1, -1);
        this.mActivity.setContentView(this.zzHl);
        zzaW();
        this.zzHm = customViewCallback;
        this.zzHk = true;
    }

    public void zza(boolean z, boolean z2) {
        if (this.zzHj != null) {
            this.zzHj.zza(z, z2);
        }
    }

    public void zzaW() {
        this.zzHt = true;
    }

    public void zzf(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
        this.zzHs.zzf(com_google_android_gms_internal_zzla, map);
    }

    public void zzgo() {
        if (this.zzHh != null && this.zzHk) {
            setRequestedOrientation(this.zzHh.orientation);
        }
        if (this.zzHl != null) {
            this.mActivity.setContentView(this.zzHp);
            zzaW();
            this.zzHl.removeAllViews();
            this.zzHl = null;
        }
        if (this.zzHm != null) {
            this.zzHm.onCustomViewHidden();
            this.zzHm = null;
        }
        this.zzHk = false;
    }

    public void zzgp() {
        this.zzHr = 1;
        this.mActivity.finish();
    }

    public boolean zzgq() {
        boolean z = true;
        this.zzHr = 0;
        if (this.zzBb != null) {
            if (!(this.zzBb.zzgO() && this.zzHs.zzgO())) {
                z = false;
            }
            if (!z) {
                this.zzBb.zza("onbackblocked", Collections.emptyMap());
            }
        }
        return z;
    }

    public void zzgr() {
        this.zzHp.removeView(this.zzHj);
        zzy(true);
    }

    protected void zzgs() {
        if (this.mActivity.isFinishing() && !this.zzHu) {
            this.zzHu = true;
            if (this.zzBb != null) {
                zzD(this.zzHr);
                this.zzHp.removeView(this.zzBb.getView());
                if (this.zzHi != null) {
                    this.zzBb.setContext(this.zzHi.zzov);
                    this.zzBb.zzG(false);
                    this.zzHi.zzHz.addView(this.zzBb.getView(), this.zzHi.index, this.zzHi.zzHy);
                    this.zzHi = null;
                } else if (this.mActivity.getApplicationContext() != null) {
                    this.zzBb.setContext(this.mActivity.getApplicationContext());
                }
                this.zzBb = null;
            }
            if (!(this.zzHh == null || this.zzHh.zzHE == null)) {
                this.zzHh.zzHE.zzbs();
            }
            this.zzHs.destroy();
        }
    }

    public void zzgt() {
        if (this.zzHq) {
            this.zzHq = false;
            zzgu();
        }
    }

    protected void zzgu() {
        this.zzBb.zzgu();
    }

    public void zzgv() {
        this.zzHp.a();
    }

    public void zzy(boolean z) {
        this.zzHj = new zzo(this.mActivity, z ? 50 : 32, this);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        this.zzHj.zza(z, this.zzHh.zzHI);
        this.zzHp.addView(this.zzHj, layoutParams);
    }

    protected void zzz(boolean z) throws a {
        if (!this.zzHt) {
            this.mActivity.requestWindowFeature(1);
        }
        Window window = this.mActivity.getWindow();
        if (window == null) {
            throw new a("Invalid activity, no window available.");
        }
        if (!this.zzHo || (this.zzHh.zzHO != null && this.zzHh.zzHO.zzrg)) {
            window.setFlags(1024, 1024);
        }
        boolean zzdi = this.zzHh.zzHF.zzjD().zzdi();
        this.zzHq = false;
        if (zzdi) {
            if (this.zzHh.orientation == zzu.zzcm().zzje()) {
                this.zzHq = this.mActivity.getResources().getConfiguration().orientation == 1;
            } else if (this.zzHh.orientation == zzu.zzcm().zzjf()) {
                this.zzHq = this.mActivity.getResources().getConfiguration().orientation == 2;
            }
        }
        zzb.zzaU("Delay onShow to next orientation change: " + this.zzHq);
        setRequestedOrientation(this.zzHh.orientation);
        if (zzu.zzcm().zza(window)) {
            zzb.zzaU("Hardware acceleration on the AdActivity window enabled.");
        }
        if (this.zzHo) {
            this.zzHp.setBackgroundColor(zzHg);
        } else {
            this.zzHp.setBackgroundColor(-16777216);
        }
        this.mActivity.setContentView(this.zzHp);
        zzaW();
        if (z) {
            this.zzBb = zzu.zzcl().zza(this.mActivity, this.zzHh.zzHF.zzbi(), true, zzdi, null, this.zzHh.zzsx, null, null, this.zzHh.zzHF.zzjA());
            this.zzBb.zzjD().zza(null, null, this.zzHh.zzHG, this.zzHh.zzHK, true, this.zzHh.zzHM, null, this.zzHh.zzHF.zzjD().zzjR(), null, null);
            this.zzBb.zzjD().zza(new zzlb.zza(this) {
                final /* synthetic */ zzd a;

                {
                    this.a = r1;
                }

                public void zza(zzla com_google_android_gms_internal_zzla, boolean z) {
                    com_google_android_gms_internal_zzla.zzgu();
                }
            });
            if (this.zzHh.url != null) {
                this.zzBb.loadUrl(this.zzHh.url);
            } else if (this.zzHh.zzHJ != null) {
                this.zzBb.loadDataWithBaseURL(this.zzHh.zzHH, this.zzHh.zzHJ, "text/html", Constants.ENCODING, null);
            } else {
                throw new a("No URL or HTML to display in ad overlay.");
            }
            if (this.zzHh.zzHF != null) {
                this.zzHh.zzHF.zzc(this);
            }
        } else {
            this.zzBb = this.zzHh.zzHF;
            this.zzBb.setContext(this.mActivity);
        }
        this.zzBb.zzb(this);
        ViewParent parent = this.zzBb.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(this.zzBb.getView());
        }
        if (this.zzHo) {
            this.zzBb.setBackgroundColor(zzHg);
        }
        this.zzHp.addView(this.zzBb.getView(), -1, -1);
        if (!(z || this.zzHq)) {
            zzgu();
        }
        zzy(zzdi);
        if (this.zzBb.zzjE()) {
            zza(zzdi, true);
        }
        com.google.android.gms.ads.internal.zzd zzjA = this.zzBb.zzjA();
        zzm com_google_android_gms_ads_internal_overlay_zzm = zzjA != null ? zzjA.zzqo : null;
        if (com_google_android_gms_ads_internal_overlay_zzm != null) {
            this.zzHs = com_google_android_gms_ads_internal_overlay_zzm.zza(this.mActivity, this.zzBb, this.zzHp);
        } else {
            zzb.zzaW("Appstreaming controller is null.");
        }
    }
}
