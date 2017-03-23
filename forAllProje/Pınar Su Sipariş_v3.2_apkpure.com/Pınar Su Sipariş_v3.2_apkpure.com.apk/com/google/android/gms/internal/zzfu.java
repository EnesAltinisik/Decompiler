package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdOptions.Builder;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzf;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzfv.zza;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@zzig
public class zzfu implements zza {
    private final Context mContext;
    private final String zzEV;
    private final long zzEW;
    private final zzfr zzEX;
    private final zzfq zzEY;
    private zzgb zzEZ;
    private int zzFa = -2;
    private zzgd zzFb;
    private final Object zzpp = new Object();
    private final NativeAdOptionsParcel zzqL;
    private final List<String> zzqM;
    private final VersionInfoParcel zzqP;
    private final zzga zzqc;
    private AdRequestParcel zzrD;
    private final AdSizeParcel zzrJ;
    private final boolean zztM;
    private final boolean zzwo;

    class AnonymousClass2 extends zzgd.zza {
        final /* synthetic */ int a;

        AnonymousClass2(int i) {
            this.a = i;
        }

        public int zzfG() throws RemoteException {
            return this.a;
        }
    }

    public zzfu(Context context, String str, zzga com_google_android_gms_internal_zzga, zzfr com_google_android_gms_internal_zzfr, zzfq com_google_android_gms_internal_zzfq, AdRequestParcel adRequestParcel, AdSizeParcel adSizeParcel, VersionInfoParcel versionInfoParcel, boolean z, boolean z2, NativeAdOptionsParcel nativeAdOptionsParcel, List<String> list) {
        this.mContext = context;
        this.zzqc = com_google_android_gms_internal_zzga;
        this.zzEY = com_google_android_gms_internal_zzfq;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            this.zzEV = zzfB();
        } else {
            this.zzEV = str;
        }
        this.zzEX = com_google_android_gms_internal_zzfr;
        this.zzEW = com_google_android_gms_internal_zzfr.zzEE != -1 ? com_google_android_gms_internal_zzfr.zzEE : 10000;
        this.zzrD = adRequestParcel;
        this.zzrJ = adSizeParcel;
        this.zzqP = versionInfoParcel;
        this.zztM = z;
        this.zzwo = z2;
        this.zzqL = nativeAdOptionsParcel;
        this.zzqM = list;
    }

    private long zza(long j, long j2, long j3, long j4) {
        while (this.zzFa == -2) {
            zzb(j, j2, j3, j4);
        }
        return zzu.zzco().elapsedRealtime() - j;
    }

    private void zza(zzft com_google_android_gms_internal_zzft) {
        if ("com.google.ads.mediation.AdUrlAdapter".equals(this.zzEV)) {
            if (this.zzrD.zzuX == null) {
                this.zzrD = new zzf(this.zzrD).zzc(new Bundle()).zzdA();
            }
            Bundle bundle = this.zzrD.zzuX.getBundle(this.zzEV);
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("sdk_less_network_id", this.zzEY.zzEo);
            this.zzrD.zzuX.putBundle(this.zzEV, bundle);
        }
        String zzai = zzai(this.zzEY.zzEv);
        try {
            if (this.zzqP.zzRD < 4100000) {
                if (this.zzrJ.zzvt) {
                    this.zzEZ.zza(zze.zzD(this.mContext), this.zzrD, zzai, com_google_android_gms_internal_zzft);
                } else {
                    this.zzEZ.zza(zze.zzD(this.mContext), this.zzrJ, this.zzrD, zzai, (zzgc) com_google_android_gms_internal_zzft);
                }
            } else if (this.zztM) {
                this.zzEZ.zza(zze.zzD(this.mContext), this.zzrD, zzai, this.zzEY.zzEn, com_google_android_gms_internal_zzft, this.zzqL, this.zzqM);
            } else if (this.zzrJ.zzvt) {
                this.zzEZ.zza(zze.zzD(this.mContext), this.zzrD, zzai, this.zzEY.zzEn, (zzgc) com_google_android_gms_internal_zzft);
            } else if (!this.zzwo) {
                this.zzEZ.zza(zze.zzD(this.mContext), this.zzrJ, this.zzrD, zzai, this.zzEY.zzEn, com_google_android_gms_internal_zzft);
            } else if (this.zzEY.zzEy != null) {
                this.zzEZ.zza(zze.zzD(this.mContext), this.zzrD, zzai, this.zzEY.zzEn, com_google_android_gms_internal_zzft, new NativeAdOptionsParcel(zzaj(this.zzEY.zzEC)), this.zzEY.zzEB);
            } else {
                this.zzEZ.zza(zze.zzD(this.mContext), this.zzrJ, this.zzrD, zzai, this.zzEY.zzEn, com_google_android_gms_internal_zzft);
            }
        } catch (Throwable e) {
            zzb.zzd("Could not request ad from mediation adapter.", e);
            zzw(5);
        }
    }

    private String zzai(String str) {
        if (!(str == null || !zzfE() || zzx(2))) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.remove("cpm_floor_cents");
                str = jSONObject.toString();
            } catch (JSONException e) {
                zzb.zzaW("Could not remove field. Returning the original value");
            }
        }
        return str;
    }

    private static NativeAdOptions zzaj(String str) {
        Builder builder = new Builder();
        if (str == null) {
            return builder.build();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            builder.setRequestMultipleImages(jSONObject.optBoolean("multiple_images", false));
            builder.setReturnUrlsForImageAssets(jSONObject.optBoolean("only_urls", false));
            builder.setImageOrientation(zzak(jSONObject.optString("native_image_orientation", "any")));
        } catch (Throwable e) {
            zzb.zzd("Exception occurred when creating native ad options", e);
        }
        return builder.build();
    }

    private static int zzak(String str) {
        return "landscape".equals(str) ? 2 : "portrait".equals(str) ? 1 : 0;
    }

    private void zzb(long j, long j2, long j3, long j4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j5 = j2 - (elapsedRealtime - j);
        elapsedRealtime = j4 - (elapsedRealtime - j3);
        if (j5 <= 0 || elapsedRealtime <= 0) {
            zzb.zzaV("Timed out waiting for adapter.");
            this.zzFa = 3;
            return;
        }
        try {
            this.zzpp.wait(Math.min(j5, elapsedRealtime));
        } catch (InterruptedException e) {
            this.zzFa = -1;
        }
    }

    private String zzfB() {
        try {
            if (!TextUtils.isEmpty(this.zzEY.zzEr)) {
                return this.zzqc.zzam(this.zzEY.zzEr) ? "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter" : "com.google.ads.mediation.customevent.CustomEventAdapter";
            }
        } catch (RemoteException e) {
            zzb.zzaW("Fail to determine the custom event's version, assuming the old one.");
        }
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    private zzgd zzfC() {
        if (this.zzFa != 0 || !zzfE()) {
            return null;
        }
        try {
            if (!(!zzx(4) || this.zzFb == null || this.zzFb.zzfG() == 0)) {
                return this.zzFb;
            }
        } catch (RemoteException e) {
            zzb.zzaW("Could not get cpm value from MediationResponseMetadata");
        }
        return zzy(zzfF());
    }

    private zzgb zzfD() {
        String str = "Instantiating mediation adapter: ";
        String valueOf = String.valueOf(this.zzEV);
        zzb.zzaV(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        if (!this.zztM) {
            if (((Boolean) zzcu.zzyF.get()).booleanValue() && "com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzEV)) {
                return zza(new AdMobAdapter());
            }
            if (((Boolean) zzcu.zzyG.get()).booleanValue() && "com.google.ads.mediation.AdUrlAdapter".equals(this.zzEV)) {
                return zza(new AdUrlAdapter());
            }
            if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(this.zzEV)) {
                return new zzgh(new zzgp());
            }
        }
        try {
            return this.zzqc.zzal(this.zzEV);
        } catch (Throwable e) {
            Throwable th = e;
            String str2 = "Could not instantiate mediation adapter: ";
            valueOf = String.valueOf(this.zzEV);
            zzb.zza(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
            return null;
        }
    }

    private boolean zzfE() {
        return this.zzEX.zzEO != -1;
    }

    private int zzfF() {
        if (this.zzEY.zzEv == null) {
            return 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.zzEY.zzEv);
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzEV)) {
                return jSONObject.optInt("cpm_cents", 0);
            }
            int optInt = zzx(2) ? jSONObject.optInt("cpm_floor_cents", 0) : 0;
            return optInt == 0 ? jSONObject.optInt("penalized_average_cpm_cents", 0) : optInt;
        } catch (JSONException e) {
            zzb.zzaW("Could not convert to json. Returning 0");
            return 0;
        }
    }

    private boolean zzx(int i) {
        try {
            Bundle zzfL = this.zztM ? this.zzEZ.zzfL() : this.zzrJ.zzvt ? this.zzEZ.getInterstitialAdapterInfo() : this.zzEZ.zzfK();
            if (zzfL == null) {
                return false;
            }
            return (zzfL.getInt("capabilities", 0) & i) == i;
        } catch (RemoteException e) {
            zzb.zzaW("Could not get adapter info. Returning false");
            return false;
        }
    }

    private static zzgd zzy(int i) {
        return new AnonymousClass2(i);
    }

    public void cancel() {
        synchronized (this.zzpp) {
            try {
                if (this.zzEZ != null) {
                    this.zzEZ.destroy();
                }
            } catch (Throwable e) {
                zzb.zzd("Could not destroy mediation adapter.", e);
            }
            this.zzFa = -1;
            this.zzpp.notify();
        }
    }

    public zzfv zza(long j, long j2) {
        zzfv com_google_android_gms_internal_zzfv;
        synchronized (this.zzpp) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            final zzft com_google_android_gms_internal_zzft = new zzft();
            zzka.zzQu.post(new Runnable(this) {
                final /* synthetic */ zzfu b;

                public void run() {
                    synchronized (this.b.zzpp) {
                        if (this.b.zzFa != -2) {
                            return;
                        }
                        this.b.zzEZ = this.b.zzfD();
                        if (this.b.zzEZ == null) {
                            this.b.zzw(4);
                        } else if (!this.b.zzfE() || this.b.zzx(1)) {
                            com_google_android_gms_internal_zzft.zza(this.b);
                            this.b.zza(com_google_android_gms_internal_zzft);
                        } else {
                            String zzf = this.b.zzEV;
                            zzb.zzaW(new StringBuilder(String.valueOf(zzf).length() + 56).append("Ignoring adapter ").append(zzf).append(" as delayed impression is not supported").toString());
                            this.b.zzw(2);
                        }
                    }
                }
            });
            zzft com_google_android_gms_internal_zzft2 = com_google_android_gms_internal_zzft;
            com_google_android_gms_internal_zzfv = new zzfv(this.zzEY, this.zzEZ, this.zzEV, com_google_android_gms_internal_zzft2, this.zzFa, zzfC(), zza(elapsedRealtime, this.zzEW, j, j2));
        }
        return com_google_android_gms_internal_zzfv;
    }

    protected zzgb zza(MediationAdapter mediationAdapter) {
        return new zzgh(mediationAdapter);
    }

    public void zza(int i, zzgd com_google_android_gms_internal_zzgd) {
        synchronized (this.zzpp) {
            this.zzFa = i;
            this.zzFb = com_google_android_gms_internal_zzgd;
            this.zzpp.notify();
        }
    }

    public void zzw(int i) {
        synchronized (this.zzpp) {
            this.zzFa = i;
            this.zzpp.notify();
        }
    }
}
