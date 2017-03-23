package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzu;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@zzig
public class zzet implements Iterable<zzes> {
    private final List<zzes> zzCx = new LinkedList();

    private zzes zzf(zzla com_google_android_gms_internal_zzla) {
        Iterator it = zzu.zzcD().iterator();
        while (it.hasNext()) {
            zzes com_google_android_gms_internal_zzes = (zzes) it.next();
            if (com_google_android_gms_internal_zzes.zzBb == com_google_android_gms_internal_zzla) {
                return com_google_android_gms_internal_zzes;
            }
        }
        return null;
    }

    public Iterator<zzes> iterator() {
        return this.zzCx.iterator();
    }

    public void zza(zzes com_google_android_gms_internal_zzes) {
        this.zzCx.add(com_google_android_gms_internal_zzes);
    }

    public void zzb(zzes com_google_android_gms_internal_zzes) {
        this.zzCx.remove(com_google_android_gms_internal_zzes);
    }

    public boolean zzd(zzla com_google_android_gms_internal_zzla) {
        zzes zzf = zzf(com_google_android_gms_internal_zzla);
        if (zzf == null) {
            return false;
        }
        zzf.zzCu.abort();
        return true;
    }

    public boolean zze(zzla com_google_android_gms_internal_zzla) {
        return zzf(com_google_android_gms_internal_zzla) != null;
    }

    public int zzfe() {
        return this.zzCx.size();
    }
}
