package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzeh;
import com.google.android.gms.internal.zzfj;
import com.google.android.gms.internal.zzfk;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzka;
import com.google.android.gms.internal.zzkt;
import com.google.android.gms.internal.zzkt.zzc;
import com.google.android.gms.internal.zzla;
import java.util.Map;
import org.json.JSONObject;

@zzig
public class zzg {
    private Context mContext;
    private final Object zzpp = new Object();
    public final zzeh zzqv = new zzeh(this) {
        final /* synthetic */ zzg a;

        {
            this.a = r1;
        }

        public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
            com_google_android_gms_internal_zzla.zzb("/appSettingsFetched", (zzeh) this);
            synchronized (this.a.zzpp) {
                if (map != null) {
                    if ("true".equalsIgnoreCase((String) map.get("isSuccessful"))) {
                        zzu.zzcn().zzd(this.a.mContext, (String) map.get("appSettingsJson"));
                    }
                }
            }
        }
    };

    private static boolean zza(zzjp com_google_android_gms_internal_zzjp) {
        if (com_google_android_gms_internal_zzjp == null) {
            return true;
        }
        boolean z = (((zzu.zzco().currentTimeMillis() - com_google_android_gms_internal_zzjp.zziz()) > ((Long) zzcu.zzzs.get()).longValue() ? 1 : ((zzu.zzco().currentTimeMillis() - com_google_android_gms_internal_zzjp.zziz()) == ((Long) zzcu.zzzs.get()).longValue() ? 0 : -1)) > 0) || !com_google_android_gms_internal_zzjp.zziA();
        return z;
    }

    public void zza(Context context, VersionInfoParcel versionInfoParcel, boolean z, zzjp com_google_android_gms_internal_zzjp, String str, String str2) {
        if (!zza(com_google_android_gms_internal_zzjp)) {
            return;
        }
        if (context == null) {
            zzb.zzaW("Context not provided to fetch application settings");
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            zzb.zzaW("App settings could not be fetched. Required parameters missing");
        } else {
            this.mContext = context;
            final zzfj zzc = zzu.zzck().zzc(context, versionInfoParcel);
            final String str3 = str;
            final String str4 = str2;
            final boolean z2 = z;
            final Context context2 = context;
            zzka.zzQu.post(new Runnable(this) {
                final /* synthetic */ zzg f;

                public void run() {
                    zzc.zzfu().zza(new zzc<zzfk>(this) {
                        final /* synthetic */ AnonymousClass2 a;

                        {
                            this.a = r1;
                        }

                        public void a(zzfk com_google_android_gms_internal_zzfk) {
                            com_google_android_gms_internal_zzfk.zza("/appSettingsFetched", this.a.f.zzqv);
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (!TextUtils.isEmpty(str3)) {
                                    jSONObject.put("app_id", str3);
                                } else if (!TextUtils.isEmpty(str4)) {
                                    jSONObject.put("ad_unit_id", str4);
                                }
                                jSONObject.put("is_init", z2);
                                jSONObject.put("pn", context2.getPackageName());
                                com_google_android_gms_internal_zzfk.zza("AFMA_fetchAppSettings", jSONObject);
                            } catch (Throwable e) {
                                com_google_android_gms_internal_zzfk.zzb("/appSettingsFetched", this.a.f.zzqv);
                                zzb.zzb("Error requesting application settings", e);
                            }
                        }

                        public /* synthetic */ void zzc(Object obj) {
                            a((zzfk) obj);
                        }
                    }, new zzkt.zzb());
                }
            });
        }
    }
}
