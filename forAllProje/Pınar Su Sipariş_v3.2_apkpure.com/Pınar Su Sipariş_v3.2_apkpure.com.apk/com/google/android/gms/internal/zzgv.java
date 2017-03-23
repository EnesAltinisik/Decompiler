package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.zzgu.zza;
import java.util.Map;

@zzig
public class zzgv extends zzgw implements zzeh {
    private final Context mContext;
    private final zzla zzBb;
    private int zzGA;
    int zzGB = -1;
    int zzGC = -1;
    int zzGD = -1;
    int zzGE = -1;
    private final zzcm zzGv;
    DisplayMetrics zzGw;
    private float zzGx;
    int zzGy = -1;
    int zzGz = -1;
    private final WindowManager zztn;

    public zzgv(zzla com_google_android_gms_internal_zzla, Context context, zzcm com_google_android_gms_internal_zzcm) {
        super(com_google_android_gms_internal_zzla);
        this.zzBb = com_google_android_gms_internal_zzla;
        this.mContext = context;
        this.zzGv = com_google_android_gms_internal_zzcm;
        this.zztn = (WindowManager) context.getSystemService("window");
    }

    private void zzfT() {
        this.zzGw = new DisplayMetrics();
        Display defaultDisplay = this.zztn.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zzGw);
        this.zzGx = this.zzGw.density;
        this.zzGA = defaultDisplay.getRotation();
    }

    private void zzfY() {
        int[] iArr = new int[2];
        this.zzBb.getLocationOnScreen(iArr);
        zze(zzm.zzdQ().zzb(this.mContext, iArr[0]), zzm.zzdQ().zzb(this.mContext, iArr[1]));
    }

    private zzgu zzgb() {
        return new zza().zzt(this.zzGv.zzej()).zzs(this.zzGv.zzek()).zzu(this.zzGv.zzeo()).zzv(this.zzGv.zzel()).zzw(this.zzGv.zzem()).zzfS();
    }

    public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
        zzfW();
    }

    public void zze(int i, int i2) {
        zzc(i, i2 - (this.mContext instanceof Activity ? zzu.zzck().zzk((Activity) this.mContext)[0] : 0), this.zzGD, this.zzGE);
        this.zzBb.zzjD().zzd(i, i2);
    }

    void zzfU() {
        this.zzGy = zzm.zzdQ().zzb(this.zzGw, this.zzGw.widthPixels);
        this.zzGz = zzm.zzdQ().zzb(this.zzGw, this.zzGw.heightPixels);
        Activity zzjy = this.zzBb.zzjy();
        if (zzjy == null || zzjy.getWindow() == null) {
            this.zzGB = this.zzGy;
            this.zzGC = this.zzGz;
            return;
        }
        int[] zzh = zzu.zzck().zzh(zzjy);
        this.zzGB = zzm.zzdQ().zzb(this.zzGw, zzh[0]);
        this.zzGC = zzm.zzdQ().zzb(this.zzGw, zzh[1]);
    }

    void zzfV() {
        if (this.zzBb.zzbi().zzvt) {
            this.zzGD = this.zzGy;
            this.zzGE = this.zzGz;
            return;
        }
        this.zzBb.measure(0, 0);
        this.zzGD = zzm.zzdQ().zzb(this.mContext, this.zzBb.getMeasuredWidth());
        this.zzGE = zzm.zzdQ().zzb(this.mContext, this.zzBb.getMeasuredHeight());
    }

    public void zzfW() {
        zzfT();
        zzfU();
        zzfV();
        zzfZ();
        zzga();
        zzfY();
        zzfX();
    }

    void zzfX() {
        if (zzb.zzX(2)) {
            zzb.zzaV("Dispatching Ready Event.");
        }
        zzat(this.zzBb.zzjG().afmaVersion);
    }

    void zzfZ() {
        zza(this.zzGy, this.zzGz, this.zzGB, this.zzGC, this.zzGx, this.zzGA);
    }

    void zzga() {
        this.zzBb.zzb("onDeviceFeaturesReceived", zzgb().toJson());
    }
}
