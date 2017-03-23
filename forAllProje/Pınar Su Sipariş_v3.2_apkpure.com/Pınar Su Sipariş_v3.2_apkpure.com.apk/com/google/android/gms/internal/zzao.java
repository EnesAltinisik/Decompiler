package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import com.google.ads.afma.nano.Google3NanoAfmaSignals.AFMASignals;
import com.google.ads.afma.nano.Google3NanoAfmaSignals.AFMASignals.TouchInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class zzao extends zzam {
    private static final String TAG = zzao.class.getSimpleName();
    private static long startTime = 0;
    protected static volatile zzav zznO = null;
    private static Method zzoe;
    static boolean zzog = false;
    protected static final Object zzoj = new Object();
    protected boolean zzod = false;
    protected String zzof;
    protected boolean zzoh = false;
    protected boolean zzoi = false;

    protected zzao(Context context, String str) {
        super(context);
        this.zzof = str;
        this.zzod = false;
    }

    protected zzao(Context context, String str, boolean z) {
        super(context);
        this.zzof = str;
        this.zzod = z;
    }

    static List<Long> zza(zzav com_google_android_gms_internal_zzav, MotionEvent motionEvent, DisplayMetrics displayMetrics) throws zzau {
        zzoe = com_google_android_gms_internal_zzav.zzc(zzat.zzaB(), zzat.zzaC());
        if (zzoe == null || motionEvent == null) {
            throw new zzau();
        }
        try {
            return (ArrayList) zzoe.invoke(null, new Object[]{motionEvent, displayMetrics});
        } catch (Throwable e) {
            throw new zzau(e);
        } catch (Throwable e2) {
            throw new zzau(e2);
        }
    }

    protected static synchronized void zza(Context context, boolean z) {
        synchronized (zzao.class) {
            if (!zzog) {
                startTime = Calendar.getInstance().getTime().getTime() / 1000;
                zznO = zzb(context, z);
                zzog = true;
            }
        }
    }

    private static void zza(zzav com_google_android_gms_internal_zzav) {
        List singletonList = Collections.singletonList(Context.class);
        com_google_android_gms_internal_zzav.zza(zzat.zzan(), zzat.zzao(), singletonList);
        com_google_android_gms_internal_zzav.zza(zzat.zzal(), zzat.zzam(), singletonList);
        com_google_android_gms_internal_zzav.zza(zzat.zzax(), zzat.zzay(), singletonList);
        com_google_android_gms_internal_zzav.zza(zzat.zzav(), zzat.zzaw(), singletonList);
        com_google_android_gms_internal_zzav.zza(zzat.zzaf(), zzat.zzag(), singletonList);
        com_google_android_gms_internal_zzav.zza(zzat.zzad(), zzat.zzae(), singletonList);
        com_google_android_gms_internal_zzav.zza(zzat.zzab(), zzat.zzac(), singletonList);
        com_google_android_gms_internal_zzav.zza(zzat.zzar(), zzat.zzas(), singletonList);
        com_google_android_gms_internal_zzav.zza(zzat.zzZ(), zzat.zzaa(), singletonList);
        com_google_android_gms_internal_zzav.zza(zzat.zzaB(), zzat.zzaC(), Arrays.asList(new Class[]{MotionEvent.class, DisplayMetrics.class}));
        com_google_android_gms_internal_zzav.zza(zzat.zzaj(), zzat.zzak(), Collections.emptyList());
        com_google_android_gms_internal_zzav.zza(zzat.zzaz(), zzat.zzaA(), Collections.emptyList());
        com_google_android_gms_internal_zzav.zza(zzat.zzat(), zzat.zzau(), Collections.emptyList());
        com_google_android_gms_internal_zzav.zza(zzat.zzah(), zzat.zzai(), Collections.emptyList());
        com_google_android_gms_internal_zzav.zza(zzat.zzap(), zzat.zzaq(), Collections.emptyList());
    }

    protected static zzav zzb(Context context, boolean z) {
        if (zznO == null) {
            synchronized (zzoj) {
                if (zznO == null) {
                    zzav zza = zzav.zza(context, zzat.getKey(), zzat.zzY(), z);
                    zza(zza);
                    zznO = zza;
                }
            }
        }
        return zznO;
    }

    protected void zza(zzav com_google_android_gms_internal_zzav, AFMASignals aFMASignals) {
        if (com_google_android_gms_internal_zzav.zzaD() != null) {
            zza(zzb(com_google_android_gms_internal_zzav, aFMASignals));
        }
    }

    protected void zza(List<Callable<Void>> list) {
        if (zznO != null) {
            ExecutorService zzaD = zznO.zzaD();
            if (zzaD != null && !list.isEmpty()) {
                try {
                    zzaD.invokeAll(list, ((Long) zzcu.zzyK.get()).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable e) {
                    Log.d(TAG, String.format("class methods got exception: %s", new Object[]{zzaw.zza(e)}));
                }
            }
        }
    }

    protected List<Callable<Void>> zzb(zzav com_google_android_gms_internal_zzav, AFMASignals aFMASignals) {
        int zzT = com_google_android_gms_internal_zzav.zzT();
        List arrayList = new ArrayList();
        List list = arrayList;
        list.add(new zzaz(com_google_android_gms_internal_zzav, zzat.zzan(), zzat.zzao(), aFMASignals, zzT, 27));
        list = arrayList;
        list.add(new zzbe(com_google_android_gms_internal_zzav, zzat.zzaj(), zzat.zzak(), aFMASignals, startTime, zzT, 25));
        list = arrayList;
        list.add(new zzbi(com_google_android_gms_internal_zzav, zzat.zzat(), zzat.zzau(), aFMASignals, zzT, 1));
        list = arrayList;
        list.add(new zzbj(com_google_android_gms_internal_zzav, zzat.zzav(), zzat.zzaw(), aFMASignals, zzT, 31));
        list = arrayList;
        list.add(new zzbk(com_google_android_gms_internal_zzav, zzat.zzaz(), zzat.zzaA(), aFMASignals, zzT, 33));
        list = arrayList;
        list.add(new zzay(com_google_android_gms_internal_zzav, zzat.zzax(), zzat.zzay(), aFMASignals, zzT, 29));
        list = arrayList;
        list.add(new zzbc(com_google_android_gms_internal_zzav, zzat.zzaf(), zzat.zzag(), aFMASignals, zzT, 5));
        list = arrayList;
        list.add(new zzbh(com_google_android_gms_internal_zzav, zzat.zzar(), zzat.zzas(), aFMASignals, zzT, 12));
        list = arrayList;
        list.add(new zzax(com_google_android_gms_internal_zzav, zzat.zzZ(), zzat.zzaa(), aFMASignals, zzT, 3));
        list = arrayList;
        list.add(new zzbb(com_google_android_gms_internal_zzav, zzat.zzad(), zzat.zzae(), aFMASignals, zzT, 34));
        list = arrayList;
        list.add(new zzba(com_google_android_gms_internal_zzav, zzat.zzab(), zzat.zzac(), aFMASignals, zzT, 35));
        if (((Boolean) zzcu.zzyO.get()).booleanValue()) {
            list = arrayList;
            list.add(new zzbd(com_google_android_gms_internal_zzav, zzat.zzah(), zzat.zzai(), aFMASignals, zzT, 44));
        }
        if (((Boolean) zzcu.zzyR.get()).booleanValue()) {
            list = arrayList;
            list.add(new zzbg(com_google_android_gms_internal_zzav, zzat.zzap(), zzat.zzaq(), aFMASignals, zzT, 22));
        }
        return arrayList;
    }

    protected AFMASignals zzc(Context context) {
        AFMASignals aFMASignals = new AFMASignals();
        if (!TextUtils.isEmpty(this.zzof)) {
            aFMASignals.afmaVersion = this.zzof;
        }
        zzav zzb = zzb(context, this.zzod);
        zzb.zzaO();
        zza(zzb, aFMASignals);
        zzb.zzaP();
        return aFMASignals;
    }

    protected List<Callable<Void>> zzc(zzav com_google_android_gms_internal_zzav, AFMASignals aFMASignals) {
        ArrayList arrayList = new ArrayList();
        if (com_google_android_gms_internal_zzav.zzaD() == null) {
            return arrayList;
        }
        int zzT = com_google_android_gms_internal_zzav.zzT();
        ArrayList arrayList2 = arrayList;
        arrayList2.add(new zzbi(com_google_android_gms_internal_zzav, zzat.zzat(), zzat.zzau(), aFMASignals, zzT, 1));
        arrayList2 = arrayList;
        arrayList2.add(new zzbe(com_google_android_gms_internal_zzav, zzat.zzaj(), zzat.zzak(), aFMASignals, startTime, zzT, 25));
        if (((Boolean) zzcu.zzyP.get()).booleanValue()) {
            arrayList2 = arrayList;
            arrayList2.add(new zzbd(com_google_android_gms_internal_zzav, zzat.zzah(), zzat.zzai(), aFMASignals, zzT, 44));
        }
        arrayList2 = arrayList;
        arrayList2.add(new zzax(com_google_android_gms_internal_zzav, zzat.zzZ(), zzat.zzaa(), aFMASignals, zzT, 3));
        if (((Boolean) zzcu.zzyS.get()).booleanValue()) {
            arrayList2 = arrayList;
            arrayList2.add(new zzbg(com_google_android_gms_internal_zzav, zzat.zzap(), zzat.zzaq(), aFMASignals, zzT, 22));
        }
        return arrayList;
    }

    protected AFMASignals zzd(Context context) {
        AFMASignals aFMASignals = new AFMASignals();
        if (!TextUtils.isEmpty(this.zzof)) {
            aFMASignals.afmaVersion = this.zzof;
        }
        zzav zzb = zzb(context, this.zzod);
        zzb.zzaO();
        zzd(zzb, aFMASignals);
        zzb.zzaP();
        return aFMASignals;
    }

    protected void zzd(zzav com_google_android_gms_internal_zzav, AFMASignals aFMASignals) {
        try {
            List zza = zza(com_google_android_gms_internal_zzav, this.zznT, this.zzob);
            aFMASignals.tcxSignal = (Long) zza.get(0);
            aFMASignals.tcySignal = (Long) zza.get(1);
            if (((Long) zza.get(2)).longValue() >= 0) {
                aFMASignals.tctSignal = (Long) zza.get(2);
            }
            aFMASignals.tcpSignal = (Long) zza.get(3);
            aFMASignals.tcdSignal = (Long) zza.get(4);
        } catch (zzau e) {
        }
        if (this.zznV > 0) {
            aFMASignals.tcdnSignal = Long.valueOf(this.zznV);
        }
        if (this.zznW > 0) {
            aFMASignals.tcmSignal = Long.valueOf(this.zznW);
        }
        if (this.zznX > 0) {
            aFMASignals.tcuSignal = Long.valueOf(this.zznX);
        }
        if (this.zznY > 0) {
            aFMASignals.tccSignal = Long.valueOf(this.zznY);
        }
        if (this.zznZ > 0) {
            aFMASignals.stkDepthSignal = Long.valueOf(this.zznZ);
        }
        try {
            int size = this.zznU.size() - 1;
            if (size > 0) {
                aFMASignals.previousTouches = new TouchInfo[size];
                for (int i = 0; i < size; i++) {
                    List zza2 = zza(com_google_android_gms_internal_zzav, (MotionEvent) this.zznU.get(i), this.zzob);
                    TouchInfo touchInfo = new TouchInfo();
                    touchInfo.tcxSignal = (Long) zza2.get(0);
                    touchInfo.tcySignal = (Long) zza2.get(1);
                    aFMASignals.previousTouches[i] = touchInfo;
                }
            }
        } catch (zzau e2) {
            aFMASignals.previousTouches = null;
        }
        zza(zzc(com_google_android_gms_internal_zzav, aFMASignals));
    }
}
