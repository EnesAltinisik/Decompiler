package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.plus.PlusShare;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class zzaai extends zzvj {
    private static final Set<String> zzbuD = new HashSet(Arrays.asList(new String[]{"GET", "HEAD", "POST", "PUT"}));
    private final zzug zzbuC;

    public zzaai(zzug com_google_android_gms_internal_zzug) {
        this.zzbuC = com_google_android_gms_internal_zzug;
    }

    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        Map map;
        String str = null;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length == 1);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabn);
        zzabh zzhu = com_google_android_gms_internal_zzabh_Arr[0].zzhu(PlusShare.KEY_CALL_TO_ACTION_URL);
        zzaa.zzaj(zzhu instanceof zzabp);
        String str2 = (String) ((zzabp) zzhu).zzMk();
        zzhu = com_google_android_gms_internal_zzabh_Arr[0].zzhu("method");
        if (zzhu == zzabl.zzbvN) {
            zzhu = new zzabp("GET");
        }
        zzaa.zzaj(zzhu instanceof zzabp);
        String str3 = (String) ((zzabp) zzhu).zzMk();
        zzaa.zzaj(zzbuD.contains(str3));
        zzhu = com_google_android_gms_internal_zzabh_Arr[0].zzhu("uniqueId");
        boolean z = zzhu == zzabl.zzbvN || zzhu == zzabl.zzbvM || (zzhu instanceof zzabp);
        zzaa.zzaj(z);
        String str4 = (zzhu == zzabl.zzbvN || zzhu == zzabl.zzbvM) ? null : (String) ((zzabp) zzhu).zzMk();
        zzhu = com_google_android_gms_internal_zzabh_Arr[0].zzhu("headers");
        boolean z2 = zzhu == zzabl.zzbvN || (zzhu instanceof zzabn);
        zzaa.zzaj(z2);
        Map hashMap = new HashMap();
        if (zzhu == zzabl.zzbvN) {
            map = null;
        } else {
            for (Entry entry : ((Map) ((zzabn) zzhu).zzMk()).entrySet()) {
                String str5 = (String) entry.getKey();
                zzhu = (zzabh) entry.getValue();
                if (zzhu instanceof zzabp) {
                    hashMap.put(str5, (String) ((zzabp) zzhu).zzMk());
                } else {
                    zzun.zzaW(String.format("Ignore the non-string value of header key %s.", new Object[]{str5}));
                }
            }
            map = hashMap;
        }
        zzhu = com_google_android_gms_internal_zzabh_Arr[0].zzhu("body");
        boolean z3 = zzhu == zzabl.zzbvN || (zzhu instanceof zzabp);
        zzaa.zzaj(z3);
        if (zzhu != zzabl.zzbvN) {
            str = (String) ((zzabp) zzhu).zzMk();
        }
        if ((str3.equals("GET") || str3.equals("HEAD")) && str != null) {
            zzun.zzaW(String.format("Body of %s hit will be ignored: %s.", new Object[]{str3, str}));
        }
        this.zzbuC.zza(str2, str3, str4, map, str);
        zzun.v(String.format("QueueRequest: url = %s, method = %s, uniqueId = %s, headers = %s, body = %s", new Object[]{str2, str3, str4, map, str}));
        return zzabl.zzbvN;
    }
}
