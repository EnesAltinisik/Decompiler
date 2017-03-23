package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.zzi;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import java.util.Locale;

@zzig
public final class zzio {
    public final int zzLs;
    public final int zzLt;
    public final float zzLu;
    public final int zzNV;
    public final boolean zzNW;
    public final boolean zzNX;
    public final String zzNY;
    public final String zzNZ;
    public final boolean zzOa;
    public final boolean zzOb;
    public final boolean zzOc;
    public final boolean zzOd;
    public final String zzOe;
    public final String zzOf;
    public final int zzOg;
    public final int zzOh;
    public final int zzOi;
    public final int zzOj;
    public final int zzOk;
    public final int zzOl;
    public final double zzOm;
    public final boolean zzOn;
    public final boolean zzOo;
    public final int zzOp;
    public final String zzOq;
    public final boolean zzOr;

    public static final class zza {
        private int zzLs;
        private int zzLt;
        private float zzLu;
        private int zzNV;
        private boolean zzNW;
        private boolean zzNX;
        private String zzNY;
        private String zzNZ;
        private boolean zzOa;
        private boolean zzOb;
        private boolean zzOc;
        private boolean zzOd;
        private String zzOe;
        private String zzOf;
        private int zzOg;
        private int zzOh;
        private int zzOi;
        private int zzOj;
        private int zzOk;
        private int zzOl;
        private double zzOm;
        private boolean zzOn;
        private boolean zzOo;
        private int zzOp;
        private String zzOq;
        private boolean zzOr;

        public zza(Context context) {
            boolean z = true;
            PackageManager packageManager = context.getPackageManager();
            zzu(context);
            zza(context, packageManager);
            zzv(context);
            Locale locale = Locale.getDefault();
            this.zzNW = zza(packageManager, "geo:0,0?q=donuts") != null;
            if (zza(packageManager, "http://www.google.com") == null) {
                z = false;
            }
            this.zzNX = z;
            this.zzNZ = locale.getCountry();
            this.zzOa = zzm.zzdQ().zzjr();
            this.zzOb = zzi.zzaC(context);
            this.zzOe = locale.getLanguage();
            this.zzOf = zza(packageManager);
            Resources resources = context.getResources();
            if (resources != null) {
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                if (displayMetrics != null) {
                    this.zzLu = displayMetrics.density;
                    this.zzLs = displayMetrics.widthPixels;
                    this.zzLt = displayMetrics.heightPixels;
                }
            }
        }

        public zza(Context context, zzio com_google_android_gms_internal_zzio) {
            PackageManager packageManager = context.getPackageManager();
            zzu(context);
            zza(context, packageManager);
            zzv(context);
            zzw(context);
            this.zzNW = com_google_android_gms_internal_zzio.zzNW;
            this.zzNX = com_google_android_gms_internal_zzio.zzNX;
            this.zzNZ = com_google_android_gms_internal_zzio.zzNZ;
            this.zzOa = com_google_android_gms_internal_zzio.zzOa;
            this.zzOb = com_google_android_gms_internal_zzio.zzOb;
            this.zzOe = com_google_android_gms_internal_zzio.zzOe;
            this.zzOf = com_google_android_gms_internal_zzio.zzOf;
            this.zzLu = com_google_android_gms_internal_zzio.zzLu;
            this.zzLs = com_google_android_gms_internal_zzio.zzLs;
            this.zzLt = com_google_android_gms_internal_zzio.zzLt;
        }

        private static ResolveInfo zza(PackageManager packageManager, String str) {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        }

        private static String zza(PackageManager packageManager) {
            String str = null;
            ResolveInfo zza = zza(packageManager, "market://details?id=com.google.android.gms.ads");
            if (zza != null) {
                ActivityInfo activityInfo = zza.activityInfo;
                if (activityInfo != null) {
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(activityInfo.packageName, 0);
                        if (packageInfo != null) {
                            int i = packageInfo.versionCode;
                            String valueOf = String.valueOf(activityInfo.packageName);
                            str = new StringBuilder(String.valueOf(valueOf).length() + 12).append(i).append(".").append(valueOf).toString();
                        }
                    } catch (NameNotFoundException e) {
                    }
                }
            }
            return str;
        }

        @TargetApi(16)
        private void zza(Context context, PackageManager packageManager) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            this.zzNY = telephonyManager.getNetworkOperator();
            this.zzOi = telephonyManager.getNetworkType();
            this.zzOj = telephonyManager.getPhoneType();
            this.zzOh = -2;
            this.zzOo = false;
            this.zzOp = -1;
            if (zzu.zzck().zza(packageManager, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE")) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    this.zzOh = activeNetworkInfo.getType();
                    this.zzOp = activeNetworkInfo.getDetailedState().ordinal();
                } else {
                    this.zzOh = -1;
                }
                if (VERSION.SDK_INT >= 16) {
                    this.zzOo = connectivityManager.isActiveNetworkMetered();
                }
            }
        }

        private void zzu(Context context) {
            AudioManager zzJ = zzu.zzck().zzJ(context);
            if (zzJ != null) {
                try {
                    this.zzNV = zzJ.getMode();
                    this.zzOc = zzJ.isMusicActive();
                    this.zzOd = zzJ.isSpeakerphoneOn();
                    this.zzOg = zzJ.getStreamVolume(3);
                    this.zzOk = zzJ.getRingerMode();
                    this.zzOl = zzJ.getStreamVolume(2);
                    return;
                } catch (Throwable th) {
                    zzu.zzcn().zzb(th, true);
                }
            }
            this.zzNV = -2;
            this.zzOc = false;
            this.zzOd = false;
            this.zzOg = 0;
            this.zzOk = 0;
            this.zzOl = 0;
        }

        private void zzv(Context context) {
            boolean z = false;
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra("status", -1);
                this.zzOm = (double) (((float) registerReceiver.getIntExtra(Param.LEVEL, -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
                if (intExtra == 2 || intExtra == 5) {
                    z = true;
                }
                this.zzOn = z;
                return;
            }
            this.zzOm = -1.0d;
            this.zzOn = false;
        }

        private void zzw(Context context) {
            this.zzOq = Build.FINGERPRINT;
            this.zzOr = zzdi.zzo(context);
        }

        public zzio zzii() {
            return new zzio(this.zzNV, this.zzNW, this.zzNX, this.zzNY, this.zzNZ, this.zzOa, this.zzOb, this.zzOc, this.zzOd, this.zzOe, this.zzOf, this.zzOg, this.zzOh, this.zzOi, this.zzOj, this.zzOk, this.zzOl, this.zzLu, this.zzLs, this.zzLt, this.zzOm, this.zzOn, this.zzOo, this.zzOp, this.zzOq, this.zzOr);
        }
    }

    zzio(int i, boolean z, boolean z2, String str, String str2, boolean z3, boolean z4, boolean z5, boolean z6, String str3, String str4, int i2, int i3, int i4, int i5, int i6, int i7, float f, int i8, int i9, double d, boolean z7, boolean z8, int i10, String str5, boolean z9) {
        this.zzNV = i;
        this.zzNW = z;
        this.zzNX = z2;
        this.zzNY = str;
        this.zzNZ = str2;
        this.zzOa = z3;
        this.zzOb = z4;
        this.zzOc = z5;
        this.zzOd = z6;
        this.zzOe = str3;
        this.zzOf = str4;
        this.zzOg = i2;
        this.zzOh = i3;
        this.zzOi = i4;
        this.zzOj = i5;
        this.zzOk = i6;
        this.zzOl = i7;
        this.zzLu = f;
        this.zzLs = i8;
        this.zzLt = i9;
        this.zzOm = d;
        this.zzOn = z7;
        this.zzOo = z8;
        this.zzOp = i10;
        this.zzOq = str5;
        this.zzOr = z9;
    }
}
