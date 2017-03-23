package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.util.zze;
import com.google.android.gms.internal.zzamc;
import com.google.android.gms.internal.zzso;
import com.google.android.gms.internal.zzsp;
import com.google.android.gms.internal.zzsp.zza;
import com.google.android.gms.internal.zzsp.zzb;
import com.google.android.gms.internal.zzsp.zzc;
import com.google.android.gms.internal.zzsp.zzd;
import com.google.android.gms.internal.zzsp.zzg;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.wallet.WalletConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.FirebaseAnalytics.Event;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class zzx {
    private static volatile zzx zzbex;
    private final Context mContext;
    private final boolean zzWh;
    private final zzp zzbeA;
    private final zzw zzbeB;
    private final zzaf zzbeC;
    private final zzv zzbeD;
    private final AppMeasurement zzbeE;
    private final zzal zzbeF;
    private final zze zzbeG;
    private final zzq zzbeH;
    private final zzad zzbeI;
    private final zzg zzbeJ;
    private final zzac zzbeK;
    private final zzn zzbeL;
    private final i zzbeM;
    private final zzai zzbeN;
    private final f zzbeO;
    public final FirebaseAnalytics zzbeP = new FirebaseAnalytics(this);
    private boolean zzbeQ;
    private Boolean zzbeR;
    private FileLock zzbeS;
    private FileChannel zzbeT;
    private List<Long> zzbeU;
    private int zzbeV;
    private int zzbeW;
    private final zzd zzbey;
    private final zzt zzbez;
    private final zze zzsd;

    private class a implements a {
        zzsp.zze a;
        List<Long> b;
        List<zzb> c;
        long d;
        final /* synthetic */ zzx e;

        private a(zzx com_google_android_gms_measurement_internal_zzx) {
            this.e = com_google_android_gms_measurement_internal_zzx;
        }

        private long a(zzb com_google_android_gms_internal_zzsp_zzb) {
            return ((com_google_android_gms_internal_zzsp_zzb.zzbgX.longValue() / 1000) / 60) / 60;
        }

        public void a(zzsp.zze com_google_android_gms_internal_zzsp_zze) {
            zzaa.zzz(com_google_android_gms_internal_zzsp_zze);
            this.a = com_google_android_gms_internal_zzsp_zze;
        }

        boolean a() {
            return this.c == null || this.c.isEmpty();
        }

        public boolean a(long j, zzb com_google_android_gms_internal_zzsp_zzb) {
            zzaa.zzz(com_google_android_gms_internal_zzsp_zzb);
            if (this.c == null) {
                this.c = new ArrayList();
            }
            if (this.b == null) {
                this.b = new ArrayList();
            }
            if (this.c.size() > 0 && a((zzb) this.c.get(0)) != a(com_google_android_gms_internal_zzsp_zzb)) {
                return false;
            }
            long serializedSize = this.d + ((long) com_google_android_gms_internal_zzsp_zzb.getSerializedSize());
            if (serializedSize >= ((long) this.e.zzFo().zzER())) {
                return false;
            }
            this.d = serializedSize;
            this.c.add(com_google_android_gms_internal_zzsp_zzb);
            this.b.add(Long.valueOf(j));
            return this.c.size() < this.e.zzFo().zzES();
        }
    }

    zzx(zzab com_google_android_gms_measurement_internal_zzab) {
        zzaa.zzz(com_google_android_gms_measurement_internal_zzab);
        this.mContext = com_google_android_gms_measurement_internal_zzab.mContext;
        this.zzsd = com_google_android_gms_measurement_internal_zzab.zzl(this);
        this.zzbey = com_google_android_gms_measurement_internal_zzab.zza(this);
        zzt zzb = com_google_android_gms_measurement_internal_zzab.zzb(this);
        zzb.initialize();
        this.zzbez = zzb;
        zzp zzc = com_google_android_gms_measurement_internal_zzab.zzc(this);
        zzc.initialize();
        this.zzbeA = zzc;
        zzFm().zzFJ().zzj("App measurement is starting up, version", Long.valueOf(zzFo().zzEi()));
        zzFm().zzFJ().log("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        zzFm().zzFK().log("Debug logging enabled");
        zzFm().zzFK().zzj("AppMeasurement singleton hash", Integer.valueOf(System.identityHashCode(this)));
        this.zzbeF = com_google_android_gms_measurement_internal_zzab.zzi(this);
        zzg zzn = com_google_android_gms_measurement_internal_zzab.zzn(this);
        zzn.initialize();
        this.zzbeJ = zzn;
        zzn zzo = com_google_android_gms_measurement_internal_zzab.zzo(this);
        zzo.initialize();
        this.zzbeL = zzo;
        zze zzj = com_google_android_gms_measurement_internal_zzab.zzj(this);
        zzj.initialize();
        this.zzbeG = zzj;
        f zzr = com_google_android_gms_measurement_internal_zzab.zzr(this);
        zzr.initialize();
        this.zzbeO = zzr;
        zzq zzk = com_google_android_gms_measurement_internal_zzab.zzk(this);
        zzk.initialize();
        this.zzbeH = zzk;
        zzad zzm = com_google_android_gms_measurement_internal_zzab.zzm(this);
        zzm.initialize();
        this.zzbeI = zzm;
        zzac zzh = com_google_android_gms_measurement_internal_zzab.zzh(this);
        zzh.initialize();
        this.zzbeK = zzh;
        zzai zzq = com_google_android_gms_measurement_internal_zzab.zzq(this);
        zzq.initialize();
        this.zzbeN = zzq;
        this.zzbeM = com_google_android_gms_measurement_internal_zzab.zzp(this);
        this.zzbeE = com_google_android_gms_measurement_internal_zzab.zzg(this);
        zzaf zze = com_google_android_gms_measurement_internal_zzab.zze(this);
        zze.initialize();
        this.zzbeC = zze;
        zzv zzf = com_google_android_gms_measurement_internal_zzab.zzf(this);
        zzf.initialize();
        this.zzbeD = zzf;
        zzw zzd = com_google_android_gms_measurement_internal_zzab.zzd(this);
        zzd.initialize();
        this.zzbeB = zzd;
        if (this.zzbeV != this.zzbeW) {
            zzFm().zzFE().zze("Not all components initialized", Integer.valueOf(this.zzbeV), Integer.valueOf(this.zzbeW));
        }
        this.zzWh = true;
        if (!(this.zzbey.zzmW() || zzGh())) {
            if (!(this.mContext.getApplicationContext() instanceof Application)) {
                zzFm().zzFG().log("Application context is not an Application");
            } else if (VERSION.SDK_INT >= 14) {
                zzFd().zzGw();
            } else {
                zzFm().zzFK().log("Not tracking deep linking pre-ICS");
            }
        }
        this.zzbeB.zzg(new Runnable(this) {
            final /* synthetic */ zzx a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.start();
            }
        });
    }

    private void zzD(List<Long> list) {
        zzaa.zzaj(!list.isEmpty());
        if (this.zzbeU != null) {
            zzFm().zzFE().log("Set uploading progress before finishing the previous upload");
        } else {
            this.zzbeU = new ArrayList(list);
        }
    }

    private boolean zzGk() {
        zzkN();
        return this.zzbeU != null;
    }

    private boolean zzGm() {
        zzkN();
        zzma();
        return zzFh().k() || !TextUtils.isEmpty(zzFh().f());
    }

    private void zzGn() {
        zzkN();
        zzma();
        if (!zzGr()) {
            return;
        }
        if (zzFX() && zzGm()) {
            long zzGo = zzGo();
            if (zzGo == 0) {
                zzGc().b();
                zzGd().cancel();
                return;
            } else if (zzGb().zzod()) {
                long j = zzFn().e.get();
                long zzEV = zzFo().zzEV();
                if (!zzFi().zzc(j, zzEV)) {
                    zzGo = Math.max(zzGo, j + zzEV);
                }
                zzGc().b();
                zzGo -= zzlQ().currentTimeMillis();
                if (zzGo <= 0) {
                    zzGd().zzv(1);
                    return;
                }
                zzFm().zzFL().zzj("Upload scheduled in approximately ms", Long.valueOf(zzGo));
                zzGd().zzv(zzGo);
                return;
            } else {
                zzGc().a();
                zzGd().cancel();
                return;
            }
        }
        zzGc().b();
        zzGd().cancel();
    }

    private long zzGo() {
        long currentTimeMillis = zzlQ().currentTimeMillis();
        long zzEY = zzFo().zzEY();
        long zzEW = zzFo().zzEW();
        long j = zzFn().c.get();
        long j2 = zzFn().d.get();
        long max = Math.max(zzFh().i(), zzFh().j());
        if (max == 0) {
            return 0;
        }
        max = currentTimeMillis - Math.abs(max - currentTimeMillis);
        j2 = currentTimeMillis - Math.abs(j2 - currentTimeMillis);
        currentTimeMillis = Math.max(currentTimeMillis - Math.abs(j - currentTimeMillis), j2);
        zzEY += max;
        if (!zzFi().zzc(currentTimeMillis, zzEW)) {
            zzEY = currentTimeMillis + zzEW;
        }
        if (j2 == 0 || j2 < max) {
            return zzEY;
        }
        for (int i = 0; i < zzFo().zzFa(); i++) {
            zzEY += ((long) (1 << i)) * zzFo().zzEZ();
            if (zzEY > j2) {
                return zzEY;
            }
        }
        return 0;
    }

    private void zza(int i, Throwable th, byte[] bArr) {
        int i2 = 0;
        zzkN();
        zzma();
        if (bArr == null) {
            bArr = new byte[0];
        }
        List<Long> list = this.zzbeU;
        this.zzbeU = null;
        if ((i == 200 || i == 204) && th == null) {
            zzFn().c.set(zzlQ().currentTimeMillis());
            zzFn().d.set(0);
            zzGn();
            zzFm().zzFL().zze("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
            zzFh().a();
            try {
                for (Long longValue : list) {
                    zzFh().a(longValue.longValue());
                }
                zzFh().b();
                if (zzGb().zzod() && zzGm()) {
                    zzGl();
                } else {
                    zzGn();
                }
            } finally {
                zzFh().c();
            }
        } else {
            zzFm().zzFL().zze("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            zzFn().d.set(zzlQ().currentTimeMillis());
            if (i == 503 || i == 429) {
                i2 = 1;
            }
            if (i2 != 0) {
                zzFn().e.set(zzlQ().currentTimeMillis());
            }
            zzGn();
        }
    }

    private void zza(b bVar) {
        if (bVar == null) {
            throw new IllegalStateException("Component not created");
        } else if (!bVar.isInitialized()) {
            throw new IllegalStateException("Component not initialized");
        }
    }

    private void zza(k kVar) {
        if (kVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private zza[] zza(String str, zzg[] com_google_android_gms_internal_zzsp_zzgArr, zzb[] com_google_android_gms_internal_zzsp_zzbArr) {
        zzaa.zzdl(str);
        return zzFc().a(str, com_google_android_gms_internal_zzsp_zzbArr, com_google_android_gms_internal_zzsp_zzgArr);
    }

    public static zzx zzbd(Context context) {
        zzaa.zzz(context);
        zzaa.zzz(context.getApplicationContext());
        if (zzbex == null) {
            synchronized (zzx.class) {
                if (zzbex == null) {
                    zzbex = new zzab(context).zzGv();
                }
            }
        }
        return zzbex;
    }

    private void zze(AppMetadata appMetadata) {
        Object obj = 1;
        zzkN();
        zzma();
        zzaa.zzz(appMetadata);
        zzaa.zzdl(appMetadata.packageName);
        a b = zzFh().b(appMetadata.packageName);
        String b2 = zzFn().b(appMetadata.packageName);
        Object obj2 = null;
        if (b == null) {
            a aVar = new a(this, appMetadata.packageName);
            aVar.a(zzFn().a());
            aVar.c(b2);
            b = aVar;
            obj2 = 1;
        } else if (!b2.equals(b.e())) {
            b.c(b2);
            b.a(zzFn().a());
            int i = 1;
        }
        if (!(TextUtils.isEmpty(appMetadata.zzbbK) || appMetadata.zzbbK.equals(b.d()))) {
            b.b(appMetadata.zzbbK);
            obj2 = 1;
        }
        if (!(TextUtils.isEmpty(appMetadata.zzbbS) || appMetadata.zzbbS.equals(b.f()))) {
            b.d(appMetadata.zzbbS);
            obj2 = 1;
        }
        if (!(appMetadata.zzbbM == 0 || appMetadata.zzbbM == b.l())) {
            b.d(appMetadata.zzbbM);
            obj2 = 1;
        }
        if (!(TextUtils.isEmpty(appMetadata.zzaUf) || appMetadata.zzaUf.equals(b.i()))) {
            b.e(appMetadata.zzaUf);
            obj2 = 1;
        }
        if (appMetadata.zzbbR != b.j()) {
            b.c(appMetadata.zzbbR);
            obj2 = 1;
        }
        if (!(TextUtils.isEmpty(appMetadata.zzbbL) || appMetadata.zzbbL.equals(b.k()))) {
            b.f(appMetadata.zzbbL);
            obj2 = 1;
        }
        if (appMetadata.zzbbN != b.m()) {
            b.e(appMetadata.zzbbN);
            obj2 = 1;
        }
        if (appMetadata.zzbbP != b.n()) {
            b.a(appMetadata.zzbbP);
        } else {
            obj = obj2;
        }
        if (obj != null) {
            zzFh().a(b);
        }
    }

    private boolean zzg(String str, long j) {
        zzFh().a();
        try {
            zzx com_google_android_gms_measurement_internal_zzx = this;
            a aVar = new a();
            zzFh().a(str, j, aVar);
            if (aVar.a()) {
                zzFh().b();
                zzFh().c();
                return false;
            }
            int i;
            zzsp.zze com_google_android_gms_internal_zzsp_zze = aVar.a;
            com_google_android_gms_internal_zzsp_zze.zzbhe = new zzb[aVar.c.size()];
            int i2 = 0;
            int i3 = 0;
            while (i3 < aVar.c.size()) {
                if (zzFj().zzV(aVar.a.appId, ((zzb) aVar.c.get(i3)).name)) {
                    zzFm().zzFG().zzj("Dropping blacklisted raw event", ((zzb) aVar.c.get(i3)).name);
                    zzFi().zze(11, "_ev", ((zzb) aVar.c.get(i3)).name);
                    i = i2;
                } else {
                    int i4;
                    if (zzFj().zzW(aVar.a.appId, ((zzb) aVar.c.get(i3)).name)) {
                        int i5;
                        Object obj;
                        zzc com_google_android_gms_internal_zzsp_zzc;
                        if (((zzb) aVar.c.get(i3)).zzbgW == null) {
                            ((zzb) aVar.c.get(i3)).zzbgW = new zzc[0];
                        }
                        for (zzc com_google_android_gms_internal_zzsp_zzc2 : ((zzb) aVar.c.get(i3)).zzbgW) {
                            if ("_c".equals(com_google_android_gms_internal_zzsp_zzc2.name)) {
                                com_google_android_gms_internal_zzsp_zzc2.zzbha = Long.valueOf(1);
                                obj = 1;
                                break;
                            }
                        }
                        obj = null;
                        if (obj == null) {
                            zzFm().zzFL().zzj("Marking event as conversion", ((zzb) aVar.c.get(i3)).name);
                            zzc[] com_google_android_gms_internal_zzsp_zzcArr = (zzc[]) Arrays.copyOf(((zzb) aVar.c.get(i3)).zzbgW, ((zzb) aVar.c.get(i3)).zzbgW.length + 1);
                            com_google_android_gms_internal_zzsp_zzc = new zzc();
                            com_google_android_gms_internal_zzsp_zzc.name = "_c";
                            com_google_android_gms_internal_zzsp_zzc.zzbha = Long.valueOf(1);
                            com_google_android_gms_internal_zzsp_zzcArr[com_google_android_gms_internal_zzsp_zzcArr.length - 1] = com_google_android_gms_internal_zzsp_zzc;
                            ((zzb) aVar.c.get(i3)).zzbgW = com_google_android_gms_internal_zzsp_zzcArr;
                        }
                        boolean zzfG = zzal.zzfG(((zzb) aVar.c.get(i3)).name);
                        if (zzfG && zzFh().a(zzGi(), aVar.a.appId, false, zzfG, false).zzbbZ - ((long) zzFo().zzfc(aVar.a.appId)) > 0) {
                            zzFm().zzFG().log("Too many conversions. Not logging as conversion.");
                            zzb com_google_android_gms_internal_zzsp_zzb = (zzb) aVar.c.get(i3);
                            Object obj2 = null;
                            zzc com_google_android_gms_internal_zzsp_zzc3 = null;
                            zzc[] com_google_android_gms_internal_zzsp_zzcArr2 = ((zzb) aVar.c.get(i3)).zzbgW;
                            int length = com_google_android_gms_internal_zzsp_zzcArr2.length;
                            int i6 = 0;
                            while (i6 < length) {
                                Object obj3;
                                com_google_android_gms_internal_zzsp_zzc = com_google_android_gms_internal_zzsp_zzcArr2[i6];
                                if ("_c".equals(com_google_android_gms_internal_zzsp_zzc.name)) {
                                    obj3 = obj2;
                                } else if ("_err".equals(com_google_android_gms_internal_zzsp_zzc.name)) {
                                    zzc com_google_android_gms_internal_zzsp_zzc4 = com_google_android_gms_internal_zzsp_zzc3;
                                    int i7 = 1;
                                    com_google_android_gms_internal_zzsp_zzc = com_google_android_gms_internal_zzsp_zzc4;
                                } else {
                                    com_google_android_gms_internal_zzsp_zzc = com_google_android_gms_internal_zzsp_zzc3;
                                    obj3 = obj2;
                                }
                                i6++;
                                obj2 = obj3;
                                com_google_android_gms_internal_zzsp_zzc3 = com_google_android_gms_internal_zzsp_zzc;
                            }
                            if (obj2 != null && com_google_android_gms_internal_zzsp_zzc3 != null) {
                                zzc[] com_google_android_gms_internal_zzsp_zzcArr3 = new zzc[(com_google_android_gms_internal_zzsp_zzb.zzbgW.length - 1)];
                                i4 = 0;
                                com_google_android_gms_internal_zzsp_zzcArr2 = com_google_android_gms_internal_zzsp_zzb.zzbgW;
                                length = com_google_android_gms_internal_zzsp_zzcArr2.length;
                                i5 = 0;
                                while (i5 < length) {
                                    zzc com_google_android_gms_internal_zzsp_zzc5 = com_google_android_gms_internal_zzsp_zzcArr2[i5];
                                    if (com_google_android_gms_internal_zzsp_zzc5 != com_google_android_gms_internal_zzsp_zzc3) {
                                        i = i4 + 1;
                                        com_google_android_gms_internal_zzsp_zzcArr3[i4] = com_google_android_gms_internal_zzsp_zzc5;
                                    } else {
                                        i = i4;
                                    }
                                    i5++;
                                    i4 = i;
                                }
                                ((zzb) aVar.c.get(i3)).zzbgW = com_google_android_gms_internal_zzsp_zzcArr3;
                            } else if (com_google_android_gms_internal_zzsp_zzc3 != null) {
                                com_google_android_gms_internal_zzsp_zzc3.name = "_err";
                                com_google_android_gms_internal_zzsp_zzc3.zzbha = Long.valueOf(10);
                            } else {
                                zzFm().zzFE().log("Did not find conversion parameter. Error not tracked");
                            }
                        }
                    }
                    i4 = i2 + 1;
                    com_google_android_gms_internal_zzsp_zze.zzbhe[i2] = (zzb) aVar.c.get(i3);
                    i = i4;
                }
                i3++;
                i2 = i;
            }
            if (i2 < aVar.c.size()) {
                com_google_android_gms_internal_zzsp_zze.zzbhe = (zzb[]) Arrays.copyOf(com_google_android_gms_internal_zzsp_zze.zzbhe, i2);
            }
            com_google_android_gms_internal_zzsp_zze.zzbhx = zza(aVar.a.appId, aVar.a.zzbhf, com_google_android_gms_internal_zzsp_zze.zzbhe);
            com_google_android_gms_internal_zzsp_zze.zzbhh = com_google_android_gms_internal_zzsp_zze.zzbhe[0].zzbgX;
            com_google_android_gms_internal_zzsp_zze.zzbhi = com_google_android_gms_internal_zzsp_zze.zzbhe[0].zzbgX;
            for (i = 1; i < com_google_android_gms_internal_zzsp_zze.zzbhe.length; i++) {
                zzb com_google_android_gms_internal_zzsp_zzb2 = com_google_android_gms_internal_zzsp_zze.zzbhe[i];
                if (com_google_android_gms_internal_zzsp_zzb2.zzbgX.longValue() < com_google_android_gms_internal_zzsp_zze.zzbhh.longValue()) {
                    com_google_android_gms_internal_zzsp_zze.zzbhh = com_google_android_gms_internal_zzsp_zzb2.zzbgX;
                }
                if (com_google_android_gms_internal_zzsp_zzb2.zzbgX.longValue() > com_google_android_gms_internal_zzsp_zze.zzbhi.longValue()) {
                    com_google_android_gms_internal_zzsp_zze.zzbhi = com_google_android_gms_internal_zzsp_zzb2.zzbgX;
                }
            }
            String str2 = aVar.a.appId;
            a b = zzFh().b(str2);
            if (b == null) {
                zzFm().zzFE().log("Bundling raw events w/o app info");
            } else {
                long h = b.h();
                com_google_android_gms_internal_zzsp_zze.zzbhk = h != 0 ? Long.valueOf(h) : null;
                long g = b.g();
                if (g != 0) {
                    h = g;
                }
                com_google_android_gms_internal_zzsp_zze.zzbhj = h != 0 ? Long.valueOf(h) : null;
                b.r();
                com_google_android_gms_internal_zzsp_zze.zzbhv = Integer.valueOf((int) b.o());
                b.a(com_google_android_gms_internal_zzsp_zze.zzbhh.longValue());
                b.b(com_google_android_gms_internal_zzsp_zze.zzbhi.longValue());
                zzFh().a(b);
            }
            com_google_android_gms_internal_zzsp_zze.zzbbO = zzFm().zzFM();
            zzFh().a(com_google_android_gms_internal_zzsp_zze);
            zzFh().a(aVar.b);
            zzFh().h(str2);
            zzFh().b();
            return true;
        } finally {
            zzFh().c();
        }
    }

    public Context getContext() {
        return this.mContext;
    }

    public boolean isEnabled() {
        boolean z = false;
        zzkN();
        zzma();
        if (zzFo().zzEM()) {
            return false;
        }
        Boolean zzEN = zzFo().zzEN();
        if (zzEN != null) {
            z = zzEN.booleanValue();
        } else if (!zzFo().zzsB()) {
            z = true;
        }
        return zzFn().c(z);
    }

    protected void start() {
        zzkN();
        if (!zzGh() || (this.zzbeB.isInitialized() && !this.zzbeB.zzGu())) {
            zzFh().g();
            if (zzFX()) {
                if (!(zzFo().zzmW() || TextUtils.isEmpty(zzFe().zzEb()))) {
                    String d = zzFn().d();
                    if (d == null) {
                        zzFn().c(zzFe().zzEb());
                    } else if (!d.equals(zzFe().zzEb())) {
                        zzFm().zzFJ().log("Rechecking which service to use due to a GMP App Id change");
                        zzFn().f();
                        this.zzbeI.disconnect();
                        this.zzbeI.zzmC();
                        zzFn().c(zzFe().zzEb());
                    }
                }
                if (!(zzFo().zzmW() || zzGh() || TextUtils.isEmpty(zzFe().zzEb()))) {
                    zzFd().zzGx();
                }
            } else if (isEnabled()) {
                if (!zzFi().zzbN("android.permission.INTERNET")) {
                    zzFm().zzFE().log("App is missing INTERNET permission");
                }
                if (!zzFi().zzbN("android.permission.ACCESS_NETWORK_STATE")) {
                    zzFm().zzFE().log("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!zzu.zzU(getContext())) {
                    zzFm().zzFE().log("AppMeasurementReceiver not registered/enabled");
                }
                if (!zzae.zzV(getContext())) {
                    zzFm().zzFE().log("AppMeasurementService not registered/enabled");
                }
                zzFm().zzFE().log("Uploading is not possible. App measurement disabled");
            }
            zzGn();
            return;
        }
        zzFm().zzFE().log("Scheduler shutting down before Scion.start() called");
    }

    protected boolean zzFX() {
        zzma();
        zzkN();
        if (this.zzbeR == null) {
            boolean z = zzFi().zzbN("android.permission.INTERNET") && zzFi().zzbN("android.permission.ACCESS_NETWORK_STATE") && zzu.zzU(getContext()) && zzae.zzV(getContext());
            this.zzbeR = Boolean.valueOf(z);
            if (this.zzbeR.booleanValue() && !zzFo().zzmW()) {
                this.zzbeR = Boolean.valueOf(zzFi().zzfN(zzFe().zzEb()));
            }
        }
        return this.zzbeR.booleanValue();
    }

    public zzp zzFY() {
        return (this.zzbeA == null || !this.zzbeA.isInitialized()) ? null : this.zzbeA;
    }

    zzw zzFZ() {
        return this.zzbeB;
    }

    public f zzFc() {
        zza(this.zzbeO);
        return this.zzbeO;
    }

    public zzac zzFd() {
        zza(this.zzbeK);
        return this.zzbeK;
    }

    public zzn zzFe() {
        zza(this.zzbeL);
        return this.zzbeL;
    }

    public zzg zzFf() {
        zza(this.zzbeJ);
        return this.zzbeJ;
    }

    public zzad zzFg() {
        zza(this.zzbeI);
        return this.zzbeI;
    }

    public zze zzFh() {
        zza(this.zzbeG);
        return this.zzbeG;
    }

    public zzal zzFi() {
        zza(this.zzbeF);
        return this.zzbeF;
    }

    public zzv zzFj() {
        zza(this.zzbeD);
        return this.zzbeD;
    }

    public zzaf zzFk() {
        zza(this.zzbeC);
        return this.zzbeC;
    }

    public zzw zzFl() {
        zza(this.zzbeB);
        return this.zzbeB;
    }

    public zzp zzFm() {
        zza(this.zzbeA);
        return this.zzbeA;
    }

    public zzt zzFn() {
        zza(this.zzbez);
        return this.zzbez;
    }

    public zzd zzFo() {
        return this.zzbey;
    }

    public AppMeasurement zzGa() {
        return this.zzbeE;
    }

    public zzq zzGb() {
        zza(this.zzbeH);
        return this.zzbeH;
    }

    public i zzGc() {
        if (this.zzbeM != null) {
            return this.zzbeM;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public zzai zzGd() {
        zza(this.zzbeN);
        return this.zzbeN;
    }

    FileChannel zzGe() {
        return this.zzbeT;
    }

    void zzGf() {
        zzkN();
        zzma();
        if (zzGr() && zzGg()) {
            zzv(zza(zzGe()), zzFe().zzFC());
        }
    }

    boolean zzGg() {
        zzkN();
        try {
            this.zzbeT = new RandomAccessFile(new File(getContext().getFilesDir(), this.zzbeG.e()), "rw").getChannel();
            this.zzbeS = this.zzbeT.tryLock();
            if (this.zzbeS != null) {
                zzFm().zzFL().log("Storage concurrent access okay");
                return true;
            }
            zzFm().zzFE().log("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            zzFm().zzFE().zzj("Failed to acquire storage lock", e);
        } catch (IOException e2) {
            zzFm().zzFE().zzj("Failed to access storage lock file", e2);
        }
    }

    protected boolean zzGh() {
        return false;
    }

    long zzGi() {
        return ((((zzlQ().currentTimeMillis() + zzFn().c()) / 1000) / 60) / 60) / 24;
    }

    void zzGj() {
        if (!zzFo().zzmW()) {
            throw new IllegalStateException("Unexpected call on client side");
        }
    }

    public void zzGl() {
        Map map = null;
        int i = 0;
        zzkN();
        zzma();
        if (!zzFo().zzmW()) {
            Boolean e = zzFn().e();
            if (e == null) {
                zzFm().zzFG().log("Upload data called on the client side before use of service was decided");
                return;
            } else if (e.booleanValue()) {
                zzFm().zzFE().log("Upload called in the client side when service should be used");
                return;
            }
        }
        if (zzGk()) {
            zzFm().zzFG().log("Uploading requested multiple times");
        } else if (zzGb().zzod()) {
            long currentTimeMillis = zzlQ().currentTimeMillis();
            zzai(currentTimeMillis - zzFo().zzEU());
            long j = zzFn().c.get();
            if (j != 0) {
                zzFm().zzFK().zzj("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(currentTimeMillis - j)));
            }
            String f = zzFh().f();
            if (TextUtils.isEmpty(f)) {
                String b = zzFh().b(currentTimeMillis - zzFo().zzEU());
                if (!TextUtils.isEmpty(b)) {
                    a b2 = zzFh().b(b);
                    if (b2 != null) {
                        String zzN = zzFo().zzN(b2.d(), b2.c());
                        try {
                            URL url = new URL(zzN);
                            zzFm().zzFL().zzj("Fetching remote configuration", b2.b());
                            zzso.zzb zzfy = zzFj().zzfy(b2.b());
                            CharSequence zzfz = zzFj().zzfz(b2.b());
                            if (!(zzfy == null || TextUtils.isEmpty(zzfz))) {
                                map = new android.support.v4.h.a();
                                map.put("If-Modified-Since", zzfz);
                            }
                            zzGb().zza(b, url, map, new a(this) {
                                final /* synthetic */ zzx a;

                                {
                                    this.a = r1;
                                }

                                public void a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
                                    this.a.zzb(str, i, th, bArr, map);
                                }
                            });
                            return;
                        } catch (MalformedURLException e2) {
                            zzFm().zzFE().zzj("Failed to parse config URL. Not fetching", zzN);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            List<Pair> a = zzFh().a(f, zzFo().zzfg(f), zzFo().zzfh(f));
            if (!a.isEmpty()) {
                zzsp.zze com_google_android_gms_internal_zzsp_zze;
                Object obj;
                List subList;
                for (Pair pair : a) {
                    com_google_android_gms_internal_zzsp_zze = (zzsp.zze) pair.first;
                    if (!TextUtils.isEmpty(com_google_android_gms_internal_zzsp_zze.zzbhr)) {
                        obj = com_google_android_gms_internal_zzsp_zze.zzbhr;
                        break;
                    }
                }
                obj = null;
                if (obj != null) {
                    for (int i2 = 0; i2 < a.size(); i2++) {
                        com_google_android_gms_internal_zzsp_zze = (zzsp.zze) ((Pair) a.get(i2)).first;
                        if (!TextUtils.isEmpty(com_google_android_gms_internal_zzsp_zze.zzbhr) && !com_google_android_gms_internal_zzsp_zze.zzbhr.equals(obj)) {
                            subList = a.subList(0, i2);
                            break;
                        }
                    }
                }
                subList = a;
                zzd com_google_android_gms_internal_zzsp_zzd = new zzd();
                com_google_android_gms_internal_zzsp_zzd.zzbhb = new zzsp.zze[subList.size()];
                List arrayList = new ArrayList(subList.size());
                while (i < com_google_android_gms_internal_zzsp_zzd.zzbhb.length) {
                    com_google_android_gms_internal_zzsp_zzd.zzbhb[i] = (zzsp.zze) ((Pair) subList.get(i)).first;
                    arrayList.add((Long) ((Pair) subList.get(i)).second);
                    com_google_android_gms_internal_zzsp_zzd.zzbhb[i].zzbhq = Long.valueOf(zzFo().zzEi());
                    com_google_android_gms_internal_zzsp_zzd.zzbhb[i].zzbhg = Long.valueOf(currentTimeMillis);
                    com_google_android_gms_internal_zzsp_zzd.zzbhb[i].zzbhw = Boolean.valueOf(zzFo().zzmW());
                    i++;
                }
                Object zzb = zzFm().zzX(2) ? zzal.zzb(com_google_android_gms_internal_zzsp_zzd) : null;
                byte[] zza = zzFi().zza(com_google_android_gms_internal_zzsp_zzd);
                String zzET = zzFo().zzET();
                try {
                    URL url2 = new URL(zzET);
                    zzD(arrayList);
                    zzFn().d.set(currentTimeMillis);
                    Object obj2 = "?";
                    if (com_google_android_gms_internal_zzsp_zzd.zzbhb.length > 0) {
                        obj2 = com_google_android_gms_internal_zzsp_zzd.zzbhb[0].appId;
                    }
                    zzFm().zzFL().zzd("Uploading data. app, uncompressed size, data", obj2, Integer.valueOf(zza.length), zzb);
                    zzGb().zza(f, url2, zza, null, new a(this) {
                        final /* synthetic */ zzx a;

                        {
                            this.a = r1;
                        }

                        public void a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
                            this.a.zza(i, th, bArr);
                        }
                    });
                } catch (MalformedURLException e3) {
                    zzFm().zzFE().zzj("Failed to parse upload URL. Not uploading", zzET);
                }
            }
        } else {
            zzFm().zzFG().log("Network not connected, ignoring upload request");
            zzGn();
        }
    }

    void zzGp() {
        this.zzbeW++;
    }

    void zzGq() {
        zzkN();
        zzma();
        if (!this.zzbeQ) {
            zzFm().zzFJ().log("This instance being marked as an uploader");
            zzGf();
        }
        this.zzbeQ = true;
    }

    boolean zzGr() {
        zzkN();
        zzma();
        return this.zzbeQ || zzGh();
    }

    public void zzR(boolean z) {
        zzGn();
    }

    int zza(FileChannel fileChannel) {
        int i = 0;
        zzkN();
        if (fileChannel == null || !fileChannel.isOpen()) {
            zzFm().zzFE().log("Bad chanel to read from");
        } else {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0);
                int read = fileChannel.read(allocate);
                if (read != 4) {
                    zzFm().zzFG().zzj("Unexpected data length or empty data in channel. Bytes read", Integer.valueOf(read));
                } else {
                    allocate.flip();
                    i = allocate.getInt();
                }
            } catch (IOException e) {
                zzFm().zzFE().zzj("Failed to read from channel", e);
            }
        }
        return i;
    }

    void zza(AppMetadata appMetadata, long j) {
        a b = zzFh().b(appMetadata.packageName);
        if (!(b == null || b.d() == null || b.d().equals(appMetadata.zzbbK))) {
            zzFm().zzFG().log("New GMP App Id passed in. Removing cached database data.");
            zzFh().g(b.b());
            b = null;
        }
        if (b != null && b.i() != null && !b.i().equals(appMetadata.zzaUf)) {
            Bundle bundle = new Bundle();
            bundle.putString("_pv", b.i());
            zzb(new EventParcel("_au", new EventParams(bundle), "auto", j), appMetadata);
        }
    }

    void zza(zzh com_google_android_gms_measurement_internal_zzh, AppMetadata appMetadata) {
        zzkN();
        zzma();
        zzaa.zzz(com_google_android_gms_measurement_internal_zzh);
        zzaa.zzz(appMetadata);
        zzaa.zzdl(com_google_android_gms_measurement_internal_zzh.zzPx);
        zzaa.zzaj(com_google_android_gms_measurement_internal_zzh.zzPx.equals(appMetadata.packageName));
        zzsp.zze com_google_android_gms_internal_zzsp_zze = new zzsp.zze();
        com_google_android_gms_internal_zzsp_zze.zzbhd = Integer.valueOf(1);
        com_google_android_gms_internal_zzsp_zze.zzbhl = a.a.a.a.a.b.a.ANDROID_CLIENT_TYPE;
        com_google_android_gms_internal_zzsp_zze.appId = appMetadata.packageName;
        com_google_android_gms_internal_zzsp_zze.zzbbL = appMetadata.zzbbL;
        com_google_android_gms_internal_zzsp_zze.zzaUf = appMetadata.zzaUf;
        com_google_android_gms_internal_zzsp_zze.zzbhy = Integer.valueOf((int) appMetadata.zzbbR);
        com_google_android_gms_internal_zzsp_zze.zzbhp = Long.valueOf(appMetadata.zzbbM);
        com_google_android_gms_internal_zzsp_zze.zzbbK = appMetadata.zzbbK;
        com_google_android_gms_internal_zzsp_zze.zzbhu = appMetadata.zzbbN == 0 ? null : Long.valueOf(appMetadata.zzbbN);
        Pair a = zzFn().a(appMetadata.packageName);
        if (a != null && !TextUtils.isEmpty((CharSequence) a.first)) {
            com_google_android_gms_internal_zzsp_zze.zzbhr = (String) a.first;
            com_google_android_gms_internal_zzsp_zze.zzbhs = (Boolean) a.second;
        } else if (!zzFf().zzbc(this.mContext)) {
            String string = Secure.getString(this.mContext.getContentResolver(), "android_id");
            if (string == null) {
                zzFm().zzFG().log("null secure ID");
                string = "null";
            } else if (string.isEmpty()) {
                zzFm().zzFG().log("empty secure ID");
            }
            com_google_android_gms_internal_zzsp_zze.zzbhB = string;
        }
        com_google_android_gms_internal_zzsp_zze.zzbhm = zzFf().zzjb();
        com_google_android_gms_internal_zzsp_zze.osVersion = zzFf().zzFx();
        com_google_android_gms_internal_zzsp_zze.zzbho = Integer.valueOf((int) zzFf().zzFy());
        com_google_android_gms_internal_zzsp_zze.zzbhn = zzFf().zzFz();
        com_google_android_gms_internal_zzsp_zze.zzbhq = null;
        com_google_android_gms_internal_zzsp_zze.zzbhg = null;
        com_google_android_gms_internal_zzsp_zze.zzbhh = null;
        com_google_android_gms_internal_zzsp_zze.zzbhi = null;
        a b = zzFh().b(appMetadata.packageName);
        if (b == null) {
            b = new a(this, appMetadata.packageName);
            b.a(zzFn().a());
            b.d(appMetadata.zzbbS);
            b.b(appMetadata.zzbbK);
            b.c(zzFn().b(appMetadata.packageName));
            b.f(0);
            b.a(0);
            b.b(0);
            b.e(appMetadata.zzaUf);
            b.c(appMetadata.zzbbR);
            b.f(appMetadata.zzbbL);
            b.d(appMetadata.zzbbM);
            b.e(appMetadata.zzbbN);
            b.a(appMetadata.zzbbP);
            zzFh().a(b);
        }
        com_google_android_gms_internal_zzsp_zze.zzbht = b.c();
        com_google_android_gms_internal_zzsp_zze.zzbbS = b.f();
        List a2 = zzFh().a(appMetadata.packageName);
        com_google_android_gms_internal_zzsp_zze.zzbhf = new zzg[a2.size()];
        for (int i = 0; i < a2.size(); i++) {
            zzg com_google_android_gms_internal_zzsp_zzg = new zzg();
            com_google_android_gms_internal_zzsp_zze.zzbhf[i] = com_google_android_gms_internal_zzsp_zzg;
            com_google_android_gms_internal_zzsp_zzg.name = ((e) a2.get(i)).b;
            com_google_android_gms_internal_zzsp_zzg.zzbhF = Long.valueOf(((e) a2.get(i)).c);
            zzFi().zza(com_google_android_gms_internal_zzsp_zzg, ((e) a2.get(i)).d);
        }
        try {
            zzFh().a(com_google_android_gms_measurement_internal_zzh, zzFh().b(com_google_android_gms_internal_zzsp_zze));
        } catch (IOException e) {
            zzFm().zzFE().zzj("Data loss. Failed to insert raw event metadata", e);
        }
    }

    boolean zza(int i, FileChannel fileChannel) {
        zzkN();
        if (fileChannel == null || !fileChannel.isOpen()) {
            zzFm().zzFE().log("Bad chanel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() == 4) {
                return true;
            }
            zzFm().zzFE().zzj("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            return true;
        } catch (IOException e) {
            zzFm().zzFE().zzj("Failed to write to channel", e);
            return false;
        }
    }

    public byte[] zza(EventParcel eventParcel, String str) {
        zzma();
        zzkN();
        zzGj();
        zzaa.zzz(eventParcel);
        zzaa.zzdl(str);
        zzd com_google_android_gms_internal_zzsp_zzd = new zzd();
        zzFh().a();
        try {
            a b = zzFh().b(str);
            byte[] bArr;
            if (b == null) {
                zzFm().zzFK().zzj("Log and bundle not available. package_name", str);
                bArr = new byte[0];
                return bArr;
            } else if (b.n()) {
                long j;
                zzsp.zze com_google_android_gms_internal_zzsp_zze = new zzsp.zze();
                com_google_android_gms_internal_zzsp_zzd.zzbhb = new zzsp.zze[]{com_google_android_gms_internal_zzsp_zze};
                com_google_android_gms_internal_zzsp_zze.zzbhd = Integer.valueOf(1);
                com_google_android_gms_internal_zzsp_zze.zzbhl = a.a.a.a.a.b.a.ANDROID_CLIENT_TYPE;
                com_google_android_gms_internal_zzsp_zze.appId = b.b();
                com_google_android_gms_internal_zzsp_zze.zzbbL = b.k();
                com_google_android_gms_internal_zzsp_zze.zzaUf = b.i();
                com_google_android_gms_internal_zzsp_zze.zzbhy = Integer.valueOf((int) b.j());
                com_google_android_gms_internal_zzsp_zze.zzbhp = Long.valueOf(b.l());
                com_google_android_gms_internal_zzsp_zze.zzbbK = b.d();
                com_google_android_gms_internal_zzsp_zze.zzbhu = Long.valueOf(b.m());
                Pair a = zzFn().a(b.b());
                if (!(a == null || TextUtils.isEmpty((CharSequence) a.first))) {
                    com_google_android_gms_internal_zzsp_zze.zzbhr = (String) a.first;
                    com_google_android_gms_internal_zzsp_zze.zzbhs = (Boolean) a.second;
                }
                com_google_android_gms_internal_zzsp_zze.zzbhm = zzFf().zzjb();
                com_google_android_gms_internal_zzsp_zze.osVersion = zzFf().zzFx();
                com_google_android_gms_internal_zzsp_zze.zzbho = Integer.valueOf((int) zzFf().zzFy());
                com_google_android_gms_internal_zzsp_zze.zzbhn = zzFf().zzFz();
                com_google_android_gms_internal_zzsp_zze.zzbht = b.c();
                com_google_android_gms_internal_zzsp_zze.zzbbS = b.f();
                List a2 = zzFh().a(b.b());
                com_google_android_gms_internal_zzsp_zze.zzbhf = new zzg[a2.size()];
                for (int i = 0; i < a2.size(); i++) {
                    zzg com_google_android_gms_internal_zzsp_zzg = new zzg();
                    com_google_android_gms_internal_zzsp_zze.zzbhf[i] = com_google_android_gms_internal_zzsp_zzg;
                    com_google_android_gms_internal_zzsp_zzg.name = ((e) a2.get(i)).b;
                    com_google_android_gms_internal_zzsp_zzg.zzbhF = Long.valueOf(((e) a2.get(i)).c);
                    zzFi().zza(com_google_android_gms_internal_zzsp_zzg, ((e) a2.get(i)).d);
                }
                Bundle zzFB = eventParcel.zzbcq.zzFB();
                if ("_iap".equals(eventParcel.name)) {
                    zzFB.putLong("_c", 1);
                }
                zzFB.putString("_o", eventParcel.zzbcr);
                h a3 = zzFh().a(str, eventParcel.name);
                if (a3 == null) {
                    zzFh().a(new h(str, eventParcel.name, 1, 0, eventParcel.zzbcs));
                    j = 0;
                } else {
                    j = a3.e;
                    zzFh().a(a3.a(eventParcel.zzbcs).a());
                }
                zzh com_google_android_gms_measurement_internal_zzh = new zzh(this, eventParcel.zzbcr, str, eventParcel.name, eventParcel.zzbcs, j, zzFB);
                zzb com_google_android_gms_internal_zzsp_zzb = new zzb();
                com_google_android_gms_internal_zzsp_zze.zzbhe = new zzb[]{com_google_android_gms_internal_zzsp_zzb};
                com_google_android_gms_internal_zzsp_zzb.zzbgX = Long.valueOf(com_google_android_gms_measurement_internal_zzh.zzajg);
                com_google_android_gms_internal_zzsp_zzb.name = com_google_android_gms_measurement_internal_zzh.mName;
                com_google_android_gms_internal_zzsp_zzb.zzbgY = Long.valueOf(com_google_android_gms_measurement_internal_zzh.zzbci);
                com_google_android_gms_internal_zzsp_zzb.zzbgW = new zzc[com_google_android_gms_measurement_internal_zzh.zzbcj.size()];
                Iterator it = com_google_android_gms_measurement_internal_zzh.zzbcj.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    zzc com_google_android_gms_internal_zzsp_zzc = new zzc();
                    int i3 = i2 + 1;
                    com_google_android_gms_internal_zzsp_zzb.zzbgW[i2] = com_google_android_gms_internal_zzsp_zzc;
                    com_google_android_gms_internal_zzsp_zzc.name = str2;
                    zzFi().zza(com_google_android_gms_internal_zzsp_zzc, com_google_android_gms_measurement_internal_zzh.zzbcj.get(str2));
                    i2 = i3;
                }
                com_google_android_gms_internal_zzsp_zze.zzbhx = zza(b.b(), com_google_android_gms_internal_zzsp_zze.zzbhf, com_google_android_gms_internal_zzsp_zze.zzbhe);
                com_google_android_gms_internal_zzsp_zze.zzbhh = com_google_android_gms_internal_zzsp_zzb.zzbgX;
                com_google_android_gms_internal_zzsp_zze.zzbhi = com_google_android_gms_internal_zzsp_zzb.zzbgX;
                long h = b.h();
                com_google_android_gms_internal_zzsp_zze.zzbhk = h != 0 ? Long.valueOf(h) : null;
                long g = b.g();
                if (g != 0) {
                    h = g;
                }
                com_google_android_gms_internal_zzsp_zze.zzbhj = h != 0 ? Long.valueOf(h) : null;
                b.r();
                com_google_android_gms_internal_zzsp_zze.zzbhv = Integer.valueOf((int) b.o());
                com_google_android_gms_internal_zzsp_zze.zzbhq = Long.valueOf(zzFo().zzEi());
                com_google_android_gms_internal_zzsp_zze.zzbhg = Long.valueOf(zzlQ().currentTimeMillis());
                com_google_android_gms_internal_zzsp_zze.zzbhw = Boolean.TRUE;
                b.a(com_google_android_gms_internal_zzsp_zze.zzbhh.longValue());
                b.b(com_google_android_gms_internal_zzsp_zze.zzbhi.longValue());
                zzFh().a(b);
                zzFh().b();
                zzFh().c();
                try {
                    bArr = new byte[com_google_android_gms_internal_zzsp_zzd.getSerializedSize()];
                    zzamc zzO = zzamc.zzO(bArr);
                    com_google_android_gms_internal_zzsp_zzd.writeTo(zzO);
                    zzO.zzWU();
                    return zzFi().zzh(bArr);
                } catch (IOException e) {
                    zzFm().zzFE().zzj("Data loss. Failed to bundle and serialize", e);
                    return null;
                }
            } else {
                zzFm().zzFK().zzj("Log and bundle disabled. package_name", str);
                bArr = new byte[0];
                zzFh().c();
                return bArr;
            }
        } finally {
            zzFh().c();
        }
    }

    boolean zzai(long j) {
        return zzg(null, j);
    }

    void zzb(AppMetadata appMetadata, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("_c", 1);
        zzb(new EventParcel("_f", new EventParams(bundle), "auto", j), appMetadata);
    }

    void zzb(EventParcel eventParcel, AppMetadata appMetadata) {
        long nanoTime = System.nanoTime();
        zzkN();
        zzma();
        String str = appMetadata.packageName;
        zzaa.zzdl(str);
        if (!TextUtils.isEmpty(appMetadata.zzbbK)) {
            if (!appMetadata.zzbbP) {
                zze(appMetadata);
            } else if (zzFj().zzV(str, eventParcel.name)) {
                zzFm().zzFG().zzj("Dropping blacklisted event", eventParcel.name);
                zzFi().zze(11, "_ev", eventParcel.name);
            } else {
                if (zzFm().zzX(2)) {
                    zzFm().zzFL().zzj("Logging event", eventParcel);
                }
                zzFh().a();
                try {
                    Bundle zzFB = eventParcel.zzbcq.zzFB();
                    zze(appMetadata);
                    if ("_iap".equals(eventParcel.name) || Event.ECOMMERCE_PURCHASE.equals(eventParcel.name)) {
                        long round;
                        Object string = zzFB.getString(Param.CURRENCY);
                        if (Event.ECOMMERCE_PURCHASE.equals(eventParcel.name)) {
                            double d = zzFB.getDouble(Param.VALUE) * 1000000.0d;
                            if (d == 0.0d) {
                                d = ((double) zzFB.getLong(Param.VALUE)) * 1000000.0d;
                            }
                            if (d > 9.223372036854776E18d || d < -9.223372036854776E18d) {
                                zzFm().zzFG().zzj("Data lost. Currency value is too big", Double.valueOf(d));
                                zzFh().b();
                                zzFh().c();
                                return;
                            }
                            round = Math.round(d);
                        } else {
                            round = zzFB.getLong(Param.VALUE);
                        }
                        if (!TextUtils.isEmpty(string)) {
                            String toUpperCase = string.toUpperCase(Locale.US);
                            if (toUpperCase.matches("[A-Z]{3}")) {
                                e eVar;
                                String valueOf = String.valueOf("_ltv_");
                                toUpperCase = String.valueOf(toUpperCase);
                                String concat = toUpperCase.length() != 0 ? valueOf.concat(toUpperCase) : new String(valueOf);
                                e c = zzFh().c(str, concat);
                                if (c == null || !(c.d instanceof Long)) {
                                    zzFh().a(str, zzFo().zzfe(str) - 1);
                                    eVar = new e(str, concat, zzlQ().currentTimeMillis(), Long.valueOf(round));
                                } else {
                                    eVar = new e(str, concat, zzlQ().currentTimeMillis(), Long.valueOf(round + ((Long) c.d).longValue()));
                                }
                                if (!zzFh().a(eVar)) {
                                    zzFm().zzFE().zze("Too many unique user properties are set. Ignoring user property.", eVar.b, eVar.d);
                                    zzFi().zze(9, null, null);
                                }
                            }
                        }
                    }
                    boolean zzfG = zzal.zzfG(eventParcel.name);
                    zzal.zzK(zzFB);
                    boolean equals = "_err".equals(eventParcel.name);
                    zze.zza a = zzFh().a(zzGi(), str, zzfG, false, equals);
                    long zzEE = a.zzbbY - zzFo().zzEE();
                    if (zzEE > 0) {
                        if (zzEE % 1000 == 1) {
                            zzFm().zzFE().zzj("Data loss. Too many events logged. count", Long.valueOf(a.zzbbY));
                        }
                        zzFi().zze(16, "_ev", eventParcel.name);
                        zzFh().b();
                        return;
                    }
                    h a2;
                    if (zzfG) {
                        zzEE = a.zzbbX - zzFo().zzEF();
                        if (zzEE > 0) {
                            if (zzEE % 1000 == 1) {
                                zzFm().zzFE().zzj("Data loss. Too many public events logged. count", Long.valueOf(a.zzbbX));
                            }
                            zzFi().zze(16, "_ev", eventParcel.name);
                            zzFh().b();
                            zzFh().c();
                            return;
                        }
                    }
                    if (equals) {
                        zzEE = a.zzbca - zzFo().zzEG();
                        if (zzEE > 0) {
                            if (zzEE == 1) {
                                zzFm().zzFE().zzj("Too many error events logged. count", Long.valueOf(a.zzbca));
                            }
                            zzFh().b();
                            zzFh().c();
                            return;
                        }
                    }
                    zzFi().zza(zzFB, "_o", eventParcel.zzbcr);
                    long c2 = zzFh().c(str);
                    if (c2 > 0) {
                        zzFm().zzFG().zzj("Data lost. Too many events stored on disk, deleted", Long.valueOf(c2));
                    }
                    zzh com_google_android_gms_measurement_internal_zzh = new zzh(this, eventParcel.zzbcr, str, eventParcel.name, eventParcel.zzbcs, 0, zzFB);
                    h a3 = zzFh().a(str, com_google_android_gms_measurement_internal_zzh.mName);
                    if (a3 != null) {
                        com_google_android_gms_measurement_internal_zzh = com_google_android_gms_measurement_internal_zzh.zza(this, a3.e);
                        a2 = a3.a(com_google_android_gms_measurement_internal_zzh.zzajg);
                    } else if (zzFh().i(str) >= ((long) zzFo().zzED())) {
                        zzFm().zzFE().zze("Too many event names used, ignoring event. name, supported count", com_google_android_gms_measurement_internal_zzh.mName, Integer.valueOf(zzFo().zzED()));
                        zzFi().zze(8, null, null);
                        zzFh().c();
                        return;
                    } else {
                        a2 = new h(str, com_google_android_gms_measurement_internal_zzh.mName, 0, 0, com_google_android_gms_measurement_internal_zzh.zzajg);
                    }
                    zzFh().a(a2);
                    zza(com_google_android_gms_measurement_internal_zzh, appMetadata);
                    zzFh().b();
                    if (zzFm().zzX(2)) {
                        zzFm().zzFL().zzj("Event recorded", com_google_android_gms_measurement_internal_zzh);
                    }
                    zzFh().c();
                    zzGn();
                    zzFm().zzFL().zzj("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000));
                } finally {
                    zzFh().c();
                }
            }
        }
    }

    void zzb(EventParcel eventParcel, String str) {
        a b = zzFh().b(str);
        if (b == null || TextUtils.isEmpty(b.i())) {
            zzFm().zzFK().zzj("No app data available; dropping event", str);
            return;
        }
        try {
            String str2 = getContext().getPackageManager().getPackageInfo(str, 0).versionName;
            if (!(b.i() == null || b.i().equals(str2))) {
                zzFm().zzFG().zzj("App version does not match; dropping event", str);
                return;
            }
        } catch (NameNotFoundException e) {
            if (!"_ui".equals(eventParcel.name)) {
                zzFm().zzFG().zzj("Could not find package", str);
            }
        }
        EventParcel eventParcel2 = eventParcel;
        zzb(eventParcel2, new AppMetadata(str, b.d(), b.i(), b.j(), b.k(), b.l(), b.m(), null, b.n(), false, b.f()));
    }

    void zzb(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        zzkN();
        zzma();
        if (!TextUtils.isEmpty(appMetadata.zzbbK)) {
            if (appMetadata.zzbbP) {
                int zzfK = zzFi().zzfK(userAttributeParcel.name);
                if (zzfK != 0) {
                    zzFi().zze(zzfK, "_ev", zzFi().zza(userAttributeParcel.name, zzFo().zzEx(), true));
                    return;
                }
                zzfK = zzFi().zzm(userAttributeParcel.name, userAttributeParcel.getValue());
                if (zzfK != 0) {
                    zzFi().zze(zzfK, "_ev", zzFi().zza(userAttributeParcel.name, zzFo().zzEx(), true));
                    return;
                }
                Object zzn = zzFi().zzn(userAttributeParcel.name, userAttributeParcel.getValue());
                if (zzn != null) {
                    e eVar = new e(appMetadata.packageName, userAttributeParcel.name, userAttributeParcel.zzbgc, zzn);
                    zzFm().zzFK().zze("Setting user property", eVar.b, zzn);
                    zzFh().a();
                    try {
                        zze(appMetadata);
                        boolean a = zzFh().a(eVar);
                        zzFh().b();
                        if (a) {
                            zzFm().zzFK().zze("User property set", eVar.b, eVar.d);
                        } else {
                            zzFm().zzFE().zze("Too many unique user properties are set. Ignoring user property.", eVar.b, eVar.d);
                            zzFi().zze(9, null, null);
                        }
                        zzFh().c();
                        return;
                    } catch (Throwable th) {
                        zzFh().c();
                    }
                } else {
                    return;
                }
            }
            zze(appMetadata);
        }
    }

    void zzb(b bVar) {
        this.zzbeV++;
    }

    void zzb(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        int i2 = 0;
        zzkN();
        zzma();
        zzaa.zzdl(str);
        if (bArr == null) {
            bArr = new byte[0];
        }
        zzFh().a();
        try {
            a b = zzFh().b(str);
            int i3 = ((i == 200 || i == 204 || i == 304) && th == null) ? 1 : 0;
            if (b == null) {
                zzFm().zzFG().zzj("App does not exist in onConfigFetched", str);
            } else if (i3 != 0 || i == WalletConstants.ERROR_CODE_INVALID_PARAMETERS) {
                List list = map != null ? (List) map.get("Last-Modified") : null;
                String str2 = (list == null || list.size() <= 0) ? null : (String) list.get(0);
                if (i == WalletConstants.ERROR_CODE_INVALID_PARAMETERS || i == 304) {
                    if (zzFj().zzfy(str) == null && !zzFj().zzb(str, null, null)) {
                        zzFh().c();
                        return;
                    }
                } else if (!zzFj().zzb(str, bArr, str2)) {
                    zzFh().c();
                    return;
                }
                b.g(zzlQ().currentTimeMillis());
                zzFh().a(b);
                if (i == WalletConstants.ERROR_CODE_INVALID_PARAMETERS) {
                    zzFm().zzFG().log("Config not found. Using empty config");
                } else {
                    zzFm().zzFL().zze("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                }
                if (zzGb().zzod() && zzGm()) {
                    zzGl();
                } else {
                    zzGn();
                }
            } else {
                b.h(zzlQ().currentTimeMillis());
                zzFh().a(b);
                zzFm().zzFL().zze("Fetching config failed. code, error", Integer.valueOf(i), th);
                zzFj().zzfA(str);
                zzFn().d.set(zzlQ().currentTimeMillis());
                if (i == 503 || i == 429) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    zzFn().e.set(zzlQ().currentTimeMillis());
                }
                zzGn();
            }
            zzFh().b();
        } finally {
            zzFh().c();
        }
    }

    void zzc(AppMetadata appMetadata) {
        zzkN();
        zzma();
        zzaa.zzdl(appMetadata.packageName);
        zze(appMetadata);
    }

    void zzc(AppMetadata appMetadata, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("_et", 1);
        zzb(new EventParcel("_e", new EventParams(bundle), "auto", j), appMetadata);
    }

    void zzc(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        zzkN();
        zzma();
        if (!TextUtils.isEmpty(appMetadata.zzbbK)) {
            if (appMetadata.zzbbP) {
                zzFm().zzFK().zzj("Removing user property", userAttributeParcel.name);
                zzFh().a();
                try {
                    zze(appMetadata);
                    zzFh().b(appMetadata.packageName, userAttributeParcel.name);
                    zzFh().b();
                    zzFm().zzFK().zzj("User property removed", userAttributeParcel.name);
                } finally {
                    zzFh().c();
                }
            } else {
                zze(appMetadata);
            }
        }
    }

    public void zzd(AppMetadata appMetadata) {
        zzkN();
        zzma();
        zzaa.zzz(appMetadata);
        zzaa.zzdl(appMetadata.packageName);
        if (!TextUtils.isEmpty(appMetadata.zzbbK)) {
            if (appMetadata.zzbbP) {
                long currentTimeMillis = zzlQ().currentTimeMillis();
                zzFh().a();
                try {
                    zza(appMetadata, currentTimeMillis);
                    zze(appMetadata);
                    if (zzFh().a(appMetadata.packageName, "_f") == null) {
                        zzb(new UserAttributeParcel("_fot", currentTimeMillis, Long.valueOf((1 + (currentTimeMillis / 3600000)) * 3600000), "auto"), appMetadata);
                        zzb(appMetadata, currentTimeMillis);
                        zzc(appMetadata, currentTimeMillis);
                    } else if (appMetadata.zzbbQ) {
                        zzd(appMetadata, currentTimeMillis);
                    }
                    zzFh().b();
                } finally {
                    zzFh().c();
                }
            } else {
                zze(appMetadata);
            }
        }
    }

    void zzd(AppMetadata appMetadata, long j) {
        zzb(new EventParcel("_cd", new EventParams(new Bundle()), "auto", j), appMetadata);
    }

    public void zzkN() {
        zzFl().zzkN();
    }

    void zzlP() {
        if (zzFo().zzmW()) {
            throw new IllegalStateException("Unexpected call on package side");
        }
    }

    public zze zzlQ() {
        return this.zzsd;
    }

    void zzma() {
        if (!this.zzWh) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    boolean zzv(int i, int i2) {
        zzkN();
        if (i > i2) {
            zzFm().zzFE().zze("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
            return false;
        }
        if (i < i2) {
            if (zza(i2, zzGe())) {
                zzFm().zzFL().zze("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                zzFm().zzFE().zze("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
                return false;
            }
        }
        return true;
    }
}
