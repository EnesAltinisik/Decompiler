package com.google.android.gms.nearby.internal.connection;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.internal.zznt;
import com.google.android.gms.internal.zzou;
import com.google.android.gms.internal.zzou.zzb;
import com.google.android.gms.nearby.connection.AppMetadata;
import com.google.android.gms.nearby.connection.Connections.ConnectionRequestListener;
import com.google.android.gms.nearby.connection.Connections.ConnectionResponseCallback;
import com.google.android.gms.nearby.connection.Connections.EndpointDiscoveryListener;
import com.google.android.gms.nearby.connection.Connections.MessageListener;
import com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.nearby.internal.connection.zzj.zza;

public final class zzd extends zzk<zzj> {
    private final long zzaKX = ((long) hashCode());

    private static class b extends zza {
        private final zzou<MessageListener> a;

        b(zzou<MessageListener> com_google_android_gms_internal_zzou_com_google_android_gms_nearby_connection_Connections_MessageListener) {
            this.a = com_google_android_gms_internal_zzou_com_google_android_gms_nearby_connection_Connections_MessageListener;
        }

        public void onDisconnected(final String str) throws RemoteException {
            this.a.zza(new zzb<MessageListener>(this) {
                final /* synthetic */ b b;

                public void a(MessageListener messageListener) {
                    messageListener.onDisconnected(str);
                }

                public void zzrV() {
                }

                public /* synthetic */ void zzt(Object obj) {
                    a((MessageListener) obj);
                }
            });
        }

        public void onMessageReceived(final String str, final byte[] bArr, final boolean z) throws RemoteException {
            this.a.zza(new zzb<MessageListener>(this) {
                final /* synthetic */ b d;

                public void a(MessageListener messageListener) {
                    messageListener.onMessageReceived(str, bArr, z);
                }

                public void zzrV() {
                }

                public /* synthetic */ void zzt(Object obj) {
                    a((MessageListener) obj);
                }
            });
        }
    }

    private static final class a extends b {
        private final zznt.zzb<Status> a;

        public a(zznt.zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, zzou<MessageListener> com_google_android_gms_internal_zzou_com_google_android_gms_nearby_connection_Connections_MessageListener) {
            super(com_google_android_gms_internal_zzou_com_google_android_gms_nearby_connection_Connections_MessageListener);
            this.a = (zznt.zzb) zzaa.zzz(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status);
        }

        public void zzjw(int i) throws RemoteException {
            this.a.setResult(new Status(i));
        }
    }

    private static class c extends zza {
        private final zznt.zzb<Status> a;

        c(zznt.zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status;
        }

        public void zzjx(int i) throws RemoteException {
            this.a.setResult(new Status(i));
        }
    }

    private static final class d extends b {
        private final zznt.zzb<Status> a;
        private final zzou<ConnectionResponseCallback> b;

        public d(zznt.zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, zzou<ConnectionResponseCallback> com_google_android_gms_internal_zzou_com_google_android_gms_nearby_connection_Connections_ConnectionResponseCallback, zzou<MessageListener> com_google_android_gms_internal_zzou_com_google_android_gms_nearby_connection_Connections_MessageListener) {
            super(com_google_android_gms_internal_zzou_com_google_android_gms_nearby_connection_Connections_MessageListener);
            this.a = (zznt.zzb) zzaa.zzz(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status);
            this.b = (zzou) zzaa.zzz(com_google_android_gms_internal_zzou_com_google_android_gms_nearby_connection_Connections_ConnectionResponseCallback);
        }

        public void zza(final String str, final int i, final byte[] bArr) throws RemoteException {
            this.b.zza(new zzb<ConnectionResponseCallback>(this) {
                final /* synthetic */ d d;

                public void a(ConnectionResponseCallback connectionResponseCallback) {
                    connectionResponseCallback.onConnectionResponse(str, new Status(i), bArr);
                }

                public void zzrV() {
                }

                public /* synthetic */ void zzt(Object obj) {
                    a((ConnectionResponseCallback) obj);
                }
            });
        }

        public void zzjv(int i) throws RemoteException {
            this.a.setResult(new Status(i));
        }
    }

    private static final class e extends zza {
        private final zznt.zzb<StartAdvertisingResult> a;
        private final zzou<ConnectionRequestListener> b;

        e(zznt.zzb<StartAdvertisingResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_nearby_connection_Connections_StartAdvertisingResult, zzou<ConnectionRequestListener> com_google_android_gms_internal_zzou_com_google_android_gms_nearby_connection_Connections_ConnectionRequestListener) {
            this.a = (zznt.zzb) zzaa.zzz(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_nearby_connection_Connections_StartAdvertisingResult);
            this.b = (zzou) zzaa.zzz(com_google_android_gms_internal_zzou_com_google_android_gms_nearby_connection_Connections_ConnectionRequestListener);
        }

        public void onConnectionRequest(String str, String str2, String str3, byte[] bArr) throws RemoteException {
            final String str4 = str;
            final String str5 = str2;
            final String str6 = str3;
            final byte[] bArr2 = bArr;
            this.b.zza(new zzb<ConnectionRequestListener>(this) {
                final /* synthetic */ e e;

                public void a(ConnectionRequestListener connectionRequestListener) {
                    connectionRequestListener.onConnectionRequest(str4, str5, str6, bArr2);
                }

                public void zzrV() {
                }

                public /* synthetic */ void zzt(Object obj) {
                    a((ConnectionRequestListener) obj);
                }
            });
        }

        public void zzo(int i, String str) throws RemoteException {
            this.a.setResult(new f(new Status(i), str));
        }
    }

    private static final class f implements StartAdvertisingResult {
        private final Status a;
        private final String b;

        f(Status status, String str) {
            this.a = status;
            this.b = str;
        }

        public String getLocalEndpointName() {
            return this.b;
        }

        public Status getStatus() {
            return this.a;
        }
    }

    private static final class g extends zza {
        private final zznt.zzb<Status> a;
        private final zzou<EndpointDiscoveryListener> b;

        g(zznt.zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, zzou<EndpointDiscoveryListener> com_google_android_gms_internal_zzou_com_google_android_gms_nearby_connection_Connections_EndpointDiscoveryListener) {
            this.a = (zznt.zzb) zzaa.zzz(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status);
            this.b = (zzou) zzaa.zzz(com_google_android_gms_internal_zzou_com_google_android_gms_nearby_connection_Connections_EndpointDiscoveryListener);
        }

        public void onEndpointFound(String str, String str2, String str3, String str4) throws RemoteException {
            final String str5 = str;
            final String str6 = str2;
            final String str7 = str3;
            final String str8 = str4;
            this.b.zza(new zzb<EndpointDiscoveryListener>(this) {
                final /* synthetic */ g e;

                public void a(EndpointDiscoveryListener endpointDiscoveryListener) {
                    endpointDiscoveryListener.onEndpointFound(str5, str6, str7, str8);
                }

                public void zzrV() {
                }

                public /* synthetic */ void zzt(Object obj) {
                    a((EndpointDiscoveryListener) obj);
                }
            });
        }

        public void onEndpointLost(final String str) throws RemoteException {
            this.b.zza(new zzb<EndpointDiscoveryListener>(this) {
                final /* synthetic */ g b;

                public void a(EndpointDiscoveryListener endpointDiscoveryListener) {
                    endpointDiscoveryListener.onEndpointLost(str);
                }

                public void zzrV() {
                }

                public /* synthetic */ void zzt(Object obj) {
                    a((EndpointDiscoveryListener) obj);
                }
            });
        }

        public void zzjt(int i) throws RemoteException {
            this.a.setResult(new Status(i));
        }
    }

    public zzd(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 54, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
    }

    public void disconnect() {
        if (isConnected()) {
            try {
                ((zzj) zztm()).zzI(this.zzaKX);
            } catch (Throwable e) {
                Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", e);
            }
        }
        super.disconnect();
    }

    public String zzHB() {
        try {
            return ((zzj) zztm()).zzao(this.zzaKX);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public String zzHC() {
        try {
            return ((zzj) zztm()).zzHC();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void zzHD() {
        try {
            ((zzj) zztm()).zzal(this.zzaKX);
        } catch (Throwable e) {
            Log.w("NearbyConnectionsClient", "Couldn't stop advertising", e);
        }
    }

    public void zzHE() {
        try {
            ((zzj) zztm()).zzan(this.zzaKX);
        } catch (Throwable e) {
            Log.w("NearbyConnectionsClient", "Couldn't stop all endpoints", e);
        }
    }

    public void zza(zznt.zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, String str, long j, Strategy strategy, zzou<EndpointDiscoveryListener> com_google_android_gms_internal_zzou_com_google_android_gms_nearby_connection_Connections_EndpointDiscoveryListener) throws RemoteException {
        ((zzj) zztm()).zza(new g(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, com_google_android_gms_internal_zzou_com_google_android_gms_nearby_connection_Connections_EndpointDiscoveryListener), str, j, this.zzaKX);
    }

    public void zza(zznt.zzb<StartAdvertisingResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_nearby_connection_Connections_StartAdvertisingResult, String str, AppMetadata appMetadata, long j, Strategy strategy, zzou<ConnectionRequestListener> com_google_android_gms_internal_zzou_com_google_android_gms_nearby_connection_Connections_ConnectionRequestListener) throws RemoteException {
        ((zzj) zztm()).zza(new e(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_nearby_connection_Connections_StartAdvertisingResult, com_google_android_gms_internal_zzou_com_google_android_gms_nearby_connection_Connections_ConnectionRequestListener), str, appMetadata, j, this.zzaKX);
    }

    public void zza(zznt.zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, String str, String str2, byte[] bArr, zzou<ConnectionResponseCallback> com_google_android_gms_internal_zzou_com_google_android_gms_nearby_connection_Connections_ConnectionResponseCallback, zzou<MessageListener> com_google_android_gms_internal_zzou_com_google_android_gms_nearby_connection_Connections_MessageListener) throws RemoteException {
        ((zzj) zztm()).zza(new d(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, com_google_android_gms_internal_zzou_com_google_android_gms_nearby_connection_Connections_ConnectionResponseCallback, com_google_android_gms_internal_zzou_com_google_android_gms_nearby_connection_Connections_MessageListener), str, str2, bArr, this.zzaKX);
    }

    public void zza(zznt.zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, String str, byte[] bArr, zzou<MessageListener> com_google_android_gms_internal_zzou_com_google_android_gms_nearby_connection_Connections_MessageListener) throws RemoteException {
        ((zzj) zztm()).zza(new a(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, com_google_android_gms_internal_zzou_com_google_android_gms_nearby_connection_Connections_MessageListener), str, bArr, this.zzaKX);
    }

    public void zza(String[] strArr, byte[] bArr) {
        try {
            ((zzj) zztm()).zza(strArr, bArr, this.zzaKX);
        } catch (Throwable e) {
            Log.w("NearbyConnectionsClient", "Couldn't send reliable message", e);
        }
    }

    protected /* synthetic */ IInterface zzab(IBinder iBinder) {
        return zzdD(iBinder);
    }

    public void zzb(String[] strArr, byte[] bArr) {
        try {
            ((zzj) zztm()).zzb(strArr, bArr, this.zzaKX);
        } catch (Throwable e) {
            Log.w("NearbyConnectionsClient", "Couldn't send unreliable message", e);
        }
    }

    protected zzj zzdD(IBinder iBinder) {
        return zza.zzdF(iBinder);
    }

    public void zzfU(String str) {
        try {
            ((zzj) zztm()).zzh(str, this.zzaKX);
        } catch (Throwable e) {
            Log.w("NearbyConnectionsClient", "Couldn't stop discovery", e);
        }
    }

    public void zzfV(String str) {
        try {
            ((zzj) zztm()).zzi(str, this.zzaKX);
        } catch (Throwable e) {
            Log.w("NearbyConnectionsClient", "Couldn't disconnect from endpoint", e);
        }
    }

    protected String zzhT() {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    protected String zzhU() {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }

    protected Bundle zzoO() {
        Bundle bundle = new Bundle();
        bundle.putLong("clientId", this.zzaKX);
        return bundle;
    }

    public void zzt(zznt.zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, String str) throws RemoteException {
        ((zzj) zztm()).zza(new c(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status), str, this.zzaKX);
    }
}
