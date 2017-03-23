package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zznt.zzb;
import com.google.android.gms.wearable.internal.zzax.zza;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

final class a<T> {
    private final Map<T, zzbq<T>> a = new HashMap();

    private static class a<T> extends b<Status> {
        private WeakReference<Map<T, zzbq<T>>> a;
        private WeakReference<T> b;

        a(Map<T, zzbq<T>> map, T t, zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
            super(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status);
            this.a = new WeakReference(map);
            this.b = new WeakReference(t);
        }

        public void zza(Status status) {
            Map map = (Map) this.a.get();
            Object obj = this.b.get();
            if (!(status.getStatus().isSuccess() || map == null || obj == null)) {
                synchronized (map) {
                    zzbq com_google_android_gms_wearable_internal_zzbq = (zzbq) map.remove(obj);
                    if (com_google_android_gms_wearable_internal_zzbq != null) {
                        com_google_android_gms_wearable_internal_zzbq.clear();
                    }
                }
            }
            a(status);
        }
    }

    private static class b<T> extends b<Status> {
        private WeakReference<Map<T, zzbq<T>>> a;
        private WeakReference<T> b;

        b(Map<T, zzbq<T>> map, T t, zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
            super(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status);
            this.a = new WeakReference(map);
            this.b = new WeakReference(t);
        }

        public void zza(Status status) {
            Map map = (Map) this.a.get();
            Object obj = this.b.get();
            if (!(status.getStatus().getStatusCode() != 4002 || map == null || obj == null)) {
                synchronized (map) {
                    zzbq com_google_android_gms_wearable_internal_zzbq = (zzbq) map.remove(obj);
                    if (com_google_android_gms_wearable_internal_zzbq != null) {
                        com_google_android_gms_wearable_internal_zzbq.clear();
                    }
                }
            }
            a(status);
        }
    }

    a() {
    }

    public void a(IBinder iBinder) {
        synchronized (this.a) {
            zzax zzeD = zza.zzeD(iBinder);
            zzav oVar = new o();
            for (Entry entry : this.a.entrySet()) {
                zzbq com_google_android_gms_wearable_internal_zzbq = (zzbq) entry.getValue();
                try {
                    zzeD.zza(oVar, new AddListenerRequest(com_google_android_gms_wearable_internal_zzbq));
                    if (Log.isLoggable("WearableClient", 2)) {
                        String valueOf = String.valueOf(entry.getKey());
                        String valueOf2 = String.valueOf(com_google_android_gms_wearable_internal_zzbq);
                        Log.d("WearableClient", new StringBuilder((String.valueOf(valueOf).length() + 27) + String.valueOf(valueOf2).length()).append("onPostInitHandler: added: ").append(valueOf).append("/").append(valueOf2).toString());
                    }
                } catch (RemoteException e) {
                    String valueOf3 = String.valueOf(entry.getKey());
                    String valueOf4 = String.valueOf(com_google_android_gms_wearable_internal_zzbq);
                    Log.d("WearableClient", new StringBuilder((String.valueOf(valueOf3).length() + 32) + String.valueOf(valueOf4).length()).append("onPostInitHandler: Didn't add: ").append(valueOf3).append("/").append(valueOf4).toString());
                }
            }
        }
    }

    public void a(zzbp com_google_android_gms_wearable_internal_zzbp, zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, T t) throws RemoteException {
        synchronized (this.a) {
            zzbq com_google_android_gms_wearable_internal_zzbq = (zzbq) this.a.remove(t);
            if (com_google_android_gms_wearable_internal_zzbq == null) {
                com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status.setResult(new Status(4002));
                return;
            }
            com_google_android_gms_wearable_internal_zzbq.clear();
            ((zzax) com_google_android_gms_wearable_internal_zzbp.zztm()).zza(new b(this.a, t, com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status), new RemoveListenerRequest(com_google_android_gms_wearable_internal_zzbq));
        }
    }

    public void a(zzbp com_google_android_gms_wearable_internal_zzbp, zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, T t, zzbq<T> com_google_android_gms_wearable_internal_zzbq_T) throws RemoteException {
        synchronized (this.a) {
            if (this.a.get(t) != null) {
                com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status.setResult(new Status(4001));
                return;
            }
            this.a.put(t, com_google_android_gms_wearable_internal_zzbq_T);
            try {
                ((zzax) com_google_android_gms_wearable_internal_zzbp.zztm()).zza(new a(this.a, t, com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status), new AddListenerRequest(com_google_android_gms_wearable_internal_zzbq_T));
            } catch (RemoteException e) {
                this.a.remove(t);
                throw e;
            }
        }
    }
}
