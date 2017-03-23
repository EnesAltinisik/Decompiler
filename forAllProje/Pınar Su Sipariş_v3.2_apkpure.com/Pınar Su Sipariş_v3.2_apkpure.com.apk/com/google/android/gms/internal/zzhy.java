package com.google.android.gms.internal;

import a.a.a.a.a.d.b;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.internal.zzjn.zza;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@zzig
public class zzhy extends zzhu {
    private final zzla zzBb;
    private zzfr zzEX;
    zzfp zzKe;
    protected zzfv zzKf;
    private boolean zzKg;
    private final zzdc zzpQ;
    private zzga zzqc;

    zzhy(Context context, zza com_google_android_gms_internal_zzjn_zza, zzga com_google_android_gms_internal_zzga, zzhv.zza com_google_android_gms_internal_zzhv_zza, zzdc com_google_android_gms_internal_zzdc, zzla com_google_android_gms_internal_zzla) {
        super(context, com_google_android_gms_internal_zzjn_zza, com_google_android_gms_internal_zzhv_zza);
        this.zzqc = com_google_android_gms_internal_zzga;
        this.zzEX = com_google_android_gms_internal_zzjn_zza.zzOY;
        this.zzpQ = com_google_android_gms_internal_zzdc;
        this.zzBb = com_google_android_gms_internal_zzla;
    }

    private static int zzJ(int i) {
        switch (i) {
            case -1:
                return 4;
            case 0:
                return 0;
            case 1:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 5;
            default:
                return 6;
        }
    }

    private static String zza(zzfv com_google_android_gms_internal_zzfv) {
        String str = com_google_android_gms_internal_zzfv.zzFg.zzEq;
        int zzJ = zzJ(com_google_android_gms_internal_zzfv.zzFf);
        return new StringBuilder(String.valueOf(str).length() + 33).append(str).append(".").append(zzJ).append(".").append(com_google_android_gms_internal_zzfv.zzFl).toString();
    }

    private static String zzg(List<zzfv> list) {
        String str = "";
        if (list == null) {
            return str.toString();
        }
        String str2 = str;
        for (zzfv com_google_android_gms_internal_zzfv : list) {
            if (!(com_google_android_gms_internal_zzfv == null || com_google_android_gms_internal_zzfv.zzFg == null || TextUtils.isEmpty(com_google_android_gms_internal_zzfv.zzFg.zzEq))) {
                str2 = String.valueOf(str2);
                str = String.valueOf(zza(com_google_android_gms_internal_zzfv));
                str2 = new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(str).length()).append(str2).append(str).append(b.ROLL_OVER_FILE_NAME_SEPARATOR).toString();
            }
        }
        return str2.substring(0, Math.max(0, str2.length() - 1));
    }

    private void zzhz() throws zza {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        zzka.zzQu.post(new Runnable(this) {
            final /* synthetic */ zzhy b;

            public void run() {
                synchronized (this.b.zzJM) {
                    this.b.zzKg = zzn.zza(this.b.zzBb, this.b.zzKf, countDownLatch);
                }
            }
        });
        try {
            countDownLatch.await(10, TimeUnit.SECONDS);
            synchronized (this.zzJM) {
                if (!this.zzKg) {
                    throw new zza("View could not be prepared", 0);
                } else if (this.zzBb.isDestroyed()) {
                    throw new zza("Assets not loaded, web view is destroyed", 0);
                }
            }
        } catch (InterruptedException e) {
            String valueOf = String.valueOf(e);
            throw new zza(new StringBuilder(String.valueOf(valueOf).length() + 38).append("Interrupted while waiting for latch : ").append(valueOf).toString(), 0);
        }
    }

    public void onStop() {
        synchronized (this.zzJM) {
            super.onStop();
            if (this.zzKe != null) {
                this.zzKe.cancel();
            }
        }
    }

    protected zzjn zzI(int i) {
        AdRequestInfoParcel adRequestInfoParcel = this.zzJJ.zzPh;
        return new zzjn(adRequestInfoParcel.zzLi, this.zzBb, this.zzJK.zzEF, i, this.zzJK.zzEG, this.zzJK.zzLR, this.zzJK.orientation, this.zzJK.zzEL, adRequestInfoParcel.zzLl, this.zzJK.zzLP, this.zzKf != null ? this.zzKf.zzFg : null, this.zzKf != null ? this.zzKf.zzFh : null, this.zzKf != null ? this.zzKf.zzFi : AdMobAdapter.class.getName(), this.zzEX, this.zzKf != null ? this.zzKf.zzFj : null, this.zzJK.zzLQ, this.zzJJ.zzsB, this.zzJK.zzLO, this.zzJJ.zzPc, this.zzJK.zzLT, this.zzJK.zzLU, this.zzJJ.zzOW, null, this.zzJK.zzMf, this.zzJK.zzMg, this.zzJK.zzMh, this.zzEX != null ? this.zzEX.zzEQ : false, this.zzJK.zzMj, this.zzKe != null ? zzg(this.zzKe.zzfA()) : null, this.zzJK.zzEI);
    }

    protected void zzh(long j) throws zza {
        synchronized (this.zzJM) {
            this.zzKe = zzi(j);
        }
        List arrayList = new ArrayList(this.zzEX.zzED);
        String str = "com.google.ads.mediation.admob.AdMobAdapter";
        Bundle bundle = this.zzJJ.zzPh.zzLi.zzuX.getBundle(str);
        int i = (bundle == null || !bundle.getBoolean("_skipMediation")) ? 0 : 1;
        if (i != 0) {
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (!((zzfq) listIterator.next()).zzEp.contains(str)) {
                    listIterator.remove();
                }
            }
        }
        this.zzKf = this.zzKe.zzd(arrayList);
        switch (this.zzKf.zzFf) {
            case 0:
                if (this.zzKf.zzFg != null && this.zzKf.zzFg.zzEy != null) {
                    zzhz();
                    return;
                }
                return;
            case 1:
                throw new zza("No fill from any mediation ad networks.", 3);
            default:
                throw new zza("Unexpected mediation result: " + this.zzKf.zzFf, 0);
        }
    }

    zzfp zzi(long j) {
        if (this.zzEX.zzEO != -1) {
            return new zzfx(this.mContext, this.zzJJ.zzPh, this.zzqc, this.zzEX, this.zzJK.zzvv, this.zzJK.zzvx, j, ((Long) zzcu.zzyI.get()).longValue(), 2);
        }
        return new zzfy(this.mContext, this.zzJJ.zzPh, this.zzqc, this.zzEX, this.zzJK.zzvv, this.zzJK.zzvx, j, ((Long) zzcu.zzyI.get()).longValue(), this.zzpQ);
    }
}
