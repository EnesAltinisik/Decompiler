package com.google.android.gms.drive;

import com.google.android.gms.drive.ExecutionOptions.Builder;

public class zzi extends ExecutionOptions {
    private boolean zzavA;

    public static class zza extends Builder {
        private boolean zzavA = true;

        public /* synthetic */ ExecutionOptions build() {
            return zzvS();
        }

        public /* synthetic */ Builder setConflictStrategy(int i) {
            return zzcO(i);
        }

        public /* synthetic */ Builder setNotifyOnCompletion(boolean z) {
            return zzal(z);
        }

        public /* synthetic */ Builder setTrackingTag(String str) {
            return zzdz(str);
        }

        public zza zzal(boolean z) {
            super.setNotifyOnCompletion(z);
            return this;
        }

        public zza zzcO(int i) {
            super.setConflictStrategy(i);
            return this;
        }

        public zza zzdz(String str) {
            super.setTrackingTag(str);
            return this;
        }

        public zzi zzvS() {
            zzvN();
            return new zzi(this.zzavv, this.zzavw, this.zzavx, this.zzavA);
        }
    }

    private zzi(String str, boolean z, int i, boolean z2) {
        super(str, z, i);
        this.zzavA = z2;
    }

    public static zzi zzb(ExecutionOptions executionOptions) {
        zza com_google_android_gms_drive_zzi_zza = new zza();
        if (executionOptions != null) {
            zza com_google_android_gms_drive_zzi_zza2 = (zza) com_google_android_gms_drive_zzi_zza.setConflictStrategy(executionOptions.zzvM());
            com_google_android_gms_drive_zzi_zza2 = (zza) com_google_android_gms_drive_zzi_zza.setNotifyOnCompletion(executionOptions.zzvL());
            String zzvK = executionOptions.zzvK();
            if (zzvK != null) {
                com_google_android_gms_drive_zzi_zza2 = (zza) com_google_android_gms_drive_zzi_zza.setTrackingTag(zzvK);
            }
        }
        return (zzi) com_google_android_gms_drive_zzi_zza.build();
    }

    public boolean zzvR() {
        return this.zzavA;
    }
}
