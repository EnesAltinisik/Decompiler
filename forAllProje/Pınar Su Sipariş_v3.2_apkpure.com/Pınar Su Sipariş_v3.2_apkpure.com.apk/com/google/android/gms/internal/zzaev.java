package com.google.android.gms.internal;

import com.google.android.gms.internal.zzahg.zza;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.Logger.Level;

public class zzaev extends zzaeu {
    public synchronized void setLogLevel(Level level) {
        zzQX();
        switch (level) {
            case DEBUG:
                this.zzbLt = zza.DEBUG;
                break;
            case INFO:
                this.zzbLt = zza.INFO;
                break;
            case WARN:
                this.zzbLt = zza.WARN;
                break;
            case ERROR:
                this.zzbLt = zza.ERROR;
                break;
            case NONE:
                this.zzbLt = zza.NONE;
                break;
            default:
                String valueOf = String.valueOf(level);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 19).append("Unknown log level: ").append(valueOf).toString());
        }
    }

    public synchronized void setPersistenceEnabled(boolean z) {
        zzQX();
        this.zzbIX = z;
    }

    public synchronized void zze(FirebaseApp firebaseApp) {
        this.zzbHJ = firebaseApp;
    }

    public synchronized void zzie(String str) {
        zzQX();
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Session identifier is not allowed to be empty or null!");
        }
        this.zzbLs = str;
    }
}
