package com.google.firebase;

import com.google.android.gms.common.internal.zzaa;

public class FirebaseException extends Exception {
    @Deprecated
    protected FirebaseException() {
    }

    public FirebaseException(String str) {
        super(zzaa.zzh(str, "Detail message must not be empty"));
    }

    public FirebaseException(String str, Throwable th) {
        super(zzaa.zzh(str, "Detail message must not be empty"), th);
    }
}
