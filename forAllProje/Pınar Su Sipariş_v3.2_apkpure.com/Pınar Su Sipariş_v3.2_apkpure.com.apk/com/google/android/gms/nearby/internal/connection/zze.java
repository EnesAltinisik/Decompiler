package com.google.android.gms.nearby.internal.connection;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zzf;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.internal.zznt;
import com.google.android.gms.internal.zzou;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.AppMetadata;
import com.google.android.gms.nearby.connection.Connections;
import com.google.android.gms.nearby.connection.Connections.ConnectionRequestListener;
import com.google.android.gms.nearby.connection.Connections.ConnectionResponseCallback;
import com.google.android.gms.nearby.connection.Connections.EndpointDiscoveryListener;
import com.google.android.gms.nearby.connection.Connections.MessageListener;
import com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.Strategy;
import java.util.List;

public final class zze implements Connections {
    public static final zza<zzd, NoOptions> zzaaA = new zza<zzd, NoOptions>() {
        public zzd a(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, NoOptions noOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zzd(context, looper, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
        }

        public /* synthetic */ com.google.android.gms.common.api.Api.zze zza(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return a(context, looper, com_google_android_gms_common_internal_zzg, (NoOptions) obj, connectionCallbacks, onConnectionFailedListener);
        }
    };
    public static final zzf<zzd> zzaaz = new zzf();

    private static abstract class a<R extends Result> extends zznt.zza<R, zzd> {
        public a(GoogleApiClient googleApiClient) {
            super(Nearby.CONNECTIONS_API, googleApiClient);
        }
    }

    private static abstract class b extends a<StartAdvertisingResult> {
        private b(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public StartAdvertisingResult a(final Status status) {
            return new StartAdvertisingResult(this) {
                final /* synthetic */ b b;

                public String getLocalEndpointName() {
                    return null;
                }

                public Status getStatus() {
                    return status;
                }
            };
        }

        public /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    private static abstract class c extends a<Status> {
        private c(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public Status a(Status status) {
            return status;
        }

        public /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    public static zzd zzd(GoogleApiClient googleApiClient, boolean z) {
        zzaa.zzb(googleApiClient != null, (Object) "GoogleApiClient parameter is required.");
        zzaa.zza(googleApiClient.isConnected(), (Object) "GoogleApiClient must be connected.");
        return zze(googleApiClient, z);
    }

    public static zzd zze(GoogleApiClient googleApiClient, boolean z) {
        zzaa.zza(googleApiClient.zza(Nearby.CONNECTIONS_API), (Object) "GoogleApiClient is not configured to use the Nearby Connections Api. Pass Nearby.CONNECTIONS_API into GoogleApiClient.Builder#addApi() to use this feature.");
        boolean hasConnectedApi = googleApiClient.hasConnectedApi(Nearby.CONNECTIONS_API);
        if (!z || hasConnectedApi) {
            return hasConnectedApi ? (zzd) googleApiClient.zza(zzaaz) : null;
        } else {
            throw new IllegalStateException("GoogleApiClient has an optional Nearby.CONNECTIONS_API and is not connected to Nearby Connections. Use GoogleApiClient.hasConnectedApi(Nearby.CONNECTIONS_API) to guard this call.");
        }
    }

    public PendingResult<Status> acceptConnectionRequest(GoogleApiClient googleApiClient, String str, byte[] bArr, MessageListener messageListener) {
        final zzou zzs = googleApiClient.zzs(messageListener);
        final String str2 = str;
        final byte[] bArr2 = bArr;
        return googleApiClient.zzd(new c(this, googleApiClient) {
            final /* synthetic */ zze d;

            protected void a(zzd com_google_android_gms_nearby_internal_connection_zzd) throws RemoteException {
                com_google_android_gms_nearby_internal_connection_zzd.zza(this, str2, bArr2, zzs);
            }

            protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzd) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public void disconnectFromEndpoint(GoogleApiClient googleApiClient, String str) {
        zzd(googleApiClient, false).zzfV(str);
    }

    public String getLocalDeviceId(GoogleApiClient googleApiClient) {
        return zzd(googleApiClient, true).zzHC();
    }

    public String getLocalEndpointId(GoogleApiClient googleApiClient) {
        return zzd(googleApiClient, true).zzHB();
    }

    public PendingResult<Status> rejectConnectionRequest(GoogleApiClient googleApiClient, final String str) {
        return googleApiClient.zzd(new c(this, googleApiClient) {
            final /* synthetic */ zze b;

            protected void a(zzd com_google_android_gms_nearby_internal_connection_zzd) throws RemoteException {
                com_google_android_gms_nearby_internal_connection_zzd.zzt(this, str);
            }

            protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzd) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<Status> sendConnectionRequest(GoogleApiClient googleApiClient, String str, String str2, byte[] bArr, ConnectionResponseCallback connectionResponseCallback, MessageListener messageListener) {
        final zzou zzs = googleApiClient.zzs(connectionResponseCallback);
        final zzou zzs2 = googleApiClient.zzs(messageListener);
        final String str3 = str;
        final String str4 = str2;
        final byte[] bArr2 = bArr;
        return googleApiClient.zzd(new c(this, googleApiClient) {
            final /* synthetic */ zze f;

            protected void a(zzd com_google_android_gms_nearby_internal_connection_zzd) throws RemoteException {
                com_google_android_gms_nearby_internal_connection_zzd.zza((zznt.zzb) this, str3, str4, bArr2, zzs, zzs2);
            }

            protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzd) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public void sendReliableMessage(GoogleApiClient googleApiClient, String str, byte[] bArr) {
        zzd(googleApiClient, false).zza(new String[]{str}, bArr);
    }

    public void sendReliableMessage(GoogleApiClient googleApiClient, List<String> list, byte[] bArr) {
        zzd(googleApiClient, false).zza((String[]) list.toArray(new String[list.size()]), bArr);
    }

    public void sendUnreliableMessage(GoogleApiClient googleApiClient, String str, byte[] bArr) {
        zzd(googleApiClient, false).zzb(new String[]{str}, bArr);
    }

    public void sendUnreliableMessage(GoogleApiClient googleApiClient, List<String> list, byte[] bArr) {
        zzd(googleApiClient, false).zzb((String[]) list.toArray(new String[list.size()]), bArr);
    }

    public PendingResult<StartAdvertisingResult> startAdvertising(GoogleApiClient googleApiClient, String str, AppMetadata appMetadata, long j, ConnectionRequestListener connectionRequestListener) {
        return zza(googleApiClient, str, appMetadata, j, connectionRequestListener, new AdvertisingOptions(Strategy.zzbhW));
    }

    public PendingResult<Status> startDiscovery(GoogleApiClient googleApiClient, String str, long j, EndpointDiscoveryListener endpointDiscoveryListener) {
        return zza(googleApiClient, str, j, endpointDiscoveryListener, new DiscoveryOptions(Strategy.zzbhW));
    }

    public void stopAdvertising(GoogleApiClient googleApiClient) {
        zzd(googleApiClient, false).zzHD();
    }

    public void stopAllEndpoints(GoogleApiClient googleApiClient) {
        zzd(googleApiClient, false).zzHE();
    }

    public void stopDiscovery(GoogleApiClient googleApiClient, String str) {
        zzd(googleApiClient, false).zzfU(str);
    }

    public PendingResult<Status> zza(GoogleApiClient googleApiClient, String str, long j, EndpointDiscoveryListener endpointDiscoveryListener, DiscoveryOptions discoveryOptions) {
        final zzou zzs = googleApiClient.zzs(endpointDiscoveryListener);
        final String str2 = str;
        final long j2 = j;
        final DiscoveryOptions discoveryOptions2 = discoveryOptions;
        return googleApiClient.zzd(new c(this, googleApiClient) {
            final /* synthetic */ zze e;

            protected void a(zzd com_google_android_gms_nearby_internal_connection_zzd) throws RemoteException {
                com_google_android_gms_nearby_internal_connection_zzd.zza(this, str2, j2, discoveryOptions2.zzHw(), zzs);
            }

            protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzd) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<StartAdvertisingResult> zza(GoogleApiClient googleApiClient, String str, AppMetadata appMetadata, long j, ConnectionRequestListener connectionRequestListener, AdvertisingOptions advertisingOptions) {
        final zzou zzs = googleApiClient.zzs(connectionRequestListener);
        final String str2 = str;
        final AppMetadata appMetadata2 = appMetadata;
        final long j2 = j;
        final AdvertisingOptions advertisingOptions2 = advertisingOptions;
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ zze f;

            protected void a(zzd com_google_android_gms_nearby_internal_connection_zzd) throws RemoteException {
                com_google_android_gms_nearby_internal_connection_zzd.zza((zznt.zzb) this, str2, appMetadata2, j2, advertisingOptions2.zzHw(), zzs);
            }

            protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzd) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }
}
