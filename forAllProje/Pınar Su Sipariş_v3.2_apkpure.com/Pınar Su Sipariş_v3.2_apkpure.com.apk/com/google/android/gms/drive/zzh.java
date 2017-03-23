package com.google.android.gms.drive;

import com.google.android.gms.drive.ExecutionOptions.Builder;

public class zzh extends ExecutionOptions {
    private String zzavy;
    private String zzavz;

    public static class zza extends Builder {
        public /* synthetic */ ExecutionOptions build() {
            return zzvQ();
        }

        public /* synthetic */ Builder setConflictStrategy(int i) {
            return zzcN(i);
        }

        public /* synthetic */ Builder setNotifyOnCompletion(boolean z) {
            return zzak(z);
        }

        public /* synthetic */ Builder setTrackingTag(String str) {
            return zzdy(str);
        }

        public zza zzak(boolean z) {
            super.setNotifyOnCompletion(z);
            return this;
        }

        public zza zzcN(int i) {
            throw new UnsupportedOperationException();
        }

        public zza zzdy(String str) {
            super.setTrackingTag(str);
            return this;
        }

        public zzh zzvQ() {
            zzvN();
            return new zzh(this.zzavv, this.zzavw, null, null, this.zzavx);
        }
    }

    private zzh(String str, boolean z, String str2, String str3, int i) {
        super(str, z, i);
        this.zzavy = str2;
        this.zzavz = str3;
    }

    public static zzh zza(ExecutionOptions executionOptions) {
        zza com_google_android_gms_drive_zzh_zza = new zza();
        if (executionOptions != null) {
            if (executionOptions.zzvM() != 0) {
                throw new IllegalStateException("May not set a conflict strategy for new file creation.");
            }
            zza com_google_android_gms_drive_zzh_zza2;
            String zzvK = executionOptions.zzvK();
            if (zzvK != null) {
                com_google_android_gms_drive_zzh_zza2 = (zza) com_google_android_gms_drive_zzh_zza.setTrackingTag(zzvK);
            }
            com_google_android_gms_drive_zzh_zza2 = (zza) com_google_android_gms_drive_zzh_zza.setNotifyOnCompletion(executionOptions.zzvL());
        }
        return (zzh) com_google_android_gms_drive_zzh_zza.build();
    }

    public String zzvO() {
        return this.zzavy;
    }

    public String zzvP() {
        return this.zzavz;
    }
}
