package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.AutoClickProtectionConfigurationParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@zzig
public class zzjn {
    public final int errorCode;
    public final int orientation;
    public final List<String> zzEF;
    public final List<String> zzEG;
    public final List<String> zzEI;
    public final long zzEL;
    public final zzfq zzFg;
    public final zzgb zzFh;
    public final String zzFi;
    public final zzft zzFj;
    public final zzla zzHF;
    public final long zzLO;
    public final boolean zzLP;
    public final long zzLQ;
    public final List<String> zzLR;
    public final String zzLU;
    public final AdRequestParcel zzLi;
    public final String zzLl;
    public final RewardItemParcel zzMf;
    public final List<String> zzMh;
    public final boolean zzMi;
    public final AutoClickProtectionConfigurationParcel zzMj;
    public final JSONObject zzOW;
    public boolean zzOX;
    public final zzfr zzOY;
    public final String zzOZ;
    public final AdSizeParcel zzPa;
    public final List<String> zzPb;
    public final long zzPc;
    public final long zzPd;
    public final com.google.android.gms.ads.internal.formats.zzh.zza zzPe;
    public boolean zzPf;
    public boolean zzPg;

    @zzig
    public static final class zza {
        public final int errorCode;
        public final JSONObject zzOW;
        public final zzfr zzOY;
        public final long zzPc;
        public final long zzPd;
        public final AdRequestInfoParcel zzPh;
        public final AdResponseParcel zzPi;
        public final AdSizeParcel zzsB;

        public zza(AdRequestInfoParcel adRequestInfoParcel, AdResponseParcel adResponseParcel, zzfr com_google_android_gms_internal_zzfr, AdSizeParcel adSizeParcel, int i, long j, long j2, JSONObject jSONObject) {
            this.zzPh = adRequestInfoParcel;
            this.zzPi = adResponseParcel;
            this.zzOY = com_google_android_gms_internal_zzfr;
            this.zzsB = adSizeParcel;
            this.errorCode = i;
            this.zzPc = j;
            this.zzPd = j2;
            this.zzOW = jSONObject;
        }
    }

    public zzjn(AdRequestParcel adRequestParcel, zzla com_google_android_gms_internal_zzla, List<String> list, int i, List<String> list2, List<String> list3, int i2, long j, String str, boolean z, zzfq com_google_android_gms_internal_zzfq, zzgb com_google_android_gms_internal_zzgb, String str2, zzfr com_google_android_gms_internal_zzfr, zzft com_google_android_gms_internal_zzft, long j2, AdSizeParcel adSizeParcel, long j3, long j4, long j5, String str3, JSONObject jSONObject, com.google.android.gms.ads.internal.formats.zzh.zza com_google_android_gms_ads_internal_formats_zzh_zza, RewardItemParcel rewardItemParcel, List<String> list4, List<String> list5, boolean z2, AutoClickProtectionConfigurationParcel autoClickProtectionConfigurationParcel, String str4, List<String> list6) {
        this.zzPf = false;
        this.zzPg = false;
        this.zzLi = adRequestParcel;
        this.zzHF = com_google_android_gms_internal_zzla;
        this.zzEF = zzl(list);
        this.errorCode = i;
        this.zzEG = zzl(list2);
        this.zzLR = zzl(list3);
        this.orientation = i2;
        this.zzEL = j;
        this.zzLl = str;
        this.zzLP = z;
        this.zzFg = com_google_android_gms_internal_zzfq;
        this.zzFh = com_google_android_gms_internal_zzgb;
        this.zzFi = str2;
        this.zzOY = com_google_android_gms_internal_zzfr;
        this.zzFj = com_google_android_gms_internal_zzft;
        this.zzLQ = j2;
        this.zzPa = adSizeParcel;
        this.zzLO = j3;
        this.zzPc = j4;
        this.zzPd = j5;
        this.zzLU = str3;
        this.zzOW = jSONObject;
        this.zzPe = com_google_android_gms_ads_internal_formats_zzh_zza;
        this.zzMf = rewardItemParcel;
        this.zzPb = zzl(list4);
        this.zzMh = zzl(list5);
        this.zzMi = z2;
        this.zzMj = autoClickProtectionConfigurationParcel;
        this.zzOZ = str4;
        this.zzEI = zzl(list6);
    }

    public zzjn(zza com_google_android_gms_internal_zzjn_zza, zzla com_google_android_gms_internal_zzla, zzfq com_google_android_gms_internal_zzfq, zzgb com_google_android_gms_internal_zzgb, String str, zzft com_google_android_gms_internal_zzft, com.google.android.gms.ads.internal.formats.zzh.zza com_google_android_gms_ads_internal_formats_zzh_zza, String str2) {
        this(com_google_android_gms_internal_zzjn_zza.zzPh.zzLi, com_google_android_gms_internal_zzla, com_google_android_gms_internal_zzjn_zza.zzPi.zzEF, com_google_android_gms_internal_zzjn_zza.errorCode, com_google_android_gms_internal_zzjn_zza.zzPi.zzEG, com_google_android_gms_internal_zzjn_zza.zzPi.zzLR, com_google_android_gms_internal_zzjn_zza.zzPi.orientation, com_google_android_gms_internal_zzjn_zza.zzPi.zzEL, com_google_android_gms_internal_zzjn_zza.zzPh.zzLl, com_google_android_gms_internal_zzjn_zza.zzPi.zzLP, com_google_android_gms_internal_zzfq, com_google_android_gms_internal_zzgb, str, com_google_android_gms_internal_zzjn_zza.zzOY, com_google_android_gms_internal_zzft, com_google_android_gms_internal_zzjn_zza.zzPi.zzLQ, com_google_android_gms_internal_zzjn_zza.zzsB, com_google_android_gms_internal_zzjn_zza.zzPi.zzLO, com_google_android_gms_internal_zzjn_zza.zzPc, com_google_android_gms_internal_zzjn_zza.zzPd, com_google_android_gms_internal_zzjn_zza.zzPi.zzLU, com_google_android_gms_internal_zzjn_zza.zzOW, com_google_android_gms_ads_internal_formats_zzh_zza, com_google_android_gms_internal_zzjn_zza.zzPi.zzMf, com_google_android_gms_internal_zzjn_zza.zzPi.zzMg, com_google_android_gms_internal_zzjn_zza.zzPi.zzMg, com_google_android_gms_internal_zzjn_zza.zzPi.zzMi, com_google_android_gms_internal_zzjn_zza.zzPi.zzMj, str2, com_google_android_gms_internal_zzjn_zza.zzPi.zzEI);
    }

    private static <T> List<T> zzl(List<T> list) {
        return list == null ? null : Collections.unmodifiableList(list);
    }

    public boolean zzdi() {
        return (this.zzHF == null || this.zzHF.zzjD() == null) ? false : this.zzHF.zzjD().zzdi();
    }
}
