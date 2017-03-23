package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.panorama.PanoramaApi.PanoramaResult;

class aj implements PanoramaResult {
    private final Status a;
    private final Intent b;

    public aj(Status status, Intent intent) {
        this.a = (Status) zzaa.zzz(status);
        this.b = intent;
    }

    public Status getStatus() {
        return this.a;
    }

    public Intent getViewerIntent() {
        return this.b;
    }
}
