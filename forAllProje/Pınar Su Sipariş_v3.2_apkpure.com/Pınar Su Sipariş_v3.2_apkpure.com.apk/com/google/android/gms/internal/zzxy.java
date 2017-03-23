package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zzxy extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        boolean z = com_google_android_gms_internal_zzabh_Arr.length == 1 || com_google_android_gms_internal_zzabh_Arr.length == 2;
        zzaa.zzaj(z);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabp);
        Matcher matcher = Pattern.compile(com_google_android_gms_internal_zzabh_Arr.length < 2 ? "" : zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[1])).matcher((String) ((zzabp) com_google_android_gms_internal_zzabh_Arr[0]).zzMk());
        if (!matcher.find()) {
            return zzabl.zzbvM;
        }
        List arrayList = new ArrayList();
        arrayList.add(new zzabp(matcher.group()));
        return new zzabm(arrayList);
    }
}
