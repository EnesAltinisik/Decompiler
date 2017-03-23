package com.google.android.gms.analytics.internal;

import com.google.android.gms.analytics.internal.zzq.zza;

public class zzam extends zzq<zzan> {

    private static class a extends zzc implements zza<zzan> {
        private final zzan a = new zzan();

        public a(zzf com_google_android_gms_analytics_internal_zzf) {
            super(com_google_android_gms_analytics_internal_zzf);
        }

        public zzan a() {
            return this.a;
        }

        public void zzc(String str, int i) {
            if ("ga_sessionTimeout".equals(str)) {
                this.a.zzZj = i;
            } else {
                zzd("int configuration name not recognized", str);
            }
        }

        public void zzg(String str, boolean z) {
            int i = 1;
            zzan com_google_android_gms_analytics_internal_zzan;
            if ("ga_autoActivityTracking".equals(str)) {
                com_google_android_gms_analytics_internal_zzan = this.a;
                if (!z) {
                    i = 0;
                }
                com_google_android_gms_analytics_internal_zzan.zzZk = i;
            } else if ("ga_anonymizeIp".equals(str)) {
                com_google_android_gms_analytics_internal_zzan = this.a;
                if (!z) {
                    i = 0;
                }
                com_google_android_gms_analytics_internal_zzan.zzZl = i;
            } else if ("ga_reportUncaughtExceptions".equals(str)) {
                com_google_android_gms_analytics_internal_zzan = this.a;
                if (!z) {
                    i = 0;
                }
                com_google_android_gms_analytics_internal_zzan.zzZm = i;
            } else {
                zzd("bool configuration name not recognized", str);
            }
        }

        public /* synthetic */ f zzmV() {
            return a();
        }

        public void zzn(String str, String str2) {
            this.a.zzZn.put(str, str2);
        }

        public void zzo(String str, String str2) {
            if ("ga_trackingId".equals(str)) {
                this.a.zzTJ = str2;
            } else if ("ga_sampleFrequency".equals(str)) {
                try {
                    this.a.zzZi = Double.parseDouble(str2);
                } catch (NumberFormatException e) {
                    zzc("Error parsing ga_sampleFrequency value", str2, e);
                }
            } else {
                zzd("string configuration name not recognized", str);
            }
        }
    }

    public zzam(zzf com_google_android_gms_analytics_internal_zzf) {
        super(com_google_android_gms_analytics_internal_zzf, new a(com_google_android_gms_analytics_internal_zzf));
    }
}
