package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.support.v4.b.a;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.zzpa;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class zzb extends a<Void> implements zzpa {
    private Semaphore zzacI = new Semaphore(0);
    private Set<GoogleApiClient> zzacJ;

    public zzb(Context context, Set<GoogleApiClient> set) {
        super(context);
        this.zzacJ = set;
    }

    public /* synthetic */ Object loadInBackground() {
        return zzpq();
    }

    protected void onStartLoading() {
        this.zzacI.drainPermits();
        forceLoad();
    }

    public Void zzpq() {
        int i = 0;
        for (GoogleApiClient zza : this.zzacJ) {
            i = zza.zza((zzpa) this) ? i + 1 : i;
        }
        try {
            this.zzacI.tryAcquire(i, 5, TimeUnit.SECONDS);
        } catch (Throwable e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
        return null;
    }

    public void zzpr() {
        this.zzacI.release();
    }
}
