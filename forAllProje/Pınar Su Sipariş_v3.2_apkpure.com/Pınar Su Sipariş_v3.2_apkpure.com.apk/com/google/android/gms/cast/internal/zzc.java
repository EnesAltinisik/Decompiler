package com.google.android.gms.cast.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

public abstract class zzc extends zzd {
    protected final Handler mHandler;
    protected final long zzahS;
    protected final Runnable zzahT;
    protected boolean zzahU;

    private class a implements Runnable {
        final /* synthetic */ zzc a;

        private a(zzc com_google_android_gms_cast_internal_zzc) {
            this.a = com_google_android_gms_cast_internal_zzc;
        }

        public void run() {
            this.a.zzahU = false;
            this.a.zzae(this.a.zzB(SystemClock.elapsedRealtime()));
        }
    }

    public zzc(String str, String str2, String str3) {
        this(str, str2, str3, 1000);
    }

    public zzc(String str, String str2, String str3, long j) {
        super(str, str2, str3);
        this.mHandler = new Handler(Looper.getMainLooper());
        this.zzahT = new a();
        this.zzahS = j;
        zzae(false);
    }

    protected abstract boolean zzB(long j);

    protected final void zzae(boolean z) {
        if (this.zzahU != z) {
            this.zzahU = z;
            if (z) {
                this.mHandler.postDelayed(this.zzahT, this.zzahS);
            } else {
                this.mHandler.removeCallbacks(this.zzahT);
            }
        }
    }

    public void zzqo() {
        zzae(false);
    }
}
