package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zzab;
import com.google.android.gms.ads.internal.client.zzap;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzig;

@zzig
public final class VideoController {
    private final Object zzpp = new Object();
    private zzab zzpq;
    private VideoLifecycleCallbacks zzpr;

    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }
    }

    public VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.zzpp) {
            videoLifecycleCallbacks = this.zzpr;
        }
        return videoLifecycleCallbacks;
    }

    public boolean hasVideoContent() {
        boolean z;
        synchronized (this.zzpp) {
            z = this.zzpq != null;
        }
        return z;
    }

    public void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        zzaa.zzb((Object) videoLifecycleCallbacks, (Object) "VideoLifecycleCallbacks may not be null.");
        synchronized (this.zzpp) {
            this.zzpr = videoLifecycleCallbacks;
            if (this.zzpq == null) {
                return;
            }
            try {
                this.zzpq.zza(new zzap(videoLifecycleCallbacks));
            } catch (Throwable e) {
                zzb.zzb("Unable to call setVideoLifecycleCallbacks on video controller.", e);
            }
        }
    }

    public void zza(zzab com_google_android_gms_ads_internal_client_zzab) {
        synchronized (this.zzpp) {
            this.zzpq = com_google_android_gms_ads_internal_client_zzab;
            if (this.zzpr != null) {
                setVideoLifecycleCallbacks(this.zzpr);
            }
        }
    }
}
