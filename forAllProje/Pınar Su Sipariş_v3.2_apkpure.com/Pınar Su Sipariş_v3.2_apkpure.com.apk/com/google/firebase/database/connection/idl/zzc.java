package com.google.firebase.database.connection.idl;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzaef;
import com.google.android.gms.internal.zzaei;
import com.google.android.gms.internal.zzaej;
import com.google.android.gms.internal.zzaem;
import com.google.firebase.database.connection.idl.zzj.zza;
import java.util.List;
import java.util.Map;

public class zzc implements zzaej {
    private final zzh zzbKt;

    class AnonymousClass2 extends zza {
        final /* synthetic */ zzaem a;

        AnonymousClass2(zzaem com_google_android_gms_internal_zzaem) {
            this.a = com_google_android_gms_internal_zzaem;
        }

        public void zzaj(String str, String str2) throws RemoteException {
            this.a.zzaj(str, str2);
        }
    }

    private zzc(zzh com_google_firebase_database_connection_idl_zzh) {
        this.zzbKt = com_google_firebase_database_connection_idl_zzh;
    }

    public static zzc zza(Context context, ConnectionConfig connectionConfig, zzaef com_google_android_gms_internal_zzaef, zzaej.zza com_google_android_gms_internal_zzaej_zza) {
        return new zzc(IPersistentConnectionImpl.loadDynamic(context, connectionConfig, com_google_android_gms_internal_zzaef.zzPU(), com_google_android_gms_internal_zzaef.zzPV(), com_google_android_gms_internal_zzaej_zza));
    }

    private static zzj zza(zzaem com_google_android_gms_internal_zzaem) {
        return new AnonymousClass2(com_google_android_gms_internal_zzaem);
    }

    public void initialize() {
        try {
            this.zzbKt.initialize();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void interrupt(String str) {
        try {
            this.zzbKt.interrupt(str);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isInterrupted(String str) {
        try {
            return this.zzbKt.isInterrupted(str);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void purgeOutstandingWrites() {
        try {
            this.zzbKt.purgeOutstandingWrites();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void refreshAuthToken() {
        try {
            this.zzbKt.refreshAuthToken();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void resume(String str) {
        try {
            this.zzbKt.resume(str);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void shutdown() {
        try {
            this.zzbKt.shutdown();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void zza(List<String> list, zzaem com_google_android_gms_internal_zzaem) {
        try {
            this.zzbKt.onDisconnectCancel(list, zza(com_google_android_gms_internal_zzaem));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void zza(List<String> list, Object obj, zzaem com_google_android_gms_internal_zzaem) {
        try {
            this.zzbKt.put(list, zze.zzD(obj), zza(com_google_android_gms_internal_zzaem));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void zza(List<String> list, Object obj, String str, zzaem com_google_android_gms_internal_zzaem) {
        try {
            this.zzbKt.compareAndPut(list, zze.zzD(obj), str, zza(com_google_android_gms_internal_zzaem));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void zza(List<String> list, Map<String, Object> map) {
        try {
            this.zzbKt.unlisten(list, zze.zzD(map));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void zza(List<String> list, Map<String, Object> map, final zzaei com_google_android_gms_internal_zzaei, Long l, zzaem com_google_android_gms_internal_zzaem) {
        long longValue;
        zzg anonymousClass1 = new zzg.zza(this) {
            final /* synthetic */ zzc b;

            public String zzPY() {
                return com_google_android_gms_internal_zzaei.zzPY();
            }

            public boolean zzPZ() {
                return com_google_android_gms_internal_zzaei.zzPZ();
            }

            public CompoundHashParcelable zzQF() {
                return CompoundHashParcelable.a(com_google_android_gms_internal_zzaei.zzQa());
            }
        };
        if (l != null) {
            try {
                longValue = l.longValue();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        longValue = -1;
        this.zzbKt.listen(list, zze.zzD(map), anonymousClass1, longValue, zza(com_google_android_gms_internal_zzaem));
    }

    public void zza(List<String> list, Map<String, Object> map, zzaem com_google_android_gms_internal_zzaem) {
        try {
            this.zzbKt.merge(list, zze.zzD(map), zza(com_google_android_gms_internal_zzaem));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void zzb(List<String> list, Object obj, zzaem com_google_android_gms_internal_zzaem) {
        try {
            this.zzbKt.onDisconnectPut(list, zze.zzD(obj), zza(com_google_android_gms_internal_zzaem));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void zzb(List<String> list, Map<String, Object> map, zzaem com_google_android_gms_internal_zzaem) {
        try {
            this.zzbKt.onDisconnectMerge(list, zze.zzD(map), zza(com_google_android_gms_internal_zzaem));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
