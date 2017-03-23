package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.support.v4.h.a;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;
import com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.Api.zzh;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzag;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzg.zza;
import com.google.android.gms.internal.zznr;
import com.google.android.gms.internal.zznt;
import com.google.android.gms.internal.zznw;
import com.google.android.gms.internal.zzof;
import com.google.android.gms.internal.zzop;
import com.google.android.gms.internal.zzou;
import com.google.android.gms.internal.zzpa;
import com.google.android.gms.internal.zzpe;
import com.google.android.gms.internal.zztu;
import com.google.android.gms.internal.zztv;
import com.google.android.gms.internal.zztw;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public abstract class GoogleApiClient {
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;
    private static final Set<GoogleApiClient> zzalc = Collections.newSetFromMap(new WeakHashMap());

    public interface ConnectionCallbacks {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i);
    }

    public interface OnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    public static final class Builder {
        private final Context mContext;
        private Account zzZB;
        private String zzaaN;
        private Looper zzakW;
        private final Set<Scope> zzald;
        private final Set<Scope> zzale;
        private int zzalf;
        private View zzalg;
        private String zzalh;
        private final Map<Api<?>, zza> zzali;
        private final Map<Api<?>, ApiOptions> zzalj;
        private zzop zzalk;
        private int zzall;
        private OnConnectionFailedListener zzalm;
        private GoogleApiAvailability zzaln;
        private Api.zza<? extends zztv, zztw> zzalo;
        private final ArrayList<ConnectionCallbacks> zzalp;
        private final ArrayList<OnConnectionFailedListener> zzalq;

        public Builder(Context context) {
            this.zzald = new HashSet();
            this.zzale = new HashSet();
            this.zzali = new a();
            this.zzalj = new a();
            this.zzall = -1;
            this.zzaln = GoogleApiAvailability.getInstance();
            this.zzalo = zztu.zzaaA;
            this.zzalp = new ArrayList();
            this.zzalq = new ArrayList();
            this.mContext = context;
            this.zzakW = context.getMainLooper();
            this.zzaaN = context.getPackageName();
            this.zzalh = context.getClass().getName();
        }

        public Builder(Context context, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            this(context);
            zzaa.zzb((Object) connectionCallbacks, (Object) "Must provide a connected listener");
            this.zzalp.add(connectionCallbacks);
            zzaa.zzb((Object) onConnectionFailedListener, (Object) "Must provide a connection failed listener");
            this.zzalq.add(onConnectionFailedListener);
        }

        private static <C extends zze, O> C zza(Api.zza<C, O> com_google_android_gms_common_api_Api_zza_C__O, Object obj, Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return com_google_android_gms_common_api_Api_zza_C__O.zza(context, looper, com_google_android_gms_common_internal_zzg, obj, connectionCallbacks, onConnectionFailedListener);
        }

        private Builder zza(zzop com_google_android_gms_internal_zzop, int i, OnConnectionFailedListener onConnectionFailedListener) {
            zzaa.zzb(i >= 0, (Object) "clientId must be non-negative");
            this.zzall = i;
            this.zzalm = onConnectionFailedListener;
            this.zzalk = com_google_android_gms_internal_zzop;
            return this;
        }

        private static <C extends Api.zzg, O> zzag zza(zzh<C, O> com_google_android_gms_common_api_Api_zzh_C__O, Object obj, Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zzag(context, looper, com_google_android_gms_common_api_Api_zzh_C__O.zzri(), connectionCallbacks, onConnectionFailedListener, com_google_android_gms_common_internal_zzg, com_google_android_gms_common_api_Api_zzh_C__O.zzr(obj));
        }

        private <O extends ApiOptions> void zza(Api<O> api, O o, int i, Scope... scopeArr) {
            boolean z = true;
            int i2 = 0;
            if (i != 1) {
                if (i == 2) {
                    z = false;
                } else {
                    throw new IllegalArgumentException("Invalid resolution mode: '" + i + "', use a constant from GoogleApiClient.ResolutionMode");
                }
            }
            Set hashSet = new HashSet(api.zzrb().zzp(o));
            int length = scopeArr.length;
            while (i2 < length) {
                hashSet.add(scopeArr[i2]);
                i2++;
            }
            this.zzali.put(api, new zza(hashSet, z));
        }

        private void zze(GoogleApiClient googleApiClient) {
            zznr.zza(this.zzalk).zza(this.zzall, googleApiClient, this.zzalm);
        }

        private GoogleApiClient zzru() {
            zzg zzrt = zzrt();
            Api api = null;
            Map zztx = zzrt.zztx();
            Map aVar = new a();
            Map aVar2 = new a();
            ArrayList arrayList = new ArrayList();
            Api api2 = null;
            for (Api api3 : this.zzalj.keySet()) {
                Api api32;
                zze zza;
                Api api4;
                Object obj = this.zzalj.get(api32);
                int i = 0;
                if (zztx.get(api32) != null) {
                    i = ((zza) zztx.get(api32)).zzars ? 1 : 2;
                }
                aVar.put(api32, Integer.valueOf(i));
                ConnectionCallbacks com_google_android_gms_internal_zznw = new zznw(api32, i);
                arrayList.add(com_google_android_gms_internal_zznw);
                Api api5;
                if (api32.zzrf()) {
                    zzh zzrd = api32.zzrd();
                    api5 = zzrd.getPriority() == 1 ? api32 : api2;
                    zza = zza(zzrd, obj, this.mContext, this.zzakW, zzrt, com_google_android_gms_internal_zznw, (OnConnectionFailedListener) com_google_android_gms_internal_zznw);
                    api4 = api5;
                } else {
                    Api.zza zzrc = api32.zzrc();
                    api5 = zzrc.getPriority() == 1 ? api32 : api2;
                    zza = zza(zzrc, obj, this.mContext, this.zzakW, zzrt, com_google_android_gms_internal_zznw, (OnConnectionFailedListener) com_google_android_gms_internal_zznw);
                    api4 = api5;
                }
                aVar2.put(api32.zzre(), zza);
                if (!zza.zzps()) {
                    api32 = api;
                } else if (api != null) {
                    String valueOf = String.valueOf(api32.getName());
                    String valueOf2 = String.valueOf(api.getName());
                    throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 21) + String.valueOf(valueOf2).length()).append(valueOf).append(" cannot be used with ").append(valueOf2).toString());
                }
                api2 = api4;
                api = api32;
            }
            if (api != null) {
                if (api2 != null) {
                    valueOf = String.valueOf(api.getName());
                    valueOf2 = String.valueOf(api2.getName());
                    throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 21) + String.valueOf(valueOf2).length()).append(valueOf).append(" cannot be used with ").append(valueOf2).toString());
                }
                zzaa.zza(this.zzZB == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", api.getName());
                zzaa.zza(this.zzald.equals(this.zzale), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", api.getName());
            }
            return new zzof(this.mContext, new ReentrantLock(), this.zzakW, zzrt, this.zzaln, this.zzalo, aVar, this.zzalp, this.zzalq, aVar2, this.zzall, zzof.zza(aVar2.values(), true), arrayList);
        }

        public Builder addApi(Api<? extends NotRequiredOptions> api) {
            zzaa.zzb((Object) api, (Object) "Api must not be null");
            this.zzalj.put(api, null);
            Collection zzp = api.zzrb().zzp(null);
            this.zzale.addAll(zzp);
            this.zzald.addAll(zzp);
            return this;
        }

        public <O extends HasOptions> Builder addApi(Api<O> api, O o) {
            zzaa.zzb((Object) api, (Object) "Api must not be null");
            zzaa.zzb((Object) o, (Object) "Null options are not permitted for this Api");
            this.zzalj.put(api, o);
            Collection zzp = api.zzrb().zzp(o);
            this.zzale.addAll(zzp);
            this.zzald.addAll(zzp);
            return this;
        }

        public <O extends HasOptions> Builder addApiIfAvailable(Api<O> api, O o, Scope... scopeArr) {
            zzaa.zzb((Object) api, (Object) "Api must not be null");
            zzaa.zzb((Object) o, (Object) "Null options are not permitted for this Api");
            this.zzalj.put(api, o);
            zza(api, o, 1, scopeArr);
            return this;
        }

        public Builder addApiIfAvailable(Api<? extends NotRequiredOptions> api, Scope... scopeArr) {
            zzaa.zzb((Object) api, (Object) "Api must not be null");
            this.zzalj.put(api, null);
            zza(api, null, 1, scopeArr);
            return this;
        }

        public Builder addConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
            zzaa.zzb((Object) connectionCallbacks, (Object) "Listener must not be null");
            this.zzalp.add(connectionCallbacks);
            return this;
        }

        public Builder addOnConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
            zzaa.zzb((Object) onConnectionFailedListener, (Object) "Listener must not be null");
            this.zzalq.add(onConnectionFailedListener);
            return this;
        }

        public Builder addScope(Scope scope) {
            zzaa.zzb((Object) scope, (Object) "Scope must not be null");
            this.zzald.add(scope);
            return this;
        }

        public GoogleApiClient build() {
            zzaa.zzb(!this.zzalj.isEmpty(), (Object) "must call addApi() to add at least one API");
            GoogleApiClient zzru = zzru();
            synchronized (GoogleApiClient.zzalc) {
                GoogleApiClient.zzalc.add(zzru);
            }
            if (this.zzall >= 0) {
                zze(zzru);
            }
            return zzru;
        }

        public Builder enableAutoManage(FragmentActivity fragmentActivity, int i, OnConnectionFailedListener onConnectionFailedListener) {
            return zza(new zzop(fragmentActivity), i, onConnectionFailedListener);
        }

        public Builder enableAutoManage(FragmentActivity fragmentActivity, OnConnectionFailedListener onConnectionFailedListener) {
            return enableAutoManage(fragmentActivity, 0, onConnectionFailedListener);
        }

        public Builder setAccountName(String str) {
            this.zzZB = str == null ? null : new Account(str, "com.google");
            return this;
        }

        public Builder setGravityForPopups(int i) {
            this.zzalf = i;
            return this;
        }

        public Builder setHandler(Handler handler) {
            zzaa.zzb((Object) handler, (Object) "Handler must not be null");
            this.zzakW = handler.getLooper();
            return this;
        }

        public Builder setViewForPopups(View view) {
            zzaa.zzb((Object) view, (Object) "View must not be null");
            this.zzalg = view;
            return this;
        }

        public Builder useDefaultAccount() {
            return setAccountName("<<default account>>");
        }

        public zzg zzrt() {
            zztw com_google_android_gms_internal_zztw = zztw.zzbnf;
            if (this.zzalj.containsKey(zztu.API)) {
                com_google_android_gms_internal_zztw = (zztw) this.zzalj.get(zztu.API);
            }
            return new zzg(this.zzZB, this.zzald, this.zzali, this.zzalf, this.zzalg, this.zzaaN, this.zzalh, com_google_android_gms_internal_zztw);
        }
    }

    public static void dumpAll(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        synchronized (zzalc) {
            String concat = String.valueOf(str).concat("  ");
            int i = 0;
            for (GoogleApiClient googleApiClient : zzalc) {
                int i2 = i + 1;
                printWriter.append(str).append("GoogleApiClient#").println(i);
                googleApiClient.dump(concat, fileDescriptor, printWriter, strArr);
                i = i2;
            }
        }
    }

    public static Set<GoogleApiClient> zzrq() {
        Set<GoogleApiClient> set;
        synchronized (zzalc) {
            set = zzalc;
        }
        return set;
    }

    public abstract ConnectionResult blockingConnect();

    public abstract ConnectionResult blockingConnect(long j, TimeUnit timeUnit);

    public abstract PendingResult<Status> clearDefaultAccountAndReconnect();

    public abstract void connect();

    public void connect(int i) {
        throw new UnsupportedOperationException();
    }

    public abstract void disconnect();

    public abstract void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract ConnectionResult getConnectionResult(Api<?> api);

    public Context getContext() {
        throw new UnsupportedOperationException();
    }

    public Looper getLooper() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean hasConnectedApi(Api<?> api);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(ConnectionCallbacks connectionCallbacks);

    public abstract boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener onConnectionFailedListener);

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(ConnectionCallbacks connectionCallbacks);

    public abstract void registerConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener);

    public abstract void stopAutoManage(FragmentActivity fragmentActivity);

    public abstract void unregisterConnectionCallbacks(ConnectionCallbacks connectionCallbacks);

    public abstract void unregisterConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener);

    public <C extends zze> C zza(zzc<C> com_google_android_gms_common_api_Api_zzc_C) {
        throw new UnsupportedOperationException();
    }

    public void zza(zzpe com_google_android_gms_internal_zzpe) {
        throw new UnsupportedOperationException();
    }

    public boolean zza(Api<?> api) {
        throw new UnsupportedOperationException();
    }

    public boolean zza(zzpa com_google_android_gms_internal_zzpa) {
        throw new UnsupportedOperationException();
    }

    public void zzb(zzpe com_google_android_gms_internal_zzpe) {
        throw new UnsupportedOperationException();
    }

    public <A extends zzb, R extends Result, T extends zznt.zza<R, A>> T zzc(T t) {
        throw new UnsupportedOperationException();
    }

    public <A extends zzb, T extends zznt.zza<? extends Result, A>> T zzd(T t) {
        throw new UnsupportedOperationException();
    }

    public void zzrr() {
        throw new UnsupportedOperationException();
    }

    public <L> zzou<L> zzs(L l) {
        throw new UnsupportedOperationException();
    }
}
