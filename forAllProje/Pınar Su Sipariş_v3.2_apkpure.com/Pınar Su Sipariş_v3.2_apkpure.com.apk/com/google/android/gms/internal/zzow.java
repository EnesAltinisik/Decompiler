package com.google.android.gms.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;

public class zzow extends zznu {
    private TaskCompletionSource<Void> zzalF = new TaskCompletionSource();

    private zzow(zzor com_google_android_gms_internal_zzor) {
        super(com_google_android_gms_internal_zzor);
        this.zzaop.zza("GmsAvailabilityHelper", (zzoq) this);
    }

    public static zzow zzu(Activity activity) {
        zzor zzs = zzoq.zzs(activity);
        zzow com_google_android_gms_internal_zzow = (zzow) zzs.zza("GmsAvailabilityHelper", zzow.class);
        if (com_google_android_gms_internal_zzow == null) {
            return new zzow(zzs);
        }
        if (!com_google_android_gms_internal_zzow.zzalF.getTask().isComplete()) {
            return com_google_android_gms_internal_zzow;
        }
        com_google_android_gms_internal_zzow.zzalF = new TaskCompletionSource();
        return com_google_android_gms_internal_zzow;
    }

    public Task<Void> getTask() {
        return this.zzalF.getTask();
    }

    public void onStop() {
        super.onStop();
        this.zzalF.setException(new CancellationException());
    }

    protected void zza(ConnectionResult connectionResult, int i) {
        this.zzalF.setException(new Exception());
    }

    public void zzk(ConnectionResult connectionResult) {
        zzb(connectionResult, 0);
    }

    protected void zzrA() {
        int isGooglePlayServicesAvailable = this.zzaln.isGooglePlayServicesAvailable(this.zzaop.zzsF());
        if (isGooglePlayServicesAvailable == 0) {
            this.zzalF.setResult(null);
        } else {
            zzk(new ConnectionResult(isGooglePlayServicesAvailable, null));
        }
    }
}
