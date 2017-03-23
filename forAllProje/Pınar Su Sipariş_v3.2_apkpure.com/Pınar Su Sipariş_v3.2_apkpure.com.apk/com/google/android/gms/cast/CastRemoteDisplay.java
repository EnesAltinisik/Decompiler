package com.google.android.gms.cast;

import android.content.Context;
import android.os.Looper;
import android.view.Display;
import com.google.android.gms.cast.internal.zzk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.internal.zzng;
import com.google.android.gms.internal.zznh;

public final class CastRemoteDisplay {
    public static final Api<CastRemoteDisplayOptions> API = new Api("CastRemoteDisplay.API", zzaaA, zzk.zzaiG);
    public static final CastRemoteDisplayApi CastRemoteDisplayApi = new zzng(zzk.zzaiG);
    private static final zza<zznh, CastRemoteDisplayOptions> zzaaA = new zza<zznh, CastRemoteDisplayOptions>() {
        public zznh a(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, CastRemoteDisplayOptions castRemoteDisplayOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zznh(context, looper, com_google_android_gms_common_internal_zzg, castRemoteDisplayOptions.zzaep, castRemoteDisplayOptions.zzaeH, connectionCallbacks, onConnectionFailedListener);
        }

        public /* synthetic */ zze zza(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return a(context, looper, com_google_android_gms_common_internal_zzg, (CastRemoteDisplayOptions) obj, connectionCallbacks, onConnectionFailedListener);
        }
    };

    public static final class CastRemoteDisplayOptions implements HasOptions {
        final CastRemoteDisplaySessionCallbacks zzaeH;
        final CastDevice zzaep;

        public static final class Builder {
            CastRemoteDisplaySessionCallbacks zzaeI;
            CastDevice zzaes;

            public Builder(CastDevice castDevice, CastRemoteDisplaySessionCallbacks castRemoteDisplaySessionCallbacks) {
                zzaa.zzb((Object) castDevice, (Object) "CastDevice parameter cannot be null");
                this.zzaes = castDevice;
                this.zzaeI = castRemoteDisplaySessionCallbacks;
            }

            public CastRemoteDisplayOptions build() {
                return new CastRemoteDisplayOptions();
            }
        }

        private CastRemoteDisplayOptions(Builder builder) {
            this.zzaep = builder.zzaes;
            this.zzaeH = builder.zzaeI;
        }
    }

    public interface CastRemoteDisplaySessionCallbacks {
        void onRemoteDisplayEnded(Status status);
    }

    public interface CastRemoteDisplaySessionResult extends Result {
        Display getPresentationDisplay();
    }

    private CastRemoteDisplay() {
    }
}
