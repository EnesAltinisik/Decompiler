package com.google.android.gms.common.api;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.nearby.messages.Strategy;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class Api<O extends ApiOptions> {
    private final String mName;
    private final zzf<?> zzajk;
    private final zza<?, O> zzakG;
    private final zzh<?, O> zzakH = null;
    private final zzi<?> zzakI;

    public static abstract class zzd<T extends zzb, O> {
        public int getPriority() {
            return Strategy.TTL_SECONDS_INFINITE;
        }

        public List<Scope> zzp(O o) {
            return Collections.emptyList();
        }
    }

    public static abstract class zza<T extends zze, O> extends zzd<T, O> {
        public abstract T zza(Context context, Looper looper, com.google.android.gms.common.internal.zzg com_google_android_gms_common_internal_zzg, O o, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener);
    }

    public interface ApiOptions {

        public interface HasOptions extends ApiOptions {
        }

        public interface NotRequiredOptions extends ApiOptions {
        }

        public interface Optional extends HasOptions, NotRequiredOptions {
        }

        public static final class NoOptions implements NotRequiredOptions {
            private NoOptions() {
            }
        }
    }

    public interface zzb {
    }

    public interface zze extends zzb {
        void disconnect();

        void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        boolean isConnected();

        boolean isConnecting();

        void zza(com.google.android.gms.common.internal.zzd.zzf com_google_android_gms_common_internal_zzd_zzf);

        void zza(zzq com_google_android_gms_common_internal_zzq, Set<Scope> set);

        boolean zzpd();

        boolean zzps();

        Intent zzpt();

        boolean zzrg();

        IBinder zzrh();
    }

    public static class zzc<C extends zzb> {
    }

    public static final class zzf<C extends zze> extends zzc<C> {
    }

    public interface zzg<T extends IInterface> extends zzb {
        void zza(int i, T t);

        T zzab(IBinder iBinder);

        String zzhT();

        String zzhU();
    }

    public static abstract class zzh<T extends zzg, O> extends zzd<T, O> {
        public abstract T zzr(O o);

        public abstract int zzri();
    }

    public static final class zzi<C extends zzg> extends zzc<C> {
    }

    public <C extends zze> Api(String str, zza<C, O> com_google_android_gms_common_api_Api_zza_C__O, zzf<C> com_google_android_gms_common_api_Api_zzf_C) {
        zzaa.zzb((Object) com_google_android_gms_common_api_Api_zza_C__O, (Object) "Cannot construct an Api with a null ClientBuilder");
        zzaa.zzb((Object) com_google_android_gms_common_api_Api_zzf_C, (Object) "Cannot construct an Api with a null ClientKey");
        this.mName = str;
        this.zzakG = com_google_android_gms_common_api_Api_zza_C__O;
        this.zzajk = com_google_android_gms_common_api_Api_zzf_C;
        this.zzakI = null;
    }

    public String getName() {
        return this.mName;
    }

    public zzd<?, O> zzrb() {
        return zzrf() ? null : this.zzakG;
    }

    public zza<?, O> zzrc() {
        zzaa.zza(this.zzakG != null, (Object) "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.zzakG;
    }

    public zzh<?, O> zzrd() {
        zzaa.zza(false, (Object) "This API was constructed with a ClientBuilder. Use getClientBuilder");
        return null;
    }

    public zzc<?> zzre() {
        if (this.zzajk != null) {
            return this.zzajk;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    public boolean zzrf() {
        return false;
    }
}
