package com.google.android.gms.config.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.internal.zzom;
import com.google.android.gms.internal.zzpx;
import com.google.android.gms.internal.zzpy;
import com.google.android.gms.internal.zzpz;
import com.google.firebase.iid.zzc;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class zza implements zzpy {
    private static final Charset UTF_8 = Charset.forName(Constants.ENCODING);
    private static final Pattern zzauD = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
    private static final Pattern zzauE = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    static abstract class b<R extends Result> extends com.google.android.gms.internal.zznt.zza<R, zzc> {
        public b(GoogleApiClient googleApiClient) {
            super(zzpx.API, googleApiClient);
        }

        protected abstract void a(Context context, zzh com_google_android_gms_config_internal_zzh) throws RemoteException;

        protected final void a(zzc com_google_android_gms_config_internal_zzc) throws RemoteException {
            a(com_google_android_gms_config_internal_zzc.getContext(), (zzh) com_google_android_gms_config_internal_zzc.zztm());
        }

        protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
            a((zzc) com_google_android_gms_common_api_Api_zzb);
        }
    }

    static abstract class c extends b<zzpy.zzb> {
        protected zzg c = new a(this) {
            final /* synthetic */ c a;

            {
                this.a = r1;
            }

            public void zza(Status status, FetchConfigIpcResponse fetchConfigIpcResponse) {
                if (fetchConfigIpcResponse.getStatusCode() == GamesStatusCodes.STATUS_MATCH_ERROR_INVALID_MATCH_STATE || fetchConfigIpcResponse.getStatusCode() == GamesStatusCodes.STATUS_MATCH_ERROR_LOCALLY_MODIFIED) {
                    this.a.zzb(new zzd(zza.zzcA(fetchConfigIpcResponse.getStatusCode()), zza.zza(fetchConfigIpcResponse), fetchConfigIpcResponse.getThrottleEndTimeMillis()));
                } else {
                    this.a.zzb(new zzd(zza.zzcA(fetchConfigIpcResponse.getStatusCode()), zza.zza(fetchConfigIpcResponse)));
                }
            }
        };

        public c(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }
    }

    static abstract class a extends com.google.android.gms.config.internal.zzg.zza {
        a() {
        }

        public void zzD(Status status) {
            throw new UnsupportedOperationException();
        }

        public void zza(Status status, FetchConfigIpcResponse fetchConfigIpcResponse) {
            throw new UnsupportedOperationException();
        }

        public void zza(Status status, Map map) {
            throw new UnsupportedOperationException();
        }

        public void zza(Status status, byte[] bArr) {
            throw new UnsupportedOperationException();
        }
    }

    public static class zzd implements zzpy.zzb {
        private final Status zzaaO;
        private final Map<String, TreeMap<String, byte[]>> zzauJ;
        private final long zzauK;

        public zzd(Status status, Map<String, TreeMap<String, byte[]>> map) {
            this(status, map, -1);
        }

        public zzd(Status status, Map<String, TreeMap<String, byte[]>> map, long j) {
            this.zzaaO = status;
            this.zzauJ = map;
            this.zzauK = j;
        }

        public Status getStatus() {
            return this.zzaaO;
        }

        public long getThrottleEndTimeMillis() {
            return this.zzauK;
        }

        public boolean zzG(String str, String str2) {
            return (this.zzauJ == null || this.zzauJ.get(str2) == null) ? false : ((TreeMap) this.zzauJ.get(str2)).get(str) != null;
        }

        public byte[] zza(String str, byte[] bArr, String str2) {
            return zzG(str, str2) ? (byte[]) ((TreeMap) this.zzauJ.get(str2)).get(str) : bArr;
        }

        public Map<String, Set<String>> zzvt() {
            Map<String, Set<String>> hashMap = new HashMap();
            if (this.zzauJ != null) {
                for (String str : this.zzauJ.keySet()) {
                    Map map = (Map) this.zzauJ.get(str);
                    if (map != null) {
                        hashMap.put(str, map.keySet());
                    }
                }
            }
            return hashMap;
        }
    }

    private static HashMap<String, TreeMap<String, byte[]>> zza(FetchConfigIpcResponse fetchConfigIpcResponse) {
        if (fetchConfigIpcResponse == null) {
            return null;
        }
        DataHolder zzvA = fetchConfigIpcResponse.zzvA();
        if (zzvA == null) {
            return null;
        }
        PackageConfigTable packageConfigTable = (PackageConfigTable) new com.google.android.gms.common.data.zzd(zzvA, PackageConfigTable.CREATOR).get(0);
        fetchConfigIpcResponse.zzvB();
        HashMap<String, TreeMap<String, byte[]>> hashMap = new HashMap();
        for (String str : packageConfigTable.zzvC().keySet()) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(str, treeMap);
            Bundle bundle = packageConfigTable.zzvC().getBundle(str);
            for (String str2 : bundle.keySet()) {
                treeMap.put(str2, bundle.getByteArray(str2));
            }
        }
        return hashMap;
    }

    private static Status zzcA(int i) {
        return new Status(i, zzpz.getStatusCodeString(i));
    }

    public PendingResult<zzpy.zzb> zza(GoogleApiClient googleApiClient, final com.google.android.gms.internal.zzpy.zza com_google_android_gms_internal_zzpy_zza) {
        return (googleApiClient == null || com_google_android_gms_internal_zzpy_zza == null) ? null : googleApiClient.zzc(new c(this, googleApiClient) {
            final /* synthetic */ zza b;

            protected zzpy.zzb a(Status status) {
                return new zzd(status, new HashMap());
            }

            protected void a(Context context, zzh com_google_android_gms_config_internal_zzh) throws RemoteException {
                String id;
                String token;
                Throwable e;
                String str = null;
                com.google.android.gms.common.data.DataHolder.zza zzsS = com.google.android.gms.common.data.zzd.zzsS();
                for (Entry entry : com_google_android_gms_internal_zzpy_zza.zzvr().entrySet()) {
                    com.google.android.gms.common.data.zzd.zza(zzsS, new CustomVariable((String) entry.getKey(), (String) entry.getValue()));
                }
                DataHolder zzbR = zzsS.zzbR(0);
                String zzsA = zzom.zzas(context) == Status.zzalw ? zzom.zzsA() : str;
                try {
                    id = zzc.zzUl().getId();
                    try {
                        token = zzc.zzUl().getToken();
                    } catch (IllegalStateException e2) {
                        e = e2;
                        if (Log.isLoggable("ConfigApiImpl", 3)) {
                            Log.d("ConfigApiImpl", "Cannot retrieve instanceId or instanceIdToken.", e);
                        }
                        token = str;
                        com_google_android_gms_config_internal_zzh.zza(this.c, new FetchConfigIpcRequest(context.getPackageName(), com_google_android_gms_internal_zzpy_zza.zzvq(), zzbR, zzsA, id, token));
                    }
                } catch (IllegalStateException e3) {
                    e = e3;
                    id = str;
                    if (Log.isLoggable("ConfigApiImpl", 3)) {
                        Log.d("ConfigApiImpl", "Cannot retrieve instanceId or instanceIdToken.", e);
                    }
                    token = str;
                    com_google_android_gms_config_internal_zzh.zza(this.c, new FetchConfigIpcRequest(context.getPackageName(), com_google_android_gms_internal_zzpy_zza.zzvq(), zzbR, zzsA, id, token));
                }
                com_google_android_gms_config_internal_zzh.zza(this.c, new FetchConfigIpcRequest(context.getPackageName(), com_google_android_gms_internal_zzpy_zza.zzvq(), zzbR, zzsA, id, token));
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }
}
