package com.google.android.gms.measurement.internal;

import a.a.a.a.a.b.a;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.util.zze;
import com.google.android.gms.common.util.zzt;
import com.google.android.gms.common.zzc;
import com.google.android.gms.internal.zzom;
import com.google.android.gms.measurement.internal.zzl.zza;

public class zzd extends k {
    static final String zzbbT = String.valueOf(zzc.GOOGLE_PLAY_SERVICES_VERSION_CODE / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
    private Boolean zzXt;

    zzd(zzx com_google_android_gms_measurement_internal_zzx) {
        super(com_google_android_gms_measurement_internal_zzx);
    }

    private Boolean zzff(String str) {
        Boolean bool = null;
        zzaa.zzdl(str);
        try {
            PackageManager packageManager = getContext().getPackageManager();
            if (packageManager == null) {
                zzFm().zzFE().log("Failed to load metadata: PackageManager is null");
            } else {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(getContext().getPackageName(), 128);
                if (applicationInfo == null) {
                    zzFm().zzFE().log("Failed to load metadata: ApplicationInfo is null");
                } else if (applicationInfo.metaData == null) {
                    zzFm().zzFE().log("Failed to load metadata: Metadata bundle is null");
                } else if (applicationInfo.metaData.containsKey(str)) {
                    bool = Boolean.valueOf(applicationInfo.metaData.getBoolean(str));
                }
            }
        } catch (NameNotFoundException e) {
            zzFm().zzFE().zzj("Failed to load metadata: Package name not found", e);
        }
        return bool;
    }

    public /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    int zzEA() {
        return 256;
    }

    public int zzEB() {
        return 36;
    }

    public int zzEC() {
        return 2048;
    }

    int zzED() {
        return 500;
    }

    public long zzEE() {
        return (long) ((Integer) zzl.zzbcF.get()).intValue();
    }

    public long zzEF() {
        return (long) ((Integer) zzl.zzbcG.get()).intValue();
    }

    public long zzEG() {
        return 1000;
    }

    int zzEH() {
        return 25;
    }

    int zzEI() {
        return 50;
    }

    long zzEJ() {
        return 3600000;
    }

    long zzEK() {
        return 60000;
    }

    long zzEL() {
        return 61000;
    }

    public boolean zzEM() {
        if (zzmW()) {
            return false;
        }
        Boolean zzff = zzff("firebase_analytics_collection_deactivated");
        return (zzff == null || zzff.booleanValue()) ? false : true;
    }

    public Boolean zzEN() {
        return zzmW() ? null : zzff("firebase_analytics_collection_enabled");
    }

    public long zzEO() {
        return ((Long) zzl.zzbcR.get()).longValue();
    }

    public long zzEP() {
        return ((Long) zzl.zzbcN.get()).longValue();
    }

    public long zzEQ() {
        return 1000;
    }

    public int zzER() {
        return Math.max(0, ((Integer) zzl.zzbcD.get()).intValue());
    }

    public int zzES() {
        return Math.max(1, ((Integer) zzl.zzbcE.get()).intValue());
    }

    public String zzET() {
        return (String) zzl.zzbcJ.get();
    }

    public long zzEU() {
        return ((Long) zzl.zzbcy.get()).longValue();
    }

    public long zzEV() {
        return Math.max(0, ((Long) zzl.zzbcK.get()).longValue());
    }

    public long zzEW() {
        return Math.max(0, ((Long) zzl.zzbcM.get()).longValue());
    }

    public long zzEX() {
        return ((Long) zzl.zzbcL.get()).longValue();
    }

    public long zzEY() {
        return Math.max(0, ((Long) zzl.zzbcO.get()).longValue());
    }

    public long zzEZ() {
        return Math.max(0, ((Long) zzl.zzbcP.get()).longValue());
    }

    public long zzEi() {
        return 9080;
    }

    String zzEu() {
        return (String) zzl.zzbcv.get();
    }

    public int zzEv() {
        return 25;
    }

    public int zzEw() {
        return 32;
    }

    public int zzEx() {
        return 24;
    }

    int zzEy() {
        return 24;
    }

    int zzEz() {
        return 36;
    }

    public int zzFa() {
        return Math.min(20, Math.max(0, ((Integer) zzl.zzbcQ.get()).intValue()));
    }

    public /* bridge */ /* synthetic */ void zzFb() {
        super.zzFb();
    }

    public /* bridge */ /* synthetic */ f zzFc() {
        return super.zzFc();
    }

    public /* bridge */ /* synthetic */ zzac zzFd() {
        return super.zzFd();
    }

    public /* bridge */ /* synthetic */ zzn zzFe() {
        return super.zzFe();
    }

    public /* bridge */ /* synthetic */ zzg zzFf() {
        return super.zzFf();
    }

    public /* bridge */ /* synthetic */ zzad zzFg() {
        return super.zzFg();
    }

    public /* bridge */ /* synthetic */ zze zzFh() {
        return super.zzFh();
    }

    public /* bridge */ /* synthetic */ zzal zzFi() {
        return super.zzFi();
    }

    public /* bridge */ /* synthetic */ zzv zzFj() {
        return super.zzFj();
    }

    public /* bridge */ /* synthetic */ zzaf zzFk() {
        return super.zzFk();
    }

    public /* bridge */ /* synthetic */ zzw zzFl() {
        return super.zzFl();
    }

    public /* bridge */ /* synthetic */ zzp zzFm() {
        return super.zzFm();
    }

    public /* bridge */ /* synthetic */ zzt zzFn() {
        return super.zzFn();
    }

    public /* bridge */ /* synthetic */ zzd zzFo() {
        return super.zzFo();
    }

    public String zzN(String str, String str2) {
        Builder builder = new Builder();
        Builder encodedAuthority = builder.scheme((String) zzl.zzbcz.get()).encodedAuthority((String) zzl.zzbcA.get());
        String str3 = "config/app/";
        String valueOf = String.valueOf(str);
        encodedAuthority.path(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3)).appendQueryParameter("app_instance_id", str2).appendQueryParameter("platform", a.ANDROID_CLIENT_TYPE).appendQueryParameter("gmp_version", String.valueOf(zzEi()));
        return builder.build().toString();
    }

    public long zza(String str, zza<Long> com_google_android_gms_measurement_internal_zzl_zza_java_lang_Long) {
        if (str == null) {
            return ((Long) com_google_android_gms_measurement_internal_zzl_zza_java_lang_Long.get()).longValue();
        }
        Object zzU = zzFj().zzU(str, com_google_android_gms_measurement_internal_zzl_zza_java_lang_Long.getKey());
        if (TextUtils.isEmpty(zzU)) {
            return ((Long) com_google_android_gms_measurement_internal_zzl_zza_java_lang_Long.get()).longValue();
        }
        try {
            return ((Long) com_google_android_gms_measurement_internal_zzl_zza_java_lang_Long.get(Long.valueOf(Long.valueOf(zzU).longValue()))).longValue();
        } catch (NumberFormatException e) {
            return ((Long) com_google_android_gms_measurement_internal_zzl_zza_java_lang_Long.get()).longValue();
        }
    }

    public int zzb(String str, zza<Integer> com_google_android_gms_measurement_internal_zzl_zza_java_lang_Integer) {
        if (str == null) {
            return ((Integer) com_google_android_gms_measurement_internal_zzl_zza_java_lang_Integer.get()).intValue();
        }
        Object zzU = zzFj().zzU(str, com_google_android_gms_measurement_internal_zzl_zza_java_lang_Integer.getKey());
        if (TextUtils.isEmpty(zzU)) {
            return ((Integer) com_google_android_gms_measurement_internal_zzl_zza_java_lang_Integer.get()).intValue();
        }
        try {
            return ((Integer) com_google_android_gms_measurement_internal_zzl_zza_java_lang_Integer.get(Integer.valueOf(Integer.valueOf(zzU).intValue()))).intValue();
        } catch (NumberFormatException e) {
            return ((Integer) com_google_android_gms_measurement_internal_zzl_zza_java_lang_Integer.get()).intValue();
        }
    }

    public int zzfc(String str) {
        return zzb(str, zzl.zzbcH);
    }

    long zzfd(String str) {
        return zza(str, zzl.zzbcw);
    }

    int zzfe(String str) {
        return zzb(str, zzl.zzbcS);
    }

    public int zzfg(String str) {
        return zzb(str, zzl.zzbcB);
    }

    public int zzfh(String str) {
        return Math.max(0, zzb(str, zzl.zzbcC));
    }

    public int zzfi(String str) {
        return Math.max(0, Math.min(1000000, zzb(str, zzl.zzbcI)));
    }

    public /* bridge */ /* synthetic */ void zzkN() {
        super.zzkN();
    }

    public /* bridge */ /* synthetic */ void zzlP() {
        super.zzlP();
    }

    public /* bridge */ /* synthetic */ zze zzlQ() {
        return super.zzlQ();
    }

    public boolean zzmW() {
        return false;
    }

    public boolean zzmX() {
        if (this.zzXt == null) {
            synchronized (this) {
                if (this.zzXt == null) {
                    ApplicationInfo applicationInfo = getContext().getApplicationInfo();
                    String zzvj = zzt.zzvj();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = str != null && str.equals(zzvj);
                        this.zzXt = Boolean.valueOf(z);
                    }
                    if (this.zzXt == null) {
                        this.zzXt = Boolean.TRUE;
                        zzFm().zzFE().log("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzXt.booleanValue();
    }

    public long zznC() {
        return Math.max(0, ((Long) zzl.zzbcx.get()).longValue());
    }

    long zznr() {
        return ((Long) zzl.zzbcT.get()).longValue();
    }

    public String zznw() {
        return "google_app_measurement.db";
    }

    public String zznx() {
        return "google_app_measurement2.db";
    }

    public boolean zzsB() {
        return zzom.zzsB();
    }
}
