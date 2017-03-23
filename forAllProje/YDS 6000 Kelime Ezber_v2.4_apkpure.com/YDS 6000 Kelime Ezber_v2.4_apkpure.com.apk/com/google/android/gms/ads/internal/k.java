package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.b.aab;
import com.google.android.gms.b.og;
import com.google.android.gms.b.oh;
import com.google.android.gms.b.oi.a;
import com.google.android.gms.b.oo;
import com.google.android.gms.b.qr;
import com.google.android.gms.b.re;
import com.google.android.gms.b.rf;
import com.google.android.gms.b.rg;
import com.google.android.gms.b.rh;
import com.google.android.gms.b.tn;
import com.google.android.gms.b.vz;

@vz
public class k extends a {
    private og a;
    private re b;
    private rf c;
    private android.support.v4.i.k<String, rg> d = new android.support.v4.i.k();
    private android.support.v4.i.k<String, rh> e = new android.support.v4.i.k();
    private qr f;
    private oo g;
    private final Context h;
    private final tn i;
    private final String j;
    private final aab k;
    private final d l;

    public k(Context context, String str, tn tnVar, aab com_google_android_gms_b_aab, d dVar) {
        this.h = context;
        this.j = str;
        this.i = tnVar;
        this.k = com_google_android_gms_b_aab;
        this.l = dVar;
    }

    public oh a() {
        return new j(this.h, this.j, this.i, this.k, this.a, this.b, this.c, this.e, this.d, this.f, this.g, this.l);
    }

    public void a(og ogVar) {
        this.a = ogVar;
    }

    public void a(oo ooVar) {
        this.g = ooVar;
    }

    public void a(qr qrVar) {
        this.f = qrVar;
    }

    public void a(re reVar) {
        this.b = reVar;
    }

    public void a(rf rfVar) {
        this.c = rfVar;
    }

    public void a(String str, rh rhVar, rg rgVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
        }
        this.e.put(str, rhVar);
        this.d.put(str, rgVar);
    }
}
