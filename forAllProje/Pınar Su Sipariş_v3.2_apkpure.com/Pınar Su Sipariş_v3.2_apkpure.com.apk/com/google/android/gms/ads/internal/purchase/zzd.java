package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.zzhg.zza;
import com.google.android.gms.internal.zzig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@zzig
public class zzd extends zza {
    private Context mContext;
    private String zzJq;
    private ArrayList<String> zzJr;
    private String zztK;

    public zzd(String str, ArrayList<String> arrayList, Context context, String str2) {
        this.zzJq = str;
        this.zzJr = arrayList;
        this.zztK = str2;
        this.mContext = context;
    }

    public String getProductId() {
        return this.zzJq;
    }

    public void recordPlayBillingResolution(int i) {
        if (i == 0) {
            zzhm();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("google_play_status", String.valueOf(i));
        hashMap.put("sku", this.zzJq);
        hashMap.put("status", String.valueOf(zzG(i)));
        List linkedList = new LinkedList();
        Iterator it = this.zzJr.iterator();
        while (it.hasNext()) {
            linkedList.add(zza((String) it.next(), hashMap));
        }
        zzu.zzck().zza(this.mContext, this.zztK, linkedList);
    }

    public void recordResolution(int i) {
        if (i == 1) {
            zzhm();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("status", String.valueOf(i));
        hashMap.put("sku", this.zzJq);
        List linkedList = new LinkedList();
        Iterator it = this.zzJr.iterator();
        while (it.hasNext()) {
            linkedList.add(zza((String) it.next(), hashMap));
        }
        zzu.zzck().zza(this.mContext, this.zztK, linkedList);
    }

    protected int zzG(int i) {
        return i == 0 ? 1 : i == 1 ? 2 : i == 4 ? 3 : 0;
    }

    protected String zza(String str, HashMap<String, String> hashMap) {
        String str2;
        String str3 = "";
        try {
            str2 = this.mContext.getPackageManager().getPackageInfo(this.mContext.getPackageName(), 0).versionName;
        } catch (Throwable e) {
            zzb.zzd("Error to retrieve app version", e);
            str2 = str3;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - zzu.zzcn().zziF().zziS();
        for (String str32 : hashMap.keySet()) {
            str = str.replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{str32}), String.format("$1%s$2", new Object[]{hashMap.get(str32)}));
        }
        return str.replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"sessionid"}), String.format("$1%s$2", new Object[]{Uri.encode(zzu.zzcn().getSessionId())})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"appid"}), String.format("$1%s$2", new Object[]{Uri.encode(r2)})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"osversion"}), String.format("$1%s$2", new Object[]{Uri.encode(String.valueOf(VERSION.SDK_INT))})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"sdkversion"}), String.format("$1%s$2", new Object[]{Uri.encode(this.zztK)})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"appversion"}), String.format("$1%s$2", new Object[]{Uri.encode(str2)})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"timestamp"}), String.format("$1%s$2", new Object[]{Uri.encode(String.valueOf(elapsedRealtime))})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"[^@]+"}), String.format("$1%s$2", new Object[]{""})).replaceAll("@@", "@");
    }

    void zzhm() {
        try {
            this.mContext.getClassLoader().loadClass("com.google.ads.conversiontracking.IAPConversionReporter").getDeclaredMethod("reportWithProductId", new Class[]{Context.class, String.class, String.class, Boolean.TYPE}).invoke(null, new Object[]{this.mContext, this.zzJq, "", Boolean.valueOf(true)});
        } catch (ClassNotFoundException e) {
            zzb.zzaW("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
        } catch (NoSuchMethodException e2) {
            zzb.zzaW("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
        } catch (Throwable e3) {
            zzb.zzd("Fail to report a conversion.", e3);
        }
    }
}
