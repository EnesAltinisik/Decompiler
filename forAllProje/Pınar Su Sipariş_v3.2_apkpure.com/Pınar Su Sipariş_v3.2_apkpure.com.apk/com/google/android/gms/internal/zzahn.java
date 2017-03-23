package com.google.android.gms.internal;

import com.google.android.gms.internal.zzahu.zza;
import java.util.Collections;
import java.util.Iterator;

public class zzahn extends zzahj implements zzahu {
    private static final zzahn zzbQV = new zzahn();

    private zzahn() {
    }

    public static zzahn zzTA() {
        return zzbQV;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return zzg((zzahu) obj);
    }

    public boolean equals(Object obj) {
        if (obj instanceof zzahn) {
            return true;
        }
        boolean z = (obj instanceof zzahu) && ((zzahu) obj).isEmpty() && zzTp().equals(((zzahu) obj).zzTp());
        return z;
    }

    public int getChildCount() {
        return 0;
    }

    public Object getValue() {
        return null;
    }

    public Object getValue(boolean z) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator<zzaht> iterator() {
        return Collections.emptyList().iterator();
    }

    public String toString() {
        return "<Empty Node>";
    }

    public zzahu zzO(zzafa com_google_android_gms_internal_zzafa) {
        return this;
    }

    public Iterator<zzaht> zzPw() {
        return Collections.emptyList().iterator();
    }

    public String zzTn() {
        return "";
    }

    public boolean zzTo() {
        return false;
    }

    public zzahu zzTp() {
        return this;
    }

    public String zza(zza com_google_android_gms_internal_zzahu_zza) {
        return "";
    }

    public zzahu zze(zzahi com_google_android_gms_internal_zzahi, zzahu com_google_android_gms_internal_zzahu) {
        return (com_google_android_gms_internal_zzahu.isEmpty() || com_google_android_gms_internal_zzahi.zzTl()) ? this : new zzahj().zze(com_google_android_gms_internal_zzahi, com_google_android_gms_internal_zzahu);
    }

    public /* synthetic */ zzahu zzf(zzahu com_google_android_gms_internal_zzahu) {
        return zzk(com_google_android_gms_internal_zzahu);
    }

    public int zzg(zzahu com_google_android_gms_internal_zzahu) {
        return com_google_android_gms_internal_zzahu.isEmpty() ? 0 : -1;
    }

    public zzahn zzk(zzahu com_google_android_gms_internal_zzahu) {
        return this;
    }

    public boolean zzk(zzahi com_google_android_gms_internal_zzahi) {
        return false;
    }

    public zzahi zzl(zzahi com_google_android_gms_internal_zzahi) {
        return null;
    }

    public zzahu zzl(zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu) {
        if (com_google_android_gms_internal_zzafa.isEmpty()) {
            return com_google_android_gms_internal_zzahu;
        }
        zzahi zzRt = com_google_android_gms_internal_zzafa.zzRt();
        return zze(zzRt, zzm(zzRt).zzl(com_google_android_gms_internal_zzafa.zzRu(), com_google_android_gms_internal_zzahu));
    }

    public zzahu zzm(zzahi com_google_android_gms_internal_zzahi) {
        return this;
    }
}
