package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzaaq.zza;
import com.google.android.gms.tagmanager.zzba;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class zzty {
    private volatile int mState = 1;
    private final String zzbnR;
    private final String zzbsf;
    private final String zzbsg;
    private final zzuv zzbsh;
    private final zzaaq zzbsi;
    private final ExecutorService zzbsj;
    private final zzba zzbsk;
    private zzuu zzbsl;
    private List<zzud> zzbsm = new ArrayList();

    private class a implements Runnable {
        final /* synthetic */ zzty a;

        private a(zzty com_google_android_gms_internal_zzty) {
            this.a = com_google_android_gms_internal_zzty;
        }

        public void run() {
            this.a.mState = 3;
            String zze = this.a.zzbnR;
            zzun.zzaW(new StringBuilder(String.valueOf(zze).length() + 26).append("Container ").append(zze).append(" loading failed.").toString());
            if (this.a.zzbsm != null) {
                for (zzud com_google_android_gms_internal_zzud : this.a.zzbsm) {
                    if (com_google_android_gms_internal_zzud.zzKX()) {
                        try {
                            this.a.zzbsk.zza("app", com_google_android_gms_internal_zzud.zzKU(), com_google_android_gms_internal_zzud.zzKV(), com_google_android_gms_internal_zzud.currentTimeMillis());
                            zze = String.valueOf(com_google_android_gms_internal_zzud.zzKU());
                            zzun.v(new StringBuilder(String.valueOf(zze).length() + 50).append("Logged event ").append(zze).append(" to Firebase (marked as passthrough).").toString());
                        } catch (RemoteException e) {
                            String str = "Error logging event with measurement proxy:";
                            zze = String.valueOf(e.getMessage());
                            zzun.e(zze.length() != 0 ? str.concat(zze) : new String(str));
                        }
                    } else {
                        zze = String.valueOf(com_google_android_gms_internal_zzud.zzKU());
                        zzun.v(new StringBuilder(String.valueOf(zze).length() + 45).append("Discarded event ").append(zze).append(" (marked as non-passthrough).").toString());
                    }
                }
                this.a.zzbsm = null;
            }
        }
    }

    private class b implements zza, Runnable {
        final /* synthetic */ zzty a;

        private b(zzty com_google_android_gms_internal_zzty) {
            this.a = com_google_android_gms_internal_zzty;
        }

        public void run() {
            zzaa.zzai(this.a.mState == 1);
            List arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(0));
            if (!(zzus.zzLi().isPreview() && this.a.zzbnR.equals(zzus.zzLi().getContainerId()))) {
                arrayList.add(Integer.valueOf(1));
                arrayList.add(Integer.valueOf(2));
            }
            this.a.zzbsi.zza(this.a.zzbnR, this.a.zzbsg, this.a.zzbsf, arrayList, this);
        }

        public void zza(zzaau com_google_android_gms_internal_zzaau) {
            if (com_google_android_gms_internal_zzaau.getStatus() == Status.zzalw) {
                this.a.zzbsj.execute(new d(this.a, com_google_android_gms_internal_zzaau));
            } else {
                this.a.zzbsj.execute(new a());
            }
        }
    }

    private class c implements Runnable {
        final /* synthetic */ zzty a;
        private final zzud b;

        public c(zzty com_google_android_gms_internal_zzty, zzud com_google_android_gms_internal_zzud) {
            this.a = com_google_android_gms_internal_zzty;
            this.b = com_google_android_gms_internal_zzud;
        }

        public void run() {
            String str;
            String valueOf;
            if (this.a.mState == 2) {
                str = "Evaluating tags for event ";
                valueOf = String.valueOf(this.b.zzKU());
                zzun.v(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                this.a.zzbsl.zzb(this.b);
            } else if (this.a.mState == 1) {
                this.a.zzbsm.add(this.b);
                valueOf = String.valueOf(this.b.zzKU());
                zzun.v(new StringBuilder(String.valueOf(valueOf).length() + 30).append("Added event ").append(valueOf).append(" to pending queue.").toString());
            } else if (this.a.mState == 3) {
                valueOf = String.valueOf(this.b.zzKU());
                zzun.v(new StringBuilder(String.valueOf(valueOf).length() + 61).append("Failed to evaluate tags for event ").append(valueOf).append(" (container failed to load)").toString());
                if (this.b.zzKX()) {
                    try {
                        this.a.zzbsk.zza("app", this.b.zzKU(), this.b.zzKV(), this.b.currentTimeMillis());
                        valueOf = String.valueOf(this.b.zzKU());
                        zzun.v(new StringBuilder(String.valueOf(valueOf).length() + 38).append("Logged passthrough event ").append(valueOf).append(" to Firebase.").toString());
                        return;
                    } catch (RemoteException e) {
                        str = "Error logging event with measurement proxy:";
                        valueOf = String.valueOf(e.getMessage());
                        zzun.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                        return;
                    }
                }
                str = "Discarded non-passthrough event ";
                valueOf = String.valueOf(this.b.zzKU());
                zzun.v(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
    }

    private class d implements Runnable {
        final /* synthetic */ zzty a;
        private final zzaau b;

        d(zzty com_google_android_gms_internal_zzty, zzaau com_google_android_gms_internal_zzaau) {
            this.a = com_google_android_gms_internal_zzty;
            this.b = com_google_android_gms_internal_zzaau;
        }

        public void run() {
            this.a.zzbsl = this.a.zzbsh.zza(this.b.zzLO().zzLT(), this.b.zzLP());
            this.a.mState = 2;
            String zze = this.a.zzbnR;
            zzun.v(new StringBuilder(String.valueOf(zze).length() + 48).append("Container ").append(zze).append(" loaded during runtime initialization.").toString());
            if (this.a.zzbsm != null) {
                for (zzud com_google_android_gms_internal_zzud : this.a.zzbsm) {
                    String str = "Evaluating tags for pending event ";
                    String valueOf = String.valueOf(com_google_android_gms_internal_zzud.zzKU());
                    zzun.v(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    this.a.zzbsl.zzb(com_google_android_gms_internal_zzud);
                }
                this.a.zzbsm = null;
            }
            this.a.zzbsl.dispatch();
        }
    }

    zzty(String str, String str2, String str3, zzuv com_google_android_gms_internal_zzuv, zzaaq com_google_android_gms_internal_zzaaq, ExecutorService executorService, zzba com_google_android_gms_tagmanager_zzba) {
        zzaa.zzz(str);
        zzaa.zzz(com_google_android_gms_internal_zzuv);
        zzaa.zzz(com_google_android_gms_internal_zzaaq);
        zzaa.zzz(executorService);
        zzaa.zzz(com_google_android_gms_tagmanager_zzba);
        this.zzbnR = str;
        this.zzbsf = str3;
        this.zzbsg = str2;
        this.zzbsh = com_google_android_gms_internal_zzuv;
        this.zzbsi = com_google_android_gms_internal_zzaaq;
        this.zzbsj = executorService;
        this.zzbsk = com_google_android_gms_tagmanager_zzba;
        this.zzbsm.add(new zzud("gtm.load", new Bundle(), "gtm", new Date(), false, this.zzbsk));
        String str4 = this.zzbnR;
        zzun.v(new StringBuilder(String.valueOf(str4).length() + 35).append("Container ").append(str4).append("is scheduled for loading.").toString());
        this.zzbsj.execute(new b());
    }

    public void dispatch() {
        this.zzbsj.execute(new Runnable(this) {
            final /* synthetic */ zzty a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.mState == 2) {
                    this.a.zzbsl.dispatch();
                }
            }
        });
    }

    public void zza(zzud com_google_android_gms_internal_zzud) {
        this.zzbsj.execute(new c(this, com_google_android_gms_internal_zzud));
    }
}
