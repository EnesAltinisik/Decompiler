package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable {
    private static final Object zzaru = new Object();
    private static ClassLoader zzarv = null;
    private static Integer zzarw = null;
    private boolean zzarx = false;

    private static boolean zzd(Class<?> cls) {
        boolean z = false;
        try {
            z = SafeParcelable.NULL.equals(cls.getField("NULL").get(null));
        } catch (NoSuchFieldException e) {
        } catch (IllegalAccessException e2) {
        }
        return z;
    }

    protected static boolean zzde(String str) {
        ClassLoader zztE = zztE();
        if (zztE == null) {
            return true;
        }
        try {
            return zzd(zztE.loadClass(str));
        } catch (Exception e) {
            return false;
        }
    }

    protected static ClassLoader zztE() {
        synchronized (zzaru) {
        }
        return null;
    }

    protected static Integer zztF() {
        synchronized (zzaru) {
        }
        return null;
    }

    protected boolean zztG() {
        return false;
    }
}
