package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.Api.zzh;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zzc;
import com.google.android.gms.common.internal.zzag;
import com.google.android.gms.common.internal.zzd.zzf;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.internal.zznt.zza;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class zzoj implements Callback {
    private static zzoj zzanL;
    private static final Object zzrs = new Object();
    private final Context mContext;
    private final Handler mHandler;
    private final GoogleApiAvailability zzaln;
    private long zzanK;
    private int zzanM;
    private final AtomicInteger zzanN;
    private final SparseArray<c<?>> zzanO;
    private final Map<zznq<?>, c<?>> zzanP;
    private zzny zzanQ;
    private final Set<zznq<?>> zzanR;
    private final ReferenceQueue<zzc<?>> zzanS;
    private final SparseArray<a> zzanT;
    private b zzanU;
    private long zzanj;
    private long zzank;

    private final class a extends PhantomReference<zzc<?>> {
        final /* synthetic */ zzoj a;
        private final int b;

        public a(zzoj com_google_android_gms_internal_zzoj, zzc com_google_android_gms_common_api_zzc, int i, ReferenceQueue<zzc<?>> referenceQueue) {
            this.a = com_google_android_gms_internal_zzoj;
            super(com_google_android_gms_common_api_zzc, referenceQueue);
            this.b = i;
        }

        public void a() {
            this.a.mHandler.sendMessage(this.a.mHandler.obtainMessage(2, this.b, 2));
        }
    }

    private static final class b extends Thread {
        private final ReferenceQueue<zzc<?>> a;
        private final SparseArray<a> b;
        private final AtomicBoolean c = new AtomicBoolean();

        public b(ReferenceQueue<zzc<?>> referenceQueue, SparseArray<a> sparseArray) {
            super("GoogleApiCleanup");
            this.a = referenceQueue;
            this.b = sparseArray;
        }

        public void run() {
            this.c.set(true);
            Process.setThreadPriority(10);
            while (this.c.get()) {
                try {
                    a aVar = (a) this.a.remove();
                    this.b.remove(aVar.b);
                    aVar.a();
                } catch (InterruptedException e) {
                } finally {
                    this.c.set(false);
                }
            }
        }
    }

    private class c<O extends ApiOptions> implements ConnectionCallbacks, OnConnectionFailedListener {
        final /* synthetic */ zzoj a;
        private final Queue<zznp> b = new LinkedList();
        private final zze c;
        private final zzb d;
        private final zznq<O> e;
        private final SparseArray<zzpf> f = new SparseArray();
        private final Set<zzns> g = new HashSet();
        private final SparseArray<Map<Object, zza>> h = new SparseArray();
        private boolean i;
        private ConnectionResult j = null;

        public c(zzoj com_google_android_gms_internal_zzoj, zzc<O> com_google_android_gms_common_api_zzc_O) {
            this.a = com_google_android_gms_internal_zzoj;
            this.c = a((zzc) com_google_android_gms_common_api_zzc_O);
            if (this.c instanceof zzag) {
                this.d = ((zzag) this.c).zztX();
            } else {
                this.d = this.c;
            }
            this.e = com_google_android_gms_common_api_zzc_O.zzrn();
        }

        private zze a(zzc com_google_android_gms_common_api_zzc) {
            Api zzrl = com_google_android_gms_common_api_zzc.zzrl();
            if (!zzrl.zzrf()) {
                return com_google_android_gms_common_api_zzc.zzrl().zzrc().zza(com_google_android_gms_common_api_zzc.getApplicationContext(), this.a.mHandler.getLooper(), zzg.zzau(com_google_android_gms_common_api_zzc.getApplicationContext()), com_google_android_gms_common_api_zzc.zzrm(), this, this);
            }
            zzh zzrd = zzrl.zzrd();
            return new zzag(com_google_android_gms_common_api_zzc.getApplicationContext(), this.a.mHandler.getLooper(), zzrd.zzri(), this, this, zzg.zzau(com_google_android_gms_common_api_zzc.getApplicationContext()), zzrd.zzr(com_google_android_gms_common_api_zzc.zzrm()));
        }

        private void a(ConnectionResult connectionResult) {
            for (zzns zza : this.g) {
                zza.zza(this.e, connectionResult);
            }
            this.g.clear();
        }

        private void a(Status status) {
            for (zznp zzv : this.b) {
                zzv.zzv(status);
            }
            this.b.clear();
        }

        private void b(zznp com_google_android_gms_internal_zznp) {
            com_google_android_gms_internal_zznp.zza(this.f);
            Map map;
            if (com_google_android_gms_internal_zznp.zzagd == 3) {
                try {
                    Map map2;
                    map = (Map) this.h.get(com_google_android_gms_internal_zznp.zzalC);
                    if (map == null) {
                        android.support.v4.h.a aVar = new android.support.v4.h.a(1);
                        this.h.put(com_google_android_gms_internal_zznp.zzalC, aVar);
                        map2 = aVar;
                    } else {
                        map2 = map;
                    }
                    zza com_google_android_gms_internal_zznt_zza = ((zznp.zza) com_google_android_gms_internal_zznp).zzalD;
                    map2.put(((zzot) com_google_android_gms_internal_zznt_zza).zzsG(), com_google_android_gms_internal_zznt_zza);
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Listener registration methods must implement ListenerApiMethod");
                }
            } else if (com_google_android_gms_internal_zznp.zzagd == 4) {
                try {
                    map = (Map) this.h.get(com_google_android_gms_internal_zznp.zzalC);
                    zzot com_google_android_gms_internal_zzot = (zzot) ((zznp.zza) com_google_android_gms_internal_zznp).zzalD;
                    if (map != null) {
                        map.remove(com_google_android_gms_internal_zzot.zzsG());
                    } else {
                        Log.w("GoogleApiManager", "Received call to unregister a listener without a matching registration call.");
                    }
                } catch (ClassCastException e2) {
                    throw new IllegalStateException("Listener unregistration methods must implement ListenerApiMethod");
                }
            }
            try {
                com_google_android_gms_internal_zznp.zzb(this.d);
            } catch (DeadObjectException e3) {
                this.c.disconnect();
                onConnectionSuspended(1);
            }
        }

        private void e() {
            if (this.i) {
                j();
            }
        }

        private void f() {
            if (this.i) {
                this.a.mHandler.removeMessages(9, this.e);
                this.a.mHandler.removeMessages(8, this.e);
                this.i = false;
            }
        }

        private void g() {
            if (this.i) {
                f();
                a(this.a.zzaln.isGooglePlayServicesAvailable(this.a.mContext) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                this.c.disconnect();
            }
        }

        private void h() {
            this.a.mHandler.removeMessages(10, this.e);
            this.a.mHandler.sendMessageDelayed(this.a.mHandler.obtainMessage(10, this.e), this.a.zzanK);
        }

        private void i() {
            if (this.c.isConnected() && this.h.size() == 0) {
                for (int i = 0; i < this.f.size(); i++) {
                    if (((zzpf) this.f.get(this.f.keyAt(i))).zzsM()) {
                        h();
                        return;
                    }
                }
                this.c.disconnect();
            }
        }

        private void j() {
            if (!this.c.isConnected() && !this.c.isConnecting()) {
                if (this.c.zzrg() && this.a.zzanM != 0) {
                    this.a.zzanM = this.a.zzaln.isGooglePlayServicesAvailable(this.a.mContext);
                    if (this.a.zzanM != 0) {
                        onConnectionFailed(new ConnectionResult(this.a.zzanM, null));
                        return;
                    }
                }
                this.c.zza(new d(this.a, this.c, this.e));
            }
        }

        public void a() {
            while (this.c.isConnected() && !this.b.isEmpty()) {
                b((zznp) this.b.remove());
            }
        }

        public void a(int i) {
            this.f.put(i, new zzpf(this.e.zzre(), this.c));
        }

        public void a(int i, boolean z) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                zznp com_google_android_gms_internal_zznp = (zznp) it.next();
                if (com_google_android_gms_internal_zznp.zzalC == i && com_google_android_gms_internal_zznp.zzagd != 1 && com_google_android_gms_internal_zznp.cancel()) {
                    it.remove();
                }
            }
            ((zzpf) this.f.get(i)).release();
            this.h.delete(i);
            if (!z) {
                this.f.remove(i);
                this.a.zzanT.remove(i);
                if (this.f.size() == 0 && this.b.isEmpty()) {
                    f();
                    this.c.disconnect();
                    this.a.zzanP.remove(this.e);
                    synchronized (zzoj.zzrs) {
                        this.a.zzanR.remove(this.e);
                    }
                }
            }
        }

        public void a(zznp com_google_android_gms_internal_zznp) {
            if (this.c.isConnected()) {
                b(com_google_android_gms_internal_zznp);
                h();
                return;
            }
            this.b.add(com_google_android_gms_internal_zznp);
            if (this.j == null || !this.j.hasResolution()) {
                j();
            } else {
                onConnectionFailed(this.j);
            }
        }

        public void a(zzns com_google_android_gms_internal_zzns) {
            this.g.add(com_google_android_gms_internal_zzns);
        }

        public void b() {
            this.j = null;
        }

        ConnectionResult c() {
            return this.j;
        }

        boolean d() {
            return this.c.isConnected();
        }

        public void onConnected(Bundle bundle) {
            b();
            a(ConnectionResult.zzakj);
            f();
            for (int i = 0; i < this.h.size(); i++) {
                for (zza zzb : ((Map) this.h.get(this.h.keyAt(i))).values()) {
                    try {
                        zzb.zzb(this.d);
                    } catch (DeadObjectException e) {
                        this.c.disconnect();
                        onConnectionSuspended(1);
                    }
                }
            }
            a();
            h();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onConnectionFailed(com.google.android.gms.common.ConnectionResult r6) {
            /*
            r5 = this;
            r5.b();
            r0 = r5.a;
            r1 = -1;
            r0.zzanM = r1;
            r5.a(r6);
            r0 = r5.f;
            r1 = 0;
            r0 = r0.keyAt(r1);
            r1 = r5.b;
            r1 = r1.isEmpty();
            if (r1 == 0) goto L_0x001e;
        L_0x001b:
            r5.j = r6;
        L_0x001d:
            return;
        L_0x001e:
            r1 = com.google.android.gms.internal.zzoj.zzrs;
            monitor-enter(r1);
            r2 = r5.a;	 Catch:{ all -> 0x0044 }
            r2 = null;	 Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0047;
        L_0x002b:
            r2 = r5.a;	 Catch:{ all -> 0x0044 }
            r2 = r2.zzanR;	 Catch:{ all -> 0x0044 }
            r3 = r5.e;	 Catch:{ all -> 0x0044 }
            r2 = r2.contains(r3);	 Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0047;
        L_0x0039:
            r2 = r5.a;	 Catch:{ all -> 0x0044 }
            r2 = null;	 Catch:{ all -> 0x0044 }
            r2.zzb(r6, r0);	 Catch:{ all -> 0x0044 }
            monitor-exit(r1);	 Catch:{ all -> 0x0044 }
            goto L_0x001d;
        L_0x0044:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x0044 }
            throw r0;
        L_0x0047:
            monitor-exit(r1);	 Catch:{ all -> 0x0044 }
            r1 = r5.a;
            r0 = r1.zzc(r6, r0);
            if (r0 != 0) goto L_0x001d;
        L_0x0050:
            r0 = r6.getErrorCode();
            r1 = 18;
            if (r0 != r1) goto L_0x005b;
        L_0x0058:
            r0 = 1;
            r5.i = r0;
        L_0x005b:
            r0 = r5.i;
            if (r0 == 0) goto L_0x007d;
        L_0x005f:
            r0 = r5.a;
            r0 = r0.mHandler;
            r1 = r5.a;
            r1 = r1.mHandler;
            r2 = 8;
            r3 = r5.e;
            r1 = android.os.Message.obtain(r1, r2, r3);
            r2 = r5.a;
            r2 = r2.zzank;
            r0.sendMessageDelayed(r1, r2);
            goto L_0x001d;
        L_0x007d:
            r0 = new com.google.android.gms.common.api.Status;
            r1 = 17;
            r2 = r5.e;
            r2 = r2.zzrz();
            r2 = java.lang.String.valueOf(r2);
            r3 = new java.lang.StringBuilder;
            r4 = java.lang.String.valueOf(r2);
            r4 = r4.length();
            r4 = r4 + 38;
            r3.<init>(r4);
            r4 = "API: ";
            r3 = r3.append(r4);
            r2 = r3.append(r2);
            r3 = " is not available on this device.";
            r2 = r2.append(r3);
            r2 = r2.toString();
            r0.<init>(r1, r2);
            r5.a(r0);
            goto L_0x001d;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzoj.c.onConnectionFailed(com.google.android.gms.common.ConnectionResult):void");
        }

        public void onConnectionSuspended(int i) {
            b();
            this.i = true;
            this.a.mHandler.sendMessageDelayed(Message.obtain(this.a.mHandler, 8, this.e), this.a.zzank);
            this.a.mHandler.sendMessageDelayed(Message.obtain(this.a.mHandler, 9, this.e), this.a.zzanj);
            this.a.zzanM = -1;
        }
    }

    private class d implements zzf {
        final /* synthetic */ zzoj a;
        private final zze b;
        private final zznq<?> c;

        public d(zzoj com_google_android_gms_internal_zzoj, zze com_google_android_gms_common_api_Api_zze, zznq<?> com_google_android_gms_internal_zznq_) {
            this.a = com_google_android_gms_internal_zzoj;
            this.b = com_google_android_gms_common_api_Api_zze;
            this.c = com_google_android_gms_internal_zznq_;
        }

        public void zzh(ConnectionResult connectionResult) {
            if (connectionResult.isSuccess()) {
                this.b.zza(null, Collections.emptySet());
            } else {
                ((c) this.a.zzanP.get(this.c)).onConnectionFailed(connectionResult);
            }
        }
    }

    private zzoj(Context context) {
        this(context, GoogleApiAvailability.getInstance());
    }

    zzoj(Context context, GoogleApiAvailability googleApiAvailability) {
        this.zzank = 5000;
        this.zzanj = 120000;
        this.zzanK = 10000;
        this.zzanM = -1;
        this.zzanN = new AtomicInteger(1);
        this.zzanO = new SparseArray();
        this.zzanP = new ConcurrentHashMap(5, 0.75f, 1);
        this.zzanQ = null;
        this.zzanR = new com.google.android.gms.common.util.zza();
        this.zzanS = new ReferenceQueue();
        this.zzanT = new SparseArray();
        this.mContext = context;
        HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
        handlerThread.start();
        this.mHandler = new Handler(handlerThread.getLooper(), this);
        this.zzaln = googleApiAvailability;
    }

    private int zza(zzc<?> com_google_android_gms_common_api_zzc_) {
        int andIncrement = this.zzanN.getAndIncrement();
        this.mHandler.sendMessage(this.mHandler.obtainMessage(6, andIncrement, 0, com_google_android_gms_common_api_zzc_));
        return andIncrement;
    }

    public static Pair<zzoj, Integer> zza(Context context, zzc<?> com_google_android_gms_common_api_zzc_) {
        Pair<zzoj, Integer> create;
        synchronized (zzrs) {
            if (zzanL == null) {
                zzanL = new zzoj(context.getApplicationContext());
            }
            create = Pair.create(zzanL, Integer.valueOf(zzanL.zza((zzc) com_google_android_gms_common_api_zzc_)));
        }
        return create;
    }

    private void zza(zzc<?> com_google_android_gms_common_api_zzc_, int i) {
        zznq zzrn = com_google_android_gms_common_api_zzc_.zzrn();
        if (!this.zzanP.containsKey(zzrn)) {
            this.zzanP.put(zzrn, new c(this, com_google_android_gms_common_api_zzc_));
        }
        c cVar = (c) this.zzanP.get(zzrn);
        cVar.a(i);
        this.zzanO.put(i, cVar);
        cVar.j();
        this.zzanT.put(i, new a(this, com_google_android_gms_common_api_zzc_, i, this.zzanS));
        if (this.zzanU == null || !this.zzanU.c.get()) {
            this.zzanU = new b(this.zzanS, this.zzanT);
            this.zzanU.start();
        }
    }

    private void zza(zznp com_google_android_gms_internal_zznp) {
        ((c) this.zzanO.get(com_google_android_gms_internal_zznp.zzalC)).a(com_google_android_gms_internal_zznp);
    }

    private void zze(int i, boolean z) {
        c cVar = (c) this.zzanO.get(i);
        if (cVar != null) {
            if (!z) {
                this.zzanO.delete(i);
            }
            cVar.a(i, z);
            return;
        }
        Log.wtf("GoogleApiManager", "onRelease received for unknown instance: " + i, new Exception());
    }

    public static zzoj zzsq() {
        zzoj com_google_android_gms_internal_zzoj;
        synchronized (zzrs) {
            com_google_android_gms_internal_zzoj = zzanL;
        }
        return com_google_android_gms_internal_zzoj;
    }

    private void zzsr() {
        for (c cVar : this.zzanP.values()) {
            cVar.b();
            cVar.j();
        }
    }

    public boolean handleMessage(Message message) {
        boolean z = false;
        switch (message.what) {
            case 1:
                zza((zzns) message.obj);
                break;
            case 2:
            case 7:
                int i = message.arg1;
                if (message.arg2 == 1) {
                    z = true;
                }
                zze(i, z);
                break;
            case 3:
                zzsr();
                break;
            case 4:
                zza((zznp) message.obj);
                break;
            case 5:
                if (this.zzanO.get(message.arg1) != null) {
                    ((c) this.zzanO.get(message.arg1)).a(new Status(17, "Error resolution was canceled by the user."));
                    break;
                }
                break;
            case 6:
                zza((zzc) message.obj, message.arg1);
                break;
            case 8:
                if (this.zzanP.containsKey(message.obj)) {
                    ((c) this.zzanP.get(message.obj)).e();
                    break;
                }
                break;
            case 9:
                if (this.zzanP.containsKey(message.obj)) {
                    ((c) this.zzanP.get(message.obj)).g();
                    break;
                }
                break;
            case 10:
                if (this.zzanP.containsKey(message.obj)) {
                    ((c) this.zzanP.get(message.obj)).i();
                    break;
                }
                break;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + message.what);
                return false;
        }
        return true;
    }

    public void zza(ConnectionResult connectionResult, int i) {
        if (!zzc(connectionResult, i)) {
            this.mHandler.sendMessage(this.mHandler.obtainMessage(5, i, 0));
        }
    }

    public <O extends ApiOptions> void zza(zzc<O> com_google_android_gms_common_api_zzc_O, int i, zza<? extends Result, zzb> com_google_android_gms_internal_zznt_zza__extends_com_google_android_gms_common_api_Result__com_google_android_gms_common_api_Api_zzb) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(4, new zznp.zza(com_google_android_gms_common_api_zzc_O.getInstanceId(), i, com_google_android_gms_internal_zznt_zza__extends_com_google_android_gms_common_api_Result__com_google_android_gms_common_api_Api_zzb)));
    }

    public <O extends ApiOptions, TResult> void zza(zzc<O> com_google_android_gms_common_api_zzc_O, int i, zzpd<zzb, TResult> com_google_android_gms_internal_zzpd_com_google_android_gms_common_api_Api_zzb__TResult, TaskCompletionSource<TResult> taskCompletionSource) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(4, new zznp.zzb(com_google_android_gms_common_api_zzc_O.getInstanceId(), i, com_google_android_gms_internal_zzpd_com_google_android_gms_common_api_Api_zzb__TResult, taskCompletionSource)));
    }

    public void zza(zzns com_google_android_gms_internal_zzns) {
        for (zznq com_google_android_gms_internal_zznq : com_google_android_gms_internal_zzns.zzrC()) {
            c cVar = (c) this.zzanP.get(com_google_android_gms_internal_zznq);
            if (cVar == null) {
                com_google_android_gms_internal_zzns.cancel();
                return;
            } else if (cVar.d()) {
                com_google_android_gms_internal_zzns.zza(com_google_android_gms_internal_zznq, ConnectionResult.zzakj);
            } else if (cVar.c() != null) {
                com_google_android_gms_internal_zzns.zza(com_google_android_gms_internal_zznq, cVar.c());
            } else {
                cVar.a(com_google_android_gms_internal_zzns);
            }
        }
    }

    public void zza(zzny com_google_android_gms_internal_zzny) {
        synchronized (zzrs) {
            if (com_google_android_gms_internal_zzny == null) {
                this.zzanQ = null;
                this.zzanR.clear();
            }
        }
    }

    boolean zzc(ConnectionResult connectionResult, int i) {
        if (!connectionResult.hasResolution() && !this.zzaln.isUserResolvableError(connectionResult.getErrorCode())) {
            return false;
        }
        this.zzaln.zza(this.mContext, connectionResult, i);
        return true;
    }

    public void zzd(int i, boolean z) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(7, i, z ? 1 : 2));
    }

    public void zzrA() {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(3));
    }
}
