package com.google.android.gms.ads.internal;

import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.overlay.zze;
import com.google.android.gms.ads.internal.overlay.zzq;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.purchase.zzi;
import com.google.android.gms.ads.internal.request.zza;
import com.google.android.gms.common.util.zzh;
import com.google.android.gms.internal.zzcr;
import com.google.android.gms.internal.zzcs;
import com.google.android.gms.internal.zzct;
import com.google.android.gms.internal.zzcx;
import com.google.android.gms.internal.zzet;
import com.google.android.gms.internal.zzfb;
import com.google.android.gms.internal.zzfw;
import com.google.android.gms.internal.zzhv;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzip;
import com.google.android.gms.internal.zzjq;
import com.google.android.gms.internal.zzka;
import com.google.android.gms.internal.zzkb;
import com.google.android.gms.internal.zzkh;
import com.google.android.gms.internal.zzki;
import com.google.android.gms.internal.zzkv;
import com.google.android.gms.internal.zzlc;

@zzig
public class zzu {
    private static zzu zzrU;
    private static final Object zzrs = new Object();
    private final zza zzrV = new zza();
    private final com.google.android.gms.ads.internal.overlay.zza zzrW = new com.google.android.gms.ads.internal.overlay.zza();
    private final zze zzrX = new zze();
    private final zzhv zzrY = new zzhv();
    private final zzka zzrZ = new zzka();
    private final zzlc zzsa = new zzlc();
    private final zzkb zzsb = zzkb.zzW(VERSION.SDK_INT);
    private final zzjq zzsc = new zzjq(this.zzrZ);
    private final com.google.android.gms.common.util.zze zzsd = new zzh();
    private final zzcx zzse = new zzcx();
    private final zzip zzsf = new zzip();
    private final zzcs zzsg = new zzcs();
    private final zzcr zzsh = new zzcr();
    private final zzct zzsi = new zzct();
    private final zzi zzsj = new zzi();
    private final zzfb zzsk = new zzfb();
    private final zzkh zzsl = new zzkh();
    private final zzq zzsm = new zzq();
    private final zzr zzsn = new zzr();
    private final zzfw zzso = new zzfw();
    private final zzki zzsp = new zzki();
    private final zzg zzsq = new zzg();
    private final zzp zzsr = new zzp();
    private final zzet zzss = new zzet();
    private final zzkv zzst = new zzkv();

    static {
        zza(new zzu());
    }

    protected zzu() {
    }

    protected static void zza(zzu com_google_android_gms_ads_internal_zzu) {
        synchronized (zzrs) {
            zzrU = com_google_android_gms_ads_internal_zzu;
        }
    }

    public static zzp zzcA() {
        return zzcf().zzsr;
    }

    public static zzki zzcB() {
        return zzcf().zzsp;
    }

    public static zzg zzcC() {
        return zzcf().zzsq;
    }

    public static zzet zzcD() {
        return zzcf().zzss;
    }

    public static zzkv zzcE() {
        return zzcf().zzst;
    }

    private static zzu zzcf() {
        zzu com_google_android_gms_ads_internal_zzu;
        synchronized (zzrs) {
            com_google_android_gms_ads_internal_zzu = zzrU;
        }
        return com_google_android_gms_ads_internal_zzu;
    }

    public static zza zzcg() {
        return zzcf().zzrV;
    }

    public static com.google.android.gms.ads.internal.overlay.zza zzch() {
        return zzcf().zzrW;
    }

    public static zze zzci() {
        return zzcf().zzrX;
    }

    public static zzhv zzcj() {
        return zzcf().zzrY;
    }

    public static zzka zzck() {
        return zzcf().zzrZ;
    }

    public static zzlc zzcl() {
        return zzcf().zzsa;
    }

    public static zzkb zzcm() {
        return zzcf().zzsb;
    }

    public static zzjq zzcn() {
        return zzcf().zzsc;
    }

    public static com.google.android.gms.common.util.zze zzco() {
        return zzcf().zzsd;
    }

    public static zzcx zzcp() {
        return zzcf().zzse;
    }

    public static zzip zzcq() {
        return zzcf().zzsf;
    }

    public static zzcs zzcr() {
        return zzcf().zzsg;
    }

    public static zzcr zzcs() {
        return zzcf().zzsh;
    }

    public static zzct zzct() {
        return zzcf().zzsi;
    }

    public static zzi zzcu() {
        return zzcf().zzsj;
    }

    public static zzfb zzcv() {
        return zzcf().zzsk;
    }

    public static zzkh zzcw() {
        return zzcf().zzsl;
    }

    public static zzq zzcx() {
        return zzcf().zzsm;
    }

    public static zzr zzcy() {
        return zzcf().zzsn;
    }

    public static zzfw zzcz() {
        return zzcf().zzso;
    }
}
