package com.google.android.gms.b;

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
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.common.util.f;
import java.util.Locale;

@vz
public final class xe {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final String k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final float r;
    public final int s;
    public final int t;
    public final double u;
    public final boolean v;
    public final boolean w;
    public final int x;
    public final String y;
    public final boolean z;

    public static final class a {
        private int a;
        private boolean b;
        private boolean c;
        private int d;
        private int e;
        private int f;
        private String g;
        private int h;
        private int i;
        private int j;
        private boolean k;
        private int l;
        private double m;
        private boolean n;
        private String o;
        private boolean p;
        private boolean q;
        private String r;
        private boolean s;
        private boolean t;
        private String u;
        private String v;
        private float w;
        private int x;
        private int y;
        private boolean z;

        public a(Context context) {
            boolean z = true;
            PackageManager packageManager = context.getPackageManager();
            a(context);
            a(context, packageManager);
            b(context);
            Locale locale = Locale.getDefault();
            this.p = a(packageManager, "geo:0,0?q=donuts") != null;
            if (a(packageManager, "http://www.google.com") == null) {
                z = false;
            }
            this.q = z;
            this.r = locale.getCountry();
            this.s = oc.a().a();
            this.t = f.c(context);
            this.u = locale.getLanguage();
            this.v = a(packageManager);
            Resources resources = context.getResources();
            if (resources != null) {
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                if (displayMetrics != null) {
                    this.w = displayMetrics.density;
                    this.x = displayMetrics.widthPixels;
                    this.y = displayMetrics.heightPixels;
                }
            }
        }

        public a(Context context, xe xeVar) {
            PackageManager packageManager = context.getPackageManager();
            a(context);
            a(context, packageManager);
            b(context);
            c(context);
            this.p = xeVar.b;
            this.q = xeVar.c;
            this.r = xeVar.e;
            this.s = xeVar.f;
            this.t = xeVar.g;
            this.u = xeVar.j;
            this.v = xeVar.k;
            this.w = xeVar.r;
            this.x = xeVar.s;
            this.y = xeVar.t;
        }

        private static ResolveInfo a(PackageManager packageManager, String str) {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        }

        private static String a(PackageManager packageManager) {
            String str = null;
            ResolveInfo a = a(packageManager, "market://details?id=com.google.android.gms.ads");
            if (a != null) {
                ActivityInfo activityInfo = a.activityInfo;
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

        private void a(Context context) {
            AudioManager i = v.e().i(context);
            if (i != null) {
                try {
                    this.a = i.getMode();
                    this.b = i.isMusicActive();
                    this.c = i.isSpeakerphoneOn();
                    this.d = i.getStreamVolume(3);
                    this.e = i.getRingerMode();
                    this.f = i.getStreamVolume(2);
                    return;
                } catch (Throwable th) {
                    v.i().a(th, "DeviceInfo.gatherAudioInfo");
                }
            }
            this.a = -2;
            this.b = false;
            this.c = false;
            this.d = 0;
            this.e = 0;
            this.f = 0;
        }

        @TargetApi(16)
        private void a(Context context, PackageManager packageManager) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            this.g = telephonyManager.getNetworkOperator();
            this.i = telephonyManager.getNetworkType();
            this.j = telephonyManager.getPhoneType();
            this.h = -2;
            this.k = false;
            this.l = -1;
            if (v.e().a(packageManager, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE")) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    this.h = activeNetworkInfo.getType();
                    this.l = activeNetworkInfo.getDetailedState().ordinal();
                } else {
                    this.h = -1;
                }
                if (VERSION.SDK_INT >= 16) {
                    this.k = connectivityManager.isActiveNetworkMetered();
                }
            }
        }

        private void b(Context context) {
            boolean z = false;
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra("status", -1);
                this.m = (double) (((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
                if (intExtra == 2 || intExtra == 5) {
                    z = true;
                }
                this.n = z;
                return;
            }
            this.m = -1.0d;
            this.n = false;
        }

        private void c(Context context) {
            this.o = Build.FINGERPRINT;
            this.z = qg.a(context);
        }

        public xe a() {
            return new xe(this.a, this.p, this.q, this.g, this.r, this.s, this.t, this.b, this.c, this.u, this.v, this.d, this.h, this.i, this.j, this.e, this.f, this.w, this.x, this.y, this.m, this.n, this.k, this.l, this.o, this.z);
        }
    }

    xe(int i, boolean z, boolean z2, String str, String str2, boolean z3, boolean z4, boolean z5, boolean z6, String str3, String str4, int i2, int i3, int i4, int i5, int i6, int i7, float f, int i8, int i9, double d, boolean z7, boolean z8, int i10, String str5, boolean z9) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = str2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = str3;
        this.k = str4;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = i5;
        this.p = i6;
        this.q = i7;
        this.r = f;
        this.s = i8;
        this.t = i9;
        this.u = d;
        this.v = z7;
        this.w = z8;
        this.x = i10;
        this.y = str5;
        this.z = z9;
    }
}
