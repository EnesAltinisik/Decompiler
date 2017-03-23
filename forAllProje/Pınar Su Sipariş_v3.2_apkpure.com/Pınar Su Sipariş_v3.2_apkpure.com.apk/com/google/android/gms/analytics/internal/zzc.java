package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.zzi;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.util.zze;

public class zzc {
    private final zzf zzWg;

    protected zzc(zzf com_google_android_gms_analytics_internal_zzf) {
        zzaa.zzz(com_google_android_gms_analytics_internal_zzf);
        this.zzWg = com_google_android_gms_analytics_internal_zzf;
    }

    private void zza(int i, String str, Object obj, Object obj2, Object obj3) {
        zzaf com_google_android_gms_analytics_internal_zzaf = null;
        if (this.zzWg != null) {
            com_google_android_gms_analytics_internal_zzaf = this.zzWg.zzmd();
        }
        if (com_google_android_gms_analytics_internal_zzaf != null) {
            com_google_android_gms_analytics_internal_zzaf.zza(i, str, obj, obj2, obj3);
            return;
        }
        String str2 = (String) zzy.zzXF.get();
        if (Log.isLoggable(str2, i)) {
            Log.println(i, str2, zzc(str, obj, obj2, obj3));
        }
    }

    protected static String zzc(String str, Object obj, Object obj2, Object obj3) {
        if (str == null) {
            Object obj4 = "";
        }
        Object zzk = zzk(obj);
        Object zzk2 = zzk(obj2);
        Object zzk3 = zzk(obj3);
        StringBuilder stringBuilder = new StringBuilder();
        String str2 = "";
        if (!TextUtils.isEmpty(obj4)) {
            stringBuilder.append(obj4);
            str2 = ": ";
        }
        if (!TextUtils.isEmpty(zzk)) {
            stringBuilder.append(str2);
            stringBuilder.append(zzk);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(zzk2)) {
            stringBuilder.append(str2);
            stringBuilder.append(zzk2);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(zzk3)) {
            stringBuilder.append(str2);
            stringBuilder.append(zzk3);
            str2 = ", ";
        }
        return stringBuilder.toString();
    }

    private static String zzk(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof Boolean)) {
            return obj instanceof Throwable ? ((Throwable) obj).toString() : obj.toString();
        } else {
            return obj == Boolean.TRUE ? "true" : "false";
        }
    }

    protected Context getContext() {
        return this.zzWg.getContext();
    }

    public void zza(String str, Object obj) {
        zza(2, str, obj, null, null);
    }

    public void zza(String str, Object obj, Object obj2) {
        zza(2, str, obj, obj2, null);
    }

    public void zza(String str, Object obj, Object obj2, Object obj3) {
        zza(3, str, obj, obj2, obj3);
    }

    public void zzb(String str, Object obj) {
        zza(3, str, obj, null, null);
    }

    public void zzb(String str, Object obj, Object obj2) {
        zza(3, str, obj, obj2, null);
    }

    public void zzb(String str, Object obj, Object obj2, Object obj3) {
        zza(5, str, obj, obj2, obj3);
    }

    public void zzbG(String str) {
        zza(2, str, null, null, null);
    }

    public void zzbH(String str) {
        zza(3, str, null, null, null);
    }

    public void zzbI(String str) {
        zza(4, str, null, null, null);
    }

    public void zzbJ(String str) {
        zza(5, str, null, null, null);
    }

    public void zzbK(String str) {
        zza(6, str, null, null, null);
    }

    public void zzc(String str, Object obj) {
        zza(4, str, obj, null, null);
    }

    public void zzc(String str, Object obj, Object obj2) {
        zza(5, str, obj, obj2, null);
    }

    public void zzd(String str, Object obj) {
        zza(5, str, obj, null, null);
    }

    public void zzd(String str, Object obj, Object obj2) {
        zza(6, str, obj, obj2, null);
    }

    public void zze(String str, Object obj) {
        zza(6, str, obj, null, null);
    }

    public boolean zziW() {
        return Log.isLoggable((String) zzy.zzXF.get(), 2);
    }

    protected void zzkN() {
        this.zzWg.zzkN();
    }

    public GoogleAnalytics zzkq() {
        return this.zzWg.zzme();
    }

    protected zzb zzkw() {
        return this.zzWg.zzkw();
    }

    protected zzap zzkx() {
        return this.zzWg.zzkx();
    }

    public zzf zzlO() {
        return this.zzWg;
    }

    protected void zzlP() {
        if (zzlS().zzmW()) {
            throw new IllegalStateException("Call only supported on the client side");
        }
    }

    protected zze zzlQ() {
        return this.zzWg.zzlQ();
    }

    protected zzaf zzlR() {
        return this.zzWg.zzlR();
    }

    protected zzr zzlS() {
        return this.zzWg.zzlS();
    }

    protected zzi zzlT() {
        return this.zzWg.zzlT();
    }

    protected zzv zzlU() {
        return this.zzWg.zzlU();
    }

    protected zzai zzlV() {
        return this.zzWg.zzlV();
    }

    protected zzn zzlW() {
        return this.zzWg.zzmh();
    }

    protected zza zzlX() {
        return this.zzWg.zzmg();
    }

    protected zzk zzlY() {
        return this.zzWg.zzlY();
    }

    protected zzu zzlZ() {
        return this.zzWg.zzlZ();
    }
}
