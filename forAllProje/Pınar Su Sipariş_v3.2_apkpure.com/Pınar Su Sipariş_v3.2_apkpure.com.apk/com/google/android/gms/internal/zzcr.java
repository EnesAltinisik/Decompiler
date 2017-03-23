package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@zzig
public class zzcr {
    private final Collection<zzcq> zzwS = new ArrayList();
    private final Collection<zzcq<String>> zzwT = new ArrayList();
    private final Collection<zzcq<String>> zzwU = new ArrayList();

    public void zza(zzcq com_google_android_gms_internal_zzcq) {
        this.zzwS.add(com_google_android_gms_internal_zzcq);
    }

    public void zzb(zzcq<String> com_google_android_gms_internal_zzcq_java_lang_String) {
        this.zzwT.add(com_google_android_gms_internal_zzcq_java_lang_String);
    }

    public void zzc(zzcq<String> com_google_android_gms_internal_zzcq_java_lang_String) {
        this.zzwU.add(com_google_android_gms_internal_zzcq_java_lang_String);
    }

    public List<String> zzer() {
        List<String> arrayList = new ArrayList();
        for (zzcq com_google_android_gms_internal_zzcq : this.zzwT) {
            String str = (String) com_google_android_gms_internal_zzcq.get();
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public List<String> zzes() {
        List<String> zzer = zzer();
        for (zzcq com_google_android_gms_internal_zzcq : this.zzwU) {
            String str = (String) com_google_android_gms_internal_zzcq.get();
            if (str != null) {
                zzer.add(str);
            }
        }
        return zzer;
    }
}
