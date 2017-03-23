package com.google.android.gms.wearable;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.Api.zzf;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.wearable.internal.zzaz;
import com.google.android.gms.wearable.internal.zzbb;
import com.google.android.gms.wearable.internal.zzbm;
import com.google.android.gms.wearable.internal.zzbp;
import com.google.android.gms.wearable.internal.zzbr;
import com.google.android.gms.wearable.internal.zzj;
import com.google.android.gms.wearable.internal.zzl;
import com.google.android.gms.wearable.internal.zzw;
import com.google.android.gms.wearable.internal.zzx;

public class Wearable {
    public static final Api<WearableOptions> API = new Api("Wearable.API", zzaaA, zzaaz);
    public static final CapabilityApi CapabilityApi = new zzj();
    public static final ChannelApi ChannelApi = new zzl();
    public static final DataApi DataApi = new zzx();
    public static final MessageApi MessageApi = new zzaz();
    public static final NodeApi NodeApi = new zzbb();
    private static final zza<zzbp, WearableOptions> zzaaA = new zza<zzbp, WearableOptions>() {
        public zzbp a(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, WearableOptions wearableOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            if (wearableOptions == null) {
                WearableOptions wearableOptions2 = new WearableOptions(new Builder());
            }
            return new zzbp(context, looper, connectionCallbacks, onConnectionFailedListener, com_google_android_gms_common_internal_zzg);
        }

        public /* synthetic */ zze zza(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return a(context, looper, com_google_android_gms_common_internal_zzg, (WearableOptions) obj, connectionCallbacks, onConnectionFailedListener);
        }
    };
    public static final zzf<zzbp> zzaaz = new zzf();
    public static final zzc zzbBP = new com.google.android.gms.wearable.internal.zzg();
    public static final zza zzbBQ = new com.google.android.gms.wearable.internal.zze();
    public static final zzf zzbBR = new zzw();
    public static final zzi zzbBS = new zzbm();
    public static final zzj zzbBT = new zzbr();

    public static final class WearableOptions implements Optional {

        public static class Builder {
            public WearableOptions build() {
                return new WearableOptions();
            }
        }

        private WearableOptions(Builder builder) {
        }
    }

    private Wearable() {
    }
}
