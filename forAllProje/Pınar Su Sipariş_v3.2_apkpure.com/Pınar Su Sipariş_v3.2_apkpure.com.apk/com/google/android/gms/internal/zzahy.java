package com.google.android.gms.internal;

import com.google.firebase.database.DatabaseException;

public class zzahy {
    public static zzahu zzTM() {
        return zzahn.zzTA();
    }

    public static zzahu zzar(Object obj) {
        zzahu zzaq = zzahv.zzaq(obj);
        if (zzaq instanceof zzahs) {
            zzaq = new zzahm(Double.valueOf((double) ((Long) zzaq.getValue()).longValue()), zzTM());
        }
        if (zzp(zzaq)) {
            return zzaq;
        }
        throw new DatabaseException("Invalid Firebase Database priority (must be a string, double, ServerValue, or null)");
    }

    public static boolean zzp(zzahu com_google_android_gms_internal_zzahu) {
        return com_google_android_gms_internal_zzahu.zzTp().isEmpty() && (com_google_android_gms_internal_zzahu.isEmpty() || (com_google_android_gms_internal_zzahu instanceof zzahm) || (com_google_android_gms_internal_zzahu instanceof zzaia) || (com_google_android_gms_internal_zzahu instanceof zzahl));
    }
}
