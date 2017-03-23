package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.zzio.zza;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

@zzig
public class zzfb {
    private final Map<u, v> zzDh = new HashMap();
    private final LinkedList<u> zzDi = new LinkedList();
    private zzey zzDj;

    private static void zza(String str, u uVar) {
        if (zzb.zzX(2)) {
            zzjw.v(String.format(str, new Object[]{uVar}));
        }
    }

    private String[] zzad(String str) {
        try {
            String[] split = str.split("\u0000");
            for (int i = 0; i < split.length; i++) {
                split[i] = new String(Base64.decode(split[i], 0), Constants.ENCODING);
            }
            return split;
        } catch (UnsupportedEncodingException e) {
            return new String[0];
        }
    }

    private boolean zzae(String str) {
        try {
            return Pattern.matches((String) zzcu.zzym.get(), str);
        } catch (Throwable e) {
            zzu.zzcn().zzb(e, true);
            return false;
        }
    }

    private static void zzc(Bundle bundle, String str) {
        String[] split = str.split("/", 2);
        if (split.length != 0) {
            String str2 = split[0];
            if (split.length == 1) {
                bundle.remove(str2);
                return;
            }
            Bundle bundle2 = bundle.getBundle(str2);
            if (bundle2 != null) {
                zzc(bundle2, split[1]);
            }
        }
    }

    private String zzfj() {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            Iterator it = this.zzDi.iterator();
            while (it.hasNext()) {
                stringBuilder.append(Base64.encodeToString(((u) it.next()).toString().getBytes(Constants.ENCODING), 0));
                if (it.hasNext()) {
                    stringBuilder.append("\u0000");
                }
            }
            return stringBuilder.toString();
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

    static Bundle zzi(AdRequestParcel adRequestParcel) {
        Bundle bundle = adRequestParcel.zzuX;
        return bundle == null ? null : bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
    }

    static AdRequestParcel zzj(AdRequestParcel adRequestParcel) {
        Parcel obtain = Parcel.obtain();
        adRequestParcel.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        AdRequestParcel adRequestParcel2 = (AdRequestParcel) AdRequestParcel.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        Bundle zzi = zzi(adRequestParcel2);
        if (zzi == null) {
            zzi = new Bundle();
            adRequestParcel2.zzuX.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzi);
        }
        zzi.putBoolean("_skipMediation", true);
        return adRequestParcel2;
    }

    static boolean zzk(AdRequestParcel adRequestParcel) {
        Bundle bundle = adRequestParcel.zzuX;
        if (bundle == null) {
            return false;
        }
        bundle = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        return bundle != null && bundle.containsKey("_skipMediation");
    }

    private static AdRequestParcel zzl(AdRequestParcel adRequestParcel) {
        Parcel obtain = Parcel.obtain();
        adRequestParcel.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        AdRequestParcel adRequestParcel2 = (AdRequestParcel) AdRequestParcel.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        for (String zzc : ((String) zzcu.zzyi.get()).split(",")) {
            zzc(adRequestParcel2.zzuX, zzc);
        }
        return adRequestParcel2;
    }

    void flush() {
        while (this.zzDi.size() > 0) {
            u uVar = (u) this.zzDi.remove();
            v vVar = (v) this.zzDh.get(uVar);
            zza("Flushing interstitial queue for %s.", uVar);
            while (vVar.d() > 0) {
                vVar.a(null).a.zzbO();
            }
            this.zzDh.remove(uVar);
        }
    }

    void restore() {
        Throwable e;
        if (this.zzDj != null) {
            u uVar;
            SharedPreferences sharedPreferences = this.zzDj.getApplicationContext().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
            flush();
            Map hashMap = new HashMap();
            for (Entry entry : sharedPreferences.getAll().entrySet()) {
                try {
                    if (!((String) entry.getKey()).equals("PoolKeys")) {
                        w wVar = new w((String) entry.getValue());
                        uVar = new u(wVar.a, wVar.b, wVar.c);
                        if (!this.zzDh.containsKey(uVar)) {
                            this.zzDh.put(uVar, new v(wVar.a, wVar.b, wVar.c));
                            hashMap.put(uVar.toString(), uVar);
                            zza("Restored interstitial queue for %s.", uVar);
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    zzb.zzd("Malformed preferences value for InterstitialAdPool.", e);
                } catch (ClassCastException e3) {
                    e = e3;
                    zzb.zzd("Malformed preferences value for InterstitialAdPool.", e);
                }
            }
            for (Object obj : zzad(sharedPreferences.getString("PoolKeys", ""))) {
                uVar = (u) hashMap.get(obj);
                if (this.zzDh.containsKey(uVar)) {
                    this.zzDi.add(uVar);
                }
            }
        }
    }

    void save() {
        if (this.zzDj != null) {
            Editor edit = this.zzDj.getApplicationContext().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0).edit();
            edit.clear();
            for (Entry entry : this.zzDh.entrySet()) {
                u uVar = (u) entry.getKey();
                v vVar = (v) entry.getValue();
                if (vVar.h()) {
                    edit.putString(uVar.toString(), new w(vVar).a());
                    zza("Saved interstitial queue for %s.", uVar);
                }
            }
            edit.putString("PoolKeys", zzfj());
            edit.apply();
        }
    }

    a zza(AdRequestParcel adRequestParcel, String str) {
        if (zzae(str)) {
            return null;
        }
        v vVar;
        int i = new zza(this.zzDj.getApplicationContext()).zzii().zzOh;
        AdRequestParcel zzl = zzl(adRequestParcel);
        u uVar = new u(zzl, str, i);
        v vVar2 = (v) this.zzDh.get(uVar);
        if (vVar2 == null) {
            zza("Interstitial pool created at %s.", uVar);
            vVar2 = new v(zzl, str, i);
            this.zzDh.put(uVar, vVar2);
            vVar = vVar2;
        } else {
            vVar = vVar2;
        }
        this.zzDi.remove(uVar);
        this.zzDi.add(uVar);
        vVar.g();
        while (this.zzDi.size() > ((Integer) zzcu.zzyj.get()).intValue()) {
            u uVar2 = (u) this.zzDi.remove();
            v vVar3 = (v) this.zzDh.get(uVar2);
            zza("Evicting interstitial queue for %s.", uVar2);
            while (vVar3.d() > 0) {
                vVar3.a(null).a.zzbO();
            }
            this.zzDh.remove(uVar2);
        }
        while (vVar.d() > 0) {
            a a = vVar.a(zzl);
            if (!a.e || zzu.zzco().currentTimeMillis() - a.d <= 1000 * ((long) ((Integer) zzcu.zzyl.get()).intValue())) {
                String str2 = a.b != null ? " (inline) " : " ";
                zza(new StringBuilder(String.valueOf(str2).length() + 34).append("Pooled interstitial").append(str2).append("returned at %s.").toString(), uVar);
                return a;
            }
            zza("Expired interstitial at %s.", uVar);
        }
        return null;
    }

    void zza(zzey com_google_android_gms_internal_zzey) {
        if (this.zzDj == null) {
            this.zzDj = com_google_android_gms_internal_zzey.zzfh();
            restore();
        }
    }

    void zzb(AdRequestParcel adRequestParcel, String str) {
        if (this.zzDj != null) {
            int i = new zza(this.zzDj.getApplicationContext()).zzii().zzOh;
            AdRequestParcel zzl = zzl(adRequestParcel);
            u uVar = new u(zzl, str, i);
            v vVar = (v) this.zzDh.get(uVar);
            if (vVar == null) {
                zza("Interstitial pool created at %s.", uVar);
                vVar = new v(zzl, str, i);
                this.zzDh.put(uVar, vVar);
            }
            vVar.a(this.zzDj, adRequestParcel);
            vVar.g();
            zza("Inline entry added to the queue at %s.", uVar);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void zzfi() {
        /*
        r9 = this;
        r8 = 2;
        r0 = r9.zzDj;
        if (r0 != 0) goto L_0x0006;
    L_0x0005:
        return;
    L_0x0006:
        r0 = r9.zzDh;
        r0 = r0.entrySet();
        r3 = r0.iterator();
    L_0x0010:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0076;
    L_0x0016:
        r0 = r3.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r0.getKey();
        r1 = (com.google.android.gms.internal.u) r1;
        r0 = r0.getValue();
        r0 = (com.google.android.gms.internal.v) r0;
        r2 = com.google.android.gms.ads.internal.util.client.zzb.zzX(r8);
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
        com.google.android.gms.internal.zzjw.v(r2);
    L_0x0056:
        r0.f();
    L_0x0059:
        r4 = r0.d();
        r2 = com.google.android.gms.internal.zzcu.zzyk;
        r2 = r2.get();
        r2 = (java.lang.Integer) r2;
        r2 = r2.intValue();
        if (r4 >= r2) goto L_0x0010;
    L_0x006b:
        r2 = "Pooling and loading one new interstitial for %s.";
        zza(r2, r1);
        r2 = r9.zzDj;
        r0.a(r2);
        goto L_0x0059;
    L_0x0076:
        r9.save();
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfb.zzfi():void");
    }
}
