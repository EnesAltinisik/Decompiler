package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zzd;
import com.google.android.gms.internal.zznt.zza;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class zzpf {
    private static final zza<?, ?>[] zzaoJ = new zza[0];
    private final Map<zzc<?>, zze> zzann;
    final Set<zza<?, ?>> zzaoK;
    private final b zzaoL;

    interface b {
        void a(zza<?, ?> com_google_android_gms_internal_zznt_zza___);
    }

    private static class a implements DeathRecipient, b {
        private final WeakReference<zza<?, ?>> a;
        private final WeakReference<zzd> b;
        private final WeakReference<IBinder> c;

        private a(zza<?, ?> com_google_android_gms_internal_zznt_zza___, zzd com_google_android_gms_common_api_zzd, IBinder iBinder) {
            this.b = new WeakReference(com_google_android_gms_common_api_zzd);
            this.a = new WeakReference(com_google_android_gms_internal_zznt_zza___);
            this.c = new WeakReference(iBinder);
        }

        private void a() {
            zza com_google_android_gms_internal_zznt_zza = (zza) this.a.get();
            zzd com_google_android_gms_common_api_zzd = (zzd) this.b.get();
            if (!(com_google_android_gms_common_api_zzd == null || com_google_android_gms_internal_zznt_zza == null)) {
                com_google_android_gms_common_api_zzd.remove(com_google_android_gms_internal_zznt_zza.zzrv().intValue());
            }
            IBinder iBinder = (IBinder) this.c.get();
            if (this.c != null) {
                iBinder.unlinkToDeath(this, 0);
            }
        }

        public void a(zza<?, ?> com_google_android_gms_internal_zznt_zza___) {
            a();
        }

        public void binderDied() {
            a();
        }
    }

    public zzpf(zzc<?> com_google_android_gms_common_api_Api_zzc_, zze com_google_android_gms_common_api_Api_zze) {
        this.zzaoK = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.zzaoL = new b(this) {
            final /* synthetic */ zzpf a;

            {
                this.a = r1;
            }

            public void a(zza<?, ?> com_google_android_gms_internal_zznt_zza___) {
                this.a.zzaoK.remove(com_google_android_gms_internal_zznt_zza___);
                if (com_google_android_gms_internal_zznt_zza___.zzrv() != null && null != null) {
                    null.remove(com_google_android_gms_internal_zznt_zza___.zzrv().intValue());
                }
            }
        };
        this.zzann = new android.support.v4.h.a();
        this.zzann.put(com_google_android_gms_common_api_Api_zzc_, com_google_android_gms_common_api_Api_zze);
    }

    public zzpf(Map<zzc<?>, zze> map) {
        this.zzaoK = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.zzaoL = /* anonymous class already generated */;
        this.zzann = map;
    }

    private static void zza(zza<?, ?> com_google_android_gms_internal_zznt_zza___, zzd com_google_android_gms_common_api_zzd, IBinder iBinder) {
        if (com_google_android_gms_internal_zznt_zza___.isReady()) {
            com_google_android_gms_internal_zznt_zza___.zza(new a(com_google_android_gms_internal_zznt_zza___, com_google_android_gms_common_api_zzd, iBinder));
        } else if (iBinder == null || !iBinder.isBinderAlive()) {
            com_google_android_gms_internal_zznt_zza___.zza(null);
            com_google_android_gms_internal_zznt_zza___.cancel();
            com_google_android_gms_common_api_zzd.remove(com_google_android_gms_internal_zznt_zza___.zzrv().intValue());
        } else {
            b aVar = new a(com_google_android_gms_internal_zznt_zza___, com_google_android_gms_common_api_zzd, iBinder);
            com_google_android_gms_internal_zznt_zza___.zza(aVar);
            try {
                iBinder.linkToDeath(aVar, 0);
            } catch (RemoteException e) {
                com_google_android_gms_internal_zznt_zza___.cancel();
                com_google_android_gms_common_api_zzd.remove(com_google_android_gms_internal_zznt_zza___.zzrv().intValue());
            }
        }
    }

    public void dump(PrintWriter printWriter) {
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.zzaoK.size());
    }

    public void release() {
        for (zza com_google_android_gms_internal_zznt_zza : (zza[]) this.zzaoK.toArray(zzaoJ)) {
            com_google_android_gms_internal_zznt_zza.zza(null);
            if (com_google_android_gms_internal_zznt_zza.zzrv() != null) {
                com_google_android_gms_internal_zznt_zza.zzrD();
                zza(com_google_android_gms_internal_zznt_zza, null, ((zze) this.zzann.get(com_google_android_gms_internal_zznt_zza.zzre())).zzrh());
                this.zzaoK.remove(com_google_android_gms_internal_zznt_zza);
            } else if (com_google_android_gms_internal_zznt_zza.zzrH()) {
                this.zzaoK.remove(com_google_android_gms_internal_zznt_zza);
            }
        }
    }

    <A extends zzb> void zzg(zza<? extends Result, A> com_google_android_gms_internal_zznt_zza__extends_com_google_android_gms_common_api_Result__A) {
        this.zzaoK.add(com_google_android_gms_internal_zznt_zza__extends_com_google_android_gms_common_api_Result__A);
        com_google_android_gms_internal_zznt_zza__extends_com_google_android_gms_common_api_Result__A.zza(this.zzaoL);
    }

    public void zzsL() {
        for (zza zzy : (zza[]) this.zzaoK.toArray(zzaoJ)) {
            zzy.zzy(new Status(8, "The connection to Google Play services was lost"));
        }
    }

    public boolean zzsM() {
        for (zza isReady : (zza[]) this.zzaoK.toArray(zzaoJ)) {
            if (!isReady.isReady()) {
                return true;
            }
        }
        return false;
    }
}
