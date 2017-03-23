package com.google.android.gms.cast.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzaa;
import java.util.Locale;

public class zzl {
    private static boolean zzaiJ = false;
    protected final String mTag;
    private final boolean zzaiK;
    private boolean zzaiL;
    private boolean zzaiM;
    private String zzaiN;

    public zzl(String str) {
        this(str, zzqH());
    }

    public zzl(String str, boolean z) {
        zzaa.zzh(str, "The log tag cannot be null or empty.");
        this.mTag = str;
        this.zzaiK = str.length() <= 23;
        this.zzaiL = z;
        this.zzaiM = false;
    }

    public static boolean zzqH() {
        return false;
    }

    public void zza(String str, Object... objArr) {
        if (zzqG()) {
            Log.v(this.mTag, zzg(str, objArr));
        }
    }

    public void zzag(boolean z) {
        this.zzaiL = z;
    }

    public void zzb(String str, Object... objArr) {
        if (zzqF()) {
            Log.d(this.mTag, zzg(str, objArr));
        }
    }

    public void zzb(Throwable th, String str, Object... objArr) {
        if (zzqF()) {
            Log.d(this.mTag, zzg(str, objArr), th);
        }
    }

    public void zzc(String str, Object... objArr) {
        Log.e(this.mTag, zzg(str, objArr));
    }

    public void zzc(Throwable th, String str, Object... objArr) {
        Log.w(this.mTag, zzg(str, objArr), th);
    }

    public void zzcK(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = null;
        } else {
            str2 = String.format("[%s] ", new Object[]{str});
        }
        this.zzaiN = str2;
    }

    public void zze(String str, Object... objArr) {
        Log.i(this.mTag, zzg(str, objArr));
    }

    public void zzf(String str, Object... objArr) {
        Log.w(this.mTag, zzg(str, objArr));
    }

    protected String zzg(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        if (TextUtils.isEmpty(this.zzaiN)) {
            return str;
        }
        String valueOf = String.valueOf(this.zzaiN);
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public boolean zzqF() {
        return this.zzaiL || (this.zzaiK && Log.isLoggable(this.mTag, 3));
    }

    public boolean zzqG() {
        return false;
    }
}
