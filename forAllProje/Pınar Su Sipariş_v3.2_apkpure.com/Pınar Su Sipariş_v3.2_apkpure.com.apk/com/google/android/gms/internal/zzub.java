package com.google.android.gms.internal;

import android.content.Context;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class zzub implements zzug {
    private static final Object zzbnE = new Object();
    private static zzub zzbsr;
    private static final Set<String> zzbsu = new HashSet(Arrays.asList(new String[]{"GET", "HEAD", "POST", "PUT"}));
    private au zzbss;
    private ao zzbst;

    private zzub(Context context) {
        this(ap.a(context), new av());
    }

    zzub(ao aoVar, au auVar) {
        this.zzbst = aoVar;
        this.zzbss = auVar;
    }

    public static zzug zzbr(Context context) {
        zzug com_google_android_gms_internal_zzug;
        synchronized (zzbnE) {
            if (zzbsr == null) {
                zzbsr = new zzub(context);
            }
            com_google_android_gms_internal_zzug = zzbsr;
        }
        return com_google_android_gms_internal_zzug;
    }

    public void dispatch() {
        zzuz.a().c();
    }

    public boolean zza(String str, String str2, String str3, Map<String, String> map, String str4) {
        if (str2 != null && !zzbsu.contains(str2)) {
            zzun.zzaW(String.format("Unsupport http method %s. Drop the hit.", new Object[]{str2}));
            return false;
        } else if (zzus.zzLi().isPreview() || this.zzbss.a()) {
            this.zzbst.a(str, str2, str3, map, str4);
            return true;
        } else {
            zzun.zzaW("Too many hits sent too quickly (rate throttled).");
            return false;
        }
    }

    public boolean zzae(String str, String str2) {
        return zza(str, null, str2, null, null);
    }

    public boolean zzgw(String str) {
        return zza(str, null, null, null, null);
    }
}
