package com.google.android.gms.b;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.b.xe.a;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

@vz
public class sm {
    private final Map<sn, so> a = new HashMap();
    private final LinkedList<sn> b = new LinkedList();
    private sj c;

    static Bundle a(ns nsVar) {
        Bundle bundle = nsVar.m;
        return bundle == null ? null : bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
    }

    private static void a(Bundle bundle, String str) {
        String[] split = str.split("/", 2);
        if (split.length != 0) {
            String str2 = split[0];
            if (split.length == 1) {
                bundle.remove(str2);
                return;
            }
            Bundle bundle2 = bundle.getBundle(str2);
            if (bundle2 != null) {
                a(bundle2, split[1]);
            }
        }
    }

    private static void a(String str, sn snVar) {
        if (zy.a(2)) {
            ze.a(String.format(str, new Object[]{snVar}));
        }
    }

    private String[] a(String str) {
        try {
            String[] split = str.split("\u0000");
            for (int i = 0; i < split.length; i++) {
                split[i] = new String(Base64.decode(split[i], 0), "UTF-8");
            }
            return split;
        } catch (UnsupportedEncodingException e) {
            return new String[0];
        }
    }

    static ns b(ns nsVar) {
        ns d = d(nsVar);
        Bundle a = a(d);
        if (a == null) {
            a = new Bundle();
            d.m.putBundle("com.google.ads.mediation.admob.AdMobAdapter", a);
        }
        a.putBoolean("_skipMediation", true);
        return d;
    }

    private boolean b(String str) {
        try {
            return Pattern.matches((String) pr.aR.c(), str);
        } catch (Throwable e) {
            v.i().a(e, "InterstitialAdPool.isExcludedAdUnit");
            return false;
        }
    }

    static boolean c(ns nsVar) {
        Bundle bundle = nsVar.m;
        if (bundle == null) {
            return false;
        }
        bundle = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        return bundle != null && bundle.containsKey("_skipMediation");
    }

    static ns d(ns nsVar) {
        Parcel obtain = Parcel.obtain();
        nsVar.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ns nsVar2 = (ns) ns.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        ns.a(nsVar2);
        return nsVar2;
    }

    private static ns e(ns nsVar) {
        ns d = d(nsVar);
        for (String a : ((String) pr.aN.c()).split(",")) {
            a(d.m, a);
        }
        return d;
    }

    private String e() {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                stringBuilder.append(Base64.encodeToString(((sn) it.next()).toString().getBytes("UTF-8"), 0));
                if (it.hasNext()) {
                    stringBuilder.append("\u0000");
                }
            }
            return stringBuilder.toString();
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

    a a(ns nsVar, String str) {
        if (b(str)) {
            return null;
        }
        so soVar;
        int i = new a(this.c.a()).a().m;
        ns e = e(nsVar);
        sn snVar = new sn(e, str, i);
        so soVar2 = (so) this.a.get(snVar);
        if (soVar2 == null) {
            a("Interstitial pool created at %s.", snVar);
            soVar2 = new so(e, str, i);
            this.a.put(snVar, soVar2);
            soVar = soVar2;
        } else {
            soVar = soVar2;
        }
        this.b.remove(snVar);
        this.b.add(snVar);
        soVar.g();
        while (this.b.size() > ((Integer) pr.aO.c()).intValue()) {
            sn snVar2 = (sn) this.b.remove();
            so soVar3 = (so) this.a.get(snVar2);
            a("Evicting interstitial queue for %s.", snVar2);
            while (soVar3.d() > 0) {
                soVar3.a(null).a.N();
            }
            this.a.remove(snVar2);
        }
        while (soVar.d() > 0) {
            a a = soVar.a(e);
            if (!a.e || v.k().a() - a.d <= 1000 * ((long) ((Integer) pr.aQ.c()).intValue())) {
                String str2 = a.b != null ? " (inline) " : " ";
                a(new StringBuilder(String.valueOf(str2).length() + 34).append("Pooled interstitial").append(str2).append("returned at %s.").toString(), snVar);
                return a;
            }
            a("Expired interstitial at %s.", snVar);
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void a() {
        /*
        r9 = this;
        r8 = 2;
        r0 = r9.c;
        if (r0 != 0) goto L_0x0006;
    L_0x0005:
        return;
    L_0x0006:
        r0 = r9.a;
        r0 = r0.entrySet();
        r3 = r0.iterator();
    L_0x0010:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0076;
    L_0x0016:
        r0 = r3.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r0.getKey();
        r1 = (com.google.android.gms.b.sn) r1;
        r0 = r0.getValue();
        r0 = (com.google.android.gms.b.so) r0;
        r2 = com.google.android.gms.b.zy.a(r8);
        if (r2 == 0) goto L_0x0056;
    L_0x002e:
        r2 = r0.d();
        r4 = r0.e();
        if (r4 >= r2) goto L_0x0056;
    L_0x0038:
        r5 = "Loading %s/%s pooled interstitials for %s.";
        r6 = 3;
        r6 = new java.lang.Object[r6];
        r7 = 0;
        r4 = r2 - r4;
        r4 = java.lang.Integer.valueOf(r4);
        r6[r7] = r4;
        r4 = 1;
        r2 = java.lang.Integer.valueOf(r2);
        r6[r4] = r2;
        r6[r8] = r1;
        r2 = java.lang.String.format(r5, r6);
        com.google.android.gms.b.ze.a(r2);
    L_0x0056:
        r0.f();
    L_0x0059:
        r4 = r0.d();
        r2 = com.google.android.gms.b.pr.aP;
        r2 = r2.c();
        r2 = (java.lang.Integer) r2;
        r2 = r2.intValue();
        if (r4 >= r2) goto L_0x0010;
    L_0x006b:
        r2 = "Pooling and loading one new interstitial for %s.";
        a(r2, r1);
        r2 = r9.c;
        r0.a(r2);
        goto L_0x0059;
    L_0x0076:
        r9.b();
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.sm.a():void");
    }

    void a(sj sjVar) {
        if (this.c == null) {
            this.c = sjVar.b();
            c();
        }
    }

    void b() {
        if (this.c != null) {
            Editor edit = this.c.a().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0).edit();
            edit.clear();
            for (Entry entry : this.a.entrySet()) {
                sn snVar = (sn) entry.getKey();
                so soVar = (so) entry.getValue();
                if (soVar.h()) {
                    edit.putString(snVar.toString(), new sq(soVar).a());
                    a("Saved interstitial queue for %s.", snVar);
                }
            }
            edit.putString("PoolKeys", e());
            edit.apply();
        }
    }

    void b(ns nsVar, String str) {
        if (this.c != null) {
            int i = new a(this.c.a()).a().m;
            ns e = e(nsVar);
            sn snVar = new sn(e, str, i);
            so soVar = (so) this.a.get(snVar);
            if (soVar == null) {
                a("Interstitial pool created at %s.", snVar);
                soVar = new so(e, str, i);
                this.a.put(snVar, soVar);
            }
            soVar.a(this.c, nsVar);
            soVar.g();
            a("Inline entry added to the queue at %s.", snVar);
        }
    }

    void c() {
        if (this.c != null) {
            SharedPreferences sharedPreferences = this.c.a().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
            d();
            try {
                Map hashMap = new HashMap();
                for (Entry entry : sharedPreferences.getAll().entrySet()) {
                    if (!((String) entry.getKey()).equals("PoolKeys")) {
                        sq a = sq.a((String) entry.getValue());
                        sn snVar = new sn(a.a, a.b, a.c);
                        if (!this.a.containsKey(snVar)) {
                            this.a.put(snVar, new so(a.a, a.b, a.c));
                            hashMap.put(snVar.toString(), snVar);
                            a("Restored interstitial queue for %s.", snVar);
                        }
                    }
                }
                for (Object obj : a(sharedPreferences.getString("PoolKeys", ""))) {
                    sn snVar2 = (sn) hashMap.get(obj);
                    if (this.a.containsKey(snVar2)) {
                        this.b.add(snVar2);
                    }
                }
            } catch (Throwable th) {
                v.i().a(th, "InterstitialAdPool.restore");
                zy.c("Malformed preferences value for InterstitialAdPool.", th);
                this.a.clear();
                this.b.clear();
            }
        }
    }

    void d() {
        while (this.b.size() > 0) {
            sn snVar = (sn) this.b.remove();
            so soVar = (so) this.a.get(snVar);
            a("Flushing interstitial queue for %s.", snVar);
            while (soVar.d() > 0) {
                soVar.a(null).a.N();
            }
            this.a.remove(snVar);
        }
    }
}
