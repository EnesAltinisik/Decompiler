package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.support.v4.h.a;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.util.zze;
import com.google.android.gms.internal.zzamb;
import com.google.android.gms.internal.zzamc;
import com.google.android.gms.internal.zzso.zza;
import com.google.android.gms.internal.zzso.zzb;
import com.google.android.gms.internal.zzso.zzc;
import com.google.android.gms.measurement.AppMeasurement;
import java.io.IOException;
import java.util.Map;

public class zzv extends b {
    private final Map<String, Map<String, String>> zzbec = new a();
    private final Map<String, Map<String, Boolean>> zzbed = new a();
    private final Map<String, Map<String, Boolean>> zzbee = new a();
    private final Map<String, zzb> zzbef = new a();
    private final Map<String, String> zzbeg = new a();

    zzv(zzx com_google_android_gms_measurement_internal_zzx) {
        super(com_google_android_gms_measurement_internal_zzx);
    }

    private Map<String, String> zza(zzb com_google_android_gms_internal_zzso_zzb) {
        Map<String, String> aVar = new a();
        if (!(com_google_android_gms_internal_zzso_zzb == null || com_google_android_gms_internal_zzso_zzb.zzbgN == null)) {
            for (zzc com_google_android_gms_internal_zzso_zzc : com_google_android_gms_internal_zzso_zzb.zzbgN) {
                if (com_google_android_gms_internal_zzso_zzc != null) {
                    aVar.put(com_google_android_gms_internal_zzso_zzc.zzaB, com_google_android_gms_internal_zzso_zzc.value);
                }
            }
        }
        return aVar;
    }

    private void zza(String str, zzb com_google_android_gms_internal_zzso_zzb) {
        Map aVar = new a();
        Map aVar2 = new a();
        if (!(com_google_android_gms_internal_zzso_zzb == null || com_google_android_gms_internal_zzso_zzb.zzbgO == null)) {
            for (zza com_google_android_gms_internal_zzso_zza : com_google_android_gms_internal_zzso_zzb.zzbgO) {
                if (com_google_android_gms_internal_zzso_zza != null) {
                    String str2 = (String) AppMeasurement.zza.zzbbm.get(com_google_android_gms_internal_zzso_zza.name);
                    if (str2 != null) {
                        com_google_android_gms_internal_zzso_zza.name = str2;
                    }
                    aVar.put(com_google_android_gms_internal_zzso_zza.name, com_google_android_gms_internal_zzso_zza.zzbgJ);
                    aVar2.put(com_google_android_gms_internal_zzso_zza.name, com_google_android_gms_internal_zzso_zza.zzbgK);
                }
            }
        }
        this.zzbed.put(str, aVar);
        this.zzbee.put(str, aVar2);
    }

    private zzb zze(String str, byte[] bArr) {
        if (bArr == null) {
            return new zzb();
        }
        zzamb zzN = zzamb.zzN(bArr);
        zzb com_google_android_gms_internal_zzso_zzb = new zzb();
        try {
            zzb com_google_android_gms_internal_zzso_zzb2 = (zzb) com_google_android_gms_internal_zzso_zzb.mergeFrom(zzN);
            zzFm().zzFL().zze("Parsed config. version, gmp_app_id", com_google_android_gms_internal_zzso_zzb.zzbgL, com_google_android_gms_internal_zzso_zzb.zzbbK);
            return com_google_android_gms_internal_zzso_zzb;
        } catch (IOException e) {
            zzFm().zzFG().zze("Unable to merge remote config", str, e);
            return null;
        }
    }

    private void zzfx(String str) {
        zzma();
        zzkN();
        zzaa.zzdl(str);
        if (!this.zzbef.containsKey(str)) {
            byte[] d = zzFh().d(str);
            if (d == null) {
                this.zzbec.put(str, null);
                this.zzbed.put(str, null);
                this.zzbee.put(str, null);
                this.zzbef.put(str, null);
                this.zzbeg.put(str, null);
                return;
            }
            zzb zze = zze(str, d);
            this.zzbec.put(str, zza(zze));
            zza(str, zze);
            this.zzbef.put(str, zze);
            this.zzbeg.put(str, null);
        }
    }

    public /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
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

    String zzU(String str, String str2) {
        zzkN();
        zzfx(str);
        Map map = (Map) this.zzbec.get(str);
        return map != null ? (String) map.get(str2) : null;
    }

    boolean zzV(String str, String str2) {
        zzkN();
        zzfx(str);
        Map map = (Map) this.zzbed.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        return bool == null ? false : bool.booleanValue();
    }

    boolean zzW(String str, String str2) {
        zzkN();
        zzfx(str);
        Map map = (Map) this.zzbee.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        return bool == null ? false : bool.booleanValue();
    }

    protected boolean zzb(String str, byte[] bArr, String str2) {
        zzma();
        zzkN();
        zzaa.zzdl(str);
        zzb zze = zze(str, bArr);
        if (zze == null) {
            return false;
        }
        zza(str, zze);
        this.zzbef.put(str, zze);
        this.zzbeg.put(str, str2);
        this.zzbec.put(str, zza(zze));
        zzFc().a(str, zze.zzbgP);
        try {
            zze.zzbgP = null;
            byte[] bArr2 = new byte[zze.getSerializedSize()];
            zze.writeTo(zzamc.zzO(bArr2));
            bArr = bArr2;
        } catch (IOException e) {
            zzFm().zzFG().zzj("Unable to serialize reduced-size config.  Storing full config instead.", e);
        }
        zzFh().a(str, bArr);
        return true;
    }

    protected void zzfA(String str) {
        zzkN();
        this.zzbeg.put(str, null);
    }

    protected zzb zzfy(String str) {
        zzma();
        zzkN();
        zzaa.zzdl(str);
        zzfx(str);
        return (zzb) this.zzbef.get(str);
    }

    protected String zzfz(String str) {
        zzkN();
        return (String) this.zzbeg.get(str);
    }

    public /* bridge */ /* synthetic */ void zzkN() {
        super.zzkN();
    }

    protected void zzkO() {
    }

    public /* bridge */ /* synthetic */ void zzlP() {
        super.zzlP();
    }

    public /* bridge */ /* synthetic */ zze zzlQ() {
        return super.zzlQ();
    }
}
