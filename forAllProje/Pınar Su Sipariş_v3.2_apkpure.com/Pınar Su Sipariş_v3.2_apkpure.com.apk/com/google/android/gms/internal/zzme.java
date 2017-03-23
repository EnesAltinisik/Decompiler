package com.google.android.gms.internal;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.RegisterSectionInfo.zza;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.internal.zzsj.zzb;
import com.google.android.gms.internal.zzsj.zzc;
import com.google.android.gms.internal.zzsj.zzd;
import com.google.android.gms.plus.PlusShare;
import java.util.ArrayList;
import java.util.List;

public class zzme {
    private static DocumentSection zza(String str, zzc com_google_android_gms_internal_zzsj_zzc) {
        return new DocumentSection(zzamj.toByteArray(com_google_android_gms_internal_zzsj_zzc), new zza(str).zzU(true).zzcg(str).zzcf("blob").zzoK());
    }

    public static UsageInfo zza(Action action, long j, String str, int i) {
        int i2;
        boolean z = false;
        Bundle bundle = new Bundle();
        bundle.putAll(action.zzoN());
        Bundle bundle2 = bundle.getBundle("object");
        Uri parse = bundle2.containsKey("id") ? Uri.parse(bundle2.getString("id")) : null;
        String string = bundle2.getString("name");
        String string2 = bundle2.getString("type");
        Intent zza = zzmf.zza(str, Uri.parse(bundle2.getString(PlusShare.KEY_CALL_TO_ACTION_URL)));
        DocumentContents.zza zza2 = UsageInfo.zza(zza, string, parse, string2, null);
        if (bundle.containsKey(".private:ssbContext")) {
            zza2.zza(DocumentSection.zzi(bundle.getByteArray(".private:ssbContext")));
            bundle.remove(".private:ssbContext");
        }
        if (bundle.containsKey(".private:accountName")) {
            zza2.zzb(new Account(bundle.getString(".private:accountName"), "com.google"));
            bundle.remove(".private:accountName");
        }
        if (bundle.containsKey(".private:isContextOnly") && bundle.getBoolean(".private:isContextOnly")) {
            i2 = 4;
            bundle.remove(".private:isContextOnly");
        } else {
            i2 = 0;
        }
        if (bundle.containsKey(".private:isDeviceOnly")) {
            z = bundle.getBoolean(".private:isDeviceOnly", false);
            bundle.remove(".private:isDeviceOnly");
        }
        zza2.zza(zza(".private:action", zzi(bundle)));
        return new UsageInfo.zza().zza(UsageInfo.zza(str, zza)).zzy(j).zzaF(i2).zza(zza2.zzoH()).zzW(z).zzaG(i).zzoL();
    }

    private static zzb zzb(String str, Bundle bundle) {
        zzb com_google_android_gms_internal_zzsj_zzb = new zzb();
        com_google_android_gms_internal_zzsj_zzb.name = str;
        com_google_android_gms_internal_zzsj_zzb.zzaTD = new zzd();
        com_google_android_gms_internal_zzsj_zzb.zzaTD.zzaTI = zzi(bundle);
        return com_google_android_gms_internal_zzsj_zzb;
    }

    static zzc zzi(Bundle bundle) {
        List arrayList = new ArrayList();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof String) {
                arrayList.add(zzt(str, (String) obj));
            } else if (obj instanceof Bundle) {
                arrayList.add(zzb(str, (Bundle) obj));
            } else if (obj instanceof String[]) {
                for (String str2 : (String[]) obj) {
                    if (str2 != null) {
                        arrayList.add(zzt(str, str2));
                    }
                }
            } else if (obj instanceof Bundle[]) {
                for (Bundle bundle2 : (Bundle[]) obj) {
                    if (bundle2 != null) {
                        arrayList.add(zzb(str, bundle2));
                    }
                }
            } else if (obj instanceof Boolean) {
                arrayList.add(zzj(str, ((Boolean) obj).booleanValue()));
            } else {
                String valueOf = String.valueOf(obj);
                Log.e("SearchIndex", new StringBuilder(String.valueOf(valueOf).length() + 19).append("Unsupported value: ").append(valueOf).toString());
            }
        }
        zzc com_google_android_gms_internal_zzsj_zzc = new zzc();
        if (bundle.containsKey("type")) {
            com_google_android_gms_internal_zzsj_zzc.type = bundle.getString("type");
        }
        com_google_android_gms_internal_zzsj_zzc.zzaTE = (zzb[]) arrayList.toArray(new zzb[arrayList.size()]);
        return com_google_android_gms_internal_zzsj_zzc;
    }

    private static zzb zzj(String str, boolean z) {
        zzb com_google_android_gms_internal_zzsj_zzb = new zzb();
        com_google_android_gms_internal_zzsj_zzb.name = str;
        com_google_android_gms_internal_zzsj_zzb.zzaTD = new zzd();
        com_google_android_gms_internal_zzsj_zzb.zzaTD.zzaTF = z;
        return com_google_android_gms_internal_zzsj_zzb;
    }

    private static zzb zzt(String str, String str2) {
        zzb com_google_android_gms_internal_zzsj_zzb = new zzb();
        com_google_android_gms_internal_zzsj_zzb.name = str;
        com_google_android_gms_internal_zzsj_zzb.zzaTD = new zzd();
        com_google_android_gms_internal_zzsj_zzb.zzaTD.zzasH = str2;
        return com_google_android_gms_internal_zzsj_zzb;
    }
}
