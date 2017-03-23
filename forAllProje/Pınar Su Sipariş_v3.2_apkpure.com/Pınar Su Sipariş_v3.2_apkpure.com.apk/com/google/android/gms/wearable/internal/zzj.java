package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zznt.zzb;
import com.google.android.gms.internal.zzou;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.CapabilityApi.AddLocalCapabilityResult;
import com.google.android.gms.wearable.CapabilityApi.CapabilityListener;
import com.google.android.gms.wearable.CapabilityApi.GetAllCapabilitiesResult;
import com.google.android.gms.wearable.CapabilityApi.GetCapabilityResult;
import com.google.android.gms.wearable.CapabilityApi.RemoveLocalCapabilityResult;
import com.google.android.gms.wearable.CapabilityInfo;
import com.google.android.gms.wearable.Node;
import java.util.Map;
import java.util.Set;

public class zzj implements CapabilityApi {

    class AnonymousClass5 implements a<CapabilityListener> {
        final /* synthetic */ IntentFilter[] a;

        AnonymousClass5(IntentFilter[] intentFilterArr) {
            this.a = intentFilterArr;
        }

        public void a(zzbp com_google_android_gms_wearable_internal_zzbp, zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, CapabilityListener capabilityListener, zzou<CapabilityListener> com_google_android_gms_internal_zzou_com_google_android_gms_wearable_CapabilityApi_CapabilityListener) throws RemoteException {
            com_google_android_gms_wearable_internal_zzbp.zza((zzb) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, capabilityListener, (zzou) com_google_android_gms_internal_zzou_com_google_android_gms_wearable_CapabilityApi_CapabilityListener, this.a);
        }
    }

    private static class a implements CapabilityListener {
        final CapabilityListener a;
        final String b;

        a(CapabilityListener capabilityListener, String str) {
            this.a = capabilityListener;
            this.b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) ? this.b.equals(aVar.b) : false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public void onCapabilityChanged(CapabilityInfo capabilityInfo) {
            this.a.onCapabilityChanged(capabilityInfo);
        }
    }

    private static final class b extends e<Status> {
        private CapabilityListener a;

        private b(GoogleApiClient googleApiClient, CapabilityListener capabilityListener) {
            super(googleApiClient);
            this.a = capabilityListener;
        }

        public Status a(Status status) {
            this.a = null;
            return status;
        }

        protected void a(zzbp com_google_android_gms_wearable_internal_zzbp) throws RemoteException {
            com_google_android_gms_wearable_internal_zzbp.zza((zzb) this, this.a);
            this.a = null;
        }

        protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
            a((zzbp) com_google_android_gms_common_api_Api_zzb);
        }

        public /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    public static class zza implements AddLocalCapabilityResult, RemoveLocalCapabilityResult {
        private final Status zzaaO;

        public zza(Status status) {
            this.zzaaO = status;
        }

        public Status getStatus() {
            return this.zzaaO;
        }
    }

    public static class zzc implements CapabilityInfo {
        private final String mName;
        private final Set<Node> zzbCz;

        public zzc(CapabilityInfo capabilityInfo) {
            this(capabilityInfo.getName(), capabilityInfo.getNodes());
        }

        public zzc(String str, Set<Node> set) {
            this.mName = str;
            this.zzbCz = set;
        }

        public String getName() {
            return this.mName;
        }

        public Set<Node> getNodes() {
            return this.zzbCz;
        }
    }

    public static class zzd implements GetAllCapabilitiesResult {
        private final Status zzaaO;
        private final Map<String, CapabilityInfo> zzbCA;

        public zzd(Status status, Map<String, CapabilityInfo> map) {
            this.zzaaO = status;
            this.zzbCA = map;
        }

        public Map<String, CapabilityInfo> getAllCapabilities() {
            return this.zzbCA;
        }

        public Status getStatus() {
            return this.zzaaO;
        }
    }

    public static class zze implements GetCapabilityResult {
        private final Status zzaaO;
        private final CapabilityInfo zzbCB;

        public zze(Status status, CapabilityInfo capabilityInfo) {
            this.zzaaO = status;
            this.zzbCB = capabilityInfo;
        }

        public CapabilityInfo getCapability() {
            return this.zzbCB;
        }

        public Status getStatus() {
            return this.zzaaO;
        }
    }

    private PendingResult<Status> zza(GoogleApiClient googleApiClient, CapabilityListener capabilityListener, IntentFilter[] intentFilterArr) {
        return b.a(googleApiClient, zza(intentFilterArr), capabilityListener);
    }

    private static a<CapabilityListener> zza(IntentFilter[] intentFilterArr) {
        return new AnonymousClass5(intentFilterArr);
    }

    public PendingResult<Status> addCapabilityListener(GoogleApiClient googleApiClient, CapabilityListener capabilityListener, String str) {
        String str2;
        zzaa.zzb(str != null, (Object) "capability must not be null");
        CapabilityListener aVar = new a(capabilityListener, str);
        IntentFilter zzhE = zzbn.zzhE(CapabilityApi.ACTION_CAPABILITY_CHANGED);
        if (str.startsWith("/")) {
            str2 = str;
        } else {
            String str3 = "/";
            str2 = String.valueOf(str);
            str2 = str2.length() != 0 ? str3.concat(str2) : new String(str3);
        }
        zzhE.addDataPath(str2, 0);
        return zza(googleApiClient, aVar, new IntentFilter[]{zzhE});
    }

    public PendingResult<Status> addListener(GoogleApiClient googleApiClient, CapabilityListener capabilityListener, Uri uri, int i) {
        zzaa.zzb(uri != null, (Object) "uri must not be null");
        boolean z = i == 0 || i == 1;
        zzaa.zzb(z, (Object) "invalid filter type");
        return zza(googleApiClient, capabilityListener, new IntentFilter[]{zzbn.zza(CapabilityApi.ACTION_CAPABILITY_CHANGED, uri, i)});
    }

    public PendingResult<AddLocalCapabilityResult> addLocalCapability(GoogleApiClient googleApiClient, final String str) {
        return googleApiClient.zzc(new e<AddLocalCapabilityResult>(this, googleApiClient) {
            final /* synthetic */ zzj b;

            protected AddLocalCapabilityResult a(Status status) {
                return new zza(status);
            }

            protected void a(zzbp com_google_android_gms_wearable_internal_zzbp) throws RemoteException {
                com_google_android_gms_wearable_internal_zzbp.zzv(this, str);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzbp) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<GetAllCapabilitiesResult> getAllCapabilities(GoogleApiClient googleApiClient, final int i) {
        boolean z = true;
        if (!(i == 0 || i == 1)) {
            z = false;
        }
        zzaa.zzaj(z);
        return googleApiClient.zzc(new e<GetAllCapabilitiesResult>(this, googleApiClient) {
            final /* synthetic */ zzj b;

            protected GetAllCapabilitiesResult a(Status status) {
                return new zzd(status, null);
            }

            protected void a(zzbp com_google_android_gms_wearable_internal_zzbp) throws RemoteException {
                com_google_android_gms_wearable_internal_zzbp.zzd(this, i);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzbp) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<GetCapabilityResult> getCapability(GoogleApiClient googleApiClient, final String str, final int i) {
        boolean z = true;
        if (!(i == 0 || i == 1)) {
            z = false;
        }
        zzaa.zzaj(z);
        return googleApiClient.zzc(new e<GetCapabilityResult>(this, googleApiClient) {
            final /* synthetic */ zzj c;

            protected GetCapabilityResult a(Status status) {
                return new zze(status, null);
            }

            protected void a(zzbp com_google_android_gms_wearable_internal_zzbp) throws RemoteException {
                com_google_android_gms_wearable_internal_zzbp.zzh(this, str, i);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzbp) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<Status> removeCapabilityListener(GoogleApiClient googleApiClient, CapabilityListener capabilityListener, String str) {
        return googleApiClient.zzc(new b(googleApiClient, new a(capabilityListener, str)));
    }

    public PendingResult<Status> removeListener(GoogleApiClient googleApiClient, CapabilityListener capabilityListener) {
        return googleApiClient.zzc(new b(googleApiClient, capabilityListener));
    }

    public PendingResult<RemoveLocalCapabilityResult> removeLocalCapability(GoogleApiClient googleApiClient, final String str) {
        return googleApiClient.zzc(new e<RemoveLocalCapabilityResult>(this, googleApiClient) {
            final /* synthetic */ zzj b;

            protected RemoveLocalCapabilityResult a(Status status) {
                return new zza(status);
            }

            protected void a(zzbp com_google_android_gms_wearable_internal_zzbp) throws RemoteException {
                com_google_android_gms_wearable_internal_zzbp.zzw(this, str);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzbp) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }
}
