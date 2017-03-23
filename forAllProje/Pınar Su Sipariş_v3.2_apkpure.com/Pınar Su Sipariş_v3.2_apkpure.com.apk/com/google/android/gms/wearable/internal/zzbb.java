package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzou;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi;
import com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult;
import com.google.android.gms.wearable.NodeApi.GetLocalNodeResult;
import com.google.android.gms.wearable.NodeApi.NodeListener;
import java.util.ArrayList;
import java.util.List;

public final class zzbb implements NodeApi {

    class AnonymousClass3 implements a<NodeListener> {
        final /* synthetic */ IntentFilter[] a;

        AnonymousClass3(IntentFilter[] intentFilterArr) {
            this.a = intentFilterArr;
        }

        public void a(zzbp com_google_android_gms_wearable_internal_zzbp, com.google.android.gms.internal.zznt.zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, NodeListener nodeListener, zzou<NodeListener> com_google_android_gms_internal_zzou_com_google_android_gms_wearable_NodeApi_NodeListener) throws RemoteException {
            com_google_android_gms_wearable_internal_zzbp.zza((com.google.android.gms.internal.zznt.zzb) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, nodeListener, (zzou) com_google_android_gms_internal_zzou_com_google_android_gms_wearable_NodeApi_NodeListener, this.a);
        }
    }

    public static class zza implements GetConnectedNodesResult {
        private final Status zzaaO;
        private final List<Node> zzbDC;

        public zza(Status status, List<Node> list) {
            this.zzaaO = status;
            this.zzbDC = list;
        }

        public List<Node> getNodes() {
            return this.zzbDC;
        }

        public Status getStatus() {
            return this.zzaaO;
        }
    }

    public static class zzb implements GetLocalNodeResult {
        private final Status zzaaO;
        private final Node zzbDD;

        public zzb(Status status, Node node) {
            this.zzaaO = status;
            this.zzbDD = node;
        }

        public Node getNode() {
            return this.zzbDD;
        }

        public Status getStatus() {
            return this.zzaaO;
        }
    }

    private static a<NodeListener> zza(IntentFilter[] intentFilterArr) {
        return new AnonymousClass3(intentFilterArr);
    }

    public PendingResult<Status> addListener(GoogleApiClient googleApiClient, NodeListener nodeListener) {
        return b.a(googleApiClient, zza(new IntentFilter[]{zzbn.zzhE("com.google.android.gms.wearable.NODE_CHANGED")}), nodeListener);
    }

    public PendingResult<GetConnectedNodesResult> getConnectedNodes(GoogleApiClient googleApiClient) {
        return googleApiClient.zzc(new e<GetConnectedNodesResult>(this, googleApiClient) {
            final /* synthetic */ zzbb a;

            protected GetConnectedNodesResult a(Status status) {
                return new zza(status, new ArrayList());
            }

            protected void a(zzbp com_google_android_gms_wearable_internal_zzbp) throws RemoteException {
                com_google_android_gms_wearable_internal_zzbp.zzx(this);
            }

            protected /* synthetic */ void zza(com.google.android.gms.common.api.Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzbp) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<GetLocalNodeResult> getLocalNode(GoogleApiClient googleApiClient) {
        return googleApiClient.zzc(new e<GetLocalNodeResult>(this, googleApiClient) {
            final /* synthetic */ zzbb a;

            protected GetLocalNodeResult a(Status status) {
                return new zzb(status, null);
            }

            protected void a(zzbp com_google_android_gms_wearable_internal_zzbp) throws RemoteException {
                com_google_android_gms_wearable_internal_zzbp.zzw(this);
            }

            protected /* synthetic */ void zza(com.google.android.gms.common.api.Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzbp) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<Status> removeListener(GoogleApiClient googleApiClient, final NodeListener nodeListener) {
        return googleApiClient.zzc(new e<Status>(this, googleApiClient) {
            final /* synthetic */ zzbb b;

            public Status a(Status status) {
                return status;
            }

            protected void a(zzbp com_google_android_gms_wearable_internal_zzbp) throws RemoteException {
                com_google_android_gms_wearable_internal_zzbp.zza((com.google.android.gms.internal.zznt.zzb) this, nodeListener);
            }

            protected /* synthetic */ void zza(com.google.android.gms.common.api.Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzbp) com_google_android_gms_common_api_Api_zzb);
            }

            public /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }
}
