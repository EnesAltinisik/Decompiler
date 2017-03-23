package com.google.firebase.database.connection.idl;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.firebase_database.ModuleDescriptor;
import com.google.android.gms.internal.zzaec;
import com.google.android.gms.internal.zzaee;
import com.google.android.gms.internal.zzaef;
import com.google.android.gms.internal.zzaei;
import com.google.android.gms.internal.zzaej;
import com.google.android.gms.internal.zzaek;
import com.google.android.gms.internal.zzael;
import com.google.android.gms.internal.zzaem;
import com.google.android.gms.internal.zzahd;
import com.google.android.gms.internal.zzqi;
import com.google.firebase.database.connection.idl.zzh.zza;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

@DynamiteApi
public class IPersistentConnectionImpl extends zza {
    private zzaej zzbKx;

    class AnonymousClass2 implements zzaem {
        final /* synthetic */ zzj a;

        AnonymousClass2(zzj com_google_firebase_database_connection_idl_zzj) {
            this.a = com_google_firebase_database_connection_idl_zzj;
        }

        public void zzaj(String str, String str2) {
            try {
                this.a.zzaj(str, str2);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    class AnonymousClass3 extends zzi.zza {
        final /* synthetic */ zzaej.zza a;

        AnonymousClass3(zzaej.zza com_google_android_gms_internal_zzaej_zza) {
            this.a = com_google_android_gms_internal_zzaej_zza;
        }

        public void onDisconnect() {
            this.a.onDisconnect();
        }

        public void zzJ(zzd com_google_android_gms_dynamic_zzd) {
            this.a.zzat((Map) zze.zzx(com_google_android_gms_dynamic_zzd));
        }

        public void zzQb() {
            this.a.zzQb();
        }

        public void zza(List<String> list, zzd com_google_android_gms_dynamic_zzd, boolean z, long j) {
            this.a.zza(list, zze.zzx(com_google_android_gms_dynamic_zzd), z, IPersistentConnectionImpl.zzaz(j));
        }

        public void zza(List<String> list, List<RangeParcelable> list2, zzd com_google_android_gms_dynamic_zzd, long j) {
            List list3 = (List) zze.zzx(com_google_android_gms_dynamic_zzd);
            List arrayList = new ArrayList(list2.size());
            for (int i = 0; i < list2.size(); i++) {
                arrayList.add(RangeParcelable.a((RangeParcelable) list2.get(i), list3.get(i)));
            }
            this.a.zza(list, arrayList, IPersistentConnectionImpl.zzaz(j));
        }

        public void zzaO(boolean z) {
            this.a.zzaO(z);
        }
    }

    class AnonymousClass4 implements zzaej.zza {
        final /* synthetic */ zzi a;

        AnonymousClass4(zzi com_google_firebase_database_connection_idl_zzi) {
            this.a = com_google_firebase_database_connection_idl_zzi;
        }

        public void onDisconnect() {
            try {
                this.a.onDisconnect();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void zzQb() {
            try {
                this.a.zzQb();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void zza(List<String> list, Object obj, boolean z, Long l) {
            try {
                this.a.zza((List) list, zze.zzD(obj), z, IPersistentConnectionImpl.zza(l));
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void zza(List<String> list, List<zzael> list2, Long l) {
            List arrayList = new ArrayList(list2.size());
            List arrayList2 = new ArrayList(list2.size());
            for (zzael com_google_android_gms_internal_zzael : list2) {
                arrayList.add(RangeParcelable.a(com_google_android_gms_internal_zzael));
                arrayList2.add(com_google_android_gms_internal_zzael.zzQw());
            }
            try {
                this.a.zza((List) list, arrayList, zze.zzD(arrayList2), IPersistentConnectionImpl.zza(l));
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void zzaO(boolean z) {
            try {
                this.a.zzaO(z);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void zzat(Map<String, Object> map) {
            try {
                this.a.zzJ(zze.zzD(map));
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    class AnonymousClass5 extends zze.zza {
        final /* synthetic */ zzaee a;

        AnonymousClass5(zzaee com_google_android_gms_internal_zzaee) {
            this.a = com_google_android_gms_internal_zzaee;
        }

        public void zza(boolean z, final zzf com_google_firebase_database_connection_idl_zzf) throws RemoteException {
            this.a.zza(z, new zzaee.zza(this) {
                final /* synthetic */ AnonymousClass5 b;

                public void onError(String str) {
                    try {
                        com_google_firebase_database_connection_idl_zzf.onError(str);
                    } catch (Throwable e) {
                        throw new RuntimeException(e);
                    }
                }

                public void zzhT(String str) {
                    try {
                        com_google_firebase_database_connection_idl_zzf.zzhT(str);
                    } catch (Throwable e) {
                        throw new RuntimeException(e);
                    }
                }
            });
        }
    }

    class AnonymousClass6 implements zzaee {
        final /* synthetic */ zze a;

        AnonymousClass6(zze com_google_firebase_database_connection_idl_zze) {
            this.a = com_google_firebase_database_connection_idl_zze;
        }

        public void zza(boolean z, final zzaee.zza com_google_android_gms_internal_zzaee_zza) {
            try {
                this.a.zza(z, new zzf.zza(this) {
                    final /* synthetic */ AnonymousClass6 b;

                    public void onError(String str) throws RemoteException {
                        com_google_android_gms_internal_zzaee_zza.onError(str);
                    }

                    public void zzhT(String str) throws RemoteException {
                        com_google_android_gms_internal_zzaee_zza.zzhT(str);
                    }
                });
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static zzh loadDynamic(Context context, ConnectionConfig connectionConfig, zzaee com_google_android_gms_internal_zzaee, ScheduledExecutorService scheduledExecutorService, zzaej.zza com_google_android_gms_internal_zzaej_zza) {
        try {
            zzh asInterface = zza.asInterface(zzqi.zza(context, zzqi.zzaCr, ModuleDescriptor.MODULE_ID).zzdM("com.google.firebase.database.connection.idl.IPersistentConnectionImpl"));
            asInterface.setup(connectionConfig, zza(com_google_android_gms_internal_zzaee), zze.zzD(scheduledExecutorService), zza(com_google_android_gms_internal_zzaej_zza));
            return asInterface;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        }
    }

    private static long zza(Long l) {
        if (l == null) {
            return -1;
        }
        if (l.longValue() != -1) {
            return l.longValue();
        }
        throw new IllegalArgumentException("Tag parameter clashed with NO_TAG value");
    }

    private static zzaee zza(zze com_google_firebase_database_connection_idl_zze) {
        return new AnonymousClass6(com_google_firebase_database_connection_idl_zze);
    }

    private static zzaej.zza zza(zzi com_google_firebase_database_connection_idl_zzi) {
        return new AnonymousClass4(com_google_firebase_database_connection_idl_zzi);
    }

    private static zzaem zza(zzj com_google_firebase_database_connection_idl_zzj) {
        return new AnonymousClass2(com_google_firebase_database_connection_idl_zzj);
    }

    private static zze zza(zzaee com_google_android_gms_internal_zzaee) {
        return new AnonymousClass5(com_google_android_gms_internal_zzaee);
    }

    private static zzi zza(zzaej.zza com_google_android_gms_internal_zzaej_zza) {
        return new AnonymousClass3(com_google_android_gms_internal_zzaej_zza);
    }

    private static Long zzaz(long j) {
        return j == -1 ? null : Long.valueOf(j);
    }

    public void compareAndPut(List<String> list, zzd com_google_android_gms_dynamic_zzd, String str, zzj com_google_firebase_database_connection_idl_zzj) {
        this.zzbKx.zza(list, zze.zzx(com_google_android_gms_dynamic_zzd), str, zza(com_google_firebase_database_connection_idl_zzj));
    }

    public void initialize() {
        this.zzbKx.initialize();
    }

    public void interrupt(String str) {
        this.zzbKx.interrupt(str);
    }

    public boolean isInterrupted(String str) {
        return this.zzbKx.isInterrupted(str);
    }

    public void listen(List<String> list, zzd com_google_android_gms_dynamic_zzd, final zzg com_google_firebase_database_connection_idl_zzg, long j, zzj com_google_firebase_database_connection_idl_zzj) {
        Long zzaz = zzaz(j);
        List<String> list2 = list;
        this.zzbKx.zza(list2, (Map) zze.zzx(com_google_android_gms_dynamic_zzd), new zzaei(this) {
            final /* synthetic */ IPersistentConnectionImpl b;

            public String zzPY() {
                try {
                    return com_google_firebase_database_connection_idl_zzg.zzPY();
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }

            public boolean zzPZ() {
                try {
                    return com_google_firebase_database_connection_idl_zzg.zzPZ();
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }

            public zzaec zzQa() {
                try {
                    return CompoundHashParcelable.a(com_google_firebase_database_connection_idl_zzg.zzQF());
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }
        }, zzaz, zza(com_google_firebase_database_connection_idl_zzj));
    }

    public void merge(List<String> list, zzd com_google_android_gms_dynamic_zzd, zzj com_google_firebase_database_connection_idl_zzj) {
        this.zzbKx.zza((List) list, (Map) zze.zzx(com_google_android_gms_dynamic_zzd), zza(com_google_firebase_database_connection_idl_zzj));
    }

    public void onDisconnectCancel(List<String> list, zzj com_google_firebase_database_connection_idl_zzj) {
        this.zzbKx.zza((List) list, zza(com_google_firebase_database_connection_idl_zzj));
    }

    public void onDisconnectMerge(List<String> list, zzd com_google_android_gms_dynamic_zzd, zzj com_google_firebase_database_connection_idl_zzj) {
        this.zzbKx.zzb((List) list, (Map) zze.zzx(com_google_android_gms_dynamic_zzd), zza(com_google_firebase_database_connection_idl_zzj));
    }

    public void onDisconnectPut(List<String> list, zzd com_google_android_gms_dynamic_zzd, zzj com_google_firebase_database_connection_idl_zzj) {
        this.zzbKx.zzb((List) list, zze.zzx(com_google_android_gms_dynamic_zzd), zza(com_google_firebase_database_connection_idl_zzj));
    }

    public void purgeOutstandingWrites() {
        this.zzbKx.purgeOutstandingWrites();
    }

    public void put(List<String> list, zzd com_google_android_gms_dynamic_zzd, zzj com_google_firebase_database_connection_idl_zzj) {
        this.zzbKx.zza((List) list, zze.zzx(com_google_android_gms_dynamic_zzd), zza(com_google_firebase_database_connection_idl_zzj));
    }

    public void refreshAuthToken() {
        this.zzbKx.refreshAuthToken();
    }

    public void resume(String str) {
        this.zzbKx.resume(str);
    }

    public void setup(ConnectionConfig connectionConfig, zze com_google_firebase_database_connection_idl_zze, zzd com_google_android_gms_dynamic_zzd, zzi com_google_firebase_database_connection_idl_zzi) {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zze.zzx(com_google_android_gms_dynamic_zzd);
        this.zzbKx = new zzaek(new zzaef(new zzahd(connectionConfig.zzQD(), connectionConfig.zzQE()), zza(com_google_firebase_database_connection_idl_zze), scheduledExecutorService, connectionConfig.zzbIX, connectionConfig.zzbKr, connectionConfig.zzbIZ), HostInfoParcelable.a(connectionConfig.zzbKo), zza(com_google_firebase_database_connection_idl_zzi));
    }

    public void shutdown() {
        this.zzbKx.shutdown();
    }

    public void unlisten(List<String> list, zzd com_google_android_gms_dynamic_zzd) {
        this.zzbKx.zza((List) list, (Map) zze.zzx(com_google_android_gms_dynamic_zzd));
    }
}
