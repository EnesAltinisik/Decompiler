package com.google.android.gms.analytics.internal;

import com.google.android.gms.analytics.internal.zzq.zza;

public class zzz extends zzq<zzaa> {

    private static class a implements zza<zzaa> {
        private final zzf a;
        private final zzaa b = new zzaa();

        public a(zzf com_google_android_gms_analytics_internal_zzf) {
            this.a = com_google_android_gms_analytics_internal_zzf;
        }

        public zzaa a() {
            return this.b;
        }

        public void zzc(String str, int i) {
            if ("ga_dispatchPeriod".equals(str)) {
                this.b.zzYy = i;
            } else {
                this.a.zzlR().zzd("Int xml configuration name not recognized", str);
            }
        }

        public void zzg(String str, boolean z) {
            if ("ga_dryRun".equals(str)) {
                this.b.zzYz = z ? 1 : 0;
                return;
            }
            this.a.zzlR().zzd("Bool xml configuration name not recognized", str);
        }

        public /* synthetic */ f zzmV() {
            return a();
        }

        public void zzn(String str, String str2) {
        }

        public void zzo(String str, String str2) {
            if ("ga_appName".equals(str)) {
                this.b.zzVd = str2;
            } else if ("ga_appVersion".equals(str)) {
                this.b.zzVe = str2;
            } else if ("ga_logLevel".equals(str)) {
                this.b.zzYx = str2;
            } else {
                this.a.zzlR().zzd("String xml configuration name not recognized", str);
            }
        }
    }

    public zzz(zzf com_google_android_gms_analytics_internal_zzf) {
        super(com_google_android_gms_analytics_internal_zzf, new a(com_google_android_gms_analytics_internal_zzf));
    }
}
