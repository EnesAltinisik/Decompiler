package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.support.v4.h.j;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ViewSwitcher;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.purchase.zzk;
import com.google.android.gms.ads.internal.reward.client.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzaq;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzdg;
import com.google.android.gms.internal.zzdt;
import com.google.android.gms.internal.zzdu;
import com.google.android.gms.internal.zzdv;
import com.google.android.gms.internal.zzdw;
import com.google.android.gms.internal.zzhh;
import com.google.android.gms.internal.zzhl;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzjo;
import com.google.android.gms.internal.zzjt;
import com.google.android.gms.internal.zzjv;
import com.google.android.gms.internal.zzjw;
import com.google.android.gms.internal.zzkc;
import com.google.android.gms.internal.zzkd;
import com.google.android.gms.internal.zzkk;
import com.google.android.gms.internal.zzkn;
import com.google.android.gms.internal.zzla;
import com.google.android.gms.internal.zzlb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

@zzig
public final class zzv implements OnGlobalLayoutListener, OnScrollChangedListener {
    public final Context zzov;
    boolean zzrf;
    public zzkc zzsA;
    public AdSizeParcel zzsB;
    public zzjn zzsC;
    public com.google.android.gms.internal.zzjn.zza zzsD;
    public zzjo zzsE;
    zzp zzsF;
    zzq zzsG;
    zzw zzsH;
    zzy zzsI;
    zzhh zzsJ;
    zzhl zzsK;
    zzdt zzsL;
    zzdu zzsM;
    j<String, zzdv> zzsN;
    j<String, zzdw> zzsO;
    NativeAdOptionsParcel zzsP;
    VideoOptionsParcel zzsQ;
    zzdg zzsR;
    zzd zzsS;
    List<String> zzsT;
    zzk zzsU;
    public zzjt zzsV;
    View zzsW;
    public int zzsX;
    boolean zzsY;
    private HashSet<zzjo> zzsZ;
    final String zzsu;
    public String zzsv;
    final zzaq zzsw;
    public final VersionInfoParcel zzsx;
    zza zzsy;
    public zzjv zzsz;
    private int zzta;
    private int zztb;
    private zzkk zztc;
    private boolean zztd;
    private boolean zzte;
    private boolean zztf;

    public static class zza extends ViewSwitcher {
        private final zzkd zztg;
        private final zzkn zzth;

        public zza(Context context, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
            super(context);
            this.zztg = new zzkd(context);
            if (context instanceof Activity) {
                this.zzth = new zzkn((Activity) context, this, onGlobalLayoutListener, onScrollChangedListener);
            } else {
                this.zzth = new zzkn(null, this, onGlobalLayoutListener, onScrollChangedListener);
            }
            this.zzth.zzjn();
        }

        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (this.zzth != null) {
                this.zzth.onAttachedToWindow();
            }
        }

        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.zzth != null) {
                this.zzth.onDetachedFromWindow();
            }
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            this.zztg.zze(motionEvent);
            return false;
        }

        public void removeAllViews() {
            List<zzla> arrayList = new ArrayList();
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt != null && (childAt instanceof zzla)) {
                    arrayList.add((zzla) childAt);
                }
            }
            super.removeAllViews();
            for (zzla destroy : arrayList) {
                destroy.destroy();
            }
        }

        public void zzcL() {
            zzjw.v("Disable position monitoring on adFrame.");
            if (this.zzth != null) {
                this.zzth.zzjo();
            }
        }

        public zzkd zzcP() {
            return this.zztg;
        }
    }

    public zzv(Context context, AdSizeParcel adSizeParcel, String str, VersionInfoParcel versionInfoParcel) {
        this(context, adSizeParcel, str, versionInfoParcel, null);
    }

    zzv(Context context, AdSizeParcel adSizeParcel, String str, VersionInfoParcel versionInfoParcel, zzaq com_google_android_gms_internal_zzaq) {
        this.zzsV = null;
        this.zzsW = null;
        this.zzsX = 0;
        this.zzsY = false;
        this.zzrf = false;
        this.zzsZ = null;
        this.zzta = -1;
        this.zztb = -1;
        this.zztd = true;
        this.zzte = true;
        this.zztf = false;
        zzcu.initialize(context);
        if (zzu.zzcn().zziG() != null) {
            List zzes = zzcu.zzes();
            if (versionInfoParcel.zzRC != 0) {
                zzes.add(Integer.toString(versionInfoParcel.zzRC));
            }
            zzu.zzcn().zziG().zzc(zzes);
        }
        this.zzsu = UUID.randomUUID().toString();
        if (adSizeParcel.zzvt || adSizeParcel.zzvv) {
            this.zzsy = null;
        } else {
            this.zzsy = new zza(context, this, this);
            this.zzsy.setMinimumWidth(adSizeParcel.widthPixels);
            this.zzsy.setMinimumHeight(adSizeParcel.heightPixels);
            this.zzsy.setVisibility(4);
        }
        this.zzsB = adSizeParcel;
        this.zzsv = str;
        this.zzov = context;
        this.zzsx = versionInfoParcel;
        if (com_google_android_gms_internal_zzaq == null) {
            com_google_android_gms_internal_zzaq = new zzaq(new a(this));
        }
        this.zzsw = com_google_android_gms_internal_zzaq;
        this.zztc = new zzkk(200);
        this.zzsO = new j();
    }

    private void zzcM() {
        View findViewById = this.zzsy.getRootView().findViewById(16908290);
        if (findViewById != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            this.zzsy.getGlobalVisibleRect(rect);
            findViewById.getGlobalVisibleRect(rect2);
            if (rect.top != rect2.top) {
                this.zztd = false;
            }
            if (rect.bottom != rect2.bottom) {
                this.zzte = false;
            }
        }
    }

    private void zzg(boolean z) {
        boolean z2 = true;
        if (this.zzsy != null && this.zzsC != null && this.zzsC.zzHF != null) {
            if (!z || this.zztc.tryAcquire()) {
                if (this.zzsC.zzHF.zzjD().zzdi()) {
                    int[] iArr = new int[2];
                    this.zzsy.getLocationOnScreen(iArr);
                    int zzb = zzm.zzdQ().zzb(this.zzov, iArr[0]);
                    int zzb2 = zzm.zzdQ().zzb(this.zzov, iArr[1]);
                    if (!(zzb == this.zzta && zzb2 == this.zztb)) {
                        this.zzta = zzb;
                        this.zztb = zzb2;
                        zzlb zzjD = this.zzsC.zzHF.zzjD();
                        zzb = this.zzta;
                        int i = this.zztb;
                        if (z) {
                            z2 = false;
                        }
                        zzjD.zza(zzb, i, z2);
                    }
                }
                zzcM();
            }
        }
    }

    public void destroy() {
        zzcL();
        this.zzsG = null;
        this.zzsH = null;
        this.zzsK = null;
        this.zzsJ = null;
        this.zzsR = null;
        this.zzsI = null;
        zzh(false);
        if (this.zzsy != null) {
            this.zzsy.removeAllViews();
        }
        zzcG();
        zzcI();
        this.zzsC = null;
    }

    public void onGlobalLayout() {
        zzg(false);
    }

    public void onScrollChanged() {
        zzg(true);
        this.zztf = true;
    }

    public void zza(HashSet<zzjo> hashSet) {
        this.zzsZ = hashSet;
    }

    public HashSet<zzjo> zzcF() {
        return this.zzsZ;
    }

    public void zzcG() {
        if (this.zzsC != null && this.zzsC.zzHF != null) {
            this.zzsC.zzHF.destroy();
        }
    }

    public void zzcH() {
        if (this.zzsC != null && this.zzsC.zzHF != null) {
            this.zzsC.zzHF.stopLoading();
        }
    }

    public void zzcI() {
        if (this.zzsC != null && this.zzsC.zzFh != null) {
            try {
                this.zzsC.zzFh.destroy();
            } catch (RemoteException e) {
                zzb.zzaW("Could not destroy mediation adapter.");
            }
        }
    }

    public boolean zzcJ() {
        return this.zzsX == 0;
    }

    public boolean zzcK() {
        return this.zzsX == 1;
    }

    public void zzcL() {
        if (this.zzsy != null) {
            this.zzsy.zzcL();
        }
    }

    public String zzcN() {
        return (this.zztd && this.zzte) ? "" : this.zztd ? this.zztf ? "top-scrollable" : "top-locked" : this.zzte ? this.zztf ? "bottom-scrollable" : "bottom-locked" : "";
    }

    public void zzcO() {
        this.zzsE.zzl(this.zzsC.zzPc);
        this.zzsE.zzm(this.zzsC.zzPd);
        this.zzsE.zzB(this.zzsB.zzvt);
        this.zzsE.zzC(this.zzsC.zzLP);
    }

    public void zzh(boolean z) {
        if (this.zzsX == 0) {
            zzcH();
        }
        if (this.zzsz != null) {
            this.zzsz.cancel();
        }
        if (this.zzsA != null) {
            this.zzsA.cancel();
        }
        if (z) {
            this.zzsC = null;
        }
    }
}
