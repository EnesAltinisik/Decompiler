package com.google.android.gms.internal;

public class zzaiq {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzaiq.class.desiredAssertionStatus());

    private static long zzd(zzahr<?> com_google_android_gms_internal_zzahr_) {
        long j = 8;
        if (!((com_google_android_gms_internal_zzahr_ instanceof zzahm) || (com_google_android_gms_internal_zzahr_ instanceof zzahs))) {
            if (com_google_android_gms_internal_zzahr_ instanceof zzahh) {
                j = 4;
            } else if (com_google_android_gms_internal_zzahr_ instanceof zzaia) {
                j = (long) (((String) com_google_android_gms_internal_zzahr_.getValue()).length() + 2);
            } else {
                String valueOf = String.valueOf(com_google_android_gms_internal_zzahr_.getClass());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 24).append("Unknown leaf node type: ").append(valueOf).toString());
            }
        }
        if (com_google_android_gms_internal_zzahr_.zzTp().isEmpty()) {
            return j;
        }
        return zzd((zzahr) com_google_android_gms_internal_zzahr_.zzTp()) + (24 + j);
    }

    public static long zzs(zzahu com_google_android_gms_internal_zzahu) {
        if (com_google_android_gms_internal_zzahu.isEmpty()) {
            return 4;
        }
        if (com_google_android_gms_internal_zzahu.zzTo()) {
            return zzd((zzahr) com_google_android_gms_internal_zzahu);
        }
        if ($assertionsDisabled || (com_google_android_gms_internal_zzahu instanceof zzahj)) {
            long j = 1;
            for (zzaht com_google_android_gms_internal_zzaht : com_google_android_gms_internal_zzahu) {
                j = zzs(com_google_android_gms_internal_zzaht.zzPj()) + ((j + ((long) com_google_android_gms_internal_zzaht.zzTK().asString().length())) + 4);
            }
            return !com_google_android_gms_internal_zzahu.zzTp().isEmpty() ? (j + 12) + zzd((zzahr) com_google_android_gms_internal_zzahu.zzTp()) : j;
        } else {
            String valueOf = String.valueOf(com_google_android_gms_internal_zzahu.getClass());
            throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Unexpected node type: ").append(valueOf).toString());
        }
    }

    public static int zzt(zzahu com_google_android_gms_internal_zzahu) {
        if (com_google_android_gms_internal_zzahu.isEmpty()) {
            return 0;
        }
        if (com_google_android_gms_internal_zzahu.zzTo()) {
            return 1;
        }
        if ($assertionsDisabled || (com_google_android_gms_internal_zzahu instanceof zzahj)) {
            int i = 0;
            for (zzaht zzPj : com_google_android_gms_internal_zzahu) {
                i = zzt(zzPj.zzPj()) + i;
            }
            return i;
        }
        String valueOf = String.valueOf(com_google_android_gms_internal_zzahu.getClass());
        throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Unexpected node type: ").append(valueOf).toString());
    }
}
