package com.google.android.gms.identity.intents;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.Api.zzf;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.internal.zznt;
import com.google.android.gms.internal.zzsk;

public final class Address {
    public static final Api<AddressOptions> API = new Api("Address.API", zzaaA, zzaaz);
    private static final zza<zzsk, AddressOptions> zzaaA = new zza<zzsk, AddressOptions>() {
        public zzsk a(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, AddressOptions addressOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            zzaa.zzb(context instanceof Activity, (Object) "An Activity must be used for Address APIs");
            if (addressOptions == null) {
                addressOptions = new AddressOptions();
            }
            return new zzsk((Activity) context, looper, com_google_android_gms_common_internal_zzg, addressOptions.theme, connectionCallbacks, onConnectionFailedListener);
        }

        public /* synthetic */ zze zza(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return a(context, looper, com_google_android_gms_common_internal_zzg, (AddressOptions) obj, connectionCallbacks, onConnectionFailedListener);
        }
    };
    static final zzf<zzsk> zzaaz = new zzf();

    private static abstract class a extends zznt.zza<Status, zzsk> {
        public a(GoogleApiClient googleApiClient) {
            super(Address.zzaaz, googleApiClient);
        }

        public Status a(Status status) {
            return status;
        }

        public /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    class AnonymousClass2 extends a {
        final /* synthetic */ UserAddressRequest a;
        final /* synthetic */ int b;

        AnonymousClass2(GoogleApiClient googleApiClient, UserAddressRequest userAddressRequest, int i) {
            this.a = userAddressRequest;
            this.b = i;
            super(googleApiClient);
        }

        protected void a(zzsk com_google_android_gms_internal_zzsk) throws RemoteException {
            com_google_android_gms_internal_zzsk.zza(this.a, this.b);
            zzb(Status.zzalw);
        }

        protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
            a((zzsk) com_google_android_gms_common_api_Api_zzb);
        }
    }

    public static final class AddressOptions implements HasOptions {
        public final int theme;

        public AddressOptions() {
            this.theme = 0;
        }

        public AddressOptions(int i) {
            this.theme = i;
        }
    }

    public static void requestUserAddress(GoogleApiClient googleApiClient, UserAddressRequest userAddressRequest, int i) {
        googleApiClient.zzc(new AnonymousClass2(googleApiClient, userAddressRequest, i));
    }
}
