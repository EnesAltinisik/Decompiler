package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzd.zzf;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.common.zzc;
import com.google.android.gms.signin.internal.SignInResponse;
import com.google.android.gms.signin.internal.zzb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

public class zzod implements zzog {
    private final Context mContext;
    private final zza<? extends zztv, zztw> zzalo;
    private final zzoh zzamB;
    private final zzc zzamE;
    private ConnectionResult zzamF;
    private int zzamG;
    private int zzamH = 0;
    private int zzamI;
    private final Bundle zzamJ = new Bundle();
    private final Set<Api.zzc> zzamK = new HashSet();
    private zztv zzamL;
    private int zzamM;
    private boolean zzamN;
    private boolean zzamO;
    private zzq zzamP;
    private boolean zzamQ;
    private boolean zzamR;
    private final zzg zzamS;
    private final Map<Api<?>, Integer> zzamT;
    private ArrayList<Future<?>> zzamU = new ArrayList();
    private final Lock zzamw;

    private static class a implements zzf {
        private final WeakReference<zzod> a;
        private final Api<?> b;
        private final int c;

        public a(zzod com_google_android_gms_internal_zzod, Api<?> api, int i) {
            this.a = new WeakReference(com_google_android_gms_internal_zzod);
            this.b = api;
            this.c = i;
        }

        public void zzh(ConnectionResult connectionResult) {
            boolean z = false;
            zzod com_google_android_gms_internal_zzod = (zzod) this.a.get();
            if (com_google_android_gms_internal_zzod != null) {
                if (Looper.myLooper() == com_google_android_gms_internal_zzod.zzamB.zzamm.getLooper()) {
                    z = true;
                }
                zzaa.zza(z, (Object) "onReportServiceBinding must be called on the GoogleApiClient handler thread");
                com_google_android_gms_internal_zzod.zzamw.lock();
                try {
                    if (com_google_android_gms_internal_zzod.zzbH(0)) {
                        if (!connectionResult.isSuccess()) {
                            com_google_android_gms_internal_zzod.zzb(connectionResult, this.b, this.c);
                        }
                        if (com_google_android_gms_internal_zzod.zzrY()) {
                            com_google_android_gms_internal_zzod.zzrZ();
                        }
                        com_google_android_gms_internal_zzod.zzamw.unlock();
                    }
                } finally {
                    com_google_android_gms_internal_zzod.zzamw.unlock();
                }
            }
        }
    }

    private abstract class f implements Runnable {
        final /* synthetic */ zzod b;

        private f(zzod com_google_android_gms_internal_zzod) {
            this.b = com_google_android_gms_internal_zzod;
        }

        protected abstract void a();

        public void run() {
            this.b.zzamw.lock();
            try {
                if (!Thread.interrupted()) {
                    a();
                    this.b.zzamw.unlock();
                }
            } catch (RuntimeException e) {
                this.b.zzamB.zza(e);
            } finally {
                this.b.zzamw.unlock();
            }
        }
    }

    private class b extends f {
        final /* synthetic */ zzod a;
        private final Map<zze, a> c;

        public b(zzod com_google_android_gms_internal_zzod, Map<zze, a> map) {
            this.a = com_google_android_gms_internal_zzod;
            super();
            this.c = map;
        }

        public void a() {
            int i;
            int i2 = 1;
            int i3 = 0;
            int i4 = 1;
            int i5 = 0;
            for (zze com_google_android_gms_common_api_Api_zze : this.c.keySet()) {
                if (!com_google_android_gms_common_api_Api_zze.zzrg()) {
                    i = 0;
                    i4 = i5;
                } else if (((a) this.c.get(com_google_android_gms_common_api_Api_zze)).c == 0) {
                    i = 1;
                    break;
                } else {
                    i = i4;
                    i4 = 1;
                }
                i5 = i4;
                i4 = i;
            }
            i2 = i5;
            i = 0;
            if (i2 != 0) {
                i3 = this.a.zzamE.isGooglePlayServicesAvailable(this.a.mContext);
            }
            if (i3 == 0 || (r0 == 0 && i4 == 0)) {
                if (this.a.zzamN) {
                    this.a.zzamL.connect();
                }
                for (zze com_google_android_gms_common_api_Api_zze2 : this.c.keySet()) {
                    final zzf com_google_android_gms_common_internal_zzd_zzf = (zzf) this.c.get(com_google_android_gms_common_api_Api_zze2);
                    if (!com_google_android_gms_common_api_Api_zze2.zzrg() || i3 == 0) {
                        com_google_android_gms_common_api_Api_zze2.zza(com_google_android_gms_common_internal_zzd_zzf);
                    } else {
                        this.a.zzamB.zza(new a(this, this.a) {
                            final /* synthetic */ b b;

                            public void a() {
                                com_google_android_gms_common_internal_zzd_zzf.zzh(new ConnectionResult(16, null));
                            }
                        });
                    }
                }
                return;
            }
            final ConnectionResult connectionResult = new ConnectionResult(i3, null);
            this.a.zzamB.zza(new a(this, this.a) {
                final /* synthetic */ b b;

                public void a() {
                    this.b.a.zzg(connectionResult);
                }
            });
        }
    }

    private class c extends f {
        final /* synthetic */ zzod a;
        private final ArrayList<zze> c;

        public c(zzod com_google_android_gms_internal_zzod, ArrayList<zze> arrayList) {
            this.a = com_google_android_gms_internal_zzod;
            super();
            this.c = arrayList;
        }

        public void a() {
            this.a.zzamB.zzamm.zzano = this.a.zzse();
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((zze) it.next()).zza(this.a.zzamP, this.a.zzamB.zzamm.zzano);
            }
        }
    }

    private static class d extends zzb {
        private final WeakReference<zzod> a;

        d(zzod com_google_android_gms_internal_zzod) {
            this.a = new WeakReference(com_google_android_gms_internal_zzod);
        }

        public void zzb(final SignInResponse signInResponse) {
            final zzod com_google_android_gms_internal_zzod = (zzod) this.a.get();
            if (com_google_android_gms_internal_zzod != null) {
                com_google_android_gms_internal_zzod.zzamB.zza(new a(this, com_google_android_gms_internal_zzod) {
                    final /* synthetic */ d c;

                    public void a() {
                        com_google_android_gms_internal_zzod.zza(signInResponse);
                    }
                });
            }
        }
    }

    private class e implements ConnectionCallbacks, OnConnectionFailedListener {
        final /* synthetic */ zzod a;

        private e(zzod com_google_android_gms_internal_zzod) {
            this.a = com_google_android_gms_internal_zzod;
        }

        public void onConnected(Bundle bundle) {
            this.a.zzamL.zza(new d(this.a));
        }

        public void onConnectionFailed(ConnectionResult connectionResult) {
            this.a.zzamw.lock();
            try {
                if (this.a.zzf(connectionResult)) {
                    this.a.zzsc();
                    this.a.zzrZ();
                } else {
                    this.a.zzg(connectionResult);
                }
                this.a.zzamw.unlock();
            } catch (Throwable th) {
                this.a.zzamw.unlock();
            }
        }

        public void onConnectionSuspended(int i) {
        }
    }

    public zzod(zzoh com_google_android_gms_internal_zzoh, zzg com_google_android_gms_common_internal_zzg, Map<Api<?>, Integer> map, zzc com_google_android_gms_common_zzc, zza<? extends zztv, zztw> com_google_android_gms_common_api_Api_zza__extends_com_google_android_gms_internal_zztv__com_google_android_gms_internal_zztw, Lock lock, Context context) {
        this.zzamB = com_google_android_gms_internal_zzoh;
        this.zzamS = com_google_android_gms_common_internal_zzg;
        this.zzamT = map;
        this.zzamE = com_google_android_gms_common_zzc;
        this.zzalo = com_google_android_gms_common_api_Api_zza__extends_com_google_android_gms_internal_zztv__com_google_android_gms_internal_zztw;
        this.zzamw = lock;
        this.mContext = context;
    }

    private void zza(SignInResponse signInResponse) {
        if (zzbH(0)) {
            ConnectionResult zztR = signInResponse.zztR();
            if (zztR.isSuccess()) {
                ResolveAccountResponse zzIY = signInResponse.zzIY();
                ConnectionResult zztR2 = zzIY.zztR();
                if (zztR2.isSuccess()) {
                    this.zzamO = true;
                    this.zzamP = zzIY.zztQ();
                    this.zzamQ = zzIY.zztS();
                    this.zzamR = zzIY.zztT();
                    zzrZ();
                    return;
                }
                String valueOf = String.valueOf(zztR2);
                Log.wtf("GoogleApiClientConnecting", new StringBuilder(String.valueOf(valueOf).length() + 48).append("Sign-in succeeded with resolve account failure: ").append(valueOf).toString(), new Exception());
                zzg(zztR2);
            } else if (zzf(zztR)) {
                zzsc();
                zzrZ();
            } else {
                zzg(zztR);
            }
        }
    }

    private boolean zza(int i, int i2, ConnectionResult connectionResult) {
        return (i2 != 1 || zze(connectionResult)) ? this.zzamF == null || i < this.zzamG : false;
    }

    private void zzah(boolean z) {
        if (this.zzamL != null) {
            if (this.zzamL.isConnected() && z) {
                this.zzamL.zzIP();
            }
            this.zzamL.disconnect();
            this.zzamP = null;
        }
    }

    private void zzb(ConnectionResult connectionResult, Api<?> api, int i) {
        if (i != 2) {
            int priority = api.zzrb().getPriority();
            if (zza(priority, i, connectionResult)) {
                this.zzamF = connectionResult;
                this.zzamG = priority;
            }
        }
        this.zzamB.zzanC.put(api.zzre(), connectionResult);
    }

    private boolean zzbH(int i) {
        if (this.zzamH == i) {
            return true;
        }
        Log.i("GoogleApiClientConnecting", this.zzamB.zzamm.zzsl());
        String valueOf = String.valueOf(zzbI(this.zzamH));
        String valueOf2 = String.valueOf(zzbI(i));
        Log.wtf("GoogleApiClientConnecting", new StringBuilder((String.valueOf(valueOf).length() + 70) + String.valueOf(valueOf2).length()).append("GoogleApiClient connecting is in step ").append(valueOf).append(" but received callback for step ").append(valueOf2).toString(), new Exception());
        zzg(new ConnectionResult(8, null));
        return false;
    }

    private String zzbI(int i) {
        switch (i) {
            case 0:
                return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            case 1:
                return "STEP_GETTING_REMOTE_SERVICE";
            default:
                return "UNKNOWN";
        }
    }

    private boolean zze(ConnectionResult connectionResult) {
        return connectionResult.hasResolution() || this.zzamE.zzbB(connectionResult.getErrorCode()) != null;
    }

    private boolean zzf(ConnectionResult connectionResult) {
        return this.zzamM != 2 ? this.zzamM == 1 && !connectionResult.hasResolution() : true;
    }

    private void zzg(ConnectionResult connectionResult) {
        zzsd();
        zzah(!connectionResult.hasResolution());
        this.zzamB.zzi(connectionResult);
        this.zzamB.zzanG.zzd(connectionResult);
    }

    private boolean zzrY() {
        this.zzamI--;
        if (this.zzamI > 0) {
            return false;
        }
        if (this.zzamI < 0) {
            Log.i("GoogleApiClientConnecting", this.zzamB.zzamm.zzsl());
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            zzg(new ConnectionResult(8, null));
            return false;
        } else if (this.zzamF == null) {
            return true;
        } else {
            this.zzamB.zzanF = this.zzamG;
            zzg(this.zzamF);
            return false;
        }
    }

    private void zzrZ() {
        if (this.zzamI == 0) {
            if (!this.zzamN || this.zzamO) {
                zzsa();
            }
        }
    }

    private void zzsa() {
        ArrayList arrayList = new ArrayList();
        this.zzamH = 1;
        this.zzamI = this.zzamB.zzann.size();
        for (Api.zzc com_google_android_gms_common_api_Api_zzc : this.zzamB.zzann.keySet()) {
            if (!this.zzamB.zzanC.containsKey(com_google_android_gms_common_api_Api_zzc)) {
                arrayList.add((zze) this.zzamB.zzann.get(com_google_android_gms_common_api_Api_zzc));
            } else if (zzrY()) {
                zzsb();
            }
        }
        if (!arrayList.isEmpty()) {
            this.zzamU.add(zzoi.zzsp().submit(new c(this, arrayList)));
        }
    }

    private void zzsb() {
        this.zzamB.zzsn();
        zzoi.zzsp().execute(new Runnable(this) {
            final /* synthetic */ zzod a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.zzamE.zzag(this.a.mContext);
            }
        });
        if (this.zzamL != null) {
            if (this.zzamQ) {
                this.zzamL.zza(this.zzamP, this.zzamR);
            }
            zzah(false);
        }
        for (Api.zzc com_google_android_gms_common_api_Api_zzc : this.zzamB.zzanC.keySet()) {
            ((zze) this.zzamB.zzann.get(com_google_android_gms_common_api_Api_zzc)).disconnect();
        }
        this.zzamB.zzanG.zzk(this.zzamJ.isEmpty() ? null : this.zzamJ);
    }

    private void zzsc() {
        this.zzamN = false;
        this.zzamB.zzamm.zzano = Collections.emptySet();
        for (Api.zzc com_google_android_gms_common_api_Api_zzc : this.zzamK) {
            if (!this.zzamB.zzanC.containsKey(com_google_android_gms_common_api_Api_zzc)) {
                this.zzamB.zzanC.put(com_google_android_gms_common_api_Api_zzc, new ConnectionResult(17, null));
            }
        }
    }

    private void zzsd() {
        Iterator it = this.zzamU.iterator();
        while (it.hasNext()) {
            ((Future) it.next()).cancel(true);
        }
        this.zzamU.clear();
    }

    private Set<Scope> zzse() {
        if (this.zzamS == null) {
            return Collections.emptySet();
        }
        Set<Scope> hashSet = new HashSet(this.zzamS.zztv());
        Map zztx = this.zzamS.zztx();
        for (Api api : zztx.keySet()) {
            if (!this.zzamB.zzanC.containsKey(api.zzre())) {
                hashSet.addAll(((zzg.zza) zztx.get(api)).zzacF);
            }
        }
        return hashSet;
    }

    public void begin() {
        this.zzamB.zzanC.clear();
        this.zzamN = false;
        this.zzamF = null;
        this.zzamH = 0;
        this.zzamM = 2;
        this.zzamO = false;
        this.zzamQ = false;
        Map hashMap = new HashMap();
        int i = 0;
        for (Api api : this.zzamT.keySet()) {
            zze com_google_android_gms_common_api_Api_zze = (zze) this.zzamB.zzann.get(api.zzre());
            int intValue = ((Integer) this.zzamT.get(api)).intValue();
            int i2 = (api.zzrb().getPriority() == 1 ? 1 : 0) | i;
            if (com_google_android_gms_common_api_Api_zze.zzpd()) {
                this.zzamN = true;
                if (intValue < this.zzamM) {
                    this.zzamM = intValue;
                }
                if (intValue != 0) {
                    this.zzamK.add(api.zzre());
                }
            }
            hashMap.put(com_google_android_gms_common_api_Api_zze, new a(this, api, intValue));
            i = i2;
        }
        if (i != 0) {
            this.zzamN = false;
        }
        if (this.zzamN) {
            this.zzamS.zzc(Integer.valueOf(this.zzamB.zzamm.getSessionId()));
            ConnectionCallbacks eVar = new e();
            this.zzamL = (zztv) this.zzalo.zza(this.mContext, this.zzamB.zzamm.getLooper(), this.zzamS, this.zzamS.zztB(), eVar, eVar);
        }
        this.zzamI = this.zzamB.zzann.size();
        this.zzamU.add(zzoi.zzsp().submit(new b(this, hashMap)));
    }

    public void connect() {
    }

    public boolean disconnect() {
        zzsd();
        zzah(true);
        this.zzamB.zzi(null);
        return true;
    }

    public void onConnected(Bundle bundle) {
        if (zzbH(1)) {
            if (bundle != null) {
                this.zzamJ.putAll(bundle);
            }
            if (zzrY()) {
                zzsb();
            }
        }
    }

    public void onConnectionSuspended(int i) {
        zzg(new ConnectionResult(8, null));
    }

    public void zza(ConnectionResult connectionResult, Api<?> api, int i) {
        if (zzbH(1)) {
            zzb(connectionResult, api, i);
            if (zzrY()) {
                zzsb();
            }
        }
    }

    public <A extends Api.zzb, R extends Result, T extends zznt.zza<R, A>> T zzc(T t) {
        this.zzamB.zzamm.zzanh.add(t);
        return t;
    }

    public <A extends Api.zzb, T extends zznt.zza<? extends Result, A>> T zzd(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
