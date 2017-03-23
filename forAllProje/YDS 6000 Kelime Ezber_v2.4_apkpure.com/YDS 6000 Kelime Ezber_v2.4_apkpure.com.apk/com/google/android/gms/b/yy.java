package com.google.android.gms.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.google.android.gms.ads.internal.v;

@vz
public class yy {
    long a = -1;
    long b = -1;
    int c = -1;
    int d = -1;
    final String e;
    int f = 0;
    int g = 0;
    private final Object h = new Object();

    public yy(String str) {
        this.e = str;
    }

    public static boolean a(Context context) {
        int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            zy.d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                return true;
            }
            zy.d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (NameNotFoundException e) {
            zy.e("Fail to fetch AdActivity theme");
            zy.d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }

    public long a() {
        return this.b;
    }

    public Bundle a(Context context, String str) {
        Bundle bundle;
        synchronized (this.h) {
            bundle = new Bundle();
            bundle.putString("session_id", this.e);
            bundle.putLong("basets", this.b);
            bundle.putLong("currts", this.a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.c);
            bundle.putInt("preqs_in_session", this.d);
            bundle.putInt("pclick", this.f);
            bundle.putInt("pimp", this.g);
            bundle.putBoolean("support_transparent_background", a(context));
        }
        return bundle;
    }

    public void a(int i) {
        this.d = i;
    }

    public void a(ns nsVar, long j) {
        synchronized (this.h) {
            if (this.b == -1) {
                if (j - v.i().n() > ((Long) pr.aF.c()).longValue()) {
                    a(-1);
                } else {
                    a(v.i().o());
                }
                this.b = j;
                this.a = this.b;
            } else {
                this.a = j;
            }
            if (nsVar.c == null || nsVar.c.getInt("gw", 2) != 1) {
                this.c++;
                this.d++;
                return;
            }
        }
    }

    public void b() {
        synchronized (this.h) {
            this.f++;
        }
    }

    public void c() {
        synchronized (this.h) {
            this.g++;
        }
    }

    public int d() {
        return this.d;
    }
}
