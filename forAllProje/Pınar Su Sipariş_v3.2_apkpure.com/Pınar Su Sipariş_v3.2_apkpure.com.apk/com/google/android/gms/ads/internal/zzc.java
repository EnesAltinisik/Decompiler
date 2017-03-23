package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzdc;
import com.google.android.gms.internal.zzdd;
import com.google.android.gms.internal.zzdf;
import com.google.android.gms.internal.zzdg;
import com.google.android.gms.internal.zzeh;
import com.google.android.gms.internal.zzfk;
import com.google.android.gms.internal.zzga;
import com.google.android.gms.internal.zzgx;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzjh;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzjn.zza;
import com.google.android.gms.internal.zzka;
import com.google.android.gms.internal.zzla;
import java.util.Map;

@zzig
public abstract class zzc extends zzb implements zzh, zzgx {
    public zzc(Context context, AdSizeParcel adSizeParcel, String str, zzga com_google_android_gms_internal_zzga, VersionInfoParcel versionInfoParcel, zzd com_google_android_gms_ads_internal_zzd) {
        super(context, adSizeParcel, str, com_google_android_gms_internal_zzga, versionInfoParcel, com_google_android_gms_ads_internal_zzd);
    }

    protected zzla zza(zza com_google_android_gms_internal_zzjn_zza, zze com_google_android_gms_ads_internal_zze, zzjh com_google_android_gms_internal_zzjh) {
        zzla com_google_android_gms_internal_zzla = null;
        View nextView = this.zzpV.zzsy.getNextView();
        if (nextView instanceof zzla) {
            com_google_android_gms_internal_zzla = (zzla) nextView;
            if (((Boolean) zzcu.zzya.get()).booleanValue()) {
                zzb.zzaU("Reusing webview...");
                com_google_android_gms_internal_zzla.zza(this.zzpV.zzov, this.zzpV.zzsB, this.zzpQ);
            } else {
                com_google_android_gms_internal_zzla.destroy();
                com_google_android_gms_internal_zzla = null;
            }
        }
        if (com_google_android_gms_internal_zzla == null) {
            if (nextView != null) {
                this.zzpV.zzsy.removeView(nextView);
            }
            com_google_android_gms_internal_zzla = zzu.zzcl().zza(this.zzpV.zzov, this.zzpV.zzsB, false, false, this.zzpV.zzsw, this.zzpV.zzsx, this.zzpQ, this, this.zzpY);
            if (this.zzpV.zzsB.zzvu == null) {
                zzb(com_google_android_gms_internal_zzla.getView());
            }
        }
        zzfk com_google_android_gms_internal_zzfk = com_google_android_gms_internal_zzla;
        com_google_android_gms_internal_zzfk.zzjD().zza(this, this, this, this, false, this, null, com_google_android_gms_ads_internal_zze, this, com_google_android_gms_internal_zzjh);
        zza(com_google_android_gms_internal_zzfk);
        com_google_android_gms_internal_zzfk.zzaY(com_google_android_gms_internal_zzjn_zza.zzPh.zzLx);
        return com_google_android_gms_internal_zzfk;
    }

    public void zza(int i, int i2, int i3, int i4) {
        zzbo();
    }

    public void zza(zzdg com_google_android_gms_internal_zzdg) {
        zzaa.zzdc("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzpV.zzsR = com_google_android_gms_internal_zzdg;
    }

    protected void zza(zzfk com_google_android_gms_internal_zzfk) {
        com_google_android_gms_internal_zzfk.zza("/trackActiveViewUnit", new zzeh(this) {
            final /* synthetic */ zzc a;

            {
                this.a = r1;
            }

            public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
                if (this.a.zzpV.zzsC != null) {
                    this.a.zzpX.zza(this.a.zzpV.zzsB, this.a.zzpV.zzsC, com_google_android_gms_internal_zzla.getView(), (zzfk) com_google_android_gms_internal_zzla);
                } else {
                    zzb.zzaW("Request to enable ActiveView before adState is available.");
                }
            }
        });
    }

    protected void zza(final zza com_google_android_gms_internal_zzjn_zza, final zzdc com_google_android_gms_internal_zzdc) {
        zzjh com_google_android_gms_internal_zzjh = null;
        if (com_google_android_gms_internal_zzjn_zza.errorCode != -2) {
            zzka.zzQu.post(new Runnable(this) {
                final /* synthetic */ zzc b;

                public void run() {
                    this.b.zzb(new zzjn(com_google_android_gms_internal_zzjn_zza, null, null, null, null, null, null, null));
                }
            });
            return;
        }
        if (com_google_android_gms_internal_zzjn_zza.zzsB != null) {
            this.zzpV.zzsB = com_google_android_gms_internal_zzjn_zza.zzsB;
        }
        if (!com_google_android_gms_internal_zzjn_zza.zzPi.zzLP || com_google_android_gms_internal_zzjn_zza.zzPi.zzvx) {
            if (((Boolean) zzcu.zzzC.get()).booleanValue()) {
                com_google_android_gms_internal_zzjh = this.zzpY.zzqp.zza(this.zzpV.zzov, com_google_android_gms_internal_zzjn_zza.zzPi);
            }
            zzka.zzQu.post(new Runnable(this) {
                final /* synthetic */ zzc d;

                public void run() {
                    if (com_google_android_gms_internal_zzjn_zza.zzPi.zzLY && this.d.zzpV.zzsR != null) {
                        String str = null;
                        if (com_google_android_gms_internal_zzjn_zza.zzPi.zzHH != null) {
                            str = zzu.zzck().zzaN(com_google_android_gms_internal_zzjn_zza.zzPi.zzHH);
                        }
                        zzdf com_google_android_gms_internal_zzdd = new zzdd(this.d, str, com_google_android_gms_internal_zzjn_zza.zzPi.body);
                        this.d.zzpV.zzsX = 1;
                        try {
                            this.d.zzpT = false;
                            this.d.zzpV.zzsR.zza(com_google_android_gms_internal_zzdd);
                            return;
                        } catch (Throwable e) {
                            zzb.zzd("Could not call the onCustomRenderedAdLoadedListener.", e);
                            this.d.zzpT = true;
                        }
                    }
                    final zze com_google_android_gms_ads_internal_zze = new zze(this.d.zzpV.zzov, com_google_android_gms_internal_zzjn_zza);
                    zzla zza = this.d.zza(com_google_android_gms_internal_zzjn_zza, com_google_android_gms_ads_internal_zze, com_google_android_gms_internal_zzjh);
                    zza.setOnTouchListener(new OnTouchListener(this) {
                        final /* synthetic */ AnonymousClass3 b;

                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            com_google_android_gms_ads_internal_zze.recordClick();
                            return false;
                        }
                    });
                    zza.setOnClickListener(new OnClickListener(this) {
                        final /* synthetic */ AnonymousClass3 b;

                        public void onClick(View view) {
                            com_google_android_gms_ads_internal_zze.recordClick();
                        }
                    });
                    this.d.zzpV.zzsX = 0;
                    this.d.zzpV.zzsA = zzu.zzcj().zza(this.d.zzpV.zzov, this.d, com_google_android_gms_internal_zzjn_zza, this.d.zzpV.zzsw, zza, this.d.zzqc, this.d, com_google_android_gms_internal_zzdc);
                }
            });
            return;
        }
        this.zzpV.zzsX = 0;
        this.zzpV.zzsA = zzu.zzcj().zza(this.zzpV.zzov, this, com_google_android_gms_internal_zzjn_zza, this.zzpV.zzsw, null, this.zzqc, this, com_google_android_gms_internal_zzdc);
    }

    protected boolean zza(zzjn com_google_android_gms_internal_zzjn, zzjn com_google_android_gms_internal_zzjn2) {
        if (this.zzpV.zzcJ() && this.zzpV.zzsy != null) {
            this.zzpV.zzsy.zzcP().zzaR(com_google_android_gms_internal_zzjn2.zzLU);
        }
        return super.zza(com_google_android_gms_internal_zzjn, com_google_android_gms_internal_zzjn2);
    }

    public void zzbC() {
        onAdClicked();
    }

    public void zzbD() {
        recordImpression();
        zzbk();
    }

    public void zzbE() {
        zzbm();
    }

    public void zzc(View view) {
        this.zzpV.zzsW = view;
        zzb(new zzjn(this.zzpV.zzsD, null, null, null, null, null, null, null));
    }
}
